package com.aspose.words.internal;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
abstract class zzZW8 implements zzF7 {
    private ArrayList<zzZW5> zz8b;
    private zzZVP[] zz8c;

    public zzZW8(zzZVP[] zzzvpArr) {
        this.zz8c = zzzvpArr;
    }

    private boolean zzH(zzZW5 zzzw5) {
        for (zzZW5 zzzw52 : this.zz8b) {
            if (zzzw5 != zzzw52 && !zzZ(zzzw5, zzzw52)) {
                return false;
            }
        }
        return true;
    }

    private boolean zzI(zzZW5 zzzw5) {
        if (zzxe()) {
            return true;
        }
        zzZVP[] zzzvpArr = this.zz8c;
        return (zzzvpArr.length == 0 || zzzvpArr.length < zzzw5.zzAE().length) ? !zzzw5.isVarArgs() : !zzX(zzzw5, this.zz8c.length - 1);
    }

    private boolean zzJ(zzZW5 zzzw5) {
        int iMin = Math.min(zzzw5.zzAE().length, this.zz8c.length);
        for (int i = 0; i < iMin; i++) {
            zzZVP zzzvp = this.zz8c[i];
            zz6P zz6pZzY = zzY(zzzw5, i);
            if (!zzSC.zzW(zzzvp, zz6pZzY) && (zzxe() || !zz6pZzY.isVarArgs() || !zzSC.zzW(zzzvp, zz6pZzY.zzwU()))) {
                return false;
            }
        }
        return true;
    }

    private boolean zzK(zzZW5 zzzw5) {
        int length = zzzw5.zzAE().length;
        zzZVP[] zzzvpArr = this.zz8c;
        if (length <= zzzvpArr.length) {
            return true;
        }
        for (int length2 = zzzvpArr.length; length2 < length; length2++) {
            zz6P zz6pZzY = zzY(zzzw5, length2);
            if (!zz6pZzY.zzwT() && !zz6pZzY.isVarArgs()) {
                return false;
            }
        }
        return true;
    }

    private boolean zzL(zzZW5 zzzw5) {
        int length = zzzw5.zzAE().length;
        if (length >= this.zz8c.length) {
            return true;
        }
        zz6P zz6pZzY = zzY(zzzw5, length - 1);
        if (!zz6pZzY.isVarArgs()) {
            return false;
        }
        zzZVP zzzvpZzwU = zz6pZzY.zzwU();
        while (true) {
            zzZVP[] zzzvpArr = this.zz8c;
            if (length >= zzzvpArr.length) {
                return true;
            }
            if (!zzSC.zzW(zzzvpArr[length], zzzvpZzwU)) {
                return false;
            }
            length++;
        }
    }

    private boolean zzX(zzZW5 zzzw5, int i) {
        if (zzxe()) {
            return false;
        }
        int length = zzzw5.zzAE().length;
        if (i < length - 1) {
            return false;
        }
        return i >= length || !zzSC.zzW(this.zz8c[i], zzY(zzzw5, i));
    }

    private static boolean zzZ(zzZVP zzzvp, zzZVP zzzvp2, zzZVP zzzvp3) {
        if (!zzzvp.zzs()) {
            boolean z = zzzvp.getType() == zzzvp2.getType();
            boolean z2 = zzzvp.getType() == zzzvp3.getType();
            if (z && !z2) {
                return true;
            }
            if (z2) {
                return false;
            }
        }
        boolean zZzW = zzSC.zzW(zzzvp2, zzzvp3);
        boolean zZzW2 = zzSC.zzW(zzzvp3, zzzvp2);
        if (!zZzW || zZzW2) {
            return (zZzW2 || zzzvp2.zznu() || zzzvp2.zzns() || zzzvp3.zznu() || zzzvp3.zzns() || !zz7F.zzUk(zzzvp2.zznw()) || zz7F.zzUl(zzzvp2.zznw()) || !zz7F.zzUl(zzzvp3.zznw()) || zzzvp3.zznw() == 4) ? false : true;
        }
        return true;
    }

    public final boolean zzM(zzZW5 zzzw5) {
        if (zzxe()) {
            if (zzzw5.zzAE().length != this.zz8c.length) {
                return false;
            }
        } else {
            if (zzzw5.zzAE().length == 0) {
                return this.zz8c.length == 0;
            }
            if (!zzL(zzzw5) || !zzK(zzzw5)) {
                return false;
            }
        }
        return zzJ(zzzw5);
    }

    public zzZVP zzP(zzZW5 zzzw5) {
        return zzzw5.zzAF();
    }

    @Override // com.aspose.words.internal.zzF7
    public final void zzR(zzZW5 zzzw5) {
        if (zzW(zzzw5)) {
            if (this.zz8b == null) {
                this.zz8b = new ArrayList<>();
            }
            if (!zzI(zzzw5)) {
                zzzw5 = zzzw5.zznV();
            }
            zzZQG.zzZ(this.zz8b, zzzw5);
        }
    }

    @Override // com.aspose.words.internal.zzF7
    public zzZW5 zzRB() {
        ArrayList<zzZW5> arrayList = this.zz8b;
        if (arrayList == null) {
            return null;
        }
        zzZW5 zzzw5 = null;
        for (zzZW5 zzzw52 : arrayList) {
            if (zzH(zzzw52)) {
                if (zzzw5 != null) {
                    return null;
                }
                zzzw5 = zzzw52;
            }
        }
        return zzzw5;
    }

    public abstract boolean zzW(zzZW5 zzzw5);

    public final boolean zzW(zzZW5 zzzw5, zzZW5 zzzw52) {
        int i = 0;
        boolean z = false;
        while (true) {
            zzZVP[] zzzvpArr = this.zz8c;
            if (i >= zzzvpArr.length) {
                if (z) {
                    return true;
                }
                if (!zzxe()) {
                    boolean zZzI = zzI(zzzw5);
                    boolean zZzI2 = zzI(zzzw52);
                    if (zZzI && !zZzI2) {
                        return true;
                    }
                    if (!zZzI && zZzI2) {
                        return false;
                    }
                    boolean zZzY = zzY(zzzw5);
                    boolean zZzY2 = zzY(zzzw52);
                    if (!zZzY && zZzY2) {
                        return true;
                    }
                    if ((!zZzY || zZzY2) && !zZzI && !zZzY && zzzw5.zzAE().length > zzzw52.zzAE().length) {
                        return true;
                    }
                }
                return false;
            }
            zzZVP zzzvp = zzzvpArr[i];
            zzZVP zzzvpZzW = zzW(zzzw5, i);
            zzZVP zzzvpZzW2 = zzW(zzzw52, i);
            if (zzZ(zzzvp, zzzvpZzW2, zzzvpZzW)) {
                return false;
            }
            if (zzZ(zzzvp, zzzvpZzW, zzzvpZzW2)) {
                z = true;
            }
            i++;
        }
    }

    public zz6P zzY(zzZW5 zzzw5, int i) {
        return zzzw5.zzAE()[i];
    }

    public abstract boolean zzZ(zzZW5 zzzw5, zzZW5 zzzw52);

    public final Iterable<zzZW5> zznW() {
        return this.zz8b;
    }

    public final zzZVP[] zznX() {
        return this.zz8c;
    }

    public boolean zzxe() {
        return false;
    }

    private boolean zzY(zzAD zzad) {
        for (int length = this.zz8c.length; length < zzad.zzAE().length; length++) {
            if (zzad.zzAE()[length].zzwT()) {
                return true;
            }
        }
        return false;
    }

    private zzZVP zzW(zzZW5 zzzw5, int i) {
        if (zzX(zzzw5, i)) {
            return zzY(zzzw5, zzzw5.zzAE().length - 1).zzwU();
        }
        return zzY(zzzw5, i);
    }
}
