package com.aspose.slides.internal.p332p7;

import Oooo0o0.C20986OooO0o0;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.p559ms.System.C14084qq;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: loaded from: classes4.dex */
public class kog extends AbstractC7361bz {

    /* JADX INFO: renamed from: k4 */
    public static final C14084qq f25853k4 = C14084qq.f47299x1.Clone();

    /* JADX INFO: renamed from: m9 */
    private static final C7017h4 f25854m9 = new C7017h4("w_FullDate", "dateFormat", "lid", "storeMappedDataAs", "calendar");

    /* JADX INFO: renamed from: du */
    private fo3 f25855du;

    /* JADX INFO: renamed from: h4 */
    private fc1 f25856h4;

    /* JADX INFO: renamed from: kk */
    private ef9 f25857kk;

    /* JADX INFO: renamed from: to */
    private vp3 f25858to;

    /* JADX INFO: renamed from: x1 */
    private C14084qq f25859x1 = new C14084qq();

    public kog() {
        m35598x1();
    }

    /* JADX INFO: renamed from: x1 */
    private void m35598x1() {
        f25853k4.CloneTo(this.f25859x1);
    }

    public kog(final AbstractC13912i5 abstractC13912i5) {
        m35598x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.kog.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (kog.f25854m9.m27428k4(str) != 0) {
                    return false;
                }
                C14084qq.m67089k4(str2, C11697x1.m55252to(), 16).CloneTo(kog.this.f25859x1);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.kog.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = kog.f25854m9.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 1) {
                    kog.this.f25857kk = new ef9(abstractC13912i5);
                } else if (iM27428k4 == 2) {
                    kog.this.f25858to = new vp3(abstractC13912i5);
                } else if (iM27428k4 == 3) {
                    kog.this.f25855du = new fo3(abstractC13912i5);
                } else {
                    if (iM27428k4 != 4) {
                        return false;
                    }
                    kog.this.f25856h4 = new fc1(abstractC13912i5);
                }
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        if (C14084qq.m67078dy(this.f25859x1, f25853k4)) {
            C20986OooO0o0.OooO0O0(this.f25859x1, "yyyy-MM-ddTHH:mm:ss.fffffffK", c3059ii, "w:fullDate");
        }
        ef9 ef9Var = this.f25857kk;
        if (ef9Var != null) {
            ef9Var.mo6846k4("w", c3059ii, "dateFormat");
        }
        vp3 vp3Var = this.f25858to;
        if (vp3Var != null) {
            vp3Var.mo6846k4("w", c3059ii, "lid");
        }
        fo3 fo3Var = this.f25855du;
        if (fo3Var != null) {
            fo3Var.mo6846k4("w", c3059ii, "storeMappedDataAs");
        }
        fc1 fc1Var = this.f25856h4;
        if (fc1Var != null) {
            fc1Var.mo6846k4("w", c3059ii, "calendar");
        }
        c3059ii.mo21898jd();
    }
}
