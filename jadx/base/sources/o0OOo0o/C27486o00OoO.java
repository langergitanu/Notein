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
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OOo0o.o00OoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.PdfFileUseCase$duplicatedPdfToPrivateTempDir$2", m80623f = "PdfFileUseCase.kt", m80624l = {StyleIdentifier.GRID_TABLE_7_COLORFUL_ACCENT_5}, m80625m = "invokeSuspend")
public final class C27486o00OoO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super String>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Uri f96324OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f96325OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C27499o00Ooo0 f96326OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27486o00OoO(Uri uri, Continuation continuation, C27499o00Ooo0 c27499o00Ooo0) {
        super(2, continuation);
        this.f96324OooOo = uri;
        this.f96326OooOoO0 = c27499o00Ooo0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27486o00OoO(this.f96324OooOo, continuation, this.f96326OooOoO0);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super String> continuation) {
        return ((C27486o00OoO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) throws Throwable {
        File file;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f96325OooOo0o;
        Uri uri = this.f96324OooOo;
        C27499o00Ooo0 c27499o00Ooo0 = this.f96326OooOoO0;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("PdfFileUseCase");
            c20358OooO00o.OooO0o0("duplicatedPdfToPrivateTempDir, sourceUri: " + uri, new Object[0]);
            this.f96325OooOo0o = 1;
            c27499o00Ooo0.getClass();
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            obj = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27490o00OoOO(uri, "temp_documents", c27499o00Ooo0, null), this);
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
        c20358OooO00o2.OooO0o0(androidx.core.app.OooO.OooO0O0(c20358OooO00o2, "PdfFileUseCase", "duplicatedPdfToPrivateTempDir, dupPdfPath: ", str), new Object[0]);
        if (str == null || str.length() == 0) {
            c20358OooO00o2.OooOOO0("PdfFileUseCase");
            c20358OooO00o2.OooO0OO("duplicatedPdfToPrivateTempDir failed, dupPdfPath is null or empty.", new Object[0]);
            return null;
        }
        try {
            file = new File(str);
            C31190OooO0oo.OooO0oO(file);
        } catch (IOException e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o3.OooOOO0("PdfFileUseCase");
            c20358OooO00o3.OooO0Oo(e, "duplicatedPdfToPrivateTempDir, create duplicated pdf file error. source uri is " + uri, new Object[0]);
            file = null;
        }
        if (file == null) {
            return null;
        }
        if (C31190OooO0oo.OooO0O0(c27499o00Ooo0.f96374OooO00o, uri, file)) {
            return file.getAbsolutePath();
        }
        file.delete();
        return null;
    }
}
