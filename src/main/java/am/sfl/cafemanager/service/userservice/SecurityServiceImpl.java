package am.sfl.cafemanager.service.userservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

/**
 * That implemenation (@link SecurityService) and check login
 *
 * Created by David Karchikyan on 8/7/2017.
 */

@Service
public class SecurityServiceImpl implements SecurityService {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private UserDetailsService userDetailsService;

    @Override
    public String findLoggedByUserName() {
        Object userDetalis = SecurityContextHolder.getContext().getAuthentication().getDetails();
        Object userDetalisRole = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        if (userDetalis instanceof UserDetailsServiceImpl) {
            return ((UserDetails) userDetalis).getUsername();
        }
        return null;
    }
}
