package okhttp3.internal.http2;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m80612d2 = {"Lokhttp3/internal/http2/StreamResetException;", "Ljava/io/IOException;", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
public final class StreamResetException extends IOException {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final ErrorCode f124652OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StreamResetException(ErrorCode errorCode) {
        super(OooOOO0.OooOOO0(errorCode, "stream was reset: "));
        OooOOO0.OooO0oO(errorCode, "errorCode");
        this.f124652OooOo0o = errorCode;
    }
}
