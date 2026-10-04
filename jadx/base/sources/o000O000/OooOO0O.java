package o000O000;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import o000OoO.C24534OooO0O0;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0O {
    public static C24534OooO0O0 OooO00o(ByteBuffer byteBuffer) throws IOException {
        long j;
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.order(ByteOrder.BIG_ENDIAN);
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
        int i = byteBufferDuplicate.getShort() & 65535;
        if (i > 100) {
            throw new IOException("Cannot read metadata.");
        }
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 6);
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                j = -1;
                break;
            }
            int i3 = byteBufferDuplicate.getInt();
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            j = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            if (1835365473 == i3) {
                break;
            }
            i2++;
        }
        if (j != -1) {
            byteBufferDuplicate.position(byteBufferDuplicate.position() + ((int) (j - ((long) byteBufferDuplicate.position()))));
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 12);
            long j2 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
            for (int i4 = 0; i4 < j2; i4++) {
                int i5 = byteBufferDuplicate.getInt();
                long j3 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
                byteBufferDuplicate.getInt();
                if (1164798569 == i5 || 1701669481 == i5) {
                    byteBufferDuplicate.position((int) (j3 + j));
                    C24534OooO0O0 c24534OooO0O0 = new C24534OooO0O0();
                    byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int iPosition = byteBufferDuplicate.position() + byteBufferDuplicate.getInt(byteBufferDuplicate.position());
                    c24534OooO0O0.f82986OooO0O0 = byteBufferDuplicate;
                    c24534OooO0O0.f82985OooO00o = iPosition;
                    int i6 = iPosition - byteBufferDuplicate.getInt(iPosition);
                    c24534OooO0O0.f82987OooO0OO = i6;
                    c24534OooO0O0.f82988OooO0Oo = c24534OooO0O0.f82986OooO0O0.getShort(i6);
                    return c24534OooO0O0;
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }
}
