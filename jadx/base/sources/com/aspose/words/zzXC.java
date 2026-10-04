package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzXC extends zzZRZ implements zzZ9P {
    static boolean zzZD5 = false;
    private zzZO6 zzZAQ;

    public zzXC(com.aspose.words.internal.zzZOX zzzox) throws Exception {
        super(zzzox);
    }

    @Override // com.aspose.words.zzZ9P
    public final void zzY(com.aspose.words.internal.zzZOX zzzox, int i, int i2) throws Exception {
        zzXF zzxf;
        int i3 = zzzox.readByte() & 255;
        long position = zzzox.zzq().getPosition();
        try {
            if (i3 != 0) {
                zzzox.zzq().zzU(zzZhj() + ((long) (i3 * 2)), 0);
                zzxf = zzXF.zzZ(zzzox, true);
            } else {
                zzxf = new zzXF();
            }
            this.zzZAQ.zzZ(i, i2, zzxf);
            zzzox.zzq().zzU(position, 0);
        } catch (Throwable th) {
            zzzox.zzq().zzU(position, 0);
            throw th;
        }
    }

    public final void zzZ(zzZO6 zzzo6) throws Exception {
        if (zzZhi() <= 0 || zzZhi() > 101) {
            return;
        }
        this.zzZAQ = zzzo6;
        zzYLK.zzZ(zzZhh(), zzZhi(), this);
    }
}
