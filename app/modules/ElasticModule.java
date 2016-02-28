package modules;

import com.google.inject.AbstractModule;
import elasticplugin.ElasticPlugin;

/**
 * Created by rgupta on 28/02/16.
 */
public class ElasticModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(ElasticPlugin.class).asEagerSingleton();
    }
}
