package com.microsoft.identity.common.java.providers.microsoft.microsoftsts;

import com.microsoft.identity.common.java.commands.parameters.TokenCommandParameters;
import com.microsoft.identity.common.java.exception.BaseException;
import com.microsoft.identity.common.java.exception.ClientException;
import com.microsoft.identity.common.java.providers.oauth2.TokenResult;

/* JADX INFO: loaded from: classes9.dex */
public interface IAcquireMicrosoftStsTokenStrategy<T extends TokenCommandParameters> {
    TokenResult acquireToken(MicrosoftStsTokenRequest microsoftStsTokenRequest) throws ClientException;

    MicrosoftStsTokenRequest createTokenRequest(T t) throws BaseException;
}
