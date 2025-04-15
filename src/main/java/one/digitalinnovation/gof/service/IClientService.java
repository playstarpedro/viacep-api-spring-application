package one.digitalinnovation.gof.service;

import one.digitalinnovation.gof.model.Client;

/**
 * interface that uses the <b>Strategy</b> design pattern with client domain.
 * This way, if necessary, we can have multiples implementations of that same interface.
 *
 * @author pedrodev0079
 */
public interface IClientService {
    Iterable<Client> searchAll();

    Client findById(Long id);

    void put(Client client);

    void update(Long id, Client client);

    void delete(Long id);
}
