package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes7.dex */
public final class zbqe extends zbuf implements zbvn {
    private static final zbqe zbb;
    private zbun zbd = zbuf.zby();

    static {
        zbqe zbqeVar = new zbqe();
        zbb = zbqeVar;
        zbuf.zbD(zbqe.class, zbqeVar);
    }

    private zbqe() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    public final Object zbb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zbd", zbqd.class});
        }
        if (i2 == 3) {
            return new zbqe();
        }
        zbpu zbpuVar = null;
        if (i2 == 4) {
            return new zbqb(zbpuVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zbb;
    }
}
