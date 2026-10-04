package com.orion.notein.domain.models;

import OooOO0.OooO0OO;
import com.aspose.slides.internal.p332p7.OooO0o;
import com.aspose.slides.internal.p497xc.OooO00o;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J;\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001c"}, m80612d2 = {"Lcom/orion/notein/domain/models/CountryCode;", "", "enName", "", "zhName", "code", "pinyinName", "countryCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getEnName", "()Ljava/lang/String;", "getZhName", "getCode", "getPinyinName", "getCountryCode", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class CountryCode {

    @SerializedName("phone_code")
    private final String code;

    @SerializedName("country_code")
    private final String countryCode;

    @SerializedName("english_name")
    private final String enName;

    @SerializedName("pinyin_name")
    private final String pinyinName;

    @SerializedName("chinese_name")
    private final String zhName;

    public CountryCode(String enName, String zhName, String code, String pinyinName, String countryCode) {
        OooOOO0.OooO0oO(enName, "enName");
        OooOOO0.OooO0oO(zhName, "zhName");
        OooOOO0.OooO0oO(code, "code");
        OooOOO0.OooO0oO(pinyinName, "pinyinName");
        OooOOO0.OooO0oO(countryCode, "countryCode");
        this.enName = enName;
        this.zhName = zhName;
        this.code = code;
        this.pinyinName = pinyinName;
        this.countryCode = countryCode;
    }

    public static /* synthetic */ CountryCode copy$default(CountryCode countryCode, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = countryCode.enName;
        }
        if ((i & 2) != 0) {
            str2 = countryCode.zhName;
        }
        if ((i & 4) != 0) {
            str3 = countryCode.code;
        }
        if ((i & 8) != 0) {
            str4 = countryCode.pinyinName;
        }
        if ((i & 16) != 0) {
            str5 = countryCode.countryCode;
        }
        String str6 = str5;
        String str7 = str3;
        return countryCode.copy(str, str2, str7, str4, str6);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEnName() {
        return this.enName;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getZhName() {
        return this.zhName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPinyinName() {
        return this.pinyinName;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    public final CountryCode copy(String enName, String zhName, String code, String pinyinName, String countryCode) {
        OooOOO0.OooO0oO(enName, "enName");
        OooOOO0.OooO0oO(zhName, "zhName");
        OooOOO0.OooO0oO(code, "code");
        OooOOO0.OooO0oO(pinyinName, "pinyinName");
        OooOOO0.OooO0oO(countryCode, "countryCode");
        return new CountryCode(enName, zhName, code, pinyinName, countryCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CountryCode)) {
            return false;
        }
        CountryCode countryCode = (CountryCode) other;
        return OooOOO0.OooO0O0(this.enName, countryCode.enName) && OooOOO0.OooO0O0(this.zhName, countryCode.zhName) && OooOOO0.OooO0O0(this.code, countryCode.code) && OooOOO0.OooO0O0(this.pinyinName, countryCode.pinyinName) && OooOOO0.OooO0O0(this.countryCode, countryCode.countryCode);
    }

    public final String getCode() {
        return this.code;
    }

    public final String getCountryCode() {
        return this.countryCode;
    }

    public final String getEnName() {
        return this.enName;
    }

    public final String getPinyinName() {
        return this.pinyinName;
    }

    public final String getZhName() {
        return this.zhName;
    }

    public int hashCode() {
        return this.countryCode.hashCode() + OooO00o.OooO0O0(OooO00o.OooO0O0(OooO00o.OooO0O0(this.enName.hashCode() * 31, 31, this.zhName), 31, this.code), 31, this.pinyinName);
    }

    public String toString() {
        String str = this.enName;
        String str2 = this.zhName;
        String str3 = this.code;
        String str4 = this.pinyinName;
        String str5 = this.countryCode;
        StringBuilder sbOooO0O0 = OooO0o.OooO0O0("CountryCode(enName=", str, ", zhName=", str2, ", code=");
        OooO0OO.OooO0o0(sbOooO0O0, str3, ", pinyinName=", str4, ", countryCode=");
        return androidx.concurrent.futures.OooO00o.OooO0OO(sbOooO0O0, str5, ")");
    }
}
