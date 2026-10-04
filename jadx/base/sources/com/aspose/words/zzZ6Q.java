package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ6Q {
    private int zzYw;
    private String zzZj;

    public zzZ6Q(int i, String str) {
        setLevel(i);
        setTitle(str);
    }

    private void setLevel(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: value");
        }
        this.zzYw = i;
    }

    private void setTitle(String str) {
        if (str == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: value");
        }
        this.zzZj = str;
    }

    public final int getLevel() {
        return this.zzYw;
    }

    public final String getTitle() {
        return this.zzZj;
    }
}
