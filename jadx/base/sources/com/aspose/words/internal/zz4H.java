package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zz4H {
    private String zziG;
    private String zziH;
    private int zziI;

    public zz4H(String str, String str2, int i) {
        this.zziH = str;
        this.zziG = str2;
        this.zziI = i;
    }

    public final String getOwnerPassword() {
        return this.zziG;
    }

    public final int getPermissions() {
        return this.zziI;
    }

    public final String getUserPassword() {
        return this.zziH;
    }

    public final void setPermissions(int i) {
        this.zziI = i;
    }
}
