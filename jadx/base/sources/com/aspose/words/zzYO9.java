package com.aspose.words;

import android.support.v4.media.session.PlaybackStateCompat;

/* JADX INFO: loaded from: classes6.dex */
final class zzYO9 {
    private zzZLZ zzYvB = new zzZLZ();

    public zzYO9(com.aspose.words.internal.zzZOX zzzox) throws Exception {
        zzzox.zzX9();
        zzzox.zzX9();
        int iZzXb = (int) (((long) zzzox.zzXb()) & 4294967295L);
        zzZLY zzzly = new zzZLY(zzzox, this.zzYvB);
        zzzly.zzZjA = iZzXb;
        int iZzXf = zzzly.zzXf(1, 4);
        int iZzXf2 = zzzly.zzXf(2, 4);
        zzzly.zzf(4, 4, 31265);
        zzzly.zzf(8, 4, 31270);
        zzzly.zzf(16, 4, 31275);
        zzzly.zzf(32, 4, 31280);
        zzzly.zzf(64, 2, 31285);
        zzzly.zzf(128, 2, 31290);
        zzzly.zzf(512, 2, 31295);
        int iZzXf3 = zzzly.zzXf(2048, 4);
        int iZzXf4 = zzzly.zzXf(4096, 4);
        int iZzXf5 = zzzly.zzXf(8192, 4);
        int iZzXf6 = zzzly.zzXf(16384, 4);
        zzzly.zze(1, iZzXf, 31300);
        zzzly.zze(2, iZzXf2, 31305);
        zzzly.zzXc(256, 31026);
        zzzly.zze(2048, iZzXf3, 31310);
        zzzly.zze(4096, iZzXf4, 31315);
        zzzly.zze(8192, iZzXf5, 31320);
        zzzly.zze(16384, iZzXf6, 31325);
        zzzly.zzAE(4);
    }

    private String getName() {
        return (String) this.zzYvB.zzPj(31300);
    }

    private int zz1E() {
        return ((Integer) this.zzYvB.zzPj(31290)).intValue();
    }

    public static void zzY(com.aspose.words.internal.zzZOW zzzow, Forms2OleControl forms2OleControl) throws Exception {
        int position = (int) zzzow.zzq().getPosition();
        zzzow.zzJ((short) 0);
        zzzow.zzZa(2, 1);
        zzzow.zzZa(4, 1);
        zzZLX zzzlx = new zzZLX(zzzow, forms2OleControl.zzYvV);
        if (forms2OleControl.zzYvV.zzPg(31290)) {
            forms2OleControl.zzYvV.set(31290, Integer.valueOf(forms2OleControl.zz1E()));
        }
        byte[] bArrZzLg = zzzlx.zzLg(forms2OleControl.getName());
        byte[] bArrZzLg2 = zzzlx.zzLg(forms2OleControl.getTag());
        int i = (int) (((long) ((int) (((long) ((int) (((long) ((int) (((long) ((int) (((long) ((int) (((long) ((int) (zzzlx.zzX9(31265, 4) ? 4L : 0L))) | (zzzlx.zzX9(31270, 4) ? 8L : 0L)))) | (zzzlx.zzX9(31275, 4) ? 16L : 0L)))) | (zzzlx.zzX9(31280, 4) ? 32L : 0L)))) | (zzzlx.zzX9(31285, 2) ? 64L : 0L)))) | (zzzlx.zzX9(31290, 2) ? 128L : 0L)))) | (zzzlx.zzX9(31295, 2) ? 512L : 0L));
        byte[] bArrZzLg3 = zzzlx.zzLg(forms2OleControl.zzZzU());
        byte[] bArrZzLg4 = zzzlx.zzLg(forms2OleControl.zzZ6m());
        byte[] bArrZzLg5 = zzzlx.zzLg(forms2OleControl.zzZ6l());
        byte[] bArrZzLg6 = zzzlx.zzLg(forms2OleControl.zzZ6k());
        zzzlx.zzXB(4);
        long j = (int) (((long) ((int) (((long) ((int) ((zzzlx.zzt(bArrZzLg3, 4) ? 2048L : 0L) | ((long) ((int) (((long) ((int) (((long) ((int) (((long) i) | (zzzlx.zzt(bArrZzLg, 4) ? 1L : 0L)))) | (zzzlx.zzt(bArrZzLg2, 4) ? 2L : 0L)))) | (zzzlx.zzX9(31026, 8) ? 256L : 0L))))))) | (zzzlx.zzt(bArrZzLg4, 4) ? 4096L : 0L)))) | (zzzlx.zzt(bArrZzLg5, 4) ? PlaybackStateCompat.ACTION_PLAY_FROM_URI : 0L));
        long j2 = zzzlx.zzt(bArrZzLg6, 4) ? 16384L : 0L;
        zzzlx.zzXB(4);
        zzzlx.zzX8(position, (int) (j | j2));
    }

    private static int zzqV(int i) {
        if (i == 7) {
            return 13;
        }
        if (i == 12) {
            return 11;
        }
        if (i == 14) {
            return 7;
        }
        if (i == 21) {
            return 1;
        }
        if (i == 47) {
            return 12;
        }
        if (i == 57) {
            return 8;
        }
        switch (i) {
            case 16:
                return 5;
            case 17:
                return 10;
            case 18:
                return 9;
            default:
                switch (i) {
                    case 23:
                        return 2;
                    case 24:
                        return 14;
                    case 25:
                        return 6;
                    case 26:
                        return 3;
                    case 27:
                        return 0;
                    case 28:
                        return 4;
                    default:
                        throw new IllegalStateException(com.aspose.words.internal.zzZKN.format("Unexpected ClsidCacheIndex: {0}", Integer.valueOf(i)));
                }
        }
    }

    public final String zzYrk() {
        Integer num = (Integer) this.zzYvB.zzPj(31265);
        num.intValue();
        return com.aspose.words.internal.zzZKN.format("i{0:d2}", num);
    }

    public final int zzYrl() {
        return (int) (((long) ((Integer) this.zzYvB.zzPj(31280)).intValue()) & 4294967295L);
    }

    public final Forms2OleControl zzYrm() {
        Forms2OleControl forms2OleControlZzv = Forms2OleControl.zzv(zzqV(zz1E()), getName());
        this.zzYvB.zzZ(forms2OleControlZzv.zzYvV);
        return forms2OleControlZzv;
    }
}
