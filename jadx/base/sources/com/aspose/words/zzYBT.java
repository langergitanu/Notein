package com.aspose.words;

import com.aspose.words.zzZ9B;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzYBT<T extends zzZ9B> implements Comparator<T> {
    private ArrayList<zzZ9B> zzXeK;

    private zzYBT(ArrayList<zzZ9B> arrayList) {
        this.zzXeK = arrayList;
    }

    public static <T extends zzZ9B> void zzS(ArrayList<T> arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            com.aspose.words.internal.zzZQG.zzZ((ArrayList<T>) arrayList2, it.next());
        }
        Collections.sort(arrayList, new zzYBT(arrayList2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.Comparator
    /* JADX INFO: renamed from: zzZ, reason: merged with bridge method [inline-methods] */
    public int compare(T t, T t2) {
        try {
            int iZzZ7 = com.aspose.words.internal.zzZKR.zzZ7(t.getZOrder_IShape(), t2.getZOrder_IShape());
            return iZzZ7 == 0 ? com.aspose.words.internal.zzZKR.zzZ7(this.zzXeK.indexOf(t), this.zzXeK.indexOf(t2)) : iZzZ7;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
