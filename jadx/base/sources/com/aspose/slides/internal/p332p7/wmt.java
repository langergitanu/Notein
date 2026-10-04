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
public class wmt extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f32419kk = new C7017h4("c", "extLst");

    /* JADX INFO: renamed from: k4 */
    private List<ay6> f32420k4;

    /* JADX INFO: renamed from: x1 */
    private g3j f32421x1;

    public wmt() {
        m43822x1();
    }

    /* JADX INFO: renamed from: x1 */
    private void m43822x1() {
        this.f32420k4 = new List<>();
    }

    public wmt(final AbstractC13912i5 abstractC13912i5) {
        m43822x1();
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.wmt.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = wmt.f32419kk.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    wmt.this.f32420k4.addItem(new ay6(abstractC13912i5));
                } else {
                    if (iM27428k4 != 1) {
                        return false;
                    }
                    wmt.this.f32421x1 = new g3j(abstractC13912i5);
                }
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4("ssml", str2, "http://schemas.openxmlformats.org/spreadsheetml/2006/main");
        List.Enumerator<ay6> it = this.f32420k4.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("ssml", c3059ii, "c");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        g3j g3jVar = this.f32421x1;
        if (g3jVar != null) {
            g3jVar.mo6846k4("ssml", c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }
}
