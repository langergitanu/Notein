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
public class xgx extends AbstractC7361bz {

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f32829x1 = new C7017h4("author");

    /* JADX INFO: renamed from: k4 */
    private List<rq8> f32830k4;

    public xgx() {
        m44351to();
    }

    /* JADX INFO: renamed from: to */
    private void m44351to() {
        this.f32830k4 = new List<>();
    }

    /* JADX INFO: renamed from: x1 */
    public final rq8[] m44353x1() {
        return this.f32830k4.toArray(new rq8[0]);
    }

    public xgx(final AbstractC13912i5 abstractC13912i5) {
        m44351to();
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.xgx.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (xgx.f32829x1.m27428k4(abstractC13912i5.mo65023fa()) != 0) {
                    return false;
                }
                xgx.this.f32830k4.addItem(new rq8(abstractC13912i5));
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final rq8 m44352k4() {
        rq8 rq8Var = new rq8();
        this.f32830k4.addItem(rq8Var);
        return rq8Var;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4("p188", str2, "http://schemas.microsoft.com/office/powerpoint/2018/8/main");
        if (c3059ii.mo12952k4("http://schemas.openxmlformats.org/presentationml/2006/main") == null) {
            c3059ii.m12954to("xmlns", ContextChain.TAG_PRODUCT, null, "http://schemas.openxmlformats.org/presentationml/2006/main");
        }
        List.Enumerator<rq8> it = this.f32830k4.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("p188", c3059ii, "author");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        c3059ii.mo21898jd();
    }
}
