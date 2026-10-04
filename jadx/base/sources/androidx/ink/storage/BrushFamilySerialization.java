package androidx.ink.storage;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o000OO00.C24457OooOOo;
import o000OO00.C24490OoooOOO;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m80611d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u000b\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b\u000b\u0010\u000eJ-\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0015\u0010\u0017J-\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\r2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0004\b\u0015\u0010\u0018J\u001f\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0015\u0010\u0019J1\u0010\u001c\u001a\u00020\n2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u001a2\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ)\u0010\u001c\u001a\u00020\r2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u001a2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b\u001c\u0010\u001eJ3\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00040\u001a2\u0006\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0004\b\u001f\u0010 J%\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00040\u001a2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u001f\u0010!J3\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00040\u001a2\u0006\u0010\u0010\u001a\u00020\r2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0004\b\u001f\u0010\"J%\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00040\u001a2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u001f\u0010#¨\u0006$"}, m80612d2 = {"Landroidx/ink/storage/BrushFamilySerialization;", "", "<init>", "()V", "Lo000OO00/OooOOo;", "brushFamily", "Ljava/io/OutputStream;", "output", "Landroidx/ink/storage/TexturePngBytesLookup;", "textureIdToPngBytes", "LoO00ooO/OooOooO;", "encode", "(Lo000OO00/OooOOo;Ljava/io/OutputStream;Landroidx/ink/storage/TexturePngBytesLookup;)V", "", "(Lo000OO00/OooOOo;Landroidx/ink/storage/TexturePngBytesLookup;)[B", "Ljava/io/InputStream;", "input", "Lo000OO00/OoooOOO;", "maxVersion", "Landroidx/ink/storage/OnDecodeTexturePngBytes;", "onDecodeTexture", "decode", "(Ljava/io/InputStream;Lo000OO00/OoooOOO;Landroidx/ink/storage/OnDecodeTexturePngBytes;)Lo000OO00/OooOOo;", "(Ljava/io/InputStream;Landroidx/ink/storage/OnDecodeTexturePngBytes;)Lo000OO00/OooOOo;", "([BLo000OO00/OoooOOO;Landroidx/ink/storage/OnDecodeTexturePngBytes;)Lo000OO00/OooOOo;", "([BLandroidx/ink/storage/OnDecodeTexturePngBytes;)Lo000OO00/OooOOo;", "", "brushFamilies", "encodeMultiple", "(Ljava/util/List;Ljava/io/OutputStream;Landroidx/ink/storage/TexturePngBytesLookup;)V", "(Ljava/util/List;Landroidx/ink/storage/TexturePngBytesLookup;)[B", "decodeMultiple", "(Ljava/io/InputStream;Lo000OO00/OoooOOO;Landroidx/ink/storage/OnDecodeTexturePngBytes;)Ljava/util/List;", "(Ljava/io/InputStream;Landroidx/ink/storage/OnDecodeTexturePngBytes;)Ljava/util/List;", "([BLo000OO00/OoooOOO;Landroidx/ink/storage/OnDecodeTexturePngBytes;)Ljava/util/List;", "([BLandroidx/ink/storage/OnDecodeTexturePngBytes;)Ljava/util/List;", "ink-storage"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class BrushFamilySerialization {
    public static final BrushFamilySerialization INSTANCE = new BrushFamilySerialization();

    private BrushFamilySerialization() {
    }

    public static final C24457OooOOo decode(InputStream input) throws IOException {
        OooOOO0.OooO0oO(input, "input");
        return decode$default(input, (C24490OoooOOO) null, (OnDecodeTexturePngBytes) null, 6, (Object) null);
    }

    public static /* synthetic */ C24457OooOOo decode$default(InputStream inputStream, C24490OoooOOO c24490OoooOOO, OnDecodeTexturePngBytes onDecodeTexturePngBytes, int i, Object obj) throws IOException {
        if ((i & 2) != 0) {
            c24490OoooOOO = C24490OoooOOO.f82795OooOoO0;
        }
        if ((i & 4) != 0) {
            onDecodeTexturePngBytes = null;
        }
        return decode(inputStream, c24490OoooOOO, onDecodeTexturePngBytes);
    }

    public static final List<C24457OooOOo> decodeMultiple(InputStream input) throws IOException {
        OooOOO0.OooO0oO(input, "input");
        return decodeMultiple$default(input, (C24490OoooOOO) null, (OnDecodeTexturePngBytes) null, 6, (Object) null);
    }

    public static /* synthetic */ List decodeMultiple$default(InputStream inputStream, C24490OoooOOO c24490OoooOOO, OnDecodeTexturePngBytes onDecodeTexturePngBytes, int i, Object obj) throws IOException {
        if ((i & 2) != 0) {
            c24490OoooOOO = C24490OoooOOO.f82795OooOoO0;
        }
        if ((i & 4) != 0) {
            onDecodeTexturePngBytes = null;
        }
        return decodeMultiple(inputStream, c24490OoooOOO, onDecodeTexturePngBytes);
    }

    public static final void encode(C24457OooOOo brushFamily, OutputStream output) throws IOException {
        OooOOO0.OooO0oO(brushFamily, "brushFamily");
        OooOOO0.OooO0oO(output, "output");
        encode$default(brushFamily, output, null, 4, null);
    }

    public static /* synthetic */ void encode$default(C24457OooOOo c24457OooOOo, OutputStream outputStream, TexturePngBytesLookup texturePngBytesLookup, int i, Object obj) throws IOException {
        if ((i & 4) != 0) {
            texturePngBytesLookup = null;
        }
        encode(c24457OooOOo, outputStream, texturePngBytesLookup);
    }

    public static final void encodeMultiple(List<C24457OooOOo> brushFamilies, OutputStream output) throws IOException {
        OooOOO0.OooO0oO(brushFamilies, "brushFamilies");
        OooOOO0.OooO0oO(output, "output");
        encodeMultiple$default(brushFamilies, output, null, 4, null);
    }

    public static /* synthetic */ void encodeMultiple$default(List list, OutputStream outputStream, TexturePngBytesLookup texturePngBytesLookup, int i, Object obj) throws IOException {
        if ((i & 4) != 0) {
            texturePngBytesLookup = null;
        }
        encodeMultiple(list, outputStream, texturePngBytesLookup);
    }

    public static final C24457OooOOo decode(InputStream input, C24490OoooOOO maxVersion) throws IOException {
        OooOOO0.OooO0oO(input, "input");
        OooOOO0.OooO0oO(maxVersion, "maxVersion");
        return decode$default(input, maxVersion, (OnDecodeTexturePngBytes) null, 4, (Object) null);
    }

    public static final List<C24457OooOOo> decodeMultiple(InputStream input, C24490OoooOOO maxVersion) throws IOException {
        OooOOO0.OooO0oO(input, "input");
        OooOOO0.OooO0oO(maxVersion, "maxVersion");
        return decodeMultiple$default(input, maxVersion, (OnDecodeTexturePngBytes) null, 4, (Object) null);
    }

    public static final byte[] encode(C24457OooOOo brushFamily) throws IOException {
        OooOOO0.OooO0oO(brushFamily, "brushFamily");
        return encode$default(brushFamily, null, 2, null);
    }

    public static /* synthetic */ byte[] encode$default(C24457OooOOo c24457OooOOo, TexturePngBytesLookup texturePngBytesLookup, int i, Object obj) throws IOException {
        if ((i & 2) != 0) {
            texturePngBytesLookup = null;
        }
        return encode(c24457OooOOo, texturePngBytesLookup);
    }

    public static final byte[] encodeMultiple(List<C24457OooOOo> brushFamilies) throws IOException {
        OooOOO0.OooO0oO(brushFamilies, "brushFamilies");
        return encodeMultiple$default(brushFamilies, null, 2, null);
    }

    public static /* synthetic */ byte[] encodeMultiple$default(List list, TexturePngBytesLookup texturePngBytesLookup, int i, Object obj) throws IOException {
        if ((i & 2) != 0) {
            texturePngBytesLookup = null;
        }
        return encodeMultiple((List<C24457OooOOo>) list, texturePngBytesLookup);
    }

    public static final C24457OooOOo decode(byte[] input) throws IOException {
        OooOOO0.OooO0oO(input, "input");
        return decode$default(input, (C24490OoooOOO) null, (OnDecodeTexturePngBytes) null, 6, (Object) null);
    }

    public static /* synthetic */ C24457OooOOo decode$default(byte[] bArr, C24490OoooOOO c24490OoooOOO, OnDecodeTexturePngBytes onDecodeTexturePngBytes, int i, Object obj) throws IOException {
        if ((i & 2) != 0) {
            c24490OoooOOO = C24490OoooOOO.f82795OooOoO0;
        }
        if ((i & 4) != 0) {
            onDecodeTexturePngBytes = null;
        }
        return decode(bArr, c24490OoooOOO, onDecodeTexturePngBytes);
    }

    public static final List<C24457OooOOo> decodeMultiple(byte[] input) throws IOException {
        OooOOO0.OooO0oO(input, "input");
        return decodeMultiple$default(input, (C24490OoooOOO) null, (OnDecodeTexturePngBytes) null, 6, (Object) null);
    }

    public static /* synthetic */ List decodeMultiple$default(byte[] bArr, C24490OoooOOO c24490OoooOOO, OnDecodeTexturePngBytes onDecodeTexturePngBytes, int i, Object obj) throws IOException {
        if ((i & 2) != 0) {
            c24490OoooOOO = C24490OoooOOO.f82795OooOoO0;
        }
        if ((i & 4) != 0) {
            onDecodeTexturePngBytes = null;
        }
        return decodeMultiple(bArr, c24490OoooOOO, onDecodeTexturePngBytes);
    }

    public static final void encode(C24457OooOOo brushFamily, OutputStream output, TexturePngBytesLookup textureIdToPngBytes) throws IOException {
        OooOOO0.OooO0oO(brushFamily, "brushFamily");
        OooOOO0.OooO0oO(output, "output");
        BrushFamilyExtensions.encode(brushFamily, output, textureIdToPngBytes);
    }

    public static final void encodeMultiple(List<C24457OooOOo> brushFamilies, OutputStream output, TexturePngBytesLookup textureIdToPngBytes) throws IOException {
        OooOOO0.OooO0oO(brushFamilies, "brushFamilies");
        OooOOO0.OooO0oO(output, "output");
        BrushFamilyExtensions.encodeMultiple(brushFamilies, output, textureIdToPngBytes);
    }

    public static final C24457OooOOo decode(byte[] input, C24490OoooOOO maxVersion) throws IOException {
        OooOOO0.OooO0oO(input, "input");
        OooOOO0.OooO0oO(maxVersion, "maxVersion");
        return decode$default(input, maxVersion, (OnDecodeTexturePngBytes) null, 4, (Object) null);
    }

    public static final List<C24457OooOOo> decodeMultiple(byte[] input, C24490OoooOOO maxVersion) throws IOException {
        OooOOO0.OooO0oO(input, "input");
        OooOOO0.OooO0oO(maxVersion, "maxVersion");
        return decodeMultiple$default(input, maxVersion, (OnDecodeTexturePngBytes) null, 4, (Object) null);
    }

    public static final byte[] encode(C24457OooOOo brushFamily, TexturePngBytesLookup textureIdToPngBytes) throws IOException {
        OooOOO0.OooO0oO(brushFamily, "brushFamily");
        return BrushFamilyExtensions.encode(brushFamily, textureIdToPngBytes);
    }

    public static final byte[] encodeMultiple(List<C24457OooOOo> brushFamilies, TexturePngBytesLookup textureIdToPngBytes) throws IOException {
        OooOOO0.OooO0oO(brushFamilies, "brushFamilies");
        return BrushFamilyExtensions.encodeMultiple(brushFamilies, textureIdToPngBytes);
    }

    public static final C24457OooOOo decode(InputStream input, C24490OoooOOO maxVersion, OnDecodeTexturePngBytes onDecodeTexture) throws IOException {
        OooOOO0.OooO0oO(input, "input");
        OooOOO0.OooO0oO(maxVersion, "maxVersion");
        return BrushFamilyExtensions.decode(C24457OooOOo.f82666OooO0oO, input, maxVersion, onDecodeTexture);
    }

    public static final List<C24457OooOOo> decodeMultiple(InputStream input, C24490OoooOOO maxVersion, OnDecodeTexturePngBytes onDecodeTexture) throws IOException {
        OooOOO0.OooO0oO(input, "input");
        OooOOO0.OooO0oO(maxVersion, "maxVersion");
        return BrushFamilyExtensions.decodeMultiple(C24457OooOOo.f82666OooO0oO, input, maxVersion, onDecodeTexture);
    }

    public static final C24457OooOOo decode(InputStream input, OnDecodeTexturePngBytes onDecodeTexture) throws IOException {
        OooOOO0.OooO0oO(input, "input");
        OooOOO0.OooO0oO(onDecodeTexture, "onDecodeTexture");
        return decode(input, C24490OoooOOO.f82795OooOoO0, onDecodeTexture);
    }

    public static final List<C24457OooOOo> decodeMultiple(InputStream input, OnDecodeTexturePngBytes onDecodeTexture) throws IOException {
        OooOOO0.OooO0oO(input, "input");
        OooOOO0.OooO0oO(onDecodeTexture, "onDecodeTexture");
        return decodeMultiple(input, C24490OoooOOO.f82795OooOoO0, onDecodeTexture);
    }

    public static final C24457OooOOo decode(byte[] input, C24490OoooOOO maxVersion, OnDecodeTexturePngBytes onDecodeTexture) throws IOException {
        OooOOO0.OooO0oO(input, "input");
        OooOOO0.OooO0oO(maxVersion, "maxVersion");
        return BrushFamilyExtensions.decode(C24457OooOOo.f82666OooO0oO, input, maxVersion, onDecodeTexture);
    }

    public static final List<C24457OooOOo> decodeMultiple(byte[] input, C24490OoooOOO maxVersion, OnDecodeTexturePngBytes onDecodeTexture) throws IOException {
        OooOOO0.OooO0oO(input, "input");
        OooOOO0.OooO0oO(maxVersion, "maxVersion");
        return BrushFamilyExtensions.decodeMultiple(C24457OooOOo.f82666OooO0oO, input, maxVersion, onDecodeTexture);
    }

    public static final C24457OooOOo decode(byte[] input, OnDecodeTexturePngBytes onDecodeTexture) throws IOException {
        OooOOO0.OooO0oO(input, "input");
        OooOOO0.OooO0oO(onDecodeTexture, "onDecodeTexture");
        return decode(input, C24490OoooOOO.f82795OooOoO0, onDecodeTexture);
    }

    public static final List<C24457OooOOo> decodeMultiple(byte[] input, OnDecodeTexturePngBytes onDecodeTexture) throws IOException {
        OooOOO0.OooO0oO(input, "input");
        OooOOO0.OooO0oO(onDecodeTexture, "onDecodeTexture");
        return decodeMultiple(input, C24490OoooOOO.f82795OooOoO0, onDecodeTexture);
    }
}
