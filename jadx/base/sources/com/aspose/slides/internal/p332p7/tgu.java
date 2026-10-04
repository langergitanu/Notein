package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: loaded from: classes4.dex */
public class tgu extends AbstractC7361bz {

    /* JADX INFO: renamed from: k4 */
    public static final int f30738k4 = bhu.m28903k4("simple");

    /* JADX INFO: renamed from: m9 */
    private static final C7017h4 f30739m9 = new C7017h4("draw:frame-name", "xlink:href", "xlink:type", "xlink:show", "xlink:actuate");

    /* JADX INFO: renamed from: du */
    private int f30740du;

    /* JADX INFO: renamed from: h4 */
    private int f30741h4;

    /* JADX INFO: renamed from: kk */
    private String f30742kk;

    /* JADX INFO: renamed from: to */
    private int f30743to;

    /* JADX INFO: renamed from: x1 */
    private String f30744x1;

    public tgu() {
        m41719x1();
    }

    public tgu(AbstractC13912i5 abstractC13912i5) {
        m41719x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.tgu.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = tgu.f30739m9.m27428k4(str);
                if (iM27428k4 == 0) {
                    tgu.this.f30744x1 = str2;
                    return true;
                }
                if (iM27428k4 == 1) {
                    tgu.this.f30742kk = str2;
                    return true;
                }
                if (iM27428k4 == 2) {
                    tgu.this.f30743to = bhu.m28903k4(str2);
                    return true;
                }
                if (iM27428k4 == 3) {
                    tgu.this.f30740du = bdd.m28828k4(str2);
                    return true;
                }
                if (iM27428k4 != 4) {
                    return false;
                }
                tgu.this.f30741h4 = qs5.m39644k4(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: x1 */
    private void m41719x1() {
        this.f30743to = f30738k4;
        this.f30740du = 0;
        this.f30741h4 = 0;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        String str3 = this.f30744x1;
        if (str3 != null) {
            c3059ii.m12955x1("draw:frame-name", str3);
        }
        c3059ii.m12955x1("xlink:href", this.f30742kk);
        int i = this.f30743to;
        if (i != f30738k4) {
            c3059ii.m12955x1("xlink:type", bhu.m28904k4(i));
        }
        int i2 = this.f30740du;
        if (i2 != 0) {
            c3059ii.m12955x1("xlink:show", bdd.m28829k4(i2));
        }
        int i3 = this.f30741h4;
        if (i3 != 0) {
            c3059ii.m12955x1("xlink:actuate", qs5.m39645k4(i3));
        }
        c3059ii.mo21898jd();
    }
}
