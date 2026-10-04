package o0OoOoo0;

import android.view.View;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.LockNoteFragment;
import com.orion.notein.p607ui.noteeditor.editortab.LatestOpenedNoteTabFragment;
import com.orion.notein.p607ui.p609vo.LatestOpenedNoteVO;
import oO00ooO.C32460OooOooO;
import oO0o0OO.C33609OooO0oo;

/* JADX INFO: renamed from: o0OoOoo0.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC29233OooO0oo implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ InterfaceC21987OooOoo f103660OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ LatestOpenedNoteTabFragment f103661OooOo0o;

    public /* synthetic */ ViewOnClickListenerC29233OooO0oo(LatestOpenedNoteTabFragment latestOpenedNoteTabFragment, InterfaceC21987OooOoo interfaceC21987OooOoo) {
        this.f103661OooOo0o = latestOpenedNoteTabFragment;
        this.f103660OooOo = interfaceC21987OooOoo;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object tag = view.getTag();
        kotlin.jvm.internal.OooOOO0.OooO0o0(tag, "null cannot be cast to non-null type com.orion.notein.ui.vo.LatestOpenedNoteVO");
        final LatestOpenedNoteVO latestOpenedNoteVO = (LatestOpenedNoteVO) tag;
        int id = view.getId();
        final LatestOpenedNoteTabFragment latestOpenedNoteTabFragment = this.f103661OooOo0o;
        if (id != R.id.iv_delete) {
            if (id != R.id.tv_title) {
                return;
            }
            LockNoteFragment.OooOoo(latestOpenedNoteTabFragment.OooOoo(), C21989OooOooO.OooO00o(this.f103660OooOo), com.facebook.soloader.OooOo.OooO0oO(latestOpenedNoteVO.getNoteId()), new oO0O000o.OooO00o() { // from class: o0OoOoo0.OooOO0O
                @Override // oO0O000o.OooO00o
                public final Object invoke() {
                    latestOpenedNoteTabFragment.OooOoOO().OooOOoo(latestOpenedNoteVO.getNoteId());
                    return C32460OooOooO.f116667OooO00o;
                }
            });
        } else {
            androidx.lifecycle.OooOo oooOo = latestOpenedNoteTabFragment.f74472Oooo0;
            if (oooOo != null) {
                C33609OooO0oo.OooO0OO(oooOo, null, null, new C29239OooOOOO(latestOpenedNoteTabFragment, latestOpenedNoteVO, null), 3);
            } else {
                kotlin.jvm.internal.OooOOO0.OooOOOO("lifecycleScope");
                throw null;
            }
        }
    }
}
