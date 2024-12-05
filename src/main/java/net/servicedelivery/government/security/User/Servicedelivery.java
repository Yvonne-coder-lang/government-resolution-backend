package net.servicedelivery.government.security.User;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;
import net.servicedelivery.government.model.User;
import net.servicedelivery.government.repository.UserRepository;
import net.servicedelivery.government.security.User.GovernmentReso;

@Service
@RequiredArgsConstructor
public class Servicedelivery implements UserDetailsService {
    private final UserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        User user = userRepository.findByEmail(email)
        .orElseThrow(() -> new UsernameNotFoundException("User not found"));
return GovernmentReso.buildUserDetails(user);
}

}
