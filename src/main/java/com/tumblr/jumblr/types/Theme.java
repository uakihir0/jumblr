package com.tumblr.jumblr.types;

public class Theme {

    private String header_image, header_image_focused, header_image_scaled;
    private String background_color, title_color, link_color;
    private String avatar_shape;
    private boolean show_avatar, show_description, show_header_image, show_title;

    public String getHeaderImage() {
        return header_image;
    }

    public String getHeaderImageFocused() {
        return header_image_focused;
    }

    public String getHeaderImageScaled() {
        return header_image_scaled;
    }

    public String getBackgroundColor() {
        return background_color;
    }

    public String getTitleColor() {
        return title_color;
    }

    public String getLinkColor() {
        return link_color;
    }

    public String getAvatarShape() {
        return avatar_shape;
    }

    public boolean isShowAvatar() {
        return show_avatar;
    }

    public boolean isShowDescription() {
        return show_description;
    }

    public boolean isShowHeaderImage() {
        return show_header_image;
    }

    public boolean isShowTitle() {
        return show_title;
    }
}
