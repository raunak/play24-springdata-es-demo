package elastic.services;

import elastic.repositories.UserRepository;
import elasticplugin.ElasticPlugin;
import elasticplugin.ElasticServiceProvider;
import org.springframework.stereotype.Component;

import javax.inject.Inject;

/**
 * Created by rgupta on 28/02/16.
 */
@Component
public class ElasticServiceProviderImpl extends ElasticServiceProvider {

    @Inject
    public UserRepository userRepository;

    public static ElasticServiceProviderImpl get() {
        return ElasticPlugin.get();
    }
}
