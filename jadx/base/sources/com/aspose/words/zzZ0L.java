package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zzZ0L extends zzZ13 {
    private int mColumnIndex;
    private boolean zzY16;
    private zzZ0M zzY17;
    private int zzY18;
    private float zzY19;
    private int[] zzY1c;

    public zzZ0L(zzZ14 zzz14, zzZ0M zzz0m, OfficeMath officeMath) {
        super(zzz14, officeMath);
        this.zzY18 = 0;
        this.zzY17 = zzz0m;
        if (officeMath.zzZsL().getMathObjectType() == 20) {
            this.zzY16 = ((zzZ06) officeMath.zzZsL()).zzYEH();
        }
    }

    private float zzW(int i, float f, float f2) {
        int iZzuU = zzuU(i);
        if (iZzuU != 2) {
            return iZzuU != 3 ? (f - f2) / 2.0f : f - f2;
        }
        return 0.0f;
    }

    @Override // com.aspose.words.zzZ13
    public void layoutChildren() throws Exception {
        for (int i = 0; i < zzQw().size(); i++) {
            zzZ13 zzz13 = zzQw().get(i);
            zzz13.zzZE4();
            this.zzY17.zzX(zzz13.getWidth(), zzz13.zzYGo(), i);
            zzV(zzz13);
        }
    }

    public final int zzYFk() {
        return this.zzY18;
    }

    public final zzZ0M zzYFl() {
        return this.zzY17;
    }

    @Override // com.aspose.words.zzZ13
    public final boolean zzYGs() {
        return false;
    }

    @Override // com.aspose.words.zzZ13
    public final void zzYHg() throws Exception {
        float fMax = 0.0f;
        if (this.zzY16) {
            for (int i = 0; i < zzQw().size(); i++) {
                fMax = Math.max(fMax, this.zzY17.zzuH(i));
            }
        }
        for (int i2 = 0; i2 < zzQw().size(); i2++) {
            zzZ13 zzz13 = zzQw().get(i2);
            zzYGn().zzX((com.aspose.words.internal.zzZL) zzz13.zzYGn());
            float fZzuH = this.zzY17.zzuH(i2);
            float fZzW = this.zzY16 ? zzW(i2, fMax, fZzuH) : zzZ(i2, zzz13);
            float fZzYGq = zzYGq() - zzz13.zzYGq();
            if (zzz13.zzYGn().zzZO() == null) {
                com.aspose.words.internal.OooO0O0.OooO00o(zzz13.zzYGn());
            }
            zzz13.zzYGn().zzZO().zzY(fZzW, fZzYGq, 1);
            this.zzY19 += fZzuH;
            if (i2 < zzQw().size() - 1) {
                this.zzY19 += this.zzY17.zzYFo();
            }
        }
        float x = zzZj().getX();
        float y = zzZj().getY();
        if (!this.zzY16) {
            fMax = this.zzY19;
        }
        zzI(new com.aspose.words.internal.zzZQ4(x, y, fMax, zzZj().getHeight()));
        zzYGB();
    }

    @Override // com.aspose.words.zzZ13
    public final void zzZ(zzZ13 zzz13) {
        if (this.mColumnIndex >= this.zzY17.getColumnsCount()) {
            throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: Cannot add column at this index");
        }
        super.zzZ(zzz13);
        this.mColumnIndex++;
    }

    public final void zzuF(int i) {
        this.zzY18 = i;
    }

    public int zzuU(int i) {
        int[] iArr = this.zzY1c;
        if (iArr != null && iArr.length > i) {
            return iArr[i];
        }
        int i2 = this.zzY18;
        if (i2 != 0) {
            return i2;
        }
        if (this.zzY17.zzYFm().length > i) {
            return this.zzY17.zzYFm()[i];
        }
        return 0;
    }

    public float zzZ(int i, zzZ13 zzz13) {
        return zzZ(zzuU(i), zzz13, this.zzY17.zzuH(i), i);
    }

    private float zzZ(int i, zzZ13 zzz13, float f, int i2) {
        float fZzYGo;
        if (i == 1) {
            return ((f / 2.0f) + this.zzY19) - (zzz13.getWidth() / 2.0f);
        }
        if (i == 2) {
            return this.zzY19;
        }
        if (i != 3) {
            float fZzuG = this.zzY17.zzuG(i2);
            if (Float.isNaN(zzz13.zzYGo())) {
                fZzYGo = zzz13.zzZj().getWidth() / 2.0f;
            } else {
                fZzYGo = zzz13.zzYGo();
            }
            return (this.zzY19 + fZzuG) - fZzYGo;
        }
        return (this.zzY19 + f) - zzz13.getWidth();
    }
}
