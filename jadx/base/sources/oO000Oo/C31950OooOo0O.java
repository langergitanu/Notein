package oO000Oo;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;
import java.util.ArrayDeque;
import java.util.Iterator;

/* JADX INFO: renamed from: oO000Oo.OooOo0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31950OooOo0O extends oO000Oo.OooO0O0 {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public ArrayDeque f114050OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final ArrayDeque f114051OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public boolean f114052OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f114053OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public static final OooO00o f114045OooOoOO = new OooO00o();

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public static final OooO0O0 f114047OooOoo0 = new OooO0O0();

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public static final OooO0OO f114046OooOoo = new OooO0OO();

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public static final C31951OooO0Oo f114048OooOooO = new C31951OooO0Oo();

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public static final C31952OooO0o0 f114049OooOooo = new C31952OooO0o0();

    /* JADX INFO: renamed from: oO000Oo.OooOo0O$OooO00o */
    public class OooO00o implements OooO0o<Void> {
        @Override // oO000Oo.C31950OooOo0O.InterfaceC31953OooO0oO
        public final int OooO00o(InterfaceC32047o0000oO interfaceC32047o0000oO, int i, Object obj, int i2) {
            return interfaceC32047o0000oO.readUnsignedByte();
        }
    }

    /* JADX INFO: renamed from: oO000Oo.OooOo0O$OooO0O0 */
    public class OooO0O0 implements OooO0o<Void> {
        @Override // oO000Oo.C31950OooOo0O.InterfaceC31953OooO0oO
        public final int OooO00o(InterfaceC32047o0000oO interfaceC32047o0000oO, int i, Object obj, int i2) {
            interfaceC32047o0000oO.skipBytes(i);
            return 0;
        }
    }

    /* JADX INFO: renamed from: oO000Oo.OooOo0O$OooO0OO */
    public class OooO0OO implements OooO0o<byte[]> {
        @Override // oO000Oo.C31950OooOo0O.InterfaceC31953OooO0oO
        public final int OooO00o(InterfaceC32047o0000oO interfaceC32047o0000oO, int i, Object obj, int i2) {
            interfaceC32047o0000oO.o0000o(i2, i, (byte[]) obj);
            return i2 + i;
        }
    }

    /* JADX INFO: renamed from: oO000Oo.OooOo0O$OooO0Oo, reason: case insensitive filesystem */
    public class C31951OooO0Oo implements OooO0o<ByteBuffer> {
        @Override // oO000Oo.C31950OooOo0O.InterfaceC31953OooO0oO
        public final int OooO00o(InterfaceC32047o0000oO interfaceC32047o0000oO, int i, Object obj, int i2) {
            ByteBuffer byteBuffer = (ByteBuffer) obj;
            int iLimit = byteBuffer.limit();
            byteBuffer.limit(byteBuffer.position() + i);
            interfaceC32047o0000oO.Oooo0oO(byteBuffer);
            byteBuffer.limit(iLimit);
            return 0;
        }
    }

    /* JADX INFO: renamed from: oO000Oo.OooOo0O$OooO0o */
    public interface OooO0o<T> extends InterfaceC31953OooO0oO<T> {
    }

    /* JADX INFO: renamed from: oO000Oo.OooOo0O$OooO0o0, reason: case insensitive filesystem */
    public class C31952OooO0o0 implements InterfaceC31953OooO0oO<OutputStream> {
        @Override // oO000Oo.C31950OooOo0O.InterfaceC31953OooO0oO
        public final int OooO00o(InterfaceC32047o0000oO interfaceC32047o0000oO, int i, OutputStream outputStream, int i2) throws IOException {
            interfaceC32047o0000oO.o000O0(outputStream, i);
            return 0;
        }
    }

    /* JADX INFO: renamed from: oO000Oo.OooOo0O$OooO0oO, reason: case insensitive filesystem */
    public interface InterfaceC31953OooO0oO<T> {
        int OooO00o(InterfaceC32047o0000oO interfaceC32047o0000oO, int i, T t, int i2) throws IOException;
    }

    public C31950OooOo0O() {
        new ArrayDeque(2);
        this.f114051OooOo0o = new ArrayDeque();
    }

    @Override // oO000Oo.InterfaceC32047o0000oO
    public final int OooO0O0() {
        return this.f114053OooOoO0;
    }

    public final void OooO0OO(InterfaceC32047o0000oO interfaceC32047o0000oO) throws IOException {
        boolean z = this.f114052OooOoO;
        ArrayDeque arrayDeque = this.f114051OooOo0o;
        boolean z2 = z && arrayDeque.isEmpty();
        if (interfaceC32047o0000oO instanceof C31950OooOo0O) {
            C31950OooOo0O c31950OooOo0O = (C31950OooOo0O) interfaceC32047o0000oO;
            while (!c31950OooOo0O.f114051OooOo0o.isEmpty()) {
                arrayDeque.add((InterfaceC32047o0000oO) c31950OooOo0O.f114051OooOo0o.remove());
            }
            this.f114053OooOoO0 += c31950OooOo0O.f114053OooOoO0;
            c31950OooOo0O.f114053OooOoO0 = 0;
            c31950OooOo0O.close();
        } else {
            arrayDeque.add(interfaceC32047o0000oO);
            this.f114053OooOoO0 = interfaceC32047o0000oO.OooO0O0() + this.f114053OooOoO0;
        }
        if (z2) {
            ((InterfaceC32047o0000oO) arrayDeque.peek()).o0OoOo0();
        }
    }

    public final void OooOOO0() throws IOException {
        boolean z = this.f114052OooOoO;
        ArrayDeque arrayDeque = this.f114051OooOo0o;
        if (!z) {
            ((InterfaceC32047o0000oO) arrayDeque.remove()).close();
            return;
        }
        this.f114050OooOo.add((InterfaceC32047o0000oO) arrayDeque.remove());
        InterfaceC32047o0000oO interfaceC32047o0000oO = (InterfaceC32047o0000oO) arrayDeque.peek();
        if (interfaceC32047o0000oO != null) {
            interfaceC32047o0000oO.o0OoOo0();
        }
    }

    public final <T> int OooOOo0(InterfaceC31953OooO0oO<T> interfaceC31953OooO0oO, int i, T t, int i2) throws IOException {
        OooO00o(i);
        ArrayDeque arrayDeque = this.f114051OooOo0o;
        if (!arrayDeque.isEmpty() && ((InterfaceC32047o0000oO) arrayDeque.peek()).OooO0O0() == 0) {
            OooOOO0();
        }
        while (i > 0 && !arrayDeque.isEmpty()) {
            InterfaceC32047o0000oO interfaceC32047o0000oO = (InterfaceC32047o0000oO) arrayDeque.peek();
            int iMin = Math.min(i, interfaceC32047o0000oO.OooO0O0());
            i2 = interfaceC31953OooO0oO.OooO00o(interfaceC32047o0000oO, iMin, t, i2);
            i -= iMin;
            this.f114053OooOoO0 -= iMin;
            if (((InterfaceC32047o0000oO) arrayDeque.peek()).OooO0O0() == 0) {
                OooOOO0();
            }
        }
        if (i <= 0) {
            return i2;
        }
        throw new AssertionError("Failed executing read operation");
    }

    public final <T> int OooOOoo(OooO0o<T> oooO0o, int i, T t, int i2) {
        try {
            return OooOOo0(oooO0o, i, t, i2);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [oO000Oo.o0000oO] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [oO000Oo.o0000oO] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [oO000Oo.OooOo0O] */
    /* JADX WARN: Type inference failed for: r1v3, types: [oO000Oo.OooOo0O] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    @Override // oO000Oo.InterfaceC32047o0000oO
    public final InterfaceC32047o0000oO OooOo0O(int i) throws IOException {
        InterfaceC32047o0000oO interfaceC32047o0000oOOooOo0O;
        int i2;
        InterfaceC32047o0000oO interfaceC32047o0000oOOooOo0O2;
        ?? r1;
        ?? r0;
        if (i <= 0) {
            return o0000O0.f114502OooO00o;
        }
        OooO00o(i);
        this.f114053OooOoO0 -= i;
        ?? r02 = 0;
        ?? c31950OooOo0O = 0;
        while (true) {
            ArrayDeque arrayDeque = this.f114051OooOo0o;
            InterfaceC32047o0000oO interfaceC32047o0000oO = (InterfaceC32047o0000oO) arrayDeque.peek();
            int iOooO0O0 = interfaceC32047o0000oO.OooO0O0();
            if (iOooO0O0 > i) {
                interfaceC32047o0000oOOooOo0O2 = interfaceC32047o0000oO.OooOo0O(i);
                i2 = 0;
            } else {
                if (this.f114052OooOoO) {
                    interfaceC32047o0000oOOooOo0O = interfaceC32047o0000oO.OooOo0O(iOooO0O0);
                    OooOOO0();
                } else {
                    interfaceC32047o0000oOOooOo0O = (InterfaceC32047o0000oO) arrayDeque.poll();
                }
                InterfaceC32047o0000oO interfaceC32047o0000oO2 = interfaceC32047o0000oOOooOo0O;
                i2 = i - iOooO0O0;
                interfaceC32047o0000oOOooOo0O2 = interfaceC32047o0000oO2;
            }
            if (r02 == 0) {
                r0 = interfaceC32047o0000oOOooOo0O2;
                r1 = c31950OooOo0O;
            } else {
                if (c31950OooOo0O == 0) {
                    c31950OooOo0O = new C31950OooOo0O(i2 != 0 ? Math.min(arrayDeque.size() + 2, 16) : 2);
                    c31950OooOo0O.OooO0OO(r02);
                    r02 = c31950OooOo0O;
                }
                c31950OooOo0O.OooO0OO(interfaceC32047o0000oOOooOo0O2);
                r0 = r02;
                r1 = c31950OooOo0O;
            }
            if (i2 <= 0) {
                return r0;
            }
            i = i2;
            r02 = r0;
            c31950OooOo0O = r1;
        }
    }

    @Override // oO000Oo.InterfaceC32047o0000oO
    public final void Oooo0oO(ByteBuffer byteBuffer) {
        OooOOoo(f114048OooOooO, byteBuffer.remaining(), byteBuffer, 0);
    }

    @Override // oO000Oo.OooO0O0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        while (true) {
            ArrayDeque arrayDeque = this.f114051OooOo0o;
            if (arrayDeque.isEmpty()) {
                break;
            } else {
                ((InterfaceC32047o0000oO) arrayDeque.remove()).close();
            }
        }
        if (this.f114050OooOo != null) {
            while (!this.f114050OooOo.isEmpty()) {
                ((InterfaceC32047o0000oO) this.f114050OooOo.remove()).close();
            }
        }
    }

    @Override // oO000Oo.OooO0O0, oO000Oo.InterfaceC32047o0000oO
    public final boolean markSupported() {
        Iterator it = this.f114051OooOo0o.iterator();
        while (it.hasNext()) {
            if (!((InterfaceC32047o0000oO) it.next()).markSupported()) {
                return false;
            }
        }
        return true;
    }

    @Override // oO000Oo.InterfaceC32047o0000oO
    public final void o0000o(int i, int i2, byte[] bArr) {
        OooOOoo(f114046OooOoo, i2, bArr, i);
    }

    @Override // oO000Oo.InterfaceC32047o0000oO
    public final void o000O0(OutputStream outputStream, int i) throws IOException {
        OooOOo0(f114049OooOooo, i, outputStream, 0);
    }

    @Override // oO000Oo.OooO0O0, oO000Oo.InterfaceC32047o0000oO
    public final void o0OoOo0() throws IOException {
        ArrayDeque arrayDeque = this.f114050OooOo;
        ArrayDeque arrayDeque2 = this.f114051OooOo0o;
        if (arrayDeque == null) {
            this.f114050OooOo = new ArrayDeque(Math.min(arrayDeque2.size(), 16));
        }
        while (!this.f114050OooOo.isEmpty()) {
            ((InterfaceC32047o0000oO) this.f114050OooOo.remove()).close();
        }
        this.f114052OooOoO = true;
        InterfaceC32047o0000oO interfaceC32047o0000oO = (InterfaceC32047o0000oO) arrayDeque2.peek();
        if (interfaceC32047o0000oO != null) {
            interfaceC32047o0000oO.o0OoOo0();
        }
    }

    @Override // oO000Oo.InterfaceC32047o0000oO
    public final int readUnsignedByte() {
        return OooOOoo(f114045OooOoOO, 1, null, 0);
    }

    @Override // oO000Oo.OooO0O0, oO000Oo.InterfaceC32047o0000oO
    public final void reset() {
        if (!this.f114052OooOoO) {
            throw new InvalidMarkException();
        }
        ArrayDeque arrayDeque = this.f114051OooOo0o;
        InterfaceC32047o0000oO interfaceC32047o0000oO = (InterfaceC32047o0000oO) arrayDeque.peek();
        if (interfaceC32047o0000oO != null) {
            int iOooO0O0 = interfaceC32047o0000oO.OooO0O0();
            interfaceC32047o0000oO.reset();
            this.f114053OooOoO0 = (interfaceC32047o0000oO.OooO0O0() - iOooO0O0) + this.f114053OooOoO0;
        }
        while (true) {
            InterfaceC32047o0000oO interfaceC32047o0000oO2 = (InterfaceC32047o0000oO) this.f114050OooOo.pollLast();
            if (interfaceC32047o0000oO2 == null) {
                return;
            }
            interfaceC32047o0000oO2.reset();
            arrayDeque.addFirst(interfaceC32047o0000oO2);
            this.f114053OooOoO0 = interfaceC32047o0000oO2.OooO0O0() + this.f114053OooOoO0;
        }
    }

    @Override // oO000Oo.InterfaceC32047o0000oO
    public final void skipBytes(int i) {
        OooOOoo(f114047OooOoo0, i, null, 0);
    }

    public C31950OooOo0O(int i) {
        new ArrayDeque(2);
        this.f114051OooOo0o = new ArrayDeque(i);
    }
}
