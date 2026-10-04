package o0o0OO0o;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.orion.notein.p607ui.p609vo.TiledPagePreviewVOFilter;
import com.orion.notein.p607ui.pageeditor.TiledPageListContainerFragment;
import com.orion.notein.p607ui.pageeditor.TiledPageListFragment;
import java.util.List;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: renamed from: o0o0OO0o.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30454OooO0OO extends o00O00OO.OooO0O0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final List<TiledPagePreviewVOFilter> f108749OooO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30454OooO0OO(TiledPageListContainerFragment tiledPageListContainerFragment, List data) {
        super(tiledPageListContainerFragment);
        OooOOO0.OooO0oO(data, "data");
        this.f108749OooO = data;
    }

    @Override // o00O00OO.OooO0O0
    public final Fragment OooO0o0(int i) {
        TiledPageListFragment tiledPageListFragment = new TiledPageListFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable("filter", this.f108749OooO.get(i));
        tiledPageListFragment.setArguments(bundle);
        return tiledPageListFragment;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final int getItemCount() {
        return this.f108749OooO.size();
    }
}
