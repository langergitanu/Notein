package com.aspose.slides.p559ms.System.Xml;

import com.aspose.slides.internal.p080dd.AbstractC3124b3;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.ms.System.Xml.yw */
/* JADX INFO: loaded from: classes5.dex */
public class C14030yw extends AbstractC13965r5 {

    /* JADX INFO: renamed from: du */
    private AbstractC3124b3 f47143du;

    /* JADX INFO: renamed from: h4 */
    private AbstractC3150x6 f47144h4;

    /* JADX INFO: renamed from: k4 */
    private AbstractC13965r5 f47145k4;

    /* JADX INFO: renamed from: kk */
    private C13907h0 f47146kk;

    /* JADX INFO: renamed from: to */
    private C13942n3 f47147to;

    /* JADX INFO: renamed from: x1 */
    private AbstractC13983tq f47148x1;

    public C14030yw(AbstractC3124b3 abstractC3124b3, C13907h0 c13907h0) {
        this(c13907h0);
        this.f47143du = abstractC3124b3;
    }

    /* JADX INFO: renamed from: ck */
    private boolean m66399ck(String str) {
        if (this.f47145k4 != null) {
            return true;
        }
        if (C14022y4.m66318k4().m66334k4(str)) {
            return false;
        }
        m66400du(0);
        return true;
    }

    /* JADX INFO: renamed from: jd */
    private static boolean m66401jd(String str) {
        if (str.length() != 4) {
            return false;
        }
        if (str.charAt(0) != 'H' && str.charAt(0) != 'h') {
            return false;
        }
        if (str.charAt(1) != 'T' && str.charAt(1) != 't') {
            return false;
        }
        if (str.charAt(2) == 'M' || str.charAt(2) == 'm') {
            return str.charAt(3) == 'L' || str.charAt(3) == 'l';
        }
        return false;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13965r5, com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: a_ */
    public void mo21891a_(char[] cArr, int i, int i2) {
        mo21895dy(C14113y2.m67406k4(cArr, i, i2));
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13965r5
    public boolean aa_() {
        return this.f47145k4.aa_();
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13965r5, com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: c5 */
    public void mo65655c5(String str) {
        m66402x1(0);
        this.f47145k4.mo65655c5(str);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: du */
    public void mo21893du() {
        m66402x1(0);
        this.f47145k4.mo21893du();
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13965r5, com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: dy */
    public void mo21895dy(String str) {
        if (m66399ck(str)) {
            this.f47145k4.mo21895dy(str);
        } else {
            this.f47147to.mo21895dy(str);
        }
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: h4 */
    public void mo21896h4() {
        m66402x1(0);
        this.f47145k4.mo21896h4();
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13965r5
    /* JADX INFO: renamed from: k4 */
    public void mo21899k4() {
        this.f47145k4.mo21899k4();
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: kk */
    public void mo21910kk(String str) {
        m66402x1(0);
        this.f47145k4.mo21910kk(str);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13965r5, com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: m9 */
    public void mo21913m9(String str) {
        AbstractC13965r5 abstractC13965r5 = this.f47145k4;
        if (abstractC13965r5 == null) {
            this.f47147to.mo21913m9(str);
        } else {
            abstractC13965r5.mo21913m9(str);
        }
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13965r5
    /* JADX INFO: renamed from: to */
    public void mo65316to() {
        this.f47145k4.mo65316to();
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: x1 */
    public void mo21917x1() {
        this.f47145k4.mo21917x1();
    }

    public C14030yw(AbstractC3150x6 abstractC3150x6, C13907h0 c13907h0) {
        this(c13907h0);
        this.f47144h4 = abstractC3150x6;
    }

    /* JADX INFO: renamed from: du */
    private void m66400du(int i) {
        this.f47146kk.m65432kk(false);
        this.f47146kk.m65427k4(i);
        if (i == 1 && this.f47146kk.m65436qq() == -1) {
            this.f47146kk.m65444x1(true);
        }
        this.f47146kk.m65432kk(true);
        AbstractC3124b3 abstractC3124b3 = this.f47143du;
        this.f47145k4 = ((C13955pt) (abstractC3124b3 != null ? AbstractC13958qb.m65798k4(abstractC3124b3, this.f47146kk) : AbstractC13958qb.m65799k4(this.f47144h4, this.f47146kk))).m65744k4();
        this.f47147to.m65658m9();
        this.f47147to.m65657k4(this.f47145k4);
        AbstractC13983tq abstractC13983tq = this.f47148x1;
        if (abstractC13983tq != null) {
            abstractC13983tq.m65919k4(this.f47145k4);
        }
    }

    /* JADX INFO: renamed from: x1 */
    private void m66402x1(int i) {
        if (this.f47145k4 == null) {
            m66400du(i);
        }
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: h4 */
    public void mo21897h4(String str) {
        AbstractC13965r5 abstractC13965r5 = this.f47145k4;
        if (abstractC13965r5 == null) {
            this.f47147to.mo21897h4(str);
        } else {
            abstractC13965r5.mo21897h4(str);
        }
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13965r5, com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: k4 */
    public void mo21900k4(char c) {
        m66402x1(0);
        this.f47145k4.mo21900k4(c);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13965r5
    /* JADX INFO: renamed from: kk */
    public void mo21911kk(String str, String str2, String str3) {
        this.f47145k4.mo21911kk(str, str2, str3);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13965r5
    /* JADX INFO: renamed from: to */
    public void mo65317to(String str) {
        m66402x1(0);
        this.f47145k4.mo65317to(str);
    }

    private C14030yw(C13907h0 c13907h0) {
        C13907h0 c13907h0M65447yj = c13907h0.m65447yj();
        this.f47146kk = c13907h0M65447yj;
        c13907h0M65447yj.m65432kk(true);
        this.f47147to = new C13942n3(C14113y2.f47374k4, true);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13965r5, com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: du */
    public void mo21894du(String str) {
        if (m66399ck(str)) {
            this.f47145k4.mo21894du(str);
        } else {
            this.f47147to.mo21894du(str);
        }
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13965r5, com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: k4 */
    public void mo21901k4(char c, char c2) {
        m66402x1(0);
        this.f47145k4.mo21901k4(c, c2);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: to */
    public void mo21915to(String str, String str2, String str3) {
        m66402x1(0);
        this.f47145k4.mo21915to(str, str2, str3);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: x1 */
    public void mo21918x1(String str) {
        if (m66399ck(str)) {
            this.f47145k4.mo21918x1(str);
        } else {
            this.f47147to.mo21918x1(str);
        }
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13965r5
    /* JADX INFO: renamed from: k4 */
    public void mo21902k4(int i) {
        m66402x1(0);
        this.f47145k4.mo21902k4(i);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13965r5
    /* JADX INFO: renamed from: x1 */
    public void mo21919x1(String str, String str2) {
        m66402x1(0);
        this.f47145k4.mo21919x1(str, str2);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13965r5
    /* JADX INFO: renamed from: k4 */
    public void mo65716k4(InterfaceC13980t6 interfaceC13980t6) {
        this.f46792c6 = interfaceC13980t6;
        AbstractC13965r5 abstractC13965r5 = this.f47145k4;
        if (abstractC13965r5 == null) {
            this.f47147to.mo65716k4(interfaceC13980t6);
        } else {
            abstractC13965r5.mo65716k4(interfaceC13980t6);
        }
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13965r5
    /* JADX INFO: renamed from: x1 */
    public void mo21920x1(String str, String str2, String str3) {
        this.f47145k4.mo21920x1(str, str2, str3);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13965r5
    /* JADX INFO: renamed from: k4 */
    public void mo21905k4(String str) {
        m66402x1(0);
        this.f47145k4.mo21905k4(str);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: x1 */
    public void mo65659x1(byte[] bArr, int i, int i2) {
        m66402x1(0);
        this.f47145k4.mo65659x1(bArr, i, i2);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: k4 */
    public void mo21907k4(String str, String str2) {
        AbstractC13965r5 abstractC13965r5 = this.f47145k4;
        if (abstractC13965r5 == null) {
            this.f47147to.mo21907k4(str, str2);
        } else {
            abstractC13965r5.mo21907k4(str, str2);
        }
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: k4 */
    public void mo12953k4(String str, String str2, String str3) {
        if (this.f47145k4 == null) {
            m66400du((str3.length() == 0 && m66401jd(str2)) ? 1 : 0);
        }
        this.f47145k4.mo12953k4(str, str2, str3);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13965r5, com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: k4 */
    public void mo21908k4(String str, String str2, String str3, String str4) {
        m66402x1(0);
        this.f47145k4.mo21908k4(str, str2, str3, str4);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13965r5, com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: k4 */
    public void mo65186k4(byte[] bArr, int i, int i2) {
        m66402x1(0);
        this.f47145k4.mo65186k4(bArr, i, i2);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13965r5, com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: k4 */
    public void mo21909k4(char[] cArr, int i, int i2) {
        mo21918x1(C14113y2.m67406k4(cArr, i, i2));
    }
}
