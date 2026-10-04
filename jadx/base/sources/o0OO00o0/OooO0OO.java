package o0OO00o0;

import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oo0oO0.InterfaceC34739OoooOo0;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.CommentLocalDataSource$deleteCommentByPageId$2", m80623f = "CommentLocalDataSource.kt", m80624l = {75}, m80625m = "invokeSuspend")
public final class OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC34739OoooOo0, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f90981OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f90982OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f90983OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0OO(String str, Continuation<? super OooO0OO> continuation) {
        super(2, continuation);
        this.f90983OooOoO0 = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        OooO0OO oooO0OO = new OooO0OO(this.f90983OooOoO0, continuation);
        oooO0OO.f90981OooOo = obj;
        return oooO0OO;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC34739OoooOo0 interfaceC34739OoooOo0, Continuation<? super C32460OooOooO> continuation) {
        return ((OooO0OO) create(interfaceC34739OoooOo0, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f90982OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC34739OoooOo0 interfaceC34739OoooOo0 = (InterfaceC34739OoooOo0) this.f90981OooOo;
            this.f90982OooOo0o = 1;
            if (interfaceC34739OoooOo0.OooO0o(this.f90983OooOoO0, this) == enumC32485OooO00o) {
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
