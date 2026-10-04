package com.huawei.hms.network.embedded;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.ta */
/* JADX INFO: loaded from: classes9.dex */
public class C18367ta extends C18406wa {

    /* JADX INFO: renamed from: e */
    public final Method f56244e;

    /* JADX INFO: renamed from: f */
    public final Method f56245f;

    /* JADX INFO: renamed from: g */
    public final Method f56246g;

    /* JADX INFO: renamed from: h */
    public final Class<?> f56247h;

    /* JADX INFO: renamed from: i */
    public final Class<?> f56248i;

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.ta$a */
    public static class a implements InvocationHandler {

        /* JADX INFO: renamed from: a */
        public final List<String> f56249a;

        /* JADX INFO: renamed from: b */
        public boolean f56250b;

        /* JADX INFO: renamed from: c */
        public String f56251c;

        public a(List<String> list) {
            this.f56249a = list;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (objArr == null) {
                objArr = C18313p8.f55893b;
            }
            if (name.equals("supports") && Boolean.TYPE == returnType) {
                return Boolean.TRUE;
            }
            if (name.equals("unsupported") && Void.TYPE == returnType) {
                this.f56250b = true;
                return null;
            }
            if (name.equals("protocols") && objArr.length == 0) {
                return this.f56249a;
            }
            if ((name.equals("selectProtocol") || name.equals("select")) && String.class == returnType && objArr.length == 1) {
                Object obj2 = objArr[0];
                if (obj2 instanceof List) {
                    List list = (List) obj2;
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        String str = (String) list.get(i);
                        if (this.f56249a.contains(str)) {
                            this.f56251c = str;
                            return str;
                        }
                    }
                    String str2 = this.f56249a.get(0);
                    this.f56251c = str2;
                    return str2;
                }
            }
            if ((!name.equals("protocolSelected") && !name.equals("selected")) || objArr.length != 1) {
                return method.invoke(this, objArr);
            }
            this.f56251c = (String) objArr[0];
            return null;
        }
    }

    public C18367ta(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2) {
        this.f56244e = method;
        this.f56245f = method2;
        this.f56246g = method3;
        this.f56247h = cls;
        this.f56248i = cls2;
    }

    /* JADX INFO: renamed from: i */
    public static C18406wa m79571i() {
        try {
            Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
            Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
            Class<?> cls3 = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
            Class<?> cls4 = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
            return new C18367ta(cls.getMethod("put", SSLSocket.class, cls2), cls.getMethod("get", SSLSocket.class), cls.getMethod("remove", SSLSocket.class), cls3, cls4);
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return null;
        }
    }

    @Override // com.huawei.hms.network.embedded.C18406wa
    /* JADX INFO: renamed from: a */
    public void mo79572a(SSLSocket sSLSocket) {
        try {
            this.f56246g.invoke(null, sSLSocket);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new AssertionError("failed to remove ALPN", e);
        }
    }

    @Override // com.huawei.hms.network.embedded.C18406wa
    /* JADX INFO: renamed from: b */
    public String mo79400b(SSLSocket sSLSocket) {
        try {
            a aVar = (a) Proxy.getInvocationHandler(this.f56245f.invoke(null, sSLSocket));
            boolean z = aVar.f56250b;
            if (!z && aVar.f56251c == null) {
                C18406wa.m79845f().mo79425a(4, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", (Throwable) null);
                return null;
            }
            if (z) {
                return null;
            }
            return aVar.f56251c;
        } catch (IllegalAccessException e) {
            e = e;
            throw new AssertionError("failed to get ALPN selected protocol", e);
        } catch (InvocationTargetException e2) {
            e = e2;
            throw new AssertionError("failed to get ALPN selected protocol", e);
        }
    }

    @Override // com.huawei.hms.network.embedded.C18406wa
    /* JADX INFO: renamed from: a */
    public void mo79399a(SSLSocket sSLSocket, String str, List<EnumC18132c8> list) {
        try {
            this.f56244e.invoke(null, sSLSocket, Proxy.newProxyInstance(C18406wa.class.getClassLoader(), new Class[]{this.f56247h, this.f56248i}, new a(C18406wa.m79840a(list))));
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new AssertionError("failed to set ALPN", e);
        }
    }
}
