package com.aspose.words;

import java.util.Date;

/* JADX INFO: loaded from: classes6.dex */
public class ChartYValue {
    private int zzZxi;
    private double zzZxg = Double.NaN;
    private com.aspose.words.internal.zzZQ9 zzZxf = com.aspose.words.internal.zzZQ9.zz35;
    private com.aspose.words.internal.zzZNF zzZxe = com.aspose.words.internal.zzZNF.zzZVR;

    private ChartYValue() {
    }

    public static ChartYValue fromDateTime(Date date) {
        return zzx(com.aspose.words.internal.zzZQ9.zzZ(date));
    }

    public static ChartYValue fromDouble(double d) {
        ChartYValue chartYValue = new ChartYValue();
        chartYValue.zzZxg = d;
        chartYValue.zzZxi = 0;
        return chartYValue;
    }

    public static ChartYValue fromTimeSpan(long j) {
        return zzT(com.aspose.words.internal.zzZNF.zzYv(j));
    }

    public static ChartYValue zzT(com.aspose.words.internal.zzZNF zzznf) {
        ChartYValue chartYValue = new ChartYValue();
        chartYValue.zzZxe = zzznf;
        chartYValue.zzZxi = 2;
        return chartYValue;
    }

    public static ChartYValue zzx(com.aspose.words.internal.zzZQ9 zzzq9) {
        ChartYValue chartYValue = new ChartYValue();
        chartYValue.zzZxf = zzzq9;
        chartYValue.zzZxi = 1;
        return chartYValue;
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
        ChartYValue chartYValue = (ChartYValue) obj;
        if (getValueType() != chartYValue.getValueType()) {
            return false;
        }
        int valueType = getValueType();
        if (valueType == 0) {
            return this.zzZxg == chartYValue.zzZxg;
        }
        if (valueType == 1) {
            return this.zzZxf.equals(chartYValue.zzZxf);
        }
        if (valueType != 2) {
            return false;
        }
        return this.zzZxe.equals(chartYValue.zzZxe);
    }

    public Date getDateTimeValue() {
        return com.aspose.words.internal.zzZQ9.zzJ(this.zzZxf);
    }

    public double getDoubleValue() {
        return this.zzZxg;
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
            iZzZ9 = com.aspose.words.internal.zzZKP.zzZ9(this.zzZxg);
        } else if (i == 1) {
            iZzZ9 = this.zzZxf.hashCode();
        } else {
            if (i != 2) {
                return i2;
            }
            iZzZ9 = this.zzZxe.hashCode();
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
