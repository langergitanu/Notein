package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes7.dex */
public final class zbalm extends zbuf implements zbvn {
    private static final zbalm zbb;

    static {
        zbalm zbalmVar = new zbalm();
        zbb = zbalmVar;
        zbuf.zbD(zbalm.class, zbalmVar);
    }

    private zbalm() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    public final Object zbb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        zbalk zbalkVar = null;
        if (i2 == 2) {
            return zbuf.zbA(zbb, "\u0000\u0000", null);
        }
        if (i2 == 3) {
            return new zbalm();
        }
        if (i2 == 4) {
            return new zball(zbalkVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zbb;
    }
}
