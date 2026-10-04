package o0OO00o0;

import com.huawei.hms.network.embedded.C18250l0;
import kotlin.coroutines.Continuation;
import o0000oOO.AbstractC24338OooO0o0;
import o00o00O0.C25252OooO0Oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.InterfaceC33721OooO0o;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.LockNoteRepoImpl$shouldLockNote$2", m80623f = "LockNoteRepoImpl.kt", m80624l = {73}, m80625m = "invokeSuspend")
public final class oo0O extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super Boolean>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ o00OO f92174OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f92175OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo0O(o00OO o00oo2, Continuation<? super oo0O> continuation) {
        super(2, continuation);
        this.f92174OooOo = o00oo2;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new oo0O(this.f92174OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super Boolean> continuation) {
        return ((oo0O) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f92175OooOo0o;
        boolean z = true;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC33721OooO0o<AbstractC24338OooO0o0> data = this.f92174OooOo.f91779OooO00o.getData();
            this.f92175OooOo0o = 1;
            obj = C25252OooO0Oo.OooOOo(data, this);
            if (obj == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        Long l = (Long) ((AbstractC24338OooO0o0) obj).OooO0OO(o00OO.f91778OooO0O0);
        long jLongValue = l != null ? l.longValue() : 0L;
        if (jLongValue == -1 || (jLongValue != 0 && System.currentTimeMillis() - jLongValue < C18250l0.g.f55491e)) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
