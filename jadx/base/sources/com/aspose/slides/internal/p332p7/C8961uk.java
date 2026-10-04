package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.uk */
/* JADX INFO: loaded from: classes4.dex */
public class C8961uk extends AbstractC7361bz {

    /* JADX INFO: renamed from: c5 */
    private String f31330c5;

    /* JADX INFO: renamed from: ck */
    private String f31331ck;

    /* JADX INFO: renamed from: du */
    private int f31332du;

    /* JADX INFO: renamed from: dy */
    private String f31333dy;

    /* JADX INFO: renamed from: h4 */
    private String f31334h4;

    /* JADX INFO: renamed from: jd */
    private String f31335jd;

    /* JADX INFO: renamed from: kk */
    private String f31336kk;

    /* JADX INFO: renamed from: m9 */
    private String f31337m9;

    /* JADX INFO: renamed from: to */
    private int f31338to;

    /* JADX INFO: renamed from: k4 */
    public static final int f31328k4 = C9104wd.m43624k4("penDown");

    /* JADX INFO: renamed from: x1 */
    public static final int f31329x1 = C8642r0.m39803k4("begin");

    /* JADX INFO: renamed from: fa */
    private static final C7017h4 f31327fa = new C7017h4("xml:id", "traceType", "continuation", "priorRef", "contextRef", "brushRef", "duration", "timeOffset");

    public C8961uk() {
        m42439ck();
    }

    /* JADX INFO: renamed from: ck */
    private void m42439ck() {
        this.f31338to = f31328k4;
        this.f31332du = f31329x1;
    }

    /* JADX INFO: renamed from: c5 */
    public final String m42449c5() {
        return this.f31331ck;
    }

    /* JADX INFO: renamed from: du */
    public final String m42450du() {
        return this.f31337m9;
    }

    /* JADX INFO: renamed from: dy */
    public final String m42452dy() {
        return this.f31335jd;
    }

    /* JADX INFO: renamed from: h4 */
    public final String m42453h4() {
        return this.f31333dy;
    }

    /* JADX INFO: renamed from: kk */
    public final int m42458kk() {
        return this.f31332du;
    }

    /* JADX INFO: renamed from: m9 */
    public final String m42460m9() {
        return this.f31330c5;
    }

    /* JADX INFO: renamed from: to */
    public final String m42462to() {
        return this.f31334h4;
    }

    /* JADX INFO: renamed from: x1 */
    public final int m42464x1() {
        return this.f31338to;
    }

    public C8961uk(AbstractC13912i5 abstractC13912i5) {
        m42439ck();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.uk.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                switch (C8961uk.f31327fa.m27428k4(str)) {
                    case 0:
                        C8961uk.this.f31336kk = str2;
                        break;
                    case 1:
                        C8961uk.this.f31338to = C9104wd.m43624k4(str2);
                        break;
                    case 2:
                        C8961uk.this.f31332du = C8642r0.m39803k4(str2);
                        break;
                    case 3:
                        C8961uk.this.f31334h4 = str2;
                        break;
                    case 4:
                        C8961uk.this.f31337m9 = str2;
                        break;
                    case 5:
                        C8961uk.this.f31333dy = str2;
                        break;
                    case 6:
                        C8961uk.this.f31330c5 = str2;
                        break;
                    case 7:
                        C8961uk.this.f31335jd = str2;
                        break;
                }
                return true;
            }
        });
        if (abstractC13912i5.mo65048u4()) {
            return;
        }
        abstractC13912i5.mo65026h4();
        this.f31331ck = abstractC13912i5.mo65042rv();
    }

    /* JADX INFO: renamed from: k4 */
    public final String m42455k4() {
        return this.f31336kk;
    }

    /* JADX INFO: renamed from: m9 */
    public final void m42461m9(String str) {
        this.f31331ck = str;
    }

    /* JADX INFO: renamed from: du */
    public final void m42451du(String str) {
        this.f31330c5 = str;
    }

    /* JADX INFO: renamed from: h4 */
    public final void m42454h4(String str) {
        this.f31335jd = str;
    }

    /* JADX INFO: renamed from: kk */
    public final void m42459kk(String str) {
        this.f31337m9 = str;
    }

    /* JADX INFO: renamed from: to */
    public final void m42463to(String str) {
        this.f31333dy = str;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m42456k4(int i) {
        this.f31338to = i;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m42465x1(int i) {
        this.f31332du = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m42457k4(String str) {
        this.f31336kk = str;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m42466x1(String str) {
        this.f31334h4 = str;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        String str3 = this.f31336kk;
        if (str3 != null) {
            c3059ii.m12955x1("xml:id", str3);
        }
        int i = this.f31338to;
        if (i != f31328k4) {
            c3059ii.m12955x1("traceType", C9104wd.m43625k4(i));
        }
        int i2 = this.f31332du;
        if (i2 != f31329x1) {
            c3059ii.m12955x1("continuation", C8642r0.m39804k4(i2));
        }
        String str4 = this.f31334h4;
        if (str4 != null) {
            c3059ii.m12955x1("priorRef", str4);
        }
        String str5 = this.f31337m9;
        if (str5 != null) {
            c3059ii.m12955x1("contextRef", str5);
        }
        String str6 = this.f31333dy;
        if (str6 != null) {
            c3059ii.m12955x1("brushRef", str6);
        }
        String str7 = this.f31330c5;
        if (str7 != null) {
            c3059ii.m12955x1("duration", str7);
        }
        String str8 = this.f31335jd;
        if (str8 != null) {
            c3059ii.m12955x1("timeOffset", str8);
        }
        c3059ii.mo21918x1(this.f31331ck);
        c3059ii.mo21898jd();
    }
}
