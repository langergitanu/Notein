package o0OOoO;

import java.util.List;
import kotlin.coroutines.Continuation;
import o0OO00o0.C26479OooOO0o;
import o0OO00o0.OooOo00;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0OOoO.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.comment.CommentUseCase$deleteComments$2", m80623f = "CommentUseCase.kt", m80624l = {117, 118}, m80625m = "invokeSuspend")
public final class C27705OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C27710OooO0oo f97697OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f97698OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ String f97699OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ List<String> f97700OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27705OooO0OO(C27710OooO0oo c27710OooO0oo, List<String> list, String str, Continuation<? super C27705OooO0OO> continuation) {
        super(2, continuation);
        this.f97697OooOo = c27710OooO0oo;
        this.f97700OooOoO0 = list;
        this.f97699OooOoO = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27705OooO0OO(this.f97697OooOo, this.f97700OooOoO0, this.f97699OooOoO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C27705OooO0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004b, code lost:
    
        if (r3.OooO0o0(r2, r7) == r0) goto L21;
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f97698OooOo0o;
        String str = this.f97699OooOoO;
        C27710OooO0oo c27710OooO0oo = this.f97697OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            OooOo00 oooOo00 = c27710OooO0oo.f97721OooO00o;
            this.f97698OooOo0o = 1;
            List<String> list = this.f97700OooOoO0;
            C26479OooOO0o c26479OooOO0o = oooOo00.f91041OooO00o;
            c26479OooOO0o.getClass();
            Object objOooO00o = c26479OooOO0o.OooO00o(str, new o0OO00o0.OooO0O0(list, null));
            if (objOooO00o != enumC32485OooO00o) {
                objOooO00o = C32460OooOooO.f116667OooO00o;
            }
            if (objOooO00o != enumC32485OooO00o) {
                objOooO00o = C32460OooOooO.f116667OooO00o;
            }
            if (objOooO00o != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return C32460OooOooO.f116667OooO00o;
        }
        C32446OooOOOo.OooO0O0(obj);
        this.f97698OooOo0o = 2;
    }
}
