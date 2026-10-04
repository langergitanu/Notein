package o0o00OOo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupWindow;
import androidx.core.view.GravityCompat;
import com.orion.notein.global.R;
import java.util.List;
import kotlin.jvm.internal.OooOOO0;
import o0OoOOOo.C29105OooOOO0;
import o0o000oo.C29825OooOoO0;
import o0o00Oo0.C29909OooO0O0;

/* JADX INFO: renamed from: o0o00OOo.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29887OooO0O0 implements InterfaceC29892OooO0oO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public C29825OooOoO0 f106026OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final PopupWindow f106027OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public long f106028OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final C29891OooO0o0 f106029OooOoO0;

    public C29887OooO0O0(Context context) {
        Object systemService = context.getSystemService("layout_inflater");
        OooOOO0.OooO0o0(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        View viewInflate = ((LayoutInflater) systemService).inflate(R.layout.popup_window_eidtor_more, (ViewGroup) null);
        OooOOO0.OooO0o(viewInflate, "inflate(...)");
        PopupWindow popupWindow = new PopupWindow(viewInflate, context.getResources().getDimensionPixelSize(R.dimen.note_editor_popup_window_width), -2, false);
        this.f106027OooOo0o = popupWindow;
        popupWindow.setOutsideTouchable(true);
        popupWindow.setElevation(10.0f);
        this.f106029OooOoO0 = new C29891OooO0o0(viewInflate);
        popupWindow.setOnDismissListener(new C29105OooOOO0(this, 1));
    }

    @Override // o0o00OOo.InterfaceC29892OooO0oO
    public final void OooO00o() {
        this.f106027OooOo0o.dismiss();
    }

    @Override // o0o00OOo.InterfaceC29892OooO0oO
    public final void OooO0o(List<C29909OooO0O0> list) {
        OooOOO0.OooO0oO(list, "list");
        C29891OooO0o0 c29891OooO0o0 = this.f106029OooOoO0;
        c29891OooO0o0.getClass();
        c29891OooO0o0.f106053OooOOoo.OooO0Oo(list);
    }

    @Override // o0o00OOo.InterfaceC29892OooO0oO
    public final void OooOO0O(C29825OooOoO0 c29825OooOoO0) {
        this.f106026OooOo = c29825OooOoO0;
        this.f106029OooOoO0.f106037OooO0O0 = c29825OooOoO0;
    }

    @Override // o0o00OOo.InterfaceC29892OooO0oO
    public final boolean OooOOO0(ImageView imageView, boolean z, boolean z2, boolean z3) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.f106028OooOoO < 500) {
            return false;
        }
        this.f106029OooOoO0.OooO00o(z, z2, z3);
        this.f106027OooOo0o.showAsDropDown(imageView, 0, 0, GravityCompat.END);
        this.f106028OooOoO = jCurrentTimeMillis;
        C29825OooOoO0 c29825OooOoO0 = this.f106026OooOo;
        if (c29825OooOoO0 != null) {
            c29825OooOoO0.OooO0OO(true);
        }
        return true;
    }

    @Override // o0o00OOo.InterfaceC29892OooO0oO
    public final void OooOOOO(boolean z) {
        C29891OooO0o0 c29891OooO0o0 = this.f106029OooOoO0;
        c29891OooO0o0.getClass();
        c29891OooO0o0.f106049OooOOOO.setVisibility(z ? 4 : 0);
        c29891OooO0o0.f106050OooOOOo.setVisibility(z ? 0 : 8);
    }
}
