package okhttp3.internal.platform.android;

import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import okhttp3.Protocol;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m80612d2 = {"Lokhttp3/internal/platform/android/SocketAdapter;", "", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
public interface SocketAdapter {

    @Metadata(m80613k = 3, m80614mv = {1, 6, 0}, m80616xi = 48)
    public static final class DefaultImpls {
    }

    boolean OooO00o(SSLSocket sSLSocket);

    String OooO0O0(SSLSocket sSLSocket);

    void OooO0OO(SSLSocket sSLSocket, String str, List<? extends Protocol> list);

    boolean isSupported();
}
