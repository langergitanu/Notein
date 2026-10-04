package oO00O;

import OooooO0.C21292OooO0oo;
import java.io.Closeable;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import oO00Oo0.C32266OooO0Oo;
import oO00ooO.C32460OooOooO;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO0o implements Closeable {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final oO00Oo0.OooO0OO f115261OooOo0o;

    public /* synthetic */ OooO0o(oO00Oo0.OooO0OO oooO0OO) {
        this.f115261OooOo0o = oooO0OO;
    }

    public static final byte[] OooO00o(oO00Oo0.OooO0OO oooO0OO, String hashName) {
        byte[] bArrDigest;
        kotlin.jvm.internal.OooOOO0.OooO0oO(hashName, "hashName");
        synchronized (oooO0OO) {
            C32266OooO0Oo c32266OooO0OoOooO00o = oO00Oo0.OooOO0.OooO00o(oooO0OO);
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(hashName);
                kotlin.jvm.internal.OooOOO0.OooO0Oo(messageDigest);
                ByteBuffer byteBufferO0000OoO = io.ktor.network.util.OooO00o.f80481OooO00o.o0000OoO();
                while (!c32266OooO0OoOooO00o.Oooo000() && C21292OooO0oo.OooO0o(c32266OooO0OoOooO00o, byteBufferO0000OoO) != -1) {
                    try {
                        byteBufferO0000OoO.flip();
                        messageDigest.update(byteBufferO0000OoO);
                        byteBufferO0000OoO.clear();
                    } catch (Throwable th) {
                        io.ktor.network.util.OooO00o.f80481OooO00o.o00o0O(byteBufferO0000OoO);
                        throw th;
                    }
                }
                bArrDigest = messageDigest.digest();
                io.ktor.network.util.OooO00o.f80481OooO00o.o00o0O(byteBufferO0000OoO);
            } finally {
                c32266OooO0OoOooO00o.release();
            }
        }
        kotlin.jvm.internal.OooOOO0.OooO0o(bArrDigest, "synchronized(state) {\n  …        }\n        }\n    }");
        return bArrDigest;
    }

    public static final void OooO0OO(oO00Oo0.OooO0OO oooO0OO, C32266OooO0Oo packet) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(packet, "packet");
        synchronized (oooO0OO) {
            if (packet.Oooo000()) {
                return;
            }
            oooO0OO.o0000oO(packet.o0000oO());
            C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f115261OooOo0o.close();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof OooO0o) {
            return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f115261OooOo0o, ((OooO0o) obj).f115261OooOo0o);
        }
        return false;
    }

    public final int hashCode() {
        return this.f115261OooOo0o.hashCode();
    }

    public final String toString() {
        return "Digest(state=" + this.f115261OooOo0o + ')';
    }
}
