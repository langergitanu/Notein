package com.orion.notein.p607ui.noteeditor.propertypanel.comment;

import androidx.recyclerview.widget.C22041OooOOo;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO00o extends C22041OooOOo.AbstractC22044OooO0oO {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final InterfaceC19367OooO00o f75792OooO0o0;

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.propertypanel.comment.OooO00o$OooO00o, reason: collision with other inner class name */
    public interface InterfaceC19367OooO00o {
        void OooO00o();

        void OooO0O0();

        void onMove(int i, int i2);
    }

    public OooO00o(InterfaceC19367OooO00o interfaceC19367OooO00o) {
        super(3);
        this.f75792OooO0o0 = interfaceC19367OooO00o;
    }

    @Override // androidx.recyclerview.widget.C22041OooOOo.AbstractC22042OooO0Oo
    public final void OooO0OO(RecyclerView recyclerView, RecyclerView.AbstractC22078OooOooO viewHolder) {
        OooOOO0.OooO0oO(recyclerView, "recyclerView");
        OooOOO0.OooO0oO(viewHolder, "viewHolder");
        super.OooO0OO(recyclerView, viewHolder);
        this.f75792OooO0o0.OooO0O0();
    }

    @Override // androidx.recyclerview.widget.C22041OooOOo.AbstractC22042OooO0Oo
    public final void OooOOO(RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO, int i) {
        if (i == 2) {
            this.f75792OooO0o0.OooO00o();
        }
    }

    @Override // androidx.recyclerview.widget.C22041OooOOo.AbstractC22042OooO0Oo
    public final boolean OooOOO0(RecyclerView recyclerView, RecyclerView.AbstractC22078OooOooO viewHolder, RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO) {
        OooOOO0.OooO0oO(recyclerView, "recyclerView");
        OooOOO0.OooO0oO(viewHolder, "viewHolder");
        this.f75792OooO0o0.onMove(viewHolder.getBindingAdapterPosition(), abstractC22078OooOooO.getBindingAdapterPosition());
        return true;
    }

    @Override // androidx.recyclerview.widget.C22041OooOOo.AbstractC22042OooO0Oo
    public final void OooOOOO(RecyclerView.AbstractC22078OooOooO viewHolder) {
        OooOOO0.OooO0oO(viewHolder, "viewHolder");
    }

    public OooO00o(InterfaceC19367OooO00o interfaceC19367OooO00o, int i) {
        super(i);
        this.f75792OooO0o0 = interfaceC19367OooO00o;
    }
}
