package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public class zzXM {
    static final /* synthetic */ boolean zzVr = true;

    private zzXM() {
    }

    public static byte[] zzZ(zzZOP zzzop, long j, zzGQ zzgq) throws Exception {
        zzZOR zzzor;
        zzXN zzxn;
        if (!zzVr && (zzZPW.zzYz(j) == 0.0f || Float.intBitsToFloat((int) j) == 0.0f)) {
            throw new AssertionError();
        }
        zzXN zzxn2 = null;
        bArrZzZX = null;
        byte[] bArrZzZX = null;
        try {
            zzxn = new zzXN(zzzop, zzgq);
            try {
                zzzor = new zzZOR();
                try {
                    zzxn.zzZ(zzzor, 6);
                    bArrZzZX = zzZYQ.zzZX(zzzor);
                    zzxn.dispose();
                } catch (Exception unused) {
                    if (zzxn != null) {
                        zzxn.dispose();
                    }
                    if (zzzor != null) {
                    }
                    if (bArrZzZX != null) {
                    }
                } catch (Throwable th) {
                    th = th;
                    zzxn2 = zzxn;
                    if (zzxn2 != null) {
                        zzxn2.dispose();
                    }
                    if (zzzor != null) {
                        try {
                            zzzor.close();
                        } catch (Exception unused2) {
                        }
                    }
                    throw th;
                }
            } catch (Exception unused3) {
                zzzor = null;
            } catch (Throwable th2) {
                th = th2;
                zzzor = null;
            }
        } catch (Exception unused4) {
            zzxn = null;
            zzzor = null;
        } catch (Throwable th3) {
            th = th3;
            zzzor = null;
        }
        try {
            zzzor.close();
        } catch (Exception unused5) {
        }
        return (bArrZzZX != null || bArrZzZX.length <= 0) ? zzZYQ.zzZX(zzzop) : bArrZzZX;
    }
}
