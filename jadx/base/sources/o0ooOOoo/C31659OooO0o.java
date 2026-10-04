package o0ooOOoo;

import androidx.recyclerview.widget.C22041OooOOo;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.OooOOO0;
import o0OoOo.C29196OooO0OO;

/* JADX INFO: renamed from: o0ooOOoo.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31659OooO0o extends C22041OooOOo.AbstractC22044OooO0oO {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ C31660OooO0o0 f113161OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f113162OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31659OooO0o(C31660OooO0o0 c31660OooO0o0) {
        super(3);
        this.f113161OooO0o = c31660OooO0o0;
        this.f113162OooO0o0 = -1;
    }

    @Override // androidx.recyclerview.widget.C22041OooOOo.AbstractC22042OooO0Oo
    public final void OooO0OO(RecyclerView recyclerView, RecyclerView.AbstractC22078OooOooO viewHolder) {
        OooOOO0.OooO0oO(recyclerView, "recyclerView");
        OooOOO0.OooO0oO(viewHolder, "viewHolder");
        super.OooO0OO(recyclerView, viewHolder);
        if (this.f113162OooO0o0 == -1) {
            return;
        }
        Object tag = viewHolder.itemView.getTag();
        OooOOO0.OooO0o0(tag, "null cannot be cast to non-null type com.orion.notein.ui.noteeditor.audio.vo.AudioFileVO");
        C29196OooO0OO c29196OooO0OO = (C29196OooO0OO) tag;
        InterfaceC31656OooO0O0 interfaceC31656OooO0O0 = this.f113161OooO0o.f113165OooO0O0;
        if (interfaceC31656OooO0O0 != null) {
            interfaceC31656OooO0O0.OooO0OO(c29196OooO0OO, null, this.f113162OooO0o0, true);
        }
        this.f113162OooO0o0 = -1;
    }

    @Override // androidx.recyclerview.widget.C22041OooOOo.AbstractC22044OooO0oO, androidx.recyclerview.widget.C22041OooOOo.AbstractC22042OooO0Oo
    public final int OooO0oo(RecyclerView recyclerView, RecyclerView.AbstractC22078OooOooO viewHolder) {
        OooOOO0.OooO0oO(recyclerView, "recyclerView");
        OooOOO0.OooO0oO(viewHolder, "viewHolder");
        if (this.f113161OooO0o.f113167OooO0Oo.f103568OooO0OO) {
            return C22041OooOOo.AbstractC22042OooO0Oo.OooOO0O(this.f65993OooO0Oo);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.C22041OooOOo.AbstractC22042OooO0Oo
    public final boolean OooOOO0(RecyclerView recyclerView, RecyclerView.AbstractC22078OooOooO viewHolder, RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO) {
        OooOOO0.OooO0oO(recyclerView, "recyclerView");
        OooOOO0.OooO0oO(viewHolder, "viewHolder");
        int absoluteAdapterPosition = viewHolder.getAbsoluteAdapterPosition();
        int absoluteAdapterPosition2 = abstractC22078OooOooO.getAbsoluteAdapterPosition();
        Object tag = viewHolder.itemView.getTag();
        OooOOO0.OooO0o0(tag, "null cannot be cast to non-null type com.orion.notein.ui.noteeditor.audio.vo.AudioFileVO");
        C29196OooO0OO c29196OooO0OO = (C29196OooO0OO) tag;
        C31660OooO0o0 c31660OooO0o0 = this.f113161OooO0o;
        InterfaceC31656OooO0O0 interfaceC31656OooO0O0 = c31660OooO0o0.f113165OooO0O0;
        if (interfaceC31656OooO0O0 != null) {
            interfaceC31656OooO0O0.OooO0OO(c29196OooO0OO, Integer.valueOf(absoluteAdapterPosition), absoluteAdapterPosition2, false);
        }
        this.f113162OooO0o0 = absoluteAdapterPosition2;
        c31660OooO0o0.f113167OooO0Oo.notifyItemMoved(absoluteAdapterPosition, absoluteAdapterPosition2);
        return true;
    }

    @Override // androidx.recyclerview.widget.C22041OooOOo.AbstractC22042OooO0Oo
    public final void OooOOOO(RecyclerView.AbstractC22078OooOooO viewHolder) {
        OooOOO0.OooO0oO(viewHolder, "viewHolder");
    }
}
