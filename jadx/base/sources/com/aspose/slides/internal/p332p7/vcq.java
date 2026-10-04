package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: loaded from: classes4.dex */
public class vcq extends AbstractC7361bz {

    /* JADX INFO: renamed from: du */
    private int f31731du;

    /* JADX INFO: renamed from: h4 */
    private int f31732h4;

    /* JADX INFO: renamed from: kk */
    private String f31733kk;

    /* JADX INFO: renamed from: m9 */
    private C7394ca f31734m9;

    /* JADX INFO: renamed from: to */
    private int f31735to;

    /* JADX INFO: renamed from: x1 */
    private String f31736x1;

    /* JADX INFO: renamed from: k4 */
    public static final int f31730k4 = bhu.m28903k4("simple");

    /* JADX INFO: renamed from: dy */
    private static final C7017h4 f31729dy = new C7017h4("draw:notify-on-update-of-ranges", "xlink:href", "xlink:type", "xlink:show", "xlink:actuate", "document", "math");

    public vcq() {
        m42928to();
    }

    /* JADX INFO: renamed from: to */
    private void m42928to() {
        this.f31735to = f31730k4;
        this.f31731du = 0;
        this.f31732h4 = 0;
    }

    /* JADX INFO: renamed from: x1 */
    public final int m42932x1() {
        return this.f31731du;
    }

    public vcq(final AbstractC13912i5 abstractC13912i5) {
        m42928to();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.vcq.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = vcq.f31729dy.m27428k4(str);
                if (iM27428k4 == 0) {
                    vcq.this.f31736x1 = str2;
                    return true;
                }
                if (iM27428k4 == 1) {
                    vcq.this.f31733kk = str2;
                    return true;
                }
                if (iM27428k4 == 2) {
                    vcq.this.f31735to = bhu.m28903k4(str2);
                    return true;
                }
                if (iM27428k4 == 3) {
                    vcq.this.f31731du = bdd.m28828k4(str2);
                    return true;
                }
                if (iM27428k4 != 4) {
                    return false;
                }
                vcq.this.f31732h4 = qs5.m39644k4(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.vcq.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                vcq vcqVar;
                C7394ca c7394ca;
                int iM27428k4 = vcq.f31729dy.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 5) {
                    vcqVar = vcq.this;
                    c7394ca = new C7394ca("document", new kjz(abstractC13912i5));
                } else {
                    if (iM27428k4 != 6) {
                        return false;
                    }
                    vcqVar = vcq.this;
                    c7394ca = new C7394ca("math", new kp9(abstractC13912i5));
                }
                vcqVar.f31734m9 = c7394ca;
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final String m42931k4() {
        return this.f31733kk;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        String str3 = this.f31736x1;
        if (str3 != null) {
            c3059ii.m12955x1("draw:notify-on-update-of-ranges", str3);
        }
        String str4 = this.f31733kk;
        if (str4 != null) {
            c3059ii.m12955x1("xlink:href", str4);
        }
        int i = this.f31735to;
        if (i != f31730k4) {
            c3059ii.m12955x1("xlink:type", bhu.m28904k4(i));
        }
        int i2 = this.f31731du;
        if (i2 != 0) {
            c3059ii.m12955x1("xlink:show", bdd.m28829k4(i2));
        }
        int i3 = this.f31732h4;
        if (i3 != 0) {
            c3059ii.m12955x1("xlink:actuate", qs5.m39645k4(i3));
        }
        C7394ca c7394ca = this.f31734m9;
        if (c7394ca != null) {
            int iM27428k4 = f31729dy.m27428k4(c7394ca.m29539k4());
            if (iM27428k4 == 5) {
                ((kjz) this.f31734m9.m29541kk()).mo6846k4("office", c3059ii, this.f31734m9.m29539k4());
            } else if (iM27428k4 == 6) {
                ((kp9) this.f31734m9.m29541kk()).mo6846k4("math", c3059ii, this.f31734m9.m29539k4());
            }
        }
        c3059ii.mo21898jd();
    }
}
