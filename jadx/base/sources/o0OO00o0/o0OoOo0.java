package o0OO00o0;

import com.orion.notein.data.p602db.entity.DualLinkSourceEntity;
import java.util.Arrays;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.DualLinkSourceLocalDataSource$updateOldNoteId$2", m80623f = "DualLinkSourceLocalDataSource.kt", m80624l = {94}, m80625m = "invokeSuspend")
public final class o0OoOo0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<oo0oO0.o0O0O00, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f92132OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f92133OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f92134OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OoOo0(String str, Continuation<? super o0OoOo0> continuation) {
        super(2, continuation);
        this.f92134OooOoO0 = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        o0OoOo0 o0oooo02 = new o0OoOo0(this.f92134OooOoO0, continuation);
        o0oooo02.f92132OooOo = obj;
        return o0oooo02;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(oo0oO0.o0O0O00 o0o0o00, Continuation<? super C32460OooOooO> continuation) {
        return ((o0OoOo0) create(o0o0o00, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f92133OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            oo0oO0.o0O0O00 o0o0o00 = (oo0oO0.o0O0O00) this.f92132OooOo;
            DualLinkSourceEntity[] dualLinkSourceEntityArr = (DualLinkSourceEntity[]) o0o0o00.OooO0o0(this.f92134OooOoO0).toArray(new DualLinkSourceEntity[0]);
            DualLinkSourceEntity[] dualLinkSourceEntityArr2 = (DualLinkSourceEntity[]) Arrays.copyOf(dualLinkSourceEntityArr, dualLinkSourceEntityArr.length);
            this.f92133OooOo0o = 1;
            if (o0o0o00.OooO00o(dualLinkSourceEntityArr2, this) == enumC32485OooO00o) {
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
