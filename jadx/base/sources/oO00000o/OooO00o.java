package oO00000o;

import OooOoOO.C20519OooO0Oo;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import oOO00OOo.C34354OooO0Oo;
import oOO00OOo.InterfaceC34352OooO0O0;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final InterfaceC34352OooO0O0 f113739OooO00o = C34354OooO0Oo.OooO0O0(OooO00o.class);

    public static byte[] OooO00o(byte[] bArr) throws IOException {
        GZIPInputStream gZIPInputStream;
        Integer numValueOf = Integer.valueOf(bArr.length);
        InterfaceC34352OooO0O0 interfaceC34352OooO0O0 = f113739OooO00o;
        C20519OooO0Oo.OooO0Oo(4, interfaceC34352OooO0O0, "Decompressing {} bytes", numValueOf);
        byte[] bArr2 = new byte[512];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            try {
                gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            } finally {
            }
            while (true) {
                try {
                    int i = gZIPInputStream.read(bArr2, 0, 512);
                    if (i == -1) {
                        C20519OooO0Oo.OooO0Oo(4, interfaceC34352OooO0O0, "Decompressed to {} bytes", Integer.valueOf(byteArrayOutputStream.size()));
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        gZIPInputStream.close();
                        byteArrayInputStream.close();
                        byteArrayOutputStream.close();
                        return byteArray;
                    }
                    byteArrayOutputStream.write(bArr2, 0, i);
                } finally {
                }
            }
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
