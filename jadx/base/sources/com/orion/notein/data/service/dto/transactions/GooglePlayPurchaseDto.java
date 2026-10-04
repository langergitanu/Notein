package com.orion.notein.data.service.dto.transactions;

import com.aspose.slides.internal.p332p7.OooO0o;
import com.aspose.slides.internal.p497xc.OooO00o;
import com.google.gson.annotations.SerializedName;
import com.microsoft.identity.common.internal.providers.oauth2.ResponseType;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, m80612d2 = {"Lcom/orion/notein/data/service/dto/transactions/GooglePlayPurchaseDto;", "", "packageName", "", ResponseType.TOKEN, "productId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPackageName", "()Ljava/lang/String;", "getToken", "getProductId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class GooglePlayPurchaseDto {

    @SerializedName("package_name")
    private final String packageName;

    @SerializedName("product_id")
    private final String productId;

    @SerializedName(ResponseType.TOKEN)
    private final String token;

    public GooglePlayPurchaseDto(String packageName, String token, String str) {
        OooOOO0.OooO0oO(packageName, "packageName");
        OooOOO0.OooO0oO(token, "token");
        this.packageName = packageName;
        this.token = token;
        this.productId = str;
    }

    public static /* synthetic */ GooglePlayPurchaseDto copy$default(GooglePlayPurchaseDto googlePlayPurchaseDto, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = googlePlayPurchaseDto.packageName;
        }
        if ((i & 2) != 0) {
            str2 = googlePlayPurchaseDto.token;
        }
        if ((i & 4) != 0) {
            str3 = googlePlayPurchaseDto.productId;
        }
        return googlePlayPurchaseDto.copy(str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPackageName() {
        return this.packageName;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getProductId() {
        return this.productId;
    }

    public final GooglePlayPurchaseDto copy(String packageName, String token, String productId) {
        OooOOO0.OooO0oO(packageName, "packageName");
        OooOOO0.OooO0oO(token, "token");
        return new GooglePlayPurchaseDto(packageName, token, productId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GooglePlayPurchaseDto)) {
            return false;
        }
        GooglePlayPurchaseDto googlePlayPurchaseDto = (GooglePlayPurchaseDto) other;
        return OooOOO0.OooO0O0(this.packageName, googlePlayPurchaseDto.packageName) && OooOOO0.OooO0O0(this.token, googlePlayPurchaseDto.token) && OooOOO0.OooO0O0(this.productId, googlePlayPurchaseDto.productId);
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public final String getProductId() {
        return this.productId;
    }

    public final String getToken() {
        return this.token;
    }

    public int hashCode() {
        int iOooO0O0 = OooO00o.OooO0O0(this.packageName.hashCode() * 31, 31, this.token);
        String str = this.productId;
        return iOooO0O0 + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.packageName;
        String str2 = this.token;
        return androidx.concurrent.futures.OooO00o.OooO0OO(OooO0o.OooO0O0("GooglePlayPurchaseDto(packageName=", str, ", token=", str2, ", productId="), this.productId, ")");
    }

    public /* synthetic */ GooglePlayPurchaseDto(String str, String str2, String str3, int i, C24018OooO0oo c24018OooO0oo) {
        this(str, str2, (i & 4) != 0 ? null : str3);
    }
}
