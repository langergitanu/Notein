package ooOOoOoO;

import OooooO0.C21292OooO0oo;
import java.nio.ByteBuffer;
import javax.crypto.Cipher;
import kotlin.jvm.internal.OooOOO0;
import o00oo0O0.C25667OooOO0o;
import oO00Oo0.C32266OooO0Oo;
import oO00Oo0o.C32275OooO0O0;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: ooOOoOoO.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C35153OooO0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final C32275OooO0O0 f126218OooO00o = new C32275OooO0O0(128, 65536);

    public static final C32266OooO0Oo OooO00o(C32266OooO0Oo c32266OooO0Oo, Cipher cipher, InterfaceC32507OooOO0o<? super oO00Oo0.OooO0OO, C32460OooOooO> header) {
        OooOOO0.OooO0oO(c32266OooO0Oo, "<this>");
        OooOOO0.OooO0oO(cipher, "cipher");
        OooOOO0.OooO0oO(header, "header");
        ByteBuffer byteBufferO0000OoO = io.ktor.network.util.OooO00o.f80481OooO00o.o0000OoO();
        C32275OooO0O0 c32275OooO0O0 = f126218OooO00o;
        ByteBuffer byteBufferO0000OoO2 = c32275OooO0O0.o0000OoO();
        boolean z = true;
        try {
            oO00Oo0.OooO0OO oooO0OO = new oO00Oo0.OooO0OO(null);
            try {
                byteBufferO0000OoO.clear();
                header.invoke(oooO0OO);
                while (true) {
                    int iOooO0o = byteBufferO0000OoO.hasRemaining() ? C21292OooO0oo.OooO0o(c32266OooO0Oo, byteBufferO0000OoO) : 0;
                    byteBufferO0000OoO.flip();
                    if (!byteBufferO0000OoO.hasRemaining() && (iOooO0o == -1 || c32266OooO0Oo.Oooo000())) {
                        break;
                    }
                    byteBufferO0000OoO2.clear();
                    if (cipher.getOutputSize(byteBufferO0000OoO.remaining()) > byteBufferO0000OoO2.remaining()) {
                        if (z) {
                            c32275OooO0O0.o00o0O(byteBufferO0000OoO2);
                        }
                        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(cipher.getOutputSize(byteBufferO0000OoO.remaining()));
                        OooOOO0.OooO0o(byteBufferAllocate, "allocate(cipher.getOutpu…e(srcBuffer.remaining()))");
                        byteBufferO0000OoO2 = byteBufferAllocate;
                        z = false;
                    }
                    cipher.update(byteBufferO0000OoO, byteBufferO0000OoO2);
                    byteBufferO0000OoO2.flip();
                    io.ktor.utils.p616io.internal.OooOOO0.OooO0OO(oooO0OO, byteBufferO0000OoO2);
                    byteBufferO0000OoO.compact();
                }
                byteBufferO0000OoO.hasRemaining();
                byteBufferO0000OoO2.hasRemaining();
                int outputSize = cipher.getOutputSize(0);
                if (outputSize != 0) {
                    if (outputSize > byteBufferO0000OoO2.capacity()) {
                        byte[] bArrDoFinal = cipher.doFinal();
                        OooOOO0.OooO0o(bArrDoFinal, "cipher.doFinal()");
                        C25667OooOO0o.OooO0Oo(oooO0OO, bArrDoFinal, 0, bArrDoFinal.length);
                    } else {
                        byteBufferO0000OoO2.clear();
                        cipher.doFinal(C35151OooO0O0.f126216OooO00o, byteBufferO0000OoO2);
                        byteBufferO0000OoO2.flip();
                        if (byteBufferO0000OoO2.hasRemaining()) {
                            io.ktor.utils.p616io.internal.OooOOO0.OooO0OO(oooO0OO, byteBufferO0000OoO2);
                        } else {
                            byte[] bArrDoFinal2 = cipher.doFinal();
                            OooOOO0.OooO0o(bArrDoFinal2, "cipher.doFinal()");
                            C25667OooOO0o.OooO0Oo(oooO0OO, bArrDoFinal2, 0, bArrDoFinal2.length);
                        }
                    }
                }
                return oooO0OO.ooOO();
            } finally {
            }
        } finally {
            io.ktor.network.util.OooO00o.f80481OooO00o.o00o0O(byteBufferO0000OoO);
            if (z) {
                c32275OooO0O0.o00o0O(byteBufferO0000OoO2);
            }
        }
    }
}
