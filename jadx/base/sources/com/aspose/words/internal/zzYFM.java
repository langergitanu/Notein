package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public class zzYFM extends zzYFN implements zzYFU {
    final String mName;
    final String zzYry;
    final String zzYrz;

    public zzYFM(zzZQY zzzqy, String str, String str2, String str3) {
        super(zzzqy);
        this.mName = str;
        this.zzYrz = str2;
        this.zzYry = str3;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof zzYFU)) {
            return false;
        }
        zzYFU zzyfu = (zzYFU) obj;
        return zzYFN.zzXl(this.mName, zzyfu.getName()) && zzYFN.zzXl(this.zzYrz, zzyfu.getPublicId()) && zzYFN.zzXl(this.zzYry, zzyfu.getSystemId()) && zzYFN.zzXl(getBaseURI(), zzyfu.getBaseURI());
    }

    @Override // com.aspose.words.internal.zzYFU
    public String getBaseURI() {
        return "";
    }

    @Override // com.aspose.words.internal.zzYFN
    public final int getEventType() {
        return 14;
    }

    @Override // com.aspose.words.internal.zzZQO
    public final String getName() {
        return this.mName;
    }

    @Override // com.aspose.words.internal.zzZQO
    public final String getPublicId() {
        return this.zzYrz;
    }

    @Override // com.aspose.words.internal.zzZQO
    public final String getSystemId() {
        return this.zzYry;
    }

    public int hashCode() {
        String str = this.mName;
        int iHashCode = str != null ? str.hashCode() : 0;
        String str2 = this.zzYrz;
        if (str2 != null) {
            iHashCode ^= str2.hashCode();
        }
        String str3 = this.zzYry;
        return str3 != null ? iHashCode ^ str3.hashCode() : iHashCode;
    }
}
