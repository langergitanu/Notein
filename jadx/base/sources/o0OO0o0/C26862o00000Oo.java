package o0OO0o0;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;

/* JADX INFO: renamed from: o0OO0o0.o00000Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m80612d2 = {"Lo0OO0o0/o00000Oo;", "", "Lo0OO0o0/o00000OO;", "OooO00o", "Lo0OO0o0/o00000OO;", "getUser", "()Lo0OO0o0/o00000OO;", "user", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class C26862o00000Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name and from kotlin metadata */
    @SerializedName("user")
    private final o00000OO user;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C26862o00000Oo) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.user, ((C26862o00000Oo) obj).user);
    }

    public final int hashCode() {
        o00000OO o00000oo2 = this.user;
        if (o00000oo2 == null) {
            return 0;
        }
        return o00000oo2.hashCode();
    }

    public final String toString() {
        return "Owner(user=" + this.user + ")";
    }
}
