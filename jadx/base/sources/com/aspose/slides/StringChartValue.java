package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.InvalidEnumArgumentException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: loaded from: classes3.dex */
public class StringChartValue extends BaseChartValue implements IStringChartValue {

    /* JADX INFO: renamed from: kk */
    private ChartCellCollection f3461kk;

    /* JADX INFO: renamed from: x1 */
    private String f3462x1;

    public StringChartValue(InterfaceC14397rj interfaceC14397rj, C0936ec c0936ec, boolean z) {
        super(interfaceC14397rj, c0936ec, z);
        this.f3461kk = new ChartCellCollection(this);
    }

    @Override // com.aspose.slides.IMultipleCellChartValue
    public final IChartCellCollection getAsCells() {
        if (getDataSourceType() != 0) {
            throw new InvalidOperationException(C14113y2.m67408k4("DataSourceType property value is not DataSourceType.Worksheet. ", "And so this property is not actual. See BaseChartValue.DataSourceType property summary."));
        }
        ((ChartData) C0754al.m3657k4(ChartData.class, this.f1047k4)).m553x1().mo5704k4();
        return this.f3461kk;
    }

    @Override // com.aspose.slides.IStringChartValue
    public final String getAsLiteralString() {
        if (getDataSourceType() == 1) {
            return this.f3462x1;
        }
        throw new InvalidOperationException(C14113y2.m67408k4("DataSourceType property value is not DataSourceType.StringLiterals. ", "And so this property is not actual. See BaseChartValue.DataSourceType property summary."));
    }

    @Override // com.aspose.slides.IStringChartValue
    public final String getCellsAddressInWorkbook() {
        return getDataSourceType() == 0 ? getAsCells().getCellsAddress() : "";
    }

    @Override // com.aspose.slides.BaseChartValue, com.aspose.slides.IBaseChartValue
    public Object getData() {
        int dataSourceType = getDataSourceType();
        if (dataSourceType == 0) {
            return getAsCells();
        }
        if (dataSourceType == 1) {
            return this.f3462x1;
        }
        throw new Exception();
    }

    @Override // com.aspose.slides.IMultipleCellChartValue
    public final void setAsCells(IChartCellCollection iChartCellCollection) {
        if (getDataSourceType() != 0) {
            throw new InvalidOperationException(C14113y2.m67408k4("DataSourceType property value is not DataSourceType.Worksheet. ", "And so this property is not actual. See BaseChartValue.DataSourceType property summary."));
        }
        if (iChartCellCollection == null) {
            throw new ArgumentNullException();
        }
        ((ChartData) C0754al.m3657k4(ChartData.class, this.f1047k4)).m553x1().mo5704k4();
        this.f3461kk = (ChartCellCollection) iChartCellCollection;
    }

    @Override // com.aspose.slides.IStringChartValue
    public final void setAsLiteralString(String str) {
        if (getDataSourceType() != 1) {
            throw new InvalidOperationException(C14113y2.m67408k4("DataSourceType property value is not DataSourceType.StringLiterals. ", "And so this property is not actual. See BaseChartValue.DataSourceType property summary."));
        }
        this.f3462x1 = str;
    }

    @Override // com.aspose.slides.BaseChartValue, com.aspose.slides.IBaseChartValue
    public void setData(Object obj) {
        int dataSourceType = getDataSourceType();
        if (dataSourceType != 0) {
            if (dataSourceType != 1) {
                throw new InvalidOperationException();
            }
            if (!C7019kk.m27469x1(obj, String.class)) {
                throw new ArgumentException("Assigned value is not appropriate to DataSourceType.");
            }
            this.f3462x1 = (String) obj;
            return;
        }
        if (obj == null) {
            throw new ArgumentNullException();
        }
        if (C7019kk.m27469x1(obj, IChartDataCell.class)) {
            setFromOneCell((IChartDataCell) obj);
        } else {
            if (!C7019kk.m27469x1(obj, IChartCellCollection.class)) {
                throw new ArgumentException("Assigned value is not appropriate to DataSourceType.");
            }
            setAsCells((ChartCellCollection) obj);
        }
    }

    @Override // com.aspose.slides.IStringChartValue
    public final void setFromOneCell(IChartDataCell iChartDataCell) {
        if (getDataSourceType() != 0) {
            throw new InvalidOperationException(C14113y2.m67408k4("DataSourceType property value is not DataSourceType.Worksheet. ", "And so this property is not actual. See BaseChartValue.DataSourceType property summary."));
        }
        setAsCells(new ChartCellCollection(this));
        getAsCells().add(iChartDataCell);
    }

    @Override // com.aspose.slides.IStringChartValue
    public String toString() {
        int dataSourceType = getDataSourceType();
        if (dataSourceType == 0) {
            return getAsCells().getConcatenatedValuesFromCells();
        }
        if (dataSourceType == 1) {
            return this.f3462x1;
        }
        throw new InvalidEnumArgumentException();
    }
}
