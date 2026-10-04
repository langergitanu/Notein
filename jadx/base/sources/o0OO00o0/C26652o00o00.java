package o0OO00o0;

import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oo0oO0.AbstractC34993o0ooOoOO;

/* JADX INFO: renamed from: o0OO00o0.o00o00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.StrokeLocalDataSource$getStrokesCountByPageIdSync$2", m80623f = "StrokeLocalDataSource.kt", m80624l = {142}, m80625m = "invokeSuspend")
public final class C26652o00o00 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<AbstractC34993o0ooOoOO, Continuation<? super Long>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f91981OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f91982OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f91983OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26652o00o00(String str, Continuation<? super C26652o00o00> continuation) {
        super(2, continuation);
        this.f91983OooOoO0 = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C26652o00o00 c26652o00o00 = new C26652o00o00(this.f91983OooOoO0, continuation);
        c26652o00o00.f91981OooOo = obj;
        return c26652o00o00;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(AbstractC34993o0ooOoOO abstractC34993o0ooOoOO, Continuation<? super Long> continuation) {
        return ((C26652o00o00) create(abstractC34993o0ooOoOO, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f91982OooOo0o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return obj;
        }
        C32446OooOOOo.OooO0O0(obj);
        AbstractC34993o0ooOoOO abstractC34993o0ooOoOO = (AbstractC34993o0ooOoOO) this.f91981OooOo;
        this.f91982OooOo0o = 1;
        Object objOooO0oO = abstractC34993o0ooOoOO.OooO0oO(this.f91983OooOoO0, this);
        return objOooO0oO == enumC32485OooO00o ? enumC32485OooO00o : objOooO0oO;
    }
}
