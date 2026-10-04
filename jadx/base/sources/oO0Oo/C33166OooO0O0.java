package oO0Oo;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import com.orion.notein.domain.models.p605ai.ImageToHtmlResult;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import o000oooo.C24761OooO;
import o0OOOo0.C27174OooO0O0;
import o0OOo0o.C27545o00o0oo0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34429OooOOo0;

/* JADX INFO: renamed from: oO0Oo.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.ocr.AiOcrRecognizer$createTextPageWithImages$2", m80623f = "AiOcrRecognizer.kt", m80624l = {152, 158, 180}, m80625m = "invokeSuspend")
public final class C33166OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super String>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f119928OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C27174OooO0O0 f119929OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C33173OooOO0o f119930OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ List<String> f119931OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ String f119932OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final /* synthetic */ String f119933OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ String f119934OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33166OooO0O0(List<String> list, C33173OooOO0o c33173OooOO0o, String str, String str2, String str3, Continuation<? super C33166OooO0O0> continuation) {
        super(2, continuation);
        this.f119931OooOoO0 = list;
        this.f119930OooOoO = c33173OooOO0o;
        this.f119932OooOoOO = str;
        this.f119934OooOoo0 = str2;
        this.f119933OooOoo = str3;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C33166OooO0O0(this.f119931OooOoO0, this.f119930OooOoO, this.f119932OooOoOO, this.f119934OooOoo0, this.f119933OooOoo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super String> continuation) {
        return ((C33166OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x015d A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws IOException {
        Object objOooO0o;
        Object objOooO0oO;
        C27174OooO0O0 c27174OooO0O0;
        C27174OooO0O0 c27174OooO0O02;
        Iterable iterable;
        Iterator it;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f119928OooOo;
        List<String> list = this.f119931OooOoO0;
        C33173OooOO0o c33173OooOO0o = this.f119930OooOoO;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            List<String> list2 = list;
            ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList.add(Uri.parse((String) it2.next()));
            }
            C27545o00o0oo0 c27545o00o0oo0 = c33173OooOO0o.f120040OooO00o;
            this.f119928OooOo = 1;
            objOooO0o = c27545o00o0oo0.OooO0o(arrayList);
            if (objOooO0o != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c27174OooO0O02 = this.f119929OooOo0o;
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
            objOooO0oO = obj;
            c27174OooO0O0 = (C27174OooO0O0) objOooO0oO;
            if (kotlin.jvm.internal.OooOOO0.OooO0O0(c27174OooO0O0.getErrorCode(), "0") || c27174OooO0O0.OooO0O0() == null) {
                String errorCode = c27174OooO0O0.getErrorCode();
                return errorCode != null ? "599999" : errorCode;
            }
            Iterable iterable2 = (Iterable) c27174OooO0O0.OooO0O0();
            ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(iterable2, 10));
            int i2 = 0;
            for (Object obj2 : iterable2) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    C34429OooOOo0.OooOOo();
                    throw null;
                }
                ImageToHtmlResult imageToHtmlResult = (ImageToHtmlResult) obj2;
                arrayList2.add(C33173OooOO0o.OooO0o(c33173OooOO0o.f120046OooO0oO, C24761OooO.OooO00o("toString(...)"), 0, list.get(i2), (kotlin.jvm.internal.OooOOO0.OooO0O0(imageToHtmlResult.getErrorCode(), "0") || imageToHtmlResult.getHtml().length() > 0) ? imageToHtmlResult.getHtml() : imageToHtmlResult.getErrorMessage(), new Bundle()));
                i2 = i3;
            }
            this.f119929OooOo0o = c27174OooO0O0;
            this.f119928OooOo = 3;
            if (c33173OooOO0o.OooO0o0(this.f119933OooOoo, arrayList2, this) != enumC32485OooO00o) {
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
        C32446OooOOOo.OooO0O0(obj);
        objOooO0o = obj;
        List list3 = (List) objOooO0o;
        List list4 = list3;
        if ((list4 instanceof Collection) && list4.isEmpty()) {
            return "500007";
        }
        Iterator it3 = list4.iterator();
        while (it3.hasNext()) {
            if (((Bitmap) it3.next()) != null) {
                this.f119928OooOo = 2;
                objOooO0oO = c33173OooOO0o.OooO0oO(this.f119932OooOoOO, this.f119934OooOoo0, list3, this);
                if (objOooO0oO != enumC32485OooO00o) {
                    c27174OooO0O0 = (C27174OooO0O0) objOooO0oO;
                    if (kotlin.jvm.internal.OooOOO0.OooO0O0(c27174OooO0O0.getErrorCode(), "0")) {
                    }
                    String errorCode2 = c27174OooO0O0.getErrorCode();
                    if (errorCode2 != null) {
                    }
                }
                return enumC32485OooO00o;
            }
        }
        return "500007";
    }
}
