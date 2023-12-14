package com.spring.boot.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class TopicService {
    @Autowired
    private TopicRepository topicRepository;

    public List<Topic> getAllTopics() {
            List<Topic> topics = new ArrayList<>();
            topicRepository.findAll().forEach(topics::add);
        return topics;
    }

    public Topic getTopic(String id) {
        Optional<Topic> topicById = topicRepository.findById(id);
        return topicById.get();
    }

    public void addTopic(Topic newTopic) {
        topicRepository.save(newTopic);
    }

    public void updateTopic(Topic topic, String id) {
       topicRepository.save(topic);
    }

    public void deleteTopic(String id) {
        topicRepository.deleteById(id);
    }
}
