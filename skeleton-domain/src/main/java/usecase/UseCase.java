package usecase;

public interface UseCase<R,T> {

    T execute(R command);

}
