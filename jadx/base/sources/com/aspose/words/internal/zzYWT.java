package com.aspose.words.internal;

import java.io.ByteArrayOutputStream;

/* JADX INFO: loaded from: classes5.dex */
final class zzYWT implements zzYUX {
    private ByteArrayOutputStream zzWeP = new ByteArrayOutputStream();

    @Override // com.aspose.words.internal.zzYUX
    public final int doFinal(byte[] bArr, int i) {
        byte[] byteArray = this.zzWeP.toByteArray();
        System.arraycopy(byteArray, 0, bArr, i, byteArray.length);
        this.zzWeP.reset();
        return byteArray.length;
    }

    @Override // com.aspose.words.internal.zzYUX
    public final void reset() {
        this.zzWeP.reset();
    }

    @Override // com.aspose.words.internal.zzYUX
    public final void update(byte b) {
        this.zzWeP.write(b);
    }

    @Override // com.aspose.words.internal.zzYUX
    public final int zzQI() {
        return this.zzWeP.size();
    }

    @Override // com.aspose.words.internal.zzYUX
    public final int zzXE6() {
        return -1;
    }

    @Override // com.aspose.words.internal.zzYUX
    public final String zzXGi() {
        return "NULL";
    }

    @Override // com.aspose.words.internal.zzYUX
    public final void update(byte[] bArr, int i, int i2) {
        this.zzWeP.write(bArr, i, i2);
    }
}
