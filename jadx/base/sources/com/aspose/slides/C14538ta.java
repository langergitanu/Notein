package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.ta */
/* JADX INFO: loaded from: classes3.dex */
class C14538ta {
    /* JADX INFO: renamed from: k4 */
    private static void m71043k4(int i, GradientFormat gradientFormat) {
        Dictionary<Integer, Byte> dictionary = q9u.f48272to;
        if (!dictionary.containsKey(Integer.valueOf(i))) {
            throw new ArgumentOutOfRangeException();
        }
        gradientFormat.setGradientShape(dictionary.get_Item(Integer.valueOf(i)).byteValue());
    }

    /* JADX INFO: renamed from: k4 */
    public static void m71044k4(GradientFormat gradientFormat, String str, String str2, wxb wxbVar) {
        if (gradientFormat == null) {
            throw new ArgumentNullException("gradientFormat");
        }
        if (wgi.m72731kk(str) && wxbVar.m72960x1().m69240h4().containsKey(str)) {
            com.aspose.slides.internal.p332p7.fp3 fp3Var = wxbVar.m72960x1().m69240h4().get_Item(str);
            com.aspose.slides.internal.p332p7.rrr rrrVar = C14113y2.m67411k4(str2) ? null : wxbVar.m72960x1().m69244m9().get_Item(str2);
            m71043k4(fp3Var.m31975x1(), gradientFormat);
            m71046k4(fp3Var, rrrVar, gradientFormat);
            gradientFormat.setLinearGradientAngle(C14116yg.m67480k4((wgi.m72709k4(fp3Var.m31958du(), 0.0f) / 10.0f) - 270.0f));
            gradientFormat.setLinearGradientScaled((byte) 1);
            m71045k4(fp3Var, gradientFormat);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m71045k4(com.aspose.slides.internal.p332p7.fp3 fp3Var, GradientFormat gradientFormat) {
        int iM72737to = wgi.m72737to(fp3Var.m31969kk());
        int iM72737to2 = wgi.m72737to(fp3Var.m31973to());
        if (iM72737to == 100 && iM72737to2 == 100) {
            return;
        }
        if (iM72737to >= 40 && iM72737to2 <= 60) {
            gradientFormat.setGradientDirection(4);
        }
        if (iM72737to < 40 && iM72737to2 < 50) {
            gradientFormat.setGradientDirection(0);
        }
        if (iM72737to < 40 && iM72737to2 > 50) {
            gradientFormat.setGradientDirection(2);
        }
        if (iM72737to > 60 && iM72737to2 <= 50) {
            gradientFormat.setGradientDirection(1);
        }
        if (iM72737to <= 60 || iM72737to2 < 50) {
            return;
        }
        gradientFormat.setGradientDirection(3);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m71046k4(com.aspose.slides.internal.p332p7.fp3 fp3Var, com.aspose.slides.internal.p332p7.rrr rrrVar, GradientFormat gradientFormat) {
        int iM72737to = !C14113y2.m67411k4(fp3Var.m31962h4()) ? wgi.m72737to(fp3Var.m31962h4()) : 0;
        C12003du c12003duClone = wgi.m72698ck(fp3Var.m31971m9()).Clone();
        C12003du c12003duClone2 = wgi.m72698ck(fp3Var.m31960dy()).Clone();
        String strM31956c5 = fp3Var.m31956c5();
        String strM31964jd = fp3Var.m31964jd();
        if (rrrVar != null && wgi.m72731kk(rrrVar.m40213x1())) {
            strM31956c5 = rrrVar.m40213x1();
        }
        if (rrrVar != null && wgi.m72731kk(rrrVar.m40210kk())) {
            strM31964jd = rrrVar.m40210kk();
        }
        int iM72710k4 = wgi.m72710k4(strM31956c5, 100);
        if (iM72710k4 < 100 && iM72710k4 >= 0) {
            wgi.m72714k4(c12003duClone.Clone(), iM72710k4).CloneTo(c12003duClone);
        }
        int iM72710k42 = wgi.m72710k4(strM31964jd, 100);
        if (iM72710k42 < 100 && iM72710k42 >= 0) {
            wgi.m72714k4(c12003duClone2.Clone(), iM72710k42).CloneTo(c12003duClone2);
        }
        if (fp3Var.m31975x1() != 2) {
            ((GradientStopCollection) gradientFormat.getGradientStops()).m1625k4(0.0f, c12003duClone2.Clone());
            ((GradientStopCollection) gradientFormat.getGradientStops()).m1625k4(1.0f - (iM72737to / 100.0f), c12003duClone.Clone());
        } else {
            float f = (iM72737to / 100.0f) / 2.0f;
            ((GradientStopCollection) gradientFormat.getGradientStops()).m1625k4(f, c12003duClone2.Clone());
            ((GradientStopCollection) gradientFormat.getGradientStops()).m1625k4(0.5f, c12003duClone.Clone());
            ((GradientStopCollection) gradientFormat.getGradientStops()).m1625k4(1.0f - f, c12003duClone2.Clone());
        }
    }
}
