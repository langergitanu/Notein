package OooooOo;

import android.os.Bundle;
import androidx.fragment.app.InterfaceC21912Oooo0o;
import androidx.lifecycle.o0OoOo0;
import com.orion.notein.p607ui.p609vo.TiledPagePreviewVO;
import com.orion.notein.p607ui.pageeditor.TiledPageListContainerFragment;
import java.util.ArrayList;
import java.util.Iterator;
import o0o0OO.C30367OooO0o0;
import o0o0OO.C30370OooOO0o;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.o00000OO;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: OooooOo.OooOOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C21384OooOOO0 implements InterfaceC21371OooO, InterfaceC21912Oooo0o {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Object f61871OooOo0o;

    public /* synthetic */ C21384OooOOO0(Object obj) {
        this.f61871OooOo0o = obj;
    }

    @Override // OooooOo.InterfaceC21371OooO
    public double OooO00o(double d) {
        C21391OooOo0 this$0 = (C21391OooOo0) this.f61871OooOo0o;
        kotlin.jvm.internal.OooOOO0.OooO0oO(this$0, "this$0");
        return oO0O00oo.OooOO0.OooO0Oo(this$0.f61884OooOO0O.OooO00o(d), this$0.f61880OooO0o0, this$0.f61879OooO0o);
    }

    @Override // androidx.fragment.app.InterfaceC21912Oooo0o
    public void OooO0OO(Bundle bundle, String str) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(bundle, "bundle");
        String string = bundle.getString("note_title", null);
        if (string == null) {
            return;
        }
        TiledPageListContainerFragment tiledPageListContainerFragment = (TiledPageListContainerFragment) this.f61871OooOo0o;
        Iterable iterable = (Iterable) tiledPageListContainerFragment.Oooo000().f108347OooOo0o.f121747OooOo0o.getValue();
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(((TiledPagePreviewVO) it.next()).getId());
        }
        tiledPageListContainerFragment.Oooo000().OooO(0);
        C30367OooO0o0 c30367OooO0o0Oooo000 = tiledPageListContainerFragment.Oooo000();
        String str2 = tiledPageListContainerFragment.OooOooo().f108714OooO00o;
        o00000OO o00000oo2 = c30367OooO0o0Oooo000.f108327OooO;
        if (o00000oo2 == null || !o00000oo2.isActive()) {
            c30367OooO0o0Oooo000.f108327OooO = C33609OooO0oo.OooO0OO(o0OoOo0.OooO00o(c30367OooO0o0Oooo000), null, null, new C30370OooOO0o(arrayList, c30367OooO0o0Oooo000, string, str2, null), 3);
        }
    }
}
