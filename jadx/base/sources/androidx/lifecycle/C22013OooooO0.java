package androidx.lifecycle;

import OooOoOO.C20519OooO0Oo;
import android.os.Bundle;
import java.util.Map;
import o000ooo0.OooO0OO;
import oO00ooO.C32447OooOOo;

/* JADX INFO: renamed from: androidx.lifecycle.OooooO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C22013OooooO0 implements OooO0OO.OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o000ooo0.OooO0OO f65657OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public boolean f65658OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public Bundle f65659OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final C32447OooOOo f65660OooO0Oo;

    /* JADX INFO: renamed from: androidx.lifecycle.OooooO0$OooO00o */
    public static final class OooO00o extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<C22014OooooOO> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22023o00ooo f65661OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(InterfaceC22023o00ooo interfaceC22023o00ooo) {
            super(0);
            this.f65661OooOo0o = interfaceC22023o00ooo;
        }

        @Override // oO0O000o.OooO00o
        public final C22014OooooOO invoke() {
            return (C22014OooooOO) new o00Oo0(this.f65661OooOo0o, new C22012Ooooo0o()).OooO0O0(C22014OooooOO.class, "androidx.lifecycle.internal.SavedStateHandlesVM");
        }
    }

    public C22013OooooO0(o000ooo0.OooO0OO savedStateRegistry, InterfaceC22023o00ooo interfaceC22023o00ooo) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(savedStateRegistry, "savedStateRegistry");
        this.f65657OooO00o = savedStateRegistry;
        this.f65660OooO0Oo = C20519OooO0Oo.OooO0OO(new OooO00o(interfaceC22023o00ooo));
    }

    @Override // o000ooo0.OooO0OO.OooO0O0
    public final Bundle OooO00o() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f65659OooO0OO;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry entry : ((C22014OooooOO) this.f65660OooO0Oo.getValue()).f65662OooO0Oo.entrySet()) {
            String str = (String) entry.getKey();
            Bundle bundleOooO00o = ((C22008OoooOo0) entry.getValue()).f65649OooO0o0.OooO00o();
            if (!kotlin.jvm.internal.OooOOO0.OooO0O0(bundleOooO00o, Bundle.EMPTY)) {
                bundle.putBundle(str, bundleOooO00o);
            }
        }
        this.f65658OooO0O0 = false;
        return bundle;
    }

    public final void OooO0O0() {
        if (this.f65658OooO0O0) {
            return;
        }
        Bundle bundleOooO00o = this.f65657OooO00o.OooO00o("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f65659OooO0OO;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        if (bundleOooO00o != null) {
            bundle.putAll(bundleOooO00o);
        }
        this.f65659OooO0OO = bundle;
        this.f65658OooO0O0 = true;
    }
}
