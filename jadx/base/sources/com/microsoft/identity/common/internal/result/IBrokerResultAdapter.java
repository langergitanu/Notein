package com.microsoft.identity.common.internal.result;

import android.os.Bundle;
import com.microsoft.identity.common.java.commands.AcquirePrtSsoTokenResult;
import com.microsoft.identity.common.java.exception.BaseException;
import com.microsoft.identity.common.java.result.ILocalAuthenticationResult;

/* JADX INFO: loaded from: classes9.dex */
public interface IBrokerResultAdapter {
    ILocalAuthenticationResult authenticationResultFromBundle(Bundle bundle) throws BaseException;

    Bundle bundleFromAuthenticationResult(ILocalAuthenticationResult iLocalAuthenticationResult, String str);

    Bundle bundleFromBaseException(BaseException baseException, String str);

    AcquirePrtSsoTokenResult getAcquirePrtSsoTokenResultFromBundle(Bundle bundle);

    BaseException getBaseExceptionFromBundle(Bundle bundle);
}
