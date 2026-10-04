package com.aspose.slides;

import java.io.OutputStream;

/* JADX INFO: loaded from: classes3.dex */
public interface IPresentationInfo {
    boolean checkPassword(String str);

    boolean checkWriteProtection(String str);

    int getLoadFormat();

    boolean isEncrypted();

    boolean isPasswordProtected();

    byte isWriteProtected();

    IDocumentProperties readDocumentProperties();

    void updateDocumentProperties(IDocumentProperties iDocumentProperties);

    void writeBindedPresentation(OutputStream outputStream);

    void writeBindedPresentation(String str);
}
