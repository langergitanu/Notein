package com.aspose.slides.internal.p309o2;

import com.aspose.slides.exceptions.IOException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p329p4.C7180ck;
import com.aspose.slides.internal.p329p4.C7182dy;
import com.aspose.slides.internal.p329p4.C7184h4;
import com.aspose.slides.internal.p329p4.C7185jd;
import com.aspose.slides.internal.p329p4.C7186k4;
import com.aspose.slides.internal.p329p4.C7187kk;
import com.aspose.slides.internal.p329p4.InterfaceC7193yj;
import com.aspose.slides.internal.p333p8.C9427jd;
import com.aspose.slides.internal.p348q1.C9612x1;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.o2.x1 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC6972x1 implements InterfaceC7193yj {

    /* JADX INFO: renamed from: du */
    private int f18973du;

    /* JADX INFO: renamed from: h4 */
    private int f18974h4;

    /* JADX INFO: renamed from: k4 */
    private C9427jd f18975k4;

    /* JADX INFO: renamed from: kk */
    private C7186k4 f18976kk;

    /* JADX INFO: renamed from: to */
    private C7186k4 f18977to;

    /* JADX INFO: renamed from: x1 */
    private C7187kk f18978x1;

    public AbstractC6972x1(C7185jd c7185jd) {
        if (C7019kk.m27469x1(c7185jd, C7180ck.class)) {
            C9427jd c9427jd = new C9427jd((C7180ck) c7185jd);
            this.f18975k4 = c9427jd;
            ((C7180ck) c9427jd.mo8461c5()).m27815x1(C7182dy.f19711xz, C7182dy.f19664v0);
        } else if (C7019kk.m27469x1(c7185jd, C7187kk.class)) {
            this.f18978x1 = (C7187kk) c7185jd;
        }
        this.f18973du = -1;
        this.f18974h4 = -1;
    }

    @Override // com.aspose.slides.internal.p329p4.InterfaceC7193yj
    /* JADX INFO: renamed from: c5 */
    public final C7185jd mo8461c5() {
        C9427jd c9427jd = this.f18975k4;
        return c9427jd != null ? c9427jd.mo8461c5() : this.f18978x1;
    }

    /* JADX INFO: renamed from: ck */
    public final int m27265ck() {
        if (this.f18974h4 == -1) {
            this.f18974h4 = m27267fa().m27778k4() / 2;
        }
        return this.f18974h4;
    }

    /* JADX INFO: renamed from: dy */
    public final C9427jd m27266dy() {
        return this.f18975k4;
    }

    /* JADX INFO: renamed from: fa */
    public final C7186k4 m27267fa() {
        if (this.f18977to == null) {
            this.f18977to = (C7186k4) m27273m9().mo27768h4(C7182dy.f19582pq);
        }
        return this.f18977to;
    }

    /* JADX INFO: renamed from: jd */
    public final int m27268jd() {
        if (this.f18973du == -1) {
            this.f18973du = m27264k4().m27778k4() / 2;
        }
        return this.f18973du;
    }

    /* JADX INFO: renamed from: k4 */
    public final float m27269k4(float f, float f2, float f3) {
        return f < f2 ? f2 : f > f3 ? f3 : f;
    }

    /* JADX INFO: renamed from: k4 */
    public abstract float[] mo27241k4(float[] fArr);

    /* JADX INFO: renamed from: m9 */
    public final C7187kk m27273m9() {
        C9427jd c9427jd = this.f18975k4;
        return c9427jd != null ? c9427jd.m46156x1() : this.f18978x1;
    }

    /* JADX INFO: renamed from: x1 */
    public final C9612x1 m27274x1(int i) {
        return new C9612x1(m27264k4(), i);
    }

    /* JADX INFO: renamed from: k4 */
    public final float m27270k4(float f, float f2, float f3, float f4, float f5) {
        return (((f5 - f4) * (f - f2)) / (f3 - f2)) + f4;
    }

    /* JADX INFO: renamed from: x1 */
    public final float[] m27275x1(float[] fArr) {
        C7186k4 c7186k4M27267fa = m27267fa();
        if (c7186k4M27267fa == null) {
            return fArr;
        }
        float[] fArrM27788x1 = c7186k4M27267fa.m27788x1();
        int length = fArrM27788x1.length / 2;
        float[] fArr2 = new float[length];
        for (int i = 0; i < length; i++) {
            int i2 = i << 1;
            fArr2[i] = m27269k4(fArr[i], fArrM27788x1[i2], fArrM27788x1[i2 + 1]);
        }
        return fArr2;
    }

    /* JADX INFO: renamed from: k4 */
    public static AbstractC6972x1 m27263k4(C7185jd c7185jd) {
        if (C7019kk.m27469x1(c7185jd, C7184h4.class)) {
            c7185jd = ((C7184h4) c7185jd).m27772kk();
        }
        C7187kk c7187kk = (C7187kk) c7185jd;
        int iM27790c5 = c7187kk.m27790c5(C7182dy.f19606r9);
        if (iM27790c5 == 0) {
            return new C6971to(c7187kk);
        }
        if (iM27790c5 == 2) {
            return new C6969k4(c7187kk);
        }
        if (iM27790c5 == 3) {
            return new C6968du(c7187kk);
        }
        if (iM27790c5 == 4) {
            return new C6970kk(c7187kk);
        }
        throw new IOException(C14113y2.m67402k4("Unknown function type {0}", Integer.valueOf(iM27790c5)));
    }

    /* JADX INFO: renamed from: k4 */
    private C7186k4 m27264k4() {
        if (this.f18976kk == null) {
            this.f18976kk = (C7186k4) m27273m9().mo27768h4(C7182dy.f19394dw);
        }
        return this.f18976kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final C7186k4 m27271k4(C7186k4 c7186k4) {
        float[] fArrMo27241k4 = mo27241k4(c7186k4.m27788x1());
        C7186k4 c7186k42 = new C7186k4();
        c7186k42.m27784k4(fArrMo27241k4);
        return c7186k42;
    }

    /* JADX INFO: renamed from: k4 */
    public final C9612x1 m27272k4(int i) {
        return new C9612x1(m27267fa(), i);
    }
}
