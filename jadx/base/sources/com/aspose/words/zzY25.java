package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzY25 {
    private byte[] zzP;
    private zzZ8U zzWZx;
    private zzYU6 zzXSu;
    private int zzWZQ = 0;
    private String zzXrZ = null;
    private String zzWW3 = null;
    private String zzWW2 = null;
    private String zzWW1 = null;
    private String zzWW0 = null;
    private String zzWVZ = null;
    private String zzWVY = null;
    private String zzWVX = null;
    private String zzWVW = null;
    private String zzWVV = null;
    private String zzWVU = null;
    private String zzWVT = null;
    private String zzWVS = null;
    private String zzWVR = null;
    private String zzWVQ = null;
    private String zzWVP = null;
    private String zzWVO = null;
    private String zzWVN = null;
    private String zzWVM = null;
    private String zzWVL = null;
    private String zzWVK = null;
    private String zzWVJ = null;
    private String zzWVI = null;

    public zzY25(zzYU6 zzyu6, zzZ8U zzz8u) {
        this.zzXSu = zzyu6;
        this.zzWZx = zzz8u;
    }

    public final byte[] getImageBytes() {
        return this.zzP;
    }

    public final void zzIg() {
        if (this.zzWZQ <= 0) {
            return;
        }
        this.zzXSu.zzY("v:stroke");
        this.zzXSu.zz0(this.zzWZx.zzZm4(), this.zzXrZ);
        if (this.zzWVZ != null || com.aspose.words.internal.zzZYD.zzXk(this.zzXrZ)) {
            this.zzXSu.zzX("o:title", this.zzWVZ);
        }
        this.zzXSu.zz0("joinstyle", this.zzWVP);
        this.zzXSu.zz0("dashstyle", this.zzWVW);
        this.zzXSu.zz0("linestyle", this.zzWVX);
        this.zzXSu.zz0("endcap", this.zzWVO);
        this.zzXSu.zz0("startarrow", this.zzWVV);
        this.zzXSu.zz0("startarrowwidth", this.zzWVT);
        this.zzXSu.zz0("startarrowlength", this.zzWVS);
        this.zzXSu.zz0("endarrow", this.zzWVU);
        this.zzXSu.zz0("endarrowwidth", this.zzWVR);
        this.zzXSu.zz0("endarrowlength", this.zzWVQ);
        this.zzXSu.zz0("opacity", this.zzWW2);
        String strZzZI = this.zzWW1;
        if (com.aspose.words.internal.zzZYD.zzXk(this.zzWVJ) && com.aspose.words.internal.zzZYD.zzXk(this.zzWVI)) {
            strZzZI = com.aspose.words.internal.zzZKN.zzZI(strZzZI, com.aspose.words.internal.zzZKN.format(" [{0} {1}]", this.zzWVJ, this.zzWVI));
        }
        this.zzXSu.zz0("color2", strZzZI);
        this.zzXSu.zz0("filltype", this.zzWW0);
        this.zzXSu.zzp();
    }

    public final String zzXSN() {
        return this.zzWVP;
    }

    public final void zzXTD() {
        this.zzXSu.zz0("stroked", this.zzWVM);
        String strZzZI = this.zzWW3;
        if (com.aspose.words.internal.zzZYD.zzXk(this.zzWVL) && com.aspose.words.internal.zzZYD.zzXk(this.zzWVK)) {
            strZzZI = com.aspose.words.internal.zzZKN.zzZI(strZzZI, com.aspose.words.internal.zzZKN.format(" [{0} {1}]", this.zzWVL, this.zzWVK));
        }
        this.zzXSu.zz0("strokecolor", strZzZI);
        this.zzXSu.zz0("strokeweight", this.zzWVY);
        this.zzXSu.zz0("insetpen", this.zzWVN);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzZP(int i, Object obj) {
        int i2 = this.zzWZQ;
        this.zzWZQ = i2 + 1;
        if (i != 481) {
            if (i != 482) {
                if (i == 4111) {
                    this.zzP = (byte[]) obj;
                    return;
                }
                if (i != 4121) {
                    switch (i) {
                        case 448:
                            this.zzWW3 = this.zzWZx.zzf((com.aspose.words.internal.zzPV) obj);
                            this.zzWZQ--;
                            break;
                        case 449:
                            this.zzWW2 = zzY23.zzYO(obj);
                            break;
                        case 450:
                            this.zzWW1 = this.zzWZx.zzf((com.aspose.words.internal.zzPV) obj);
                            break;
                        case 451:
                            break;
                        case 452:
                            this.zzWW0 = zzY30.zziT(((Integer) obj).intValue());
                            break;
                        default:
                            switch (i) {
                                case 454:
                                    this.zzWVZ = (String) obj;
                                    break;
                                case 455:
                                case 457:
                                case 458:
                                    break;
                                case 456:
                                    this.zzWZQ = i2;
                                    break;
                                case 459:
                                    Integer num = (Integer) obj;
                                    if (num.intValue() > 0) {
                                        this.zzWVY = zzY23.zzih(num.intValue());
                                    }
                                    this.zzWZQ--;
                                    break;
                                case 460:
                                    this.zzWZQ = i2;
                                    break;
                                case 461:
                                    this.zzWVX = zzY30.zziY(((Integer) obj).intValue());
                                    break;
                                case 462:
                                    this.zzWVW = zzY30.zzj0(((Integer) obj).intValue());
                                    break;
                                case 463:
                                    this.zzWZQ = i2;
                                    break;
                                case 464:
                                    this.zzWVV = zzY30.zziU(((Integer) obj).intValue());
                                    break;
                                case 465:
                                    this.zzWVU = zzY30.zziU(((Integer) obj).intValue());
                                    break;
                                case 466:
                                    this.zzWVT = zzY30.zziW(((Integer) obj).intValue());
                                    break;
                                case 467:
                                    this.zzWVS = zzY30.zziV(((Integer) obj).intValue());
                                    break;
                                case 468:
                                    this.zzWVR = zzY30.zziW(((Integer) obj).intValue());
                                    break;
                                case 469:
                                    this.zzWVQ = zzY30.zziV(((Integer) obj).intValue());
                                    break;
                                case 470:
                                    this.zzWVP = zzY30.zziZ(((Integer) obj).intValue());
                                    break;
                                case 471:
                                    this.zzWVO = zzY30.zziX(((Integer) obj).intValue());
                                    break;
                                default:
                                    switch (i) {
                                        case 473:
                                            this.zzWVL = zzY23.zzYL(obj);
                                            this.zzWZQ--;
                                            break;
                                        case 474:
                                            break;
                                        case 475:
                                            this.zzWVK = zzY23.zzYM(obj);
                                            break;
                                        default:
                                            switch (i) {
                                                case 477:
                                                    this.zzWVJ = zzY23.zzYL(obj);
                                                    break;
                                                case 478:
                                                    break;
                                                case 479:
                                                    this.zzWVI = zzY23.zzYM(obj);
                                                    break;
                                                default:
                                                    switch (i) {
                                                        case 503:
                                                            this.zzWZQ = i2;
                                                            break;
                                                        case 504:
                                                        case 506:
                                                            this.zzWZQ = i2;
                                                            break;
                                                        case 505:
                                                            this.zzWVN = zzY23.zzYN(obj);
                                                            break;
                                                        case 507:
                                                            this.zzWZQ = i2;
                                                            break;
                                                        case 508:
                                                            this.zzWVM = zzY23.zzYN(obj);
                                                            break;
                                                    }
                                                    this.zzWZQ--;
                                                    break;
                                            }
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    return;
                }
                this.zzWZQ = i2;
                return;
            }
            this.zzWZQ = i2;
            return;
        }
        this.zzWZQ = i2;
    }

    public final void zzyZ(String str) {
        if (!com.aspose.words.internal.zzZYD.zzXk(this.zzWVP) && com.aspose.words.internal.zzZYD.zzXk(str)) {
            this.zzWZQ++;
        }
        this.zzWVP = str;
    }

    public final void zzzk(String str) {
        this.zzXrZ = str;
    }
}
