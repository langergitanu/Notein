package com.aspose.words;

import com.huawei.hms.network.embedded.C18437z2;

/* JADX INFO: loaded from: classes6.dex */
final class zzY36 {
    private zzYU6 zzXSu;
    private int zzWZQ = 0;
    private String zzWZP = null;
    private String zzWZO = null;
    private String zzWZN = null;
    private String zzWZM = null;
    private String zzWZL = null;
    private String zzWZK = null;
    private String zzWZJ = null;
    private String zzWZI = null;
    private String zzWZH = null;
    private String zzWZG = null;
    private String zzWZF = null;
    private String zzWZE = null;
    private String zzWZD = null;

    public zzY36(zzYU6 zzyu6) {
        this.zzXSu = zzyu6;
    }

    public final void zzIg() {
        if (this.zzWZQ <= 0) {
            return;
        }
        this.zzXSu.zzY("o:callout");
        this.zzXSu.zz0("v:ext", "edit");
        this.zzXSu.zz0(C18437z2.f56754h, this.zzWZP);
        this.zzXSu.zz0("gap", this.zzWZO);
        this.zzXSu.zz0("angle", this.zzWZN);
        this.zzXSu.zz0("drop", this.zzWZM);
        this.zzXSu.zz0("distance", this.zzWZL);
        this.zzXSu.zz0("length", this.zzWZK);
        this.zzXSu.zz0("on", this.zzWZJ);
        this.zzXSu.zz0("accentbar", this.zzWZI);
        this.zzXSu.zz0("textborder", this.zzWZH);
        this.zzXSu.zz0("minusx", this.zzWZG);
        this.zzXSu.zz0("minusy", this.zzWZF);
        this.zzXSu.zz0("dropauto", this.zzWZE);
        this.zzXSu.zz0("lengthspecified", this.zzWZD);
        this.zzXSu.zzp();
    }

    public final void zzZP(int i, Object obj) {
        if (!(obj instanceof Boolean) || (i == 889 || i == 891 ? !((Boolean) obj).booleanValue() : ((Boolean) obj).booleanValue())) {
            this.zzWZQ++;
        }
        switch (i) {
            case 832:
                this.zzWZP = zzY30.zziP(((Integer) obj).intValue());
                break;
            case 833:
                this.zzWZO = zzY23.zzih(((Integer) obj).intValue());
                break;
            case 834:
                this.zzWZN = zzY30.zzj1(((Integer) obj).intValue());
                break;
            case 835:
                this.zzWZM = zzY30.zzj2(((Integer) obj).intValue());
                break;
            case 836:
                this.zzWZL = zzY23.zzih(((Integer) obj).intValue());
                break;
            case 837:
                this.zzWZK = zzY23.zzig(((Integer) obj).intValue());
                break;
            default:
                switch (i) {
                    case 889:
                        this.zzWZJ = zzY23.zzW(obj, true);
                        break;
                    case 890:
                        this.zzWZI = zzY23.zzW(obj, false);
                        break;
                    case 891:
                        this.zzWZH = zzY23.zzW(obj, true);
                        break;
                    case 892:
                        this.zzWZG = zzY23.zzW(obj, false);
                        break;
                    case 893:
                        this.zzWZF = zzY23.zzW(obj, false);
                        break;
                    case 894:
                        this.zzWZE = zzY23.zzW(obj, false);
                        break;
                    case 895:
                        this.zzWZD = zzY23.zzW(obj, false);
                        break;
                }
                break;
        }
    }
}
