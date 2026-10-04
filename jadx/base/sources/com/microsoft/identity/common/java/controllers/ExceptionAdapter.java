package com.microsoft.identity.common.java.controllers;

import OoooooO.C21445Oooo;
import androidx.concurrent.futures.OooO00o;
import com.google.gson.JsonSyntaxException;
import com.microsoft.identity.common.java.commands.parameters.BrokerInteractiveTokenCommandParameters;
import com.microsoft.identity.common.java.commands.parameters.BrokerSilentTokenCommandParameters;
import com.microsoft.identity.common.java.commands.parameters.CommandParameters;
import com.microsoft.identity.common.java.constants.OAuth2ErrorCode;
import com.microsoft.identity.common.java.constants.OAuth2SubErrorCode;
import com.microsoft.identity.common.java.exception.BaseException;
import com.microsoft.identity.common.java.exception.ClientException;
import com.microsoft.identity.common.java.exception.DeviceRegistrationRequiredException;
import com.microsoft.identity.common.java.exception.IntuneAppProtectionPolicyRequiredException;
import com.microsoft.identity.common.java.exception.ServiceException;
import com.microsoft.identity.common.java.exception.TerminalException;
import com.microsoft.identity.common.java.exception.UiRequiredException;
import com.microsoft.identity.common.java.exception.UserCancelException;
import com.microsoft.identity.common.java.logging.Logger;
import com.microsoft.identity.common.java.net.HttpResponse;
import com.microsoft.identity.common.java.providers.microsoft.MicrosoftAuthorizationErrorResponse;
import com.microsoft.identity.common.java.providers.oauth2.AuthorizationErrorResponse;
import com.microsoft.identity.common.java.providers.oauth2.AuthorizationResult;
import com.microsoft.identity.common.java.providers.oauth2.AuthorizationStatus;
import com.microsoft.identity.common.java.providers.oauth2.TokenErrorResponse;
import com.microsoft.identity.common.java.providers.oauth2.TokenResult;
import com.microsoft.identity.common.java.result.AcquireTokenResult;
import com.microsoft.identity.common.java.telemetry.CliTelemInfo;
import com.microsoft.identity.common.java.util.HeaderSerializationUtil;
import com.microsoft.identity.common.java.util.StringUtil;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import org.json.JSONException;

/* JADX INFO: loaded from: classes9.dex */
public class ExceptionAdapter {
    private static final String TAG = "ExceptionAdapter";

    /* JADX INFO: renamed from: com.microsoft.identity.common.java.controllers.ExceptionAdapter$1 */
    public static /* synthetic */ class C187051 {

        /* JADX INFO: renamed from: $SwitchMap$com$microsoft$identity$common$java$providers$oauth2$AuthorizationStatus */
        static final /* synthetic */ int[] f57072x2595e97a;

        static {
            int[] iArr = new int[AuthorizationStatus.values().length];
            f57072x2595e97a = iArr;
            try {
                iArr[AuthorizationStatus.FAIL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f57072x2595e97a[AuthorizationStatus.SDK_CANCEL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f57072x2595e97a[AuthorizationStatus.USER_CANCEL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static void applyCliTelemInfo(CliTelemInfo cliTelemInfo, BaseException baseException) {
        if (baseException == null) {
            throw new NullPointerException("outErr is marked non-null but is null");
        }
        if (cliTelemInfo != null) {
            baseException.setSpeRing(cliTelemInfo.getSpeRing());
            baseException.setRefreshTokenAge(cliTelemInfo.getRefreshTokenAge());
            baseException.setCliTelemErrorCode(cliTelemInfo.getServerErrorCode());
            baseException.setCliTelemSubErrorCode(cliTelemInfo.getServerSubErrorCode());
        }
    }

    public static BaseException baseExceptionFromException(Throwable th) {
        if (th instanceof ExecutionException) {
            th = th.getCause();
        }
        return th instanceof BaseException ? (BaseException) th : clientExceptionFromException(th);
    }

    public static ClientException clientExceptionFromException(Throwable th) {
        if (th == null) {
            throw new NullPointerException("exception is marked non-null but is null");
        }
        if (th instanceof ClientException) {
            return (ClientException) th;
        }
        Throwable cause = th instanceof ExecutionException ? th.getCause() : th;
        if (!(cause instanceof TerminalException)) {
            if (!(cause instanceof IOException)) {
                return cause instanceof InterruptedException ? new ClientException(ClientException.INTERRUPTED_OPERATION, "SDK cancelled operation, the thread execution was interrupted", cause) : new ClientException("unknown_error", cause.getMessage(), cause);
            }
            return new ClientException("io_error", "An IO error occurred with message: " + cause.getMessage(), cause);
        }
        String errorCode = ((TerminalException) cause).getErrorCode();
        Throwable cause2 = th.getCause();
        if (cause2 != null) {
            cause = cause2;
        }
        return new ClientException(errorCode, "An unhandled exception occurred with message: " + cause.getMessage(), cause);
    }

    public static ServiceException convertToNativeAuthException(ServiceException serviceException) {
        if (serviceException == null) {
            throw new NullPointerException("exception is marked non-null but is null");
        }
        ServiceException serviceException2 = new ServiceException(serviceException.getErrorCode(), "Token request failed. Please perform sign-in.\nOriginal exception details: " + serviceException.getMessage(), serviceException.getHttpStatusCode(), serviceException);
        serviceException2.setOauthSubErrorCode(serviceException.getOAuthSubErrorCode());
        serviceException2.setHttpResponseHeaders(serviceException.getHttpResponseHeaders());
        serviceException2.setHttpResponseBody(serviceException.getHttpResponseBody());
        return serviceException2;
    }

    public static BaseException exceptionFromAcquireTokenResult(AcquireTokenResult acquireTokenResult, CommandParameters commandParameters) {
        AuthorizationResult authorizationResult = acquireTokenResult.getAuthorizationResult();
        if (authorizationResult == null) {
            C21445Oooo.OooO0Oo(new StringBuilder(), TAG, ":exceptionFromAcquireTokenResult", "AuthorizationResult was null -- expected for ATS cases.");
        } else if (!authorizationResult.getSuccess()) {
            return exceptionFromAuthorizationResult(authorizationResult, commandParameters);
        }
        return exceptionFromTokenResult(acquireTokenResult.getTokenResult(), commandParameters);
    }

    public static BaseException exceptionFromAuthorizationResult(AuthorizationResult authorizationResult, CommandParameters commandParameters) {
        if (authorizationResult == null) {
            throw new NullPointerException("authorizationResult is marked non-null but is null");
        }
        String strOooO0OO = OooO00o.OooO0OO(new StringBuilder(), TAG, ":exceptionFromAuthorizationResult");
        AuthorizationErrorResponse authorizationErrorResponse = authorizationResult.getAuthorizationErrorResponse();
        if (authorizationErrorResponse == null) {
            Logger.warn(strOooO0OO, "AuthorizationErrorResponse is not set");
            return new ClientException("unknown_error", "Authorization failed with unknown error. Authorization Status: " + authorizationResult.getAuthorizationStatus());
        }
        int i = C187051.f57072x2595e97a[authorizationResult.getAuthorizationStatus().ordinal()];
        if (i == 1) {
            if (authorizationErrorResponse instanceof MicrosoftAuthorizationErrorResponse) {
                MicrosoftAuthorizationErrorResponse microsoftAuthorizationErrorResponse = (MicrosoftAuthorizationErrorResponse) authorizationErrorResponse;
                if (microsoftAuthorizationErrorResponse.getError().equals(MicrosoftAuthorizationErrorResponse.DEVICE_REGISTRATION_NEEDED)) {
                    return new DeviceRegistrationRequiredException(microsoftAuthorizationErrorResponse.getError(), microsoftAuthorizationErrorResponse.getErrorDescription(), microsoftAuthorizationErrorResponse.getUpnToWpj());
                }
            }
            return new ServiceException(authorizationErrorResponse.getError(), authorizationErrorResponse.getErrorDescription(), 0, null);
        }
        if (i == 2) {
            return new ClientException(authorizationErrorResponse.getError(), authorizationErrorResponse.getErrorDescription());
        }
        if (i == 3) {
            return new UserCancelException();
        }
        Logger.warn(strOooO0OO, "No AuthorizationResult status set");
        return new ClientException(authorizationErrorResponse.getError(), authorizationErrorResponse.getErrorDescription());
    }

    public static ServiceException exceptionFromTokenResult(TokenResult tokenResult, CommandParameters commandParameters) {
        if (tokenResult != null && !tokenResult.getSuccess() && tokenResult.getErrorResponse() != null && !StringUtil.isNullOrEmpty(tokenResult.getErrorResponse().getError())) {
            ServiceException exceptionFromTokenErrorResponse = getExceptionFromTokenErrorResponse(commandParameters, tokenResult.getErrorResponse());
            applyCliTelemInfo(tokenResult.getCliTelemInfo(), exceptionFromTokenErrorResponse);
            return exceptionFromTokenErrorResponse;
        }
        String strOooO0OO = OooO00o.OooO0OO(new StringBuilder(), TAG, ":exceptionFromTokenResult");
        StringBuilder sb = new StringBuilder("Unknown error, Token result is null [");
        sb.append(tokenResult == null);
        sb.append("]");
        Logger.warn(strOooO0OO, sb.toString());
        return new ServiceException("unknown_error", "Request failed, but no error returned back from service.", null);
    }

    public static ServiceException getExceptionFromTokenErrorResponse(TokenErrorResponse tokenErrorResponse) {
        if (tokenErrorResponse == null) {
            throw new NullPointerException("errorResponse is marked non-null but is null");
        }
        ServiceException uiRequiredException = shouldBeConvertedToUiRequiredException(tokenErrorResponse.getError()) ? new UiRequiredException(tokenErrorResponse.getError(), tokenErrorResponse.getErrorDescription()) : new ServiceException(tokenErrorResponse.getError(), tokenErrorResponse.getErrorDescription(), null);
        uiRequiredException.setOauthSubErrorCode(tokenErrorResponse.getSubError());
        setHttpResponseUsingTokenErrorResponse(uiRequiredException, tokenErrorResponse);
        return uiRequiredException;
    }

    private static boolean isBrokerTokenCommandParameters(CommandParameters commandParameters) {
        return (commandParameters instanceof BrokerSilentTokenCommandParameters) || (commandParameters instanceof BrokerInteractiveTokenCommandParameters);
    }

    private static boolean isIntunePolicyRequiredError(TokenErrorResponse tokenErrorResponse) {
        if (tokenErrorResponse != null) {
            return !StringUtil.isNullOrEmpty(tokenErrorResponse.getError()) && !StringUtil.isNullOrEmpty(tokenErrorResponse.getSubError()) && tokenErrorResponse.getError().equalsIgnoreCase("unauthorized_client") && tokenErrorResponse.getSubError().equalsIgnoreCase(OAuth2SubErrorCode.PROTECTION_POLICY_REQUIRED);
        }
        throw new NullPointerException("errorResponse is marked non-null but is null");
    }

    private static void setHttpResponseUsingTokenErrorResponse(ServiceException serviceException, TokenErrorResponse tokenErrorResponse) {
        if (serviceException == null) {
            throw new NullPointerException("exception is marked non-null but is null");
        }
        if (tokenErrorResponse == null) {
            throw new NullPointerException("errorResponse is marked non-null but is null");
        }
        try {
            serviceException.setHttpResponse(synthesizeHttpResponse(tokenErrorResponse.getStatusCode(), tokenErrorResponse.getResponseHeadersJson(), tokenErrorResponse.getResponseBody()));
        } catch (JSONException unused) {
            Logger.warn(TAG, "Failed to deserialize error data: status, headers, response body.");
        }
    }

    private static boolean shouldBeConvertedToUiRequiredException(String str) {
        return "invalid_grant".equalsIgnoreCase(str) || OAuth2ErrorCode.INTERACTION_REQUIRED.equalsIgnoreCase(str);
    }

    private static HttpResponse synthesizeHttpResponse(int i, String str, String str2) {
        if (str == null || str2 == null) {
            return null;
        }
        try {
            return new HttpResponse(i, str2, HeaderSerializationUtil.fromJson(str));
        } catch (JsonSyntaxException unused) {
            C21445Oooo.OooO0Oo(new StringBuilder(), TAG, ":applyHttpErrorResponseData", "Failed to deserialize error data: status, headers, response body.");
            return null;
        }
    }

    public static ServiceException getExceptionFromTokenErrorResponse(CommandParameters commandParameters, TokenErrorResponse tokenErrorResponse) {
        IntuneAppProtectionPolicyRequiredException intuneAppProtectionPolicyRequiredException;
        if (tokenErrorResponse != null) {
            if (isIntunePolicyRequiredError(tokenErrorResponse)) {
                if (commandParameters != null && isBrokerTokenCommandParameters(commandParameters)) {
                    if (commandParameters instanceof BrokerInteractiveTokenCommandParameters) {
                        intuneAppProtectionPolicyRequiredException = new IntuneAppProtectionPolicyRequiredException(tokenErrorResponse.getError(), tokenErrorResponse.getErrorDescription(), (BrokerInteractiveTokenCommandParameters) commandParameters);
                    } else {
                        intuneAppProtectionPolicyRequiredException = new IntuneAppProtectionPolicyRequiredException(tokenErrorResponse.getError(), tokenErrorResponse.getErrorDescription(), (BrokerSilentTokenCommandParameters) commandParameters);
                    }
                    intuneAppProtectionPolicyRequiredException.setOauthSubErrorCode(tokenErrorResponse.getSubError());
                    setHttpResponseUsingTokenErrorResponse(intuneAppProtectionPolicyRequiredException, tokenErrorResponse);
                    return intuneAppProtectionPolicyRequiredException;
                }
                Logger.warn(TAG, "In order to properly construct the IntuneAppProtectionPolicyRequiredException we need the command parameters to be supplied.  Returning as service exception instead.");
                return getExceptionFromTokenErrorResponse(tokenErrorResponse);
            }
            return getExceptionFromTokenErrorResponse(tokenErrorResponse);
        }
        throw new NullPointerException("errorResponse is marked non-null but is null");
    }
}
