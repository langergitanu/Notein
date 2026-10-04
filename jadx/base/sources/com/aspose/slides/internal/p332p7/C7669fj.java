package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.fj */
/* JADX INFO: loaded from: classes4.dex */
public class C7669fj extends AbstractC7361bz {

    /* JADX INFO: renamed from: du */
    private static final C7017h4 f22825du = new C7017h4("r:dm", "r:lo", "r:qs", "r:cs");

    /* JADX INFO: renamed from: k4 */
    private String f22826k4;

    /* JADX INFO: renamed from: kk */
    private String f22827kk;

    /* JADX INFO: renamed from: to */
    private String f22828to;

    /* JADX INFO: renamed from: x1 */
    private String f22829x1;

    public C7669fj() {
    }

    /* JADX INFO: renamed from: k4 */
    public final String m31788k4() {
        return this.f22826k4;
    }

    /* JADX INFO: renamed from: kk */
    public final String m31790kk() {
        return this.f22827kk;
    }

    /* JADX INFO: renamed from: to */
    public final String m31792to() {
        return this.f22828to;
    }

    /* JADX INFO: renamed from: x1 */
    public final String m31794x1() {
        return this.f22829x1;
    }

    public C7669fj(AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.fj.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = C7669fj.f22825du.m27428k4(str);
                if (iM27428k4 == 0) {
                    C7669fj.this.f22826k4 = str2;
                    return true;
                }
                if (iM27428k4 == 1) {
                    C7669fj.this.f22829x1 = str2;
                    return true;
                }
                if (iM27428k4 == 2) {
                    C7669fj.this.f22827kk = str2;
                    return true;
                }
                if (iM27428k4 != 3) {
                    return false;
                }
                C7669fj.this.f22828to = str2;
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m31789k4(String str) {
        this.f22826k4 = str;
    }

    /* JADX INFO: renamed from: kk */
    public final void m31791kk(String str) {
        this.f22827kk = str;
    }

    /* JADX INFO: renamed from: to */
    public final void m31793to(String str) {
        this.f22828to = str;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m31795x1(String str) {
        this.f22829x1 = str;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4("dgm", str2, "http://schemas.openxmlformats.org/drawingml/2006/diagram");
        if (c3059ii.mo12952k4("http://schemas.openxmlformats.org/officeDocument/2006/relationships") == null) {
            c3059ii.m12954to("xmlns", "r", null, "http://schemas.openxmlformats.org/officeDocument/2006/relationships");
        }
        if (c3059ii.mo12952k4("http://schemas.openxmlformats.org/officeDocument/2006/relationships") == null) {
            c3059ii.m12954to("xmlns", "r", null, "http://schemas.openxmlformats.org/officeDocument/2006/relationships");
        }
        c3059ii.m12955x1("r:dm", this.f22826k4);
        if (c3059ii.mo12952k4("http://schemas.openxmlformats.org/officeDocument/2006/relationships") == null) {
            c3059ii.m12954to("xmlns", "r", null, "http://schemas.openxmlformats.org/officeDocument/2006/relationships");
        }
        c3059ii.m12955x1("r:lo", this.f22829x1);
        if (c3059ii.mo12952k4("http://schemas.openxmlformats.org/officeDocument/2006/relationships") == null) {
            c3059ii.m12954to("xmlns", "r", null, "http://schemas.openxmlformats.org/officeDocument/2006/relationships");
        }
        c3059ii.m12955x1("r:qs", this.f22827kk);
        if (c3059ii.mo12952k4("http://schemas.openxmlformats.org/officeDocument/2006/relationships") == null) {
            c3059ii.m12954to("xmlns", "r", null, "http://schemas.openxmlformats.org/officeDocument/2006/relationships");
        }
        c3059ii.m12955x1("r:cs", this.f22828to);
        c3059ii.mo21898jd();
    }
}
