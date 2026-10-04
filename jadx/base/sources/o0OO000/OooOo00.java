package o0OO000;

import Oooo0o0.C21009OooOooO;
import com.google.gson.annotations.SerializedName;
import com.orion.notein.domain.models.cloudsync.CloudContentTag;
import com.orion.notein.domain.models.cloudsync.CloudMetaExtra;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0010\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\fR\u001a\u0010\u0016\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\n\u001a\u0004\b\u0018\u0010\fR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, m80612d2 = {"Lo0OO000/OooOo00;", "", "", "OooO00o", "I", "getExpectedMetaVersion", "()I", "expectedMetaVersion", "", "OooO0O0", "Ljava/lang/String;", "getMimeType", "()Ljava/lang/String;", "mimeType", "OooO0OO", "getMetaHash", "metaHash", "Lcom/orion/notein/domain/models/cloudsync/CloudContentTag;", "OooO0Oo", "Lcom/orion/notein/domain/models/cloudsync/CloudContentTag;", "getContentTag", "()Lcom/orion/notein/domain/models/cloudsync/CloudContentTag;", "contentTag", "OooO0o0", "getDriveObjectKey", "driveObjectKey", "Lcom/orion/notein/domain/models/cloudsync/CloudMetaExtra;", "OooO0o", "Lcom/orion/notein/domain/models/cloudsync/CloudMetaExtra;", "getExtra", "()Lcom/orion/notein/domain/models/cloudsync/CloudMetaExtra;", "extra", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class OooOo00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name and from kotlin metadata */
    @SerializedName("expectedMetaVersion")
    private final int expectedMetaVersion;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name and from kotlin metadata */
    @SerializedName("mimeType")
    private final String mimeType;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name and from kotlin metadata */
    @SerializedName("metaHash")
    private final String metaHash;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name and from kotlin metadata */
    @SerializedName("contentTag")
    private final CloudContentTag contentTag;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name and from kotlin metadata */
    @SerializedName("extra")
    private final CloudMetaExtra extra;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name and from kotlin metadata */
    @SerializedName("driveObjectKey")
    private final String driveObjectKey;

    public OooOo00(int i, String mimeType, String metaHash, CloudContentTag contentTag, String str, CloudMetaExtra cloudMetaExtra) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(mimeType, "mimeType");
        kotlin.jvm.internal.OooOOO0.OooO0oO(metaHash, "metaHash");
        kotlin.jvm.internal.OooOOO0.OooO0oO(contentTag, "contentTag");
        this.expectedMetaVersion = i;
        this.mimeType = mimeType;
        this.metaHash = metaHash;
        this.contentTag = contentTag;
        this.driveObjectKey = str;
        this.extra = cloudMetaExtra;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OooOo00)) {
            return false;
        }
        OooOo00 oooOo00 = (OooOo00) obj;
        return this.expectedMetaVersion == oooOo00.expectedMetaVersion && kotlin.jvm.internal.OooOOO0.OooO0O0(this.mimeType, oooOo00.mimeType) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.metaHash, oooOo00.metaHash) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.contentTag, oooOo00.contentTag) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.driveObjectKey, oooOo00.driveObjectKey) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.extra, oooOo00.extra);
    }

    public final int hashCode() {
        int iHashCode = (this.contentTag.hashCode() + com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(Integer.hashCode(this.expectedMetaVersion) * 31, 31, this.mimeType), 31, this.metaHash)) * 31;
        String str = this.driveObjectKey;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        CloudMetaExtra cloudMetaExtra = this.extra;
        return iHashCode2 + (cloudMetaExtra != null ? cloudMetaExtra.hashCode() : 0);
    }

    public final String toString() {
        int i = this.expectedMetaVersion;
        String str = this.mimeType;
        String str2 = this.metaHash;
        CloudContentTag cloudContentTag = this.contentTag;
        String str3 = this.driveObjectKey;
        CloudMetaExtra cloudMetaExtra = this.extra;
        StringBuilder sbOooO0OO = C21009OooOooO.OooO0OO(i, "PreuploadMetaRequest(expectedMetaVersion=", ", mimeType=", str, ", metaHash=");
        sbOooO0OO.append(str2);
        sbOooO0OO.append(", contentTag=");
        sbOooO0OO.append(cloudContentTag);
        sbOooO0OO.append(", driveObjectKey=");
        sbOooO0OO.append(str3);
        sbOooO0OO.append(", extra=");
        sbOooO0OO.append(cloudMetaExtra);
        sbOooO0OO.append(")");
        return sbOooO0OO.toString();
    }
}
