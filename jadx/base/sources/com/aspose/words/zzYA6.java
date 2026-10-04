package com.aspose.words;

import androidx.appcompat.view.menu.C21505OooO0Oo;
import com.aspose.words.ref.Ref;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzYA6 {
    private zzYMM zzXGD;
    private zzYAU zzXbP;
    private boolean zzXbQ;
    private HashMap<Node, zzZ> zzXbR;
    private zzYAS zzXbS;
    private int zzXbO = -1;
    private int zzXbN = -1;

    public zzYA6(zzYMM zzymm, zzYAU zzyau) {
        this.zzXGD = zzymm;
        this.zzXbP = zzyau;
        zzY5m();
    }

    private void zz8(Table table) {
        if (this.zzXbR.containsKey(table)) {
            return;
        }
        zzY6Q zzy6q = new zzY6Q(table, !this.zzXbQ);
        for (Row firstRow = table.getFirstRow(); firstRow != null; firstRow = firstRow.getNextRow()) {
            zzy6q.zzj(firstRow);
            com.aspose.words.internal.zzZQF.zzY(this.zzXbR, firstRow, new zzZ(zzy6q.zzYk8(), zzy6q.zzYka()));
            for (Cell firstCell = firstRow.getFirstCell(); firstCell != null; firstCell = firstCell.getNextCell()) {
                com.aspose.words.internal.zzZQF.zzY(this.zzXbR, firstCell, new zzZ(zzy6q.zzXYT()));
            }
        }
        com.aspose.words.internal.zzZQF.zzY(this.zzXbR, table, new zzZ(zzy6q.zz4O()));
    }

    private static void zzI(zzYMM zzymm) throws Exception {
        int i;
        zzYAU zzyau = (zzYAU) zzymm.zzZ9r().zzYo1();
        if (zzyau == null) {
            return;
        }
        ArrayList<zzZ6T> arrayListZzN = zzN(zzymm);
        ArrayList<zzZ6T> arrayListZzN2 = zzN(zzyau.zzY6S());
        arrayListZzN.get(0);
        arrayListZzN2.get(0);
        if (arrayListZzN.get(0) != arrayListZzN2.get(0) && !zzY9R.zzmP(zzymm.zzZ9r().zzZo6())) {
            zzZ6T zzz6t = arrayListZzN.get(0);
            arrayListZzN2.get(0);
            zzz6t.merge();
        }
        if (2 != arrayListZzN.size()) {
            arrayListZzN.size();
        }
        if (2 != arrayListZzN2.size()) {
            arrayListZzN2.size();
        }
        if (arrayListZzN.size() > arrayListZzN2.size()) {
            arrayListZzN2.size();
            arrayListZzN.size();
        }
        if (5 < arrayListZzN.size()) {
            i = 1;
            while (i < arrayListZzN.size() - 4 && i < arrayListZzN2.size() - 1) {
                if (arrayListZzN.get(i) != arrayListZzN2.get(i)) {
                    arrayListZzN.get(i).merge();
                }
                i++;
            }
            if (i >= arrayListZzN2.size() - 1) {
                arrayListZzN.size();
                arrayListZzN2.size();
                zzymm.zzZ9r().zzZo6();
            }
        } else {
            i = 1;
        }
        if (2 < arrayListZzN.size() && i < arrayListZzN2.size() - 1) {
            arrayListZzN.size();
            if (arrayListZzN.get(i) != arrayListZzN2.get(i) && !zzY9R.zzmL(zzymm.zzZ9r().zzZo6())) {
                arrayListZzN.get(i).merge();
            }
            int i2 = i + 1;
            if (arrayListZzN.get(i2) != arrayListZzN2.get(i2) && !zzY9R.zzmM(zzymm.zzZ9r().zzZo6())) {
                arrayListZzN.get(i2).merge();
            }
            int i3 = i + 2;
            if (arrayListZzN.get(i3) != arrayListZzN2.get(i3) && !zzY9R.zzmN(zzymm.zzZ9r().zzZo6())) {
                arrayListZzN.get(i3).merge();
            }
            i += 3;
        }
        if (arrayListZzN.get(i) == arrayListZzN2.get(i) || zzY9R.zzmO(zzymm.zzZ9r().zzZo6())) {
            return;
        }
        zzZ6T zzz6t2 = arrayListZzN.get(i);
        arrayListZzN2.get(i);
        arrayListZzN.size();
        arrayListZzN2.size();
        arrayListZzN.get(i);
        arrayListZzN2.get(i);
        zzz6t2.merge();
    }

    private void zzJ(zzYMM zzymm) throws Exception {
        zzYMM zzymm2 = this.zzXGD;
        if (zzymm2 == zzymm) {
            return;
        }
        if (this.zzXbN != -1) {
            zzZ37 zzz37ZzZ = zzZ37.zzZ((zzZ37) zzymm2.zzYTt());
            zzz37ZzZ.zzvZ(this.zzXbN);
            this.zzXGD.zzZ(zzZ37.zzY(zzz37ZzZ));
        }
        if (this.zzXbO != -1) {
            zzZ37 zzz37ZzZ2 = zzZ37.zzZ((zzZ37) zzymm.zzYTt());
            zzz37ZzZ2.zzvY(this.zzXbO);
            zzymm.zzZ(zzZ37.zzY(zzz37ZzZ2));
        }
        this.zzXGD = zzymm;
        this.zzXbO = -1;
        this.zzXbN = -1;
    }

    private static ArrayList<zzZ6T> zzN(zzZ6T zzz6t) {
        ArrayList<zzZ6T> arrayList = new ArrayList<>();
        while (zzz6t != null) {
            com.aspose.words.internal.zzZQG.zzZ(arrayList, zzz6t);
            zzz6t = zzz6t.zza9();
        }
        arrayList.remove(arrayList.size() - 1);
        Collections.reverse(arrayList);
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void zzV(zzYAS zzyas) throws Exception {
        boolean z;
        if (zzyas.zzYol() || ((zzZ37) this.zzXGD.zzYTt()).zzYLV()) {
            return;
        }
        zzZ37 zzz37ZzY6c = zzyas.zzY6c();
        if (this.zzXGD.zza7().zzZYM()) {
            z = zzz37ZzY6c.zzYLC() == 1;
        }
        if (zzz37ZzY6c.zzYLC() != 0 && !z) {
            if (this.zzXbN == -1) {
                this.zzXbN = zzz37ZzY6c.zzYLR();
            }
            this.zzXbO = zzz37ZzY6c.zzYLR();
            return;
        }
        zzZ37 zzz37ZzZ = zzZ37.zzZ((zzZ37) this.zzXGD.zzYTt());
        zzz37ZzZ.zzwa(zzz37ZzY6c.zzYM7());
        zzz37ZzZ.zzU7(zzz37ZzY6c.zzYM8());
        zzz37ZzZ.zzw9(zzz37ZzY6c.zzYM6());
        zzz37ZzZ.zzw7(zzz37ZzY6c.zzYM3());
        zzz37ZzZ.zzwb(zzz37ZzY6c.zzYMa());
        zzz37ZzZ.zzU8(zzz37ZzY6c.zzYM9());
        zzz37ZzZ.zzw8(zzz37ZzY6c.zzYM4());
        zzz37ZzZ.zzU6(zzz37ZzY6c.zzYM5());
        zzz37ZzZ.setAlignment(zzz37ZzY6c.getAlignment());
        zzz37ZzZ.zzZ(zzz37ZzY6c.zzYLI());
        if (!z) {
            zzz37ZzZ.zzU3(zzz37ZzY6c.zzYLW());
            zzz37ZzZ.zzU4(zzz37ZzY6c.zzYLX());
            zzz37ZzZ.zzU2(zzz37ZzY6c.zzYLV());
        }
        zzz37ZzZ.zzU1(zzz37ZzY6c.zzYLU());
        zzz37ZzZ.zzw0(zzz37ZzY6c.zzYLR());
        zzz37ZzZ.zzw5(zzz37ZzY6c.zzYM2());
        zzz37ZzZ.zzY(zzz37ZzY6c.zzYMW());
        zzz37ZzZ.zzX(zzz37ZzY6c.zzYMV());
        this.zzXbO = -1;
        this.zzXbN = -1;
        this.zzXGD.zzZ(zzZ37.zzY(zzz37ZzZ));
    }

    private zzZ zzWv(Node node) {
        zz8(zzYVU.zzXJ(node));
        return (zzZ) com.aspose.words.internal.zzQW.zzZ(this.zzXbR, node);
    }

    private static void zzX(zzYMM zzymm, zzYAU zzyau) throws Exception {
        zzymm.zza9();
        zzyau.zzY6S();
        zzyau.zzZZJ();
        if (((zzYAU) zzyau.zzYo1()) == null || zzymm != ((zzYAU) zzyau.zzYo1()).zzY6S()) {
            return;
        }
        if (((zzYAU) ((zzZ55) zzyau.zzZZJ()).zz6w()) != zzyau) {
            zzyau.zzZZJ();
            zzZ55.zzw(zzyau);
        }
        zzYMM zzymm2 = (zzYMM) zzymm.zz6u();
        zzymm.zza9().zzZ(zzymm, null, zzymm2);
        ((zzYAU) zzyau.zzYo1()).zzZZJ();
        zzymm.zz2((zzZ55) zzyau.zzZZJ());
        ArrayList<zzYMD> arrayListZzA = zzymm.zzA((zzZ55) ((zzYAU) zzyau.zzYo1()).zzZZJ());
        Iterator<zzYMD> it = arrayListZzA.iterator();
        while (it.hasNext()) {
            it.next().zzZ(zzymm2);
        }
        zzymm2.zz3((zzZ55) arrayListZzA.get(0));
        zzymm2.zz2((zzZ55) C21505OooO0Oo.OooO00o(1, arrayListZzA));
        ((zzZ55) zzyau.zzZZJ()).zzu(null);
        ((zzZ55) ((zzYAU) zzyau.zzYo1()).zzZZJ()).zzt(null);
        zzymm.zzZM(zzyau);
        ArrayList<zzYMD> arrayListZzA2 = zzymm.zzA((zzYAU) zzyau.zzYo1());
        Iterator<zzYMD> it2 = arrayListZzA2.iterator();
        while (it2.hasNext()) {
            it2.next().zzZ(zzymm2);
        }
        zzymm2.zzZN((zzYAU) arrayListZzA2.get(0));
        zzymm2.zzZM((zzYAU) C21505OooO0Oo.OooO00o(1, arrayListZzA2));
    }

    private static void zzY(zzYMM zzymm, zzYAU zzyau, zzYAU zzyau2) throws Exception {
        zzyau2.zzY6S();
        zzyau2.zzZZJ();
        zzyau2.zzu(zzyau);
        zzyau2.zzt(zzyau == null ? null : (zzYAU) zzyau.zzYo0());
        if (((zzYAU) zzyau2.zzYo1()) != null) {
            ((zzYAU) zzyau2.zzYo1()).zzt(zzyau2);
        }
        if (((zzYAU) zzyau2.zzYo0()) != null) {
            ((zzYAU) zzyau2.zzYo0()).zzu(zzyau2);
        }
        if (zzymm.zzZ9s() == null || ((zzYAU) zzymm.zzZ9s().zzYo0()) == zzyau2) {
            zzymm.zzZN(zzyau2);
        }
        if (zzymm.zzZ9r() == null || ((zzYAU) zzymm.zzZ9r().zzYo1()) == zzyau2) {
            zzymm.zzZM(zzyau2);
        }
        zzyau2.zzZ(zzymm);
        zzymm.zzX(zzyau2).zzU(zzyau2);
        zzyau2.zzZZJ();
        if (zzyau2 instanceof zzYAA) {
            return;
        }
        zzY44.zzZ5(zzyau2);
        zzY44.zzZ4(zzyau2);
        zzymm.zz6b();
    }

    private void zzY5m() {
        this.zzXbR = new HashMap<>();
    }

    private void zzZ(zzYMM zzymm, zzYAU zzyau, zzYAU zzyau2) throws Exception {
        while (zzyau != null) {
            if (zzyau2.zzYKV() && zzyau.zzYTl() != zzyau2.zzYTl()) {
                zzZ32 zzz32ZzX = zzZ32.zzX(zzyau2.zzY6N());
                zzz32ZzX.zzTJ(false);
                zzyau2.zzU(zzZ32.zzW(zzz32ZzX));
                zzyau2.zzYKV();
            }
            if (zzyau2.zzYKV() || zzY9R.zzmQ(zzyau2.zzZo6())) {
                zzZ(zzymm, zzyau2);
                zzY(zzymm, zzyau, zzyau2);
                return;
            }
            if (zzymm.zzZ9r() == null || zzymm.zzZ9r() == ((zzYAU) zzyau.zzYo0())) {
                zzymm.zzYTl();
                zzY(zzymm, zzyau, zzyau2);
                zzY(zzymm, zzyau2);
                if (zzyau2.zzYTm() && ((zzYAU) zzyau2.zzYo0()) != null && !zzY9R.zzmQ(((zzYAU) zzyau2.zzYo0()).zzZo6())) {
                    zzY(((zzYAU) zzyau2.zzYo0()).zzY6S(), (zzYAU) zzyau2.zzYo0());
                }
                zzZn(zzyau2);
                return;
            }
            zzYAU zzyau3 = (zzYAU) zzyau.zzYo0();
            if (zzyau3 == null || zzyau3.zzY6S() != zzymm) {
                if (zzyau3 != null) {
                    zzyau3.zzY6S();
                }
                if (zzyau3 == null) {
                    zzymm = zzZ(zzymm, zzyau2.zzYTl(), true);
                } else if (zzY9R.zzmQ(zzyau3.zzZo6())) {
                    if (zzyau3.zzYTl() == zzyau2.zzYTl()) {
                        zzyau3.zzY6S();
                    }
                    zzymm = zzyau3.zzYTl() == zzyau2.zzYTl() ? zzyau3.zzY6S() : zzZ(zzyau3.zzY6S(), zzyau2.zzYTl(), false);
                } else {
                    zzY9R.zzmQ(zzyau3.zzZo6());
                    zzymm = zzZ(zzyau3.zzY6S(), zzyau2.zzYTl(), false);
                }
            } else {
                zzX(zzymm, zzyau3);
                if (zzymm.zzYTl() != zzyau2.zzYTl()) {
                    zzymm = zzZ(zzymm, zzyau2.zzYTl(), false);
                }
            }
        }
        zzY(zzymm, zzyau, zzyau2);
    }

    private void zzZk(zzYAU zzyau) throws Exception {
        zzYAU zzyau2;
        if (zzyau.zzY6Z() && zzyau.zzZo6() == 21537 && (zzyau2 = this.zzXbP) != null && zzyau2.zzYTl() == zzyau.zzYTl()) {
            zzYAS zzyas = (zzYAS) zzyau;
            boolean zZzYTa = zzyas.zza8().zzYTa();
            boolean z = false;
            boolean z2 = zzyas.zzY6N().isHidden() || zzyas.zzYKV();
            if (zZzYTa || z2 || zzyas.zzY6i()) {
                return;
            }
            if (!this.zzXGD.zza7().zzZYM()) {
                for (zzYAU zzyau3 = (zzYAU) zzyas.zzZT4(); zzyau3 != null && !zzY9R.zzmW(zzyau3.zzZo6()) && !z; zzyau3 = (zzYAU) zzyau3.zzZT4()) {
                    if (!zzyau3.zzY6Z() && !zzyau3.zzYol()) {
                        z = true;
                    }
                }
                if (!z) {
                    return;
                }
            }
            zzV(zzyas);
        }
    }

    private void zzZl(zzYAU zzyau) throws Exception {
        zzYAU zzyau2;
        if (zzY9R.zzmO(zzyau.zzZo6()) && zzyau.zzY6N().isHidden() && (zzyau2 = this.zzXbP) != null && zzyau2.zzYTl() == zzyau.zzYTl()) {
            if (!zzyau.zza8().zzYTa() || zzyau.zzYKV()) {
                zzV((zzYAS) zzyau);
            }
        }
    }

    private void zzZm(zzYAU zzyau) throws Exception {
        if (!this.zzXGD.zzaa().zzbD() || this.zzXGD.zza8().zzYTa()) {
            return;
        }
        if (zzY9R.zzmT(zzyau.zzZo6()) || zzY9R.zzmU(zzyau.zzZo6())) {
            zzYAS zzyas = (zzYAS) zzyau;
            if (!zzyas.zzY6Z()) {
                this.zzXbS = zzyas;
                return;
            }
            zzYAS zzyas2 = this.zzXbS;
            if (zzyas2 != null) {
                zzyas2.zzW(zzyas);
            }
        }
    }

    private void zzZn(zzYAU zzyau) throws Exception {
        int state;
        if (zzY9R.zzmQ(zzyau.zzZo6())) {
            return;
        }
        zzYAS zzyas = (zzYAS) zzyau;
        if (zzY9R.zzmO(zzyau.zzZo6())) {
            zzyau.zzY6S().zzZ(zzyas.zzY6c());
        }
        if (zzY9R.zzmP(zzyau.zzZo6())) {
            if (zzyau.zzaa().zzbD()) {
                zzyau.zzY6S().zzYTk().zzZ(zzyas.zzY69());
                return;
            }
            return;
        }
        boolean z = false;
        this.zzXbQ = zzyas.zza8() != null && zzyas.zza8().zzYSR().zzYkW();
        Table parentTable = zzyas.zzY67().getParentTable();
        if (parentTable != null) {
            zzY6U zzy6uZzXXf = parentTable.zzZYf().zzXXf();
            boolean zZzZ = zzY6U.zzZ(zzy6uZzXXf);
            state = zzy6uZzXXf != null ? zzy6uZzXXf.getState() : 0;
            z = zZzZ;
        } else {
            state = 0;
        }
        zzZ(zzyas, z);
        zzZ(zzyas, state);
        zzZ(zzyau, zzyas, parentTable, z);
    }

    private void zzZo(zzYAU zzyau) throws Exception {
        zzZ(this.zzXGD, this.zzXbP, zzyau);
    }

    public final void zz5(zzYAU zzyau) throws Exception {
        if (zzyau.zzY6Z()) {
            zzyau.zzY6X();
        }
        zzZl(zzyau);
        zzZm(zzyau);
        zzZk(zzyau);
        if (zzyau.zzY6Z()) {
            return;
        }
        if (!zzyau.zzY6X()) {
            zzZo(zzyau);
        }
        this.zzXbP = zzyau;
        zzJ(zzyau.zzY6S());
    }

    public final void zzK(zzYMM zzymm) throws Exception {
        zzYMM zzymmZzYor = this.zzXGD.zzYor();
        if (zzymmZzYor == null) {
            zzymmZzYor = this.zzXGD;
        }
        this.zzXGD = zzymm;
        while (true) {
            zzYMM zzymm2 = this.zzXGD;
            if (zzymm2 == null) {
                return;
            }
            zzI(zzymm2);
            zzYMM zzymm3 = this.zzXGD;
            if (zzymm3 == zzymmZzYor) {
                return;
            } else {
                this.zzXGD = zzymm3.zzYor();
            }
        }
    }

    public static class zzZ {
        private int[] zzV8;

        public zzZ(int i, int i2) {
            this.zzV8 = new int[]{i, i2};
        }

        public final int[] zz4O() {
            return this.zzV8;
        }

        public final int zz5q() {
            return this.zzV8[0];
        }

        public final int zzYk8() {
            return this.zzV8[0];
        }

        public final int zzYka() {
            return this.zzV8[1];
        }

        public zzZ(int i) {
            this.zzV8 = new int[]{i};
        }

        public zzZ(int[] iArr) {
            this.zzV8 = iArr;
        }
    }

    private static void zzY(zzYMM zzymm, zzYAU zzyau) throws Exception {
        zzY9R.zzmQ(zzyau.zzZo6());
        zzyau.zzY6S();
        if (zzyau.zzZo6() == 21537) {
            return;
        }
        if (zzY9R.zzmP(zzyau.zzZo6())) {
            zzymm.zza9();
            if (zzymm.zzYTp() != null) {
                zzymm.zza9().zzW(zzymm);
                return;
            }
            return;
        }
        if (zzY9R.zzmN(zzyau.zzZo6())) {
            zzymm.zza9();
            if (zzymm.zzYTp() != null) {
                zzymm.zza9().zzW(zzymm);
            }
        }
        if (zzY9R.zzmM(zzyau.zzZo6())) {
            zzymm.zza9();
            if (zzymm.zza9().zzYTp() != null) {
                zzymm.zza9().zza9().zzW(zzymm.zza9());
            }
        }
        if (zzY9R.zzmL(zzyau.zzZo6())) {
            zzymm.zza9();
            if (zzymm.zza9().zza9().zzYTp() != null) {
                zzymm.zza9().zza9().zza9().zzW(zzymm.zza9().zza9());
            }
        }
    }

    private static void zzZ(zzYMM zzymm, zzYAU zzyau) {
        int iZzYTl = zzymm.zzYTl();
        if (iZzYTl == zzyau.zzYTl()) {
            return;
        }
        zzyau.zzlT(iZzYTl);
    }

    private void zzZ(zzYAU zzyau, zzYAS zzyas, Table table, boolean z) throws Exception {
        if (zzY9R.zzmL(zzyau.zzZo6())) {
            zzY6N zzy6n = (zzY6N) zzyau.zzY6S().zza9().zza9().zza9();
            zzy6n.zzZ(zzyas.zzY6a());
            boolean z2 = zzyas.zza8() != null && zzyas.zza8().zzYT9();
            if (z) {
                zzy6n.zzZY(null);
                return;
            }
            if (z2) {
                zzy6n.zzZY(null);
                return;
            }
            int[] iArrZz4O = zzWv(table).zz4O();
            int length = iArrZz4O.length;
            zzy6n.zzZY(new int[length]);
            for (int i = 0; i < length; i++) {
                zzy6n.zzXYl()[i] = iArrZz4O[i] * 50;
            }
        }
    }

    private static zzWV zzY(zzZ6T zzz6t, int i, boolean z) throws Exception {
        zzZ6T zzz6tZzYTo = z ? zzz6t.zzYTo() : zzz6t;
        zzTG zztg = (zzTG) zzz6t.zza9();
        zzWV zzwv = null;
        while (i > 0) {
            zzY6N zzy6n = new zzY6N();
            zztg.zzZ(zzz6tZzYTo, null, zzy6n);
            zzYIC zzyic = new zzYIC();
            zzy6n.zzZ(null, null, zzyic);
            zzwv = new zzWV();
            zzyic.zzZ(null, null, zzwv);
            i--;
            zzz6tZzYTo = null;
            zztg = zzwv;
        }
        return zzwv;
    }

    private void zzZ(zzYAS zzyas, int i) throws Exception {
        if (zzY9R.zzmM(zzyas.zzZo6())) {
            zzYIC zzyic = (zzYIC) zzyas.zzY6S().zza9().zza9();
            zzyic.zzZ(zzyas.zzYk1());
            Row parentRow = zzyas.zzY67().getParentRow();
            if (i != 1) {
                zzyic.zzpg(parentRow.zzZYf().zzYk8());
                zzyic.zzpf(parentRow.zzZYf().zzYk7());
                zzyic.zzpi(parentRow.zzZYf().zzYka());
                zzyic.zzph(parentRow.zzZYf().zzYk9());
                if (i != 0 || zzZZ8.zzw(parentRow.getParentTable())) {
                    return;
                }
                zzyic.zzph(((Integer) parentRow.zzZYf().zzPj(4251)).intValue());
                return;
            }
            zzZ zzzZzWv = zzWv(parentRow);
            zzyic.zzpg(zzzZzWv.zzYk8());
            zzyic.zzpi(zzzZzWv.zzYka());
        }
    }

    private void zzZ(zzYAS zzyas, boolean z) throws Exception {
        if (!zzY9R.zzmN(zzyas.zzZo6()) || zzY9R.zzmM(zzyas.zzZo6())) {
            return;
        }
        zzWV zzwv = (zzWV) zzyas.zzY6S().zza9();
        zzwv.zzZ(zzyas.zzY6b());
        Cell cellZzZex = zzyas.zzY67().zzZex();
        int iZz5q = cellZzZex.zz6G().zz5q();
        if (!z) {
            zzwv.zzOD(Math.max(zzWv(cellZzZex).zz5q(), 1));
        } else {
            zzwv.zzOD(iZz5q);
        }
        zzwv.zzOC(iZz5q);
    }

    private static zzYMM zzZ(zzYMM zzymm, int i, boolean z) throws Exception {
        zzYMM zzymm2 = (zzYMM) zzymm.zz6u();
        int iZzYTl = zzymm.zzYTl();
        if (i == iZzYTl) {
            zzZ6T zzz6tZza9 = zzymm.zza9();
            zzYMM zzymmZzYTo = zzymm;
            if (z) {
                zzymmZzYTo = zzymm.zzYTo();
            }
            zzz6tZza9.zzZ(zzymmZzYTo, null, zzymm2);
            return zzymm2;
        }
        if (i > iZzYTl) {
            zzY(zzymm, i - iZzYTl, z).zzZ(null, null, zzymm2);
            return zzymm2;
        }
        zzZ6T zzz6tZzZ = zzZ((zzZ6T) zzymm, iZzYTl - i, z);
        zzZ6T zzz6tZza92 = zzz6tZzZ.zza9();
        if (z) {
            zzz6tZzZ = zzz6tZzZ.zzYTo();
        }
        zzz6tZza92.zzZ(zzz6tZzZ, null, zzymm2);
        return zzymm2;
    }

    private static zzZ6T zzZ(zzZ6T zzz6t, int i, boolean z) throws Exception {
        zzTG zztg = (zzTG) zzz6t.zza9();
        while (i > 0) {
            Ref ref = new Ref(zztg);
            zzZ6T zzz6tZzZ = zzZ((Ref<zzTG>) ref, zzz6t, z);
            ref.set((zzTG) ref.get());
            zzZ6T zzz6tZzZ2 = zzZ((Ref<zzTG>) ref, zzz6tZzZ, z);
            ref.set((zzTG) ref.get());
            zzz6t = zzZ((Ref<zzTG>) ref, zzz6tZzZ2, z);
            zztg = (zzTG) ref.get();
            i--;
        }
        return zzz6t;
    }

    private static zzZ6T zzZ(Ref<zzTG> ref, zzZ6T zzz6t, boolean z) throws Exception {
        if ((zzz6t.zzYTp() != null && !z) || (zzz6t.zzYTo() != null && z)) {
            zzTG zztg = ref.get();
            if (z) {
                zzz6t = zzz6t.zzYTo();
            }
            zztg.zzW(zzz6t);
        }
        zzTG zztg2 = ref.get();
        ref.set((zzTG) zztg2.zza9());
        return zztg2;
    }
}
