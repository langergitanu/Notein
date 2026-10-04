package androidx.ink.storage;

import androidx.ink.strokes.OooOOO;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m80611d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0019\u0010\u0007\u001a\u00020\u0006*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a\u0013\u0010\t\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\t\u0010\u0003\u001a\u001b\u0010\u000b\u001a\u00020\u0006*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\nH\u0000¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m80612d2 = {"Landroidx/ink/strokes/OooOOO;", "", "encode", "(Landroidx/ink/strokes/OooOOO;)[B", "Landroidx/ink/strokes/OooOOO$OooO00o;", "input", "Landroidx/ink/strokes/OooO00o;", "decode", "(Landroidx/ink/strokes/OooOOO$OooO00o;[B)Landroidx/ink/strokes/OooO00o;", "encodeUncompressed", "Landroidx/ink/storage/DecompressedBytes;", "decodeUncompressed", "(Landroidx/ink/strokes/OooOOO$OooO00o;Landroidx/ink/storage/DecompressedBytes;)Landroidx/ink/strokes/OooO00o;", "ink-storage"}, m80613k = 5, m80614mv = {2, 1, 0}, m80616xi = 48, m80617xs = "androidx/ink/storage/StrokeInputBatchExtensions")
final /* synthetic */ class StrokeInputBatchExtensions__StrokeInputBatchExtensionsKt {
    public static final androidx.ink.strokes.OooO00o decode(OooOOO.OooO00o oooO00o, byte[] input) throws IOException {
        OooOOO0.OooO0oO(oooO00o, "<this>");
        OooOOO0.OooO0oO(input, "input");
        return StrokeInputBatchExtensions.decodeUncompressed(oooO00o, new DecompressedBytes(input));
    }

    public static final androidx.ink.strokes.OooO00o decodeUncompressed(OooOOO.OooO00o oooO00o, final DecompressedBytes input) throws IOException {
        OooOOO0.OooO0oO(oooO00o, "<this>");
        OooOOO0.OooO0oO(input, "input");
        return new androidx.ink.strokes.OooO00o(new oO0O000o.OooO00o() { // from class: androidx.ink.storage.OooO0o
            @Override // oO0O000o.OooO00o
            public final Object invoke() {
                return Long.valueOf(StrokeInputBatchExtensions__StrokeInputBatchExtensionsKt.m41xcb397d16(input));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: decodeUncompressed$lambda$0$StrokeInputBatchExtensions__StrokeInputBatchExtensionsKt */
    public static final long m41xcb397d16(DecompressedBytes decompressedBytes) {
        return StrokeInputBatchSerializationNative.INSTANCE.createFromProto(decompressedBytes.getBuffer(), decompressedBytes.getSize());
    }

    public static final byte[] encode(OooOOO oooOOO) {
        OooOOO0.OooO0oO(oooOOO, "<this>");
        return ByteArrays_jvmAndAndroidKt.compress(StrokeInputBatchExtensions.encodeUncompressed(oooOOO));
    }

    public static final byte[] encodeUncompressed(OooOOO oooOOO) {
        OooOOO0.OooO0oO(oooOOO, "<this>");
        return StrokeInputBatchSerializationNative.INSTANCE.encode(oooOOO.OooO0O0());
    }
}
