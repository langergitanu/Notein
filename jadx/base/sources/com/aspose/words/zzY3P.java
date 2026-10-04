package com.aspose.words;

import java.io.OutputStream;

/* JADX INFO: loaded from: classes6.dex */
final class zzY3P {
    private boolean zzX0D;
    private com.aspose.words.internal.zzZOP zzX0E;
    private OutputStream zzX0F;

    public zzY3P(OutputStream outputStream, boolean z) {
        this.zzX0F = outputStream;
        this.zzX0D = z;
    }

    public final void zzXU8() throws Exception {
        if (this.zzX0F == null) {
            if (this.zzX0D) {
                return;
            }
            this.zzX0E.close();
            return;
        }
        com.aspose.words.internal.zzZOP zzzop = this.zzX0E;
        if (zzzop != null) {
            zzzop.zzH(0L);
            com.aspose.words.internal.zzZKB.zzZ(this.zzX0E, this.zzX0F);
        }
        if (this.zzX0D) {
            return;
        }
        this.zzX0F.close();
    }

    public final com.aspose.words.internal.zzZOP zzXU9() {
        if (this.zzX0F != null) {
            this.zzX0E = new com.aspose.words.internal.zzZOR();
        }
        return this.zzX0E;
    }

    public zzY3P(com.aspose.words.internal.zzZOP zzzop, boolean z) {
        this.zzX0E = zzzop;
        this.zzX0D = z;
    }
}
