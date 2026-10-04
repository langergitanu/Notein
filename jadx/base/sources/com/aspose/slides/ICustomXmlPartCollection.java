package com.aspose.slides;

import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public interface ICustomXmlPartCollection extends IGenericCollection<ICustomXmlPart> {
    ICustomXmlPart add(InputStream inputStream);

    ICustomXmlPart add(String str);

    ICustomXmlPart add(byte[] bArr);

    void clear();

    ICustomXmlPart get_Item(int i);

    boolean remove(ICustomXmlPart iCustomXmlPart);

    void removeAt(int i);
}
