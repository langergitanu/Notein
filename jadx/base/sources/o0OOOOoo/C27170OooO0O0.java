package o0OOOOoo;

import com.aspose.slides.internal.p332p7.OooO0o;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: renamed from: o0OOOOoo.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006¨\u0006\u000e"}, m80612d2 = {"Lo0OOOOoo/OooO0O0;", "", "", "OooO00o", "Ljava/lang/String;", "getRegion", "()Ljava/lang/String;", "region", "OooO0O0", "getMobile", "mobile", "OooO0OO", "getCode", "code", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class C27170OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name and from kotlin metadata */
    @SerializedName("region")
    private final String region;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name and from kotlin metadata */
    @SerializedName("mobile")
    private final String mobile;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name and from kotlin metadata */
    @SerializedName("code")
    private final String code;

    public C27170OooO0O0(String str, String mobile, String code) {
        OooOOO0.OooO0oO(mobile, "mobile");
        OooOOO0.OooO0oO(code, "code");
        this.region = str;
        this.mobile = mobile;
        this.code = code;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27170OooO0O0)) {
            return false;
        }
        C27170OooO0O0 c27170OooO0O0 = (C27170OooO0O0) obj;
        return OooOOO0.OooO0O0(this.region, c27170OooO0O0.region) && OooOOO0.OooO0O0(this.mobile, c27170OooO0O0.mobile) && OooOOO0.OooO0O0(this.code, c27170OooO0O0.code);
    }

    public final int hashCode() {
        return this.code.hashCode() + com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(this.region.hashCode() * 31, 31, this.mobile);
    }

    public final String toString() {
        String str = this.region;
        String str2 = this.mobile;
        return androidx.concurrent.futures.OooO00o.OooO0OO(OooO0o.OooO0O0("SubmitVerificationBody(region=", str, ", mobile=", str2, ", code="), this.code, ")");
    }
}
