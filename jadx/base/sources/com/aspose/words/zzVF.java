package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzVF {
    private int zzTL;
    private zzVF zzZw7;
    private zzYAU zzZw8;

    public zzVF() throws Exception {
        reset();
    }

    private void setIndex(int i) throws Exception {
        zz10();
        this.zzTL = i;
    }

    private void zz10() throws Exception {
        if (this.zzZw7 != null) {
            throw new Exception("ChunkIndex, instance is read-only");
        }
    }

    private void zzW(zzYAU zzyau) throws Exception {
        zz10();
        this.zzZw8 = zzyau;
    }

    private static int zzX(zzYAU zzyau) throws Exception {
        if (zzyau.zzY7s()) {
            return zzyau.zz0R();
        }
        return 1;
    }

    public final boolean equals(Object obj) {
        return zzY((zzVF) com.aspose.words.internal.zzZKW.zzZ(obj, zzVF.class));
    }

    public final char getCharacter() throws Exception {
        return zz14().zzlV(getIndex());
    }

    public final int getIndex() {
        zzVF zzvf = this.zzZw7;
        return zzvf == null ? this.zzTL : zzvf.zzTL;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public final void reset() throws Exception {
        zzW(null);
        setIndex(Integer.MIN_VALUE);
    }

    public final int zz11() throws Exception {
        return zzX(zz14()) <= 1 ? zz14().getWidth() : zz14().zzlW(getIndex());
    }

    public final boolean zz12() throws Exception {
        return !zz13() && getIndex() >= zzX(zz14()) - 1;
    }

    public final boolean zz13() {
        return zz14() == null;
    }

    public final zzYAU zz14() {
        zzVF zzvf = this.zzZw7;
        return zzvf == null ? this.zzZw8 : zzvf.zzZw8;
    }

    public final void zzY(zzYAU zzyau) throws Exception {
        zzW(zzyau);
        setIndex(0);
    }

    public final void zzZ(zzYAU zzyau, int i) throws Exception {
        zzW(zzyau);
        setIndex(i);
    }

    public zzVF(zzYAU zzyau, int i) throws Exception {
        zzZ(zzyau, i);
    }

    public final boolean zzY(zzVF zzvf) {
        if (com.aspose.words.internal.zzZKO.zzA(null, zzvf)) {
            return false;
        }
        if (com.aspose.words.internal.zzZKO.zzA(this, zzvf)) {
            return true;
        }
        return zz14() == zzvf.zz14() && getIndex() == zzvf.getIndex();
    }

    public final void zzZ(zzYAU zzyau) throws Exception {
        zzW(zzyau);
        setIndex(Math.max(0, zzX(zz14()) - 1));
    }

    public static zzVF zzZ(zzVF zzvf) throws Exception {
        zzVF zzvf2 = new zzVF();
        zzvf2.zzZw7 = zzvf;
        return zzvf2;
    }
}
