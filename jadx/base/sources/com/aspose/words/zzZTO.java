package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zzZTO extends zzZT7 {
    private zzZT6 zzYKd = new zzZT6();

    public zzZTO() {
    }

    public final int getCount() {
        return this.zzYKd.getCount();
    }

    @Override // com.aspose.words.zzZT7
    public String toString() {
        StringBuilder sb = new StringBuilder();
        com.aspose.words.internal.zzZNH.zzZ(sb, "{0} Start\n", getClass().getName());
        com.aspose.words.internal.zzZNH.zzZ(sb, "Self: {0}\n", super.toString());
        for (int i = 0; i < this.zzYKd.getCount(); i++) {
            com.aspose.words.internal.zzZNH.zzZ(sb, "{0}\n", this.zzYKd.zzEi(i).toString());
        }
        com.aspose.words.internal.zzZNH.zzZ(sb, "{0} End\n", getClass().getName());
        return sb.toString();
    }

    @Override // com.aspose.words.zzZT7
    public final void zzD(com.aspose.words.internal.zzZOX zzzox) throws Exception {
        this.zzYKd.zzZ(zzzox, zzZii().getLength(), getWarningCallback());
    }

    public final zzZT7 zzEi(int i) {
        return this.zzYKd.zzEi(i);
    }

    @Override // com.aspose.words.zzZT7
    public void zzZ(zzZSP zzzsp) throws Exception {
        this.zzYKd.zzS(zzzsp);
    }

    public final zzZT6 zzZiD() {
        return this.zzYKd;
    }

    public final zzZT7 zzn(Class cls) {
        for (int i = 0; i < this.zzYKd.getCount(); i++) {
            zzZT7 zzzt7ZzEi = this.zzYKd.zzEi(i);
            if (zzzt7ZzEi.getClass() == cls) {
                return zzzt7ZzEi;
            }
        }
        return null;
    }

    public zzZTO(int i) {
        zzZii().zzZin();
        zzZii().setType(i);
    }
}
