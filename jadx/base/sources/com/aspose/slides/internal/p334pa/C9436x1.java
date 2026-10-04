package com.aspose.slides.internal.p334pa;

import com.aspose.slides.internal.p031aw.InterfaceC1565x1;
import com.aspose.slides.internal.p156gw.C4417x6;
import com.aspose.slides.internal.p390s1.C10130to;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.C12013m9;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.backend.System.Drawing.InterfaceC14122k4;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.aspose.slides.internal.pa.x1 */
/* JADX INFO: loaded from: classes4.dex */
public class C9436x1 extends AbstractC9434k4 {

    /* JADX INFO: renamed from: du */
    private final int f34330du;

    /* JADX INFO: renamed from: h4 */
    private String f34331h4;

    /* JADX INFO: renamed from: kk */
    private float f34332kk;

    /* JADX INFO: renamed from: to */
    private final int f34333to;

    /* JADX INFO: renamed from: x1 */
    private List<C9435kk> f34334x1;

    public C9436x1(C10130to c10130to, int i, int i2, String str) {
        super(c10130to);
        this.f34334x1 = new ArrayList();
        this.f34332kk = 0.0f;
        this.f34333to = i;
        this.f34330du = i2;
        this.f34331h4 = str;
    }

    /* JADX INFO: renamed from: yj */
    private float m46222yj() {
        return mo46215kk();
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
        return iM56810k4 != 1 ? iM56810k4 != 2 ? m46201ck() : fM49770x1 - m46222yj() : (fM49770x1 - m46222yj()) / 2.0f;
    }

    @Override // com.aspose.slides.internal.p390s1.InterfaceC10128k4
    /* JADX INFO: renamed from: k4 */
    public float mo46209k4(int i, int i2) {
        float fM49760k4 = 0.0f;
        C9435kk c9435kk = null;
        for (C9435kk c9435kk2 : this.f34334x1) {
            if (i2 <= c9435kk2.mo46210k4()) {
                break;
            }
            if (i < c9435kk2.mo46218x1()) {
                fM49760k4 += this.f34320k4.m49760k4(Math.max(c9435kk2.mo46210k4(), i), Math.min(c9435kk2.mo46218x1(), i2));
                c9435kk = c9435kk2;
            }
        }
        return c9435kk != null ? c9435kk.m46220yj() + fM49760k4 : fM49760k4;
    }

    @Override // com.aspose.slides.internal.p390s1.InterfaceC10128k4
    /* JADX INFO: renamed from: kk */
    public float mo46215kk() {
        return this.f34332kk;
    }

    @Override // com.aspose.slides.internal.p390s1.InterfaceC10128k4
    /* JADX INFO: renamed from: m9 */
    public float mo46216m9() {
        float fM49758k4 = this.f34320k4.m49758k4();
        if (C14064he.m66703du(fM49758k4)) {
            fM49758k4 = 0.0f;
        }
        if (!this.f34320k4.m49764kk().m56803ck()) {
            int iM56810k4 = this.f34320k4.m49764kk().m56810k4();
            return iM56810k4 != 1 ? iM56810k4 != 2 ? this.f34320k4.m49764kk().m56818ks() ? (fM49758k4 - m46222yj()) - m46201ck() : m46201ck() : this.f34320k4.m49764kk().m56818ks() ? m46203fa() : (fM49758k4 - m46222yj()) - m46201ck() : (fM49758k4 - m46222yj()) / 2.0f;
        }
        if (this.f34320k4.m49764kk().m56818ks()) {
            return (fM49758k4 - mo46217to()) - mo46202du();
        }
        if (this.f34320k4.m49764kk().m56820ne()) {
            return m46200c5() + mo46204h4() + mo46217to();
        }
        return m46206up() + mo46204h4() + mo46217to();
    }

    @Override // com.aspose.slides.internal.p390s1.InterfaceC10128k4
    /* JADX INFO: renamed from: to */
    public float mo46217to() {
        return this.f34334x1.get(0).mo46217to();
    }

    @Override // com.aspose.slides.internal.p390s1.InterfaceC10128k4
    /* JADX INFO: renamed from: x1 */
    public int mo46218x1() {
        return this.f34330du;
    }

    /* JADX INFO: renamed from: x1 */
    private void m46221x1(InterfaceC14122k4 interfaceC14122k4, float f, float f2) {
        for (C9435kk c9435kk : this.f34334x1) {
            c9435kk.m46219x1(interfaceC14122k4, c9435kk.m46220yj() + f, f2);
        }
    }

    @Override // com.aspose.slides.internal.p390s1.InterfaceC10128k4
    /* JADX INFO: renamed from: k4 */
    public int mo46210k4() {
        return this.f34333to;
    }

    @Override // com.aspose.slides.internal.p390s1.InterfaceC10128k4
    /* JADX INFO: renamed from: k4 */
    public InterfaceC1565x1 mo46211k4(float f, float f2) {
        C4417x6 c4417x6 = new C4417x6();
        for (C9435kk c9435kk : this.f34334x1) {
            C11913yj c11913yjM55760h4 = this.f34320k4.m49772yj().m55760h4();
            if (this.f34320k4.m49764kk().m56803ck()) {
                c11913yjM55760h4.m55777kk(mo46208dy() + f2, c9435kk.m46220yj() + (-(mo46216m9() + f)));
            } else {
                c11913yjM55760h4.m55777kk(c9435kk.m46220yj() + mo46216m9() + f, mo46208dy() + f2);
            }
            c4417x6.m17827k4(c9435kk.m46213k4(C11913yj.m55750k4(c11913yjM55760h4)), false);
        }
        return c4417x6;
    }

    @Override // com.aspose.slides.internal.p390s1.InterfaceC10128k4
    /* JADX INFO: renamed from: k4 */
    public InterfaceC1565x1 mo46212k4(float f, float f2, C12013m9 c12013m9) {
        C4417x6 c4417x6 = new C4417x6();
        for (C9435kk c9435kk : this.f34334x1) {
            C11913yj c11913yjM55760h4 = this.f34320k4.m49772yj().m55760h4();
            if (this.f34320k4.m49764kk().m56803ck()) {
                c11913yjM55760h4.m55777kk(mo46208dy() + f2, c9435kk.m46220yj() + (-(mo46216m9() + f)));
            } else {
                c11913yjM55760h4.m55777kk(c9435kk.m46220yj() + mo46216m9() + f, mo46208dy() + f2);
            }
            c11913yjM55760h4.m55785x1(-0.17f, 0.0f);
            c4417x6.m17827k4(c9435kk.m46213k4(c11913yjM55760h4), false);
        }
        return c4417x6;
    }

    /* JADX INFO: renamed from: k4 */
    public void m46223k4(C9435kk c9435kk, float f) {
        this.f34334x1.add(c9435kk);
        this.f34332kk = Math.max(this.f34332kk, c9435kk.mo46215kk() + f);
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
        m46221x1(interfaceC14122k4, fMo46216m9, fMo46208dy);
    }
}
