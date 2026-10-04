package com.microsoft.identity.common.java.util;

import com.aspose.slides.C22226Oooo0oo;
import com.huawei.hms.network.embedded.C18241k5;
import com.microsoft.identity.common.java.logging.Logger;
import com.microsoft.identity.common.java.providers.oauth2.AuthorizationResult;
import com.microsoft.identity.common.java.providers.oauth2.IResult;

/* JADX INFO: loaded from: classes9.dex */
public class ResultUtil {
    public static void logExposedFieldsOfObject(String str, Object obj) {
        if (str == null) {
            throw new NullPointerException("tag is marked non-null but is null");
        }
        if (obj == null) {
            throw new NullPointerException("object is marked non-null but is null");
        }
        StringBuilder sbOooO0OO = C22226Oooo0oo.OooO0OO(str, C18241k5.f55433h);
        sbOooO0OO.append(obj.getClass().getSimpleName());
        Logger.info(sbOooO0OO.toString(), ObjectMapper.serializeExposedFieldsOfObjectToJsonString(obj));
    }

    public static void logResult(String str, IResult iResult) {
        if (str == null) {
            throw new NullPointerException("tag is marked non-null but is null");
        }
        if (iResult == null) {
            throw new NullPointerException("result is marked non-null but is null");
        }
        StringBuilder sbOooO0OO = C22226Oooo0oo.OooO0OO(str, C18241k5.f55433h);
        sbOooO0OO.append(iResult.getClass().getSimpleName());
        String string = sbOooO0OO.toString();
        if (iResult.getSuccess()) {
            Logger.info(string, "Success Result");
            logExposedFieldsOfObject(string, iResult.getSuccessResponse());
        } else {
            Logger.warn(string, "Failure Result");
            if (iResult.getErrorResponse() != null) {
                if (iResult.getErrorResponse().getError() != null) {
                    Logger.warn(string, "Error: " + iResult.getErrorResponse().getError());
                }
                if (iResult.getErrorResponse().getErrorDescription() != null) {
                    Logger.warnPII(string, "Description: " + iResult.getErrorResponse().getErrorDescription());
                }
                logExposedFieldsOfObject(string, iResult.getErrorResponse());
            }
        }
        if (iResult instanceof AuthorizationResult) {
            AuthorizationResult authorizationResult = (AuthorizationResult) iResult;
            if (authorizationResult.getAuthorizationStatus() != null) {
                Logger.info(string, "Authorization Status: " + authorizationResult.getAuthorizationStatus().toString());
            }
        }
    }
}
