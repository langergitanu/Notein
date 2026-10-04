package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYOQ {
    public static com.aspose.words.internal.zzPV zzU(com.aspose.words.internal.zzPV zzpv, int i) {
        double d = ((double) i) / 255.0d;
        com.aspose.words.internal.zzIP zzip = new com.aspose.words.internal.zzIP(zzpv);
        zzip.zzZQ(zzip.zzGu() * d);
        return zzip.zzGx();
    }

    public static com.aspose.words.internal.zzPV zzV(com.aspose.words.internal.zzPV zzpv, int i) {
        double d = ((double) i) / 255.0d;
        com.aspose.words.internal.zzIP zzip = new com.aspose.words.internal.zzIP(zzpv);
        zzip.zzZQ((1.0d - d) + (zzip.zzGu() * d));
        return zzip.zzGx();
    }

    public static com.aspose.words.internal.zzPV zzZ(Object obj, Object obj2, Object obj3, Theme theme) {
        if (theme == null) {
            return null;
        }
        if (obj2 != null && obj3 != null) {
            return null;
        }
        String str = (String) obj;
        if (!com.aspose.words.internal.zzZYD.zzXk(str)) {
            return null;
        }
        com.aspose.words.internal.zzPV zzpvZzZ = theme.zzXVE().zzAf(str).zzZ(theme, (zzZCM) null);
        String str2 = (String) obj2;
        if (com.aspose.words.internal.zzZYD.zzXk(str2)) {
            return zzV(zzpvZzZ, com.aspose.words.internal.zzJB.zzZe(str2));
        }
        String str3 = (String) obj3;
        return com.aspose.words.internal.zzZYD.zzXk(str3) ? zzU(zzpvZzZ, com.aspose.words.internal.zzJB.zzZe(str3)) : zzpvZzZ;
    }
}
