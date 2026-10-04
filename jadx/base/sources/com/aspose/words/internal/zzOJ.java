package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzOJ extends zzON {
    private zzZQ4 zzG1;

    public zzOJ(zzZQ4 zzzq4) {
        this.zzG1 = zzzq4;
    }

    @Override // com.aspose.words.internal.zzON
    public final zzON zzM(zzP9 zzp9) throws Exception {
        zzP8 zzp8ZzNR = zzNR();
        zzp8ZzNR.zzY(zzp9);
        return new zzOX(zzp8ZzNR);
    }

    @Override // com.aspose.words.internal.zzON
    public final zzP8 zzNR() {
        zzP8 zzp8 = new zzP8(1);
        zzZQG.zzZ(zzp8.zzO7(), zzP5.zzK(this.zzG1));
        return zzp8;
    }

    @Override // com.aspose.words.internal.zzON
    public final zzON zzNm() {
        return this;
    }

    public final zzZQ4 zzOw() {
        return this.zzG1;
    }

    @Override // com.aspose.words.internal.zzON
    public final zzON zzU(float f, float f2) {
        return new zzOJ(new zzZQ4(this.zzG1.getX() + f, this.zzG1.getY() + f2, this.zzG1.getWidth(), this.zzG1.getHeight()));
    }

    @Override // com.aspose.words.internal.zzON
    public final void zzZ(zzH1 zzh1) {
        zzh1.zzZ(this);
    }
}
