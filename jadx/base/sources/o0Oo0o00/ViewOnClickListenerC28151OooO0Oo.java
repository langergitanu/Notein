package o0Oo0o00;

import Oooo0oO.C21030OooOO0o;
import android.view.View;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import com.orion.notein.p607ui.noteeditor.toolbar.BaseToolbarChildFragment;
import com.orion.notein.p607ui.settings.debug.DebugFragment;
import com.orion.notein.p607ui.stickers.edit.StickerCollectionEditFragment;
import com.orion.notein.p607ui.stickers.edit.StickerCollectionEditFragment.C23854OooO0o0;
import o0000oOO.AbstractC24338OooO0o0;
import o0Oo00o.C28026OooO0OO;
import o0o0OoOO.C30710OooOooO;
import oO0o0OO.C33609OooO0oo;

/* JADX INFO: renamed from: o0Oo0o00.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC28151OooO0Oo implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f99770OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f99771OooOo0o;

    public /* synthetic */ ViewOnClickListenerC28151OooO0Oo(Object obj, int i) {
        this.f99771OooOo0o = i;
        this.f99770OooOo = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object obj = this.f99770OooOo;
        switch (this.f99771OooOo0o) {
            case 0:
                ((oO0O000o.OooO00o) obj).invoke();
                break;
            case 1:
                BaseToolbarChildFragment baseToolbarChildFragment = (BaseToolbarChildFragment) obj;
                baseToolbarChildFragment.Ooooo0o();
                baseToolbarChildFragment.OooooOO(2, null);
                break;
            case 2:
                AbstractC24338OooO0o0.OooO00o<Boolean> oooO00o = DebugFragment.f79020Oooo0OO;
                C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO((DebugFragment) obj), new C30710OooOooO("key_select_note_for_recover_layer"));
                break;
            default:
                StickerCollectionEditFragment stickerCollectionEditFragment = (StickerCollectionEditFragment) obj;
                InterfaceC21987OooOoo viewLifecycleOwner = stickerCollectionEditFragment.getViewLifecycleOwner();
                kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, stickerCollectionEditFragment.new C23854OooO0o0(null), 3);
                break;
        }
    }
}
