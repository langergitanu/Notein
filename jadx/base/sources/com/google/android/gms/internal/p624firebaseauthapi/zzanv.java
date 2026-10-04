package com.google.android.gms.internal.p624firebaseauthapi;

/* JADX INFO: loaded from: classes7.dex */
public final class zzanv extends RuntimeException {
    public zzanv(zzamm zzammVar) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final zzall zza() {
        return new zzall(getMessage());
    }
}
