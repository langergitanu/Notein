package com.aspose.slides.internal.p309o2;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p329p4.C7179c5;
import com.aspose.slides.internal.p329p4.C7181du;
import com.aspose.slides.internal.p329p4.C7182dy;
import com.aspose.slides.internal.p329p4.C7185jd;
import com.aspose.slides.internal.p329p4.C7186k4;
import com.aspose.slides.internal.p329p4.C7187kk;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.o2.k4 */
/* JADX INFO: loaded from: classes4.dex */
public class C6969k4 extends AbstractC6972x1 {

    /* JADX INFO: renamed from: k4 */
    private C7186k4 f18965k4;

    /* JADX INFO: renamed from: kk */
    private float f18966kk;

    /* JADX INFO: renamed from: x1 */
    private C7186k4 f18967x1;

    public C6969k4(C7185jd c7185jd) {
        super(c7185jd);
        C7187kk c7187kk = (C7187kk) mo8461c5();
        m27245k4(c7187kk);
        m27248x1(c7187kk);
        m27244k4(c7187kk.m27791ck(C7182dy.f19456hu));
    }

    /* JADX INFO: renamed from: du */
    public final C7186k4 m27249du() {
        if (m27254x1() == null) {
            m27246kk((C7186k4) m27273m9().mo27768h4(C7182dy.f19435gi));
            if (m27254x1() == null) {
                m27246kk(new C7186k4());
                m27254x1().m27783k4(new C7181du(1.0f));
            }
        }
        return m27254x1();
    }

    /* JADX INFO: renamed from: h4 */
    public final float m27250h4() {
        if (m27252kk() == Float.NaN) {
            m27244k4(m27273m9().m27791ck(C7182dy.f19456hu));
        }
        return m27252kk();
    }

    /* JADX INFO: renamed from: k4 */
    public final C7186k4 m27251k4() {
        return this.f18965k4;
    }

    /* JADX INFO: renamed from: kk */
    public final float m27252kk() {
        return this.f18966kk;
    }

    /* JADX INFO: renamed from: to */
    public final C7186k4 m27253to() {
        if (m27251k4() == null) {
            m27247x1((C7186k4) m27273m9().mo27768h4(C7182dy.f19500kp));
            if (m27251k4() == null) {
                m27247x1(new C7186k4());
                m27251k4().m27783k4(new C7181du(0.0f));
            }
        }
        return m27251k4();
    }

    /* JADX INFO: renamed from: x1 */
    public final C7186k4 m27254x1() {
        return this.f18967x1;
    }

    /* JADX INFO: renamed from: k4 */
    private void m27244k4(float f) {
        this.f18966kk = f;
    }

    /* JADX INFO: renamed from: kk */
    private void m27246kk(C7186k4 c7186k4) {
        this.f18967x1 = c7186k4;
    }

    /* JADX INFO: renamed from: x1 */
    private void m27247x1(C7186k4 c7186k4) {
        this.f18965k4 = c7186k4;
    }

    /* JADX INFO: renamed from: k4 */
    private void m27245k4(C7187kk c7187kk) {
        C7185jd c7185jdMo27768h4 = c7187kk.mo27768h4(C7182dy.f19500kp);
        m27247x1(C7019kk.m27469x1(c7185jdMo27768h4, C7186k4.class) ? (C7186k4) c7185jdMo27768h4 : new C7186k4());
        if (m27251k4().m27778k4() == 0) {
            m27251k4().m27783k4(new C7181du(0.0f));
        }
    }

    /* JADX INFO: renamed from: x1 */
    private void m27248x1(C7187kk c7187kk) {
        C7185jd c7185jdMo27768h4 = c7187kk.mo27768h4(C7182dy.f19435gi);
        m27246kk(C7019kk.m27469x1(c7185jdMo27768h4, C7186k4.class) ? (C7186k4) c7185jdMo27768h4 : new C7186k4());
        if (m27254x1().m27778k4() == 0) {
            m27254x1().m27783k4(new C7181du(1.0f));
        }
    }

    @Override // com.aspose.slides.internal.p309o2.AbstractC6972x1
    /* JADX INFO: renamed from: k4 */
    public float[] mo27241k4(float[] fArr) {
        double d = fArr[0];
        double dM27250h4 = m27250h4();
        C7186k4 c7186k4M27253to = m27253to();
        C7186k4 c7186k4M27249du = m27249du();
        int iM27778k4 = c7186k4M27253to.m27778k4();
        float[] fArr2 = new float[iM27778k4];
        for (int i = 0; i < iM27778k4; i++) {
            fArr2[i] = ((((C7179c5) c7186k4M27249du.m27785kk(i)).m27753to() - ((C7179c5) c7186k4M27253to.m27785kk(i)).m27753to()) * ((float) C14116yg.m67469du(d, dM27250h4))) + ((C7179c5) c7186k4M27253to.m27785kk(i)).m27753to();
        }
        return m27275x1(fArr2);
    }
}
