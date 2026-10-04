package o0o0OoO0;

import android.view.View;
import android.widget.PopupWindow;
import com.orion.notein.p607ui.ocr.view.AiOcrEditorListContainer;

/* JADX INFO: renamed from: o0o0OoO0.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C30673OooO0O0 implements PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ AiOcrEditorListContainer f109734OooOo0o;

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        View view = this.f109734OooOo0o.f78436Oooo0OO;
        if (view != null) {
            view.setActivated(false);
        }
    }
}
