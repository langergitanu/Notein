package com.aspose.slides.internal.p332p7;

import Oooo0o0.C20986OooO0o0;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.p559ms.System.C14084qq;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: loaded from: classes4.dex */
public class jyr extends AbstractC7361bz {

    /* JADX INFO: renamed from: k4 */
    public static final C14084qq f25412k4 = C14084qq.f47299x1.Clone();

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f25413to = new C7017h4("table:value-type", "table:date-value");

    /* JADX INFO: renamed from: kk */
    private C14084qq f25414kk = new C14084qq();

    /* JADX INFO: renamed from: x1 */
    private String f25415x1;

    public jyr() {
        m35061x1();
    }

    /* JADX INFO: renamed from: x1 */
    private void m35061x1() {
        this.f25415x1 = "date";
        f25412k4.CloneTo(this.f25414kk);
    }

    public jyr(AbstractC13912i5 abstractC13912i5) {
        m35061x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.jyr.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = jyr.f25413to.m27428k4(str);
                if (iM27428k4 == 0) {
                    jyr.this.f25415x1 = str2;
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                C14084qq.m67089k4(str2, C11697x1.m55252to(), 16).CloneTo(jyr.this.f25414kk);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        if (!"date".equals(this.f25415x1)) {
            c3059ii.m12955x1("table:value-type", this.f25415x1);
        }
        if (C14084qq.m67078dy(this.f25414kk, f25412k4)) {
            C20986OooO0o0.OooO0O0(this.f25414kk, "yyyy-MM-ddTHH:mm:ss.fffffffK", c3059ii, "table:date-value");
        }
        c3059ii.mo21898jd();
    }
}
