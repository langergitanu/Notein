package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: loaded from: classes4.dex */
public class h2y extends AbstractC7361bz {

    /* JADX INFO: renamed from: c5 */
    private int f23833c5;

    /* JADX INFO: renamed from: ck */
    private String f23834ck;

    /* JADX INFO: renamed from: du */
    private String f23835du;

    /* JADX INFO: renamed from: dy */
    private int f23836dy;

    /* JADX INFO: renamed from: fa */
    private int f23837fa;

    /* JADX INFO: renamed from: h4 */
    private int f23838h4;

    /* JADX INFO: renamed from: jd */
    private String f23839jd;

    /* JADX INFO: renamed from: ks */
    private long f23840ks;

    /* JADX INFO: renamed from: m9 */
    private int f23841m9;

    /* JADX INFO: renamed from: rv */
    private os6 f23842rv;

    /* JADX INFO: renamed from: up */
    private int f23843up;

    /* JADX INFO: renamed from: yj */
    private int f23844yj;

    /* JADX INFO: renamed from: k4 */
    public static final int f23828k4 = viu.m43125k4("none");

    /* JADX INFO: renamed from: x1 */
    public static final int f23831x1 = k3x.m35114k4("none");

    /* JADX INFO: renamed from: kk */
    public static final int f23829kk = axn.m28535k4("medium");

    /* JADX INFO: renamed from: to */
    public static final int f23830to = bhu.m28903k4("simple");

    /* JADX INFO: renamed from: x6 */
    private static final C7017h4 f23832x6 = new C7017h4("script:event-name", "presentation:action", "presentation:effect", "presentation:direction", "presentation:speed", "presentation:start-scale", "xlink:href", "xlink:type", "xlink:show", "xlink:actuate", "presentation:verb", "sound");

    public h2y() {
        m33052x1();
    }

    public h2y(final AbstractC13912i5 abstractC13912i5) {
        m33052x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.h2y.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                switch (h2y.f23832x6.m27428k4(str)) {
                    case 0:
                        h2y.this.f23835du = str2;
                        break;
                    case 1:
                        h2y.this.f23838h4 = pyz.m39205k4(str2);
                        break;
                    case 2:
                        h2y.this.f23841m9 = viu.m43125k4(str2);
                        break;
                    case 3:
                        h2y.this.f23836dy = k3x.m35114k4(str2);
                        break;
                    case 4:
                        h2y.this.f23833c5 = axn.m28535k4(str2);
                        break;
                    case 5:
                        h2y.this.f23839jd = str2;
                        break;
                    case 6:
                        h2y.this.f23834ck = str2;
                        break;
                    case 7:
                        h2y.this.f23837fa = bhu.m28903k4(str2);
                        break;
                    case 8:
                        h2y.this.f23843up = bdd.m28828k4(str2);
                        break;
                    case 9:
                        h2y.this.f23844yj = x2a.m44176k4(str2);
                        break;
                    case 10:
                        h2y.this.f23840ks = AbstractC7361bz.m29295ne(str2);
                        break;
                }
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.h2y.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (h2y.f23832x6.m27428k4(abstractC13912i5.mo65023fa()) != 11) {
                    return false;
                }
                h2y.this.f23842rv = new os6(abstractC13912i5);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    private void m33052x1() {
        this.f23838h4 = 0;
        this.f23841m9 = f23828k4;
        this.f23836dy = f23831x1;
        this.f23833c5 = f23829kk;
        this.f23839jd = "100%";
        this.f23837fa = f23830to;
        this.f23843up = 0;
        this.f23844yj = 0;
        this.f23840ks = 4294967295L;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("script:event-name", this.f23835du);
        c3059ii.m12955x1("presentation:action", pyz.m39206k4(this.f23838h4));
        int i = this.f23841m9;
        if (i != f23828k4) {
            c3059ii.m12955x1("presentation:effect", viu.m43126k4(i));
        }
        int i2 = this.f23836dy;
        if (i2 != f23831x1) {
            c3059ii.m12955x1("presentation:direction", k3x.m35115k4(i2));
        }
        int i3 = this.f23833c5;
        if (i3 != f23829kk) {
            c3059ii.m12955x1("presentation:speed", axn.m28536k4(i3));
        }
        if (!"100%".equals(this.f23839jd)) {
            c3059ii.m12955x1("presentation:start-scale", this.f23839jd);
        }
        String str3 = this.f23834ck;
        if (str3 != null) {
            c3059ii.m12955x1("xlink:href", str3);
        }
        int i4 = this.f23837fa;
        if (i4 != f23830to) {
            c3059ii.m12955x1("xlink:type", bhu.m28904k4(i4));
        }
        int i5 = this.f23843up;
        if (i5 != 0) {
            c3059ii.m12955x1("xlink:show", bdd.m28829k4(i5));
        }
        int i6 = this.f23844yj;
        if (i6 != 0) {
            c3059ii.m12955x1("xlink:actuate", x2a.m44177k4(i6));
        }
        long j = this.f23840ks;
        if ((j & 4294967295L) != 4294967295L) {
            c3059ii.m12955x1("presentation:verb", C13850af.m65147x1(j));
        }
        os6 os6Var = this.f23842rv;
        if (os6Var != null) {
            os6Var.mo6846k4("presentation", c3059ii, "sound");
        }
        c3059ii.mo21898jd();
    }
}
