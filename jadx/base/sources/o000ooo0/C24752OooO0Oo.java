package o000ooo0;

import OooOOO.OooO0O0;
import android.os.Bundle;
import androidx.lifecycle.AbstractC21979OooOOo0;
import androidx.lifecycle.InterfaceC21986OooOoOO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import java.util.Map;
import kotlin.jvm.internal.OooOOO0;
import o000ooo0.OooO0OO;

/* JADX INFO: renamed from: o000ooo0.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24752OooO0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final InterfaceC24753OooO0o0 f83956OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO0OO f83957OooO0O0 = new OooO0OO();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f83958OooO0OO;

    public C24752OooO0Oo(InterfaceC24753OooO0o0 interfaceC24753OooO0o0) {
        this.f83956OooO00o = interfaceC24753OooO0o0;
    }

    public final void OooO00o() {
        InterfaceC24753OooO0o0 interfaceC24753OooO0o0 = this.f83956OooO00o;
        AbstractC21979OooOOo0 lifecycle = interfaceC24753OooO0o0.getLifecycle();
        if (lifecycle.OooO0O0() != AbstractC21979OooOOo0.OooO0O0.f65537OooOo) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        lifecycle.OooO00o(new C24750OooO00o(interfaceC24753OooO0o0));
        final OooO0OO oooO0OO = this.f83957OooO0O0;
        oooO0OO.getClass();
        if (oooO0OO.f83951OooO0O0) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        lifecycle.OooO00o(new InterfaceC21986OooOoOO() { // from class: o000ooo0.OooO0O0
            @Override // androidx.lifecycle.InterfaceC21986OooOoOO
            public final void OooOOo0(InterfaceC21987OooOoo interfaceC21987OooOoo, AbstractC21979OooOOo0.OooO00o oooO00o) {
                OooO0OO this$0 = oooO0OO;
                OooOOO0.OooO0oO(this$0, "this$0");
                if (oooO00o == AbstractC21979OooOOo0.OooO00o.ON_START) {
                    this$0.f83954OooO0o = true;
                } else if (oooO00o == AbstractC21979OooOOo0.OooO00o.ON_STOP) {
                    this$0.f83954OooO0o = false;
                }
            }
        });
        oooO0OO.f83951OooO0O0 = true;
        this.f83958OooO0OO = true;
    }

    public final void OooO0O0(Bundle bundle) {
        if (!this.f83958OooO0OO) {
            OooO00o();
        }
        AbstractC21979OooOOo0 lifecycle = this.f83956OooO00o.getLifecycle();
        if (lifecycle.OooO0O0().compareTo(AbstractC21979OooOOo0.OooO0O0.f65539OooOoO) >= 0) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + lifecycle.OooO0O0()).toString());
        }
        OooO0OO oooO0OO = this.f83957OooO0O0;
        if (!oooO0OO.f83951OooO0O0) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
        }
        if (oooO0OO.f83953OooO0Oo) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        oooO0OO.f83952OooO0OO = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        oooO0OO.f83953OooO0Oo = true;
    }

    public final void OooO0OO(Bundle bundle) {
        OooO0OO oooO0OO = this.f83957OooO0O0;
        oooO0OO.getClass();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = oooO0OO.f83952OooO0OO;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        OooOOO.OooO0O0<String, OooO0OO.OooO0O0> oooO0O0 = oooO0OO.f83950OooO00o;
        oooO0O0.getClass();
        OooO0O0.C20448OooO0Oo c20448OooO0Oo = new OooO0O0.C20448OooO0Oo();
        oooO0O0.f58394OooOoO0.put(c20448OooO0Oo, Boolean.FALSE);
        while (c20448OooO0Oo.hasNext()) {
            Map.Entry entry = (Map.Entry) c20448OooO0Oo.next();
            bundle2.putBundle((String) entry.getKey(), ((OooO0OO.OooO0O0) entry.getValue()).OooO00o());
        }
        if (bundle2.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }
}
