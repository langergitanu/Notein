package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.huawei.hms.network.embedded.C18437z2;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.yt */
/* JADX INFO: loaded from: classes4.dex */
public class C9311yt extends AbstractC7361bz {

    /* JADX INFO: renamed from: du */
    private static final C7017h4 f33499du = new C7017h4(C18437z2.f56754h, "f", "nf", "lvl");

    /* JADX INFO: renamed from: k4 */
    private int f33500k4;

    /* JADX INFO: renamed from: kk */
    private C8212lu f33501kk;

    /* JADX INFO: renamed from: to */
    private List<C9326yy> f33502to;

    /* JADX INFO: renamed from: x1 */
    private C8212lu f33503x1;

    public C9311yt() {
        m45123m9();
    }

    /* JADX INFO: renamed from: m9 */
    private void m45123m9() {
        this.f33500k4 = 0;
        this.f33502to = new List<>();
    }

    /* JADX INFO: renamed from: du */
    public final C9326yy[] m45125du() {
        return this.f33502to.toArray(new C9326yy[0]);
    }

    /* JADX INFO: renamed from: kk */
    public final int m45129kk() {
        return this.f33500k4;
    }

    /* JADX INFO: renamed from: to */
    public final C8212lu m45130to() {
        return this.f33503x1;
    }

    public C9311yt(final AbstractC13912i5 abstractC13912i5) {
        m45123m9();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.yt.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (C9311yt.f33499du.m27428k4(str) != 0) {
                    return false;
                }
                C9311yt.this.f33500k4 = C8559pz.m39207k4(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.yt.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = C9311yt.f33499du.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 1) {
                    C9311yt.this.f33503x1 = new C8212lu(abstractC13912i5);
                } else if (iM27428k4 == 2) {
                    C9311yt.this.f33501kk = new C8212lu(abstractC13912i5);
                } else {
                    if (iM27428k4 != 3) {
                        return false;
                    }
                    C9311yt.this.f33502to.addItem(new C9326yy(abstractC13912i5));
                }
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    public final C9326yy m45131x1() {
        C9326yy c9326yy = new C9326yy();
        this.f33502to.addItem(c9326yy);
        return c9326yy;
    }

    /* JADX INFO: renamed from: k4 */
    public final C8212lu m45126k4() {
        if (this.f33503x1 != null) {
            throw new Exception("Only one <f> element can be added.");
        }
        C8212lu c8212lu = new C8212lu();
        this.f33503x1 = c8212lu;
        return c8212lu;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m45127k4(int i) {
        this.f33500k4 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m45128k4(C8212lu c8212lu) {
        this.f33503x1 = c8212lu;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1(C18437z2.f56754h, C8559pz.m39208k4(this.f33500k4));
        C8212lu c8212lu = this.f33503x1;
        if (c8212lu != null) {
            c8212lu.mo6846k4("cx", c3059ii, "f");
        }
        C8212lu c8212lu2 = this.f33501kk;
        if (c8212lu2 != null) {
            c8212lu2.mo6846k4("cx", c3059ii, "nf");
        }
        List.Enumerator<C9326yy> it = this.f33502to.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("cx", c3059ii, "lvl");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        c3059ii.mo21898jd();
    }
}
