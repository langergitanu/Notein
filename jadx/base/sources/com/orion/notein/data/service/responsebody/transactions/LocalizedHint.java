package com.orion.notein.data.service.responsebody.transactions;

import androidx.concurrent.futures.OooO00o;
import com.aspose.slides.internal.p332p7.OooO0o;
import com.google.gson.annotations.SerializedName;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, m80612d2 = {"Lcom/orion/notein/data/service/responsebody/transactions/LocalizedHint;", "", TranslateLanguage.ENGLISH, "", "zhCN", "zhTW", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getEn", "()Ljava/lang/String;", "getZhCN", "getZhTW", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class LocalizedHint {

    @SerializedName(TranslateLanguage.ENGLISH)
    private final String en;

    @SerializedName("zhCN")
    private final String zhCN;

    @SerializedName("zhTW")
    private final String zhTW;

    public LocalizedHint() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ LocalizedHint copy$default(LocalizedHint localizedHint, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = localizedHint.en;
        }
        if ((i & 2) != 0) {
            str2 = localizedHint.zhCN;
        }
        if ((i & 4) != 0) {
            str3 = localizedHint.zhTW;
        }
        return localizedHint.copy(str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEn() {
        return this.en;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getZhCN() {
        return this.zhCN;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getZhTW() {
        return this.zhTW;
    }

    public final LocalizedHint copy(String en, String zhCN, String zhTW) {
        return new LocalizedHint(en, zhCN, zhTW);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LocalizedHint)) {
            return false;
        }
        LocalizedHint localizedHint = (LocalizedHint) other;
        return OooOOO0.OooO0O0(this.en, localizedHint.en) && OooOOO0.OooO0O0(this.zhCN, localizedHint.zhCN) && OooOOO0.OooO0O0(this.zhTW, localizedHint.zhTW);
    }

    public final String getEn() {
        return this.en;
    }

    public final String getZhCN() {
        return this.zhCN;
    }

    public final String getZhTW() {
        return this.zhTW;
    }

    public int hashCode() {
        String str = this.en;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.zhCN;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.zhTW;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        String str = this.en;
        String str2 = this.zhCN;
        return OooO00o.OooO0OO(OooO0o.OooO0O0("LocalizedHint(en=", str, ", zhCN=", str2, ", zhTW="), this.zhTW, ")");
    }

    public LocalizedHint(String str, String str2, String str3) {
        this.en = str;
        this.zhCN = str2;
        this.zhTW = str3;
    }

    public /* synthetic */ LocalizedHint(String str, String str2, String str3, int i, C24018OooO0oo c24018OooO0oo) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
