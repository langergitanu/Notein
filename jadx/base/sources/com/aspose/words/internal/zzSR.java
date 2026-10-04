package com.aspose.words.internal;

import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
abstract class zzSR extends zz0V {
    private zz0V zzPe;
    private String zzPf;

    public zzSR(zzZZR zzzzr, String str) {
        super(zzzzr);
        this.zzPf = str;
    }

    @Override // com.aspose.words.internal.zz0V
    public final boolean isComposite() {
        return true;
    }

    public final String zzSh() {
        return this.zzPf;
    }

    public final zz0V zzSi() {
        return this.zzPe;
    }

    public void zzY(zz0V zz0v) {
    }

    public final void zzZ(zz0V zz0v, zzYZ zzyz) {
        if (!zzY(zz0v, zzyz)) {
            throw new zzCW("Illegal usage of a term.");
        }
        zz0V zz0vZzsA = this.zzPe;
        if (zz0vZzsA == null) {
            this.zzPe = zz0v;
        } else {
            while (zz0vZzsA.zzsA() != null) {
                zz0vZzsA = zz0vZzsA.zzsA();
            }
            zz0vZzsA.zzW(zz0v);
        }
        zz0v.zzX(this);
        if (zzyz != null) {
            zz0v.zzZ(zzyz);
        }
        zzY(zz0v);
    }

    public boolean zzY(zz0V zz0v, zzYZ zzyz) {
        if (zz0v.zzxb()) {
            return false;
        }
        return (zz0v.zzxO() && zzyz == null) ? false : true;
    }

    public final boolean zzZ(zz0V zz0v) {
        for (zzSR zzsrZzsz = zz0v.zzsz(); zzsrZzsz != null; zzsrZzsz = zzsrZzsz.zzsz()) {
            if (zzsrZzsz == this) {
                return true;
            }
        }
        return false;
    }

    public final void zzZ(zzFS zzfs, Map map, zz0U zz0u) throws Exception {
        for (zz0V zz0vZzsA = this.zzPe; zz0vZzsA != null; zz0vZzsA = zz0vZzsA.zzsA()) {
            zz0vZzsA.zzY(zzfs, map, zz0u);
        }
    }
}
