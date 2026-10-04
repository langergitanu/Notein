package com.huawei.hms.drive;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: com.huawei.hms.drive.dm */
/* JADX INFO: loaded from: classes6.dex */
class C17857dm<T> {

    /* JADX INFO: renamed from: a */
    private final Class<?> f53382a;

    /* JADX INFO: renamed from: b */
    private final String f53383b;

    /* JADX INFO: renamed from: c */
    private final Class[] f53384c;

    public C17857dm(Class<?> cls, String str, Class... clsArr) {
        this.f53382a = cls;
        this.f53383b = str;
        this.f53384c = clsArr;
    }

    /* JADX INFO: renamed from: a */
    public boolean m76749a(T t) {
        return m76746a(t.getClass()) != null;
    }

    /* JADX INFO: renamed from: b */
    public Object m76750b(T t, Object... objArr) {
        try {
            return m76748a(t, objArr);
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

    /* JADX INFO: renamed from: c */
    public Object m76751c(T t, Object... objArr) throws InvocationTargetException {
        Method methodM76746a = m76746a(t.getClass());
        if (methodM76746a == null) {
            throw new AssertionError("Method " + this.f53383b + " not supported for object " + t);
        }
        try {
            return methodM76746a.invoke(t, objArr);
        } catch (IllegalAccessException e) {
            AssertionError assertionError = new AssertionError("Unexpectedly could not call: " + methodM76746a);
            assertionError.initCause(e);
            throw assertionError;
        }
    }

    /* JADX INFO: renamed from: d */
    public Object m76752d(T t, Object... objArr) {
        try {
            return m76751c(t, objArr);
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
    public Object m76748a(T t, Object... objArr) throws InvocationTargetException {
        Method methodM76746a = m76746a(t.getClass());
        if (methodM76746a == null) {
            return null;
        }
        try {
            return methodM76746a.invoke(t, objArr);
        } catch (IllegalAccessException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    private Method m76746a(Class<?> cls) {
        Class<?> cls2;
        String str = this.f53383b;
        if (str == null) {
            return null;
        }
        Method methodM76747a = m76747a(cls, str, this.f53384c);
        if (methodM76747a == null || (cls2 = this.f53382a) == null || cls2.isAssignableFrom(methodM76747a.getReturnType())) {
            return methodM76747a;
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    private static Method m76747a(Class<?> cls, String str, Class[] clsArr) {
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
}
