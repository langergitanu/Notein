package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zz1K implements Cloneable {
    private zz5U zzYYm;
    private zz7O zzYYn;
    private zz7U zzYYo;
    private zz8A zzYYp;

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public final boolean isEmpty() {
        zz8A zz8a = this.zzYYp;
        if (zz8a != null && !zz8a.isEmpty()) {
            return false;
        }
        zz7U zz7u = this.zzYYo;
        if (zz7u != null && !zz7u.isEmpty()) {
            return false;
        }
        zz7O zz7o = this.zzYYn;
        if (zz7o != null && !zz7o.isEmpty()) {
            return false;
        }
        zz5U zz5u = this.zzYYm;
        return zz5u == null || zz5u.isEmpty();
    }

    public final zz4G zzR(zzGR zzgr) throws Exception {
        return zzZu4().zzR(zzgr);
    }

    public final zz7X zzW(zzGR zzgr) throws Exception {
        return zzZu6().zzW(zzgr);
    }

    public final zzZV0 zzX(zzZ90 zzz90) {
        return zzZu7().zzX(zzz90);
    }

    public final void zzZ(zz8A zz8a) {
        this.zzYYp = zz8a;
    }

    public final zz5U zzZu4() {
        if (this.zzYYm == null) {
            this.zzYYm = new zz5U();
        }
        return this.zzYYm;
    }

    public final zz7O zzZu5() {
        if (this.zzYYn == null) {
            this.zzYYn = new zz7O();
        }
        return this.zzYYn;
    }

    public final zz7U zzZu6() {
        if (this.zzYYo == null) {
            this.zzYYo = new zz7U();
        }
        return this.zzYYo;
    }

    public final zz8A zzZu7() {
        if (this.zzYYp == null) {
            this.zzYYp = new zz8A();
        }
        return this.zzYYp;
    }

    public final zz1K zzZu8() {
        if (isEmpty()) {
            return new zz1K();
        }
        zz1K zz1k = (zz1K) memberwiseClone();
        zz8A zz8a = this.zzYYp;
        if (zz8a != null) {
            zz1k.zzYYp = (zz8A) zz8a.zzZM2();
        }
        zz7U zz7u = this.zzYYo;
        if (zz7u != null) {
            zz1k.zzYYo = (zz7U) zz7u.zzZM2();
        }
        zz7O zz7o = this.zzYYn;
        if (zz7o != null) {
            zz1k.zzYYn = (zz7O) zz7o.zzZM2();
        }
        zz5U zz5u = this.zzYYm;
        if (zz5u != null) {
            zz1k.zzYYm = (zz5U) zz5u.zzZM2();
        }
        return zz1k;
    }

    public final void zzZ(zz7U zz7u) {
        this.zzYYo = zz7u;
    }

    public final void zzZ(zz7O zz7o) {
        this.zzYYn = zz7o;
    }

    public final void zzZ(zz5U zz5u) {
        this.zzYYm = zz5u;
    }
}
