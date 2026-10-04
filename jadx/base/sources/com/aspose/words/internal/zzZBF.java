package com.aspose.words.internal;

import java.io.IOException;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes5.dex */
final class zzZBF extends zzZD4 {
    private byte[] zzWHB;

    public zzZBF(byte[] bArr) throws IOException {
        this.zzWHB = bArr;
    }

    private void zz0P() {
        zzZBG zzzbg = new zzZBG(this.zzWHB);
        while (zzzbg.hasMoreElements()) {
            this.zzWIk.addElement(zzzbg.nextElement());
        }
        this.zzWHB = null;
    }

    @Override // com.aspose.words.internal.zzZD4
    public final synchronized int size() {
        try {
            if (this.zzWHB != null) {
                zz0P();
            }
        } catch (Throwable th) {
            throw th;
        }
        return super.size();
    }

    @Override // com.aspose.words.internal.zzZD4
    public final synchronized Enumeration zzXKE() {
        byte[] bArr = this.zzWHB;
        if (bArr == null) {
            return super.zzXKE();
        }
        return new zzZBG(bArr);
    }

    @Override // com.aspose.words.internal.zzZD4, com.aspose.words.internal.zzZD5
    public final zzZD5 zzXL2() {
        if (this.zzWHB != null) {
            zz0P();
        }
        return super.zzXL2();
    }

    @Override // com.aspose.words.internal.zzZD4, com.aspose.words.internal.zzZD5
    public final zzZD5 zzXL3() {
        if (this.zzWHB != null) {
            zz0P();
        }
        return super.zzXL3();
    }

    @Override // com.aspose.words.internal.zzZD5
    public final int zzXL6() throws IOException {
        byte[] bArr = this.zzWHB;
        return bArr != null ? zzZBC.zzg4(bArr.length) + 1 + this.zzWHB.length : super.zzXL2().zzXL6();
    }

    @Override // com.aspose.words.internal.zzZD4, com.aspose.words.internal.zzZD5
    public final void zzZ(zzZD7 zzzd7) throws IOException {
        byte[] bArr = this.zzWHB;
        if (bArr != null) {
            zzzd7.zzV(48, bArr);
        } else {
            super.zzXL2().zzZ(zzzd7);
        }
    }

    @Override // com.aspose.words.internal.zzZD4
    public final synchronized zzZDK zzg6(int i) {
        try {
            if (this.zzWHB != null) {
                zz0P();
            }
        } catch (Throwable th) {
            throw th;
        }
        return super.zzg6(i);
    }
}
