package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.huawei.hms.network.embedded.C18437z2;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.gl */
/* JADX INFO: loaded from: classes4.dex */
public class C7772gl extends AbstractC7361bz {

    /* JADX INFO: renamed from: c5 */
    private int f23496c5;

    /* JADX INFO: renamed from: ck */
    private String f23497ck;

    /* JADX INFO: renamed from: du */
    private int f23498du;

    /* JADX INFO: renamed from: dy */
    private float f23499dy;

    /* JADX INFO: renamed from: fa */
    private C8743s6 f23500fa;

    /* JADX INFO: renamed from: h4 */
    private String f23501h4;

    /* JADX INFO: renamed from: jd */
    private String f23502jd;

    /* JADX INFO: renamed from: kk */
    private String f23503kk;

    /* JADX INFO: renamed from: m9 */
    private float f23504m9;

    /* JADX INFO: renamed from: to */
    private String f23505to;

    /* JADX INFO: renamed from: k4 */
    public static final int f23493k4 = C9054vo.m43189k4("decimal");

    /* JADX INFO: renamed from: x1 */
    public static final int f23495x1 = C8161l5.m35923k4("p_ve");

    /* JADX INFO: renamed from: up */
    private static final C7017h4 f23494up = new C7017h4("xml:id", "name", C18437z2.f56754h, "default", "min", "max", "orientation", "respectTo", "units", "mapping");

    public C7772gl() {
        m32590fa();
    }

    /* JADX INFO: renamed from: fa */
    private void m32590fa() {
        this.f23498du = f23493k4;
        this.f23501h4 = "0";
        this.f23504m9 = Float.NaN;
        this.f23499dy = Float.NaN;
        this.f23496c5 = f23495x1;
    }

    /* JADX INFO: renamed from: c5 */
    public final String m32600c5() {
        return this.f23497ck;
    }

    /* JADX INFO: renamed from: du */
    public final float m32601du() {
        return this.f23504m9;
    }

    /* JADX INFO: renamed from: dy */
    public final String m32603dy() {
        return this.f23502jd;
    }

    /* JADX INFO: renamed from: h4 */
    public final float m32604h4() {
        return this.f23499dy;
    }

    /* JADX INFO: renamed from: jd */
    public final C8743s6 m32605jd() {
        return this.f23500fa;
    }

    /* JADX INFO: renamed from: kk */
    public final int m32611kk() {
        return this.f23498du;
    }

    /* JADX INFO: renamed from: m9 */
    public final int m32613m9() {
        return this.f23496c5;
    }

    /* JADX INFO: renamed from: to */
    public final String m32614to() {
        return this.f23501h4;
    }

    public C7772gl(final AbstractC13912i5 abstractC13912i5) {
        m32590fa();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.gl.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                switch (C7772gl.f23494up.m27428k4(str)) {
                    case 0:
                        C7772gl.this.f23503kk = str2;
                        break;
                    case 1:
                        C7772gl.this.f23505to = str2;
                        break;
                    case 2:
                        C7772gl.this.f23498du = C9054vo.m43189k4(str2);
                        break;
                    case 3:
                        C7772gl.this.f23501h4 = str2;
                        break;
                    case 4:
                        C7772gl.this.f23504m9 = (float) AbstractC7361bz.m29300yj(str2);
                        break;
                    case 5:
                        C7772gl.this.f23499dy = (float) AbstractC7361bz.m29300yj(str2);
                        break;
                    case 6:
                        C7772gl.this.f23496c5 = C8161l5.m35923k4(str2);
                        break;
                    case 7:
                        C7772gl.this.f23502jd = str2;
                        break;
                    case 8:
                        C7772gl.this.f23497ck = str2;
                        break;
                }
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.gl.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (C7772gl.f23494up.m27428k4(abstractC13912i5.mo65023fa()) != 9) {
                    return false;
                }
                C7772gl.this.f23500fa = new C8743s6(abstractC13912i5);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: du */
    public final void m32602du(String str) {
        this.f23497ck = str;
    }

    /* JADX INFO: renamed from: kk */
    public final void m32612kk(String str) {
        this.f23501h4 = str;
    }

    /* JADX INFO: renamed from: to */
    public final void m32615to(String str) {
        this.f23502jd = str;
    }

    /* JADX INFO: renamed from: x1 */
    public final String m32616x1() {
        return this.f23505to;
    }

    /* JADX INFO: renamed from: k4 */
    public final String m32606k4() {
        return this.f23503kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m32617x1(float f) {
        this.f23499dy = f;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m32607k4(float f) {
        this.f23504m9 = f;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m32618x1(int i) {
        this.f23496c5 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m32608k4(int i) {
        this.f23498du = i;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m32619x1(String str) {
        this.f23505to = str;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m32609k4(C8743s6 c8743s6) {
        this.f23500fa = c8743s6;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m32610k4(String str) {
        this.f23503kk = str;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        String str3 = this.f23503kk;
        if (str3 != null) {
            c3059ii.m12955x1("xml:id", str3);
        }
        c3059ii.m12955x1("name", this.f23505to);
        int i = this.f23498du;
        if (i != f23493k4) {
            c3059ii.m12955x1(C18437z2.f56754h, C9054vo.m43190k4(i));
        }
        if (!"0".equals(this.f23501h4)) {
            c3059ii.m12955x1("default", this.f23501h4);
        }
        if (!C14064he.m66715kk(this.f23504m9)) {
            c3059ii.m12955x1("min", C13850af.m65102k4(this.f23504m9));
        }
        if (!C14064he.m66715kk(this.f23499dy)) {
            c3059ii.m12955x1("max", C13850af.m65102k4(this.f23499dy));
        }
        int i2 = this.f23496c5;
        if (i2 != f23495x1) {
            c3059ii.m12955x1("orientation", C8161l5.m35924k4(i2));
        }
        String str4 = this.f23502jd;
        if (str4 != null) {
            c3059ii.m12955x1("respectTo", str4);
        }
        String str5 = this.f23497ck;
        if (str5 != null) {
            c3059ii.m12955x1("units", str5);
        }
        C8743s6 c8743s6 = this.f23500fa;
        if (c8743s6 != null) {
            c8743s6.mo6846k4("inkml", c3059ii, "mapping");
        }
        c3059ii.mo21898jd();
    }
}
