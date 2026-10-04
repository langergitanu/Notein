package com.aspose.slides.internal.p334pa;

import com.aspose.slides.internal.p031aw.InterfaceC1565x1;
import com.aspose.slides.internal.p154gr.C4378x1;
import com.aspose.slides.internal.p228kh.C5674k4;
import com.aspose.slides.internal.p373qy.InterfaceC9964k4;
import com.aspose.slides.internal.p390s1.C10130to;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.C12013m9;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.backend.System.Drawing.InterfaceC14122k4;

/* JADX INFO: renamed from: com.aspose.slides.internal.pa.kk */
/* JADX INFO: loaded from: classes4.dex */
public class C9435kk extends AbstractC9434k4 {

    /* JADX INFO: renamed from: c5 */
    private float f34321c5;

    /* JADX INFO: renamed from: du */
    private final float f34322du;

    /* JADX INFO: renamed from: dy */
    private final String f34323dy;

    /* JADX INFO: renamed from: h4 */
    private final int f34324h4;

    /* JADX INFO: renamed from: jd */
    private float f34325jd;

    /* JADX INFO: renamed from: kk */
    private final InterfaceC9964k4 f34326kk;

    /* JADX INFO: renamed from: m9 */
    private final int f34327m9;

    /* JADX INFO: renamed from: to */
    private final float f34328to;

    /* JADX INFO: renamed from: x1 */
    private final C5674k4 f34329x1;

    public C9435kk(C10130to c10130to, C5674k4 c5674k4, InterfaceC9964k4 interfaceC9964k4, float f, float f2, int i, int i2, String str) {
        super(c10130to);
        this.f34321c5 = -1.0f;
        this.f34325jd = -1.0f;
        this.f34329x1 = c5674k4;
        this.f34326kk = interfaceC9964k4;
        this.f34328to = f;
        this.f34322du = f2;
        if (c10130to.m49764kk().m56806fa()) {
            this.f34323dy = str;
            this.f34324h4 = i;
        } else {
            String strM17686k4 = C4378x1.m17686k4(str);
            this.f34323dy = strM17686k4;
            this.f34324h4 = i;
            i2 -= str.length() - strM17686k4.length();
        }
        this.f34327m9 = i2;
    }

    /* JADX INFO: renamed from: ks */
    private float m46207ks() {
        if (this.f34325jd < 0.0f) {
            this.f34325jd = this.f34329x1.m23135k4();
        }
        return this.f34325jd;
    }

    @Override // com.aspose.slides.internal.p390s1.InterfaceC10128k4
    /* JADX INFO: renamed from: dy */
    public float mo46208dy() {
        if (!this.f34320k4.m49764kk().m56803ck()) {
            return mo46202du() + mo46217to();
        }
        float fM49770x1 = this.f34320k4.m49770x1();
        if (C14064he.m66703du(fM49770x1)) {
            fM49770x1 = 0.0f;
        }
        int iM56810k4 = this.f34320k4.m49764kk().m56810k4();
        return (iM56810k4 != 1 ? iM56810k4 != 2 ? m46201ck() : (fM49770x1 - m46207ks()) - m46203fa() : (fM49770x1 - m46207ks()) / 2.0f) + this.f34328to;
    }

    @Override // com.aspose.slides.internal.p390s1.InterfaceC10128k4
    /* JADX INFO: renamed from: k4 */
    public float mo46209k4(int i, int i2) {
        return this.f34326kk.mo23081k4(i, i2);
    }

    @Override // com.aspose.slides.internal.p390s1.InterfaceC10128k4
    /* JADX INFO: renamed from: kk */
    public float mo46215kk() {
        if (this.f34321c5 < 0.0f) {
            this.f34321c5 = this.f34326kk.mo23081k4(this.f34324h4, this.f34327m9);
        }
        return this.f34321c5;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0071  */
    @Override // com.aspose.slides.internal.p390s1.InterfaceC10128k4
    /* JADX INFO: renamed from: m9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public float mo46216m9() {
        float fM46207ks;
        float fM49758k4 = this.f34320k4.m49758k4();
        if (C14064he.m66703du(fM49758k4)) {
            fM49758k4 = 0.0f;
        }
        if (this.f34320k4.m49764kk().m56803ck()) {
            if (this.f34320k4.m49764kk().m56818ks()) {
                return (fM49758k4 - mo46217to()) - mo46202du();
            }
            if (this.f34320k4.m49764kk().m56820ne()) {
                return mo46204h4() + mo46217to();
            }
            return m46206up() + mo46204h4() + mo46217to();
        }
        int iM56810k4 = this.f34320k4.m49764kk().m56810k4();
        if (iM56810k4 == 1) {
            fM46207ks = (fM49758k4 - m46207ks()) / 2.0f;
        } else if (iM56810k4 != 2) {
            fM46207ks = this.f34320k4.m49764kk().m56818ks() ? (fM49758k4 - m46207ks()) - m46201ck() : m46201ck();
        } else if (this.f34320k4.m49764kk().m56818ks()) {
            fM46207ks = m46203fa();
        }
        return fM46207ks + this.f34328to;
    }

    @Override // com.aspose.slides.internal.p390s1.InterfaceC10128k4
    /* JADX INFO: renamed from: to */
    public float mo46217to() {
        return this.f34322du;
    }

    @Override // com.aspose.slides.internal.p390s1.InterfaceC10128k4
    /* JADX INFO: renamed from: x1 */
    public int mo46218x1() {
        return this.f34327m9;
    }

    /* JADX INFO: renamed from: yj */
    public float m46220yj() {
        return this.f34328to;
    }

    @Override // com.aspose.slides.internal.p390s1.InterfaceC10128k4
    /* JADX INFO: renamed from: k4 */
    public int mo46210k4() {
        return this.f34324h4;
    }

    /* JADX INFO: renamed from: x1 */
    public void m46219x1(InterfaceC14122k4 interfaceC14122k4, float f, float f2) {
        this.f34329x1.m23137k4(interfaceC14122k4, f, f2);
    }

    @Override // com.aspose.slides.internal.p390s1.InterfaceC10128k4
    /* JADX INFO: renamed from: k4 */
    public InterfaceC1565x1 mo46211k4(float f, float f2) {
        float fMo46216m9;
        float fMo46208dy;
        C11913yj c11913yjM55760h4 = this.f34320k4.m49772yj().m55760h4();
        if (this.f34320k4.m49764kk().m56803ck()) {
            fMo46216m9 = mo46208dy() + f2;
            fMo46208dy = -(mo46216m9() + f);
        } else {
            fMo46216m9 = mo46216m9() + f;
            fMo46208dy = mo46208dy() + f2;
        }
        c11913yjM55760h4.m55777kk(fMo46216m9, fMo46208dy);
        return m46213k4(c11913yjM55760h4);
    }

    @Override // com.aspose.slides.internal.p390s1.InterfaceC10128k4
    /* JADX INFO: renamed from: k4 */
    public InterfaceC1565x1 mo46212k4(float f, float f2, C12013m9 c12013m9) {
        float fMo46216m9;
        float fMo46208dy;
        C11913yj c11913yjM55760h4 = this.f34320k4.m49772yj().m55760h4();
        if (this.f34320k4.m49764kk().m56803ck()) {
            fMo46216m9 = mo46208dy() + f2;
            fMo46208dy = -(mo46216m9() + f);
        } else {
            fMo46216m9 = mo46216m9() + f;
            fMo46208dy = mo46208dy() + f2;
        }
        c11913yjM55760h4.m55777kk(fMo46216m9, fMo46208dy);
        c11913yjM55760h4.m55785x1(-0.17f, 0.0f);
        return m46213k4(c11913yjM55760h4);
    }

    /* JADX INFO: renamed from: k4 */
    public InterfaceC1565x1 m46213k4(C11913yj c11913yj) {
        return this.f34329x1.m23136k4(c11913yj);
    }

    @Override // com.aspose.slides.internal.p390s1.InterfaceC10128k4
    /* JADX INFO: renamed from: k4 */
    public void mo46214k4(InterfaceC14122k4 interfaceC14122k4, float f, float f2) {
        float fMo46216m9;
        float fMo46208dy;
        if (this.f34320k4.m49764kk().m56803ck()) {
            fMo46216m9 = mo46208dy() + f2;
            fMo46208dy = -(mo46216m9() + f);
        } else {
            fMo46216m9 = mo46216m9() + f;
            fMo46208dy = mo46208dy() + f2;
        }
        m46219x1(interfaceC14122k4, fMo46216m9, fMo46208dy);
    }
}
