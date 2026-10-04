package androidx.ink.storage;

import androidx.ink.strokes.OooOOO;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m80611d1 = {"androidx/ink/storage/StrokeInputBatchExtensions__StrokeInputBatchExtensionsKt", "androidx/ink/storage/StrokeInputBatchExtensions__StrokeInputBatchExtensions_jvmAndAndroidKt"}, m80613k = 4, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class StrokeInputBatchExtensions {
    public static final androidx.ink.strokes.OooO00o decode(OooOOO.OooO00o oooO00o, InputStream inputStream) throws IOException {
        return C0115x49302f7b.decode(oooO00o, inputStream);
    }

    public static final androidx.ink.strokes.OooO00o decodeUncompressed(OooOOO.OooO00o oooO00o, DecompressedBytes decompressedBytes) throws IOException {
        return StrokeInputBatchExtensions__StrokeInputBatchExtensionsKt.decodeUncompressed(oooO00o, decompressedBytes);
    }

    public static final void encode(OooOOO oooOOO, OutputStream outputStream) throws IOException {
        C0115x49302f7b.encode(oooOOO, outputStream);
    }

    public static final byte[] encodeUncompressed(OooOOO oooOOO) {
        return StrokeInputBatchExtensions__StrokeInputBatchExtensionsKt.encodeUncompressed(oooOOO);
    }

    public static final androidx.ink.strokes.OooO00o decode(OooOOO.OooO00o oooO00o, byte[] bArr) throws IOException {
        return StrokeInputBatchExtensions__StrokeInputBatchExtensionsKt.decode(oooO00o, bArr);
    }

    public static final byte[] encode(OooOOO oooOOO) {
        return StrokeInputBatchExtensions__StrokeInputBatchExtensionsKt.encode(oooOOO);
    }
}
