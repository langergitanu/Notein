package o0OOOo00;

import com.google.gson.annotations.SerializedName;
import com.huawei.hms.support.feature.result.CommonConstant;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: renamed from: o0OOOo00.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006¨\u0006\u000b"}, m80612d2 = {"Lo0OOOo00/OooO0Oo;", "", "", "OooO00o", "Ljava/lang/String;", "getAccessToken", "()Ljava/lang/String;", CommonConstant.KEY_ACCESS_TOKEN, "OooO0O0", "getOpenID", "openID", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class C27178OooO0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name and from kotlin metadata */
    @SerializedName("access_token")
    private final String accessToken;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name and from kotlin metadata */
    @SerializedName("open_id")
    private final String openID;

    public /* synthetic */ C27178OooO0Oo(String str) {
        this(str, "");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27178OooO0Oo)) {
            return false;
        }
        C27178OooO0Oo c27178OooO0Oo = (C27178OooO0Oo) obj;
        return OooOOO0.OooO0O0(this.accessToken, c27178OooO0Oo.accessToken) && OooOOO0.OooO0O0(this.openID, c27178OooO0Oo.openID);
    }

    public final int hashCode() {
        return this.openID.hashCode() + (this.accessToken.hashCode() * 31);
    }

    public final String toString() {
        return androidx.core.database.OooO00o.OooO00o("SkipBindPhoneNumberBody(accessToken=", this.accessToken, ", openID=", this.openID, ")");
    }

    public C27178OooO0Oo(String accessToken, String openID) {
        OooOOO0.OooO0oO(accessToken, "accessToken");
        OooOOO0.OooO0oO(openID, "openID");
        this.accessToken = accessToken;
        this.openID = openID;
    }
}
