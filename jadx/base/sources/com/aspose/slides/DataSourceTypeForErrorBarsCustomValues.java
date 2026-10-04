package com.aspose.slides;

import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: loaded from: classes3.dex */
public class DataSourceTypeForErrorBarsCustomValues implements IDataSourceTypeForErrorBarsCustomValues {

    /* JADX INFO: renamed from: k4 */
    private C0936ec f2104k4 = new C0936ec();

    /* JADX INFO: renamed from: x1 */
    private C0936ec f2107x1 = new C0936ec();

    /* JADX INFO: renamed from: kk */
    private C0936ec f2105kk = new C0936ec();

    /* JADX INFO: renamed from: to */
    private C0936ec f2106to = new C0936ec();

    @Override // com.aspose.slides.IDataSourceTypeForErrorBarsCustomValues
    public final int getDataSourceTypeForXMinusValues() {
        return this.f2104k4.m5400k4();
    }

    @Override // com.aspose.slides.IDataSourceTypeForErrorBarsCustomValues
    public final int getDataSourceTypeForXPlusValues() {
        return this.f2107x1.m5400k4();
    }

    @Override // com.aspose.slides.IDataSourceTypeForErrorBarsCustomValues
    public final int getDataSourceTypeForYMinusValues() {
        return this.f2105kk.m5400k4();
    }

    @Override // com.aspose.slides.IDataSourceTypeForErrorBarsCustomValues
    public final int getDataSourceTypeForYPlusValues() {
        return this.f2106to.m5400k4();
    }

    /* JADX INFO: renamed from: k4 */
    public final C0936ec m1321k4() {
        return this.f2104k4;
    }

    /* JADX INFO: renamed from: kk */
    public final C0936ec m1322kk() {
        return this.f2105kk;
    }

    @Override // com.aspose.slides.IDataSourceTypeForErrorBarsCustomValues
    public final void setDataSourceTypeForXMinusValues(int i) {
        if (i != 0 && i != 2) {
            throw new InvalidOperationException(C14113y2.m67408k4("DataSourceTypeForXMinus can be ", "DataSourceType.Worksheet or DataSourceType.DoubleLiterals"));
        }
        this.f2104k4.m5401k4(i);
    }

    @Override // com.aspose.slides.IDataSourceTypeForErrorBarsCustomValues
    public final void setDataSourceTypeForXPlusValues(int i) {
        if (i != 0 && i != 2) {
            throw new InvalidOperationException(C14113y2.m67408k4("DataSourceTypeForXPlus can be ", "DataSourceType.Worksheet or DataSourceType.DoubleLiterals"));
        }
        this.f2107x1.m5401k4(i);
    }

    @Override // com.aspose.slides.IDataSourceTypeForErrorBarsCustomValues
    public final void setDataSourceTypeForYMinusValues(int i) {
        if (i != 0 && i != 2) {
            throw new InvalidOperationException(C14113y2.m67408k4("DataSourceTypeForYMinus can be ", "DataSourceType.Worksheet or DataSourceType.DoubleLiterals"));
        }
        this.f2105kk.m5401k4(i);
    }

    @Override // com.aspose.slides.IDataSourceTypeForErrorBarsCustomValues
    public final void setDataSourceTypeForYPlusValues(int i) {
        if (i != 0 && i != 2) {
            throw new InvalidOperationException(C14113y2.m67408k4("DataSourceTypeForYPlus can be ", "DataSourceType.Worksheet or DataSourceType.DoubleLiterals"));
        }
        this.f2106to.m5401k4(i);
    }

    /* JADX INFO: renamed from: to */
    public final C0936ec m1323to() {
        return this.f2106to;
    }

    /* JADX INFO: renamed from: x1 */
    public final C0936ec m1324x1() {
        return this.f2107x1;
    }
}
