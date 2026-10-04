package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzYC1 {
    private zzYC5 zzYfa;
    private com.aspose.words.internal.zzG zzYje;
    private ShapeBase zzYlM;

    public zzYC1(ShapeBase shapeBase) {
        this.zzYlM = shapeBase;
    }

    public final void zz5(com.aspose.words.internal.zzG zzg) {
        this.zzYje = zzg;
    }

    public final ShapeBase zz7u() {
        return this.zzYlM;
    }

    public final void zzX(zzYC5 zzyc5) {
        this.zzYfa = zzyc5;
    }

    public abstract com.aspose.words.internal.zzG zzY(zzYC5 zzyc5) throws Exception;

    public final zzYC5 zzY8K() {
        return this.zzYfa;
    }

    public final void zzY8L() {
        com.aspose.words.internal.zzPV zzpvZzYKP = this.zzYfa.zz7u().zzZYh().zzYKP();
        if (this.zzYfa.zz7u().getWrapType() == 0 && !zzpvZzYKP.isEmpty()) {
            com.aspose.words.internal.zzZG zzzgZzW = com.aspose.words.internal.zzZG.zzW(this.zzYfa.zz7s());
            zzzgZzW.zzY(new com.aspose.words.internal.zzOI(zzpvZzYKP));
            this.zzYje.zzZ(0, zzzgZzW);
        }
    }

    public abstract zzYC5 zzZua() throws Exception;

    public final com.aspose.words.internal.zzG zzyv() {
        return this.zzYje;
    }
}
