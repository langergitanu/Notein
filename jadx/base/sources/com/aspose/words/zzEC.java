package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzEC extends zzFI {
    private static zzFG zzZfI = new zzFG();
    private static zzFG zzZbT = new zzFG();

    static {
        zzZfI.zzZ(1, new zzF8(new zzEL(12, zzFE.zzYq(50.0d))));
        zzZfI.zzZ(41, new zzF8(new zzEL(12, zzFE.zzYq(90.0d))));
        zzZbT.zzZ(1, new zzF8(new zzEL(12, zzFE.zzYq(50.0d))));
        zzZbT.zzZ(33, new zzF8(new zzEL(0, zzFE.zzYq(50.0d))));
        zzZbT.zzZ(41, new zzF8(new zzEL(0, zzFE.zzYq(90.0d))));
    }

    public zzEC(zzDI zzdi) {
        super(zzdi);
        zzZ((zzZMS() ? zzZbT : zzZfI).zzL8(zzdi.getStyle()));
    }
}
