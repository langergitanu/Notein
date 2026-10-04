package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.lifecycle.AbstractC21979OooOOo0;
import androidx.lifecycle.C21990OooOooo;
import androidx.lifecycle.C22011Ooooo00;
import androidx.lifecycle.C22015OooooOo;
import androidx.lifecycle.C22021o00o0O;
import androidx.lifecycle.InterfaceC22023o00ooo;
import androidx.lifecycle.o00O0O;
import androidx.lifecycle.o00Oo0;
import java.util.LinkedHashMap;
import o000o00.AbstractC24555OooO00o;
import o000o00.C24556OooO0O0;
import o000ooo0.C24752OooO0Oo;
import o000ooo0.InterfaceC24753OooO0o0;

/* JADX INFO: loaded from: classes.dex */
public final class o000oOoO implements androidx.lifecycle.OooOOOO, InterfaceC24753OooO0o0, InterfaceC22023o00ooo {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final C22021o00o0O f65108OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final Fragment f65109OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public o00Oo0.OooO0O0 f65110OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final OooOOOO f65111OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public C21990OooOooo f65112OooOoOO = null;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public C24752OooO0Oo f65113OooOoo0 = null;

    public o000oOoO(Fragment fragment, C22021o00o0O c22021o00o0O, OooOOOO oooOOOO) {
        this.f65109OooOo0o = fragment;
        this.f65108OooOo = c22021o00o0O;
        this.f65111OooOoO0 = oooOOOO;
    }

    public final void OooO00o(AbstractC21979OooOOo0.OooO00o oooO00o) {
        this.f65112OooOoOO.OooO0o(oooO00o);
    }

    public final void OooO0O0() {
        if (this.f65112OooOoOO == null) {
            this.f65112OooOoOO = new C21990OooOooo(this);
            C24752OooO0Oo c24752OooO0Oo = new C24752OooO0Oo(this);
            this.f65113OooOoo0 = c24752OooO0Oo;
            c24752OooO0Oo.OooO00o();
            this.f65111OooOoO0.run();
        }
    }

    @Override // androidx.lifecycle.OooOOOO
    public final AbstractC24555OooO00o getDefaultViewModelCreationExtras() {
        Application application;
        Fragment fragment = this.f65109OooOo0o;
        Context applicationContext = fragment.requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        C24556OooO0O0 c24556OooO0O0 = new C24556OooO0O0(0);
        LinkedHashMap linkedHashMap = c24556OooO0O0.f83135OooO00o;
        if (application != null) {
            linkedHashMap.put(o00O0O.f65682OooO00o, application);
        }
        linkedHashMap.put(C22011Ooooo00.f65654OooO00o, fragment);
        linkedHashMap.put(C22011Ooooo00.f65655OooO0O0, this);
        if (fragment.getArguments() != null) {
            linkedHashMap.put(C22011Ooooo00.f65656OooO0OO, fragment.getArguments());
        }
        return c24556OooO0O0;
    }

    @Override // androidx.lifecycle.OooOOOO
    public final o00Oo0.OooO0O0 getDefaultViewModelProviderFactory() {
        Application application;
        Fragment fragment = this.f65109OooOo0o;
        o00Oo0.OooO0O0 defaultViewModelProviderFactory = fragment.getDefaultViewModelProviderFactory();
        if (!defaultViewModelProviderFactory.equals(fragment.mDefaultFactory)) {
            this.f65110OooOoO = defaultViewModelProviderFactory;
            return defaultViewModelProviderFactory;
        }
        if (this.f65110OooOoO == null) {
            Context applicationContext = fragment.requireContext().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            this.f65110OooOoO = new C22015OooooOo(application, fragment, fragment.getArguments());
        }
        return this.f65110OooOoO;
    }

    @Override // androidx.lifecycle.InterfaceC21987OooOoo
    public final AbstractC21979OooOOo0 getLifecycle() {
        OooO0O0();
        return this.f65112OooOoOO;
    }

    @Override // o000ooo0.InterfaceC24753OooO0o0
    public final o000ooo0.OooO0OO getSavedStateRegistry() {
        OooO0O0();
        return this.f65113OooOoo0.f83957OooO0O0;
    }

    @Override // androidx.lifecycle.InterfaceC22023o00ooo
    public final C22021o00o0O getViewModelStore() {
        OooO0O0();
        return this.f65108OooOo;
    }
}
