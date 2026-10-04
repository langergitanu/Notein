package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public interface IProtectionManager {
    boolean checkWriteProtection(String str);

    void encrypt(String str);

    boolean getEncryptDocumentProperties();

    String getEncryptionPassword();

    boolean getReadOnlyRecommended();

    boolean isEncrypted();

    boolean isOnlyDocumentPropertiesLoaded();

    boolean isWriteProtected();

    void removeEncryption();

    void removeWriteProtection();

    void setEncryptDocumentProperties(boolean z);

    void setReadOnlyRecommended(boolean z);

    void setWriteProtection(String str);
}
