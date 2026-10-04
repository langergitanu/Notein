package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYII {
    private int zzL3;
    private String zzLv;
    private zzYIG zzXxm = new zzYIG();
    private String zzXxn;
    private int zzXxo;
    private int zzXxp;
    private boolean zzXxq;
    private boolean zzXxr;
    private boolean zzXxs;
    private String zzYBj;
    private String zzZj;

    public zzYII(zzZRA zzzra, com.aspose.words.internal.zzZOX zzzox, int i) throws Exception {
        if (zzzra.zzYGE.zzXzx.zzYHJ == 0) {
            return;
        }
        long position = zzzox.zzq().getPosition();
        zzzox.zzq().zzH(zzzra.zzYGE.zzXzx.zzYHK);
        this.zzXxs = zzzox.zzXa() != 0;
        this.zzXxr = zzzox.zzXa() != 0;
        this.zzXxq = zzzox.zzXa() != 0;
        zzzox.zzXa();
        this.zzXxp = zzzox.zzXa();
        this.zzXxo = zzzox.zzXa();
        this.zzL3 = zzzox.zzXa();
        short sZzXa = zzzox.zzXa();
        this.zzLv = zzZZR.zzP(zzzox, i);
        this.zzYBj = zzZZR.zzP(zzzox, i);
        this.zzXxn = zzZZR.zzP(zzzox, i);
        this.zzZj = zzZZR.zzP(zzzox, i);
        for (int i2 = 0; i2 < sZzXa; i2++) {
            this.zzXxm.zzZ(new zzYIH(zzzox, i));
        }
        zzzox.zzq().zzH(position);
    }

    public final int zzV(com.aspose.words.internal.zzZOW zzzow, int i) throws Exception {
        long position = zzzow.zzq().getPosition();
        zzzow.zzK(this.zzXxs ? (short) 1 : (short) 0);
        zzzow.zzK(this.zzXxr ? (short) 1 : (short) 0);
        zzzow.zzK(this.zzXxq ? (short) 1 : (short) 0);
        zzzow.zzK((short) 0);
        zzzow.zzK((short) this.zzXxp);
        zzzow.zzK((short) this.zzXxo);
        zzzow.zzK((short) this.zzL3);
        zzzow.zzK((short) this.zzXxm.getCount());
        zzZZQ.zzZ(zzzow, this.zzLv, i, true);
        zzZZQ.zzZ(zzzow, this.zzYBj, i, true);
        zzZZQ.zzZ(zzzow, this.zzXxn, i, true);
        zzZZQ.zzZ(zzzow, this.zzZj, i, true);
        for (int i2 = 0; i2 < this.zzXxm.getCount(); i2++) {
            this.zzXxm.zzpj(i2).zzW(zzzow, i);
        }
        return (int) (zzzow.zzq().getPosition() - position);
    }
}
