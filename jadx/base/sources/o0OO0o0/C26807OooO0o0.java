package o0OO0o0;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;

/* JADX INFO: renamed from: o0OO0o0.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\u0007\u0010\u0005R\u001a\u0010\r\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f¨\u0006\u000e"}, m80612d2 = {"Lo0OO0o0/OooO0o0;", "", "", "OooO00o", "Ljava/lang/String;", "()Ljava/lang/String;", "id", "OooO0O0", "lastModifiedDateTime", "", "OooO0OO", "J", "()J", "size", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class C26807OooO0o0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name and from kotlin metadata */
    @SerializedName("id")
    private final String id;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name and from kotlin metadata */
    @SerializedName("lastModifiedDateTime")
    private final String lastModifiedDateTime;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name and from kotlin metadata */
    @SerializedName("size")
    private final long size;

    /* JADX INFO: renamed from: OooO00o, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: OooO0O0, reason: from getter */
    public final String getLastModifiedDateTime() {
        return this.lastModifiedDateTime;
    }

    /* JADX INFO: renamed from: OooO0OO, reason: from getter */
    public final long getSize() {
        return this.size;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26807OooO0o0)) {
            return false;
        }
        C26807OooO0o0 c26807OooO0o0 = (C26807OooO0o0) obj;
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.id, c26807OooO0o0.id) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.lastModifiedDateTime, c26807OooO0o0.lastModifiedDateTime) && this.size == c26807OooO0o0.size;
    }

    public final int hashCode() {
        return Long.hashCode(this.size) + com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(this.id.hashCode() * 31, 31, this.lastModifiedDateTime);
    }

    public final String toString() {
        return android.support.v4.media.session.OooO00o.OooO00o(this.size, ")", com.aspose.slides.internal.p332p7.OooO0o.OooO0O0("DriveItemVersion(id=", this.id, ", lastModifiedDateTime=", this.lastModifiedDateTime, ", size="));
    }
}
