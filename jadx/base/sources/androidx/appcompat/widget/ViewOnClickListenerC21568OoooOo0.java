package androidx.appcompat.widget;

import android.content.Context;
import android.view.View;
import android.view.Window;

/* JADX INFO: renamed from: androidx.appcompat.widget.OoooOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC21568OoooOo0 implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C21569OoooOoO f63097OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final androidx.appcompat.view.menu.OooO00o f63098OooOo0o;

    public ViewOnClickListenerC21568OoooOo0(C21569OoooOoO c21569OoooOoO) {
        this.f63097OooOo = c21569OoooOoO;
        Context context = c21569OoooOoO.f63100OooO00o.getContext();
        CharSequence charSequence = c21569OoooOoO.f63107OooO0oo;
        androidx.appcompat.view.menu.OooO00o oooO00o = new androidx.appcompat.view.menu.OooO00o();
        oooO00o.f62565OooO0o0 = 4096;
        oooO00o.f62566OooO0oO = 4096;
        oooO00o.f62570OooOO0o = null;
        oooO00o.f62572OooOOO0 = null;
        oooO00o.f62571OooOOO = false;
        oooO00o.f62573OooOOOO = false;
        oooO00o.f62574OooOOOo = 16;
        oooO00o.f62559OooO = context;
        oooO00o.f62560OooO00o = charSequence;
        this.f63098OooOo0o = oooO00o;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C21569OoooOoO c21569OoooOoO = this.f63097OooOo;
        Window.Callback callback = c21569OoooOoO.f63109OooOO0O;
        if (callback == null || !c21569OoooOoO.f63110OooOO0o) {
            return;
        }
        callback.onMenuItemSelected(0, this.f63098OooOo0o);
    }
}
