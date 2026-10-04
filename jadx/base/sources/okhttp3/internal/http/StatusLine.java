package okhttp3.internal.http;

import com.aspose.words.ControlChar;
import java.io.IOException;
import java.net.ProtocolException;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import oO0o0O0o.C33595OooOOo;
import okhttp3.Protocol;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m80612d2 = {"Lokhttp3/internal/http/StatusLine;", "", "Companion", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
public final class StatusLine {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final Companion f124454OooO0Oo = new Companion(0);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Protocol f124455OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f124456OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f124457OooO0OO;

    @Metadata(m80611d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, m80612d2 = {"Lokhttp3/internal/http/StatusLine$Companion;", "", "<init>", "()V", "", "HTTP_CONTINUE", "I", "HTTP_MISDIRECTED_REQUEST", "HTTP_PERM_REDIRECT", "HTTP_TEMP_REDIRECT", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        public static StatusLine OooO00o(String statusLine) throws IOException {
            Protocol protocol;
            int i;
            String strSubstring;
            OooOOO0.OooO0oO(statusLine, "statusLine");
            if (C33595OooOOo.OooOoO0(statusLine, "HTTP/1.", false)) {
                i = 9;
                if (statusLine.length() < 9 || statusLine.charAt(8) != ' ') {
                    throw new ProtocolException(OooOOO0.OooOOO0(statusLine, "Unexpected status line: "));
                }
                int iCharAt = statusLine.charAt(7) - '0';
                if (iCharAt == 0) {
                    protocol = Protocol.HTTP_1_0;
                } else {
                    if (iCharAt != 1) {
                        throw new ProtocolException(OooOOO0.OooOOO0(statusLine, "Unexpected status line: "));
                    }
                    protocol = Protocol.HTTP_1_1;
                }
            } else {
                if (!C33595OooOOo.OooOoO0(statusLine, "ICY ", false)) {
                    throw new ProtocolException(OooOOO0.OooOOO0(statusLine, "Unexpected status line: "));
                }
                protocol = Protocol.HTTP_1_0;
                i = 4;
            }
            int i2 = i + 3;
            if (statusLine.length() < i2) {
                throw new ProtocolException(OooOOO0.OooOOO0(statusLine, "Unexpected status line: "));
            }
            try {
                String strSubstring2 = statusLine.substring(i, i2);
                OooOOO0.OooO0o(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                int i3 = Integer.parseInt(strSubstring2);
                if (statusLine.length() <= i2) {
                    strSubstring = "";
                } else {
                    if (statusLine.charAt(i2) != ' ') {
                        throw new ProtocolException(OooOOO0.OooOOO0(statusLine, "Unexpected status line: "));
                    }
                    strSubstring = statusLine.substring(i + 4);
                    OooOOO0.OooO0o(strSubstring, "this as java.lang.String).substring(startIndex)");
                }
                return new StatusLine(protocol, i3, strSubstring);
            } catch (NumberFormatException unused) {
                throw new ProtocolException(OooOOO0.OooOOO0(statusLine, "Unexpected status line: "));
            }
        }

        private Companion() {
        }
    }

    public StatusLine(Protocol protocol, int i, String message) {
        OooOOO0.OooO0oO(protocol, "protocol");
        OooOOO0.OooO0oO(message, "message");
        this.f124455OooO00o = protocol;
        this.f124456OooO0O0 = i;
        this.f124457OooO0OO = message;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.f124455OooO00o == Protocol.HTTP_1_0) {
            sb.append("HTTP/1.0");
        } else {
            sb.append("HTTP/1.1");
        }
        sb.append(ControlChar.SPACE_CHAR);
        sb.append(this.f124456OooO0O0);
        sb.append(ControlChar.SPACE_CHAR);
        sb.append(this.f124457OooO0OO);
        String string = sb.toString();
        OooOOO0.OooO0o(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
