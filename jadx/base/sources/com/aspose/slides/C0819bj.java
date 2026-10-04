package com.aspose.slides;

import com.aspose.slides.internal.p172hu.AbstractC4685kk;
import com.aspose.slides.internal.p332p7.AbstractC9290yj;
import com.aspose.slides.internal.p332p7.C7258al;
import com.aspose.slides.internal.p332p7.C8150l0;
import com.aspose.slides.internal.p332p7.C9391zp;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14064he;

/* JADX INFO: renamed from: com.aspose.slides.bj */
/* JADX INFO: loaded from: classes3.dex */
class C0819bj {
    /* JADX INFO: renamed from: k4 */
    public static void m4224k4(GroupShape groupShape, AbstractC4685kk<C8150l0> abstractC4685kk) {
        nd1 nd1VarMo1214P_ = groupShape.mo1214P_();
        tbp tbpVarClone = groupShape.m1649kk().Clone();
        tbp tbpVarClone2 = groupShape.m1652to().Clone();
        tbp tbpVarClone3 = nd1VarMo1214P_.m67982k4().Clone();
        tbp tbpVarClone4 = groupShape.m2575sv().Clone();
        float fM67988kk = nd1VarMo1214P_.m67988kk();
        byte bM67989to = nd1VarMo1214P_.m67989to();
        byte bM67980du = nd1VarMo1214P_.m67980du();
        if (C14044b3.m66437kk(tbpVarClone3.f49090k4) && C14044b3.m66437kk(tbpVarClone3.f49091x1) && C14044b3.m66437kk(tbpVarClone4.f49090k4) && C14044b3.m66437kk(tbpVarClone4.f49091x1) && C14064he.m66715kk(fM67988kk) && bM67989to == -1 && bM67980du == -1 && ((C14044b3.m66437kk(tbpVarClone.f49090k4) || tbpVarClone.f49090k4 == 0.0d) && ((C14044b3.m66437kk(tbpVarClone.f49091x1) || tbpVarClone.f49091x1 == 0.0d) && ((C14044b3.m66437kk(tbpVarClone2.f49090k4) || tbpVarClone2.f49090k4 == 0.0d) && (C14044b3.m66437kk(tbpVarClone2.f49091x1) || tbpVarClone2.f49091x1 == 0.0d))))) {
            return;
        }
        C8150l0 c8150l0Invoke = abstractC4685kk.invoke();
        ShapeFrame shapeFrameM5646yj = groupShape.m2546bz().m5646yj();
        C9391zp c9391zpM35802k4 = c8150l0Invoke.m35802k4();
        c9391zpM35802k4.m45890k4(C14044b3.m66437kk((double) shapeFrameM5646yj.getX()) ? 0.0d : shapeFrameM5646yj.getX());
        c9391zpM35802k4.m45892x1(C14044b3.m66437kk((double) shapeFrameM5646yj.getY()) ? 0.0d : shapeFrameM5646yj.getY());
        C7258al c7258alM35808x1 = c8150l0Invoke.m35808x1();
        c7258alM35808x1.m28297k4(C14044b3.m66437kk((double) shapeFrameM5646yj.getWidth()) ? 0.0d : shapeFrameM5646yj.getWidth());
        c7258alM35808x1.m28299x1(C14044b3.m66437kk((double) shapeFrameM5646yj.getHeight()) ? 0.0d : shapeFrameM5646yj.getHeight());
        c8150l0Invoke.m35803k4(C14064he.m66715kk(shapeFrameM5646yj.getRotation()) ? 0.0f : shapeFrameM5646yj.getRotation());
        c8150l0Invoke.m35804k4(shapeFrameM5646yj.getFlipH() == 1);
        c8150l0Invoke.m35809x1(shapeFrameM5646yj.getFlipV() == 1);
        if (tbpVarClone.f49090k4 != 0.0d || tbpVarClone.f49091x1 != 0.0d) {
            C9391zp c9391zpM35805kk = c8150l0Invoke.m35805kk();
            c9391zpM35805kk.m45890k4(C14044b3.m66437kk(tbpVarClone.f49090k4) ? 0.0d : tbpVarClone.f49090k4);
            c9391zpM35805kk.m45892x1(C14044b3.m66437kk(tbpVarClone.f49091x1) ? 0.0d : tbpVarClone.f49091x1);
        }
        if (tbpVarClone2.f49090k4 == 0.0d && tbpVarClone2.f49091x1 == 0.0d) {
            return;
        }
        C7258al c7258alM35807to = c8150l0Invoke.m35807to();
        c7258alM35807to.m28297k4(C14044b3.m66437kk(tbpVarClone2.f49090k4) ? 0.0d : tbpVarClone2.f49090k4);
        c7258alM35807to.m28299x1(C14044b3.m66437kk(tbpVarClone2.f49091x1) ? 0.0d : tbpVarClone2.f49091x1);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m4225k4(GroupShape groupShape, AbstractC9290yj abstractC9290yj) {
        float fM45889k4;
        float fM45891x1;
        float fM28298x1;
        C8150l0 c8150l0M31760kk = abstractC9290yj.mo28603x1().m31760kk();
        if (c8150l0M31760kk == null) {
            return;
        }
        ai9.m3623k4(groupShape, c8150l0M31760kk);
        float fM28296k4 = 0.0f;
        if (c8150l0M31760kk.m35801jd() != null) {
            fM45889k4 = (float) c8150l0M31760kk.m35801jd().m45889k4();
            fM45891x1 = (float) c8150l0M31760kk.m35801jd().m45891x1();
        } else {
            fM45889k4 = 0.0f;
            fM45891x1 = 0.0f;
        }
        if (c8150l0M31760kk.m35797ck() != null) {
            fM28296k4 = (float) c8150l0M31760kk.m35797ck().m28296k4();
            fM28298x1 = (float) c8150l0M31760kk.m35797ck().m28298x1();
        } else {
            fM28298x1 = 0.0f;
        }
        groupShape.m1647k4(new tbp(fM45889k4, fM45891x1));
        groupShape.m1654x1(new tbp(fM28296k4, fM28298x1));
    }
}
