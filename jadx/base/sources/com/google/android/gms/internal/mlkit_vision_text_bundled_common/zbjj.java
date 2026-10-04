package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes7.dex */
public final class zbjj extends zbuf implements zbvn {
    private static final zbjj zbb;
    private int zbd;
    private zbuk zbe = zbuf.zbv();
    private zbtc zbf = zbtc.zbb;

    static {
        zbjj zbjjVar = new zbjj();
        zbb = zbjjVar;
        zbuf.zbD(zbjj.class, zbjjVar);
    }

    private zbjj() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    public final Object zbb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001$\u0002ည\u0000", new Object[]{"zbd", "zbe", "zbf"});
        }
        if (i2 == 3) {
            return new zbjj();
        }
        zbjh zbjhVar = null;
        if (i2 == 4) {
            return new zbji(zbjhVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zbb;
    }
}
