package o0O0o0oO;

import android.content.Context;
import android.view.View;
import com.orion.editor.p600ui.contextmenu.NoteInContextMenu;
import com.orion.notein.global.R;
import com.orion.penkit.models.DualLinkRefInfo;
import com.orion.penkit.models.DualLinkSourceInfo;
import o0oo0o.InterfaceC31284OooO0O0;

/* JADX INFO: renamed from: o0O0o0oO.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26020OooO0oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public InterfaceC31284OooO0O0 f88852OooO00o = null;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final NoteInContextMenu f88853OooO0O0;

    /* JADX INFO: renamed from: o0O0o0oO.OooO0oo$OooO00o */
    public interface OooO00o {
        void OooO00o(DualLinkRefInfo dualLinkRefInfo);

        void OooO0O0(DualLinkSourceInfo dualLinkSourceInfo);
    }

    public C26020OooO0oo(Context context, final OooO oooO) {
        NoteInContextMenu noteInContextMenu = new NoteInContextMenu(context);
        noteInContextMenu.OooO0OO(R.drawable.editor_menu_item_delete, new View.OnClickListener() { // from class: o0O0o0oO.OooO0oO
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                InterfaceC31284OooO0O0 interfaceC31284OooO0O0 = this.f88851OooOo0o.f88852OooO00o;
                if (interfaceC31284OooO0O0 != null) {
                    boolean z = interfaceC31284OooO0O0 instanceof DualLinkRefInfo;
                    OooO oooO2 = oooO;
                    if (z) {
                        oooO2.OooO00o((DualLinkRefInfo) interfaceC31284OooO0O0);
                    }
                    if (interfaceC31284OooO0O0 instanceof DualLinkSourceInfo) {
                        oooO2.OooO0O0((DualLinkSourceInfo) interfaceC31284OooO0O0);
                    }
                }
            }
        });
        this.f88853OooO0O0 = noteInContextMenu;
    }
}
