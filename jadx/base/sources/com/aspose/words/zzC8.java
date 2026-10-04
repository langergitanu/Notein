package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzC8 extends zzFI {
    private static zzFG zzZfI;

    static {
        zzFG zzfg = new zzFG();
        zzZfI = zzfg;
        zzfg.zzZ(1, new zzF8(null, null, null));
        zzZfI.zzZ(33, new zzF8(new zzF3(0, 0, zzFE.zzYq(20.0d))));
        int i = 0;
        while (true) {
            int[] iArr = zzFE.zzZdj;
            if (i >= iArr.length) {
                zzZfI.zzZ(41, new zzF8(new zzF3(0, 0, zzFE.zzYq(95.0d))));
                return;
            } else {
                zzZfI.zzZ(i + 35, new zzF8(new zzF3(0, iArr[i], zzFE.zzYq(20.0d))));
                i++;
            }
        }
    }

    public zzC8(zzDI zzdi) {
        super(zzdi);
        zzZ(zzZfI.zzL8(zzdi.getStyle()));
    }
}
