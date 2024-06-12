package org.example.plancey.repositories;

import org.example.plancey.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.yaml.snakeyaml.events.Event;

public interface PostRepository extends JpaRepository<Post, Event.ID> {
}
