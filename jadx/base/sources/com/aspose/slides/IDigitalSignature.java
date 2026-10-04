package com.aspose.slides;

import java.util.Date;

/* JADX INFO: loaded from: classes3.dex */
public interface IDigitalSignature {
    byte[] getCertificate();

    String getComments();

    Date getSignTime();

    boolean isValid();

    void setComments(String str);
}
