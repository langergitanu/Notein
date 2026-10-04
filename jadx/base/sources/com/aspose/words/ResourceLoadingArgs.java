package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class ResourceLoadingArgs {
    private byte[] zzTZ;
    private String zzXBY;
    private int zzXBZ;
    private String zzkB;

    public ResourceLoadingArgs(String str, String str2, int i) {
        this.zzXBY = str2;
        this.zzXBZ = i;
        setUri(str);
    }

    public final byte[] getData() {
        return this.zzTZ;
    }

    public String getOriginalUri() {
        return this.zzXBY;
    }

    public int getResourceType() {
        return this.zzXBZ;
    }

    public String getUri() {
        return this.zzkB;
    }

    public void setData(byte[] bArr) {
        this.zzTZ = bArr;
    }

    public void setUri(String str) {
        this.zzkB = str;
    }

    public final boolean zzYlN() {
        byte[] bArr = this.zzTZ;
        return bArr == null || bArr.length == 0;
    }
}
