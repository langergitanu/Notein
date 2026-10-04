package com.aspose.words;

import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;

/* JADX INFO: loaded from: classes6.dex */
final class zzYPV {
    private zzYTG zzXQU;
    private zzYOR zzXRT;

    public zzYPV(zzYOR zzyor) throws Exception {
        this.zzXRT = zzyor;
        this.zzXQU = zzyor.zzDg("/settings.xml");
    }

    private void zzYue() {
        Document document = this.zzXRT.getDocument();
        CompatibilityOptions compatibilityOptions = this.zzXRT.getDocument().zzZpV().zzYVg;
        this.zzXQU.zzY("config:config-item-set");
        this.zzXQU.zz0("config:name", "ooo:configuration-settings");
        zzu("UseFormerObjectPositioning", "boolean", TelemetryEventStrings.Value.FALSE);
        if (document.zzZqn() == null || !document.zzZqn().zzYr5() || !"15".equals(compatibilityOptions.zzZYT().zzRZ("compatibilityMode").getValue())) {
            zzu("UseFormerTextWrapping", "boolean", TelemetryEventStrings.Value.FALSE);
        }
        zzu("PrinterIndependentLayout", "string", "high-resolution");
        zzu("DoNotJustifyLinesWithManualBreak", "boolean", TelemetryEventStrings.Value.FALSE);
        String str = TelemetryEventStrings.Value.TRUE;
        zzu("IgnoreTabsAndBlanksForLineCalculation", "boolean", TelemetryEventStrings.Value.TRUE);
        zzu("AddExternalLeading", "boolean", com.aspose.words.internal.zzJB.zz5(!compatibilityOptions.getNoLeading()));
        zzu("PrinterIndependentLayout", "string", "high-resolution");
        zzu("IgnoreFirstLineIndentInNumbering", "boolean", TelemetryEventStrings.Value.FALSE);
        if (this.zzXRT.zzYs7()) {
            zzu("AddParaSpacingToTableCells", "boolean", TelemetryEventStrings.Value.TRUE);
        }
        if (!compatibilityOptions.getApplyBreakingRules()) {
            str = TelemetryEventStrings.Value.FALSE;
        }
        zzu("UseFormerLineSpacing", "boolean", str);
        if (!compatibilityOptions.getDoNotUseHTMLParagraphAutoSpacing()) {
            zzu("AddParaTableSpacing", "boolean", TelemetryEventStrings.Value.FALSE);
        }
        this.zzXQU.zzo();
    }

    private void zzYuf() {
        Document document = this.zzXRT.getDocument();
        this.zzXQU.zzY("config:config-item-set");
        this.zzXQU.zz0("config:name", "ooo:view-settings");
        zzu("ShowRedlineChanges", "boolean", com.aspose.words.internal.zzJB.zz5(document.zzZpV().zzZrN()));
        this.zzXQU.zzY("config:config-item-map-indexed");
        this.zzXQU.zz0("config:name", "Views");
        this.zzXQU.zzY("config:config-item-map-entry");
        zzu("VisibleLeft", "int", "0");
        zzu("VisibleRight", "int", "0");
        zzu("VisibleTop", "int", "0");
        zzu("VisibleBottom", "int", "0");
        zzu("ZoomType", "short", com.aspose.words.internal.zzJB.zzWD(document.getViewOptions().getZoomType()));
        zzu("ZoomFactor", "short", Integer.toString(document.getViewOptions().getZoomPercent()));
        this.zzXQU.zzo();
        this.zzXQU.zzo();
        this.zzXQU.zzo();
    }

    private void zzu(String str, String str2, String str3) {
        this.zzXQU.zzY("config:config-item");
        this.zzXQU.zz0("config:name", str);
        this.zzXQU.zz0("config:type", str2);
        this.zzXQU.writeString(str3);
        this.zzXQU.zzo();
    }

    public final void zzIg() {
        this.zzXQU.zzW(this.zzXRT);
        this.zzXQU.zzY("office:settings");
        zzYuf();
        zzYue();
        this.zzXQU.zzo();
        this.zzXQU.endDocument();
    }
}
