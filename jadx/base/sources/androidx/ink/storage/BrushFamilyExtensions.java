package androidx.ink.storage;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import kotlin.Metadata;
import o000OO00.C24457OooOOo;
import o000OO00.C24490OoooOOO;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m80611d1 = {"androidx/ink/storage/BrushFamilyExtensions__BrushFamilyExtensionsKt", "androidx/ink/storage/BrushFamilyExtensions__BrushFamilyExtensions_jvmAndAndroidKt"}, m80613k = 4, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class BrushFamilyExtensions {
    public static final C24457OooOOo decode(C24457OooOOo.OooO00o oooO00o, InputStream inputStream, C24490OoooOOO c24490OoooOOO, OnDecodeTexturePngBytes onDecodeTexturePngBytes) throws IOException {
        return BrushFamilyExtensions__BrushFamilyExtensions_jvmAndAndroidKt.decode(oooO00o, inputStream, c24490OoooOOO, onDecodeTexturePngBytes);
    }

    public static final List<C24457OooOOo> decodeMultiple(C24457OooOOo.OooO00o oooO00o, InputStream inputStream, C24490OoooOOO c24490OoooOOO, OnDecodeTexturePngBytes onDecodeTexturePngBytes) throws IOException {
        return BrushFamilyExtensions__BrushFamilyExtensions_jvmAndAndroidKt.decodeMultiple(oooO00o, inputStream, c24490OoooOOO, onDecodeTexturePngBytes);
    }

    public static final List<C24457OooOOo> decodeMultipleUncompressed(DecompressedBytes decompressedBytes, C24490OoooOOO c24490OoooOOO, OnDecodeTexturePngBytes onDecodeTexturePngBytes) {
        return BrushFamilyExtensions__BrushFamilyExtensionsKt.decodeMultipleUncompressed(decompressedBytes, c24490OoooOOO, onDecodeTexturePngBytes);
    }

    public static final C24457OooOOo decodeUncompressed(C24457OooOOo.OooO00o oooO00o, DecompressedBytes decompressedBytes, C24490OoooOOO c24490OoooOOO, OnDecodeTexturePngBytes onDecodeTexturePngBytes) {
        return BrushFamilyExtensions__BrushFamilyExtensionsKt.decodeUncompressed(oooO00o, decompressedBytes, c24490OoooOOO, onDecodeTexturePngBytes);
    }

    public static final void encode(C24457OooOOo c24457OooOOo, OutputStream outputStream, TexturePngBytesLookup texturePngBytesLookup) {
        BrushFamilyExtensions__BrushFamilyExtensions_jvmAndAndroidKt.encode(c24457OooOOo, outputStream, texturePngBytesLookup);
    }

    public static final void encodeMultiple(List<C24457OooOOo> list, OutputStream outputStream, TexturePngBytesLookup texturePngBytesLookup) {
        BrushFamilyExtensions__BrushFamilyExtensions_jvmAndAndroidKt.encodeMultiple(list, outputStream, texturePngBytesLookup);
    }

    public static final byte[] encodeMultipleUncompressed(List<C24457OooOOo> list, TexturePngBytesLookup texturePngBytesLookup) {
        return BrushFamilyExtensions__BrushFamilyExtensionsKt.encodeMultipleUncompressed(list, texturePngBytesLookup);
    }

    public static final byte[] encodeUncompressed(C24457OooOOo c24457OooOOo, TexturePngBytesLookup texturePngBytesLookup) {
        return BrushFamilyExtensions__BrushFamilyExtensionsKt.encodeUncompressed(c24457OooOOo, texturePngBytesLookup);
    }

    public static final C24457OooOOo decode(C24457OooOOo.OooO00o oooO00o, byte[] bArr, C24490OoooOOO c24490OoooOOO, OnDecodeTexturePngBytes onDecodeTexturePngBytes) throws IOException {
        return BrushFamilyExtensions__BrushFamilyExtensionsKt.decode(oooO00o, bArr, c24490OoooOOO, onDecodeTexturePngBytes);
    }

    public static final List<C24457OooOOo> decodeMultiple(C24457OooOOo.OooO00o oooO00o, byte[] bArr, C24490OoooOOO c24490OoooOOO, OnDecodeTexturePngBytes onDecodeTexturePngBytes) throws IOException {
        return BrushFamilyExtensions__BrushFamilyExtensionsKt.decodeMultiple(oooO00o, bArr, c24490OoooOOO, onDecodeTexturePngBytes);
    }

    public static final byte[] encode(C24457OooOOo c24457OooOOo, TexturePngBytesLookup texturePngBytesLookup) {
        return BrushFamilyExtensions__BrushFamilyExtensionsKt.encode(c24457OooOOo, texturePngBytesLookup);
    }

    public static final byte[] encodeMultiple(List<C24457OooOOo> list, TexturePngBytesLookup texturePngBytesLookup) {
        return BrushFamilyExtensions__BrushFamilyExtensionsKt.encodeMultiple(list, texturePngBytesLookup);
    }
}
