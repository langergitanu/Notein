package oO0OOoo0;

import com.google.android.gms.security.ProviderInstaller;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.Socket;
import java.security.AccessController;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivilegedActionException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import oOo00OoO.C34524OooO0Oo;

/* JADX INFO: renamed from: oO0OOoo0.OooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C33138OooOO0 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final Logger f119826OooO0O0 = Logger.getLogger(C33138OooOO0.class.getName());

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final String[] f119827OooO0OO = {"com.google.android.gms.org.conscrypt.OpenSSLProvider", "org.conscrypt.OpenSSLProvider", "com.android.org.conscrypt.OpenSSLProvider", "org.apache.harmony.xnet.provider.jsse.OpenSSLProvider", "com.google.android.libraries.stitch.sslguard.SslGuardProvider"};

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final C33138OooOO0 f119828OooO0Oo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Provider f119829OooO00o;

    /* JADX INFO: renamed from: oO0OOoo0.OooOO0$OooO00o */
    public static class OooO00o extends C33138OooOO0 {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final EnumC33140OooO0o0 f119830OooO;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final C33134OooO0o<Socket> f119831OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final C33134OooO0o<Socket> f119832OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final C33134OooO0o<Socket> f119833OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final C33134OooO0o<Socket> f119834OooO0oo;

        public OooO00o(C33134OooO0o c33134OooO0o, C33134OooO0o c33134OooO0o2, C33134OooO0o c33134OooO0o3, C33134OooO0o c33134OooO0o4, Provider provider, EnumC33140OooO0o0 enumC33140OooO0o0) {
            super(provider);
            this.f119832OooO0o0 = c33134OooO0o;
            this.f119831OooO0o = c33134OooO0o2;
            this.f119833OooO0oO = c33134OooO0o3;
            this.f119834OooO0oo = c33134OooO0o4;
            this.f119830OooO = enumC33140OooO0o0;
        }

        @Override // oO0OOoo0.C33138OooOO0
        public final void OooO0OO(SSLSocket sSLSocket, String str, List<EnumC33141OooOO0O> list) {
            if (str != null) {
                this.f119832OooO0o0.OooO0Oo(sSLSocket, Boolean.TRUE);
                this.f119831OooO0o.OooO0Oo(sSLSocket, str);
            }
            C33134OooO0o<Socket> c33134OooO0o = this.f119834OooO0oo;
            if (c33134OooO0o.OooO00o(sSLSocket.getClass()) != null) {
                c33134OooO0o.OooO0o0(sSLSocket, C33138OooOO0.OooO0O0(list));
            }
        }

        @Override // oO0OOoo0.C33138OooOO0
        public final String OooO0Oo(SSLSocket sSLSocket) {
            byte[] bArr;
            C33134OooO0o<Socket> c33134OooO0o = this.f119833OooO0oO;
            if ((c33134OooO0o.OooO00o(sSLSocket.getClass()) != null) && (bArr = (byte[]) c33134OooO0o.OooO0o0(sSLSocket, new Object[0])) != null) {
                return new String(bArr, C33143OooOOO.f119859OooO0O0);
            }
            return null;
        }

        @Override // oO0OOoo0.C33138OooOO0
        public final EnumC33140OooO0o0 OooO0o0() {
            return this.f119830OooO;
        }
    }

    /* JADX INFO: renamed from: oO0OOoo0.OooOO0$OooO0O0 */
    public static class OooO0O0 extends C33138OooOO0 {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final Method f119835OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final Method f119836OooO0o0;

        public OooO0O0(Provider provider, Method method, Method method2) {
            super(provider);
            this.f119836OooO0o0 = method;
            this.f119835OooO0o = method2;
        }

        @Override // oO0OOoo0.C33138OooOO0
        public final void OooO0OO(SSLSocket sSLSocket, String str, List<EnumC33141OooOO0O> list) {
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            ArrayList arrayList = new ArrayList(list.size());
            for (EnumC33141OooOO0O enumC33141OooOO0O : list) {
                if (enumC33141OooOO0O != EnumC33141OooOO0O.HTTP_1_0) {
                    arrayList.add(enumC33141OooOO0O.f119854OooOo0o);
                }
            }
            try {
                this.f119836OooO0o0.invoke(sSLParameters, arrayList.toArray(new String[arrayList.size()]));
                sSLSocket.setSSLParameters(sSLParameters);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (InvocationTargetException e2) {
                throw new RuntimeException(e2);
            }
        }

        @Override // oO0OOoo0.C33138OooOO0
        public final String OooO0Oo(SSLSocket sSLSocket) {
            try {
                return (String) this.f119835OooO0o.invoke(sSLSocket, new Object[0]);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (InvocationTargetException e2) {
                throw new RuntimeException(e2);
            }
        }

        @Override // oO0OOoo0.C33138OooOO0
        public final EnumC33140OooO0o0 OooO0o0() {
            return EnumC33140OooO0o0.f119846OooOo0o;
        }
    }

    /* JADX INFO: renamed from: oO0OOoo0.OooOO0$OooO0OO */
    public static class OooO0OO extends C33138OooOO0 {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final Class<?> f119837OooO;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final Method f119838OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final Method f119839OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final Method f119840OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final Class<?> f119841OooO0oo;

        public OooO0OO(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2, Provider provider) {
            super(provider);
            this.f119839OooO0o0 = method;
            this.f119838OooO0o = method2;
            this.f119840OooO0oO = method3;
            this.f119841OooO0oo = cls;
            this.f119837OooO = cls2;
        }

        @Override // oO0OOoo0.C33138OooOO0
        public final void OooO00o(SSLSocket sSLSocket) {
            try {
                this.f119840OooO0oO.invoke(null, sSLSocket);
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            } catch (InvocationTargetException e) {
                C33138OooOO0.f119826OooO0O0.log(Level.FINE, "Failed to remove SSLSocket from Jetty ALPN", (Throwable) e);
            }
        }

        @Override // oO0OOoo0.C33138OooOO0
        public final void OooO0OO(SSLSocket sSLSocket, String str, List<EnumC33141OooOO0O> list) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                EnumC33141OooOO0O enumC33141OooOO0O = list.get(i);
                if (enumC33141OooOO0O != EnumC33141OooOO0O.HTTP_1_0) {
                    arrayList.add(enumC33141OooOO0O.f119854OooOo0o);
                }
            }
            try {
                this.f119839OooO0o0.invoke(null, sSLSocket, Proxy.newProxyInstance(C33138OooOO0.class.getClassLoader(), new Class[]{this.f119841OooO0oo, this.f119837OooO}, new C33139OooO0Oo(arrayList)));
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (InvocationTargetException e2) {
                throw new AssertionError(e2);
            }
        }

        @Override // oO0OOoo0.C33138OooOO0
        public final String OooO0Oo(SSLSocket sSLSocket) {
            try {
                C33139OooO0Oo c33139OooO0Oo = (C33139OooO0Oo) Proxy.getInvocationHandler(this.f119838OooO0o.invoke(null, sSLSocket));
                boolean z = c33139OooO0Oo.f119843OooO0O0;
                if (!z && c33139OooO0Oo.f119844OooO0OO == null) {
                    C33138OooOO0.f119826OooO0O0.log(Level.INFO, "ALPN callback dropped: SPDY and HTTP/2 are disabled. Is alpn-boot on the boot class path?");
                    return null;
                }
                if (z) {
                    return null;
                }
                return c33139OooO0Oo.f119844OooO0OO;
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            } catch (InvocationTargetException unused2) {
                throw new AssertionError();
            }
        }

        @Override // oO0OOoo0.C33138OooOO0
        public final EnumC33140OooO0o0 OooO0o0() {
            return EnumC33140OooO0o0.f119846OooOo0o;
        }
    }

    /* JADX INFO: renamed from: oO0OOoo0.OooOO0$OooO0Oo, reason: case insensitive filesystem */
    public static class C33139OooO0Oo implements InvocationHandler {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ArrayList f119842OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public boolean f119843OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public String f119844OooO0OO;

        public C33139OooO0Oo(ArrayList arrayList) {
            this.f119842OooO00o = arrayList;
        }

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (objArr == null) {
                objArr = C33143OooOOO.f119858OooO00o;
            }
            if (name.equals("supports") && Boolean.TYPE == returnType) {
                return Boolean.TRUE;
            }
            if (name.equals("unsupported") && Void.TYPE == returnType) {
                this.f119843OooO0O0 = true;
                return null;
            }
            boolean zEquals = name.equals("protocols");
            ArrayList arrayList = this.f119842OooO00o;
            if (zEquals && objArr.length == 0) {
                return arrayList;
            }
            if ((name.equals("selectProtocol") || name.equals("select")) && String.class == returnType && objArr.length == 1) {
                Object obj2 = objArr[0];
                if (obj2 instanceof List) {
                    List list = (List) obj2;
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        if (arrayList.contains(list.get(i))) {
                            String str = (String) list.get(i);
                            this.f119844OooO0OO = str;
                            return str;
                        }
                    }
                    String str2 = (String) arrayList.get(0);
                    this.f119844OooO0OO = str2;
                    return str2;
                }
            }
            if ((!name.equals("protocolSelected") && !name.equals("selected")) || objArr.length != 1) {
                return method.invoke(this, objArr);
            }
            this.f119844OooO0OO = (String) objArr[0];
            return null;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: oO0OOoo0.OooOO0$OooO0o0, reason: case insensitive filesystem */
    public static final class EnumC33140OooO0o0 {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public static final EnumC33140OooO0o0 f119845OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final EnumC33140OooO0o0 f119846OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public static final /* synthetic */ EnumC33140OooO0o0[] f119847OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public static final EnumC33140OooO0o0 f119848OooOoO0;

        static {
            EnumC33140OooO0o0 enumC33140OooO0o0 = new EnumC33140OooO0o0("ALPN_AND_NPN", 0);
            f119846OooOo0o = enumC33140OooO0o0;
            EnumC33140OooO0o0 enumC33140OooO0o02 = new EnumC33140OooO0o0("NPN", 1);
            f119845OooOo = enumC33140OooO0o02;
            EnumC33140OooO0o0 enumC33140OooO0o03 = new EnumC33140OooO0o0("NONE", 2);
            f119848OooOoO0 = enumC33140OooO0o03;
            f119847OooOoO = new EnumC33140OooO0o0[]{enumC33140OooO0o0, enumC33140OooO0o02, enumC33140OooO0o03};
        }

        public EnumC33140OooO0o0() {
            throw null;
        }

        public static EnumC33140OooO0o0 valueOf(String str) {
            return (EnumC33140OooO0o0) Enum.valueOf(EnumC33140OooO0o0.class, str);
        }

        public static EnumC33140OooO0o0[] values() {
            return (EnumC33140OooO0o0[]) f119847OooOoO.clone();
        }
    }

    static {
        Logger logger;
        Provider provider;
        Provider provider2;
        C33138OooOO0 c33138OooOO0;
        Provider[] providers = Security.getProviders();
        int length = providers.length;
        int i = 0;
        loop0: while (true) {
            logger = f119826OooO0O0;
            if (i >= length) {
                logger.log(Level.WARNING, "Unable to find Conscrypt");
                provider = null;
                break;
            }
            Provider provider3 = providers[i];
            for (String str : f119827OooO0OO) {
                if (str.equals(provider3.getClass().getName())) {
                    logger.log(Level.FINE, "Found registered provider {0}", str);
                    provider = provider3;
                    break loop0;
                }
            }
            i++;
        }
        if (provider != null) {
            C33134OooO0o c33134OooO0o = new C33134OooO0o(null, "setUseSessionTickets", Boolean.TYPE);
            C33134OooO0o c33134OooO0o2 = new C33134OooO0o(null, "setHostname", String.class);
            C33134OooO0o c33134OooO0o3 = new C33134OooO0o(byte[].class, "getAlpnSelectedProtocol", new Class[0]);
            C33134OooO0o c33134OooO0o4 = new C33134OooO0o(null, "setAlpnProtocols", byte[].class);
            try {
                Class<?> cls = Class.forName("android.net.TrafficStats");
                cls.getMethod("tagSocket", Socket.class);
                cls.getMethod("untagSocket", Socket.class);
            } catch (ClassNotFoundException | NoSuchMethodException unused) {
            }
            boolean zEquals = provider.getName().equals(ProviderInstaller.PROVIDER_NAME);
            EnumC33140OooO0o0 enumC33140OooO0o0 = EnumC33140OooO0o0.f119846OooOo0o;
            if (!zEquals && !provider.getName().equals("Conscrypt") && !provider.getName().equals("Ssl_Guard")) {
                try {
                    C33138OooOO0.class.getClassLoader().loadClass("android.net.Network");
                } catch (ClassNotFoundException e) {
                    logger.log(Level.FINE, "Can't find class", (Throwable) e);
                    try {
                        C33138OooOO0.class.getClassLoader().loadClass("android.app.ActivityOptions");
                        enumC33140OooO0o0 = EnumC33140OooO0o0.f119845OooOo;
                    } catch (ClassNotFoundException e2) {
                        logger.log(Level.FINE, "Can't find class", (Throwable) e2);
                        enumC33140OooO0o0 = EnumC33140OooO0o0.f119848OooOoO0;
                    }
                }
            }
            c33138OooOO0 = new OooO00o(c33134OooO0o, c33134OooO0o2, c33134OooO0o3, c33134OooO0o4, provider, enumC33140OooO0o0);
        } else {
            try {
                Provider provider4 = SSLContext.getDefault().getProvider();
                try {
                    try {
                        SSLContext sSLContext = SSLContext.getInstance("TLS", provider4);
                        sSLContext.init(null, null, null);
                        ((Method) AccessController.doPrivileged(new C33136OooO0oO())).invoke(sSLContext.createSSLEngine(), new Object[0]);
                        c33138OooOO0 = new OooO0O0(provider4, (Method) AccessController.doPrivileged(new C33137OooO0oo()), (Method) AccessController.doPrivileged(new C33129OooO()));
                    } catch (IllegalAccessException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException | PrivilegedActionException unused2) {
                        Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN");
                        try {
                            c33138OooOO0 = new OooO0OO(cls2.getMethod("put", SSLSocket.class, Class.forName("org.eclipse.jetty.alpn.ALPN$Provider")), cls2.getMethod("get", SSLSocket.class), cls2.getMethod("remove", SSLSocket.class), Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider"), Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider"), provider4);
                        } catch (ClassNotFoundException | NoSuchMethodException unused3) {
                            provider2 = provider4;
                            c33138OooOO0 = new C33138OooOO0(provider2);
                        }
                    }
                } catch (ClassNotFoundException | NoSuchMethodException unused4) {
                    provider2 = provider4;
                    c33138OooOO0 = new C33138OooOO0(provider2);
                    f119828OooO0Oo = c33138OooOO0;
                }
            } catch (NoSuchAlgorithmException e3) {
                throw new RuntimeException(e3);
            }
        }
        f119828OooO0Oo = c33138OooOO0;
    }

    public C33138OooOO0(Provider provider) {
        this.f119829OooO00o = provider;
    }

    public static byte[] OooO0O0(List<EnumC33141OooOO0O> list) {
        C34524OooO0Oo c34524OooO0Oo = new C34524OooO0Oo();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            EnumC33141OooOO0O enumC33141OooOO0O = list.get(i);
            if (enumC33141OooOO0O != EnumC33141OooOO0O.HTTP_1_0) {
                c34524OooO0Oo.o0OoO0o(enumC33141OooOO0O.f119854OooOo0o.length());
                c34524OooO0Oo.o000Oo0o(enumC33141OooOO0O.f119854OooOo0o);
            }
        }
        return c34524OooO0Oo.o0000oo(c34524OooO0Oo.f123723OooOo);
    }

    public void OooO00o(SSLSocket sSLSocket) {
    }

    public void OooO0OO(SSLSocket sSLSocket, String str, List<EnumC33141OooOO0O> list) {
    }

    public String OooO0Oo(SSLSocket sSLSocket) {
        return null;
    }

    public EnumC33140OooO0o0 OooO0o0() {
        return EnumC33140OooO0o0.f119848OooOoO0;
    }
}
