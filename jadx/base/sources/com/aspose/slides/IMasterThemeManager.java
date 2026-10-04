package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public interface IMasterThemeManager extends IThemeManager {
    IMasterTheme getOverrideTheme();

    boolean isOverrideThemeEnabled();

    void setOverrideTheme(IMasterTheme iMasterTheme);

    void setOverrideThemeEnabled(boolean z);
}
