package com.spring.boot.courses;

import com.spring.boot.topic.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseContorller {

    @Autowired
    private CourseService courseService;
    @RequestMapping("/topics/{topicId}/courses")
    public List<Course> getAllCourses(@PathVariable(name = "courseId")  String topicId) {
        return courseService.getAllCourses(topicId);
    }

    @RequestMapping("/topics/{topicId}/courses/{courseId}")
    public Course getCourses(@PathVariable(name = "courseId")  String id) {
        return courseService.getCourse(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/topics/{topicId}/courses")
    public void addCourse(@RequestBody Course newCourse, @PathVariable(name = "topicId")  String topicId) {
        newCourse.setTopic(new Topic(topicId, "", ""));
        courseService.addCourse(newCourse);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/topics/{topicId}/courses/{courseId}")
    public void updateCourse(@RequestBody Course newCourse, @PathVariable(name = "topicId")  String topicId) {
        newCourse.setTopic(new Topic(topicId, "", ""));
        courseService.updateCourse(newCourse);
    }
    @RequestMapping(method = RequestMethod.DELETE, value = "/topics/{topicId}/courses/{courseId}")
    public void deleteCourse(String id) {
        courseService.deleteCourse(id);
    }
}