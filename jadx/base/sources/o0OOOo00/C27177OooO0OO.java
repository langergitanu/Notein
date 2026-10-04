package o0OOOo00;

import com.google.gson.annotations.SerializedName;
import com.microsoft.identity.common.java.providers.oauth2.IDToken;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: renamed from: o0OOOo00.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0004\u001a\u0004\b\u0012\u0010\u0006¨\u0006\u0014"}, m80612d2 = {"Lo0OOOo00/OooO0OO;", "", "", "OooO00o", "Ljava/lang/String;", "getPassword", "()Ljava/lang/String;", "password", "OooO0O0", "getOriginalPassword", "originalPassword", "OooO0OO", "getRegion", "region", "OooO0Oo", "getPhoneNumber", "phoneNumber", "OooO0o0", "getCode", "code", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class C27177OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name and from kotlin metadata */
    @SerializedName("password")
    private final String password;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name and from kotlin metadata */
    @SerializedName("original_password")
    private final String originalPassword;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name and from kotlin metadata */
    @SerializedName("region")
    private final String region;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name and from kotlin metadata */
    @SerializedName(IDToken.PHONE_NUMBER)
    private final String phoneNumber;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name and from kotlin metadata */
    @SerializedName("code")
    private final String code;

    public C27177OooO0OO(String password, String str, String str2, String str3, String str4) {
        OooOOO0.OooO0oO(password, "password");
        this.password = password;
        this.originalPassword = str;
        this.region = str2;
        this.phoneNumber = str3;
        this.code = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27177OooO0OO)) {
            return false;
        }
        C27177OooO0OO c27177OooO0OO = (C27177OooO0OO) obj;
        return OooOOO0.OooO0O0(this.password, c27177OooO0OO.password) && OooOOO0.OooO0O0(this.originalPassword, c27177OooO0OO.originalPassword) && OooOOO0.OooO0O0(this.region, c27177OooO0OO.region) && OooOOO0.OooO0O0(this.phoneNumber, c27177OooO0OO.phoneNumber) && OooOOO0.OooO0O0(this.code, c27177OooO0OO.code);
    }

    public final int hashCode() {
        int iHashCode = this.password.hashCode() * 31;
        String str = this.originalPassword;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.region;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.phoneNumber;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.code;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        String str = this.password;
        String str2 = this.originalPassword;
        String str3 = this.region;
        String str4 = this.phoneNumber;
        String str5 = this.code;
        StringBuilder sbOooO0O0 = com.aspose.slides.internal.p332p7.OooO0o.OooO0O0("SetPasswordBody(password=", str, ", originalPassword=", str2, ", region=");
        OooOO0.OooO0OO.OooO0o0(sbOooO0O0, str3, ", phoneNumber=", str4, ", code=");
        return androidx.concurrent.futures.OooO00o.OooO0OO(sbOooO0O0, str5, ")");
    }
}
