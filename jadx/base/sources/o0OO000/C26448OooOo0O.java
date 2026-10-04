package o0OO000;

import Oooo0oO.C21023OooO0Oo;
import com.google.gson.annotations.SerializedName;
import com.orion.notein.domain.models.cloudsync.CloudContentTag;
import com.orion.notein.domain.models.note.NoteMeta;
import kotlin.Metadata;

/* JADX INFO: renamed from: o0OO000.OooOo0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001a\u0010\u0010\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0004\u001a\u0004\b\u0012\u0010\u0006R\u001a\u0010\u0019\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, m80612d2 = {"Lo0OO000/OooOo0O;", "", "", "OooO00o", "Ljava/lang/String;", "getNoteId", "()Ljava/lang/String;", NoteMeta.PROPERTY_NOTE_ID, "OooO0O0", "getDriveId", "driveId", "Lcom/orion/notein/domain/models/cloudsync/CloudContentTag;", "OooO0OO", "Lcom/orion/notein/domain/models/cloudsync/CloudContentTag;", "getContentTag", "()Lcom/orion/notein/domain/models/cloudsync/CloudContentTag;", "contentTag", "OooO0Oo", "getDriveObjectKey", "driveObjectKey", "", "OooO0o0", "I", "getExpectedMetaVersion", "()I", "expectedMetaVersion", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class C26448OooOo0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name and from kotlin metadata */
    @SerializedName(NoteMeta.PROPERTY_NOTE_ID)
    private final String noteId;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name and from kotlin metadata */
    @SerializedName("driveId")
    private final String driveId;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name and from kotlin metadata */
    @SerializedName("contentTag")
    private final CloudContentTag contentTag;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name and from kotlin metadata */
    @SerializedName("driveObjectKey")
    private final String driveObjectKey;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name and from kotlin metadata */
    @SerializedName("expectedMetaVersion")
    private final int expectedMetaVersion;

    public C26448OooOo0O(String noteId, String driveId, CloudContentTag contentTag, String driveObjectKey, int i) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(noteId, "noteId");
        kotlin.jvm.internal.OooOOO0.OooO0oO(driveId, "driveId");
        kotlin.jvm.internal.OooOOO0.OooO0oO(contentTag, "contentTag");
        kotlin.jvm.internal.OooOOO0.OooO0oO(driveObjectKey, "driveObjectKey");
        this.noteId = noteId;
        this.driveId = driveId;
        this.contentTag = contentTag;
        this.driveObjectKey = driveObjectKey;
        this.expectedMetaVersion = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26448OooOo0O)) {
            return false;
        }
        C26448OooOo0O c26448OooOo0O = (C26448OooOo0O) obj;
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.noteId, c26448OooOo0O.noteId) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.driveId, c26448OooOo0O.driveId) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.contentTag, c26448OooOo0O.contentTag) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.driveObjectKey, c26448OooOo0O.driveObjectKey) && this.expectedMetaVersion == c26448OooOo0O.expectedMetaVersion;
    }

    public final int hashCode() {
        return Integer.hashCode(this.expectedMetaVersion) + com.aspose.slides.internal.p497xc.OooO00o.OooO0O0((this.contentTag.hashCode() + com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(this.noteId.hashCode() * 31, 31, this.driveId)) * 31, 31, this.driveObjectKey);
    }

    public final String toString() {
        String str = this.noteId;
        String str2 = this.driveId;
        CloudContentTag cloudContentTag = this.contentTag;
        String str3 = this.driveObjectKey;
        int i = this.expectedMetaVersion;
        StringBuilder sbOooO0O0 = com.aspose.slides.internal.p332p7.OooO0o.OooO0O0("ReconcileContentRequest(noteId=", str, ", driveId=", str2, ", contentTag=");
        sbOooO0O0.append(cloudContentTag);
        sbOooO0O0.append(", driveObjectKey=");
        sbOooO0O0.append(str3);
        sbOooO0O0.append(", expectedMetaVersion=");
        return C21023OooO0Oo.OooO0OO(")", i, sbOooO0O0);
    }
}
