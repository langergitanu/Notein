package o0Ooooo;

import android.view.View;
import android.widget.EditText;
import com.orion.notein.p607ui.noteeditor.propertypanel.preview.EditorPreviewFragment;
import com.orion.notein.p607ui.noteeditor.propertypanel.preview.PagePreviewVO;
import o0OooooO.C29718OooO0O0;

/* JADX INFO: renamed from: o0Ooooo.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnContextClickListenerC29665OooO0OO implements View.OnContextClickListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ EditorPreviewFragment f105183OooO00o;

    @Override // android.view.View.OnContextClickListener
    public final boolean onContextClick(View view) {
        Object tag = view.getTag();
        kotlin.jvm.internal.OooOOO0.OooO0o0(tag, "null cannot be cast to non-null type com.orion.notein.ui.noteeditor.propertypanel.preview.PagePreviewVO");
        PagePreviewVO pagePreviewVO = (PagePreviewVO) tag;
        EditorPreviewFragment editorPreviewFragment = this.f105183OooO00o;
        EditText editText = editorPreviewFragment.f75903Oooo0;
        if (editText == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("searchView");
            throw null;
        }
        editText.clearFocus();
        C29718OooO0O0 c29718OooO0O0 = editorPreviewFragment.f75916OoooO0O;
        if (c29718OooO0O0 != null) {
            c29718OooO0O0.OooO0O0(view, pagePreviewVO);
            return true;
        }
        kotlin.jvm.internal.OooOOO0.OooOOOO("morePopupWindow");
        throw null;
    }
}
