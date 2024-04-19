import java.util.Optional;
class ErrorHandling {
    void handleErrorByThrowingIllegalArgumentException() {
        throw new IllegalArgumentException();
    }
    void handleErrorByThrowingIllegalArgumentExceptionWithDetailMessage(String message) {
        throw new IllegalArgumentException(message);
    }
    void handleErrorByThrowingAnyCheckedException() throws ClassNotFoundException {
        throw new ClassNotFoundException();
    }
    void handleErrorByThrowingAnyCheckedExceptionWithDetailMessage(String message) throws ClassNotFoundException{
        throw new ClassNotFoundException(message);
    }
    void handleErrorByThrowingAnyUncheckedException() {
        throw new ArrayIndexOutOfBoundsException();
    }
    void handleErrorByThrowingAnyUncheckedExceptionWithDetailMessage(String message) {
        throw new ArrayIndexOutOfBoundsException(message);
    }
    void handleErrorByThrowingCustomCheckedException() throws CustomCheckedException {
        throw new CustomCheckedException();
    }
    void handleErrorByThrowingCustomCheckedExceptionWithDetailMessage(String message) throws CustomCheckedException {
        throw new CustomCheckedException(message);
    }
    void handleErrorByThrowingCustomUncheckedException() {
        throw new CustomUncheckedException();
    }
    void handleErrorByThrowingCustomUncheckedExceptionWithDetailMessage(String message) {
        throw new CustomUncheckedException(message);
    }
    Optional<Integer> handleErrorByReturningOptionalInstance(String integer) {
        if(integer.equals("1"))
            return Optional.of(1);
        else
            return Optional.empty();
    }
}