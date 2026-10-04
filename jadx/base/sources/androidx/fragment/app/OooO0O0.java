package androidx.fragment.app;

import androidx.fragment.app.AbstractC21925OoooOoO;
import androidx.recyclerview.widget.RecyclerView;
import com.orion.notein.p607ui.noteeditor.editortab.LatestOpenedNoteTabFragment;
import com.orion.notein.p607ui.p609vo.LatestOpenedNoteVO;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO0O0 implements Runnable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f64908OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f64909OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Object f64910OooOoO0;

    public /* synthetic */ OooO0O0(int i, Object obj, Object obj2) {
        this.f64909OooOo0o = i;
        this.f64908OooOo = obj;
        this.f64910OooOoO0 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f64909OooOo0o) {
            case 0:
                C21885OooO0Oo this$0 = (C21885OooO0Oo) this.f64908OooOo;
                kotlin.jvm.internal.OooOOO0.OooO0oO(this$0, "this$0");
                AbstractC21925OoooOoO.OooO0OO operation = (AbstractC21925OoooOoO.OooO0OO) this.f64910OooOoO0;
                kotlin.jvm.internal.OooOOO0.OooO0oO(operation, "$operation");
                this$0.OooO00o(operation);
                return;
            default:
                LatestOpenedNoteTabFragment latestOpenedNoteTabFragment = (LatestOpenedNoteTabFragment) this.f64908OooOo;
                String str = (String) latestOpenedNoteTabFragment.OooOoo0().f103736OooO0oO.getValue();
                Iterator it = ((List) this.f64910OooOoO0).iterator();
                int i = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i = -1;
                    } else if (!kotlin.jvm.internal.OooOOO0.OooO0O0(((LatestOpenedNoteVO) it.next()).getNoteId(), str)) {
                        i++;
                    }
                }
                if (i > -1) {
                    RecyclerView recyclerView = latestOpenedNoteTabFragment.f74468OooOoo;
                    if (recyclerView != null) {
                        recyclerView.scrollToPosition(i);
                        return;
                    } else {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("rvTab");
                        throw null;
                    }
                }
                return;
        }
    }
}
