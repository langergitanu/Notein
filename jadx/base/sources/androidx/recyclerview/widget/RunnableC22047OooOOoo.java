package androidx.recyclerview.widget;

import androidx.recyclerview.widget.C22041OooOOo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.recyclerview.widget.OooOOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC22047OooOOoo implements Runnable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C22041OooOOo f66009OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C22041OooOOo.OooO0OO f66010OooOo0o;

    public RunnableC22047OooOOoo(C22041OooOOo c22041OooOOo, C22041OooOOo.OooO0OO oooO0OO, int i) {
        this.f66009OooOo = c22041OooOOo;
        this.f66010OooOo0o = oooO0OO;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C22041OooOOo c22041OooOOo = this.f66009OooOo;
        RecyclerView recyclerView = c22041OooOOo.f65958OooOOo;
        if (recyclerView == null || !recyclerView.isAttachedToWindow()) {
            return;
        }
        C22041OooOOo.OooO0OO oooO0OO = this.f66010OooOo0o;
        if (oooO0OO.f65988OooOO0O) {
            return;
        }
        RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO = oooO0OO.f65984OooO0o0;
        if (abstractC22078OooOooO.getAbsoluteAdapterPosition() != -1) {
            RecyclerView.AbstractC22064OooOO0o itemAnimator = c22041OooOOo.f65958OooOOo.getItemAnimator();
            if (itemAnimator == null || !itemAnimator.OooOO0()) {
                ArrayList arrayList = c22041OooOOo.f65957OooOOOo;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    if (((C22041OooOOo.OooO0o) arrayList.get(i)).f65989OooOO0o) {
                    }
                }
                c22041OooOOo.f65955OooOOO0.OooOOOO(abstractC22078OooOooO);
                return;
            }
            c22041OooOOo.f65958OooOOo.post(this);
        }
    }
}
