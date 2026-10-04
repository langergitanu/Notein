package o0OOOO;

import com.orion.notein.data.p602db.entity.NoteinFirebaseUserEntity;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oo0oO0.InterfaceC34848o00Oo000;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.user.datasource.NoteinFirebaseUserLocalDataSource$addOrUpdateUser$2", m80623f = "NoteinFirebaseUserLocalDataSource.kt", m80624l = {69}, m80625m = "invokeSuspend")
public final class OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C27081OooOO0o f94263OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f94264OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ NoteinFirebaseUserEntity f94265OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0OO(C27081OooOO0o c27081OooOO0o, NoteinFirebaseUserEntity noteinFirebaseUserEntity, Continuation<? super OooO0OO> continuation) {
        super(2, continuation);
        this.f94263OooOo = c27081OooOO0o;
        this.f94265OooOoO0 = noteinFirebaseUserEntity;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new OooO0OO(this.f94263OooOo, this.f94265OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((OooO0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f94264OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC34848o00Oo000 interfaceC34848o00Oo000 = this.f94263OooOo.f94290OooO00o;
            NoteinFirebaseUserEntity[] noteinFirebaseUserEntityArr = {this.f94265OooOoO0};
            this.f94264OooOo0o = 1;
            if (interfaceC34848o00Oo000.OooO0OO(noteinFirebaseUserEntityArr, this) == enumC32485OooO00o) {
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
