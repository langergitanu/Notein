package o0o0O0oO;

import com.orion.notein.p607ui.p609vo.NoteVO;
import com.orion.notein.p607ui.p609vo.NoteVOFilter;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import o0o0O00.C30214OooOoOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;

/* JADX INFO: renamed from: o0o0O0oO.Oooo00O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.trashbin.TrashBinListViewModel$noteList$2", m80623f = "TrashBinListViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C30345Oooo00O extends AbstractC32476OooO implements InterfaceC32510OooOOo0<List<? extends NoteVO>, Integer, Continuation<? super List<? extends NoteVO>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Integer f108202OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ List f108203OooOo0o;

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(List<? extends NoteVO> list, Integer num, Continuation<? super List<? extends NoteVO>> continuation) {
        C30345Oooo00O c30345Oooo00O = new C30345Oooo00O(3, continuation);
        c30345Oooo00O.f108203OooOo0o = list;
        c30345Oooo00O.f108202OooOo = num;
        return c30345Oooo00O.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        List list = this.f108203OooOo0o;
        Integer num = this.f108202OooOo;
        if (num != null) {
            int iIntValue = num.intValue();
            List<NoteVOFilter> list2 = C30214OooOoOO.f107603OooO0oo;
            if (iIntValue < list2.size()) {
                NoteVOFilter noteVOFilter = list2.get(num.intValue());
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (noteVOFilter.getFilterFunction().invoke((NoteVO) obj2).booleanValue()) {
                        arrayList.add(obj2);
                    }
                }
                return arrayList;
            }
        }
        return list;
    }
}
