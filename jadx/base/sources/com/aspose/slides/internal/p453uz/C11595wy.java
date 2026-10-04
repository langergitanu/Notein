package com.aspose.slides.internal.p453uz;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p231kk.AbstractC5788h4;
import com.aspose.slides.internal.p231kk.AbstractC5803to;
import com.aspose.slides.internal.p231kk.C5796m9;
import com.aspose.slides.internal.p231kk.C5813x1;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.uz.wy */
/* JADX INFO: loaded from: classes4.dex */
public class C11595wy extends AbstractC11580k4 {

    /* JADX INFO: renamed from: k4 */
    private boolean f39143k4;

    /* JADX INFO: renamed from: x1 */
    private IGenericList<String> f39144x1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11595wy(AbstractC5788h4 abstractC5788h4) {
        super(abstractC5788h4);
        if (m54592x1() && C5813x1.k4.f15898b3 == abstractC5788h4) {
            this.f39143k4 = true;
            return;
        }
        if (abstractC5788h4.m23417m9() == 2) {
            this.f39144x1 = new List();
            IGenericEnumerator<AbstractC5788h4> it = ((C5796m9) abstractC5788h4).iterator();
            while (it.hasNext()) {
                try {
                    this.f39144x1.addItem(((AbstractC5803to) it.next()).mo23706x1());
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
        }
    }
}
