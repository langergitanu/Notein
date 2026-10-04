package o0Ooo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.InterfaceC21987OooOoo;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.backup.ImportLocalDataDialogFragment;
import com.orion.notein.p607ui.noteeditor.penbox.PenBoxChildFragment;
import o0o0O0.C30183OooO0oo;

/* JADX INFO: renamed from: o0Ooo.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C29260OooO0oo implements oO0O000o.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f103760OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f103761OooOo0o;

    public /* synthetic */ C29260OooO0oo(Object obj, int i) {
        this.f103761OooOo0o = i;
        this.f103760OooOo = obj;
    }

    @Override // oO0O000o.OooO00o
    public final Object invoke() {
        Object obj = this.f103760OooOo;
        switch (this.f103761OooOo0o) {
            case 0:
                int i = PenBoxChildFragment.f75355o0000Ooo;
                PenBoxChildFragment penBoxChildFragment = (PenBoxChildFragment) obj;
                com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0Oooo0o = penBoxChildFragment.Oooo0o();
                InterfaceC21987OooOoo interfaceC21987OooOoo = penBoxChildFragment.f75364Oooo000;
                if (interfaceC21987OooOoo != null) {
                    return new o0o00o.OooOOOO(oooO0O0Oooo0o, interfaceC21987OooOoo, new PenBoxChildFragment.C23500OooOoO0(2, penBoxChildFragment, PenBoxChildFragment.class, "sendMessageToFocusedEditor", "sendMessageToFocusedEditor(ILjava/lang/Object;)V", 0), new PenBoxChildFragment.C23499OooOoO(2, penBoxChildFragment, PenBoxChildFragment.class, "showNonVipFeatureLimitedDialog", "showNonVipFeatureLimitedDialog(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0));
                }
                kotlin.jvm.internal.OooOOO0.OooOOOO("containerViewLifecycleOwner");
                throw null;
            case 1:
                o0o0O0.OooO oooO = (o0o0O0.OooO) obj;
                PopupWindow popupWindow = new PopupWindow(LayoutInflater.from(oooO.f107434OooO00o).inflate(R.layout.popup_window_note_more, (ViewGroup) null), oooO.f107434OooO00o.getResources().getDimensionPixelSize(R.dimen.note_more_popup_window_width), -2, false);
                popupWindow.setOutsideTouchable(true);
                popupWindow.setElevation(10.0f);
                View contentView = popupWindow.getContentView();
                kotlin.jvm.internal.OooOOO0.OooO0o(contentView, "getContentView(...)");
                oooO.f107436OooO0OO = new C30183OooO0oo(contentView);
                return popupWindow;
            default:
                Fragment fragmentRequireParentFragment = ((ImportLocalDataDialogFragment) obj).requireParentFragment();
                kotlin.jvm.internal.OooOOO0.OooO0o(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
        }
    }
}
