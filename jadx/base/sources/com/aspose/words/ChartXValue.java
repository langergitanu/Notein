package com.aspose.words;

import java.util.Date;

/* JADX INFO: loaded from: classes6.dex */
public class ChartXValue {
    private ChartMultilevelValue zzZxd;
    private String zzZxh;
    private int zzZxi;
    private double zzZxg = Double.NaN;
    private com.aspose.words.internal.zzZQ9 zzZxf = com.aspose.words.internal.zzZQ9.zz35;
    private com.aspose.words.internal.zzZNF zzZxe = com.aspose.words.internal.zzZNF.zzZVR;

    private ChartXValue() {
    }

    public static ChartXValue fromDateTime(Date date) {
        return zzy(com.aspose.words.internal.zzZQ9.zzZ(date));
    }

    public static ChartXValue fromDouble(double d) {
        ChartXValue chartXValue = new ChartXValue();
        chartXValue.zzZxg = d;
        chartXValue.zzZxi = 1;
        return chartXValue;
    }

    public static ChartXValue fromMultilevelValue(ChartMultilevelValue chartMultilevelValue) {
        if (chartMultilevelValue == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: value");
        }
        ChartXValue chartXValue = new ChartXValue();
        chartXValue.zzZxd = chartMultilevelValue;
        chartXValue.zzZxi = 4;
        return chartXValue;
    }

    public static ChartXValue fromString(String str) {
        ChartXValue chartXValue = new ChartXValue();
        chartXValue.zzZxh = str;
        chartXValue.zzZxi = 0;
        return chartXValue;
    }

    public static ChartXValue fromTimeSpan(long j) {
        return zzU(com.aspose.words.internal.zzZNF.zzYv(j));
    }

    public static ChartXValue zzU(com.aspose.words.internal.zzZNF zzznf) {
        ChartXValue chartXValue = new ChartXValue();
        chartXValue.zzZxe = zzznf;
        chartXValue.zzZxi = 3;
        return chartXValue;
    }

    public static ChartXValue zzy(com.aspose.words.internal.zzZQ9 zzzq9) {
        ChartXValue chartXValue = new ChartXValue();
        chartXValue.zzZxf = zzzq9;
        chartXValue.zzZxi = 2;
        return chartXValue;
    }

    public boolean equals(Object obj) {
        if (com.aspose.words.internal.zzZKO.zzA(null, obj)) {
            return false;
        }
        if (com.aspose.words.internal.zzZKO.zzA(this, obj)) {
            return true;
        }
        if (obj.getClass() != getClass()) {
            return false;
        }
        ChartXValue chartXValue = (ChartXValue) obj;
        if (getValueType() != chartXValue.getValueType()) {
            return false;
        }
        int valueType = getValueType();
        if (valueType == 0) {
            return com.aspose.words.internal.zzZKO.equals(this.zzZxh, chartXValue.getStringValue());
        }
        if (valueType == 1) {
            return this.zzZxg == chartXValue.zzZxg;
        }
        if (valueType == 2) {
            return this.zzZxf.equals(chartXValue.zzZxf);
        }
        if (valueType == 3) {
            return this.zzZxe.equals(chartXValue.zzZxe);
        }
        if (valueType != 4) {
            return false;
        }
        return this.zzZxd.equals(chartXValue.zzZxd);
    }

    public Date getDateTimeValue() {
        return com.aspose.words.internal.zzZQ9.zzJ(this.zzZxf);
    }

    public double getDoubleValue() {
        return this.zzZxg;
    }

    public ChartMultilevelValue getMultilevelValue() {
        return this.zzZxd;
    }

    public String getStringValue() {
        return this.zzZxh;
    }

    public long getTimeValue() {
        return com.aspose.words.internal.zzZNF.zzV(this.zzZxe);
    }

    public int getValueType() {
        return this.zzZxi;
    }

    public int hashCode() {
        int iZzZ9;
        int i = this.zzZxi;
        int i2 = i * 31;
        if (i == 0) {
            String str = this.zzZxh;
            return i2 + (str != null ? str.hashCode() : 0);
        }
        if (i == 1) {
            iZzZ9 = com.aspose.words.internal.zzZKP.zzZ9(this.zzZxg);
        } else if (i == 2) {
            iZzZ9 = this.zzZxf.hashCode();
        } else if (i == 3) {
            iZzZ9 = this.zzZxe.hashCode();
        } else {
            if (i != 4) {
                return i2;
            }
            iZzZ9 = this.zzZxd.hashCode();
        }
        return iZzZ9 + i2;
    }

    public final com.aspose.words.internal.zzZNF zz1J() {
        return this.zzZxe;
    }

    public final com.aspose.words.internal.zzZQ9 zz1K() {
        return this.zzZxf;
    }
}
