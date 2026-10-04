package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzKE {
    public static com.aspose.words.internal.zzZQ9 zzM4(int i) {
        if (i == 0) {
            return com.aspose.words.internal.zzZQ9.zz35;
        }
        return com.aspose.words.internal.zzR1.zzX(((i & 535822336) >> 20) + 1900, (983040 & i) >> 16, (63488 & i) >> 11, (i & 1984) >> 6, i & 63);
    }

    public static void zzY(com.aspose.words.internal.zzZQ9 zzzq9, com.aspose.words.internal.zzZOW zzzow) throws Exception {
        com.aspose.words.internal.zzZQ9 zzzq92 = com.aspose.words.internal.zzZQ9.zz35;
        if (com.aspose.words.internal.zzZQ9.zzZ(zzzq9, zzzq92)) {
            zzZ(zzzq92, zzzow);
        } else {
            zzZ(zzzq9.zzkK(), zzzow);
        }
    }

    public static void zzZ(com.aspose.words.internal.zzZQ9 zzzq9, com.aspose.words.internal.zzZOW zzzow) throws Exception {
        zzzow.zzl(zzt(zzzq9));
    }

    public static int zzt(com.aspose.words.internal.zzZQ9 zzzq9) {
        if (zzzq9.getYear() < 1900) {
            return 0;
        }
        return (zzzq9.zzkS() << 29) | zzzq9.getMinute() | (zzzq9.getHour() << 6) | (zzzq9.getDay() << 11) | (zzzq9.getMonth() << 16) | ((zzzq9.getYear() - 1900) << 20);
    }
}
