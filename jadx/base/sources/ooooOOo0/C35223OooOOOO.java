package ooooOOo0;

import com.orion.notein.richeditor.utils.p606io.FilenameUtils;
import java.lang.reflect.Method;
import oO00ooO.C32439OooO0oo;
import oO00ooO.C32446OooOOOo;
import oO0o0OO.C33614OooOOO0;
import okhttp3.Request;

/* JADX INFO: renamed from: ooooOOo0.OooOOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C35223OooOOOO implements InterfaceC35213OooO0Oo<Object> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ C33614OooOOO0 f126458OooO00o;

    public C35223OooOOOO(C33614OooOOO0 c33614OooOOO0) {
        this.f126458OooO00o = c33614OooOOO0;
    }

    @Override // ooooOOo0.InterfaceC35213OooO0Oo
    public final void OooO00o(InterfaceC35211OooO0O0<Object> call, Throwable th) {
        kotlin.jvm.internal.OooOOO0.OooO0oo(call, "call");
        this.f126458OooO00o.resumeWith(C32446OooOOOo.OooO00o(th));
    }

    @Override // ooooOOo0.InterfaceC35213OooO0Oo
    public final void OooO0O0(InterfaceC35211OooO0O0<Object> call, C35238OooOoO<Object> c35238OooOoO) {
        kotlin.jvm.internal.OooOOO0.OooO0oo(call, "call");
        boolean zOooO0OO = c35238OooOoO.f126541OooO00o.OooO0OO();
        C33614OooOOO0 c33614OooOOO0 = this.f126458OooO00o;
        if (!zOooO0OO) {
            c33614OooOOO0.resumeWith(C32446OooOOOo.OooO00o(new C35219OooOO0O(c35238OooOoO)));
            return;
        }
        Object obj = c35238OooOoO.f126542OooO0O0;
        if (obj != null) {
            c33614OooOOO0.resumeWith(obj);
            return;
        }
        Request request = call.request();
        request.getClass();
        Object objCast = C35222OooOOO0.class.cast(request.f124243OooO0o0.get(C35222OooOOO0.class));
        if (objCast == null) {
            C32439OooO0oo c32439OooO0oo = new C32439OooO0oo();
            kotlin.jvm.internal.OooOOO0.OooOO0o(kotlin.jvm.internal.OooOOO0.class.getName(), c32439OooO0oo);
            throw c32439OooO0oo;
        }
        StringBuilder sb = new StringBuilder("Response from ");
        Method method = ((C35222OooOOO0) objCast).f126456OooO00o;
        Class<?> declaringClass = method.getDeclaringClass();
        kotlin.jvm.internal.OooOOO0.OooO0OO(declaringClass, "method.declaringClass");
        sb.append(declaringClass.getName());
        sb.append(FilenameUtils.EXTENSION_SEPARATOR);
        sb.append(method.getName());
        sb.append(" was null but response body type was declared as non-null");
        c33614OooOOO0.resumeWith(C32446OooOOOo.OooO00o(new C32439OooO0oo(sb.toString())));
    }
}
