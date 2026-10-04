package com.aspose.slides;

import androidx.core.app.FrameMetricsAggregator;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14046bv;
import com.aspose.slides.p559ms.System.C14080ne;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.InterfaceC14073kp;

/* JADX INFO: loaded from: classes3.dex */
public class DoubleChartValue extends BaseChartValue implements IDoubleChartValue {

    /* JADX INFO: renamed from: kk */
    private double f2128kk;

    /* JADX INFO: renamed from: x1 */
    private C14355qp f2129x1;

    public DoubleChartValue(InterfaceC14397rj interfaceC14397rj, C0936ec c0936ec, boolean z) {
        super(interfaceC14397rj, c0936ec, z);
        this.f2128kk = Double.NaN;
    }

    /* JADX INFO: renamed from: k4 */
    public static double m1351k4(IDoubleChartValue iDoubleChartValue, double d) {
        DoubleChartValue doubleChartValue = (DoubleChartValue) iDoubleChartValue;
        int dataSourceType = doubleChartValue.getDataSourceType();
        if (dataSourceType != 0) {
            if (dataSourceType != 2) {
                throw new Exception();
            }
            if (!C14044b3.m66437kk(doubleChartValue.f2128kk)) {
                return doubleChartValue.f2128kk;
            }
        } else if (doubleChartValue.m1357x1().m69722k4() != null && doubleChartValue.m1357x1().m69722k4().getValue() != null) {
            if (m1355k4(doubleChartValue.m1357x1().m69722k4().getValue())) {
                return C14080ne.m66904fa(doubleChartValue.m1357x1().m69722k4().getValue(), C11697x1.m55250kk());
            }
            String string = (String) C7019kk.m27452k4(doubleChartValue.m1357x1().m69722k4().getValue(), String.class);
            if (string == null) {
                string = doubleChartValue.m1357x1().m69722k4().getValue().toString();
            }
            if (C14113y2.m67363du(string, C14113y2.f47374k4)) {
                return 0.0d;
            }
            double[] dArr = {0.0d};
            boolean zM66435k4 = C14044b3.m66435k4(string, FrameMetricsAggregator.EVERY_DURATION, C11697x1.m55250kk(), dArr);
            double d2 = dArr[0];
            if (zM66435k4) {
                return d2;
            }
        }
        return d;
    }

    /* JADX INFO: renamed from: x1 */
    public static double m1356x1(IDoubleChartValue iDoubleChartValue) {
        return m1351k4(iDoubleChartValue, 0.0d);
    }

    @Override // com.aspose.slides.ISingleCellChartValue
    public final IChartDataCell getAsCell() {
        if (getDataSourceType() == 0) {
            return m1357x1().m69722k4();
        }
        throw new InvalidOperationException(C14113y2.m67408k4("DataSourceType property value is not DataSourceType.Worksheet. ", "And so this property is not actual. See BaseChartValue.DataSourceType property summary."));
    }

    @Override // com.aspose.slides.IDoubleChartValue
    public final double getAsLiteralDouble() {
        if (getDataSourceType() == 2) {
            return this.f2128kk;
        }
        throw new InvalidOperationException(C14113y2.m67408k4("DataSourceType property value is not DataSourceType.DoubleLiterals. ", "And so this property is not actual. See BaseChartValue.DataSourceType property summary."));
    }

    @Override // com.aspose.slides.BaseChartValue, com.aspose.slides.IBaseChartValue
    public Object getData() {
        int dataSourceType = getDataSourceType();
        if (dataSourceType == 0) {
            if (m1357x1().m69722k4() == null) {
                return null;
            }
            return m1357x1().m69722k4().getValue();
        }
        if (dataSourceType != 2) {
            throw new Exception();
        }
        if (C14044b3.m66437kk(this.f2128kk)) {
            return null;
        }
        return Double.valueOf(this.f2128kk);
    }

    @Override // com.aspose.slides.ISingleCellChartValue
    public final void setAsCell(IChartDataCell iChartDataCell) {
        if (getDataSourceType() != 0) {
            throw new InvalidOperationException(C14113y2.m67408k4("DataSourceType property value is not DataSourceType.Worksheet. ", "And so this property is not actual. See BaseChartValue.DataSourceType property summary."));
        }
        ChartDataCell chartDataCell = (ChartDataCell) iChartDataCell;
        ((ChartData) m340k4().getChartData()).m553x1().mo5706k4(chartDataCell);
        m1357x1().m69723k4(chartDataCell);
    }

    @Override // com.aspose.slides.IDoubleChartValue
    public final void setAsLiteralDouble(double d) {
        if (getDataSourceType() != 2) {
            throw new InvalidOperationException(C14113y2.m67408k4("DataSourceType property value is not DataSourceType.DoubleLiterals. ", "And so this property is not actual. See BaseChartValue.DataSourceType property summary."));
        }
        this.f2128kk = d;
    }

    @Override // com.aspose.slides.BaseChartValue, com.aspose.slides.IBaseChartValue
    public void setData(Object obj) {
        int dataSourceType = getDataSourceType();
        if (dataSourceType == 0) {
            if (!C7019kk.m27469x1(obj, ChartDataCell.class)) {
                ((ChartDataCell) m1357x1().m69722k4()).m570k4(obj);
                return;
            }
            ChartDataCell chartDataCell = (ChartDataCell) obj;
            ((ChartData) m340k4().getChartData()).m553x1().mo5706k4(chartDataCell);
            m1357x1().m69723k4(chartDataCell);
            return;
        }
        if (dataSourceType != 2) {
            throw new Exception();
        }
        if (obj == null) {
            this.f2128kk = Double.NaN;
        } else {
            if (!C7019kk.m27469x1(obj, Double.class)) {
                throw new ArgumentException("Assigned value is not appropriate to DataSourceType.");
            }
            this.f2128kk = ((Double) C7019kk.m27464to(obj, Double.TYPE)).doubleValue();
        }
    }

    @Override // com.aspose.slides.IDoubleChartValue
    public final double toDouble() {
        return m1351k4(this, Double.NaN);
    }

    /* JADX INFO: renamed from: k4 */
    public static String m1352k4(IDoubleChartValue iDoubleChartValue) {
        DoubleChartValue doubleChartValue = (DoubleChartValue) iDoubleChartValue;
        int dataSourceType = doubleChartValue.getDataSourceType();
        if (dataSourceType == 0) {
            return doubleChartValue.m1357x1().m69722k4() == null ? C14113y2.f47374k4 : C14080ne.m66987ks(doubleChartValue.m1357x1().m69722k4().getValue(), C11697x1.m55250kk());
        }
        if (dataSourceType == 2) {
            return C14044b3.m66437kk(doubleChartValue.f2128kk) ? C14113y2.f47374k4 : C14080ne.m66946k4(Double.valueOf(doubleChartValue.f2128kk), (InterfaceC14073kp) C11697x1.m55250kk());
        }
        throw new Exception();
    }

    /* JADX INFO: renamed from: x1 */
    private C14355qp m1357x1() {
        if (this.f2129x1 == null) {
            this.f2129x1 = new C14355qp(this.f1047k4);
        }
        return this.f2129x1;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m1353k4(ISingleCellChartValue iSingleCellChartValue) {
        return m1354k4(iSingleCellChartValue, true, true);
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m1354k4(ISingleCellChartValue iSingleCellChartValue, boolean z, boolean z2) {
        DoubleChartValue doubleChartValue = (DoubleChartValue) C7019kk.m27452k4((Object) iSingleCellChartValue, DoubleChartValue.class);
        if (doubleChartValue == null) {
            return false;
        }
        int dataSourceType = doubleChartValue.getDataSourceType();
        if (dataSourceType != 0) {
            if (dataSourceType == 2) {
                return C14044b3.m66437kk(doubleChartValue.f2128kk);
            }
            throw new NotSupportedException(C14113y2.m67402k4("Data source '{0}' is not supported", C14042ak.m66410k4(DataSourceType.class, doubleChartValue.getDataSourceType())));
        }
        if (doubleChartValue.m1357x1().m69722k4() == null || doubleChartValue.m1357x1().m69722k4().getValue() == null) {
            return true;
        }
        if (z && C14113y2.m67411k4(doubleChartValue.m1357x1().m69722k4().getValue().toString())) {
            return true;
        }
        return z2 && C14113y2.m67363du(doubleChartValue.m1357x1().m69722k4().getValue().toString(), "#N/A");
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m1355k4(Object obj) {
        return C7019kk.m27469x1(obj, Byte.class) || C7019kk.m27469x1(obj, Integer.class) || C7019kk.m27469x1(obj, Long.class) || C7019kk.m27469x1(obj, Short.class) || C7019kk.m27469x1(obj, C14046bv.class) || C7019kk.m27469x1(obj, Double.class) || C7019kk.m27469x1(obj, Float.class);
    }
}
