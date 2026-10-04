package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13932ly;
import com.aspose.slides.p559ms.System.Xml.XmlDocument;
import com.facebook.common.callercontext.ContextChain;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.wr */
/* JADX INFO: loaded from: classes4.dex */
public final class C9132wr extends AbstractC7361bz {

    /* JADX INFO: renamed from: up */
    private static final C7017h4 f32478up = new C7017h4("uri", "http://schemas.openxmlformats.org/drawingml/2006/table", "http://schemas.openxmlformats.org/drawingml/2006/chart", "http://schemas.microsoft.com/office/drawing/2014/chartex", "http://schemas.openxmlformats.org/drawingml/2006/diagram", "http://schemas.openxmlformats.org/presentationml/2006/ole", "http://schemas.openxmlformats.org/drawingml/2006/compatibility", "http://schemas.microsoft.com/office/powerpoint/2016/slidezoom", "http://schemas.microsoft.com/office/powerpoint/2016/summaryzoom", "http://schemas.microsoft.com/office/powerpoint/2016/sectionzoom", "http://schemas.microsoft.com/office/drawing/2017/model3d", "tbl", "chart", "relIds", "oleObj", "legacyDrawing", "sldZm", "summaryZm", "sectionZm", "model3d");

    /* JADX INFO: renamed from: c5 */
    private quf f32479c5;

    /* JADX INFO: renamed from: ck */
    private rm1 f32480ck;

    /* JADX INFO: renamed from: du */
    private C7535e5 f32481du;

    /* JADX INFO: renamed from: dy */
    private C8544ps f32482dy;

    /* JADX INFO: renamed from: fa */
    private C8499p9 f32483fa;

    /* JADX INFO: renamed from: h4 */
    private C7669fj f32484h4;

    /* JADX INFO: renamed from: jd */
    private uih f32485jd;

    /* JADX INFO: renamed from: k4 */
    private String f32486k4;

    /* JADX INFO: renamed from: kk */
    private C7636f5 f32487kk;

    /* JADX INFO: renamed from: m9 */
    private C8881to f32488m9;

    /* JADX INFO: renamed from: to */
    private C8999v4 f32489to;

    /* JADX INFO: renamed from: x1 */
    private C13932ly f32490x1;

    public C9132wr() {
        this.f32486k4 = "";
    }

    /* JADX INFO: renamed from: qq */
    private void m43887qq() {
        this.f32490x1 = null;
        this.f32487kk = null;
        this.f32489to = null;
        this.f32481du = null;
        this.f32484h4 = null;
        this.f32488m9 = null;
        this.f32482dy = null;
        this.f32479c5 = null;
        this.f32480ck = null;
    }

    /* JADX INFO: renamed from: c5 */
    public final C8544ps m43889c5() {
        if (this.f32482dy != null) {
            throw new Exception("Only one <legacyDrawing> element can be added.");
        }
        m43887qq();
        C8544ps c8544ps = new C8544ps();
        this.f32482dy = c8544ps;
        return c8544ps;
    }

    /* JADX INFO: renamed from: ck */
    public final String m43890ck() {
        return this.f32486k4;
    }

    /* JADX INFO: renamed from: du */
    public final C8881to m43891du() {
        if (this.f32488m9 != null) {
            throw new Exception("Only one <oleObj> element can be added.");
        }
        m43887qq();
        C8881to c8881to = new C8881to();
        this.f32488m9 = c8881to;
        return c8881to;
    }

    /* JADX INFO: renamed from: dy */
    public final uih m43892dy() {
        if (this.f32485jd != null) {
            throw new Exception("Only one <sectionZoom> element can be added.");
        }
        m43887qq();
        uih uihVar = new uih();
        this.f32485jd = uihVar;
        return uihVar;
    }

    /* JADX INFO: renamed from: fa */
    public final C7636f5 m43893fa() {
        return this.f32487kk;
    }

    /* JADX INFO: renamed from: h4 */
    public final quf m43894h4() {
        if (this.f32479c5 != null) {
            throw new Exception("Only one <slideZoom> element can be added.");
        }
        m43887qq();
        quf qufVar = new quf();
        this.f32479c5 = qufVar;
        return qufVar;
    }

    /* JADX INFO: renamed from: ix */
    public final rm1 m43895ix() {
        return this.f32480ck;
    }

    /* JADX INFO: renamed from: jd */
    public final C13932ly m43896jd() {
        return this.f32490x1;
    }

    /* JADX INFO: renamed from: kk */
    public final C7535e5 m43901kk() {
        if (this.f32481du != null) {
            throw new Exception("Only one <chart> element can be added.");
        }
        m43887qq();
        C7535e5 c7535e5 = new C7535e5();
        this.f32481du = c7535e5;
        return c7535e5;
    }

    /* JADX INFO: renamed from: ks */
    public final C7669fj m43902ks() {
        return this.f32484h4;
    }

    /* JADX INFO: renamed from: m9 */
    public final rm1 m43903m9() {
        if (this.f32480ck != null) {
            throw new Exception("Only one <sectionZoom> element can be added.");
        }
        m43887qq();
        rm1 rm1Var = new rm1();
        this.f32480ck = rm1Var;
        return rm1Var;
    }

    /* JADX INFO: renamed from: ne */
    public final uih m43904ne() {
        return this.f32485jd;
    }

    /* JADX INFO: renamed from: rv */
    public final C8881to m43905rv() {
        return this.f32488m9;
    }

    /* JADX INFO: renamed from: to */
    public final C7669fj m43906to() {
        if (this.f32484h4 != null) {
            throw new Exception("Only one <smartArtRelId> element can be added.");
        }
        m43887qq();
        C7669fj c7669fj = new C7669fj();
        this.f32484h4 = c7669fj;
        return c7669fj;
    }

    /* JADX INFO: renamed from: u4 */
    public final C8499p9 m43907u4() {
        return this.f32483fa;
    }

    /* JADX INFO: renamed from: up */
    public final C8999v4 m43908up() {
        return this.f32489to;
    }

    /* JADX INFO: renamed from: uz */
    public final C8544ps m43909uz() {
        return this.f32482dy;
    }

    /* JADX INFO: renamed from: x1 */
    public final C8999v4 m43910x1() {
        if (this.f32489to != null) {
            throw new Exception("Only one <chart> element can be added.");
        }
        m43887qq();
        C8999v4 c8999v4 = new C8999v4();
        this.f32489to = c8999v4;
        return c8999v4;
    }

    /* JADX INFO: renamed from: x6 */
    public final quf m43911x6() {
        return this.f32479c5;
    }

    /* JADX INFO: renamed from: yj */
    public final C7535e5 m43912yj() {
        return this.f32481du;
    }

    public C9132wr(final AbstractC13912i5 abstractC13912i5) {
        this();
        String strMo65050up = abstractC13912i5.mo65050up();
        while (abstractC13912i5.mo65047to()) {
            if (!"xmlns".equals(abstractC13912i5.mo65060yj())) {
                if (f32478up.m27428k4(C14113y2.m67363du(abstractC13912i5.mo13292k4(abstractC13912i5.mo65060yj()), strMo65050up) ? abstractC13912i5.mo65023fa() : abstractC13912i5.mo65019ck()) != 0) {
                    throw new Exception(C14113y2.m67408k4("Unknown attribute \"", abstractC13912i5.mo65019ck(), "\""));
                }
                this.f32486k4 = abstractC13912i5.mo65042rv();
            }
        }
        abstractC13912i5.mo65020du();
        if (abstractC13912i5.mo65048u4()) {
            return;
        }
        switch (f32478up.m27428k4(this.f32486k4)) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.wr.1
                    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
                    /* JADX INFO: renamed from: k4 */
                    public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                        switch (C9132wr.f32478up.m27428k4(abstractC13912i5.mo65023fa())) {
                            case 11:
                                C9132wr.this.f32487kk = new C7636f5(abstractC13912i5);
                                return true;
                            case 12:
                                int iM27428k4 = C9132wr.f32478up.m27428k4(C9132wr.this.f32486k4);
                                if (iM27428k4 == 2) {
                                    C9132wr.this.f32489to = new C8999v4(abstractC13912i5);
                                    return true;
                                }
                                if (iM27428k4 != 3) {
                                    return true;
                                }
                                C9132wr.this.f32481du = new C7535e5(abstractC13912i5);
                                return true;
                            case 13:
                                C9132wr.this.f32484h4 = new C7669fj(abstractC13912i5);
                                return true;
                            case 14:
                                C9132wr.this.f32488m9 = new C8881to(abstractC13912i5);
                                return true;
                            case 15:
                                C9132wr.this.f32482dy = new C8544ps(abstractC13912i5);
                                return true;
                            case 16:
                                C9132wr.this.f32479c5 = new quf(abstractC13912i5);
                                return true;
                            case 17:
                                C9132wr.this.f32485jd = new uih(abstractC13912i5);
                                return true;
                            case 18:
                                C9132wr.this.f32480ck = new rm1(abstractC13912i5);
                                return true;
                            case 19:
                                C9132wr.this.f32483fa = new C8499p9(abstractC13912i5);
                                return true;
                            default:
                                throw new Exception(C14113y2.m67408k4("Unknown element \"", abstractC13912i5.mo65023fa(), "\""));
                        }
                    }
                });
                return;
            default:
                C13932ly c13932lyCreateDocumentFragment = new XmlDocument().createDocumentFragment();
                this.f32490x1 = c13932lyCreateDocumentFragment;
                c13932lyCreateDocumentFragment.setInnerXml(abstractC13912i5.m65486ts());
                return;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final C7636f5 m43897k4() {
        if (this.f32487kk != null) {
            throw new Exception("Only one <table> element can be added.");
        }
        m43887qq();
        C7636f5 c7636f5 = new C7636f5();
        this.f32487kk = c7636f5;
        return c7636f5;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m43898k4(C8499p9 c8499p9) {
        m43887qq();
        this.f32483fa = c8499p9;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m43899k4(C13932ly c13932ly) {
        m43887qq();
        this.f32490x1 = c13932ly;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m43900k4(String str) {
        this.f32486k4 = str;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        String str3 = this.f32486k4;
        if (str3 != null) {
            c3059ii.m12955x1("uri", str3);
        }
        C8999v4 c8999v4 = this.f32489to;
        if (c8999v4 != null) {
            c8999v4.mo6846k4("c", c3059ii, "chart");
        }
        C7535e5 c7535e5 = this.f32481du;
        if (c7535e5 != null) {
            c7535e5.mo6846k4("cx", c3059ii, "chart");
        }
        C7636f5 c7636f5 = this.f32487kk;
        if (c7636f5 != null) {
            c7636f5.mo6846k4("a", c3059ii, "tbl");
        }
        C7669fj c7669fj = this.f32484h4;
        if (c7669fj != null) {
            c7669fj.mo6846k4("dgm", c3059ii, "relIds");
        }
        C8881to c8881to = this.f32488m9;
        if (c8881to != null) {
            c8881to.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "oleObj");
        }
        C8544ps c8544ps = this.f32482dy;
        if (c8544ps != null) {
            c8544ps.mo6846k4("com", c3059ii, "legacyDrawing");
        }
        quf qufVar = this.f32479c5;
        if (qufVar != null) {
            qufVar.mo6846k4("pslz", c3059ii, "sldZm");
        }
        rm1 rm1Var = this.f32480ck;
        if (rm1Var != null) {
            rm1Var.mo6846k4("psez", c3059ii, "sectionZm");
        }
        uih uihVar = this.f32485jd;
        if (uihVar != null) {
            uihVar.mo6846k4("psuz", c3059ii, "summaryZm");
        }
        C8499p9 c8499p9 = this.f32483fa;
        if (c8499p9 != null) {
            c8499p9.mo6846k4("am3d", c3059ii, "model3d");
        }
        C13932ly c13932ly = this.f32490x1;
        if (c13932ly != null) {
            c13932ly.writeTo(c3059ii);
        }
        c3059ii.mo21898jd();
    }
}
