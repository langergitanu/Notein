package Oooo000;

import OooooO0.C21291OooO0oO;
import android.graphics.Rect;
import android.view.View;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oo000o.InterfaceC34635OooOOOO;

/* JADX INFO: loaded from: classes.dex */
public final class OooO00o implements InterfaceC20895OooO0Oo {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final View f60251OooOo0o;

    public OooO00o(View view) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(view, "view");
        this.f60251OooOo0o = view;
    }

    @Override // Oooo000.InterfaceC20895OooO0Oo
    public final Object OooO00o(InterfaceC34635OooOOOO interfaceC34635OooOOOO, oO0O000o.OooO00o oooO00o, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        long jOooO0oo = o00000.OooOO0.OooO0oo(interfaceC34635OooOOOO);
        C21291OooO0oO c21291OooO0oO = (C21291OooO0oO) oooO00o.invoke();
        if (c21291OooO0oO == null) {
            return C32460OooOooO.f116667OooO00o;
        }
        C21291OooO0oO c21291OooO0oOOooO0o = c21291OooO0oO.OooO0o(jOooO0oo);
        this.f60251OooOo0o.requestRectangleOnScreen(new Rect((int) c21291OooO0oOOooO0o.f61724OooO00o, (int) c21291OooO0oOOooO0o.f61725OooO0O0, (int) c21291OooO0oOOooO0o.f61726OooO0OO, (int) c21291OooO0oOOooO0o.f61727OooO0Oo), false);
        return C32460OooOooO.f116667OooO00o;
    }
}
