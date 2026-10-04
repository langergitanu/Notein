package o0Ooo0oo;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import com.orion.notein.p607ui.noteeditor.penbar.PenBarChildFragment;
import com.orion.notein.p607ui.notelist.favorite.FavoriteContainerFragment;
import com.orion.notein.p607ui.settings.tool.ToolSettingsFragment;
import com.orion.penkit.tools.DrawToolFactory;
import java.util.concurrent.CancellationException;
import o0oOOoo0.C30872OooOO0O;
import oO0o0OO.C33609OooO0oo;

/* JADX INFO: renamed from: o0Ooo0oo.OooOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC29465OooOoo implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Fragment f104534OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f104535OooOo0o;

    public /* synthetic */ ViewOnClickListenerC29465OooOoo(Fragment fragment, int i) {
        this.f104535OooOo0o = i;
        this.f104534OooOo = fragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Fragment fragment = this.f104534OooOo;
        switch (this.f104535OooOo0o) {
            case 0:
                int i = PenBarChildFragment.f75240o0000OOo;
                ((PenBarChildFragment) fragment).Oooo0oO().OooOO0O(DrawToolFactory.ERASER_TYPE_PIXEL);
                break;
            case 1:
                oO0o0OO.o00000OO o00000oo2 = ((FavoriteContainerFragment) fragment).OooOoo0().f77173OooooOo;
                if (o00000oo2 != null) {
                    o00000oo2.cancel((CancellationException) null);
                }
                break;
            default:
                ToolSettingsFragment toolSettingsFragment = (ToolSettingsFragment) fragment;
                InterfaceC21987OooOoo viewLifecycleOwner = toolSettingsFragment.getViewLifecycleOwner();
                kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new C30872OooOO0O(toolSettingsFragment, null), 3);
                break;
        }
    }
}
