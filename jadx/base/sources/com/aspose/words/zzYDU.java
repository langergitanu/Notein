package com.aspose.words;

import android.support.v4.media.session.PlaybackStateCompat;

/* JADX INFO: loaded from: classes6.dex */
final class zzYDU extends zzYDR {
    private zzYO8 zzZxa;

    public zzYDU(String str) {
        super(str, new zzYDT());
        zzYO8 zzyo8Zzh = zzYO8.zzh(13.0d, 64.0d);
        this.zzZxa = zzyo8Zzh;
        zzZ(zzyo8Zzh);
    }

    @Override // com.aspose.words.OleControl
    public final String getClsidVirtual() {
        return "dfd181e0-5e2f-11ce-a449-00aa004a803d";
    }

    public final int getOrientation() {
        return ((Integer) this.zzYvV.zzPj(31190)).intValue();
    }

    @Override // com.aspose.words.Forms2OleControl
    public final int getType() {
        return 12;
    }

    @Override // com.aspose.words.Forms2OleControl
    public final int zz1E() {
        return 47;
    }

    @Override // com.aspose.words.OleControl
    public final int zzV(com.aspose.words.internal.zzZOW zzzow) throws Exception {
        int position = (int) zzzow.zzq().getPosition();
        zzzow.zzK((short) 512);
        zzzow.zzZa(2, 1);
        zzzow.zzZa(4, 1);
        zzZLX zzzlx = new zzZLX(zzzow, this.zzYvV);
        long j = (int) (((long) ((int) (((long) ((int) (((long) ((int) (((long) ((int) (((long) ((int) (((long) ((int) (((long) ((int) (((long) ((int) (((long) ((int) (((long) ((int) (((long) ((int) (((long) ((int) (((long) ((int) (zzzlx.zzX9(31000, 4) ? 1L : 0L))) | (zzzlx.zzX9(31005, 4) ? 2L : 0L)))) | (zzzlx.zzX9(31010, 4) ? 4L : 0L)))) | (zzzlx.zzX9(31045, 1) ? 16L : 0L)))) | (zzzlx.zzX9(31160, 4) ? 32L : 0L)))) | (zzzlx.zzX9(31165, 4) ? 64L : 0L)))) | (zzzlx.zzX9(31170, 4) ? 128L : 0L)))) | (zzzlx.zzX9(31175, 4) ? 512L : 0L)))) | (zzzlx.zzX9(31180, 4) ? 1024L : 0L)))) | (zzzlx.zzX9(31185, 4) ? 2048L : 0L)))) | (zzzlx.zzX9(31186, 4) ? 4096L : 0L)))) | (zzzlx.zzX9(31190, 4) ? PlaybackStateCompat.ACTION_PLAY_FROM_URI : 0L)))) | (zzzlx.zzX9(31490, 2) ? 16384L : 0L)))) | (zzzlx.zzX9(31195, 4) ? PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID : 0L));
        long j2 = zzzlx.zzX9(31070, 2) ? 65536L : 0L;
        zzzlx.zzXB(4);
        int i = (int) (((long) ((int) (j2 | j))) | (zzzlx.zzX9(31025, 8) ? 8L : 0L));
        zzzlx.zzXB(4);
        zzzlx.zzX8(position, i);
        if ((((int) (((long) i) & 4294967295L)) & 65536) != 0) {
            zzzlx.zzYd(zzZ6o());
        }
        return (int) (zzzow.zzq().getPosition() - ((long) position));
    }

    public final short zzYcZ() {
        return ((Short) this.zzYvV.zzPj(31490)).shortValue();
    }

    @Override // com.aspose.words.OleControl
    public final void zzZ(com.aspose.words.internal.zzZOX zzzox) throws Exception {
        zzzox.zzX9();
        zzzox.zzX9();
        int iZzXb = (int) (((long) zzzox.zzXb()) & 4294967295L);
        zzZLY zzzly = new zzZLY(zzzox, this.zzYvV);
        zzzly.zzZjA = iZzXb;
        zzzly.zzf(1, 4, 31000);
        zzzly.zzf(2, 4, 31005);
        zzzly.zzf(4, 4, 31010);
        zzzly.zzf(16, 1, 31045);
        zzzly.zzf(32, 4, 31160);
        zzzly.zzf(64, 4, 31165);
        zzzly.zzf(128, 4, 31170);
        zzzly.zzf(512, 4, 31175);
        zzzly.zzf(1024, 4, 31180);
        zzzly.zzf(2048, 4, 31185);
        zzzly.zzf(4096, 4, 31186);
        zzzly.zzf(8192, 4, 31190);
        zzzly.zzf(16384, 2, 31490);
        zzzly.zzf(32768, 2, 31195);
        zzzly.zzf(65536, 2, 31070);
        zzzly.zzXc(iZzXb & 8, 31025);
        if ((65536 & iZzXb) != 0) {
            zzzly.zzAD(31070);
        }
    }
}
