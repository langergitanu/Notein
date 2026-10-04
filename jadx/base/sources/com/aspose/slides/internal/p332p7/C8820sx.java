package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.sx */
/* JADX INFO: loaded from: classes4.dex */
public class C8820sx extends AbstractC7361bz {

    /* JADX INFO: renamed from: du */
    private static final C7017h4 f30477du = new C7017h4("camera", "lightRig", "backdrop", "extLst");

    /* JADX INFO: renamed from: k4 */
    private C7978j6 f30478k4;

    /* JADX INFO: renamed from: kk */
    private C9226xq f30479kk;

    /* JADX INFO: renamed from: to */
    private C8397nz f30480to;

    /* JADX INFO: renamed from: x1 */
    private C7272au f30481x1;

    public C8820sx() {
        this.f30478k4 = new C7978j6();
        this.f30481x1 = new C7272au();
    }

    /* JADX INFO: renamed from: kk */
    public final C7272au m41420kk() {
        return this.f30481x1;
    }

    /* JADX INFO: renamed from: to */
    public final C9226xq m41421to() {
        return this.f30479kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final C7978j6 m41422x1() {
        return this.f30478k4;
    }

    public C8820sx(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.sx.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = C8820sx.f30477du.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    C8820sx.this.f30478k4 = new C7978j6(abstractC13912i5);
                } else if (iM27428k4 == 1) {
                    C8820sx.this.f30481x1 = new C7272au(abstractC13912i5);
                } else if (iM27428k4 == 2) {
                    C8820sx.this.f30479kk = new C9226xq(abstractC13912i5);
                } else {
                    if (iM27428k4 != 3) {
                        return false;
                    }
                    C8820sx.this.f30480to = new C8397nz(abstractC13912i5);
                }
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C9226xq m41419k4() {
        if (this.f30479kk != null) {
            throw new Exception("Only one <backdrop> element can be added.");
        }
        C9226xq c9226xq = new C9226xq();
        this.f30479kk = c9226xq;
        return c9226xq;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, "a".equals(c3059ii.mo12952k4("http://schemas.openxmlformats.org/drawingml/2006/main")) ? null : "http://schemas.openxmlformats.org/drawingml/2006/main");
        this.f30478k4.mo6846k4("a", c3059ii, "camera");
        this.f30481x1.mo6846k4("a", c3059ii, "lightRig");
        C9226xq c9226xq = this.f30479kk;
        if (c9226xq != null) {
            c9226xq.mo6846k4("a", c3059ii, "backdrop");
        }
        C8397nz c8397nz = this.f30480to;
        if (c8397nz != null) {
            c8397nz.mo6846k4("a", c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }
}
