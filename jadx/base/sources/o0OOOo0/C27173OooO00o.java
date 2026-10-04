package o0OOOo0;

import OooOoo0.C20703o000000o;
import com.google.gson.annotations.SerializedName;
import com.huawei.hms.support.feature.result.CommonConstant;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o0ooO0O0.C31430OooO00o;

/* JADX INFO: renamed from: o0OOOo0.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001a\u0010\u000f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\b\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\f\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u0013"}, m80612d2 = {"Lo0OOOo0/OooO00o;", "", "", "OooO00o", "J", "OooO0Oo", "()J", "expiresIn", "OooO0O0", "OooO0OO", "expiresAt", "", "Ljava/lang/String;", "OooO0o0", "()Ljava/lang/String;", "refreshToken", CommonConstant.KEY_ACCESS_TOKEN, "getScope", "scope", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class C27173OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name and from kotlin metadata */
    @SerializedName("expires_in")
    private final long expiresIn;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name and from kotlin metadata */
    @SerializedName("expires_at")
    private final long expiresAt;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name and from kotlin metadata */
    @SerializedName("refresh_token")
    private final String refreshToken;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name and from kotlin metadata */
    @SerializedName("access_token")
    private final String accessToken;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name and from kotlin metadata */
    @SerializedName("scope")
    private final String scope;

    public C27173OooO00o() {
        this(0L, "", "", 0L, "");
    }

    public static C27173OooO00o OooO00o(C27173OooO00o c27173OooO00o, long j) {
        long j2 = c27173OooO00o.expiresIn;
        String refreshToken = c27173OooO00o.refreshToken;
        String accessToken = c27173OooO00o.accessToken;
        String scope = c27173OooO00o.scope;
        OooOOO0.OooO0oO(refreshToken, "refreshToken");
        OooOOO0.OooO0oO(accessToken, "accessToken");
        OooOOO0.OooO0oO(scope, "scope");
        return new C27173OooO00o(j2, refreshToken, accessToken, j, scope);
    }

    /* JADX INFO: renamed from: OooO0O0, reason: from getter */
    public final String getAccessToken() {
        return this.accessToken;
    }

    /* JADX INFO: renamed from: OooO0OO, reason: from getter */
    public final long getExpiresAt() {
        return this.expiresAt;
    }

    /* JADX INFO: renamed from: OooO0Oo, reason: from getter */
    public final long getExpiresIn() {
        return this.expiresIn;
    }

    /* JADX INFO: renamed from: OooO0o0, reason: from getter */
    public final String getRefreshToken() {
        return this.refreshToken;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27173OooO00o)) {
            return false;
        }
        C27173OooO00o c27173OooO00o = (C27173OooO00o) obj;
        return this.expiresIn == c27173OooO00o.expiresIn && this.expiresAt == c27173OooO00o.expiresAt && OooOOO0.OooO0O0(this.refreshToken, c27173OooO00o.refreshToken) && OooOOO0.OooO0O0(this.accessToken, c27173OooO00o.accessToken) && OooOOO0.OooO0O0(this.scope, c27173OooO00o.scope);
    }

    public final int hashCode() {
        return this.scope.hashCode() + com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(C20703o000000o.OooO0O0(Long.hashCode(this.expiresIn) * 31, 31, this.expiresAt), 31, this.refreshToken), 31, this.accessToken);
    }

    public final String toString() {
        long j = this.expiresIn;
        String strOooO0O0 = C31430OooO00o.OooO0O0(this.expiresAt);
        String str = this.refreshToken;
        boolean z = !(str == null || str.length() == 0);
        String str2 = this.accessToken;
        boolean z2 = str2 == null || str2.length() == 0;
        String str3 = this.scope;
        StringBuilder sb = new StringBuilder("expiresIn: ");
        sb.append(j);
        sb.append(", expiresAt: ");
        sb.append(strOooO0O0);
        sb.append(", refreshToken: ");
        sb.append(z);
        sb.append(", accessToken: ");
        sb.append(!z2);
        return androidx.concurrent.futures.OooO00o.OooO0OO(sb, ", scope: ", str3);
    }

    public C27173OooO00o(long j, String str, String str2, long j2, String str3) {
        this.expiresIn = j;
        this.expiresAt = j2;
        this.refreshToken = str;
        this.accessToken = str2;
        this.scope = str3;
    }
}
