package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzFD implements Cloneable {
    private zzDH zzZd9;
    private zzFK zzZda;

    public zzFD(zzFK zzfk) {
        this.zzZda = zzfk;
    }

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    private static zzCE zzKY(int i) {
        zzCE zzce = new zzCE(2);
        zzce.zzNy(i);
        zzce.zzZIm();
        return zzce;
    }

    public static zzFD zzKZ(int i) {
        zzFK zzfk = new zzFK();
        zzfk.zzV(zzKY(i));
        return new zzFD(zzfk);
    }

    public final int getValueType() {
        if (zzZMv() != null) {
            return zzZMv().getValueType();
        }
        return 0;
    }

    public final boolean isDate() {
        return zzZMv() != null && zzZMv().isDate();
    }

    public final boolean isEmpty() {
        return zzZN4() == null;
    }

    public final zzCF zzL0(int i) {
        return zzZMv() != null ? zzZMv().zzL0(i) : zzDH.zzY(null, i);
    }

    public final void zzV(zzCE zzce) {
        this.zzZda.zzV(zzce);
        this.zzZd9 = null;
    }

    public final void zzW(zzFD zzfd) {
        if (zzfd.isEmpty()) {
            return;
        }
        this.zzZd9 = zzfd.zzZMv().zzZIp();
    }

    public final zzFK zzZMu() {
        return this.zzZda;
    }

    public final zzDH zzZMv() {
        if (this.zzZd9 == null) {
            if (zzZN4() == null) {
                return null;
            }
            this.zzZd9 = new zzDH(zzZN4());
        }
        return this.zzZd9;
    }

    public final zzFD zzZMw() {
        zzFD zzfd = (zzFD) memberwiseClone();
        zzfd.zzZda = this.zzZda.zzZN7();
        zzDH zzdh = this.zzZd9;
        if (zzdh != null) {
            zzfd.zzZd9 = zzdh.zzU(zzfd.zzZN4());
        }
        return zzfd;
    }

    public final zzCE zzZN4() {
        zzFK zzfk = this.zzZda;
        if (zzfk != null) {
            return zzfk.zzZN4();
        }
        return null;
    }
}
