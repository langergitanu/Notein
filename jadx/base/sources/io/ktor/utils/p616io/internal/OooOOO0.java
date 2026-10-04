package io.ktor.utils.p616io.internal;

import OooooO0.C21286OooO0O0;
import java.nio.ByteBuffer;
import oO00Oo0.OooO0OO;
import oO00Oo0O.C32271OooO00o;
import oO00Oo0O.C32273OooO0Oo;
import oO0o0O0o.C33596OooOOo0;

/* JADX INFO: loaded from: classes10.dex */
public final class OooOOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final /* synthetic */ int f80835OooO00o = 0;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final /* synthetic */ int f80836OooO0O0 = 0;

    public static final int OooO00o(int i, String str) {
        String property;
        Integer numOooOOO0;
        try {
            property = System.getProperty("io.ktor.utils.io.".concat(str));
        } catch (SecurityException unused) {
            property = null;
        }
        return (property == null || (numOooOOO0 = C33596OooOOo0.OooOOO0(property)) == null) ? i : numOooOOO0.intValue();
    }

    public static final int OooO0O0(ByteBuffer byteBuffer, ByteBuffer destination, int i) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(byteBuffer, "<this>");
        kotlin.jvm.internal.OooOOO0.OooO0oO(destination, "destination");
        int iMin = Math.min(i, Math.min(byteBuffer.remaining(), destination.remaining()));
        if (iMin == byteBuffer.remaining()) {
            destination.put(byteBuffer);
            return iMin;
        }
        int iLimit = byteBuffer.limit();
        byteBuffer.limit(byteBuffer.position() + iMin);
        destination.put(byteBuffer);
        byteBuffer.limit(iLimit);
        return iMin;
    }

    public static final void OooO0OO(OooO0OO oooO0OO, ByteBuffer bb) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(oooO0OO, "<this>");
        kotlin.jvm.internal.OooOOO0.OooO0oO(bb, "bb");
        int iLimit = bb.limit();
        C32271OooO00o c32271OooO00oOooO0OO = C32273OooO0Oo.OooO0OO(oooO0OO, 1, null);
        while (true) {
            try {
                bb.limit(bb.position() + Math.min(bb.remaining(), c32271OooO00oOooO0OO.f115949OooO0o0 - c32271OooO00oOooO0OO.f115946OooO0OO));
                C21286OooO0O0.OooO0oO(c32271OooO00oOooO0OO, bb);
                bb.limit(iLimit);
                if (!bb.hasRemaining()) {
                    return;
                } else {
                    c32271OooO00oOooO0OO = C32273OooO0Oo.OooO0OO(oooO0OO, 1, c32271OooO00oOooO0OO);
                }
            } finally {
                oooO0OO.OooO00o();
            }
        }
    }
}
