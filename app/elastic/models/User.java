package elastic.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

/**
 * Created by rgupta on 28/02/16.
 */
@Document(indexName = "users", type = "cool-ones")
public class User {

    @Id
    public String id;

    public String firstName;

    public String lastName;
}
