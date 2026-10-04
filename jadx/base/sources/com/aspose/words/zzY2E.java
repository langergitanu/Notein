package com.aspose.words;

import androidx.core.view.InputDeviceCompat;
import com.huawei.hms.network.embedded.C18437z2;

/* JADX INFO: loaded from: classes6.dex */
final class zzY2E {
    private zzZ8U zzWZx;
    private zzYU6 zzXSu;
    private int zzWZQ = 0;
    private String zzWWz = null;
    private String zzWWy = null;
    private String zzWWx = null;
    private String zzWWw = null;
    private String zzWWv = null;
    private String zzWWu = null;
    private String zzWWt = null;
    private String zzWWs = null;
    private String zzWWr = null;
    private String zzWWq = null;
    private String zzWWp = null;
    private String zzWWo = null;
    private String zzWWn = null;
    private String zzWWm = null;
    private String zzWWl = null;
    private String zzWWk = null;
    private String zzWWj = null;
    private String zzWWi = null;

    public zzY2E(zzYU6 zzyu6, zzZ8U zzz8u) {
        this.zzXSu = zzyu6;
        this.zzWZx = zzz8u;
    }

    private static boolean zzR(StringBuilder sb, String str) {
        if (!com.aspose.words.internal.zzZYD.zzXk(str)) {
            return false;
        }
        com.aspose.words.internal.zzZNH.zzU(sb, str);
        return true;
    }

    private String zzXSZ() {
        StringBuilder sb = new StringBuilder();
        boolean zZzR = zzR(sb, this.zzWWr);
        sb.append(',');
        boolean zZzR2 = zZzR | zzR(sb, this.zzWWq);
        sb.append(',');
        boolean zZzR3 = zZzR2 | zzR(sb, this.zzWWp);
        sb.append(',');
        boolean zZzR4 = zZzR3 | zzR(sb, this.zzWWo);
        sb.append(',');
        boolean zZzR5 = zZzR4 | zzR(sb, this.zzWWn);
        sb.append(',');
        if (zZzR5 || zzR(sb, this.zzWWm)) {
            return com.aspose.words.internal.zzZKN.zzT(sb.toString(), ',');
        }
        return null;
    }

    public final void zzIg() {
        if (this.zzWZQ <= 0) {
            return;
        }
        this.zzXSu.zzY("v:shadow");
        this.zzXSu.zz0("on", this.zzWWj);
        this.zzXSu.zz0(C18437z2.f56754h, this.zzWWz);
        this.zzXSu.zz0("color", this.zzWWy);
        this.zzXSu.zz0("color2", this.zzWWx);
        this.zzXSu.zz0("opacity", this.zzWWw);
        this.zzXSu.zzz("origin", this.zzWWl, this.zzWWk);
        this.zzXSu.zzz("offset", this.zzWWv, this.zzWWu);
        this.zzXSu.zzz("offset2", this.zzWWt, this.zzWWs);
        this.zzXSu.zz0("matrix", zzXSZ());
        this.zzXSu.zz0("obscured", this.zzWWi);
        this.zzXSu.zzp();
    }

    public final void zzZP(int i, Object obj) {
        if (!(obj instanceof Boolean) || ((Boolean) obj).booleanValue()) {
            this.zzWZQ++;
        }
        if (i == 528) {
            this.zzWWl = zzY23.zzYO(obj);
            return;
        }
        if (i == 529) {
            this.zzWWk = zzY23.zzYO(obj);
            return;
        }
        if (i == 574) {
            this.zzWWj = zzY23.zzW(obj, false);
            return;
        }
        if (i == 575) {
            this.zzWWi = zzY23.zzW(obj, false);
            return;
        }
        switch (i) {
            case 512:
                this.zzWWz = zzY30.zziQ(((Integer) obj).intValue());
                break;
            case InputDeviceCompat.SOURCE_DPAD /* 513 */:
                this.zzWWy = this.zzWZx.zzf((com.aspose.words.internal.zzPV) obj);
                break;
            case 514:
                this.zzWWx = this.zzWZx.zzf((com.aspose.words.internal.zzPV) obj);
                break;
            default:
                switch (i) {
                    case 516:
                        this.zzWWw = zzY23.zzYO(obj);
                        break;
                    case 517:
                        this.zzWWv = zzY23.zzih(((Integer) obj).intValue());
                        break;
                    case 518:
                        this.zzWWu = zzY23.zzih(((Integer) obj).intValue());
                        break;
                    case 519:
                        this.zzWWt = zzY23.zzih(((Integer) obj).intValue());
                        break;
                    case 520:
                        this.zzWWs = zzY23.zzih(((Integer) obj).intValue());
                        break;
                    case 521:
                        this.zzWWr = zzY23.zzYO(obj);
                        break;
                    case 522:
                        this.zzWWq = zzY23.zzYO(obj);
                        break;
                    case 523:
                        this.zzWWp = zzY23.zzYO(obj);
                        break;
                    case 524:
                        this.zzWWo = zzY23.zzYO(obj);
                        break;
                    case 525:
                        this.zzWWn = zzY23.zzic(((Integer) obj).intValue());
                        break;
                    case 526:
                        this.zzWWm = zzY23.zzic(((Integer) obj).intValue());
                        break;
                }
                break;
        }
    }
}
