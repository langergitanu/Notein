package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes7.dex */
public final class zbakr extends zbuf implements zbvn {
    private static final zbakr zbb;
    private zbun zbd = zbuf.zby();

    static {
        zbakr zbakrVar = new zbakr();
        zbb = zbakrVar;
        zbuf.zbD(zbakr.class, zbakrVar);
    }

    private zbakr() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    public final Object zbb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zbuf.zbA(zbb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zbd", zbako.class});
        }
        if (i2 == 3) {
            return new zbakr();
        }
        zbakp zbakpVar = null;
        if (i2 == 4) {
            return new zbakq(zbakpVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zbb;
    }
}
