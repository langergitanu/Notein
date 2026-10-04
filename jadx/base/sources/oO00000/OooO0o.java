package oO00000;

import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import o0oooooO.C31888OooO0OO;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO0o {
    public static LinkedHashMap OooO00o(byte[] bArr) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (byteBufferWrap.hasRemaining()) {
            C31907OooO0o0 c31907OooO0o0OooO00o = C31907OooO0o0.OooO00o(byteBufferWrap);
            Integer numValueOf = Integer.valueOf(c31907OooO0o0OooO00o.f113735OooO00o);
            int i = c31907OooO0o0OooO00o.f113738OooO0Oo;
            linkedHashMap.put(numValueOf, Arrays.copyOfRange(c31907OooO0o0OooO00o.f113737OooO0OO, i, c31907OooO0o0OooO00o.f113736OooO0O0 + i));
        }
        return linkedHashMap;
    }

    public static byte[] OooO0O0(LinkedHashMap linkedHashMap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            byte[] bArr = new C31907OooO0o0(((Integer) entry.getKey()).intValue(), (byte[]) entry.getValue()).f113737OooO0OO;
            byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
            byteArrayOutputStream.write(bArrCopyOf, 0, bArrCopyOf.length);
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static byte[] OooO0OO(int i, byte[] bArr) throws C31888OooO0OO {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, 0, bArr.length);
        C31907OooO0o0 c31907OooO0o0OooO00o = C31907OooO0o0.OooO00o(byteBufferWrap);
        if (byteBufferWrap.hasRemaining()) {
            throw new IllegalArgumentException("Extra data remaining");
        }
        int i2 = c31907OooO0o0OooO00o.f113735OooO00o;
        if (i2 != i) {
            throw new C31888OooO0OO(String.format("Expected tag: %02x, got %02x", Integer.valueOf(i), Integer.valueOf(i2)));
        }
        int i3 = c31907OooO0o0OooO00o.f113738OooO0Oo;
        return Arrays.copyOfRange(c31907OooO0o0OooO00o.f113737OooO0OO, i3, c31907OooO0o0OooO00o.f113736OooO0O0 + i3);
    }
}
