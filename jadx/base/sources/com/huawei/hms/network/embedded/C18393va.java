package com.huawei.hms.network.embedded;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.va */
/* JADX INFO: loaded from: classes9.dex */
public class C18393va<T> {

    /* JADX INFO: renamed from: a */
    public final Class<?> f56488a;

    /* JADX INFO: renamed from: b */
    public final String f56489b;

    /* JADX INFO: renamed from: c */
    public final Class[] f56490c;

    public C18393va(Class<?> cls, String str, Class... clsArr) {
        this.f56488a = cls;
        this.f56489b = str;
        this.f56490c = clsArr;
    }

    /* JADX INFO: renamed from: a */
    public Object m79788a(T t, Object... objArr) throws InvocationTargetException {
        Method methodM79786a = m79786a(t.getClass());
        if (methodM79786a == null) {
            throw new AssertionError("Method " + this.f56489b + " not supported for object " + t);
        }
        try {
            return methodM79786a.invoke(t, objArr);
        } catch (IllegalAccessException e) {
            AssertionError assertionError = new AssertionError("Unexpectedly could not call: " + methodM79786a);
            assertionError.initCause(e);
            throw assertionError;
        }
    }

    /* JADX INFO: renamed from: b */
    public Object m79790b(T t, Object... objArr) throws InvocationTargetException {
        Method methodM79786a = m79786a(t.getClass());
        if (methodM79786a == null) {
            return null;
        }
        try {
            return methodM79786a.invoke(t, objArr);
        } catch (IllegalAccessException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public Object m79791c(T t, Object... objArr) {
        try {
            return m79790b(t, objArr);
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

    /* JADX INFO: renamed from: d */
    public Object m79792d(T t, Object... objArr) {
        try {
            return m79788a(t, objArr);
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

    /* JADX INFO: renamed from: a */
    private Method m79786a(Class<?> cls) {
        Class<?> cls2;
        String str = this.f56489b;
        if (str == null) {
            return null;
        }
        Method methodM79787a = m79787a(cls, str, this.f56490c);
        if (methodM79787a == null || (cls2 = this.f56488a) == null || cls2.isAssignableFrom(methodM79787a.getReturnType())) {
            return methodM79787a;
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static Method m79787a(Class<?> cls, String str, Class[] clsArr) {
        try {
            Method method = cls.getMethod(str, clsArr);
            try {
                if ((method.getModifiers() & 1) == 0) {
                    return null;
                }
                return method;
            } catch (NoSuchMethodException unused) {
                return method;
            }
        } catch (NoSuchMethodException unused2) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m79789a(T t) {
        return m79786a(t.getClass()) != null;
    }
}
