package o0OOo0oO;

import kotlin.coroutines.Continuation;
import o0OOo0Oo.InterfaceC27309OooOoO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0OOo0oO.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.audio.AudioUseCase$updateNoteLastModificationTime$2", m80623f = "AudioUseCase.kt", m80624l = {38, 41}, m80625m = "invokeSuspend")
public final class C27609OooO0Oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C27610OooO0o0 f97081OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f97082OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f97083OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27609OooO0Oo(C27610OooO0o0 c27610OooO0o0, String str, Continuation<? super C27609OooO0Oo> continuation) {
        super(2, continuation);
        this.f97081OooOo = c27610OooO0o0;
        this.f97083OooOoO0 = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27609OooO0Oo(this.f97081OooOo, this.f97083OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C27609OooO0Oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003c, code lost:
    
        if (r5.f97085OooO0O0.OooOOO(r2, r7, r6) == r0) goto L15;
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f97082OooOo0o;
        String str = this.f97083OooOoO0;
        C27610OooO0o0 c27610OooO0o0 = this.f97081OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC27309OooOoO interfaceC27309OooOoO = c27610OooO0o0.f97086OooO0OO;
            this.f97082OooOo0o = 1;
            if (interfaceC27309OooOoO.OooO0o(str, this) != enumC32485OooO00o) {
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
        String strOooO0Oo = c27610OooO0o0.f97087OooO0Oo.OooO0Oo();
        this.f97082OooOo0o = 2;
    }
}
