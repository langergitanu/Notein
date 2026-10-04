package o0OOOo0O;

import Oooo0o0.C21009OooOooO;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: renamed from: o0OOOo0O.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u001a\u0010\f\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u000f\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\t\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u0010"}, m80612d2 = {"Lo0OOOo0O/OooO0o0;", "", "", "OooO00o", "I", "()I", "errno", "", "OooO0O0", "Ljava/lang/String;", "getErrmsg", "()Ljava/lang/String;", "errmsg", "OooO0OO", "getMd5", "md5", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class C27185OooO0o0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name and from kotlin metadata */
    @SerializedName("errno")
    private final int errno = 0;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name and from kotlin metadata */
    @SerializedName("errmsg")
    private final String errmsg = "";

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name and from kotlin metadata */
    @SerializedName("md5")
    private final String md5 = "";

    /* JADX INFO: renamed from: OooO00o, reason: from getter */
    public final int getErrno() {
        return this.errno;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27185OooO0o0)) {
            return false;
        }
        C27185OooO0o0 c27185OooO0o0 = (C27185OooO0o0) obj;
        return this.errno == c27185OooO0o0.errno && OooOOO0.OooO0O0(this.errmsg, c27185OooO0o0.errmsg) && OooOOO0.OooO0O0(this.md5, c27185OooO0o0.md5);
    }

    public final int hashCode() {
        return this.md5.hashCode() + com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(Integer.hashCode(this.errno) * 31, 31, this.errmsg);
    }

    public final String toString() {
        int i = this.errno;
        String str = this.errmsg;
        return androidx.concurrent.futures.OooO00o.OooO0OO(C21009OooOooO.OooO0OO(i, "BaiduUploadResponse(errno=", ", errmsg=", str, ", md5="), this.md5, ")");
    }
}
