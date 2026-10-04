package com.aspose.words;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: loaded from: classes6.dex */
final class zzY9K {
    private static Comparator<zzUC> zzXb9 = new zzUA();

    private static ArrayList<zzUC> zzY(zzWO zzwo, int i) {
        ArrayList<zzUC> arrayList = new ArrayList<>();
        zzZ(arrayList, zzwo, i);
        return arrayList;
    }

    public static void zzZ(zzWO zzwo, int i, int i2, zzZ98 zzz98) throws Exception {
        zzZ(zzY(zzwo, i), i2, zzz98, (Comparator<zzUC>) null);
    }

    public static void zzZ(WordAttrCollection wordAttrCollection, zzZ98 zzz98) throws Exception {
        zzZ(wordAttrCollection, 54836, zzz98, zzXb9);
    }

    public static void zzZ(WordAttrCollection wordAttrCollection, int i, zzZ98 zzz98, Comparator<zzUC> comparator) throws Exception {
        com.aspose.words.internal.zz7D<Object> zz7dZzZ = zzZ(wordAttrCollection, 54836, zzz98);
        ArrayList arrayList = new ArrayList();
        com.aspose.words.internal.zz7D<Object>.zzZ zzzZzxt = zz7dZzZ.zzxt();
        while (zzzZzxt.moveNext()) {
            com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzUC>) arrayList, new zzUC(0, 0, zzzZzxt.zzCL(), zzzZzxt.zzxv()));
        }
        zzZ((ArrayList<zzUC>) arrayList, 54836, zzz98, comparator);
    }

    public static void zzZ(zzWO zzwo, zzZ98 zzz98) throws Exception {
        zzZ(zzwo, 54834, zzz98, zzXb9);
    }

    public static void zzZ(zzWO zzwo, int i, zzZ98 zzz98, Comparator<zzUC> comparator) throws Exception {
        ArrayList arrayList = new ArrayList();
        int iZzCL = 0;
        for (int i2 = 0; i2 < zzwo.getCount(); i2++) {
            com.aspose.words.internal.zz7D<Object> zz7dZzZ = zzZ(zzwo.zzOs(i2), i, zzz98);
            zzYEF zzyef = new zzYEF();
            com.aspose.words.internal.zz7D<Object>.zzZ zzzZzxt = zz7dZzZ.zzxt();
            while (zzzZzxt.moveNext()) {
                zzyef.add(zzzZzxt.zzCL(), zzzZzxt.zzxv());
                iZzCL |= zzzZzxt.zzCL();
            }
            com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzYEF>) arrayList, zzyef);
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i3 = 0; i3 <= iZzCL; i3++) {
            zzZ((ArrayList<zzUC>) arrayList2, arrayList, i3);
        }
        zzZ((ArrayList<zzUC>) arrayList2, i, zzz98, comparator);
    }

    private static void zzZ(ArrayList<zzUC> arrayList, int i, zzZ98 zzz98, Comparator<zzUC> comparator) throws Exception {
        if (comparator != null) {
            Collections.sort(arrayList, comparator);
        }
        for (zzUC zzuc : arrayList) {
            zzz98.zzZ(i, zzuc.zzZZc(), zzuc.zzZZb(), zzuc.zzZZa(), zzuc.getValue());
        }
    }

    private static <T extends zzZS> void zzZ(ArrayList<zzUC> arrayList, Iterable<T> iterable, int i) {
        ArrayList arrayListZzT = com.aspose.words.internal.zzZQG.zzT(iterable);
        int i2 = 0;
        Object obj = ((zzZS) arrayListZzT.get(0)).get(i);
        for (int i3 = 1; i3 < arrayListZzT.size(); i3++) {
            Object obj2 = ((zzZS) arrayListZzT.get(i3)).get(i);
            if (!com.aspose.words.internal.zzZKO.equals(obj, obj2)) {
                if (obj != null) {
                    arrayList.add(new zzUC(i2, i3, i, obj));
                }
                i2 = i3;
                obj = obj2;
            }
        }
        if (obj != null) {
            arrayList.add(new zzUC(i2, arrayListZzT.size(), i, obj));
        }
    }

    private static com.aspose.words.internal.zz7D<Object> zzZ(WordAttrCollection wordAttrCollection, int i, zzZ98 zzz98) {
        com.aspose.words.internal.zz7D<Object> zz7d = new com.aspose.words.internal.zz7D<>();
        zzZ(zz7d, wordAttrCollection, i, 2, zzz98);
        zzZ(zz7d, wordAttrCollection, i, 8, zzz98);
        zzZ(zz7d, wordAttrCollection, i, 1, zzz98);
        zzZ(zz7d, wordAttrCollection, i, 4, zzz98);
        zzZ(zz7d, wordAttrCollection, i, 32, zzz98);
        zzZ(zz7d, wordAttrCollection, i, 16, zzz98);
        return zz7d;
    }

    private static void zzZ(com.aspose.words.internal.zz7D<Object> zz7d, WordAttrCollection wordAttrCollection, int i, int i2, zzZ98 zzz98) {
        Object objZzPk = wordAttrCollection.zzPk(zzz98.zzYv(i, i2));
        if (objZzPk == null) {
            return;
        }
        int i3 = zz7d.get(objZzPk);
        if (com.aspose.words.internal.zz7D.zzWm(i3)) {
            i3 = 0;
        }
        zz7d.set(objZzPk, i3 | i2);
    }
}
