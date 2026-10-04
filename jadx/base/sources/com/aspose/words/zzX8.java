package com.aspose.words;

import com.aspose.words.ref.RefInt;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
final class zzX8 extends zzXA {
    ArrayList<Integer> zzZAM;

    private zzX8(int i, int i2, ArrayList<Integer> arrayList) {
        super(i, i2);
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        this.zzZAM = arrayList2;
        com.aspose.words.internal.zzZQG.zzZ((ArrayList) arrayList2, (Iterable) arrayList);
    }

    public static zzX9 zzZ(zzX9 zzx9, Map<String, Integer> map, CompareOptions compareOptions) {
        Map<String, Integer> map2;
        CompareOptions compareOptions2;
        zzX9 zzx92 = new zzX9();
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        zzX7 zzx7 = null;
        int i = 0;
        int i2 = 0;
        while (i2 < zzx9.getCount()) {
            zzX7 zzx72 = (zzX7) zzx9.zzOH(i2);
            if (zzx7 != null) {
                com.aspose.words.internal.zzZNH.zzU(sb, zzx7.zzZAL);
                com.aspose.words.internal.zzZQG.zzZ((ArrayList<Integer>) arrayList, Integer.valueOf(zzx7.zze0));
            }
            if (zzZ(zzx7, zzx72) || i2 == zzx9.getCount() - 1) {
                if (i2 == zzx9.getCount() - 1) {
                    com.aspose.words.internal.zzZNH.zzU(sb, zzx72.zzZAL);
                    com.aspose.words.internal.zzZQG.zzZ((ArrayList<Integer>) arrayList, Integer.valueOf(zzx72.zze0));
                }
                int i3 = i;
                String string = sb.toString();
                int i4 = zzx9.zzOH(i3).zzZAO;
                map2 = map;
                compareOptions2 = compareOptions;
                zzZ(zzx92, map2, string, i4, arrayList, compareOptions2);
                sb.setLength(0);
                arrayList.clear();
                i = i2;
            } else {
                map2 = map;
                compareOptions2 = compareOptions;
            }
            i2++;
            map = map2;
            compareOptions = compareOptions2;
            zzx7 = zzx72;
        }
        return zzx92;
    }

    private static boolean zzZ(zzX7 zzx7, zzX7 zzx72) {
        if (zzx7 == null) {
            return false;
        }
        if (zzx72.zz6W() && !zzx7.zz6X()) {
            return false;
        }
        if (zzx72.zz6T() && !zzx7.zz6X()) {
            return false;
        }
        if (zzx72.zz6V() && zzx7.zz6W()) {
            return false;
        }
        if (zzx72.zz6V() && zzx7.zz6T()) {
            return false;
        }
        if (zzx72.zz6T() && zzx7.zz6T()) {
            return false;
        }
        if (zzx72.zz6V() && zzx7.zz6V()) {
            return false;
        }
        if (zzx7.zz6U()) {
            return true;
        }
        if (zzx72.zz6P() || zzx7.zz6P()) {
            return false;
        }
        return zzx7.zz6X() || zzx72.zz6X();
    }

    private static void zzZ(zzX9 zzx9, Map<String, Integer> map, String str, int i, ArrayList<Integer> arrayList, CompareOptions compareOptions) {
        if (com.aspose.words.internal.zzZYD.zzXk(str)) {
            if (compareOptions.getIgnoreCaseChanges()) {
                str = str.toLowerCase();
            }
            RefInt refInt = new RefInt(0);
            boolean zZzZ = com.aspose.words.internal.zzZQF.zzZ(map, str, refInt);
            int size = refInt.get();
            if (!zZzZ) {
                size = map.size() + 1;
                map.put(str, Integer.valueOf(size));
            }
            zzx9.zzZ(new zzX8(size, i, arrayList));
        }
    }
}
