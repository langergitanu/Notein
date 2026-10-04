package okhttp3;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import oOo00OoO.C34527OooO0oO;
import oOo00OoO.InterfaceC34526OooO0o0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m80612d2 = {"okhttp3/RequestBody$Companion$toRequestBody$1", "Lokhttp3/RequestBody;", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
public final class RequestBody$Companion$toRequestBody$1 extends RequestBody {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ MediaType f124251OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ C34527OooO0oO f124252OooO0O0;

    public RequestBody$Companion$toRequestBody$1(MediaType mediaType, C34527OooO0oO c34527OooO0oO) {
        this.f124251OooO00o = mediaType;
        this.f124252OooO0O0 = c34527OooO0oO;
    }

    @Override // okhttp3.RequestBody
    public final long contentLength() {
        return this.f124252OooO0O0.OooO0OO();
    }

    @Override // okhttp3.RequestBody
    /* JADX INFO: renamed from: contentType, reason: from getter */
    public final MediaType getF124162OooO0OO() {
        return this.f124251OooO00o;
    }

    @Override // okhttp3.RequestBody
    public final void writeTo(InterfaceC34526OooO0o0 sink) throws IOException {
        OooOOO0.OooO0oO(sink, "sink");
        sink.Oooo0O0(this.f124252OooO0O0);
    }
}
