package okhttp3.internal.cache;

import java.io.EOFException;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import oOo00OoO.AbstractC34520OooO;
import oOo00OoO.C34524OooO0Oo;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0010\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m80612d2 = {"Lokhttp3/internal/cache/FaultHidingSink;", "LoOo00OoO/OooO;", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
public class FaultHidingSink extends AbstractC34520OooO {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public boolean f124316OooOo0o;

    public FaultHidingSink() {
        throw null;
    }

    @Override // oOo00OoO.AbstractC34520OooO, oOo00OoO.InterfaceC34544OooOoO, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f124316OooOo0o) {
            return;
        }
        try {
            super.close();
        } catch (IOException unused) {
            this.f124316OooOo0o = true;
            throw null;
        }
    }

    @Override // oOo00OoO.AbstractC34520OooO, oOo00OoO.InterfaceC34544OooOoO, java.io.Flushable
    public final void flush() {
        if (this.f124316OooOo0o) {
            return;
        }
        try {
            super.flush();
        } catch (IOException unused) {
            this.f124316OooOo0o = true;
            throw null;
        }
    }

    @Override // oOo00OoO.AbstractC34520OooO, oOo00OoO.InterfaceC34544OooOoO
    public final void write(C34524OooO0Oo source, long j) throws EOFException {
        OooOOO0.OooO0oO(source, "source");
        if (this.f124316OooOo0o) {
            source.skip(j);
            return;
        }
        try {
            super.write(source, j);
        } catch (IOException unused) {
            this.f124316OooOo0o = true;
            throw null;
        }
    }
}
