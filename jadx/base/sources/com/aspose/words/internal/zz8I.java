package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zz8I {
    public static boolean zzUI(int i) {
        return i == 1 || i == 11 || i == 13 || i == 16;
    }

    public static boolean zzUJ(int i) {
        return i == 11141161 || i == 13369376 || i == 15728673;
    }

    public static void zzY(zzG5 zzg5, zzA4 zza4, byte[] bArr) throws Exception {
        switch (zzg5.zzJP()) {
            case 4457256:
            case 6684742:
            case 8913094:
            case 12255782:
            case 15597702:
                if (bArr != null) {
                    zza4.zzZ(zzZQ4.zzN(zzg5.zzJO()), zzZQ4.zzN(zzg5.zzJN()), bArr);
                }
                break;
            case 5898313:
            case 10485961:
                zza4.zzu(zzZQ4.zzN(zzg5.zzJN()));
                break;
        }
    }

    public static void zzZ(zzG5 zzg5, zzA4 zza4, byte[] bArr) throws Exception {
        int iZzJP = zzg5.zzJP();
        if (iZzJP != 13369376) {
            if (iZzJP != 15728673) {
                return;
            }
            zza4.zzu(zzZQ4.zzN(zzg5.zzJN()));
        } else if (zzg5.zzJM()) {
            zza4.zzZ(zzZQ4.zzN(zzg5.zzJO()), zzZQ4.zzN(zzg5.zzJN()), bArr);
        }
    }

    public static zzZQ5 zzZ(zzZQ4 zzzq4, zzP9 zzp9, long j) {
        zzZQ4 zzzq4ZzO = zzp9.zzO(zzzq4);
        int i = (int) j;
        int i2 = (int) (j >>> 32);
        zzZQ5 zzzq5ZzT = zzZQ5.zzT(zzAN.zzK((int) Math.floor(zzzq4ZzO.zzZm()), 0, i), zzAN.zzK((int) Math.floor(zzzq4ZzO.zzZo()), 0, i2), zzAN.zzK((int) Math.floor(zzzq4ZzO.zzkw()), 0, i), zzAN.zzK((int) Math.floor(zzzq4ZzO.zzZn()), 0, i2));
        return (zzzq5ZzT.getWidth() <= 0 || zzzq5ZzT.getHeight() <= 0) ? zzZQ5.zz2U : zzzq5ZzT;
    }
}
