package o0OOOoO0;

import OooOoo0.C20703o000000o;
import com.aspose.slides.OooOOO;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: renamed from: o0OOOoO0.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u001a\u0010\f\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0004\u001a\u0004\b\u000e\u0010\u0005¨\u0006\u0010"}, m80612d2 = {"Lo0OOOoO0/OooO0OO;", "", "", "OooO00o", "Ljava/lang/String;", "()Ljava/lang/String;", "url", "", "OooO0O0", "J", "getSize", "()J", "size", "OooO0OO", "getSlideId", "slideId", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class C27194OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name and from kotlin metadata */
    @SerializedName("url")
    private final String url;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name and from kotlin metadata */
    @SerializedName("size")
    private final long size;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name and from kotlin metadata */
    @SerializedName("slideId")
    private final String slideId;

    /* JADX INFO: renamed from: OooO00o, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27194OooO0OO)) {
            return false;
        }
        C27194OooO0OO c27194OooO0OO = (C27194OooO0OO) obj;
        return OooOOO0.OooO0O0(this.url, c27194OooO0OO.url) && this.size == c27194OooO0OO.size && OooOOO0.OooO0O0(this.slideId, c27194OooO0OO.slideId);
    }

    public final int hashCode() {
        int iOooO0O0 = C20703o000000o.OooO0O0(this.url.hashCode() * 31, 31, this.size);
        String str = this.slideId;
        return iOooO0O0 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        String str = this.url;
        long j = this.size;
        String str2 = this.slideId;
        StringBuilder sb = new StringBuilder("ResultFile(url=");
        sb.append(str);
        sb.append(", size=");
        sb.append(j);
        return OooOOO.OooO0O0(sb, ", slideId=", str2, ")");
    }
}
