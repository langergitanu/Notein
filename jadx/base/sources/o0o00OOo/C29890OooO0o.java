package o0o00OOo;

import androidx.recyclerview.widget.C22041OooOOo;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.OooOOO0;
import o0o000oo.C29825OooOoO0;
import o0o00Oo0.C29909OooO0O0;

/* JADX INFO: renamed from: o0o00OOo.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29890OooO0o extends C22041OooOOo.AbstractC22044OooO0oO {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ C29891OooO0o0 f106033OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f106034OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29890OooO0o(C29891OooO0o0 c29891OooO0o0) {
        super(3);
        this.f106033OooO0o = c29891OooO0o0;
        this.f106034OooO0o0 = -1;
    }

    @Override // androidx.recyclerview.widget.C22041OooOOo.AbstractC22042OooO0Oo
    public final void OooO0OO(RecyclerView recyclerView, RecyclerView.AbstractC22078OooOooO viewHolder) {
        OooOOO0.OooO0oO(recyclerView, "recyclerView");
        OooOOO0.OooO0oO(viewHolder, "viewHolder");
        super.OooO0OO(recyclerView, viewHolder);
        if (this.f106034OooO0o0 == -1) {
            return;
        }
        Object tag = viewHolder.itemView.getTag();
        OooOOO0.OooO0o0(tag, "null cannot be cast to non-null type com.orion.notein.ui.noteeditor.toolbar.vo.ToolbarSettingsItemVO");
        C29909OooO0O0 c29909OooO0O0 = (C29909OooO0O0) tag;
        C29825OooOoO0 c29825OooOoO0 = this.f106033OooO0o.f106037OooO0O0;
        if (c29825OooOoO0 != null) {
            c29825OooOoO0.OooO0O0(c29909OooO0O0, null, this.f106034OooO0o0, true);
        }
        this.f106034OooO0o0 = -1;
    }

    @Override // androidx.recyclerview.widget.C22041OooOOo.AbstractC22044OooO0oO, androidx.recyclerview.widget.C22041OooOOo.AbstractC22042OooO0Oo
    public final int OooO0oo(RecyclerView recyclerView, RecyclerView.AbstractC22078OooOooO viewHolder) {
        OooOOO0.OooO0oO(recyclerView, "recyclerView");
        OooOOO0.OooO0oO(viewHolder, "viewHolder");
        if (this.f106033OooO0o.f106053OooOOoo.f105376OooO0OO) {
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
        if (absoluteAdapterPosition2 < 2) {
            absoluteAdapterPosition2 = 2;
        }
        C29891OooO0o0 c29891OooO0o0 = this.f106033OooO0o;
        if (absoluteAdapterPosition2 >= c29891OooO0o0.f106053OooOOoo.getItemCount()) {
            return false;
        }
        Object tag = viewHolder.itemView.getTag();
        OooOOO0.OooO0o0(tag, "null cannot be cast to non-null type com.orion.notein.ui.noteeditor.toolbar.vo.ToolbarSettingsItemVO");
        C29909OooO0O0 c29909OooO0O0 = (C29909OooO0O0) tag;
        C29825OooOoO0 c29825OooOoO0 = c29891OooO0o0.f106037OooO0O0;
        if (c29825OooOoO0 != null) {
            c29825OooOoO0.OooO0O0(c29909OooO0O0, Integer.valueOf(absoluteAdapterPosition), absoluteAdapterPosition2, false);
        }
        this.f106034OooO0o0 = absoluteAdapterPosition2;
        c29891OooO0o0.f106053OooOOoo.notifyItemMoved(absoluteAdapterPosition, absoluteAdapterPosition2);
        return true;
    }

    @Override // androidx.recyclerview.widget.C22041OooOOo.AbstractC22042OooO0Oo
    public final void OooOOOO(RecyclerView.AbstractC22078OooOooO viewHolder) {
        OooOOO0.OooO0oO(viewHolder, "viewHolder");
    }
}
