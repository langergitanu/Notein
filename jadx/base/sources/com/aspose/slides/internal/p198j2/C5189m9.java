package com.aspose.slides.internal.p198j2;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p420th.AbstractC10957fa;
import com.aspose.slides.internal.p420th.AbstractC10972up;
import com.aspose.slides.internal.p420th.AbstractC10973uz;
import com.aspose.slides.internal.p420th.C10948ar;
import com.aspose.slides.internal.p420th.C10951c5;
import com.aspose.slides.internal.p420th.C10971um;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.j2.m9 */
/* JADX INFO: loaded from: classes.dex */
public class C5189m9 extends AbstractC10972up {

    /* JADX INFO: renamed from: k4 */
    private C10951c5 f14185k4 = null;

    /* JADX INFO: renamed from: x1 */
    private List<AbstractC10957fa[]> f14186x1 = new List<>();

    @Override // com.aspose.slides.internal.p420th.AbstractC10972up
    /* JADX INFO: renamed from: k4 */
    public void mo13522k4(C10951c5 c10951c5) {
        this.f14185k4 = c10951c5;
    }

    @Override // com.aspose.slides.internal.p420th.AbstractC10972up
    /* JADX INFO: renamed from: x1 */
    public void mo16981x1(C10948ar c10948ar) {
        List.Enumerator<AbstractC10957fa[]> it = this.f14186x1.iterator();
        while (it.hasNext()) {
            try {
                AbstractC10957fa[] next = it.next();
                next[0].m52932x1(next[1]);
                next[0].m52930k4(next[2]);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        this.f14186x1.clear();
    }

    @Override // com.aspose.slides.internal.p420th.AbstractC10972up
    /* JADX INFO: renamed from: x1 */
    public void mo13530x1(C10951c5 c10951c5) {
        this.f14185k4 = null;
    }

    @Override // com.aspose.slides.internal.p420th.AbstractC10972up
    /* JADX INFO: renamed from: x1 */
    public void mo13516x1(C10971um c10971um) {
        if (c10971um.m53095ck() != null) {
            C10951c5 c10951c5 = new C10951c5();
            c10951c5.m52906k4(C5191x1.m22167k4(c10971um.m53095ck(), C5191x1.m22168k4((AbstractC10973uz) c10971um).Clone().Clone()));
            this.f14186x1.addItem(new AbstractC10957fa[]{this.f14185k4, c10971um, c10951c5});
        }
    }
}
