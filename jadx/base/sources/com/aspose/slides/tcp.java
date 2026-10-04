package com.aspose.slides;

import androidx.core.app.FrameMetricsAggregator;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p407st.AbstractC10739yw;
import com.aspose.slides.internal.p407st.C10462h9;
import com.aspose.slides.internal.p407st.C10480ii;
import com.aspose.slides.internal.p407st.C10534m3;
import com.aspose.slides.internal.p407st.C10609qn;
import com.aspose.slides.internal.p407st.C10736yo;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: loaded from: classes3.dex */
class tcp {
    /* JADX INFO: renamed from: k4 */
    private static Object m71096k4(C10534m3 c10534m3, C10534m3 c10534m32, int i) {
        AbstractC10739yw abstractC10739ywM50923k4 = c10534m3 != null ? c10534m3.m51263x1().m50923k4(i) : null;
        return (abstractC10739ywM50923k4 != null || c10534m32 == null) ? abstractC10739ywM50923k4 : c10534m32.m51263x1().m50923k4(i);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m71097k4(ILineFormat iLineFormat, byte b, boolean z, ri7 ri7Var) {
        ko5.m64088k4(iLineFormat.getFillFormat(), ri7Var);
        C10534m3 c10534m3Mo50859du = ri7Var.m70140fa().mo50859du();
        C10462h9 c10462h9 = ri7Var.m70147rv() != null ? (C10462h9) ri7Var.m70147rv().m69489kk() : null;
        C10534m3 c10534m3Mo50859du2 = c10462h9 != null ? c10462h9.mo50859du() : null;
        C10736yo c10736yo = c10534m3Mo50859du != null ? (C10736yo) c10534m3Mo50859du.m51263x1().m50923k4(FrameMetricsAggregator.EVERY_DURATION) : null;
        if (c10736yo == null) {
            c10736yo = new C10736yo();
        }
        C10609qn c10609qn = (C10609qn) C7019kk.m27452k4(m71096k4(c10534m3Mo50859du, c10534m3Mo50859du2, 462), C10609qn.class);
        iLineFormat.setDashStyle((c10609qn == null || (c10609qn.m51597ar() & 4294967295L) >= 11) ? (byte) -1 : f6b.m5854du((int) c10609qn.m51597ar()));
        iLineFormat.setWidth(((C10609qn) C7019kk.m27452k4(m71096k4(c10534m3Mo50859du, c10534m3Mo50859du2, 459), C10609qn.class)) != null ? (r3.m51597ar() & 4294967295L) / 12700.0d : Double.NaN);
        iLineFormat.setCapStyle(((C10609qn) C7019kk.m27452k4(m71096k4(c10534m3Mo50859du, c10534m3Mo50859du2, 471), C10609qn.class)) != null ? (byte) r3.m51597ar() : (byte) -1);
        iLineFormat.setStyle(((C10609qn) C7019kk.m27452k4(m71096k4(c10534m3Mo50859du, c10534m3Mo50859du2, 461), C10609qn.class)) != null ? (byte) r3.m51597ar() : (byte) -1);
        if (z) {
            byte style = iLineFormat.getStyle();
            if (style == 2) {
                iLineFormat.setStyle((byte) 3);
            } else if (style == 3) {
                iLineFormat.setStyle((byte) 2);
            }
        }
        iLineFormat.setAlignment((c10736yo.m52087dy() && c10736yo.m52082c5()) ? (byte) 1 : (byte) -1);
        iLineFormat.setMiterLimit(((C10609qn) C7019kk.m27452k4(m71096k4(c10534m3Mo50859du, c10534m3Mo50859du2, 460), C10609qn.class)) != null ? (r14.m51597ar() & 4294967295L) / 65536.0f : 8.0f);
        C10609qn c10609qn2 = (C10609qn) C7019kk.m27452k4(m71096k4(c10534m3Mo50859du, c10534m3Mo50859du2, 470), C10609qn.class);
        if (c10609qn2 != null && (4294967295L & c10609qn2.m51597ar()) < 3) {
            b = f6b.m5879h4((int) c10609qn2.m51597ar());
        }
        iLineFormat.setJoinStyle(b);
        boolean z2 = false;
        if (ri7Var.m70151wl() == 3) {
            int iM3308ck = ((AutoShape) ri7Var.m70148u4()).m1591yj().m3308ck();
            z2 = iM3308ck >= 105 && iM3308ck <= 116;
        }
        iLineFormat.setBeginArrowheadStyle(((C10609qn) C7019kk.m27452k4(m71096k4(c10534m3Mo50859du, c10534m3Mo50859du2, !z2 ? 464 : 465), C10609qn.class)) == null ? (byte) -1 : (byte) r2.m51597ar());
        iLineFormat.setEndArrowheadStyle(((C10609qn) C7019kk.m27452k4(m71096k4(c10534m3Mo50859du, c10534m3Mo50859du2, z2 ? 464 : 465), C10609qn.class)) == null ? (byte) -1 : (byte) r13.m51597ar());
        iLineFormat.setBeginArrowheadWidth(((C10609qn) C7019kk.m27452k4(m71096k4(c10534m3Mo50859du, c10534m3Mo50859du2, !z2 ? 466 : 468), C10609qn.class)) == null ? (byte) -1 : (byte) r2.m51597ar());
        iLineFormat.setBeginArrowheadLength(((C10609qn) C7019kk.m27452k4(m71096k4(c10534m3Mo50859du, c10534m3Mo50859du2, !z2 ? 467 : 469), C10609qn.class)) == null ? (byte) -1 : (byte) r5.m51597ar());
        iLineFormat.setEndArrowheadWidth(((C10609qn) C7019kk.m27452k4(m71096k4(c10534m3Mo50859du, c10534m3Mo50859du2, z2 ? 466 : 468), C10609qn.class)) == null ? (byte) -1 : (byte) r13.m51597ar());
        iLineFormat.setEndArrowheadLength(((C10609qn) C7019kk.m27452k4(m71096k4(c10534m3Mo50859du, c10534m3Mo50859du2, z2 ? 467 : 469), C10609qn.class)) != null ? (byte) r13.m51597ar() : (byte) -1);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m71098k4(ILineFormat iLineFormat, C10462h9 c10462h9, byte b, y2n y2nVar) {
        C10480ii c10480iiM51263x1 = c10462h9.mo50859du().m51263x1();
        C10736yo c10736yo = (C10736yo) c10480iiM51263x1.m50923k4(FrameMetricsAggregator.EVERY_DURATION);
        if (c10736yo == null) {
            c10736yo = new C10736yo();
            c10480iiM51263x1.m50930x1(c10736yo);
            c10736yo.m52093kk(true);
        }
        ko5.m64087k4(iLineFormat.getFillFormat(), c10462h9, y2nVar);
        c10480iiM51263x1.m50928kk(462);
        if (iLineFormat.getDashStyle() != -1) {
            if (iLineFormat.getDashStyle() != 11) {
                c10480iiM51263x1.m50926k4(new C10609qn(462, ((long) f6b.m5855du(iLineFormat.getDashStyle())) & 4294967295L));
            } else {
                y2nVar.m73707k4("Line format dash style LineDashStyle.Custom PPT serialization is not implemented yet.", 3);
            }
        }
        c10480iiM51263x1.m50928kk(459);
        if (!C14044b3.m66437kk(iLineFormat.getWidth()) && C14116yg.m67475k4(iLineFormat.getWidth() - 0.75d) > 1.0E-6d) {
            c10480iiM51263x1.m50926k4(new C10609qn(459, C7019kk.m27435du(Double.valueOf(iLineFormat.getWidth() * 12700.0d), 14)));
        }
        c10480iiM51263x1.m50928kk(471);
        if (iLineFormat.getCapStyle() != -1 && iLineFormat.getCapStyle() != 1) {
            c10480iiM51263x1.m50926k4(new C10609qn(471, ((long) iLineFormat.getCapStyle()) & 4294967295L));
        }
        c10480iiM51263x1.m50928kk(461);
        if (iLineFormat.getStyle() != -1 && iLineFormat.getStyle() != 0) {
            c10480iiM51263x1.m50926k4(new C10609qn(461, ((long) iLineFormat.getStyle()) & 4294967295L));
        }
        c10736yo.m52081c5(iLineFormat.getAlignment() == 1);
        c10480iiM51263x1.m50928kk(470);
        if (iLineFormat.getJoinStyle() != -1 && iLineFormat.getJoinStyle() != b) {
            c10480iiM51263x1.m50926k4(new C10609qn(470, ((long) f6b.m5880h4(iLineFormat.getJoinStyle())) & 4294967295L));
        }
        c10480iiM51263x1.m50928kk(460);
        if (!C14064he.m66715kk(iLineFormat.getMiterLimit()) && iLineFormat.getMiterLimit() != 8.0f) {
            c10480iiM51263x1.m50926k4(new C10609qn(460, C7019kk.m27435du(Float.valueOf(iLineFormat.getMiterLimit() * 65536.0f), 13)));
        }
        c10736yo.m52091jd(c10462h9.mo50864to().m52025c5() == 20 || c10462h9.mo50864to().m52025c5() == 0);
        boolean z = c10462h9.mo50864to().m52025c5() >= 41 && c10462h9.mo50864to().m52025c5() <= 52;
        c10480iiM51263x1.m50928kk(464);
        byte beginArrowheadStyle = !z ? iLineFormat.getBeginArrowheadStyle() : iLineFormat.getEndArrowheadStyle();
        if (beginArrowheadStyle != -1) {
            c10480iiM51263x1.m50926k4(new C10609qn(464, ((long) beginArrowheadStyle) & 4294967295L));
        }
        c10480iiM51263x1.m50928kk(466);
        byte beginArrowheadWidth = !z ? iLineFormat.getBeginArrowheadWidth() : iLineFormat.getEndArrowheadWidth();
        if (beginArrowheadWidth != -1) {
            c10480iiM51263x1.m50926k4(new C10609qn(466, ((long) beginArrowheadWidth) & 4294967295L));
        }
        c10480iiM51263x1.m50928kk(467);
        byte beginArrowheadLength = !z ? iLineFormat.getBeginArrowheadLength() : iLineFormat.getEndArrowheadLength();
        if (beginArrowheadLength != -1) {
            c10480iiM51263x1.m50926k4(new C10609qn(467, ((long) beginArrowheadLength) & 4294967295L));
        }
        c10480iiM51263x1.m50928kk(465);
        byte endArrowheadStyle = !z ? iLineFormat.getEndArrowheadStyle() : iLineFormat.getBeginArrowheadStyle();
        if (endArrowheadStyle != -1) {
            c10480iiM51263x1.m50926k4(new C10609qn(465, ((long) endArrowheadStyle) & 4294967295L));
        }
        c10480iiM51263x1.m50928kk(468);
        byte endArrowheadWidth = !z ? iLineFormat.getEndArrowheadWidth() : iLineFormat.getBeginArrowheadWidth();
        if (endArrowheadWidth != -1) {
            c10480iiM51263x1.m50926k4(new C10609qn(468, ((long) endArrowheadWidth) & 4294967295L));
        }
        c10480iiM51263x1.m50928kk(469);
        byte endArrowheadLength = !z ? iLineFormat.getEndArrowheadLength() : iLineFormat.getBeginArrowheadLength();
        if (endArrowheadLength != -1) {
            c10480iiM51263x1.m50926k4(new C10609qn(469, ((long) endArrowheadLength) & 4294967295L));
        }
    }
}
