package com.orion.notein.richeditor.utils;

/* JADX INFO: loaded from: classes9.dex */
public abstract class Constants {
    public static final int CROP_IMAGE = 107;

    public enum MediaAction {
        PICK_PICTURE(101),
        PICK_VIDEO(102),
        PICK_AUDIO(103),
        CAPTURE_PICTURE(104),
        CAPTURE_VIDEO(105),
        CAPTURE_AUDIO(106);

        private int mRequestCode;

        MediaAction(int i) {
            this.mRequestCode = i;
        }

        public int requestCode() {
            return this.mRequestCode;
        }
    }
}
