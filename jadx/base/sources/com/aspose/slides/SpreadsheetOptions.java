package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p463vm.C11697x1;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public class SpreadsheetOptions implements ISpreadsheetOptions {

    /* JADX INFO: renamed from: k4 */
    private boolean f3458k4 = false;

    /* JADX INFO: renamed from: x1 */
    private C11697x1 f3459x1 = new C11697x1("en-US");

    @Override // com.aspose.slides.ISpreadsheetOptions
    public final Locale getPreferredCulture() {
        return C11697x1.m55246k4(m2832k4());
    }

    @Override // com.aspose.slides.ISpreadsheetOptions
    public final boolean getRecoverWorkbookFromChartCache() {
        return this.f3458k4;
    }

    /* JADX INFO: renamed from: k4 */
    public C11697x1 m2832k4() {
        return this.f3459x1;
    }

    @Override // com.aspose.slides.ISpreadsheetOptions
    public final void setPreferredCulture(Locale locale) {
        m2833k4(C11697x1.m55245k4(locale));
    }

    @Override // com.aspose.slides.ISpreadsheetOptions
    public final void setRecoverWorkbookFromChartCache(boolean z) {
        this.f3458k4 = z;
    }

    /* JADX INFO: renamed from: k4 */
    public void m2833k4(C11697x1 c11697x1) {
        if (c11697x1 == null) {
            throw new ArgumentNullException("value");
        }
        this.f3459x1 = c11697x1;
    }
}
