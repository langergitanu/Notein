package okhttp3.internal.p621ws;

import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m80612d2 = {"Lokhttp3/internal/ws/WebSocketExtensions;", "", "Companion", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
public final /* data */ class WebSocketExtensions {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final Companion f124756OooO0oO = new Companion(0);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final boolean f124757OooO00o = false;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Integer f124758OooO0O0 = null;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final boolean f124759OooO0OO = false;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Integer f124760OooO0Oo = null;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final boolean f124762OooO0o0 = false;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final boolean f124761OooO0o = false;

    @Metadata(m80611d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m80612d2 = {"Lokhttp3/internal/ws/WebSocketExtensions$Companion;", "", "<init>", "()V", "", "HEADER_WEB_SOCKET_EXTENSION", "Ljava/lang/String;", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        private Companion() {
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebSocketExtensions)) {
            return false;
        }
        WebSocketExtensions webSocketExtensions = (WebSocketExtensions) obj;
        return this.f124757OooO00o == webSocketExtensions.f124757OooO00o && OooOOO0.OooO0O0(this.f124758OooO0O0, webSocketExtensions.f124758OooO0O0) && this.f124759OooO0OO == webSocketExtensions.f124759OooO0OO && OooOOO0.OooO0O0(this.f124760OooO0Oo, webSocketExtensions.f124760OooO0Oo) && this.f124762OooO0o0 == webSocketExtensions.f124762OooO0o0 && this.f124761OooO0o == webSocketExtensions.f124761OooO0o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r3v4, types: [int] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v8 */
    public final int hashCode() {
        boolean z = this.f124757OooO00o;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i = r1 * 31;
        Integer num = this.f124758OooO0O0;
        int iHashCode = (i + (num == null ? 0 : num.hashCode())) * 31;
        boolean z2 = this.f124759OooO0OO;
        ?? r3 = z2;
        if (z2) {
            r3 = 1;
        }
        int i2 = (iHashCode + r3) * 31;
        Integer num2 = this.f124760OooO0Oo;
        int iHashCode2 = (i2 + (num2 != null ? num2.hashCode() : 0)) * 31;
        boolean z3 = this.f124762OooO0o0;
        ?? r2 = z3;
        if (z3) {
            r2 = 1;
        }
        int i3 = (iHashCode2 + r2) * 31;
        boolean z4 = this.f124761OooO0o;
        return i3 + (z4 ? 1 : z4);
    }

    public final String toString() {
        return "WebSocketExtensions(perMessageDeflate=" + this.f124757OooO00o + ", clientMaxWindowBits=" + this.f124758OooO0O0 + ", clientNoContextTakeover=" + this.f124759OooO0OO + ", serverMaxWindowBits=" + this.f124760OooO0Oo + ", serverNoContextTakeover=" + this.f124762OooO0o0 + ", unknownValues=" + this.f124761OooO0o + ')';
    }
}
