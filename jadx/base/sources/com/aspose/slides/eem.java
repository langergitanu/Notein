package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.words.ControlChar;

/* JADX INFO: loaded from: classes3.dex */
class eem {
    /* JADX INFO: renamed from: k4 */
    public static void m5506k4(ILineFormat iLineFormat, com.aspose.slides.internal.p332p7.rsv rsvVar, wxb wxbVar) {
        int iM72737to;
        if (iLineFormat == null) {
            throw new ArgumentNullException("lineFormat");
        }
        if (rsvVar == null) {
            throw new ArgumentNullException("graphicProperties");
        }
        int iM40478k4 = rsvVar.m40478k4();
        if (iLineFormat.getDashStyle() == -1 && rsvVar.m40478k4() == 0) {
            iM40478k4 = 1;
        }
        if (wgi.m72731kk(rsvVar.m40498to())) {
            ((ColorFormat) iLineFormat.getFillFormat().getSolidFillColor()).m1080k4(wgi.m72698ck(rsvVar.m40498to()).Clone());
            if (wgi.m72731kk(rsvVar.m40454c5()) && (iM72737to = wgi.m72737to(rsvVar.m40454c5())) < 100 && iM72737to >= 0) {
                ((ColorFormat) iLineFormat.getFillFormat().getSolidFillColor()).m1080k4(wgi.m72714k4(((ColorFormat) iLineFormat.getFillFormat().getSolidFillColor()).m1084to().Clone(), iM72737to).Clone());
            }
        }
        m5509x1(iLineFormat, rsvVar, wxbVar);
        if (wgi.m72731kk(rsvVar.m40482kk())) {
            double dM72703h4 = wgi.m72703h4(rsvVar.m40482kk());
            if (!C14044b3.m66437kk(dM72703h4)) {
                iLineFormat.setWidth(dM72703h4);
            }
        }
        int iM40476jd = rsvVar.m40476jd();
        if (iM40476jd == 1) {
            iLineFormat.setJoinStyle((byte) 2);
        } else if (iM40476jd == 2) {
            iLineFormat.setJoinStyle((byte) 0);
        } else if (iM40476jd == 3) {
            iLineFormat.setJoinStyle((byte) 1);
        }
        if (iM40478k4 != 0) {
            if (iM40478k4 == 1) {
                iLineFormat.getFillFormat().setFillType((byte) 0);
            } else if (iM40478k4 == 2) {
                m5508kk(iLineFormat, rsvVar, wxbVar);
                return;
            } else {
                if (iM40478k4 != 3) {
                    throw new ArgumentOutOfRangeException();
                }
                iLineFormat.getFillFormat().setFillType((byte) 1);
            }
            iLineFormat.setDashStyle((byte) 0);
        }
    }

    /* JADX INFO: renamed from: kk */
    private static void m5508kk(ILineFormat iLineFormat, com.aspose.slides.internal.p332p7.rsv rsvVar, wxb wxbVar) {
        iLineFormat.getFillFormat().setFillType((byte) 1);
        iLineFormat.setDashStyle((byte) 11);
        com.aspose.slides.internal.p332p7.ry2[] ry2VarArr = {null};
        boolean z = (wxbVar.m72960x1().m69245to().tryGetValue(rsvVar.m40517x1(), ry2VarArr) || wxbVar.m72957k4().m69955kk().m69245to().tryGetValue(rsvVar.m40517x1(), ry2VarArr)) ? false : true;
        com.aspose.slides.internal.p332p7.ry2 ry2Var = ry2VarArr[0];
        if (z) {
            return;
        }
        double d = 1.0d;
        if (wgi.m72731kk(rsvVar.m40482kk())) {
            double dM72703h4 = wgi.m72703h4(rsvVar.m40482kk());
            if (dM72703h4 != 0.0d) {
                d = dM72703h4;
            }
        }
        double dM72737to = wgi.m72731kk(ry2Var.m40616h4()) ? wgi.m72742x1(ry2Var.m40616h4()) ? (d / 100.0d) * ((double) wgi.m72737to(ry2Var.m40616h4())) : wgi.m72703h4(ry2Var.m40616h4()) / d : 0.0d;
        double dM72737to2 = wgi.m72731kk(ry2Var.m40620kk()) ? wgi.m72742x1(ry2Var.m40620kk()) ? (d / 100.0d) * ((double) wgi.m72737to(ry2Var.m40620kk())) : wgi.m72703h4(ry2Var.m40620kk()) / d : 0.0d;
        double dM72737to3 = ry2Var.m40623to() > 0 ? wgi.m72742x1(ry2Var.m40615du()) ? (d / 100.0d) * ((double) wgi.m72737to(ry2Var.m40620kk())) : wgi.m72703h4(ry2Var.m40615du()) / d : 0.0d;
        if (dM72737to2 == 0.0d && dM72737to3 == 0.0d) {
            dM72737to3 = dM72737to;
            dM72737to2 = dM72737to3;
        } else {
            if (dM72737to2 == 0.0d) {
                dM72737to2 = dM72737to3;
            }
            if (dM72737to3 == 0.0d) {
                dM72737to3 = dM72737to2;
            }
        }
        int iM40623to = (ry2Var.m40623to() + ry2Var.m40625x1()) * 2;
        float[] fArr = new float[iM40623to];
        for (int i = 0; i < ry2Var.m40625x1() * 2; i += 2) {
            fArr[i] = (float) dM72737to2;
            fArr[i + 1] = (float) dM72737to;
        }
        for (int iM40625x1 = ry2Var.m40625x1() * 2; iM40625x1 < iM40623to; iM40625x1 += 2) {
            fArr[iM40625x1] = (float) dM72737to3;
            fArr[iM40625x1 + 1] = (float) dM72737to;
        }
        iLineFormat.setCustomDashPattern(fArr);
    }

    /* JADX INFO: renamed from: x1 */
    private static void m5509x1(ILineFormat iLineFormat, com.aspose.slides.internal.p332p7.rsv rsvVar, wxb wxbVar) {
        if (wgi.m72731kk(rsvVar.m40461du()) && wxbVar.m72960x1().m69247x1().containsKey(rsvVar.m40461du())) {
            com.aspose.slides.internal.p332p7.fwr fwrVar = wxbVar.m72960x1().m69247x1().get_Item(rsvVar.m40461du());
            byte[] bArr = {0};
            byte[] bArr2 = {0};
            byte[] bArr3 = {0};
            C1142gf.m6585k4(fwrVar.m32116kk(), fwrVar.m32118x1(), wgi.m72703h4(rsvVar.m40482kk()), wgi.m72703h4(rsvVar.m40489m9()), bArr, bArr2, bArr3);
            byte b = bArr[0];
            byte b2 = bArr2[0];
            byte b3 = bArr3[0];
            iLineFormat.setBeginArrowheadStyle(b);
            iLineFormat.setBeginArrowheadLength(b2);
            iLineFormat.setBeginArrowheadWidth(b3);
        }
        if (wgi.m72731kk(rsvVar.m40471h4()) && wxbVar.m72960x1().m69247x1().containsKey(rsvVar.m40471h4())) {
            com.aspose.slides.internal.p332p7.fwr fwrVar2 = wxbVar.m72960x1().m69247x1().get_Item(rsvVar.m40471h4());
            byte[] bArr4 = {0};
            byte[] bArr5 = {0};
            byte[] bArr6 = {0};
            C1142gf.m6585k4(fwrVar2.m32116kk(), fwrVar2.m32118x1(), wgi.m72703h4(rsvVar.m40482kk()), wgi.m72703h4(rsvVar.m40464dy()), bArr4, bArr5, bArr6);
            byte b4 = bArr4[0];
            byte b5 = bArr5[0];
            byte b6 = bArr6[0];
            iLineFormat.setEndArrowheadStyle(b4);
            iLineFormat.setEndArrowheadLength(b5);
            iLineFormat.setEndArrowheadWidth(b6);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m5507k4(ILineFormat iLineFormat, String str, boolean z, wxb wxbVar) {
        if (iLineFormat == null) {
            throw new ArgumentNullException("lineFormat");
        }
        if (C14113y2.m67411k4(str)) {
            return;
        }
        if (C14113y2.m67363du("none", str)) {
            iLineFormat.getFillFormat().setFillType((byte) 0);
            return;
        }
        String[] strArrM67414k4 = C14113y2.m67414k4(str, ControlChar.SPACE_CHAR);
        for (int i = 0; i < strArrM67414k4.length; i++) {
            if (!C14113y2.m67411k4(strArrM67414k4[i])) {
                if (i == 0) {
                    double dM72703h4 = wgi.m72703h4(strArrM67414k4[i]);
                    if (!z) {
                        dM72703h4 *= 2.0d;
                    }
                    iLineFormat.setWidth(dM72703h4);
                } else if (i == 1) {
                    if (C14113y2.m67363du("solid", strArrM67414k4[i])) {
                        iLineFormat.getFillFormat().setFillType((byte) 1);
                        iLineFormat.setDashStyle((byte) 0);
                    }
                } else if (i == 2) {
                    ((ColorFormat) iLineFormat.getFillFormat().getSolidFillColor()).m1080k4(wgi.m72698ck(strArrM67414k4[i]).Clone());
                }
            }
        }
    }
}
