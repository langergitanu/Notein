package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: loaded from: classes3.dex */
class rri {

    /* JADX INFO: renamed from: k4 */
    private static final C7017h4 f48685k4 = new C7017h4("fallOver", "drape", "curtains", "wind", "prestige", "fracture", "crush", "peelOff", "pageCurlDouble", "pageCurlSingle", "airplane", "origami");

    /* JADX INFO: renamed from: k4 */
    public static void m70331k4(ISlideShowTransition iSlideShowTransition, com.aspose.slides.internal.p332p7.t9m t9mVar) {
        if (t9mVar == null) {
            return;
        }
        switch (f48685k4.m27428k4(t9mVar.m41613k4())) {
            case 0:
                iSlideShowTransition.setType(44);
                ((LeftRightDirectionTransition) iSlideShowTransition.getValue()).setDirection(t9mVar.m41616x1() ? 1 : 0);
                return;
            case 1:
                iSlideShowTransition.setType(45);
                ((LeftRightDirectionTransition) iSlideShowTransition.getValue()).setDirection(t9mVar.m41616x1() ? 1 : 0);
                return;
            case 2:
                iSlideShowTransition.setType(46);
                return;
            case 3:
                iSlideShowTransition.setType(47);
                ((LeftRightDirectionTransition) iSlideShowTransition.getValue()).setDirection(!t9mVar.m41616x1() ? 1 : 0);
                return;
            case 4:
                iSlideShowTransition.setType(48);
                return;
            case 5:
                iSlideShowTransition.setType(49);
                return;
            case 6:
                iSlideShowTransition.setType(50);
                return;
            case 7:
                iSlideShowTransition.setType(51);
                ((LeftRightDirectionTransition) iSlideShowTransition.getValue()).setDirection(t9mVar.m41616x1() ? 1 : 0);
                return;
            case 8:
                iSlideShowTransition.setType(52);
                ((LeftRightDirectionTransition) iSlideShowTransition.getValue()).setDirection(t9mVar.m41616x1() ? 1 : 0);
                return;
            case 9:
                iSlideShowTransition.setType(53);
                ((LeftRightDirectionTransition) iSlideShowTransition.getValue()).setDirection(t9mVar.m41616x1() ? 1 : 0);
                return;
            case 10:
                iSlideShowTransition.setType(54);
                ((LeftRightDirectionTransition) iSlideShowTransition.getValue()).setDirection(!t9mVar.m41616x1() ? 1 : 0);
                return;
            case 11:
                iSlideShowTransition.setType(55);
                ((LeftRightDirectionTransition) iSlideShowTransition.getValue()).setDirection(!t9mVar.m41616x1() ? 1 : 0);
                return;
            default:
                throw new ArgumentException(C14113y2.m67408k4("Unknown preset \"", t9mVar.m41613k4(), "\""));
        }
    }

    /* JADX INFO: renamed from: x1 */
    public static void m70332x1(ISlideShowTransition iSlideShowTransition, com.aspose.slides.internal.p332p7.t9m t9mVar) {
        String str;
        switch (iSlideShowTransition.getType()) {
            case 44:
                t9mVar.m41614k4("fallOver");
                t9mVar.m41615k4(((LeftRightDirectionTransition) iSlideShowTransition.getValue()).getDirection() == 1);
                return;
            case 45:
                t9mVar.m41614k4("drape");
                t9mVar.m41615k4(((LeftRightDirectionTransition) iSlideShowTransition.getValue()).getDirection() == 1);
                return;
            case 46:
                str = "curtains";
                break;
            case 47:
                t9mVar.m41614k4("wind");
                t9mVar.m41615k4(((LeftRightDirectionTransition) iSlideShowTransition.getValue()).getDirection() == 0);
                return;
            case 48:
                str = "prestige";
                break;
            case 49:
                str = "fracture";
                break;
            case 50:
                str = "crush";
                break;
            case 51:
                t9mVar.m41614k4("peelOff");
                t9mVar.m41615k4(((LeftRightDirectionTransition) iSlideShowTransition.getValue()).getDirection() == 1);
                return;
            case 52:
                t9mVar.m41614k4("pageCurlDouble");
                t9mVar.m41615k4(((LeftRightDirectionTransition) iSlideShowTransition.getValue()).getDirection() == 1);
                return;
            case 53:
                t9mVar.m41614k4("pageCurlSingle");
                t9mVar.m41615k4(((LeftRightDirectionTransition) iSlideShowTransition.getValue()).getDirection() == 1);
                return;
            case 54:
                t9mVar.m41614k4("airplane");
                t9mVar.m41615k4(((LeftRightDirectionTransition) iSlideShowTransition.getValue()).getDirection() == 0);
                return;
            case 55:
                t9mVar.m41614k4("origami");
                t9mVar.m41615k4(((LeftRightDirectionTransition) iSlideShowTransition.getValue()).getDirection() == 0);
                return;
            default:
                throw new ArgumentException(C14113y2.m67408k4("Unknown preset transition type \"", t9mVar.m41613k4(), "\""));
        }
        t9mVar.m41614k4(str);
    }
}
