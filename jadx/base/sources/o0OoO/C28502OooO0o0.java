package o0OoO;

import android.widget.PopupWindow;

/* JADX INFO: renamed from: o0OoO.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C28502OooO0o0 implements PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f101045OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f101046OooOo0o;

    public /* synthetic */ C28502OooO0o0(Object obj, int i) {
        this.f101046OooOo0o = i;
        this.f101045OooOo = obj;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        switch (this.f101046OooOo0o) {
            case 0:
                long jCurrentTimeMillis = System.currentTimeMillis();
                OooO0o oooO0o = (OooO0o) this.f101045OooOo;
                oooO0o.f101043OooOOO0 = jCurrentTimeMillis;
                oooO0o.f101032OooO0O0.onDismiss();
                break;
            default:
                ((o0o00O.OooO0OO) this.f101045OooOo).f105956OooOoO0 = System.currentTimeMillis();
                break;
        }
    }
}
