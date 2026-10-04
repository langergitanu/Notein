package o00o0O0;

import androidx.fragment.app.C21929Ooooo0o;

/* JADX INFO: renamed from: o00o0O0.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25312OooO0o implements InterfaceC25314OooO0oO<Object> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public volatile Object f86149OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ InterfaceC25314OooO0oO f86150OooO0O0;

    public C25312OooO0o(InterfaceC25314OooO0oO interfaceC25314OooO0oO) {
        this.f86150OooO0O0 = interfaceC25314OooO0oO;
    }

    @Override // o00o0O0.InterfaceC25314OooO0oO
    public final Object get() {
        if (this.f86149OooO00o == null) {
            synchronized (this) {
                try {
                    if (this.f86149OooO00o == null) {
                        Object obj = this.f86150OooO0O0.get();
                        C21929Ooooo0o.OooO0OO(obj, "Argument must not be null");
                        this.f86149OooO00o = obj;
                    }
                } finally {
                }
            }
        }
        return this.f86149OooO00o;
    }
}
