package Students.Interface;

import Students.Model.Group;
import Students.Model.PersonalData;
import Students.Model.StudentData;

import java.util.List;

public class ConsoleIn implements Input{
    @Override
    public List<PersonalData> getPersonalData() {
        return null;
    }

    @Override
    public List<Group> getGroups() {
        return null;
    }

    @Override
    public List<StudentData> getStudents(List<PersonalData> students, List<Group> groups) {
        return null;
    }

}
