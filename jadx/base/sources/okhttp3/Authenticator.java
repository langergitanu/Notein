package okhttp3;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import okhttp3.internal.authenticator.JavaNetAuthenticator;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m80612d2 = {"Lokhttp3/Authenticator;", "", "Companion", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
public interface Authenticator {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Authenticator f124029OooO00o;

    @Metadata(m80611d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0006B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0013\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0001R\u0013\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0001¨\u0006\u0007"}, m80612d2 = {"Lokhttp3/Authenticator$Companion;", "", "()V", "JAVA_NET_AUTHENTICATOR", "Lokhttp3/Authenticator;", "NONE", "AuthenticatorNone", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int f124030OooO00o = 0;

        @Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lokhttp3/Authenticator$Companion$AuthenticatorNone;", "Lokhttp3/Authenticator;", "<init>", "()V", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
        public static final class AuthenticatorNone implements Authenticator {
            @Override // okhttp3.Authenticator
            public final Request authenticate(Route route, Response response) {
                OooOOO0.OooO0oO(response, "response");
                return null;
            }
        }

        static {
            new Companion();
        }

        private Companion() {
        }
    }

    static {
        int i = Companion.f124030OooO00o;
        f124029OooO00o = new Companion.AuthenticatorNone();
        new JavaNetAuthenticator(0);
    }

    Request authenticate(Route route, Response response) throws IOException;
}
