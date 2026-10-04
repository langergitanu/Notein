package o0Ooo0oo;

import androidx.recyclerview.widget.RecyclerView;
import com.orion.notein.p607ui.noteeditor.penbar.PenBarChildFragment;
import com.orion.notein.p607ui.noteeditor.toolbox.VectorVO;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: o0Ooo0oo.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class RunnableC29445OooO0oO implements Runnable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ PenBarChildFragment f104501OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ ArrayList f104502OooOo0o;

    public /* synthetic */ RunnableC29445OooO0oO(ArrayList arrayList, PenBarChildFragment penBarChildFragment) {
        this.f104502OooOo0o = arrayList;
        this.f104501OooOo = penBarChildFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = PenBarChildFragment.f75240o0000OOo;
        Iterator it = this.f104502OooOo0o.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            } else if (((VectorVO) it.next()).getSelected()) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 > -1) {
            RecyclerView recyclerView = this.f104501OooOo.f75275Oooooo;
            if (recyclerView != null) {
                recyclerView.scrollToPosition(i2);
            } else {
                kotlin.jvm.internal.OooOOO0.OooOOOO("rvVectorList");
                throw null;
            }
        }
    }
}
