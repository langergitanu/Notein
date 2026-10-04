package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.facebook.common.callercontext.ContextChain;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class x5q extends AbstractC7361bz {

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f32725x1 = new C7017h4("section");

    /* JADX INFO: renamed from: k4 */
    private List<bzf> f32726k4;

    public x5q() {
        m44216to();
    }

    /* JADX INFO: renamed from: to */
    private void m44216to() {
        this.f32726k4 = new List<>();
    }

    /* JADX INFO: renamed from: x1 */
    public final bzf[] m44218x1() {
        return this.f32726k4.toArray(new bzf[0]);
    }

    public x5q(final AbstractC13912i5 abstractC13912i5) {
        m44216to();
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.x5q.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (x5q.f32725x1.m27428k4(abstractC13912i5.mo65023fa()) != 0) {
                    return false;
                }
                x5q.this.f32726k4.addItem(new bzf(abstractC13912i5));
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final bzf m44217k4() {
        bzf bzfVar = new bzf();
        this.f32726k4.addItem(bzfVar);
        return bzfVar;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4("p14", str2, "http://schemas.microsoft.com/office/powerpoint/2010/main");
        if (c3059ii.mo12952k4("http://schemas.openxmlformats.org/presentationml/2006/main") == null) {
            c3059ii.m12954to("xmlns", ContextChain.TAG_PRODUCT, null, "http://schemas.openxmlformats.org/presentationml/2006/main");
        }
        List.Enumerator<bzf> it = this.f32726k4.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("p14", c3059ii, "section");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        c3059ii.mo21898jd();
    }
}
