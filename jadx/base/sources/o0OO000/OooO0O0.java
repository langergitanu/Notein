package o0OO000;

import OooOoo0.C20703o000000o;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u000b\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\u0003\u0010\nR\u001a\u0010\u0011\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, m80612d2 = {"Lo0OO000/OooO0O0;", "", "", "OooO00o", "Ljava/lang/String;", "OooO0O0", "()Ljava/lang/String;", "lockToken", "", "J", "()J", "expiresAt", "", "OooO0OO", "I", "getLockVersion", "()I", "lockVersion", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name and from kotlin metadata */
    @SerializedName("lockToken")
    private final String lockToken;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name and from kotlin metadata */
    @SerializedName("expiresAt")
    private final long expiresAt;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name and from kotlin metadata */
    @SerializedName("lockVersion")
    private final int lockVersion;

    /* JADX INFO: renamed from: OooO00o, reason: from getter */
    public final long getExpiresAt() {
        return this.expiresAt;
    }

    /* JADX INFO: renamed from: OooO0O0, reason: from getter */
    public final String getLockToken() {
        return this.lockToken;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OooO0O0)) {
            return false;
        }
        OooO0O0 oooO0O0 = (OooO0O0) obj;
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.lockToken, oooO0O0.lockToken) && this.expiresAt == oooO0O0.expiresAt && this.lockVersion == oooO0O0.lockVersion;
    }

    public final int hashCode() {
        return Integer.hashCode(this.lockVersion) + C20703o000000o.OooO0O0(this.lockToken.hashCode() * 31, 31, this.expiresAt);
    }

    public final String toString() {
        return "AcquireLockResponse(lockToken=" + this.lockToken + ", expiresAt=" + this.expiresAt + ", lockVersion=" + this.lockVersion + ")";
    }
}
