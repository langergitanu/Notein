package o0OOOo0O;

import OooOooo.C20785Oooo00o;
import Oooo0oO.C21023OooO0Oo;
import OoooooO.C21445Oooo;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.aspose.slides.internal.p332p7.OooO0o;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: renamed from: o0OOOo0O.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001a\u0010\u000e\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\f\u001a\u0004\b\b\u0010\rR \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0016\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\f\u001a\u0004\b\u0003\u0010\r¨\u0006\u0017"}, m80612d2 = {"Lo0OOOo0O/OooO0OO;", "", "", "OooO00o", "Ljava/lang/String;", "getPath", "()Ljava/lang/String;", "path", "OooO0O0", "OooO0OO", RequestParameters.UPLOAD_ID, "", "I", "()I", "returnType", "", "OooO0Oo", "Ljava/util/List;", "getBlockList", "()Ljava/util/List;", "blockList", "OooO0o0", "errno", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class C27183OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name and from kotlin metadata */
    @SerializedName("path")
    private final String path;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name and from kotlin metadata */
    @SerializedName("uploadid")
    private final String uploadId;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name and from kotlin metadata */
    @SerializedName("return_type")
    private final int returnType;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name and from kotlin metadata */
    @SerializedName("block_list")
    private final List<String> blockList;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name and from kotlin metadata */
    @SerializedName("errno")
    private final int errno;

    public C27183OooO0OO() {
        C34434OooOoO c34434OooOoO = C34434OooOoO.f123453OooOo0o;
        this.path = "";
        this.uploadId = "";
        this.returnType = 0;
        this.blockList = c34434OooOoO;
        this.errno = 0;
    }

    /* JADX INFO: renamed from: OooO00o, reason: from getter */
    public final int getErrno() {
        return this.errno;
    }

    /* JADX INFO: renamed from: OooO0O0, reason: from getter */
    public final int getReturnType() {
        return this.returnType;
    }

    /* JADX INFO: renamed from: OooO0OO, reason: from getter */
    public final String getUploadId() {
        return this.uploadId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27183OooO0OO)) {
            return false;
        }
        C27183OooO0OO c27183OooO0OO = (C27183OooO0OO) obj;
        return OooOOO0.OooO0O0(this.path, c27183OooO0OO.path) && OooOOO0.OooO0O0(this.uploadId, c27183OooO0OO.uploadId) && this.returnType == c27183OooO0OO.returnType && OooOOO0.OooO0O0(this.blockList, c27183OooO0OO.blockList) && this.errno == c27183OooO0OO.errno;
    }

    public final int hashCode() {
        return Integer.hashCode(this.errno) + C21445Oooo.OooO00o(this.blockList, C20785Oooo00o.OooO00o(this.returnType, com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(this.path.hashCode() * 31, 31, this.uploadId), 31), 31);
    }

    public final String toString() {
        String str = this.path;
        String str2 = this.uploadId;
        int i = this.returnType;
        List<String> list = this.blockList;
        int i2 = this.errno;
        StringBuilder sbOooO0O0 = OooO0o.OooO0O0("BaiduPrecreateResponse(path=", str, ", uploadId=", str2, ", returnType=");
        sbOooO0O0.append(i);
        sbOooO0O0.append(", blockList=");
        sbOooO0O0.append(list);
        sbOooO0O0.append(", errno=");
        return C21023OooO0Oo.OooO0OO(")", i2, sbOooO0O0);
    }
}
