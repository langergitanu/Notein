package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzZ2E extends zzZ2Q {
    private final zzZ1P zzWjX;

    public zzZ2E(zzZ1P zzz1p) {
        this.zzWjX = zzz1p;
    }

    @Override // com.aspose.words.internal.zzZ2Q
    public final byte[] zzXG8() {
        int i = this.zzWk4;
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (true) {
            this.zzWk5.nextBytes(bArr);
            zzYT0.zzW0(bArr);
            if (!zzYT1.zzZU(bArr, i) || zzYT1.zzW4(bArr)) {
                break;
            }
            int i3 = i2 + 1;
            if (i2 >= 10) {
                break;
            }
            i2 = i3;
        }
        if (!zzYT1.zzZU(bArr, i) && zzYT1.zzW4(bArr)) {
            return bArr;
        }
        throw new zzZ14("Failed to generate a valid TripleDES key: " + this.zzWjX.getName());
    }

    @Override // com.aspose.words.internal.zzZ2Q
    public final void zzZ(zzYUS zzyus) {
        this.zzWk5 = zzyus.zzXCJ();
        int strength = (zzyus.getStrength() + 7) / 8;
        this.zzWk4 = strength;
        if (strength == 0 || strength == 21) {
            this.zzWk4 = 24;
            return;
        }
        if (strength == 14) {
            this.zzWk4 = 16;
        } else {
            if (strength == 24 || strength == 16) {
                return;
            }
            throw new IllegalArgumentException("Key must be 192 or 128 bits long: " + this.zzWjX.getName());
        }
    }
}
