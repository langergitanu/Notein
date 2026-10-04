package o0Oo0o00;

import kotlin.coroutines.Continuation;
import o0OOo0oo.C27616OooO0o;
import oO00ooO.C32445OooOOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0Oo0o00.Oooooo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.datasync.CloudSyncViewModel$checkCloudSyncServiceAvailable$2", m80623f = "CloudSyncViewModel.kt", m80624l = {572}, m80625m = "invokeSuspend")
public final class C28205Oooooo0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32445OooOOOO<? extends Boolean>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C28201OooooO0 f99979OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f99980OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28205Oooooo0(C28201OooooO0 c28201OooooO0, Continuation<? super C28205Oooooo0> continuation) {
        super(2, continuation);
        this.f99979OooOo = c28201OooooO0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C28205Oooooo0(this.f99979OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32445OooOOOO<? extends Boolean>> continuation) {
        return ((C28205Oooooo0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        Object objOooO00o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f99980OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C27616OooO0o c27616OooO0o = this.f99979OooOo.f99939OooO0oO;
            this.f99980OooOo0o = 1;
            objOooO00o = c27616OooO0o.OooO00o(this);
            if (objOooO00o == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            objOooO00o = ((C32445OooOOOO) obj).f116639OooOo0o;
        }
        return new C32445OooOOOO(objOooO00o);
    }
}
