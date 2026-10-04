package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.p0 */
/* JADX INFO: loaded from: classes4.dex */
public class C8487p0 extends AbstractC7361bz {

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f28185to = new C7017h4("limLowPr", "e", "lim");

    /* JADX INFO: renamed from: k4 */
    private C7662fd f28186k4;

    /* JADX INFO: renamed from: kk */
    private C9085w3 f28187kk;

    /* JADX INFO: renamed from: x1 */
    private C9085w3 f28188x1;

    public C8487p0() {
        this.f28188x1 = new C9085w3();
        this.f28187kk = new C9085w3();
    }

    /* JADX INFO: renamed from: k4 */
    public final C7662fd m38552k4() {
        if (this.f28186k4 != null) {
            throw new Exception("Only one <limLowPr> element can be added.");
        }
        C7662fd c7662fd = new C7662fd();
        this.f28186k4 = c7662fd;
        return c7662fd;
    }

    /* JADX INFO: renamed from: kk */
    public final C9085w3 m38553kk() {
        return this.f28188x1;
    }

    /* JADX INFO: renamed from: to */
    public final C9085w3 m38554to() {
        return this.f28187kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final C7662fd m38555x1() {
        return this.f28186k4;
    }

    public C8487p0(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.p0.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = C8487p0.f28185to.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    C8487p0.this.f28186k4 = new C7662fd(abstractC13912i5);
                } else if (iM27428k4 == 1) {
                    C8487p0.this.f28188x1 = new C9085w3(abstractC13912i5);
                } else {
                    if (iM27428k4 != 2) {
                        return false;
                    }
                    C8487p0.this.f28187kk = new C9085w3(abstractC13912i5);
                }
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        C7662fd c7662fd = this.f28186k4;
        if (c7662fd != null) {
            c7662fd.mo6846k4("m", c3059ii, "limLowPr");
        }
        this.f28188x1.mo6846k4("m", c3059ii, "e");
        this.f28187kk.mo6846k4("m", c3059ii, "lim");
        c3059ii.mo21898jd();
    }
}
