package elasticplugin;

import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;

import javax.inject.Inject;

public class ElasticServiceProvider {

    @Inject
    public ElasticsearchTemplate template;
}