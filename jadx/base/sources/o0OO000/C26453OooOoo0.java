package o0OO000;

import Oooo0o0.C21009OooOooO;
import com.google.gson.annotations.SerializedName;
import com.orion.notein.domain.models.cloudsync.CloudContentTag;
import com.orion.notein.domain.models.cloudsync.CloudMetaExtra;
import kotlin.Metadata;

/* JADX INFO: renamed from: o0OO000.OooOoo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\r\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\fR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\n\u001a\u0004\b\u0018\u0010\fR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010%\u001a\u0004\u0018\u00010 8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006&"}, m80612d2 = {"Lo0OO000/OooOoo0;", "", "", "OooO00o", "I", "getMetaVersion", "()I", "metaVersion", "", "OooO0O0", "Ljava/lang/String;", "getMetaHash", "()Ljava/lang/String;", "metaHash", "OooO0OO", "getMimeType", "mimeType", "Lcom/orion/notein/domain/models/cloudsync/CloudContentTag;", "OooO0Oo", "Lcom/orion/notein/domain/models/cloudsync/CloudContentTag;", "getContentTag", "()Lcom/orion/notein/domain/models/cloudsync/CloudContentTag;", "contentTag", "OooO0o0", "getDriveObjectKey", "driveObjectKey", "", "OooO0o", "Ljava/lang/Long;", "getDeleted", "()Ljava/lang/Long;", "deleted", "Lcom/orion/notein/domain/models/cloudsync/CloudMetaExtra;", "OooO0oO", "Lcom/orion/notein/domain/models/cloudsync/CloudMetaExtra;", "getExtra", "()Lcom/orion/notein/domain/models/cloudsync/CloudMetaExtra;", "extra", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class C26453OooOoo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name and from kotlin metadata */
    @SerializedName("metaVersion")
    private final int metaVersion;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name and from kotlin metadata */
    @SerializedName("metaHash")
    private final String metaHash;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name and from kotlin metadata */
    @SerializedName("mimeType")
    private final String mimeType;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name and from kotlin metadata */
    @SerializedName("contentTag")
    private final CloudContentTag contentTag;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name and from kotlin metadata */
    @SerializedName("deleted")
    private final Long deleted;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name and from kotlin metadata */
    @SerializedName("driveObjectKey")
    private final String driveObjectKey;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name and from kotlin metadata */
    @SerializedName("extra")
    private final CloudMetaExtra extra;

    public C26453OooOoo0(int i, String str, String str2, String str3, Long l, CloudMetaExtra cloudMetaExtra, int i2) {
        str = (i2 & 2) != 0 ? null : str;
        str2 = (i2 & 4) != 0 ? null : str2;
        str3 = (i2 & 16) != 0 ? null : str3;
        cloudMetaExtra = (i2 & 64) != 0 ? null : cloudMetaExtra;
        this.metaVersion = i;
        this.metaHash = str;
        this.mimeType = str2;
        this.contentTag = null;
        this.driveObjectKey = str3;
        this.deleted = l;
        this.extra = cloudMetaExtra;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26453OooOoo0)) {
            return false;
        }
        C26453OooOoo0 c26453OooOoo0 = (C26453OooOoo0) obj;
        return this.metaVersion == c26453OooOoo0.metaVersion && kotlin.jvm.internal.OooOOO0.OooO0O0(this.metaHash, c26453OooOoo0.metaHash) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.mimeType, c26453OooOoo0.mimeType) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.contentTag, c26453OooOoo0.contentTag) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.driveObjectKey, c26453OooOoo0.driveObjectKey) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.deleted, c26453OooOoo0.deleted) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.extra, c26453OooOoo0.extra);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.metaVersion) * 31;
        String str = this.metaHash;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.mimeType;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        CloudContentTag cloudContentTag = this.contentTag;
        int iHashCode4 = (iHashCode3 + (cloudContentTag == null ? 0 : cloudContentTag.hashCode())) * 31;
        String str3 = this.driveObjectKey;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l = this.deleted;
        int iHashCode6 = (iHashCode5 + (l == null ? 0 : l.hashCode())) * 31;
        CloudMetaExtra cloudMetaExtra = this.extra;
        return iHashCode6 + (cloudMetaExtra != null ? cloudMetaExtra.hashCode() : 0);
    }

    public final String toString() {
        int i = this.metaVersion;
        String str = this.metaHash;
        String str2 = this.mimeType;
        CloudContentTag cloudContentTag = this.contentTag;
        String str3 = this.driveObjectKey;
        Long l = this.deleted;
        CloudMetaExtra cloudMetaExtra = this.extra;
        StringBuilder sbOooO0OO = C21009OooOooO.OooO0OO(i, "UpdateMetaRequest(metaVersion=", ", metaHash=", str, ", mimeType=");
        sbOooO0OO.append(str2);
        sbOooO0OO.append(", contentTag=");
        sbOooO0OO.append(cloudContentTag);
        sbOooO0OO.append(", driveObjectKey=");
        sbOooO0OO.append(str3);
        sbOooO0OO.append(", deleted=");
        sbOooO0OO.append(l);
        sbOooO0OO.append(", extra=");
        sbOooO0OO.append(cloudMetaExtra);
        sbOooO0OO.append(")");
        return sbOooO0OO.toString();
    }
}
