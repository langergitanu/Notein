package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.cl */
/* JADX INFO: loaded from: classes4.dex */
public class C7416cl extends AbstractC7361bz {

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f21113to = new C7017h4("prst", "fgClr", "bgClr");

    /* JADX INFO: renamed from: k4 */
    private byte f21114k4;

    /* JADX INFO: renamed from: kk */
    private C7447cx f21115kk;

    /* JADX INFO: renamed from: x1 */
    private C7447cx f21116x1;

    public C7416cl() {
        m29653m9();
    }

    /* JADX INFO: renamed from: m9 */
    private void m29653m9() {
        this.f21114k4 = (byte) 0;
    }

    /* JADX INFO: renamed from: du */
    public final C7447cx m29655du() {
        return this.f21115kk;
    }

    /* JADX INFO: renamed from: kk */
    public final byte m29658kk() {
        return this.f21114k4;
    }

    /* JADX INFO: renamed from: to */
    public final C7447cx m29659to() {
        return this.f21116x1;
    }

    /* JADX INFO: renamed from: x1 */
    public final C7447cx m29660x1() {
        if (this.f21115kk != null) {
            throw new Exception("Only one <bgClr> element can be added.");
        }
        C7447cx c7447cx = new C7447cx();
        this.f21115kk = c7447cx;
        return c7447cx;
    }

    public C7416cl(final AbstractC13912i5 abstractC13912i5) {
        m29653m9();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.cl.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (C7416cl.f21113to.m27428k4(str) != 0) {
                    return false;
                }
                C7416cl.this.f21114k4 = C7641f7.m31646k4(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.cl.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = C7416cl.f21113to.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 1) {
                    C7416cl.this.f21116x1 = new C7447cx(abstractC13912i5);
                } else {
                    if (iM27428k4 != 2) {
                        return false;
                    }
                    C7416cl.this.f21115kk = new C7447cx(abstractC13912i5);
                }
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C7447cx m29656k4() {
        if (this.f21116x1 != null) {
            throw new Exception("Only one <fgClr> element can be added.");
        }
        C7447cx c7447cx = new C7447cx();
        this.f21116x1 = c7447cx;
        return c7447cx;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m29657k4(byte b) {
        this.f21114k4 = b;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, "a".equals(c3059ii.mo12952k4("http://schemas.openxmlformats.org/drawingml/2006/main")) ? null : "http://schemas.openxmlformats.org/drawingml/2006/main");
        byte b = this.f21114k4;
        if (b != 0) {
            c3059ii.m12955x1("prst", C7641f7.m31647k4(b));
        }
        C7447cx c7447cx = this.f21116x1;
        if (c7447cx != null) {
            c7447cx.mo6846k4("a", c3059ii, "fgClr");
        }
        C7447cx c7447cx2 = this.f21115kk;
        if (c7447cx2 != null) {
            c7447cx2.mo6846k4("a", c3059ii, "bgClr");
        }
        c3059ii.mo21898jd();
    }
}
