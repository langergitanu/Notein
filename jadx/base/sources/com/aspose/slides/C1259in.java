package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.words.ControlChar;

/* JADX INFO: renamed from: com.aspose.slides.in */
/* JADX INFO: loaded from: classes3.dex */
class C1259in {
    /* JADX INFO: renamed from: k4 */
    private static int m7726k4(String str) {
        int i = 0;
        while (true) {
            String[] strArr = jdt.f45472k4;
            if (i >= strArr.length) {
                return -1;
            }
            if (C14113y2.m67363du(strArr[i], str)) {
                return jdt.f45473x1[i];
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static AutoShape m7727k4(String str, IShapeCollection iShapeCollection, C12007ix c12007ix) {
        int iM7726k4 = m7726k4(str);
        if (iM7726k4 == -1) {
            return null;
        }
        AutoShape autoShape = (AutoShape) iShapeCollection.addAutoShape(iM7726k4, c12007ix.m56557jd(), c12007ix.m56551ck(), c12007ix.m56550c5(), c12007ix.m56575x1(), true);
        autoShape.getLineFormat().setWidth(0.5d);
        autoShape.getLineFormat().setDashStyle((byte) 0);
        return autoShape;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0203  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Shape m7728k4(ShapeCollection shapeCollection, com.aspose.slides.internal.p332p7.h7e h7eVar, wxb wxbVar) {
        AutoShape autoShape;
        float fM56557jd;
        float fM56551ck;
        ShapeCollection shapeCollection2;
        float fM56550c5;
        float fM56575x1;
        boolean z;
        int i;
        String strM68028x1;
        int i2;
        if (shapeCollection == null) {
            throw new ArgumentNullException("shapes");
        }
        if (h7eVar == null) {
            throw new ArgumentNullException("customShapeElementData");
        }
        if (h7eVar.m33203yj() == null) {
            return null;
        }
        nh5 nh5Var = new nh5(h7eVar);
        C12007ix c12007ixClone = wgi.m72716k4(h7eVar.m33201x1(), h7eVar.m33194kk(), h7eVar.m33198to(), h7eVar.m33184du()).Clone();
        if (h7eVar.m33203yj().m43412ck()) {
            AutoShape autoShape2 = (AutoShape) shapeCollection.addAutoShape(5, c12007ixClone.m56557jd(), c12007ixClone.m56551ck(), c12007ixClone.m56550c5(), c12007ixClone.m56575x1(), false);
            yup.m74101k4((TextFrame) autoShape2.addTextFrame(""), wxbVar);
            yup.m74099k4((TextFrame) autoShape2.getTextFrame(), nh5Var, wxbVar);
            ((TextFrameFormat) autoShape2.getTextFrame().getTextFrameFormat()).m2944dy().m64092k4((byte) 1);
            mxr.m67790k4((TextFrame) autoShape2.getTextFrame(), nh5Var, h7eVar.m33200up(), wxbVar, gga.m6641x1());
            if (wgi.m72731kk(h7eVar.m33186dy())) {
                wr8.m72897k4(autoShape2.getTextFrame().getParagraphs(), nh5Var.m68028x1(), wxbVar);
            }
            return autoShape2;
        }
        if ("ellipse".equals(h7eVar.m33203yj().m43426x1())) {
            fM56557jd = c12007ixClone.m56557jd();
            fM56551ck = c12007ixClone.m56551ck();
            shapeCollection2 = shapeCollection;
            fM56550c5 = c12007ixClone.m56550c5();
            fM56575x1 = c12007ixClone.m56575x1();
            z = true;
            i = 35;
        } else {
            if (!"ooxml-rect".equals(h7eVar.m33203yj().m43426x1())) {
                AutoShape autoShapeM7727k4 = C14113y2.m67363du("trapezoid", h7eVar.m33203yj().m43426x1()) ? null : m7727k4(h7eVar.m33203yj().m43422m9(), shapeCollection, c12007ixClone.Clone());
                if (autoShapeM7727k4 == null) {
                    autoShape = (AutoShape) shapeCollection.addAutoShape(0, c12007ixClone.m56557jd(), c12007ixClone.m56551ck(), c12007ixClone.m56550c5(), c12007ixClone.m56575x1(), true);
                    autoShape.m1591yj().m3317k4(0);
                    try {
                        C13779lj.m64402k4(autoShape.m1591yj(), c12007ixClone.Clone(), h7eVar.m33203yj());
                    } catch (RuntimeException unused) {
                        wxbVar.m72957k4().m69954k4("Geometry adjustments parse failed", 1);
                    }
                } else {
                    autoShape = autoShapeM7727k4;
                }
                if (h7eVar.m33203yj().m43424to() || h7eVar.m33203yj().m43413du()) {
                    nd1 nd1VarMo1214P_ = autoShape.mo1214P_();
                    boolean zM43413du = h7eVar.m33203yj().m43413du();
                    boolean zM43424to = h7eVar.m33203yj().m43424to();
                    nd1VarMo1214P_.m67987k4(nd1VarMo1214P_.m67982k4().Clone());
                    autoShape.mo1650kk(autoShape.m2575sv().Clone());
                    nd1VarMo1214P_.m67985k4(nd1VarMo1214P_.m67988kk(), zM43413du ? (byte) 1 : (byte) 0, zM43424to ? (byte) 1 : (byte) 0);
                }
                if (wgi.m72731kk(h7eVar.m33203yj().m43415fa()) && autoShape.getShapeType() > 0) {
                    f6b.m5911k4(autoShape.m1591yj().m3334x1(), autoShape.getShapeType(), m7729k4(h7eVar.m33203yj().m43415fa(), 10000), autoShape.getRawFrame().getWidth(), autoShape.getRawFrame().getHeight());
                }
                if (wgi.m72731kk(h7eVar.m33183ck())) {
                    autoShape.setName(h7eVar.m33183ck());
                }
                yup.m74101k4((TextFrame) autoShape.getTextFrame(), wxbVar);
                gga ggaVarM6641x1 = gga.m6641x1();
                if (wgi.m72731kk(nh5Var.m68026k4())) {
                    if (wgi.m72731kk(nh5Var.m68028x1())) {
                        strM68028x1 = nh5Var.m68028x1();
                        i2 = 9;
                    }
                    mxr.m67790k4((TextFrame) autoShape.getTextFrame(), nh5Var, h7eVar.m33200up(), wxbVar, ggaVarM6641x1);
                    mxr.m67783k4(autoShape, h7eVar.m33186dy(), wxbVar);
                    mxr.m67783k4(autoShape, h7eVar.m33182c5(), wxbVar);
                    mxr.m67784k4((IShape) autoShape, h7eVar.m33196m9(), wxbVar);
                    return autoShape;
                }
                strM68028x1 = nh5Var.m68026k4();
                i2 = 10;
                ggaVarM6641x1 = gga.m6640k4(strM68028x1, i2);
                mxr.m67790k4((TextFrame) autoShape.getTextFrame(), nh5Var, h7eVar.m33200up(), wxbVar, ggaVarM6641x1);
                mxr.m67783k4(autoShape, h7eVar.m33186dy(), wxbVar);
                mxr.m67783k4(autoShape, h7eVar.m33182c5(), wxbVar);
                mxr.m67784k4((IShape) autoShape, h7eVar.m33196m9(), wxbVar);
                return autoShape;
            }
            fM56557jd = c12007ixClone.m56557jd();
            fM56551ck = c12007ixClone.m56551ck();
            shapeCollection2 = shapeCollection;
            fM56550c5 = c12007ixClone.m56550c5();
            fM56575x1 = c12007ixClone.m56575x1();
            z = true;
            i = 5;
        }
        autoShape = (AutoShape) shapeCollection2.addAutoShape(i, fM56557jd, fM56551ck, fM56550c5, fM56575x1, z);
        if (wgi.m72731kk(h7eVar.m33183ck())) {
        }
        yup.m74101k4((TextFrame) autoShape.getTextFrame(), wxbVar);
        gga ggaVarM6641x12 = gga.m6641x1();
        if (wgi.m72731kk(nh5Var.m68026k4())) {
        }
        ggaVarM6641x12 = gga.m6640k4(strM68028x1, i2);
        mxr.m67790k4((TextFrame) autoShape.getTextFrame(), nh5Var, h7eVar.m33200up(), wxbVar, ggaVarM6641x12);
        mxr.m67783k4(autoShape, h7eVar.m33186dy(), wxbVar);
        mxr.m67783k4(autoShape, h7eVar.m33182c5(), wxbVar);
        mxr.m67784k4((IShape) autoShape, h7eVar.m33196m9(), wxbVar);
        return autoShape;
    }

    /* JADX INFO: renamed from: k4 */
    private static int[] m7729k4(String str, int i) {
        if (C14113y2.m67411k4(str)) {
            return new int[0];
        }
        String[] strArrM67414k4 = C14113y2.m67414k4(C14113y2.m67440x1(str), ControlChar.SPACE_CHAR);
        int length = strArrM67414k4.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            float[] fArr = {0.0f};
            boolean z = !C14113y2.m67411k4(strArrM67414k4[i2]) && C14064he.m66714k4(strArrM67414k4[i2], fArr);
            float f = fArr[0];
            if (z) {
                iArr[i2] = C7019kk.m27462to(Float.valueOf(f), 13);
            } else {
                iArr[i2] = i;
            }
        }
        return iArr;
    }
}
