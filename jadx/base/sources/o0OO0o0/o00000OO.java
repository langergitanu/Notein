package o0OO0o0;

import com.google.gson.annotations.SerializedName;
import com.huawei.hms.support.feature.result.CommonConstant;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006¨\u0006\u000b"}, m80612d2 = {"Lo0OO0o0/o00000OO;", "", "", "OooO00o", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "id", "OooO0O0", "getDisplayName", CommonConstant.KEY_DISPLAY_NAME, "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class o00000OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name and from kotlin metadata */
    @SerializedName("id")
    private final String id;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name and from kotlin metadata */
    @SerializedName(CommonConstant.KEY_DISPLAY_NAME)
    private final String displayName;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o00000OO)) {
            return false;
        }
        o00000OO o00000oo2 = (o00000OO) obj;
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.id, o00000oo2.id) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.displayName, o00000oo2.displayName);
    }

    public final int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.displayName;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return androidx.core.database.OooO00o.OooO00o("OneDriveUser(id=", this.id, ", displayName=", this.displayName, ")");
    }
}
