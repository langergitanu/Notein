package com.aspose.slides.internal.p332p7;

import Oooo0o0.C20986OooO0o0;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.p559ms.System.C14084qq;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.u7 */
/* JADX INFO: loaded from: classes4.dex */
public class C8925u7 extends AbstractC7361bz {

    /* JADX INFO: renamed from: k4 */
    public static final C14084qq f31047k4 = C14084qq.f47299x1.Clone();

    /* JADX INFO: renamed from: m9 */
    private static final C7017h4 f31048m9 = new C7017h4("xml:id", "time", "timestampRef", "timeString", "timeOffset");

    /* JADX INFO: renamed from: du */
    private C14084qq f31049du = new C14084qq();

    /* JADX INFO: renamed from: h4 */
    private String f31050h4;

    /* JADX INFO: renamed from: kk */
    private long f31051kk;

    /* JADX INFO: renamed from: to */
    private String f31052to;

    /* JADX INFO: renamed from: x1 */
    private String f31053x1;

    public C8925u7() {
        m42117m9();
    }

    /* JADX INFO: renamed from: m9 */
    private void m42117m9() {
        this.f31051kk = 0L;
        f31047k4.CloneTo(this.f31049du);
        this.f31050h4 = "0";
    }

    /* JADX INFO: renamed from: du */
    public final String m42119du() {
        return this.f31050h4;
    }

    /* JADX INFO: renamed from: kk */
    public final String m42124kk() {
        return this.f31052to;
    }

    /* JADX INFO: renamed from: to */
    public final C14084qq m42126to() {
        return this.f31049du;
    }

    /* JADX INFO: renamed from: x1 */
    public final long m42127x1() {
        return this.f31051kk;
    }

    public C8925u7(AbstractC13912i5 abstractC13912i5) {
        m42117m9();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.u7.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = C8925u7.f31048m9.m27428k4(str);
                if (iM27428k4 == 0) {
                    C8925u7.this.f31053x1 = str2;
                    return true;
                }
                if (iM27428k4 == 1) {
                    C8925u7.this.f31051kk = C13850af.m65074ix(str2);
                    return true;
                }
                if (iM27428k4 == 2) {
                    C8925u7.this.f31052to = str2;
                    return true;
                }
                if (iM27428k4 == 3) {
                    C14084qq.m67089k4(str2, C11697x1.m55252to(), 16).CloneTo(C8925u7.this.f31049du);
                    return true;
                }
                if (iM27428k4 != 4) {
                    return false;
                }
                C8925u7.this.f31050h4 = str2;
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: k4 */
    public final String m42120k4() {
        return this.f31053x1;
    }

    /* JADX INFO: renamed from: kk */
    public final void m42125kk(String str) {
        this.f31050h4 = str;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m42128x1(String str) {
        this.f31052to = str;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m42121k4(long j) {
        this.f31051kk = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m42122k4(C14084qq c14084qq) {
        c14084qq.CloneTo(this.f31049du);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m42123k4(String str) {
        this.f31053x1 = str;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("xml:id", this.f31053x1);
        long j = this.f31051kk;
        if (j != 0) {
            c3059ii.m12955x1("time", C13850af.m65119kk(j));
        }
        String str3 = this.f31052to;
        if (str3 != null) {
            c3059ii.m12955x1("timestampRef", str3);
        }
        if (C14084qq.m67078dy(this.f31049du, f31047k4)) {
            C20986OooO0o0.OooO0O0(this.f31049du, "yyyy-MM-ddTHH:mm:ss.fffffffK", c3059ii, "timeString");
        }
        if (!"0".equals(this.f31050h4)) {
            c3059ii.m12955x1("timeOffset", this.f31050h4);
        }
        c3059ii.mo21898jd();
    }
}
