package o0o0O0o0;

import com.orion.notein.p607ui.p609vo.NoteVO;
import com.orion.notein.p607ui.p609vo.NoteVOFilter;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import o0o0O00.C30214OooOoOO;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;

/* JADX INFO: renamed from: o0o0O0o0.OooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.search.viewmodel.SearchViewModel$searchResultList$2", m80623f = "SearchViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C30304OooOO0 extends AbstractC32476OooO implements InterfaceC32510OooOOo0<C32443OooOOO<? extends String, ? extends List<? extends NoteVO>>, Integer, Continuation<? super C32443OooOOO<? extends String, ? extends List<? extends NoteVO>>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Integer f108046OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ C32443OooOOO f108047OooOo0o;

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(C32443OooOOO<? extends String, ? extends List<? extends NoteVO>> c32443OooOOO, Integer num, Continuation<? super C32443OooOOO<? extends String, ? extends List<? extends NoteVO>>> continuation) {
        C30304OooOO0 c30304OooOO0 = new C30304OooOO0(3, continuation);
        c30304OooOO0.f108047OooOo0o = c32443OooOOO;
        c30304OooOO0.f108046OooOo = num;
        return c30304OooOO0.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        C32443OooOOO c32443OooOOO = this.f108047OooOo0o;
        Integer num = this.f108046OooOo;
        String str = (String) c32443OooOOO.f116638OooOo0o;
        List list = (List) c32443OooOOO.f116637OooOo;
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
                list = arrayList;
            }
        }
        return new C32443OooOOO(str, list);
    }
}
