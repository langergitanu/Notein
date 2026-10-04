package oO0Oo;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import com.orion.notein.domain.models.ocr.AiOcrTextPage;
import com.orion.notein.domain.models.p605ai.ImageToHtmlResult;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import o0OOOo0.C27174OooO0O0;
import o0OOo0o.C27545o00o0oo0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: oO0Oo.OooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.ocr.AiOcrRecognizer$updateTextPageWithImage$2", m80623f = "AiOcrRecognizer.kt", m80624l = {204, 210, 234}, m80625m = "invokeSuspend")
public final class C33164OooO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super String>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f119914OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C27174OooO0O0 f119915OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C33173OooOO0o f119916OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f119917OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ String f119918OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final /* synthetic */ String f119919OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ String f119920OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final /* synthetic */ String f119921OooOooO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33164OooO(String str, C33173OooOO0o c33173OooOO0o, String str2, String str3, String str4, String str5, Continuation<? super C33164OooO> continuation) {
        super(2, continuation);
        this.f119917OooOoO0 = str;
        this.f119916OooOoO = c33173OooOO0o;
        this.f119918OooOoOO = str2;
        this.f119920OooOoo0 = str3;
        this.f119919OooOoo = str4;
        this.f119921OooOooO = str5;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C33164OooO(this.f119917OooOoO0, this.f119916OooOoO, this.f119918OooOoOO, this.f119920OooOoo0, this.f119919OooOoo, this.f119921OooOooO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super String> continuation) {
        return ((C33164OooO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0106  */
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
        int i = this.f119914OooOo;
        String str = this.f119917OooOoO0;
        C33173OooOO0o c33173OooOO0o = this.f119916OooOoO;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            List listOooO0oO = com.facebook.soloader.OooOo.OooO0oO(Uri.parse(str));
            C27545o00o0oo0 c27545o00o0oo0 = c33173OooOO0o.f120040OooO00o;
            this.f119914OooOo = 1;
            obj = c27545o00o0oo0.OooO0o(listOooO0oO);
            if (obj != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c27174OooO0O02 = this.f119915OooOo0o;
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
                    AiOcrTextPage aiOcrTextPageOooO0o = C33173OooOO0o.OooO0o(c33173OooOO0o.f120046OooO0oO, this.f119919OooOoo, 0, str, imageToHtmlResult.getHtml(), new Bundle());
                    this.f119915OooOo0o = c27174OooO0O0;
                    this.f119914OooOo = 3;
                    if (C33173OooOO0o.OooO0Oo(c33173OooOO0o, aiOcrTextPageOooO0o, this.f119921OooOooO, this) != enumC32485OooO00o) {
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
                this.f119914OooOo = 2;
                obj = c33173OooOO0o.OooO0oO(this.f119918OooOoOO, this.f119920OooOoo0, list, this);
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
