package adrianromanski.blogmanagment.repositories;

import adrianromanski.blogmanagment.model.User;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface UserRepository extends ElasticsearchRepository<User, String> {
    User findByUsername(String username);
}
