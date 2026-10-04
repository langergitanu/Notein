package com.aspose.slides.internal.p332p7;

import Oooo0o0.C20986OooO0o0;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.p559ms.System.C14084qq;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: loaded from: classes4.dex */
public class s5e extends AbstractC7361bz {

    /* JADX INFO: renamed from: du */
    private int f29926du;

    /* JADX INFO: renamed from: h4 */
    private String f29927h4;

    /* JADX INFO: renamed from: kk */
    private String f29928kk;

    /* JADX INFO: renamed from: m9 */
    private C14084qq f29929m9 = new C14084qq();

    /* JADX INFO: renamed from: to */
    private int f29930to;

    /* JADX INFO: renamed from: k4 */
    public static final int f29924k4 = bhu.m28903k4("simple");

    /* JADX INFO: renamed from: x1 */
    public static final C14084qq f29925x1 = C14084qq.f47299x1.Clone();

    /* JADX INFO: renamed from: dy */
    private static final C7017h4 f29923dy = new C7017h4("xlink:href", "xlink:type", "xlink:actuate", "xlink:title", "meta:date");

    public s5e() {
        m40796x1();
    }

    public s5e(AbstractC13912i5 abstractC13912i5) {
        m40796x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.s5e.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = s5e.f29923dy.m27428k4(str);
                if (iM27428k4 == 0) {
                    s5e.this.f29928kk = str2;
                    return true;
                }
                if (iM27428k4 == 1) {
                    s5e.this.f29930to = bhu.m28903k4(str2);
                    return true;
                }
                if (iM27428k4 == 2) {
                    s5e.this.f29926du = x2a.m44176k4(str2);
                    return true;
                }
                if (iM27428k4 == 3) {
                    s5e.this.f29927h4 = str2;
                    return true;
                }
                if (iM27428k4 != 4) {
                    return false;
                }
                C14084qq.m67089k4(str2, C11697x1.m55252to(), 16).CloneTo(s5e.this.f29929m9);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: x1 */
    private void m40796x1() {
        this.f29930to = f29924k4;
        this.f29926du = 0;
        f29925x1.CloneTo(this.f29929m9);
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("xlink:href", this.f29928kk);
        int i = this.f29930to;
        if (i != f29924k4) {
            c3059ii.m12955x1("xlink:type", bhu.m28904k4(i));
        }
        int i2 = this.f29926du;
        if (i2 != 0) {
            c3059ii.m12955x1("xlink:actuate", x2a.m44177k4(i2));
        }
        String str3 = this.f29927h4;
        if (str3 != null) {
            c3059ii.m12955x1("xlink:title", str3);
        }
        if (C14084qq.m67078dy(this.f29929m9, f29925x1)) {
            C20986OooO0o0.OooO0O0(this.f29929m9, "yyyy-MM-ddTHH:mm:ss.fffffffK", c3059ii, "meta:date");
        }
        c3059ii.mo21898jd();
    }
}
