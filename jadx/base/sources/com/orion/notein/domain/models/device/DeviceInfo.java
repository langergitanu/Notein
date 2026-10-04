package com.orion.notein.domain.models.device;

import OooOO0.OooO0OO;
import com.aspose.slides.internal.p332p7.OooO0o;
import com.aspose.slides.internal.p497xc.OooO00o;
import com.google.gson.annotations.SerializedName;
import com.hihonor.honorid.core.data.TmemberRight;
import com.huawei.hms.network.embedded.C18115b5;
import com.microsoft.identity.common.adal.internal.AuthenticationConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J;\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001c"}, m80612d2 = {"Lcom/orion/notein/domain/models/device/DeviceInfo;", "", TmemberRight.TAG_DEVICEID, "", "brand", "product", "user", "platform", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDeviceId", "()Ljava/lang/String;", "getBrand", "getProduct", "getUser", "getPlatform", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class DeviceInfo {

    @SerializedName("brand")
    private final String brand;

    @SerializedName(C18115b5.DEVICE_ID)
    private final String deviceId;

    @SerializedName("platform")
    private final String platform;

    @SerializedName("product")
    private final String product;

    @SerializedName("user")
    private final String user;

    public DeviceInfo(String deviceId, String brand, String product, String user, String platform) {
        OooOOO0.OooO0oO(deviceId, "deviceId");
        OooOOO0.OooO0oO(brand, "brand");
        OooOOO0.OooO0oO(product, "product");
        OooOOO0.OooO0oO(user, "user");
        OooOOO0.OooO0oO(platform, "platform");
        this.deviceId = deviceId;
        this.brand = brand;
        this.product = product;
        this.user = user;
        this.platform = platform;
    }

    public static /* synthetic */ DeviceInfo copy$default(DeviceInfo deviceInfo, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = deviceInfo.deviceId;
        }
        if ((i & 2) != 0) {
            str2 = deviceInfo.brand;
        }
        if ((i & 4) != 0) {
            str3 = deviceInfo.product;
        }
        if ((i & 8) != 0) {
            str4 = deviceInfo.user;
        }
        if ((i & 16) != 0) {
            str5 = deviceInfo.platform;
        }
        String str6 = str5;
        String str7 = str3;
        return deviceInfo.copy(str, str2, str7, str4, str6);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBrand() {
        return this.brand;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getProduct() {
        return this.product;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getUser() {
        return this.user;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getPlatform() {
        return this.platform;
    }

    public final DeviceInfo copy(String deviceId, String brand, String product, String user, String platform) {
        OooOOO0.OooO0oO(deviceId, "deviceId");
        OooOOO0.OooO0oO(brand, "brand");
        OooOOO0.OooO0oO(product, "product");
        OooOOO0.OooO0oO(user, "user");
        OooOOO0.OooO0oO(platform, "platform");
        return new DeviceInfo(deviceId, brand, product, user, platform);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceInfo)) {
            return false;
        }
        DeviceInfo deviceInfo = (DeviceInfo) other;
        return OooOOO0.OooO0O0(this.deviceId, deviceInfo.deviceId) && OooOOO0.OooO0O0(this.brand, deviceInfo.brand) && OooOOO0.OooO0O0(this.product, deviceInfo.product) && OooOOO0.OooO0O0(this.user, deviceInfo.user) && OooOOO0.OooO0O0(this.platform, deviceInfo.platform);
    }

    public final String getBrand() {
        return this.brand;
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final String getPlatform() {
        return this.platform;
    }

    public final String getProduct() {
        return this.product;
    }

    public final String getUser() {
        return this.user;
    }

    public int hashCode() {
        return this.platform.hashCode() + OooO00o.OooO0O0(OooO00o.OooO0O0(OooO00o.OooO0O0(this.deviceId.hashCode() * 31, 31, this.brand), 31, this.product), 31, this.user);
    }

    public String toString() {
        String str = this.deviceId;
        String str2 = this.brand;
        String str3 = this.product;
        String str4 = this.user;
        String str5 = this.platform;
        StringBuilder sbOooO0O0 = OooO0o.OooO0O0("DeviceInfo(deviceId=", str, ", brand=", str2, ", product=");
        OooO0OO.OooO0o0(sbOooO0O0, str3, ", user=", str4, ", platform=");
        return androidx.concurrent.futures.OooO00o.OooO0OO(sbOooO0O0, str5, ")");
    }

    public /* synthetic */ DeviceInfo(String str, String str2, String str3, String str4, String str5, int i, C24018OooO0oo c24018OooO0oo) {
        this(str, str2, str3, str4, (i & 16) != 0 ? AuthenticationConstants.AAD.ADAL_ID_PLATFORM_VALUE : str5);
    }
}
