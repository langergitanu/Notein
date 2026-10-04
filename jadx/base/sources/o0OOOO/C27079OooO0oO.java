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

/* JADX INFO: renamed from: o0OOOO.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.user.datasource.NoteinFirebaseUserLocalDataSource$getUserByFirebaseUidSync$2", m80623f = "NoteinFirebaseUserLocalDataSource.kt", m80624l = {140}, m80625m = "invokeSuspend")
public final class C27079OooO0oO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super NoteinFirebaseUserEntity>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C27081OooOO0o f94276OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f94277OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f94278OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27079OooO0oO(C27081OooOO0o c27081OooOO0o, String str, Continuation<? super C27079OooO0oO> continuation) {
        super(2, continuation);
        this.f94276OooOo = c27081OooOO0o;
        this.f94278OooOoO0 = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27079OooO0oO(this.f94276OooOo, this.f94278OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super NoteinFirebaseUserEntity> continuation) {
        return ((C27079OooO0oO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f94277OooOo0o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return obj;
        }
        C32446OooOOOo.OooO0O0(obj);
        C27081OooOO0o c27081OooOO0o = this.f94276OooOo;
        this.f94277OooOo0o = 1;
        Object objOooO0o0 = c27081OooOO0o.f94290OooO00o.OooO0o0(this.f94278OooOoO0, this);
        return objOooO0o0 == enumC32485OooO00o ? enumC32485OooO00o : objOooO0o0;
    }
}
