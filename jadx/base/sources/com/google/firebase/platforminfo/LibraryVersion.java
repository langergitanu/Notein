package com.google.firebase.platforminfo;

/* JADX INFO: loaded from: classes8.dex */
abstract class LibraryVersion {
    public static LibraryVersion create(String str, String str2) {
        return new AutoValue_LibraryVersion(str, str2);
    }

    public abstract String getLibraryName();

    public abstract String getVersion();
}
