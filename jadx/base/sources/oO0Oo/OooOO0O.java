package oO0Oo;

import android.graphics.Bitmap;
import android.net.Uri;
import androidx.core.os.BundleKt;
import com.orion.notein.domain.models.ocr.AiOcrTextPage;
import com.orion.notein.domain.models.p605ai.ImageToHtmlResult;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import o0OOOo0.C27174OooO0O0;
import o0OOo0o.C27545o00o0oo0;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.ocr.AiOcrRecognizer$updateTextPageWithPdfPage$2", m80623f = "AiOcrRecognizer.kt", m80624l = {392, 399, 423}, m80625m = "invokeSuspend")
public final class OooOO0O extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super String>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f120029OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C27174OooO0O0 f120030OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C33173OooOO0o f120031OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f120032OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ int f120033OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final /* synthetic */ String f120034OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ String f120035OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final /* synthetic */ String f120036OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final /* synthetic */ String f120037OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final /* synthetic */ String f120038Oooo000;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOO0O(String str, C33173OooOO0o c33173OooOO0o, int i, String str2, String str3, String str4, String str5, String str6, Continuation<? super OooOO0O> continuation) {
        super(2, continuation);
        this.f120032OooOoO0 = str;
        this.f120031OooOoO = c33173OooOO0o;
        this.f120033OooOoOO = i;
        this.f120035OooOoo0 = str2;
        this.f120034OooOoo = str3;
        this.f120036OooOooO = str4;
        this.f120037OooOooo = str5;
        this.f120038Oooo000 = str6;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new OooOO0O(this.f120032OooOoO0, this.f120031OooOoO, this.f120033OooOoOO, this.f120035OooOoo0, this.f120034OooOoo, this.f120036OooOooO, this.f120037OooOooo, this.f120038Oooo000, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super String> continuation) {
        return ((OooOO0O) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws IOException {
        C27174OooO0O0 c27174OooO0O0;
        String errorCode;
        C27174OooO0O0 c27174OooO0O02;
        Iterable iterable;
        Iterator it;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f120029OooOo;
        int i2 = this.f120033OooOoOO;
        String str = this.f120032OooOoO0;
        C33173OooOO0o c33173OooOO0o = this.f120031OooOoO;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            Uri uri = Uri.parse(str);
            C27545o00o0oo0 c27545o00o0oo0 = c33173OooOO0o.f120040OooO00o;
            kotlin.jvm.internal.OooOOO0.OooO0Oo(uri);
            this.f120029OooOo = 1;
            obj = c27545o00o0oo0.OooO0oo(uri, i2, i2 + 1, this.f120035OooOoo0);
            if (obj != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c27174OooO0O02 = this.f120030OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                iterable = (Iterable) c27174OooO0O02.OooO0O0();
                if ((iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                    it = iterable.iterator();
                    while (it.hasNext()) {
                        if (kotlin.jvm.internal.OooOOO0.OooO0O0(((ImageToHtmlResult) it.next()).getErrorCode(), "500005")) {
                            return "500005";
                        }
                    }
                }
                return "0";
            }
            C32446OooOOOo.OooO0O0(obj);
            c27174OooO0O0 = (C27174OooO0O0) obj;
            if (kotlin.jvm.internal.OooOOO0.OooO0O0(c27174OooO0O0.getErrorCode(), "0") || c27174OooO0O0.OooO0O0() == null) {
                errorCode = c27174OooO0O0.getErrorCode();
                if (errorCode == null) {
                    return errorCode;
                }
            } else {
                ImageToHtmlResult imageToHtmlResult = (ImageToHtmlResult) oOo000Oo.OooOo.Oooo((List) c27174OooO0O0.OooO0O0());
                if (imageToHtmlResult != null) {
                    if (!kotlin.jvm.internal.OooOOO0.OooO0O0(imageToHtmlResult.getErrorCode(), "0") && imageToHtmlResult.getHtml().length() <= 0) {
                        return imageToHtmlResult.getErrorCode();
                    }
                    AiOcrTextPage aiOcrTextPageOooO0o = C33173OooOO0o.OooO0o(c33173OooOO0o.f120046OooO0oO, this.f120037OooOooo, 1, str, imageToHtmlResult.getHtml(), BundleKt.bundleOf(new C32443OooOOO("pdf_page_index", new Integer(i2))));
                    this.f120030OooOo0o = c27174OooO0O0;
                    this.f120029OooOo = 3;
                    if (C33173OooOO0o.OooO0Oo(c33173OooOO0o, aiOcrTextPageOooO0o, this.f120038Oooo000, this) != enumC32485OooO00o) {
                        c27174OooO0O02 = c27174OooO0O0;
                        iterable = (Iterable) c27174OooO0O02.OooO0O0();
                        if (iterable instanceof Collection) {
                            it = iterable.iterator();
                            while (it.hasNext()) {
                            }
                        }
                        return "0";
                    }
                    return enumC32485OooO00o;
                }
            }
            return "599999";
        }
        C32446OooOOOo.OooO0O0(obj);
        List list = (List) obj;
        List list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return "500007";
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            if (((Bitmap) it2.next()) != null) {
                this.f120029OooOo = 2;
                obj = c33173OooOO0o.OooO0oO(this.f120034OooOoo, this.f120036OooOooO, list, this);
                if (obj != enumC32485OooO00o) {
                    c27174OooO0O0 = (C27174OooO0O0) obj;
                    if (kotlin.jvm.internal.OooOOO0.OooO0O0(c27174OooO0O0.getErrorCode(), "0")) {
                        errorCode = c27174OooO0O0.getErrorCode();
                        if (errorCode == null) {
                        }
                    }
                    return "599999";
                }
                return enumC32485OooO00o;
            }
        }
        return "500007";
    }
}
