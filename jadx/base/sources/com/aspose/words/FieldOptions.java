package com.aspose.words;

import com.aspose.words.net.System.Globalization.CultureInfo;

/* JADX INFO: loaded from: classes6.dex */
public final class FieldOptions {
    private boolean zzYCA;
    private boolean zzYCB;
    private String zzYCC;
    private String zzYCD;
    private IComparisonExpressionEvaluator zzYCE;
    private IFieldUserPromptRespondent zzYCF;
    private boolean zzYCG;
    private IFieldUpdateCultureProvider zzYCH;
    private int zzYCI;
    private String[] zzYCp = new String[0];
    private IFieldUpdatingProgressCallback zzYCq;
    private IFieldUpdatingCallback zzYCr;
    private IFieldResultFormatter zzYCs;
    private String zzYCt;
    private ToaCategories zzYCu;
    private UserInformation zzYCv;
    private com.aspose.words.internal.zzZP1 zzYCw;
    private IBibliographyStylesProvider zzYCx;
    private IFieldDatabaseProvider zzYCy;
    private IBarcodeGenerator zzYCz;
    private Document zzZEY;
    private String zzZS;

    public FieldOptions(Document document) {
        this.zzZEY = document;
    }

    public final IBarcodeGenerator getBarcodeGenerator() {
        return this.zzYCz;
    }

    public final IBibliographyStylesProvider getBibliographyStylesProvider() {
        return this.zzYCx;
    }

    public final String[] getBuiltInTemplatesPaths() {
        return this.zzYCp;
    }

    public final IComparisonExpressionEvaluator getComparisonExpressionEvaluator() {
        return this.zzYCE;
    }

    public final UserInformation getCurrentUser() {
        return this.zzYCv;
    }

    public final String getCustomTocStyleSeparator() {
        return this.zzYCC;
    }

    public final String getDefaultDocumentAuthor() {
        return this.zzYCD;
    }

    public final IFieldDatabaseProvider getFieldDatabaseProvider() {
        return this.zzYCy;
    }

    public final int getFieldIndexFormat() {
        return zzZQ2.zzu(this.zzZEY);
    }

    public final IFieldUpdateCultureProvider getFieldUpdateCultureProvider() {
        return this.zzYCH;
    }

    public final int getFieldUpdateCultureSource() {
        return this.zzYCI;
    }

    public final IFieldUpdatingCallback getFieldUpdatingCallback() {
        return this.zzYCr;
    }

    public final IFieldUpdatingProgressCallback getFieldUpdatingProgressCallback() {
        return this.zzYCq;
    }

    public final String getFileName() {
        return this.zzZS;
    }

    public final boolean getLegacyNumberFormat() {
        return this.zzYCB;
    }

    public final CultureInfo getPreProcessCulture() {
        return com.aspose.words.internal.zzZP1.zzT(this.zzYCw);
    }

    public final IFieldResultFormatter getResultFormatter() {
        return this.zzYCs;
    }

    public final String getTemplateName() {
        return this.zzYCt;
    }

    public final ToaCategories getToaCategories() {
        return this.zzYCu;
    }

    public final boolean getUseInvariantCultureNumberFormat() {
        return this.zzYCA;
    }

    public final IFieldUserPromptRespondent getUserPromptRespondent() {
        return this.zzYCF;
    }

    public final void isBidiTextSupportedOnUpdate(boolean z) {
        this.zzYCG = z;
    }

    public final void setBarcodeGenerator(IBarcodeGenerator iBarcodeGenerator) {
        this.zzYCz = iBarcodeGenerator;
    }

    public final void setBibliographyStylesProvider(IBibliographyStylesProvider iBibliographyStylesProvider) {
        this.zzYCx = iBibliographyStylesProvider;
    }

    public final void setBuiltInTemplatesPaths(String[] strArr) {
        com.aspose.words.internal.zzZ4.zzY((Object) strArr, "value");
        this.zzYCp = strArr;
    }

    public final void setComparisonExpressionEvaluator(IComparisonExpressionEvaluator iComparisonExpressionEvaluator) {
        this.zzYCE = iComparisonExpressionEvaluator;
    }

    public final void setCurrentUser(UserInformation userInformation) {
        this.zzYCv = userInformation;
    }

    public final void setCustomTocStyleSeparator(String str) {
        this.zzYCC = str;
    }

    public final void setDefaultDocumentAuthor(String str) {
        this.zzYCD = str;
    }

    public final void setFieldDatabaseProvider(IFieldDatabaseProvider iFieldDatabaseProvider) {
        this.zzYCy = iFieldDatabaseProvider;
    }

    public final void setFieldIndexFormat(int i) {
        zzZQ2.zzZ(this.zzZEY, i);
    }

    public final void setFieldUpdateCultureProvider(IFieldUpdateCultureProvider iFieldUpdateCultureProvider) {
        this.zzYCH = iFieldUpdateCultureProvider;
    }

    public final void setFieldUpdateCultureSource(int i) {
        this.zzYCI = i;
    }

    public final void setFieldUpdatingCallback(IFieldUpdatingCallback iFieldUpdatingCallback) {
        this.zzYCr = iFieldUpdatingCallback;
    }

    public final void setFieldUpdatingProgressCallback(IFieldUpdatingProgressCallback iFieldUpdatingProgressCallback) {
        this.zzYCq = iFieldUpdatingProgressCallback;
    }

    public final void setFileName(String str) {
        this.zzZS = str;
    }

    public final void setLegacyNumberFormat(boolean z) {
        this.zzYCB = z;
    }

    public final void setPreProcessCulture(CultureInfo cultureInfo) {
        this.zzYCw = com.aspose.words.internal.zzZP1.zzZ(cultureInfo);
    }

    public final void setResultFormatter(IFieldResultFormatter iFieldResultFormatter) {
        this.zzYCs = iFieldResultFormatter;
    }

    public final void setTemplateName(String str) {
        this.zzYCt = str;
    }

    public final void setToaCategories(ToaCategories toaCategories) {
        this.zzYCu = toaCategories;
    }

    public final void setUseInvariantCultureNumberFormat(boolean z) {
        this.zzYCA = z;
    }

    public final void setUserPromptRespondent(IFieldUserPromptRespondent iFieldUserPromptRespondent) {
        this.zzYCF = iFieldUserPromptRespondent;
    }

    public final ToaCategories zzZcI() {
        return getToaCategories() != null ? getToaCategories() : ToaCategories.getDefaultCategories();
    }

    public final UserInformation zzZcJ() {
        return getCurrentUser() != null ? getCurrentUser() : UserInformation.getDefaultUser();
    }

    public final com.aspose.words.internal.zzZP1 zzZcK() {
        return this.zzYCw;
    }

    public final int zzZcL() {
        return (getLegacyNumberFormat() ? 4 : 0) | (getUseInvariantCultureNumberFormat() ? 8 : 0);
    }

    public final boolean isBidiTextSupportedOnUpdate() {
        return this.zzYCG;
    }
}
