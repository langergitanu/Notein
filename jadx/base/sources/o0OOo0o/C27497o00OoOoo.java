package o0OOo0o;

import android.net.Uri;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OOo0o.o00OoOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.PdfFileUseCase$isPptFile$2", m80623f = "PdfFileUseCase.kt", m80624l = {176}, m80625m = "invokeSuspend")
public final class C27497o00OoOoo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super Boolean>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C27499o00Ooo0 f96364OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f96365OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Uri f96366OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27497o00OoOoo(Uri uri, Continuation continuation, C27499o00Ooo0 c27499o00Ooo0) {
        super(2, continuation);
        this.f96364OooOo = c27499o00Ooo0;
        this.f96366OooOoO0 = uri;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27497o00OoOoo(this.f96366OooOoO0, continuation, this.f96364OooOo);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super Boolean> continuation) {
        return ((C27497o00OoOoo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f96365OooOo0o;
        Uri uri = this.f96366OooOoO0;
        boolean z = true;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            this.f96365OooOo0o = 1;
            obj = this.f96364OooOo.OooO0O0(uri, this);
            if (obj == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        String str = (String) obj;
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("PdfFileUseCase");
        c20358OooO00o.OooO0o0("isPptFile, uri: " + uri + ", mimeType: " + str, new Object[0]);
        if (str == null || str.length() == 0 || (!"application/vnd.ms-powerpoint".equalsIgnoreCase(str) && !"application/vnd.openxmlformats-officedocument.presentationml.presentation".equalsIgnoreCase(str))) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
