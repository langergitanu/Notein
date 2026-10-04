package o0O0o0oO;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import com.orion.editor.p600ui.contextmenu.NoteInContextMenu;
import com.orion.notein.global.R;

/* JADX INFO: loaded from: classes9.dex */
public final class o000oOoO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final NoteInContextMenu f88979OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f88980OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f88981OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final C26017OooO0o f88982OooO0Oo;

    public o000oOoO(Context context, final C26017OooO0o c26017OooO0o) {
        NoteInContextMenu noteInContextMenu = new NoteInContextMenu(context);
        noteInContextMenu.OooO0OO(R.drawable.editor_menu_item_paste, new View.OnClickListener() { // from class: o0O0o0oO.OoooO
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                o000oOoO o000oooo2 = this.f88922OooOo0o;
                o000oooo2.getClass();
                c26017OooO0o.OooO00o(new Point(o000oooo2.f88980OooO0O0, o000oooo2.f88981OooO0OO), true);
            }
        });
        noteInContextMenu.OooO0OO(R.drawable.editor_menu_item_clear_clipboard, new ViewOnClickListenerC26049OoooOO0(c26017OooO0o, 0));
        this.f88979OooO00o = noteInContextMenu;
        this.f88982OooO0Oo = c26017OooO0o;
    }

    public final void OooO00o(int i, int i2) {
        C26017OooO0o c26017OooO0o = this.f88982OooO0Oo;
        if (c26017OooO0o != null) {
            c26017OooO0o.OooO00o(new Point(i, i2), false);
        }
    }
}
