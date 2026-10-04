package com.aspose.slides;

import com.aspose.slides.internal.p172hu.AbstractC4685kk;
import com.aspose.slides.internal.p332p7.C7258al;
import com.aspose.slides.internal.p332p7.C8150l0;
import com.aspose.slides.internal.p332p7.C9030ve;
import com.aspose.slides.internal.p332p7.C9391zp;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: loaded from: classes3.dex */
class ai9 {
    /* JADX INFO: renamed from: k4 */
    public static void m3623k4(GroupShape groupShape, C8150l0 c8150l0) {
        double dM45889k4;
        double dM45891x1;
        double dM28298x1;
        nd1 nd1VarMo1214P_ = groupShape.mo1214P_();
        double dM28296k4 = 0.0d;
        if (c8150l0.m35799dy() != null) {
            dM45889k4 = c8150l0.m35799dy().m45889k4();
            dM45891x1 = c8150l0.m35799dy().m45891x1();
        } else {
            dM45889k4 = 0.0d;
            dM45891x1 = 0.0d;
        }
        if (c8150l0.m35796c5() != null) {
            dM28296k4 = c8150l0.m35796c5().m28296k4();
            dM28298x1 = c8150l0.m35796c5().m28298x1();
        } else {
            dM28298x1 = 0.0d;
        }
        boolean zM35800h4 = c8150l0.m35800h4();
        boolean zM35806m9 = c8150l0.m35806m9();
        nd1VarMo1214P_.m67987k4(new tbp(dM45889k4, dM45891x1));
        groupShape.m2555k4(dM28296k4, dM28298x1);
        nd1VarMo1214P_.m67985k4(c8150l0.m35798du(), zM35800h4 ? (byte) 1 : (byte) 0, zM35806m9 ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m3624k4(IShapeFrame iShapeFrame, C9030ve c9030ve) {
        C9391zp c9391zpM43000k4 = c9030ve.m43000k4();
        c9391zpM43000k4.m45890k4(C14044b3.m66437kk((double) iShapeFrame.getX()) ? 0.0d : iShapeFrame.getX());
        c9391zpM43000k4.m45892x1(C14044b3.m66437kk((double) iShapeFrame.getY()) ? 0.0d : iShapeFrame.getY());
        C7258al c7258alM43006x1 = c9030ve.m43006x1();
        c7258alM43006x1.m28297k4(C14044b3.m66437kk((double) iShapeFrame.getWidth()) ? 0.0d : iShapeFrame.getWidth());
        c7258alM43006x1.m28299x1(C14044b3.m66437kk((double) iShapeFrame.getHeight()) ? 0.0d : iShapeFrame.getHeight());
        c9030ve.m43001k4(C14064he.m66715kk(iShapeFrame.getRotation()) ? 0.0f : iShapeFrame.getRotation());
        c9030ve.m43002k4(iShapeFrame.getFlipH() == 1);
        c9030ve.m43007x1(iShapeFrame.getFlipV() == 1);
        m3627k4(c9030ve, c9391zpM43000k4, c7258alM43006x1);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m3625k4(Shape shape, AbstractC4685kk<C9030ve> abstractC4685kk, boolean z) {
        if (z || m3629k4(shape)) {
            m3626k4(shape, abstractC4685kk.invoke(), z);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m3626k4(Shape shape, C9030ve c9030ve, boolean z) {
        if (z || m3629k4(shape)) {
            m3624k4(shape.m2546bz().m5646yj(), c9030ve);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m3627k4(C9030ve c9030ve, C9391zp c9391zp, C7258al c7258al) {
        if (c7258al.m28296k4() > 0.0d) {
            return;
        }
        c9391zp.m45890k4(c7258al.m28296k4() + c9391zp.m45889k4());
        c7258al.m28297k4(C14116yg.m67475k4(c7258al.m28296k4()));
        c9030ve.m43002k4(true);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m3628k4(C9030ve c9030ve, tbp[] tbpVarArr, tbp[] tbpVarArr2, C1258im[] c1258imArr) {
        tbp tbpVar = tbp.f49088kk;
        tbpVar.CloneTo(tbpVarArr[0]);
        if (c9030ve.m42999h4() != null) {
            tbpVarArr[0].f49090k4 = c9030ve.m42999h4().m45889k4();
            tbpVarArr[0].f49091x1 = c9030ve.m42999h4().m45891x1();
        }
        tbpVar.CloneTo(tbpVarArr2[0]);
        if (c9030ve.m43004m9() != null) {
            tbpVarArr2[0].f49090k4 = c9030ve.m43004m9().m28296k4();
            tbpVarArr2[0].f49091x1 = c9030ve.m43004m9().m28298x1();
        }
        C1258im c1258im = new C1258im();
        c1258imArr[0] = c1258im;
        c1258im.f5734x1 = c9030ve.m43003kk();
        c1258imArr[0].f5733to = c9030ve.m43005to();
        c1258imArr[0].f5732kk = c9030ve.m42998du();
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m3629k4(Shape shape) {
        nd1 nd1VarMo1214P_ = shape.mo1214P_();
        tbp tbpVarClone = shape.m2575sv().Clone();
        return (C14044b3.m66437kk(nd1VarMo1214P_.m67982k4().f49090k4) && C14044b3.m66437kk(nd1VarMo1214P_.m67982k4().f49091x1) && C14044b3.m66437kk(tbpVarClone.f49090k4) && C14044b3.m66437kk(tbpVarClone.f49091x1) && C14044b3.m66437kk((double) nd1VarMo1214P_.m67988kk()) && nd1VarMo1214P_.m67989to() == -1 && nd1VarMo1214P_.m67980du() == -1) ? false : true;
    }
}
