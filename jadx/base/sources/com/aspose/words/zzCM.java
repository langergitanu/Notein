package com.aspose.words;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzCM extends zz80 implements Cloneable {
    private String zzYb;
    private zzEU zzZ9r;
    private zz11 zzZ9s;
    private String zzZ9t;
    private zzCB zzZ9u;
    private int zzZ9v = 0;

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public final String getText() {
        if (this.zzZ9s == null) {
            return zzYR();
        }
        StringBuilder sb = new StringBuilder();
        Iterator<zz4A> it = this.zzZ9s.zzMi().iterator();
        while (it.hasNext()) {
            com.aspose.words.internal.zzZNH.zzU(sb, it.next().zzZxq());
        }
        return sb.toString();
    }

    public final void zzRd(String str) {
        this.zzZ9v = 0;
        this.zzZ9t = str;
        this.zzYb = str;
        this.zzZ9u = null;
    }

    public final void zzX(zzCB zzcb) {
        this.zzZ9u = zzcb;
    }

    public final void zzY(zz11 zz11Var) {
        this.zzZ9v = 1;
        this.zzZ9s = zz11Var;
    }

    public final String zzYR() {
        if (!com.aspose.words.internal.zzZYD.zzXk(this.zzYb) && this.zzZ9u != null) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < this.zzZ9u.zzZN4().getValueCount(); i++) {
                zzCF zzcfZzKg = this.zzZ9u.zzZN4().zzKg(i);
                if (zzcfZzKg != null) {
                    com.aspose.words.internal.zzZNH.zzU(sb, zzcfZzKg.getStringValue());
                    com.aspose.words.internal.zzZNH.zzU(sb, " ");
                }
            }
            this.zzYb = com.aspose.words.internal.zzZKN.zzTX(sb.toString());
        }
        return this.zzYb;
    }

    public final void zzZ(zzEU zzeu) {
        this.zzZ9r = zzeu;
        if (zzeu != null) {
            this.zzZ9v = 0;
        }
    }

    public final float zzZGA() {
        if (zzZGt() == null || !zzZGt().zzZxp().zzZx9()) {
            return Float.NaN;
        }
        return (float) zzZGt().zzZxp().zzZHc().zzZvS().zzZsz();
    }

    public final zzCM zzZGB() {
        zzCM zzcm = (zzCM) memberwiseClone();
        zzCB zzcb = this.zzZ9u;
        if (zzcb != null) {
            zzcm.zzZ9u = zzcb.zzZG2();
        }
        zz11 zz11Var = this.zzZ9s;
        if (zz11Var != null) {
            zzcm.zzZ9s = zz11Var.zzZtM();
        }
        zzEU zzeu = this.zzZ9r;
        if (zzeu != null) {
            zzcm.zzZ9r = zzeu.zzZLO();
        }
        zzcm.setExtensions(zzZBz());
        return zzcm;
    }

    public final zz4A zzZGt() {
        zz11 zz11Var = this.zzZ9s;
        if (zz11Var == null || zz11Var.zzMi().size() <= 0 || this.zzZ9s.zzMi().get(0) == null) {
            return null;
        }
        return this.zzZ9s.zzMi().get(0);
    }

    public final boolean zzZGu() {
        return zzZGt() != null && zzZGt().zzZxp().zzZx9();
    }

    public final zzEU zzZGv() {
        return this.zzZ9r;
    }

    public final zz11 zzZGw() {
        return this.zzZ9s;
    }

    public final String zzZGx() {
        return this.zzZ9t;
    }

    public final zzCB zzZGy() {
        return this.zzZ9u;
    }

    public final int zzZGz() {
        return this.zzZ9v;
    }
}
