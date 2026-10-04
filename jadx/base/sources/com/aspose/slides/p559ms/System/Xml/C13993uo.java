package com.aspose.slides.p559ms.System.Xml;

import com.aspose.slides.internal.p080dd.AbstractC3150x6;

/* JADX INFO: renamed from: com.aspose.slides.ms.System.Xml.uo */
/* JADX INFO: loaded from: classes5.dex */
public class C13993uo extends C13891ek {

    /* JADX INFO: renamed from: k4 */
    protected int f47029k4;

    /* JADX INFO: renamed from: kk */
    protected String f47030kk;

    /* JADX INFO: renamed from: lr */
    private C13908h4 f47031lr;

    /* JADX INFO: renamed from: to */
    protected boolean f47032to;

    /* JADX INFO: renamed from: v4 */
    protected int f47033v4;

    /* JADX INFO: renamed from: x1 */
    protected boolean f47034x1;

    public C13993uo(AbstractC3150x6 abstractC3150x6, C13907h0 c13907h0) {
        super(abstractC3150x6, c13907h0);
        this.f47033v4 = 0;
        m66272k4(c13907h0);
    }

    /* JADX INFO: renamed from: m9 */
    private void m66273m9() {
        m65311jd(this.f46479uz);
        for (int i = this.f47029k4; i > 0; i--) {
            m65311jd(this.f47030kk);
        }
    }

    @Override // com.aspose.slides.p559ms.System.Xml.C13891ek, com.aspose.slides.p559ms.System.Xml.AbstractC13965r5, com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: a_ */
    public void mo21891a_(char[] cArr, int i, int i2) {
        this.f47032to = true;
        super.mo21891a_(cArr, i, i2);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.C13891ek, com.aspose.slides.p559ms.System.Xml.AbstractC13965r5, com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: du */
    public void mo21894du(String str) {
        this.f47032to = true;
        super.mo21894du(str);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.C13891ek, com.aspose.slides.p559ms.System.Xml.AbstractC13965r5, com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: dy */
    public void mo21895dy(String str) {
        this.f47032to = true;
        super.mo21895dy(str);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.C13891ek, com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: h4 */
    public void mo21897h4(String str) {
        if (!this.f47032to && this.f46470jd != this.f46463c5) {
            m66273m9();
        }
        super.mo21897h4(str);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.C13891ek, com.aspose.slides.p559ms.System.Xml.AbstractC13965r5
    /* JADX INFO: renamed from: k4 */
    public void mo21899k4() {
        this.f47032to = (this.f47029k4 == 1 && this.f47033v4 == 2) ? false : this.f47031lr.m65452x1();
        super.mo21899k4();
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13965r5
    /* JADX INFO: renamed from: kk */
    public void mo65187kk(int i) {
        this.f47033v4 = i;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.C13891ek, com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: to */
    public void mo21915to(String str, String str2, String str3) {
        if (this.f47034x1) {
            m66273m9();
        }
        super.mo21915to(str, str2, str3);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.C13891ek, com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: x1 */
    public void mo21918x1(String str) {
        this.f47032to = true;
        super.mo21918x1(str);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.C13891ek, com.aspose.slides.p559ms.System.Xml.AbstractC13965r5, com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: k4 */
    public void mo21900k4(char c) {
        this.f47032to = true;
        super.mo21900k4(c);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.C13891ek, com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: kk */
    public void mo21910kk(String str) {
        this.f47032to = true;
        super.mo21910kk(str);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.C13891ek, com.aspose.slides.p559ms.System.Xml.AbstractC13965r5, com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: m9 */
    public void mo21913m9(String str) {
        this.f47032to = true;
        super.mo21913m9(str);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.C13891ek, com.aspose.slides.p559ms.System.Xml.AbstractC13965r5
    /* JADX INFO: renamed from: x1 */
    public void mo21920x1(String str, String str2, String str3) {
        this.f47029k4--;
        if (!this.f47032to) {
            int i = this.f46464ck;
            int i2 = this.f46463c5;
            if (i != i2 && this.f46470jd != i2) {
                m66273m9();
            }
        }
        this.f47032to = this.f47031lr.m65451k4();
        super.mo21920x1(str, str2, str3);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.C13891ek, com.aspose.slides.p559ms.System.Xml.AbstractC13965r5, com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: k4 */
    public void mo21901k4(char c, char c2) {
        this.f47032to = true;
        super.mo21901k4(c, c2);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.C13891ek, com.aspose.slides.p559ms.System.Xml.AbstractC13965r5
    /* JADX INFO: renamed from: kk */
    public void mo21911kk(String str, String str2, String str3) {
        this.f47029k4--;
        if (!this.f47032to) {
            int i = this.f46464ck;
            int i2 = this.f46463c5;
            if (i != i2 && this.f46470jd != i2) {
                m66273m9();
            }
        }
        this.f47032to = this.f47031lr.m65451k4();
        super.mo21911kk(str, str2, str3);
    }

    /* JADX INFO: renamed from: k4 */
    private void m66272k4(C13907h0 c13907h0) {
        boolean z = false;
        this.f47029k4 = 0;
        this.f47030kk = c13907h0.m65421h4();
        this.f47034x1 = c13907h0.m65434m9();
        this.f47031lr = new C13908h4();
        if (this.f46480wl) {
            if (this.f47034x1) {
                z = true;
                m65313k4(this.f47030kk, "IndentChars", true);
            } else {
                m65313k4(this.f47030kk, "IndentChars", false);
                if (this.f46473ne == 0) {
                    return;
                }
            }
            m65313k4(this.f46479uz, "NewLineChars", z);
        }
    }

    @Override // com.aspose.slides.p559ms.System.Xml.C13891ek, com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: k4 */
    public void mo21907k4(String str, String str2) {
        if (!this.f47032to && this.f46470jd != this.f46463c5) {
            m66273m9();
        }
        super.mo21907k4(str, str2);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.C13891ek, com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: k4 */
    public void mo12953k4(String str, String str2, String str3) {
        if (!this.f47032to && this.f46470jd != this.f46463c5) {
            m66273m9();
        }
        this.f47029k4++;
        this.f47031lr.m65450k4(this.f47032to);
        super.mo12953k4(str, str2, str3);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.C13891ek, com.aspose.slides.p559ms.System.Xml.AbstractC13965r5, com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: k4 */
    public void mo21908k4(String str, String str2, String str3, String str4) {
        if (!this.f47032to && this.f46470jd != this.f46463c5) {
            m66273m9();
        }
        super.mo21908k4(str, str2, str3, str4);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13965r5, com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: k4 */
    public void mo65186k4(byte[] bArr, int i, int i2) {
        this.f47032to = true;
        super.mo65186k4(bArr, i, i2);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.C13891ek, com.aspose.slides.p559ms.System.Xml.AbstractC13965r5, com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: k4 */
    public void mo21909k4(char[] cArr, int i, int i2) {
        this.f47032to = true;
        super.mo21909k4(cArr, i, i2);
    }
}
