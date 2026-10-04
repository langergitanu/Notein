package o0oOo0o;

import OooOoo0.o00000;
import androidx.appcompat.app.OooOOO;
import com.orion.notein.domain.models.User;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: renamed from: o0oOo0o.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30975OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final User f110672OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f110673OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final boolean f110674OooO0OO;

    public C30975OooO00o() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30975OooO00o)) {
            return false;
        }
        C30975OooO00o c30975OooO00o = (C30975OooO00o) obj;
        return OooOOO0.OooO0O0(this.f110672OooO00o, c30975OooO00o.f110672OooO00o) && this.f110673OooO0O0 == c30975OooO00o.f110673OooO0O0 && this.f110674OooO0OO == c30975OooO00o.f110674OooO0OO;
    }

    public final int hashCode() {
        User user = this.f110672OooO00o;
        return Boolean.hashCode(this.f110674OooO0OO) + o00000.OooO0O0((user == null ? 0 : user.hashCode()) * 31, 31, this.f110673OooO0O0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeleteAccountAgreementUiState(user=");
        sb.append(this.f110672OooO00o);
        sb.append(", isAgreeChecked=");
        sb.append(this.f110673OooO0O0);
        sb.append(", isLoading=");
        return OooOOO.OooO00o(sb, ")", this.f110674OooO0OO);
    }

    public /* synthetic */ C30975OooO00o(int i) {
        this(null, false, false);
    }

    public C30975OooO00o(User user, boolean z, boolean z2) {
        this.f110672OooO00o = user;
        this.f110673OooO0O0 = z;
        this.f110674OooO0OO = z2;
    }
}
