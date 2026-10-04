package o0Ooo0oo;

import android.content.Context;
import android.view.View;
import android.widget.PopupWindow;
import androidx.fragment.app.Fragment;
import com.android.billingclient.api.OooOO0O;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.NoteEditorContainerFragment;
import com.orion.notein.p607ui.noteeditor.penbar.PenBarChildFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import o0o00O00.C29869OooO0Oo;
import o0oOoOo.C31042OooOOO0;
import oO00ooO.InterfaceC32440OooOO0;

/* JADX INFO: renamed from: o0Ooo0oo.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C29449OooOO0o implements oO0O000o.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f104507OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f104508OooOo0o;

    public /* synthetic */ C29449OooOO0o(Object obj, int i) {
        this.f104508OooOo0o = i;
        this.f104507OooOo = obj;
    }

    @Override // oO0O000o.OooO00o
    public final Object invoke() {
        boolean z;
        OooOO0O.OooO0OO oooO0OO;
        ArrayList arrayList;
        Object obj = this.f104507OooOo;
        switch (this.f104508OooOo0o) {
            case 0:
                int i = PenBarChildFragment.f75240o0000OOo;
                final PenBarChildFragment penBarChildFragment = (PenBarChildFragment) obj;
                Context contextRequireContext = penBarChildFragment.requireContext();
                kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
                final C29869OooO0Oo c29869OooO0Oo = new C29869OooO0Oo(contextRequireContext);
                c29869OooO0Oo.OooO0Oo(new View.OnClickListener() { // from class: o0Ooo0oo.OooOOo0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i2 = PenBarChildFragment.f75240o0000OOo;
                        PenBarChildFragment penBarChildFragment2 = penBarChildFragment;
                        Fragment parentFragment = penBarChildFragment2.getParentFragment();
                        NoteEditorContainerFragment noteEditorContainerFragment = parentFragment instanceof NoteEditorContainerFragment ? (NoteEditorContainerFragment) parentFragment : null;
                        if (noteEditorContainerFragment != null) {
                            NoteEditorContainerFragment.Oooo0(noteEditorContainerFragment);
                        }
                        for (Map.Entry entry : penBarChildFragment2.f75309o00ooo.entrySet()) {
                            ((Number) entry.getKey()).intValue();
                            Object value = ((InterfaceC32440OooOO0) entry.getValue()).getValue();
                            if (value instanceof C29869OooO0Oo) {
                                ((C29869OooO0Oo) value).OooO00o();
                            }
                        }
                        int i3 = c29869OooO0Oo.f105988OooOO0;
                        if (view.getId() != R.id.btn_do_not_show_again) {
                            return;
                        }
                        penBarChildFragment2.Oooo00O().OooOOo0(i3);
                    }
                });
                c29869OooO0Oo.OooO0OO(new PopupWindow.OnDismissListener() { // from class: o0Ooo0oo.OooOOo
                    @Override // android.widget.PopupWindow.OnDismissListener
                    public final void onDismiss() {
                        int i2 = PenBarChildFragment.f75240o0000OOo;
                        penBarChildFragment.Oooo00O().OooOoo0(c29869OooO0Oo.f105988OooOO0);
                    }
                });
                return c29869OooO0Oo;
            default:
                OooOO0O.C22163OooO0Oo c22163OooO0Oo = ((C31042OooOOO0) obj).f110828OooO0OO;
                if (c22163OooO0Oo == null || (oooO0OO = c22163OooO0Oo.f66970OooO0Oo) == null || (arrayList = oooO0OO.f66966OooO00o) == null || arrayList.isEmpty()) {
                    z = false;
                } else {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        z = true;
                        if (((OooOO0O.OooO0O0) it.next()).f66965OooO0o0 == 1) {
                        }
                    }
                    z = false;
                }
                return Boolean.valueOf(z);
        }
    }
}
