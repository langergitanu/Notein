package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.jy */
/* JADX INFO: loaded from: classes3.dex */
class C13706jy {
    /* JADX INFO: renamed from: k4 */
    public static void m63566k4(IFillFormat iFillFormat, com.aspose.slides.internal.p332p7.nk7 nk7Var, wxb wxbVar) {
        if (iFillFormat == null) {
            throw new ArgumentNullException("fillFormat");
        }
        if (nk7Var == null) {
            throw new ArgumentNullException("pagePropertiesContent");
        }
        int iM37642k4 = nk7Var.m37642k4();
        if (iM37642k4 == 2) {
            m63569k4(iFillFormat, nk7Var.m37659x1(), nk7Var.m37631ck());
            return;
        }
        if (iM37642k4 != 3) {
            if (iM37642k4 != 4) {
                return;
            }
            iFillFormat.setFillType((byte) 2);
            iFillFormat.setRotateWithShape((byte) 0);
            C14538ta.m71044k4((GradientFormat) iFillFormat.getGradientFormat(), nk7Var.m37646kk(), nk7Var.m37637fa(), wxbVar);
            return;
        }
        if (wgi.m72731kk(nk7Var.m37654to())) {
            iFillFormat.setFillType((byte) 4);
            ssy.m70767k4((PictureFillFormat) iFillFormat.getPictureFillFormat(), new kia(nk7Var), wxbVar);
        } else if (C14113y2.m67363du(nk7Var.m37654to(), C14113y2.f47374k4)) {
            iFillFormat.setFillType((byte) 0);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m63567k4(IFillFormat iFillFormat, com.aspose.slides.internal.p332p7.rsv rsvVar, wxb wxbVar) {
        if (iFillFormat == null) {
            throw new ArgumentNullException("fillFormat");
        }
        if (rsvVar == null) {
            throw new ArgumentNullException("graphicProperties");
        }
        int iM40449b3 = rsvVar.m40449b3();
        if (iM40449b3 == 0) {
            if (wgi.m72731kk(rsvVar.m40515wy())) {
                if (iFillFormat.getFillType() == 1 || iFillFormat.getFillType() == -1) {
                    m63569k4(iFillFormat, rsvVar.m40515wy(), rsvVar.m40497sv());
                    return;
                }
                return;
            }
            return;
        }
        if (iM40449b3 == 1) {
            iFillFormat.setFillType((byte) 0);
            return;
        }
        if (iM40449b3 == 2) {
            m63569k4(iFillFormat, rsvVar.m40515wy(), rsvVar.m40497sv());
            return;
        }
        if (iM40449b3 == 3) {
            iFillFormat.setFillType((byte) 4);
            iFillFormat.setRotateWithShape((byte) 0);
            ssy.m70767k4((PictureFillFormat) iFillFormat.getPictureFillFormat(), new kia(rsvVar), wxbVar);
        } else {
            if (iM40449b3 != 4) {
                if (iM40449b3 != 5) {
                    throw new ArgumentOutOfRangeException();
                }
                iFillFormat.setFillType((byte) 3);
                wx1.m72953k4((PatternFormat) iFillFormat.getPatternFormat(), rsvVar, wxbVar);
                return;
            }
            if (wgi.m72731kk(rsvVar.m40445ak())) {
                iFillFormat.setFillType((byte) 2);
                iFillFormat.setRotateWithShape((byte) 0);
                C14538ta.m71044k4((GradientFormat) iFillFormat.getGradientFormat(), rsvVar.m40445ak(), rsvVar.m40514wp(), wxbVar);
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m63568k4(IFillFormat iFillFormat, com.aspose.slides.internal.p332p7.v9h v9hVar, wxb wxbVar) {
        if (iFillFormat == null) {
            throw new ArgumentNullException("fillFormat");
        }
        if (v9hVar == null) {
            throw new ArgumentNullException("tableCellPropertiesContent");
        }
        if (wgi.m72731kk(v9hVar.m42815x1())) {
            m63569k4(iFillFormat, v9hVar.m42815x1(), (String) null);
        } else {
            if (v9hVar.m42802fa() == null || !wgi.m72731kk(v9hVar.m42802fa().m32005x1())) {
                return;
            }
            iFillFormat.setFillType((byte) 4);
            iFillFormat.setRotateWithShape((byte) 0);
            ssy.m70766k4((PictureFillFormat) iFillFormat.getPictureFillFormat(), v9hVar.m42802fa(), wxbVar);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m63569k4(IFillFormat iFillFormat, String str, String str2) {
        int iM72737to;
        iFillFormat.setFillType((byte) 1);
        ((ColorFormat) iFillFormat.getSolidFillColor()).m1080k4(wgi.m72698ck(str).Clone());
        if (!wgi.m72731kk(str2) || (iM72737to = wgi.m72737to(str2)) >= 100 || iM72737to < 0) {
            return;
        }
        iFillFormat.getSolidFillColor().getColorTransform().add(5, iM72737to / 100.0f);
    }
}
