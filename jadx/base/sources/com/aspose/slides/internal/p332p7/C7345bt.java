package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.bt */
/* JADX INFO: loaded from: classes4.dex */
public class C7345bt extends AbstractC7361bz {

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f20694to = new C7017h4("name", "value", "units");

    /* JADX INFO: renamed from: k4 */
    private String f20695k4;

    /* JADX INFO: renamed from: kk */
    private String f20696kk;

    /* JADX INFO: renamed from: x1 */
    private String f20697x1;

    public C7345bt() {
    }

    /* JADX INFO: renamed from: k4 */
    public final String m29115k4() {
        return this.f20695k4;
    }

    /* JADX INFO: renamed from: kk */
    public final String m29117kk() {
        return this.f20696kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final String m29119x1() {
        return this.f20697x1;
    }

    public C7345bt(AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.bt.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = C7345bt.f20694to.m27428k4(str);
                if (iM27428k4 == 0) {
                    C7345bt.this.f20695k4 = str2;
                    return true;
                }
                if (iM27428k4 == 1) {
                    C7345bt.this.f20697x1 = str2;
                    return true;
                }
                if (iM27428k4 != 2) {
                    return false;
                }
                C7345bt.this.f20696kk = str2;
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m29116k4(String str) {
        this.f20695k4 = str;
    }

    /* JADX INFO: renamed from: kk */
    public final void m29118kk(String str) {
        this.f20696kk = str;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m29120x1(String str) {
        this.f20697x1 = str;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("name", this.f20695k4);
        c3059ii.m12955x1("value", this.f20697x1);
        String str3 = this.f20696kk;
        if (str3 != null) {
            c3059ii.m12955x1("units", str3);
        }
        c3059ii.mo21898jd();
    }
}
