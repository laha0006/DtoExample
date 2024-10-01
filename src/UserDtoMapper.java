import java.util.function.Function;

public class UserDtoMapper implements Function<User, UserDto> {
    @Override
    public UserDto apply(User user) {
        return new UserDto(
                user.getName(),
                user.getUsername()
        );
    }
}
