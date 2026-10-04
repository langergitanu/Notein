package com.aspose.slides.internal.p332p7;

import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.oh */
/* JADX INFO: loaded from: classes4.dex */
public class C8442oh extends AbstractC7361bz {

    /* JADX INFO: renamed from: c5 */
    private static final C7017h4 f27938c5 = new C7017h4("idx", "invertIfNegative", RequestParameters.MARKER, "bubble3D", "explosion", "spPr", "pictureOptions", "extLst");

    /* JADX INFO: renamed from: du */
    private C8452ol f27939du;

    /* JADX INFO: renamed from: dy */
    private C7683fo f27940dy;

    /* JADX INFO: renamed from: h4 */
    private C8087kh f27941h4;

    /* JADX INFO: renamed from: k4 */
    private C8452ol f27942k4;

    /* JADX INFO: renamed from: kk */
    private C8453om f27943kk;

    /* JADX INFO: renamed from: m9 */
    private C7547ec f27944m9;

    /* JADX INFO: renamed from: to */
    private C8828t1 f27945to;

    /* JADX INFO: renamed from: x1 */
    private C8828t1 f27946x1;

    public C8442oh() {
        this.f27942k4 = new C8452ol();
    }

    /* JADX INFO: renamed from: c5 */
    public final C8828t1 m38253c5() {
        return this.f27945to;
    }

    /* JADX INFO: renamed from: ck */
    public final C8087kh m38254ck() {
        return this.f27941h4;
    }

    /* JADX INFO: renamed from: du */
    public final C8087kh m38255du() {
        if (this.f27941h4 != null) {
            throw new Exception("Only one <spPr> element can be added.");
        }
        C8087kh c8087kh = new C8087kh();
        this.f27941h4 = c8087kh;
        return c8087kh;
    }

    /* JADX INFO: renamed from: dy */
    public final C8453om m38256dy() {
        return this.f27943kk;
    }

    /* JADX INFO: renamed from: fa */
    public final C7547ec m38257fa() {
        return this.f27944m9;
    }

    /* JADX INFO: renamed from: h4 */
    public final C8452ol m38258h4() {
        return this.f27942k4;
    }

    /* JADX INFO: renamed from: jd */
    public final C8452ol m38259jd() {
        return this.f27939du;
    }

    /* JADX INFO: renamed from: k4 */
    public final C8828t1 m38260k4() {
        if (this.f27946x1 != null) {
            throw new Exception("Only one <invertIfNegative> element can be added.");
        }
        C8828t1 c8828t1 = new C8828t1();
        this.f27946x1 = c8828t1;
        return c8828t1;
    }

    /* JADX INFO: renamed from: kk */
    public final C8828t1 m38263kk() {
        if (this.f27945to != null) {
            throw new Exception("Only one <bubble3D> element can be added.");
        }
        C8828t1 c8828t1 = new C8828t1();
        this.f27945to = c8828t1;
        return c8828t1;
    }

    /* JADX INFO: renamed from: m9 */
    public final C8828t1 m38264m9() {
        return this.f27946x1;
    }

    /* JADX INFO: renamed from: to */
    public final C8452ol m38265to() {
        if (this.f27939du != null) {
            throw new Exception("Only one <explosion> element can be added.");
        }
        C8452ol c8452ol = new C8452ol();
        this.f27939du = c8452ol;
        return c8452ol;
    }

    /* JADX INFO: renamed from: up */
    public final AbstractC7414ck m38266up() {
        return this.f27940dy;
    }

    /* JADX INFO: renamed from: x1 */
    public final C8453om m38267x1() {
        if (this.f27943kk != null) {
            throw new Exception("Only one <marker> element can be added.");
        }
        C8453om c8453om = new C8453om();
        this.f27943kk = c8453om;
        return c8453om;
    }

    public C8442oh(AbstractC13912i5 abstractC13912i5) {
        if (abstractC13912i5.mo65048u4()) {
            return;
        }
        String strMo65023fa = abstractC13912i5.mo65023fa();
        while (abstractC13912i5.mo65026h4()) {
            while (true) {
                if (abstractC13912i5.mo65028jd() == 15 && C14113y2.m67363du(abstractC13912i5.mo65023fa(), strMo65023fa)) {
                    return;
                }
                if (abstractC13912i5.mo65028jd() == 1) {
                    switch (f27938c5.m27428k4(abstractC13912i5.mo65023fa())) {
                        case 0:
                            this.f27942k4 = new C8452ol(abstractC13912i5);
                            continue;
                        case 1:
                            this.f27946x1 = new C8828t1(abstractC13912i5);
                            continue;
                        case 2:
                            this.f27943kk = new C8453om(abstractC13912i5);
                            continue;
                        case 3:
                            this.f27945to = new C8828t1(abstractC13912i5);
                            continue;
                        case 4:
                            this.f27939du = new C8452ol(abstractC13912i5);
                            continue;
                        case 5:
                            this.f27941h4 = new C8087kh(abstractC13912i5);
                            continue;
                        case 6:
                            this.f27944m9 = new C7547ec(abstractC13912i5);
                            break;
                        case 7:
                            this.f27940dy = new C7683fo(abstractC13912i5);
                            continue;
                        default:
                            abstractC13912i5.mo65208bv();
                            break;
                    }
                    if (abstractC13912i5.mo65015ar()) {
                        break;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m38261k4(AbstractC7414ck abstractC7414ck) {
        this.f27940dy = (C7683fo) abstractC7414ck;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m38262k4(C8290mt c8290mt) {
        this.f27944m9 = (C7547ec) c8290mt;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        this.f27942k4.mo6846k4("c", c3059ii, "idx");
        C8828t1 c8828t1 = this.f27946x1;
        if (c8828t1 != null) {
            c8828t1.mo6846k4("c", c3059ii, "invertIfNegative");
        }
        C8453om c8453om = this.f27943kk;
        if (c8453om != null) {
            c8453om.mo6846k4("c", c3059ii, RequestParameters.MARKER);
        }
        C8828t1 c8828t12 = this.f27945to;
        if (c8828t12 != null) {
            c8828t12.mo6846k4("c", c3059ii, "bubble3D");
        }
        C8452ol c8452ol = this.f27939du;
        if (c8452ol != null) {
            c8452ol.mo6846k4("c", c3059ii, "explosion");
        }
        C8087kh c8087kh = this.f27941h4;
        if (c8087kh != null) {
            c8087kh.mo6846k4("c", c3059ii, "spPr");
        }
        C7547ec c7547ec = this.f27944m9;
        if (c7547ec != null) {
            c7547ec.mo6846k4("c", c3059ii, "pictureOptions");
        }
        C7683fo c7683fo = this.f27940dy;
        if (c7683fo != null) {
            c7683fo.mo6846k4("c", c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }
}
