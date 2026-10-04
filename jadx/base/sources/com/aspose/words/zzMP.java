package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zzMP {
    private boolean zzZp7;
    private boolean zzZp8;
    private zzL2 zzZp9;

    public zzMP(zzL4 zzl4) {
        this.zzZp9 = new zzL2(zzl4);
        zzZVA();
    }

    private boolean zzZ(zzL2 zzl2) {
        return this.zzZp9.zzZ(zzl2);
    }

    private void zzZVA() {
        this.zzZp8 = true;
        for (zzL4 zzl4 : this.zzZp9) {
            if (this.zzZp8 && !zzl4.zzP(zzL4.zzZnn)) {
                this.zzZp8 = false;
            }
        }
        this.zzZp7 = this.zzZp9.getCount() == 1 && this.zzZp9.zzMl(0).zzP(zzL4.zzZnm);
    }

    public boolean equals(Object obj) {
        if (obj instanceof zzL4) {
            return zzP((zzL4) obj);
        }
        if (obj instanceof zzMP) {
            return zzX((zzMP) obj);
        }
        if (obj instanceof zzL2) {
            return zzZ((zzL2) obj);
        }
        if (obj instanceof zzL4[]) {
            return zzZ((zzL4[]) obj);
        }
        return false;
    }

    public final int getCount() {
        return this.zzZp9.getCount();
    }

    public int hashCode() {
        return this.zzZp9.hashCode();
    }

    public void zzF(StringBuilder sb) {
        for (int i = 0; i < this.zzZp9.getCount(); i++) {
            if (i != 0) {
                sb.append(ControlChar.SPACE_CHAR);
            }
            this.zzZp9.zzMl(i).zzG(sb);
        }
    }

    public final void zzG(StringBuilder sb) {
        if (this.zzZp8) {
            zzL4.zzZnn.zzG(sb);
        } else {
            zzF(sb);
        }
    }

    public final zzL4 zzMl(int i) {
        return this.zzZp9.zzMl(i);
    }

    public final boolean zzO(zzL4 zzl4) {
        return this.zzZp9.zzO(zzl4);
    }

    public final boolean zzP(zzL4 zzl4) {
        return this.zzZp9.getCount() == 1 && this.zzZp9.zzMl(0).zzP(zzl4);
    }

    public final boolean zzX(zzMP zzmp) {
        if (com.aspose.words.internal.zzZKO.zzA(null, zzmp)) {
            return false;
        }
        if (com.aspose.words.internal.zzZKO.zzA(this, zzmp)) {
            return true;
        }
        return this.zzZp9.zzZ(zzmp.zzZp9);
    }

    public final zzL4 zzZVx() {
        return this.zzZp9.zzMl(0);
    }

    public final boolean zzZVy() {
        return this.zzZp7;
    }

    public final boolean zzZVz() {
        return this.zzZp8;
    }

    public final String zzZXu() {
        StringBuilder sb = new StringBuilder();
        zzG(sb);
        return sb.toString();
    }

    private boolean zzZ(zzL4... zzl4Arr) {
        return this.zzZp9.zzZ(zzl4Arr);
    }

    public zzMP(zzL2 zzl2) {
        zzl2.getCount();
        this.zzZp9 = new zzL2(zzl2);
        zzZVA();
    }

    public zzMP(zzMP zzmp) {
        this.zzZp9 = new zzL2(zzmp.zzZp9.getCount());
        for (int i = 0; i < zzmp.zzZp9.getCount(); i++) {
            this.zzZp9.zzI(zzmp.zzMl(i));
        }
        zzZVA();
    }
}
