package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzUW extends Forms2OleControl {
    private zzYO8 zzZxa;

    public zzUW(String str) {
        super(str);
        zzYO8 zzyo8Zzh = zzYO8.zzh(72.0d, 24.0d);
        this.zzZxa = zzyo8Zzh;
        zzZ(zzyo8Zzh);
    }

    @Override // com.aspose.words.OleControl
    public final String getClsidVirtual() {
        return "d7053240-ce69-11cd-a777-00dd01143c57";
    }

    public final String getFontName() {
        return (String) this.zzYvV.zzPj(31600);
    }

    @Override // com.aspose.words.Forms2OleControl
    public final int getType() {
        return 10;
    }

    public final int zz1C() {
        return ((Integer) this.zzYvV.zzPj(31605)).intValue();
    }

    public final int zz1D() {
        return ((Integer) this.zzYvV.zzPj(31610)).intValue();
    }

    @Override // com.aspose.words.Forms2OleControl
    public final int zz1E() {
        return 17;
    }

    @Override // com.aspose.words.OleControl
    public final int zzV(com.aspose.words.internal.zzZOW zzzow) throws Exception {
        int position = (int) zzzow.zzq().getPosition();
        zzzow.zzK((short) 512);
        zzzow.zzZa(2, 1);
        zzzow.zzZa(4, 1);
        zzZLX zzzlx = new zzZLX(zzzow, this.zzYvV);
        int i = (int) (((long) ((int) (((long) ((int) (zzzlx.zzX9(31000, 4) ? 1L : 0L))) | (zzzlx.zzX9(31005, 4) ? 2L : 0L)))) | (zzzlx.zzX9(31010, 4) ? 4L : 0L));
        byte[] bArrZzLg = zzzlx.zzLg(getCaption());
        long j = (int) ((zzzlx.zzX9(31070, 2) ? 1024L : 0L) | ((long) ((int) (((long) ((int) (((long) ((int) (((long) ((int) (((long) i) | (zzzlx.zzX9(31040, 4) ? 16L : 0L)))) | (zzzlx.zzX9(31045, 1) ? 64L : 0L)))) | (zzzlx.zzX9(31060, 2) ? 128L : 0L)))) | (zzzlx.zzX9(31065, 2) ? 256L : 0L)))));
        long j2 = !this.zzYvV.zzPg(31500) ? 512L : 0L;
        zzzlx.zzXB(4);
        int i2 = (int) (((long) ((int) (((long) ((int) (j | j2))) | (zzzlx.zzt(bArrZzLg, 4) ? 8L : 0L)))) | (zzzlx.zzX9(31025, 8) ? 32L : 0L));
        zzzlx.zzXB(4);
        zzzlx.zzd(position, i2, -1);
        int i3 = (int) (((long) i2) & 4294967295L);
        if ((i3 & 128) != 0) {
            zzzlx.zzYd(zzZ6n());
        }
        if ((i3 & 1024) != 0) {
            zzzlx.zzYd(zzZ6o());
        }
        zzZLW.zzZ(zzzow, this.zzYvV);
        return (int) (zzzow.zzq().getPosition() - ((long) position));
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
        int iZzXf = zzzly.zzXf(8, 4);
        zzzly.zzf(16, 4, 31040);
        zzzly.zzf(64, 1, 31045);
        zzzly.zzf(128, 2, 31060);
        zzzly.zzf(256, 2, 31065);
        zzzly.zzf(1024, 2, 31070);
        this.zzYvV.zzO(31500, Boolean.valueOf((iZzXb & 512) == 0));
        zzzly.zze(8, iZzXf, 31015);
        zzzly.zzXc(32, 31025);
        zzzly.zzAE(4);
        if ((iZzXb & 128) != 0) {
            zzzly.zzAD(31060);
        }
        if ((iZzXb & 1024) != 0) {
            zzzly.zzAD(31070);
        }
        zzZLW.zzZ(zzzox, this.zzYvV);
    }
}
