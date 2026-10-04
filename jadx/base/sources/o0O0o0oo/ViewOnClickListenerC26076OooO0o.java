package o0O0o0oo;

import Oooo0.C20857Oooooo;
import android.graphics.Rect;
import android.view.View;
import com.orion.editor.p600ui.contextmenu.NoteInContextMenu;
import com.orion.notein.p607ui.noteeditor.toolbox.PenBox;
import java.util.ArrayList;
import o0o00o0O.C29947OooO0OO;

/* JADX INFO: renamed from: o0O0o0oo.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class ViewOnClickListenerC26076OooO0o implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f89029OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f89030OooOo0o;

    public /* synthetic */ ViewOnClickListenerC26076OooO0o(Object obj, int i) {
        this.f89030OooOo0o = i;
        this.f89029OooOo = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        View view2;
        switch (this.f89030OooOo0o) {
            case 0:
                C26085OooOOOO c26085OooOOOO = (C26085OooOOOO) this.f89029OooOo;
                if (c26085OooOOOO.f89047OooO00o.f89026OooO00o.isShowing()) {
                    c26085OooOOOO.f89047OooO00o.f89026OooO00o.dismiss();
                    return;
                }
                ArrayList arrayListOooO00o = c26085OooOOOO.f89048OooO0O0.OooO00o();
                C26075OooO0Oo c26075OooO0Oo = c26085OooOOOO.f89047OooO00o;
                c26075OooO0Oo.f89028OooO0OO.OooO0Oo(arrayListOooO00o);
                NoteInContextMenu noteInContextMenu = c26085OooOOOO.f89054OooO0oo;
                int iOooO0O0 = C20857Oooooo.OooO0O0(noteInContextMenu.getContext(), 96);
                Rect rect = new Rect();
                noteInContextMenu.getGlobalVisibleRect(rect);
                c26075OooO0Oo.f89026OooO00o.showAtLocation(noteInContextMenu, 0, rect.left, rect.top - iOooO0O0);
                o00O00O.OooO0O0 oooO0O0 = c26075OooO0Oo.f89027OooO0O0;
                if (oooO0O0 == null || (view2 = ((C26085OooOOOO) oooO0O0.f84088OooOo).f89051OooO0o) == null) {
                    return;
                }
                view2.setRotation(180);
                return;
            default:
                PenBox penBox = (PenBox) this.f89029OooOo;
                C29947OooO0OO c29947OooO0OO = penBox.f76768Ooooo0o;
                if (c29947OooO0OO == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("eraserSettingsPopupWindow");
                    throw null;
                }
                c29947OooO0OO.dismiss();
                View.OnClickListener onClickListener = penBox.penActionButtonClickListener;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                    return;
                }
                return;
        }
    }
}
