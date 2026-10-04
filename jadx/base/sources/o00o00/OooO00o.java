package o00o00;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import o00Ooo0.C25098OooO0Oo;
import o00Ooo0.C25099OooO0o0;
import o00Ooo0o.C25111OooO;
import o00Ooo0o.EnumC25113OooO0O0;
import o00Ooo0o.InterfaceC25121OooOO0O;
import o00OooOO.C25159OooO0oO;
import o00OooOO.InterfaceC25155OooO0O0;
import o00o00.OooO0OO;
import o00o0000.C25240OooO0OO;
import o00o0O0.C25315OooO0oo;
import o00o0O0.C25316OooOO0o;

/* JADX INFO: loaded from: classes5.dex */
public final class OooO00o implements InterfaceC25121OooOO0O<ByteBuffer, OooO0OO> {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final C19688OooO00o f85809OooO0o = new C19688OooO00o();

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final OooO0O0 f85810OooO0oO = new OooO0O0();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f85811OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ArrayList f85812OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooO0O0 f85813OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final C19688OooO00o f85814OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o00o00.OooO0O0 f85815OooO0o0;

    /* JADX INFO: renamed from: o00o00.OooO00o$OooO00o, reason: collision with other inner class name */
    public static class C19688OooO00o {
    }

    public static class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ArrayDeque f85816OooO00o;

        public OooO0O0() {
            char[] cArr = C25316OooOO0o.f86159OooO00o;
            this.f85816OooO00o = new ArrayDeque(0);
        }

        public final synchronized void OooO00o(C25098OooO0Oo c25098OooO0Oo) {
            c25098OooO0Oo.f85232OooO0O0 = null;
            c25098OooO0Oo.f85233OooO0OO = null;
            this.f85816OooO00o.offer(c25098OooO0Oo);
        }
    }

    public OooO00o(Context context, ArrayList arrayList, InterfaceC25155OooO0O0 interfaceC25155OooO0O0, C25159OooO0oO c25159OooO0oO) {
        C19688OooO00o c19688OooO00o = f85809OooO0o;
        this.f85811OooO00o = context.getApplicationContext();
        this.f85812OooO0O0 = arrayList;
        this.f85814OooO0Oo = c19688OooO00o;
        this.f85815OooO0o0 = new o00o00.OooO0O0(interfaceC25155OooO0O0, c25159OooO0oO);
        this.f85813OooO0OO = f85810OooO0oO;
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [byte[], java.lang.StringBuilder] */
    public static int OooO0Oo(o00Ooo0.OooO0OO oooO0OO, int i, int i2) {
        int iMin = Math.min(oooO0OO.f85227OooO0oO / i2, oooO0OO.f85225OooO0o / i);
        int iMax = Math.max(1, iMin == 0 ? 0 : Integer.highestOneBit(iMin));
        if (Log.isLoggable("BufferGifDecoder", 2) && iMax > 1) {
            ?? byteArray = ByteArrayOutputStream.toByteArray();
            byteArray.append(i2);
            byteArray.append("], actual dimens: [");
            byteArray.append(oooO0OO.f85225OooO0o);
            byteArray.append("x");
            byteArray.append(oooO0OO.f85227OooO0oO);
            byteArray.append("]");
            Log.v("BufferGifDecoder", byteArray.toString());
        }
        return iMax;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:25:0x0059
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    @Override // o00Ooo0o.InterfaceC25121OooOO0O
    public final o00OooO.InterfaceC25145OooOo0o<o00o00.OooO0OO> OooO00o(java.nio.ByteBuffer r8, int r9, int r10, o00Ooo0o.C25111OooO r11) throws java.io.IOException {
        /*
            r7 = this;
            r2 = r8
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
            o00o00.OooO00o$OooO0O0 r8 = r7.f85813OooO0OO
            monitor-enter(r8)
            java.util.ArrayDeque r0 = r8.f85816OooO00o     // Catch: java.lang.Throwable -> L54
            java.lang.Object r0 = r0.poll()     // Catch: java.lang.Throwable -> L54
            o00Ooo0.OooO0Oo r0 = (o00Ooo0.C25098OooO0Oo) r0     // Catch: java.lang.Throwable -> L54
            if (r0 != 0) goto L15
            o00Ooo0.OooO0Oo r0 = new o00Ooo0.OooO0Oo     // Catch: java.lang.Throwable -> L17
            r0.<init>()     // Catch: java.lang.Throwable -> L17
        L15:
            r5 = r0
            goto L1b
        L17:
            r0 = move-exception
            r9 = r0
            r1 = r7
            goto L57
        L1b:
            r0 = 0
            r5.f85232OooO0O0 = r0     // Catch: java.lang.Throwable -> L54
            byte[] r0 = r5.f85231OooO00o     // Catch: java.lang.Throwable -> L54
            r1 = 0
            java.util.Arrays.fill(r0, r1)     // Catch: java.lang.Throwable -> L54
            o00Ooo0.OooO0OO r0 = new o00Ooo0.OooO0OO     // Catch: java.lang.Throwable -> L54
            r0.<init>()     // Catch: java.lang.Throwable -> L54
            r5.f85233OooO0OO = r0     // Catch: java.lang.Throwable -> L54
            r5.f85234OooO0Oo = r1     // Catch: java.lang.Throwable -> L54
            java.nio.ByteBuffer r0 = r2.asReadOnlyBuffer()     // Catch: java.lang.Throwable -> L54
            r5.f85232OooO0O0 = r0     // Catch: java.lang.Throwable -> L54
            r0.position(r1)     // Catch: java.lang.Throwable -> L54
            java.nio.ByteBuffer r0 = r5.f85232OooO0O0     // Catch: java.lang.Throwable -> L54
            java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch: java.lang.Throwable -> L54
            r0.order(r1)     // Catch: java.lang.Throwable -> L54
            monitor-exit(r8)
            r1 = r7
            r3 = r9
            r4 = r10
            r6 = r11
            o00o00.OooO0o0 r8 = r1.OooO0OO(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L4c
            o00o00.OooO00o$OooO0O0 r9 = r1.f85813OooO0OO
            r9.OooO00o(r5)
            return r8
        L4c:
            r0 = move-exception
            r8 = r0
            o00o00.OooO00o$OooO0O0 r9 = r1.f85813OooO0OO
            r9.OooO00o(r5)
            throw r8
        L54:
            r0 = move-exception
            r1 = r7
        L56:
            r9 = r0
        L57:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L59
            throw r9
        L59:
            r0 = move-exception
            goto L56
        */
        throw new UnsupportedOperationException("Method not decompiled: o00o00.OooO00o.OooO00o(java.lang.Object, int, int, o00Ooo0o.OooO):o00OooO.OooOo0o");
    }

    @Override // o00Ooo0o.InterfaceC25121OooOO0O
    public final boolean OooO0O0(ByteBuffer byteBuffer, C25111OooO c25111OooO) throws IOException {
        return !((Boolean) c25111OooO.OooO0OO(OooO.f85808OooO0O0)).booleanValue() && com.bumptech.glide.load.OooO00o.OooO0OO(this.f85812OooO0O0, byteBuffer) == ImageHeaderParser.ImageType.GIF;
    }

    public final C25207OooO0o0 OooO0OO(ByteBuffer byteBuffer, int i, int i2, C25098OooO0Oo c25098OooO0Oo, C25111OooO c25111OooO) {
        StringBuilder sb;
        int i3 = C25315OooO0oo.f86154OooO0O0;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            o00Ooo0.OooO0OO oooO0OOOooO0O0 = c25098OooO0Oo.OooO0O0();
            if (oooO0OOOooO0O0.f85223OooO0OO > 0 && oooO0OOOooO0O0.f85222OooO0O0 == 0) {
                Bitmap.Config config = c25111OooO.OooO0OO(OooO.f85807OooO00o) == EnumC25113OooO0O0.f85375OooOo ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                int iOooO0Oo = OooO0Oo(oooO0OOOooO0O0, i, i2);
                C19688OooO00o c19688OooO00o = this.f85814OooO0Oo;
                o00o00.OooO0O0 oooO0O0 = this.f85815OooO0o0;
                c19688OooO00o.getClass();
                C25099OooO0o0 c25099OooO0o0 = new C25099OooO0o0(oooO0O0, oooO0OOOooO0O0, byteBuffer, iOooO0Oo);
                c25099OooO0o0.OooO0Oo(config);
                c25099OooO0o0.OooO0O0();
                Bitmap bitmapOooO00o = c25099OooO0o0.OooO00o();
                if (bitmapOooO00o == null) {
                    if (Log.isLoggable("BufferGifDecoder", 2)) {
                        sb = new StringBuilder("Decoded GIF from stream in ");
                        sb.append(C25315OooO0oo.OooO00o(jElapsedRealtimeNanos));
                        Log.v("BufferGifDecoder", sb.toString());
                        return null;
                    }
                    return null;
                }
                C25207OooO0o0 c25207OooO0o0 = new C25207OooO0o0(new OooO0OO(new OooO0OO.OooO00o(new C25208OooO0oO(com.bumptech.glide.OooO0OO.OooO00o(this.f85811OooO00o), c25099OooO0o0, i, i2, C25240OooO0OO.f85962OooO0O0, bitmapOooO00o))));
                if (Log.isLoggable("BufferGifDecoder", 2)) {
                    Log.v("BufferGifDecoder", "Decoded GIF from stream in " + C25315OooO0oo.OooO00o(jElapsedRealtimeNanos));
                }
                return c25207OooO0o0;
            }
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                sb = new StringBuilder("Decoded GIF from stream in ");
                sb.append(C25315OooO0oo.OooO00o(jElapsedRealtimeNanos));
                Log.v("BufferGifDecoder", sb.toString());
                return null;
            }
            return null;
        } catch (Throwable th) {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                Log.v("BufferGifDecoder", "Decoded GIF from stream in " + C25315OooO0oo.OooO00o(jElapsedRealtimeNanos));
            }
            throw th;
        }
    }
}
