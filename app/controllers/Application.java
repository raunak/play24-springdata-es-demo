package controllers;

import elastic.models.User;
import elastic.services.ElasticServiceProviderImpl;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.core.query.IndexQuery;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;

public class Application extends Controller {

    public Result index() {
        ElasticsearchTemplate template = ElasticServiceProviderImpl.get().template;

        User user = new User();
        user.firstName = "Kim";
        user.lastName = "Possible";

        // index using template
        IndexQuery indexQuery = new IndexQuery();
        indexQuery.setObject(user);
        template.index(indexQuery);

        User user1 = new User();
        user1.firstName = "Professor";
        user1.lastName = "X";

        // indexing using repositories
        ElasticServiceProviderImpl.get().userRepository.save(user1);

        return ok(index.render("Your new application is ready."));
    }

}
