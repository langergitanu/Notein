package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzZDK implements Cloneable {
    private zzZDK zzYkb;
    private zzZDK zzYkc;
    private zzZDN zzYkd;

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public final int getIndex() {
        int i = 0;
        for (zzZDK zzzdk = this.zzYkc; zzzdk != null; zzzdk = zzzdk.zzYkc) {
            i++;
        }
        return i;
    }

    public final void zzR(zzZDN zzzdn) {
        this.zzYkd = zzzdn;
    }

    public final void zzT(zzZDK zzzdk) {
        this.zzYkc = zzzdk;
    }

    public final void zzU(zzZDK zzzdk) {
        this.zzYkb = zzzdk;
    }

    public final zzZDK zzYXc() {
        return this.zzYkc;
    }

    public final zzZDK zzYXd() {
        return this.zzYkb;
    }

    public final zzZDN zzYXe() {
        return this.zzYkd;
    }

    public zzZDK zzYXi() {
        zzZDK zzzdk = (zzZDK) memberwiseClone();
        zzzdk.zzYkd = null;
        zzzdk.zzYkc = null;
        zzzdk.zzYkb = null;
        return zzzdk;
    }

    public abstract void zzZ(zzZI0 zzzi0) throws Exception;
}
