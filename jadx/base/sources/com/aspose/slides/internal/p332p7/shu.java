package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14077m4;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: loaded from: classes4.dex */
public class shu extends AbstractC7361bz {

    /* JADX INFO: renamed from: c5 */
    private C14077m4 f30131c5 = new C14077m4();

    /* JADX INFO: renamed from: ck */
    private String f30132ck;

    /* JADX INFO: renamed from: du */
    private String f30133du;

    /* JADX INFO: renamed from: dy */
    private int f30134dy;

    /* JADX INFO: renamed from: fa */
    private os6 f30135fa;

    /* JADX INFO: renamed from: h4 */
    private int f30136h4;

    /* JADX INFO: renamed from: jd */
    private String f30137jd;

    /* JADX INFO: renamed from: m9 */
    private int f30138m9;

    /* JADX INFO: renamed from: k4 */
    public static final int f30126k4 = viu.m43125k4("none");

    /* JADX INFO: renamed from: x1 */
    public static final int f30130x1 = k3x.m35114k4("none");

    /* JADX INFO: renamed from: kk */
    public static final int f30127kk = axn.m28535k4("medium");

    /* JADX INFO: renamed from: to */
    public static final C14077m4 f30128to = C14077m4.f47265kk.Clone();

    /* JADX INFO: renamed from: up */
    private static final C7017h4 f30129up = new C7017h4("draw:shape-id", "presentation:effect", "presentation:direction", "presentation:speed", "presentation:delay", "presentation:start-scale", "presentation:path-id", "sound");

    public shu() {
        m41033x1();
    }

    public shu(final AbstractC13912i5 abstractC13912i5) {
        m41033x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.shu.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                switch (shu.f30129up.m27428k4(str)) {
                    case 0:
                        shu.this.f30133du = str2;
                        break;
                    case 1:
                        shu.this.f30136h4 = viu.m43125k4(str2);
                        break;
                    case 2:
                        shu.this.f30138m9 = k3x.m35114k4(str2);
                        break;
                    case 3:
                        shu.this.f30134dy = axn.m28535k4(str2);
                        break;
                    case 4:
                        AbstractC7361bz.m29294ks(str2).CloneTo(shu.this.f30131c5);
                        break;
                    case 5:
                        shu.this.f30137jd = str2;
                        break;
                    case 6:
                        shu.this.f30132ck = str2;
                        break;
                }
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.shu.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (shu.f30129up.m27428k4(abstractC13912i5.mo65023fa()) != 7) {
                    return false;
                }
                shu.this.f30135fa = new os6(abstractC13912i5);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    private void m41033x1() {
        this.f30136h4 = f30126k4;
        this.f30138m9 = f30130x1;
        this.f30134dy = f30127kk;
        f30128to.CloneTo(this.f30131c5);
        this.f30137jd = "100%";
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("draw:shape-id", this.f30133du);
        int i = this.f30136h4;
        if (i != f30126k4) {
            c3059ii.m12955x1("presentation:effect", viu.m43126k4(i));
        }
        int i2 = this.f30138m9;
        if (i2 != f30130x1) {
            c3059ii.m12955x1("presentation:direction", k3x.m35115k4(i2));
        }
        int i3 = this.f30134dy;
        if (i3 != f30127kk) {
            c3059ii.m12955x1("presentation:speed", axn.m28536k4(i3));
        }
        if (C14077m4.m66795du(this.f30131c5, f30128to)) {
            C22240OooOO0o.OooO00o(this.f30131c5, c3059ii, "presentation:delay");
        }
        if (!"100%".equals(this.f30137jd)) {
            c3059ii.m12955x1("presentation:start-scale", this.f30137jd);
        }
        String str3 = this.f30132ck;
        if (str3 != null) {
            c3059ii.m12955x1("presentation:path-id", str3);
        }
        os6 os6Var = this.f30135fa;
        if (os6Var != null) {
            os6Var.mo6846k4("presentation", c3059ii, "sound");
        }
        c3059ii.mo21898jd();
    }
}
