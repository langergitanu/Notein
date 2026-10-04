package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.dn */
/* JADX INFO: loaded from: classes4.dex */
public class C7499dn extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f21747kk = new C7017h4("prst", "avLst");

    /* JADX INFO: renamed from: k4 */
    private byte f21748k4;

    /* JADX INFO: renamed from: x1 */
    private C7733g6 f21749x1;

    public C7499dn() {
        m30457du();
    }

    /* JADX INFO: renamed from: du */
    private void m30457du() {
        this.f21748k4 = (byte) -1;
    }

    /* JADX INFO: renamed from: kk */
    public final C7733g6 m30463kk() {
        return this.f21749x1;
    }

    /* JADX INFO: renamed from: x1 */
    public final byte m30464x1() {
        return this.f21748k4;
    }

    public C7499dn(final AbstractC13912i5 abstractC13912i5) {
        m30457du();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.dn.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (C7499dn.f21747kk.m27428k4(str) != 0) {
                    return false;
                }
                C7499dn.this.f21748k4 = C8392nx.m37901k4(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.dn.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (C7499dn.f21747kk.m27428k4(abstractC13912i5.mo65023fa()) != 1) {
                    return false;
                }
                C7499dn.this.f21749x1 = new C7733g6(abstractC13912i5);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C7733g6 m30461k4() {
        if (this.f21749x1 != null) {
            throw new Exception("Only one <avLst> element can be added.");
        }
        C7733g6 c7733g6 = new C7733g6();
        this.f21749x1 = c7733g6;
        return c7733g6;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m30462k4(byte b) {
        this.f21748k4 = b;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("prst", C8392nx.m37902k4(this.f21748k4));
        C7733g6 c7733g6 = this.f21749x1;
        if (c7733g6 != null) {
            c7733g6.mo6846k4("a", c3059ii, "avLst");
        }
        c3059ii.mo21898jd();
    }
}
