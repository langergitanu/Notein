package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.ds */
/* JADX INFO: loaded from: classes4.dex */
public class C7508ds extends AbstractC7361bz {

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f21808to = new C7017h4("xml:id", "traceformatRef", "traceFormat");

    /* JADX INFO: renamed from: k4 */
    private String f21809k4;

    /* JADX INFO: renamed from: kk */
    private C9340z3 f21810kk;

    /* JADX INFO: renamed from: x1 */
    private String f21811x1;

    public C7508ds() {
    }

    public C7508ds(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.ds.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = C7508ds.f21808to.m27428k4(str);
                if (iM27428k4 == 0) {
                    C7508ds.this.f21809k4 = str2;
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                C7508ds.this.f21811x1 = str2;
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.ds.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (C7508ds.f21808to.m27428k4(abstractC13912i5.mo65023fa()) != 2) {
                    return false;
                }
                C7508ds.this.f21810kk = new C9340z3(abstractC13912i5);
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        String str3 = this.f21809k4;
        if (str3 != null) {
            c3059ii.m12955x1("xml:id", str3);
        }
        String str4 = this.f21811x1;
        if (str4 != null) {
            c3059ii.m12955x1("traceFormatRef", str4);
        }
        C9340z3 c9340z3 = this.f21810kk;
        if (c9340z3 != null) {
            c9340z3.mo6846k4("inkml", c3059ii, "traceFormat");
        }
        c3059ii.mo21898jd();
    }
}
