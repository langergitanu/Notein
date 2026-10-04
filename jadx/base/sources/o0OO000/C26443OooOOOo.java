package o0OO000;

import OooOo.C20485OooOoO;
import OooOooo.C20785Oooo00o;
import com.google.gson.annotations.SerializedName;
import com.orion.notein.domain.models.cloudsync.CloudContentTag;
import com.orion.notein.domain.models.cloudsync.CloudMetaExtra;
import com.orion.notein.domain.models.note.NoteMeta;
import kotlin.Metadata;

/* JADX INFO: renamed from: o0OO000.OooOOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006R\u001a\u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0004\u001a\u0004\b\u0012\u0010\u0006R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0004\u001a\u0004\b\u001b\u0010\u0006R\u001c\u0010\"\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001c\u0010(\u001a\u0004\u0018\u00010#8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006)"}, m80612d2 = {"Lo0OO000/OooOOOo;", "", "", "OooO00o", "Ljava/lang/String;", "getNoteId", "()Ljava/lang/String;", NoteMeta.PROPERTY_NOTE_ID, "", "OooO0O0", "I", "getMetaVersion", "()I", "metaVersion", "OooO0OO", "getMetaHash", "metaHash", "OooO0Oo", "getMimeType", "mimeType", "Lcom/orion/notein/domain/models/cloudsync/CloudContentTag;", "OooO0o0", "Lcom/orion/notein/domain/models/cloudsync/CloudContentTag;", "getContentTag", "()Lcom/orion/notein/domain/models/cloudsync/CloudContentTag;", "contentTag", "OooO0o", "getDriveObjectKey", "driveObjectKey", "", "OooO0oO", "Ljava/lang/Long;", "getDeleted", "()Ljava/lang/Long;", "deleted", "Lcom/orion/notein/domain/models/cloudsync/CloudMetaExtra;", "OooO0oo", "Lcom/orion/notein/domain/models/cloudsync/CloudMetaExtra;", "getExtra", "()Lcom/orion/notein/domain/models/cloudsync/CloudMetaExtra;", "extra", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class C26443OooOOOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name and from kotlin metadata */
    @SerializedName(NoteMeta.PROPERTY_NOTE_ID)
    private final String noteId;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name and from kotlin metadata */
    @SerializedName("metaVersion")
    private final int metaVersion;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name and from kotlin metadata */
    @SerializedName("metaHash")
    private final String metaHash;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name and from kotlin metadata */
    @SerializedName("mimeType")
    private final String mimeType;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name and from kotlin metadata */
    @SerializedName("driveObjectKey")
    private final String driveObjectKey;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name and from kotlin metadata */
    @SerializedName("contentTag")
    private final CloudContentTag contentTag;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name and from kotlin metadata */
    @SerializedName("deleted")
    private final Long deleted;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name and from kotlin metadata */
    @SerializedName("extra")
    private final CloudMetaExtra extra;

    public C26443OooOOOo(String noteId, int i, String str, String mimeType, CloudContentTag cloudContentTag, String str2, CloudMetaExtra cloudMetaExtra) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(noteId, "noteId");
        kotlin.jvm.internal.OooOOO0.OooO0oO(mimeType, "mimeType");
        this.noteId = noteId;
        this.metaVersion = i;
        this.metaHash = str;
        this.mimeType = mimeType;
        this.contentTag = cloudContentTag;
        this.driveObjectKey = str2;
        this.deleted = 0L;
        this.extra = cloudMetaExtra;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26443OooOOOo)) {
            return false;
        }
        C26443OooOOOo c26443OooOOOo = (C26443OooOOOo) obj;
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.noteId, c26443OooOOOo.noteId) && this.metaVersion == c26443OooOOOo.metaVersion && kotlin.jvm.internal.OooOOO0.OooO0O0(this.metaHash, c26443OooOOOo.metaHash) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.mimeType, c26443OooOOOo.mimeType) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.contentTag, c26443OooOOOo.contentTag) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.driveObjectKey, c26443OooOOOo.driveObjectKey) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.deleted, c26443OooOOOo.deleted) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.extra, c26443OooOOOo.extra);
    }

    public final int hashCode() {
        int iOooO00o = C20785Oooo00o.OooO00o(this.metaVersion, this.noteId.hashCode() * 31, 31);
        String str = this.metaHash;
        int iOooO0O0 = com.aspose.slides.internal.p497xc.OooO00o.OooO0O0((iOooO00o + (str == null ? 0 : str.hashCode())) * 31, 31, this.mimeType);
        CloudContentTag cloudContentTag = this.contentTag;
        int iHashCode = (iOooO0O0 + (cloudContentTag == null ? 0 : cloudContentTag.hashCode())) * 31;
        String str2 = this.driveObjectKey;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.deleted;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        CloudMetaExtra cloudMetaExtra = this.extra;
        return iHashCode3 + (cloudMetaExtra != null ? cloudMetaExtra.hashCode() : 0);
    }

    public final String toString() {
        String str = this.noteId;
        int i = this.metaVersion;
        String str2 = this.metaHash;
        String str3 = this.mimeType;
        CloudContentTag cloudContentTag = this.contentTag;
        String str4 = this.driveObjectKey;
        Long l = this.deleted;
        CloudMetaExtra cloudMetaExtra = this.extra;
        StringBuilder sbOooO0OO = C20485OooOoO.OooO0OO(i, "MigrateMetaItem(noteId=", str, ", metaVersion=", ", metaHash=");
        OooOO0.OooO0OO.OooO0o0(sbOooO0OO, str2, ", mimeType=", str3, ", contentTag=");
        sbOooO0OO.append(cloudContentTag);
        sbOooO0OO.append(", driveObjectKey=");
        sbOooO0OO.append(str4);
        sbOooO0OO.append(", deleted=");
        sbOooO0OO.append(l);
        sbOooO0OO.append(", extra=");
        sbOooO0OO.append(cloudMetaExtra);
        sbOooO0OO.append(")");
        return sbOooO0OO.toString();
    }
}
