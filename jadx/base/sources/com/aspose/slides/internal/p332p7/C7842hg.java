package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.hg */
/* JADX INFO: loaded from: classes4.dex */
public class C7842hg extends AbstractC7361bz {

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f24056to = new C7017h4("cp", "len", "context");

    /* JADX INFO: renamed from: k4 */
    private int f24057k4;

    /* JADX INFO: renamed from: kk */
    private C8208ls f24058kk;

    /* JADX INFO: renamed from: x1 */
    private int f24059x1;

    public C7842hg() {
        m33314h4();
    }

    /* JADX INFO: renamed from: h4 */
    private void m33314h4() {
        this.f24059x1 = 0;
    }

    /* JADX INFO: renamed from: kk */
    public final int m33320kk() {
        return this.f24059x1;
    }

    /* JADX INFO: renamed from: to */
    public final C8208ls m33321to() {
        return this.f24058kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final int m33322x1() {
        return this.f24057k4;
    }

    public C7842hg(final AbstractC13912i5 abstractC13912i5) {
        m33314h4();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.hg.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = C7842hg.f24056to.m27428k4(str);
                if (iM27428k4 == 0) {
                    C7842hg.this.f24057k4 = C13850af.m65151yj(str2);
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                C7842hg.this.f24059x1 = C13850af.m65151yj(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.hg.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (C7842hg.f24056to.m27428k4(abstractC13912i5.mo65023fa()) != 2) {
                    return false;
                }
                C7842hg.this.f24058kk = new C8208ls(abstractC13912i5);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C8208ls m33318k4() {
        if (this.f24058kk != null) {
            throw new Exception("Only one <context> element can be added.");
        }
        C8208ls c8208ls = new C8208ls();
        this.f24058kk = c8208ls;
        return c8208ls;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m33323x1(int i) {
        this.f24059x1 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m33319k4(int i) {
        this.f24057k4 = i;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("cp", C13850af.m65103k4(this.f24057k4));
        int i = this.f24059x1;
        if (i != 0) {
            c3059ii.m12955x1("len", C13850af.m65103k4(i));
        }
        C8208ls c8208ls = this.f24058kk;
        if (c8208ls != null) {
            c8208ls.mo6846k4("ac", c3059ii, "context");
        }
        c3059ii.mo21898jd();
    }
}
