package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14077m4;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: loaded from: classes4.dex */
public class dfx extends AbstractC7361bz {

    /* JADX INFO: renamed from: c5 */
    private C14077m4 f21624c5 = new C14077m4();

    /* JADX INFO: renamed from: ck */
    private String f21625ck;

    /* JADX INFO: renamed from: du */
    private String f21626du;

    /* JADX INFO: renamed from: dy */
    private int f21627dy;

    /* JADX INFO: renamed from: fa */
    private os6 f21628fa;

    /* JADX INFO: renamed from: h4 */
    private int f21629h4;

    /* JADX INFO: renamed from: jd */
    private String f21630jd;

    /* JADX INFO: renamed from: m9 */
    private int f21631m9;

    /* JADX INFO: renamed from: k4 */
    public static final int f21619k4 = viu.m43125k4("none");

    /* JADX INFO: renamed from: x1 */
    public static final int f21623x1 = k3x.m35114k4("none");

    /* JADX INFO: renamed from: kk */
    public static final int f21620kk = axn.m28535k4("medium");

    /* JADX INFO: renamed from: to */
    public static final C14077m4 f21621to = C14077m4.f47265kk.Clone();

    /* JADX INFO: renamed from: up */
    private static final C7017h4 f21622up = new C7017h4("draw:shape-id", "presentation:effect", "presentation:direction", "presentation:speed", "presentation:delay", "presentation:start-scale", "presentation:path-id", "sound");

    public dfx() {
        m30339x1();
    }

    public dfx(final AbstractC13912i5 abstractC13912i5) {
        m30339x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.dfx.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                switch (dfx.f21622up.m27428k4(str)) {
                    case 0:
                        dfx.this.f21626du = str2;
                        break;
                    case 1:
                        dfx.this.f21629h4 = viu.m43125k4(str2);
                        break;
                    case 2:
                        dfx.this.f21631m9 = k3x.m35114k4(str2);
                        break;
                    case 3:
                        dfx.this.f21627dy = axn.m28535k4(str2);
                        break;
                    case 4:
                        AbstractC7361bz.m29294ks(str2).CloneTo(dfx.this.f21624c5);
                        break;
                    case 5:
                        dfx.this.f21630jd = str2;
                        break;
                    case 6:
                        dfx.this.f21625ck = str2;
                        break;
                }
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.dfx.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (dfx.f21622up.m27428k4(abstractC13912i5.mo65023fa()) != 7) {
                    return false;
                }
                dfx.this.f21628fa = new os6(abstractC13912i5);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    private void m30339x1() {
        this.f21629h4 = f21619k4;
        this.f21631m9 = f21623x1;
        this.f21627dy = f21620kk;
        f21621to.CloneTo(this.f21624c5);
        this.f21630jd = "100%";
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("draw:shape-id", this.f21626du);
        int i = this.f21629h4;
        if (i != f21619k4) {
            c3059ii.m12955x1("presentation:effect", viu.m43126k4(i));
        }
        int i2 = this.f21631m9;
        if (i2 != f21623x1) {
            c3059ii.m12955x1("presentation:direction", k3x.m35115k4(i2));
        }
        int i3 = this.f21627dy;
        if (i3 != f21620kk) {
            c3059ii.m12955x1("presentation:speed", axn.m28536k4(i3));
        }
        if (C14077m4.m66795du(this.f21624c5, f21621to)) {
            C22240OooOO0o.OooO00o(this.f21624c5, c3059ii, "presentation:delay");
        }
        if (!"100%".equals(this.f21630jd)) {
            c3059ii.m12955x1("presentation:start-scale", this.f21630jd);
        }
        String str3 = this.f21625ck;
        if (str3 != null) {
            c3059ii.m12955x1("presentation:path-id", str3);
        }
        os6 os6Var = this.f21628fa;
        if (os6Var != null) {
            os6Var.mo6846k4("presentation", c3059ii, "sound");
        }
        c3059ii.mo21898jd();
    }
}
