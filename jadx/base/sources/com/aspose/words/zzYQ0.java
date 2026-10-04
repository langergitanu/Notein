package com.aspose.words;

import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;

/* JADX INFO: loaded from: classes6.dex */
final class zzYQ0 {
    private zzYQ2 zzXMk;
    private boolean zzXOC;
    private zzYOR zzXRT;

    public zzYQ0(zzYOR zzyor) {
        this.zzXRT = zzyor;
    }

    private void zzZ(TextColumn textColumn, int i) {
        int iZzXW2 = i > 0 ? this.zzXMk.zzXMq.get(i - 1).zzXW2() / 2 : 0;
        int iZzXW22 = i < this.zzXMk.zzXMq.getCount() + (-1) ? textColumn.zzXW2() / 2 : 0;
        int iZzXW3 = textColumn.zzXW3() + iZzXW2 + iZzXW22;
        this.zzXRT.zzYsG().zzX("style:column", "style:rel-width", iZzXW3 > 0 ? com.aspose.words.internal.zzZKN.format("{0}*", Integer.valueOf(iZzXW3)) : "", "fo:start-indent", zzrI(iZzXW2), "fo:end-indent", zzrI(iZzXW22));
    }

    private String zzrI(int i) {
        if (i != 0) {
            return this.zzXRT.zzr2(i);
        }
        return null;
    }

    public final void zzJ(Section section) {
        zzYTG zzytgZzYsG = this.zzXRT.zzYsG();
        zzW(section.zzYvR());
        zzZMK zzzmk = this.zzXMk.zzXMl;
        if (zzzmk != null) {
            zzW(zzzmk.zzZ6C());
        }
        if (this.zzXMk.zzZfa <= 0) {
            return;
        }
        zzytgZzYsG.zzY("style:section-properties");
        zzytgZzYsG.zz0("text:dont-balance-text-columns", this.zzXMk.zzXMm);
        zzYui();
        zzytgZzYsG.zzo();
    }

    public final zzYQ2 zzW(WordAttrCollection wordAttrCollection) {
        zzYQ2 zzyq2 = new zzYQ2();
        this.zzXMk = zzyq2;
        zzyq2.zzXMn = false;
        for (int i = 0; i < wordAttrCollection.getCount(); i++) {
            int iZzT3 = wordAttrCollection.zzT3(i);
            Object objZzVY = wordAttrCollection.zzVY(i);
            if (objZzVY != null) {
                zzYQ2 zzyq22 = this.zzXMk;
                int i2 = zzyq22.zzZfa;
                zzyq22.zzZfa = i2 + 1;
                switch (iZzT3) {
                    case CommonConstant.RETCODE.SMS_RETRIEVER_PARAM_FAILED /* 2020 */:
                    case EditingLanguage.PORTUGUESE_PORTUGAL /* 2070 */:
                    case 2080:
                    case 2090:
                    case 2100:
                    case 2170:
                    case 2190:
                    case 2220:
                    case 2230:
                    case 2312:
                    case 2340:
                    case 2410:
                    case 2420:
                    case 2430:
                    case 2600:
                    case 2610:
                    case 2620:
                    case 2630:
                        this.zzXRT.zzZ(iZzT3, "section", true, false);
                        break;
                    case EditingLanguage.FRENCH_BELGIUM /* 2060 */:
                        zzyq22.zzXMo = ((Boolean) objZzVY).booleanValue();
                        break;
                    case 2250:
                        this.zzXRT.zzZ(iZzT3, "section", false, true);
                        break;
                    case 2350:
                        zzyq22.zzXMr = ((Integer) objZzVY).intValue();
                        break;
                    case 2360:
                        zzyq22.zzXMn = ((Boolean) objZzVY).booleanValue();
                        break;
                    case 2370:
                        zzyq22.zzXMp = this.zzXRT.zzr2(((Integer) objZzVY).intValue());
                        break;
                    case 2380:
                        zzyq22.zzXMq = (zzY5Y) objZzVY;
                        break;
                    case 10010:
                        zzyq22.zzXMl = (zzZMK) objZzVY;
                        break;
                    default:
                        zzyq22.zzZfa = i2;
                        break;
                }
            }
        }
        zzYQ2 zzyq23 = this.zzXMk;
        if (zzyq23.zzXMp == null) {
            zzyq23.zzXMp = this.zzXRT.zzr2(((Integer) zzYCZ.zzOt(2370)).intValue());
            this.zzXMk.zzZfa++;
        }
        this.zzXMk.zzXMm = this.zzXRT.getDocument().getCompatibilityOptions().getNoColumnBalance() ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE;
        zzYQ2 zzyq24 = this.zzXMk;
        zzyq24.zzZfa++;
        return zzyq24;
    }

    public final void zzYui() {
        this.zzXOC = true;
        zzYTG zzytgZzYsG = this.zzXRT.zzYsG();
        zzY5Y zzy5y = this.zzXMk.zzXMq;
        zzytgZzYsG.zzY("style:columns");
        zzytgZzYsG.zz0("fo:column-count", Integer.toString(this.zzXMk.zzXMr));
        if (zzy5y == null || zzy5y.getCount() == 0 || this.zzXMk.zzXMn) {
            zzytgZzYsG.zz0("fo:column-gap", this.zzXMk.zzXMp);
        }
        if (this.zzXMk.zzXMo) {
            zzytgZzYsG.zzZ("style:column-sep", (String) null);
        }
        if (zzy5y != null) {
            for (int i = 0; i < this.zzXMk.zzXMq.getCount(); i++) {
                zzZ(this.zzXMk.zzXMq.get(i), i);
            }
        }
        zzytgZzYsG.zzo();
        this.zzXOC = false;
    }
}
