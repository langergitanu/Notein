package com.aspose.slides;

import com.aspose.slides.internal.p172hu.AbstractC4685kk;
import com.aspose.slides.internal.p332p7.C7718g1;

/* JADX INFO: loaded from: classes3.dex */
class z8u {
    /* JADX INFO: renamed from: k4 */
    public static void m74342k4(IChart iChart, C7718g1 c7718g1, gnb gnbVar) {
        if (c7718g1 == null) {
            return;
        }
        IRotation3D rotation3D = iChart.getRotation3D();
        rotation3D.setRotationX(c7718g1.m32229m9() != null ? c7718g1.m32229m9().m37584k4() : (byte) 15);
        rotation3D.setRotationY(c7718g1.m32219c5() != null ? c7718g1.m32219c5().m38407k4() : 20);
        if (c7718g1.m32222dy() != null) {
            rotation3D.setHeightPercents(c7718g1.m32222dy().m32071k4());
        }
        rotation3D.setDepthPercents(c7718g1.m32225jd() == null ? 100 : c7718g1.m32225jd().m39325k4());
        if (c7718g1.m32220ck() != null) {
            rotation3D.setRightAngleAxes(c7718g1.m32220ck().m41467k4());
        }
        rotation3D.setPerspective(c7718g1.m32223fa() != null ? c7718g1.m32223fa().m30241k4() : (byte) 30);
        m74344k4(rotation3D, c7718g1);
    }

    /* JADX INFO: renamed from: x1 */
    private static void m74346x1(IRotation3D iRotation3D, C7718g1 c7718g1) {
        c7718g1.m32227k4(((Rotation3D) iRotation3D).m2477k4().m63558k4());
    }

    /* JADX INFO: renamed from: k4 */
    public static void m74343k4(IRotation3D iRotation3D, AbstractC4685kk<C7718g1> abstractC4685kk) {
        if (m74345k4((Rotation3D) iRotation3D)) {
            C7718g1 c7718g1Invoke = abstractC4685kk.invoke();
            c7718g1Invoke.m32226k4().m37585k4(iRotation3D.getRotationX());
            c7718g1Invoke.m32228kk().m38408k4(iRotation3D.getRotationY());
            c7718g1Invoke.m32221du().m41466k4(iRotation3D.getRightAngleAxes());
            if ((iRotation3D.getHeightPercents() & 65535) != 100) {
                c7718g1Invoke.m32232x1().m32072k4(iRotation3D.getHeightPercents());
            }
            if ((iRotation3D.getDepthPercents() & 65535) != 100) {
                c7718g1Invoke.m32230to().m39326k4(iRotation3D.getDepthPercents());
            }
            if ((iRotation3D.getPerspective() & 255) != 30) {
                c7718g1Invoke.m32224h4().m30242k4(iRotation3D.getPerspective());
            }
            m74346x1(iRotation3D, c7718g1Invoke);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m74344k4(IRotation3D iRotation3D, C7718g1 c7718g1) {
        ((Rotation3D) iRotation3D).m2477k4().m63559k4(c7718g1.m32231up());
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m74345k4(Rotation3D rotation3D) {
        return (rotation3D.getRotationX() == 0 && (rotation3D.getRotationY() & 65535) == 0 && !rotation3D.getRightAngleAxes() && (rotation3D.getHeightPercents() & 65535) == 100 && (rotation3D.getDepthPercents() & 65535) == 100 && (rotation3D.getPerspective() & 255) == 30 && rotation3D.m2477k4().m63558k4() == null) ? false : true;
    }
}
