package com.aspose.words;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzNZ {
    private HashMap<Integer, ArrayList<zzLT>> zzZpJ;
    private ArrayList<zzLT> zzZpK = new ArrayList<>();
    static zzNZ zzZpM = new zzNZ();
    private static ArrayList<zzLT> zzZpL = new ArrayList<>(0);

    public final ArrayList<zzLT> zzMp(int i) {
        ArrayList<zzLT> arrayList;
        if (i == 0) {
            return this.zzZpK;
        }
        HashMap<Integer, ArrayList<zzLT>> map = this.zzZpJ;
        return (map == null || (arrayList = (ArrayList) com.aspose.words.internal.zzQW.zzZ(map, Integer.valueOf(i))) == null) ? zzZpL : arrayList;
    }

    public final void zzZ(ArrayList<zzMD> arrayList, zzPS zzps) {
        zzZ(0, arrayList, zzps);
        zzZ(1, arrayList, zzps);
        zzZ(2, arrayList, zzps);
    }

    public final ArrayList<zzMD> zzZVS() {
        ArrayList<zzMD> arrayList = new ArrayList<>();
        ArrayList<zzLT> arrayListZzMp = zzMp(0);
        if (arrayListZzMp != null) {
            Iterator<zzLT> it = arrayListZzMp.iterator();
            while (it.hasNext()) {
                for (zzMD zzmd : it.next().zzZUV()) {
                    arrayList.add(zzmd);
                }
            }
        }
        return arrayList;
    }

    private void zzZ(int i, ArrayList<zzMD> arrayList, zzPS zzps) {
        ArrayList arrayList2 = new ArrayList();
        for (zzMD zzmd : arrayList) {
            if (zzmd.zzZWt() == i) {
                com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzMD>) arrayList2, zzmd);
            }
        }
        if (arrayList2.size() > 0) {
            zzZ(i, new zzLT((zzMD[]) arrayList2.toArray(new zzMD[0]), zzps));
        }
    }

    private void zzZ(int i, zzLT zzlt) {
        if (i == 0) {
            com.aspose.words.internal.zzZQG.zzZ(this.zzZpK, zzlt);
            return;
        }
        if (this.zzZpJ == null) {
            this.zzZpJ = new HashMap<>();
        }
        ArrayList<zzLT> arrayList = (ArrayList) com.aspose.words.internal.zzQW.zzZ(this.zzZpJ, Integer.valueOf(i));
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.zzZpJ.put(Integer.valueOf(i), arrayList);
        }
        com.aspose.words.internal.zzZQG.zzZ(arrayList, zzlt);
    }
}
