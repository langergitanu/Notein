package com.aspose.slides;

import android.content.pm.PackageManager;
import com.aspose.slides.internal.p127fb.C3914k4;
import com.aspose.slides.internal.p129fe.C3983k4;
import com.aspose.slides.internal.p159h0.AbstractC4434bz;
import com.aspose.slides.internal.p159h0.C4430ar;
import com.aspose.slides.internal.p159h0.C4442e0;
import com.aspose.slides.internal.p159h0.C4443em;
import com.aspose.slides.internal.p159h0.C4459os;
import com.aspose.slides.internal.p159h0.C4471ts;
import com.aspose.slides.internal.p159h0.C4473um;
import com.aspose.slides.internal.p159h0.C4479w6;
import com.aspose.slides.internal.p159h0.C4489zj;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14093tq;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.wr */
/* JADX INFO: loaded from: classes3.dex */
class C14748wr {

    /* JADX INFO: renamed from: k4 */
    private boolean f49847k4;

    /* JADX INFO: renamed from: x1 */
    private final C14693vm f49848x1;

    public C14748wr(C14693vm c14693vm) {
        this.f49848x1 = c14693vm;
        m72887k4(false);
    }

    /* JADX INFO: renamed from: k4 */
    public final C4473um m72882k4(float[] fArr) {
        C4473um c4473umClone = C4473um.m18359k4(C4479w6.m18403k4(fArr[0])).Clone();
        C4473um c4473umClone2 = C4473um.m18364x1(C4479w6.m18403k4(-fArr[1])).Clone();
        return C4473um.m18361k4(C4473um.m18361k4(c4473umClone2, c4473umClone), C4473um.m18363kk(C4479w6.m18403k4(fArr[2])).Clone());
    }

    /* JADX INFO: renamed from: x1 */
    public final C4473um m72890x1(IRotation3D iRotation3D) {
        float rotationY;
        float rotationX;
        if (iRotation3D.getRightAngleAxes()) {
            rotationY = iRotation3D.getRotationY() & 65535;
            rotationX = iRotation3D.getRotationX();
        } else {
            rotationY = 0.0f;
            rotationX = 0.0f;
        }
        return new C4473um(1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, -((float) C14116yg.m67495m9(C4479w6.m18403k4(rotationY))), -((float) C14116yg.m67495m9(C4479w6.m18403k4(rotationX))), 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f);
    }

    /* JADX INFO: renamed from: k4 */
    public final C4489zj m72883k4(IRotation3D iRotation3D, boolean z, boolean z2, float f) {
        C4489zj c4489zj;
        C4489zj c4489zjClone = new C4489zj(-1.5f, -2.0f, -3.5f).m18510to().Clone();
        float rotationY = iRotation3D.getRotationY() & 65535;
        if (m72888k4()) {
            c4489zj = new C4489zj(1.5f, 2.0f, 3.5f);
        } else {
            if (z || !z2 || f == 0.0f || rotationY > 180.0f) {
                return c4489zjClone;
            }
            c4489zj = new C4489zj(2.0f, 1.0f, 0.0f);
        }
        c4489zj.m18510to().CloneTo(c4489zjClone);
        return c4489zjClone;
    }

    /* JADX INFO: renamed from: x1 */
    public final C14693vm m72891x1() {
        return this.f49848x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final C14093tq<C12003du> m72884k4(C0962es c0962es, azo azoVar) {
        C14093tq<C12003du> c14093tq = new C14093tq<>();
        if (c0962es != null && c0962es.m5681to() == 1) {
            c14093tq = new C14093tq<>(c0962es.m5676k4().Clone());
        } else if (azoVar != null && azoVar.m3903h4() && azoVar.m3901dy().m5681to() == 1) {
            c14093tq = new C14093tq<>(azoVar.m3916m9().Clone());
        }
        return (C14093tq.m67296x1(c14093tq, null) && C12003du.m56403k4(c14093tq.m67297k4(), C12003du.f40505to)) ? new C14093tq<>() : c14093tq;
    }

    /* JADX INFO: renamed from: k4 */
    public final C14562th m72885k4(IRotation3D iRotation3D) {
        int i;
        C14562th c14562th = new C14562th();
        if (iRotation3D.getRightAngleAxes()) {
            c14562th.m71167k4(new float[]{0.0f, 0.0f, 0.0f});
            i = 46;
        } else {
            c14562th.m71167k4(new float[]{iRotation3D.getRotationX(), iRotation3D.getRotationY() & 65535, 0.0f});
            c14562th.m71165k4((iRotation3D.getPerspective() & 255) != 0 ? (iRotation3D.getPerspective() & 255) * 0.5f : 0.05f);
            i = 53;
        }
        c14562th.m71166k4(i);
        return c14562th;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [float, java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v7, types: [float, int] */
    /* JADX WARN: Type inference failed for: r8v7, types: [float, java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v8, types: [android.content.pm.PackageInfo, int] */
    /* JADX WARN: Type inference failed for: r9v3, types: [android.content.pm.PackageInfo, int] */
    /* JADX INFO: renamed from: k4 */
    public final void m72886k4(tfm tfmVar, C4473um c4473um, C4473um c4473um2, C4473um c4473um3, C4473um c4473um4, C4489zj c4489zj, C4459os c4459os, C4443em c4443em) throws PackageManager.NameNotFoundException {
        C4442e0 c4442e0 = new C4442e0();
        c4442e0.m18166kk(c4473um.Clone());
        c4442e0.m18164k4(C4473um.m18361k4(c4473um2, c4473um3).Clone());
        c4442e0.m18169x1(c4473um4.Clone());
        c4442e0.m18163k4(1);
        C4430ar c4430arM18055m9 = C4430ar.m18055m9();
        c4430arM18055m9.m18062k4(new C4489zj(0.3f, 0.3f, 0.3f));
        c4430arM18055m9.m18064kk(c4473um.m18377x1(c4489zj.m18510to().Clone()).Clone());
        c4430arM18055m9.m18066to(new C4489zj(0.3f));
        c4430arM18055m9.m18061k4(5.0f);
        ?? M72360to = m72891x1().m72360to() * m72891x1().m72355du();
        ?? packageInfo = PackageManager.getPackageInfo((String) c4443em.m18173k4(), (int) M72360to);
        ?? packageInfo2 = PackageManager.getPackageInfo((String) c4443em.m18177x1(), (int) M72360to);
        C4471ts c4471ts = new C4471ts(packageInfo, packageInfo2, false);
        c4471ts.m18352k4(0L);
        tfmVar.m71141kk(0);
        AbstractC4434bz[] abstractC4434bzArr = {null};
        AbstractC4434bz[] abstractC4434bzArr2 = {null};
        tme.m71251k4(tfmVar, c4442e0, c4430arM18055m9, abstractC4434bzArr, abstractC4434bzArr2);
        c4471ts.m18354k4(tfmVar.m71143m9(), abstractC4434bzArr[0], abstractC4434bzArr2[0]);
        C12009k4 c12009k4 = new C12009k4((int) packageInfo, (int) packageInfo2);
        try {
            C3983k4 c3983k4M56597k4 = c12009k4.m56597k4(new C12014ne(0, 0, c12009k4.mo15760yj(), c12009k4.mo15757m9()), 2, 2498570);
            C3914k4.m15621k4(c4471ts.m18355k4(), 0, c3983k4M56597k4.m15721to(), C14116yg.m67482k4(c3983k4M56597k4.m15715du()) * c12009k4.mo15757m9());
            c12009k4.m56605k4(c3983k4M56597k4);
            m72891x1().m72358k4(c12009k4, c4459os.Clone(), c4443em.Clone(), M72360to);
        } finally {
            c12009k4.dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m72887k4(boolean z) {
        this.f49847k4 = z;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m72888k4() {
        return this.f49847k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final float[] m72889k4(C14562th c14562th) {
        int iM71169kk = c14562th.m71169kk();
        float[] fArrM71168k4 = c14562th.m71168k4();
        float fM71170x1 = c14562th.m71170x1();
        float[][] fArr = {null};
        boolean zTryGetValue = C14570tp.f49170k4.tryGetValue(Integer.valueOf(iM71169kk), fArr);
        float[] fArr2 = fArr[0];
        if (!zTryGetValue) {
            return null;
        }
        float[] fArr3 = (float[]) C7019kk.m27458kk(AbstractC14092to.m67208k4(fArr2).deepClone(), float[].class);
        if (fArrM71168k4 != null) {
            fArr3[0] = fArrM71168k4[0];
            fArr3[1] = fArrM71168k4[1];
            fArr3[2] = fArrM71168k4[2];
        } else {
            fArr3[0] = 0.0f;
            fArr3[1] = 0.0f;
            fArr3[2] = 0.0f;
        }
        if (fArr3[3] != 0.0f && !C14064he.m66715kk(fM71170x1)) {
            fArr3[3] = fM71170x1;
        }
        return fArr3;
    }
}
