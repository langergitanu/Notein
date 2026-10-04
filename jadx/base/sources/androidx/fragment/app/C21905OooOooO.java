package androidx.fragment.app;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: androidx.fragment.app.OooOooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21905OooOooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final FragmentManager f65000OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final CopyOnWriteArrayList<OooO00o> f65001OooO0O0 = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: androidx.fragment.app.OooOooO$OooO00o */
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final FragmentManager.AbstractC21880OooOO0o f65002OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final boolean f65003OooO0O0;

        public OooO00o(FragmentManager.AbstractC21880OooOO0o callback, boolean z) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(callback, "callback");
            this.f65002OooO00o = callback;
            this.f65003OooO0O0 = z;
        }
    }

    public C21905OooOooO(FragmentManager fragmentManager) {
        this.f65000OooO00o = fragmentManager;
    }

    public final void OooO(Fragment f, boolean z) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(f, "f");
        FragmentManager fragmentManager = this.f65000OooO00o;
        Fragment fragment = fragmentManager.f64821OooOoO;
        if (fragment != null) {
            FragmentManager parentFragmentManager = fragment.getParentFragmentManager();
            kotlin.jvm.internal.OooOOO0.OooO0o(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.f64812OooOOOo.OooO(f, true);
        }
        for (OooO00o oooO00o : this.f65001OooO0O0) {
            if (!z || oooO00o.f65003OooO0O0) {
                oooO00o.f65002OooO00o.OooO00o(fragmentManager, f);
            }
        }
    }

    public final void OooO00o(Fragment f, boolean z) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(f, "f");
        Fragment fragment = this.f65000OooO00o.f64821OooOoO;
        if (fragment != null) {
            FragmentManager parentFragmentManager = fragment.getParentFragmentManager();
            kotlin.jvm.internal.OooOOO0.OooO0o(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.f64812OooOOOo.OooO00o(f, true);
        }
        for (OooO00o oooO00o : this.f65001OooO0O0) {
            if (!z || oooO00o.f65003OooO0O0) {
                oooO00o.f65002OooO00o.getClass();
            }
        }
    }

    public final void OooO0O0(Fragment f, boolean z) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(f, "f");
        FragmentManager fragmentManager = this.f65000OooO00o;
        ActivityC21897OooOo0 activityC21897OooOo0 = fragmentManager.f64816OooOo.f64990OooOo;
        Fragment fragment = fragmentManager.f64821OooOoO;
        if (fragment != null) {
            FragmentManager parentFragmentManager = fragment.getParentFragmentManager();
            kotlin.jvm.internal.OooOOO0.OooO0o(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.f64812OooOOOo.OooO0O0(f, true);
        }
        for (OooO00o oooO00o : this.f65001OooO0O0) {
            if (!z || oooO00o.f65003OooO0O0) {
                oooO00o.f65002OooO00o.getClass();
            }
        }
    }

    public final void OooO0OO(Fragment f, boolean z) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(f, "f");
        Fragment fragment = this.f65000OooO00o.f64821OooOoO;
        if (fragment != null) {
            FragmentManager parentFragmentManager = fragment.getParentFragmentManager();
            kotlin.jvm.internal.OooOOO0.OooO0o(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.f64812OooOOOo.OooO0OO(f, true);
        }
        for (OooO00o oooO00o : this.f65001OooO0O0) {
            if (!z || oooO00o.f65003OooO0O0) {
                oooO00o.f65002OooO00o.getClass();
            }
        }
    }

    public final void OooO0Oo(Fragment f, boolean z) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(f, "f");
        Fragment fragment = this.f65000OooO00o.f64821OooOoO;
        if (fragment != null) {
            FragmentManager parentFragmentManager = fragment.getParentFragmentManager();
            kotlin.jvm.internal.OooOOO0.OooO0o(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.f64812OooOOOo.OooO0Oo(f, true);
        }
        for (OooO00o oooO00o : this.f65001OooO0O0) {
            if (!z || oooO00o.f65003OooO0O0) {
                oooO00o.f65002OooO00o.getClass();
            }
        }
    }

    public final void OooO0o(Fragment f, boolean z) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(f, "f");
        Fragment fragment = this.f65000OooO00o.f64821OooOoO;
        if (fragment != null) {
            FragmentManager parentFragmentManager = fragment.getParentFragmentManager();
            kotlin.jvm.internal.OooOOO0.OooO0o(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.f64812OooOOOo.OooO0o(f, true);
        }
        for (OooO00o oooO00o : this.f65001OooO0O0) {
            if (!z || oooO00o.f65003OooO0O0) {
                oooO00o.f65002OooO00o.getClass();
            }
        }
    }

    public final void OooO0o0(Fragment f, boolean z) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(f, "f");
        Fragment fragment = this.f65000OooO00o.f64821OooOoO;
        if (fragment != null) {
            FragmentManager parentFragmentManager = fragment.getParentFragmentManager();
            kotlin.jvm.internal.OooOOO0.OooO0o(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.f64812OooOOOo.OooO0o0(f, true);
        }
        for (OooO00o oooO00o : this.f65001OooO0O0) {
            if (!z || oooO00o.f65003OooO0O0) {
                oooO00o.f65002OooO00o.getClass();
            }
        }
    }

    public final void OooO0oO(Fragment f, boolean z) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(f, "f");
        FragmentManager fragmentManager = this.f65000OooO00o;
        ActivityC21897OooOo0 activityC21897OooOo0 = fragmentManager.f64816OooOo.f64990OooOo;
        Fragment fragment = fragmentManager.f64821OooOoO;
        if (fragment != null) {
            FragmentManager parentFragmentManager = fragment.getParentFragmentManager();
            kotlin.jvm.internal.OooOOO0.OooO0o(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.f64812OooOOOo.OooO0oO(f, true);
        }
        for (OooO00o oooO00o : this.f65001OooO0O0) {
            if (!z || oooO00o.f65003OooO0O0) {
                oooO00o.f65002OooO00o.getClass();
            }
        }
    }

    public final void OooO0oo(Fragment f, boolean z) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(f, "f");
        Fragment fragment = this.f65000OooO00o.f64821OooOoO;
        if (fragment != null) {
            FragmentManager parentFragmentManager = fragment.getParentFragmentManager();
            kotlin.jvm.internal.OooOOO0.OooO0o(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.f64812OooOOOo.OooO0oo(f, true);
        }
        for (OooO00o oooO00o : this.f65001OooO0O0) {
            if (!z || oooO00o.f65003OooO0O0) {
                oooO00o.f65002OooO00o.getClass();
            }
        }
    }

    public final void OooOO0(Fragment f, Bundle bundle, boolean z) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(f, "f");
        Fragment fragment = this.f65000OooO00o.f64821OooOoO;
        if (fragment != null) {
            FragmentManager parentFragmentManager = fragment.getParentFragmentManager();
            kotlin.jvm.internal.OooOOO0.OooO0o(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.f64812OooOOOo.OooOO0(f, bundle, true);
        }
        for (OooO00o oooO00o : this.f65001OooO0O0) {
            if (!z || oooO00o.f65003OooO0O0) {
                oooO00o.f65002OooO00o.getClass();
            }
        }
    }

    public final void OooOO0O(Fragment f, boolean z) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(f, "f");
        Fragment fragment = this.f65000OooO00o.f64821OooOoO;
        if (fragment != null) {
            FragmentManager parentFragmentManager = fragment.getParentFragmentManager();
            kotlin.jvm.internal.OooOOO0.OooO0o(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.f64812OooOOOo.OooOO0O(f, true);
        }
        for (OooO00o oooO00o : this.f65001OooO0O0) {
            if (!z || oooO00o.f65003OooO0O0) {
                oooO00o.f65002OooO00o.getClass();
            }
        }
    }

    public final void OooOO0o(Fragment f, boolean z) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(f, "f");
        Fragment fragment = this.f65000OooO00o.f64821OooOoO;
        if (fragment != null) {
            FragmentManager parentFragmentManager = fragment.getParentFragmentManager();
            kotlin.jvm.internal.OooOOO0.OooO0o(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.f64812OooOOOo.OooOO0o(f, true);
        }
        for (OooO00o oooO00o : this.f65001OooO0O0) {
            if (!z || oooO00o.f65003OooO0O0) {
                oooO00o.f65002OooO00o.getClass();
            }
        }
    }

    public final void OooOOO(Fragment f, boolean z) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(f, "f");
        Fragment fragment = this.f65000OooO00o.f64821OooOoO;
        if (fragment != null) {
            FragmentManager parentFragmentManager = fragment.getParentFragmentManager();
            kotlin.jvm.internal.OooOOO0.OooO0o(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.f64812OooOOOo.OooOOO(f, true);
        }
        for (OooO00o oooO00o : this.f65001OooO0O0) {
            if (!z || oooO00o.f65003OooO0O0) {
                oooO00o.f65002OooO00o.getClass();
            }
        }
    }

    public final void OooOOO0(Fragment f, View v, Bundle bundle, boolean z) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(f, "f");
        kotlin.jvm.internal.OooOOO0.OooO0oO(v, "v");
        FragmentManager fragmentManager = this.f65000OooO00o;
        Fragment fragment = fragmentManager.f64821OooOoO;
        if (fragment != null) {
            FragmentManager parentFragmentManager = fragment.getParentFragmentManager();
            kotlin.jvm.internal.OooOOO0.OooO0o(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.f64812OooOOOo.OooOOO0(f, v, bundle, true);
        }
        for (OooO00o oooO00o : this.f65001OooO0O0) {
            if (!z || oooO00o.f65003OooO0O0) {
                oooO00o.f65002OooO00o.OooO0O0(fragmentManager, f, v);
            }
        }
    }
}
