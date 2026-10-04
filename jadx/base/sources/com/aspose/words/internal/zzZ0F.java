package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
class zzZ0F implements zzZ5F {
    private final byte[] data;
    private final boolean zzWcD = true;

    public zzZ0F(byte[] bArr) {
        this.data = bArr;
    }

    @Override // com.aspose.words.internal.zzZ5F
    public final zzZ5G zzg0(final int i) {
        return new zzZ5G() { // from class: com.aspose.words.internal.zzZ0F.1
            int index = 0;

            @Override // com.aspose.words.internal.zzZ5G
            public final int zzXGW() {
                return i;
            }

            @Override // com.aspose.words.internal.zzZ5G
            public final byte[] zzXGX() {
                int i2 = (i + 7) / 8;
                byte[] bArr = new byte[i2];
                System.arraycopy(zzZ0F.this.data, this.index, bArr, 0, i2);
                this.index = ((i + 7) / 8) + this.index;
                return bArr;
            }
        };
    }
}
