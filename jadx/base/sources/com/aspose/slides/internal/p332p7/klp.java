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
public class klp extends AbstractC7361bz {

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f25784x1 = new C7017h4("dde-connection-decl");

    /* JADX INFO: renamed from: k4 */
    private List<rtn> f25785k4;

    public klp() {
        m35516x1();
    }

    /* JADX INFO: renamed from: x1 */
    private void m35516x1() {
        this.f25785k4 = new List<>();
    }

    public klp(final AbstractC13912i5 abstractC13912i5) {
        m35516x1();
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.klp.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (klp.f25784x1.m27428k4(abstractC13912i5.mo65023fa()) != 0) {
                    return false;
                }
                klp.this.f25785k4.addItem(new rtn(abstractC13912i5));
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        List.Enumerator<rtn> it = this.f25785k4.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("text", c3059ii, "dde-connection-decl");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        c3059ii.mo21898jd();
    }
}
