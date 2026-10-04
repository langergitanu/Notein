package o0OOo0o;

import android.net.Uri;
import com.aspose.words.StyleIdentifier;
import java.io.File;
import java.io.IOException;
import kotlin.coroutines.Continuation;
import o0oo000O.C31190OooO0oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OOo0o.o00OoO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.PdfFileUseCase$duplicatedPdfToPrivateDir$4", m80623f = "PdfFileUseCase.kt", m80624l = {StyleIdentifier.INTENSE_EMPHASIS}, m80625m = "invokeSuspend")
public final class C27489o00OoO0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super File>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Uri f96337OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f96338OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C27499o00Ooo0 f96339OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27489o00OoO0o(Uri uri, Continuation continuation, C27499o00Ooo0 c27499o00Ooo0) {
        super(2, continuation);
        this.f96337OooOo = uri;
        this.f96339OooOoO0 = c27499o00Ooo0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27489o00OoO0o(this.f96337OooOo, continuation, this.f96339OooOoO0);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super File> continuation) {
        return ((C27489o00OoO0o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        File file;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f96338OooOo0o;
        C27499o00Ooo0 c27499o00Ooo0 = this.f96339OooOoO0;
        Uri uri = this.f96337OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("PdfFileUseCase");
            c20358OooO00o.OooO0o0("duplicatedPdfToPrivateDir, sourceUri: " + uri, new Object[0]);
            this.f96338OooOo0o = 1;
            obj = C27499o00Ooo0.OooO0OO(c27499o00Ooo0, uri, this);
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
        C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
        c20358OooO00o2.OooO0o0(androidx.core.app.OooO.OooO0O0(c20358OooO00o2, "PdfFileUseCase", "duplicatedPdfToPrivateDir, dupPdfPath: ", str), new Object[0]);
        if (str == null || str.length() == 0) {
            c20358OooO00o2.OooOOO0("PdfFileUseCase");
            c20358OooO00o2.OooO0OO("duplicatedPdfToPrivateDir failed, dupPdfPath is null or empty.", new Object[0]);
            return null;
        }
        try {
            file = new File(str);
            C31190OooO0oo.OooO0oO(file);
        } catch (IOException e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o3.OooOOO0("PdfFileUseCase");
            c20358OooO00o3.OooO0Oo(e, "duplicatedPdfToPrivateDir, create duplicated pdf file error. source uri is " + uri, new Object[0]);
            file = null;
        }
        if (file == null) {
            return null;
        }
        if (C31190OooO0oo.OooO0O0(c27499o00Ooo0.f96374OooO00o, uri, file)) {
            return file;
        }
        file.delete();
        return null;
    }
}
