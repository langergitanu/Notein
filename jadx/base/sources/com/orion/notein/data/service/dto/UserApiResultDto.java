package com.orion.notein.data.service.dto;

import com.aspose.slides.internal.p497xc.OooO00o;
import com.google.gson.annotations.SerializedName;
import com.orion.notein.domain.models.User;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J'\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000e¨\u0006\u001b"}, m80612d2 = {"Lcom/orion/notein/data/service/dto/UserApiResultDto;", "", "user", "Lcom/orion/notein/domain/models/User;", "errorCode", "", "errorMsg", "<init>", "(Lcom/orion/notein/domain/models/User;Ljava/lang/String;Ljava/lang/String;)V", "getUser", "()Lcom/orion/notein/domain/models/User;", "getErrorCode", "()Ljava/lang/String;", "setErrorCode", "(Ljava/lang/String;)V", "getErrorMsg", "setErrorMsg", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class UserApiResultDto {

    @SerializedName("error_code")
    private String errorCode;

    @SerializedName("error_msg")
    private String errorMsg;

    @SerializedName("user")
    private final User user;

    public UserApiResultDto(User user, String errorCode, String errorMsg) {
        OooOOO0.OooO0oO(user, "user");
        OooOOO0.OooO0oO(errorCode, "errorCode");
        OooOOO0.OooO0oO(errorMsg, "errorMsg");
        this.user = user;
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    public static /* synthetic */ UserApiResultDto copy$default(UserApiResultDto userApiResultDto, User user, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            user = userApiResultDto.user;
        }
        if ((i & 2) != 0) {
            str = userApiResultDto.errorCode;
        }
        if ((i & 4) != 0) {
            str2 = userApiResultDto.errorMsg;
        }
        return userApiResultDto.copy(user, str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final User getUser() {
        return this.user;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getErrorCode() {
        return this.errorCode;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getErrorMsg() {
        return this.errorMsg;
    }

    public final UserApiResultDto copy(User user, String errorCode, String errorMsg) {
        OooOOO0.OooO0oO(user, "user");
        OooOOO0.OooO0oO(errorCode, "errorCode");
        OooOOO0.OooO0oO(errorMsg, "errorMsg");
        return new UserApiResultDto(user, errorCode, errorMsg);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserApiResultDto)) {
            return false;
        }
        UserApiResultDto userApiResultDto = (UserApiResultDto) other;
        return OooOOO0.OooO0O0(this.user, userApiResultDto.user) && OooOOO0.OooO0O0(this.errorCode, userApiResultDto.errorCode) && OooOOO0.OooO0O0(this.errorMsg, userApiResultDto.errorMsg);
    }

    public final String getErrorCode() {
        return this.errorCode;
    }

    public final String getErrorMsg() {
        return this.errorMsg;
    }

    public final User getUser() {
        return this.user;
    }

    public int hashCode() {
        return this.errorMsg.hashCode() + OooO00o.OooO0O0(this.user.hashCode() * 31, 31, this.errorCode);
    }

    public final void setErrorCode(String str) {
        OooOOO0.OooO0oO(str, "<set-?>");
        this.errorCode = str;
    }

    public final void setErrorMsg(String str) {
        OooOOO0.OooO0oO(str, "<set-?>");
        this.errorMsg = str;
    }

    public String toString() {
        User user = this.user;
        String str = this.errorCode;
        String str2 = this.errorMsg;
        StringBuilder sb = new StringBuilder("UserApiResultDto(user=");
        sb.append(user);
        sb.append(", errorCode=");
        sb.append(str);
        sb.append(", errorMsg=");
        return androidx.concurrent.futures.OooO00o.OooO0OO(sb, str2, ")");
    }
}
