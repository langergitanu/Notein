package o0OO00o0;

import com.orion.notein.data.p602db.entity.CommentEntity;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oo0oO0.InterfaceC34739OoooOo0;

/* JADX INFO: renamed from: o0OO00o0.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.CommentLocalDataSource$getCommentSync$2", m80623f = "CommentLocalDataSource.kt", m80624l = {81}, m80625m = "invokeSuspend")
public final class C26475OooO0Oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC34739OoooOo0, Continuation<? super CommentEntity>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f90984OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f90985OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f90986OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26475OooO0Oo(String str, Continuation<? super C26475OooO0Oo> continuation) {
        super(2, continuation);
        this.f90986OooOoO0 = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C26475OooO0Oo c26475OooO0Oo = new C26475OooO0Oo(this.f90986OooOoO0, continuation);
        c26475OooO0Oo.f90984OooOo = obj;
        return c26475OooO0Oo;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC34739OoooOo0 interfaceC34739OoooOo0, Continuation<? super CommentEntity> continuation) {
        return ((C26475OooO0Oo) create(interfaceC34739OoooOo0, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f90985OooOo0o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return obj;
        }
        C32446OooOOOo.OooO0O0(obj);
        InterfaceC34739OoooOo0 interfaceC34739OoooOo0 = (InterfaceC34739OoooOo0) this.f90984OooOo;
        this.f90985OooOo0o = 1;
        Object objOooO = interfaceC34739OoooOo0.OooO(this.f90986OooOoO0, this);
        return objOooO == enumC32485OooO00o ? enumC32485OooO00o : objOooO;
    }
}
