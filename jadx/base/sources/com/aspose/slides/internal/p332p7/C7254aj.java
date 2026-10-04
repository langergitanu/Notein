package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.huawei.hms.network.embedded.C18437z2;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.aj */
/* JADX INFO: loaded from: classes4.dex */
public class C7254aj extends AbstractC7361bz {

    /* JADX INFO: renamed from: du */
    private static final C7017h4 f20095du = new C7017h4(C18437z2.f56754h, "rev", "param", "extLst");

    /* JADX INFO: renamed from: k4 */
    private int f20096k4;

    /* JADX INFO: renamed from: kk */
    private List<C8646r2> f20097kk;

    /* JADX INFO: renamed from: to */
    private C8397nz f20098to;

    /* JADX INFO: renamed from: x1 */
    private long f20099x1;

    public C7254aj() {
        m28284to();
    }

    /* JADX INFO: renamed from: to */
    private void m28284to() {
        this.f20096k4 = 0;
        this.f20099x1 = 0L;
        this.f20097kk = new List<>();
    }

    /* JADX INFO: renamed from: k4 */
    public final int m28285k4() {
        return this.f20096k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final C8646r2[] m28286x1() {
        return this.f20097kk.toArray(new C8646r2[0]);
    }

    public C7254aj(final AbstractC13912i5 abstractC13912i5) {
        m28284to();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.aj.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = C7254aj.f20095du.m27428k4(str);
                if (iM27428k4 == 0) {
                    C7254aj.this.f20096k4 = C9252y2.m44777k4(str2);
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                C7254aj.this.f20099x1 = AbstractC7361bz.m29295ne(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.aj.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = C7254aj.f20095du.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 2) {
                    C7254aj.this.f20097kk.addItem(new C8646r2(abstractC13912i5));
                    return true;
                }
                if (iM27428k4 != 3) {
                    return false;
                }
                C7254aj.this.f20098to = new C8397nz(abstractC13912i5);
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1(C18437z2.f56754h, C9252y2.m44778k4(this.f20096k4));
        long j = this.f20099x1;
        if ((4294967295L & j) != 0) {
            c3059ii.m12955x1("rev", C13850af.m65147x1(j));
        }
        List.Enumerator<C8646r2> it = this.f20097kk.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("dgm", c3059ii, "param");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        C8397nz c8397nz = this.f20098to;
        if (c8397nz != null) {
            c8397nz.mo6846k4("dgm", c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }
}
