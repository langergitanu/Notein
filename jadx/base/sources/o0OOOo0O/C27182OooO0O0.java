package o0OOOo0O;

import Oooo0o0.C21009OooOooO;
import com.google.firebase.firestore.util.OooOOO;
import com.google.gson.annotations.SerializedName;
import com.orion.notein.domain.models.backup.BaiduFileMeta;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: renamed from: o0OOOo0O.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u001a\u0010\f\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\b\u0010\u0011¨\u0006\u0013"}, m80612d2 = {"Lo0OOOo0O/OooO0O0;", "", "", "OooO00o", "I", "()I", "errno", "", "OooO0O0", "Ljava/lang/String;", "getErrmsg", "()Ljava/lang/String;", "errmsg", "", "Lcom/orion/notein/domain/models/backup/BaiduFileMeta;", "OooO0OO", "Ljava/util/List;", "()Ljava/util/List;", "fileList", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class C27182OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name and from kotlin metadata */
    @SerializedName("errno")
    private final int errno;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name and from kotlin metadata */
    @SerializedName("errmsg")
    private final String errmsg;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name and from kotlin metadata */
    @SerializedName("list")
    private final List<BaiduFileMeta> fileList;

    public C27182OooO0O0() {
        C34434OooOoO c34434OooOoO = C34434OooOoO.f123453OooOo0o;
        this.errno = 0;
        this.errmsg = "";
        this.fileList = c34434OooOoO;
    }

    /* JADX INFO: renamed from: OooO00o, reason: from getter */
    public final int getErrno() {
        return this.errno;
    }

    public final List<BaiduFileMeta> OooO0O0() {
        return this.fileList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27182OooO0O0)) {
            return false;
        }
        C27182OooO0O0 c27182OooO0O0 = (C27182OooO0O0) obj;
        return this.errno == c27182OooO0O0.errno && OooOOO0.OooO0O0(this.errmsg, c27182OooO0O0.errmsg) && OooOOO0.OooO0O0(this.fileList, c27182OooO0O0.fileList);
    }

    public final int hashCode() {
        return this.fileList.hashCode() + com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(Integer.hashCode(this.errno) * 31, 31, this.errmsg);
    }

    public final String toString() {
        int i = this.errno;
        String str = this.errmsg;
        return OooOOO.OooO0O0(")", C21009OooOooO.OooO0OO(i, "BaiduFileMetaResponse(errno=", ", errmsg=", str, ", fileList="), this.fileList);
    }
}
