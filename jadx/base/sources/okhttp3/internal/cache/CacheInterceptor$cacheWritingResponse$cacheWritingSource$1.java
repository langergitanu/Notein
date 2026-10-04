package okhttp3.internal.cache;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import oOo00OoO.C34524OooO0Oo;
import oOo00OoO.C34547OooOoo;
import oOo00OoO.InterfaceC34548OooOoo0;
import okhttp3.internal.Util;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m80612d2 = {"okhttp3/internal/cache/CacheInterceptor$cacheWritingResponse$cacheWritingSource$1", "LoOo00OoO/OooOoo0;", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
public final class CacheInterceptor$cacheWritingResponse$cacheWritingSource$1 implements InterfaceC34548OooOoo0 {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public boolean f124312OooOo0o;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f124312OooOo0o) {
            throw null;
        }
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        if (Util.OooO0oo(this)) {
            throw null;
        }
        this.f124312OooOo0o = true;
        throw null;
    }

    @Override // oOo00OoO.InterfaceC34548OooOoo0
    public final long read(C34524OooO0Oo sink, long j) throws IOException {
        OooOOO0.OooO0oO(sink, "sink");
        throw null;
    }

    @Override // oOo00OoO.InterfaceC34548OooOoo0
    public final C34547OooOoo timeout() {
        throw null;
    }
}
