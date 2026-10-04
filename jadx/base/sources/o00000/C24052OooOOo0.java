package o00000;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import o00000oo.InterfaceC24131OooOOo;

/* JADX INFO: renamed from: o00000.OooOOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24052OooOOo0 implements InterfaceC24051OooOOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final View f81056OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public C24050OooOOOo f81057OooO0O0;

    public C24052OooOOo0(View view) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(view, "view");
        this.f81056OooO00o = view;
    }

    @Override // o00000.InterfaceC24051OooOOo
    public void OooO00o(InputMethodManager imm) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(imm, "imm");
        WindowInsetsControllerCompat windowInsetsControllerCompatOooO0OO = OooO0OO();
        if (windowInsetsControllerCompatOooO0OO != null) {
            windowInsetsControllerCompatOooO0OO.hide(WindowInsetsCompat.Type.ime());
            return;
        }
        C24050OooOOOo c24050OooOOOo = this.f81057OooO0O0;
        if (c24050OooOOOo == null) {
            c24050OooOOOo = new C24050OooOOOo(this.f81056OooO00o);
            this.f81057OooO0O0 = c24050OooOOOo;
        }
        c24050OooOOOo.OooO00o(imm);
    }

    @Override // o00000.InterfaceC24051OooOOo
    public void OooO0O0(InputMethodManager imm) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(imm, "imm");
        WindowInsetsControllerCompat windowInsetsControllerCompatOooO0OO = OooO0OO();
        if (windowInsetsControllerCompatOooO0OO != null) {
            windowInsetsControllerCompatOooO0OO.show(WindowInsetsCompat.Type.ime());
            return;
        }
        C24050OooOOOo c24050OooOOOo = this.f81057OooO0O0;
        if (c24050OooOOOo == null) {
            c24050OooOOOo = new C24050OooOOOo(this.f81056OooO00o);
            this.f81057OooO0O0 = c24050OooOOOo;
        }
        c24050OooOOOo.OooO0O0(imm);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final WindowInsetsControllerCompat OooO0OO() {
        Window window;
        Window window2;
        View view = this.f81056OooO00o;
        View view2 = view;
        while (true) {
            if (view2 instanceof InterfaceC24131OooOOo) {
                window = ((InterfaceC24131OooOOo) view2).getWindow();
                break;
            }
            Object parent = view2.getParent();
            View view3 = parent instanceof View ? (View) parent : null;
            if (view3 == null) {
                Context baseContext = view2.getContext();
                kotlin.jvm.internal.OooOOO0.OooO0o(baseContext, "view.context");
                while (true) {
                    if (!(baseContext instanceof Activity)) {
                        if (!(baseContext instanceof ContextWrapper)) {
                            window2 = null;
                            break;
                        }
                        baseContext = ((ContextWrapper) baseContext).getBaseContext();
                        kotlin.jvm.internal.OooOOO0.OooO0o(baseContext, "baseContext");
                    } else {
                        window2 = ((Activity) baseContext).getWindow();
                        break;
                    }
                }
                if (window2 == null) {
                    window = null;
                } else {
                    View decorView = window2.getDecorView();
                    kotlin.jvm.internal.OooOOO0.OooO0o(decorView, "windowFromContext.decorView");
                    if (decorView == view2) {
                        window = window2;
                    }
                }
            } else {
                view2 = view3;
            }
        }
        if (window != null) {
            return new WindowInsetsControllerCompat(window, view);
        }
        return null;
    }
}
