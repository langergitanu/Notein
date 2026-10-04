package o00ooOo0;

/* JADX INFO: renamed from: o00ooOo0.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25787OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static InterfaceC25788OooO0O0 f87961OooO00o;

    public static void OooO00o(InterfaceC25788OooO0O0 interfaceC25788OooO0O0) {
        boolean z;
        synchronized (C25787OooO00o.class) {
            z = f87961OooO00o != null;
        }
        if (z) {
            return;
        }
        synchronized (C25787OooO00o.class) {
            try {
                if (f87961OooO00o != null) {
                    throw new IllegalStateException("Cannot re-initialize NativeLoader.");
                }
                f87961OooO00o = interfaceC25788OooO0O0;
            } finally {
            }
        }
    }

    public static boolean OooO0O0(String str) {
        InterfaceC25788OooO0O0 interfaceC25788OooO0O0;
        synchronized (C25787OooO00o.class) {
            interfaceC25788OooO0O0 = f87961OooO00o;
            if (interfaceC25788OooO0O0 == null) {
                throw new IllegalStateException("NativeLoader has not been initialized.  To use standard native library loading, call NativeLoader.init(new SystemDelegate()).");
            }
        }
        return interfaceC25788OooO0O0.OooO00o(str);
    }
}
