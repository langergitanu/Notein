package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZU extends zzZV {
    private int zzZn;
    static zzZU zzZF7 = new zzZU(0);
    static zzZU zzZF6 = new zzZU(1);
    static zzZU zzZF5 = new zzZU(128);
    static zzZU zzZF4 = new zzZU(129);

    private zzZU(int i) {
        this.zzZn = i;
    }

    public static zzZU zzYW(boolean z) {
        return z ? zzZF6 : zzZF7;
    }

    public final int getValue() {
        return this.zzZn;
    }

    public final int hashCode() {
        return this.zzZn;
    }

    public final boolean toBool() {
        int i = this.zzZn;
        if (i == 0) {
            return false;
        }
        if (i == 1) {
            return true;
        }
        throw new IllegalStateException("Not expected other boolex values here.");
    }

    public final Object zzY(zzZ9G zzz9g, int i) {
        int i2 = this.zzZn;
        if (i2 == 0) {
            return Boolean.FALSE;
        }
        if (i2 == 1) {
            return Boolean.TRUE;
        }
        if (i2 == 128) {
            return null;
        }
        if (i2 != 129) {
            throw new IllegalStateException("Unknown BoolEx value.");
        }
        if (zzz9g != null) {
            return Boolean.valueOf(((zzZU) zzz9g.fetchInheritedRunAttr(i)).zzbr().toBool());
        }
        return null;
    }

    public final zzZU zzZ(zzZS zzzs, int i) {
        int i2 = this.zzZn;
        if (i2 == 0 || i2 == 1) {
            return this;
        }
        if (i2 == 128) {
            return (zzZU) zzzs.zzPj(i);
        }
        if (i2 != 129) {
            throw new IllegalStateException("Unknown boolex value.");
        }
        zzZU zzzu = (zzZU) zzzs.zzPj(i);
        return zzzu.zzZn == 129 ? zzZF6 : zzzu.zzbr();
    }

    public final zzZU zzbr() {
        int i = this.zzZn;
        if (i == 0) {
            return zzZF6;
        }
        if (i == 1) {
            return zzZF7;
        }
        throw new IllegalStateException("Not expected other boolex values here.");
    }

    public final zzZU zzZ(Font font, int i) {
        int i2 = this.zzZn;
        if (i2 == 0 || i2 == 1) {
            return this;
        }
        if (i2 == 128) {
            return (zzZU) font.zzPj(i);
        }
        if (i2 == 129) {
            return ((zzZU) font.zzPj(i)).zzbr();
        }
        throw new IllegalStateException("Unknown boolex value.");
    }

    public final zzZU zzZ(zzZ9G zzz9g, int i) {
        int i2 = this.zzZn;
        if (i2 == 0 || i2 == 1) {
            return this;
        }
        if (i2 == 128) {
            return (zzZU) zzz9g.fetchInheritedRunAttr(i);
        }
        if (i2 == 129) {
            return ((zzZU) zzz9g.fetchInheritedRunAttr(i)).zzbr();
        }
        throw new IllegalStateException("Unknown BoolEx value.");
    }
}
