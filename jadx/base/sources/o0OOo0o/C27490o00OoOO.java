package o0OOo0o;

import android.net.Uri;
import java.io.File;
import java.util.UUID;
import kotlin.coroutines.Continuation;
import o0O0oooO.AbstractApplicationC26277OooOoOO;
import o0OoO0oo.C28692OooO0oo;
import o0oo000O.C31190OooO0oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0O0o.C33599OooOo0O;
import oO0o0O0o.C33600OooOo0o;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OOo0o.o00OoOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.PdfFileUseCase$getPdfFilePathInPrivateDir$2", m80623f = "PdfFileUseCase.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C27490o00OoOO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super String>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ String f96340OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Uri f96341OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C27499o00Ooo0 f96342OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27490o00OoOO(Uri uri, String str, C27499o00Ooo0 c27499o00Ooo0, Continuation<? super C27490o00OoOO> continuation) {
        super(2, continuation);
        this.f96341OooOo0o = uri;
        this.f96340OooOo = str;
        this.f96342OooOoO0 = c27499o00Ooo0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27490o00OoOO(this.f96341OooOo0o, this.f96340OooOo, this.f96342OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super String> continuation) {
        return ((C27490o00OoOO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        String str;
        String absolutePath;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        StringBuilder sb = new StringBuilder("getPdfFilePathInPrivateDir, sourceUri: ");
        Uri uri = this.f96341OooOo0o;
        sb.append(uri);
        sb.append(", privateDirName: ");
        String str2 = this.f96340OooOo;
        sb.append(str2);
        c20358OooO00o.OooO00o(sb.toString(), new Object[0]);
        AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO = this.f96342OooOoO0.f96374OooO00o;
        String strOooO0OO = C28692OooO0oo.OooO0OO(abstractApplicationC26277OooOoOO, uri);
        if (strOooO0OO.length() == 0) {
            absolutePath = null;
        } else {
            File file = new File(abstractApplicationC26277OooOoOO.getFilesDir(), str2);
            C31190OooO0oo.OooO0o(file);
            String strOoooo00 = C33599OooOo0O.Ooooo00(strOooO0OO, ".");
            String strO0OoOo0 = C33600OooOo0o.o0OoOo0(30, C33599OooOo0O.OoooO0O(strOooO0OO, strOoooo00));
            c20358OooO00o.OooOOO0("PdfFileUseCase");
            c20358OooO00o.OooO0o0("srcFileNameWithoutSuffix: " + strO0OoOo0 + ", length is " + strO0OoOo0.length(), new Object[0]);
            if (C33599OooOo0O.OooOoOO(strO0OoOo0, "_notein_pdf_", false)) {
                String strSubstring = strO0OoOo0.substring(0, C33599OooOo0O.Oooo0O0(strO0OoOo0, "_notein_pdf_", 0, false, 6));
                kotlin.jvm.internal.OooOOO0.OooO0o(strSubstring, "substring(...)");
                str = strSubstring + "_notein_pdf_" + UUID.randomUUID() + "." + strOoooo00;
            } else {
                str = strO0OoOo0 + "_notein_pdf_" + UUID.randomUUID() + "." + strOoooo00;
            }
            absolutePath = new File(file, str).getAbsolutePath();
        }
        c20358OooO00o.OooO00o(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("getPdfFilePathInPrivateDir, dupPdfPath: ", absolutePath), new Object[0]);
        if (absolutePath != null && absolutePath.length() != 0) {
            return absolutePath;
        }
        c20358OooO00o.OooOOO0("PdfFileUseCase");
        c20358OooO00o.OooO0OO("getPdfFilePathInPrivateDir failed, dupPdfPath is null or empty.", new Object[0]);
        return null;
    }
}
