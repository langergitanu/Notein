package o00O00oO;

import Oooo0.C20843OoooO0;
import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.layout.WindowLayoutComponent;
import o0000o0O.C24276Oooo0o;
import o00O00o.C24809OooO0o0;

/* JADX INFO: renamed from: o00O00oO.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24819OooO0oO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ClassLoader f84171OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o00O00o.OooO0OO f84172OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o00O00o0.OooO0O0 f84173OooO0OO;

    public C24819OooO0oO(ClassLoader classLoader, o00O00o.OooO0OO oooO0OO) {
        this.f84171OooO00o = classLoader;
        this.f84172OooO0O0 = oooO0OO;
        this.f84173OooO0OO = new o00O00o0.OooO0O0(classLoader, 0);
    }

    public final WindowLayoutComponent OooO00o() {
        o00O00o0.OooO0O0 oooO0O0 = this.f84173OooO0OO;
        oooO0O0.getClass();
        boolean zOooO0O0 = false;
        try {
            new o00O00o0.OooO00o(oooO0O0).invoke();
            if (o00O0O0O.OooO00o.OooO0O0("WindowExtensionsProvider#getWindowExtensions is not valid", new o0000o0O.OooOOOO(oooO0O0, 1)) && o00O0O0O.OooO00o.OooO0O0("WindowExtensions#getWindowLayoutComponent is not valid", new C20843OoooO0(this, 1)) && o00O0O0O.OooO00o.OooO0O0("FoldingFeature class is not valid", new C24818OooO0o0(this))) {
                C24809OooO0o0.f84145OooO00o.getClass();
                int iOooO00o = C24809OooO0o0.OooO00o();
                if (iOooO00o == 1) {
                    zOooO0O0 = OooO0O0();
                } else if (2 <= iOooO00o && iOooO00o <= Integer.MAX_VALUE && OooO0O0()) {
                    if (o00O0O0O.OooO00o.OooO0O0("WindowLayoutComponent#addWindowLayoutInfoListener(" + Context.class.getName() + ", androidx.window.extensions.core.util.function.Consumer) is not valid", new C24276Oooo0o(this, 1))) {
                        zOooO0O0 = true;
                    }
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        if (!zOooO0O0) {
            return null;
        }
        try {
            return WindowExtensionsProvider.getWindowExtensions().getWindowLayoutComponent();
        } catch (UnsupportedOperationException unused2) {
            return null;
        }
    }

    public final boolean OooO0O0() {
        return o00O0O0O.OooO00o.OooO0O0("WindowLayoutComponent#addWindowLayoutInfoListener(" + Activity.class.getName() + ", java.util.function.Consumer) is not valid", new C24817OooO0o(this));
    }
}
