package o0o00oOo;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.orion.notein.p607ui.p609vo.NoteVOFilter;
import com.orion.notein.p607ui.widget.EdgeFragment;
import java.util.List;

/* JADX INFO: renamed from: o0o00oOo.o00000o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C30083o00000o0 extends o00O00OO.OooO0O0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final List<NoteVOFilter> f107061OooO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30083o00000o0(EdgeFragment edgeFragment, List data) {
        super(edgeFragment);
        kotlin.jvm.internal.OooOOO0.OooO0oO(data, "data");
        this.f107061OooO = data;
    }

    @Override // o00O00OO.OooO0O0
    public final Fragment OooO0o0(int i) {
        Fragment fragmentOooOO0 = OooOO0();
        Bundle bundle = new Bundle();
        bundle.putSerializable("filter", this.f107061OooO.get(i));
        fragmentOooOO0.setArguments(bundle);
        return fragmentOooOO0;
    }

    public Fragment OooOO0() {
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final int getItemCount() {
        return this.f107061OooO.size();
    }
}
