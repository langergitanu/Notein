package com.aspose.words.internal;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
final class zzZWV {
    private Object zz98;
    private Object zz99;
    private Object zz9a;
    private zzY zz9c;
    private zzY zz9d;
    private zzFS zzUa;
    private int zz9b = -1;
    private zzZWX zzLL = new zzZWX(new zzSZ());

    public final class zzZ {
        private int zz9j;
        private int zzQ7;
        private int zzU6;
        private Object zzUb;

        public zzZ(Object obj, int i, int i2, int i3) {
            this.zzUb = obj;
            this.zz9j = i;
            this.zzQ7 = i2;
            this.zzU6 = i3;
        }

        public final int zzTm() {
            return (this.zzQ7 + this.zzU6) - 1;
        }

        public final int zzTn() {
            return this.zzQ7;
        }

        public final Object zzVr() {
            return this.zzUb;
        }

        public final int zzoG() {
            return this.zz9j;
        }
    }

    public zzZWV(zzFS zzfs) {
        byte b = 0;
        this.zz9d = new zzY(b);
        this.zz9c = new zzY(b);
        this.zzUa = zzfs;
    }

    private void zzN(Object obj, int i) {
        if ((obj != null ? this.zzUa.zzv(obj) : null) == this.zzLL.zzVv()) {
            return;
        }
        zzox();
        throw zz7W.zzK(obj == null ? "A {0} affecting table columns cannot end outside of a table." : "A {0} affecting table columns cannot end in another table.", i);
    }

    private void zzSm(int i) {
        if (this.zzLL.zzoF() >= 0 && i != this.zzLL.zzoF()) {
            throw new zzCW(zzZKN.format("All {0} of the same table region must end on the same table row.", "data bands and conditional blocks affecting table columns"));
        }
    }

    private void zzSn(int i) {
        if (this.zzLL.zzoG() >= 0 && i != this.zzLL.zzoG()) {
            throw new zzCW(zzZKN.format("All {0} of the same table region must start on the same table row.", "data bands and conditional blocks affecting table columns"));
        }
    }

    private boolean zzSo(int i) {
        return !this.zz9c.zzSj(i);
    }

    private void zzSp(int i) {
        if (!this.zz9d.zzSj(i) && !this.zz9c.zzSj(i)) {
            throw new zzCW(zzZKN.format("An end of a {0} is not expected.", zz7W.zzK(zz7W.zzUC(i))));
        }
    }

    private void zzX(zzZ zzz) {
        if (this.zzUa.zzz(zzz.zzVr())) {
            throw new zzCW(zzZKN.format("There is a merged cell at the lower boundary of the region formed by the {0} (row {1}, column {2}).", "data band or conditional block affecting table columns", Integer.valueOf(zzz.zzoG()), Integer.valueOf(zzz.zzTn() + 1)));
        }
    }

    private Object zzY(Object obj, int i, boolean z) {
        Object objZzF = this.zzUa.zzF(obj);
        if (objZzF == null) {
            if (z) {
                throw zz7W.zzK("A {0} affecting table columns cannot start outside a table.", i);
            }
            throw zzoE();
        }
        if (this.zzLL.zzVv() == null || this.zzUa.zzv(objZzF) == this.zzLL.zzVv()) {
            return objZzF;
        }
        Object objZzJ = this.zzUa.zzJ(objZzF, this.zzLL.zzVv());
        if (objZzJ == null) {
            throw zzoE();
        }
        if (z) {
            throw new zzCW(zzZKN.format("A {0} cannot be in a nested table if the table is in a cell occupied by another {0}.", "data band or conditional block affecting table columns"));
        }
        return objZzJ;
    }

    private zzY zzZi(boolean z) {
        return z ? this.zz9d : this.zz9c;
    }

    private void zzZt(int i, int i2) {
        if (i < this.zz9b) {
            throw zz7W.zzK("The {0} affecting table columns ends in the column before its start column.", i2);
        }
    }

    private void zzd(Object obj) {
        if (zzoy() && obj != this.zz98) {
            int iZzow = this.zz9c.zzow();
            throw new zzCW(zzZKN.format("A common {0} must start and end in the same cell if it is inside a table region occupied by {1}.", zz7W.zzK(zz7W.zzUC(iZzow)), "data bands and conditional blocks affecting table columns"), this.zz9c.zzSk(iZzow).zzwW(), zz7W.zzUC(iZzow));
        }
    }

    private void zzoD() {
        this.zzUa.zzy(this.zz9a);
        zzZ zzz = new zzZ(this.zz9a, this.zzLL.zzoG(), this.zz9b, this.zzUa.zzw(this.zz9a));
        Object[] objArr = new Object[zzoz().getCount()];
        while (zzz.zzVr() != null && zzz.zzoG() <= this.zzLL.zzoF() + 1) {
            if (zzz.zzTn() >= this.zz9b) {
                if (zzz.zzoG() == this.zzLL.zzoG()) {
                    zzY(zzz);
                }
                if (zzz.zzoG() == this.zzLL.zzoF() + 1) {
                    zzX(zzz);
                }
            }
            if (zzz.zzoG() <= this.zzLL.zzoF()) {
                int iZzYO = zzoz().zzYO(zzz.zzTn());
                zzT0 zzt0ZzYN = zzoz().zzYN(iZzYO);
                zzZ(zzz, zzt0ZzYN.zzTm());
                if (zzz.zzTm() >= this.zz9b && !this.zzUa.zzz(zzz.zzVr())) {
                    if (zzz.zzTm() == zzt0ZzYN.zzTm()) {
                        zzt0ZzYN.zzO(zzz.zzVr());
                    }
                    objArr[iZzYO] = zzz.zzVr();
                }
            }
            zzz = zzZ(zzz);
        }
        for (int i = 0; i < zzoz().getCount(); i++) {
            if (zzoz().zzYN(i).zzTl() == objArr[i]) {
                zzoz().zzYN(i).zzO(null);
            }
        }
    }

    private zzCW zzoE() {
        int iZzow = this.zz9d.zzow();
        return new zzCW(zzZKN.format("A {0} affecting table columns cannot end outside the table in which it starts.", zz7W.zzK(zz7W.zzUC(iZzow))), this.zz9d.zzSk(iZzow).zzwW(), zz7W.zzUC(iZzow));
    }

    private boolean zzox() {
        return !this.zz9d.isEmpty();
    }

    private boolean zzoy() {
        return !this.zz9c.isEmpty();
    }

    private zzSZ zzoz() {
        return (zzSZ) this.zzLL.zzoH();
    }

    public final void zzZ(int i, byte b, zz6R zz6r) {
        boolean zZzSo = b == 1;
        if (b == -1) {
            zZzSo = zzSo(1);
        }
        Object objZzY = zzY(zz6r.getFirst(), i, zZzSo);
        zzd(objZzY);
        if (zZzSo) {
            int iZzB = this.zzUa.zzB(objZzY);
            zzSn(iZzB);
            int iZzA = this.zzUa.zzA(objZzY);
            zzoz().zzYP(iZzA);
            zzZ(objZzY, iZzB, iZzA, zz6r);
        } else {
            this.zz98 = objZzY;
        }
        zzZi(zZzSo).zzY(i, zz6r);
    }

    public final zzZWX zzoA() {
        return this.zzLL;
    }

    public final Object zzoB() {
        return this.zz99;
    }

    public final boolean zzoC() {
        return !zzox();
    }

    public static class zzY {
        private ArrayList<zzZQC<zz6R>> zz96;

        private zzY() {
            this.zz96 = new ArrayList<>(3);
        }

        private ArrayList<zzZQC<zz6R>> zzov() {
            while (this.zz96.size() < 3) {
                zzZQG.zzZ((ArrayList<zzZQC>) this.zz96, new zzZQC());
            }
            return this.zz96;
        }

        public final void clear() {
            for (zzZQC<zz6R> zzzqc : this.zz96) {
                if (zzzqc != null) {
                    zzzqc.clear();
                }
            }
        }

        public final boolean isEmpty() {
            for (zzZQC<zz6R> zzzqc : this.zz96) {
                if (zzzqc != null && zzzqc.size() > 0) {
                    return false;
                }
            }
            return true;
        }

        public final boolean zzSj(int i) {
            return zzov().get(i).size() > 0;
        }

        public final zz6R zzSk(int i) {
            zzov().get(i);
            return zzov().get(i).peek();
        }

        public final void zzSl(int i) {
            zzov().get(i);
            zzov().get(i).pop();
        }

        public final void zzY(int i, zz6R zz6r) {
            zzov().get(i).push(zz6r);
        }

        public final int zzow() {
            for (int i = 0; i < 3; i++) {
                if (zzSj(i)) {
                    return i;
                }
            }
            throw new IllegalStateException();
        }

        public /* synthetic */ zzY(byte b) {
            this();
        }
    }

    private void zzY(zzZ zzz) {
        if (this.zzUa.zzz(zzz.zzVr())) {
            throw new zzCW(zzZKN.format("There is a merged cell at the upper boundary of the region formed by the {0} (row {1}, column {2}).", "data band or conditional block affecting table columns", Integer.valueOf(zzz.zzoG() + 1), Integer.valueOf(zzz.zzTn() + 1)));
        }
    }

    public final void zzZ(int i, zz6R zz6r) {
        zzSp(i);
        boolean zZzSo = zzSo(i);
        zzY zzyZzZi = zzZi(zZzSo);
        if (i == 2) {
            zzyZzZi.zzSl(i);
            return;
        }
        Object objZzF = this.zzUa.zzF(zz6r.getFirst());
        zzd(objZzF != null ? this.zzUa.zzJ(objZzF, this.zzLL.zzVv()) : null);
        if (!zZzSo) {
            zzyZzZi.zzSl(i);
            return;
        }
        zzN(objZzF, i);
        int iZzB = this.zzUa.zzB(objZzF);
        int iZzA = this.zzUa.zzA(objZzF);
        zzZt(iZzA, i);
        int iZzx = (this.zzUa.zzx(objZzF) + iZzB) - 1;
        zzSm(iZzx);
        this.zzLL.zzSq(iZzx);
        if (this.zzLL.zzoG() == this.zzLL.zzoF()) {
            zzoz().reset();
            this.zz9d.clear();
        } else {
            zzoz().zzYP(this.zzUa.zzw(objZzF) + iZzA);
            zzyZzZi.zzSl(i);
        }
        if (zzoC()) {
            zzoD();
        }
    }

    private void zzZ(Object obj, int i, int i2, zz6R zz6r) {
        if (this.zz9b >= 0) {
            return;
        }
        this.zz9b = i2;
        this.zz99 = zz6r.getFirst();
        this.zz9a = obj;
        this.zzLL.zzSr(i);
        this.zzLL.zze(this.zzUa.zzv(obj));
    }

    private zzZ zzZ(zzZ zzz) {
        Object objZzY;
        int i;
        int iZzoG = zzz.zzoG();
        int iZzTm = zzz.zzTm() + 1;
        Object objZzVr = zzz.zzVr();
        while (true) {
            objZzY = this.zzUa.zzY(objZzVr, false);
            if (objZzY == null || !this.zzUa.zzy(objZzY)) {
                break;
            }
            objZzVr = objZzY;
        }
        if (objZzY == null) {
            iZzoG++;
            objZzY = this.zzUa.zzY(objZzVr, true);
            i = 0;
        } else {
            i = iZzTm;
        }
        Object obj = objZzY;
        return new zzZ(obj, iZzoG, i, obj != null ? this.zzUa.zzw(obj) : 0);
    }

    private static void zzZ(zzZ zzz, int i) {
        if (zzz.zzTm() > i) {
            throw new zzCW(zzZKN.format("There is a merged cell at the vertical boundary of the region formed by the {0} (row {1}, column {2}).", "data band or conditional block affecting table columns", Integer.valueOf(zzz.zzoG() + 1), Integer.valueOf(i + 1)));
        }
    }
}
