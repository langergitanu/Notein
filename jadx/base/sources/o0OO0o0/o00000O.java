package o0OO0o0;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\u0003\u0010\u0006¨\u0006\r"}, m80612d2 = {"Lo0OO0o0/o00000O;", "", "", "OooO00o", "Ljava/lang/String;", "getCrc32Hash", "()Ljava/lang/String;", "crc32Hash", "OooO0O0", "getSha1Hash", "sha1Hash", "OooO0OO", "quickXorHash", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class o00000O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name and from kotlin metadata */
    @SerializedName("crc32Hash")
    private final String crc32Hash;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name and from kotlin metadata */
    @SerializedName("sha1Hash")
    private final String sha1Hash;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name and from kotlin metadata */
    @SerializedName("quickXorHash")
    private final String quickXorHash;

    /* JADX INFO: renamed from: OooO00o, reason: from getter */
    public final String getQuickXorHash() {
        return this.quickXorHash;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o00000O)) {
            return false;
        }
        o00000O o00000o = (o00000O) obj;
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.crc32Hash, o00000o.crc32Hash) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.sha1Hash, o00000o.sha1Hash) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.quickXorHash, o00000o.quickXorHash);
    }

    public final int hashCode() {
        String str = this.crc32Hash;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.sha1Hash;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.quickXorHash;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        String str = this.crc32Hash;
        String str2 = this.sha1Hash;
        return androidx.concurrent.futures.OooO00o.OooO0OO(com.aspose.slides.internal.p332p7.OooO0o.OooO0O0("OneDriveHashes(crc32Hash=", str, ", sha1Hash=", str2, ", quickXorHash="), this.quickXorHash, ")");
    }
}
