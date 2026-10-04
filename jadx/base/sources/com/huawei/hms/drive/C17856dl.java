package com.huawei.hms.drive;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: renamed from: com.huawei.hms.drive.dl */
/* JADX INFO: loaded from: classes6.dex */
class C17856dl extends C17858dn {

    /* JADX INFO: renamed from: a */
    private final Method f53374a;

    /* JADX INFO: renamed from: b */
    private final Method f53375b;

    /* JADX INFO: renamed from: c */
    private final Method f53376c;

    /* JADX INFO: renamed from: d */
    private final Class<?> f53377d;

    /* JADX INFO: renamed from: e */
    private final Class<?> f53378e;

    /* JADX INFO: renamed from: com.huawei.hms.drive.dl$a */
    public static class a implements InvocationHandler {

        /* JADX INFO: renamed from: a */
        boolean f53379a;

        /* JADX INFO: renamed from: b */
        String f53380b;

        /* JADX INFO: renamed from: c */
        private final List<String> f53381c;

        public a(List<String> list) {
            this.f53381c = list;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (objArr == null) {
                objArr = C17806bp.f52955b;
            }
            if (name.equals("supports") && Boolean.TYPE == returnType) {
                return Boolean.TRUE;
            }
            if (name.equals("unsupported") && Void.TYPE == returnType) {
                this.f53379a = true;
                return null;
            }
            if (name.equals("protocols") && objArr.length == 0) {
                return this.f53381c;
            }
            if ((name.equals("selectProtocol") || name.equals("select")) && String.class == returnType && objArr.length == 1) {
                Object obj2 = objArr[0];
                if (obj2 instanceof List) {
                    List list = (List) obj2;
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        if (this.f53381c.contains(list.get(i))) {
                            String str = (String) list.get(i);
                            this.f53380b = str;
                            return str;
                        }
                    }
                    String str2 = this.f53381c.get(0);
                    this.f53380b = str2;
                    return str2;
                }
            }
            if ((!name.equals("protocolSelected") && !name.equals("selected")) || objArr.length != 1) {
                return method.invoke(this, objArr);
            }
            this.f53380b = (String) objArr[0];
            return null;
        }
    }

    public C17856dl(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2) {
        this.f53374a = method;
        this.f53375b = method2;
        this.f53376c = method3;
        this.f53377d = cls;
        this.f53378e = cls2;
    }

    @Override // com.huawei.hms.drive.C17858dn
    /* JADX INFO: renamed from: a */
    public void mo76721a(SSLSocket sSLSocket, String str, List<EnumC17796bf> list) {
        try {
            this.f53374a.invoke(null, sSLSocket, Proxy.newProxyInstance(C17858dn.class.getClassLoader(), new Class[]{this.f53377d, this.f53378e}, new a(C17858dn.m76754a(list))));
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw C17806bp.m76327a("unable to set alpn", (Exception) e);
        }
    }

    @Override // com.huawei.hms.drive.C17858dn
    /* JADX INFO: renamed from: b */
    public void mo76745b(SSLSocket sSLSocket) {
        try {
            this.f53376c.invoke(null, sSLSocket);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw C17806bp.m76327a("unable to remove alpn", (Exception) e);
        }
    }

    @Override // com.huawei.hms.drive.C17858dn
    /* JADX INFO: renamed from: a */
    public String mo76720a(SSLSocket sSLSocket) {
        try {
            a aVar = (a) Proxy.getInvocationHandler(this.f53375b.invoke(null, sSLSocket));
            boolean z = aVar.f53379a;
            if (!z && aVar.f53380b == null) {
                C17858dn.m76756e().mo76729a(4, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", (Throwable) null);
                return null;
            }
            if (z) {
                return null;
            }
            return aVar.f53380b;
        } catch (IllegalAccessException e) {
            e = e;
            throw C17806bp.m76327a("unable to get selected protocol", e);
        } catch (InvocationTargetException e2) {
            e = e2;
            throw C17806bp.m76327a("unable to get selected protocol", e);
        }
    }

    /* JADX INFO: renamed from: a */
    public static C17858dn m76744a() {
        try {
            Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN");
            Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider");
            return new C17856dl(cls.getMethod("put", SSLSocket.class, cls2), cls.getMethod("get", SSLSocket.class), cls.getMethod("remove", SSLSocket.class), Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider"), Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider"));
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return null;
        }
    }
}
