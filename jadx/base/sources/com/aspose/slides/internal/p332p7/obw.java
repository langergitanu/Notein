package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.facebook.common.callercontext.ContextChain;

/* JADX INFO: loaded from: classes4.dex */
public class obw extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f27865kk = new C7017h4("lvl", "tnLst");

    /* JADX INFO: renamed from: k4 */
    private long f27866k4;

    /* JADX INFO: renamed from: x1 */
    private rqz f27867x1;

    public obw() {
        m38178x1();
        this.f27867x1 = new rqz();
    }

    /* JADX INFO: renamed from: x1 */
    private void m38178x1() {
        this.f27866k4 = 0L;
    }

    public obw(final AbstractC13912i5 abstractC13912i5) {
        m38178x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.obw.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (obw.f27865kk.m27428k4(str) != 0) {
                    return false;
                }
                obw.this.f27866k4 = AbstractC7361bz.m29295ne(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.obw.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (obw.f27865kk.m27428k4(abstractC13912i5.mo65023fa()) != 1) {
                    return false;
                }
                obw.this.f27867x1 = new rqz(abstractC13912i5);
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        long j = this.f27866k4;
        if ((4294967295L & j) != 0) {
            c3059ii.m12955x1("lvl", C13850af.m65147x1(j));
        }
        this.f27867x1.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "tnLst");
        c3059ii.mo21898jd();
    }
}
