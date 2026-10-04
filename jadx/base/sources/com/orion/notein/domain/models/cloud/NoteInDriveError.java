package com.orion.notein.domain.models.cloud;

import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import oO0o0O0o.C33599OooOo0O;
import oOo000Oo.OooOo;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005J\u000e\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m80612d2 = {"Lcom/orion/notein/domain/models/cloud/NoteInDriveError;", "", "<init>", "()V", "ERROR_UNKNOW", "", "ERROR_RESOURCE_NOT_EXIST", "ERROR_SPACE_FULL", "ERROR_INVALID_CREDENTIALS", "ERR_CODE_LOGIN_NET_NOT_AVAILABLE", "getNoteInDriveErrorCodeByHWError", "errCode", "getNoteInDriveErrorCodeByGoogleError", "error", "Lcom/orion/notein/domain/models/cloud/GoogleCloudError;", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class NoteInDriveError {
    public static final String ERROR_INVALID_CREDENTIALS = "003";
    public static final String ERROR_RESOURCE_NOT_EXIST = "001";
    public static final String ERROR_SPACE_FULL = "002";
    public static final String ERROR_UNKNOW = "111";
    public static final String ERR_CODE_LOGIN_NET_NOT_AVAILABLE = "ERR_CONNECTION_ABORTED";
    public static final NoteInDriveError INSTANCE = new NoteInDriveError();

    private NoteInDriveError() {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final String getNoteInDriveErrorCodeByGoogleError(GoogleCloudError error) {
        OooOOO0.OooO0oO(error, "error");
        String code = error.getCode();
        GoogleCloudErrorDetail googleCloudErrorDetail = (GoogleCloudErrorDetail) OooOo.Oooo(error.getErrors());
        String reason = googleCloudErrorDetail != null ? googleCloudErrorDetail.getReason() : null;
        switch (code.hashCode()) {
            case 51509:
                if (code.equals("401")) {
                    return (C33599OooOo0O.OooOoOO(error.getMessage(), "Invalid Credentials", true) || OooOOO0.OooO0O0(reason, "authError")) ? ERROR_INVALID_CREDENTIALS : ERROR_UNKNOW;
                }
                return ERROR_UNKNOW;
            case 51510:
            default:
                return ERROR_UNKNOW;
            case 51511:
                return (code.equals("403") && OooOOO0.OooO0O0(reason, "storageQuotaExceeded")) ? ERROR_SPACE_FULL : ERROR_UNKNOW;
            case 51512:
                return (code.equals("404") && OooOOO0.OooO0O0(reason, "notFound")) ? ERROR_RESOURCE_NOT_EXIST : ERROR_UNKNOW;
        }
    }

    public final String getNoteInDriveErrorCodeByHWError(String errCode) {
        OooOOO0.OooO0oO(errCode, "errCode");
        return errCode.equals(ERROR_RESOURCE_NOT_EXIST) ? ERROR_RESOURCE_NOT_EXIST : errCode.equals(ERROR_SPACE_FULL) ? ERROR_SPACE_FULL : ERROR_UNKNOW;
    }
}
