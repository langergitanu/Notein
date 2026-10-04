package o0OO00o0;

import com.orion.notein.data.p602db.entity.CommentUpdateQuoteEntity;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oo0oO0.InterfaceC34739OoooOo0;

/* JADX INFO: renamed from: o0OO00o0.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.CommentLocalDataSource$updateCommentQuoteId$2", m80623f = "CommentLocalDataSource.kt", m80624l = {128}, m80625m = "invokeSuspend")
public final class C26477OooO0oO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC34739OoooOo0, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f90992OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f90993OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ String f90994OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f90995OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26477OooO0oO(String str, String str2, Continuation<? super C26477OooO0oO> continuation) {
        super(2, continuation);
        this.f90995OooOoO0 = str;
        this.f90994OooOoO = str2;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C26477OooO0oO c26477OooO0oO = new C26477OooO0oO(this.f90995OooOoO0, this.f90994OooOoO, continuation);
        c26477OooO0oO.f90992OooOo = obj;
        return c26477OooO0oO;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC34739OoooOo0 interfaceC34739OoooOo0, Continuation<? super C32460OooOooO> continuation) {
        return ((C26477OooO0oO) create(interfaceC34739OoooOo0, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f90993OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC34739OoooOo0 interfaceC34739OoooOo0 = (InterfaceC34739OoooOo0) this.f90992OooOo;
            CommentUpdateQuoteEntity[] commentUpdateQuoteEntityArr = {new CommentUpdateQuoteEntity(this.f90995OooOoO0, this.f90994OooOoO)};
            this.f90993OooOo0o = 1;
            if (interfaceC34739OoooOo0.OooO0O0(commentUpdateQuoteEntityArr, this) == enumC32485OooO00o) {
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
