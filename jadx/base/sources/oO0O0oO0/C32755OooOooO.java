package oO0O0oO0;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import oO0O0oO0.C32727OooO00o;
import oO0O0ooO.InterfaceC32834OooOo0O;
import oO0O0ooO.InterfaceC32835OooOo0o;

/* JADX INFO: renamed from: oO0O0oO0.OooOooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32755OooOooO extends AbstractC32750OooOoO implements InterfaceC32834OooOo0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Object f117699OooO00o;

    public C32755OooOooO(Object recordComponent) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(recordComponent, "recordComponent");
        this.f117699OooO00o = recordComponent;
    }

    @Override // oO0O0oO0.AbstractC32750OooOoO
    public final Member Oooo000() throws IllegalAccessException, InvocationTargetException {
        Object recordComponent = this.f117699OooO00o;
        kotlin.jvm.internal.OooOOO0.OooO0oO(recordComponent, "recordComponent");
        C32727OooO00o.C20252OooO00o c20252OooO00o = C32727OooO00o.f117657OooO00o;
        Method method = null;
        if (c20252OooO00o == null) {
            Class<?> cls = recordComponent.getClass();
            try {
                c20252OooO00o = new C32727OooO00o.C20252OooO00o(cls.getMethod("getType", new Class[0]), cls.getMethod("getAccessor", new Class[0]));
            } catch (NoSuchMethodException unused) {
                c20252OooO00o = new C32727OooO00o.C20252OooO00o(null, null);
            }
            C32727OooO00o.f117657OooO00o = c20252OooO00o;
        }
        Method method2 = c20252OooO00o.f117659OooO0O0;
        if (method2 != null) {
            Object objInvoke = method2.invoke(recordComponent, new Object[0]);
            kotlin.jvm.internal.OooOOO0.OooO0o0(objInvoke, "null cannot be cast to non-null type java.lang.reflect.Method");
            method = (Method) objInvoke;
        }
        if (method != null) {
            return method;
        }
        throw new NoSuchMethodError("Can't find `getAccessor` method");
    }

    @Override // oO0O0ooO.InterfaceC32834OooOo0O
    public final InterfaceC32835OooOo0o getType() throws IllegalAccessException, InvocationTargetException {
        Object recordComponent = this.f117699OooO00o;
        kotlin.jvm.internal.OooOOO0.OooO0oO(recordComponent, "recordComponent");
        C32727OooO00o.C20252OooO00o c20252OooO00o = C32727OooO00o.f117657OooO00o;
        Class cls = null;
        if (c20252OooO00o == null) {
            Class<?> cls2 = recordComponent.getClass();
            try {
                c20252OooO00o = new C32727OooO00o.C20252OooO00o(cls2.getMethod("getType", new Class[0]), cls2.getMethod("getAccessor", new Class[0]));
            } catch (NoSuchMethodException unused) {
                c20252OooO00o = new C32727OooO00o.C20252OooO00o(null, null);
            }
            C32727OooO00o.f117657OooO00o = c20252OooO00o;
        }
        Method method = c20252OooO00o.f117658OooO00o;
        if (method != null) {
            Object objInvoke = method.invoke(recordComponent, new Object[0]);
            kotlin.jvm.internal.OooOOO0.OooO0o0(objInvoke, "null cannot be cast to non-null type java.lang.Class<*>");
            cls = (Class) objInvoke;
        }
        if (cls != null) {
            return new C32747OooOo00(cls);
        }
        throw new NoSuchMethodError("Can't find `getType` method");
    }
}
