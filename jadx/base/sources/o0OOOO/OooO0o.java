package o0OOOO;

import com.orion.notein.App;
import com.orion.notein.data.p602db.entity.NoteinFirebaseUserEntity;
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
import oOO00oo.C34406OooO00o;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.user.datasource.NoteinFirebaseUserLocalDataSource$getLoggedUserSync$2", m80623f = "NoteinFirebaseUserLocalDataSource.kt", m80624l = {123, 124}, m80625m = "invokeSuspend")
public final class OooO0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super NoteinFirebaseUserEntity>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C27081OooOO0o f94271OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f94272OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0o(Continuation continuation, C27081OooOO0o c27081OooOO0o) {
        super(2, continuation);
        this.f94271OooOo = c27081OooOO0o;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new OooO0o(continuation, this.f94271OooOo);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super NoteinFirebaseUserEntity> continuation) {
        return ((OooO0o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0046, code lost:
    
        if (r6 == r0) goto L18;
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f94272OooOo0o;
        C27081OooOO0o c27081OooOO0o = this.f94271OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC33721OooO0o<AbstractC24338OooO0o0> data = c27081OooOO0o.f94291OooO0O0.getData();
            this.f94272OooOo0o = 1;
            obj = C25252OooO0Oo.OooOOo(data, this);
            if (obj != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            NoteinFirebaseUserEntity noteinFirebaseUserEntity = (NoteinFirebaseUserEntity) obj;
            if (noteinFirebaseUserEntity != null) {
                return noteinFirebaseUserEntity;
            }
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("FirebaseUserLocalDataSource");
            c20358OooO00o.OooOO0O(com.aspose.slides.internal.p332p7.OooO0O0.OooO0O0("getLoggedUserSync: no notein firebase user found. disableNoteinFirebaseUser: ", c27081OooOO0o.OooO00o()), new Object[0]);
            if (c27081OooOO0o.OooO00o()) {
                return NoteinFirebaseUserEntity.INSTANCE.getDUMMY();
            }
            return null;
        }
        C32446OooOOOo.OooO0O0(obj);
        String str = (String) ((AbstractC24338OooO0o0) obj).OooO0OO(App.f69544OooOooO);
        if (str == null) {
            str = "";
        }
        this.f94272OooOo0o = 2;
        obj = c27081OooOO0o.f94290OooO00o.OooO0Oo(str, this);
    }
}
