package o0O0Ooo;

import OoooooO.C21445Oooo;
import com.aspose.slides.internal.p332p7.OooO0o;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: renamed from: o0O0Ooo.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006¨\u0006\u0011"}, m80612d2 = {"Lo0O0Ooo/OooO0O0;", "", "", "OooO00o", "Ljava/lang/String;", "getBrand", "()Ljava/lang/String;", "brand", "OooO0O0", "getName", "name", "OooO0OO", "getProductId", "productId", "OooO0Oo", "getVendorId", "vendorId", "ni-common-android_release"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class C25904OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name and from kotlin metadata */
    @SerializedName("brand")
    private final String brand = "xiaomi";

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name and from kotlin metadata */
    @SerializedName("deviceName")
    private final String name;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name and from kotlin metadata */
    @SerializedName("productId")
    private final String productId;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name and from kotlin metadata */
    @SerializedName("vendorId")
    private final String vendorId;

    public C25904OooO0O0(String str, String str2, String str3) {
        this.name = str;
        this.productId = str2;
        this.vendorId = str3;
    }

    public final boolean OooO00o(String productId, String vendorId) {
        OooOOO0.OooO0oO(productId, "productId");
        OooOOO0.OooO0oO(vendorId, "vendorId");
        return OooOOO0.OooO0O0(this.productId, productId) && OooOOO0.OooO0O0(this.vendorId, vendorId);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25904OooO0O0)) {
            return false;
        }
        C25904OooO0O0 c25904OooO0O0 = (C25904OooO0O0) obj;
        return OooOOO0.OooO0O0(this.brand, c25904OooO0O0.brand) && OooOOO0.OooO0O0(this.name, c25904OooO0O0.name) && OooOOO0.OooO0O0(this.productId, c25904OooO0O0.productId) && OooOOO0.OooO0O0(this.vendorId, c25904OooO0O0.vendorId);
    }

    public final int hashCode() {
        return this.vendorId.hashCode() + com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(this.brand.hashCode() * 31, 31, this.name), 31, this.productId);
    }

    public final String toString() {
        String str = this.brand;
        String str2 = this.name;
        return C21445Oooo.OooO0O0(OooO0o.OooO0O0("StylusHardwareInfo(brand=", str, ", name=", str2, ", productId="), this.productId, ", vendorId=", this.vendorId, ")");
    }
}
