package o0OO0o0;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: renamed from: o0OO0o0.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001R\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0004\u0010\u0006¨\u0006\b"}, m80612d2 = {"Lo0OO0o0/OooO0o;", "", "", "Lo0OO0o0/OooO0o0;", "OooO00o", "Ljava/util/List;", "()Ljava/util/List;", "value", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class C26806OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name and from kotlin metadata */
    @SerializedName("value")
    private final List<C26807OooO0o0> value;

    public final List<C26807OooO0o0> OooO00o() {
        return this.value;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C26806OooO0o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.value, ((C26806OooO0o) obj).value);
    }

    public final int hashCode() {
        List<C26807OooO0o0> list = this.value;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return "DriveItemVersionResponse(value=" + this.value + ")";
    }
}
