package adrianromanski.blogmanagement.repositories;

import adrianromanski.blogmanagement.model.User;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface UserRepository extends ElasticsearchRepository<User, String> {
    User findByUsername(String username);
}
