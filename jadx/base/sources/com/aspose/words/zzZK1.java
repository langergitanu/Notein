package com.aspose.words;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzZK1 implements Cloneable {
    private static int[] zzYti = {1592, 1593, 1594, 1595};
    private int zzYG;
    private zzZK0 zzYSk;
    private int zzYtj;
    private int zzYtk = 0;
    private zzYMX zzZsQ;
    private int zzZvl;

    public zzZK1(int i) {
        this.zzYG = i;
    }

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public final int getId() {
        return this.zzYG;
    }

    public final int getParentId() {
        return this.zzZvl;
    }

    public final int hashCode() {
        int i = ((this.zzYG * 397) ^ this.zzZvl) * 397;
        zzYMX zzymx = this.zzZsQ;
        return ((((i ^ (zzymx != null ? zzymx.hashCode() : 0)) * 397) ^ this.zzYtk) * 397) ^ this.zzYtj;
    }

    public final void setParentId(int i) {
        this.zzZvl = i;
    }

    public final void zzA9(int i) {
        this.zzYtk = i;
    }

    public final void zzAa(int i) {
        this.zzYtj = i;
    }

    public final void zzY(zzZK0 zzzk0) {
        this.zzYSk = zzzk0;
    }

    public final zzZK1 zzZ4h() {
        zzZK1 zzzk1 = (zzZK1) memberwiseClone();
        zzYMX zzymx = this.zzZsQ;
        if (zzymx != null) {
            zzzk1.zzZsQ = (zzYMX) zzymx.zzbn();
        }
        return zzzk1;
    }

    public final void zzZ4i() {
        for (int i : zzYti) {
            if (((Integer) zzZYj().zzPj(i)).intValue() == 0) {
                zzZYj().remove(i);
            }
        }
        Iterator<Integer> it = zzYMX.zzZzU.zzl9().iterator();
        while (it.hasNext()) {
            int iIntValue = it.next().intValue();
            if (com.aspose.words.internal.zzZKO.equals(zzZYj().zzPk(iIntValue), Border.zzZCe)) {
                zzZYj().remove(iIntValue);
            }
        }
    }

    public final int zzZ4j() {
        return this.zzYtk;
    }

    public final int zzZ4k() {
        return this.zzYtj;
    }

    public final boolean zzZ5x() {
        if (this.zzYSk == null) {
            return false;
        }
        for (int i = 0; i < this.zzYSk.getCount(); i++) {
            if (this.zzYSk.zzA7(i).zzZvl == this.zzYG) {
                return true;
            }
        }
        return false;
    }

    public final zzYMX zzZYj() {
        if (this.zzZsQ == null) {
            this.zzZsQ = new zzYMX();
        }
        return this.zzZsQ;
    }
}
