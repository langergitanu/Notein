package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzF1 extends zzFI {
    private static zzFG zzZfI;

    static {
        zzFG zzfg = new zzFG();
        zzZfI = zzfg;
        zzfg.zzZ(1, new zzF8(new zzEL(12, zzFE.zzYq(75.0d))));
        zzZfI.zzZ(33, new zzF8(new zzEL(0, zzFE.zzYq(75.0d)), new zzF3(0, 0, zzFE.zzYq(20.0d)), null));
        for (int i = 0; i < zzFE.zzZdj.length; i++) {
            zzZfI.zzZ(i + 35, new zzF8(new zzEL(0, zzFE.zzYq(75.0d)), new zzF3(0, zzFE.zzZdj[i], zzFE.zzYq(20.0d)), null));
        }
        zzZfI.zzZ(41, new zzF8(new zzF3(0, 0, zzFE.zzYq(95.0d))));
    }

    public zzF1(zzDI zzdi) {
        super(zzdi);
        zzZ(zzZfI.zzL8(zzdi.getStyle()));
    }
}
