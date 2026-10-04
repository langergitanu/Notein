package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14047bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.tg */
/* JADX INFO: loaded from: classes4.dex */
public class C8867tg extends AbstractC7361bz {

    /* JADX INFO: renamed from: k4 */
    public static final C14047bz f30732k4 = C14047bz.f47172k4.Clone();

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f30733to = new C7017h4("id", "creationId");

    /* JADX INFO: renamed from: kk */
    private C14047bz f30734kk = new C14047bz();

    /* JADX INFO: renamed from: x1 */
    private long f30735x1;

    public C8867tg() {
        m41707kk();
    }

    /* JADX INFO: renamed from: kk */
    private void m41707kk() {
        f30732k4.CloneTo(this.f30734kk);
    }

    /* JADX INFO: renamed from: k4 */
    public final long m41709k4() {
        return this.f30735x1;
    }

    public C8867tg(AbstractC13912i5 abstractC13912i5) {
        m41707kk();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.tg.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = C8867tg.f30733to.m27428k4(str);
                if (iM27428k4 == 0) {
                    C8867tg.this.f30735x1 = AbstractC7361bz.m29295ne(str2);
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                C8867tg.this.f30734kk = new C14047bz(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m41710k4(long j) {
        this.f30735x1 = j;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("id", C13850af.m65147x1(this.f30735x1));
        if (C14047bz.m66537x1(this.f30734kk, f30732k4)) {
            c3059ii.m12955x1("creationId", C14113y2.m67408k4("{", OooOO0.OooO00o(this.f30734kk), "}"));
        }
        c3059ii.mo21898jd();
    }
}
