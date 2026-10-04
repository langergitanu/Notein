package oOO00oOO;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import okhttp3.ResponseBody;
import ooooOOo0.C35240OooOoOO;
import ooooOOo0.InterfaceC35214OooO0o;

/* JADX INFO: loaded from: classes10.dex */
public final class OooOO0O extends InterfaceC35214OooO0o.OooO00o {
    @Override // ooooOOo0.InterfaceC35214OooO0o.OooO00o
    public final InterfaceC35214OooO0o OooO00o(Type type) {
        if (type == String.class || type == Boolean.TYPE || type == Boolean.class || type == Byte.TYPE || type == Byte.class || type == Character.TYPE || type == Character.class || type == Double.TYPE || type == Double.class || type == Float.TYPE || type == Float.class || type == Integer.TYPE || type == Integer.class || type == Long.TYPE || type == Long.class || type == Short.TYPE || type == Short.class) {
            return C34379OooO00o.f123380OooO00o;
        }
        return null;
    }

    @Override // ooooOOo0.InterfaceC35214OooO0o.OooO00o
    public final InterfaceC35214OooO0o<ResponseBody, ?> OooO0O0(Type type, Annotation[] annotationArr, C35240OooOoOO c35240OooOoOO) {
        if (type == String.class) {
            return OooOO0.f123389OooO00o;
        }
        if (type == Boolean.class || type == Boolean.TYPE) {
            return C34380OooO0O0.f123382OooO00o;
        }
        if (type == Byte.class || type == Byte.TYPE) {
            return C34381OooO0OO.f123383OooO00o;
        }
        if (type == Character.class || type == Character.TYPE) {
            return C34382OooO0Oo.f123384OooO00o;
        }
        if (type == Double.class || type == Double.TYPE) {
            return C34383OooO0o0.f123386OooO00o;
        }
        if (type == Float.class || type == Float.TYPE) {
            return OooO0o.f123385OooO00o;
        }
        if (type == Integer.class || type == Integer.TYPE) {
            return C34384OooO0oO.f123387OooO00o;
        }
        if (type == Long.class || type == Long.TYPE) {
            return C34385OooO0oo.f123388OooO00o;
        }
        if (type == Short.class || type == Short.TYPE) {
            return OooO.f123379OooO00o;
        }
        return null;
    }
}
