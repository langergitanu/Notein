package androidx.ink.storage;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.zip.GZIPInputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import oO00ooO.C32460OooOooO;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m80611d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\u0004\u0010\bR\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, m80612d2 = {"Landroidx/ink/storage/DecompressedBytes;", "", "compressedBytesInputStream", "Ljava/io/InputStream;", "<init>", "(Ljava/io/InputStream;)V", "compressedBytes", "", "([B)V", "buffer", "getBuffer", "()[B", "size", "", "getSize", "()I", "Companion", "ink-storage"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class DecompressedBytes {
    public static final int DECOMPRESSED_BYTES_INITIAL_CAPACITY = 32768;
    private final byte[] buffer;
    private final int size;

    public DecompressedBytes(InputStream compressedBytesInputStream) throws IOException {
        OooOOO0.OooO0oO(compressedBytesInputStream, "compressedBytesInputStream");
        byte[] bArrCopyOf = new byte[32768];
        GZIPInputStream gZIPInputStream = new GZIPInputStream(compressedBytesInputStream);
        int i = 0;
        while (true) {
            try {
                int i2 = gZIPInputStream.read(bArrCopyOf, i, bArrCopyOf.length - i);
                if (i2 == -1) {
                    Arrays.fill(bArrCopyOf, i, bArrCopyOf.length, (byte) 0);
                    this.buffer = bArrCopyOf;
                    this.size = i;
                    C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                    gZIPInputStream.close();
                    return;
                }
                i += i2;
                if (i == bArrCopyOf.length) {
                    bArrCopyOf = Arrays.copyOf(bArrCopyOf, i * 2);
                    OooOOO0.OooO0o(bArrCopyOf, "copyOf(...)");
                }
            } finally {
            }
        }
    }

    public final byte[] getBuffer() {
        return this.buffer;
    }

    public final int getSize() {
        return this.size;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DecompressedBytes(byte[] compressedBytes) {
        this(new ByteArrayInputStream(compressedBytes));
        OooOOO0.OooO0oO(compressedBytes, "compressedBytes");
    }
}
