package o0OOo0o;

import android.net.Uri;
import kotlin.coroutines.Continuation;
import o0OO00o0.C26596o00O0o0;
import o0OO00o0.C26684o00oOOo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: renamed from: o0OOo0o.o00OOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.NoteUseCase$saveSVGToPath$2", m80623f = "NoteUseCase.kt", m80624l = {2087}, m80625m = "invokeSuspend")
public final class C27469o00OOOo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super Boolean>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C27449o00O0OoO f96224OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f96225OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ String f96226OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Uri f96227OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27469o00OOOo(C27449o00O0OoO c27449o00O0OoO, Uri uri, String str, Continuation<? super C27469o00OOOo> continuation) {
        super(2, continuation);
        this.f96224OooOo = c27449o00O0OoO;
        this.f96227OooOoO0 = uri;
        this.f96226OooOoO = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27469o00OOOo(this.f96224OooOo, this.f96227OooOoO0, this.f96226OooOoO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super Boolean> continuation) {
        return ((C27469o00OOOo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f96225OooOo0o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return obj;
        }
        C32446OooOOOo.OooO0O0(obj);
        C26596o00O0o0 c26596o00O0o0 = this.f96224OooOo.f96047OooOOO0;
        this.f96225OooOo0o = 1;
        String str = this.f96226OooOoO;
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C26684o00oOOo(c26596o00O0o0, this.f96227OooOoO0, str, null), this);
        return objOooO0o == enumC32485OooO00o ? enumC32485OooO00o : objOooO0o;
    }
}
