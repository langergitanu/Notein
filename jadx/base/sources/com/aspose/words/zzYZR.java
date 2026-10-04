package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYZR extends zzZ13 {
    private Shape zzZ2R;

    public zzYZR(zzZ14 zzz14, OfficeMath officeMath, zzYEF zzyef, Shape shape) {
        super(zzz14, officeMath, zzyef, false);
        this.zzZ2R = shape;
    }

    @Override // com.aspose.words.zzZ13
    public final boolean zzYGs() {
        return false;
    }

    @Override // com.aspose.words.zzZ13
    public final void zzYHg() throws Exception {
        zzYGn().zzX((com.aspose.words.internal.zzZL) this.zzZ2R.getShapeRenderer().zzyv());
        zzI(new com.aspose.words.internal.zzZQ4(com.aspose.words.internal.zzZPY.zzG(0.0f, 0.0f), this.zzZ2R.getSize()));
        zzYp(((float) this.zzZ2R.getHeight()) - zzYG5());
        if (zzYG7()) {
            zzZ11.zzT(this);
            zzZ11.zzY(this, zzZr().getDescentPoints());
        }
        this.zzY25 = false;
    }

    @Override // com.aspose.words.zzZ13
    public final void zzZ(zzZ13 zzz13) {
        throw new UnsupportedOperationException("Text element cannot have children.");
    }
}
