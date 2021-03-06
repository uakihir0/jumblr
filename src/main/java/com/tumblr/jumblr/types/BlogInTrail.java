package com.tumblr.jumblr.types;

import java.util.List;

public class BlogInTrail {

    private String name;
    private boolean active;
    private List<Theme> theme;
    private boolean share_likes, share_following, can_be_followed;

    public String getName() {
        return name;
    }

    public boolean isActive() {
        return active;
    }

    public List<Theme> getTheme() {
        return theme;
    }

    public boolean isShareLikes() {
        return share_likes;
    }

    public boolean isShareFollowing() {
        return share_following;
    }

    public boolean isCanBeFollowed() {
        return can_be_followed;
    }
}
