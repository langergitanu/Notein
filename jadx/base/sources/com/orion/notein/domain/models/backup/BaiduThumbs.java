package com.orion.notein.domain.models.backup;

import com.aspose.slides.internal.p332p7.OooO0o;
import com.aspose.slides.internal.p497xc.OooO00o;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, m80612d2 = {"Lcom/orion/notein/domain/models/backup/BaiduThumbs;", "", "url1", "", "url2", "url3", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getUrl1", "()Ljava/lang/String;", "getUrl2", "getUrl3", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class BaiduThumbs {

    @SerializedName("url1")
    private final String url1;

    @SerializedName("url2")
    private final String url2;

    @SerializedName("url3")
    private final String url3;

    public BaiduThumbs() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ BaiduThumbs copy$default(BaiduThumbs baiduThumbs, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = baiduThumbs.url1;
        }
        if ((i & 2) != 0) {
            str2 = baiduThumbs.url2;
        }
        if ((i & 4) != 0) {
            str3 = baiduThumbs.url3;
        }
        return baiduThumbs.copy(str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUrl1() {
        return this.url1;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUrl2() {
        return this.url2;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getUrl3() {
        return this.url3;
    }

    public final BaiduThumbs copy(String url1, String url2, String url3) {
        OooOOO0.OooO0oO(url1, "url1");
        OooOOO0.OooO0oO(url2, "url2");
        OooOOO0.OooO0oO(url3, "url3");
        return new BaiduThumbs(url1, url2, url3);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BaiduThumbs)) {
            return false;
        }
        BaiduThumbs baiduThumbs = (BaiduThumbs) other;
        return OooOOO0.OooO0O0(this.url1, baiduThumbs.url1) && OooOOO0.OooO0O0(this.url2, baiduThumbs.url2) && OooOOO0.OooO0O0(this.url3, baiduThumbs.url3);
    }

    public final String getUrl1() {
        return this.url1;
    }

    public final String getUrl2() {
        return this.url2;
    }

    public final String getUrl3() {
        return this.url3;
    }

    public int hashCode() {
        return this.url3.hashCode() + OooO00o.OooO0O0(this.url1.hashCode() * 31, 31, this.url2);
    }

    public String toString() {
        String str = this.url1;
        String str2 = this.url2;
        return androidx.concurrent.futures.OooO00o.OooO0OO(OooO0o.OooO0O0("BaiduThumbs(url1=", str, ", url2=", str2, ", url3="), this.url3, ")");
    }

    public BaiduThumbs(String url1, String url2, String url3) {
        OooOOO0.OooO0oO(url1, "url1");
        OooOOO0.OooO0oO(url2, "url2");
        OooOOO0.OooO0oO(url3, "url3");
        this.url1 = url1;
        this.url2 = url2;
        this.url3 = url3;
    }

    public /* synthetic */ BaiduThumbs(String str, String str2, String str3, int i, C24018OooO0oo c24018OooO0oo) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }
}
