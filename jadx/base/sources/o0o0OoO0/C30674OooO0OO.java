package o0o0OoO0;

import android.view.View;
import android.widget.PopupWindow;
import com.orion.notein.p607ui.ocr.view.AiOcrEditorListContainer;

/* JADX INFO: renamed from: o0o0OoO0.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C30674OooO0OO implements PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ AiOcrEditorListContainer f109735OooOo0o;

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        View view = this.f109735OooOo0o.f78428OooOooO;
        if (view != null) {
            view.setActivated(false);
        }
    }
}
