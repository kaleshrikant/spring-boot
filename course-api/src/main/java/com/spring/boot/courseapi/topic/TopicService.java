package com.spring.boot.courseapi.topic;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {
    private List<Topic> topics = new ArrayList<>(
            Arrays.asList(
                new Topic("Spring","Spring Framework","Spring Framework Description"),
                new Topic("Hibernate","Hibernate Framework","Hibernate Framework Description"),
                new Topic("Python","Django Framework","Django Framework Description"),
                new Topic("Java Script","Angular Framework","Angular Framework Description")
            )
    );

    public List<Topic> getAllTopics() {
        return topics;
    }

    public Topic getTopic(String id) {
        return topics
                    .stream()
                    .filter(topic -> topic.getId().equalsIgnoreCase(id))
                    .findFirst()
                    .get();
    }

    public void addTopic(Topic newTopic) {
        topics.add(newTopic);
    }

    public void updateTopic(Topic topic, String id) {
        /*
            Topic olTopic = (Topic) topics.stream().filter(oldTopic -> oldTopic.getId().equalsIgnoreCase(id)).map(newTopic -> {
                return newTopic.getId();
            });
        */

        for (int i = 0; i< topics.size(); i++) {
            Topic t = topics.get(i);
                if (t.getId().equalsIgnoreCase(id)) {
                    topics.set(i,topic);
                }
        }
    }

    public void deleteTopic(Topic topic, String id) {
        topics.removeIf(tpc -> tpc.getId().equalsIgnoreCase(id));
    }
}
