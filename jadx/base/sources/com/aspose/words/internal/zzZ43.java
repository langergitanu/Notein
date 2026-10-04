package com.aspose.words.internal;

import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZ43 implements zzZ46 {
    private zzZ5W zzWlz;
    private byte[] zzZWW;
    private final boolean zzWlB = zzZ5L.zzXH0();
    private int zzWlA = zzXGF();

    public zzZ43(zzZ5W zzz5w, byte[] bArr) {
        this.zzWlz = zzz5w;
        this.zzZWW = (byte[]) bArr.clone();
    }

    private void zzXGE() {
        if (this.zzWlB != zzZ5L.zzXH0()) {
            throw new zzZ14(androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder("attempt to use key created in "), this.zzWlB ? "approved mode" : "unapproved mode", " in alternate mode."));
        }
    }

    private int zzXGF() {
        zzXGE();
        return Arrays.hashCode(this.zzZWW) + (this.zzWlz.hashCode() * 31);
    }

    private void zzXGG() {
        int i = 0;
        while (true) {
            byte[] bArr = this.zzZWW;
            if (i == bArr.length) {
                this.zzZWW = null;
                this.zzWlz = null;
                this.zzWlA = 0;
                return;
            }
            bArr[i] = 0;
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzZ43)) {
            return false;
        }
        zzZ43 zzz43 = (zzZ43) obj;
        return this.zzWlz.equals(zzz43.zzWlz) && Arrays.equals(this.zzZWW, zzz43.zzZWW);
    }

    public final void finalize() throws Throwable {
        zzXGG();
    }

    public final int hashCode() {
        zzXGE();
        return this.zzWlA;
    }

    @Override // com.aspose.words.internal.zzZ58
    public final zzZ5W zzXGV() {
        return this.zzWlz;
    }

    @Override // com.aspose.words.internal.zzZ46
    public final byte[] zzXK4() {
        zzXGE();
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            securityManager.checkPermission(zzYUM.zzVZx);
        }
        return (byte[]) this.zzZWW.clone();
    }

    public zzZ43(zzZ4M zzz4m, byte[] bArr) {
        this.zzWlz = zzz4m.zzXGV();
        this.zzZWW = (byte[]) bArr.clone();
    }
}
