package com.aspose.words.internal;

import com.google.android.gms.stats.CodePackage;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes5.dex */
final class zzYVO {
    static final SecureRandom zzWbb = new SecureRandom();

    public static void zzX(zzZ5W zzz5w) {
        if (zzZ5L.zzXH0()) {
            throw new zzZ0H("Attempt to use unapproved algorithm in approved only mode", zzz5w);
        }
    }

    public static int zzY(zzZ5W zzz5w, int i) {
        return (zzz5w.getName().endsWith("GMAC") || zzz5w.getName().endsWith("/CMAC") || zzz5w.getName().endsWith(CodePackage.GCM) || zzz5w.getName().endsWith("OCB") || zzz5w.getName().endsWith("ISO979ALG3")) ? i : i / 2;
    }

    public static zzYS8 zzZ(zzYUD zzyud) {
        return new zzYS7(zzyud.zzXK4());
    }

    public static void zzZ(zzYUD zzyud, zzZ5W zzz5w, zzZ5W zzz5w2) {
        zzZ5W zzz5wZzXGV = zzyud.zzXGV();
        if (!zzz5wZzXGV.equals(zzz5w) && !zzz5wZzXGV.equals(zzz5w2)) {
            throw new zzZ5E("Key not for appropriate algorithm");
        }
    }
}
