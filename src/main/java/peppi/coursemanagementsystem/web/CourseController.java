package peppi.coursemanagementsystem.web;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;
import java.util.ArrayList;
import peppi.coursemanagementsystem.domain.Course;
import java.ui.Model;
@Controller
public class CourseController {
@GetMapping("/addcourse")
public String getCourses(Model model) {
List<Course> courses = new ArrayList<Course>();
courses.add(new Course("Kurssi A", "Periodi 1", "5 op"));
courses.add(new Course("Kurssi B", "Periodi 2", "5 op"));
courses.add(new Course("Kurssi C", "Periodi 3", "5 op"));
courses.add(new Course("Kurssi D", "Periodi 4", "5 op"));
model.addAttribute("courses", courses);
}
}
