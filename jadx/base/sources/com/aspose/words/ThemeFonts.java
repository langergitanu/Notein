package com.aspose.words;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class ThemeFonts implements Cloneable {
    private HashMap<String, zzY5F> zzX2Y = new HashMap<>();
    FontInfo zzX2Z;
    FontInfo zzX30;
    FontInfo zzX31;
    private boolean zzX35;

    public String getComplexScript() {
        FontInfo fontInfo = this.zzX31;
        return fontInfo != null ? fontInfo.getName() : "";
    }

    public String getEastAsian() {
        FontInfo fontInfo = this.zzX30;
        return fontInfo != null ? fontInfo.getName() : "";
    }

    public String getLatin() {
        FontInfo fontInfo = this.zzX2Z;
        return fontInfo != null ? fontInfo.getName() : "";
    }

    public Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public void setComplexScript(String str) {
        if (com.aspose.words.internal.zzZKN.equals(str, getComplexScript())) {
            return;
        }
        this.zzX31 = com.aspose.words.internal.zzZYD.zzXk(str) ? new FontInfo(str) : null;
        this.zzX35 = true;
    }

    public void setEastAsian(String str) {
        if (com.aspose.words.internal.zzZKN.equals(str, getEastAsian())) {
            return;
        }
        this.zzX30 = com.aspose.words.internal.zzZYD.zzXk(str) ? new FontInfo(str) : null;
        this.zzX35 = true;
    }

    public void setLatin(String str) {
        if (com.aspose.words.internal.zzZKN.equals(str, getLatin())) {
            return;
        }
        this.zzX2Z = com.aspose.words.internal.zzZYD.zzXk(str) ? new FontInfo(str) : null;
        this.zzX35 = true;
    }

    public final boolean zzXVB() {
        return this.zzX35;
    }

    public final Map<String, zzY5F> zzXVu() {
        return this.zzX2Y;
    }

    public final ThemeFonts zzXVv() {
        ThemeFonts themeFonts = (ThemeFonts) memberwiseClone();
        FontInfo fontInfo = this.zzX31;
        if (fontInfo != null) {
            themeFonts.zzX31 = fontInfo.zzZ7b();
        }
        FontInfo fontInfo2 = this.zzX30;
        if (fontInfo2 != null) {
            themeFonts.zzX30 = fontInfo2.zzZ7b();
        }
        FontInfo fontInfo3 = this.zzX2Z;
        if (fontInfo3 != null) {
            themeFonts.zzX2Z = fontInfo3.zzZ7b();
        }
        themeFonts.zzX2Y = new HashMap<>();
        for (Map.Entry<String, zzY5F> entry : this.zzX2Y.entrySet()) {
            com.aspose.words.internal.zzZQF.zzY(themeFonts.zzX2Y, entry.getKey(), entry.getValue().zzXVq());
        }
        return themeFonts;
    }
}
