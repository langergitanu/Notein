package okhttp3.internal.http;

import java.io.IOException;
import kotlin.Metadata;
import oOo00OoO.InterfaceC34544OooOoO;
import oOo00OoO.InterfaceC34548OooOoo0;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.connection.RealConnection;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m80612d2 = {"Lokhttp3/internal/http/ExchangeCodec;", "", "Companion", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
public interface ExchangeCodec {

    @Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lokhttp3/internal/http/ExchangeCodec$Companion;", "", "<init>", "()V", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
    public static final class Companion {
        static {
            new Companion();
        }

        private Companion() {
        }
    }

    InterfaceC34548OooOoo0 OooO00o(Response response) throws IOException;

    /* JADX INFO: renamed from: OooO0O0 */
    RealConnection getF124593OooO00o();

    InterfaceC34544OooOoO OooO0OO(Request request, long j) throws IOException;

    void OooO0Oo() throws IOException;

    long OooO0o(Response response) throws IOException;

    void OooO0o0() throws IOException;

    void OooO0oO(Request request) throws IOException;

    Response.Builder OooO0oo(boolean z) throws IOException;

    void cancel();
}
