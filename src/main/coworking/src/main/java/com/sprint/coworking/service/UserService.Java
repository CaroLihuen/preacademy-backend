
@Service
public class UserService{
  @autowired
  private UserRepository userRepository;

  public User save(User user){
    return userRepository.save(user);
  }
  
}