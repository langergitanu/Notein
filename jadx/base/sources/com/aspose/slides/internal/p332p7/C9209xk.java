package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.xk */
/* JADX INFO: loaded from: classes4.dex */
public class C9209xk extends AbstractC7361bz {

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f32900x1 = new C7017h4("property");

    /* JADX INFO: renamed from: k4 */
    private List<w0l> f32901k4;

    public C9209xk() {
        m44454to();
    }

    /* JADX INFO: renamed from: to */
    private void m44454to() {
        this.f32901k4 = new List<>();
    }

    /* JADX INFO: renamed from: x1 */
    public final w0l[] m44456x1() {
        return this.f32901k4.toArray(new w0l[0]);
    }

    public C9209xk(final AbstractC13912i5 abstractC13912i5) {
        m44454to();
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.xk.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (C9209xk.f32900x1.m27428k4(abstractC13912i5.mo65023fa()) != 0) {
                    return false;
                }
                C9209xk.this.f32901k4.addItem(new w0l(abstractC13912i5));
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final w0l m44455k4() {
        w0l w0lVar = new w0l();
        this.f32901k4.addItem(w0lVar);
        return w0lVar;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4("", str2, "http://schemas.openxmlformats.org/officeDocument/2006/custom-properties");
        if (c3059ii.mo12952k4("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes") == null) {
            c3059ii.m12954to("xmlns", "vt", null, "http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes");
        }
        List.Enumerator<w0l> it = this.f32901k4.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("", c3059ii, "property");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        c3059ii.mo21898jd();
    }
}
