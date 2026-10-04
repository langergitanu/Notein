package okhttp3.internal.platform.android;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import oO0o0O0o.C33580OooO00o;
import okhttp3.Protocol;
import okhttp3.internal.platform.AndroidPlatform;
import okhttp3.internal.platform.Platform;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m80612d2 = {"Lokhttp3/internal/platform/android/AndroidSocketAdapter;", "Lokhttp3/internal/platform/android/SocketAdapter;", "Companion", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
public class AndroidSocketAdapter implements SocketAdapter {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final Companion f124694OooO0o = new Companion(0);

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final AndroidSocketAdapter$Companion$factory$1 f124695OooO0oO = new AndroidSocketAdapter$Companion$factory$1();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Class<? super SSLSocket> f124696OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Method f124697OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Method f124698OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Method f124699OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Method f124700OooO0o0;

    @Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lokhttp3/internal/platform/android/AndroidSocketAdapter$Companion;", "", "<init>", "()V", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        private Companion() {
        }
    }

    public AndroidSocketAdapter(Class<? super SSLSocket> cls) throws NoSuchMethodException {
        this.f124696OooO00o = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        OooOOO0.OooO0o(declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.f124697OooO0O0 = declaredMethod;
        this.f124698OooO0OO = cls.getMethod("setHostname", String.class);
        this.f124699OooO0Oo = cls.getMethod("getAlpnSelectedProtocol", new Class[0]);
        this.f124700OooO0o0 = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final boolean OooO00o(SSLSocket sSLSocket) {
        return this.f124696OooO00o.isInstance(sSLSocket);
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final String OooO0O0(SSLSocket sSLSocket) {
        if (!this.f124696OooO00o.isInstance(sSLSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.f124699OooO0Oo.invoke(sSLSocket, new Object[0]);
            if (bArr == null) {
                return null;
            }
            return new String(bArr, C33580OooO00o.f121231OooO0O0);
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if ((cause instanceof NullPointerException) && OooOOO0.OooO0O0(((NullPointerException) cause).getMessage(), "ssl == null")) {
                return null;
            }
            throw new AssertionError(e2);
        }
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final void OooO0OO(SSLSocket sSLSocket, String str, List<? extends Protocol> protocols) {
        OooOOO0.OooO0oO(protocols, "protocols");
        if (this.f124696OooO00o.isInstance(sSLSocket)) {
            try {
                this.f124697OooO0O0.invoke(sSLSocket, Boolean.TRUE);
                if (str != null) {
                    this.f124698OooO0OO.invoke(sSLSocket, str);
                }
                Method method = this.f124700OooO0o0;
                Platform.f124683OooO00o.getClass();
                method.invoke(sSLSocket, Platform.Companion.OooO0O0(protocols));
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (InvocationTargetException e2) {
                throw new AssertionError(e2);
            }
        }
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final boolean isSupported() {
        AndroidPlatform.f124656OooO0o.getClass();
        return AndroidPlatform.f124657OooO0oO;
    }
}
