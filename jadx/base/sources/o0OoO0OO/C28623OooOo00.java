package o0OoO0OO;

/* JADX INFO: renamed from: o0OoO0OO.OooOo00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C28623OooOo00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final boolean f101452OooO00o;

    public C28623OooOo00() {
        this(false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C28623OooOo00) && this.f101452OooO00o == ((C28623OooOo00) obj).f101452OooO00o;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f101452OooO00o);
    }

    public final String toString() {
        return androidx.appcompat.app.OooOOO.OooO00o(new StringBuilder("PhoneBindingSkipUiState(isSkipInFlight="), ")", this.f101452OooO00o);
    }

    public C28623OooOo00(boolean z) {
        this.f101452OooO00o = z;
    }
}
