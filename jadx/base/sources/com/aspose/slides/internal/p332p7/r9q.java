package com.aspose.slides.internal.p332p7;

import Oooo0o0.C20986OooO0o0;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.p559ms.System.C14077m4;
import com.aspose.slides.p559ms.System.C14084qq;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;

/* JADX INFO: loaded from: classes4.dex */
public class r9q extends AbstractC7361bz {

    /* JADX INFO: renamed from: du */
    private C14084qq f29206du = new C14084qq();

    /* JADX INFO: renamed from: h4 */
    private C14077m4 f29207h4 = new C14077m4();

    /* JADX INFO: renamed from: kk */
    private byte f29208kk;

    /* JADX INFO: renamed from: m9 */
    private String f29209m9;

    /* JADX INFO: renamed from: to */
    private String f29210to;

    /* JADX INFO: renamed from: k4 */
    public static final C14084qq f29204k4 = C14084qq.f47299x1.Clone();

    /* JADX INFO: renamed from: x1 */
    public static final C14077m4 f29205x1 = C14077m4.f47265kk.Clone();

    /* JADX INFO: renamed from: dy */
    private static final C7017h4 f29203dy = new C7017h4("text:fixed", "style:data-style-name", "text:date-value", "text:date-adjust");

    public r9q() {
        m39914to();
    }

    /* JADX INFO: renamed from: to */
    private void m39914to() {
        this.f29208kk = (byte) -1;
        f29204k4.CloneTo(this.f29206du);
        f29205x1.CloneTo(this.f29207h4);
    }

    /* JADX INFO: renamed from: k4 */
    public final byte m39916k4() {
        return this.f29208kk;
    }

    public r9q(AbstractC13912i5 abstractC13912i5) {
        m39914to();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.r9q.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = r9q.f29203dy.m27428k4(str);
                if (iM27428k4 == 0) {
                    r9q.this.f29208kk = AbstractC7361bz.m29296rv(str2);
                    return true;
                }
                if (iM27428k4 == 1) {
                    r9q.this.f29210to = str2;
                    return true;
                }
                if (iM27428k4 == 2) {
                    C14084qq.m67089k4(str2, C11697x1.m55252to(), 16).CloneTo(r9q.this.f29206du);
                    return true;
                }
                if (iM27428k4 != 3) {
                    return false;
                }
                AbstractC7361bz.m29294ks(str2).CloneTo(r9q.this.f29207h4);
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
                    if (OooO0o.OooO0OO(abstractC13912i5, f29203dy)) {
                        break;
                    }
                } else if (abstractC13912i5.mo65028jd() == 3 || abstractC13912i5.mo65028jd() == 13 || abstractC13912i5.mo65028jd() == 14) {
                    this.f29209m9 = C14113y2.m67400k4(this.f29209m9, abstractC13912i5.mo65042rv());
                }
            }
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final String m39917x1() {
        return this.f29209m9;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        byte b = this.f29208kk;
        if (b != -1) {
            c3059ii.m12955x1("text:fixed", b == 1 ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        String str3 = this.f29210to;
        if (str3 != null) {
            c3059ii.m12955x1("style:data-style-name", str3);
        }
        if (C14084qq.m67078dy(this.f29206du, f29204k4)) {
            C20986OooO0o0.OooO0O0(this.f29206du, "yyyy-MM-ddTHH:mm:ss.fffffffK", c3059ii, "text:date-value");
        }
        if (C14077m4.m66795du(this.f29207h4, f29205x1)) {
            C22240OooOO0o.OooO00o(this.f29207h4, c3059ii, "text:date-adjust");
        }
        String str4 = this.f29209m9;
        if (str4 != null) {
            c3059ii.mo21918x1(str4);
        }
        c3059ii.mo21898jd();
    }
}
