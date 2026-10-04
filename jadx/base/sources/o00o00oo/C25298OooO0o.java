package o00o00oo;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: renamed from: o00o00oo.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25298OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final /* synthetic */ int f86107OooO00o = 0;

    public static final long OooO00o(InputStream inputStream, OutputStream outputStream) throws IOException {
        OooOOO0.OooO0oO(inputStream, "<this>");
        byte[] bArr = new byte[8192];
        int i = inputStream.read(bArr);
        long j = 0;
        while (i >= 0) {
            outputStream.write(bArr, 0, i);
            j += (long) i;
            i = inputStream.read(bArr);
        }
        return j;
    }

    public static final byte[] OooO0O0(InputStream inputStream) throws IOException {
        OooOOO0.OooO0oO(inputStream, "<this>");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStream.available()));
        OooO00o(inputStream, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        OooOOO0.OooO0o(byteArray, "toByteArray(...)");
        return byteArray;
    }
}
