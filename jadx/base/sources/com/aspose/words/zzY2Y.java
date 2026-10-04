package com.aspose.words;

import com.huawei.hms.network.embedded.C18437z2;

/* JADX INFO: loaded from: classes6.dex */
final class zzY2Y {
    private zzZ8U zzWZx;
    private zzYU6 zzXSu;
    private int zzWZQ = 0;
    private String zzWZ1 = null;
    private String zzWZ0 = null;
    private String zzWYZ = null;
    private String zzWYY = null;
    private String zzWYX = null;
    private String zzWYW = null;
    private String zzWYV = null;
    private String zzWYU = null;
    private String zzWYT = null;
    private String zzWYS = null;
    private String zzWYR = null;
    private String zzWYQ = null;
    private String zzWYP = null;
    private String zzWYO = null;
    private String zzWYN = null;
    private String zzWYM = null;
    private String zzWYL = null;
    private String zzWYK = null;
    private String zzWYJ = null;
    private String zzWYI = null;
    private String zzWYH = null;
    private String zzWYG = null;
    private String zzWYF = null;
    private String zzWYE = null;
    private String zzWYD = null;
    private String zzWYC = null;
    private String zzWYB = null;
    private String zzWYA = null;
    private String zzWYz = null;
    private String zzWYy = null;
    private String zzWYx = null;
    private String zzWYw = null;
    private String zzWYv = null;
    private String zzWYu = null;
    private String zzWYt = null;
    private String zzWYs = null;
    private String zzWYr = null;
    private String zzWYq = null;
    private String zzWYp = null;
    private String zzWYo = null;
    private String zzWYn = null;
    private String zzWYm = null;
    private String zzWYl = null;

    public zzY2Y(zzYU6 zzyu6, zzZ8U zzz8u) {
        this.zzXSu = zzyu6;
        this.zzWZx = zzz8u;
    }

    public final void zzIg() {
        if (this.zzWZQ <= 0) {
            return;
        }
        this.zzXSu.zzY("o:extrusion");
        this.zzXSu.zz0("v:ext", "view");
        this.zzXSu.zz0("specularity", this.zzWZ1);
        this.zzXSu.zz0("diffusity", this.zzWZ0);
        this.zzXSu.zz0("shininess", this.zzWYZ);
        this.zzXSu.zz0("edge", this.zzWYY);
        this.zzXSu.zz0("foredepth", this.zzWYX);
        this.zzXSu.zz0("backdepth", this.zzWYW);
        this.zzXSu.zz0("plane", this.zzWYV);
        this.zzXSu.zz0("color", this.zzWYU);
        this.zzXSu.zz0("on", this.zzWYT);
        this.zzXSu.zz0("metal", this.zzWYS);
        this.zzXSu.zz0("lightface", this.zzWYR);
        this.zzXSu.zzz("rotationangle", this.zzWYP, this.zzWYQ);
        this.zzXSu.zzU("orientation", this.zzWYO, this.zzWYN, this.zzWYM);
        this.zzXSu.zz0("orientationangle", this.zzWYL);
        this.zzXSu.zzU("rotationcenter", this.zzWYK, this.zzWYJ, this.zzWYI);
        this.zzXSu.zz0("render", this.zzWYH);
        this.zzXSu.zz0("facet", this.zzWYG);
        this.zzXSu.zzU("viewpoint", this.zzWYF, this.zzWYE, this.zzWYD);
        this.zzXSu.zzz("viewpointorigin", this.zzWYC, this.zzWYB);
        this.zzXSu.zz0("skewangle", this.zzWYA);
        this.zzXSu.zz0("skewamt", this.zzWYz);
        this.zzXSu.zz0("brightness", this.zzWYy);
        this.zzXSu.zzU("lightposition", this.zzWYx, this.zzWYw, this.zzWYv);
        this.zzXSu.zz0("lightlevel", this.zzWYu);
        this.zzXSu.zzU("lightposition2", this.zzWYt, this.zzWYs, this.zzWYr);
        this.zzXSu.zz0("lightlevel2", this.zzWYq);
        this.zzXSu.zz0("lockrotationcenter", this.zzWYp);
        this.zzXSu.zz0("autorotationcenter", this.zzWYo);
        this.zzXSu.zz0(C18437z2.f56754h, this.zzWYn);
        this.zzXSu.zz0("lightharsh", this.zzWYm);
        this.zzXSu.zz0("lightharsh2", this.zzWYl);
        this.zzXSu.zzp();
    }

    public final void zzZP(int i, Object obj) {
        if (!(obj instanceof Boolean) || (i == 703 || i == 763 || i == 765 || i == 766 ? !((Boolean) obj).booleanValue() : ((Boolean) obj).booleanValue())) {
            this.zzWZQ++;
        }
        if (i == 700) {
            this.zzWYT = zzY23.zzW(obj, false);
            return;
        }
        if (i == 701) {
            this.zzWYS = zzY23.zzW(obj, false);
            return;
        }
        switch (i) {
            case 640:
                this.zzWZ1 = zzY23.zzYO(obj);
                break;
            case 641:
                this.zzWZ0 = zzY23.zzYO(obj);
                break;
            case 642:
                this.zzWYZ = com.aspose.words.internal.zzJB.zzWF(((Integer) obj).intValue());
                break;
            case 643:
                this.zzWYY = zzY23.zzih(((Integer) obj).intValue());
                break;
            case 644:
                this.zzWYX = zzY23.zzih(((Integer) obj).intValue());
                break;
            case 645:
                this.zzWYW = zzY23.zzih(((Integer) obj).intValue());
                break;
            case 646:
                this.zzWYV = zzY30.zziS(((Integer) obj).intValue());
                break;
            case 647:
                this.zzWYU = this.zzWZx.zzf((com.aspose.words.internal.zzPV) obj);
                break;
            default:
                switch (i) {
                    case 703:
                        this.zzWYR = zzY23.zzW(obj, true);
                        break;
                    case 704:
                        this.zzWYQ = zzY23.zzYO(obj);
                        break;
                    case 705:
                        this.zzWYP = zzY23.zzYO(obj);
                        break;
                    case 706:
                        this.zzWYO = com.aspose.words.internal.zzJB.zzWF(((Integer) obj).intValue());
                        break;
                    case 707:
                        this.zzWYN = com.aspose.words.internal.zzJB.zzWF(((Integer) obj).intValue());
                        break;
                    case 708:
                        this.zzWYM = com.aspose.words.internal.zzJB.zzWF(((Integer) obj).intValue());
                        break;
                    case 709:
                        this.zzWYL = zzY23.zzYO(obj);
                        break;
                    case 710:
                        this.zzWYK = zzY23.zzYO(obj);
                        break;
                    case 711:
                        this.zzWYJ = zzY23.zzYO(obj);
                        break;
                    case 712:
                        this.zzWYI = zzY23.zzig(((Integer) obj).intValue());
                        break;
                    case 713:
                        this.zzWYH = zzY30.zziR(((Integer) obj).intValue());
                        break;
                    case 714:
                        this.zzWYG = zzY23.zzYO(obj);
                        break;
                    case 715:
                        this.zzWYF = zzY23.zzig(((Integer) obj).intValue());
                        break;
                    case 716:
                        this.zzWYE = zzY23.zzig(((Integer) obj).intValue());
                        break;
                    case 717:
                        this.zzWYD = zzY23.zzig(((Integer) obj).intValue());
                        break;
                    case 718:
                        this.zzWYC = zzY23.zzYO(obj);
                        break;
                    case 719:
                        this.zzWYB = zzY23.zzYO(obj);
                        break;
                    case 720:
                        this.zzWYA = zzY23.zzYO(obj);
                        break;
                    case 721:
                        this.zzWYz = zzY23.zzid(((Integer) obj).intValue());
                        break;
                    case 722:
                        this.zzWYy = zzY23.zzYO(obj);
                        break;
                    case 723:
                        this.zzWYx = com.aspose.words.internal.zzJB.zzWF(((Integer) obj).intValue());
                        break;
                    case 724:
                        this.zzWYw = com.aspose.words.internal.zzJB.zzWF(((Integer) obj).intValue());
                        break;
                    case 725:
                        this.zzWYv = com.aspose.words.internal.zzJB.zzWF(((Integer) obj).intValue());
                        break;
                    case 726:
                        this.zzWYu = zzY23.zzYO(obj);
                        break;
                    case 727:
                        this.zzWYt = com.aspose.words.internal.zzJB.zzWF(((Integer) obj).intValue());
                        break;
                    case 728:
                        this.zzWYs = com.aspose.words.internal.zzJB.zzWF(((Integer) obj).intValue());
                        break;
                    case 729:
                        this.zzWYr = com.aspose.words.internal.zzJB.zzWF(((Integer) obj).intValue());
                        break;
                    case 730:
                        this.zzWYq = zzY23.zzYO(obj);
                        break;
                    default:
                        switch (i) {
                            case 763:
                                this.zzWYp = zzY23.zzW(obj, true);
                                break;
                            case 764:
                                this.zzWYo = zzY23.zzW(obj, false);
                                break;
                            case 765:
                                if (!((Boolean) obj).booleanValue()) {
                                    this.zzWYn = "perspective";
                                }
                                break;
                            case 766:
                                this.zzWYm = zzY23.zzW(obj, true);
                                break;
                            case 767:
                                this.zzWYl = zzY23.zzW(obj, false);
                                break;
                        }
                        break;
                }
                break;
        }
    }
}
