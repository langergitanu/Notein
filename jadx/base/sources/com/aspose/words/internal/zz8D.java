package com.aspose.words.internal;

import androidx.appcompat.view.menu.C21505OooO0Oo;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
abstract class zz8D {
    protected ArrayList<zzZ> zzoF = new ArrayList<>();
    private zzG6 zzqY;

    public static class zzU extends zzZ {
        private boolean zzoz;

        public final void zzZO(boolean z) {
            this.zzoz = z;
        }

        public final boolean zzy5() {
            return this.zzoz;
        }
    }

    public static class zzV {
        private boolean zzoA;
        private zzZQ4 zzoB;
        private ArrayList<zzY> zzoC;

        public zzV(zzY zzy) {
            ArrayList<zzY> arrayList = new ArrayList<>();
            this.zzoC = arrayList;
            zzZQG.zzZ(arrayList, zzy);
            this.zzoB = zzy.zzyb();
        }

        private static boolean zzX(float f, float f2, float f3) {
            return f >= f2 - 0.01f && f <= f3 + 0.01f;
        }

        public final boolean zzY(zzY zzy) {
            zzZQ4 zzzq4Zzyb = zzy.zzyb();
            if (zzX(zzzq4Zzyb.zzZm(), this.zzoB.zzZm(), this.zzoB.zzkw()) || zzX(zzzq4Zzyb.zzkw(), this.zzoB.zzZm(), this.zzoB.zzkw())) {
                return zzX(zzzq4Zzyb.zzZo(), this.zzoB.zzZo(), this.zzoB.zzZn()) || zzX(zzzq4Zzyb.zzZn(), this.zzoB.zzZo(), this.zzoB.zzZn());
            }
            return false;
        }

        public final void zzZ(zzV zzv) {
            this.zzoA = zzv.zzoB.zzZm() <= this.zzoB.zzZm() && zzv.zzoB.zzkw() >= this.zzoB.zzkw() && zzv.zzoB.zzZo() <= this.zzoB.zzZo() && zzv.zzoB.zzZn() >= this.zzoB.zzZn();
        }

        public final boolean zzy6() {
            return this.zzoA;
        }

        public final zzZQ4 zzy7() {
            return this.zzoB;
        }

        public final zzY zzy8() {
            return (zzY) C21505OooO0Oo.OooO00o(1, this.zzoC);
        }

        public final ArrayList<zzY> zzy9() {
            return this.zzoC;
        }

        public final void zzX(zzY zzy) {
            zzZQG.zzZ(this.zzoC, zzy);
            this.zzoB = zzZQ4.zzT(this.zzoB, zzy.zzyb());
        }
    }

    public static class zzW extends zzY {
        private zz85 zzoD;

        public final int zzJP() {
            return this.zzoD.zzJP();
        }

        public final void zzZ(zz85 zz85Var) {
            this.zzoD = zz85Var;
        }

        public final zz85 zzya() {
            return this.zzoD;
        }
    }

    public static class zzX extends zzY {
        private int zzDG;

        public final void zzUF(int i) {
            this.zzDG = i;
        }
    }

    public static abstract class zzY extends zzZ {
    }

    public static abstract class zzZ {
        private int zzDe;
        private zzZQ4 zzG8;
        private zzP9 zzoE;

        public final void zzC(zzP9 zzp9) {
            this.zzoE = zzp9;
        }

        public final void zzI(zzZQ4 zzzq4) {
            this.zzG8 = zzzq4;
        }

        public final int zzJp() {
            return this.zzDe;
        }

        public final zzP9 zzMq() {
            return this.zzoE;
        }

        public final void zzUH(int i) {
            this.zzDe = i;
        }

        public final zzZQ4 zzZj() {
            return this.zzG8;
        }

        public final zzZQ4 zzyb() {
            return this.zzoE.zzO(this.zzG8);
        }
    }

    public zz8D(zzG6 zzg6) {
        this.zzqY = zzg6;
    }

    private static void zzO(ArrayList<zzV> arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            zzV zzv = arrayList.get(size);
            if (!zzv.zzy6()) {
                for (int i = size - 1; i >= 0; i--) {
                    arrayList.get(i).zzZ(zzv);
                }
            }
        }
    }

    private static boolean zzP(ArrayList<zzU> arrayList) {
        Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((zzU) it.next()).zzy5()) {
                return false;
            }
        }
        return true;
    }

    private static ArrayList<zzV> zzQ(ArrayList<zzZ> arrayList) {
        ArrayList<zzV> arrayList2 = new ArrayList<>();
        ArrayList arrayList3 = new ArrayList();
        zzV zzv = null;
        for (zzZ zzz : arrayList) {
            zzY zzy = (zzY) zzZKW.zzZ(zzz, zzY.class);
            if (zzy != null) {
                if (zzZ(zzv, zzy, (ArrayList<zzU>) arrayList3)) {
                    zzv.zzX(zzy);
                } else {
                    zzv = new zzV(zzy);
                    zzZQG.zzZ(arrayList2, zzv);
                }
                arrayList3.clear();
            } else {
                zzU zzu = (zzU) zzZKW.zzZ(zzz, zzU.class);
                if (zzu != null) {
                    zzZQG.zzZ((ArrayList<zzU>) arrayList3, zzu);
                }
            }
        }
        return arrayList2;
    }

    private void zzS(zzZYV<zz8E> zzzyv) throws Exception {
        zz8E zz8eZzZ;
        ArrayList<zzY> arrayList = new ArrayList(this.zzoF.size());
        Iterator<T> it = this.zzoF.iterator();
        while (it.hasNext()) {
            zzY zzy = (zzY) zzZKW.zzZ((zzZ) it.next(), zzY.class);
            if (zzy != null && (zz8eZzZ = zzZ(zzy)) != null) {
                zzzyv.set(zz8eZzZ.zzJp(), zz8eZzZ);
                zzZQG.zzZ((ArrayList<zzY>) arrayList, zzy);
            }
        }
        for (zzY zzy2 : arrayList) {
            zzU zzu = new zzU();
            zzu.zzUH(zzy2.zzJp());
            zzu.zzI(zzy2.zzZj());
            zzu.zzC(zzy2.zzMq());
            zzu.zzZO(true);
            int iIndexOf = this.zzoF.indexOf(zzy2);
            this.zzoF.remove(iIndexOf);
            this.zzoF.add(iIndexOf, zzu);
        }
    }

    public final void zzUG(int i) {
        zzU zzu = new zzU();
        zzu.zzUH(i);
        zzu.zzI(zzZQ4.zz2T);
        zzu.zzC(new zzP9());
        zzu.zzZO(false);
        zzZQG.zzZ((ArrayList<zzU>) this.zzoF, zzu);
    }

    public zz8E zzZ(zzY zzy) throws Exception {
        return null;
    }

    public final zzZYV<zz8E> zzyc() throws Exception {
        zzZYV<zz8E> zzzyv = new zzZYV<>(this.zzoF.size());
        zzS(zzzyv);
        ArrayList<zzV> arrayListZzQ = zzQ(this.zzoF);
        zzO(arrayListZzQ);
        for (zzV zzv : arrayListZzQ) {
            for (zzY zzy : zzv.zzy9()) {
                zz8E zz8e = new zz8E();
                zz8e.zzUH(zzy.zzJp());
                zz8e.setAction((zzv.zzy6() || zzv.zzy8() != zzy) ? 1 : 0);
                zz8e.zzo(zzv.zzy7());
                zz8e.zzZP(zzy.zzyb().equals(zzv.zzy7()));
                zzzyv.add(zz8e.zzJp(), zz8e);
            }
        }
        return zzzyv;
    }

    public final void zzZ(int i, int i2, zzZQ4 zzzq4, zzP9 zzp9) {
        if (zz8I.zzUI(i2) || !this.zzqY.zzFj()) {
            zzZ(i, zzzq4, zzp9);
            return;
        }
        zzX zzx = new zzX();
        zzx.zzUH(i);
        zzx.zzUF(i2);
        zzx.zzI(zzzq4);
        zzx.zzC(zzp9);
        zzZQG.zzZ((ArrayList<zzX>) this.zzoF, zzx);
    }

    public final void zzZ(int i, zzZQ4 zzzq4, zzP9 zzp9) {
        zzU zzu = new zzU();
        zzu.zzUH(i);
        zzu.zzI(zzzq4);
        zzu.zzC(zzp9);
        zzu.zzZO(true);
        zzZQG.zzZ((ArrayList<zzU>) this.zzoF, zzu);
    }

    public final void zzZ(int i, zz85 zz85Var, zzP9 zzp9) {
        if (!zz8I.zzUJ(zz85Var.zzJP()) && this.zzqY.zzL(zz85Var.zzJP(), zz85Var.zzJM())) {
            zzW zzw = new zzW();
            zzw.zzUH(i);
            zzw.zzI(zzZQ4.zzN(zz85Var.zzJN()));
            zzw.zzC(zzp9);
            zzw.zzZ(zz85Var);
            zzZQG.zzZ((ArrayList<zzW>) this.zzoF, zzw);
            return;
        }
        zzZ(i, zzZQ4.zzN(zz85Var.zzJN()), zzp9);
    }

    private static boolean zzZ(zzV zzv, zzY zzy, ArrayList<zzU> arrayList) {
        if (zzv != null && zzZ(zzy, arrayList)) {
            return zzv.zzY(zzy);
        }
        return false;
    }

    private static boolean zzZ(zzY zzy, ArrayList<zzU> arrayList) {
        if (arrayList.size() == 0) {
            return true;
        }
        if (!zzP(arrayList)) {
            return false;
        }
        zzZQ4 zzzq4Zzyb = arrayList.get(0).zzyb();
        Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            zzzq4Zzyb = zzZQ4.zzT(zzzq4Zzyb, ((zzU) it.next()).zzyb());
        }
        return zzJ6.zzY(zzy.zzyb(), zzzq4Zzyb);
    }
}
