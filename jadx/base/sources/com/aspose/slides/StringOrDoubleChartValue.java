package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14080ne;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.InterfaceC14073kp;

/* JADX INFO: loaded from: classes3.dex */
public class StringOrDoubleChartValue extends BaseChartValue implements IStringOrDoubleChartValue {

    /* JADX INFO: renamed from: kk */
    private String f3463kk;

    /* JADX INFO: renamed from: to */
    private double f3464to;

    /* JADX INFO: renamed from: x1 */
    private C14355qp f3465x1;

    public StringOrDoubleChartValue(InterfaceC14397rj interfaceC14397rj, C0936ec c0936ec, boolean z) {
        super(interfaceC14397rj, c0936ec, z);
        this.f3463kk = null;
        this.f3464to = Double.NaN;
    }

    /* JADX INFO: renamed from: k4 */
    public static double m2834k4(IStringOrDoubleChartValue iStringOrDoubleChartValue, double d) {
        StringOrDoubleChartValue stringOrDoubleChartValue = (StringOrDoubleChartValue) iStringOrDoubleChartValue;
        int dataSourceType = stringOrDoubleChartValue.getDataSourceType();
        if (dataSourceType != 0) {
            if (dataSourceType == 1) {
                return C14080ne.m66906fa(stringOrDoubleChartValue.f3463kk, (InterfaceC14073kp) C11697x1.m55250kk());
            }
            if (dataSourceType != 2) {
                throw new Exception();
            }
            if (!C14044b3.m66437kk(stringOrDoubleChartValue.f3464to)) {
                return stringOrDoubleChartValue.f3464to;
            }
        } else if (stringOrDoubleChartValue.m2838x1().m69722k4() != null && stringOrDoubleChartValue.m2838x1().m69722k4().getValue() != null && ((ChartDataCell) stringOrDoubleChartValue.m2838x1().m69722k4()).m566k4() != 3) {
            return C14080ne.m66904fa(stringOrDoubleChartValue.m2838x1().m69722k4().getValue(), C11697x1.m55250kk());
        }
        return d;
    }

    /* JADX INFO: renamed from: x1 */
    private C14355qp m2838x1() {
        if (this.f3465x1 == null) {
            this.f3465x1 = new C14355qp(this.f1047k4);
        }
        return this.f3465x1;
    }

    @Override // com.aspose.slides.ISingleCellChartValue
    public final IChartDataCell getAsCell() {
        if (getDataSourceType() == 0) {
            return m2838x1().m69722k4();
        }
        throw new InvalidOperationException(C14113y2.m67408k4("DataSourceType property value is not DataSourceType.Worksheet. ", "And so this property is not actual. See BaseChartValue.DataSourceType property summary."));
    }

    @Override // com.aspose.slides.IStringOrDoubleChartValue
    public final double getAsLiteralDouble() {
        if (getDataSourceType() == 2) {
            return this.f3464to;
        }
        throw new InvalidOperationException(C14113y2.m67408k4("DataSourceType property value is not DataSourceType.DoubleLiterals. ", "And so this property is not actual. See BaseChartValue.DataSourceType property summary."));
    }

    @Override // com.aspose.slides.IStringOrDoubleChartValue
    public final String getAsLiteralString() {
        if (getDataSourceType() == 1) {
            return this.f3463kk;
        }
        throw new InvalidOperationException(C14113y2.m67408k4("DataSourceType property value is not DataSourceType.StringLiterals. ", "And so this property is not actual. See BaseChartValue.DataSourceType property summary."));
    }

    @Override // com.aspose.slides.BaseChartValue, com.aspose.slides.IBaseChartValue
    public Object getData() {
        int dataSourceType = getDataSourceType();
        if (dataSourceType == 0) {
            if (m2838x1().m69722k4() == null) {
                return null;
            }
            return m2838x1().m69722k4().getValue();
        }
        if (dataSourceType == 1) {
            return this.f3463kk;
        }
        if (dataSourceType != 2) {
            throw new Exception();
        }
        if (C14044b3.m66437kk(this.f3464to)) {
            return null;
        }
        return Double.valueOf(this.f3464to);
    }

    @Override // com.aspose.slides.ISingleCellChartValue
    public final void setAsCell(IChartDataCell iChartDataCell) {
        if (getDataSourceType() != 0) {
            throw new InvalidOperationException(C14113y2.m67408k4("DataSourceType property value is not DataSourceType.Worksheet. ", "And so this property is not actual. See BaseChartValue.DataSourceType property summary."));
        }
        m2838x1().m69723k4((ChartDataCell) iChartDataCell);
    }

    @Override // com.aspose.slides.IStringOrDoubleChartValue
    public final void setAsLiteralDouble(double d) {
        if (getDataSourceType() != 2) {
            throw new InvalidOperationException(C14113y2.m67408k4("DataSourceType property value is not DataSourceType.DoubleLiterals. ", "And so this property is not actual. See BaseChartValue.DataSourceType property summary."));
        }
        this.f3464to = d;
    }

    @Override // com.aspose.slides.IStringOrDoubleChartValue
    public final void setAsLiteralString(String str) {
        if (getDataSourceType() != 1) {
            throw new InvalidOperationException(C14113y2.m67408k4("DataSourceType property value is not DataSourceType.StringLiterals. ", "And so this property is not actual. See BaseChartValue.DataSourceType property summary."));
        }
        this.f3463kk = str;
    }

    @Override // com.aspose.slides.BaseChartValue, com.aspose.slides.IBaseChartValue
    public void setData(Object obj) {
        int dataSourceType = getDataSourceType();
        if (dataSourceType == 0) {
            if (C7019kk.m27469x1(obj, ChartDataCell.class)) {
                m2838x1().m69723k4((ChartDataCell) obj);
                return;
            } else {
                ((ChartDataCell) m2838x1().m69722k4()).m570k4(obj);
                return;
            }
        }
        if (dataSourceType == 1) {
            if (!C7019kk.m27469x1(obj, String.class)) {
                throw new ArgumentException("Assigned value is not appropriate to DataSourceType.");
            }
            this.f3463kk = (String) obj;
        } else {
            if (dataSourceType != 2) {
                throw new InvalidOperationException();
            }
            if (obj == null) {
                this.f3464to = Double.NaN;
            } else {
                if (!C7019kk.m27469x1(obj, Double.class)) {
                    throw new ArgumentException("Assigned value is not appropriate to DataSourceType.");
                }
                this.f3464to = ((Double) C7019kk.m27464to(obj, Double.TYPE)).doubleValue();
            }
        }
    }

    @Override // com.aspose.slides.IStringOrDoubleChartValue
    public final double toDouble() {
        return m2834k4(this, Double.NaN);
    }

    /* JADX INFO: renamed from: k4 */
    public static String m2835k4(IStringOrDoubleChartValue iStringOrDoubleChartValue) {
        StringOrDoubleChartValue stringOrDoubleChartValue = (StringOrDoubleChartValue) iStringOrDoubleChartValue;
        int dataSourceType = stringOrDoubleChartValue.getDataSourceType();
        if (dataSourceType == 0) {
            return stringOrDoubleChartValue.m2838x1().m69722k4() == null ? C14113y2.f47374k4 : C14080ne.m66987ks(stringOrDoubleChartValue.m2838x1().m69722k4().getValue(), C11697x1.m55250kk());
        }
        if (dataSourceType == 1) {
            String str = stringOrDoubleChartValue.f3463kk;
            return str == null ? C14113y2.f47374k4 : str;
        }
        if (dataSourceType == 2) {
            return C14044b3.m66437kk(stringOrDoubleChartValue.f3464to) ? C14113y2.f47374k4 : C14080ne.m66946k4(Double.valueOf(stringOrDoubleChartValue.f3464to), (InterfaceC14073kp) C11697x1.m55250kk());
        }
        throw new Exception();
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m2836k4(ISingleCellChartValue iSingleCellChartValue) {
        return m2837k4(iSingleCellChartValue, true);
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m2837k4(ISingleCellChartValue iSingleCellChartValue, boolean z) {
        StringOrDoubleChartValue stringOrDoubleChartValue = (StringOrDoubleChartValue) C7019kk.m27452k4((Object) iSingleCellChartValue, StringOrDoubleChartValue.class);
        if (stringOrDoubleChartValue == null) {
            return false;
        }
        int dataSourceType = stringOrDoubleChartValue.getDataSourceType();
        if (dataSourceType == 0) {
            if (stringOrDoubleChartValue.m2838x1().m69722k4() == null || stringOrDoubleChartValue.m2838x1().m69722k4().getValue() == null) {
                return true;
            }
            return z && C14113y2.m67411k4(stringOrDoubleChartValue.m2838x1().m69722k4().getValue().toString());
        }
        if (dataSourceType == 1) {
            String str = stringOrDoubleChartValue.f3463kk;
            return z ? C14113y2.m67411k4(str) : str == null;
        }
        if (dataSourceType == 2) {
            return C14044b3.m66437kk(stringOrDoubleChartValue.f3464to);
        }
        throw new Exception();
    }
}
