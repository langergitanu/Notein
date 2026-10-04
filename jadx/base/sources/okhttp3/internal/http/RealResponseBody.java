package okhttp3.internal.http;

import kotlin.Metadata;
import oOo00OoO.C34542OooOo0O;
import oOo00OoO.InterfaceC34525OooO0o;
import okhttp3.MediaType;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m80612d2 = {"Lokhttp3/internal/http/RealResponseBody;", "Lokhttp3/ResponseBody;", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
public final class RealResponseBody extends ResponseBody {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final long f124449OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final String f124450OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final C34542OooOo0O f124451OooOoO0;

    public RealResponseBody(String str, long j, C34542OooOo0O c34542OooOo0O) {
        this.f124450OooOo0o = str;
        this.f124449OooOo = j;
        this.f124451OooOoO0 = c34542OooOo0O;
    }

    @Override // okhttp3.ResponseBody
    /* JADX INFO: renamed from: contentLength, reason: from getter */
    public final long getF124449OooOo() {
        return this.f124449OooOo;
    }

    @Override // okhttp3.ResponseBody
    /* JADX INFO: renamed from: contentType */
    public final MediaType getF124288OooOo0o() {
        String str = this.f124450OooOo0o;
        if (str == null) {
            return null;
        }
        MediaType.f124148OooO0o0.getClass();
        return MediaType.Companion.OooO0O0(str);
    }

    @Override // okhttp3.ResponseBody
    /* JADX INFO: renamed from: source */
    public final InterfaceC34525OooO0o getF124289OooOoO0() {
        return this.f124451OooOoO0;
    }
}
