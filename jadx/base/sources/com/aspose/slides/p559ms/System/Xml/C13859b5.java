package com.aspose.slides.p559ms.System.Xml;

import com.aspose.slides.internal.p080dd.AbstractC3124b3;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;

/* JADX INFO: renamed from: com.aspose.slides.ms.System.Xml.b5 */
/* JADX INFO: loaded from: classes5.dex */
public class C13859b5 extends C13893ew {

    /* JADX INFO: renamed from: dq */
    protected int f46353dq;

    /* JADX INFO: renamed from: k4 */
    protected int f46354k4;

    /* JADX INFO: renamed from: kk */
    protected String f46355kk;

    /* JADX INFO: renamed from: to */
    protected boolean f46356to;

    /* JADX INFO: renamed from: ts */
    private C13908h4 f46357ts;

    /* JADX INFO: renamed from: x1 */
    protected boolean f46358x1;

    public C13859b5(AbstractC3124b3 abstractC3124b3, C13907h0 c13907h0) {
        super(abstractC3124b3, c13907h0);
        this.f46353dq = 0;
        m65184k4(c13907h0);
    }

    /* JADX INFO: renamed from: m9 */
    private void m65185m9() {
        m65341jd(this.f46511v4);
        for (int i = this.f46354k4; i > 0; i--) {
            m65341jd(this.f46355kk);
        }
    }

    @Override // com.aspose.slides.p559ms.System.Xml.C13893ew, com.aspose.slides.p559ms.System.Xml.AbstractC13965r5, com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: a_ */
    public void mo21891a_(char[] cArr, int i, int i2) {
        this.f46356to = true;
        super.mo21891a_(cArr, i, i2);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.C13893ew, com.aspose.slides.p559ms.System.Xml.AbstractC13965r5, com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: du */
    public void mo21894du(String str) {
        this.f46356to = true;
        super.mo21894du(str);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.C13893ew, com.aspose.slides.p559ms.System.Xml.AbstractC13965r5, com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: dy */
    public void mo21895dy(String str) {
        this.f46356to = true;
        super.mo21895dy(str);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.C13893ew, com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: h4 */
    public void mo21897h4(String str) {
        if (!this.f46356to && this.f46498jd != this.f46491c5) {
            m65185m9();
        }
        super.mo21897h4(str);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.C13893ew, com.aspose.slides.p559ms.System.Xml.AbstractC13965r5
    /* JADX INFO: renamed from: k4 */
    public void mo21899k4() {
        this.f46356to = (this.f46354k4 == 1 && this.f46353dq == 2) ? false : this.f46357ts.m65452x1();
        super.mo21899k4();
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13965r5
    /* JADX INFO: renamed from: kk */
    public void mo65187kk(int i) {
        this.f46353dq = i;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.C13893ew, com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: to */
    public void mo21915to(String str, String str2, String str3) {
        if (this.f46358x1) {
            m65185m9();
        }
        super.mo21915to(str, str2, str3);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.C13893ew, com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: x1 */
    public void mo21918x1(String str) {
        this.f46356to = true;
        super.mo21918x1(str);
    }

    public C13859b5(AbstractC3150x6 abstractC3150x6, C13907h0 c13907h0) {
        super(abstractC3150x6, c13907h0);
        this.f46353dq = 0;
        m65184k4(c13907h0);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.C13893ew, com.aspose.slides.p559ms.System.Xml.AbstractC13965r5, com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: k4 */
    public void mo21900k4(char c) {
        this.f46356to = true;
        super.mo21900k4(c);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.C13893ew, com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: kk */
    public void mo21910kk(String str) {
        this.f46356to = true;
        super.mo21910kk(str);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.C13893ew, com.aspose.slides.p559ms.System.Xml.AbstractC13965r5, com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: m9 */
    public void mo21913m9(String str) {
        this.f46356to = true;
        super.mo21913m9(str);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.C13893ew, com.aspose.slides.p559ms.System.Xml.AbstractC13965r5
    /* JADX INFO: renamed from: x1 */
    public void mo21920x1(String str, String str2, String str3) {
        this.f46354k4--;
        if (!this.f46356to) {
            int i = this.f46492ck;
            int i2 = this.f46491c5;
            if (i != i2 && this.f46498jd != i2) {
                m65185m9();
            }
        }
        this.f46356to = this.f46357ts.m65451k4();
        super.mo21920x1(str, str2, str3);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.C13893ew, com.aspose.slides.p559ms.System.Xml.AbstractC13965r5, com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: k4 */
    public void mo21901k4(char c, char c2) {
        this.f46356to = true;
        super.mo21901k4(c, c2);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.C13893ew, com.aspose.slides.p559ms.System.Xml.AbstractC13965r5
    /* JADX INFO: renamed from: kk */
    public void mo21911kk(String str, String str2, String str3) {
        this.f46354k4--;
        if (!this.f46356to) {
            int i = this.f46492ck;
            int i2 = this.f46491c5;
            if (i != i2 && this.f46498jd != i2) {
                m65185m9();
            }
        }
        this.f46356to = this.f46357ts.m65451k4();
        super.mo21911kk(str, str2, str3);
    }

    /* JADX INFO: renamed from: k4 */
    private void m65184k4(C13907h0 c13907h0) {
        boolean z = false;
        this.f46354k4 = 0;
        this.f46355kk = c13907h0.m65421h4();
        this.f46358x1 = c13907h0.m65434m9();
        this.f46357ts = new C13908h4();
        if (this.f46502lr) {
            if (this.f46358x1) {
                z = true;
                m65343k4(this.f46355kk, "IndentChars", true);
            } else {
                m65343k4(this.f46355kk, "IndentChars", false);
                if (this.f46488ar == 0) {
                    return;
                }
            }
            m65343k4(this.f46511v4, "NewLineChars", z);
        }
    }

    @Override // com.aspose.slides.p559ms.System.Xml.C13893ew, com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: k4 */
    public void mo21907k4(String str, String str2) {
        if (!this.f46356to && this.f46498jd != this.f46491c5) {
            m65185m9();
        }
        super.mo21907k4(str, str2);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.C13893ew, com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: k4 */
    public void mo12953k4(String str, String str2, String str3) {
        if (!this.f46356to && this.f46498jd != this.f46491c5) {
            m65185m9();
        }
        this.f46354k4++;
        this.f46357ts.m65450k4(this.f46356to);
        super.mo12953k4(str, str2, str3);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.C13893ew, com.aspose.slides.p559ms.System.Xml.AbstractC13965r5, com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: k4 */
    public void mo21908k4(String str, String str2, String str3, String str4) {
        if (!this.f46356to && this.f46498jd != this.f46491c5) {
            m65185m9();
        }
        super.mo21908k4(str, str2, str3, str4);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13965r5, com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: k4 */
    public void mo65186k4(byte[] bArr, int i, int i2) {
        this.f46356to = true;
        super.mo65186k4(bArr, i, i2);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.C13893ew, com.aspose.slides.p559ms.System.Xml.AbstractC13965r5, com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: k4 */
    public void mo21909k4(char[] cArr, int i, int i2) {
        this.f46356to = true;
        super.mo21909k4(cArr, i, i2);
    }
}
