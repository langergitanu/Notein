package androidx.fragment.app;

import android.os.Bundle;
import androidx.lifecycle.AbstractC21979OooOOo0;
import com.orion.notein.global.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.fragment.app.Oooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC21907Oooo {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public boolean f65005OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C21901OooOoO0 f65006OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ClassLoader f65007OooO0O0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f65009OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f65010OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f65011OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f65012OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f65013OooO0oo;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public String f65015OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public int f65016OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public int f65017OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public CharSequence f65018OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public CharSequence f65019OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public ArrayList<String> f65020OooOOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public ArrayList<String> f65022OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public ArrayList<Runnable> f65023OooOOoo;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final ArrayList<OooO00o> f65008OooO0OO = new ArrayList<>();

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public boolean f65014OooOO0 = true;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public boolean f65021OooOOo = false;

    /* JADX INFO: renamed from: androidx.fragment.app.Oooo$OooO00o */
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public AbstractC21979OooOOo0.OooO0O0 f65024OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int f65025OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public Fragment f65026OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public boolean f65027OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f65028OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f65029OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f65030OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public int f65031OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public AbstractC21979OooOOo0.OooO0O0 f65032OooO0oo;

        public OooO00o() {
        }

        public OooO00o(Fragment fragment, int i) {
            this.f65025OooO00o = i;
            this.f65026OooO0O0 = fragment;
            this.f65027OooO0OO = false;
            AbstractC21979OooOOo0.OooO0O0 oooO0O0 = AbstractC21979OooOOo0.OooO0O0.f65541OooOoOO;
            this.f65032OooO0oo = oooO0O0;
            this.f65024OooO = oooO0O0;
        }

        public OooO00o(Fragment fragment, int i, int i2) {
            this.f65025OooO00o = i;
            this.f65026OooO0O0 = fragment;
            this.f65027OooO0OO = true;
            AbstractC21979OooOOo0.OooO0O0 oooO0O0 = AbstractC21979OooOOo0.OooO0O0.f65541OooOoOO;
            this.f65032OooO0oo = oooO0O0;
            this.f65024OooO = oooO0O0;
        }
    }

    public AbstractC21907Oooo(C21901OooOoO0 c21901OooOoO0, ClassLoader classLoader) {
        this.f65006OooO00o = c21901OooOoO0;
        this.f65007OooO0O0 = classLoader;
    }

    public final void OooO0O0(Bundle bundle, Class cls) {
        C21901OooOoO0 c21901OooOoO0 = this.f65006OooO00o;
        if (c21901OooOoO0 == null) {
            throw new IllegalStateException("Creating a Fragment requires that this FragmentTransaction was built with FragmentManager.beginTransaction()");
        }
        ClassLoader classLoader = this.f65007OooO0O0;
        if (classLoader == null) {
            throw new IllegalStateException("The FragmentManager must be attached to itshost to create a Fragment");
        }
        Fragment fragmentOooO00o = c21901OooOoO0.OooO00o(classLoader, cls.getName());
        if (bundle != null) {
            fragmentOooO00o.setArguments(bundle);
        }
        OooO0Oo(R.id.fragment_container_view, fragmentOooO00o, null, 1);
    }

    public final void OooO0OO(OooO00o oooO00o) {
        this.f65008OooO0OO.add(oooO00o);
        oooO00o.f65028OooO0Oo = this.f65009OooO0Oo;
        oooO00o.f65030OooO0o0 = this.f65011OooO0o0;
        oooO00o.f65029OooO0o = this.f65010OooO0o;
        oooO00o.f65031OooO0oO = this.f65012OooO0oO;
    }

    public abstract void OooO0Oo(int i, Fragment fragment, String str, int i2);

    public final void OooO0o0(Fragment fragment, int i) {
        if (i == 0) {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
        OooO0Oo(i, fragment, null, 2);
    }
}
