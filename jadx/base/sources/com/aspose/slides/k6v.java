package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.p559ms.System.C14044b3;

/* JADX INFO: loaded from: classes3.dex */
class k6v {
    /* JADX WARN: Removed duplicated region for block: B:29:0x0071 A[PHI: r0
      0x0071: PHI (r0v5 byte) = (r0v4 byte), (r0v4 byte), (r0v6 byte) binds: [B:32:0x007d, B:18:0x005a, B:21:0x005f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m63656k4(ITextFrameFormat iTextFrameFormat, com.aspose.slides.internal.p332p7.mdp mdpVar, wxb wxbVar) {
        if (iTextFrameFormat == null) {
            throw new ArgumentNullException("textFrameFormat");
        }
        if (mdpVar == null) {
            throw new ArgumentNullException("paragraphProperties");
        }
        if (!C14044b3.m66437kk(wgi.m72703h4(mdpVar.m36877ks()))) {
            iTextFrameFormat.setMarginBottom((float) r0);
        }
        if (!C14044b3.m66437kk(wgi.m72703h4(mdpVar.m36891yj()))) {
            iTextFrameFormat.setMarginTop((float) r0);
        }
        if (!C14044b3.m66437kk(wgi.m72703h4(mdpVar.m36881rv()))) {
            iTextFrameFormat.setMarginLeft((float) r0);
        }
        if (!C14044b3.m66437kk(wgi.m72703h4(mdpVar.m36890x6()))) {
            iTextFrameFormat.setMarginRight((float) r0);
        }
        int iM36867ix = mdpVar.m36867ix();
        byte b = 0;
        if (iM36867ix != 0) {
            if (iM36867ix != 1) {
                b = 2;
                if (iM36867ix == 2) {
                    iTextFrameFormat.setAnchoringType((byte) 1);
                } else if (iM36867ix == 3) {
                    iTextFrameFormat.setAnchoringType(b);
                } else {
                    if (iM36867ix != 4 && iM36867ix != 5) {
                        throw new ArgumentOutOfRangeException();
                    }
                    iTextFrameFormat.setAnchoringType((byte) -1);
                }
            }
        } else if (iTextFrameFormat.getAnchoringType() == -1) {
        }
        if (mdpVar.m36885u4() == 3) {
            iTextFrameFormat.setTextVerticalType((byte) 1);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m63657k4(ITextFrameFormat iTextFrameFormat, com.aspose.slides.internal.p332p7.rsv rsvVar, wxb wxbVar) {
        if (iTextFrameFormat == null) {
            throw new ArgumentNullException("textFrameFormat");
        }
        if (rsvVar == null) {
            throw new ArgumentNullException("graphicProperties");
        }
        byte b = 0;
        iTextFrameFormat.setCenterText((byte) 0);
        int iM40468fa = rsvVar.m40468fa();
        if (iM40468fa != 0) {
            byte b2 = 1;
            if (iM40468fa != 1) {
                b = 2;
                if (iM40468fa != 2) {
                    b2 = 3;
                    if (iM40468fa != 3) {
                        if (iM40468fa != 4) {
                            throw new ArgumentOutOfRangeException();
                        }
                    }
                    iTextFrameFormat.setAnchoringType(b);
                }
                iTextFrameFormat.setAnchoringType(b2);
            } else {
                iTextFrameFormat.setAnchoringType(b);
            }
        }
        if (wgi.m72731kk(rsvVar.m40451bv())) {
            iTextFrameFormat.setMarginLeft(wgi.m72703h4(rsvVar.m40451bv()));
        }
        if (wgi.m72731kk(rsvVar.m40510v4())) {
            iTextFrameFormat.setMarginRight(wgi.m72703h4(rsvVar.m40510v4()));
        }
        if (wgi.m72731kk(rsvVar.m40447ar())) {
            iTextFrameFormat.setMarginTop(wgi.m72703h4(rsvVar.m40447ar()));
        }
        if (wgi.m72731kk(rsvVar.m40504um())) {
            iTextFrameFormat.setMarginBottom(wgi.m72703h4(rsvVar.m40504um()));
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m63658k4(ParagraphFormat paragraphFormat, com.aspose.slides.internal.p332p7.mdp mdpVar) {
        int i;
        switch (mdpVar.m36874kk()) {
            case 0:
                return;
            case 1:
                paragraphFormat.setAlignment(0);
                return;
            case 2:
                paragraphFormat.setAlignment(2);
                return;
            case 3:
                paragraphFormat.setAlignment(0);
                return;
            case 4:
                paragraphFormat.setAlignment(2);
                return;
            case 5:
                i = 1;
                break;
            case 6:
                i = 3;
                break;
            default:
                throw new ArgumentOutOfRangeException();
        }
        paragraphFormat.setAlignment(i);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m63659k4(ParagraphFormat paragraphFormat, com.aspose.slides.internal.p332p7.mdp mdpVar, wxb wxbVar) {
        if (paragraphFormat == null) {
            throw new ArgumentNullException("paragraphFormat");
        }
        if (mdpVar == null) {
            throw new ArgumentNullException("paragraphProperties");
        }
        if (mdpVar.m36867ix() == 2) {
            paragraphFormat.setAlignment(1);
        }
        if (mdpVar.m36880ne() == 2) {
            paragraphFormat.setHangingPunctuation((byte) 1);
        }
        m63658k4(paragraphFormat, mdpVar);
        double dM72703h4 = wgi.m72703h4(mdpVar.m36882to());
        if (!C14044b3.m66437kk(dM72703h4)) {
            paragraphFormat.setMarginLeft((float) dM72703h4);
        }
        double dM72703h42 = wgi.m72703h4(mdpVar.m36859du());
        if (!C14044b3.m66437kk(dM72703h42)) {
            paragraphFormat.setMarginRight((float) dM72703h42);
        }
        double dM72733m9 = wgi.m72733m9(mdpVar.m36878m9());
        if (!C14044b3.m66437kk(dM72733m9)) {
            paragraphFormat.setSpaceBefore((float) dM72733m9);
        }
        double dM72733m92 = wgi.m72733m9(mdpVar.m36861dy());
        if (!C14044b3.m66437kk(dM72733m92)) {
            paragraphFormat.setSpaceAfter((float) dM72733m92);
        }
        double dM72703h43 = wgi.m72703h4(mdpVar.m36865h4());
        if (!C14044b3.m66437kk(dM72703h43)) {
            paragraphFormat.setIndent((float) dM72703h43);
        }
        double dM72733m93 = wgi.m72733m9(mdpVar.m36871k4());
        if (C14044b3.m66437kk(dM72733m93)) {
            return;
        }
        paragraphFormat.setSpaceWithin((float) dM72733m93);
    }
}
