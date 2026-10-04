package com.aspose.slides.internal.p333p8;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p329p4.C7187kk;
import com.aspose.slides.internal.p329p4.C7188ks;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.p8.fa */
/* JADX INFO: loaded from: classes4.dex */
public class C9425fa {

    /* JADX INFO: renamed from: k4 */
    private C7187kk f34302k4;

    /* JADX INFO: renamed from: x1 */
    private Dictionary<C7188ks, Long> f34303x1;

    public C9425fa() {
        m46143k4(new Dictionary<>());
    }

    /* JADX INFO: renamed from: k4 */
    public final C7187kk m46144k4() {
        return this.f34302k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final Dictionary<C7188ks, Long> m46147x1() {
        return this.f34303x1;
    }

    /* JADX INFO: renamed from: k4 */
    private void m46143k4(Dictionary<C7188ks, Long> dictionary) {
        this.f34303x1 = dictionary;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m46145k4(C7187kk c7187kk) {
        this.f34302k4 = c7187kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m46146k4(C9425fa c9425fa) {
        Dictionary.Enumerator<C7188ks, Long> it = c9425fa.m46147x1().iterator();
        while (it.hasNext()) {
            try {
                KeyValuePair next = it.next();
                if (!m46147x1().containsKey(next.getKey())) {
                    m46147x1().addItem(next.getKey(), next.getValue());
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }
}
