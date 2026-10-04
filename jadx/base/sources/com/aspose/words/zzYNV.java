package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYNV extends zzZS6 {
    private com.aspose.words.internal.zzZYG<Object> zzXIo;
    private IWarningCallback zzZG0;

    public zzYNV(zzZS8 zzzs8, com.aspose.words.internal.zzZYG<Object> zzzyg, IWarningCallback iWarningCallback) {
        super(zzzs8, 1);
        this.zzXIo = zzzyg;
        this.zzZG0 = iWarningCallback;
    }

    private boolean zzYqS() {
        int shapeType = this.zzYMH.getShapeType();
        boolean z = shapeType == 73 || shapeType == 99 || shapeType == 115 || shapeType == 131 || (shapeType == 183 ? this.zzYMH.zzZhu() == 1 : shapeType == 233);
        if (z) {
            zzY1Z.zzZ(this.zzZG0, WarningType.MINOR_FORMATTING_LOSS_CATEGORY, 4, com.aspose.words.internal.zzZKN.format("Unsupported bevel \"{0}\" type for shape \"{1}\".", Integer.valueOf(this.zzYMH.zzZhu()), Integer.valueOf(this.zzYMH.getShapeType())));
        }
        return !z;
    }

    private void zzZ(zz9 zz9Var) {
        if (this.zzYMH.zzZht()) {
            int iZzZhu = this.zzYMH.zzZhu();
            if (iZzZhu != 0 && iZzZhu != 1 && iZzZhu != 3 && iZzZhu != 4) {
                zzY1Z.zzZ(this.zzZG0, WarningType.MINOR_FORMATTING_LOSS_CATEGORY, 4, "Unsupported bevel type for shape.");
            } else if (zzYqS()) {
                zz9Var.zzZ(new zzZVX(this.zzYMH, this.zzZG0, new zzVA()));
            }
        }
    }

    @Override // com.aspose.words.zzZS6
    public final zzB zzZhl() {
        return new zz9(this.zzYMH.zzZhT(), this.zzYMH.zzZhS(), this.zzYMH.getShapeType(), this.zzYMH.zzZhC());
    }

    @Override // com.aspose.words.zzZS6
    public final void zzZhm() throws Exception {
        zz9 zz9Var = (zz9) this.zzYIk;
        if (zz9Var != null) {
            if (this.zzYMH.zzZhS() > 0.0f) {
                zz9Var.zzZ(new zzZVW());
                zz9Var.zzZ(new zzZVQ());
            }
            zzZ(zz9Var);
            com.aspose.words.internal.zzQ8 zzq8ZzbE = zz9Var.zzbE();
            boolean z = zzq8ZzbE.zzQ3() || zzq8ZzbE.zzQ2();
            zzZVK zzzvk = new zzZVK(this.zzXIo, this.zzYMH.getShapeType(), this.zzYMH.zzZhu());
            zzzvk.zzZ(new zzYNU(Float.intBitsToFloat((int) this.zzYMH.zzZT()) * 2.0f, com.aspose.words.internal.zzZPY.zzYC(this.zzYMH.zzZT()) * 2.0f, this.zzYMH.zzZhr(), new zzYNS(this.zzYMH.zzZhp(), z, this.zzZG0)));
            float fZzZhS = this.zzYMH.zzZhS() + this.zzYMH.zzZhw();
            zzzvk.zzZ(this.zzYMH.zzZT(), this.zzYMH.zzZhN(), this.zzYMH.zzZhM(), this.zzYMH.zzZhL(), this.zzYMH.zzZhw());
            zzzvk.zzZ(new zzYNT(this.zzYMH, fZzZhS, z, this.zzZG0));
            this.zzp2.zzW(this.zzYIl);
        }
        super.zzZhm();
    }
}
