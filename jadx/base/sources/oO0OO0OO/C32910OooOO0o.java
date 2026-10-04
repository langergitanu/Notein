package oO0OO0OO;

import com.google.common.base.Preconditions;
import com.huawei.hms.network.embedded.C18115b5;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import oO000Oo.C31989OoooO0O;
import oO0OOoo0.C33134OooO0o;
import oO0OOoo0.C33138OooOO0;
import oO0OOoo0.C33143OooOOO;
import oO0OOoo0.EnumC33141OooOO0O;

/* JADX INFO: renamed from: oO0OO0OO.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C32910OooOO0o {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final Logger f118719OooO0O0 = Logger.getLogger(C32910OooOO0o.class.getName());

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final C32910OooOO0o f118720OooO0OO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C33138OooOO0 f118721OooO00o;

    /* JADX INFO: renamed from: oO0OO0OO.OooOO0o$OooO00o */
    public static final class OooO00o extends C32910OooOO0o {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public static final C33134OooO0o<Socket> f118722OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final C33134OooO0o<Socket> f118723OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public static final C33134OooO0o<Socket> f118724OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public static final C33134OooO0o<Socket> f118725OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public static final C33134OooO0o<Socket> f118726OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public static final C33134OooO0o<Socket> f118727OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public static final Method f118728OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public static final Method f118729OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public static final Method f118730OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public static final Method f118731OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public static final Method f118732OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public static final Method f118733OooOOOO;

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public static final Constructor<?> f118734OooOOOo;

        static {
            Method method;
            Method method2;
            Method method3;
            Method method4;
            Method method5;
            Method method6;
            Logger logger = C32910OooOO0o.f118719OooO0O0;
            Class cls = Boolean.TYPE;
            Constructor<?> constructor = null;
            f118723OooO0Oo = new C33134OooO0o<>(null, "setUseSessionTickets", cls);
            f118725OooO0o0 = new C33134OooO0o<>(null, "setHostname", String.class);
            f118724OooO0o = new C33134OooO0o<>(byte[].class, "getAlpnSelectedProtocol", new Class[0]);
            f118726OooO0oO = new C33134OooO0o<>(null, "setAlpnProtocols", byte[].class);
            f118727OooO0oo = new C33134OooO0o<>(byte[].class, "getNpnSelectedProtocol", new Class[0]);
            f118722OooO = new C33134OooO0o<>(null, "setNpnProtocols", byte[].class);
            try {
                method = SSLParameters.class.getMethod("setApplicationProtocols", String[].class);
                try {
                    method3 = SSLParameters.class.getMethod("getApplicationProtocols", new Class[0]);
                    try {
                        method2 = SSLSocket.class.getMethod("getApplicationProtocol", new Class[0]);
                        try {
                            Class<?> cls2 = Class.forName("android.net.ssl.SSLSockets");
                            method4 = cls2.getMethod("isSupportedSocket", SSLSocket.class);
                            try {
                                method5 = cls2.getMethod("setUseSessionTickets", SSLSocket.class, cls);
                            } catch (ClassNotFoundException e) {
                                e = e;
                                logger.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                                method5 = null;
                            } catch (NoSuchMethodException e2) {
                                e = e2;
                                logger.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                                method5 = null;
                            }
                        } catch (ClassNotFoundException e3) {
                            e = e3;
                            method4 = null;
                        } catch (NoSuchMethodException e4) {
                            e = e4;
                            method4 = null;
                        }
                    } catch (ClassNotFoundException e5) {
                        e = e5;
                        method2 = null;
                        method4 = null;
                    } catch (NoSuchMethodException e6) {
                        e = e6;
                        method2 = null;
                        method4 = null;
                    }
                } catch (ClassNotFoundException e7) {
                    e = e7;
                    method2 = null;
                    method3 = method2;
                    method4 = method3;
                    logger.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                    method5 = null;
                    f118730OooOO0o = method;
                    f118732OooOOO0 = method3;
                    f118731OooOOO = method2;
                    f118728OooOO0 = method4;
                    f118729OooOO0O = method5;
                    method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                    try {
                        constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                    } catch (ClassNotFoundException e8) {
                        e = e8;
                        logger.log(Level.FINER, "Failed to find Android 7.0+ APIs", (Throwable) e);
                    } catch (NoSuchMethodException e9) {
                        e = e9;
                        logger.log(Level.FINER, "Failed to find Android 7.0+ APIs", (Throwable) e);
                    }
                    f118733OooOOOO = method6;
                    f118734OooOOOo = constructor;
                } catch (NoSuchMethodException e10) {
                    e = e10;
                    method2 = null;
                    method3 = method2;
                    method4 = method3;
                    logger.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                    method5 = null;
                    f118730OooOO0o = method;
                    f118732OooOOO0 = method3;
                    f118731OooOOO = method2;
                    f118728OooOO0 = method4;
                    f118729OooOO0O = method5;
                    method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                    constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                    f118733OooOOOO = method6;
                    f118734OooOOOo = constructor;
                }
            } catch (ClassNotFoundException e11) {
                e = e11;
                method = null;
                method2 = null;
            } catch (NoSuchMethodException e12) {
                e = e12;
                method = null;
                method2 = null;
            }
            f118730OooOO0o = method;
            f118732OooOOO0 = method3;
            f118731OooOOO = method2;
            f118728OooOO0 = method4;
            f118729OooOO0O = method5;
            try {
                method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
            } catch (ClassNotFoundException e13) {
                e = e13;
                method6 = null;
            } catch (NoSuchMethodException e14) {
                e = e14;
                method6 = null;
            }
            f118733OooOOOO = method6;
            f118734OooOOOo = constructor;
        }

        @Override // oO0OO0OO.C32910OooOO0o
        public final void OooO00o(SSLSocket sSLSocket, String str, List<EnumC33141OooOO0O> list) {
            Constructor<?> constructor;
            boolean z;
            Method method;
            ArrayList arrayList = new ArrayList();
            Iterator<EnumC33141OooOO0O> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().f119854OooOo0o);
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            if (str != null) {
                try {
                    try {
                        if (C32910OooOO0o.OooO0OO(str)) {
                            Method method2 = f118728OooOO0;
                            if (method2 == null || !((Boolean) method2.invoke(null, sSLSocket)).booleanValue()) {
                                f118723OooO0Oo.OooO0Oo(sSLSocket, Boolean.TRUE);
                            } else {
                                f118729OooOO0O.invoke(null, sSLSocket, Boolean.TRUE);
                            }
                            Method method3 = f118733OooOOOO;
                            if (method3 == null || (constructor = f118734OooOOOo) == null) {
                                f118725OooO0o0.OooO0Oo(sSLSocket, str);
                            } else {
                                method3.invoke(sSLParameters, Collections.singletonList(constructor.newInstance(str)));
                            }
                        }
                    } catch (InvocationTargetException e) {
                        throw new RuntimeException(e);
                    }
                } catch (IllegalAccessException e2) {
                    throw new RuntimeException(e2);
                } catch (InstantiationException e3) {
                    throw new RuntimeException(e3);
                }
            }
            Method method4 = f118731OooOOO;
            if (method4 != null) {
                try {
                    method4.invoke(sSLSocket, new Object[0]);
                    f118730OooOO0o.invoke(sSLParameters, strArr);
                    z = true;
                } catch (InvocationTargetException e4) {
                    if (!(e4.getTargetException() instanceof UnsupportedOperationException)) {
                        throw e4;
                    }
                    C32910OooOO0o.f118719OooO0O0.log(Level.FINER, "setApplicationProtocol unsupported, will try old methods");
                    z = false;
                }
            } else {
                z = false;
            }
            sSLSocket.setSSLParameters(sSLParameters);
            if (z && (method = f118732OooOOO0) != null && Arrays.equals(strArr, (String[]) method.invoke(sSLSocket.getSSLParameters(), new Object[0]))) {
                return;
            }
            Object[] objArr = {C33138OooOO0.OooO0O0(list)};
            C33138OooOO0 c33138OooOO0 = this.f118721OooO00o;
            if (c33138OooOO0.OooO0o0() == C33138OooOO0.EnumC33140OooO0o0.f119846OooOo0o) {
                f118726OooO0oO.OooO0o0(sSLSocket, objArr);
            }
            if (c33138OooOO0.OooO0o0() == C33138OooOO0.EnumC33140OooO0o0.f119848OooOoO0) {
                throw new RuntimeException("We can not do TLS handshake on this Android version, please install the Google Play Services Dynamic Security Provider to use TLS");
            }
            f118722OooO.OooO0o0(sSLSocket, objArr);
        }

        @Override // oO0OO0OO.C32910OooOO0o
        public final String OooO0O0(SSLSocket sSLSocket) {
            Logger logger = C32910OooOO0o.f118719OooO0O0;
            Method method = f118731OooOOO;
            if (method != null) {
                try {
                    return (String) method.invoke(sSLSocket, new Object[0]);
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                } catch (InvocationTargetException e2) {
                    if (!(e2.getTargetException() instanceof UnsupportedOperationException)) {
                        throw new RuntimeException(e2);
                    }
                    logger.log(Level.FINER, "Socket unsupported for getApplicationProtocol, will try old methods");
                }
            }
            C33138OooOO0 c33138OooOO0 = this.f118721OooO00o;
            if (c33138OooOO0.OooO0o0() == C33138OooOO0.EnumC33140OooO0o0.f119846OooOo0o) {
                try {
                    byte[] bArr = (byte[]) f118724OooO0o.OooO0o0(sSLSocket, new Object[0]);
                    if (bArr != null) {
                        return new String(bArr, C33143OooOOO.f119859OooO0O0);
                    }
                } catch (Exception e3) {
                    logger.log(Level.FINE, "Failed calling getAlpnSelectedProtocol()", (Throwable) e3);
                }
            }
            if (c33138OooOO0.OooO0o0() == C33138OooOO0.EnumC33140OooO0o0.f119848OooOoO0) {
                return null;
            }
            try {
                byte[] bArr2 = (byte[]) f118727OooO0oo.OooO0o0(sSLSocket, new Object[0]);
                if (bArr2 != null) {
                    return new String(bArr2, C33143OooOOO.f119859OooO0O0);
                }
                return null;
            } catch (Exception e4) {
                logger.log(Level.FINE, "Failed calling getNpnSelectedProtocol()", (Throwable) e4);
                return null;
            }
        }

        @Override // oO0OO0OO.C32910OooOO0o
        public final String OooO0Oo(SSLSocket sSLSocket, String str, List<EnumC33141OooOO0O> list) throws IOException {
            String strOooO0O0 = OooO0O0(sSLSocket);
            return strOooO0O0 == null ? super.OooO0Oo(sSLSocket, str, list) : strOooO0O0;
        }
    }

    static {
        C32910OooOO0o c32910OooOO0o;
        C33138OooOO0 c33138OooOO0 = C33138OooOO0.f119828OooO0Oo;
        ClassLoader classLoader = C32910OooOO0o.class.getClassLoader();
        try {
            classLoader.loadClass("com.android.org.conscrypt.OpenSSLSocketImpl");
        } catch (ClassNotFoundException e) {
            Level level = Level.FINE;
            Logger logger = f118719OooO0O0;
            logger.log(level, "Unable to find Conscrypt. Skipping", (Throwable) e);
            try {
                classLoader.loadClass("org.apache.harmony.xnet.provider.jsse.OpenSSLSocketImpl");
            } catch (ClassNotFoundException e2) {
                logger.log(Level.FINE, "Unable to find any OpenSSLSocketImpl. Skipping", (Throwable) e2);
                c32910OooOO0o = new C32910OooOO0o(c33138OooOO0);
            }
        }
        c32910OooOO0o = new OooO00o(c33138OooOO0);
        f118720OooO0OO = c32910OooOO0o;
    }

    public C32910OooOO0o(C33138OooOO0 c33138OooOO0) {
        this.f118721OooO00o = (C33138OooOO0) Preconditions.checkNotNull(c33138OooOO0, "platform");
    }

    public static boolean OooO0OO(String str) {
        if (str.contains(C18115b5.CONNECTOR)) {
            return false;
        }
        try {
            Preconditions.checkArgument(C31989OoooO0O.OooO00o(str).getAuthority().indexOf(64) == -1, "Userinfo must not be present on authority: '%s'", str);
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public void OooO00o(SSLSocket sSLSocket, String str, List<EnumC33141OooOO0O> list) {
        this.f118721OooO00o.OooO0OO(sSLSocket, str, list);
    }

    public String OooO0O0(SSLSocket sSLSocket) {
        return this.f118721OooO00o.OooO0Oo(sSLSocket);
    }

    public String OooO0Oo(SSLSocket sSLSocket, String str, List<EnumC33141OooOO0O> list) throws IOException {
        C33138OooOO0 c33138OooOO0 = this.f118721OooO00o;
        if (list != null) {
            OooO00o(sSLSocket, str, list);
        }
        try {
            sSLSocket.startHandshake();
            String strOooO0O0 = OooO0O0(sSLSocket);
            if (strOooO0O0 != null) {
                return strOooO0O0;
            }
            throw new RuntimeException("TLS ALPN negotiation failed with protocols: " + list);
        } finally {
            c33138OooOO0.OooO00o(sSLSocket);
        }
    }
}
