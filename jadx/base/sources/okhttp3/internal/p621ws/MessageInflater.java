package okhttp3.internal.p621ws;

import java.io.Closeable;
import java.io.IOException;
import java.util.zip.Inflater;
import kotlin.Metadata;
import oOo00OoO.C34524OooO0Oo;
import oOo00OoO.C34532OooOOO;
import oOo00OoO.C34535OooOOOo;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m80612d2 = {"Lokhttp3/internal/ws/MessageInflater;", "Ljava/io/Closeable;", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
public final class MessageInflater implements Closeable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final C34524OooO0Oo f124730OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final boolean f124731OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final C34532OooOOO f124732OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final Inflater f124733OooOoO0;

    public MessageInflater(boolean z) {
        this.f124731OooOo0o = z;
        C34524OooO0Oo c34524OooO0Oo = new C34524OooO0Oo();
        this.f124730OooOo = c34524OooO0Oo;
        Inflater inflater = new Inflater(true);
        this.f124733OooOoO0 = inflater;
        this.f124732OooOoO = new C34532OooOOO(C34535OooOOOo.OooO0O0(c34524OooO0Oo), inflater);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f124732OooOoO.close();
    }
}
