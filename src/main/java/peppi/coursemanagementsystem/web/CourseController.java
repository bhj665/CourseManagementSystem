package peppi.coursemanagementsystem.web;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import peppi.coursemanagementsystem.domain.Course;
@Controller
public class CourseController {
@GetMapping("/makecourses")
public String makeCourses(Model model) {
List<Course> courses = new ArrayList<Course>();
courses.add(new Course("Kurssi A", "Periodi 1", "5 op"));
courses.add(new Course("Kurssi B", "Periodi 2", "5 op"));
courses.add(new Course("Kurssi C", "Periodi 3", "5 op"));
courses.add(new Course("Kurssi D", "Periodi 4", "1 op"));
model.addAttribute("courses", courses);
return "Lisääminen";
}
}
