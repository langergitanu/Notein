package o0OOoO;

import com.facebook.soloader.OooOo;
import com.orion.notein.domain.models.note.Comment;
import java.util.List;
import kotlin.coroutines.Continuation;
import o0OO00o0.OooOo00;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0OOoO.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.comment.CommentUseCase$addComment$2", m80623f = "CommentUseCase.kt", m80624l = {78, 79}, m80625m = "invokeSuspend")
public final class C27703OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ String f97686OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f97687OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ String f97688OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f97689OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ String f97690OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final /* synthetic */ C27710OooO0oo f97691OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ String f97692OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27703OooO00o(String str, String str2, String str3, String str4, String str5, C27710OooO0oo c27710OooO0oo, Continuation<? super C27703OooO00o> continuation) {
        super(2, continuation);
        this.f97686OooOo = str;
        this.f97689OooOoO0 = str2;
        this.f97688OooOoO = str3;
        this.f97690OooOoOO = str4;
        this.f97692OooOoo0 = str5;
        this.f97691OooOoo = c27710OooO0oo;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27703OooO00o(this.f97686OooOo, this.f97689OooOoO0, this.f97688OooOoO, this.f97690OooOoOO, this.f97692OooOoo0, this.f97691OooOoo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C27703OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0053, code lost:
    
        if (r4.OooO0o0(r3, r20) == r1) goto L15;
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f97687OooOo0o;
        String str = this.f97690OooOoOO;
        C27710OooO0oo c27710OooO0oo = this.f97691OooOoo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            Comment comment = new Comment(this.f97686OooOo, this.f97689OooOoO0, this.f97688OooOoO, this.f97690OooOoOO, this.f97692OooOoo0, 0L, 0L, null, 224, null);
            OooOo00 oooOo00 = c27710OooO0oo.f97721OooO00o;
            List listOooO0oO = OooOo.OooO0oO(comment);
            this.f97687OooOo0o = 1;
            if (oooOo00.OooO00o(str, listOooO0oO, this) != enumC32485OooO00o) {
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
        this.f97687OooOo0o = 2;
    }
}
