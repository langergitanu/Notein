package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.pw */
/* JADX INFO: loaded from: classes3.dex */
class C14318pw {
    /* JADX INFO: renamed from: k4 */
    public static <TKey, TValue> void m69319k4(Dictionary<TKey, TValue> dictionary, Dictionary<TKey, TValue> dictionary2) {
        if (dictionary == null) {
            throw new yii(C14113y2.m67402k4("You should to set  in the '{0}' class a required parameter '{1}'!", "DictionaryExtension", "dictionaryToAdd"));
        }
        Dictionary.Enumerator<TKey, TValue> it = dictionary.iterator();
        while (it.hasNext()) {
            try {
                KeyValuePair<TKey, TValue> next = it.next();
                dictionary2.addItem(next.getKey(), next.getValue());
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }
}
