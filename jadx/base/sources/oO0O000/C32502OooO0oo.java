package oO0O000;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.OooOOO0;
import oO0o0O0O.InterfaceC33569OooO0oo;

/* JADX INFO: renamed from: oO0O000.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32502OooO0oo implements InterfaceC33569OooO0oo<String> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final BufferedReader f116793OooO00o;

    /* JADX INFO: renamed from: oO0O000.OooO0oo$OooO00o */
    public static final class OooO00o implements Iterator<String>, oO0O00.OooO00o {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public boolean f116794OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public String f116795OooOo0o;

        public OooO00o() {
        }

        @Override // java.util.Iterator
        public final boolean hasNext() throws IOException {
            if (this.f116795OooOo0o == null && !this.f116794OooOo) {
                String line = C32502OooO0oo.this.f116793OooO00o.readLine();
                this.f116795OooOo0o = line;
                if (line == null) {
                    this.f116794OooOo = true;
                }
            }
            return this.f116795OooOo0o != null;
        }

        @Override // java.util.Iterator
        public final String next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            String str = this.f116795OooOo0o;
            this.f116795OooOo0o = null;
            OooOOO0.OooO0Oo(str);
            return str;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C32502OooO0oo(BufferedReader bufferedReader) {
        this.f116793OooO00o = bufferedReader;
    }

    @Override // oO0o0O0O.InterfaceC33569OooO0oo
    public final Iterator<String> iterator() {
        return new OooO00o();
    }
}
