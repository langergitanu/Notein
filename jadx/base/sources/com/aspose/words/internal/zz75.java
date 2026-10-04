package com.aspose.words.internal;

import com.huawei.hms.network.embedded.C18437z2;

/* JADX INFO: loaded from: classes5.dex */
public final class zz75 implements Cloneable {
    private String zzYL;
    private String zzZh;
    private boolean zzmO;
    private String zzmP;

    public zz75(String str, String str2, String str3, boolean z) {
        zzZ4.zzU(str, "id");
        zzZ4.zzU(str2, C18437z2.f56754h);
        zzZ4.zzU(str3, "target");
        this.zzZh = str;
        this.zzYL = str3;
        this.zzmP = str2;
        this.zzmO = z;
    }

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public final String getId() {
        return this.zzZh;
    }

    public final String getTarget() {
        return this.zzYL;
    }

    public final String getType() {
        return this.zzmP;
    }

    public final boolean isExternal() {
        return this.zzmO;
    }

    public final zz75 zzxi() {
        return (zz75) memberwiseClone();
    }
}
