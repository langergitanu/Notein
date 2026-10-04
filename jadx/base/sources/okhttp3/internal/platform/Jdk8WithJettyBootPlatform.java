package okhttp3.internal.platform;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import okhttp3.Protocol;
import okhttp3.internal.platform.Platform;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, m80612d2 = {"Lokhttp3/internal/platform/Jdk8WithJettyBootPlatform;", "Lokhttp3/internal/platform/Platform;", "AlpnProvider", "Companion", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
public final class Jdk8WithJettyBootPlatform extends Platform {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final Companion f124669OooO = new Companion(0);

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Method f124670OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Method f124671OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Method f124672OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final Class<?> f124673OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final Class<?> f124674OooO0oo;

    @Metadata(m80611d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m80612d2 = {"Lokhttp3/internal/platform/Jdk8WithJettyBootPlatform$AlpnProvider;", "Ljava/lang/reflect/InvocationHandler;", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
    public static final class AlpnProvider implements InvocationHandler {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ArrayList f124675OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public boolean f124676OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public String f124677OooO0OO;

        public AlpnProvider(ArrayList arrayList) {
            this.f124675OooO00o = arrayList;
        }

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object proxy, Method method, Object[] objArr) throws Throwable {
            OooOOO0.OooO0oO(proxy, "proxy");
            OooOOO0.OooO0oO(method, "method");
            if (objArr == null) {
                objArr = new Object[0];
            }
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (OooOOO0.OooO0O0(name, "supports") && OooOOO0.OooO0O0(Boolean.TYPE, returnType)) {
                return Boolean.TRUE;
            }
            if (OooOOO0.OooO0O0(name, "unsupported") && OooOOO0.OooO0O0(Void.TYPE, returnType)) {
                this.f124676OooO0O0 = true;
                return null;
            }
            boolean zOooO0O0 = OooOOO0.OooO0O0(name, "protocols");
            ArrayList arrayList = this.f124675OooO00o;
            if (zOooO0O0 && objArr.length == 0) {
                return arrayList;
            }
            if ((OooOOO0.OooO0O0(name, "selectProtocol") || OooOOO0.OooO0O0(name, "select")) && String.class.equals(returnType) && objArr.length == 1) {
                Object obj = objArr[0];
                if (obj instanceof List) {
                    if (obj == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<*>");
                    }
                    List list = (List) obj;
                    int size = list.size();
                    if (size >= 0) {
                        int i = 0;
                        while (true) {
                            int i2 = i + 1;
                            Object obj2 = list.get(i);
                            if (obj2 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                            }
                            String str = (String) obj2;
                            if (arrayList.contains(str)) {
                                this.f124677OooO0OO = str;
                                return str;
                            }
                            if (i == size) {
                                break;
                            }
                            i = i2;
                        }
                    }
                    String str2 = (String) arrayList.get(0);
                    this.f124677OooO0OO = str2;
                    return str2;
                }
            }
            if ((!OooOOO0.OooO0O0(name, "protocolSelected") && !OooOOO0.OooO0O0(name, "selected")) || objArr.length != 1) {
                return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
            }
            Object obj3 = objArr[0];
            if (obj3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            this.f124677OooO0OO = (String) obj3;
            return null;
        }
    }

    @Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lokhttp3/internal/platform/Jdk8WithJettyBootPlatform$Companion;", "", "<init>", "()V", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        private Companion() {
        }
    }

    public Jdk8WithJettyBootPlatform(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2) {
        this.f124670OooO0Oo = method;
        this.f124672OooO0o0 = method2;
        this.f124671OooO0o = method3;
        this.f124673OooO0oO = cls;
        this.f124674OooO0oo = cls2;
    }

    @Override // okhttp3.internal.platform.Platform
    public final void OooO00o(SSLSocket sSLSocket) {
        try {
            this.f124671OooO0o.invoke(null, sSLSocket);
        } catch (IllegalAccessException e) {
            throw new AssertionError("failed to remove ALPN", e);
        } catch (InvocationTargetException e2) {
            throw new AssertionError("failed to remove ALPN", e2);
        }
    }

    @Override // okhttp3.internal.platform.Platform
    public final void OooO0Oo(SSLSocket sSLSocket, String str, List<? extends Protocol> protocols) {
        OooOOO0.OooO0oO(protocols, "protocols");
        Platform.f124683OooO00o.getClass();
        try {
            this.f124670OooO0Oo.invoke(null, sSLSocket, Proxy.newProxyInstance(Platform.class.getClassLoader(), new Class[]{this.f124673OooO0oO, this.f124674OooO0oo}, new AlpnProvider(Platform.Companion.OooO00o(protocols))));
        } catch (IllegalAccessException e) {
            throw new AssertionError("failed to set ALPN", e);
        } catch (InvocationTargetException e2) {
            throw new AssertionError("failed to set ALPN", e2);
        }
    }

    @Override // okhttp3.internal.platform.Platform
    public final String OooO0o(SSLSocket sSLSocket) {
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.f124672OooO0o0.invoke(null, sSLSocket));
            if (invocationHandler == null) {
                throw new NullPointerException("null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
            }
            AlpnProvider alpnProvider = (AlpnProvider) invocationHandler;
            boolean z = alpnProvider.f124676OooO0O0;
            if (!z && alpnProvider.f124677OooO0OO == null) {
                Platform.OooO("ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 4, null);
                return null;
            }
            if (z) {
                return null;
            }
            return alpnProvider.f124677OooO0OO;
        } catch (IllegalAccessException e) {
            throw new AssertionError("failed to get ALPN selected protocol", e);
        } catch (InvocationTargetException e2) {
            throw new AssertionError("failed to get ALPN selected protocol", e2);
        }
    }
}
