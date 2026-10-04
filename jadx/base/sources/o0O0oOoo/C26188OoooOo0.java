package o0O0oOoo;

import android.content.Context;
import android.view.View;
import android.widget.PopupWindow;
import androidx.core.location.LocationRequestCompat;
import com.orion.niui.components.button.TextButtonView;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.C23344OooOOo;
import com.orion.notein.p607ui.noteeditor.editortab.LatestOpenedNoteTabFragment;
import o0o00O00.C29869OooO0Oo;
import oO00ooO.C32460OooOooO;

/* JADX INFO: renamed from: o0O0oOoo.OoooOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C26188OoooOo0 implements oO0O000o.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f89412OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f89413OooOo0o;

    public /* synthetic */ C26188OoooOo0(Object obj, int i) {
        this.f89413OooOo0o = i;
        this.f89412OooOo = obj;
    }

    @Override // oO0O000o.OooO00o
    public final Object invoke() {
        switch (this.f89413OooOo0o) {
            case 0:
                ((TextButtonView) this.f89412OooOo).performClick();
                return C32460OooOooO.f116667OooO00o;
            case 1:
                long valueAsLong = ((C23344OooOOo) this.f89412OooOo).f73549OooO0oo.f95374OooO00o.getValueAsLong("rconfig_render_order_v2_min_version");
                if (valueAsLong <= 0) {
                    valueAsLong = LocationRequestCompat.PASSIVE_INTERVAL;
                }
                return Long.valueOf(valueAsLong);
            default:
                final LatestOpenedNoteTabFragment latestOpenedNoteTabFragment = (LatestOpenedNoteTabFragment) this.f89412OooOo;
                Context contextRequireContext = latestOpenedNoteTabFragment.requireContext();
                kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
                final C29869OooO0Oo c29869OooO0Oo = new C29869OooO0Oo(contextRequireContext);
                c29869OooO0Oo.OooO0Oo(new View.OnClickListener() { // from class: o0OoOoo0.OooO0o0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        LatestOpenedNoteTabFragment latestOpenedNoteTabFragment2 = latestOpenedNoteTabFragment;
                        LatestOpenedNoteTabFragment.OooOooO(latestOpenedNoteTabFragment2);
                        int i = c29869OooO0Oo.f105988OooOO0;
                        if (view.getId() != R.id.btn_do_not_show_again) {
                            return;
                        }
                        latestOpenedNoteTabFragment2.OooOoOO().OooOOo0(i);
                    }
                });
                c29869OooO0Oo.OooO0OO(new PopupWindow.OnDismissListener() { // from class: o0OoOoo0.OooO0o
                    @Override // android.widget.PopupWindow.OnDismissListener
                    public final void onDismiss() {
                        latestOpenedNoteTabFragment.OooOoOO().OooOoo0(c29869OooO0Oo.f105988OooOO0);
                    }
                });
                return c29869OooO0Oo;
        }
    }
}
