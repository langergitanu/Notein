package o0o0OO0O;

import android.view.View;
import com.orion.notein.p607ui.p609vo.TiledPagePreviewVO;
import com.orion.notein.p607ui.p609vo.TiledPagePreviewVOFilter;
import com.orion.notein.p607ui.pageeditor.TiledPageListFragment;

/* JADX INFO: renamed from: o0o0OO0O.OooOoo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnLongClickListenerC30448OooOoo0 implements View.OnLongClickListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ TiledPageListFragment f108728OooO00o;

    public /* synthetic */ ViewOnLongClickListenerC30448OooOoo0(TiledPageListFragment tiledPageListFragment) {
        this.f108728OooO00o = tiledPageListFragment;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        Object tag = view.getTag();
        kotlin.jvm.internal.OooOOO0.OooO0o0(tag, "null cannot be cast to non-null type com.orion.notein.ui.vo.TiledPagePreviewVO");
        TiledPageListFragment tiledPageListFragment = this.f108728OooO00o;
        tiledPageListFragment.OooOoO().OooO0oo(((TiledPagePreviewVO) tag).getId());
        TiledPagePreviewVOFilter tiledPagePreviewVOFilter = tiledPageListFragment.f78588OooOoo;
        if (tiledPagePreviewVOFilter != null) {
            return tiledPagePreviewVOFilter.getReadOnly();
        }
        kotlin.jvm.internal.OooOOO0.OooOOOO("filterVO");
        throw null;
    }
}
