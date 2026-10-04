package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p077d8.C3050f9;
import com.aspose.slides.internal.p077d8.C3100wp;

/* JADX INFO: loaded from: classes3.dex */
public class LoadOptions implements ILoadOptions {

    /* JADX INFO: renamed from: c5 */
    private ctm f2648c5;

    /* JADX INFO: renamed from: ck */
    private IFontSources f2649ck;

    /* JADX INFO: renamed from: du */
    private String f2650du;

    /* JADX INFO: renamed from: dy */
    private IWarningCallback f2651dy;

    /* JADX INFO: renamed from: fa */
    private IInterruptionToken f2652fa;

    /* JADX INFO: renamed from: h4 */
    private String f2653h4;

    /* JADX INFO: renamed from: jd */
    private IBlobManagementOptions f2654jd;

    /* JADX INFO: renamed from: k4 */
    private String f2655k4;

    /* JADX INFO: renamed from: kk */
    private String f2656kk;

    /* JADX INFO: renamed from: m9 */
    private boolean f2657m9;

    /* JADX INFO: renamed from: to */
    private String f2658to;

    /* JADX INFO: renamed from: up */
    private IResourceLoadingCallback f2659up;

    /* JADX INFO: renamed from: x1 */
    private int f2660x1;

    /* JADX INFO: renamed from: yj */
    private ISpreadsheetOptions f2661yj;

    public LoadOptions() {
        this.f2654jd = new BlobManagementOptions();
        this.f2649ck = new FontSources();
        this.f2652fa = InterruptionToken.getNone();
        this.f2660x1 = 0;
        this.f2661yj = new SpreadsheetOptions();
    }

    @Override // com.aspose.slides.ILoadOptions
    public final IBlobManagementOptions getBlobManagementOptions() {
        return this.f2654jd;
    }

    @Override // com.aspose.slides.ILoadOptions
    public final String getDefaultAsianFont() {
        return this.f2650du;
    }

    @Override // com.aspose.slides.ILoadOptions
    public final String getDefaultRegularFont() {
        return this.f2656kk;
    }

    @Override // com.aspose.slides.ILoadOptions
    public final String getDefaultSymbolFont() {
        return this.f2658to;
    }

    @Override // com.aspose.slides.ILoadOptions
    public final String getDefaultTextLanguage() {
        return this.f2655k4;
    }

    @Override // com.aspose.slides.ILoadOptions
    public final IFontSources getDocumentLevelFontSources() {
        return this.f2649ck;
    }

    @Override // com.aspose.slides.ILoadOptions
    public final IInterruptionToken getInterruptionToken() {
        return this.f2652fa;
    }

    @Override // com.aspose.slides.ILoadOptions
    public final int getLoadFormat() {
        return this.f2660x1;
    }

    @Override // com.aspose.slides.ILoadOptions
    public final boolean getOnlyLoadDocumentProperties() {
        return this.f2657m9;
    }

    @Override // com.aspose.slides.ILoadOptions
    public final String getPassword() {
        return this.f2653h4;
    }

    @Override // com.aspose.slides.ILoadOptions
    public final IResourceLoadingCallback getResourceLoadingCallback() {
        return this.f2659up;
    }

    @Override // com.aspose.slides.ILoadOptions
    public final ISpreadsheetOptions getSpreadsheetOptions() {
        return this.f2661yj;
    }

    @Override // com.aspose.slides.ILoadOptions
    public final IWarningCallback getWarningCallback() {
        return this.f2651dy;
    }

    /* JADX INFO: renamed from: k4 */
    public final ctm m1919k4() {
        return this.f2648c5;
    }

    /* JADX INFO: renamed from: kk */
    public final void m1922kk() {
        if (getWarningCallback() != null) {
            new C3050f9().sendWarning(getWarningCallback());
        }
    }

    @Override // com.aspose.slides.ILoadOptions
    public final void setBlobManagementOptions(IBlobManagementOptions iBlobManagementOptions) {
        this.f2654jd = iBlobManagementOptions;
    }

    @Override // com.aspose.slides.ILoadOptions
    public final void setDefaultAsianFont(String str) {
        this.f2650du = str;
    }

    @Override // com.aspose.slides.ILoadOptions
    public final void setDefaultRegularFont(String str) {
        this.f2656kk = str;
    }

    @Override // com.aspose.slides.ILoadOptions
    public final void setDefaultSymbolFont(String str) {
        this.f2658to = str;
    }

    @Override // com.aspose.slides.ILoadOptions
    public final void setDefaultTextLanguage(String str) {
        this.f2655k4 = str;
    }

    @Override // com.aspose.slides.ILoadOptions
    public final void setDocumentLevelFontSources(IFontSources iFontSources) {
        this.f2649ck = iFontSources;
    }

    @Override // com.aspose.slides.ILoadOptions
    public final void setInterruptionToken(IInterruptionToken iInterruptionToken) {
        this.f2652fa = iInterruptionToken;
    }

    @Override // com.aspose.slides.ILoadOptions
    public final void setLoadFormat(int i) {
        this.f2660x1 = i;
    }

    @Override // com.aspose.slides.ILoadOptions
    public final void setOnlyLoadDocumentProperties(boolean z) {
        this.f2657m9 = z;
    }

    @Override // com.aspose.slides.ILoadOptions
    public final void setPassword(String str) {
        if ("".equals(str)) {
            throw new ArgumentException("Password can't be an empty string", "value");
        }
        this.f2653h4 = str;
    }

    @Override // com.aspose.slides.ILoadOptions
    public final void setResourceLoadingCallback(IResourceLoadingCallback iResourceLoadingCallback) {
        this.f2659up = iResourceLoadingCallback;
    }

    @Override // com.aspose.slides.ILoadOptions
    public final void setSpreadsheetOptions(ISpreadsheetOptions iSpreadsheetOptions) {
        if (iSpreadsheetOptions == null) {
            throw new ArgumentNullException("value");
        }
        this.f2661yj = iSpreadsheetOptions;
    }

    @Override // com.aspose.slides.ILoadOptions
    public final void setWarningCallback(IWarningCallback iWarningCallback) {
        this.f2651dy = iWarningCallback;
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m1923x1() {
        return this.f2653h4 != null;
    }

    public LoadOptions(int i) {
        this.f2654jd = new BlobManagementOptions();
        this.f2649ck = new FontSources();
        this.f2652fa = InterruptionToken.getNone();
        this.f2660x1 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m1920k4(ctm ctmVar) {
        this.f2648c5 = ctmVar;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m1921k4(String str, int i) {
        if (getWarningCallback() != null) {
            new C3100wp(str, i).sendWarning(getWarningCallback());
        }
    }
}
