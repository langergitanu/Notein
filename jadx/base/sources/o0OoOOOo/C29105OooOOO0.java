package o0OoOOOo;

import android.widget.PopupWindow;
import o0o000oo.C29825OooOoO0;
import o0o00OOo.C29887OooO0O0;

/* JADX INFO: renamed from: o0OoOOOo.OooOOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C29105OooOOO0 implements PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f103131OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f103132OooOo0o;

    public /* synthetic */ C29105OooOOO0(Object obj, int i) {
        this.f103132OooOo0o = i;
        this.f103131OooOo = obj;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        switch (this.f103132OooOo0o) {
            case 0:
                InterfaceC29095OooO0OO interfaceC29095OooO0OO = ((C29108OooOOo) this.f103131OooOo).f103143OooO0O0;
                if (interfaceC29095OooO0OO != null) {
                    interfaceC29095OooO0OO.OooO0Oo(false);
                }
                break;
            default:
                long jCurrentTimeMillis = System.currentTimeMillis();
                C29887OooO0O0 c29887OooO0O0 = (C29887OooO0O0) this.f103131OooOo;
                c29887OooO0O0.f106028OooOoO = jCurrentTimeMillis;
                C29825OooOoO0 c29825OooOoO0 = c29887OooO0O0.f106026OooOo;
                if (c29825OooOoO0 != null) {
                    c29825OooOoO0.OooO0OO(false);
                }
                break;
        }
    }
}
