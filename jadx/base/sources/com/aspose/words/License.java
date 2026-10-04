package com.aspose.words;

import java.io.InputStream;

/* JADX INFO: loaded from: classes6.dex */
public class License {
    com.aspose.words.internal.zzZO0 zzYeT = com.aspose.words.internal.zzZO0.zzhV();

    public void setLicense(String str) throws Exception {
        if (str == null) {
            throw new NullPointerException(this.zzYeT.zzZn(new byte[]{108, 105, 99, 101, 110, 115, 101, 78, 97, 109, 101}));
        }
        new zzZ5R().zzT(str, com.aspose.words.internal.zzZHP.zzcj());
    }

    public void setLicenseInternal(com.aspose.words.internal.zzZOP zzzop) throws Exception {
        setLicense(com.aspose.words.internal.zzZOP.zzZG(zzzop));
    }

    public void setLicense(InputStream inputStream) throws Exception {
        if (inputStream != null) {
            new zzZ5R();
            zzZ5R.zzU(inputStream);
            return;
        }
        throw new NullPointerException(this.zzYeT.zzZn(new byte[]{115, 116, 114, 101, 97, 109}));
    }
}
