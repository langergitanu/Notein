package o0o00oOo;

import com.orion.notein.p607ui.p609vo.NoteVO;
import kotlin.coroutines.Continuation;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0o00oOo.Oooo0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.NoteListViewModel$createScratch$2", m80623f = "NoteListViewModel.kt", m80624l = {1182}, m80625m = "invokeSuspend")
public final class C30059Oooo0o0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super String>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.notelist.OooO0OO f106927OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f106928OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f106929OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30059Oooo0o0(com.orion.notein.p607ui.notelist.OooO0OO oooO0OO, String str, Continuation<? super C30059Oooo0o0> continuation) {
        super(2, continuation);
        this.f106927OooOo = oooO0OO;
        this.f106929OooOoO0 = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30059Oooo0o0(this.f106927OooOo, this.f106929OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super String> continuation) {
        return ((C30059Oooo0o0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f106928OooOo0o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return obj;
        }
        C32446OooOOOo.OooO0O0(obj);
        com.orion.notein.p607ui.notelist.OooO0OO oooO0OO = this.f106927OooOo;
        NoteVO noteVO = (NoteVO) ((C32443OooOOO) oooO0OO.f77161OoooO00.getValue()).f116638OooOo0o;
        String id = noteVO != null ? noteVO.getId() : null;
        this.f106928OooOo0o = 1;
        Object objOooO0oo = oooO0OO.f77123OooO0o0.OooO0oo(this.f106929OooOoO0, id, this);
        return objOooO0oo == enumC32485OooO00o ? enumC32485OooO00o : objOooO0oo;
    }
}
