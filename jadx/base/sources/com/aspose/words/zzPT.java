package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzPT {
    private boolean zzZqp;
    private zzMP zzZqq;

    public zzPT(zzMP zzmp, boolean z) {
        this.zzZqq = zzmp;
        this.zzZqp = z;
    }

    public boolean equals(Object obj) {
        if (com.aspose.words.internal.zzZKO.zzA(null, obj)) {
            return false;
        }
        if (com.aspose.words.internal.zzZKO.zzA(this, obj)) {
            return true;
        }
        return obj.getClass() == getClass() && zzZ((zzPT) obj);
    }

    public int hashCode() {
        return (com.aspose.words.internal.zzZKP.zzYY(this.zzZqp) * 397) ^ this.zzZqq.hashCode();
    }

    public final void zzG(StringBuilder sb) {
        com.aspose.words.internal.zzZNH.zzU(sb, zzZWo());
        sb.append(':');
        this.zzZqq.zzG(sb);
        if (this.zzZqp) {
            com.aspose.words.internal.zzZNH.zzU(sb, " !important");
        }
    }

    public final boolean zzMt(int i) {
        return this.zzZqq.getCount() == 1 && this.zzZqq.zzZVx().getValueType() == i;
    }

    public final boolean zzZ(zzPT zzpt) {
        return zzpt != null && this.zzZqp == zzpt.zzZqp && this.zzZqq.zzX(zzpt.zzZqq);
    }

    public final boolean zzZWi() {
        return this.zzZqp;
    }

    public final zzMP zzZWj() {
        return this.zzZqq;
    }

    public abstract String zzZWo();
}
