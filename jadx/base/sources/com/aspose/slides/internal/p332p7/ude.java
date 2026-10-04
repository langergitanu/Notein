package com.aspose.slides.internal.p332p7;

import Oooo0o0.C20986OooO0o0;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.p559ms.System.C14084qq;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: loaded from: classes4.dex */
public class ude extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private C14084qq f31230kk = new C14084qq();

    /* JADX INFO: renamed from: to */
    private int f31231to;

    /* JADX INFO: renamed from: x1 */
    private String f31232x1;

    /* JADX INFO: renamed from: k4 */
    public static final C14084qq f31229k4 = C14084qq.f47299x1.Clone();

    /* JADX INFO: renamed from: du */
    private static final C7017h4 f31228du = new C7017h4("w_Author", "w_Date", "w_Id");

    public ude() {
        m42334x1();
    }

    /* JADX INFO: renamed from: x1 */
    private void m42334x1() {
        f31229k4.CloneTo(this.f31230kk);
    }

    public ude(AbstractC13912i5 abstractC13912i5) {
        m42334x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.ude.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = ude.f31228du.m27428k4(str);
                if (iM27428k4 == 0) {
                    ude.this.f31232x1 = str2;
                    return true;
                }
                if (iM27428k4 == 1) {
                    C14084qq.m67089k4(str2, C11697x1.m55252to(), 16).CloneTo(ude.this.f31230kk);
                    return true;
                }
                if (iM27428k4 != 2) {
                    return false;
                }
                ude.this.f31231to = C13850af.m65151yj(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("w:author", this.f31232x1);
        if (C14084qq.m67078dy(this.f31230kk, f31229k4)) {
            C20986OooO0o0.OooO0O0(this.f31230kk, "yyyy-MM-ddTHH:mm:ss.fffffffK", c3059ii, "w:date");
        }
        c3059ii.m12955x1("w:id", C13850af.m65103k4(this.f31231to));
        c3059ii.mo21898jd();
    }
}
