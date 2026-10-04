package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class xbk extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f32778kk = new C7017h4("ignoredError", "extLst");

    /* JADX INFO: renamed from: k4 */
    private List<ai9> f32779k4;

    /* JADX INFO: renamed from: x1 */
    private g3j f32780x1;

    public xbk() {
        m44288x1();
    }

    /* JADX INFO: renamed from: x1 */
    private void m44288x1() {
        this.f32779k4 = new List<>();
    }

    public xbk(final AbstractC13912i5 abstractC13912i5) {
        m44288x1();
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.xbk.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = xbk.f32778kk.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    xbk.this.f32779k4.addItem(new ai9(abstractC13912i5));
                } else {
                    if (iM27428k4 != 1) {
                        return false;
                    }
                    xbk.this.f32780x1 = new g3j(abstractC13912i5);
                }
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        List.Enumerator<ai9> it = this.f32779k4.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("ssml", c3059ii, "ignoredError");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        g3j g3jVar = this.f32780x1;
        if (g3jVar != null) {
            g3jVar.mo6846k4("ssml", c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }
}
