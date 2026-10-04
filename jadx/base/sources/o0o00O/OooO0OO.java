package o0o00O;

import Oooo0.o000000O;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupWindow;
import androidx.core.view.GravityCompat;
import com.aspose.words.StyleIdentifier;
import com.orion.notein.global.R;
import kotlin.jvm.internal.OooOOO0;
import o0OoO.C28502OooO0o0;
import o0o000oo.C29823OooOo0o;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO0OO implements InterfaceC29862OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final C29864OooO0o0 f105954OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final PopupWindow f105955OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public long f105956OooOoO0;

    public OooO0OO(Context context) {
        Object systemService = context.getSystemService("layout_inflater");
        OooOOO0.OooO0o0(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        View viewInflate = ((LayoutInflater) systemService).inflate(R.layout.popup_window_note_input_type, (ViewGroup) null);
        OooOOO0.OooO0o(viewInflate, "inflate(...)");
        PopupWindow popupWindow = new PopupWindow(viewInflate, o000000O.OooO0o(StyleIdentifier.SUBTLE_EMPHASIS), -2, false);
        this.f105955OooOo0o = popupWindow;
        popupWindow.setOutsideTouchable(true);
        popupWindow.setElevation(10.0f);
        this.f105954OooOo = new C29864OooO0o0(viewInflate);
        popupWindow.setOnDismissListener(new C28502OooO0o0(this, 1));
    }

    @Override // o0o00O.InterfaceC29862OooO00o
    public final void OooO00o() {
        this.f105955OooOo0o.dismiss();
    }

    @Override // o0o00O.InterfaceC29862OooO00o
    public final void OooO0oO(C29823OooOo0o c29823OooOo0o) {
        this.f105954OooOo.f105960OooO0O0 = c29823OooOo0o;
    }

    @Override // o0o00O.InterfaceC29862OooO00o
    public final boolean OooOOOo(ImageView imageView, int i) {
        if (System.currentTimeMillis() - this.f105956OooOoO0 < 500) {
            return false;
        }
        View view = this.f105954OooOo.f105959OooO00o;
        View viewFindViewById = view.findViewById(R.id.iv_stylus_selected);
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(i == 0 ? 0 : 8);
        }
        View viewFindViewById2 = view.findViewById(R.id.iv_finger_selected);
        if (viewFindViewById2 != null) {
            viewFindViewById2.setVisibility(i == 1 ? 0 : 8);
        }
        View viewFindViewById3 = view.findViewById(R.id.iv_tap_selected);
        if (viewFindViewById3 != null) {
            viewFindViewById3.setVisibility(i == 2 ? 0 : 8);
        }
        this.f105955OooOo0o.showAsDropDown(imageView, 0, 0, GravityCompat.END);
        return true;
    }
}
