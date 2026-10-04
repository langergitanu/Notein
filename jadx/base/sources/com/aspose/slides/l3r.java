package com.aspose.slides;

import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: loaded from: classes3.dex */
class l3r {
    /* JADX INFO: renamed from: k4 */
    private static String m64279k4(IShape iShape) {
        String str = C14113y2.f47374k4;
        if (iShape.getRotation() == 0.0f || iShape.getHeight() <= 1.0f || iShape.getWidth() <= 1.0f) {
            return str;
        }
        return C14113y2.m67400k4(C14113y2.m67400k4(C14113y2.m67400k4(str, C14113y2.m67408k4("translate(", wgi.m72741x1(-(iShape.getWidth() / 2.0f)), " ", wgi.m72741x1(-(iShape.getHeight() / 2.0f)), ") ")), C14113y2.m67408k4("rotate(", wgi.m72738to(C14116yg.m67477k4((((double) (iShape.getRotation() * (-1.0f))) * 3.141592653589793d) / 180.0d, 5)), ") ")), C14113y2.m67408k4("translate(", wgi.m72741x1(iShape.getFrame().getCenterX()), " ", wgi.m72741x1(iShape.getFrame().getCenterY()), ")"));
    }

    /* JADX INFO: renamed from: k4 */
    public static void m64280k4(IShape iShape, com.aspose.slides.internal.p332p7.h7e h7eVar) {
        String[] strArr = {null};
        String[] strArr2 = {null};
        String[] strArr3 = {null};
        String[] strArr4 = {null};
        wgi.m72722k4(iShape, strArr, strArr2, strArr3, strArr4);
        String str = strArr[0];
        String str2 = strArr2[0];
        String str3 = strArr3[0];
        String str4 = strArr4[0];
        h7eVar.m33199to(str3);
        h7eVar.m33185du(str4);
        String strM64279k4 = m64279k4(iShape);
        if (!C14113y2.m67411k4(strM64279k4)) {
            h7eVar.m33197m9(strM64279k4);
        } else {
            h7eVar.m33202x1(str);
            h7eVar.m33195kk(str2);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m64281k4(IShape iShape, com.aspose.slides.internal.p332p7.sd3 sd3Var) {
        String[] strArr = {null};
        String[] strArr2 = {null};
        String[] strArr3 = {null};
        String[] strArr4 = {null};
        wgi.m72722k4(iShape, strArr, strArr2, strArr3, strArr4);
        String str = strArr[0];
        String str2 = strArr2[0];
        String str3 = strArr3[0];
        String str4 = strArr4[0];
        sd3Var.m40957to(str3);
        sd3Var.m40945du(str4);
        String strM64279k4 = m64279k4(iShape);
        if (!C14113y2.m67411k4(strM64279k4)) {
            sd3Var.m40955m9(strM64279k4);
        } else {
            sd3Var.m40959x1(str);
            sd3Var.m40953kk(str2);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m64282k4(IShape iShape, com.aspose.slides.internal.p332p7.vtn vtnVar) {
        String[] strArr = {null};
        String[] strArr2 = {null};
        String[] strArr3 = {null};
        String[] strArr4 = {null};
        wgi.m72722k4(iShape, strArr, strArr2, strArr3, strArr4);
        String str = strArr[0];
        String str2 = strArr2[0];
        String str3 = strArr3[0];
        String str4 = strArr4[0];
        vtnVar.m43292dy(str3);
        vtnVar.m43287c5(str4);
        String strM64279k4 = m64279k4(iShape);
        if (!C14113y2.m67411k4(strM64279k4)) {
            vtnVar.m43306to(strM64279k4);
        } else {
            vtnVar.m43295h4(str);
            vtnVar.m43304m9(str2);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m64283k4(IShape iShape, com.aspose.slides.internal.p332p7.yxk yxkVar) {
        String[] strArr = {null};
        String[] strArr2 = {null};
        String[] strArr3 = {null};
        String[] strArr4 = {null};
        wgi.m72722k4(iShape, strArr, strArr2, strArr3, strArr4);
        String str = strArr[0];
        String str2 = strArr2[0];
        String str3 = strArr3[0];
        String str4 = strArr4[0];
        yxkVar.m45262to(str3);
        yxkVar.m45250du(str4);
        String strM64279k4 = m64279k4(iShape);
        if (!C14113y2.m67411k4(strM64279k4)) {
            yxkVar.m45260m9(strM64279k4);
        } else {
            yxkVar.m45264x1(str);
            yxkVar.m45258kk(str2);
        }
    }
}
