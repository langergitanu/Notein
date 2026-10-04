package com.aspose.slides.internal.p357qc;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p416tb.C10894bv;
import com.aspose.slides.internal.p416tb.C10898dy;
import com.aspose.slides.internal.p416tb.C10922yj;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.qc.m9 */
/* JADX INFO: loaded from: classes4.dex */
public class C9836m9 extends C10894bv {

    /* JADX INFO: renamed from: k4 */
    private Dictionary<String, String> f35633k4;

    public C9836m9(C10898dy c10898dy) {
        super(c10898dy);
        this.f35633k4 = new Dictionary<>();
        m48509k4("/Header", "/Sect");
        m48509k4("/Footer", "/Sect");
        m48509k4("/Slide", "/Part");
        m48509k4("/Presentation", "/Document");
    }

    @Override // com.aspose.slides.internal.p416tb.C10894bv, com.aspose.slides.internal.p416tb.AbstractC10914up
    /* JADX INFO: renamed from: k4 */
    public void mo9082k4(C10922yj c10922yj) {
        c10922yj.m52676k4(this);
        c10922yj.m52643dy();
        Dictionary.Enumerator<String, String> it = this.f35633k4.iterator();
        while (it.hasNext()) {
            try {
                KeyValuePair next = it.next();
                c10922yj.m52666kk((String) next.getKey(), (String) next.getValue());
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        c10922yj.m52640c5();
        c10922yj.m52678x1();
    }

    /* JADX INFO: renamed from: k4 */
    private void m48509k4(String str, String str2) {
        this.f35633k4.addItem(str, str2);
    }
}
