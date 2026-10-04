package o0OOo0o;

import Oooo0.C20871o0000Ooo;
import Oooo0oO.C21111o0ooOoO;
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
import oO0o0O0o.C33599OooOo0O;
import oO0o0O0o.C33600OooOo0o;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OOo0o.o00OoO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.PdfFileUseCase$duplicatedPdfToPrivateDir$2", m80623f = "PdfFileUseCase.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C27487o00OoO0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super String>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C27499o00Ooo0 f96327OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ String f96328OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27487o00OoO0(String str, C27499o00Ooo0 c27499o00Ooo0, Continuation<? super C27487o00OoO0> continuation) {
        super(2, continuation);
        this.f96328OooOo0o = str;
        this.f96327OooOo = c27499o00Ooo0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27487o00OoO0(this.f96328OooOo0o, this.f96327OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super String> continuation) {
        return ((C27487o00OoO0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00c9  */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws IOException {
        File file;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        StringBuilder sb = new StringBuilder("duplicatedPdfToPrivateDir, sourcePdfPath: ");
        String str = this.f96328OooOo0o;
        sb.append(str);
        c20358OooO00o.OooO00o(sb.toString(), new Object[0]);
        File file2 = new File(str);
        if (!file2.exists()) {
            c20358OooO00o.OooOOO0("PdfFileUseCase");
            c20358OooO00o.OooO0OO("duplicatedPdfToPrivateDir failed, sourceFile is not existed.", new Object[0]);
            return null;
        }
        C27499o00Ooo0 c27499o00Ooo0 = this.f96327OooOo;
        String strOooO0OO = C20871o0000Ooo.OooO0OO(str, c27499o00Ooo0.f96374OooO00o);
        c20358OooO00o.OooO00o(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("duplicatedPdfToPrivateDir, dupPdfPath: ", strOooO0OO), new Object[0]);
        if (strOooO0OO == null || strOooO0OO.length() == 0) {
            c20358OooO00o.OooOOO0("PdfFileUseCase");
            c20358OooO00o.OooO0OO("duplicatedPdfToPrivateDir failed, dupPdfPath is null or empty.", new Object[0]);
            return null;
        }
        try {
            file = new File(strOooO0OO);
            if (!file.exists()) {
                file.createNewFile();
            }
        } catch (IOException e) {
            if ("File name too long".equals(e.getMessage())) {
                String name = new File(str).getName();
                kotlin.jvm.internal.OooOOO0.OooO0Oo(name);
                String strConcat = C33600OooOo0o.o0OoOo0(10, C33599OooOo0O.OoooO0O(name, ".pdf")).concat(".pdf");
                String strOooO0OO2 = C20871o0000Ooo.OooO0OO(C21111o0ooOoO.OooO0Oo(C33599OooOo0O.OoooO0O(str, name), strConcat), c27499o00Ooo0.f96374OooO00o);
                C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                StringBuilder sbOooO0O0 = com.aspose.slides.internal.p332p7.OooO0o.OooO0O0("sourcePdfName: ", name, ", shortPdfName: ", strConcat, ", shortPdfPath: ");
                sbOooO0O0.append(strOooO0OO2);
                c20358OooO00o2.OooO00o(sbOooO0O0.toString(), new Object[0]);
                if (strOooO0OO2 == null || strOooO0OO2.length() == 0) {
                    file = null;
                } else {
                    file = new File(strOooO0OO2);
                    if (!file.exists()) {
                        file.createNewFile();
                    }
                }
            }
        }
        if (file == null) {
            return null;
        }
        C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
        c20358OooO00o3.OooOOO0("PdfFileUseCase");
        c20358OooO00o3.OooO0o0("duplicatedPdfToPrivateDir, start copy sourceFile: " + file2 + ", to targetFile: " + file + ".", new Object[0]);
        boolean zOooO00o = C31190OooO0oo.OooO00o(file2, file);
        c20358OooO00o3.OooOOO0("PdfFileUseCase");
        c20358OooO00o3.OooO0o0("duplicatedPdfToPrivateDir, copy result: " + zOooO00o + ".", new Object[0]);
        if (zOooO00o) {
            return file.getAbsolutePath();
        }
        file.delete();
        return null;
    }
}
