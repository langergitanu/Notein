package o0OO000;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\r\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, m80612d2 = {"Lo0OO000/OooOO0O;", "", "", "OooO00o", "Ljava/lang/Integer;", "getExpectedMetaVersion", "()Ljava/lang/Integer;", "expectedMetaVersion", "", "OooO0O0", "Ljava/lang/String;", "getDriveObjectKey", "()Ljava/lang/String;", "driveObjectKey", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class OooOO0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name and from kotlin metadata */
    @SerializedName("expectedMetaVersion")
    private final Integer expectedMetaVersion;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name and from kotlin metadata */
    @SerializedName("driveObjectKey")
    private final String driveObjectKey;

    public OooOO0O() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OooOO0O)) {
            return false;
        }
        OooOO0O oooOO0O = (OooOO0O) obj;
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.expectedMetaVersion, oooOO0O.expectedMetaVersion) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.driveObjectKey, oooOO0O.driveObjectKey);
    }

    public final int hashCode() {
        Integer num = this.expectedMetaVersion;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.driveObjectKey;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "CommitPreuploadRequest(expectedMetaVersion=" + this.expectedMetaVersion + ", driveObjectKey=" + this.driveObjectKey + ")";
    }

    public OooOO0O(Integer num, String str) {
        this.expectedMetaVersion = num;
        this.driveObjectKey = str;
    }
}
