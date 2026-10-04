package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;

/* JADX INFO: loaded from: classes3.dex */
class wx1 {
    /* JADX INFO: renamed from: k4 */
    private static void m72952k4(PatternFormat patternFormat, com.aspose.slides.internal.p332p7.rmh rmhVar) {
        byte b;
        int iM40071du = rmhVar.m40071du();
        double dM72703h4 = wgi.m72703h4(rmhVar.m40074to());
        if (rmhVar.m40075x1() != 1) {
            b = iM40071du == 900 ? dM72703h4 < 25.0d ? PatternStyle.Cross : (byte) 34 : PatternStyle.DiagonalCross;
        } else if (iM40071du == 0 || iM40071du == 3600) {
            b = dM72703h4 < 25.0d ? (byte) 19 : PatternStyle.Horizontal;
        } else if (iM40071du == 900) {
            b = dM72703h4 < 25.0d ? (byte) 20 : PatternStyle.Vertical;
        } else if (iM40071du > 0 && iM40071du < 900) {
            b = 22;
        } else if (iM40071du <= 900 || iM40071du >= 3600) {
            return;
        } else {
            b = 21;
        }
        patternFormat.setPatternStyle(b);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m72953k4(PatternFormat patternFormat, com.aspose.slides.internal.p332p7.rsv rsvVar, wxb wxbVar) {
        if (patternFormat == null) {
            throw new ArgumentNullException("patternFormat");
        }
        if (rsvVar == null) {
            throw new ArgumentNullException("graphicProperties");
        }
        if (wgi.m72731kk(rsvVar.m40459dq()) && wxbVar.m72960x1().m69238dy().containsKey(rsvVar.m40459dq())) {
            com.aspose.slides.internal.p332p7.rmh rmhVar = wxbVar.m72960x1().m69238dy().get_Item(rsvVar.m40459dq());
            ((ColorFormat) patternFormat.getForeColor()).m1080k4(wgi.m72698ck(rmhVar.m40073kk()).Clone());
            patternFormat.setPatternStyle((byte) 0);
            m72952k4(patternFormat, rmhVar);
        }
    }
}
