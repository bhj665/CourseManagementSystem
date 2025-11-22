package peppi.coursemanagementsystem.domain;
public class Course {
private String name;
private String period;
private String points;
public Course() {
this.name = "";
this.period = "";
this.points = "";
}
public Course(String name, String period, String points) {
this.name = name;
this.period = period;
this.points = points;
}
public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
public String getPeriod() {
return period;
}
public void setPeriod(String period) {
this.period = period;
}
public String getPoints() {
return points;
}
public void setPoints(String points) {
this.points = points;
}
@Override
public String toString() {
return this.name + this.period + this.points;
}
}
