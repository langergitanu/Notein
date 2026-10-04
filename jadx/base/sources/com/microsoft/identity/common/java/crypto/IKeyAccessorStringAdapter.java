package com.microsoft.identity.common.java.crypto;

import com.microsoft.identity.common.java.exception.ClientException;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H&J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003H&¨\u0006\u0007"}, m80612d2 = {"Lcom/microsoft/identity/common/java/crypto/IKeyAccessorStringAdapter;", "", "decrypt", "", "cipherText", "encrypt", "plainText", "common4j"}, m80613k = 1, m80614mv = {1, 7, 1}, m80616xi = 48)
public interface IKeyAccessorStringAdapter {
    String decrypt(String cipherText) throws ClientException;

    String encrypt(String plainText) throws ClientException;
}
