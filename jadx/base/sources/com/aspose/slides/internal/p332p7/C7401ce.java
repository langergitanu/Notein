package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.facebook.common.callercontext.ContextChain;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.ce */
/* JADX INFO: loaded from: classes4.dex */
public class C7401ce extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f21044kk = new C7017h4(ContextChain.TAG_INFRA, "annotation");

    /* JADX INFO: renamed from: k4 */
    private evh f21045k4;

    /* JADX INFO: renamed from: x1 */
    private int f21046x1;

    public C7401ce() {
        m29576x1();
    }

    /* JADX INFO: renamed from: x1 */
    private void m29576x1() {
        this.f21046x1 = 0;
    }

    public C7401ce(AbstractC13912i5 abstractC13912i5) {
        m29576x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.ce.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = C7401ce.f21044kk.m27428k4(str);
                if (iM27428k4 == 0) {
                    C7401ce.this.f21045k4 = new evh();
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                C7401ce.this.f21046x1 = C9369zh.m45616k4(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        evh evhVar = this.f21045k4;
        if (evhVar != null) {
            c3059ii.m12955x1(ContextChain.TAG_INFRA, evhVar.mo28309k4());
        }
        int i = this.f21046x1;
        if (i != 0) {
            c3059ii.m12955x1("annotation", C9369zh.m45617k4(i));
        }
        c3059ii.mo21898jd();
    }
}
