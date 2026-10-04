package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.AbstractC21979OooOOo0;
import androidx.lifecycle.C22008OoooOo0;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import o000ooo0.InterfaceC24753OooO0o0;
import o000ooo0.OooO0OO;

/* JADX INFO: renamed from: androidx.lifecycle.OooOOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21977OooOOOo {

    /* JADX INFO: renamed from: androidx.lifecycle.OooOOOo$OooO00o */
    @Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Landroidx/lifecycle/OooOOOo$OooO00o;", "Lo000ooo0/OooO0OO$OooO00o;", "<init>", "()V", "lifecycle-viewmodel-savedstate_release"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
    public static final class OooO00o implements OooO0OO.OooO00o {
        @Override // o000ooo0.OooO0OO.OooO00o
        public final void OooO00o(InterfaceC24753OooO0o0 interfaceC24753OooO0o0) {
            if (!(interfaceC24753OooO0o0 instanceof InterfaceC22023o00ooo)) {
                throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
            }
            C22021o00o0O viewModelStore = ((InterfaceC22023o00ooo) interfaceC24753OooO0o0).getViewModelStore();
            o000ooo0.OooO0OO savedStateRegistry = interfaceC24753OooO0o0.getSavedStateRegistry();
            viewModelStore.getClass();
            LinkedHashMap linkedHashMap = viewModelStore.f65690OooO00o;
            for (String key : new HashSet(linkedHashMap.keySet())) {
                kotlin.jvm.internal.OooOOO0.OooO0oO(key, "key");
                AbstractC22019Ooooooo abstractC22019Ooooooo = (AbstractC22019Ooooooo) linkedHashMap.get(key);
                kotlin.jvm.internal.OooOOO0.OooO0Oo(abstractC22019Ooooooo);
                C21977OooOOOo.OooO00o(abstractC22019Ooooooo, savedStateRegistry, interfaceC24753OooO0o0.getLifecycle());
            }
            if (new HashSet(linkedHashMap.keySet()).isEmpty()) {
                return;
            }
            savedStateRegistry.OooO0Oo();
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.OooOOOo$OooO0O0 */
    public static final class OooO0O0 implements InterfaceC21986OooOoOO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ o000ooo0.OooO0OO f65531OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ AbstractC21979OooOOo0 f65532OooOo0o;

        public OooO0O0(AbstractC21979OooOOo0 abstractC21979OooOOo0, o000ooo0.OooO0OO oooO0OO) {
            this.f65532OooOo0o = abstractC21979OooOOo0;
            this.f65531OooOo = oooO0OO;
        }

        @Override // androidx.lifecycle.InterfaceC21986OooOoOO
        public final void OooOOo0(InterfaceC21987OooOoo interfaceC21987OooOoo, AbstractC21979OooOOo0.OooO00o oooO00o) {
            if (oooO00o == AbstractC21979OooOOo0.OooO00o.ON_START) {
                this.f65532OooOo0o.OooO0OO(this);
                this.f65531OooOo.OooO0Oo();
            }
        }
    }

    public static final void OooO00o(AbstractC22019Ooooooo abstractC22019Ooooooo, o000ooo0.OooO0OO registry, AbstractC21979OooOOo0 lifecycle) {
        Object obj;
        kotlin.jvm.internal.OooOOO0.OooO0oO(registry, "registry");
        kotlin.jvm.internal.OooOOO0.OooO0oO(lifecycle, "lifecycle");
        HashMap map = abstractC22019Ooooooo.f65677OooO00o;
        if (map == null) {
            obj = null;
        } else {
            synchronized (map) {
                obj = abstractC22019Ooooooo.f65677OooO00o.get("androidx.lifecycle.savedstate.vm.tag");
            }
        }
        C22010OoooOoo c22010OoooOoo = (C22010OoooOoo) obj;
        if (c22010OoooOoo == null || c22010OoooOoo.f65653OooOoO0) {
            return;
        }
        c22010OoooOoo.OooO00o(lifecycle, registry);
        OooO0OO(lifecycle, registry);
    }

    public static final C22010OoooOoo OooO0O0(o000ooo0.OooO0OO registry, AbstractC21979OooOOo0 lifecycle, String str, Bundle bundle) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(registry, "registry");
        kotlin.jvm.internal.OooOOO0.OooO0oO(lifecycle, "lifecycle");
        Bundle bundleOooO00o = registry.OooO00o(str);
        Class<? extends Object>[] clsArr = C22008OoooOo0.f65644OooO0o;
        C22010OoooOoo c22010OoooOoo = new C22010OoooOoo(str, C22008OoooOo0.OooO00o.OooO00o(bundleOooO00o, bundle));
        c22010OoooOoo.OooO00o(lifecycle, registry);
        OooO0OO(lifecycle, registry);
        return c22010OoooOoo;
    }

    public static void OooO0OO(AbstractC21979OooOOo0 abstractC21979OooOOo0, o000ooo0.OooO0OO oooO0OO) {
        AbstractC21979OooOOo0.OooO0O0 OooO0O02 = abstractC21979OooOOo0.OooO0O0();
        if (OooO0O02 == AbstractC21979OooOOo0.OooO0O0.f65537OooOo || OooO0O02.compareTo(AbstractC21979OooOOo0.OooO0O0.f65539OooOoO) >= 0) {
            oooO0OO.OooO0Oo();
        } else {
            abstractC21979OooOOo0.OooO00o(new OooO0O0(abstractC21979OooOOo0, oooO0OO));
        }
    }
}
