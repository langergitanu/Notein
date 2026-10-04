package com.aspose.slides.internal.p060ca;

import com.aspose.slides.Collections.CollectionBase;
import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14068j5;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.ek */
/* JADX INFO: loaded from: classes3.dex */
public class C2069ek extends CollectionBase {
    @Override // com.aspose.slides.Collections.CollectionBase, com.aspose.slides.Collections.IList
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public final InterfaceC2111hc get_Item(int i) {
        return (InterfaceC2111hc) getInnerList().get_Item(i);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m10490k4(InterfaceC2111hc interfaceC2111hc) {
        getInnerList().addItem(interfaceC2111hc);
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m10491k4(AbstractC14068j5 abstractC14068j5) {
        IEnumerator it = getInnerList().iterator();
        while (it.hasNext()) {
            try {
                if (C14067j2.m66727k4((InterfaceC2111hc) it.next()) == abstractC14068j5) {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        ((IDisposable) it).dispose();
                    }
                    return true;
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    ((IDisposable) it).dispose();
                }
            }
        }
    }
}
