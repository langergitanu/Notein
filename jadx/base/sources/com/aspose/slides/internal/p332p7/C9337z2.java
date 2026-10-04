package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.google.firebase.messaging.Constants;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.z2 */
/* JADX INFO: loaded from: classes4.dex */
public class C9337z2 extends AbstractC7361bz {

    /* JADX INFO: renamed from: du */
    private static final C7017h4 f33650du = new C7017h4("fMove", "fResize", Constants.MessagePayloadKeys.FROM, "to");

    /* JADX INFO: renamed from: k4 */
    private boolean f33651k4;

    /* JADX INFO: renamed from: kk */
    private C8862td f33652kk;

    /* JADX INFO: renamed from: to */
    private C8862td f33653to;

    /* JADX INFO: renamed from: x1 */
    private boolean f33654x1;

    public C9337z2() {
        m45331x1();
        this.f33652kk = new C8862td();
        this.f33653to = new C8862td();
    }

    public C9337z2(final AbstractC13912i5 abstractC13912i5) {
        m45331x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.z2.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = C9337z2.f33650du.m27428k4(str);
                if (iM27428k4 == 0) {
                    C9337z2.this.f33651k4 = C13850af.m65068c5(str2);
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                C9337z2.this.f33654x1 = C13850af.m65068c5(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.z2.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = C9337z2.f33650du.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 2) {
                    C9337z2.this.f33652kk = new C8862td(abstractC13912i5);
                    return true;
                }
                if (iM27428k4 != 3) {
                    return false;
                }
                C9337z2.this.f33653to = new C8862td(abstractC13912i5);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    private void m45331x1() {
        this.f33651k4 = false;
        this.f33654x1 = false;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        boolean z = this.f33651k4;
        if (z) {
            c3059ii.m12955x1("fMove", z ? "1" : "0");
        }
        boolean z2 = this.f33654x1;
        if (z2) {
            c3059ii.m12955x1("fResize", z2 ? "1" : "0");
        }
        this.f33652kk.mo6846k4("a", c3059ii, Constants.MessagePayloadKeys.FROM);
        this.f33653to.mo6846k4("a", c3059ii, "to");
        c3059ii.mo21898jd();
    }
}
