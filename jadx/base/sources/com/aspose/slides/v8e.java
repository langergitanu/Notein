package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;

/* JADX INFO: loaded from: classes3.dex */
class v8e {
    /* JADX INFO: renamed from: k4 */
    public static void m72092k4(ISlideShowTransition iSlideShowTransition, com.aspose.slides.internal.p332p7.fkw fkwVar) {
        int i;
        if (fkwVar == null) {
            return;
        }
        if (!fkwVar.m31820x1() && !fkwVar.m31818kk()) {
            i = 27;
        } else if (!fkwVar.m31820x1() && fkwVar.m31818kk()) {
            i = 28;
        } else {
            if (!fkwVar.m31820x1() || fkwVar.m31818kk()) {
                if (fkwVar.m31820x1() && fkwVar.m31818kk()) {
                    i = 30;
                }
                ((SideDirectionTransition) iSlideShowTransition.getValue()).setDirection(fkwVar.m31815k4());
            }
            i = 29;
        }
        iSlideShowTransition.setType(i);
        ((SideDirectionTransition) iSlideShowTransition.getValue()).setDirection(fkwVar.m31815k4());
    }

    /* JADX INFO: renamed from: x1 */
    public static void m72093x1(ISlideShowTransition iSlideShowTransition, com.aspose.slides.internal.p332p7.fkw fkwVar) {
        switch (iSlideShowTransition.getType()) {
            case 27:
                fkwVar.m31817k4(false);
                fkwVar.m31819x1(false);
                fkwVar.m31816k4(((SideDirectionTransition) iSlideShowTransition.getValue()).getDirection());
                return;
            case 28:
                fkwVar.m31817k4(false);
                fkwVar.m31819x1(true);
                fkwVar.m31816k4(((SideDirectionTransition) iSlideShowTransition.getValue()).getDirection());
                return;
            case 29:
                fkwVar.m31817k4(true);
                fkwVar.m31819x1(false);
                fkwVar.m31816k4(((SideDirectionTransition) iSlideShowTransition.getValue()).getDirection());
                return;
            case 30:
                fkwVar.m31817k4(true);
                fkwVar.m31819x1(true);
                fkwVar.m31816k4(((SideDirectionTransition) iSlideShowTransition.getValue()).getDirection());
                return;
            default:
                throw new ArgumentOutOfRangeException();
        }
    }
}
