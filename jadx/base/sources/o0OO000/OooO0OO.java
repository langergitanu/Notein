package o0OO000;

import com.aspose.slides.C22212OooOoO0;
import com.google.gson.annotations.SerializedName;
import com.orion.notein.domain.models.note.NoteMeta;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, m80612d2 = {"Lo0OO000/OooO0OO;", "", "", "OooO00o", "Ljava/lang/String;", "getNoteId", "()Ljava/lang/String;", NoteMeta.PROPERTY_NOTE_ID, "", "OooO0O0", "I", "getExpectedMetaVersion", "()I", "expectedMetaVersion", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name and from kotlin metadata */
    @SerializedName(NoteMeta.PROPERTY_NOTE_ID)
    private final String noteId;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name and from kotlin metadata */
    @SerializedName("expectedMetaVersion")
    private final int expectedMetaVersion;

    public OooO0OO(String noteId, int i) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(noteId, "noteId");
        this.noteId = noteId;
        this.expectedMetaVersion = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OooO0OO)) {
            return false;
        }
        OooO0OO oooO0OO = (OooO0OO) obj;
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.noteId, oooO0OO.noteId) && this.expectedMetaVersion == oooO0OO.expectedMetaVersion;
    }

    public final int hashCode() {
        return Integer.hashCode(this.expectedMetaVersion) + (this.noteId.hashCode() * 31);
    }

    public final String toString() {
        return C22212OooOoO0.OooO0OO(this.expectedMetaVersion, "BatchDeleteMetaItem(noteId=", this.noteId, ", expectedMetaVersion=", ")");
    }
}
