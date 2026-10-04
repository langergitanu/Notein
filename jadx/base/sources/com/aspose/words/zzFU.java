package com.aspose.words;

import com.aspose.words.internal.zzZYG;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzFU {
    private zzY zzZeL;
    private zzX zzZeM;
    private zzW zzZeN;
    private zzU zzZeO;

    public static class zzQ {
        private double zzZer;
        private double zzZes;

        public zzQ(double d, double d2) {
            this.zzZes = d;
            this.zzZer = d2;
        }

        public final double zzZNI() {
            return this.zzZer;
        }

        public final double zzZNJ() {
            return this.zzZes;
        }
    }

    public static class zzR implements Comparator<zzE9> {
        private zzR() {
        }

        private static int zzZ(zzE9 zze9, zzE9 zze92) {
            return zze9.getIndex() - zze92.getIndex();
        }

        @Override // java.util.Comparator
        public final /* synthetic */ int compare(zzE9 zze9, zzE9 zze92) {
            return zzZ(zze9, zze92);
        }

        public /* synthetic */ zzR(byte b) {
            this();
        }
    }

    public static class zzS implements Comparator<zzT> {
        private zzS() {
        }

        private static int zzZ(zzT zzt, zzT zzt2) {
            if (zzt.zzZNK() > zzt2.zzZNK()) {
                return -1;
            }
            return zzt.zzZNK() < zzt2.zzZNK() ? 1 : 0;
        }

        @Override // java.util.Comparator
        public final /* synthetic */ int compare(zzT zzt, zzT zzt2) {
            return zzZ(zzt, zzt2);
        }

        public /* synthetic */ zzS(byte b) {
            this();
        }
    }

    public static class zzT {
        private String mName;
        private int zzTL;
        private double zzZet;
        private int zzZeu;
        private int zzZev;

        public zzT(String str, int i, int i2, int i3) {
            this.mName = str;
            this.zzTL = i;
            this.zzZev = i2;
            this.zzZeu = i3;
        }

        public final int getIndex() {
            return this.zzTL;
        }

        public final String getName() {
            return this.mName;
        }

        public final void zzYr(double d) {
            this.zzZet = d;
        }

        public final double zzZNK() {
            return this.zzZet;
        }

        public final int zzZNL() {
            return this.zzZeu;
        }

        public final int zzZNM() {
            return this.zzZev;
        }
    }

    public static class zzU extends zzV {
        private zzQ zzZew;

        public zzU(zzQ zzq, zzCE zzce) {
            super(zzce);
            this.zzZew = zzq;
        }

        public final zzQ zzZNN() {
            return this.zzZew;
        }
    }

    public static class zzV {
        private int zzZeB;
        private zzCE zzZex;

        public zzV(zzCE zzce) {
            this.zzZex = zzce;
            this.zzZeB = zzce.zzZG9();
        }

        public final boolean zzW(zzCE zzce) {
            return this.zzZex == zzce && this.zzZeB == zzce.zzZG9();
        }
    }

    public static class zzW extends zzV {
        private int zzZF;
        private boolean zzZey;

        public zzW(int i, zzCE zzce, boolean z) {
            super(zzce);
            this.zzZF = i;
            this.zzZey = z;
        }

        public final int getCount() {
            return this.zzZF;
        }

        public final boolean zzY(zzCE zzce, boolean z) {
            return zzW(zzce) && this.zzZey == z;
        }
    }

    public static class zzX extends zzV {
        private zzT[] zzZez;

        public zzX(zzT[] zztArr, zzCE zzce) {
            super(zzce);
            this.zzZez = zztArr;
        }

        public final zzT[] zzZNO() {
            return this.zzZez;
        }
    }

    public static class zzY {
        private int zzZeA;
        private int zzZeB;
        private zzCE zzZeC;
        private int zzZeD;
        private zzCE zzZeE;
        private zzXO[] zzZeF;

        public zzY(zzXO[] zzxoArr, zzCE zzce, zzCE zzce2, int i) {
            this.zzZeF = zzxoArr;
            this.zzZeE = zzce;
            this.zzZeD = zzce.zzZG9();
            this.zzZeC = zzce2;
            this.zzZeB = zzce2.zzZG9();
            this.zzZeA = i;
        }

        public final boolean zzW(zzCE zzce, zzCE zzce2, int i) {
            return this.zzZeE == zzce && this.zzZeD == zzce.zzZG9() && this.zzZeC == zzce2 && this.zzZeB == zzce2.zzZG9() && this.zzZeA == i;
        }

        public final zzXO[] zzZNP() {
            return this.zzZeF;
        }
    }

    public static class zzZ {
        private boolean zzZeG;
        private int zzZeH;
        private int zzZeI;
        private int zzZeJ;
        private int zzZeK;

        public final int getCategoryCount() {
            return this.zzZeJ;
        }

        public final void zzLk(int i) {
            this.zzZeH = i;
        }

        public final void zzLl(int i) {
            this.zzZeI = i;
        }

        public final void zzLm(int i) {
            this.zzZeJ = i;
        }

        public final void zzLn(int i) {
            this.zzZeK = i;
        }

        public final void zzXZ(boolean z) {
            this.zzZeG = z;
        }

        public final boolean zzZNQ() {
            return this.zzZeG;
        }

        public final int zzZNR() {
            return this.zzZeH;
        }

        public final int zzZNS() {
            return this.zzZeI;
        }

        public final int zzZNT() {
            return this.zzZeK;
        }
    }

    private static String zzRy(String str) {
        return str != null ? str : "";
    }

    private static int zzU(com.aspose.words.internal.zzD3<com.aspose.words.internal.zzZYP> zzd3) {
        Iterator<com.aspose.words.internal.zzZYP> it = zzd3.zzCJ().iterator();
        int count = 0;
        while (it.hasNext()) {
            count += it.next().getCount();
        }
        return count;
    }

    public static zzZ zzY(zzCE zzce, zzCE zzce2, int i) {
        int size = zzce.zzZG8().size() - 1;
        zzEA zzea = (zzEA) zzce.zzKg(i);
        if (zzea == null) {
            return null;
        }
        String strZzRy = zzRy((String) zzea.zzZLe().get(size));
        if (com.aspose.words.internal.zzZKN.equals(strZzRy, "")) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        zzZ zzz = new zzZ();
        zzz.zzXZ(true);
        byte b = 0;
        for (int i2 = 0; i2 <= Math.max(i, zzce.zz2w()); i2++) {
            zzEA zzea2 = (zzEA) zzce.zzKg(i2);
            if (zzea2 != null) {
                String strZzRy2 = zzRy((String) zzea2.zzZLe().get(size));
                if (!com.aspose.words.internal.zzZKN.equals(strZzRy2, "")) {
                    int iZzZ = zzZ(arrayList, strZzRy2, size, i2);
                    if (zzce2.zzKg(i2) != null) {
                        ((zzT) arrayList.get(iZzZ)).zzYr(((zzT) arrayList.get(iZzZ)).zzZNK() + zzce2.zzKg(i2).getValue());
                    }
                    if (i2 != i && com.aspose.words.internal.zzZKN.equals(strZzRy2, strZzRy)) {
                        zzz.zzXZ(false);
                    }
                }
            }
        }
        Collections.sort(arrayList, new zzS(b));
        zzz.zzLn(zzX(arrayList, strZzRy));
        zzz.zzLm(arrayList.size());
        return zzz;
    }

    public final ArrayList<zzXO> zzX(zzCE zzce, zzCE zzce2, int i) {
        ArrayList<zzXO> arrayList = new ArrayList<>();
        zzY zzy = this.zzZeL;
        if (zzy != null && zzy.zzW(zzce, zzce2, i)) {
            com.aspose.words.internal.zzZQG.zzZ((ArrayList) arrayList, (Object[]) this.zzZeL.zzZNP());
            return arrayList;
        }
        HashMap map = new HashMap();
        Iterator<zzCF> it = zzce.iterator();
        while (it.hasNext()) {
            zzE9 zze9 = (zzE9) it.next();
            zze9.zzZLe().size();
            com.aspose.words.internal.zzZQF.zzY(map, Integer.valueOf(zze9.getIndex()), zze9.getStringValue());
        }
        com.aspose.words.internal.zzZYG zzzyg = new com.aspose.words.internal.zzZYG();
        Iterator<zzCF> it2 = zzce2.iterator();
        while (it2.hasNext()) {
            zzE9 zze92 = (zzE9) it2.next();
            zze92.zzZLe().size();
            String strZzRy = zzRy((String) com.aspose.words.internal.zzQW.zzZ(map, Integer.valueOf(zze92.getIndex())));
            com.aspose.words.internal.zzQP zzqp = (com.aspose.words.internal.zzQP) zzzyg.get(strZzRy);
            if (zzqp == null) {
                zzqp = new com.aspose.words.internal.zzQP();
                zzzyg.zzW(strZzRy, zzqp);
            }
            zzqp.add(zze92.getValue());
        }
        zzZYG.zzZ zzzZzr2 = zzzyg.zzr2();
        while (zzzZzr2.moveNext()) {
            com.aspose.words.internal.zzZQG.zzZ(arrayList, zzZ(zzzZzr2.zzr3(), (com.aspose.words.internal.zzQP) zzzZzr2.zzCI(), i));
        }
        this.zzZeL = new zzY((zzXO[]) arrayList.toArray(new zzXO[0]), zzce, zzce2, i);
        return arrayList;
    }

    public final zzQ zzZ(zzCE zzce) {
        if (!zzce.zzZIg()) {
            return null;
        }
        zzU zzu = this.zzZeO;
        if (zzu != null && zzu.zzW(zzce)) {
            return this.zzZeO.zzZNN();
        }
        double d = Double.MAX_VALUE;
        double d2 = -1.7976931348623157E308d;
        for (zzCF zzcf : zzce) {
            if (zzce.getValueType() == 4) {
                for (Object obj : ((zzE9) zzcf).zzZLe()) {
                    if (obj != null) {
                        double dDoubleValue = ((Double) obj).doubleValue();
                        if (dDoubleValue < d) {
                            d = dDoubleValue;
                        }
                        if (dDoubleValue > d2) {
                            d2 = dDoubleValue;
                        }
                    }
                }
            } else {
                double value = zzcf.getValue();
                if (value < d) {
                    d = value;
                }
                if (value > d2) {
                    d2 = value;
                }
            }
        }
        zzQ zzq = new zzQ(d, d2);
        this.zzZeO = new zzU(zzq, zzce);
        return zzq;
    }

    public final int zzZ(zzCE zzce, boolean z) {
        zzW zzw = this.zzZeN;
        if (zzw != null && zzw.zzY(zzce, z)) {
            return this.zzZeN.getCount();
        }
        ArrayList<zzE9> arrayListZzX = zzX(zzce);
        com.aspose.words.internal.zzD3 zzd3 = new com.aspose.words.internal.zzD3();
        int index = -1;
        boolean z2 = false;
        for (zzE9 zze9 : arrayListZzX) {
            z2 = z2 || (z && zze9.getIndex() != index + 1);
            index = zze9.getIndex();
            for (int i = 0; i < zze9.zzZLe().size(); i++) {
                String strZzRy = zzRy((String) zze9.zzZLe().get(i));
                if (!com.aspose.words.internal.zzZKN.zzU3(strZzRy) || z) {
                    com.aspose.words.internal.zzZYP zzzyp = (com.aspose.words.internal.zzZYP) zzd3.get(i);
                    if (zzzyp == null) {
                        zzzyp = new com.aspose.words.internal.zzZYP();
                        zzd3.add(i, zzzyp);
                    }
                    zzZ(zzzyp, strZzRy.toUpperCase());
                }
            }
        }
        if (z2) {
            Iterator it = zzd3.zzCJ().iterator();
            while (it.hasNext()) {
                zzZ((com.aspose.words.internal.zzZYP) it.next(), "");
            }
        }
        int iZzU = zzU(zzd3);
        this.zzZeN = new zzW(iZzU, zzce, z);
        return iZzU;
    }

    public final ArrayList<zzT> zzY(zzCE zzce) {
        ArrayList<zzT> arrayList = new ArrayList<>();
        zzX zzx = this.zzZeM;
        if (zzx != null && zzx.zzW(zzce)) {
            com.aspose.words.internal.zzZQG.zzZ((ArrayList) arrayList, (Object[]) this.zzZeM.zzZNO());
            return arrayList;
        }
        ArrayList<zzE9> arrayListZzX = zzX(zzce);
        com.aspose.words.internal.zzD3 zzd3 = new com.aspose.words.internal.zzD3();
        Iterator<zzE9> it = arrayListZzX.iterator();
        while (true) {
            boolean z = false;
            if (it.hasNext()) {
                zzE9 next = it.next();
                for (int size = next.zzZLe().size() - 1; size >= 0; size--) {
                    String str = (String) next.zzZLe().get(size);
                    if (!com.aspose.words.internal.zzZKN.zzU3(str) && (z || !com.aspose.words.internal.zzZKN.equals(str, (String) zzd3.get(size)) || size == 0)) {
                        com.aspose.words.internal.zzZQG.zzZ(arrayList, new zzT(str, arrayList.size(), size, next.getIndex()));
                        zzd3.set(size, str);
                        z = true;
                    }
                }
            } else {
                this.zzZeM = new zzX((zzT[]) arrayList.toArray(new zzT[0]), zzce);
                return arrayList;
            }
        }
    }

    private static int zzX(ArrayList<zzT> arrayList, String str) {
        for (int i = 0; i < arrayList.size(); i++) {
            if (com.aspose.words.internal.zzZKN.equals(arrayList.get(i).getName(), str)) {
                return i;
            }
        }
        return -1;
    }

    private static ArrayList<zzE9> zzX(zzCE zzce) {
        ArrayList<zzE9> arrayList = new ArrayList<>(zzce.zzZIh());
        Iterator<zzCF> it = zzce.iterator();
        while (it.hasNext()) {
            com.aspose.words.internal.zzZQG.zzZ(arrayList, (zzE9) it.next());
        }
        Collections.sort(arrayList, new zzR((byte) 0));
        return arrayList;
    }

    public static zzZ zzZ(zzCE zzce, zzCE zzce2, int i) {
        String strZzRy;
        String strZzRy2;
        zzEA zzea = (zzEA) zzce.zzKg(i);
        if (zzea == null) {
            strZzRy = "";
        } else {
            strZzRy = zzRy((String) zzea.zzZLe().get(0));
        }
        ArrayList arrayList = new ArrayList();
        zzCF zzcfZzKg = zzce2.zzKg(i);
        double value = zzcfZzKg != null ? zzcfZzKg.getValue() : Double.MAX_VALUE;
        zzZ zzz = new zzZ();
        zzz.zzLn(Integer.MAX_VALUE);
        boolean z = true;
        zzz.zzXZ(true);
        zzz.zzLk(-1);
        int i2 = 0;
        while (i2 <= Math.max(i, zzce.zz2w())) {
            zzEA zzea2 = (zzEA) zzce.zzKg(i2);
            if (zzea2 == null) {
                strZzRy2 = "";
            } else {
                strZzRy2 = zzRy((String) zzea2.zzZLe().get(0));
            }
            double value2 = zzce2.zzKg(i2) != null ? zzce2.zzKg(i2).getValue() : Double.MAX_VALUE;
            boolean z2 = z;
            int iZzZ = zzZ(arrayList, strZzRy2, 0, i2);
            if (!com.aspose.words.internal.zzZKN.equals(strZzRy2, strZzRy)) {
                if (iZzZ < zzz.zzZNT()) {
                    zzz.zzLl(zzz.zzZNS() + 1);
                    zzz.zzLk(zzz.zzZNR() + 1);
                }
            } else {
                if (value2 < value || (i2 < i && com.aspose.words.internal.zzAN.zzL(value2, value))) {
                    zzz.zzLl(zzz.zzZNS() + 1);
                }
                zzz.zzLk(zzz.zzZNR() + 1);
                zzz.zzLn(iZzZ);
                if (i2 != i) {
                    zzz.zzXZ(false);
                }
            }
            i2++;
            z = z2;
        }
        zzz.zzLm(arrayList.size());
        return zzz;
    }

    private static int zzZ(ArrayList<zzT> arrayList, String str, int i, int i2) {
        int iZzX = zzX(arrayList, str);
        if (iZzX >= 0) {
            return iZzX;
        }
        zzT zzt = new zzT(str, arrayList.size(), i, i2);
        com.aspose.words.internal.zzZQG.zzZ(arrayList, zzt);
        return zzt.getIndex();
    }

    private static void zzZ(com.aspose.words.internal.zzZYP zzzyp, String str) {
        int iZzXu = zzzyp.zzXu(str);
        if (iZzXu < 0) {
            zzzyp.insert(~iZzXu, str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x011b A[LOOP:1: B:42:0x0113->B:44:0x011b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0130 A[LOOP:2: B:46:0x0128->B:48:0x0130, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static zzXO zzZ(String str, com.aspose.words.internal.zzQP zzqp, int i) {
        double d;
        double d2;
        double d3;
        double d4;
        double d5;
        double d6;
        double d7;
        int count;
        int i2 = 0;
        if (zzqp.getCount() == 1) {
            double d8 = zzqp.get(0);
            return new zzXO(str, d8, d8, d8, d8, d8, d8, 0, 0, zzqp.toArray());
        }
        int i3 = i == 0 ? 1 : 0;
        zzqp.sort();
        int count2 = zzqp.getCount() / 2;
        double d9 = zzqp.getCount() % 2 == 0 ? (zzqp.get(count2 - 1) + zzqp.get(count2)) / 2.0d : zzqp.get(count2);
        double d10 = 0.0d;
        for (int i4 = 0; i4 < zzqp.getCount(); i4++) {
            d10 += zzqp.get(i4);
        }
        double count3 = d10 / ((double) zzqp.getCount());
        if (zzqp.getCount() <= 3) {
            int count4 = zzqp.getCount() - 1;
            double d11 = zzqp.get(0);
            if (i3 != 0) {
                d11 = (d11 + d9) / 2.0d;
            }
            double d12 = d11;
            double d13 = zzqp.get(count4);
            if (i3 != 0) {
                d13 = (d13 + d9) / 2.0d;
            }
            return new zzXO(str, zzqp.get(0), d12, d9, d13, zzqp.get(count4), count3, 0, 0, zzqp.toArray());
        }
        int i5 = (count2 + i3) / 2;
        int count5 = (zzqp.getCount() - 1) - i5;
        int count6 = (zzqp.getCount() + (i3 != 0 ? 2 : 0)) % 4;
        if (count6 == 0) {
            d = ((zzqp.get(i5 - 1) * 3.0d) + zzqp.get(i5)) / 4.0d;
            d2 = zzqp.get(count5);
            d3 = zzqp.get(count5 + 1) * 3.0d;
        } else {
            if (count6 == 1) {
                d = (zzqp.get(i5 - 1) + zzqp.get(i5)) / 2.0d;
                d4 = (zzqp.get(count5 + 1) + zzqp.get(count5)) / 2.0d;
            } else if (count6 != 2) {
                d = zzqp.get(i5);
                d4 = zzqp.get(count5);
            } else {
                d = (zzqp.get(i5 - 1) + (zzqp.get(i5) * 3.0d)) / 4.0d;
                d2 = zzqp.get(count5) * 3.0d;
                d3 = zzqp.get(count5 + 1);
            }
            d5 = d;
            double d14 = d4;
            d6 = (d14 - d5) * 1.5d;
            while (zzqp.get(i2) < d5 - d6) {
                i2++;
            }
            double d15 = zzqp.get(i2);
            d7 = d6 + d14;
            count = zzqp.getCount() - 1;
            while (zzqp.get(count) > d7) {
                count--;
            }
            return new zzXO(str, d15, d5, d9, d14, zzqp.get(count), count3, i2, (zzqp.getCount() - count) - 1, zzqp.toArray());
        }
        d4 = (d3 + d2) / 4.0d;
        d5 = d;
        double d142 = d4;
        d6 = (d142 - d5) * 1.5d;
        while (zzqp.get(i2) < d5 - d6) {
        }
        double d152 = zzqp.get(i2);
        d7 = d6 + d142;
        count = zzqp.getCount() - 1;
        while (zzqp.get(count) > d7) {
        }
        return new zzXO(str, d152, d5, d9, d142, zzqp.get(count), count3, i2, (zzqp.getCount() - count) - 1, zzqp.toArray());
    }
}
