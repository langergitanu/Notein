package o0OOo0o;

import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000.C32501OooO0oO;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0OOo0o.o00o00Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.StickerUseCase$cleanExportStickerCollection$2", m80623f = "StickerUseCase.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C27519o00o00Oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super Boolean>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ String f96445OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C27538o00o0o0O f96446OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27519o00o00Oo(C27538o00o0o0O c27538o00o0o0O, String str, Continuation<? super C27519o00o00Oo> continuation) {
        super(2, continuation);
        this.f96446OooOo0o = c27538o00o0o0O;
        this.f96445OooOo = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27519o00o00Oo(this.f96446OooOo0o, this.f96445OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super Boolean> continuation) {
        return ((C27519o00o00Oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        C27538o00o0o0O c27538o00o0o0O = this.f96446OooOo0o;
        String str = this.f96445OooOo;
        C32501OooO0oO.OooO0Oo(C27538o00o0o0O.OooO0O0(c27538o00o0o0O, str));
        return Boolean.valueOf(C27538o00o0o0O.OooO0OO(c27538o00o0o0O, str).delete());
    }
}
