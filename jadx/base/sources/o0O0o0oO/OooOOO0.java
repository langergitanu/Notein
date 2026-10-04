package o0O0o0oO;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.orion.editor.PDFView;
import com.orion.editor.p600ui.contextmenu.NoteInContextMenu;
import com.orion.notein.global.R;
import com.orion.penkit.models.HyperLinkInfo;
import java.util.Collections;
import o0O0o00.EnumC25982o0000oO;

/* JADX INFO: loaded from: classes9.dex */
public final class OooOOO0 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final NoteInContextMenu f88861OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public HyperLinkInfo f88862OooOo0o = null;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public ViewGroup f88863OooOoO0;

    public OooOOO0(Context context, final OooOOO oooOOO) {
        NoteInContextMenu noteInContextMenu = new NoteInContextMenu(context);
        noteInContextMenu.OooO0OO(R.drawable.editor_menu_item_forward, new View.OnClickListener() { // from class: o0O0o0oO.OooOO0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HyperLinkInfo hyperLinkInfo = this.f88855OooOo0o.f88862OooOo0o;
                if (hyperLinkInfo != null) {
                    PDFView pDFView = oooOOO.f88860OooO00o;
                    pDFView.OooOoO0();
                    pDFView.getTool().OooOO0O();
                    pDFView.OoooO0(hyperLinkInfo, false);
                }
            }
        });
        noteInContextMenu.OooO0OO(R.drawable.editor_menu_item_edit, new View.OnClickListener() { // from class: o0O0o0oO.OooOO0O
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HyperLinkInfo hyperLinkInfo = this.f88857OooOo0o.f88862OooOo0o;
                if (hyperLinkInfo != null) {
                    PDFView pDFView = oooOOO.f88860OooO00o;
                    pDFView.OooOoO0();
                    pDFView.OooooOO(hyperLinkInfo);
                    pDFView.getTool().OooOO0O();
                    pDFView.OoooOo0(o00OO0O0.OooO0O0.OooO0oO(hyperLinkInfo.getBounds(), 0.0f));
                }
            }
        });
        noteInContextMenu.OooO0OO(R.drawable.editor_menu_item_delete, new View.OnClickListener() { // from class: o0O0o0oO.OooOO0o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HyperLinkInfo hyperLinkInfo = this.f88859OooOo0o.f88862OooOo0o;
                if (hyperLinkInfo != null) {
                    PDFView pDFView = oooOOO.f88860OooO00o;
                    pDFView.OooOoO0();
                    pDFView.getTool().OooOO0O();
                    pDFView.invalidate();
                    pDFView.OooOO0O(Collections.singletonList(hyperLinkInfo), Collections.EMPTY_LIST, EnumC25982o0000oO.f88734OooOo);
                }
            }
        });
        this.f88861OooOo = noteInContextMenu;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ViewGroup viewGroup = this.f88863OooOoO0;
        if (viewGroup != null) {
            viewGroup.removeOnAttachStateChangeListener(this);
            this.f88863OooOoO0 = null;
        }
    }
}
