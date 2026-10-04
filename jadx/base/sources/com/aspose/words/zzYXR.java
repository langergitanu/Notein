package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzYXR {
    private ArrayList<zzYXQ> zzXXw;

    public zzYXR(ArrayList<zzYXQ> arrayList, int i) {
        this.zzXXw = zzZp(arrayList);
        zzI(arrayList, i);
    }

    private static int zzF(ArrayList<zzYXQ> arrayList, int i) {
        int iZzYCb = arrayList.get(i).zzYCb();
        for (int size = arrayList.size() - 1; size > i; size--) {
            zzYXQ zzyxq = arrayList.get(size);
            if (zzyxq.zzYCa() == iZzYCb) {
                return zzyxq.zzYCb();
            }
        }
        return -1;
    }

    private static int zzG(ArrayList<zzYXQ> arrayList, int i) {
        zzYXQ zzyxq;
        int iZzYCb = arrayList.get(i).zzYCb();
        do {
            i++;
            if (i >= arrayList.size()) {
                return -1;
            }
            zzyxq = arrayList.get(i);
        } while (zzyxq.zzYCa() != iZzYCb);
        return zzyxq.zzYCb();
    }

    private static int zzH(ArrayList<zzYXQ> arrayList, int i) {
        int level = arrayList.get(i).getLevel() - 1;
        for (int i2 = i - 1; i2 >= 0; i2--) {
            zzYXQ zzyxq = arrayList.get(i2);
            if (zzyxq.getLevel() == level) {
                return zzyxq.zzYCb();
            }
        }
        return -1;
    }

    private static void zzI(ArrayList<zzYXQ> arrayList, int i) {
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            arrayList.get(i2).setLength(zzR(arrayList, i2, i));
            arrayList.get(i2).zztQ(zzH(arrayList, i2));
        }
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            zzYXQ zzyxq = arrayList.get(i3);
            zzyxq.zztP(zzG(arrayList, i3));
            zzyxq.zztO(zzF(arrayList, i3));
        }
        int iMax = Math.max(2, com.aspose.words.internal.zzJB.zzWy(arrayList.size() - 1).length());
        Iterator<zzYXQ> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().zztS(iMax);
        }
    }

    private static int zzR(ArrayList<zzYXQ> arrayList, int i, int i2) {
        zzYXQ zzyxq = arrayList.get(i);
        while (true) {
            i++;
            if (i >= arrayList.size()) {
                return i2 - zzyxq.getRawOffset();
            }
            zzYXQ zzyxq2 = arrayList.get(i);
            if (zzyxq2.getLevel() <= zzyxq.getLevel() && zzyxq2.getRawOffset() > zzyxq.getRawOffset()) {
                i2 = Math.min(i2, zzyxq2.getRawOffset());
            }
        }
    }

    private static ArrayList<zzYXQ> zzZp(ArrayList<zzYXQ> arrayList) {
        boolean z;
        ArrayList<zzYXQ> arrayList2 = new ArrayList<>();
        int i = 1;
        do {
            z = false;
            for (zzYXQ zzyxq : arrayList) {
                if (zzyxq.getLevel() == i) {
                    zzyxq.zztR(arrayList2.size());
                    com.aspose.words.internal.zzZQG.zzZ(arrayList2, zzyxq);
                    z = true;
                }
            }
            i++;
        } while (z);
        return arrayList2;
    }

    public final boolean zzYCd() {
        return this.zzXXw.size() > 0;
    }

    public final ArrayList<zzYXQ> zzYCe() {
        return this.zzXXw;
    }
}
