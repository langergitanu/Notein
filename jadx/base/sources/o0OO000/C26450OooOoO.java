package o0OO000;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;

/* JADX INFO: renamed from: o0OO000.OooOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u001a\u0010\f\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, m80612d2 = {"Lo0OO000/OooOoO;", "", "", "OooO00o", "J", "()J", "expiresAt", "", "OooO0O0", "I", "getLockVersion", "()I", "lockVersion", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class C26450OooOoO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name and from kotlin metadata */
    @SerializedName("expiresAt")
    private final long expiresAt;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name and from kotlin metadata */
    @SerializedName("lockVersion")
    private final int lockVersion;

    /* JADX INFO: renamed from: OooO00o, reason: from getter */
    public final long getExpiresAt() {
        return this.expiresAt;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26450OooOoO)) {
            return false;
        }
        C26450OooOoO c26450OooOoO = (C26450OooOoO) obj;
        return this.expiresAt == c26450OooOoO.expiresAt && this.lockVersion == c26450OooOoO.lockVersion;
    }

    public final int hashCode() {
        return Integer.hashCode(this.lockVersion) + (Long.hashCode(this.expiresAt) * 31);
    }

    public final String toString() {
        return "RenewLockResponse(expiresAt=" + this.expiresAt + ", lockVersion=" + this.lockVersion + ")";
    }
}
