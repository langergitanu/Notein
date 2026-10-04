package com.aspose.slides;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3034ar;
import com.aspose.slides.internal.p077d8.C3083s7;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.C7394ca;
import com.aspose.slides.internal.p332p7.C7821h4;
import com.aspose.slides.internal.p464vq.C11791os;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: loaded from: classes3.dex */
class qas {

    /* JADX INFO: renamed from: k4 */
    private static final C7017h4 f48291k4 = new C7017h4("blinds", "checker", "circle", "comb", "cover", "cut", "diamond", "dissolve", "fade", "newsflash", "plus", "pull", "push", "random", "randomBar", "split", "strips", "wedge", "wheel", "wipe", "zoom", "vortex", "switch", "flip", "ripple", "honeycomb", "prism", "doors", "window", "ferris", "gallery", "conveyor", "pan", "glitter", "warp", "flythrough", "flash", "shred", "reveal", "wheelReverse", "prstTrans", "morph", "stSnd", "endSnd");

    /* JADX INFO: renamed from: k4 */
    public static void m69498k4(ISlideShowTransition iSlideShowTransition, C7821h4 c7821h4, gnb gnbVar) {
        com.aspose.slides.internal.p332p7.l2o l2oVar;
        int i;
        int i2;
        com.aspose.slides.internal.p332p7.m4s m4sVar;
        int i3;
        com.aspose.slides.internal.p332p7.hbd hbdVar;
        int i4;
        com.aspose.slides.internal.p332p7.zfd zfdVar;
        int i5;
        com.aspose.slides.internal.p332p7.dei deiVar;
        com.aspose.slides.internal.p332p7.dqx dqxVar;
        int i6;
        com.aspose.slides.internal.p332p7.w7b w7bVar;
        int i7;
        if (c7821h4 == null) {
            return;
        }
        C3034ar c3034ar = C3083s7.f9152k4;
        com.aspose.slides.internal.p332p7.eyk eykVarM33061du = (!c3034ar.m12773k4("http://schemas.microsoft.com/office/powerpoint/2015/09/main") || c7821h4.m33063h4() == null) ? (!c3034ar.m12773k4("http://schemas.microsoft.com/office/powerpoint/2012/main") || c7821h4.m33066m9() == null) ? (!c3034ar.m12773k4("http://schemas.microsoft.com/office/powerpoint/2010/main") || c7821h4.m33062dy() == null) ? c7821h4.m33061du() : c7821h4.m33062dy() : c7821h4.m33066m9() : c7821h4.m33063h4();
        C7394ca c7394caM31448h4 = eykVarM33061du.m31448h4();
        if (c7394caM31448h4 != null) {
            switch (f48291k4.m27428k4(c7394caM31448h4.m29539k4())) {
                case 0:
                    l2oVar = (com.aspose.slides.internal.p332p7.l2o) c7394caM31448h4.m29542x1();
                    iSlideShowTransition.setType(1);
                    fp4.m6246k4((IOrientationTransition) iSlideShowTransition.getValue(), l2oVar);
                    break;
                case 1:
                    l2oVar = (com.aspose.slides.internal.p332p7.l2o) c7394caM31448h4.m29542x1();
                    iSlideShowTransition.setType(2);
                    fp4.m6246k4((IOrientationTransition) iSlideShowTransition.getValue(), l2oVar);
                    break;
                case 2:
                    i = 3;
                    iSlideShowTransition.setType(i);
                    break;
                case 3:
                    l2oVar = (com.aspose.slides.internal.p332p7.l2o) c7394caM31448h4.m29542x1();
                    i2 = 4;
                    iSlideShowTransition.setType(i2);
                    fp4.m6246k4((IOrientationTransition) iSlideShowTransition.getValue(), l2oVar);
                    break;
                case 4:
                    m4sVar = (com.aspose.slides.internal.p332p7.m4s) c7394caM31448h4.m29542x1();
                    i3 = 5;
                    iSlideShowTransition.setType(i3);
                    C13699jr.m63497k4((IEightDirectionTransition) iSlideShowTransition.getValue(), m4sVar);
                    break;
                case 5:
                    hbdVar = (com.aspose.slides.internal.p332p7.hbd) c7394caM31448h4.m29542x1();
                    i4 = 6;
                    iSlideShowTransition.setType(i4);
                    per.m69033k4((IOptionalBlackTransition) iSlideShowTransition.getValue(), hbdVar);
                    break;
                case 6:
                    i = 7;
                    iSlideShowTransition.setType(i);
                    break;
                case 7:
                    i = 8;
                    iSlideShowTransition.setType(i);
                    break;
                case 8:
                    hbdVar = (com.aspose.slides.internal.p332p7.hbd) c7394caM31448h4.m29542x1();
                    i4 = 9;
                    iSlideShowTransition.setType(i4);
                    per.m69033k4((IOptionalBlackTransition) iSlideShowTransition.getValue(), hbdVar);
                    break;
                case 9:
                    i = 10;
                    iSlideShowTransition.setType(i);
                    break;
                case 10:
                    i = 11;
                    iSlideShowTransition.setType(i);
                    break;
                case 11:
                    m4sVar = (com.aspose.slides.internal.p332p7.m4s) c7394caM31448h4.m29542x1();
                    i3 = 12;
                    iSlideShowTransition.setType(i3);
                    C13699jr.m63497k4((IEightDirectionTransition) iSlideShowTransition.getValue(), m4sVar);
                    break;
                case 12:
                    zfdVar = (com.aspose.slides.internal.p332p7.zfd) c7394caM31448h4.m29542x1();
                    i5 = 13;
                    iSlideShowTransition.setType(i5);
                    cs2.m4802k4((ISideDirectionTransition) iSlideShowTransition.getValue(), zfdVar);
                    break;
                case 13:
                    i = 14;
                    iSlideShowTransition.setType(i);
                    break;
                case 14:
                    l2oVar = (com.aspose.slides.internal.p332p7.l2o) c7394caM31448h4.m29542x1();
                    i2 = 15;
                    iSlideShowTransition.setType(i2);
                    fp4.m6246k4((IOrientationTransition) iSlideShowTransition.getValue(), l2oVar);
                    break;
                case 15:
                    com.aspose.slides.internal.p332p7.y9j y9jVar = (com.aspose.slides.internal.p332p7.y9j) c7394caM31448h4.m29542x1();
                    iSlideShowTransition.setType(16);
                    dqx.m5214k4((ISplitTransition) iSlideShowTransition.getValue(), y9jVar);
                    break;
                case 16:
                    com.aspose.slides.internal.p332p7.oed oedVar = (com.aspose.slides.internal.p332p7.oed) c7394caM31448h4.m29542x1();
                    iSlideShowTransition.setType(17);
                    C14344qf.m69555k4((ICornerDirectionTransition) iSlideShowTransition.getValue(), oedVar);
                    break;
                case 17:
                    i = 18;
                    iSlideShowTransition.setType(i);
                    break;
                case 18:
                    deiVar = (com.aspose.slides.internal.p332p7.dei) c7394caM31448h4.m29542x1();
                    iSlideShowTransition.setType(19);
                    a7o.m3358k4((IWheelTransition) iSlideShowTransition.getValue(), deiVar);
                    break;
                case 19:
                    zfdVar = (com.aspose.slides.internal.p332p7.zfd) c7394caM31448h4.m29542x1();
                    i5 = 20;
                    iSlideShowTransition.setType(i5);
                    cs2.m4802k4((ISideDirectionTransition) iSlideShowTransition.getValue(), zfdVar);
                    break;
                case 20:
                    dqxVar = (com.aspose.slides.internal.p332p7.dqx) c7394caM31448h4.m29542x1();
                    i6 = 21;
                    iSlideShowTransition.setType(i6);
                    hlw.m7219k4((IInOutTransition) iSlideShowTransition.getValue(), dqxVar);
                    break;
                case 21:
                    zfdVar = (com.aspose.slides.internal.p332p7.zfd) c7394caM31448h4.m29542x1();
                    i5 = 22;
                    iSlideShowTransition.setType(i5);
                    cs2.m4802k4((ISideDirectionTransition) iSlideShowTransition.getValue(), zfdVar);
                    break;
                case 22:
                    w7bVar = (com.aspose.slides.internal.p332p7.w7b) c7394caM31448h4.m29542x1();
                    i7 = 23;
                    iSlideShowTransition.setType(i7);
                    pb4.m69008k4((ILeftRightDirectionTransition) iSlideShowTransition.getValue(), w7bVar);
                    break;
                case 23:
                    w7bVar = (com.aspose.slides.internal.p332p7.w7b) c7394caM31448h4.m29542x1();
                    i7 = 24;
                    iSlideShowTransition.setType(i7);
                    pb4.m69008k4((ILeftRightDirectionTransition) iSlideShowTransition.getValue(), w7bVar);
                    break;
                case 24:
                    com.aspose.slides.internal.p332p7.sws swsVar = (com.aspose.slides.internal.p332p7.sws) c7394caM31448h4.m29542x1();
                    iSlideShowTransition.setType(25);
                    l7k.m64323k4((IRippleTransition) iSlideShowTransition.getValue(), swsVar);
                    break;
                case 25:
                    i = 26;
                    iSlideShowTransition.setType(i);
                    break;
                case 26:
                    v8e.m72092k4(iSlideShowTransition, (com.aspose.slides.internal.p332p7.fkw) c7394caM31448h4.m29542x1());
                    break;
                case 27:
                    l2oVar = (com.aspose.slides.internal.p332p7.l2o) c7394caM31448h4.m29542x1();
                    i2 = 31;
                    iSlideShowTransition.setType(i2);
                    fp4.m6246k4((IOrientationTransition) iSlideShowTransition.getValue(), l2oVar);
                    break;
                case 28:
                    l2oVar = (com.aspose.slides.internal.p332p7.l2o) c7394caM31448h4.m29542x1();
                    i2 = 32;
                    iSlideShowTransition.setType(i2);
                    fp4.m6246k4((IOrientationTransition) iSlideShowTransition.getValue(), l2oVar);
                    break;
                case 29:
                    w7bVar = (com.aspose.slides.internal.p332p7.w7b) c7394caM31448h4.m29542x1();
                    i7 = 33;
                    iSlideShowTransition.setType(i7);
                    pb4.m69008k4((ILeftRightDirectionTransition) iSlideShowTransition.getValue(), w7bVar);
                    break;
                case 30:
                    w7bVar = (com.aspose.slides.internal.p332p7.w7b) c7394caM31448h4.m29542x1();
                    i7 = 34;
                    iSlideShowTransition.setType(i7);
                    pb4.m69008k4((ILeftRightDirectionTransition) iSlideShowTransition.getValue(), w7bVar);
                    break;
                case 31:
                    w7bVar = (com.aspose.slides.internal.p332p7.w7b) c7394caM31448h4.m29542x1();
                    i7 = 35;
                    iSlideShowTransition.setType(i7);
                    pb4.m69008k4((ILeftRightDirectionTransition) iSlideShowTransition.getValue(), w7bVar);
                    break;
                case 32:
                    zfdVar = (com.aspose.slides.internal.p332p7.zfd) c7394caM31448h4.m29542x1();
                    i5 = 36;
                    iSlideShowTransition.setType(i5);
                    cs2.m4802k4((ISideDirectionTransition) iSlideShowTransition.getValue(), zfdVar);
                    break;
                case 33:
                    com.aspose.slides.internal.p332p7.gu5 gu5Var = (com.aspose.slides.internal.p332p7.gu5) c7394caM31448h4.m29542x1();
                    iSlideShowTransition.setType(37);
                    C14639uk.m71712k4((IGlitterTransition) iSlideShowTransition.getValue(), gu5Var);
                    break;
                case 34:
                    dqxVar = (com.aspose.slides.internal.p332p7.dqx) c7394caM31448h4.m29542x1();
                    i6 = 38;
                    iSlideShowTransition.setType(i6);
                    hlw.m7219k4((IInOutTransition) iSlideShowTransition.getValue(), dqxVar);
                    break;
                case 35:
                    com.aspose.slides.internal.p332p7.u9b u9bVar = (com.aspose.slides.internal.p332p7.u9b) c7394caM31448h4.m29542x1();
                    iSlideShowTransition.setType(39);
                    C0937ed.m5430k4((IFlyThroughTransition) iSlideShowTransition.getValue(), u9bVar);
                    break;
                case 36:
                    i = 40;
                    iSlideShowTransition.setType(i);
                    break;
                case 37:
                    com.aspose.slides.internal.p332p7.kup kupVar = (com.aspose.slides.internal.p332p7.kup) c7394caM31448h4.m29542x1();
                    iSlideShowTransition.setType(41);
                    kwd.m64223k4((IShredTransition) iSlideShowTransition.getValue(), kupVar);
                    break;
                case 38:
                    com.aspose.slides.internal.p332p7.xx9 xx9Var = (com.aspose.slides.internal.p332p7.xx9) c7394caM31448h4.m29542x1();
                    iSlideShowTransition.setType(42);
                    lgn.m64389k4((IRevealTransition) iSlideShowTransition.getValue(), xx9Var);
                    break;
                case 39:
                    deiVar = (com.aspose.slides.internal.p332p7.dei) c7394caM31448h4.m29542x1();
                    iSlideShowTransition.setType(43);
                    a7o.m3358k4((IWheelTransition) iSlideShowTransition.getValue(), deiVar);
                    break;
                case 40:
                    rri.m70331k4(iSlideShowTransition, (com.aspose.slides.internal.p332p7.t9m) c7394caM31448h4.m29542x1());
                    break;
                case 41:
                    com.aspose.slides.internal.p332p7.q7e q7eVar = (com.aspose.slides.internal.p332p7.q7e) c7394caM31448h4.m29542x1();
                    iSlideShowTransition.setType(56);
                    j6m.m63231k4((IMorphTransition) iSlideShowTransition.getValue(), q7eVar);
                    break;
                default:
                    throw new Exception(C14113y2.m67408k4("Unknown element \"", c7394caM31448h4.m29539k4(), "\""));
            }
        }
        if (eykVarM33061du.m31456m9() != null) {
            C7394ca c7394caM43833k4 = eykVarM33061du.m31456m9().m43833k4();
            int iM27428k4 = f48291k4.m27428k4(c7394caM43833k4.m29539k4());
            if (iM27428k4 == 42) {
                com.aspose.slides.internal.p332p7.x5o x5oVar = (com.aspose.slides.internal.p332p7.x5o) c7394caM43833k4.m29542x1();
                C11791os c11791osM55296x1 = gnbVar.m55338u4().m55303k4(x5oVar.m44213x1().m38951k4()).m55296x1();
                if (c11791osM55296x1 != null) {
                    iSlideShowTransition.setSoundMode(0);
                    iSlideShowTransition.setSoundLoop(x5oVar.m44212k4());
                    iSlideShowTransition.setSoundIsBuiltIn(x5oVar.m44213x1().m38954kk());
                    iSlideShowTransition.setSound(gnbVar.m6798x1(c11791osM55296x1));
                    if (iSlideShowTransition.getSound() != null) {
                        iSlideShowTransition.setSoundName(x5oVar.m44213x1().m38955x1());
                    }
                }
            } else {
                if (iM27428k4 != 43) {
                    throw new Exception(C14113y2.m67408k4("Unknown element \"", c7394caM43833k4.m29539k4(), "\""));
                }
                iSlideShowTransition.setSoundMode(1);
            }
        }
        xxx xxxVarM2749k4 = ((SlideShowTransition) iSlideShowTransition).m2749k4();
        xxxVarM2749k4.m73639k4(eykVarM33061du.m31446du());
        xxxVarM2749k4.m73638k4(eykVarM33061du.m31447dy());
        iSlideShowTransition.setAdvanceOnClick(eykVarM33061du.m31455kk());
        boolean z = (eykVarM33061du.m31457to() & 4294967295L) != 4294967295L;
        iSlideShowTransition.setAdvanceAfterTime(z ? eykVarM33061du.m31457to() : 0L);
        iSlideShowTransition.setAdvanceAfter(z);
        int iM31458x1 = eykVarM33061du.m31458x1();
        if (iM31458x1 == 1) {
            iSlideShowTransition.setSpeed(2);
        } else if (iM31458x1 != 2) {
            iSlideShowTransition.setSpeed(0);
        } else {
            iSlideShowTransition.setSpeed(1);
        }
    }

    /* JADX INFO: renamed from: kk */
    private static boolean m69502kk(ISlideShowTransition iSlideShowTransition) {
        return iSlideShowTransition.getType() == 56;
    }

    /* JADX INFO: renamed from: x1 */
    private static boolean m69503x1(ISlideShowTransition iSlideShowTransition) {
        switch (iSlideShowTransition.getType()) {
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
                return true;
            default:
                return false;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:116:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0481  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x04a1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01aa A[PHI: r4
      0x01aa: PHI (r4v83 java.lang.String) = (r4v57 java.lang.String), (r4v84 java.lang.String) binds: [B:73:0x0296, B:46:0x01a8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0202 A[PHI: r4
      0x0202: PHI (r4v73 java.lang.String) = 
      (r4v40 java.lang.String)
      (r4v41 java.lang.String)
      (r4v49 java.lang.String)
      (r4v50 java.lang.String)
      (r4v58 java.lang.String)
      (r4v74 java.lang.String)
     binds: [B:93:0x0304, B:90:0x02fe, B:83:0x02ce, B:80:0x02c8, B:70:0x0290, B:54:0x0200] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x029e A[PHI: r4
      0x029e: PHI (r4v55 java.lang.String) = (r4v37 java.lang.String), (r4v56 java.lang.String) binds: [B:100:0x0326, B:76:0x029c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m69499k4(ISlideShowTransition iSlideShowTransition, C7821h4 c7821h4, u8s u8sVar) {
        com.aspose.slides.internal.p332p7.eyk eykVarM33067to;
        com.aspose.slides.internal.p332p7.eyk eykVarM33065kk;
        com.aspose.slides.internal.p332p7.eyk eykVarM33068x1;
        int speed;
        int soundMode;
        com.aspose.slides.internal.p332p7.wnb wnbVarM31450k4;
        com.aspose.slides.internal.p332p7.wnb wnbVarM31450k42;
        String str;
        String str2;
        String str3;
        C7394ca c7394caM31449k4;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        boolean zM69502kk = m69502kk(iSlideShowTransition);
        boolean zM69503x1 = m69503x1(iSlideShowTransition);
        boolean zM69501k4 = m69501k4(iSlideShowTransition);
        if (zM69502kk) {
            eykVarM33068x1 = c7821h4.m33068x1();
            eykVarM33067to = null;
            eykVarM33065kk = null;
        } else if (zM69503x1) {
            eykVarM33065kk = c7821h4.m33065kk();
            eykVarM33067to = null;
            eykVarM33068x1 = null;
        } else {
            if (zM69501k4) {
                eykVarM33067to = c7821h4.m33067to();
                eykVarM33065kk = null;
            } else {
                eykVarM33067to = null;
                eykVarM33065kk = null;
            }
            eykVarM33068x1 = eykVarM33065kk;
        }
        com.aspose.slides.internal.p332p7.eyk eykVarM33064k4 = c7821h4.m33064k4();
        switch (iSlideShowTransition.getType()) {
            case 0:
                speed = iSlideShowTransition.getSpeed();
                if (speed == 0) {
                    if (eykVarM33067to != null) {
                        eykVarM33067to.m31451k4(3);
                    } else if (eykVarM33065kk != null) {
                        eykVarM33065kk.m31451k4(3);
                    } else if (eykVarM33068x1 != null) {
                        eykVarM33068x1.m31451k4(3);
                    }
                    eykVarM33064k4.m31451k4(3);
                } else if (speed == 1) {
                    if (eykVarM33067to != null) {
                        eykVarM33067to.m31451k4(2);
                    } else if (eykVarM33065kk != null) {
                        eykVarM33065kk.m31451k4(2);
                    } else if (eykVarM33068x1 != null) {
                        eykVarM33068x1.m31451k4(2);
                    }
                    eykVarM33064k4.m31451k4(2);
                } else if (speed == 2) {
                    if (eykVarM33067to != null) {
                        eykVarM33067to.m31451k4(1);
                    } else if (eykVarM33065kk != null) {
                        eykVarM33065kk.m31451k4(1);
                    } else if (eykVarM33068x1 != null) {
                        eykVarM33068x1.m31451k4(1);
                    }
                    eykVarM33064k4.m31451k4(1);
                }
                if (eykVarM33067to != null) {
                    eykVarM33067to.m31454k4(iSlideShowTransition.getAdvanceOnClick());
                } else if (eykVarM33065kk != null) {
                    eykVarM33065kk.m31454k4(iSlideShowTransition.getAdvanceOnClick());
                } else if (eykVarM33068x1 != null) {
                    eykVarM33068x1.m31454k4(iSlideShowTransition.getAdvanceOnClick());
                }
                eykVarM33064k4.m31454k4(iSlideShowTransition.getAdvanceOnClick());
                if (iSlideShowTransition.getAdvanceAfter()) {
                    if (eykVarM33067to != null) {
                        eykVarM33067to.m31452k4(iSlideShowTransition.getAdvanceAfterTime());
                    } else if (eykVarM33065kk != null) {
                        eykVarM33065kk.m31452k4(iSlideShowTransition.getAdvanceAfterTime());
                    } else if (eykVarM33068x1 != null) {
                        eykVarM33068x1.m31452k4(iSlideShowTransition.getAdvanceAfterTime());
                    }
                    eykVarM33064k4.m31452k4(iSlideShowTransition.getAdvanceAfterTime());
                }
                soundMode = iSlideShowTransition.getSoundMode();
                if (soundMode != 0) {
                    if (soundMode == 1) {
                        if (eykVarM33067to != null) {
                            wnbVarM31450k42 = eykVarM33067to.m31450k4();
                        } else if (eykVarM33065kk != null) {
                            wnbVarM31450k42 = eykVarM33065kk.m31450k4();
                        } else {
                            if (eykVarM33068x1 != null) {
                                wnbVarM31450k42 = eykVarM33068x1.m31450k4();
                            }
                            eykVarM33064k4.m31450k4().m43834k4("endSnd");
                        }
                        wnbVarM31450k42.m43834k4("endSnd");
                        eykVarM33064k4.m31450k4().m43834k4("endSnd");
                    }
                } else if (iSlideShowTransition.getSound() != null) {
                    if (eykVarM33067to != null) {
                        wnbVarM31450k4 = eykVarM33067to.m31450k4();
                    } else if (eykVarM33065kk != null) {
                        wnbVarM31450k4 = eykVarM33065kk.m31450k4();
                    } else {
                        if (eykVarM33068x1 != null) {
                            wnbVarM31450k4 = eykVarM33068x1.m31450k4();
                        }
                        m69500k4(iSlideShowTransition, eykVarM33064k4.m31450k4(), u8sVar);
                    }
                    m69500k4(iSlideShowTransition, wnbVarM31450k4, u8sVar);
                    m69500k4(iSlideShowTransition, eykVarM33064k4.m31450k4(), u8sVar);
                }
                xxx xxxVarM2749k4 = ((SlideShowTransition) iSlideShowTransition).m2749k4();
                if (eykVarM33067to != null) {
                    eykVarM33067to.m31459x1(xxxVarM2749k4.m73637k4());
                } else if (eykVarM33065kk != null) {
                    eykVarM33065kk.m31459x1(xxxVarM2749k4.m73637k4());
                } else if (eykVarM33068x1 != null) {
                    eykVarM33068x1.m31459x1(xxxVarM2749k4.m73637k4());
                }
                eykVarM33064k4.m31459x1((String) null);
                if (eykVarM33067to != null) {
                    eykVarM33067to.m31453k4(xxxVarM2749k4.m73642x1());
                } else if (eykVarM33065kk != null) {
                    eykVarM33065kk.m31453k4(xxxVarM2749k4.m73642x1());
                } else if (eykVarM33068x1 != null) {
                    eykVarM33068x1.m31453k4(xxxVarM2749k4.m73642x1());
                }
                eykVarM33064k4.m31453k4(xxxVarM2749k4.m73642x1());
                return;
            case 1:
                if (eykVarM33067to != null) {
                    fp4.m6247x1((IOrientationTransition) iSlideShowTransition.getValue(), (com.aspose.slides.internal.p332p7.l2o) eykVarM33067to.m31449k4("blinds").m29542x1());
                }
                str = "blinds";
                fp4.m6247x1((IOrientationTransition) iSlideShowTransition.getValue(), (com.aspose.slides.internal.p332p7.l2o) eykVarM33064k4.m31449k4(str).m29542x1());
                speed = iSlideShowTransition.getSpeed();
                if (speed == 0) {
                }
                if (eykVarM33067to != null) {
                }
                eykVarM33064k4.m31454k4(iSlideShowTransition.getAdvanceOnClick());
                if (iSlideShowTransition.getAdvanceAfter()) {
                }
                soundMode = iSlideShowTransition.getSoundMode();
                if (soundMode != 0) {
                }
                xxx xxxVarM2749k42 = ((SlideShowTransition) iSlideShowTransition).m2749k4();
                if (eykVarM33067to != null) {
                }
                eykVarM33064k4.m31459x1((String) null);
                if (eykVarM33067to != null) {
                }
                eykVarM33064k4.m31453k4(xxxVarM2749k42.m73642x1());
                return;
            case 2:
                if (eykVarM33067to != null) {
                    fp4.m6247x1((IOrientationTransition) iSlideShowTransition.getValue(), (com.aspose.slides.internal.p332p7.l2o) eykVarM33067to.m31449k4("checker").m29542x1());
                }
                str = "checker";
                fp4.m6247x1((IOrientationTransition) iSlideShowTransition.getValue(), (com.aspose.slides.internal.p332p7.l2o) eykVarM33064k4.m31449k4(str).m29542x1());
                speed = iSlideShowTransition.getSpeed();
                if (speed == 0) {
                }
                if (eykVarM33067to != null) {
                }
                eykVarM33064k4.m31454k4(iSlideShowTransition.getAdvanceOnClick());
                if (iSlideShowTransition.getAdvanceAfter()) {
                }
                soundMode = iSlideShowTransition.getSoundMode();
                if (soundMode != 0) {
                }
                xxx xxxVarM2749k422 = ((SlideShowTransition) iSlideShowTransition).m2749k4();
                if (eykVarM33067to != null) {
                }
                eykVarM33064k4.m31459x1((String) null);
                if (eykVarM33067to != null) {
                }
                eykVarM33064k4.m31453k4(xxxVarM2749k422.m73642x1());
                return;
            case 3:
                if (eykVarM33067to != null) {
                    eykVarM33067to.m31449k4("circle");
                }
                str2 = "circle";
                eykVarM33064k4.m31449k4(str2);
                speed = iSlideShowTransition.getSpeed();
                if (speed == 0) {
                }
                if (eykVarM33067to != null) {
                }
                eykVarM33064k4.m31454k4(iSlideShowTransition.getAdvanceOnClick());
                if (iSlideShowTransition.getAdvanceAfter()) {
                }
                soundMode = iSlideShowTransition.getSoundMode();
                if (soundMode != 0) {
                }
                xxx xxxVarM2749k4222 = ((SlideShowTransition) iSlideShowTransition).m2749k4();
                if (eykVarM33067to != null) {
                }
                eykVarM33064k4.m31459x1((String) null);
                if (eykVarM33067to != null) {
                }
                eykVarM33064k4.m31453k4(xxxVarM2749k4222.m73642x1());
                return;
            case 4:
                if (eykVarM33067to != null) {
                    fp4.m6247x1((IOrientationTransition) iSlideShowTransition.getValue(), (com.aspose.slides.internal.p332p7.l2o) eykVarM33067to.m31449k4("comb").m29542x1());
                }
                str = "comb";
                fp4.m6247x1((IOrientationTransition) iSlideShowTransition.getValue(), (com.aspose.slides.internal.p332p7.l2o) eykVarM33064k4.m31449k4(str).m29542x1());
                speed = iSlideShowTransition.getSpeed();
                if (speed == 0) {
                }
                if (eykVarM33067to != null) {
                }
                eykVarM33064k4.m31454k4(iSlideShowTransition.getAdvanceOnClick());
                if (iSlideShowTransition.getAdvanceAfter()) {
                }
                soundMode = iSlideShowTransition.getSoundMode();
                if (soundMode != 0) {
                }
                xxx xxxVarM2749k42222 = ((SlideShowTransition) iSlideShowTransition).m2749k4();
                if (eykVarM33067to != null) {
                }
                eykVarM33064k4.m31459x1((String) null);
                if (eykVarM33067to != null) {
                }
                eykVarM33064k4.m31453k4(xxxVarM2749k42222.m73642x1());
                return;
            case 5:
                str3 = "cover";
                if (eykVarM33067to != null) {
                    C13699jr.m63498x1((IEightDirectionTransition) iSlideShowTransition.getValue(), (com.aspose.slides.internal.p332p7.m4s) eykVarM33067to.m31449k4(str3).m29542x1());
                }
                C13699jr.m63498x1((IEightDirectionTransition) iSlideShowTransition.getValue(), (com.aspose.slides.internal.p332p7.m4s) eykVarM33064k4.m31449k4(str3).m29542x1());
                speed = iSlideShowTransition.getSpeed();
                if (speed == 0) {
                }
                if (eykVarM33067to != null) {
                }
                eykVarM33064k4.m31454k4(iSlideShowTransition.getAdvanceOnClick());
                if (iSlideShowTransition.getAdvanceAfter()) {
                }
                soundMode = iSlideShowTransition.getSoundMode();
                if (soundMode != 0) {
                }
                xxx xxxVarM2749k422222 = ((SlideShowTransition) iSlideShowTransition).m2749k4();
                if (eykVarM33067to != null) {
                }
                eykVarM33064k4.m31459x1((String) null);
                if (eykVarM33067to != null) {
                }
                eykVarM33064k4.m31453k4(xxxVarM2749k422222.m73642x1());
                return;
            case 6:
                if (eykVarM33067to != null) {
                    per.m69034x1((IOptionalBlackTransition) iSlideShowTransition.getValue(), (com.aspose.slides.internal.p332p7.hbd) eykVarM33067to.m31449k4("cut").m29542x1());
                }
                c7394caM31449k4 = eykVarM33064k4.m31449k4("cut");
                per.m69034x1((IOptionalBlackTransition) iSlideShowTransition.getValue(), (com.aspose.slides.internal.p332p7.hbd) c7394caM31449k4.m29542x1());
                speed = iSlideShowTransition.getSpeed();
                if (speed == 0) {
                }
                if (eykVarM33067to != null) {
                }
                eykVarM33064k4.m31454k4(iSlideShowTransition.getAdvanceOnClick());
                if (iSlideShowTransition.getAdvanceAfter()) {
                }
                soundMode = iSlideShowTransition.getSoundMode();
                if (soundMode != 0) {
                }
                xxx xxxVarM2749k4222222 = ((SlideShowTransition) iSlideShowTransition).m2749k4();
                if (eykVarM33067to != null) {
                }
                eykVarM33064k4.m31459x1((String) null);
                if (eykVarM33067to != null) {
                }
                eykVarM33064k4.m31453k4(xxxVarM2749k4222222.m73642x1());
                return;
            case 7:
                str2 = "diamond";
                if (eykVarM33067to != null) {
                    eykVarM33067to.m31449k4(str2);
                }
                eykVarM33064k4.m31449k4(str2);
                speed = iSlideShowTransition.getSpeed();
                if (speed == 0) {
                }
                if (eykVarM33067to != null) {
                }
                eykVarM33064k4.m31454k4(iSlideShowTransition.getAdvanceOnClick());
                if (iSlideShowTransition.getAdvanceAfter()) {
                }
                soundMode = iSlideShowTransition.getSoundMode();
                if (soundMode != 0) {
                }
                xxx xxxVarM2749k42222222 = ((SlideShowTransition) iSlideShowTransition).m2749k4();
                if (eykVarM33067to != null) {
                }
                eykVarM33064k4.m31459x1((String) null);
                if (eykVarM33067to != null) {
                }
                eykVarM33064k4.m31453k4(xxxVarM2749k42222222.m73642x1());
                return;
            case 8:
                str2 = "dissolve";
                if (eykVarM33067to != null) {
                }
                eykVarM33064k4.m31449k4(str2);
                speed = iSlideShowTransition.getSpeed();
                if (speed == 0) {
                }
                if (eykVarM33067to != null) {
                }
                eykVarM33064k4.m31454k4(iSlideShowTransition.getAdvanceOnClick());
                if (iSlideShowTransition.getAdvanceAfter()) {
                }
                soundMode = iSlideShowTransition.getSoundMode();
                if (soundMode != 0) {
                }
                xxx xxxVarM2749k422222222 = ((SlideShowTransition) iSlideShowTransition).m2749k4();
                if (eykVarM33067to != null) {
                }
                eykVarM33064k4.m31459x1((String) null);
                if (eykVarM33067to != null) {
                }
                eykVarM33064k4.m31453k4(xxxVarM2749k422222222.m73642x1());
                return;
            case 9:
                if (eykVarM33067to != null) {
                    per.m69034x1((IOptionalBlackTransition) iSlideShowTransition.getValue(), (com.aspose.slides.internal.p332p7.hbd) eykVarM33067to.m31449k4("fade").m29542x1());
                }
                c7394caM31449k4 = eykVarM33064k4.m31449k4("fade");
                per.m69034x1((IOptionalBlackTransition) iSlideShowTransition.getValue(), (com.aspose.slides.internal.p332p7.hbd) c7394caM31449k4.m29542x1());
                speed = iSlideShowTransition.getSpeed();
                if (speed == 0) {
                }
                if (eykVarM33067to != null) {
                }
                eykVarM33064k4.m31454k4(iSlideShowTransition.getAdvanceOnClick());
                if (iSlideShowTransition.getAdvanceAfter()) {
                }
                soundMode = iSlideShowTransition.getSoundMode();
                if (soundMode != 0) {
                }
                xxx xxxVarM2749k4222222222 = ((SlideShowTransition) iSlideShowTransition).m2749k4();
                if (eykVarM33067to != null) {
                }
                eykVarM33064k4.m31459x1((String) null);
                if (eykVarM33067to != null) {
                }
                eykVarM33064k4.m31453k4(xxxVarM2749k4222222222.m73642x1());
                return;
            case 10:
                str2 = "newsflash";
                if (eykVarM33067to != null) {
                }
                eykVarM33064k4.m31449k4(str2);
                speed = iSlideShowTransition.getSpeed();
                if (speed == 0) {
                }
                if (eykVarM33067to != null) {
                }
                eykVarM33064k4.m31454k4(iSlideShowTransition.getAdvanceOnClick());
                if (iSlideShowTransition.getAdvanceAfter()) {
                }
                soundMode = iSlideShowTransition.getSoundMode();
                if (soundMode != 0) {
                }
                xxx xxxVarM2749k42222222222 = ((SlideShowTransition) iSlideShowTransition).m2749k4();
                if (eykVarM33067to != null) {
                }
                eykVarM33064k4.m31459x1((String) null);
                if (eykVarM33067to != null) {
                }
                eykVarM33064k4.m31453k4(xxxVarM2749k42222222222.m73642x1());
                return;
            case 11:
                str2 = "plus";
                if (eykVarM33067to != null) {
                }
                eykVarM33064k4.m31449k4(str2);
                speed = iSlideShowTransition.getSpeed();
                if (speed == 0) {
                }
                if (eykVarM33067to != null) {
                }
                eykVarM33064k4.m31454k4(iSlideShowTransition.getAdvanceOnClick());
                if (iSlideShowTransition.getAdvanceAfter()) {
                }
                soundMode = iSlideShowTransition.getSoundMode();
                if (soundMode != 0) {
                }
                xxx xxxVarM2749k422222222222 = ((SlideShowTransition) iSlideShowTransition).m2749k4();
                if (eykVarM33067to != null) {
                }
                eykVarM33064k4.m31459x1((String) null);
                if (eykVarM33067to != null) {
                }
                eykVarM33064k4.m31453k4(xxxVarM2749k422222222222.m73642x1());
                return;
            case 12:
                str3 = "pull";
                if (eykVarM33067to != null) {
                }
                C13699jr.m63498x1((IEightDirectionTransition) iSlideShowTransition.getValue(), (com.aspose.slides.internal.p332p7.m4s) eykVarM33064k4.m31449k4(str3).m29542x1());
                speed = iSlideShowTransition.getSpeed();
                if (speed == 0) {
                }
                if (eykVarM33067to != null) {
                }
                eykVarM33064k4.m31454k4(iSlideShowTransition.getAdvanceOnClick());
                if (iSlideShowTransition.getAdvanceAfter()) {
                }
                soundMode = iSlideShowTransition.getSoundMode();
                if (soundMode != 0) {
                }
                xxx xxxVarM2749k4222222222222 = ((SlideShowTransition) iSlideShowTransition).m2749k4();
                if (eykVarM33067to != null) {
                }
                eykVarM33064k4.m31459x1((String) null);
                if (eykVarM33067to != null) {
                }
                eykVarM33064k4.m31453k4(xxxVarM2749k4222222222222.m73642x1());
                return;
            case 13:
                str4 = "push";
                if (eykVarM33067to != null) {
                    cs2.m4803x1((ISideDirectionTransition) iSlideShowTransition.getValue(), (com.aspose.slides.internal.p332p7.zfd) eykVarM33067to.m31449k4(str4).m29542x1());
                }
                cs2.m4803x1((ISideDirectionTransition) iSlideShowTransition.getValue(), (com.aspose.slides.internal.p332p7.zfd) eykVarM33064k4.m31449k4(str4).m29542x1());
                speed = iSlideShowTransition.getSpeed();
                if (speed == 0) {
                }
                if (eykVarM33067to != null) {
                }
                eykVarM33064k4.m31454k4(iSlideShowTransition.getAdvanceOnClick());
                if (iSlideShowTransition.getAdvanceAfter()) {
                }
                soundMode = iSlideShowTransition.getSoundMode();
                if (soundMode != 0) {
                }
                xxx xxxVarM2749k42222222222222 = ((SlideShowTransition) iSlideShowTransition).m2749k4();
                if (eykVarM33067to != null) {
                }
                eykVarM33064k4.m31459x1((String) null);
                if (eykVarM33067to != null) {
                }
                eykVarM33064k4.m31453k4(xxxVarM2749k42222222222222.m73642x1());
                return;
            case 14:
                str2 = "random";
                if (eykVarM33067to != null) {
                }
                eykVarM33064k4.m31449k4(str2);
                speed = iSlideShowTransition.getSpeed();
                if (speed == 0) {
                }
                if (eykVarM33067to != null) {
                }
                eykVarM33064k4.m31454k4(iSlideShowTransition.getAdvanceOnClick());
                if (iSlideShowTransition.getAdvanceAfter()) {
                }
                soundMode = iSlideShowTransition.getSoundMode();
                if (soundMode != 0) {
                }
                xxx xxxVarM2749k422222222222222 = ((SlideShowTransition) iSlideShowTransition).m2749k4();
                if (eykVarM33067to != null) {
                }
                eykVarM33064k4.m31459x1((String) null);
                if (eykVarM33067to != null) {
                }
                eykVarM33064k4.m31453k4(xxxVarM2749k422222222222222.m73642x1());
                return;
            case 15:
                str = "randomBar";
                if (eykVarM33067to != null) {
                    fp4.m6247x1((IOrientationTransition) iSlideShowTransition.getValue(), (com.aspose.slides.internal.p332p7.l2o) eykVarM33067to.m31449k4("randomBar").m29542x1());
                }
                fp4.m6247x1((IOrientationTransition) iSlideShowTransition.getValue(), (com.aspose.slides.internal.p332p7.l2o) eykVarM33064k4.m31449k4(str).m29542x1());
                speed = iSlideShowTransition.getSpeed();
                if (speed == 0) {
                }
                if (eykVarM33067to != null) {
                }
                eykVarM33064k4.m31454k4(iSlideShowTransition.getAdvanceOnClick());
                if (iSlideShowTransition.getAdvanceAfter()) {
                }
                soundMode = iSlideShowTransition.getSoundMode();
                if (soundMode != 0) {
                }
                xxx xxxVarM2749k4222222222222222 = ((SlideShowTransition) iSlideShowTransition).m2749k4();
                if (eykVarM33067to != null) {
                }
                eykVarM33064k4.m31459x1((String) null);
                if (eykVarM33067to != null) {
                }
                eykVarM33064k4.m31453k4(xxxVarM2749k4222222222222222.m73642x1());
                return;
            case 16:
                if (eykVarM33067to != null) {
                    dqx.m5215x1((ISplitTransition) iSlideShowTransition.getValue(), (com.aspose.slides.internal.p332p7.y9j) eykVarM33067to.m31449k4("split").m29542x1());
                }
                dqx.m5215x1((ISplitTransition) iSlideShowTransition.getValue(), (com.aspose.slides.internal.p332p7.y9j) eykVarM33064k4.m31449k4("split").m29542x1());
                speed = iSlideShowTransition.getSpeed();
                if (speed == 0) {
                }
                if (eykVarM33067to != null) {
                }
                eykVarM33064k4.m31454k4(iSlideShowTransition.getAdvanceOnClick());
                if (iSlideShowTransition.getAdvanceAfter()) {
                }
                soundMode = iSlideShowTransition.getSoundMode();
                if (soundMode != 0) {
                }
                xxx xxxVarM2749k42222222222222222 = ((SlideShowTransition) iSlideShowTransition).m2749k4();
                if (eykVarM33067to != null) {
                }
                eykVarM33064k4.m31459x1((String) null);
                if (eykVarM33067to != null) {
                }
                eykVarM33064k4.m31453k4(xxxVarM2749k42222222222222222.m73642x1());
                return;
            case 17:
                if (eykVarM33067to != null) {
                    C14344qf.m69556x1((ICornerDirectionTransition) iSlideShowTransition.getValue(), (com.aspose.slides.internal.p332p7.oed) eykVarM33067to.m31449k4("strips").m29542x1());
                }
                C14344qf.m69556x1((ICornerDirectionTransition) iSlideShowTransition.getValue(), (com.aspose.slides.internal.p332p7.oed) eykVarM33064k4.m31449k4("strips").m29542x1());
                speed = iSlideShowTransition.getSpeed();
                if (speed == 0) {
                }
                if (eykVarM33067to != null) {
                }
                eykVarM33064k4.m31454k4(iSlideShowTransition.getAdvanceOnClick());
                if (iSlideShowTransition.getAdvanceAfter()) {
                }
                soundMode = iSlideShowTransition.getSoundMode();
                if (soundMode != 0) {
                }
                xxx xxxVarM2749k422222222222222222 = ((SlideShowTransition) iSlideShowTransition).m2749k4();
                if (eykVarM33067to != null) {
                }
                eykVarM33064k4.m31459x1((String) null);
                if (eykVarM33067to != null) {
                }
                eykVarM33064k4.m31453k4(xxxVarM2749k422222222222222222.m73642x1());
                return;
            case 18:
                str2 = "wedge";
                if (eykVarM33067to != null) {
                }
                eykVarM33064k4.m31449k4(str2);
                speed = iSlideShowTransition.getSpeed();
                if (speed == 0) {
                }
                if (eykVarM33067to != null) {
                }
                eykVarM33064k4.m31454k4(iSlideShowTransition.getAdvanceOnClick());
                if (iSlideShowTransition.getAdvanceAfter()) {
                }
                soundMode = iSlideShowTransition.getSoundMode();
                if (soundMode != 0) {
                }
                xxx xxxVarM2749k4222222222222222222 = ((SlideShowTransition) iSlideShowTransition).m2749k4();
                if (eykVarM33067to != null) {
                }
                eykVarM33064k4.m31459x1((String) null);
                if (eykVarM33067to != null) {
                }
                eykVarM33064k4.m31453k4(xxxVarM2749k4222222222222222222.m73642x1());
                return;
            case 19:
                if (eykVarM33067to != null) {
                    a7o.m3359x1((IWheelTransition) iSlideShowTransition.getValue(), (com.aspose.slides.internal.p332p7.dei) eykVarM33067to.m31449k4("wheel").m29542x1());
                }
                a7o.m3359x1((IWheelTransition) iSlideShowTransition.getValue(), (com.aspose.slides.internal.p332p7.dei) eykVarM33064k4.m31449k4("wheel").m29542x1());
                speed = iSlideShowTransition.getSpeed();
                if (speed == 0) {
                }
                if (eykVarM33067to != null) {
                }
                eykVarM33064k4.m31454k4(iSlideShowTransition.getAdvanceOnClick());
                if (iSlideShowTransition.getAdvanceAfter()) {
                }
                soundMode = iSlideShowTransition.getSoundMode();
                if (soundMode != 0) {
                }
                xxx xxxVarM2749k42222222222222222222 = ((SlideShowTransition) iSlideShowTransition).m2749k4();
                if (eykVarM33067to != null) {
                }
                eykVarM33064k4.m31459x1((String) null);
                if (eykVarM33067to != null) {
                }
                eykVarM33064k4.m31453k4(xxxVarM2749k42222222222222222222.m73642x1());
                return;
            case 20:
                str4 = "wipe";
                if (eykVarM33067to != null) {
                }
                cs2.m4803x1((ISideDirectionTransition) iSlideShowTransition.getValue(), (com.aspose.slides.internal.p332p7.zfd) eykVarM33064k4.m31449k4(str4).m29542x1());
                speed = iSlideShowTransition.getSpeed();
                if (speed == 0) {
                }
                if (eykVarM33067to != null) {
                }
                eykVarM33064k4.m31454k4(iSlideShowTransition.getAdvanceOnClick());
                if (iSlideShowTransition.getAdvanceAfter()) {
                }
                soundMode = iSlideShowTransition.getSoundMode();
                if (soundMode != 0) {
                }
                xxx xxxVarM2749k422222222222222222222 = ((SlideShowTransition) iSlideShowTransition).m2749k4();
                if (eykVarM33067to != null) {
                }
                eykVarM33064k4.m31459x1((String) null);
                if (eykVarM33067to != null) {
                }
                eykVarM33064k4.m31453k4(xxxVarM2749k422222222222222222222.m73642x1());
                return;
            case 21:
                if (eykVarM33067to != null) {
                    hlw.m7220x1((IInOutTransition) iSlideShowTransition.getValue(), (com.aspose.slides.internal.p332p7.dqx) eykVarM33067to.m31449k4("zoom").m29542x1());
                }
                hlw.m7220x1((IInOutTransition) iSlideShowTransition.getValue(), (com.aspose.slides.internal.p332p7.dqx) eykVarM33064k4.m31449k4("zoom").m29542x1());
                speed = iSlideShowTransition.getSpeed();
                if (speed == 0) {
                }
                if (eykVarM33067to != null) {
                }
                eykVarM33064k4.m31454k4(iSlideShowTransition.getAdvanceOnClick());
                if (iSlideShowTransition.getAdvanceAfter()) {
                }
                soundMode = iSlideShowTransition.getSoundMode();
                if (soundMode != 0) {
                }
                xxx xxxVarM2749k4222222222222222222222 = ((SlideShowTransition) iSlideShowTransition).m2749k4();
                if (eykVarM33067to != null) {
                }
                eykVarM33064k4.m31459x1((String) null);
                if (eykVarM33067to != null) {
                }
                eykVarM33064k4.m31453k4(xxxVarM2749k4222222222222222222222.m73642x1());
                return;
            case 22:
                str5 = "vortex";
                cs2.m4803x1((ISideDirectionTransition) iSlideShowTransition.getValue(), (com.aspose.slides.internal.p332p7.zfd) eykVarM33067to.m31449k4(str5).m29542x1());
                eykVarM33064k4.m31449k4("fade");
                speed = iSlideShowTransition.getSpeed();
                if (speed == 0) {
                }
                if (eykVarM33067to != null) {
                }
                eykVarM33064k4.m31454k4(iSlideShowTransition.getAdvanceOnClick());
                if (iSlideShowTransition.getAdvanceAfter()) {
                }
                soundMode = iSlideShowTransition.getSoundMode();
                if (soundMode != 0) {
                }
                xxx xxxVarM2749k42222222222222222222222 = ((SlideShowTransition) iSlideShowTransition).m2749k4();
                if (eykVarM33067to != null) {
                }
                eykVarM33064k4.m31459x1((String) null);
                if (eykVarM33067to != null) {
                }
                eykVarM33064k4.m31453k4(xxxVarM2749k42222222222222222222222.m73642x1());
                return;
            case 23:
                str6 = "switch";
                pb4.m69009x1((ILeftRightDirectionTransition) iSlideShowTransition.getValue(), (com.aspose.slides.internal.p332p7.w7b) eykVarM33067to.m31449k4(str6).m29542x1());
                eykVarM33064k4.m31449k4("fade");
                speed = iSlideShowTransition.getSpeed();
                if (speed == 0) {
                }
                if (eykVarM33067to != null) {
                }
                eykVarM33064k4.m31454k4(iSlideShowTransition.getAdvanceOnClick());
                if (iSlideShowTransition.getAdvanceAfter()) {
                }
                soundMode = iSlideShowTransition.getSoundMode();
                if (soundMode != 0) {
                }
                xxx xxxVarM2749k422222222222222222222222 = ((SlideShowTransition) iSlideShowTransition).m2749k4();
                if (eykVarM33067to != null) {
                }
                eykVarM33064k4.m31459x1((String) null);
                if (eykVarM33067to != null) {
                }
                eykVarM33064k4.m31453k4(xxxVarM2749k422222222222222222222222.m73642x1());
                return;
            case 24:
                str6 = "flip";
                pb4.m69009x1((ILeftRightDirectionTransition) iSlideShowTransition.getValue(), (com.aspose.slides.internal.p332p7.w7b) eykVarM33067to.m31449k4(str6).m29542x1());
                eykVarM33064k4.m31449k4("fade");
                speed = iSlideShowTransition.getSpeed();
                if (speed == 0) {
                }
                if (eykVarM33067to != null) {
                }
                eykVarM33064k4.m31454k4(iSlideShowTransition.getAdvanceOnClick());
                if (iSlideShowTransition.getAdvanceAfter()) {
                }
                soundMode = iSlideShowTransition.getSoundMode();
                if (soundMode != 0) {
                }
                xxx xxxVarM2749k4222222222222222222222222 = ((SlideShowTransition) iSlideShowTransition).m2749k4();
                if (eykVarM33067to != null) {
                }
                eykVarM33064k4.m31459x1((String) null);
                if (eykVarM33067to != null) {
                }
                eykVarM33064k4.m31453k4(xxxVarM2749k4222222222222222222222222.m73642x1());
                return;
            case 25:
                l7k.m64324x1((IRippleTransition) iSlideShowTransition.getValue(), (com.aspose.slides.internal.p332p7.sws) eykVarM33067to.m31449k4("ripple").m29542x1());
                eykVarM33064k4.m31449k4("fade");
                speed = iSlideShowTransition.getSpeed();
                if (speed == 0) {
                }
                if (eykVarM33067to != null) {
                }
                eykVarM33064k4.m31454k4(iSlideShowTransition.getAdvanceOnClick());
                if (iSlideShowTransition.getAdvanceAfter()) {
                }
                soundMode = iSlideShowTransition.getSoundMode();
                if (soundMode != 0) {
                }
                xxx xxxVarM2749k42222222222222222222222222 = ((SlideShowTransition) iSlideShowTransition).m2749k4();
                if (eykVarM33067to != null) {
                }
                eykVarM33064k4.m31459x1((String) null);
                if (eykVarM33067to != null) {
                }
                eykVarM33064k4.m31453k4(xxxVarM2749k42222222222222222222222222.m73642x1());
                return;
            case 26:
                str7 = "honeycomb";
                eykVarM33067to.m31449k4(str7);
                eykVarM33064k4.m31449k4("fade");
                speed = iSlideShowTransition.getSpeed();
                if (speed == 0) {
                }
                if (eykVarM33067to != null) {
                }
                eykVarM33064k4.m31454k4(iSlideShowTransition.getAdvanceOnClick());
                if (iSlideShowTransition.getAdvanceAfter()) {
                }
                soundMode = iSlideShowTransition.getSoundMode();
                if (soundMode != 0) {
                }
                xxx xxxVarM2749k422222222222222222222222222 = ((SlideShowTransition) iSlideShowTransition).m2749k4();
                if (eykVarM33067to != null) {
                }
                eykVarM33064k4.m31459x1((String) null);
                if (eykVarM33067to != null) {
                }
                eykVarM33064k4.m31453k4(xxxVarM2749k422222222222222222222222222.m73642x1());
                return;
            case 27:
            case 28:
            case 29:
            case 30:
                v8e.m72093x1(iSlideShowTransition, (com.aspose.slides.internal.p332p7.fkw) eykVarM33067to.m31449k4("prism").m29542x1());
                eykVarM33064k4.m31449k4("fade");
                speed = iSlideShowTransition.getSpeed();
                if (speed == 0) {
                }
                if (eykVarM33067to != null) {
                }
                eykVarM33064k4.m31454k4(iSlideShowTransition.getAdvanceOnClick());
                if (iSlideShowTransition.getAdvanceAfter()) {
                }
                soundMode = iSlideShowTransition.getSoundMode();
                if (soundMode != 0) {
                }
                xxx xxxVarM2749k4222222222222222222222222222 = ((SlideShowTransition) iSlideShowTransition).m2749k4();
                if (eykVarM33067to != null) {
                }
                eykVarM33064k4.m31459x1((String) null);
                if (eykVarM33067to != null) {
                }
                eykVarM33064k4.m31453k4(xxxVarM2749k4222222222222222222222222222.m73642x1());
                return;
            case 31:
                str8 = "doors";
                fp4.m6247x1((IOrientationTransition) iSlideShowTransition.getValue(), (com.aspose.slides.internal.p332p7.l2o) eykVarM33067to.m31449k4(str8).m29542x1());
                eykVarM33064k4.m31449k4("fade");
                speed = iSlideShowTransition.getSpeed();
                if (speed == 0) {
                }
                if (eykVarM33067to != null) {
                }
                eykVarM33064k4.m31454k4(iSlideShowTransition.getAdvanceOnClick());
                if (iSlideShowTransition.getAdvanceAfter()) {
                }
                soundMode = iSlideShowTransition.getSoundMode();
                if (soundMode != 0) {
                }
                xxx xxxVarM2749k42222222222222222222222222222 = ((SlideShowTransition) iSlideShowTransition).m2749k4();
                if (eykVarM33067to != null) {
                }
                eykVarM33064k4.m31459x1((String) null);
                if (eykVarM33067to != null) {
                }
                eykVarM33064k4.m31453k4(xxxVarM2749k42222222222222222222222222222.m73642x1());
                return;
            case 32:
                str8 = "window";
                fp4.m6247x1((IOrientationTransition) iSlideShowTransition.getValue(), (com.aspose.slides.internal.p332p7.l2o) eykVarM33067to.m31449k4(str8).m29542x1());
                eykVarM33064k4.m31449k4("fade");
                speed = iSlideShowTransition.getSpeed();
                if (speed == 0) {
                }
                if (eykVarM33067to != null) {
                }
                eykVarM33064k4.m31454k4(iSlideShowTransition.getAdvanceOnClick());
                if (iSlideShowTransition.getAdvanceAfter()) {
                }
                soundMode = iSlideShowTransition.getSoundMode();
                if (soundMode != 0) {
                }
                xxx xxxVarM2749k422222222222222222222222222222 = ((SlideShowTransition) iSlideShowTransition).m2749k4();
                if (eykVarM33067to != null) {
                }
                eykVarM33064k4.m31459x1((String) null);
                if (eykVarM33067to != null) {
                }
                eykVarM33064k4.m31453k4(xxxVarM2749k422222222222222222222222222222.m73642x1());
                return;
            case 33:
                str6 = "ferris";
                pb4.m69009x1((ILeftRightDirectionTransition) iSlideShowTransition.getValue(), (com.aspose.slides.internal.p332p7.w7b) eykVarM33067to.m31449k4(str6).m29542x1());
                eykVarM33064k4.m31449k4("fade");
                speed = iSlideShowTransition.getSpeed();
                if (speed == 0) {
                }
                if (eykVarM33067to != null) {
                }
                eykVarM33064k4.m31454k4(iSlideShowTransition.getAdvanceOnClick());
                if (iSlideShowTransition.getAdvanceAfter()) {
                }
                soundMode = iSlideShowTransition.getSoundMode();
                if (soundMode != 0) {
                }
                xxx xxxVarM2749k4222222222222222222222222222222 = ((SlideShowTransition) iSlideShowTransition).m2749k4();
                if (eykVarM33067to != null) {
                }
                eykVarM33064k4.m31459x1((String) null);
                if (eykVarM33067to != null) {
                }
                eykVarM33064k4.m31453k4(xxxVarM2749k4222222222222222222222222222222.m73642x1());
                return;
            case 34:
                str6 = "gallery";
                pb4.m69009x1((ILeftRightDirectionTransition) iSlideShowTransition.getValue(), (com.aspose.slides.internal.p332p7.w7b) eykVarM33067to.m31449k4(str6).m29542x1());
                eykVarM33064k4.m31449k4("fade");
                speed = iSlideShowTransition.getSpeed();
                if (speed == 0) {
                }
                if (eykVarM33067to != null) {
                }
                eykVarM33064k4.m31454k4(iSlideShowTransition.getAdvanceOnClick());
                if (iSlideShowTransition.getAdvanceAfter()) {
                }
                soundMode = iSlideShowTransition.getSoundMode();
                if (soundMode != 0) {
                }
                xxx xxxVarM2749k42222222222222222222222222222222 = ((SlideShowTransition) iSlideShowTransition).m2749k4();
                if (eykVarM33067to != null) {
                }
                eykVarM33064k4.m31459x1((String) null);
                if (eykVarM33067to != null) {
                }
                eykVarM33064k4.m31453k4(xxxVarM2749k42222222222222222222222222222222.m73642x1());
                return;
            case 35:
                str6 = "conveyor";
                pb4.m69009x1((ILeftRightDirectionTransition) iSlideShowTransition.getValue(), (com.aspose.slides.internal.p332p7.w7b) eykVarM33067to.m31449k4(str6).m29542x1());
                eykVarM33064k4.m31449k4("fade");
                speed = iSlideShowTransition.getSpeed();
                if (speed == 0) {
                }
                if (eykVarM33067to != null) {
                }
                eykVarM33064k4.m31454k4(iSlideShowTransition.getAdvanceOnClick());
                if (iSlideShowTransition.getAdvanceAfter()) {
                }
                soundMode = iSlideShowTransition.getSoundMode();
                if (soundMode != 0) {
                }
                xxx xxxVarM2749k422222222222222222222222222222222 = ((SlideShowTransition) iSlideShowTransition).m2749k4();
                if (eykVarM33067to != null) {
                }
                eykVarM33064k4.m31459x1((String) null);
                if (eykVarM33067to != null) {
                }
                eykVarM33064k4.m31453k4(xxxVarM2749k422222222222222222222222222222222.m73642x1());
                return;
            case 36:
                str5 = "pan";
                cs2.m4803x1((ISideDirectionTransition) iSlideShowTransition.getValue(), (com.aspose.slides.internal.p332p7.zfd) eykVarM33067to.m31449k4(str5).m29542x1());
                eykVarM33064k4.m31449k4("fade");
                speed = iSlideShowTransition.getSpeed();
                if (speed == 0) {
                }
                if (eykVarM33067to != null) {
                }
                eykVarM33064k4.m31454k4(iSlideShowTransition.getAdvanceOnClick());
                if (iSlideShowTransition.getAdvanceAfter()) {
                }
                soundMode = iSlideShowTransition.getSoundMode();
                if (soundMode != 0) {
                }
                xxx xxxVarM2749k4222222222222222222222222222222222 = ((SlideShowTransition) iSlideShowTransition).m2749k4();
                if (eykVarM33067to != null) {
                }
                eykVarM33064k4.m31459x1((String) null);
                if (eykVarM33067to != null) {
                }
                eykVarM33064k4.m31453k4(xxxVarM2749k4222222222222222222222222222222222.m73642x1());
                return;
            case 37:
                C14639uk.m71713x1((IGlitterTransition) iSlideShowTransition.getValue(), (com.aspose.slides.internal.p332p7.gu5) eykVarM33067to.m31449k4("glitter").m29542x1());
                eykVarM33064k4.m31449k4("fade");
                speed = iSlideShowTransition.getSpeed();
                if (speed == 0) {
                }
                if (eykVarM33067to != null) {
                }
                eykVarM33064k4.m31454k4(iSlideShowTransition.getAdvanceOnClick());
                if (iSlideShowTransition.getAdvanceAfter()) {
                }
                soundMode = iSlideShowTransition.getSoundMode();
                if (soundMode != 0) {
                }
                xxx xxxVarM2749k42222222222222222222222222222222222 = ((SlideShowTransition) iSlideShowTransition).m2749k4();
                if (eykVarM33067to != null) {
                }
                eykVarM33064k4.m31459x1((String) null);
                if (eykVarM33067to != null) {
                }
                eykVarM33064k4.m31453k4(xxxVarM2749k42222222222222222222222222222222222.m73642x1());
                return;
            case 38:
                hlw.m7220x1((IInOutTransition) iSlideShowTransition.getValue(), (com.aspose.slides.internal.p332p7.dqx) eykVarM33067to.m31449k4("warp").m29542x1());
                eykVarM33064k4.m31449k4("fade");
                speed = iSlideShowTransition.getSpeed();
                if (speed == 0) {
                }
                if (eykVarM33067to != null) {
                }
                eykVarM33064k4.m31454k4(iSlideShowTransition.getAdvanceOnClick());
                if (iSlideShowTransition.getAdvanceAfter()) {
                }
                soundMode = iSlideShowTransition.getSoundMode();
                if (soundMode != 0) {
                }
                xxx xxxVarM2749k422222222222222222222222222222222222 = ((SlideShowTransition) iSlideShowTransition).m2749k4();
                if (eykVarM33067to != null) {
                }
                eykVarM33064k4.m31459x1((String) null);
                if (eykVarM33067to != null) {
                }
                eykVarM33064k4.m31453k4(xxxVarM2749k422222222222222222222222222222222222.m73642x1());
                return;
            case 39:
                C0937ed.m5431x1((IFlyThroughTransition) iSlideShowTransition.getValue(), (com.aspose.slides.internal.p332p7.u9b) eykVarM33067to.m31449k4("flythrough").m29542x1());
                eykVarM33064k4.m31449k4("fade");
                speed = iSlideShowTransition.getSpeed();
                if (speed == 0) {
                }
                if (eykVarM33067to != null) {
                }
                eykVarM33064k4.m31454k4(iSlideShowTransition.getAdvanceOnClick());
                if (iSlideShowTransition.getAdvanceAfter()) {
                }
                soundMode = iSlideShowTransition.getSoundMode();
                if (soundMode != 0) {
                }
                xxx xxxVarM2749k4222222222222222222222222222222222222 = ((SlideShowTransition) iSlideShowTransition).m2749k4();
                if (eykVarM33067to != null) {
                }
                eykVarM33064k4.m31459x1((String) null);
                if (eykVarM33067to != null) {
                }
                eykVarM33064k4.m31453k4(xxxVarM2749k4222222222222222222222222222222222222.m73642x1());
                return;
            case 40:
                str7 = "flash";
                eykVarM33067to.m31449k4(str7);
                eykVarM33064k4.m31449k4("fade");
                speed = iSlideShowTransition.getSpeed();
                if (speed == 0) {
                }
                if (eykVarM33067to != null) {
                }
                eykVarM33064k4.m31454k4(iSlideShowTransition.getAdvanceOnClick());
                if (iSlideShowTransition.getAdvanceAfter()) {
                }
                soundMode = iSlideShowTransition.getSoundMode();
                if (soundMode != 0) {
                }
                xxx xxxVarM2749k42222222222222222222222222222222222222 = ((SlideShowTransition) iSlideShowTransition).m2749k4();
                if (eykVarM33067to != null) {
                }
                eykVarM33064k4.m31459x1((String) null);
                if (eykVarM33067to != null) {
                }
                eykVarM33064k4.m31453k4(xxxVarM2749k42222222222222222222222222222222222222.m73642x1());
                return;
            case 41:
                kwd.m64224x1((IShredTransition) iSlideShowTransition.getValue(), (com.aspose.slides.internal.p332p7.kup) eykVarM33067to.m31449k4("shred").m29542x1());
                eykVarM33064k4.m31449k4("fade");
                speed = iSlideShowTransition.getSpeed();
                if (speed == 0) {
                }
                if (eykVarM33067to != null) {
                }
                eykVarM33064k4.m31454k4(iSlideShowTransition.getAdvanceOnClick());
                if (iSlideShowTransition.getAdvanceAfter()) {
                }
                soundMode = iSlideShowTransition.getSoundMode();
                if (soundMode != 0) {
                }
                xxx xxxVarM2749k422222222222222222222222222222222222222 = ((SlideShowTransition) iSlideShowTransition).m2749k4();
                if (eykVarM33067to != null) {
                }
                eykVarM33064k4.m31459x1((String) null);
                if (eykVarM33067to != null) {
                }
                eykVarM33064k4.m31453k4(xxxVarM2749k422222222222222222222222222222222222222.m73642x1());
                return;
            case 42:
                lgn.m64390x1((IRevealTransition) iSlideShowTransition.getValue(), (com.aspose.slides.internal.p332p7.xx9) eykVarM33067to.m31449k4("reveal").m29542x1());
                eykVarM33064k4.m31449k4("fade");
                speed = iSlideShowTransition.getSpeed();
                if (speed == 0) {
                }
                if (eykVarM33067to != null) {
                }
                eykVarM33064k4.m31454k4(iSlideShowTransition.getAdvanceOnClick());
                if (iSlideShowTransition.getAdvanceAfter()) {
                }
                soundMode = iSlideShowTransition.getSoundMode();
                if (soundMode != 0) {
                }
                xxx xxxVarM2749k4222222222222222222222222222222222222222 = ((SlideShowTransition) iSlideShowTransition).m2749k4();
                if (eykVarM33067to != null) {
                }
                eykVarM33064k4.m31459x1((String) null);
                if (eykVarM33067to != null) {
                }
                eykVarM33064k4.m31453k4(xxxVarM2749k4222222222222222222222222222222222222222.m73642x1());
                return;
            case 43:
                a7o.m3359x1((IWheelTransition) iSlideShowTransition.getValue(), (com.aspose.slides.internal.p332p7.dei) eykVarM33067to.m31449k4("wheelReverse").m29542x1());
                eykVarM33064k4.m31449k4("fade");
                speed = iSlideShowTransition.getSpeed();
                if (speed == 0) {
                }
                if (eykVarM33067to != null) {
                }
                eykVarM33064k4.m31454k4(iSlideShowTransition.getAdvanceOnClick());
                if (iSlideShowTransition.getAdvanceAfter()) {
                }
                soundMode = iSlideShowTransition.getSoundMode();
                if (soundMode != 0) {
                }
                xxx xxxVarM2749k42222222222222222222222222222222222222222 = ((SlideShowTransition) iSlideShowTransition).m2749k4();
                if (eykVarM33067to != null) {
                }
                eykVarM33064k4.m31459x1((String) null);
                if (eykVarM33067to != null) {
                }
                eykVarM33064k4.m31453k4(xxxVarM2749k42222222222222222222222222222222222222222.m73642x1());
                return;
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
                rri.m70332x1(iSlideShowTransition, (com.aspose.slides.internal.p332p7.t9m) eykVarM33065kk.m31449k4("prstTrans").m29542x1());
                eykVarM33064k4.m31449k4("fade");
                speed = iSlideShowTransition.getSpeed();
                if (speed == 0) {
                }
                if (eykVarM33067to != null) {
                }
                eykVarM33064k4.m31454k4(iSlideShowTransition.getAdvanceOnClick());
                if (iSlideShowTransition.getAdvanceAfter()) {
                }
                soundMode = iSlideShowTransition.getSoundMode();
                if (soundMode != 0) {
                }
                xxx xxxVarM2749k422222222222222222222222222222222222222222 = ((SlideShowTransition) iSlideShowTransition).m2749k4();
                if (eykVarM33067to != null) {
                }
                eykVarM33064k4.m31459x1((String) null);
                if (eykVarM33067to != null) {
                }
                eykVarM33064k4.m31453k4(xxxVarM2749k422222222222222222222222222222222222222222.m73642x1());
                return;
            case 56:
                j6m.m63232x1((IMorphTransition) iSlideShowTransition.getValue(), (com.aspose.slides.internal.p332p7.q7e) eykVarM33068x1.m31449k4("morph").m29542x1());
                eykVarM33064k4.m31449k4("fade");
                speed = iSlideShowTransition.getSpeed();
                if (speed == 0) {
                }
                if (eykVarM33067to != null) {
                }
                eykVarM33064k4.m31454k4(iSlideShowTransition.getAdvanceOnClick());
                if (iSlideShowTransition.getAdvanceAfter()) {
                }
                soundMode = iSlideShowTransition.getSoundMode();
                if (soundMode != 0) {
                }
                xxx xxxVarM2749k4222222222222222222222222222222222222222222 = ((SlideShowTransition) iSlideShowTransition).m2749k4();
                if (eykVarM33067to != null) {
                }
                eykVarM33064k4.m31459x1((String) null);
                if (eykVarM33067to != null) {
                }
                eykVarM33064k4.m31453k4(xxxVarM2749k4222222222222222222222222222222222222222222.m73642x1());
                return;
            default:
                throw new Exception();
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m69500k4(ISlideShowTransition iSlideShowTransition, com.aspose.slides.internal.p332p7.wnb wnbVar, u8s u8sVar) {
        com.aspose.slides.internal.p332p7.x5o x5oVar = (com.aspose.slides.internal.p332p7.x5o) wnbVar.m43834k4("stSnd").m29542x1();
        x5oVar.m44211k4(iSlideShowTransition.getSoundLoop());
        if (iSlideShowTransition.getSound() != null) {
            x5oVar.m44213x1().m38956x1(iSlideShowTransition.getSoundName());
        }
        x5oVar.m44213x1().m38953k4(iSlideShowTransition.getSoundIsBuiltIn());
        x5oVar.m44213x1().m38952k4(u8sVar.m55433g8().m55311x1(u8sVar.m71538k4(iSlideShowTransition.getSound())).m55289du());
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m69501k4(ISlideShowTransition iSlideShowTransition) {
        boolean z;
        if (m69503x1(iSlideShowTransition) || m69502kk(iSlideShowTransition)) {
            return false;
        }
        switch (iSlideShowTransition.getType()) {
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
                z = true;
                break;
            default:
                z = false;
                break;
        }
        xxx xxxVarM2749k4 = ((SlideShowTransition) iSlideShowTransition).m2749k4();
        return z || (xxxVarM2749k4.m73637k4() != null && !"1000".equals(xxxVarM2749k4.m73637k4()));
    }
}
