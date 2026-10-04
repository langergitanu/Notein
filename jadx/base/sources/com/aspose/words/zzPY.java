package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzPY {
    static zzPY zzZqv = new zzPY();
    private ArrayList<zzPZ> zzZqu = new ArrayList<>();

    private void zzQ(Iterable<zzT3> iterable) {
        for (zzT3 zzt3 : iterable) {
            zzZ(new zzQ0(zzt3.zzZXw(), zzt3.getValue()));
        }
    }

    private void zzR(Iterable<zzT3> iterable) {
        for (zzT3 zzt3 : iterable) {
            zzZ(new zzPX(zzt3.zzZXw(), zzt3.getValue()));
        }
    }

    private static String zzT(zzL4 zzl4) {
        zzOT zzot = (zzOT) com.aspose.words.internal.zzZKW.zzZ(zzl4, zzOT.class);
        if (zzot == null || zzot.zzP(zzL4.zzZno) || zzot.zzP(zzL4.zzZnn) || zzot.zzP(zzL4.zzZnm)) {
            return null;
        }
        return zzot.getValue();
    }

    public static zzPY zzU(zzPS zzps) {
        zzPY zzpy = zzZqv;
        zzPT zzptZzSx = zzps.zzSx("counter-reset");
        if (zzptZzSx != null) {
            ArrayList<zzT3> arrayListZzZ = zzZ(zzptZzSx.zzZWj(), 0);
            if (zzpy == zzZqv && arrayListZzZ.size() > 0) {
                zzpy = new zzPY();
            }
            zzpy.zzR(arrayListZzZ);
        }
        zzPT zzptZzSx2 = zzps.zzSx("counter-increment");
        if (zzptZzSx2 != null) {
            ArrayList<zzT3> arrayListZzZ2 = zzZ(zzptZzSx2.zzZWj(), 1);
            if (zzpy == zzZqv && arrayListZzZ2.size() > 0) {
                zzpy = new zzPY();
            }
            zzpy.zzQ(arrayListZzZ2);
        }
        return zzpy;
    }

    public final void zzZ(zzPV zzpv) {
        Iterator<zzPZ> it = this.zzZqu.iterator();
        while (it.hasNext()) {
            it.next().zzZ(zzpv);
        }
    }

    private void zzZ(zzPZ zzpz) {
        com.aspose.words.internal.zzZQG.zzZ(this.zzZqu, zzpz);
    }

    private static ArrayList<zzT3> zzZ(zzMP zzmp, int i) {
        int iZzZE;
        ArrayList<zzT3> arrayList = new ArrayList<>();
        String str = null;
        for (int i2 = 0; i2 < zzmp.getCount(); i2++) {
            zzL4 zzl4ZzMl = zzmp.zzMl(i2);
            String strZzT = zzT(zzl4ZzMl);
            if (strZzT != null) {
                if (str != null) {
                    com.aspose.words.internal.zzZQG.zzZ(arrayList, new zzT3(str, i));
                }
                str = strZzT;
            } else {
                if (str == null) {
                    arrayList.clear();
                    return arrayList;
                }
                zzNH zznh = (zzNH) com.aspose.words.internal.zzZKW.zzZ(zzl4ZzMl, zzNH.class);
                if (zznh != null) {
                    double dZzZb = com.aspose.words.internal.zzZKQ.zzZb(zznh.getDoubleValue());
                    if (com.aspose.words.internal.zzAN.zzL(dZzZb, zznh.getDoubleValue())) {
                        if (dZzZb > 2.147483647E9d) {
                            iZzZE = Integer.MAX_VALUE;
                        } else {
                            iZzZE = dZzZb < -2.147483648E9d ? Integer.MIN_VALUE : com.aspose.words.internal.zzAN.zzZE(dZzZb);
                        }
                        com.aspose.words.internal.zzZQG.zzZ(arrayList, new zzT3(str, iZzZE));
                        str = null;
                    } else {
                        arrayList.clear();
                        return arrayList;
                    }
                } else {
                    arrayList.clear();
                    return arrayList;
                }
            }
        }
        if (str != null) {
            com.aspose.words.internal.zzZQG.zzZ(arrayList, new zzT3(str, i));
        }
        return arrayList;
    }
}
