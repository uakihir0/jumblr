package com.tumblr.jumblr.types;

public class Trail {

    private BlogInTrail blog;

    private IdInTrail post;

    private String content_raw, content;

    private boolean is_current_item, is_root_item;

    public BlogInTrail getBlog() {
        return blog;
    }

    public IdInTrail getPost() {
        return post;
    }

    public String getContentRaw() {
        return content_raw;
    }

    public String getContent() {
        return content;
    }

    public boolean isCurrentItem() {
        return is_current_item;
    }

    public boolean isRootItem() {
        return is_root_item;
    }
}
