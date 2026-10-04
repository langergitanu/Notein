package o00oO0O;

import Ooooo0o.InterfaceC21266OooOOO0;

/* JADX INFO: renamed from: o00oO0O.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C25487OooO0o implements InterfaceC21266OooOOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final C25487OooO0o f86873OooO00o = new C25487OooO0o();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static Boolean f86874OooO0O0;

    @Override // Ooooo0o.InterfaceC21266OooOOO0
    public final void OooO00o(boolean z) {
        f86874OooO0O0 = Boolean.valueOf(z);
    }

    @Override // Ooooo0o.InterfaceC21266OooOOO0
    public final boolean OooO0O0() {
        Boolean bool = f86874OooO0O0;
        if (bool != null) {
            return bool.booleanValue();
        }
        throw new IllegalStateException("Required value was null.");
    }
}
