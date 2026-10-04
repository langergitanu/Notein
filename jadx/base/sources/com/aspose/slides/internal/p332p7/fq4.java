package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: loaded from: classes4.dex */
public class fq4 extends AbstractC7361bz {

    /* JADX INFO: renamed from: c5 */
    private int f22980c5;

    /* JADX INFO: renamed from: ck */
    private String f22981ck;

    /* JADX INFO: renamed from: du */
    private String f22982du;

    /* JADX INFO: renamed from: dy */
    private int f22983dy;

    /* JADX INFO: renamed from: h4 */
    private String f22984h4;

    /* JADX INFO: renamed from: jd */
    private int f22985jd;

    /* JADX INFO: renamed from: kk */
    private int f22986kk;

    /* JADX INFO: renamed from: m9 */
    private String f22987m9;

    /* JADX INFO: renamed from: to */
    private String f22988to;

    /* JADX INFO: renamed from: k4 */
    public static final int f22978k4 = afp.m28214k4("repeat");

    /* JADX INFO: renamed from: x1 */
    public static final int f22979x1 = bhu.m28903k4("simple");

    /* JADX INFO: renamed from: fa */
    private static final C7017h4 f22977fa = new C7017h4("style:repeat", "style:position", "style:filter-name", "draw:opacity", "xlink:href", "xlink:type", "xlink:show", "xlink:actuate", "binary-data");

    public fq4() {
        m32001to();
    }

    /* JADX INFO: renamed from: k4 */
    public final int m32004k4() {
        return this.f22986kk;
    }

    public fq4(final AbstractC13912i5 abstractC13912i5) {
        m32001to();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.fq4.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                switch (fq4.f22977fa.m27428k4(str)) {
                    case 0:
                        fq4.this.f22986kk = afp.m28214k4(str2);
                        break;
                    case 1:
                        fq4.this.f22988to = str2;
                        break;
                    case 2:
                        fq4.this.f22982du = str2;
                        break;
                    case 3:
                        fq4.this.f22984h4 = str2;
                        break;
                    case 4:
                        fq4.this.f22987m9 = str2;
                        break;
                    case 5:
                        fq4.this.f22983dy = bhu.m28903k4(str2);
                        break;
                    case 6:
                        fq4.this.f22980c5 = bdd.m28828k4(str2);
                        break;
                    case 7:
                        fq4.this.f22985jd = qs5.m39644k4(str2);
                        break;
                }
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.fq4.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (fq4.f22977fa.m27428k4(abstractC13912i5.mo65023fa()) != 8) {
                    return false;
                }
                fq4.this.f22981ck = abstractC13912i5.mo65052v4();
                if (abstractC13912i5.mo65048u4()) {
                    return true;
                }
                while (abstractC13912i5.mo65028jd() != 15) {
                    abstractC13912i5.mo65026h4();
                    fq4 fq4Var = fq4.this;
                    fq4Var.f22981ck = C14113y2.m67400k4(fq4Var.f22981ck, abstractC13912i5.mo65052v4());
                }
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    public final String m32005x1() {
        return this.f22987m9;
    }

    /* JADX INFO: renamed from: to */
    private void m32001to() {
        this.f22986kk = f22978k4;
        this.f22983dy = f22979x1;
        this.f22980c5 = 0;
        this.f22985jd = 0;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        C3059ii c3059ii2;
        c3059ii.mo12953k4(str, str2, (String) null);
        int i = this.f22986kk;
        if (i != f22978k4) {
            c3059ii.m12955x1("style:repeat", afp.m28215k4(i));
        }
        c3059ii.m12955x1("style:position", this.f22988to);
        String str3 = this.f22982du;
        if (str3 != null) {
            c3059ii.m12955x1("style:filter-name", str3);
        }
        String str4 = this.f22984h4;
        if (str4 != null) {
            c3059ii.m12955x1("draw:opacity", str4);
        }
        String str5 = this.f22987m9;
        if (str5 != null) {
            c3059ii.m12955x1("xlink:href", str5);
        }
        int i2 = this.f22983dy;
        if (i2 != f22979x1) {
            c3059ii.m12955x1("xlink:type", bhu.m28904k4(i2));
        }
        int i3 = this.f22980c5;
        if (i3 != 0) {
            c3059ii.m12955x1("xlink:show", bdd.m28829k4(i3));
        }
        int i4 = this.f22985jd;
        if (i4 != 0) {
            c3059ii.m12955x1("xlink:actuate", qs5.m39645k4(i4));
        }
        String str6 = this.f22981ck;
        if (str6 != null) {
            c3059ii2 = c3059ii;
            m29301k4("office", c3059ii2, "binary-data", str6, false);
        } else {
            c3059ii2 = c3059ii;
        }
        c3059ii2.mo21898jd();
    }
}
