package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzVE {
    private zzVF zzZw3;
    private zzVF zzZw4;
    private zzYAU zzZw5;
    private zzYAU zzZw6;

    public zzVE(zzYAU zzyau, zzYAU zzyau2) throws Exception {
        zzVF zzvf = new zzVF();
        this.zzZw4 = zzvf;
        this.zzZw6 = zzyau;
        this.zzZw5 = zzyau2;
        this.zzZw3 = zzVF.zzZ(zzvf);
    }

    private void zz0W() {
        if (this.zzZw4.zz13()) {
            throw new IllegalStateException("Current span is not set.");
        }
    }

    private boolean zz0Y() throws Exception {
        if (this.zzZw5 == null && ((zzZ55) this.zzZw6.zzZZJ()) != null) {
            this.zzZw6.zzZZJ();
        }
        zzYAU zzyauZzZ9r = this.zzZw5;
        if (zzyauZzZ9r == null) {
            zzyauZzZ9r = this.zzZw6.zzY6S().zzZ9r();
        }
        this.zzZw4.zzZ(zzZ(zzyauZzZ9r, this.zzZw6, false, true));
        return true;
    }

    public static zzYAU zzS(zzYAU zzyau) throws Exception {
        return zzZ(zzyau, null, false, false);
    }

    public static zzYAU zzT(zzYAU zzyau) throws Exception {
        return zzZ(zzyau, null, true, false);
    }

    public static zzYAU zzZ(zzYAU zzyau, zzYAU zzyau2) throws Exception {
        return zzZ(zzyau, zzyau2, true, false);
    }

    public final char getCharacter() throws Exception {
        zz0W();
        return this.zzZw4.getCharacter();
    }

    public final int getIndex() {
        return this.zzZw4.getIndex();
    }

    public final boolean isFirst() throws Exception {
        zz0W();
        if (this.zzZw4.getIndex() != 0) {
            return false;
        }
        return ((zzYAU) zz14().zzYo0()) == null || this.zzZw6 == zz14() || zzZ((zzYAU) zz14().zzYo0(), this.zzZw6, false, true) == null;
    }

    public final boolean isLast() throws Exception {
        zz0W();
        if (this.zzZw4.zz12()) {
            return ((zzYAU) zz14().zzYo1()) == null || this.zzZw5 == zz14() || zzZ((zzYAU) zz14().zzYo1(), this.zzZw5, true, true) == null;
        }
        return false;
    }

    public final boolean moveNext() throws Exception {
        if (this.zzZw4.zz13()) {
            return zz0Z();
        }
        if (isLast()) {
            return false;
        }
        if (this.zzZw4.zz12()) {
            this.zzZw4.zzY(zzZ((zzYAU) zz14().zzYo1(), this.zzZw5, true, true));
        } else {
            zzVF zzvf = this.zzZw4;
            zzvf.zzZ(zzvf.zz14(), this.zzZw4.getIndex() + 1);
        }
        return true;
    }

    public final boolean movePrevious() throws Exception {
        if (this.zzZw4.zz13()) {
            return zz0Y();
        }
        if (isFirst()) {
            return false;
        }
        if (this.zzZw4.getIndex() == 0) {
            this.zzZw4.zzZ(zzZ((zzYAU) zz14().zzYo0(), this.zzZw6, false, true));
            zz14();
        } else {
            zzVF zzvf = this.zzZw4;
            zzvf.zzZ(zzvf.zz14(), this.zzZw4.getIndex() - 1);
        }
        return true;
    }

    public final boolean zz0U() throws Exception {
        zzYAU zzyauZzZ9r = this.zzZw5;
        if (zzyauZzZ9r == null) {
            zzyauZzZ9r = this.zzZw6.zzY6S().zzZ9r();
        }
        return zzY9B.zzC(zzyauZzZ9r, zz14());
    }

    public final zzVF zz0V() {
        return this.zzZw3;
    }

    public final boolean zz0X() throws Exception {
        if (this.zzZw4.zz13()) {
            return false;
        }
        boolean z = zz14() != this.zzZw5;
        if (z) {
            zzV((zzYAU) zz14().zzYo1());
            return z;
        }
        this.zzZw4.reset();
        return z;
    }

    public final boolean zz0Z() throws Exception {
        this.zzZw4.zzY(zzZ(this.zzZw6, this.zzZw5, true, true));
        return true;
    }

    public final int zz11() throws Exception {
        return this.zzZw4.zz11();
    }

    public final boolean zz12() throws Exception {
        return this.zzZw4.zz12();
    }

    public final boolean zz13() {
        return this.zzZw4.zz13();
    }

    public final zzYAU zz14() throws Exception {
        this.zzZw4.zz14().zzZo6();
        this.zzZw4.zz14().zzY74();
        return this.zzZw4.zz14();
    }

    public final boolean zzU(zzYAU zzyau) throws Exception {
        this.zzZw4.zzZ(zzZ(zzyau, this.zzZw5, true, true));
        return true;
    }

    public final boolean zzV(zzYAU zzyau) throws Exception {
        this.zzZw4.zzY(zzZ(zzyau, this.zzZw5, true, true));
        return true;
    }

    public final boolean zzX(zzVF zzvf) throws Exception {
        return zzY(zzvf.zz14(), zzvf.getIndex());
    }

    public final boolean zzY(zzYAU zzyau, int i) throws Exception {
        boolean zZzV = zzV(zzyau);
        for (int i2 = 0; zZzV && i2 < i; i2++) {
            zZzV = moveNext();
        }
        return zZzV;
    }

    public static zzYAU zzX(zzYAU zzyau, zzYAU zzyau2) throws Exception {
        return zzZ(zzyau, null, true, true);
    }

    private static zzYAU zzZ(zzYAU zzyau, zzYAU zzyau2, boolean z, boolean z2) throws Exception {
        while (zzyau != null) {
            if (z2 && zzyau.zzZ1s() != 0) {
                zzyau.zzY7p();
            }
            if (zzyau.zzY75()) {
                break;
            }
            if (zzyau == zzyau2) {
                return null;
            }
            zzyau = z ? (zzYAU) zzyau.zzYo1() : (zzYAU) zzyau.zzYo0();
        }
        return zzyau;
    }

    public static zzYAU zzY(zzYAU zzyau, zzYAU zzyau2) throws Exception {
        return zzZ(zzyau, zzyau2, false, false);
    }

    public zzVE(zzVE zzve) throws Exception {
        this(zzve.zzZw6, zzve.zzZw5);
        this.zzZw4.zzZ(zzve.zz14(), zzve.zzZw4.getIndex());
    }
}
