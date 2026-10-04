package o00O00o;

import androidx.window.extensions.WindowExtensionsProvider;
import kotlin.jvm.internal.C24035Oooo00o;

/* JADX INFO: renamed from: o00O00o.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24809OooO0o0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final C24809OooO0o0 f84145OooO00o = new C24809OooO0o0();

    static {
        C24035Oooo00o.f80943OooO00o.OooO0O0(C24809OooO0o0.class).OooOO0();
    }

    public static int OooO00o() {
        try {
            return WindowExtensionsProvider.getWindowExtensions().getVendorApiLevel();
        } catch (NoClassDefFoundError | UnsupportedOperationException unused) {
            return 0;
        }
    }
}
