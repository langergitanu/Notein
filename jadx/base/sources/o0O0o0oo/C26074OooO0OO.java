package o0O0o0oo;

import android.view.View;
import android.widget.PopupWindow;

/* JADX INFO: renamed from: o0O0o0oo.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26074OooO0OO implements PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ o00O00O.OooO0O0 f89025OooOo0o;

    public C26074OooO0OO(o00O00O.OooO0O0 oooO0O0) {
        this.f89025OooOo0o = oooO0O0;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        View view = ((C26085OooOOOO) this.f89025OooOo0o.f84088OooOo).f89051OooO0o;
        if (view != null) {
            view.setRotation(0);
        }
    }
}
