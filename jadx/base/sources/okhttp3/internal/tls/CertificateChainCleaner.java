package okhttp3.internal.tls;

import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m80612d2 = {"Lokhttp3/internal/tls/CertificateChainCleaner;", "", "<init>", "()V", "Companion", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
public abstract class CertificateChainCleaner {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Companion f124723OooO00o = new Companion(0);

    @Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lokhttp3/internal/tls/CertificateChainCleaner$Companion;", "", "<init>", "()V", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        private Companion() {
        }
    }

    public abstract List OooO00o(String str, List list) throws SSLPeerUnverifiedException;
}
