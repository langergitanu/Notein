package com.aspose.slides;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p407st.C10556n5;
import com.aspose.slides.internal.p407st.C10659tx;
import com.aspose.slides.internal.p407st.C10738yu;
import com.aspose.slides.p559ms.System.AbstractC14092to;

/* JADX INFO: loaded from: classes3.dex */
class cn8 {

    /* JADX INFO: renamed from: k4 */
    private static final int[] f4391k4 = {6, 14, 1, 2, 5, 8, 9, 12, 15, 17, 20, 21, 0, 16, 0, 0, 0, 7, 11, 18, 13, 4, 10, 9, 0, 0, 19, 3};

    /* JADX INFO: renamed from: k4 */
    private static int m4688k4(C10738yu c10738yu) {
        if ((c10738yu.m52103du() & 255) == 0 && (c10738yu.m52112to() & 255) == 2) {
            return 0;
        }
        int iM52103du = c10738yu.m52103du() & 255;
        int[] iArr = f4391k4;
        if (iM52103du < iArr.length) {
            return iArr[c10738yu.m52103du() & 255];
        }
        return 0;
    }

    /* JADX INFO: renamed from: x1 */
    private static void m4694x1(ISlideShowTransition iSlideShowTransition, C10738yu c10738yu) {
        switch (iSlideShowTransition.getType()) {
            case 1:
                c10738yu.m52106k4((byte) (((OrientationTransition) C7019kk.m27452k4((Object) iSlideShowTransition.getValue(), OrientationTransition.class)).getDirection() == 0 ? 1 : 0));
                break;
            case 2:
            case 4:
            case 15:
                c10738yu.m52106k4((byte) (((OrientationTransition) C7019kk.m27452k4((Object) iSlideShowTransition.getValue(), OrientationTransition.class)).getDirection() == 1 ? 1 : 0));
                break;
            case 5:
            case 12:
                switch (((EightDirectionTransition) C7019kk.m27452k4((Object) iSlideShowTransition.getValue(), EightDirectionTransition.class)).getDirection()) {
                    case 0:
                        c10738yu.m52106k4((byte) 6);
                        break;
                    case 1:
                        c10738yu.m52106k4((byte) 4);
                        break;
                    case 2:
                        c10738yu.m52106k4((byte) 7);
                        break;
                    case 3:
                        c10738yu.m52106k4((byte) 5);
                        break;
                    case 4:
                        c10738yu.m52106k4((byte) 0);
                        break;
                    case 5:
                        c10738yu.m52106k4((byte) 1);
                        break;
                    case 6:
                        c10738yu.m52106k4((byte) 3);
                        break;
                    case 7:
                        c10738yu.m52106k4((byte) 2);
                        break;
                }
                break;
            case 6:
                c10738yu.m52106k4(((OptionalBlackTransition) C7019kk.m27452k4((Object) iSlideShowTransition.getValue(), OptionalBlackTransition.class)).getFromBlack() ? (byte) 1 : (byte) 0);
                break;
            case 9:
                c10738yu.m52114x1((byte) (((OptionalBlackTransition) C7019kk.m27452k4((Object) iSlideShowTransition.getValue(), OptionalBlackTransition.class)).getFromBlack() ? 6 : 23));
                c10738yu.m52106k4((byte) 0);
                break;
            case 13:
            case 20:
                int direction = ((SideDirectionTransition) C7019kk.m27452k4((Object) iSlideShowTransition.getValue(), SideDirectionTransition.class)).getDirection();
                if (direction == 0) {
                    c10738yu.m52106k4((byte) 0);
                    break;
                } else if (direction == 1) {
                    c10738yu.m52106k4((byte) 1);
                    break;
                } else if (direction == 2) {
                    c10738yu.m52106k4((byte) 3);
                    break;
                } else if (direction == 3) {
                    c10738yu.m52106k4((byte) 2);
                    break;
                }
                break;
            case 16:
                SplitTransition splitTransition = (SplitTransition) C7019kk.m27452k4((Object) iSlideShowTransition.getValue(), SplitTransition.class);
                byte orientation = splitTransition.getOrientation();
                int direction2 = splitTransition.getDirection();
                if (orientation != 0) {
                    c10738yu.m52106k4((byte) (direction2 != 0 ? 2 : 3));
                } else {
                    c10738yu.m52106k4((byte) (direction2 == 0 ? 1 : 0));
                }
                break;
            case 17:
                int direction3 = ((CornerDirectionTransition) C7019kk.m27452k4((Object) iSlideShowTransition.getValue(), CornerDirectionTransition.class)).getDirection();
                if (direction3 == 0) {
                    c10738yu.m52106k4((byte) 6);
                    break;
                } else if (direction3 == 1) {
                    c10738yu.m52106k4((byte) 4);
                    break;
                } else if (direction3 == 2) {
                    c10738yu.m52106k4((byte) 7);
                    break;
                } else if (direction3 == 3) {
                    c10738yu.m52106k4((byte) 5);
                    break;
                }
                break;
            case 19:
                c10738yu.m52106k4((byte) ((WheelTransition) C7019kk.m27452k4((Object) iSlideShowTransition.getValue(), WheelTransition.class)).getSpokes());
                break;
            case 21:
                c10738yu.m52106k4((byte) (((InOutTransition) C7019kk.m27452k4((Object) iSlideShowTransition.getValue(), InOutTransition.class)).getDirection() == 0 ? 1 : 0));
                break;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m4689k4(ISlideShowTransition iSlideShowTransition, C10738yu c10738yu) {
        switch (iSlideShowTransition.getType()) {
            case 1:
                OrientationTransition orientationTransition = (OrientationTransition) C7019kk.m27452k4((Object) iSlideShowTransition.getValue(), OrientationTransition.class);
                byte bM52112to = c10738yu.m52112to();
                if (bM52112to == 0) {
                    orientationTransition.setDirection((byte) 1);
                    break;
                } else if (bM52112to == 1) {
                    orientationTransition.setDirection((byte) 0);
                    break;
                }
                break;
            case 2:
                OrientationTransition orientationTransition2 = (OrientationTransition) C7019kk.m27452k4((Object) iSlideShowTransition.getValue(), OrientationTransition.class);
                byte bM52112to2 = c10738yu.m52112to();
                if (bM52112to2 == 0) {
                    orientationTransition2.setDirection((byte) 0);
                    break;
                } else if (bM52112to2 == 1) {
                    orientationTransition2.setDirection((byte) 1);
                    break;
                }
                break;
            case 4:
                OrientationTransition orientationTransition3 = (OrientationTransition) C7019kk.m27452k4((Object) iSlideShowTransition.getValue(), OrientationTransition.class);
                byte bM52112to3 = c10738yu.m52112to();
                if (bM52112to3 == 0) {
                    orientationTransition3.setDirection((byte) 0);
                    break;
                } else if (bM52112to3 == 1) {
                    orientationTransition3.setDirection((byte) 1);
                    break;
                }
                break;
            case 5:
                EightDirectionTransition eightDirectionTransition = (EightDirectionTransition) C7019kk.m27452k4((Object) iSlideShowTransition.getValue(), EightDirectionTransition.class);
                switch (c10738yu.m52112to()) {
                    case 0:
                        eightDirectionTransition.setDirection(4);
                        break;
                    case 1:
                        eightDirectionTransition.setDirection(5);
                        break;
                    case 2:
                        eightDirectionTransition.setDirection(7);
                        break;
                    case 3:
                        eightDirectionTransition.setDirection(6);
                        break;
                    case 4:
                        eightDirectionTransition.setDirection(1);
                        break;
                    case 5:
                        eightDirectionTransition.setDirection(3);
                        break;
                    case 6:
                        eightDirectionTransition.setDirection(0);
                        break;
                    case 7:
                        eightDirectionTransition.setDirection(2);
                        break;
                }
                break;
            case 6:
                ((OptionalBlackTransition) C7019kk.m27452k4((Object) iSlideShowTransition.getValue(), OptionalBlackTransition.class)).setFromBlack((c10738yu.m52112to() & 255) == 1);
                break;
            case 9:
                ((OptionalBlackTransition) C7019kk.m27452k4((Object) iSlideShowTransition.getValue(), OptionalBlackTransition.class)).setFromBlack((c10738yu.m52103du() & 255) == 6);
                break;
            case 12:
                EightDirectionTransition eightDirectionTransition2 = (EightDirectionTransition) C7019kk.m27452k4((Object) iSlideShowTransition.getValue(), EightDirectionTransition.class);
                switch (c10738yu.m52112to()) {
                    case 0:
                        eightDirectionTransition2.setDirection(4);
                        break;
                    case 1:
                        eightDirectionTransition2.setDirection(5);
                        break;
                    case 2:
                        eightDirectionTransition2.setDirection(7);
                        break;
                    case 3:
                        eightDirectionTransition2.setDirection(6);
                        break;
                    case 4:
                        eightDirectionTransition2.setDirection(1);
                        break;
                    case 5:
                        eightDirectionTransition2.setDirection(3);
                        break;
                    case 6:
                        eightDirectionTransition2.setDirection(0);
                        break;
                    case 7:
                        eightDirectionTransition2.setDirection(2);
                        break;
                }
                break;
            case 13:
                SideDirectionTransition sideDirectionTransition = (SideDirectionTransition) C7019kk.m27452k4((Object) iSlideShowTransition.getValue(), SideDirectionTransition.class);
                byte bM52112to4 = c10738yu.m52112to();
                if (bM52112to4 == 0) {
                    sideDirectionTransition.setDirection(0);
                    break;
                } else if (bM52112to4 == 1) {
                    sideDirectionTransition.setDirection(1);
                    break;
                } else if (bM52112to4 == 2) {
                    sideDirectionTransition.setDirection(3);
                    break;
                } else if (bM52112to4 == 3) {
                    sideDirectionTransition.setDirection(2);
                    break;
                }
                break;
            case 15:
                OrientationTransition orientationTransition4 = (OrientationTransition) C7019kk.m27452k4((Object) iSlideShowTransition.getValue(), OrientationTransition.class);
                byte bM52112to5 = c10738yu.m52112to();
                if (bM52112to5 == 0) {
                    orientationTransition4.setDirection((byte) 0);
                    break;
                } else if (bM52112to5 == 1) {
                    orientationTransition4.setDirection((byte) 1);
                    break;
                }
                break;
            case 16:
                SplitTransition splitTransition = (SplitTransition) C7019kk.m27452k4((Object) iSlideShowTransition.getValue(), SplitTransition.class);
                byte bM52112to6 = c10738yu.m52112to();
                if (bM52112to6 == 0) {
                    splitTransition.setOrientation((byte) 0);
                    splitTransition.setDirection(1);
                    break;
                } else if (bM52112to6 == 1) {
                    splitTransition.setOrientation((byte) 0);
                    splitTransition.setDirection(0);
                    break;
                } else if (bM52112to6 == 2) {
                    splitTransition.setOrientation((byte) 1);
                    splitTransition.setDirection(1);
                    break;
                } else if (bM52112to6 == 3) {
                    splitTransition.setOrientation((byte) 1);
                    splitTransition.setDirection(0);
                    break;
                }
                break;
            case 17:
                CornerDirectionTransition cornerDirectionTransition = (CornerDirectionTransition) C7019kk.m27452k4((Object) iSlideShowTransition.getValue(), CornerDirectionTransition.class);
                byte bM52112to7 = c10738yu.m52112to();
                if (bM52112to7 == 4) {
                    cornerDirectionTransition.setDirection(1);
                    break;
                } else if (bM52112to7 == 5) {
                    cornerDirectionTransition.setDirection(3);
                    break;
                } else if (bM52112to7 == 6) {
                    cornerDirectionTransition.setDirection(0);
                    break;
                } else if (bM52112to7 == 7) {
                    cornerDirectionTransition.setDirection(2);
                    break;
                }
                break;
            case 19:
                WheelTransition wheelTransition = (WheelTransition) C7019kk.m27452k4((Object) iSlideShowTransition.getValue(), WheelTransition.class);
                if ((c10738yu.m52112to() & 255) == 1 || (c10738yu.m52112to() & 255) == 2 || (c10738yu.m52112to() & 255) == 3 || (c10738yu.m52112to() & 255) == 4 || (c10738yu.m52112to() & 255) == 8) {
                    wheelTransition.setSpokes(c10738yu.m52112to() & 255);
                }
                break;
            case 20:
                SideDirectionTransition sideDirectionTransition2 = (SideDirectionTransition) C7019kk.m27452k4((Object) iSlideShowTransition.getValue(), SideDirectionTransition.class);
                byte bM52112to8 = c10738yu.m52112to();
                if (bM52112to8 == 0) {
                    sideDirectionTransition2.setDirection(0);
                    break;
                } else if (bM52112to8 == 1) {
                    sideDirectionTransition2.setDirection(1);
                    break;
                } else if (bM52112to8 == 2) {
                    sideDirectionTransition2.setDirection(3);
                    break;
                } else if (bM52112to8 == 3) {
                    sideDirectionTransition2.setDirection(2);
                    break;
                }
                break;
            case 21:
                InOutTransition inOutTransition = (InOutTransition) C7019kk.m27452k4((Object) iSlideShowTransition.getValue(), InOutTransition.class);
                byte bM52112to9 = c10738yu.m52112to();
                if (bM52112to9 == 0) {
                    inOutTransition.setDirection(1);
                    break;
                } else if (bM52112to9 == 1) {
                    inOutTransition.setDirection(0);
                    break;
                }
                break;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m4690k4(C10738yu c10738yu, char c, boolean z) {
        int iM52105h4;
        int i = 1 << (c - 'A');
        if (z) {
            iM52105h4 = (i & 65535) | (c10738yu.m52105h4() & 65535);
        } else {
            iM52105h4 = (~(i & 65535)) & c10738yu.m52105h4() & 65535;
        }
        c10738yu.m52110kk(iM52105h4 & 65535);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m4691k4(m4c m4cVar) {
        BaseSlide baseSlideM64735up = m4cVar.m64735up();
        a3u a3uVarM64712du = m4cVar.m64712du();
        C10738yu c10738yuM64742x6 = m4cVar.m64742x6();
        ISlideShowTransition slideShowTransition = baseSlideM64735up.getSlideShowTransition();
        if (c10738yuM64742x6 == null) {
            return;
        }
        if (C7019kk.m27469x1(baseSlideM64735up, Slide.class)) {
            ((Slide) baseSlideM64735up).setHidden(m4693k4(c10738yuM64742x6, 'C'));
        }
        slideShowTransition.setAdvanceOnClick(m4693k4(c10738yuM64742x6, 'A'));
        if (m4693k4(c10738yuM64742x6, 'K')) {
            slideShowTransition.setAdvanceAfterTime(((long) c10738yuM64742x6.m52113x1()) & 4294967295L);
        } else {
            slideShowTransition.setAdvanceAfterTime(0L);
            slideShowTransition.setAdvanceAfter(false);
        }
        if (c10738yuM64742x6.m52108kk() != 0 && a3uVarM64712du.m71950kk().m50965m9().m51705jd() != null) {
            C10659tx c10659txM51042k4 = a3uVarM64712du.m71950kk().m50965m9().m51705jd().m51042k4(c10738yuM64742x6.m52108kk());
            if (c10659txM51042k4.m51784h4() != null) {
                ((SlideShowTransition) slideShowTransition).m2751x1().m72060k4(4294967295L & ((long) c10738yuM64742x6.m52108kk()));
                slideShowTransition.setSound(a3uVarM64712du.m3179k4(c10659txM51042k4));
                slideShowTransition.setSoundIsBuiltIn(false);
            }
        }
        slideShowTransition.setSoundLoop(m4693k4(c10738yuM64742x6, 'G'));
        if (m4693k4(c10738yuM64742x6, 'I')) {
            slideShowTransition.setSoundMode(1);
        } else if (m4693k4(c10738yuM64742x6, 'E')) {
            slideShowTransition.setSoundMode(0);
        } else {
            slideShowTransition.setSoundMode(-1);
        }
        slideShowTransition.setType(m4688k4(c10738yuM64742x6));
        m4689k4(slideShowTransition, c10738yuM64742x6);
        byte bM52111m9 = c10738yuM64742x6.m52111m9();
        if (bM52111m9 == 0) {
            slideShowTransition.setSpeed(2);
        } else if (bM52111m9 == 1) {
            slideShowTransition.setSpeed(1);
        } else {
            if (bM52111m9 != 2) {
                return;
            }
            slideShowTransition.setSpeed(0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cb  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m4692k4(rpo rpoVar) {
        int speed;
        BaseSlide baseSlideM70235x1 = rpoVar.m70235x1();
        C10556n5 c10556n5 = (C10556n5) rpoVar.m70228to();
        y2n y2nVarM70215k4 = rpoVar.m70215k4();
        ISlideShowTransition slideShowTransition = baseSlideM70235x1.getSlideShowTransition();
        c10556n5.m50512x1(true);
        if (C7019kk.m27469x1(baseSlideM70235x1, Slide.class) && ((Slide) baseSlideM70235x1).getHidden()) {
            m4690k4(c10556n5.m51359ne(), 'C', true);
        }
        if (slideShowTransition.getType() == 0 && slideShowTransition.getSound() == null) {
            return;
        }
        C10738yu c10738yuM51359ne = c10556n5.m51359ne();
        c10738yuM51359ne.m52107k4((int) slideShowTransition.getAdvanceAfterTime());
        m4690k4(c10738yuM51359ne, 'K', slideShowTransition.getAdvanceAfter());
        m4690k4(c10738yuM51359ne, 'A', slideShowTransition.getAdvanceOnClick());
        if (slideShowTransition.getSound() != null) {
            c10738yuM51359ne.m52115x1(nmb.m68089k4(slideShowTransition.getSound(), y2nVarM70215k4));
        }
        m4690k4(c10738yuM51359ne, 'G', slideShowTransition.getSoundLoop());
        int soundMode = slideShowTransition.getSoundMode();
        if (soundMode != -1) {
            if (soundMode == 0) {
                m4690k4(c10738yuM51359ne, 'I', false);
                m4690k4(c10738yuM51359ne, 'E', true);
            } else if (soundMode == 1) {
                m4690k4(c10738yuM51359ne, 'I', true);
            }
            c10738yuM51359ne.m52114x1(slideShowTransition.getType() != 0 ? (byte) AbstractC14092to.m67252x1(AbstractC14092to.m67208k4((Object) f4391k4), Integer.valueOf(slideShowTransition.getType())) : (byte) -1);
            m4694x1(slideShowTransition, c10738yuM51359ne);
            speed = slideShowTransition.getSpeed();
            if (speed != 0) {
                c10738yuM51359ne.m52109kk((byte) 2);
            } else if (speed == 1) {
                c10738yuM51359ne.m52109kk((byte) 1);
            } else if (speed == 2) {
                c10738yuM51359ne.m52109kk((byte) 0);
            }
            c10738yuM51359ne.m52104dy();
        }
        m4690k4(c10738yuM51359ne, 'I', false);
        m4690k4(c10738yuM51359ne, 'E', false);
        c10738yuM51359ne.m52114x1(slideShowTransition.getType() != 0 ? (byte) AbstractC14092to.m67252x1(AbstractC14092to.m67208k4((Object) f4391k4), Integer.valueOf(slideShowTransition.getType())) : (byte) -1);
        m4694x1(slideShowTransition, c10738yuM51359ne);
        speed = slideShowTransition.getSpeed();
        if (speed != 0) {
        }
        c10738yuM51359ne.m52104dy();
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m4693k4(C10738yu c10738yu, char c) {
        return ((c10738yu.m52105h4() & 65535) & (1 << (c + 65471))) != 0;
    }
}
