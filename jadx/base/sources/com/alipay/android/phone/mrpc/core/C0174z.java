package com.alipay.android.phone.mrpc.core;

import android.os.Looper;
import com.alipay.android.phone.mrpc.core.p004a.C0143d;
import com.alipay.android.phone.mrpc.core.p004a.C0144e;
import com.alipay.mobile.framework.service.annotation.OperationType;
import com.alipay.mobile.framework.service.annotation.ResetCookie;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: com.alipay.android.phone.mrpc.core.z */
/* JADX INFO: loaded from: classes.dex */
public final class C0174z {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal<Object> f121a = new ThreadLocal<>();

    /* JADX INFO: renamed from: b */
    public static final ThreadLocal<Map<String, Object>> f122b = new ThreadLocal<>();

    /* JADX INFO: renamed from: c */
    public byte f123c = 0;

    /* JADX INFO: renamed from: d */
    public AtomicInteger f124d = new AtomicInteger();

    /* JADX INFO: renamed from: e */
    public C0172x f125e;

    public C0174z(C0172x c0172x) {
        this.f125e = c0172x;
    }

    /* JADX INFO: renamed from: a */
    public final Object m121a(Method method, Object[] objArr) {
        if (Looper.myLooper() != null && Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalThreadStateException("can't in main thread call rpc .");
        }
        OperationType operationType = (OperationType) method.getAnnotation(OperationType.class);
        boolean z = method.getAnnotation(ResetCookie.class) != null;
        Type genericReturnType = method.getGenericReturnType();
        method.getAnnotations();
        ThreadLocal<Object> threadLocal = f121a;
        threadLocal.set(null);
        ThreadLocal<Map<String, Object>> threadLocal2 = f122b;
        threadLocal2.set(null);
        if (operationType == null) {
            throw new IllegalStateException("OperationType must be set.");
        }
        String strValue = operationType.value();
        int iIncrementAndGet = this.f124d.incrementAndGet();
        try {
            if (this.f123c == 0) {
                C0144e c0144e = new C0144e(iIncrementAndGet, strValue, objArr);
                if (threadLocal2.get() != null) {
                    c0144e.mo44a(threadLocal2.get());
                }
                byte[] bArr = (byte[]) new C0158j(this.f125e.m119a(), method, iIncrementAndGet, strValue, c0144e.mo45a(), z).mo70a();
                threadLocal2.set(null);
                Object objMo43a = new C0143d(genericReturnType, bArr).mo43a();
                if (genericReturnType != Void.TYPE) {
                    threadLocal.set(objMo43a);
                }
            }
            return threadLocal.get();
        } catch (RpcException e) {
            e.setOperationType(strValue);
            throw e;
        }
    }
}
