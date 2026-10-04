package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zzZ5C {
    private boolean zzYe9;
    private boolean zzYea;
    private zzVF zzYeb;

    public zzZ5C(zzYAU zzyau, int i, boolean z, zzVF zzvf) throws Exception {
        this.zzYeb = new zzVF(zzyau, i);
        this.zzYea = z;
        this.zzYe9 = zzZ(zzyau, i, zzvf);
    }

    private static boolean zzZ(zzYAU zzyau, int i, zzVF zzvf) {
        if (zzvf == null) {
            return false;
        }
        if (zzY9B.zzC(zzvf.zz14(), zzyau)) {
            return true;
        }
        return zzvf.zz14() == zzyau && zzvf.getIndex() <= i;
    }

    public boolean equals(Object obj) {
        return zzZ((zzZ5C) com.aspose.words.internal.zzZKW.zzZ(obj, zzZ5C.class));
    }

    public int hashCode() {
        return super.hashCode();
    }

    public final boolean zzYQW() {
        return this.zzYe9;
    }

    public final boolean zzYQX() {
        return this.zzYea;
    }

    public final zzVF zzYQY() {
        return this.zzYeb;
    }

    public final boolean zzZ(zzZ5C zzz5c) {
        if (com.aspose.words.internal.zzZKO.zzA(null, zzz5c)) {
            return false;
        }
        if (com.aspose.words.internal.zzZKO.zzA(this, zzz5c)) {
            return true;
        }
        return this.zzYea == zzz5c.zzYea && this.zzYe9 == zzz5c.zzYe9 && this.zzYeb.zzY(zzz5c.zzYeb);
    }
}
