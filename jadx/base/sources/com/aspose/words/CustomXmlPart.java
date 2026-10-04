package com.aspose.words;

import com.google.firebase.messaging.Constants;

/* JADX INFO: loaded from: classes6.dex */
public class CustomXmlPart implements Cloneable {
    private String zzZh = "";
    private CustomXmlSchemaCollection zzZk1 = new CustomXmlSchemaCollection();
    private byte[] zzTZ = com.aspose.words.internal.zzZ1.zzXW;

    public CustomXmlPart deepClone() {
        CustomXmlPart customXmlPart = (CustomXmlPart) memberwiseClone();
        customXmlPart.zzZk1 = this.zzZk1.deepClone();
        return customXmlPart;
    }

    public byte[] getData() {
        return this.zzTZ;
    }

    public long getDataChecksum() {
        return ((long) com.aspose.words.internal.zzS4.zzI(this.zzTZ)) & 4294967295L;
    }

    public String getId() {
        return this.zzZh;
    }

    public CustomXmlSchemaCollection getSchemas() {
        return this.zzZk1;
    }

    public Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public void setData(byte[] bArr) {
        com.aspose.words.internal.zzZ4.zzY((Object) bArr, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        this.zzTZ = bArr;
    }

    public void setId(String str) {
        com.aspose.words.internal.zzZ4.zzY((Object) str, "id");
        this.zzZh = str;
    }

    public final boolean zzZTH() throws Exception {
        boolean z = true;
        if (getData().length > 0) {
            com.aspose.words.internal.zzZOR zzzor = new com.aspose.words.internal.zzZOR(getData(), false);
            try {
                do {
                } while (com.aspose.words.internal.zzZSN.zzZS(zzzor).read());
            } catch (IllegalStateException unused) {
                z = false;
            } catch (Throwable th) {
                zzzor.close();
                throw th;
            }
            zzzor.close();
        }
        return z;
    }
}
