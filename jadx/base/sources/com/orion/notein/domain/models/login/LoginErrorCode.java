package com.orion.notein.domain.models.login;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\f\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m80612d2 = {"Lcom/orion/notein/domain/models/login/LoginErrorCode;", "", "<init>", "()V", "ERROR_CODE_SHOULD_BIND_PHONE_NUMBER", "", "ERROR_CODE_USER_HAS_BIND_ANOTHER_ACCOUNT", "ERROR_CODE_CAN_NOT_UNBIND_ACCOUNT", "ERROR_CODE_USERNAME_PASSWORD_NOT_MATCH", "ERROR_CODE_USER_NOT_EXIST", "ERROR_CODE_VERIFICATION_CODE_ERROR", "ERROR_CODE_PASSWORD_ERROR_TOO_MANY", "ERROR_CODE_HW_NEED_USER_AUTHORIZE", "ERROR_CODE_NO_HMS_SDK_INSTALLED", "ERROR_CODE_NEED_AUTHORIZE", "ERROR_CODE_OTHER", "ERROR_BIND_WECHAT_PROGRESS", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class LoginErrorCode {
    public static final String ERROR_BIND_WECHAT_PROGRESS = "50000";
    public static final String ERROR_CODE_CAN_NOT_UNBIND_ACCOUNT = "10008";
    public static final String ERROR_CODE_HW_NEED_USER_AUTHORIZE = "2002";
    public static final String ERROR_CODE_NEED_AUTHORIZE = "10000";
    public static final String ERROR_CODE_NO_HMS_SDK_INSTALLED = "907135003";
    public static final String ERROR_CODE_OTHER = "-999";
    public static final String ERROR_CODE_PASSWORD_ERROR_TOO_MANY = "10016";
    public static final String ERROR_CODE_SHOULD_BIND_PHONE_NUMBER = "10002";
    public static final String ERROR_CODE_USERNAME_PASSWORD_NOT_MATCH = "10012";
    public static final String ERROR_CODE_USER_HAS_BIND_ANOTHER_ACCOUNT = "10006";
    public static final String ERROR_CODE_USER_NOT_EXIST = "4002";
    public static final String ERROR_CODE_VERIFICATION_CODE_ERROR = "4001";
    public static final LoginErrorCode INSTANCE = new LoginErrorCode();

    private LoginErrorCode() {
    }
}
