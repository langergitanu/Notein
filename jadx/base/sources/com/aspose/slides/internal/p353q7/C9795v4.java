package com.aspose.slides.internal.p353q7;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12016rv;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.q7.v4 */
/* JADX INFO: loaded from: classes4.dex */
public class C9795v4 {

    /* JADX INFO: renamed from: k4 */
    private Dictionary<Long, Dictionary<Integer, C12016rv>> f35485k4 = new Dictionary<>();

    /* JADX INFO: renamed from: x1 */
    private Dictionary<Long, Dictionary<Integer, C12016rv>> f35486x1 = new Dictionary<>();

    /* JADX INFO: renamed from: k4 */
    public final Dictionary<Long, Dictionary<Integer, C12016rv>> m48264k4() {
        return this.f35485k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final Dictionary<Long, Dictionary<Integer, C12016rv>> m48267x1() {
        return this.f35486x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m48265k4(Dictionary<Long, Dictionary<Integer, C12016rv>> dictionary) {
        this.f35485k4 = dictionary;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m48268x1(Dictionary<Long, Dictionary<Integer, C12016rv>> dictionary) {
        this.f35486x1 = dictionary;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m48266k4(C9795v4 c9795v4) {
        if (c9795v4 == null) {
            return;
        }
        Dictionary.Enumerator<Long, Dictionary<Integer, C12016rv>> it = c9795v4.m48264k4().iterator();
        while (it.hasNext()) {
            try {
                KeyValuePair next = it.next();
                if (!m48264k4().containsKey(next.getKey())) {
                    m48264k4().addItem(next.getKey(), next.getValue());
                }
            } finally {
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        it = c9795v4.m48267x1().iterator();
        while (it.hasNext()) {
            try {
                KeyValuePair next2 = it.next();
                if (!m48267x1().containsKey(next2.getKey())) {
                    m48267x1().addItem(next2.getKey(), next2.getValue());
                }
            } finally {
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
    }
}
