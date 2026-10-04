package com.google.firebase.platforminfo;

import oO00ooO.C32431OooO;

/* JADX INFO: loaded from: classes8.dex */
public final class KotlinDetector {
    private KotlinDetector() {
    }

    public static String detectVersion() {
        try {
            return C32431OooO.f116622OooOoOO.toString();
        } catch (NoClassDefFoundError unused) {
            return null;
        }
    }
}
