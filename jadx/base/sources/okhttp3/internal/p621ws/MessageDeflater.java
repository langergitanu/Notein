package okhttp3.internal.p621ws;

import java.io.Closeable;
import java.io.IOException;
import java.util.zip.Deflater;
import kotlin.Metadata;
import oOo00OoO.C34524OooO0Oo;
import oOo00OoO.C34528OooO0oo;
import oOo00OoO.C34535OooOOOo;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m80612d2 = {"Lokhttp3/internal/ws/MessageDeflater;", "Ljava/io/Closeable;", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
public final class MessageDeflater implements Closeable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final C34524OooO0Oo f124725OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final boolean f124726OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final C34528OooO0oo f124727OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final Deflater f124728OooOoO0;

    public MessageDeflater(boolean z) {
        this.f124726OooOo0o = z;
        C34524OooO0Oo c34524OooO0Oo = new C34524OooO0Oo();
        this.f124725OooOo = c34524OooO0Oo;
        Deflater deflater = new Deflater(-1, true);
        this.f124728OooOoO0 = deflater;
        this.f124727OooOoO = new C34528OooO0oo(C34535OooOOOo.OooO00o(c34524OooO0Oo), deflater);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f124727OooOoO.close();
    }
}
