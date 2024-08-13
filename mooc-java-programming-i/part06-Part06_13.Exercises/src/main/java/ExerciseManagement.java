import java.util.ArrayList;

public class ExerciseManagement {
    private ArrayList<Exercise> exercises;

    public ExerciseManagement() {
        this.exercises = new ArrayList<>();
    }
    
    public ArrayList<String> exerciseList() {
        ArrayList<String> outList = new ArrayList<>();
        for (Exercise e: this.exercises) {
            outList.add(e.getName());
        }
        return outList;
    }
    
    public void add(String exercise) {
        this.exercises.add(new Exercise(exercise));
    }
    
    public void markAsCompleted(String exercise) {
        for (Exercise e: exercises) {
            if (e.getName().equals(exercise)) {
                e.setCompleted(true);
            }
        }
    }
    
    public boolean isCompleted(String exercise) {
        for (Exercise e: exercises) {
            if (e.getName().equals(exercise)) {
                return e.isCompleted();
            }
        }
        return false;

    }
}
