package o0OOo0o;

import android.net.Uri;
import kotlin.coroutines.Continuation;
import o0OoO0oo.C28692OooO0oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0O0o.C33599OooOo0O;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0OOo0o.o00OoOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.PdfFileUseCase$isCajFile$2", m80623f = "PdfFileUseCase.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C27492o00OoOOO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super Boolean>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Uri f96345OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C27499o00Ooo0 f96346OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27492o00OoOOO(Uri uri, Continuation continuation, C27499o00Ooo0 c27499o00Ooo0) {
        super(2, continuation);
        this.f96346OooOo0o = c27499o00Ooo0;
        this.f96345OooOo = uri;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27492o00OoOOO(this.f96345OooOo, continuation, this.f96346OooOo0o);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super Boolean> continuation) {
        return ((C27492o00OoOOO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        String strOooO0OO = C28692OooO0oo.OooO0OO(this.f96346OooOo0o.f96374OooO00o, this.f96345OooOo);
        return Boolean.valueOf(strOooO0OO.length() == 0 ? false : C33599OooOo0O.Ooooo00(strOooO0OO, ".").equals("caj"));
    }
}
