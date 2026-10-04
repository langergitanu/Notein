package com.aspose.words.internal;

import java.io.Serializable;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZR1 implements Serializable {
    private String zz3A;
    private String zz3B;
    private String zz3z;

    public zzZR1(String str) {
        this("", str);
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof zzZR1)) {
            return false;
        }
        zzZR1 zzzr1 = (zzZR1) obj;
        return this.zz3A.equals(zzzr1.zz3A) && this.zz3B.equals(zzzr1.zz3B);
    }

    public final String getLocalPart() {
        return this.zz3A;
    }

    public final int hashCode() {
        return this.zz3B.hashCode() ^ this.zz3A.hashCode();
    }

    public final String toString() {
        if (this.zz3B.equals("")) {
            return this.zz3A;
        }
        StringBuffer stringBuffer = new StringBuffer("{");
        stringBuffer.append(this.zz3B);
        stringBuffer.append("}");
        stringBuffer.append(this.zz3A);
        return stringBuffer.toString();
    }

    public zzZR1(String str, String str2) {
        this(str, str2, "");
    }

    public zzZR1(String str, String str2, String str3) {
        if (str2 != null) {
            str = str == null ? "" : str;
            str3 = str3 == null ? "" : str3;
            this.zz3B = str;
            this.zz3A = str2;
            this.zz3z = str3;
            return;
        }
        throw new IllegalArgumentException("Local part not allowed to be null");
    }
}
