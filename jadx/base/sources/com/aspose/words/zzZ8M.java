package com.aspose.words;

import android.support.v4.media.session.PlaybackStateCompat;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ8M extends Forms2OleControl {
    private zzYO8 zzZxa;

    public zzZ8M(String str) {
        super(str, new zzZ8L());
        zzYO8 zzyo8Zzh = zzYO8.zzh(72.0d, 72.0d);
        this.zzZxa = zzyo8Zzh;
        zzZ(zzyo8Zzh);
    }

    @Override // com.aspose.words.OleControl
    public final String getClsidVirtual() {
        return "4c599241-6926-101b-9992-00000b65c6f9";
    }

    @Override // com.aspose.words.Forms2OleControl
    public final int getType() {
        return 11;
    }

    @Override // com.aspose.words.Forms2OleControl
    public final int zz1E() {
        return 12;
    }

    @Override // com.aspose.words.OleControl
    public final int zzV(com.aspose.words.internal.zzZOW zzzow) throws Exception {
        int position = (int) zzzow.zzq().getPosition();
        zzzow.zzK((short) 512);
        zzzow.zzZa(2, 1);
        zzzow.zzZa(4, 1);
        zzZLX zzzlx = new zzZLX(zzzow, this.zzYvV);
        long j = (int) (((long) ((int) ((zzzlx.zzX9(31070, 2) ? 16384L : 0L) | ((long) ((int) (((long) ((int) (((long) ((int) (((long) ((int) (((long) ((int) (((long) ((int) (((long) ((int) (((long) ((int) (((long) ((int) (zzzlx.zzX9(31050, 4) ? 8L : 0L))) | (zzzlx.zzX9(31005, 4) ? 16L : 0L)))) | (zzzlx.zzX9(31020, 1) ? 32L : 0L)))) | (zzzlx.zzX9(31045, 1) ? 64L : 0L)))) | (zzzlx.zzX9(31235, 1) ? 128L : 0L)))) | (zzzlx.zzX9(31055, 1) ? 256L : 0L)))) | (zzzlx.zzX9(31060, 2) ? 1024L : 0L)))) | (zzzlx.zzX9(31230, 1) ? 2048L : 0L)))) | (zzzlx.zzX9(31010, 4) ? PlaybackStateCompat.ACTION_PLAY_FROM_URI : 0L))))))) | (zzZ6j() ? 4L : 0L));
        long j2 = zzYW4() ? 4096L : 0L;
        zzzlx.zzXB(4);
        int i = (int) (((long) ((int) (j | j2))) | (zzzlx.zzX9(31025, 8) ? 512L : 0L));
        zzzlx.zzXB(4);
        zzzlx.zzX8(position, i);
        int i2 = (int) (((long) i) & 4294967295L);
        if ((i2 & 1024) != 0) {
            zzzlx.zzYd(zzZ6n());
        }
        if ((i2 & 16384) != 0) {
            zzzlx.zzYd(zzZ6o());
        }
        return (int) (zzzow.zzq().getPosition() - ((long) position));
    }

    public final boolean zzYW4() {
        return ((Boolean) this.zzYvV.zzPj(31405)).booleanValue();
    }

    public final int zzYW5() {
        return ((Integer) this.zzYvV.zzPj(31230)).intValue();
    }

    public final int zzYW6() {
        return ((Integer) this.zzYvV.zzPj(31235)).intValue();
    }

    @Override // com.aspose.words.OleControl
    public final void zzZ(com.aspose.words.internal.zzZOX zzzox) throws Exception {
        zzzox.zzX9();
        zzzox.zzX9();
        int iZzXb = (int) (((long) zzzox.zzXb()) & 4294967295L);
        zzZLY zzzly = new zzZLY(zzzox, this.zzYvV);
        zzzly.zzZjA = iZzXb;
        zzzly.zzf(8, 4, 31050);
        zzzly.zzf(16, 4, 31005);
        zzzly.zzf(32, 1, 31020);
        zzzly.zzf(64, 1, 31045);
        zzzly.zzf(128, 1, 31235);
        zzzly.zzf(256, 1, 31055);
        zzzly.zzf(1024, 2, 31060);
        zzzly.zzf(2048, 1, 31230);
        zzzly.zzf(8192, 4, 31010);
        zzzly.zzf(16384, 2, 31070);
        this.zzYvV.zzQ(31400, Boolean.valueOf((iZzXb & 4) != 0));
        this.zzYvV.zzQ(31405, Boolean.valueOf((iZzXb & 4096) != 0));
        zzzly.zzXc(iZzXb & 512, 31025);
        if ((iZzXb & 1024) != 0) {
            zzzly.zzAD(31060);
        }
        if ((16384 & iZzXb) != 0) {
            zzzly.zzAD(31070);
        }
    }
}
