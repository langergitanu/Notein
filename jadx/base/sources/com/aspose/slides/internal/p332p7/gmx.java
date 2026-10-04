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
public class gmx extends AbstractC7361bz {

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f23528to = new C7017h4("form:property-name", "office:value-type", "list-value");

    /* JADX INFO: renamed from: k4 */
    private String f23529k4;

    /* JADX INFO: renamed from: kk */
    private List<h8q> f23530kk;

    /* JADX INFO: renamed from: x1 */
    private int f23531x1;

    public gmx() {
        m32662x1();
    }

    /* JADX INFO: renamed from: x1 */
    private void m32662x1() {
        this.f23531x1 = 0;
        this.f23530kk = new List<>();
    }

    public gmx(final AbstractC13912i5 abstractC13912i5) {
        m32662x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.gmx.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = gmx.f23528to.m27428k4(str);
                if (iM27428k4 == 0) {
                    gmx.this.f23529k4 = str2;
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                gmx.this.f23531x1 = ezy.m31506k4(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.gmx.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (gmx.f23528to.m27428k4(abstractC13912i5.mo65023fa()) != 2) {
                    return false;
                }
                gmx.this.f23530kk.addItem(new h8q(abstractC13912i5));
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("form:property-name", this.f23529k4);
        c3059ii.m12955x1("office:value-type", ezy.m31507k4(this.f23531x1));
        List.Enumerator<h8q> it = this.f23530kk.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("", c3059ii, "list-value");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        c3059ii.mo21898jd();
    }
}
