package o0OOoO;

import com.facebook.soloader.OooOo;
import java.util.List;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0OOoO.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.comment.CommentUseCase$deleteComment$2", m80623f = "CommentUseCase.kt", m80624l = {110, 111}, m80625m = "invokeSuspend")
public final class C27704OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C27710OooO0oo f97693OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f97694OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ String f97695OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f97696OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27704OooO0O0(C27710OooO0oo c27710OooO0oo, String str, String str2, Continuation<? super C27704OooO0O0> continuation) {
        super(2, continuation);
        this.f97693OooOo = c27710OooO0oo;
        this.f97696OooOoO0 = str;
        this.f97695OooOoO = str2;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27704OooO0O0(this.f97693OooOo, this.f97696OooOoO0, this.f97695OooOoO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C27704OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
    
        if (r3.OooO0o0(r2, r6) == r0) goto L15;
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f97694OooOo0o;
        String str = this.f97695OooOoO;
        C27710OooO0oo c27710OooO0oo = this.f97693OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            List listOooO0oO = OooOo.OooO0oO(this.f97696OooOoO0);
            this.f97694OooOo0o = 1;
            if (c27710OooO0oo.OooO0O0(str, listOooO0oO, this) != enumC32485OooO00o) {
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
        this.f97694OooOo0o = 2;
    }
}
