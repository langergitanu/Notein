package o0OOOo0O;

import OooOooo.C20785Oooo00o;
import Oooo0o0.C21009OooOooO;
import com.google.gson.annotations.SerializedName;
import com.orion.notein.domain.models.backup.BaiduNetDiskFile;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: renamed from: o0OOOo0O.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u001a\u0010\f\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0004\u001a\u0004\b\u000e\u0010\u0005R \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\b\u0010\u0014¨\u0006\u0016"}, m80612d2 = {"Lo0OOOo0O/OooO0Oo;", "", "", "OooO00o", "I", "()I", "errno", "", "OooO0O0", "Ljava/lang/String;", "getErrmsg", "()Ljava/lang/String;", "errmsg", "OooO0OO", "getHasMore", "hasMore", "", "Lcom/orion/notein/domain/models/backup/BaiduNetDiskFile;", "OooO0Oo", "Ljava/util/List;", "()Ljava/util/List;", "fileList", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class C27184OooO0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name and from kotlin metadata */
    @SerializedName("errno")
    private final int errno;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name and from kotlin metadata */
    @SerializedName("errmsg")
    private final String errmsg;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name and from kotlin metadata */
    @SerializedName("has_more")
    private final int hasMore;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name and from kotlin metadata */
    @SerializedName("list")
    private final List<BaiduNetDiskFile> fileList;

    public C27184OooO0Oo() {
        C34434OooOoO c34434OooOoO = C34434OooOoO.f123453OooOo0o;
        this.errno = 0;
        this.errmsg = "";
        this.hasMore = -1;
        this.fileList = c34434OooOoO;
    }

    /* JADX INFO: renamed from: OooO00o, reason: from getter */
    public final int getErrno() {
        return this.errno;
    }

    public final List<BaiduNetDiskFile> OooO0O0() {
        return this.fileList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27184OooO0Oo)) {
            return false;
        }
        C27184OooO0Oo c27184OooO0Oo = (C27184OooO0Oo) obj;
        return this.errno == c27184OooO0Oo.errno && OooOOO0.OooO0O0(this.errmsg, c27184OooO0Oo.errmsg) && this.hasMore == c27184OooO0Oo.hasMore && OooOOO0.OooO0O0(this.fileList, c27184OooO0Oo.fileList);
    }

    public final int hashCode() {
        return this.fileList.hashCode() + C20785Oooo00o.OooO00o(this.hasMore, com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(Integer.hashCode(this.errno) * 31, 31, this.errmsg), 31);
    }

    public final String toString() {
        int i = this.errno;
        String str = this.errmsg;
        int i2 = this.hasMore;
        List<BaiduNetDiskFile> list = this.fileList;
        StringBuilder sbOooO0OO = C21009OooOooO.OooO0OO(i, "BaiduSearchResponse(errno=", ", errmsg=", str, ", hasMore=");
        sbOooO0OO.append(i2);
        sbOooO0OO.append(", fileList=");
        sbOooO0OO.append(list);
        sbOooO0OO.append(")");
        return sbOooO0OO.toString();
    }
}
