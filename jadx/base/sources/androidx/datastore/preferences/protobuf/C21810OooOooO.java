package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.OooOooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C21810OooOooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public volatile InterfaceC21822OoooO0 f64501OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public volatile OooO f64502OooO0O0;

    public final InterfaceC21822OoooO0 OooO00o(InterfaceC21822OoooO0 interfaceC21822OoooO0) {
        if (this.f64501OooO00o == null) {
            synchronized (this) {
                if (this.f64501OooO00o == null) {
                    try {
                        this.f64501OooO00o = interfaceC21822OoooO0;
                        this.f64502OooO0O0 = OooO.f64403OooOo;
                    } catch (C21807OooOoOO unused) {
                        this.f64501OooO00o = interfaceC21822OoooO0;
                        this.f64502OooO0O0 = OooO.f64403OooOo;
                    }
                }
            }
        }
        return this.f64501OooO00o;
    }

    public final OooO OooO0O0() {
        if (this.f64502OooO0O0 != null) {
            return this.f64502OooO0O0;
        }
        synchronized (this) {
            try {
                if (this.f64502OooO0O0 != null) {
                    return this.f64502OooO0O0;
                }
                if (this.f64501OooO00o == null) {
                    this.f64502OooO0O0 = OooO.f64403OooOo;
                } else {
                    this.f64502OooO0O0 = this.f64501OooO00o.toByteString();
                }
                return this.f64502OooO0O0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21810OooOooO)) {
            return false;
        }
        C21810OooOooO c21810OooOooO = (C21810OooOooO) obj;
        InterfaceC21822OoooO0 interfaceC21822OoooO0 = this.f64501OooO00o;
        InterfaceC21822OoooO0 interfaceC21822OoooO02 = c21810OooOooO.f64501OooO00o;
        return (interfaceC21822OoooO0 == null && interfaceC21822OoooO02 == null) ? OooO0O0().equals(c21810OooOooO.OooO0O0()) : (interfaceC21822OoooO0 == null || interfaceC21822OoooO02 == null) ? interfaceC21822OoooO0 != null ? interfaceC21822OoooO0.equals(c21810OooOooO.OooO00o(interfaceC21822OoooO0.OooO00o())) : OooO00o(interfaceC21822OoooO02.OooO00o()).equals(interfaceC21822OoooO02) : interfaceC21822OoooO0.equals(interfaceC21822OoooO02);
    }

    public int hashCode() {
        return 1;
    }
}
