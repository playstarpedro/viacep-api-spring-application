package one.digitalinnovation.gof.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import one.digitalinnovation.gof.model.Client;
import one.digitalinnovation.gof.model.AddressInfo;
import one.digitalinnovation.gof.repository.ClientRepository;
import one.digitalinnovation.gof.repository.AddressInfoRepository;

import java.util.Optional;

@Service
public class ClientService implements IClientService {
    @Autowired
    private ClientRepository clientRepository;
    @Autowired
    private AddressInfoRepository addressInfoRepository;
    @Autowired
    private ViaCepService viaCepService;

    @Override
    public Iterable<Client> searchAll() {
        return clientRepository.findAll();
    }

    @Override
    public Client findById(Long id) {
        // TODO: create ClientNotFoundException
        return clientRepository.findById(id).orElse(null);
    }

    @Override
    public void put(Client client) {
        saveClientWithCep(client);
    }

    @Override
    public void update(Long id, Client client) {
        Optional<Client> clientBd = clientRepository.findById(id);
        if (clientBd.isPresent()) {
            saveClientWithCep(client);
        }
    }

    @Override
    public void delete(Long id) {
        clientRepository.deleteById(id);
    }

    private void saveClientWithCep(Client client) {
        String cep = client.getAddressInfo().getCep();
        AddressInfo addressInfo = addressInfoRepository.findById(cep).orElseGet(() -> {
            AddressInfo newAddress = viaCepService.consultCep(cep);
            addressInfoRepository.save(newAddress);
            return newAddress;
        });
        client.setAddressInfo(addressInfo);
        clientRepository.save(client);
    }
}
