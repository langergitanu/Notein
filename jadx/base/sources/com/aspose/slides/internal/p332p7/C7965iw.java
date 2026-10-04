package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.iw */
/* JADX INFO: loaded from: classes4.dex */
public class C7965iw extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f24963kk = new C7017h4("dPr", "e");

    /* JADX INFO: renamed from: k4 */
    private C8832t3 f24964k4;

    /* JADX INFO: renamed from: x1 */
    private List<C9085w3> f24965x1;

    public C7965iw() {
        m34499to();
    }

    /* JADX INFO: renamed from: to */
    private void m34499to() {
        this.f24965x1 = new List<>();
    }

    /* JADX INFO: renamed from: x1 */
    public final C9085w3[] m34503x1() {
        return this.f24965x1.toArray(new C9085w3[0]);
    }

    public C7965iw(final AbstractC13912i5 abstractC13912i5) {
        m34499to();
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.iw.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = C7965iw.f24963kk.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    C7965iw.this.f24964k4 = new C8832t3(abstractC13912i5);
                } else {
                    if (iM27428k4 != 1) {
                        return false;
                    }
                    C7965iw.this.f24965x1.addItem(new C9085w3(abstractC13912i5));
                }
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C8832t3 m34500k4() {
        return this.f24964k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m34501k4(C8832t3 c8832t3) {
        this.f24964k4 = c8832t3;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m34502k4(C9085w3 c9085w3) {
        this.f24965x1.addItem(c9085w3);
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        C8832t3 c8832t3 = this.f24964k4;
        if (c8832t3 != null) {
            c8832t3.mo6846k4("m", c3059ii, "dPr");
        }
        List.Enumerator<C9085w3> it = this.f24965x1.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("m", c3059ii, "e");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        c3059ii.mo21898jd();
    }
}
