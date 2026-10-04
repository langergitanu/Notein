package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZ9 extends zz5 {
    private zzZQC<zzP9> zzY7;

    public zzZ9() {
        zzZQC<zzP9> zzzqc = new zzZQC<>();
        this.zzY7 = zzzqc;
        zzzqc.push(new zzP9());
    }

    private void zzS(zzP9 zzp9) {
        if (zzP9.zzO(zzp9)) {
            return;
        }
        this.zzY7.pop();
    }

    private void zzV(zzP9 zzp9) {
        if (zzP9.zzO(zzp9)) {
            return;
        }
        zzP9 zzp9ZzOh = zzYP().zzOh();
        zzp9ZzOh.zzZ(zzp9, 0);
        this.zzY7.push(zzp9ZzOh);
    }

    public final zzP9 zzR(zzP9 zzp9) {
        if (zzp9 == null) {
            return zzYP();
        }
        zzP9 zzp9ZzOh = zzYP().zzOh();
        zzp9ZzOh.zzZ(zzp9, 0);
        return zzp9ZzOh;
    }

    @Override // com.aspose.words.internal.zz5, com.aspose.words.internal.zz6
    public final void zzY(zzG zzg) throws Exception {
        zzS(zzg.zzZO());
        super.zzY(zzg);
    }

    public final zzP9 zzYP() {
        return this.zzY7.peek();
    }

    @Override // com.aspose.words.internal.zz5, com.aspose.words.internal.zz6
    public final void zzZ(zzG zzg) throws Exception {
        super.zzZ(zzg);
        zzV(zzg.zzZO());
    }
}
