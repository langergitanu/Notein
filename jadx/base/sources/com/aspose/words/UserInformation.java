package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class UserInformation {
    private static UserInformation zzX0G = new UserInformation();
    private String mName;
    private String zzXUw;
    private String zzYJS;

    public static UserInformation getDefaultUser() {
        return zzX0G;
    }

    public String getAddress() {
        return this.zzYJS;
    }

    public String getInitials() {
        return this.zzXUw;
    }

    public String getName() {
        return this.mName;
    }

    public void setAddress(String str) {
        this.zzYJS = str;
    }

    public void setInitials(String str) {
        this.zzXUw = str;
    }

    public void setName(String str) {
        this.mName = str;
    }
}
