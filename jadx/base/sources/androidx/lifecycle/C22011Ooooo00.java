package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.AbstractC21979OooOOo0;
import androidx.lifecycle.C22008OoooOo0;
import java.util.LinkedHashMap;
import o000o00.C24556OooO0O0;
import o000ooo0.InterfaceC24753OooO0o0;
import o000ooo0.OooO0OO;

/* JADX INFO: renamed from: androidx.lifecycle.Ooooo00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C22011Ooooo00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final OooO0O0 f65654OooO00o = new OooO0O0();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final OooO0OO f65655OooO0O0 = new OooO0OO();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final OooO00o f65656OooO0OO = new OooO00o();

    /* JADX INFO: renamed from: androidx.lifecycle.Ooooo00$OooO00o */
    public static final class OooO00o {
    }

    /* JADX INFO: renamed from: androidx.lifecycle.Ooooo00$OooO0O0 */
    public static final class OooO0O0 {
    }

    /* JADX INFO: renamed from: androidx.lifecycle.Ooooo00$OooO0OO */
    public static final class OooO0OO {
    }

    public static final C22008OoooOo0 OooO00o(C24556OooO0O0 c24556OooO0O0) {
        OooO0O0 oooO0O0 = f65654OooO00o;
        LinkedHashMap linkedHashMap = c24556OooO0O0.f83135OooO00o;
        InterfaceC24753OooO0o0 interfaceC24753OooO0o0 = (InterfaceC24753OooO0o0) linkedHashMap.get(oooO0O0);
        if (interfaceC24753OooO0o0 == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) linkedHashMap.get(f65655OooO0O0);
        if (interfaceC22023o00ooo == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) linkedHashMap.get(f65656OooO0OO);
        String str = (String) linkedHashMap.get(o00Ooo.f65689OooO00o);
        if (str == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
        }
        OooO0OO.OooO0O0 OooO0O02 = interfaceC24753OooO0o0.getSavedStateRegistry().OooO0O0();
        C22013OooooO0 c22013OooooO0 = OooO0O02 instanceof C22013OooooO0 ? (C22013OooooO0) OooO0O02 : null;
        if (c22013OooooO0 == null) {
            throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
        }
        LinkedHashMap linkedHashMap2 = ((C22014OooooOO) new o00Oo0(interfaceC22023o00ooo, new C22012Ooooo0o()).OooO0O0(C22014OooooOO.class, "androidx.lifecycle.internal.SavedStateHandlesVM")).f65662OooO0Oo;
        C22008OoooOo0 c22008OoooOo0 = (C22008OoooOo0) linkedHashMap2.get(str);
        if (c22008OoooOo0 != null) {
            return c22008OoooOo0;
        }
        Class<? extends Object>[] clsArr = C22008OoooOo0.f65644OooO0o;
        c22013OooooO0.OooO0O0();
        Bundle bundle2 = c22013OooooO0.f65659OooO0OO;
        Bundle bundle3 = bundle2 != null ? bundle2.getBundle(str) : null;
        Bundle bundle4 = c22013OooooO0.f65659OooO0OO;
        if (bundle4 != null) {
            bundle4.remove(str);
        }
        Bundle bundle5 = c22013OooooO0.f65659OooO0OO;
        if (bundle5 != null && bundle5.isEmpty()) {
            c22013OooooO0.f65659OooO0OO = null;
        }
        C22008OoooOo0 c22008OoooOo0OooO00o = C22008OoooOo0.OooO00o.OooO00o(bundle3, bundle);
        linkedHashMap2.put(str, c22008OoooOo0OooO00o);
        return c22008OoooOo0OooO00o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T extends InterfaceC24753OooO0o0 & InterfaceC22023o00ooo> void OooO0O0(T t) {
        AbstractC21979OooOOo0.OooO0O0 OooO0O02 = t.getLifecycle().OooO0O0();
        if (OooO0O02 != AbstractC21979OooOOo0.OooO0O0.f65537OooOo && OooO0O02 != AbstractC21979OooOOo0.OooO0O0.f65540OooOoO0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (t.getSavedStateRegistry().OooO0O0() == null) {
            C22013OooooO0 c22013OooooO0 = new C22013OooooO0(t.getSavedStateRegistry(), t);
            t.getSavedStateRegistry().OooO0OO("androidx.lifecycle.internal.SavedStateHandlesProvider", c22013OooooO0);
            t.getLifecycle().OooO00o(new C22009OoooOoO(c22013OooooO0));
        }
    }
}
