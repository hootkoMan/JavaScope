import java.util.List;

/**
 * Created by ruslan.
 */
public interface Executor<T> {
    void addTask(Task<? extends T> task);

    void addTask(Task<? extends T> task, Validator<? super T> validator);

    void execute();

    List<T> getValidResults();

    List<T> getInvalidResults();
}
