package com.aspose.words;

import com.google.firebase.messaging.Constants;

/* JADX INFO: loaded from: classes6.dex */
public class CustomPart implements Cloneable {
    private String zzZk2;
    private String zzZk4;
    private boolean zzmO;
    private String mName = "";
    private String zzZk3 = "";
    private String zzZR = "";
    private byte[] zzTZ = com.aspose.words.internal.zzZ1.zzXW;

    public CustomPart deepClone() {
        return (CustomPart) memberwiseClone();
    }

    public String getContentType() {
        return this.zzZR;
    }

    public byte[] getData() {
        return this.zzTZ;
    }

    public String getName() {
        return this.mName;
    }

    public String getRelationshipType() {
        return this.zzZk3;
    }

    public boolean isExternal() {
        return this.zzmO;
    }

    public Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public void setContentType(String str) {
        com.aspose.words.internal.zzZ4.zzY((Object) str, "contentType");
        this.zzZR = str;
    }

    public void setData(byte[] bArr) {
        com.aspose.words.internal.zzZ4.zzY((Object) bArr, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        this.zzTZ = bArr;
    }

    public void setName(String str) {
        com.aspose.words.internal.zzZ4.zzY((Object) str, "name");
        this.mName = str;
    }

    public void setRelationshipType(String str) {
        com.aspose.words.internal.zzZ4.zzY((Object) str, "relationshipType");
        this.zzZk3 = str;
    }

    public final void zzRX(String str) {
        this.zzZk4 = str;
    }

    public final void zzRY(String str) {
        this.zzZk2 = str;
    }

    public final String zzZTI() {
        return this.zzZk4;
    }

    public final String zzZTJ() {
        return this.zzZk2;
    }

    public void isExternal(boolean z) {
        this.zzmO = z;
    }
}
