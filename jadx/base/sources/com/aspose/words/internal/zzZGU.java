package com.aspose.words.internal;

import java.net.URI;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZGU {
    protected int zzV1 = 0;
    protected final URI zzWOo;
    protected final boolean zzWQ6;
    protected final int zzWQl;
    protected final String zzYrz;

    private zzZGU(String str, URI uri, int i, boolean z) {
        this.zzYrz = str;
        this.zzWOo = uri;
        this.zzWQl = i;
        this.zzWQ6 = z;
    }

    public static zzZGU zzZ(URI uri, int i, boolean z) {
        if (uri != null) {
            return new zzZGU(null, uri, i, z);
        }
        throw new IllegalArgumentException("Null system id.");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == zzZGU.class) {
            zzZGU zzzgu = (zzZGU) obj;
            if (zzzgu.zzWQl == this.zzWQl && zzzgu.zzWQ6 == this.zzWQ6) {
                String str = this.zzYrz;
                if (str == null) {
                    return this.zzWOo.equals(zzzgu.zzWOo);
                }
                String str2 = zzzgu.zzYrz;
                return str2 != null && str2.equals(str);
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zzV1;
        if (iHashCode == 0) {
            int i = this.zzWQl;
            String str = this.zzYrz;
            iHashCode = i ^ (str != null ? str.hashCode() : this.zzWOo.hashCode());
            if (this.zzWQ6) {
                iHashCode ^= 1;
            }
            this.zzV1 = iHashCode;
        }
        return iHashCode;
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer(60);
        stringBuffer.append("Public-id: ");
        stringBuffer.append(this.zzYrz);
        stringBuffer.append(", system-id: ");
        stringBuffer.append(this.zzWOo);
        stringBuffer.append(" [config flags: 0x");
        stringBuffer.append(Integer.toHexString(this.zzWQl));
        stringBuffer.append("], xml11: ");
        stringBuffer.append(this.zzWQ6);
        return stringBuffer.toString();
    }

    public static zzZGU zzZ(String str, URI uri, int i, boolean z) {
        if (str != null && str.length() > 0) {
            return new zzZGU(str, null, i, z);
        }
        if (uri != null) {
            return new zzZGU(null, uri, i, z);
        }
        throw new IllegalArgumentException("Illegal arguments; both public and system id null/empty.");
    }
}
