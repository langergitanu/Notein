package o0OOo0o;

import android.net.Uri;
import android.webkit.MimeTypeMap;
import com.aspose.slides.C22227OoooO;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.File;
import java.util.Locale;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000.C32501OooO0oO;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OOo0o.o00OoOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.PdfFileUseCase$getMimeTypeFromUri$2", m80623f = "PdfFileUseCase.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C27491o00OoOO0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super String>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C27499o00Ooo0 f96343OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Uri f96344OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27491o00OoOO0(Uri uri, Continuation continuation, C27499o00Ooo0 c27499o00Ooo0) {
        super(2, continuation);
        this.f96344OooOo0o = uri;
        this.f96343OooOo = c27499o00Ooo0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27491o00OoOO0(this.f96344OooOo0o, continuation, this.f96343OooOo);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super String> continuation) {
        return ((C27491o00OoOO0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        Uri uri = this.f96344OooOo0o;
        if (kotlin.jvm.internal.OooOOO0.OooO0O0(uri.getScheme(), FirebaseAnalytics.Param.CONTENT)) {
            return this.f96343OooOo.f96374OooO00o.getContentResolver().getType(uri);
        }
        String path = uri.getPath();
        if (path == null || path.length() == 0) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("PdfFileUseCase");
            c20358OooO00o.OooOO0O("getMimeTypeFromUri: uri.path is null or empty, uri: " + uri, new Object[0]);
            return null;
        }
        String strOooO0o0 = C32501OooO0oO.OooO0o0(new File(path));
        Locale locale = Locale.getDefault();
        kotlin.jvm.internal.OooOOO0.OooO0o(locale, "getDefault(...)");
        String lowerCase = strOooO0o0.toLowerCase(locale);
        kotlin.jvm.internal.OooOOO0.OooO0o(lowerCase, "toLowerCase(...)");
        if (lowerCase.length() == 0) {
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooOOO0("PdfFileUseCase");
            c20358OooO00o2.OooOO0O("getMimeTypeFromUri: no extension found, path: ".concat(path), new Object[0]);
            return null;
        }
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(lowerCase);
        C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
        StringBuilder sbOooO00o = C22227OoooO.OooO00o(c20358OooO00o3, "PdfFileUseCase", "getMimeTypeFromUri: extension=", lowerCase, ", mimeType=");
        sbOooO00o.append(mimeTypeFromExtension);
        c20358OooO00o3.OooO0o0(sbOooO00o.toString(), new Object[0]);
        return mimeTypeFromExtension;
    }
}
