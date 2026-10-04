package o0OO0o0;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u001a\u0010\f\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, m80612d2 = {"Lo0OO0o0/o00000;", "", "Lo0OO0o0/o00000O;", "OooO00o", "Lo0OO0o0/o00000O;", "()Lo0OO0o0/o00000O;", "hashes", "", "OooO0O0", "Ljava/lang/String;", "getMimeType", "()Ljava/lang/String;", "mimeType", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class o00000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name and from kotlin metadata */
    @SerializedName("hashes")
    private final o00000O hashes;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name and from kotlin metadata */
    @SerializedName("mimeType")
    private final String mimeType;

    /* JADX INFO: renamed from: OooO00o, reason: from getter */
    public final o00000O getHashes() {
        return this.hashes;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o00000)) {
            return false;
        }
        o00000 o00000Var = (o00000) obj;
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.hashes, o00000Var.hashes) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.mimeType, o00000Var.mimeType);
    }

    public final int hashCode() {
        return this.mimeType.hashCode() + (this.hashes.hashCode() * 31);
    }

    public final String toString() {
        return "OneDriveFile(hashes=" + this.hashes + ", mimeType=" + this.mimeType + ")";
    }
}
