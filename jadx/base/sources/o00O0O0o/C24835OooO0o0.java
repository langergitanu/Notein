package o00O0O0o;

import androidx.work.CoroutineWorker;
import androidx.work.ListenableWorker;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o00O0O0o.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC32482OooO0o0(m80622c = "androidx.work.CoroutineWorker$startWork$1", m80623f = "CoroutineWorker.kt", m80624l = {68}, m80625m = "invokeSuspend")
public final class C24835OooO0o0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ CoroutineWorker f84248OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f84249OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24835OooO0o0(CoroutineWorker coroutineWorker, Continuation<? super C24835OooO0o0> continuation) {
        super(2, continuation);
        this.f84248OooOo = coroutineWorker;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C24835OooO0o0(this.f84248OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C24835OooO0o0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f84249OooOo0o;
        CoroutineWorker coroutineWorker = this.f84248OooOo;
        try {
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                this.f84249OooOo0o = 1;
                obj = coroutineWorker.OooO0oo(this);
                if (obj == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            coroutineWorker.f66660OooOoo.OooO((ListenableWorker.OooO00o) obj);
        } catch (Throwable th) {
            coroutineWorker.f66660OooOoo.OooOO0(th);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
