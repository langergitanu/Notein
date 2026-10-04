package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.huawei.hms.network.embedded.C18293o1;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class tat extends AbstractC7361bz {

    /* JADX INFO: renamed from: h4 */
    private static final C7017h4 f30648h4 = new C7017h4("disablePrompts", "xWindow", "yWindow", C18293o1.f55803f, "dataValidation");

    /* JADX INFO: renamed from: du */
    private List<vkw> f30649du;

    /* JADX INFO: renamed from: k4 */
    private boolean f30650k4;

    /* JADX INFO: renamed from: kk */
    private long f30651kk;

    /* JADX INFO: renamed from: to */
    private long f30652to;

    /* JADX INFO: renamed from: x1 */
    private long f30653x1;

    public tat() {
        m41637x1();
    }

    public tat(final AbstractC13912i5 abstractC13912i5) {
        m41637x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.tat.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = tat.f30648h4.m27428k4(str);
                if (iM27428k4 == 0) {
                    tat.this.f30650k4 = C13850af.m65068c5(str2);
                    return true;
                }
                if (iM27428k4 == 1) {
                    tat.this.f30653x1 = AbstractC7361bz.m29295ne(str2);
                    return true;
                }
                if (iM27428k4 == 2) {
                    tat.this.f30651kk = AbstractC7361bz.m29295ne(str2);
                    return true;
                }
                if (iM27428k4 != 3) {
                    return false;
                }
                tat.this.f30652to = AbstractC7361bz.m29295ne(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.tat.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (tat.f30648h4.m27428k4(abstractC13912i5.mo65023fa()) != 4) {
                    return false;
                }
                tat.this.f30649du.addItem(new vkw(abstractC13912i5));
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    private void m41637x1() {
        this.f30650k4 = false;
        this.f30653x1 = 4294967295L;
        this.f30651kk = 4294967295L;
        this.f30652to = 4294967295L;
        this.f30649du = new List<>();
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        boolean z = this.f30650k4;
        if (z) {
            c3059ii.m12955x1("disablePrompts", z ? "1" : "0");
        }
        long j = this.f30653x1;
        if ((j & 4294967295L) != 4294967295L) {
            c3059ii.m12955x1("xWindow", C13850af.m65147x1(j));
        }
        long j2 = this.f30651kk;
        if ((j2 & 4294967295L) != 4294967295L) {
            c3059ii.m12955x1("yWindow", C13850af.m65147x1(j2));
        }
        long j3 = this.f30652to;
        if ((j3 & 4294967295L) != 4294967295L) {
            c3059ii.m12955x1(C18293o1.f55803f, C13850af.m65147x1(j3));
        }
        List.Enumerator<vkw> it = this.f30649du.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("ssml", c3059ii, "dataValidation");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        c3059ii.mo21898jd();
    }
}
