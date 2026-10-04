package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZDZ implements Comparable<zzZDZ> {
    volatile int zzXRU = 0;
    private String zzZnu;
    private String zzZpC;

    public zzZDZ(String str, String str2) {
        this.zzZnu = str2;
        if (str != null && str.length() == 0) {
            str = null;
        }
        this.zzZpC = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzZDZ)) {
            return false;
        }
        zzZDZ zzzdz = (zzZDZ) obj;
        return this.zzZnu == zzzdz.zzZnu && this.zzZpC == zzzdz.zzZpC;
    }

    public final String getLocalName() {
        return this.zzZnu;
    }

    public final String getPrefix() {
        return this.zzZpC;
    }

    public final int hashCode() {
        int iHashCode = this.zzXRU;
        if (iHashCode == 0) {
            iHashCode = this.zzZnu.hashCode();
            String str = this.zzZpC;
            if (str != null) {
                iHashCode ^= str.hashCode();
            }
            this.zzXRU = iHashCode;
        }
        return iHashCode;
    }

    public final String toString() {
        String str = this.zzZpC;
        if (str == null || str.length() == 0) {
            return this.zzZnu;
        }
        StringBuilder sb = new StringBuilder(this.zzZnu.length() + this.zzZpC.length() + 1);
        sb.append(this.zzZpC);
        sb.append(':');
        sb.append(this.zzZnu);
        return sb.toString();
    }

    public final boolean zzW(boolean z, String str) {
        if (z) {
            return "xml" == this.zzZpC && this.zzZnu == str;
        }
        if (this.zzZnu.length() == str.length() + 4 && this.zzZnu.startsWith("xml:") && this.zzZnu.endsWith(str)) {
            return true;
        }
        return false;
    }

    public final boolean zzXLC() {
        String str = this.zzZpC;
        return str == null ? this.zzZnu == "xmlns" : str == "xmlns";
    }

    public final zzZDZ zzXw(String str, String str2) {
        this.zzZnu = str2;
        if (str != null && str.length() == 0) {
            str = null;
        }
        this.zzZpC = str;
        this.zzXRU = 0;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: zzW, reason: merged with bridge method [inline-methods] */
    public int compareTo(zzZDZ zzzdz) {
        String str = zzzdz.zzZpC;
        if (str != null && str.length() != 0) {
            String str2 = this.zzZpC;
            if (str2 == null || str2.length() == 0) {
                return -1;
            }
            int iCompareTo = this.zzZpC.compareTo(str);
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        } else {
            String str3 = this.zzZpC;
            if (str3 != null && str3.length() > 0) {
                return 1;
            }
        }
        return this.zzZnu.compareTo(zzzdz.zzZnu);
    }
}
