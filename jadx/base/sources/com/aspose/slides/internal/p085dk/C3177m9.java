package com.aspose.slides.internal.p085dk;

import com.aspose.slides.Collections.Generic.IGenericDictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.dk.m9 */
/* JADX INFO: loaded from: classes3.dex */
public class C3177m9 {
    /* JADX INFO: renamed from: k4 */
    public static <TKey, TValue> TValue m13597k4(IGenericDictionary<TKey, TValue> iGenericDictionary, TKey tkey) {
        if (tkey == null) {
            return null;
        }
        Object[] objArr = {null};
        iGenericDictionary.tryGetValue(tkey, objArr);
        return (TValue) objArr[0];
    }

    /* JADX INFO: renamed from: k4 */
    public static <TKey, TValue> void m13598k4(IGenericDictionary<TKey, TValue> iGenericDictionary, IGenericDictionary<TKey, TValue> iGenericDictionary2, IGenericDictionary<TValue, TKey> iGenericDictionary3) {
        IGenericEnumerator<KeyValuePair<TKey, TValue>> it = iGenericDictionary.iterator();
        while (it.hasNext()) {
            try {
                KeyValuePair<TKey, TValue> next = it.next();
                iGenericDictionary2.addItem(next.getKey(), next.getValue());
                if (iGenericDictionary3 != null) {
                    iGenericDictionary3.addItem(next.getValue(), next.getKey());
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m13599k4(int i, int i2) {
        return (i & i2) == i2;
    }
}
