package o0OO000;

import Oooo0oO.o0Oo0oo;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m80612d2 = {"Lo0OO000/OooOOO0;", "", "", "OooO00o", "I", "getExpectedMetaVersion", "()I", "expectedMetaVersion", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class OooOOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name and from kotlin metadata */
    @SerializedName("expectedMetaVersion")
    private final int expectedMetaVersion;

    public OooOOO0(int i) {
        this.expectedMetaVersion = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OooOOO0) && this.expectedMetaVersion == ((OooOOO0) obj).expectedMetaVersion;
    }

    public final int hashCode() {
        return Integer.hashCode(this.expectedMetaVersion);
    }

    public final String toString() {
        return o0Oo0oo.OooO0O0(this.expectedMetaVersion, "DeleteMetaRequest(expectedMetaVersion=", ")");
    }
}
