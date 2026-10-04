package o0o00oOo;

import com.orion.notein.p607ui.p609vo.NoteVO;
import kotlin.coroutines.Continuation;
import o0OOo0o.C27449o00O0OoO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.NoteListViewModel$removePlaceholder$2", m80623f = "NoteListViewModel.kt", m80624l = {1435}, m80625m = "invokeSuspend")
public final class o0OoOo0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.notelist.OooO0OO f107133OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f107134OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ NoteVO f107135OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OoOo0(com.orion.notein.p607ui.notelist.OooO0OO oooO0OO, NoteVO noteVO, Continuation<? super o0OoOo0> continuation) {
        super(2, continuation);
        this.f107133OooOo = oooO0OO;
        this.f107135OooOoO0 = noteVO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new o0OoOo0(this.f107133OooOo, this.f107135OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((o0OoOo0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f107134OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C27449o00O0OoO c27449o00O0OoO = this.f107133OooOo.f77121OooO0Oo;
            String[] strArr = {this.f107135OooOoO0.getId()};
            this.f107134OooOo0o = 1;
            if (c27449o00O0OoO.Oooo0oO(strArr, this) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
