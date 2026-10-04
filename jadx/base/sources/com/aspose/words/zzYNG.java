package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYNG extends zzZRZ implements zzZ9P {
    static boolean zzZD5 = false;
    private zzZO7 zzXI8;
    private int zzZD8;

    public zzYNG(com.aspose.words.internal.zzZOX zzzox, int i) throws Exception {
        super(zzzox);
        this.zzZD8 = i;
    }

    @Override // com.aspose.words.zzZ9P
    public final void zzY(com.aspose.words.internal.zzZOX zzzox, int i, int i2) throws Exception {
        zzYNJ zzynj;
        zzXH zzxh = new zzXH(zzzox, this.zzZD8);
        long position = zzzox.zzq().getPosition();
        try {
            if (zzxh.zzZAU != 0) {
                long jZzZhj = zzZhj() + ((long) (zzxh.zzZAU * 2));
                if (zzZD5) {
                    com.aspose.words.internal.zzZKN.format("papxStart:{0}", Long.valueOf(jZzZhj));
                }
                zzzox.zzq().zzU(jZzZhj, 0);
                zzynj = zzYNJ.zzY(zzzox, true, this.zzZD8);
            } else {
                zzynj = new zzYNJ();
            }
            this.zzXI8.zzZ(i, i2, zzynj);
            zzzox.zzq().zzU(position, 0);
        } catch (Throwable th) {
            zzzox.zzq().zzU(position, 0);
            throw th;
        }
    }

    public final void zzZ(zzZO7 zzzo7) throws Exception {
        this.zzXI8 = zzzo7;
        zzYLK.zzZ(zzZhh(), zzZhi(), this);
    }
}
