package com.aspose.slides;

import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public interface IExternalResourceResolver {
    InputStream getEntity(String str);

    String resolveUri(String str, String str2);
}
