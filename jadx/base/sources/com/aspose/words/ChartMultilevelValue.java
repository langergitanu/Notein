package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class ChartMultilevelValue {
    private String zzZxU;
    private String zzZxV;
    private String zzZxW;

    public ChartMultilevelValue(String str, String str2, String str3) {
        this.zzZxW = str;
        this.zzZxV = str2;
        this.zzZxU = str3;
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
        ChartMultilevelValue chartMultilevelValue = (ChartMultilevelValue) obj;
        return com.aspose.words.internal.zzZKN.equals(chartMultilevelValue.getLevel1(), getLevel1()) && com.aspose.words.internal.zzZKN.equals(chartMultilevelValue.getLevel2(), getLevel2()) && com.aspose.words.internal.zzZKN.equals(chartMultilevelValue.getLevel3(), getLevel3());
    }

    public String getLevel1() {
        return this.zzZxW;
    }

    public String getLevel2() {
        return this.zzZxV;
    }

    public String getLevel3() {
        return this.zzZxU;
    }

    public int hashCode() {
        int iHashCode = getLevel1() != null ? getLevel1().hashCode() : 0;
        if (getLevel2() != null) {
            iHashCode = (iHashCode * 31) + getLevel2().hashCode();
        }
        if (getLevel3() != null) {
            return getLevel3().hashCode() + (iHashCode * 31);
        }
        return iHashCode;
    }

    public ChartMultilevelValue(String str, String str2) {
        this.zzZxW = str;
        this.zzZxV = str2;
    }

    public ChartMultilevelValue(String str) {
        this.zzZxW = str;
    }
}
