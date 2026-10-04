package com.aspose.slides.p559ms.System.Xml;

import com.aspose.slides.internal.p080dd.AbstractC3124b3;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;

/* JADX INFO: renamed from: com.aspose.slides.ms.System.Xml.ak */
/* JADX INFO: loaded from: classes5.dex */
public class C13852ak extends C14008wy {

    /* JADX INFO: renamed from: bz */
    private boolean f46342bz;

    /* JADX INFO: renamed from: dq */
    private int f46343dq;

    /* JADX INFO: renamed from: e0 */
    private String f46344e0;

    /* JADX INFO: renamed from: ts */
    private int f46345ts;

    public C13852ak(AbstractC3124b3 abstractC3124b3, C13907h0 c13907h0) {
        super(abstractC3124b3, c13907h0);
        m65153k4(c13907h0);
    }

    /* JADX INFO: renamed from: m9 */
    private void m65154m9() {
        m65341jd(this.f46511v4);
        for (int i = this.f46343dq; i > 0; i--) {
            m65341jd(this.f46344e0);
        }
    }

    @Override // com.aspose.slides.p559ms.System.Xml.C13893ew
    public void ab_() {
        this.f46345ts = this.f46345ts == this.f46491c5 ? 1 : 0;
        super.ab_();
    }

    @Override // com.aspose.slides.p559ms.System.Xml.C14008wy, com.aspose.slides.p559ms.System.Xml.C13893ew, com.aspose.slides.p559ms.System.Xml.AbstractC13965r5
    /* JADX INFO: renamed from: k4 */
    public void mo21899k4() {
        char[] cArr = this.f46497ix;
        int i = this.f46491c5;
        int i2 = i + 1;
        this.f46491c5 = i2;
        cArr[i] = '>';
        this.f46492ck = i2;
        long j = ((C14008wy) this).f47062x1;
        if ((32 & j) != 0) {
            m65154m9();
            m66291kk();
            this.f46345ts = this.f46491c5;
        } else if ((j & 64) != 0) {
            this.f46345ts = i2;
        }
    }

    @Override // com.aspose.slides.p559ms.System.Xml.C14008wy, com.aspose.slides.p559ms.System.Xml.C13893ew, com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: to */
    public void mo21915to(String str, String str2, String str3) {
        if (this.f46342bz) {
            m65341jd(this.f46511v4);
            this.f46343dq++;
            m65154m9();
            this.f46343dq--;
        }
        super.mo21915to(str, str2, str3);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.C14008wy, com.aspose.slides.p559ms.System.Xml.C13893ew, com.aspose.slides.p559ms.System.Xml.AbstractC13965r5
    /* JADX INFO: renamed from: x1 */
    public void mo21920x1(String str, String str2, String str3) {
        this.f46343dq--;
        boolean z = (((C14008wy) this).f47062x1 & 64) != 0;
        if (z) {
            int i = this.f46345ts;
            int i2 = this.f46491c5;
            if (i == i2 && this.f46492ck != i2) {
                m65154m9();
            }
        }
        super.mo21920x1(str, str2, str3);
        this.f46492ck = 0;
        if (z) {
            this.f46345ts = this.f46491c5;
        }
    }

    public C13852ak(AbstractC3150x6 abstractC3150x6, C13907h0 c13907h0) {
        super(abstractC3150x6, c13907h0);
        m65153k4(c13907h0);
    }

    /* JADX INFO: renamed from: k4 */
    private void m65153k4(C13907h0 c13907h0) {
        this.f46343dq = 0;
        this.f46344e0 = c13907h0.m65421h4();
        this.f46342bz = c13907h0.m65434m9();
    }

    @Override // com.aspose.slides.p559ms.System.Xml.C14008wy, com.aspose.slides.p559ms.System.Xml.C13893ew, com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: k4 */
    public void mo12953k4(String str, String str2, String str3) {
        if (this.f46512wl && this.f46505qq) {
            m65344k4(false);
        }
        ((C14008wy) this).f47059k4.m65274k4((byte) ((C14008wy) this).f47062x1);
        if (str3.length() == 0) {
            long jM65496k4 = C14008wy.f47054kk.m65496k4(str2) & 255;
            ((C14008wy) this).f47062x1 = jM65496k4;
            if (this.f46345ts == this.f46491c5 && (jM65496k4 & 64) != 0) {
                m65154m9();
            }
            this.f46343dq++;
            char[] cArr = this.f46497ix;
            int i = this.f46491c5;
            this.f46491c5 = i + 1;
            cArr[i] = '<';
        } else {
            ((C14008wy) this).f47062x1 = 192L;
            if (this.f46345ts == this.f46491c5) {
                m65154m9();
            }
            this.f46343dq++;
            char[] cArr2 = this.f46497ix;
            int i2 = this.f46491c5;
            this.f46491c5 = i2 + 1;
            cArr2[i2] = '<';
            if (str.length() != 0) {
                m65341jd(str);
                char[] cArr3 = this.f46497ix;
                int i3 = this.f46491c5;
                this.f46491c5 = i3 + 1;
                cArr3[i3] = ':';
            }
        }
        m65341jd(str2);
        this.f46509up = this.f46491c5;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.C14008wy, com.aspose.slides.p559ms.System.Xml.C13893ew, com.aspose.slides.p559ms.System.Xml.AbstractC13965r5, com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: k4 */
    public void mo21908k4(String str, String str2, String str3, String str4) {
        super.mo21908k4(str, str2, str3, str4);
        this.f46345ts = this.f46491c5;
    }
}
