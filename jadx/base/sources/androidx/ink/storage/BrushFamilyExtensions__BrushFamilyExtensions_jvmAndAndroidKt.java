package androidx.ink.storage;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.zip.GZIPOutputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o000OO00.C24457OooOOo;
import o000OO00.C24490OoooOOO;
import oO00ooO.C32460OooOooO;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m80611d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\u001a%\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a/\u0010\u000f\u001a\u00020\u0000*\u00020\b2\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010\u001a-\u0010\u0012\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00000\u00112\u0006\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a7\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00000\u0011*\u00020\b2\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m80612d2 = {"Lo000OO00/OooOOo;", "Ljava/io/OutputStream;", "output", "Landroidx/ink/storage/TexturePngBytesLookup;", "textureIdToPngBytes", "LoO00ooO/OooOooO;", "encode", "(Lo000OO00/OooOOo;Ljava/io/OutputStream;Landroidx/ink/storage/TexturePngBytesLookup;)V", "Lo000OO00/OooOOo$OooO00o;", "Ljava/io/InputStream;", "input", "Lo000OO00/OoooOOO;", "maxVersion", "Landroidx/ink/storage/OnDecodeTexturePngBytes;", "onDecodeTexture", "decode", "(Lo000OO00/OooOOo$OooO00o;Ljava/io/InputStream;Lo000OO00/OoooOOO;Landroidx/ink/storage/OnDecodeTexturePngBytes;)Lo000OO00/OooOOo;", "", "encodeMultiple", "(Ljava/util/List;Ljava/io/OutputStream;Landroidx/ink/storage/TexturePngBytesLookup;)V", "decodeMultiple", "(Lo000OO00/OooOOo$OooO00o;Ljava/io/InputStream;Lo000OO00/OoooOOO;Landroidx/ink/storage/OnDecodeTexturePngBytes;)Ljava/util/List;", "ink-storage"}, m80613k = 5, m80614mv = {2, 1, 0}, m80616xi = 48, m80617xs = "androidx/ink/storage/BrushFamilyExtensions")
final /* synthetic */ class BrushFamilyExtensions__BrushFamilyExtensions_jvmAndAndroidKt {
    public static final C24457OooOOo decode(C24457OooOOo.OooO00o oooO00o, InputStream input, C24490OoooOOO maxVersion, OnDecodeTexturePngBytes onDecodeTexturePngBytes) throws IOException {
        OooOOO0.OooO0oO(oooO00o, "<this>");
        OooOOO0.OooO0oO(input, "input");
        OooOOO0.OooO0oO(maxVersion, "maxVersion");
        return BrushFamilyExtensions.decodeUncompressed(oooO00o, new DecompressedBytes(input), maxVersion, onDecodeTexturePngBytes);
    }

    public static /* synthetic */ C24457OooOOo decode$default(C24457OooOOo.OooO00o oooO00o, InputStream inputStream, C24490OoooOOO c24490OoooOOO, OnDecodeTexturePngBytes onDecodeTexturePngBytes, int i, Object obj) throws IOException {
        if ((i & 2) != 0) {
            c24490OoooOOO = C24490OoooOOO.f82795OooOoO0;
        }
        if ((i & 4) != 0) {
            onDecodeTexturePngBytes = null;
        }
        return BrushFamilyExtensions.decode(oooO00o, inputStream, c24490OoooOOO, onDecodeTexturePngBytes);
    }

    public static final List<C24457OooOOo> decodeMultiple(C24457OooOOo.OooO00o oooO00o, InputStream input, C24490OoooOOO maxVersion, OnDecodeTexturePngBytes onDecodeTexturePngBytes) throws IOException {
        OooOOO0.OooO0oO(oooO00o, "<this>");
        OooOOO0.OooO0oO(input, "input");
        OooOOO0.OooO0oO(maxVersion, "maxVersion");
        return BrushFamilyExtensions.decodeMultipleUncompressed(new DecompressedBytes(input), maxVersion, onDecodeTexturePngBytes);
    }

    public static /* synthetic */ List decodeMultiple$default(C24457OooOOo.OooO00o oooO00o, InputStream inputStream, C24490OoooOOO c24490OoooOOO, OnDecodeTexturePngBytes onDecodeTexturePngBytes, int i, Object obj) throws IOException {
        if ((i & 2) != 0) {
            c24490OoooOOO = C24490OoooOOO.f82795OooOoO0;
        }
        if ((i & 4) != 0) {
            onDecodeTexturePngBytes = null;
        }
        return BrushFamilyExtensions.decodeMultiple(oooO00o, inputStream, c24490OoooOOO, onDecodeTexturePngBytes);
    }

    public static final void encode(C24457OooOOo c24457OooOOo, OutputStream output, TexturePngBytesLookup texturePngBytesLookup) throws IOException {
        OooOOO0.OooO0oO(c24457OooOOo, "<this>");
        OooOOO0.OooO0oO(output, "output");
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(output);
        try {
            gZIPOutputStream.write(BrushFamilyExtensions.encodeUncompressed(c24457OooOOo, texturePngBytesLookup));
            C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
            gZIPOutputStream.close();
        } finally {
        }
    }

    public static /* synthetic */ void encode$default(C24457OooOOo c24457OooOOo, OutputStream outputStream, TexturePngBytesLookup texturePngBytesLookup, int i, Object obj) {
        if ((i & 2) != 0) {
            texturePngBytesLookup = null;
        }
        BrushFamilyExtensions.encode(c24457OooOOo, outputStream, texturePngBytesLookup);
    }

    public static final void encodeMultiple(List<C24457OooOOo> list, OutputStream output, TexturePngBytesLookup texturePngBytesLookup) throws IOException {
        OooOOO0.OooO0oO(list, "<this>");
        OooOOO0.OooO0oO(output, "output");
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(output);
        try {
            gZIPOutputStream.write(BrushFamilyExtensions.encodeMultipleUncompressed(list, texturePngBytesLookup));
            C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
            gZIPOutputStream.close();
        } finally {
        }
    }

    public static /* synthetic */ void encodeMultiple$default(List list, OutputStream outputStream, TexturePngBytesLookup texturePngBytesLookup, int i, Object obj) {
        if ((i & 2) != 0) {
            texturePngBytesLookup = null;
        }
        BrushFamilyExtensions.encodeMultiple(list, outputStream, texturePngBytesLookup);
    }
}
