/**
 * Created by ruslan.
 */
public interface Task<T> {
    void execute();

    T getResult();
}
