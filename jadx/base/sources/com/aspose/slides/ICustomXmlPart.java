package com.aspose.slides;

import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public interface ICustomXmlPart {
    UUID getItemId();

    String[] getNamespaceSchemas();

    String getXmlAsString();

    byte[] getXmlData();

    void remove();

    void setItemId(UUID uuid);

    void setXmlAsString(String str);

    void setXmlData(byte[] bArr);
}
