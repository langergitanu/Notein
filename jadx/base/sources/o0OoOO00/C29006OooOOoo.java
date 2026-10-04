package o0OoOO00;

import android.content.Context;
import android.view.View;
import android.widget.PopupWindow;
import androidx.fragment.app.Fragment;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.addpage.AddPageFragment;
import com.orion.notein.p607ui.noteeditor.penbox.PenBoxChildFragment;
import com.orion.notein.p607ui.noteeditor.toolbar.BaseToolbarChildFragment;
import o0Oo00oO.C28038OooO0Oo;
import o0o000oo.ViewOnClickListenerC29820OooOo0;
import o0o00O00.C29869OooO0Oo;
import o0o00O0o.C29878OooO0Oo;
import o0o00O0o.DialogC29876OooO0O0;

/* JADX INFO: renamed from: o0OoOO00.OooOOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C29006OooOOoo implements oO0O000o.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Fragment f102752OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f102753OooOo0o;

    public /* synthetic */ C29006OooOOoo(Fragment fragment, int i) {
        this.f102753OooOo0o = i;
        this.f102752OooOo = fragment;
    }

    @Override // oO0O000o.OooO00o
    public final Object invoke() {
        Fragment fragment = this.f102752OooOo;
        switch (this.f102753OooOo0o) {
            case 0:
                Fragment fragmentRequireParentFragment = ((AddPageFragment) fragment).requireParentFragment();
                kotlin.jvm.internal.OooOOO0.OooO0o(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            case 1:
                int i = PenBoxChildFragment.f75355o0000Ooo;
                final PenBoxChildFragment penBoxChildFragment = (PenBoxChildFragment) fragment;
                Context contextRequireContext = penBoxChildFragment.requireContext();
                kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
                final C29869OooO0Oo c29869OooO0Oo = new C29869OooO0Oo(contextRequireContext);
                c29869OooO0Oo.OooO0Oo(new View.OnClickListener() { // from class: o0Ooo.OooOo
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        PenBoxChildFragment penBoxChildFragment2 = penBoxChildFragment;
                        PenBoxChildFragment.OoooO0(penBoxChildFragment2);
                        int i2 = c29869OooO0Oo.f105988OooOO0;
                        if (view.getId() != R.id.btn_do_not_show_again) {
                            return;
                        }
                        penBoxChildFragment2.Oooo00O().OooOOo0(i2);
                    }
                });
                c29869OooO0Oo.OooO0OO(new PopupWindow.OnDismissListener() { // from class: o0Ooo.OooOoO0
                    @Override // android.widget.PopupWindow.OnDismissListener
                    public final void onDismiss() {
                        int i2 = PenBoxChildFragment.f75355o0000Ooo;
                        penBoxChildFragment.Oooo00O().OooOoo0(c29869OooO0Oo.f105988OooOO0);
                    }
                });
                return c29869OooO0Oo;
            default:
                BaseToolbarChildFragment baseToolbarChildFragment = (BaseToolbarChildFragment) fragment;
                Context contextRequireContext2 = baseToolbarChildFragment.requireContext();
                kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext2, "requireContext(...)");
                ViewOnClickListenerC29820OooOo0 viewOnClickListenerC29820OooOo0 = new ViewOnClickListenerC29820OooOo0(baseToolbarChildFragment);
                return C28038OooO0Oo.OooO0O0(contextRequireContext2) ? new DialogC29876OooO0O0(contextRequireContext2, viewOnClickListenerC29820OooOo0) : new C29878OooO0Oo(contextRequireContext2, viewOnClickListenerC29820OooOo0);
        }
    }
}
