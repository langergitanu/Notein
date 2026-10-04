package com.orion.notein.data.service.dto;

import OooOO0.OooO0OO;
import OooOo.C20485OooOoO;
import OooOooo.C20785Oooo00o;
import com.aspose.slides.internal.p497xc.OooO00o;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J?\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001d"}, m80612d2 = {"Lcom/orion/notein/data/service/dto/GoogleFreeTrialDto;", "", "googleId", "", "errorCode", "", "message", "freeTrialStartTime", "freeTrialEndTime", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getGoogleId", "()Ljava/lang/String;", "getErrorCode", "()I", "getMessage", "getFreeTrialStartTime", "getFreeTrialEndTime", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class GoogleFreeTrialDto {

    @SerializedName("error_code")
    private final int errorCode;

    @SerializedName("free_trial_end_time")
    private final String freeTrialEndTime;

    @SerializedName("free_trial_start_time")
    private final String freeTrialStartTime;

    @SerializedName("google_id")
    private final String googleId;

    @SerializedName("message")
    private final String message;

    public GoogleFreeTrialDto() {
        this(null, 0, null, null, null, 31, null);
    }

    public static /* synthetic */ GoogleFreeTrialDto copy$default(GoogleFreeTrialDto googleFreeTrialDto, String str, int i, String str2, String str3, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = googleFreeTrialDto.googleId;
        }
        if ((i2 & 2) != 0) {
            i = googleFreeTrialDto.errorCode;
        }
        if ((i2 & 4) != 0) {
            str2 = googleFreeTrialDto.message;
        }
        if ((i2 & 8) != 0) {
            str3 = googleFreeTrialDto.freeTrialStartTime;
        }
        if ((i2 & 16) != 0) {
            str4 = googleFreeTrialDto.freeTrialEndTime;
        }
        String str5 = str4;
        String str6 = str2;
        return googleFreeTrialDto.copy(str, i, str6, str3, str5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getGoogleId() {
        return this.googleId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getErrorCode() {
        return this.errorCode;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getFreeTrialStartTime() {
        return this.freeTrialStartTime;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getFreeTrialEndTime() {
        return this.freeTrialEndTime;
    }

    public final GoogleFreeTrialDto copy(String googleId, int errorCode, String message, String freeTrialStartTime, String freeTrialEndTime) {
        OooOOO0.OooO0oO(googleId, "googleId");
        OooOOO0.OooO0oO(message, "message");
        return new GoogleFreeTrialDto(googleId, errorCode, message, freeTrialStartTime, freeTrialEndTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GoogleFreeTrialDto)) {
            return false;
        }
        GoogleFreeTrialDto googleFreeTrialDto = (GoogleFreeTrialDto) other;
        return OooOOO0.OooO0O0(this.googleId, googleFreeTrialDto.googleId) && this.errorCode == googleFreeTrialDto.errorCode && OooOOO0.OooO0O0(this.message, googleFreeTrialDto.message) && OooOOO0.OooO0O0(this.freeTrialStartTime, googleFreeTrialDto.freeTrialStartTime) && OooOOO0.OooO0O0(this.freeTrialEndTime, googleFreeTrialDto.freeTrialEndTime);
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    public final String getFreeTrialEndTime() {
        return this.freeTrialEndTime;
    }

    public final String getFreeTrialStartTime() {
        return this.freeTrialStartTime;
    }

    public final String getGoogleId() {
        return this.googleId;
    }

    public final String getMessage() {
        return this.message;
    }

    public int hashCode() {
        int iOooO0O0 = OooO00o.OooO0O0(C20785Oooo00o.OooO00o(this.errorCode, this.googleId.hashCode() * 31, 31), 31, this.message);
        String str = this.freeTrialStartTime;
        int iHashCode = (iOooO0O0 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.freeTrialEndTime;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.googleId;
        int i = this.errorCode;
        String str2 = this.message;
        String str3 = this.freeTrialStartTime;
        String str4 = this.freeTrialEndTime;
        StringBuilder sbOooO0OO = C20485OooOoO.OooO0OO(i, "GoogleFreeTrialDto(googleId=", str, ", errorCode=", ", message=");
        OooO0OO.OooO0o0(sbOooO0OO, str2, ", freeTrialStartTime=", str3, ", freeTrialEndTime=");
        return androidx.concurrent.futures.OooO00o.OooO0OO(sbOooO0OO, str4, ")");
    }

    public GoogleFreeTrialDto(String googleId, int i, String message, String str, String str2) {
        OooOOO0.OooO0oO(googleId, "googleId");
        OooOOO0.OooO0oO(message, "message");
        this.googleId = googleId;
        this.errorCode = i;
        this.message = message;
        this.freeTrialStartTime = str;
        this.freeTrialEndTime = str2;
    }

    public /* synthetic */ GoogleFreeTrialDto(String str, int i, String str2, String str3, String str4, int i2, C24018OooO0oo c24018OooO0oo) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? -1 : i, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? null : str3, (i2 & 16) != 0 ? null : str4);
    }
}
