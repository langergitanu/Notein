package o0OO0oO;

import android.net.Uri;
import java.io.File;
import kotlin.coroutines.Continuation;
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

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.doc.WPSFileConvertDataSource$convertToPdf$2", m80623f = "WPSFileConvertDataSource.kt", m80624l = {45, 51, 57, 64}, m80625m = "invokeSuspend")
public final class OooOOO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super File>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C26938OooOOoo f93545OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f93546OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ String f93547OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Uri f93548OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ String f93549OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ String f93550OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOO(C26938OooOOoo c26938OooOOoo, Uri uri, String str, String str2, String str3, Continuation<? super OooOOO> continuation) {
        super(2, continuation);
        this.f93545OooOo = c26938OooOOoo;
        this.f93548OooOoO0 = uri;
        this.f93547OooOoO = str;
        this.f93549OooOoOO = str2;
        this.f93550OooOoo0 = str3;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new OooOOO(this.f93545OooOo, this.f93548OooOoO0, this.f93547OooOoO, this.f93549OooOoOO, this.f93550OooOoo0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super File> continuation) {
        return ((OooOOO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b0, code lost:
    
        if (r14 != r2) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006d A[Catch: Exception -> 0x0023, TryCatch #0 {Exception -> 0x0023, blocks: (B:8:0x001e, B:44:0x00b3, B:46:0x00b7, B:48:0x00d2, B:14:0x002e, B:36:0x0083, B:38:0x0087, B:41:0x008e, B:50:0x00df, B:15:0x0032, B:29:0x0069, B:31:0x006d, B:33:0x007a, B:16:0x0036, B:22:0x0048, B:24:0x0050, B:26:0x005e, B:19:0x003d), top: B:54:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007a A[Catch: Exception -> 0x0023, TryCatch #0 {Exception -> 0x0023, blocks: (B:8:0x001e, B:44:0x00b3, B:46:0x00b7, B:48:0x00d2, B:14:0x002e, B:36:0x0083, B:38:0x0087, B:41:0x008e, B:50:0x00df, B:15:0x0032, B:29:0x0069, B:31:0x006d, B:33:0x007a, B:16:0x0036, B:22:0x0048, B:24:0x0050, B:26:0x005e, B:19:0x003d), top: B:54:0x0014 }] */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str;
        String str2;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f93546OooOo0o;
        String str3 = this.f93547OooOoO;
        C26938OooOOoo c26938OooOOoo = this.f93545OooOo;
        try {
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                Uri uri = this.f93548OooOoO0;
                this.f93546OooOo0o = 1;
                obj = C26938OooOOoo.OooO0OO(c26938OooOOoo, uri, str3, this);
                if (obj == enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            }
            if (i != 1) {
                if (i == 2) {
                    C32446OooOOOo.OooO0O0(obj);
                    str = (String) obj;
                    if (str != null) {
                        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o.OooOOO0("WPSFileConvertDataSource");
                        c20358OooO00o.OooOO0O("createTask failed, taskId is null", new Object[0]);
                        return null;
                    }
                    this.f93546OooOo0o = 3;
                    obj = C26938OooOOoo.OooO0O0(c26938OooOOoo, str, this);
                    if (obj != enumC32485OooO00o) {
                        str2 = (String) obj;
                        if (str2 != null) {
                            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                            c20358OooO00o2.OooOOO0("WPSFileConvertDataSource");
                            c20358OooO00o2.OooO00o("PDF URL: ".concat(str2), new Object[0]);
                            String str4 = this.f93550OooOoo0;
                            this.f93546OooOo0o = 4;
                            c26938OooOOoo.getClass();
                            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                            obj = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C26935OooOOOo(str2, str4, null), this);
                        }
                        C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o3.OooOOO0("WPSFileConvertDataSource");
                        c20358OooO00o3.OooOO0O("pollUntilSuccess failed, pdfUrl is null or empty", new Object[0]);
                        return null;
                    }
                    return enumC32485OooO00o;
                }
                if (i != 3) {
                    if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C32446OooOOOo.OooO0O0(obj);
                    File file = (File) obj;
                    if (file == null) {
                        C34406OooO00o.C20358OooO00o c20358OooO00o4 = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o4.OooOOO0("WPSFileConvertDataSource");
                        c20358OooO00o4.OooOO0O("downloadPdfFile failed, downloadFile is null", new Object[0]);
                        return null;
                    }
                    C34406OooO00o.C20358OooO00o c20358OooO00o5 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o5.OooOOO0("WPSFileConvertDataSource");
                    c20358OooO00o5.OooO0o0("convertToPdf success, downloaded to " + file.getAbsolutePath(), new Object[0]);
                    return file;
                }
                C32446OooOOOo.OooO0O0(obj);
                str2 = (String) obj;
                if (str2 != null && str2.length() != 0) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o22 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o22.OooOOO0("WPSFileConvertDataSource");
                    c20358OooO00o22.OooO00o("PDF URL: ".concat(str2), new Object[0]);
                    String str42 = this.f93550OooOoo0;
                    this.f93546OooOo0o = 4;
                    c26938OooOOoo.getClass();
                    C33874OooO0OO c33874OooO0OO2 = C33649OoooOOo.f121328OooO00o;
                    obj = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C26935OooOOOo(str2, str42, null), this);
                }
                C34406OooO00o.C20358OooO00o c20358OooO00o32 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o32.OooOOO0("WPSFileConvertDataSource");
                c20358OooO00o32.OooOO0O("pollUntilSuccess failed, pdfUrl is null or empty", new Object[0]);
                return null;
            }
            C32446OooOOOo.OooO0O0(obj);
            String str5 = (String) obj;
            if (str5.length() == 0) {
                C34406OooO00o.C20358OooO00o c20358OooO00o6 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o6.OooOOO0("WPSFileConvertDataSource");
                c20358OooO00o6.OooOO0O("uploadSource failed, srcUrl is empty", new Object[0]);
                return null;
            }
            String str6 = this.f93549OooOoOO;
            this.f93546OooOo0o = 2;
            obj = C26938OooOOoo.OooO00o(c26938OooOOoo, str5, str3, str6, this);
            if (obj != enumC32485OooO00o) {
                str = (String) obj;
                if (str != null) {
                }
            }
            return enumC32485OooO00o;
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o7 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o7.OooOOO0("WPSFileConvertDataSource");
            c20358OooO00o7.OooO0Oo(e, "convertToPdf failed", new Object[0]);
            return null;
        }
    }
}
