package com.aspose.words;

import com.aspose.words.internal.C22244OooO0o0;

/* JADX INFO: loaded from: classes6.dex */
final class zzY0F extends zzY0I {
    private com.aspose.words.internal.zzZQ4 zzWU9;
    private boolean zzWUa;
    private com.aspose.words.internal.zzZQ4 zzWUb;
    private float zzWUc;
    private com.aspose.words.internal.zzH zzZdO;

    private boolean zzM(com.aspose.words.internal.zzP5 zzp5) throws Exception {
        long[] jArr = new long[3];
        for (int i = 0; i < 3; i++) {
            jArr[i] = com.aspose.words.internal.zzP1.zzZ(zzp5, i * 0.5f * this.zzWUc);
        }
        return com.aspose.words.internal.zzJ6.zzT(jArr);
    }

    @Override // com.aspose.words.zzY0I
    public final long zzXb(long j) throws Exception {
        float fIntBitsToFloat;
        float fZzYC;
        float fZzZo;
        com.aspose.words.internal.zzP5 zzp5 = this.zzZ3Q[0];
        float width = this.zzWUc / this.zzZ3N.getWidth();
        long jZzG = com.aspose.words.internal.zzZPY.zzG(C22244OooO0o0.OooO00o(this.zzWU9, 2.0f, this.zzWU9.zzZm()), (this.zzWU9.getHeight() / 2.0f) + this.zzWU9.zzZo());
        if (width > 1.0f && !this.zzWUk) {
            jZzG = com.aspose.words.internal.zzZPY.zzG(Float.intBitsToFloat((int) jZzG) - (this.zzZ3N.zzZm() - ((this.zzZ3N.zzZm() - this.zzWUb.zzZm()) * ((this.zzWUc - this.zzZ3N.getWidth()) / (this.zzWUb.getWidth() - this.zzZ3N.getWidth())))), com.aspose.words.internal.zzZPY.zzYC(jZzG));
            width = 1.0f;
        }
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) jZzG) * width;
        float f = this.zzWUc;
        float f2 = fIntBitsToFloat2 / f;
        int i = f2 < 0.999f ? 1 : -1;
        long jZzZ = com.aspose.words.internal.zzP1.zzZ(zzp5, f * f2);
        float f3 = i;
        long jZzZ2 = com.aspose.words.internal.zzP1.zzZ(zzp5, ((0.001f * f3) + f2) * this.zzWUc);
        float fZzYC2 = (com.aspose.words.internal.zzZPY.zzYC(jZzZ) - com.aspose.words.internal.zzZPY.zzYC(jZzZ2)) * f3;
        int i2 = (int) jZzZ;
        int i3 = (int) jZzZ2;
        float fZzZK = (float) com.aspose.words.internal.zzAN.zzZK(Math.atan(fZzYC2 / (Float.intBitsToFloat(i2) - Float.intBitsToFloat(i3))));
        if ((Float.intBitsToFloat(i2) - Float.intBitsToFloat(i3)) * f3 > 0.0f) {
            fZzZK -= 180.0f;
        }
        com.aspose.words.internal.zzP9 zzp9 = new com.aspose.words.internal.zzP9();
        zzp9.zzY(-C22244OooO0o0.OooO00o(this.zzWU9, 2.0f, this.zzWU9.zzZm()), -((this.zzZ3N.getHeight() / 2.0f) + this.zzZ3N.zzZo()), 1);
        if (this.zzWUk) {
            zzp9.zzZ(width, width, 1);
            zzp9.zzY(0.0f, (this.zzZ3N.getHeight() / 2.0f) * width, 1);
            fIntBitsToFloat = Float.intBitsToFloat(i2);
            fZzYC = com.aspose.words.internal.zzZPY.zzYC(jZzZ);
            fZzZo = (this.zzZ3N.getHeight() / 2.0f) * width;
        } else {
            float f4 = width * 0.8f;
            zzp9.zzZ(f4, f4, 1);
            zzp9.zzY(0.0f, (this.zzZ3N.getHeight() / 2.0f) + this.zzZ3N.zzZo(), 1);
            fIntBitsToFloat = Float.intBitsToFloat(i2);
            fZzYC = com.aspose.words.internal.zzZPY.zzYC(jZzZ);
            fZzZo = this.zzWUa ? this.zzZ3N.zzZo() : this.zzZ3N.zzZn();
        }
        zzp9.zzY(fIntBitsToFloat, fZzYC - fZzZo, 1);
        zzp9.zzZ(fZzZK, jZzZ, 1);
        return zzp9.zzR(j);
    }

    @Override // com.aspose.words.zzY0I, com.aspose.words.internal.zz6
    public final void zzZ(com.aspose.words.internal.zzZG zzzg) throws Exception {
        this.zzWU9 = this.zzZdO.zzZ((com.aspose.words.internal.zzZL) zzzg);
        super.zzZ(zzzg);
    }

    @Override // com.aspose.words.zzY0I
    public final void zzZzf() throws Exception {
        super.zzZzf();
        this.zzWUc = this.zzWUl[0];
        this.zzZdO = new com.aspose.words.internal.zzH();
        this.zzWUb = com.aspose.words.internal.zzP6.zzV(this.zzZ3Q[0]);
        this.zzWUa = zzM(this.zzZ3Q[0]);
    }
}
