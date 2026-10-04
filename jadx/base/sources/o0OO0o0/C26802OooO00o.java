package o0OO0o0;

import OooOoo.C20593OooO0Oo;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;

/* JADX INFO: renamed from: o0OO0o0.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\n"}, m80612d2 = {"Lo0OO0o0/OooO00o;", "", "", "OooO00o", "Ljava/lang/String;", "getState", "()Ljava/lang/String;", "setState", "(Ljava/lang/String;)V", "state", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class C26802OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name and from kotlin metadata */
    @SerializedName("state")
    private String state = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C26802OooO00o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.state, ((C26802OooO00o) obj).state);
    }

    public final int hashCode() {
        String str = this.state;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return C20593OooO0Oo.OooO0O0("Deleted(state=", this.state, ")");
    }
}
