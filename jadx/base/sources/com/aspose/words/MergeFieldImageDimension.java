package com.aspose.words;

import com.google.mlkit.p567nl.translate.TranslateLanguage;

/* JADX INFO: loaded from: classes6.dex */
public class MergeFieldImageDimension implements Cloneable {
    private static com.aspose.words.internal.zzZYI zzXZZ = zzYDP();
    private double zzE0;
    private int zzZEC = 0;

    public MergeFieldImageDimension(double d) {
        setValue(d);
    }

    public static boolean zzY(MergeFieldImageDimension mergeFieldImageDimension) {
        return mergeFieldImageDimension != null && mergeFieldImageDimension.getValue() >= 0.0d;
    }

    private static com.aspose.words.internal.zzZYI zzYDP() {
        com.aspose.words.internal.zzZYI zzzyi = new com.aspose.words.internal.zzZYI(false);
        zzzyi.add(TranslateLanguage.PORTUGUESE, 0);
        zzzyi.add("%", 1);
        return zzzyi;
    }

    public static MergeFieldImageDimension zzYJ(String str, String str2) {
        int i;
        double dZzZs = com.aspose.words.internal.zzJB.zzZs(str);
        if (Double.isNaN(dZzZs)) {
            return null;
        }
        if (com.aspose.words.internal.zzZYD.zzXk(str2)) {
            i = zzXZZ.get(str2);
            if (com.aspose.words.internal.zzZYI.zzWm(i)) {
                return null;
            }
        } else {
            i = 0;
        }
        MergeFieldImageDimension mergeFieldImageDimension = new MergeFieldImageDimension();
        mergeFieldImageDimension.setValue(dZzZs);
        mergeFieldImageDimension.zzZEC = i;
        return mergeFieldImageDimension;
    }

    public static double zzZ(MergeFieldImageDimension mergeFieldImageDimension, double d) {
        if (!zzY(mergeFieldImageDimension)) {
            return d;
        }
        int i = mergeFieldImageDimension.zzZEC;
        if (i == 0) {
            return mergeFieldImageDimension.getValue();
        }
        if (i == 1) {
            return (mergeFieldImageDimension.getValue() * d) / 100.0d;
        }
        throw new IllegalStateException("Undefined MergeFieldImageDimensionUnit has been encountered.");
    }

    public int getUnit() {
        return this.zzZEC;
    }

    public double getValue() {
        return this.zzE0;
    }

    public Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public void setUnit(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: value");
        }
        this.zzZEC = i;
    }

    public void setValue(double d) {
        this.zzE0 = d;
    }

    public final MergeFieldImageDimension zzYDQ() {
        return (MergeFieldImageDimension) memberwiseClone();
    }

    public MergeFieldImageDimension(double d, int i) {
        setValue(d);
        setUnit(i);
    }

    public MergeFieldImageDimension() {
        setValue(-1.0d);
    }
}
