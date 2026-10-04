package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZR5 {
    private static com.aspose.words.internal.zz7I zzMl(String str) {
        int value;
        if (com.aspose.words.internal.zzZKN.zzU3(str)) {
            return com.aspose.words.internal.zz7I.zznT;
        }
        com.aspose.words.internal.zz7I zz7iZzZn = com.aspose.words.internal.zzJB.zzZn(str);
        if (zz7iZzZn.hasValue() && zz7iZzZn.getValue() >= 0 && (value = zz7iZzZn.getValue() % 65536) != 0) {
            return com.aspose.words.internal.zz7J.zzUA(value);
        }
        return com.aspose.words.internal.zz7I.zznT;
    }

    public static int zzMm(String str) {
        com.aspose.words.internal.zz7I zz7iZzMl = zzMl(str);
        if (zz7iZzMl.hasValue()) {
            return zz7iZzMl.getValue();
        }
        com.aspose.words.internal.zzZP1 zzzp1ZzWY = com.aspose.words.internal.zzZXR.zzWY(str);
        return zzzp1ZzWY != null ? zzzp1ZzWY.zzj9().intValue() : zzZg3();
    }

    public static int zzZg3() {
        return com.aspose.words.internal.zzZXR.zzpZ().zzj9().intValue();
    }
}
