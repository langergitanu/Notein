package com.aspose.slides.p559ms.System.Xml;

import com.aspose.slides.internal.p080dd.AbstractC3150x6;

/* JADX INFO: renamed from: com.aspose.slides.ms.System.Xml.c6 */
/* JADX INFO: loaded from: classes5.dex */
public class C13870c6 extends C14017xk {

    /* JADX INFO: renamed from: b3 */
    private boolean f46373b3;

    /* JADX INFO: renamed from: lr */
    private int f46374lr;

    /* JADX INFO: renamed from: v4 */
    private int f46375v4;

    /* JADX INFO: renamed from: yd */
    private String f46376yd;

    public C13870c6(AbstractC3150x6 abstractC3150x6, C13907h0 c13907h0) {
        super(abstractC3150x6, c13907h0);
        m65213k4(c13907h0);
    }

    /* JADX INFO: renamed from: m9 */
    private void m65214m9() {
        m65311jd(this.f46479uz);
        for (int i = this.f46375v4; i > 0; i--) {
            m65311jd(this.f46376yd);
        }
    }

    @Override // com.aspose.slides.p559ms.System.Xml.C13891ek
    public void ac_() {
        this.f46374lr = this.f46374lr == this.f46463c5 ? 1 : 0;
        super.ac_();
    }

    @Override // com.aspose.slides.p559ms.System.Xml.C14017xk, com.aspose.slides.p559ms.System.Xml.C13891ek, com.aspose.slides.p559ms.System.Xml.AbstractC13965r5
    /* JADX INFO: renamed from: k4 */
    public void mo21899k4() {
        byte[] bArr = this.f46465du;
        int i = this.f46463c5;
        int i2 = i + 1;
        this.f46463c5 = i2;
        bArr[i] = 62;
        this.f46464ck = i2;
        long j = this.f47089x1;
        if ((32 & j) != 0) {
            m65214m9();
            m66312kk();
            this.f46374lr = this.f46463c5;
        } else if ((j & 64) != 0) {
            this.f46374lr = i2;
        }
    }

    @Override // com.aspose.slides.p559ms.System.Xml.C14017xk, com.aspose.slides.p559ms.System.Xml.C13891ek, com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: to */
    public void mo21915to(String str, String str2, String str3) {
        if (this.f46373b3) {
            m65311jd(this.f46479uz);
            this.f46375v4++;
            m65214m9();
            this.f46375v4--;
        }
        super.mo21915to(str, str2, str3);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.C14017xk, com.aspose.slides.p559ms.System.Xml.C13891ek, com.aspose.slides.p559ms.System.Xml.AbstractC13965r5
    /* JADX INFO: renamed from: x1 */
    public void mo21920x1(String str, String str2, String str3) {
        this.f46375v4--;
        boolean z = (this.f47089x1 & 64) != 0;
        if (z) {
            int i = this.f46374lr;
            int i2 = this.f46463c5;
            if (i == i2 && this.f46464ck != i2) {
                m65214m9();
            }
        }
        super.mo21920x1(str, str2, str3);
        this.f46464ck = 0;
        if (z) {
            this.f46374lr = this.f46463c5;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m65213k4(C13907h0 c13907h0) {
        this.f46375v4 = 0;
        this.f46376yd = c13907h0.m65421h4();
        this.f46373b3 = c13907h0.m65434m9();
    }

    @Override // com.aspose.slides.p559ms.System.Xml.C14017xk, com.aspose.slides.p559ms.System.Xml.C13891ek, com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: k4 */
    public void mo12953k4(String str, String str2, String str3) {
        ((C14017xk) this).f47085k4.m65274k4((byte) this.f47089x1);
        if (str3.length() == 0) {
            long jM65496k4 = C14017xk.f47082kk.m65496k4(str2) & 255;
            this.f47089x1 = jM65496k4;
            if (this.f46374lr == this.f46463c5 && (jM65496k4 & 64) != 0) {
                m65214m9();
            }
            this.f46375v4++;
            byte[] bArr = this.f46465du;
            int i = this.f46463c5;
            this.f46463c5 = i + 1;
            bArr[i] = 60;
        } else {
            this.f47089x1 = 192L;
            if (this.f46374lr == this.f46463c5) {
                m65214m9();
            }
            this.f46375v4++;
            byte[] bArr2 = this.f46465du;
            int i2 = this.f46463c5;
            this.f46463c5 = i2 + 1;
            bArr2[i2] = 60;
            if (str.length() != 0) {
                m65311jd(str);
                byte[] bArr3 = this.f46465du;
                int i3 = this.f46463c5;
                this.f46463c5 = i3 + 1;
                bArr3[i3] = 58;
            }
        }
        m65311jd(str2);
        this.f46478up = this.f46463c5;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.C14017xk, com.aspose.slides.p559ms.System.Xml.C13891ek, com.aspose.slides.p559ms.System.Xml.AbstractC13965r5, com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: k4 */
    public void mo21908k4(String str, String str2, String str3, String str4) {
        super.mo21908k4(str, str2, str3, str4);
        this.f46374lr = this.f46463c5;
    }
}
