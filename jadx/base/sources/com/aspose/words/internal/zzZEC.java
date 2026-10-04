package com.aspose.words.internal;

import com.huawei.hms.network.embedded.C18241k5;
import java.util.HashSet;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZEC extends zzZEF {
    protected HashSet<zzZ> zzWJJ;
    protected String zzWJK;
    protected zzZEC zzWJL;
    protected String zzZnu;
    protected String zzZpC;

    public static final class zzZ implements Comparable<zzZ> {
        final int zzV1;
        final String zzWJI;
        final String zzZnu;

        public zzZ(String str, String str2) {
            str = str == null ? "" : str;
            this.zzWJI = str;
            this.zzZnu = str2;
            this.zzV1 = (str.hashCode() * 31) ^ str2.hashCode();
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: zzZ, reason: merged with bridge method [inline-methods] */
        public int compareTo(zzZ zzz) {
            int iCompareTo = this.zzWJI.compareTo(zzz.zzWJI);
            return iCompareTo == 0 ? this.zzZnu.compareTo(zzz.zzZnu) : iCompareTo;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof zzZ)) {
                return false;
            }
            zzZ zzz = (zzZ) obj;
            String str = zzz.zzZnu;
            String str2 = this.zzZnu;
            if (str != str2 && !str.equals(str2)) {
                return false;
            }
            String str3 = zzz.zzWJI;
            String str4 = this.zzWJI;
            return str3 == str4 || str3.equals(str4);
        }

        public final int hashCode() {
            return this.zzV1;
        }

        public final String toString() {
            if (this.zzWJI.length() <= 0) {
                return this.zzZnu;
            }
            return "{" + this.zzWJI + "} " + this.zzZnu;
        }
    }

    private zzZEC() {
        this.zzWJJ = null;
        this.zzWJL = null;
        this.zzZpC = null;
        this.zzZnu = "";
        this.zzWJK = null;
    }

    public static zzZEC zzXLU() {
        return new zzZEC();
    }

    private void zzZ(zzZEC zzzec, String str, String str2, String str3) {
        zzZ((zzZEF) zzzec);
        this.zzWJL = zzzec;
        this.zzZpC = str;
        this.zzZnu = str2;
        this.zzWJK = str3;
        zzZE6 zzze6 = zzzec.zzWJR;
        this.zzWJR = zzze6;
        this.zzWJQ = zzze6 != null;
        this.zzWNf = zzzec.zzWNf;
        this.zzWKi = zzzec.zzWKi;
    }

    public final String getLocalName() {
        return this.zzZnu;
    }

    public final String getNamespaceURI() {
        return this.zzWJK;
    }

    public final String getPrefix() {
        return this.zzZpC;
    }

    public final void setPrefix(String str) {
        this.zzZpC = str;
    }

    public final String zzXLR() {
        String str = this.zzZpC;
        if (str == null || str.length() <= 0) {
            String str2 = this.zzZnu;
            return (str2 == null || str2.length() <= 0) ? "#error" : this.zzZnu;
        }
        return this.zzZpC + C18241k5.f55433h + this.zzZnu;
    }

    public final boolean zzXLS() {
        return this.zzWJL == null;
    }

    public final zzZEC zzXLT() {
        return this.zzWJL;
    }

    public final void zzXy(String str, String str2) throws zzZQS {
        zzZ zzz = new zzZ(str, str2);
        if (this.zzWJJ == null) {
            this.zzWJJ = new HashSet<>();
        }
        if (this.zzWJJ.add(zzz)) {
            return;
        }
        throw new zzZQS("Duplicate attribute write for attribute '" + zzz + "'");
    }

    public final zzZEC zzY(zzZEC zzzec, String str, String str2, String str3) {
        this.zzWJJ = null;
        zzZEC zzzec2 = this.zzWJL;
        zzZ(zzzec, str, str2, str3);
        return zzzec2;
    }

    public final zzZEC zzg(String str, String str2, String str3) {
        this.zzWJJ = null;
        return new zzZEC(this, str, str2, str3, this.zzWJR);
    }

    public final void zzx5(String str) {
        this.zzWNf = str;
    }

    public final zzZEC zzx6(String str) {
        this.zzWJJ = null;
        return new zzZEC(this, null, str, this.zzWNf, this.zzWJR);
    }

    private zzZEC(zzZEC zzzec, String str, String str2, String str3, zzZE6 zzze6) {
        super(zzzec, zzze6);
        this.zzWJJ = null;
        this.zzWJL = zzzec;
        this.zzZpC = str;
        this.zzZnu = str2;
        this.zzWJK = str3;
    }

    public final zzZEC zzZ(zzZEC zzzec, String str) {
        this.zzWJJ = null;
        zzZEC zzzec2 = this.zzWJL;
        zzZ(zzzec, null, str, this.zzWNf);
        return zzzec2;
    }

    public final void zzZ(zzZEC zzzec) {
        this.zzWJL = zzzec;
    }
}
