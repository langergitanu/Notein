package okhttp3;

import java.io.File;
import java.io.FileNotFoundException;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import oOo00OoO.C34534OooOOOO;
import oOo00OoO.C34535OooOOOo;
import oOo00OoO.InterfaceC34526OooO0o0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m80612d2 = {"okhttp3/RequestBody$Companion$asRequestBody$1", "Lokhttp3/RequestBody;", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
public final class RequestBody$Companion$asRequestBody$1 extends RequestBody {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ MediaType f124249OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ File f124250OooO0O0;

    public RequestBody$Companion$asRequestBody$1(MediaType mediaType, File file) {
        this.f124249OooO00o = mediaType;
        this.f124250OooO0O0 = file;
    }

    @Override // okhttp3.RequestBody
    public final long contentLength() {
        return this.f124250OooO0O0.length();
    }

    @Override // okhttp3.RequestBody
    /* JADX INFO: renamed from: contentType, reason: from getter */
    public final MediaType getF124162OooO0OO() {
        return this.f124249OooO00o;
    }

    @Override // okhttp3.RequestBody
    public final void writeTo(InterfaceC34526OooO0o0 sink) throws FileNotFoundException {
        OooOOO0.OooO0oO(sink, "sink");
        C34534OooOOOO c34534OooOOOOOooO0o0 = C34535OooOOOo.OooO0o0(this.f124250OooO0O0);
        try {
            sink.o0000O00(c34534OooOOOOOooO0o0);
            c34534OooOOOOOooO0o0.close();
        } finally {
        }
    }
}
