package o0OO000;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006¨\u0006\u000b"}, m80612d2 = {"Lo0OO000/OooO00o;", "", "", "OooO00o", "Ljava/lang/String;", "getDriveId", "()Ljava/lang/String;", "driveId", "OooO0O0", "getLockToken", "lockToken", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name and from kotlin metadata */
    @SerializedName("driveId")
    private final String driveId;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name and from kotlin metadata */
    @SerializedName("lockToken")
    private final String lockToken;

    public OooO00o(String driveId, String str) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(driveId, "driveId");
        this.driveId = driveId;
        this.lockToken = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OooO00o)) {
            return false;
        }
        OooO00o oooO00o = (OooO00o) obj;
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.driveId, oooO00o.driveId) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.lockToken, oooO00o.lockToken);
    }

    public final int hashCode() {
        int iHashCode = this.driveId.hashCode() * 31;
        String str = this.lockToken;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return androidx.core.database.OooO00o.OooO00o("AcquireLockRequest(driveId=", this.driveId, ", lockToken=", this.lockToken, ")");
    }
}
