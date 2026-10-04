package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zz60 extends zz6 implements zzH2 {
    private zzZQC<zz7> zzYA = new zzZQC<>();
    private zzZQC<zzP9> zzZz;
    private zz62 zzl1;
    private zzA2 zzzk;

    private zz60(zz62 zz62Var) {
        zzZQC<zzP9> zzzqc = new zzZQC<>();
        this.zzZz = zzzqc;
        this.zzl1 = zz62Var;
        zzzqc.push(new zzP9());
        this.zzYA.push(new zzG());
        this.zzzk = new zzA2(this.zzl1.zzwy());
    }

    private static float zz8(float f) {
        if (f > 32767.0f) {
            return 32767.0f;
        }
        if (f < -32768.0f) {
            return -32768.0f;
        }
        return f;
    }

    private boolean zzJ(zzZG zzzg) throws Exception {
        zzOG zzog = (zzOG) zzZKW.zzZ(zzzg.zzZ1(), zzOG.class);
        if (zzog != null && zzog.zzNb() != null && !zzog.zzNb().isIdentity()) {
            if (this.zzl1.getRasterizeTransformedElements()) {
                zzZ(zzzg, new zzH().zzZ((zzZL) zzzg), zzzg.zzZ0().zzO8(), false);
                return true;
            }
            zzwv();
        }
        return false;
    }

    private void zzR(zzZP zzzp) throws Exception {
        long[] jArrZzN = zzZH().zzN(zzzp.zzZj());
        zzZ(zzzp, zzJ6.zzU(jArrZzN), zzP8.zzY(jArrZzN, false, true), true);
    }

    private void zzV(zzP9 zzp9) {
        zzP9 zzp9ZzOh = zzZH().zzOh();
        if (zzp9 != null) {
            zzp9ZzOh.zzZ(zzp9, 0);
        }
        this.zzZz.push(zzp9ZzOh);
    }

    private void zzW(zzG zzg) {
        zzV(zzg.zzZO());
        zzG zzg2 = new zzG();
        zzg2.zzZ(zzX(zzg.zzZN()));
        zzZ4().zzX(zzg2);
        this.zzYA.push(zzg2);
    }

    private zzP8 zzX(zzP8 zzp8) {
        if (zzp8 == null) {
            return null;
        }
        zzP8 zzp8ZzO8 = zzp8.zzO8();
        zzp8ZzO8.zzY(zzZH());
        return zzp8ZzO8;
    }

    private zz7 zzZ4() {
        return this.zzYA.peek();
    }

    private static long zzZ8(long j) {
        return zzZPY.zzG(zz8(Float.intBitsToFloat((int) j)), zz8(zzZPY.zzYC(j)));
    }

    private static long zzZ9(long j) {
        return zzZPW.zzG(zz8(Float.intBitsToFloat((int) j)), zz8(zzZPW.zzYz(j)));
    }

    private zzP9 zzZH() {
        return this.zzZz.peek();
    }

    private void zzZI() {
        this.zzYA.pop();
        this.zzZz.pop();
    }

    private void zzZR() {
        this.zzZz.pop();
    }

    private void zzwv() {
        this.zzl1.zzI().zzZ(2, 13, "Element with complex transformation has not been rasterized. Rendering may be incorrect.");
    }

    @Override // com.aspose.words.internal.zzH2
    public final boolean zzY(zzP5 zzp5) {
        return true;
    }

    @Override // com.aspose.words.internal.zzH2
    public final boolean zzZ(zzP5 zzp5) {
        return true;
    }

    public static zzZL zzZ(zzZL zzzl, zz62 zz62Var) throws Exception {
        zz60 zz60Var = new zz60(zz62Var);
        zzzl.zzZ(zz60Var);
        return zz60Var.zzZ4();
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzY(zzG zzg) {
        zzZI();
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(zzZH zzzh) {
        zzZH zzzh2 = new zzZH(zzzh.getSize(), zzzh.getPaperTray(), zzzh.zzZ3());
        this.zzYA.clear();
        this.zzYA.push(zzzh2);
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(zzG zzg) {
        zzW(zzg);
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(zzZG zzzg) throws Exception {
        zzV(zzzg.zzZO());
        zzZG zzzgZzYZ = zzzg.zzYZ();
        zzzgZzYZ.zzW((zzP9) null);
        zzzgZzYZ.zzZ(zzX(zzzgZzYZ.zzZN()));
        zzzgZzYZ.zzY(zzZH());
        zzzgZzYZ.zzZ0().zzY(this);
        if (!zzJ(zzzgZzYZ)) {
            zzZ4().zzX(zzzgZzYZ);
        }
        zzZR();
    }

    @Override // com.aspose.words.internal.zzH2
    public final boolean zzZ(zzOS zzos) {
        for (int i = 0; i < zzos.zzNu().getCount(); i++) {
            zzos.zzNu().set(i, zzZ8(zzos.zzNu().get(i)));
        }
        return true;
    }

    @Override // com.aspose.words.internal.zzH2
    public final boolean zzZ(zzPZ zzpz) {
        zzpz.zzx(zzZ8(zzpz.zzPL()));
        zzpz.zzw(zzZ8(zzpz.zzPK()));
        zzpz.zzy(zzZ8(zzpz.zzPX()));
        zzpz.zzv(zzZ8(zzpz.zzPW()));
        return true;
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(zzZP zzzp) throws Exception {
        if (zzZO.zzZ(zzzp, this, this.zzzk, zzZH()) == null) {
            return;
        }
        boolean z = zzAN.zzf(zzZH().zzOe()) && zzAN.zzf(zzZH().zzOd());
        if (!z && this.zzl1.getRasterizeTransformedElements()) {
            zzR(zzzp);
            return;
        }
        if (!z) {
            zzwv();
        }
        zzZ(zzzp, z);
    }

    private void zzZ(zzZL zzzl, zzZQ4 zzzq4, zzP8 zzp8, boolean z) throws Exception {
        zzG zzg = new zzG();
        zzg.zzW(z ? zzZH().zzOh() : new zzP9());
        zzg.zzZO().zzY(-zzzq4.getX(), -zzzq4.getY(), 1);
        zzg.zzX(zzzl);
        zzZ(zzg, zzzq4, zzp8);
    }

    private void zzZ(zzZL zzzl, zzZQ4 zzzq4, zzP8 zzp8) throws Exception {
        byte[] bArrZzWy;
        zzXN zzxn;
        try {
            zzxn = new zzXN(zzAN.zzZG(zzSA.pointToPixel(zzzq4.getWidth())), zzAN.zzZG(zzSA.pointToPixel(zzzq4.getHeight())));
        } catch (Exception unused) {
            bArrZzWy = null;
        }
        try {
            zzIY zziy = new zzIY(zzxn);
            try {
                zzIY.zzGJ();
                new zzJ8(this.zzl1.zzwx()).zzZ(zzzl, zziy);
                zziy.dispose();
                zzZOR zzzor = new zzZOR();
                try {
                    zzxn.zzY(zzzor, 100);
                    bArrZzWy = zzzor.zzWy();
                    zzxn.dispose();
                    byte[] bArr = bArrZzWy;
                    if (bArr == null) {
                        return;
                    }
                    zzZP zzzp = new zzZP(zzzq4.zzZE(), zzzq4.getSize(), bArr);
                    zzG zzg = new zzG();
                    zzg.zzZ(zzp8);
                    zzg.zzX(zzzp);
                    zzZ4().zzX(zzg);
                } finally {
                    zzzor.close();
                }
            } catch (Throwable th) {
                zziy.dispose();
                throw th;
            }
        } catch (Throwable th2) {
            zzxn.dispose();
            throw th2;
        }
    }

    private void zzZ(zzZP zzzp, boolean z) {
        zzZQ4 zzzq4ZzO = zzZH().zzO(zzzp.zzZj());
        zzZ4().zzX(new zzZP(zzZ8(zzzq4ZzO.zzZE()), zzZ9(z ? zzzq4ZzO.getSize() : zzzp.zzZj().getSize()), zzzp.getImageBytes(), zzzp.zzZd()));
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(zzZU zzzu) {
        if (zzzu.isHidden()) {
            return;
        }
        zzV(zzzu.zzZO());
        zzZU zzzu2 = (zzZU) zzzu.zz1();
        zzzu2.zzW(zzZH().zzOh());
        zzZ4().zzX(zzzu2);
        zzZR();
    }
}
