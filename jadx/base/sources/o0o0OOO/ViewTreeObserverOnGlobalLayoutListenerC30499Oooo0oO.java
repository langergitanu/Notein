package o0o0OOO;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import android.widget.TextView;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.paperconfig.PaperConfigDialogFragment;

/* JADX INFO: renamed from: o0o0OOO.Oooo0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC30499Oooo0oO implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ PaperConfigDialogFragment f108927OooOo0o;

    public ViewTreeObserverOnGlobalLayoutListenerC30499Oooo0oO(PaperConfigDialogFragment paperConfigDialogFragment) {
        this.f108927OooOo0o = paperConfigDialogFragment;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        ViewTreeObserver viewTreeObserver;
        PaperConfigDialogFragment paperConfigDialogFragment = this.f108927OooOo0o;
        View view = paperConfigDialogFragment.getView();
        if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(this);
        }
        View view2 = paperConfigDialogFragment.getView();
        if (view2 != null) {
            EditText editText = (EditText) view2.findViewById(R.id.toolbar_title_input);
            TextView textView = (TextView) view2.findViewById(R.id.toolbar_title_text);
            int width = view2.getWidth();
            if (width > 0) {
                int iOooO0o = (((width - (Oooo0.o000000O.OooO0o(16) * 2)) - (Oooo0.o000000O.OooO0o(40) * 2)) - (Oooo0.o000000O.OooO0o(16) * 2)) - Oooo0.o000000O.OooO0o(48);
                if (editText != null) {
                    editText.setMaxWidth(iOooO0o);
                }
                if (textView != null) {
                    textView.setMaxWidth(iOooO0o);
                }
            }
        }
    }
}
