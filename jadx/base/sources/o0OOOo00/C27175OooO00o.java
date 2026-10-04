package o0OOOo00;

import com.google.gson.annotations.SerializedName;
import com.huawei.hms.support.feature.result.CommonConstant;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: renamed from: o0OOOo00.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006R\u001a\u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0004\u001a\u0004\b\u0012\u0010\u0006¨\u0006\u0014"}, m80612d2 = {"Lo0OOOo00/OooO00o;", "", "", "OooO00o", "Ljava/lang/String;", "getRegion", "()Ljava/lang/String;", "region", "OooO0O0", "getMobile", "mobile", "OooO0OO", "getCode", "code", "OooO0Oo", "getAccessToken", CommonConstant.KEY_ACCESS_TOKEN, "OooO0o0", "getOpenID", "openID", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class C27175OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name and from kotlin metadata */
    @SerializedName("region")
    private final String region;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name and from kotlin metadata */
    @SerializedName("mobile")
    private final String mobile;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name and from kotlin metadata */
    @SerializedName("code")
    private final String code;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name and from kotlin metadata */
    @SerializedName("access_token")
    private final String accessToken;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name and from kotlin metadata */
    @SerializedName("open_id")
    private final String openID;

    public C27175OooO00o(String str, String mobile, String str2, String accessToken, String openID) {
        OooOOO0.OooO0oO(mobile, "mobile");
        OooOOO0.OooO0oO(accessToken, "accessToken");
        OooOOO0.OooO0oO(openID, "openID");
        this.region = str;
        this.mobile = mobile;
        this.code = str2;
        this.accessToken = accessToken;
        this.openID = openID;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27175OooO00o)) {
            return false;
        }
        C27175OooO00o c27175OooO00o = (C27175OooO00o) obj;
        return OooOOO0.OooO0O0(this.region, c27175OooO00o.region) && OooOOO0.OooO0O0(this.mobile, c27175OooO00o.mobile) && OooOOO0.OooO0O0(this.code, c27175OooO00o.code) && OooOOO0.OooO0O0(this.accessToken, c27175OooO00o.accessToken) && OooOOO0.OooO0O0(this.openID, c27175OooO00o.openID);
    }

    public final int hashCode() {
        int iOooO0O0 = com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(this.region.hashCode() * 31, 31, this.mobile);
        String str = this.code;
        return this.openID.hashCode() + com.aspose.slides.internal.p497xc.OooO00o.OooO0O0((iOooO0O0 + (str == null ? 0 : str.hashCode())) * 31, 31, this.accessToken);
    }

    public final String toString() {
        String str = this.region;
        String str2 = this.mobile;
        String str3 = this.code;
        String str4 = this.accessToken;
        String str5 = this.openID;
        StringBuilder sbOooO0O0 = com.aspose.slides.internal.p332p7.OooO0o.OooO0O0("BindPhoneNumberBody(region=", str, ", mobile=", str2, ", code=");
        OooOO0.OooO0OO.OooO0o0(sbOooO0O0, str3, ", accessToken=", str4, ", openID=");
        return androidx.concurrent.futures.OooO00o.OooO0OO(sbOooO0O0, str5, ")");
    }
}
