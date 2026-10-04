package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14077m4;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: loaded from: classes4.dex */
public class lyj extends AbstractC7361bz {

    /* JADX INFO: renamed from: du */
    private int f26595du;

    /* JADX INFO: renamed from: h4 */
    private String f26596h4;

    /* JADX INFO: renamed from: kk */
    private int f26597kk;

    /* JADX INFO: renamed from: m9 */
    private C14077m4 f26598m9 = new C14077m4();

    /* JADX INFO: renamed from: to */
    private int f26599to;

    /* JADX INFO: renamed from: k4 */
    public static final int f26593k4 = bhu.m28903k4("simple");

    /* JADX INFO: renamed from: x1 */
    public static final C14077m4 f26594x1 = C14077m4.f47265kk.Clone();

    /* JADX INFO: renamed from: dy */
    private static final C7017h4 f26592dy = new C7017h4("xlink:type", "xlink:show", "xlink:actuate", "xlink:href", "meta:delay");

    public lyj() {
        m36525x1();
    }

    public lyj(AbstractC13912i5 abstractC13912i5) {
        m36525x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.lyj.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = lyj.f26592dy.m27428k4(str);
                if (iM27428k4 == 0) {
                    lyj.this.f26597kk = bhu.m28903k4(str2);
                    return true;
                }
                if (iM27428k4 == 1) {
                    lyj.this.f26599to = jjx.m34729k4(str2);
                    return true;
                }
                if (iM27428k4 == 2) {
                    lyj.this.f26595du = qs5.m39644k4(str2);
                    return true;
                }
                if (iM27428k4 == 3) {
                    lyj.this.f26596h4 = str2;
                    return true;
                }
                if (iM27428k4 != 4) {
                    return false;
                }
                AbstractC7361bz.m29294ks(str2).CloneTo(lyj.this.f26598m9);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: x1 */
    private void m36525x1() {
        this.f26597kk = f26593k4;
        this.f26599to = 0;
        this.f26595du = 0;
        f26594x1.CloneTo(this.f26598m9);
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        int i = this.f26597kk;
        if (i != f26593k4) {
            c3059ii.m12955x1("xlink:type", bhu.m28904k4(i));
        }
        int i2 = this.f26599to;
        if (i2 != 0) {
            c3059ii.m12955x1("xlink:show", jjx.m34730k4(i2));
        }
        int i3 = this.f26595du;
        if (i3 != 0) {
            c3059ii.m12955x1("xlink:actuate", qs5.m39645k4(i3));
        }
        String str3 = this.f26596h4;
        if (str3 != null) {
            c3059ii.m12955x1("xlink:href", str3);
        }
        if (C14077m4.m66795du(this.f26598m9, f26594x1)) {
            C22240OooOO0o.OooO00o(this.f26598m9, c3059ii, "meta:delay");
        }
        c3059ii.mo21898jd();
    }
}
