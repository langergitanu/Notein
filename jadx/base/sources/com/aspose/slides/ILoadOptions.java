package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public interface ILoadOptions {
    IBlobManagementOptions getBlobManagementOptions();

    String getDefaultAsianFont();

    String getDefaultRegularFont();

    String getDefaultSymbolFont();

    String getDefaultTextLanguage();

    IFontSources getDocumentLevelFontSources();

    IInterruptionToken getInterruptionToken();

    int getLoadFormat();

    boolean getOnlyLoadDocumentProperties();

    String getPassword();

    IResourceLoadingCallback getResourceLoadingCallback();

    ISpreadsheetOptions getSpreadsheetOptions();

    IWarningCallback getWarningCallback();

    void setBlobManagementOptions(IBlobManagementOptions iBlobManagementOptions);

    void setDefaultAsianFont(String str);

    void setDefaultRegularFont(String str);

    void setDefaultSymbolFont(String str);

    void setDefaultTextLanguage(String str);

    void setDocumentLevelFontSources(IFontSources iFontSources);

    void setInterruptionToken(IInterruptionToken iInterruptionToken);

    void setLoadFormat(int i);

    void setOnlyLoadDocumentProperties(boolean z);

    void setPassword(String str);

    void setResourceLoadingCallback(IResourceLoadingCallback iResourceLoadingCallback);

    void setSpreadsheetOptions(ISpreadsheetOptions iSpreadsheetOptions);

    void setWarningCallback(IWarningCallback iWarningCallback);
}
