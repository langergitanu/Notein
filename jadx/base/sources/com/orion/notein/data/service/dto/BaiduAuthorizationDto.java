package com.orion.notein.data.service.dto;

import com.aspose.slides.internal.p497xc.OooO00o;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o0OOOo0.C27173OooO00o;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ0\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\fJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001c\u0010\f¨\u0006\u001d"}, m80612d2 = {"Lcom/orion/notein/data/service/dto/BaiduAuthorizationDto;", "", "Lo0OOOo0/OooO00o;", "authorization", "", "errorCode", "errorMsg", "<init>", "(Lo0OOOo0/OooO00o;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Lo0OOOo0/OooO00o;", "component2", "()Ljava/lang/String;", "component3", "copy", "(Lo0OOOo0/OooO00o;Ljava/lang/String;Ljava/lang/String;)Lcom/orion/notein/data/service/dto/BaiduAuthorizationDto;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lo0OOOo0/OooO00o;", "getAuthorization", "Ljava/lang/String;", "getErrorCode", "getErrorMsg", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class BaiduAuthorizationDto {

    @SerializedName("authorization")
    private final C27173OooO00o authorization;

    @SerializedName("error_code")
    private final String errorCode;

    @SerializedName("error_msg")
    private final String errorMsg;

    public BaiduAuthorizationDto(C27173OooO00o c27173OooO00o, String errorCode, String errorMsg) {
        OooOOO0.OooO0oO(errorCode, "errorCode");
        OooOOO0.OooO0oO(errorMsg, "errorMsg");
        this.authorization = c27173OooO00o;
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    public static /* synthetic */ BaiduAuthorizationDto copy$default(BaiduAuthorizationDto baiduAuthorizationDto, C27173OooO00o c27173OooO00o, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            c27173OooO00o = baiduAuthorizationDto.authorization;
        }
        if ((i & 2) != 0) {
            str = baiduAuthorizationDto.errorCode;
        }
        if ((i & 4) != 0) {
            str2 = baiduAuthorizationDto.errorMsg;
        }
        return baiduAuthorizationDto.copy(c27173OooO00o, str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final C27173OooO00o getAuthorization() {
        return this.authorization;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getErrorCode() {
        return this.errorCode;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getErrorMsg() {
        return this.errorMsg;
    }

    public final BaiduAuthorizationDto copy(C27173OooO00o authorization, String errorCode, String errorMsg) {
        OooOOO0.OooO0oO(errorCode, "errorCode");
        OooOOO0.OooO0oO(errorMsg, "errorMsg");
        return new BaiduAuthorizationDto(authorization, errorCode, errorMsg);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BaiduAuthorizationDto)) {
            return false;
        }
        BaiduAuthorizationDto baiduAuthorizationDto = (BaiduAuthorizationDto) other;
        return OooOOO0.OooO0O0(this.authorization, baiduAuthorizationDto.authorization) && OooOOO0.OooO0O0(this.errorCode, baiduAuthorizationDto.errorCode) && OooOOO0.OooO0O0(this.errorMsg, baiduAuthorizationDto.errorMsg);
    }

    public final C27173OooO00o getAuthorization() {
        return this.authorization;
    }

    public final String getErrorCode() {
        return this.errorCode;
    }

    public final String getErrorMsg() {
        return this.errorMsg;
    }

    public int hashCode() {
        C27173OooO00o c27173OooO00o = this.authorization;
        return this.errorMsg.hashCode() + OooO00o.OooO0O0((c27173OooO00o == null ? 0 : c27173OooO00o.hashCode()) * 31, 31, this.errorCode);
    }

    public String toString() {
        C27173OooO00o c27173OooO00o = this.authorization;
        String str = this.errorCode;
        String str2 = this.errorMsg;
        StringBuilder sb = new StringBuilder("BaiduAuthorizationDto(authorization=");
        sb.append(c27173OooO00o);
        sb.append(", errorCode=");
        sb.append(str);
        sb.append(", errorMsg=");
        return androidx.concurrent.futures.OooO00o.OooO0OO(sb, str2, ")");
    }
}
