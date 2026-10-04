package com.aspose.slides;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p407st.C10480ii;
import com.aspose.slides.internal.p407st.C10534m3;
import com.aspose.slides.internal.p407st.C10607qk;
import com.aspose.slides.internal.p407st.C10609qn;
import com.aspose.slides.internal.p407st.C10701wz;
import com.aspose.slides.internal.p407st.C10711xc;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: loaded from: classes3.dex */
class qo7 {
    /* JADX INFO: renamed from: k4 */
    public static void m69720k4(IThreeDFormat iThreeDFormat, C10534m3 c10534m3, C10711xc c10711xc, y2n y2nVar) {
        long j;
        C10480ii c10480iiM51263x1 = c10534m3.m51263x1();
        if (iThreeDFormat == null) {
            for (int i = 640; i < 653; i++) {
                c10480iiM51263x1.m50928kk(i);
            }
            c10480iiM51263x1.m50928kk(703);
            for (int i2 = 704; i2 < 730; i2++) {
                c10480iiM51263x1.m50928kk(i2);
            }
            c10480iiM51263x1.m50928kk(767);
            return;
        }
        C10701wz c10701wz = new C10701wz();
        boolean z = true;
        c10701wz.m51958k4(true);
        c10701wz.m51961to(true);
        c10480iiM51263x1.m50930x1(c10701wz);
        c10480iiM51263x1.m50930x1(new C10607qk());
        ThreeDFormat threeDFormat = (ThreeDFormat) iThreeDFormat;
        spu spuVarM3011to = threeDFormat.m3011to();
        boolean z2 = false;
        if (threeDFormat.m3005h4() != -1 || threeDFormat.m3010m9() != -1) {
            boolean[] zArr = {false};
            C13693jn.m63445k4(iThreeDFormat.getCamera(), c10534m3, zArr, y2nVar);
            zArr[0] = zArr[0];
            pqy.m69194k4(iThreeDFormat.getLightRig(), c10534m3, zArr, y2nVar);
            z2 = zArr[0];
            C1080f7.m6026k4(spuVarM3011to.m70721kk(), c10534m3, c10711xc, y2nVar);
        }
        if (iThreeDFormat.getContourWidth() != 0.0d || iThreeDFormat.getExtrusionHeight() != 0.0d || threeDFormat.m3004dy() != -1 || threeDFormat.m3001c5() != -1) {
            if (C14116yg.m67475k4(iThreeDFormat.getBevelTop().getWidth() - 1.062992125984252d) > 1.0E-6d || C14116yg.m67475k4(iThreeDFormat.getBevelTop().getHeight() - 1.062992125984252d) > 1.0E-6d || iThreeDFormat.getBevelTop().getBevelType() != 0 || C14116yg.m67475k4(iThreeDFormat.getBevelBottom().getWidth() - 1.062992125984252d) > 1.0E-6d || C14116yg.m67475k4(iThreeDFormat.getBevelBottom().getHeight() - 1.062992125984252d) > 1.0E-6d || iThreeDFormat.getBevelBottom().getBevelType() != 0) {
                j = 4294967295L;
                y2nVar.m73707k4("Ppt serialization of the Bevel is not imlemented yet.", 2);
            } else {
                int iM27462to = C7019kk.m27462to(Double.valueOf(iThreeDFormat.getDepth() * 12700.0d), 14);
                if (iM27462to != 0) {
                    j = 4294967295L;
                    c10480iiM51263x1.m50930x1(new C10609qn(644, ((long) iM27462to) & 4294967295L));
                } else {
                    j = 4294967295L;
                }
                long jM27435du = C7019kk.m27435du(Double.valueOf((iThreeDFormat.getExtrusionHeight() * 12700.0d) + 13500.0d + 13500.0d + ((double) iM27462to)), 14) & j;
                if (jM27435du != 457200) {
                    C22225Oooo0oO.OooO0O0(645, jM27435du, c10480iiM51263x1);
                }
                z2 = true;
            }
            if (iThreeDFormat.getExtrusionColor().getColorType() != -1) {
                long jM69136k4 = C14294pm.m69136k4(iThreeDFormat.getExtrusionColor(), y2nVar) & j;
                if (jM69136k4 != 268435703) {
                    C22225Oooo0oO.OooO0O0(647, jM69136k4, c10480iiM51263x1);
                }
                c10701wz.m51959kk(true);
                c10701wz.m51957h4(true);
                z2 = true;
            }
        }
        if (iThreeDFormat.getMaterial() == -1 || iThreeDFormat.getMaterial() == 3) {
            c10480iiM51263x1.m50928kk(640);
            c10480iiM51263x1.m50928kk(641);
            c10480iiM51263x1.m50928kk(642);
            if (iThreeDFormat.getMaterial() != 3) {
                z = z2;
            }
        } else if (iThreeDFormat.getMaterial() == 5) {
            C22224Oooo0o0.OooO0O0(640, 80000L, c10480iiM51263x1, 641);
            c10480iiM51263x1.m50928kk(642);
        } else if (iThreeDFormat.getMaterial() == 4) {
            c10480iiM51263x1.m50930x1(new C10609qn(640, 80000L));
            C22224Oooo0o0.OooO0O0(641, 43712L, c10480iiM51263x1, 642);
            c10701wz.m51962x1(true);
            c10701wz.m51956du(true);
        } else if (iThreeDFormat.getMaterial() == 6) {
            c10480iiM51263x1.m50928kk(640);
            c10480iiM51263x1.m50930x1(new C10609qn(641, 0L));
            c10480iiM51263x1.m50930x1(new C10609qn(642, 0L));
            C22225Oooo0oO.OooO0O0(713, 1L, c10480iiM51263x1);
        } else {
            y2nVar.m73707k4("Ppt serialization of the non-Legacy material is not imlemented yet.", 3);
            z = z2;
        }
        if (z) {
            return;
        }
        c10480iiM51263x1.m50928kk(703);
        c10480iiM51263x1.m50928kk(767);
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0234  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m69721k4(IThreeDFormat iThreeDFormat, boolean z, ri7 ri7Var) {
        int i;
        C10534m3 c10534m3Mo50859du = ri7Var.m70140fa().mo50859du();
        Shape shape = (Shape) ri7Var.m70148u4();
        C10480ii c10480iiM51263x1 = c10534m3Mo50859du != null ? c10534m3Mo50859du.m51263x1() : new C10480ii();
        C10701wz c10701wz = (C10701wz) C7019kk.m27452k4((Object) c10480iiM51263x1.m50923k4(703), C10701wz.class);
        if (c10701wz != null && c10701wz.m51963x1() && c10701wz.m51960kk()) {
            C10609qn c10609qn = (C10609qn) C7019kk.m27452k4((Object) c10480iiM51263x1.m50923k4(644), C10609qn.class);
            C10609qn c10609qn2 = (C10609qn) C7019kk.m27452k4((Object) c10480iiM51263x1.m50923k4(645), C10609qn.class);
            C10609qn c10609qn3 = (C10609qn) C7019kk.m27452k4((Object) c10480iiM51263x1.m50923k4(647), C10609qn.class);
            C10609qn c10609qn4 = (C10609qn) C7019kk.m27452k4((Object) c10480iiM51263x1.m50923k4(640), C10609qn.class);
            C10609qn c10609qn5 = (C10609qn) C7019kk.m27452k4((Object) c10480iiM51263x1.m50923k4(641), C10609qn.class);
            C10609qn c10609qn6 = (C10609qn) C7019kk.m27452k4((Object) c10480iiM51263x1.m50923k4(642), C10609qn.class);
            C10609qn c10609qn7 = (C10609qn) C7019kk.m27452k4((Object) c10480iiM51263x1.m50923k4(710), C10609qn.class);
            C10609qn c10609qn8 = (C10609qn) C7019kk.m27452k4((Object) c10480iiM51263x1.m50923k4(711), C10609qn.class);
            C10609qn c10609qn9 = (C10609qn) C7019kk.m27452k4((Object) c10480iiM51263x1.m50923k4(712), C10609qn.class);
            C10609qn c10609qn10 = (C10609qn) C7019kk.m27452k4((Object) c10480iiM51263x1.m50923k4(713), C10609qn.class);
            spu spuVarM3011to = ((ThreeDFormat) iThreeDFormat).m3011to();
            int iM51597ar = c10609qn != null ? (int) c10609qn.m51597ar() : 0;
            iThreeDFormat.setExtrusionHeight(((double) (((-iM51597ar) + (c10609qn2 != null ? (int) c10609qn2.m51597ar() : 457200)) - 27000)) / 12700.0d);
            iThreeDFormat.getBevelTop().setWidth(z ? 0.0d : 1.062992125984252d);
            iThreeDFormat.getBevelTop().setHeight(z ? 0.0d : 1.062992125984252d);
            iThreeDFormat.getBevelTop().setBevelType(0);
            iThreeDFormat.getBevelBottom().setWidth(z ? 0.0d : 1.062992125984252d);
            iThreeDFormat.getBevelBottom().setHeight(z ? 0.0d : 1.062992125984252d);
            iThreeDFormat.getBevelBottom().setBevelType(0);
            iThreeDFormat.setDepth(((double) iM51597ar) / 12700.0d);
            long jM51597ar = c10609qn4 != null ? c10609qn4.m51597ar() : 0L;
            long jM51597ar2 = c10609qn5 != null ? c10609qn5.m51597ar() : 65536L;
            long jM51597ar3 = c10609qn6 != null ? c10609qn6.m51597ar() : 5L;
            long jM51597ar4 = c10609qn10 != null ? c10609qn10.m51597ar() : 0L;
            long j = jM51597ar & 4294967295L;
            if (j == 80000 && jM51597ar2 == 65536 && jM51597ar3 == 5 && jM51597ar4 == 0) {
                i = 5;
            } else if (j == 80000 && (jM51597ar2 & 4294967295L) == 43712 && jM51597ar3 == 5 && jM51597ar4 == 0) {
                i = 4;
            } else {
                if (jM51597ar != 0 || (jM51597ar2 & 4294967295L) != 0 || (jM51597ar3 & 4294967295L) != 0 || (jM51597ar4 & 4294967295L) != 1) {
                    iThreeDFormat.setMaterial(3);
                    if (c10609qn7 == null || c10609qn8 != null || c10609qn9 != null) {
                        ri7Var.m70149up().m64712du().m71946k4().m2349du().m1921k4(C14113y2.m67408k4("Deserialization of some ThreeDFormat ppt data (Style3Dc3DRotationCenterX, ..Y, ..Z)", " is not imlemented yet."), 3);
                    }
                    shape.getLineFormat().getFillFormat().setFillType((byte) 0);
                    ((ColorFormat) iThreeDFormat.getContourColor()).m1080k4(((ColorFormat) shape.getFillFormat().getSolidFillColor()).m1084to().Clone());
                    if (c10609qn3 == null || shape.getFillFormat().getFillType() != 1) {
                        C14294pm.m69139k4(iThreeDFormat.getExtrusionColor(), c10609qn3 == null ? c10609qn3.m51597ar() : 268435703L, 1.0d);
                    } else {
                        ((ColorFormat) iThreeDFormat.getExtrusionColor()).m1080k4(((ColorFormat) shape.getFillFormat().getSolidFillColor()).m1084to().Clone());
                    }
                    C13693jn.m63444k4(iThreeDFormat.getCamera(), c10534m3Mo50859du, ri7Var.m70149up());
                    pqy.m69193k4(iThreeDFormat.getLightRig(), c10534m3Mo50859du, ri7Var.m70149up());
                    C1080f7.m6025k4(spuVarM3011to.m70721kk(), c10534m3Mo50859du, ri7Var.m70140fa().mo50863m9());
                }
                i = 6;
            }
            iThreeDFormat.setMaterial(i);
            if (c10609qn7 == null) {
                ri7Var.m70149up().m64712du().m71946k4().m2349du().m1921k4(C14113y2.m67408k4("Deserialization of some ThreeDFormat ppt data (Style3Dc3DRotationCenterX, ..Y, ..Z)", " is not imlemented yet."), 3);
            }
            shape.getLineFormat().getFillFormat().setFillType((byte) 0);
            ((ColorFormat) iThreeDFormat.getContourColor()).m1080k4(((ColorFormat) shape.getFillFormat().getSolidFillColor()).m1084to().Clone());
            if (c10609qn3 == null) {
                C14294pm.m69139k4(iThreeDFormat.getExtrusionColor(), c10609qn3 == null ? c10609qn3.m51597ar() : 268435703L, 1.0d);
            }
            C13693jn.m63444k4(iThreeDFormat.getCamera(), c10534m3Mo50859du, ri7Var.m70149up());
            pqy.m69193k4(iThreeDFormat.getLightRig(), c10534m3Mo50859du, ri7Var.m70149up());
            C1080f7.m6025k4(spuVarM3011to.m70721kk(), c10534m3Mo50859du, ri7Var.m70140fa().mo50863m9());
        }
    }
}
