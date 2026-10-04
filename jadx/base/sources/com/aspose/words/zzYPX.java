package com.aspose.words;

import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;

/* JADX INFO: loaded from: classes6.dex */
final class zzYPX {
    private zzYTN zzXQW;
    private zzYPM zzXRS;
    private zzYOR zzXRT;

    public zzYPX(zzYOR zzyor, zzYTN zzytn, zzYPM zzypm) {
        this.zzXRT = zzyor;
        this.zzXQW = zzytn;
        this.zzXRS = zzypm;
    }

    public final int visitSectionStart(Section section) {
        Document document = this.zzXRT.getDocument();
        this.zzXRT.zzK(section);
        if (document.getSections().getCount() <= 1 && !document.zzZpV().zzYVg.getNoColumnBalance()) {
            return 0;
        }
        if (this.zzXRT.zzYsE()) {
            this.zzXQW.zzL(section);
        }
        if (this.zzXRT.zzYsD()) {
            zzYTG zzytgZzYsG = this.zzXRT.zzYsG();
            if (this.zzXRT.zzYs4()) {
                zzytgZzYsG.zzZ("text:soft-page-break", (String) null);
                return 0;
            }
            zzytgZzYsG.zzY("text:section");
            zzytgZzYsG.zz0("text:style-name", this.zzXRS.zzYtS());
            zzytgZzYsG.zz0("text:name", this.zzXRS.zzYtS());
            if (document.zzZpV().zzYW6.zzZoe() == 2) {
                zzytgZzYsG.zz0("text:protected", section.zzYvR().zzYpR() ? TelemetryEventStrings.Value.FALSE : TelemetryEventStrings.Value.TRUE);
            }
        }
        return 0;
    }

    public final int zzYug() {
        if (!this.zzXRT.zzYsD() || this.zzXRT.getDocument().getSections().getCount() <= 1 || this.zzXRT.zzYs4()) {
            return 0;
        }
        this.zzXRT.zzYsG().zzo();
        return 0;
    }
}
