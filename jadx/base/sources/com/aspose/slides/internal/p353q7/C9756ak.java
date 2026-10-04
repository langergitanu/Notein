package com.aspose.slides.internal.p353q7;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.q7.ak */
/* JADX INFO: loaded from: classes4.dex */
public class C9756ak extends Dictionary<Long, Dictionary<Long, C9764dq>> {
    /* JADX INFO: renamed from: k4 */
    public final void m47976k4(long j, C9764dq c9764dq) {
        if (!super.containsKey(Long.valueOf(j))) {
            super.set_Item(Long.valueOf(j), new Dictionary());
        }
        Dictionary dictionary = (Dictionary) super.get_Item(Long.valueOf(j));
        if (dictionary.containsKey(Long.valueOf(c9764dq.m48037k4()))) {
            return;
        }
        dictionary.addItem(Long.valueOf(c9764dq.m48037k4()), c9764dq);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47977k4(C9756ak c9756ak) {
        if (c9756ak == null) {
            return;
        }
        Iterator<KeyValuePair<TKey, TValue>> it = c9756ak.iterator();
        while (it.hasNext()) {
            KeyValuePair keyValuePair = (KeyValuePair) it.next();
            if (super.containsKey(keyValuePair.getKey())) {
                Dictionary.Enumerator it2 = ((Dictionary) keyValuePair.getValue()).iterator();
                while (it2.hasNext()) {
                    try {
                        m47976k4(((Long) keyValuePair.getKey()).longValue(), (C9764dq) it2.next().getValue());
                    } catch (Throwable th) {
                        if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                            it2.dispose();
                        }
                        throw th;
                    }
                }
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                }
            } else {
                super.addItem(keyValuePair.getKey(), keyValuePair.getValue());
            }
        }
    }
}
