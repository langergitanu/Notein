package com.aspose.slides;

import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public interface ILicense {
    boolean isLicensed();

    void resetLicense();

    void setLicense(InputStream inputStream);

    void setLicense(String str);
}
