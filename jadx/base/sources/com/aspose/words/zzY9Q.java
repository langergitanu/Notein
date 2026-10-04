package com.aspose.words;

import androidx.appcompat.view.menu.C21505OooO0Oo;
import com.aspose.words.ref.Ref;
import com.huawei.hms.network.embedded.C18241k5;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
final class zzY9Q {
    private boolean zzWD;
    private boolean zzXbl = zzZ3X.zzYNB();
    private int zzYQD;
    private zzYAU zzYdi;
    private zzYAU zzYdj;

    private void zzF(zzYAU zzyau, zzYAU zzyau2) throws Exception {
        zzZ55 zzz55 = (zzZ55) zzyau.zzZZJ();
        this.zzYQD = zzz55.zza8().getNumeralFormat();
        this.zzWD = zzz55.zz5T();
        ArrayList<zzYAU> arrayList = new ArrayList<>();
        ArrayList<zzYAU> arrayList2 = new ArrayList<>();
        ArrayList<zzYAU> arrayList3 = new ArrayList<>();
        zzYA5 zzya5 = (zzYA5) com.aspose.words.internal.zzZKW.zzZ(zzyau, zzYA5.class);
        while (zzyau != zzyau2) {
            if (zzya5 == null) {
                zzya5 = (zzYA5) com.aspose.words.internal.zzZKW.zzZ(zzyau, zzYA5.class);
            }
            if (zzya5 != null && zzya5.zzZj(zzyau)) {
                com.aspose.words.internal.zzZQG.zzZ(arrayList2, zzyau);
            } else if (zzyau.zzY7a()) {
                com.aspose.words.internal.zzZQG.zzZ(arrayList3, zzyau);
            } else {
                com.aspose.words.internal.zzZQG.zzZ(arrayList, zzyau);
            }
            zzyau = (zzYAU) zzyau.zzYo1();
        }
        if (!zzY9R.zzmW(zzyau2.zzZo6())) {
            com.aspose.words.internal.zzZQG.zzZ(arrayList, zzyau2);
        }
        if (arrayList.size() <= 0 && arrayList2.size() <= 0 && arrayList3.size() <= 0) {
            zzY9R.zzmW(zzyau2.zzZo6());
            this.zzYdj = zzyau2;
            this.zzYdi = zzyau2;
        } else {
            ArrayList<zzYAU> arrayListZzY = zzY(arrayList, arrayList2, arrayList3);
            if (zzY9R.zzmW(zzyau2.zzZo6())) {
                com.aspose.words.internal.zzZQG.zzZ(arrayListZzY, zzyau2);
            }
            zzZ(arrayListZzY, zzz55, zzyau2);
            this.zzYdj = arrayListZzY.get(0);
            this.zzYdi = (zzYAU) C21505OooO0Oo.OooO00o(1, arrayListZzY);
        }
    }

    public static zzY9Q zzG(zzYAU zzyau, zzYAU zzyau2) throws Exception {
        zzY9Q zzy9q = new zzY9Q();
        zzy9q.zzF(zzyau, zzyau2);
        return zzy9q;
    }

    private static boolean zzY(boolean z, boolean z2, boolean z3, boolean z4) {
        return z4 ? !z2 : z2 || z != z3;
    }

    private zzJQ<zzJQ<zzJP>> zzYY(ArrayList<zzYAU> arrayList) throws Exception {
        zzJQ<zzJQ<zzJP>> zzjq = new zzJQ<>(this.zzWD);
        if (arrayList.size() == 0) {
            return zzjq;
        }
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            zzYAU zzyau = arrayList.get(i2);
            boolean z3 = zzyau.zzZo6() == 25604;
            if ((zzZe(zzyau) || z3) && (!z3 || !z2)) {
                boolean zZzY7b = (zzyau.zzY7r() == 5121 || z3) ? this.zzWD : zzyau.zzY7b();
                if (z2 && zZzY7b != z) {
                    zzjq.add(zzZ(arrayList, i, i2 - 1, z));
                    i = i2;
                    z = zZzY7b;
                }
                if (!z2) {
                    z = zZzY7b;
                    z2 = true;
                }
            }
        }
        zzjq.add(zzZ(arrayList, i, arrayList.size() - 1, z));
        return zzjq;
    }

    private static void zzZ(ArrayList<zzYAU> arrayList, zzZ55 zzz55, zzYAU zzyau) {
        int i = 0;
        zzz55.zzZW(arrayList.get(0));
        zzz55.zzZV((zzYAU) C21505OooO0Oo.OooO00o(1, arrayList));
        if (zzyau != null && ((zzYAU) zzyau.zzYo1()) != null) {
            zzz55.zzYQk().zzZy((zzYAU) zzyau.zzYo1());
        }
        while (i < arrayList.size()) {
            zzYAU zzyau2 = arrayList.get(i);
            zzYAU zzyau3 = null;
            zzYAU zzyau4 = i < arrayList.size() - 1 ? arrayList.get(i + 1) : null;
            if (i > 0) {
                zzyau3 = arrayList.get(i - 1);
            }
            zzyau2.zzZy(zzyau4);
            zzyau2.zzZz(zzyau3);
            i++;
        }
        if (((zzZ55) zzz55.zzYo0()) != null) {
            zzZ55 zzz552 = (zzZ55) zzz55.zzYo0();
            zzz552.zzYQk().zzZy(zzz55.zzYQl());
            zzz55.zzYQl().zzZz(zzz552.zzYQk());
        }
    }

    public static void zzZS(zzZ55 zzz55) {
        for (zzYAU zzyauZzY6R = (zzYAU) zzz55.zz6x(); zzyauZzY6R != null; zzyauZzY6R = zzyauZzY6R.zzY6R()) {
            zzyauZzY6R.zzY6T();
        }
        zzz55.zzZW(null);
        zzz55.zzZV(null);
    }

    private static boolean zzZe(zzYAU zzyau) throws Exception {
        return (zzY9R.zzmY(zzyau.zzZo6()) || zzyau.zzZo6() == 10754 || zzyau.zzZo6() == 12803) && com.aspose.words.internal.zzZYD.zzXk(zzyau.getText());
    }

    private static boolean zzlr(int i) {
        return i == 7 || i == 4;
    }

    private static boolean zzls(int i) {
        return i == 3 || i == 6;
    }

    public final zzYAU zzYQk() {
        return this.zzYdi;
    }

    public final zzYAU zzYQl() {
        return this.zzYdj;
    }

    private ArrayList<zzYAU> zzY(ArrayList<zzYAU> arrayList, ArrayList<zzYAU> arrayList2, ArrayList<zzYAU> arrayList3) throws Exception {
        ArrayList<zzYAU> arrayList4 = new ArrayList<>(arrayList3.size() + arrayList2.size() + arrayList.size());
        if (!this.zzWD) {
            com.aspose.words.internal.zzZQG.zzZ((ArrayList) arrayList4, (Iterable) arrayList3);
            com.aspose.words.internal.zzZQG.zzZ((ArrayList) arrayList4, (Iterable) arrayList2);
        }
        for (zzJQ<zzJP> zzjq : zzYY(arrayList)) {
            ArrayList arrayList5 = new ArrayList();
            boolean zZzZSu = zzjq.zzZSu();
            for (zzJP zzjp : zzjq) {
                if (!zzjp.zzZSt()) {
                    zZzZSu = zzjp.zzZSu();
                }
                if (zZzZSu != zzjq.zzZSu()) {
                    com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzJP>) arrayList5, zzjp);
                } else {
                    for (int size = arrayList5.size() - 1; size >= 0; size--) {
                        com.aspose.words.internal.zzZQG.zzZ((ArrayList) arrayList4, (Iterable) arrayList5.get(size));
                    }
                    arrayList5.clear();
                    com.aspose.words.internal.zzZQG.zzZ((ArrayList) arrayList4, (Iterable) zzjp);
                }
            }
            for (int size2 = arrayList5.size() - 1; size2 >= 0; size2--) {
                com.aspose.words.internal.zzZQG.zzZ((ArrayList) arrayList4, (Iterable) arrayList5.get(size2));
            }
        }
        if (this.zzWD) {
            zzZ(arrayList4, arrayList2, arrayList3);
        }
        if (this.zzWD) {
            Collections.reverse(arrayList4);
        }
        return arrayList4;
    }

    private void zzZ(Collection<zzYAU> collection, ArrayList<zzYAU> arrayList, ArrayList<zzYAU> arrayList2) throws Exception {
        if (arrayList2.size() > 0) {
            int size = arrayList2.size();
            while (true) {
                size--;
                if (C18241k5.f55433h.equals(arrayList2.get(size).getText()) || size <= 0) {
                    break;
                } else {
                    collection.add(arrayList2.get(size));
                }
            }
            collection.add(arrayList2.get(size));
            for (int i = 0; i < size; i++) {
                collection.add(arrayList2.get(i));
            }
        }
        if (arrayList.size() > 0) {
            ArrayList<zzYAU> arrayListZzY = zzY(arrayList, new ArrayList<>(), new ArrayList<>());
            for (int size2 = arrayListZzY.size() - 1; size2 >= 0; size2--) {
                collection.add(arrayListZzY.get(size2));
            }
        }
    }

    private static HashMap<zzYAU, com.aspose.words.internal.zzY3> zzY(ArrayList<zzYAU> arrayList, int i, int i2, boolean z) throws Exception {
        int i3 = (i2 - i) + 1;
        int[] iArr = new int[i3];
        com.aspose.words.internal.zzY2[] zzy2Arr = new com.aspose.words.internal.zzY2[i3];
        int i4 = 0;
        while (i <= i2) {
            zzYAU zzyau = arrayList.get(i);
            if (zzZe(zzyau)) {
                zzy2Arr[i4] = new com.aspose.words.internal.zzY2(zzyau.zzZo6() == 12803 ? "\t" : zzyau.getText(), zzZ3X.zzwI(zzyau.zzZo2()), zzZ3X.zzwJ(zzyau.zzZo2()));
                iArr[i4] = i;
                i4++;
            }
            i++;
        }
        HashMap<zzYAU, com.aspose.words.internal.zzY3> map = new HashMap<>();
        if (i4 > 0) {
            Ref ref = new Ref(zzy2Arr);
            com.aspose.words.internal.zzZKV.zzZ(ref, i4);
            for (com.aspose.words.internal.zzY3 zzy3 : com.aspose.words.internal.zzY9.zzZ((com.aspose.words.internal.zzY2[]) ref.get(), z, false, false)) {
                int i5 = iArr[zzy3.zzXm()];
                if (!map.containsKey(arrayList.get(i5))) {
                    com.aspose.words.internal.zzZQF.zzY(map, arrayList.get(i5), zzy3);
                }
            }
        }
        return map;
    }

    private zzJQ<zzJP> zzZ(ArrayList<zzYAU> arrayList, int i, int i2, boolean z) throws Exception {
        ArrayList<zzYAU> arrayList2 = arrayList;
        HashMap<zzYAU, com.aspose.words.internal.zzY3> mapZzY = zzY(arrayList, i, i2, z);
        if (mapZzY.size() == 0) {
            zzJP zzjp = new zzJP(z);
            for (int i3 = i; i3 <= i2; i3++) {
                zzjp.add(arrayList2.get(i3));
            }
            return new zzJQ<>(zzjp);
        }
        zzJQ<zzJP> zzjq = new zzJQ<>(z);
        zzYAU zzyau = null;
        int i4 = i;
        int i5 = -1;
        boolean z2 = false;
        boolean zZzls = false;
        while (i4 <= i2) {
            zzYAU zzyau2 = arrayList2.get(i4);
            if (mapZzY.containsKey(zzyau2)) {
                int iZzXi = mapZzY.get(zzyau2).zzXi();
                boolean z3 = (zzyau2 instanceof zzYAD) && zzyau2.zzY7b();
                boolean z4 = z3 || mapZzY.get(zzyau2).zzXn();
                boolean z5 = !z3 && zzls(iZzXi);
                zzY9S zzy9s = (zzY9S) com.aspose.words.internal.zzZKW.zzZ(zzyau2, zzY9S.class);
                if (zzy9s != null && zzyau2.getText().length() == 1) {
                    zzZ(zzy9s, iZzXi);
                    if (zzyau != null) {
                        zzZ(zzy9s, iZzXi, zzyau, mapZzY.get(zzyau).zzXi());
                    }
                }
                if (i5 == -1) {
                    zZzls = zzls(iZzXi);
                    i5 = i;
                    z2 = z4;
                } else if (zzY(z4, z5, z2, zZzls)) {
                    zzjq.add(new zzJP(arrayList, i5, i4 - i5, z2, zZzls));
                    zZzls = zzls(iZzXi);
                    z2 = z4;
                    i5 = i4;
                }
                zzyau2.zzQI(mapZzY.get(zzyau2).zzXn());
                zzyau = zzyau2;
            }
            i4++;
            arrayList2 = arrayList;
        }
        zzjq.add(new zzJP(arrayList, i5, 1 + (i2 - i5), z2, zZzls));
        return zzjq;
    }

    private void zzZ(zzY9S zzy9s, int i) throws Exception {
        char cCharAt = zzy9s.getText().charAt(0);
        if (!this.zzXbl || cCharAt != ',' || zzls(i) || i == 0) {
            return;
        }
        zzy9s.zzY4L();
    }

    private void zzZ(zzY9S zzy9s, int i, zzYAU zzyau, int i2) throws Exception {
        int iZzc = com.aspose.words.internal.zzZVU.zzc(zzy9s.getText().charAt(0));
        if (zzyau != null && zzls(i2) && zzls(i) && zzlr(iZzc)) {
            zzZ(zzy9s, zzyau.zzY6N());
            if (this.zzYQD == 1) {
                zzy9s.zzY4K();
            }
        }
    }

    private static void zzZ(zzYAU zzyau, zzZ32 zzz32) throws Exception {
        if (zzyau.zzZo6() == 9217) {
            com.aspose.words.internal.zzZYD.zzXk(zzyau.getText());
        }
        boolean zZzK = com.aspose.words.internal.zzUX.zzK(zzyau.getText().charAt(0));
        if (zzz32.zzYL5() == zzyau.zzY6N().zzYL5()) {
            if ((zZzK || com.aspose.words.internal.zzZKN.equals(zzz32.getName(), zzyau.zzY6N().getName())) && (!zZzK || "Times New Roman".equals(zzyau.zzY6N().getName()))) {
                return;
            }
            zzZ32 zzz32ZzX = zzZ32.zzX(zzz32);
            if (zZzK) {
                zzz32ZzX.setName("Times New Roman");
            }
            zzyau.zzU(zzZ32.zzW(zzz32ZzX));
            zzyau.setContentWidth(Integer.MIN_VALUE);
        }
    }
}
