package com.aspose.slides.internal.p071cz;

import com.aspose.slides.IGenericCloneable;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.p314oc.C7017h4;

/* JADX INFO: renamed from: com.aspose.slides.internal.cz.xw */
/* JADX INFO: loaded from: classes3.dex */
public final class C2971xw implements IGenericCloneable<C2971xw> {

    /* JADX INFO: renamed from: du */
    private static final C7017h4 f8807du = new C7017h4("isometricBottomDown", "isometricBottomUp", "isometricLeftDown", "isometricLeftUp", "isometricOffAxis1Left", "isometricOffAxis1Right", "isometricOffAxis1Top", "isometricOffAxis2Left", "isometricOffAxis2Right", "isometricOffAxis2Top", "isometricOffAxis3Bottom", "isometricOffAxis3Left", "isometricOffAxis3Right", "isometricOffAxis4Bottom", "isometricOffAxis4Left", "isometricOffAxis4Right", "isometricRightDown", "isometricRightUp", "isometricTopDown", "isometricTopUp", "legacyObliqueBottom", "legacyObliqueBottomLeft", "legacyObliqueBottomRight", "legacyObliqueFront", "legacyObliqueLeft", "legacyObliqueRight", "legacyObliqueTop", "legacyObliqueTopLeft", "legacyObliqueTopRight", "legacyPerspectiveBottom", "legacyPerspectiveBottomLeft", "legacyPerspectiveBottomRight", "legacyPerspectiveFront", "legacyPerspectiveLeft", "legacyPerspectiveRight", "legacyPerspectiveTop", "legacyPerspectiveTopLeft", "legacyPerspectiveTopRight", "obliqueBottom", "obliqueBottomLeft", "obliqueBottomRight", "obliqueLeft", "obliqueRight", "obliqueTop", "obliqueTopLeft", "obliqueTopRight", "orthographicFront", "perspectiveAbove", "perspectiveAboveLeftFacing", "perspectiveAboveRightFacing", "perspectiveBelow", "perspectiveContrastingLeftFacing", "perspectiveContrastingRightFacing", "perspectiveFront", "perspectiveHeroicExtremeLeftFacing", "perspectiveHeroicExtremeRightFacing", "perspectiveHeroicLeftFacing", "perspectiveHeroicRightFacing", "perspectiveLeft", "perspectiveRelaxed", "perspectiveRelaxedModerately", "perspectiveRight");

    /* JADX INFO: renamed from: k4 */
    private double f8808k4;

    /* JADX INFO: renamed from: kk */
    private C2652a0 f8809kk;

    /* JADX INFO: renamed from: to */
    private int f8810to;

    /* JADX INFO: renamed from: x1 */
    private double f8811x1;

    public C2971xw() {
        m12616k4(-1);
    }

    @Override // com.aspose.slides.IGenericCloneable
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public final C2971xw cloneT() {
        C2971xw c2971xw = new C2971xw(this.f8810to);
        c2971xw.m12618k4(this.f8808k4);
        c2971xw.m12619k4(this.f8809kk.cloneT());
        c2971xw.m12620x1(this.f8811x1);
        return c2971xw;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m12620x1(double d) {
        if (d < 0.0d) {
            throw new ArgumentOutOfRangeException("value");
        }
        this.f8811x1 = d;
    }

    public C2971xw(int i) {
        m12616k4(i);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m12618k4(double d) {
        this.f8808k4 = d;
    }

    /* JADX INFO: renamed from: k4 */
    private void m12616k4(int i) {
        this.f8810to = i;
        this.f8808k4 = 0.0d;
        this.f8811x1 = 100.0d;
        switch (i) {
            case -1:
                break;
            case 0:
                this.f8809kk = new C2652a0(1.8882E7d, 2124000.0d, 1.7988E7d);
                return;
            case 1:
                this.f8809kk = new C2652a0(2718000.0d, 2124000.0d, 3612000.0d);
                return;
            case 2:
                this.f8809kk = new C2652a0(2700000.0d, 2100000.0d, 0.0d);
                return;
            case 3:
                this.f8809kk = new C2652a0(2700000.0d, 2100000.0d, 0.0d);
                return;
            case 4:
                this.f8809kk = new C2652a0(3840000.0d, 1080000.0d, 0.0d);
                return;
            case 5:
                this.f8809kk = new C2652a0(2.004E7d, 1080000.0d, 0.0d);
                return;
            case 6:
                this.f8809kk = new C2652a0(1.839E7d, 1.8078E7d, 3456000.0d);
                return;
            case 7:
                this.f8809kk = new C2652a0(1560000.0d, 1080000.0d, 0.0d);
                return;
            case 8:
                this.f8809kk = new C2652a0(1.776E7d, 1080000.0d, 0.0d);
                return;
            case 9:
                this.f8809kk = new C2652a0(3210000.0d, 1.8078E7d, 1.8144E7d);
                return;
            case 10:
                this.f8809kk = new C2652a0(1.839E7d, 3522000.0d, 1.8144E7d);
                return;
            case 11:
                this.f8809kk = new C2652a0(3840000.0d, 2.052E7d, 0.0d);
                return;
            case 12:
                this.f8809kk = new C2652a0(2.004E7d, 2.052E7d, 0.0d);
                return;
            case 13:
                this.f8809kk = new C2652a0(3210000.0d, 3522000.0d, 3456000.0d);
                return;
            case 14:
                this.f8809kk = new C2652a0(1560000.0d, 2.052E7d, 0.0d);
                return;
            case 15:
                this.f8809kk = new C2652a0(1.89E7d, 1.95E7d, 0.0d);
                return;
            default:
                switch (i) {
                    case 17:
                        this.f8809kk = new C2652a0(1.89E7d, 2100000.0d, 0.0d);
                        return;
                    case 18:
                        this.f8809kk = new C2652a0(2718000.0d, 1.9476E7d, 1.7988E7d);
                        return;
                    case 19:
                        this.f8809kk = new C2652a0(1.8882E7d, 1.9476E7d, 3612000.0d);
                        return;
                    default:
                        switch (i) {
                            case 29:
                                this.f8808k4 = 65.0d;
                                this.f8809kk = new C2652a0(0.0d, 0.0d, 0.0d);
                                return;
                            case 30:
                                this.f8808k4 = 65.0d;
                                this.f8809kk = new C2652a0(0.0d, 0.0d, 0.0d);
                                return;
                            case 31:
                                this.f8808k4 = 65.0d;
                                this.f8809kk = new C2652a0(0.0d, 0.0d, 0.0d);
                                return;
                            case 32:
                                this.f8808k4 = 65.0d;
                                this.f8809kk = new C2652a0(0.0d, 0.0d, 0.0d);
                                return;
                            case 33:
                                this.f8808k4 = 65.0d;
                                this.f8809kk = new C2652a0(0.0d, 0.0d, 0.0d);
                                return;
                            case 34:
                                this.f8808k4 = 65.0d;
                                this.f8809kk = new C2652a0(0.0d, 0.0d, 0.0d);
                                return;
                            case 35:
                                this.f8808k4 = 65.0d;
                                this.f8809kk = new C2652a0(0.0d, 0.0d, 0.0d);
                                return;
                            case 36:
                                this.f8808k4 = 65.0d;
                                this.f8809kk = new C2652a0(0.0d, 0.0d, 0.0d);
                                return;
                            case 37:
                                this.f8808k4 = 65.0d;
                                this.f8809kk = new C2652a0(0.0d, 0.0d, 0.0d);
                                return;
                            default:
                                switch (i) {
                                    case 46:
                                        break;
                                    case 47:
                                        this.f8808k4 = 45.0d;
                                        this.f8809kk = new C2652a0(0.0d, 2.04E7d, 0.0d);
                                        return;
                                    case 48:
                                        this.f8808k4 = 45.0d;
                                        this.f8809kk = new C2652a0(858000.0d, 2358000.0d, 2.0466E7d);
                                        return;
                                    case 49:
                                        this.f8808k4 = 45.0d;
                                        this.f8809kk = new C2652a0(2.0742E7d, 2358000.0d, 1134000.0d);
                                        return;
                                    case 50:
                                        this.f8808k4 = 45.0d;
                                        this.f8809kk = new C2652a0(0.0d, 1200000.0d, 0.0d);
                                        return;
                                    case 51:
                                        this.f8808k4 = 45.0d;
                                        this.f8809kk = new C2652a0(2634000.0d, 624000.0d, 2.1384E7d);
                                        return;
                                    case 52:
                                        this.f8808k4 = 45.0d;
                                        this.f8809kk = new C2652a0(1.8966E7d, 624000.0d, 216000.0d);
                                        return;
                                    case 53:
                                        this.f8808k4 = 45.0d;
                                        this.f8809kk = new C2652a0(0.0d, 0.0d, 0.0d);
                                        return;
                                    case 54:
                                        this.f8808k4 = 45.0d;
                                        this.f8809kk = new C2652a0(2070000.0d, 486000.0d, 2.1426E7d);
                                        return;
                                    case 55:
                                        this.f8808k4 = 45.0d;
                                        this.f8809kk = new C2652a0(1.953E7d, 486000.0d, 174000.0d);
                                        return;
                                    case 56:
                                        this.f8808k4 = 45.0d;
                                        this.f8809kk = new C2652a0(858000.0d, 2.094E7d, 156000.0d);
                                        return;
                                    case 57:
                                        this.f8808k4 = 45.0d;
                                        this.f8809kk = new C2652a0(2.0742E7d, 2.094E7d, 2.1444E7d);
                                        return;
                                    case 58:
                                        this.f8808k4 = 45.0d;
                                        this.f8809kk = new C2652a0(1200000.0d, 0.0d, 0.0d);
                                        return;
                                    case 59:
                                        this.f8808k4 = 45.0d;
                                        this.f8809kk = new C2652a0(0.0d, 1.8576E7d, 0.0d);
                                        return;
                                    case 60:
                                        this.f8808k4 = 45.0d;
                                        this.f8809kk = new C2652a0(0.0d, 1.9488E7d, 0.0d);
                                        return;
                                    case 61:
                                        this.f8808k4 = 45.0d;
                                        this.f8809kk = new C2652a0(2.04E7d, 0.0d, 0.0d);
                                        return;
                                    default:
                                        throw new NotImplementedException();
                                }
                                break;
                        }
                        break;
                }
                break;
        }
        this.f8809kk = new C2652a0(0.0d, 0.0d, 0.0d);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m12619k4(C2652a0 c2652a0) {
        if (this.f8809kk != c2652a0) {
            if (c2652a0 == null) {
                throw new ArgumentNullException("value");
            }
            this.f8809kk = c2652a0.cloneT();
        }
    }
}
