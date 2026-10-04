package okhttp3;

import com.huawei.hms.network.embedded.C18388v5;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, m80612d2 = {"Lokhttp3/Protocol;", "", "Companion", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
public enum Protocol {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC(C18388v5.f56369c);


    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final Companion f124229OooOo = new Companion(0);

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final String f124237OooOo0o;

    @Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lokhttp3/Protocol$Companion;", "", "<init>", "()V", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        public static Protocol OooO00o(String str) throws IOException {
            Protocol protocol = Protocol.HTTP_1_0;
            if (str.equals("http/1.0")) {
                return protocol;
            }
            Protocol protocol2 = Protocol.HTTP_1_1;
            if (str.equals("http/1.1")) {
                return protocol2;
            }
            Protocol protocol3 = Protocol.H2_PRIOR_KNOWLEDGE;
            if (str.equals("h2_prior_knowledge")) {
                return protocol3;
            }
            Protocol protocol4 = Protocol.HTTP_2;
            if (str.equals("h2")) {
                return protocol4;
            }
            Protocol protocol5 = Protocol.SPDY_3;
            if (str.equals("spdy/3.1")) {
                return protocol5;
            }
            Protocol protocol6 = Protocol.QUIC;
            if (str.equals(C18388v5.f56369c)) {
                return protocol6;
            }
            throw new IOException(OooOOO0.OooOOO0(str, "Unexpected protocol: "));
        }

        private Companion() {
        }
    }

    Protocol(String str) {
        this.f124237OooOo0o = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f124237OooOo0o;
    }
}
