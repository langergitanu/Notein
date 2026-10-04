package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYZS extends zzZ13 {
    private zzZ13 zzY0u;
    private zzZ13 zzY0v;
    private zzZ18 zzY0w;
    private zzZ13 zzY0x;
    private float zzY1C;
    private float zzY1D;
    private zzZ13 zzY2r;

    public zzYZS(zzZ14 zzz14, OfficeMath officeMath) throws Exception {
        this(zzz14, officeMath, officeMath.zzZsL().getMathObjectType() == 26);
    }

    private void zzSO(boolean z) throws Exception {
        if (getIndex() > 0 || !z) {
            if (getIndex() != zzYGr().zzQw().size() - 1 || z) {
                if ((isInline() && zzZ11.zzO(this)) || zzZ11.zzN(this)) {
                    return;
                }
                zzZ13 zzz13 = zzYGr().zzQw().get(getIndex() + (z ? -1 : 1));
                if (zzZ11.zzI(zzz13)) {
                    return;
                }
                zzz13.zzZE4();
                if (!(z ? zzYGc() : zzYGd()) || zzz13.zzYGh()) {
                    if (zzz13.zzYG8().getMathObjectType() != 6 || zzz13.getHeight() >= zzZr().getLineSpacingPoints()) {
                        if (z) {
                            zzZ11.zzX(this, zzZYh().getSize() * 0.05f);
                        } else {
                            zzZ11.zzW(this, zzZYh().getSize() * 0.055f);
                        }
                    }
                }
            }
        }
    }

    private float zzYEd() throws Exception {
        return zzZr().getDescentPoints() * this.zzY1D;
    }

    private float zzYEe() throws Exception {
        return zzZr().getAscentPoints() * this.zzY1D;
    }

    private boolean zzYEf() throws Exception {
        return this.zzY2r.getHeight() < zzZr().getLineSpacingPoints();
    }

    private float zzYEg() {
        return zzYGm() * 0.075f;
    }

    private void zzYEh() throws Exception {
        if (this.zzY0u.getHeight() > this.zzY0u.zzZr().getLineSpacingPoints() * this.zzY1D && this.zzY0u.getHeight() - this.zzY0u.zzYGq() > this.zzY2r.getHeight() - this.zzY2r.zzYGq()) {
            zzYg(this.zzY0u.getHeight() - (zzYGm() * 0.138f));
        } else if (!zzZDx()) {
            zzYg((zzYEe() / 2.0f) + this.zzY0u.zzYGq() + zzYEd());
        } else {
            zzYg((this.zzY0u.zzYGq() - (zzu(this.zzY0u) + (((zzd(11) || zzd(23)) ? 0.045f : 0.0f) * zzYGm()))) + (zzYEf() ? zzYEe() / 2.0f : this.zzY2r.zzYGq() + (zzYEd() / 2.0f)));
        }
    }

    private void zzYEi() throws Exception {
        zzYg(this.zzY2r.zzYGq());
        float fZzYEd = 0.0f;
        if (this.zzY0v.zzYGq() > Math.max(zzZr().getAscentPoints() / 2.0f, this.zzY2r.zzYGq())) {
            zzYg(0.0f);
            return;
        }
        if (!zzZDx()) {
            this.zzY0w.zzYi(this.zzY2r.getHeight() / 2.0f);
            return;
        }
        if (this.zzY0v.zzYGq() > zzYEe() * 0.5f && com.aspose.words.internal.zzAN.zzR(this.zzY0v.zzYGq(), zzYEe() * 0.875f)) {
            fZzYEd = zzYEf() ? zzYEd() / 2.0f : zzYEd() / 4.0f;
        }
        float fZzYEd2 = (((zzYEd() / 2.0f) + ((zzYEe() / 2.0f) + this.zzY0v.zzYGq())) - fZzYEd) - zzZr().getDescentPoints();
        this.zzY0w.zzYi(zzYEf() ? (zzYEd() / 4.0f) + (((zzZr().getAscentPoints() / 2.0f) + this.zzY2r.zzYGq()) - fZzYEd2) : this.zzY2r.getHeight() - fZzYEd2);
    }

    private void zzYEj() throws Exception {
        float height;
        if (this.zzY0v.zzYGq() > Math.max(zzZr().getAscentPoints() / 2.0f, this.zzY2r.zzYGq())) {
            zzYf(zzYGm() * 0.11f);
            height = this.zzY0u.getHeight();
        } else {
            float fZzu = zzu(this.zzY0u);
            float fZzu2 = zzu(this.zzY0v);
            float fZzYEd = ((zzYEd() / 2.0f) + this.zzY0u.zzYGq()) - fZzu;
            float fZzYEe = (zzYEe() / 2.0f) + this.zzY0v.zzYGq();
            zzYf(zzYEf() ? (zzZr().getDescentPoints() + (zzZr().getAscentPoints() / 2.0f)) - fZzYEe : fZzu2 + (zzYEe() / 4.0f) + (((this.zzY2r.getHeight() - this.zzY0u.getHeight()) + fZzYEd) - fZzYEe));
            zzYf(Math.max(this.zzY0w.zzYFn(), zzYGm() * 0.0655f));
            height = zzYEf() ? this.zzY0u.getHeight() : this.zzY2r.zzYGq() + fZzYEd;
        }
        zzYg(height);
    }

    private void zzYf(float f) {
        this.zzY0w.zzYi(f);
    }

    private void zzYg(float f) throws Exception {
        this.zzY0w.zzYp(f);
    }

    private boolean zzZDx() {
        return zzYOL.zzi(zzYGk()) ? zze(12, 11, 24, 25) : zze(24, 25);
    }

    private float zzu(zzZ13 zzz13) throws Exception {
        return zzYGm() * ((zzz13.zzYGq() >= zzYEe() || zzz13.zzYGq() <= zzYEe() / 4.0f) ? 0.0f : 0.03f);
    }

    @Override // com.aspose.words.zzZ13
    public final void layoutChildren() throws Exception {
        this.zzY0v.zzZE4();
        this.zzY0u.zzZE4();
        if (zzYG7()) {
            zzZ11.zzW(this.zzY0x, zzZr().getLineSpacingPoints() - zzYEg(), (zzZr().zzPe() + (zzZr().getAscentPoints() / 2.0f)) - zzYEg());
        }
        this.zzY2r.zzZE4();
        if (zzZDx()) {
            this.zzY0v.scale(this.zzY1C, this.zzY1D);
            this.zzY0u.scale(this.zzY1C, this.zzY1D);
        }
        boolean zZzf = com.aspose.words.internal.zzAN.zzf(this.zzY0u.getHeight());
        boolean zZzf2 = com.aspose.words.internal.zzAN.zzf(this.zzY0v.getHeight());
        if (zZzf2 && !zZzf) {
            zzYEh();
        } else if (!zZzf || zZzf2) {
            zzYEj();
        } else {
            zzYEi();
        }
        this.zzY0w.zzZE4();
        super.layoutChildren();
    }

    @Override // com.aspose.words.zzZ13
    public final void zzYGC() throws Exception {
        zzSO(false);
    }

    @Override // com.aspose.words.zzZ13
    public final void zzYGD() throws Exception {
        zzSO(true);
    }

    @Override // com.aspose.words.zzZ13
    public final boolean zzYGs() {
        return true;
    }

    @Override // com.aspose.words.zzZ13
    public final void zzYHg() throws Exception {
        super.zzYHg();
        zzZ11.zzW(this, zzYGm() * 0.01f);
        if (zzYG7()) {
            zzZ11.zzZ(this, zzYEg());
            zzYp(zzYGq() + zzYEg());
        }
    }

    @Override // com.aspose.words.zzZ13
    public final void zzZ(zzZ13 zzz13) {
        int mathObjectType = zzz13.zzYGk().zzZsL().getMathObjectType();
        if (mathObjectType == 24) {
            this.zzY0v.zzZ(zzz13);
        } else if (mathObjectType != 25) {
            this.zzY2r.zzZ(zzz13);
        } else {
            this.zzY0u.zzZ(zzz13);
        }
    }

    private zzYZS(zzZ14 zzz14, OfficeMath officeMath, boolean z) throws Exception {
        super(zzz14, officeMath);
        this.zzY2r = new zzZ13(zzz14, officeMath);
        this.zzY0x = new zzZ13(zzz14, officeMath);
        this.zzY0w = new zzZ18(zzz14, officeMath);
        this.zzY0v = new zzZ13(zzz14, officeMath);
        zzZ13 zzz13 = new zzZ13(zzz14, officeMath);
        this.zzY0u = zzz13;
        this.zzY0w.zzZ(zzz13, 2);
        this.zzY0w.zzZ(this.zzY0v, 2);
        this.zzY1D = zzZ11.zzI(zzZr());
        this.zzY1C = zzZ11.zzH(zzZr());
        if (z) {
            super.zzZ(this.zzY0w);
        }
        super.zzZ(this.zzY2r);
        super.zzZ(this.zzY0x);
        if (z) {
            return;
        }
        super.zzZ(this.zzY0w);
    }
}
