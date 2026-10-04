package com.aspose.slides;

import com.aspose.slides.internal.p332p7.AbstractC8333ne;
import com.aspose.slides.internal.p332p7.C7322bh;
import com.aspose.slides.internal.p332p7.C7394ca;
import com.aspose.slides.internal.p332p7.C7639f6;
import com.aspose.slides.internal.p332p7.C9130wq;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.sv */
/* JADX INFO: loaded from: classes3.dex */
class C14471sv {
    /* JADX WARN: Removed duplicated region for block: B:17:0x0047 A[PHI: r0
      0x0047: PHI (r0v3 com.aspose.slides.internal.p7.ca) = 
      (r0v2 com.aspose.slides.internal.p7.ca)
      (r0v2 com.aspose.slides.internal.p7.ca)
      (r0v5 com.aspose.slides.internal.p7.ca)
     binds: [B:11:0x0029, B:13:0x0034, B:16:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static IShape m70798k4(C7639f6 c7639f6, IGroupShape iGroupShape, bjs bjsVar) {
        C7394ca c7394ca;
        Object obj;
        C7322bh[] c7322bhArrM31639kk = c7639f6.m31639kk();
        int length = c7322bhArrM31639kk.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                c7394ca = null;
                break;
            }
            C7322bh c7322bh = c7322bhArrM31639kk[i];
            if (c7322bh.m28900k4().size() > 0) {
                c7394ca = c7322bh.m28900k4().get_Item(0);
                break;
            }
            i++;
        }
        if (c7639f6.m31640to() != null) {
            C9130wq c9130wqM31640to = c7639f6.m31640to();
            if (c9130wqM31640to.m43856k4().length > 0) {
                bjsVar.m4229k4().m6786k4(true);
                C7394ca c7394ca2 = c9130wqM31640to.m43856k4()[0];
                if (c7394ca == null) {
                    c7394ca = c7394ca2;
                    obj = null;
                } else if (C14113y2.m67363du(c7394ca2.m29539k4(), "sp")) {
                    AutoShape autoShape = new AutoShape((ShapeCollection) iGroupShape.getShapes());
                    C0894dc.m5040k4(autoShape, (AbstractC8333ne) c7394ca2.m29542x1(), bjsVar);
                    obj = autoShape;
                } else {
                    IShape iShapeM70982k4 = C14490t8.m70982k4(c7394ca2, iGroupShape, bjsVar);
                    int iIndexOf = iGroupShape.getShapes().indexOf(iShapeM70982k4);
                    obj = iShapeM70982k4;
                    if (iIndexOf >= 0) {
                        iGroupShape.getShapes().remove(iShapeM70982k4);
                        obj = iShapeM70982k4;
                    }
                }
            } else {
                obj = null;
            }
        }
        if (c7394ca == null) {
            return null;
        }
        Shape shape = (Shape) C14490t8.m70982k4(c7394ca, iGroupShape, bjsVar);
        if (shape != null) {
            bjsVar.m4230k4(shape);
            bjsVar.m4229k4().m6786k4(false);
            shape.m2558k4((Shape) obj);
        }
        return shape;
    }

    /* JADX INFO: renamed from: k4 */
    public static void m70799k4(AutoShape autoShape, C7639f6 c7639f6, sdp sdpVar, C14786xh c14786xh) {
        C7322bh c7322bhM31637k4 = c7639f6.m31637k4();
        c7322bhM31637k4.m28902x1("a14");
        com.aspose.slides.internal.p332p7.dm6 dm6Var = (com.aspose.slides.internal.p332p7.dm6) c7322bhM31637k4.m28901k4("sp").m29542x1();
        C0894dc.m5041k4(autoShape, dm6Var, sdpVar, c14786xh);
        com.aspose.slides.internal.p332p7.dm6 dm6Var2 = (com.aspose.slides.internal.p332p7.dm6) c7639f6.m31641x1().m43855k4("sp").m29542x1();
        if (autoShape.m2581um() == null || (autoShape.m288x1() != null && autoShape.m288x1().m2905dy())) {
            autoShape.m286m9();
        }
        C0894dc.m5041k4((IAutoShape) autoShape.m2581um(), dm6Var2, sdpVar, c14786xh);
        com.aspose.slides.internal.p332p7.fbr fbrVarM32910dy = dm6Var.mo30435k4().mo30407kk().m32910dy();
        if (fbrVarM32910dy == null || fbrVarM32910dy.m31725to() == null || dm6Var2.mo30435k4().mo30407kk().m32910dy() != null) {
            return;
        }
        dm6Var2.mo30435k4().mo30407kk().m32920x1().m31726x1().m44277k4(fbrVarM32910dy.m31725to().m44276k4());
    }
}
