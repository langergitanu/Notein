package o00000;

import OooOoOO.C20519OooO0Oo;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import oO00ooO.EnumC32441OooOO0O;

/* JADX INFO: renamed from: o00000.OooOOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24053OooOOoo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final View f81058OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Object f81059OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final InterfaceC24051OooOOo f81060OooO0OO;

    /* JADX INFO: renamed from: o00000.OooOOoo$OooO00o */
    public static final class OooO00o extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<InputMethodManager> {
        public OooO00o() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final InputMethodManager invoke() {
            Object systemService = C24053OooOOoo.this.f81058OooO00o.getContext().getSystemService("input_method");
            kotlin.jvm.internal.OooOOO0.OooO0o0(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            return (InputMethodManager) systemService;
        }
    }

    public C24053OooOOoo(View view) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(view, "view");
        this.f81058OooO00o = view;
        this.f81059OooO0O0 = C20519OooO0Oo.OooO0O0(EnumC32441OooOO0O.f116636OooOoO0, new OooO00o());
        this.f81060OooO0OO = Build.VERSION.SDK_INT < 30 ? new C24050OooOOOo(view) : new C24052OooOOo0(view);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
    public final void OooO00o(int i, int i2, int i3, int i4) {
        ((InputMethodManager) this.f81059OooO0O0.getValue()).updateSelection(this.f81058OooO00o, i, i2, i3, i4);
    }
}
