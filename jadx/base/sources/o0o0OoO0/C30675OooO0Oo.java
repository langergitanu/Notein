package o0o0OoO0;

import android.view.View;
import android.widget.PopupWindow;
import com.orion.notein.p607ui.ocr.view.AiOcrEditorListContainer;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: renamed from: o0o0OoO0.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C30675OooO0Oo implements PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ AiOcrEditorListContainer f109736OooOo0o;

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        View view = this.f109736OooOo0o.f78427OooOoo0;
        if (view != null) {
            view.setActivated(false);
        } else {
            OooOOO0.OooOOOO("btnTextStyle");
            throw null;
        }
    }
}
