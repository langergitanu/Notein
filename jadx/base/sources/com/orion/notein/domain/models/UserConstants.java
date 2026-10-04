package com.orion.notein.domain.models;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, m80612d2 = {"Lcom/orion/notein/domain/models/UserConstants;", "", "<init>", "()V", "API_RESULT_SUCCESS", "", "ERROR_CODE_AVATAR_SIZE_LIMIT", "ERROR_CODE_AVATAR_RESOLUTION_LIMIT", "ERROR_CODE_AVATAR_UPLOAD_INTERNAL", "ERROR_CODE_AVATAR_UPLOAD_NETWORK", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class UserConstants {
    public static final int API_RESULT_SUCCESS = 0;
    public static final int ERROR_CODE_AVATAR_RESOLUTION_LIMIT = 10001;
    public static final int ERROR_CODE_AVATAR_SIZE_LIMIT = 10000;
    public static final int ERROR_CODE_AVATAR_UPLOAD_INTERNAL = 10002;
    public static final int ERROR_CODE_AVATAR_UPLOAD_NETWORK = 10003;
    public static final UserConstants INSTANCE = new UserConstants();

    private UserConstants() {
    }
}
