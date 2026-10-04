package o0OO00o0;

import com.orion.notein.data.p602db.entity.OutlineEntity;
import java.util.List;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oo0oO0.InterfaceC34877o00OooOo;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.OutlineLocalDataSource$getOutlineByPageIdSync$2", m80623f = "OutlineLocalDataSource.kt", m80624l = {43}, m80625m = "invokeSuspend")
public final class o0o0Oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC34877o00OooOo, Continuation<? super List<? extends OutlineEntity>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f92135OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f92136OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f92137OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0o0Oo(String str, Continuation<? super o0o0Oo> continuation) {
        super(2, continuation);
        this.f92137OooOoO0 = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        o0o0Oo o0o0oo = new o0o0Oo(this.f92137OooOoO0, continuation);
        o0o0oo.f92135OooOo = obj;
        return o0o0oo;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC34877o00OooOo interfaceC34877o00OooOo, Continuation<? super List<? extends OutlineEntity>> continuation) {
        return ((o0o0Oo) create(interfaceC34877o00OooOo, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f92136OooOo0o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return obj;
        }
        C32446OooOOOo.OooO0O0(obj);
        InterfaceC34877o00OooOo interfaceC34877o00OooOo = (InterfaceC34877o00OooOo) this.f92135OooOo;
        this.f92136OooOo0o = 1;
        Object objOooO0o0 = interfaceC34877o00OooOo.OooO0o0(this.f92137OooOoO0, this);
        return objOooO0o0 == enumC32485OooO00o ? enumC32485OooO00o : objOooO0o0;
    }
}
