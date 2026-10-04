package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzDN extends zzDR {
    public zzDN(zzDZ zzdz, zzED zzed, zzHS zzhs, int i) {
        super(zzdz, zzed, zzhs, i);
    }

    private static zzDY zzW(zzDX zzdx, zzDX zzdx2) {
        zzDY zzdyZzDl = zzdx.zzDl();
        zzDY zzdyZzDl2 = zzdx2.zzDl();
        if (zzdyZzDl.zzZo() > zzdyZzDl2.zzZo()) {
            return zzdyZzDl;
        }
        if (zzdyZzDl.zzZo() < zzdyZzDl2.zzZo()) {
            return zzdyZzDl2;
        }
        float fMin = Math.min(zzdyZzDl.zzZm(), zzdyZzDl2.zzZm());
        return new zzDY(fMin, zzdyZzDl.zzZo(), Math.max(zzdyZzDl.zzZm() + zzdyZzDl.getLength(), zzdyZzDl2.zzZm() + zzdyZzDl2.getLength()) - fMin, false);
    }

    private static zzDY zzX(zzDX zzdx, zzDX zzdx2) {
        zzDY zzdyZzDn = zzdx.zzDn();
        zzDY zzdyZzDn2 = zzdx2.zzDn();
        if (zzdyZzDn.zzZo() < zzdyZzDn2.zzZo()) {
            return zzdyZzDn;
        }
        if (zzdyZzDn.zzZo() > zzdyZzDn2.zzZo()) {
            return zzdyZzDn2;
        }
        float fMin = Math.min(zzdyZzDn.zzZm(), zzdyZzDn2.zzZm());
        return new zzDY(fMin, zzdyZzDn.zzZo(), Math.max(zzdyZzDn.zzZm() + zzdyZzDn.getLength(), zzdyZzDn2.zzZm() + zzdyZzDn2.getLength()) - fMin, false);
    }

    private static zzDY zzY(zzDX zzdx, zzDX zzdx2) {
        zzDY zzdyZzDm = zzdx.zzDm();
        zzDY zzdyZzDm2 = zzdx2.zzDm();
        if (zzdyZzDm.zzZm() > zzdyZzDm2.zzZm()) {
            return zzdyZzDm;
        }
        if (zzdyZzDm.zzZm() < zzdyZzDm2.zzZm()) {
            return zzdyZzDm2;
        }
        float fMin = Math.min(zzdyZzDm.zzZo(), zzdyZzDm2.zzZo());
        return new zzDY(zzdyZzDm.zzZm(), fMin, Math.max(zzdyZzDm.zzZo() + zzdyZzDm.getLength(), zzdyZzDm2.zzZo() + zzdyZzDm2.getLength()) - fMin, true);
    }

    private static zz0Q zzZ(zzDY zzdy, zzDY zzdy2, zzDY zzdy3, zzDY zzdy4) {
        zz0Q zz0q = new zz0Q(8);
        long jZzG = zzZPY.zzG(zzdy.zzZm(), zzdy.zzZo());
        long jZzG2 = zzZPY.zzG(zzdy.zzZm() + zzdy.getLength(), zzdy.zzZo());
        zz0q.add(jZzG);
        zz0q.add(jZzG2);
        long jZzG3 = zzZPY.zzG(zzdy2.zzZm(), zzdy2.zzZo());
        if (!zzZPY.zzD(jZzG3, jZzG2)) {
            zz0q.add(jZzG3);
        }
        long jZzG4 = zzZPY.zzG(zzdy2.zzZm(), zzdy2.zzZo() + zzdy2.getLength());
        zz0q.add(jZzG4);
        long jZzG5 = zzZPY.zzG(zzdy3.zzZm() + zzdy3.getLength(), zzdy3.zzZo());
        if (!zzZPY.zzD(jZzG5, jZzG4)) {
            zz0q.add(jZzG5);
        }
        long jZzG6 = zzZPY.zzG(zzdy3.zzZm(), zzdy3.zzZo());
        zz0q.add(jZzG6);
        long jZzG7 = zzZPY.zzG(zzdy4.zzZm(), zzdy4.zzZo() + zzdy4.getLength());
        if (!zzZPY.zzD(jZzG7, jZzG6)) {
            zz0q.add(jZzG7);
        }
        long jZzG8 = zzZPY.zzG(zzdy4.zzZm(), zzdy4.zzZo());
        if (zzdy4.zzZm() == zzdy.zzZm() && zzdy4.zzZo() == zzdy.zzZo()) {
            return zz0q;
        }
        zz0q.add(jZzG8);
        return zz0q;
    }

    @Override // com.aspose.words.internal.zzDR
    public final zzZG zzDw() {
        this.zzvq.moveNext();
        long jZzDc = zzDc();
        long jZzDs = this.zzvq.zzDs();
        int i = (int) jZzDc;
        OooO00o.OooO00o(zzDb(), zzP5.zzK(new zzZQ4(Float.intBitsToFloat((int) jZzDs) - (Float.intBitsToFloat(i) / 2.0f), zzZPY.zzYC(jZzDs) - (zzZPW.zzYz(jZzDc) / 2.0f), Float.intBitsToFloat(i), zzZPW.zzYz(jZzDc))));
        return zzDb();
    }

    @Override // com.aspose.words.internal.zzDR
    public final zzZG zzDx() {
        this.zzvq.moveNext();
        long jZzDs = this.zzvq.zzDs();
        long jZzDc = zzDc();
        while (this.zzvq.moveNext()) {
            long jZzDs2 = this.zzvq.zzDs();
            long jZzDc2 = zzDc();
            zzDX zzdxZzX = zzX(jZzDs, Float.intBitsToFloat((int) jZzDc), zzZPW.zzYz(jZzDc));
            zzDX zzdxZzX2 = zzX(jZzDs2, Float.intBitsToFloat((int) jZzDc2), zzZPW.zzYz(jZzDc2));
            zzZQG.zzZ(zzDb().zzZ0().zzO7(), zzP5.zzX(zzZ(zzX(zzdxZzX, zzdxZzX2), zzY(zzdxZzX, zzdxZzX2), zzW(zzdxZzX, zzdxZzX2), zzZ(zzdxZzX, zzdxZzX2)), false, true));
            jZzDs = jZzDs2;
            jZzDc = jZzDc2;
        }
        return this.zzvq.getCount() == 2 ? zzDb() : zzDa();
    }

    private static zzDX zzX(long j, float f, float f2) {
        float f3 = f / 2.0f;
        float f4 = f2 / 2.0f;
        int i = (int) j;
        zzDY zzdy = new zzDY(Float.intBitsToFloat(i) - f3, zzZPY.zzYC(j) - f4, f, false);
        return new zzDX(new zzDY(zzdy.zzZm(), zzdy.zzZo(), f2, true), zzdy, new zzDY(Float.intBitsToFloat(i) + f3, zzdy.zzZo(), f2, true), new zzDY(zzdy.zzZm(), zzZPY.zzYC(j) + f4, f, false));
    }

    private static zzDY zzZ(zzDX zzdx, zzDX zzdx2) {
        zzDY zzdyZzDo = zzdx.zzDo();
        zzDY zzdyZzDo2 = zzdx2.zzDo();
        if (zzdyZzDo.zzZm() < zzdyZzDo2.zzZm()) {
            return zzdyZzDo;
        }
        if (zzdyZzDo.zzZm() > zzdyZzDo2.zzZm()) {
            return zzdyZzDo2;
        }
        float fMin = Math.min(zzdyZzDo.zzZo(), zzdyZzDo2.zzZo());
        return new zzDY(zzdyZzDo.zzZm(), fMin, Math.max(zzdyZzDo.zzZo() + zzdyZzDo.getLength(), zzdyZzDo2.zzZo() + zzdyZzDo2.getLength()) - fMin, true);
    }
}
