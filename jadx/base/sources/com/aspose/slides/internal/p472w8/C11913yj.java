package com.aspose.slides.internal.p472w8;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p031aw.C1564k4;
import com.aspose.slides.internal.p156gw.C4400k4;
import com.aspose.slides.internal.p282mu.C6541k4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12016rv;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.backend.System.Drawing.AbstractC14124to;

/* JADX INFO: renamed from: com.aspose.slides.internal.w8.yj */
/* JADX INFO: loaded from: classes4.dex */
public class C11913yj implements IDisposable {

    /* JADX INFO: renamed from: k4 */
    public static final C11913yj f40121k4 = new C11913yj();

    /* JADX INFO: renamed from: x1 */
    private final C4400k4 f40122x1;

    public C11913yj() {
        this(new C4400k4());
    }

    /* JADX INFO: renamed from: k4 */
    public static C11913yj m55749k4(double d) {
        return new C11913yj(C4400k4.m17911k4(d));
    }

    /* JADX INFO: renamed from: x1 */
    public static C11913yj m55754x1(float f) {
        return new C11913yj(C4400k4.m17911k4(f));
    }

    /* JADX INFO: renamed from: c5 */
    public int m55755c5() {
        return m55790x6().m17928k4();
    }

    /* JADX INFO: renamed from: ck */
    public double m55756ck() {
        return m55790x6().m17939m9();
    }

    @Override // com.aspose.slides.p559ms.System.IDisposable
    public void dispose() {
    }

    /* JADX INFO: renamed from: du */
    public float m55757du() {
        return (float) m55790x6().m17920c5();
    }

    /* JADX INFO: renamed from: dy */
    public void m55758dy() {
        m55790x6().m17927jd();
    }

    public boolean equals(Object obj) {
        C11913yj c11913yj = (C11913yj) C7019kk.m27452k4(obj, C11913yj.class);
        if (c11913yj == null) {
            return false;
        }
        float[] fArrM55776k4 = c11913yj.m55776k4();
        float[] fArrM55776k42 = m55776k4();
        boolean z = true;
        for (int i = 0; i < fArrM55776k4.length; i++) {
            z &= fArrM55776k4[i] == fArrM55776k42[i];
        }
        return z;
    }

    /* JADX INFO: renamed from: fa */
    public double m55759fa() {
        return m55790x6().m17925h4();
    }

    /* JADX INFO: renamed from: h4 */
    public C11913yj m55760h4() {
        return new C11913yj((C4400k4) m55790x6().clone());
    }

    public int hashCode() {
        return m55790x6().hashCode();
    }

    /* JADX INFO: renamed from: jd */
    public double m55761jd() {
        return m55790x6().m17941to();
    }

    /* JADX INFO: renamed from: kk */
    public void m55777kk(float f, float f2) {
        m55790x6().m17936kk(f, f2);
    }

    /* JADX INFO: renamed from: ks */
    public double m55779ks() {
        return m55790x6().m17920c5();
    }

    /* JADX INFO: renamed from: m9 */
    public void m55780m9() {
        try {
            C4400k4 c4400k4 = this.f40122x1;
            c4400k4.m17929k4(c4400k4.m17921ck());
        } catch (C1564k4 e) {
            throw new ArgumentException(e.getMessage(), e);
        }
    }

    /* JADX INFO: renamed from: ne */
    public <T> T m55781ne() {
        return (T) AbstractC14124to.m67611du().mo67635k4(this);
    }

    /* JADX INFO: renamed from: rv */
    public double m55782rv() {
        return m55790x6().m17943x1();
    }

    /* JADX INFO: renamed from: to */
    public float m55783to() {
        return (float) m55790x6().m17924dy();
    }

    /* JADX INFO: renamed from: up */
    public double m55784up() {
        return m55790x6().m17922du();
    }

    /* JADX INFO: renamed from: x6 */
    public C4400k4 m55790x6() {
        return this.f40122x1;
    }

    /* JADX INFO: renamed from: yj */
    public double m55791yj() {
        return m55790x6().m17924dy();
    }

    public C11913yj(float f, float f2, float f3, float f4, float f5, float f6) {
        this(new C4400k4(f, f2, f3, f4, f5, f6));
    }

    /* JADX INFO: renamed from: du */
    public static C11913yj m55748du(float f, float f2) {
        return new C11913yj(C4400k4.m17918x1(f, f2));
    }

    /* JADX INFO: renamed from: k4 */
    public static <T> C11913yj m55750k4(T t) {
        if (t == null) {
            return null;
        }
        return AbstractC14124to.m67611du().mo67634k4(t);
    }

    /* JADX INFO: renamed from: to */
    public static C11913yj m55753to(float f, float f2) {
        return new C11913yj(C4400k4.m17912k4(f, f2));
    }

    /* JADX INFO: renamed from: kk */
    public boolean m55778kk() {
        return Math.abs(m55790x6().m17943x1()) > Double.MIN_VALUE;
    }

    /* JADX INFO: renamed from: x1 */
    public void m55785x1(float f, float f2) {
        m55790x6().m17923du(f, f2);
    }

    public C11913yj(C4400k4 c4400k4) {
        this.f40122x1 = c4400k4;
    }

    /* JADX INFO: renamed from: k4 */
    public void m55762k4(float f) {
        m55790x6().m17944x1(Math.toRadians(f));
    }

    /* JADX INFO: renamed from: x1 */
    public void m55786x1(float f, float f2, int i) {
        m55751k4(C4400k4.m17912k4(f, f2), i);
    }

    public C11913yj(C12007ix c12007ix, C12025x6[] c12025x6Arr) {
        if (c12025x6Arr == null) {
            throw new ArgumentNullException("Value of 'plgpts' cannot be null");
        }
        if (c12025x6Arr.length != 3) {
            throw new ArgumentException("Value of 'plgpts' is invalid");
        }
        C4400k4 c4400k4 = new C4400k4(((double) (c12025x6Arr[1].m56897x1() - c12025x6Arr[0].m56897x1())) / ((double) c12007ix.m56550c5()), ((double) (c12025x6Arr[1].m56895kk() - c12025x6Arr[0].m56895kk())) / ((double) c12007ix.m56550c5()), ((double) (c12025x6Arr[2].m56897x1() - c12025x6Arr[0].m56897x1())) / ((double) c12007ix.m56575x1()), ((double) (c12025x6Arr[2].m56895kk() - c12025x6Arr[0].m56895kk())) / ((double) c12007ix.m56575x1()), c12025x6Arr[0].m56897x1(), c12025x6Arr[0].m56895kk());
        this.f40122x1 = c4400k4;
        c4400k4.m17936kk(-c12007ix.m56557jd(), -c12007ix.m56551ck());
    }

    /* JADX INFO: renamed from: k4 */
    public void m55763k4(float f, float f2) {
        m55764k4(f, f2, 0);
    }

    /* JADX INFO: renamed from: x1 */
    public void m55787x1(C11913yj c11913yj) {
        m55769k4(c11913yj, 0);
    }

    /* JADX INFO: renamed from: k4 */
    public void m55764k4(float f, float f2, int i) {
        m55751k4(C4400k4.m17918x1(f, f2), i);
    }

    /* JADX INFO: renamed from: x1 */
    public void m55788x1(C12025x6[] c12025x6Arr) {
        if (c12025x6Arr == null) {
            throw new ArgumentNullException("Value of 'pts' cannot be null");
        }
        if (c12025x6Arr.length < 1) {
            throw new ArgumentException("Argument 'pts' is invalid");
        }
        for (int i = 0; i < c12025x6Arr.length; i++) {
            double[] dArr = {c12025x6Arr[i].m56897x1(), c12025x6Arr[i].m56895kk()};
            m55790x6().m17947x1(dArr, 0, dArr, 0, 1);
            c12025x6Arr[i].m56891k4((float) dArr[0]);
            c12025x6Arr[i].m56898x1((float) dArr[1]);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void m55765k4(float f, int i) {
        m55751k4(C4400k4.m17911k4(Math.toRadians(f)), i);
    }

    /* JADX INFO: renamed from: x1 */
    public boolean m55789x1() {
        return C6541k4.m26354to(this);
    }

    /* JADX INFO: renamed from: k4 */
    public void m55766k4(float f, C12025x6 c12025x6) {
        m55790x6().m17945x1(Math.toRadians(f), c12025x6.m56897x1(), c12025x6.m56895kk());
    }

    /* JADX INFO: renamed from: k4 */
    public void m55767k4(float f, C12025x6 c12025x6, int i) {
        m55751k4(C4400k4.m17913k4(Math.toRadians(f), c12025x6.m56897x1(), c12025x6.m56895kk()), i);
    }

    /* JADX INFO: renamed from: k4 */
    private void m55751k4(C4400k4 c4400k4, int i) {
        m55752k4(m55790x6(), c4400k4, i);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m55752k4(C4400k4 c4400k4, C4400k4 c4400k42, int i) {
        if (i == 0) {
            c4400k4.m17946x1(c4400k42);
        } else {
            if (i != 1) {
                throw new ArgumentException("Value of 'order' is invalid");
            }
            c4400k4.m17938kk(c4400k42);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void m55768k4(C11913yj c11913yj) {
        c11913yj.m55790x6().m17929k4(m55790x6());
    }

    /* JADX INFO: renamed from: k4 */
    public void m55769k4(C11913yj c11913yj, int i) {
        if (c11913yj == null) {
            throw new ArgumentNullException("Value of 'matrix' cannot be null");
        }
        m55751k4(c11913yj.m55790x6(), i);
    }

    /* JADX INFO: renamed from: k4 */
    public void m55770k4(double[] dArr, int i, double[] dArr2, int i2, int i3) {
        m55790x6().m17930k4(dArr, i, dArr2, i2, i3);
    }

    /* JADX INFO: renamed from: k4 */
    public void m55771k4(double[] dArr, int i, float[] fArr, int i2, int i3) {
        m55790x6().m17931k4(dArr, i, fArr, i2, i3);
    }

    /* JADX INFO: renamed from: k4 */
    public void m55772k4(float[] fArr, int i, double[] dArr, int i2, int i3) {
        m55790x6().m17932k4(fArr, i, dArr, i2, i3);
    }

    /* JADX INFO: renamed from: k4 */
    public void m55773k4(float[] fArr, int i, float[] fArr2, int i2, int i3) {
        m55790x6().m17933k4(fArr, i, fArr2, i2, i3);
    }

    /* JADX INFO: renamed from: k4 */
    public void m55774k4(C12016rv[] c12016rvArr) {
        if (c12016rvArr == null) {
            throw new ArgumentNullException("Value of 'pts' cannot be null");
        }
        if (c12016rvArr.length < 1) {
            throw new ArgumentException("Argument 'pts' is invalid");
        }
        for (int i = 0; i < c12016rvArr.length; i++) {
            double[] dArr = {c12016rvArr[i].m56708k4(), c12016rvArr[i].m56713x1()};
            m55790x6().m17930k4(dArr, 0, dArr, 0, 1);
            c12016rvArr[i].m56709k4((int) Math.round(dArr[0]));
            c12016rvArr[i].m56714x1((int) Math.round(dArr[1]));
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void m55775k4(C12025x6[] c12025x6Arr) {
        if (c12025x6Arr == null) {
            throw new ArgumentNullException("Value of 'pts' cannot be null");
        }
        if (c12025x6Arr.length < 1) {
            throw new ArgumentException("Argument 'pts' is invalid");
        }
        for (int i = 0; i < c12025x6Arr.length; i++) {
            double[] dArr = {c12025x6Arr[i].m56897x1(), c12025x6Arr[i].m56895kk()};
            m55790x6().m17930k4(dArr, 0, dArr, 0, 1);
            c12025x6Arr[i].m56891k4((float) dArr[0]);
            c12025x6Arr[i].m56898x1((float) dArr[1]);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public float[] m55776k4() {
        return new float[]{(float) m55790x6().m17941to(), (float) m55790x6().m17939m9(), (float) m55790x6().m17925h4(), (float) m55790x6().m17922du(), (float) m55790x6().m17924dy(), (float) m55790x6().m17920c5()};
    }
}
