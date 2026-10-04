package oO0o0O0O;

import com.orion.notein.richeditor.utils.p606io.FilenameUtils;
import java.util.Iterator;

/* JADX INFO: renamed from: oO0o0O0O.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33563OooO0O0<T> implements InterfaceC33569OooO0oo<T>, InterfaceC33564OooO0OO<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final InterfaceC33569OooO0oo<T> f121189OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f121190OooO0O0;

    /* JADX INFO: renamed from: oO0o0O0O.OooO0O0$OooO00o */
    public static final class OooO00o implements Iterator<T>, oO0O00.OooO00o {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public int f121191OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final Iterator<T> f121192OooOo0o;

        public OooO00o(C33563OooO0O0<T> c33563OooO0O0) {
            this.f121192OooOo0o = c33563OooO0O0.f121189OooO00o.iterator();
            this.f121191OooOo = c33563OooO0O0.f121190OooO0O0;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            Iterator<T> it;
            while (true) {
                int i = this.f121191OooOo;
                it = this.f121192OooOo0o;
                if (i <= 0 || !it.hasNext()) {
                    break;
                }
                it.next();
                this.f121191OooOo--;
            }
            return it.hasNext();
        }

        @Override // java.util.Iterator
        public final T next() {
            Iterator<T> it;
            while (true) {
                int i = this.f121191OooOo;
                it = this.f121192OooOo0o;
                if (i <= 0 || !it.hasNext()) {
                    break;
                }
                it.next();
                this.f121191OooOo--;
            }
            return it.next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C33563OooO0O0(InterfaceC33569OooO0oo<? extends T> interfaceC33569OooO0oo, int i) {
        this.f121189OooO00o = interfaceC33569OooO0oo;
        this.f121190OooO0O0 = i;
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i + FilenameUtils.EXTENSION_SEPARATOR).toString());
    }

    @Override // oO0o0O0O.InterfaceC33564OooO0OO
    public final InterfaceC33569OooO0oo<T> OooO00o(int i) {
        int i2 = this.f121190OooO0O0 + i;
        return i2 < 0 ? new C33563OooO0O0(this, i) : new C33563OooO0O0(this.f121189OooO00o, i2);
    }

    @Override // oO0o0O0O.InterfaceC33569OooO0oo
    public final Iterator<T> iterator() {
        return new OooO00o(this);
    }
}
