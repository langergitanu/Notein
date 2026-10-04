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

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.wy */
/* JADX INFO: loaded from: classes4.dex */
public class C9152wy extends AbstractC7361bz {

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f32640x1 = new C7017h4("cm");

    /* JADX INFO: renamed from: k4 */
    private List<yyn> f32641k4;

    public C9152wy() {
        m44116to();
    }

    /* JADX INFO: renamed from: to */
    private void m44116to() {
        this.f32641k4 = new List<>();
    }

    /* JADX INFO: renamed from: x1 */
    public final yyn[] m44118x1() {
        return this.f32641k4.toArray(new yyn[0]);
    }

    public C9152wy(final AbstractC13912i5 abstractC13912i5) {
        m44116to();
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.wy.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (C9152wy.f32640x1.m27428k4(abstractC13912i5.mo65023fa()) != 0) {
                    return false;
                }
                C9152wy.this.f32641k4.addItem(new yyn(abstractC13912i5));
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final yyn m44117k4() {
        yyn yynVar = new yyn();
        this.f32641k4.addItem(yynVar);
        return yynVar;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(ContextChain.TAG_PRODUCT, str2, "http://schemas.openxmlformats.org/presentationml/2006/main");
        if (c3059ii.mo12952k4("http://schemas.openxmlformats.org/drawingml/2006/main") == null) {
            c3059ii.m12954to("xmlns", "a", null, "http://schemas.openxmlformats.org/drawingml/2006/main");
        }
        List.Enumerator<yyn> it = this.f32641k4.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "cm");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        c3059ii.mo21898jd();
    }
}
