package o0o00O;

import android.view.View;
import androidx.lifecycle.C21989OooOooO;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.toolbar.BaseToolbarChildFragment;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.OooOOO0;
import o0Oo0O0.C28050OooO0OO;
import o0o000oo.C29822OooOo0O;
import o0o000oo.C29823OooOo0o;
import oO0o0OO.C33609OooO0oo;
import oOo000Oo.C34429OooOOo0;
import oOo000Oo.C34438OooOoo0;

/* JADX INFO: renamed from: o0o00O.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29864OooO0o0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final View f105959OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public C29823OooOo0o f105960OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final List<Integer> f105961OooO0OO;

    public C29864OooO0o0(View view) {
        OooOOO0.OooO0oO(view, "view");
        this.f105959OooO00o = view;
        List<Integer> listOooOO0o = C34429OooOOo0.OooOO0o(Integer.valueOf(R.id.item_stylus), Integer.valueOf(R.id.item_finger), Integer.valueOf(R.id.item_audio_picker));
        this.f105961OooO0OO = listOooOO0o;
        Iterator<T> it = listOooOO0o.iterator();
        while (it.hasNext()) {
            final int iIntValue = ((Number) it.next()).intValue();
            View viewFindViewById = this.f105959OooO00o.findViewById(iIntValue);
            OooOOO0.OooO0Oo(viewFindViewById);
            C28050OooO0OO.OooO00o(viewFindViewById, 500L, new View.OnClickListener() { // from class: o0o00O.OooO0Oo
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C29823OooOo0o c29823OooOo0o = this.f105958OooOo0o.f105960OooO0O0;
                    if (c29823OooOo0o != null) {
                        BaseToolbarChildFragment baseToolbarChildFragment = c29823OooOo0o.f105808OooO00o;
                        baseToolbarChildFragment.Ooooo0o();
                        baseToolbarChildFragment.OoooOo0(C34438OooOoo0.f123458OooOo0o);
                        int i = iIntValue;
                        if (i == R.id.item_audio_picker) {
                            C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(baseToolbarChildFragment.Oooo0O0()), null, null, new C29822OooOo0O(baseToolbarChildFragment, null), 3);
                            return;
                        }
                        if (i == R.id.item_finger) {
                            baseToolbarChildFragment.Oooo0OO().Oooo0(false);
                            baseToolbarChildFragment.Oooo0OO().Oooo00o(true);
                        } else {
                            if (i != R.id.item_stylus) {
                                return;
                            }
                            baseToolbarChildFragment.Oooo0OO().Oooo0(false);
                            baseToolbarChildFragment.Oooo0OO().Oooo00o(false);
                        }
                    }
                }
            });
        }
    }
}
