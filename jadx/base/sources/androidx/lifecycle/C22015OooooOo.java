package androidx.lifecycle;

import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.o00Oo0;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;
import o000o00.C24556OooO0O0;
import o000ooo0.InterfaceC24753OooO0o0;

/* JADX INFO: renamed from: androidx.lifecycle.OooooOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C22015OooooOo extends o00Oo0.C22020OooO0Oo implements o00Oo0.OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Application f65663OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o00Oo0.OooO00o f65664OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Bundle f65665OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final AbstractC21979OooOOo0 f65666OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o000ooo0.OooO0OO f65667OooO0o0;

    public C22015OooooOo() {
        this.f65664OooO0O0 = new o00Oo0.OooO00o(null);
    }

    @Override // androidx.lifecycle.o00Oo0.OooO0O0
    public final <T extends AbstractC22019Ooooooo> T OooO00o(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return (T) OooO0Oo(cls, canonicalName);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.o00Oo0.OooO0O0
    public final AbstractC22019Ooooooo OooO0O0(Class cls, C24556OooO0O0 c24556OooO0O0) {
        o00Ooo o00ooo2 = o00Ooo.f65689OooO00o;
        LinkedHashMap linkedHashMap = c24556OooO0O0.f83135OooO00o;
        String str = (String) linkedHashMap.get(o00ooo2);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (linkedHashMap.get(C22011Ooooo00.f65654OooO00o) == null || linkedHashMap.get(C22011Ooooo00.f65655OooO0O0) == null) {
            if (this.f65666OooO0Oo != null) {
                return OooO0Oo(cls, str);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        Application application = (Application) linkedHashMap.get(o00O0O.f65682OooO00o);
        boolean zIsAssignableFrom = OooO0O0.class.isAssignableFrom(cls);
        Constructor constructorOooO00o = (!zIsAssignableFrom || application == null) ? C22017Oooooo0.OooO00o(C22017Oooooo0.f65675OooO0O0, cls) : C22017Oooooo0.OooO00o(C22017Oooooo0.f65674OooO00o, cls);
        return constructorOooO00o == null ? this.f65664OooO0O0.OooO0O0(cls, c24556OooO0O0) : (!zIsAssignableFrom || application == null) ? C22017Oooooo0.OooO0O0(cls, constructorOooO00o, C22011Ooooo00.OooO00o(c24556OooO0O0)) : C22017Oooooo0.OooO0O0(cls, constructorOooO00o, application, C22011Ooooo00.OooO00o(c24556OooO0O0));
    }

    @Override // androidx.lifecycle.o00Oo0.C22020OooO0Oo
    public final void OooO0OO(AbstractC22019Ooooooo abstractC22019Ooooooo) {
        AbstractC21979OooOOo0 abstractC21979OooOOo0 = this.f65666OooO0Oo;
        if (abstractC21979OooOOo0 != null) {
            o000ooo0.OooO0OO oooO0OO = this.f65667OooO0o0;
            kotlin.jvm.internal.OooOOO0.OooO0Oo(oooO0OO);
            C21977OooOOOo.OooO00o(abstractC22019Ooooooo, oooO0OO, abstractC21979OooOOo0);
        }
    }

    public final AbstractC22019Ooooooo OooO0Oo(Class cls, String str) {
        AbstractC21979OooOOo0 abstractC21979OooOOo0 = this.f65666OooO0Oo;
        if (abstractC21979OooOOo0 == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean zIsAssignableFrom = OooO0O0.class.isAssignableFrom(cls);
        Application application = this.f65663OooO00o;
        Constructor constructorOooO00o = (!zIsAssignableFrom || application == null) ? C22017Oooooo0.OooO00o(C22017Oooooo0.f65675OooO0O0, cls) : C22017Oooooo0.OooO00o(C22017Oooooo0.f65674OooO00o, cls);
        if (constructorOooO00o == null) {
            if (application != null) {
                return this.f65664OooO0O0.OooO00o(cls);
            }
            if (o00Oo0.OooO0OO.f65688OooO00o == null) {
                o00Oo0.OooO0OO.f65688OooO00o = new o00Oo0.OooO0OO();
            }
            o00Oo0.OooO0OO oooO0OO = o00Oo0.OooO0OO.f65688OooO00o;
            kotlin.jvm.internal.OooOOO0.OooO0Oo(oooO0OO);
            return oooO0OO.OooO00o(cls);
        }
        o000ooo0.OooO0OO oooO0OO2 = this.f65667OooO0o0;
        kotlin.jvm.internal.OooOOO0.OooO0Oo(oooO0OO2);
        C22010OoooOoo c22010OoooOooOooO0O0 = C21977OooOOOo.OooO0O0(oooO0OO2, abstractC21979OooOOo0, str, this.f65665OooO0OO);
        C22008OoooOo0 c22008OoooOo0 = c22010OoooOooOooO0O0.f65651OooOo;
        AbstractC22019Ooooooo abstractC22019OooooooOooO0O0 = (!zIsAssignableFrom || application == null) ? C22017Oooooo0.OooO0O0(cls, constructorOooO00o, c22008OoooOo0) : C22017Oooooo0.OooO0O0(cls, constructorOooO00o, application, c22008OoooOo0);
        abstractC22019OooooooOooO0O0.OooO0Oo(c22010OoooOooOooO0O0, "androidx.lifecycle.savedstate.vm.tag");
        return abstractC22019OooooooOooO0O0;
    }

    public C22015OooooOo(Application application, InterfaceC24753OooO0o0 owner, Bundle bundle) {
        o00Oo0.OooO00o oooO00o;
        kotlin.jvm.internal.OooOOO0.OooO0oO(owner, "owner");
        this.f65667OooO0o0 = owner.getSavedStateRegistry();
        this.f65666OooO0Oo = owner.getLifecycle();
        this.f65665OooO0OO = bundle;
        this.f65663OooO00o = application;
        if (application != null) {
            if (o00Oo0.OooO00o.f65686OooO0OO == null) {
                o00Oo0.OooO00o.f65686OooO0OO = new o00Oo0.OooO00o(application);
            }
            oooO00o = o00Oo0.OooO00o.f65686OooO0OO;
            kotlin.jvm.internal.OooOOO0.OooO0Oo(oooO00o);
        } else {
            oooO00o = new o00Oo0.OooO00o(null);
        }
        this.f65664OooO0O0 = oooO00o;
    }
}
