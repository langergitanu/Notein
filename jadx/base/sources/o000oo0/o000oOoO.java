package o000oo0;

import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC32482OooO0o0(m80622c = "androidx.room.TriggerBasedInvalidationTracker$refreshInvalidationAsync$3", m80623f = "InvalidationTracker.kt", m80624l = {389}, m80625m = "invokeSuspend")
public final class o000oOoO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C24695OoooO00 f83741OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f83742OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C24659OooO0o f83743OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000oOoO(C24695OoooO00 c24695OoooO00, C24659OooO0o c24659OooO0o, Continuation continuation) {
        super(2, continuation);
        this.f83741OooOo = c24695OoooO00;
        this.f83743OooOoO0 = c24659OooO0o;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new o000oOoO(this.f83741OooOo, this.f83743OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((o000oOoO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f83742OooOo0o;
        C24659OooO0o c24659OooO0o = this.f83743OooOoO0;
        try {
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                C24695OoooO00 c24695OoooO00 = this.f83741OooOo;
                this.f83742OooOo0o = 1;
                obj = C24695OoooO00.OooO0O0(c24695OoooO00, this);
                if (obj == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            c24659OooO0o.invoke();
            return C32460OooOooO.f116667OooO00o;
        } catch (Throwable th) {
            c24659OooO0o.invoke();
            throw th;
        }
    }
}
