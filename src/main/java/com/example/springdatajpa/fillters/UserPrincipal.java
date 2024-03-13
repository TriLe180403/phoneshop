package com.example.springdatajpa.fillters;

import com.example.springdatajpa.model.Role;
import com.example.springdatajpa.model.User;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Getter
@Setter
public class UserPrincipal implements UserDetails {

    private  int id;
    @JsonIgnore
    private String username;
    @JsonIgnore
    private String password;


    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    public UserPrincipal(int id, String username, String password, List<GrantedAuthority> authorities) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    @Override
    public String getPassword() {
        return null;
    }

    @Override
    public String getUsername() {
        return null;
    }

    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }
    long getId() {
        return 0;
    }

    public static UserPrincipal create(User account) {
        Set<Role> roles = account.getRole();
        List<GrantedAuthority> authorities = roles.stream().map(role -> new SimpleGrantedAuthority(role.getName())).collect(Collectors.toList());

        return new UserPrincipal(account.getId(), account.getUserName(), account.getPassWord(),authorities);
    }
}
