package o0o00oOo;

import com.orion.notein.domain.models.note.NotePlaceHolder;
import com.orion.notein.p607ui.p609vo.NoteVO;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.NoteListViewModel$_notePlaceHolders$1", m80623f = "NoteListViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class Oooo0 extends AbstractC32476OooO implements InterfaceC32510OooOOo0<C32443OooOOO<? extends NoteVO, ? extends NoteVO>, List<? extends NotePlaceHolder>, Continuation<? super List<? extends NotePlaceHolder>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ List f106881OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ C32443OooOOO f106882OooOo0o;

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(C32443OooOOO<? extends NoteVO, ? extends NoteVO> c32443OooOOO, List<? extends NotePlaceHolder> list, Continuation<? super List<? extends NotePlaceHolder>> continuation) {
        Oooo0 oooo0 = new Oooo0(3, continuation);
        oooo0.f106882OooOo0o = c32443OooOOO;
        oooo0.f106881OooOo = list;
        return oooo0.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        C32443OooOOO c32443OooOOO = this.f106882OooOo0o;
        List list = this.f106881OooOo;
        NoteVO noteVO = (NoteVO) c32443OooOOO.f116638OooOo0o;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (kotlin.jvm.internal.OooOOO0.OooO0O0(((NotePlaceHolder) obj2).getParentId(), noteVO != null ? noteVO.getId() : null)) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : arrayList) {
            NotePlaceHolder notePlaceHolder = (NotePlaceHolder) obj3;
            if (notePlaceHolder.getState() != 4 && notePlaceHolder.getState() != 3 && notePlaceHolder.getState() != 2) {
                arrayList2.add(obj3);
            }
        }
        return arrayList2;
    }
}
