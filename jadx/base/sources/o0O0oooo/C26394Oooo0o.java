package o0O0oooo;

import com.orion.notein.domain.models.page.Page;
import kotlin.coroutines.Continuation;
import o0OOo0o.C27449o00O0OoO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0O0oooo.Oooo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.adapter.NoteInCore$addPage$page$1", m80623f = "NoteInCore.kt", m80624l = {3628}, m80625m = "invokeSuspend")
public final class C26394Oooo0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super Page>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C26395Oooo0o0 f90548OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f90549OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f90550OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26394Oooo0o(C26395Oooo0o0 c26395Oooo0o0, String str, Continuation<? super C26394Oooo0o> continuation) {
        super(2, continuation);
        this.f90548OooOo = c26395Oooo0o0;
        this.f90550OooOoO0 = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C26394Oooo0o(this.f90548OooOo, this.f90550OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super Page> continuation) {
        return ((C26394Oooo0o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f90549OooOo0o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return obj;
        }
        C32446OooOOOo.OooO0O0(obj);
        C26395Oooo0o0 c26395Oooo0o0 = this.f90548OooOo;
        C27449o00O0OoO c27449o00O0OoO = c26395Oooo0o0.f90553OooO0O0;
        String str = c26395Oooo0o0.f90552OooO00o.f101667OooO00o;
        this.f90549OooOo0o = 1;
        Object objOooO0Oo = c27449o00O0OoO.f96039OooO0o.OooO0Oo(this.f90550OooOoO0, str, this);
        return objOooO0Oo == enumC32485OooO00o ? enumC32485OooO00o : objOooO0Oo;
    }
}
