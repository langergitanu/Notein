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

/* JADX INFO: renamed from: o0OOo0o.o00Ooo00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.PdfFileUseCase$isXlsFile$2", m80623f = "PdfFileUseCase.kt", m80624l = {207}, m80625m = "invokeSuspend")
public final class C27500o00Ooo00 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super Boolean>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C27499o00Ooo0 f96375OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f96376OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Uri f96377OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27500o00Ooo00(Uri uri, Continuation continuation, C27499o00Ooo0 c27499o00Ooo0) {
        super(2, continuation);
        this.f96375OooOo = c27499o00Ooo0;
        this.f96377OooOoO0 = uri;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27500o00Ooo00(this.f96377OooOoO0, continuation, this.f96375OooOo);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super Boolean> continuation) {
        return ((C27500o00Ooo00) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f96376OooOo0o;
        Uri uri = this.f96377OooOoO0;
        boolean z = true;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            this.f96376OooOo0o = 1;
            obj = this.f96375OooOo.OooO0O0(uri, this);
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
        c20358OooO00o.OooO0o0("isXlsFile, uri: " + uri + ", mimeType: " + str, new Object[0]);
        if (str == null || str.length() == 0 || (!str.equalsIgnoreCase("application/vnd.ms-excel") && !str.equalsIgnoreCase("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet"))) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
