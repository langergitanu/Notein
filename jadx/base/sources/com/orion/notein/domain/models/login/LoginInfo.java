package com.orion.notein.domain.models.login;

import OooOO0.OooO0OO;
import OooOoo0.C20703o000000o;
import com.aspose.slides.internal.p497xc.OooO00o;
import com.google.gson.annotations.SerializedName;
import com.huawei.hms.network.embedded.C18115b5;
import com.huawei.hms.support.feature.result.CommonConstant;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.microsoft.identity.common.internal.providers.oauth2.ResponseType;
import com.orion.notein.domain.models.User;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\tHÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003JI\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006#"}, m80612d2 = {"Lcom/orion/notein/domain/models/login/LoginInfo;", "", CommonConstant.KEY_ACCESS_TOKEN, "", "user", "Lcom/orion/notein/domain/models/User;", "openID", "ticket", HiAnalyticsConstant.HaKey.BI_KEY_WAITTIME, "", ResponseType.TOKEN, "<init>", "(Ljava/lang/String;Lcom/orion/notein/domain/models/User;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V", "getAccessToken", "()Ljava/lang/String;", "getUser", "()Lcom/orion/notein/domain/models/User;", "getOpenID", "getTicket", "getWaitTime", "()J", "getToken", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class LoginInfo {

    @SerializedName("access_token")
    private final String accessToken;

    @SerializedName("open_id")
    private final String openID;

    @SerializedName("ticket")
    private final String ticket;
    private final String token;

    @SerializedName("user")
    private final User user;

    @SerializedName(C18115b5.WAITINGTIME)
    private final long waitTime;

    public LoginInfo() {
        this(null, null, null, null, 0L, null, 63, null);
    }

    public static /* synthetic */ LoginInfo copy$default(LoginInfo loginInfo, String str, User user, String str2, String str3, long j, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = loginInfo.accessToken;
        }
        if ((i & 2) != 0) {
            user = loginInfo.user;
        }
        if ((i & 4) != 0) {
            str2 = loginInfo.openID;
        }
        if ((i & 8) != 0) {
            str3 = loginInfo.ticket;
        }
        if ((i & 16) != 0) {
            j = loginInfo.waitTime;
        }
        if ((i & 32) != 0) {
            str4 = loginInfo.token;
        }
        String str5 = str4;
        long j2 = j;
        return loginInfo.copy(str, user, str2, str3, j2, str5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAccessToken() {
        return this.accessToken;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final User getUser() {
        return this.user;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getOpenID() {
        return this.openID;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTicket() {
        return this.ticket;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getWaitTime() {
        return this.waitTime;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    public final LoginInfo copy(String accessToken, User user, String openID, String ticket, long waitTime, String token) {
        OooOOO0.OooO0oO(accessToken, "accessToken");
        OooOOO0.OooO0oO(openID, "openID");
        OooOOO0.OooO0oO(ticket, "ticket");
        return new LoginInfo(accessToken, user, openID, ticket, waitTime, token);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LoginInfo)) {
            return false;
        }
        LoginInfo loginInfo = (LoginInfo) other;
        return OooOOO0.OooO0O0(this.accessToken, loginInfo.accessToken) && OooOOO0.OooO0O0(this.user, loginInfo.user) && OooOOO0.OooO0O0(this.openID, loginInfo.openID) && OooOOO0.OooO0O0(this.ticket, loginInfo.ticket) && this.waitTime == loginInfo.waitTime && OooOOO0.OooO0O0(this.token, loginInfo.token);
    }

    public final String getAccessToken() {
        return this.accessToken;
    }

    public final String getOpenID() {
        return this.openID;
    }

    public final String getTicket() {
        return this.ticket;
    }

    public final String getToken() {
        return this.token;
    }

    public final User getUser() {
        return this.user;
    }

    public final long getWaitTime() {
        return this.waitTime;
    }

    public int hashCode() {
        int iHashCode = this.accessToken.hashCode() * 31;
        User user = this.user;
        int iOooO0O0 = C20703o000000o.OooO0O0(OooO00o.OooO0O0(OooO00o.OooO0O0((iHashCode + (user == null ? 0 : user.hashCode())) * 31, 31, this.openID), 31, this.ticket), 31, this.waitTime);
        String str = this.token;
        return iOooO0O0 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        String str = this.accessToken;
        User user = this.user;
        String str2 = this.openID;
        String str3 = this.ticket;
        long j = this.waitTime;
        String str4 = this.token;
        StringBuilder sb = new StringBuilder("LoginInfo(accessToken=");
        sb.append(str);
        sb.append(", user=");
        sb.append(user);
        sb.append(", openID=");
        OooO0OO.OooO0o0(sb, str2, ", ticket=", str3, ", waitTime=");
        sb.append(j);
        sb.append(", token=");
        sb.append(str4);
        sb.append(")");
        return sb.toString();
    }

    public LoginInfo(String accessToken, User user, String openID, String ticket, long j, String str) {
        OooOOO0.OooO0oO(accessToken, "accessToken");
        OooOOO0.OooO0oO(openID, "openID");
        OooOOO0.OooO0oO(ticket, "ticket");
        this.accessToken = accessToken;
        this.user = user;
        this.openID = openID;
        this.ticket = ticket;
        this.waitTime = j;
        this.token = str;
    }

    public /* synthetic */ LoginInfo(String str, User user, String str2, String str3, long j, String str4, int i, C24018OooO0oo c24018OooO0oo) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : user, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? 0L : j, (i & 32) != 0 ? null : str4);
    }
}
