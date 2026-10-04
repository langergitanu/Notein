package o0OOOoO0;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: renamed from: o0OOOoO0.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0015\u0010\u0012R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0010\u001a\u0004\b\u0018\u0010\u0012¨\u0006\u001a"}, m80612d2 = {"Lo0OOOoO0/OooO00o;", "", "", "OooO00o", "Ljava/lang/String;", "getUrl", "()Ljava/lang/String;", "url", "OooO0O0", "getFilename", "filename", "OooO0OO", "getPassword", "password", "", "OooO0Oo", "Ljava/lang/Integer;", "getFromPage", "()Ljava/lang/Integer;", "fromPage", "OooO0o0", "getToPage", "toPage", "OooO0o", "getShowComments", "showComments", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class C27192OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name and from kotlin metadata */
    @SerializedName("url")
    private final String url;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name and from kotlin metadata */
    @SerializedName("filename")
    private final String filename;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name and from kotlin metadata */
    @SerializedName("password")
    private final String password;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name and from kotlin metadata */
    @SerializedName("from_page")
    private final Integer fromPage;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name and from kotlin metadata */
    @SerializedName("show_comments")
    private final Integer showComments;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name and from kotlin metadata */
    @SerializedName("to_page")
    private final Integer toPage;

    public C27192OooO00o(String url, String filename, String str) {
        OooOOO0.OooO0oO(url, "url");
        OooOOO0.OooO0oO(filename, "filename");
        this.url = url;
        this.filename = filename;
        this.password = str;
        this.fromPage = null;
        this.toPage = null;
        this.showComments = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27192OooO00o)) {
            return false;
        }
        C27192OooO00o c27192OooO00o = (C27192OooO00o) obj;
        return OooOOO0.OooO0O0(this.url, c27192OooO00o.url) && OooOOO0.OooO0O0(this.filename, c27192OooO00o.filename) && OooOOO0.OooO0O0(this.password, c27192OooO00o.password) && OooOOO0.OooO0O0(this.fromPage, c27192OooO00o.fromPage) && OooOOO0.OooO0O0(this.toPage, c27192OooO00o.toPage) && OooOOO0.OooO0O0(this.showComments, c27192OooO00o.showComments);
    }

    public final int hashCode() {
        int iOooO0O0 = com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(this.url.hashCode() * 31, 31, this.filename);
        String str = this.password;
        int iHashCode = (iOooO0O0 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.fromPage;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.toPage;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.showComments;
        return iHashCode3 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        String str = this.url;
        String str2 = this.filename;
        String str3 = this.password;
        Integer num = this.fromPage;
        Integer num2 = this.toPage;
        Integer num3 = this.showComments;
        StringBuilder sbOooO0O0 = com.aspose.slides.internal.p332p7.OooO0o.OooO0O0("ConvertRequest(url=", str, ", filename=", str2, ", password=");
        sbOooO0O0.append(str3);
        sbOooO0O0.append(", fromPage=");
        sbOooO0O0.append(num);
        sbOooO0O0.append(", toPage=");
        sbOooO0O0.append(num2);
        sbOooO0O0.append(", showComments=");
        sbOooO0O0.append(num3);
        sbOooO0O0.append(")");
        return sbOooO0O0.toString();
    }
}
