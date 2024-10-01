import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        UserDtoMapper userDtoMapper = new UserDtoMapper();
        User tolana = new User("Lars", "tolana","1234");
        User dosei = new User("Kristoffer", "dosei","1234");
        List<User> users = new ArrayList<User>(List.of(tolana, dosei));
        List<UserDto> userDtos = users
                .stream()
                .map(userDtoMapper)
                .toList();
        for (UserDto userDto : userDtos) {
            System.out.println(userDto);
        }

        User chris = new User("Chris", "chris","1234");
        UserDto chrisDto = userDtoMapper.apply(chris);
        System.out.println(chrisDto);
    }
}