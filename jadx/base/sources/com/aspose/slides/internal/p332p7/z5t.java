package com.aspose.slides.internal.p332p7;

import Oooo0o0.C20986OooO0o0;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.p559ms.System.C14084qq;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;

/* JADX INFO: loaded from: classes4.dex */
public class z5t extends AbstractC7361bz {

    /* JADX INFO: renamed from: du */
    private String f33768du;

    /* JADX INFO: renamed from: kk */
    private String f33769kk;

    /* JADX INFO: renamed from: to */
    private C14084qq f33770to = new C14084qq();

    /* JADX INFO: renamed from: x1 */
    private byte f33771x1;

    /* JADX INFO: renamed from: k4 */
    public static final C14084qq f33767k4 = C14084qq.f47299x1.Clone();

    /* JADX INFO: renamed from: h4 */
    private static final C7017h4 f33766h4 = new C7017h4("text:fixed", "style:data-style-name", "text:date-value");

    public z5t() {
        m45486x1();
    }

    /* JADX INFO: renamed from: x1 */
    private void m45486x1() {
        this.f33771x1 = (byte) -1;
        f33767k4.CloneTo(this.f33770to);
    }

    public z5t(AbstractC13912i5 abstractC13912i5) {
        m45486x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.z5t.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = z5t.f33766h4.m27428k4(str);
                if (iM27428k4 == 0) {
                    z5t.this.f33771x1 = AbstractC7361bz.m29296rv(str2);
                    return true;
                }
                if (iM27428k4 == 1) {
                    z5t.this.f33769kk = str2;
                    return true;
                }
                if (iM27428k4 != 2) {
                    return false;
                }
                C14084qq.m67089k4(str2, C11697x1.m55252to(), 16).CloneTo(z5t.this.f33770to);
                return true;
            }
        });
        if (abstractC13912i5.mo65048u4()) {
            return;
        }
        String strMo65023fa = abstractC13912i5.mo65023fa();
        while (abstractC13912i5.mo65026h4()) {
            while (true) {
                if (abstractC13912i5.mo65028jd() == 15 && C14113y2.m67363du(abstractC13912i5.mo65023fa(), strMo65023fa)) {
                    return;
                }
                if (abstractC13912i5.mo65028jd() == 1) {
                    if (OooO0o.OooO0OO(abstractC13912i5, f33766h4)) {
                        break;
                    }
                } else if (abstractC13912i5.mo65028jd() == 3 || abstractC13912i5.mo65028jd() == 13 || abstractC13912i5.mo65028jd() == 14) {
                    this.f33768du = C14113y2.m67400k4(this.f33768du, abstractC13912i5.mo65042rv());
                }
            }
        }
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        byte b = this.f33771x1;
        if (b != -1) {
            c3059ii.m12955x1("text:fixed", b == 1 ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        String str3 = this.f33769kk;
        if (str3 != null) {
            c3059ii.m12955x1("style:data-style-name", str3);
        }
        if (C14084qq.m67078dy(this.f33770to, f33767k4)) {
            C20986OooO0o0.OooO0O0(this.f33770to, "yyyy-MM-ddTHH:mm:ss.fffffffK", c3059ii, "text:date-value");
        }
        String str4 = this.f33768du;
        if (str4 != null) {
            c3059ii.mo21918x1(str4);
        }
        c3059ii.mo21898jd();
    }
}
