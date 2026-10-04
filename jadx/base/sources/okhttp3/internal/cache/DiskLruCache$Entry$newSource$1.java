package okhttp3.internal.cache;

import java.io.IOException;
import kotlin.Metadata;
import oOo00OoO.AbstractC34529OooOO0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m80612d2 = {"okhttp3/internal/cache/DiskLruCache$Entry$newSource$1", "LoOo00OoO/OooOO0;", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
public final class DiskLruCache$Entry$newSource$1 extends AbstractC34529OooOO0 {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public boolean f124315OooOo0o;

    @Override // oOo00OoO.AbstractC34529OooOO0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
        if (this.f124315OooOo0o) {
            return;
        }
        this.f124315OooOo0o = true;
        throw null;
    }
}
