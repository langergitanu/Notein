package o0OOOo00;

import com.google.gson.annotations.SerializedName;
import com.microsoft.identity.common.java.providers.oauth2.IDToken;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: renamed from: o0OOOo00.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006¨\u0006\u000e"}, m80612d2 = {"Lo0OOOo00/OooO0o;", "", "", "OooO00o", "Ljava/lang/String;", "getRegion", "()Ljava/lang/String;", "region", "OooO0O0", "getPhoneNumber", "phoneNumber", "OooO0OO", "getCode", "code", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class C27179OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name and from kotlin metadata */
    @SerializedName("region")
    private final String region;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name and from kotlin metadata */
    @SerializedName(IDToken.PHONE_NUMBER)
    private final String phoneNumber;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name and from kotlin metadata */
    @SerializedName("code")
    private final String code;

    public C27179OooO0o(String region, String phoneNumber, String code) {
        OooOOO0.OooO0oO(region, "region");
        OooOOO0.OooO0oO(phoneNumber, "phoneNumber");
        OooOOO0.OooO0oO(code, "code");
        this.region = region;
        this.phoneNumber = phoneNumber;
        this.code = code;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27179OooO0o)) {
            return false;
        }
        C27179OooO0o c27179OooO0o = (C27179OooO0o) obj;
        return OooOOO0.OooO0O0(this.region, c27179OooO0o.region) && OooOOO0.OooO0O0(this.phoneNumber, c27179OooO0o.phoneNumber) && OooOOO0.OooO0O0(this.code, c27179OooO0o.code);
    }

    public final int hashCode() {
        return this.code.hashCode() + com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(this.region.hashCode() * 31, 31, this.phoneNumber);
    }

    public final String toString() {
        String str = this.region;
        String str2 = this.phoneNumber;
        return androidx.concurrent.futures.OooO00o.OooO0OO(com.aspose.slides.internal.p332p7.OooO0o.OooO0O0("VerifyCodeWithNoLoginBody(region=", str, ", phoneNumber=", str2, ", code="), this.code, ")");
    }
}
