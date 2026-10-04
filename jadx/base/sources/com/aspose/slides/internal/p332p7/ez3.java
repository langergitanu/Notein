package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: loaded from: classes4.dex */
public class ez3 extends AbstractC7361bz {

    /* JADX INFO: renamed from: du */
    private int f22550du;

    /* JADX INFO: renamed from: h4 */
    private int f22551h4;

    /* JADX INFO: renamed from: kk */
    private String f22552kk;

    /* JADX INFO: renamed from: m9 */
    private String f22553m9;

    /* JADX INFO: renamed from: to */
    private int f22554to;

    /* JADX INFO: renamed from: x1 */
    private String f22555x1;

    /* JADX INFO: renamed from: k4 */
    public static final int f22549k4 = bhu.m28903k4("simple");

    /* JADX INFO: renamed from: dy */
    private static final C7017h4 f22548dy = new C7017h4("draw:class-id", "xlink:href", "xlink:type", "xlink:show", "xlink:actuate", "binary-data");

    public ez3() {
        m31466h4();
    }

    /* JADX INFO: renamed from: h4 */
    private void m31466h4() {
        this.f22554to = f22549k4;
        this.f22550du = 0;
        this.f22551h4 = 0;
    }

    /* JADX INFO: renamed from: kk */
    public final int m31477kk() {
        return this.f22551h4;
    }

    /* JADX INFO: renamed from: to */
    public final String m31480to() {
        return this.f22553m9;
    }

    public ez3(final AbstractC13912i5 abstractC13912i5) {
        m31466h4();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.ez3.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = ez3.f22548dy.m27428k4(str);
                if (iM27428k4 == 0) {
                    ez3.this.f22555x1 = str2;
                    return true;
                }
                if (iM27428k4 == 1) {
                    ez3.this.f22552kk = str2;
                    return true;
                }
                if (iM27428k4 == 2) {
                    ez3.this.f22554to = bhu.m28903k4(str2);
                    return true;
                }
                if (iM27428k4 == 3) {
                    ez3.this.f22550du = bdd.m28828k4(str2);
                    return true;
                }
                if (iM27428k4 != 4) {
                    return false;
                }
                ez3.this.f22551h4 = qs5.m39644k4(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.ez3.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (ez3.f22548dy.m27428k4(abstractC13912i5.mo65023fa()) != 5) {
                    return false;
                }
                ez3.this.f22553m9 = abstractC13912i5.mo65052v4();
                if (abstractC13912i5.mo65048u4()) {
                    return true;
                }
                while (abstractC13912i5.mo65028jd() != 15) {
                    abstractC13912i5.mo65026h4();
                    ez3 ez3Var = ez3.this;
                    ez3Var.f22553m9 = C14113y2.m67400k4(ez3Var.f22553m9, abstractC13912i5.mo65052v4());
                }
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final String m31474k4() {
        return this.f22555x1;
    }

    /* JADX INFO: renamed from: x1 */
    public final String m31481x1() {
        return this.f22552kk;
    }

    /* JADX INFO: renamed from: kk */
    public final void m31478kk(int i) {
        this.f22551h4 = i;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m31482x1(int i) {
        this.f22550du = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m31475k4(int i) {
        this.f22554to = i;
    }

    /* JADX INFO: renamed from: kk */
    public final void m31479kk(String str) {
        this.f22553m9 = str;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m31483x1(String str) {
        this.f22552kk = str;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m31476k4(String str) {
        this.f22555x1 = str;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        C3059ii c3059ii2;
        c3059ii.mo12953k4(str, str2, (String) null);
        String str3 = this.f22555x1;
        if (str3 != null) {
            c3059ii.m12955x1("draw:class-id", str3);
        }
        String str4 = this.f22552kk;
        if (str4 != null) {
            c3059ii.m12955x1("xlink:href", str4);
        }
        int i = this.f22554to;
        if (i != f22549k4) {
            c3059ii.m12955x1("xlink:type", bhu.m28904k4(i));
        }
        int i2 = this.f22550du;
        if (i2 != 0) {
            c3059ii.m12955x1("xlink:show", bdd.m28829k4(i2));
        }
        int i3 = this.f22551h4;
        if (i3 != 0) {
            c3059ii.m12955x1("xlink:actuate", qs5.m39645k4(i3));
        }
        String str5 = this.f22553m9;
        if (str5 != null) {
            c3059ii2 = c3059ii;
            m29301k4("office", c3059ii2, "binary-data", str5, false);
        } else {
            c3059ii2 = c3059ii;
        }
        c3059ii2.mo21898jd();
    }
}
