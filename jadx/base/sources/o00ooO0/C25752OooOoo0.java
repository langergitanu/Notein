package o00ooO0;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import o00o0o.AbstractC25434OooO00o;
import o00o0o.C25435OooO0O0;
import o00o0o0o.AbstractC25442OooO;

/* JADX INFO: renamed from: o00ooO0.OooOoo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25752OooOoo0 extends AbstractC25442OooO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public C25435OooO0O0 f87878OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final OooOo f87879OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f87880OooOoO0;

    /* JADX INFO: renamed from: o00ooO0.OooOoo0$OooO00o */
    public static final class OooO00o extends RuntimeException {
    }

    public C25752OooOoo0(OooOo oooOo, int i) {
        if (i <= 0) {
            throw new IllegalStateException("Check failed.");
        }
        this.f87879OooOo0o = oooOo;
        this.f87880OooOoO0 = 0;
        this.f87878OooOo = AbstractC25434OooO00o.o0Oo0oo(oooOo.get(i), oooOo, AbstractC25434OooO00o.f86711OooOoo0);
    }

    @Override // o00o0o0o.AbstractC25442OooO
    /* JADX INFO: renamed from: OooO0OO, reason: merged with bridge method [inline-methods] */
    public final C25748OooOoO OooO00o() {
        if (!AbstractC25434OooO00o.ooOO(this.f87878OooOo)) {
            throw new OooO00o("OutputStream no longer valid");
        }
        C25435OooO0O0 c25435OooO0O0 = this.f87878OooOo;
        if (c25435OooO0O0 != null) {
            return new C25748OooOoO(c25435OooO0O0, this.f87880OooOoO0);
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // o00o0o0o.AbstractC25442OooO, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        AbstractC25434OooO00o.OooOooo(this.f87878OooOo);
        this.f87878OooOo = null;
        this.f87880OooOoO0 = -1;
        super.close();
    }

    @Override // o00o0o0o.AbstractC25442OooO
    public final int size() {
        return this.f87880OooOoO0;
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        write(new byte[]{(byte) i});
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [byte[], java.lang.StringBuilder] */
    @Override // java.io.OutputStream
    public final void write(byte[] buffer, int i, int i2) throws Throwable {
        kotlin.jvm.internal.OooOOO0.OooO0oO(buffer, "buffer");
        if (i >= 0 && i2 >= 0 && i + i2 <= buffer.length) {
            if (AbstractC25434OooO00o.ooOO(this.f87878OooOo)) {
                int i3 = this.f87880OooOoO0 + i2;
                if (AbstractC25434OooO00o.ooOO(this.f87878OooOo)) {
                    C25435OooO0O0 c25435OooO0O0 = this.f87878OooOo;
                    if (c25435OooO0O0 != null) {
                        if (i3 > ((InterfaceC25747OooOo0o) c25435OooO0O0.Oooo000()).getSize()) {
                            OooOo oooOo = this.f87879OooOo0o;
                            InterfaceC25747OooOo0o interfaceC25747OooOo0o = oooOo.get(i3);
                            kotlin.jvm.internal.OooOOO0.OooO0o(interfaceC25747OooOo0o, "get(...)");
                            InterfaceC25747OooOo0o interfaceC25747OooOo0o2 = interfaceC25747OooOo0o;
                            C25435OooO0O0 c25435OooO0O02 = this.f87878OooOo;
                            if (c25435OooO0O02 != null) {
                                ((InterfaceC25747OooOo0o) c25435OooO0O02.Oooo000()).OooO0OO(interfaceC25747OooOo0o2, this.f87880OooOoO0);
                                C25435OooO0O0 c25435OooO0O03 = this.f87878OooOo;
                                kotlin.jvm.internal.OooOOO0.OooO0Oo(c25435OooO0O03);
                                c25435OooO0O03.close();
                                this.f87878OooOo = AbstractC25434OooO00o.o0Oo0oo(interfaceC25747OooOo0o2, oooOo, AbstractC25434OooO00o.f86711OooOoo0);
                            } else {
                                throw new IllegalStateException("Required value was null.");
                            }
                        }
                        C25435OooO0O0 c25435OooO0O04 = this.f87878OooOo;
                        if (c25435OooO0O04 != null) {
                            ((InterfaceC25747OooOo0o) c25435OooO0O04.Oooo000()).OooO00o(this.f87880OooOoO0, i, i2, buffer);
                            this.f87880OooOoO0 += i2;
                            return;
                        }
                        throw new IllegalStateException("Required value was null.");
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                throw new OooO00o("OutputStream no longer valid");
            }
            throw new OooO00o("OutputStream no longer valid");
        }
        int length = buffer.length;
        ?? byteArray = ByteArrayOutputStream.toByteArray();
        byteArray.append(i2);
        throw new ArrayIndexOutOfBoundsException(byteArray.toString());
    }
}
