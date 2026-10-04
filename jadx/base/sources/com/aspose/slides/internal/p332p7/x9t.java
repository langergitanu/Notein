package com.aspose.slides.internal.p332p7;

import Oooo0o0.C20986OooO0o0;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14077m4;
import com.aspose.slides.p559ms.System.C14084qq;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;

/* JADX INFO: loaded from: classes4.dex */
public class x9t extends AbstractC7361bz {

    /* JADX INFO: renamed from: ck */
    private String f32755ck;

    /* JADX INFO: renamed from: du */
    private int f32756du;

    /* JADX INFO: renamed from: fa */
    private int f32758fa;

    /* JADX INFO: renamed from: h4 */
    private double f32759h4;

    /* JADX INFO: renamed from: jd */
    private byte f32760jd;

    /* JADX INFO: renamed from: kk */
    private String f32761kk;

    /* JADX INFO: renamed from: m9 */
    private String f32762m9;

    /* JADX INFO: renamed from: to */
    private String f32763to;

    /* JADX INFO: renamed from: up */
    private String f32764up;

    /* JADX INFO: renamed from: yj */
    private String f32765yj;

    /* JADX INFO: renamed from: k4 */
    public static final C14084qq f32751k4 = C14084qq.f47299x1.Clone();

    /* JADX INFO: renamed from: x1 */
    public static final C14077m4 f32753x1 = C14077m4.f47265kk.Clone();

    /* JADX INFO: renamed from: ks */
    private static final C7017h4 f32752ks = new C7017h4("text:name", "text:formula", "office:value-type", "office:value", "office:currency", "office:date-value", "office:time-value", "office:boolean-value", "office:string-value", "text:display", "style:data-style-name");

    /* JADX INFO: renamed from: dy */
    private C14084qq f32757dy = new C14084qq();

    /* JADX INFO: renamed from: c5 */
    private C14077m4 f32754c5 = new C14077m4();

    public x9t() {
        m44270x1();
    }

    public x9t(AbstractC13912i5 abstractC13912i5) {
        m44270x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.x9t.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                switch (x9t.f32752ks.m27428k4(str)) {
                    case 0:
                        x9t.this.f32761kk = str2;
                        break;
                    case 1:
                        x9t.this.f32763to = str2;
                        break;
                    case 2:
                        x9t.this.f32756du = b3e.m28701k4(str2);
                        break;
                    case 3:
                        x9t.this.f32759h4 = AbstractC7361bz.m29300yj(str2);
                        break;
                    case 4:
                        x9t.this.f32762m9 = str2;
                        break;
                    case 5:
                        C14084qq.m67089k4(str2, C11697x1.m55252to(), 16).CloneTo(x9t.this.f32757dy);
                        break;
                    case 6:
                        AbstractC7361bz.m29294ks(str2).CloneTo(x9t.this.f32754c5);
                        break;
                    case 7:
                        x9t.this.f32760jd = AbstractC7361bz.m29296rv(str2);
                        break;
                    case 8:
                        x9t.this.f32755ck = str2;
                        break;
                    case 9:
                        x9t.this.f32758fa = b3h.m28703k4(str2);
                        break;
                    case 10:
                        x9t.this.f32764up = str2;
                        break;
                }
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
                    if (OooO0o.OooO0OO(abstractC13912i5, f32752ks)) {
                        break;
                    }
                } else if (abstractC13912i5.mo65028jd() == 3 || abstractC13912i5.mo65028jd() == 13 || abstractC13912i5.mo65028jd() == 14) {
                    this.f32765yj = C14113y2.m67400k4(this.f32765yj, abstractC13912i5.mo65042rv());
                }
            }
        }
    }

    /* JADX INFO: renamed from: x1 */
    private void m44270x1() {
        this.f32756du = 0;
        this.f32759h4 = Double.NaN;
        f32751k4.CloneTo(this.f32757dy);
        f32753x1.CloneTo(this.f32754c5);
        this.f32760jd = (byte) -1;
        this.f32758fa = 0;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("text:name", this.f32761kk);
        String str3 = this.f32763to;
        if (str3 != null) {
            c3059ii.m12955x1("text:formula", str3);
        }
        int i = this.f32756du;
        if (i != 0) {
            c3059ii.m12955x1("office:value-type", b3e.m28702k4(i));
        }
        if (!C14044b3.m66437kk(this.f32759h4)) {
            c3059ii.m12955x1("office:value", C13850af.m65101k4(this.f32759h4));
        }
        String str4 = this.f32762m9;
        if (str4 != null) {
            c3059ii.m12955x1("office:currency", str4);
        }
        if (C14084qq.m67078dy(this.f32757dy, f32751k4)) {
            C20986OooO0o0.OooO0O0(this.f32757dy, "yyyy-MM-ddTHH:mm:ss.fffffffK", c3059ii, "office:date-value");
        }
        if (C14077m4.m66795du(this.f32754c5, f32753x1)) {
            C22240OooOO0o.OooO00o(this.f32754c5, c3059ii, "office:time-value");
        }
        byte b = this.f32760jd;
        if (b != -1) {
            c3059ii.m12955x1("office:boolean-value", b == 1 ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        String str5 = this.f32755ck;
        if (str5 != null) {
            c3059ii.m12955x1("office:string-value", str5);
        }
        int i2 = this.f32758fa;
        if (i2 != 0) {
            c3059ii.m12955x1("text:display", b3h.m28704k4(i2));
        }
        String str6 = this.f32764up;
        if (str6 != null) {
            c3059ii.m12955x1("style:data-style-name", str6);
        }
        String str7 = this.f32765yj;
        if (str7 != null) {
            c3059ii.mo21918x1(str7);
        }
        c3059ii.mo21898jd();
    }
}
