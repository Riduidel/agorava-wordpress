package org.agorava.wordpress;

import org.agorava.wordpress.model.User;

public interface WordpressUserService {
    /**
     * TODO chec how it matches SO concepts
     */
    public String getProfileId();

    /**
     * TODO check how it matches SO concepts
     */
    public String getScreenName();
    
    public User getMe();

}
