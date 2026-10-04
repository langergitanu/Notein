package com.aspose.words;

import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.huawei.hms.network.embedded.C18437z2;

/* JADX INFO: loaded from: classes6.dex */
final class zzY2U {
    private byte[] zzP;
    private zzZ8U zzWZx;
    private zzYU6 zzXSu;
    private ShapeBase zzZBi;
    private int zzWZQ = 0;
    private String zzXrZ = null;
    private boolean zzWYf = false;
    private boolean zzWYe = false;
    private String zzWYd = null;
    private String zzWYc = null;
    private String zzWYb = null;
    private String zzWYa = null;
    private String zzWY9 = null;
    private String zzWY8 = null;
    private String zzWY7 = null;
    private String zzWY6 = null;
    private String zzWY5 = null;
    private String zzWY4 = null;
    private String zzWY3 = null;
    private String zzWY2 = null;
    private String zzWY1 = null;
    private String zzWY0 = null;
    private String zzWXZ = null;
    private String zzWXY = null;
    private String zzWXX = null;
    private String zzWXW = null;
    private String zzWXV = null;
    private String zzWXU = null;
    private String zzWXT = null;
    private String zzWXS = null;
    private String zzWXR = null;
    private String zzWXQ = null;
    private String zzWXP = null;

    public zzY2U(ShapeBase shapeBase, zzYU6 zzyu6, zzZ8U zzz8u) {
        this.zzXSu = zzyu6;
        this.zzZBi = shapeBase;
        this.zzWZx = zzz8u;
    }

    private void zzQ(String str, String str2, String str3, String str4) {
        if (com.aspose.words.internal.zzZYD.zzXk(str3) && com.aspose.words.internal.zzZYD.zzXk(str4)) {
            str2 = com.aspose.words.internal.zzZKN.format("{0} [{1} {2}]", str2, this.zzWYb, this.zzWYa);
        }
        this.zzXSu.zz0(str, str2);
    }

    public final byte[] getImageBytes() {
        return this.zzP;
    }

    public final void zzIg() {
        if (this.zzWZQ <= 0) {
            return;
        }
        this.zzXSu.zzY("v:fill");
        this.zzXSu.zz0(this.zzWZx.zzZm4(), this.zzXrZ);
        if (this.zzXrZ != null) {
            this.zzXSu.zzX("o:title", this.zzWY4);
        }
        this.zzXSu.zz0("opacity", this.zzWY7);
        zzQ("color2", this.zzWY6, this.zzWY9, this.zzWY8);
        this.zzXSu.zz0("o:opacity2", this.zzWY5);
        this.zzXSu.zz0("aspect", this.zzWXZ);
        this.zzXSu.zzz("origin", this.zzWXX, this.zzWXW);
        this.zzXSu.zzz(RequestParameters.POSITION, this.zzWXV, this.zzWXU);
        this.zzXSu.zz0("recolor", this.zzWXS);
        this.zzXSu.zz0("rotate", this.zzWXR);
        this.zzXSu.zz0("angle", this.zzWY3);
        this.zzXSu.zz0("colors", this.zzWXY);
        String str = this.zzWY1;
        if (str != null || this.zzWY0 != null) {
            this.zzXSu.zzz("focusposition", str, this.zzWY0);
            this.zzXSu.zzX("focussize", "");
        }
        this.zzXSu.zz0("method", this.zzWXT);
        this.zzXSu.zz0("focus", this.zzWY2);
        this.zzXSu.zz0(C18437z2.f56754h, this.zzWYd);
        this.zzXSu.zz0("o:detectmouseclick", this.zzWXP);
        boolean z = this.zzWYf;
        if (z || this.zzWYe) {
            this.zzXSu.zzX("o:fill", "v:ext", "view", C18437z2.f56754h, z ? "gradientCenter" : "gradientUnscaled");
        }
        this.zzXSu.zzp();
    }

    public final void zzXTD() {
        if (this.zzZBi.getShapeType() != 20) {
            this.zzXSu.zz0("filled", this.zzWXQ);
        }
        zzQ("fillcolor", this.zzWYc, this.zzWYb, this.zzWYa);
    }

    public final void zzZP(int i, Object obj) {
        int i2 = this.zzWZQ;
        this.zzWZQ = i2 + 1;
        if (i == 391) {
            this.zzWY4 = (String) obj;
            return;
        }
        if (i == 405) {
            this.zzWXZ = zzY30.zziJ(((Integer) obj).intValue());
            return;
        }
        if (i == 418) {
            this.zzWY9 = zzY23.zzYL(obj);
            return;
        }
        if (i == 420) {
            this.zzWY8 = zzY23.zzYM(obj);
            return;
        }
        if (i == 422) {
            this.zzWZQ = i2;
            return;
        }
        if (i == 4110) {
            this.zzP = (byte[]) obj;
            return;
        }
        switch (i) {
            case 384:
                Integer num = (Integer) obj;
                this.zzWYd = zzY30.zziH(num.intValue());
                if (num.intValue() == 5) {
                    this.zzWYf = true;
                } else if (num.intValue() == 10) {
                    this.zzWYe = true;
                }
                break;
            case 385:
                this.zzWYc = this.zzWZx.zzf((com.aspose.words.internal.zzPV) obj);
                this.zzWZQ--;
                break;
            case 386:
                this.zzWY7 = zzY23.zzYO(obj);
                break;
            case 387:
                this.zzWY6 = this.zzWZx.zzf((com.aspose.words.internal.zzPV) obj);
                break;
            case 388:
                this.zzWY5 = zzY23.zzYO(obj);
                break;
            default:
                switch (i) {
                    case 395:
                        this.zzWY3 = zzY23.zzYO(obj);
                        break;
                    case 396:
                        this.zzWY2 = zzY23.zzid(((Integer) obj).intValue());
                        break;
                    case 397:
                        this.zzWY1 = zzY23.zzZ1(((Integer) obj).intValue(), false);
                        break;
                    case 398:
                        this.zzWY0 = zzY23.zzZ1(((Integer) obj).intValue(), false);
                        break;
                    default:
                        switch (i) {
                            case 407:
                                this.zzWXY = zzY23.zzZ((zzZLE[]) obj, this.zzWZx);
                                break;
                            case 408:
                                this.zzWXX = zzY23.zzYO(obj);
                                break;
                            case 409:
                                this.zzWXW = zzY23.zzYO(obj);
                                break;
                            case 410:
                                this.zzWXV = zzY23.zzYO(obj);
                                break;
                            case 411:
                                this.zzWXU = zzY23.zzYO(obj);
                                break;
                            case 412:
                                if (((Integer) obj).intValue() != 1073741835) {
                                    this.zzWXT = "none";
                                } else {
                                    this.zzWXT = "linear sigma";
                                }
                                break;
                            default:
                                switch (i) {
                                    case 414:
                                        this.zzWYb = zzY23.zzYL(obj);
                                        this.zzWZQ--;
                                        break;
                                    case 415:
                                        this.zzWZQ = i2;
                                        break;
                                    case 416:
                                        this.zzWYa = zzY23.zzYM(obj);
                                        break;
                                    default:
                                        switch (i) {
                                            case 441:
                                                if (!((Boolean) obj).booleanValue()) {
                                                    this.zzWZQ--;
                                                } else {
                                                    this.zzWXS = zzY23.zzYN(obj);
                                                }
                                                break;
                                            case 442:
                                                if (!((Boolean) obj).booleanValue()) {
                                                    this.zzWZQ--;
                                                } else {
                                                    this.zzWXR = zzY23.zzYN(obj);
                                                }
                                                break;
                                            case 443:
                                                this.zzWXQ = zzY23.zzYN(obj);
                                                this.zzWZQ--;
                                                break;
                                            case 444:
                                                this.zzWZQ = i2;
                                                break;
                                            case 445:
                                                this.zzWZQ = i2;
                                                break;
                                            case 446:
                                                this.zzWZQ = i2;
                                                break;
                                            case 447:
                                                this.zzWXP = zzY23.zzYN(obj);
                                                break;
                                        }
                                        break;
                                }
                                break;
                        }
                        break;
                }
                break;
        }
    }

    public final void zzzk(String str) {
        this.zzXrZ = str;
    }
}
