package lesson14.service;

@FunctionalInterface
public interface CustomService<T> {
    T reverse(T in);

}
