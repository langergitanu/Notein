package oO0OOoo0;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.net.ssl.SSLSocket;

/* JADX INFO: renamed from: oO0OOoo0.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33134OooO0o<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Class<?> f119821OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f119822OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Class[] f119823OooO0OO;

    public C33134OooO0o(Class<?> cls, String str, Class... clsArr) {
        this.f119821OooO00o = cls;
        this.f119822OooO0O0 = str;
        this.f119823OooO0OO = clsArr;
    }

    public static Method OooO0O0(Class<?> cls, String str, Class[] clsArr) {
        if (cls != null) {
            try {
                if ((cls.getModifiers() & 1) == 0) {
                    return OooO0O0(cls.getSuperclass(), str, clsArr);
                }
                Method method = cls.getMethod(str, clsArr);
                try {
                    if ((method.getModifiers() & 1) != 0) {
                        return method;
                    }
                } catch (NoSuchMethodException unused) {
                    return method;
                }
            } catch (NoSuchMethodException unused2) {
                return null;
            }
        }
        return null;
    }

    public final Method OooO00o(Class<?> cls) {
        Class<?> cls2;
        Method methodOooO0O0 = OooO0O0(cls, this.f119822OooO0O0, this.f119823OooO0OO);
        if (methodOooO0O0 == null || (cls2 = this.f119821OooO00o) == null || cls2.isAssignableFrom(methodOooO0O0.getReturnType())) {
            return methodOooO0O0;
        }
        return null;
    }

    public final Object OooO0OO(SSLSocket sSLSocket, Object... objArr) throws InvocationTargetException {
        Method methodOooO00o = OooO00o(sSLSocket.getClass());
        if (methodOooO00o == null) {
            throw new AssertionError("Method " + this.f119822OooO0O0 + " not supported for object " + sSLSocket);
        }
        try {
            return methodOooO00o.invoke(sSLSocket, objArr);
        } catch (IllegalAccessException e) {
            AssertionError assertionError = new AssertionError("Unexpectedly could not call: " + methodOooO00o);
            assertionError.initCause(e);
            throw assertionError;
        }
    }

    public final void OooO0Oo(SSLSocket sSLSocket, Object... objArr) {
        try {
            Method methodOooO00o = OooO00o(sSLSocket.getClass());
            if (methodOooO00o == null) {
                return;
            }
            try {
                methodOooO00o.invoke(sSLSocket, objArr);
            } catch (IllegalAccessException unused) {
            }
        } catch (InvocationTargetException e) {
            Throwable targetException = e.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    public final Object OooO0o0(SSLSocket sSLSocket, Object... objArr) {
        try {
            return OooO0OO(sSLSocket, objArr);
        } catch (InvocationTargetException e) {
            Throwable targetException = e.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }
}
