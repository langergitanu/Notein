package o00O00o;

import android.app.Activity;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import kotlin.jvm.internal.OooOOO0;
import oO00ooO.C32460OooOooO;
import oOoo0.InterfaceC34595OooO0Oo;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ClassLoader f84133OooO00o;

    public static final class OooO00o<T> implements InvocationHandler {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final InterfaceC34595OooO0Oo<T> f84134OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final o00O0.OooO0O0 f84135OooO0O0;

        public OooO00o(InterfaceC34595OooO0Oo clazz, o00O0.OooO0O0 oooO0O0) {
            OooOOO0.OooO0oO(clazz, "clazz");
            this.f84134OooO00o = clazz;
            this.f84135OooO0O0 = oooO0O0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, Method method, Object[] objArr) {
            OooOOO0.OooO0oO(obj, "obj");
            OooOOO0.OooO0oO(method, "method");
            boolean zOooO0O0 = OooOOO0.OooO0O0(method.getName(), "accept");
            o00O0.OooO0O0 oooO0O0 = this.f84135OooO0O0;
            if (zOooO0O0 && objArr != null && objArr.length == 1) {
                Object obj2 = objArr[0];
                InterfaceC34595OooO0Oo<T> interfaceC34595OooO0Oo = this.f84134OooO00o;
                OooOOO0.OooO0oO(interfaceC34595OooO0Oo, "<this>");
                if (interfaceC34595OooO0Oo.OooO0oo(obj2)) {
                    OooOOO0.OooO0o0(obj2, "null cannot be cast to non-null type T of kotlin.reflect.KClasses.cast");
                    oooO0O0.invoke(obj2);
                    return C32460OooOooO.f116667OooO00o;
                }
                throw new ClassCastException("Value cannot be cast to " + interfaceC34595OooO0Oo.OooO0Oo());
            }
            if (OooOOO0.OooO0O0(method.getName(), "equals") && method.getReturnType().equals(Boolean.TYPE) && objArr != null && objArr.length == 1) {
                return Boolean.valueOf(obj == objArr[0]);
            }
            if (OooOOO0.OooO0O0(method.getName(), "hashCode") && method.getReturnType().equals(Integer.TYPE) && objArr == null) {
                return Integer.valueOf(oooO0O0.hashCode());
            }
            if (OooOOO0.OooO0O0(method.getName(), "toString") && method.getReturnType().equals(String.class) && objArr == null) {
                return oooO0O0.toString();
            }
            throw new UnsupportedOperationException("Unexpected method call object:" + obj + ", method: " + method + ", args: " + objArr);
        }
    }

    public interface OooO0O0 {
        void dispose();
    }

    public OooO0OO(ClassLoader classLoader) {
        this.f84133OooO00o = classLoader;
    }

    public final C24808OooO0Oo OooO00o(Object obj, InterfaceC34595OooO0Oo clazz, Activity activity, o00O0.OooO0O0 oooO0O0) throws IllegalAccessException, InvocationTargetException {
        OooOOO0.OooO0oO(clazz, "clazz");
        OooO00o oooO00o = new OooO00o(clazz, oooO0O0);
        Object objNewProxyInstance = Proxy.newProxyInstance(this.f84133OooO00o, new Class[]{OooO0O0()}, oooO00o);
        OooOOO0.OooO0o(objNewProxyInstance, "newProxyInstance(loader,…onsumerClass()), handler)");
        obj.getClass().getMethod("addWindowLayoutInfoListener", Activity.class, OooO0O0()).invoke(obj, activity, objNewProxyInstance);
        return new C24808OooO0Oo(obj.getClass().getMethod("removeWindowLayoutInfoListener", OooO0O0()), obj, objNewProxyInstance);
    }

    public final Class<?> OooO0O0() throws ClassNotFoundException {
        Class<?> clsLoadClass = this.f84133OooO00o.loadClass("java.util.function.Consumer");
        OooOOO0.OooO0o(clsLoadClass, "loader.loadClass(\"java.util.function.Consumer\")");
        return clsLoadClass;
    }
}
