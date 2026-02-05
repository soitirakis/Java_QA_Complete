package testdata.pages;

public class SignUpTestData {
    //messages
    public final static String SIGN_UP_HEADER = "Add User";

    //error
    public final static String INVALID_FIRST_NAME = "User validation failed: firstName: Path `firstName` is required.";
    public final static String INVALID_LAST_NAME = "User validation failed: lastName: Path `lastName` is required.";
    public final static String INVALID_EMAIL = "User validation failed: email: Email is invalid";
    public final static String INVALID_EMAIL_ALREADY_IN_USE = "Email address is already in use";
    public final static String INVALID_MISSING_EMAIL_PASSWORD = "User validation failed: email: Email is invalid, password: Path `password` is required.";
    public final static String INVALID_PASSWORD_MIN_LENGTH = "User validation failed: password: Path `password` (`abc`) is shorter than the minimum allowed length (7).";
    public final static String INVALID_MISSING_DATA = "User validation failed: firstName: Path `firstName` is required., lastName: Path `lastName` is required., email: Email is invalid, password: Path `password` is required.";
}
