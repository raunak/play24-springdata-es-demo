package elastic.repositories;

import elastic.models.User;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Created by rgupta on 28/02/16.
 */
public interface UserRepository extends ElasticsearchRepository<User, String> {
}
