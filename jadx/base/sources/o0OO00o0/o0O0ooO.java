package o0OO00o0;

import java.util.List;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oo0oO0.AbstractC34767o0000oOO;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.ImageLocalDataSource$deleteImageByIds$2", m80623f = "ImageLocalDataSource.kt", m80624l = {47}, m80625m = "invokeSuspend")
public final class o0O0ooO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<AbstractC34767o0000oOO, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f92113OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f92114OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ List<String> f92115OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0ooO(List<String> list, Continuation<? super o0O0ooO> continuation) {
        super(2, continuation);
        this.f92115OooOoO0 = list;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        o0O0ooO o0o0ooo = new o0O0ooO(this.f92115OooOoO0, continuation);
        o0o0ooo.f92113OooOo = obj;
        return o0o0ooo;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(AbstractC34767o0000oOO abstractC34767o0000oOO, Continuation<? super C32460OooOooO> continuation) {
        return ((o0O0ooO) create(abstractC34767o0000oOO, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f92114OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            AbstractC34767o0000oOO abstractC34767o0000oOO = (AbstractC34767o0000oOO) this.f92113OooOo;
            this.f92114OooOo0o = 1;
            if (abstractC34767o0000oOO.OooO0O0(this.f92115OooOoO0, this) == enumC32485OooO00o) {
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
