package androidx.ink.storage;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o000OO00.C24457OooOOo;
import o000OO00.C24490OoooOOO;
import o000OO00.OooOO0O;
import o000OO00.OooOo;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m80611d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001d\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\u0006\u0010\u0005\u001a/\u0010\r\u001a\u00020\u0000*\u00020\u00072\u0006\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000e\u001a-\u0010\u0011\u001a\u00020\u0000*\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a%\u0010\u0014\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020\u00000\u00132\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001a#\u0010\u0016\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020\u00000\u00132\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\u0016\u0010\u0015\u001a7\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00000\u0013*\u00020\u00072\u0006\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\u0017\u0010\u0018\u001a/\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00000\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a/\u0010!\u001a\u00020\u001e*\u00020\u00002\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00030\u001b2\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u001f\u0010 ¨\u0006\""}, m80612d2 = {"Lo000OO00/OooOOo;", "Landroidx/ink/storage/TexturePngBytesLookup;", "textureIdToPngBytes", "", "encode", "(Lo000OO00/OooOOo;Landroidx/ink/storage/TexturePngBytesLookup;)[B", "encodeUncompressed", "Lo000OO00/OooOOo$OooO00o;", "input", "Lo000OO00/OoooOOO;", "maxVersion", "Landroidx/ink/storage/OnDecodeTexturePngBytes;", "onDecodeTexture", "decode", "(Lo000OO00/OooOOo$OooO00o;[BLo000OO00/OoooOOO;Landroidx/ink/storage/OnDecodeTexturePngBytes;)Lo000OO00/OooOOo;", "Landroidx/ink/storage/DecompressedBytes;", "decompressed", "decodeUncompressed", "(Lo000OO00/OooOOo$OooO00o;Landroidx/ink/storage/DecompressedBytes;Lo000OO00/OoooOOO;Landroidx/ink/storage/OnDecodeTexturePngBytes;)Lo000OO00/OooOOo;", "", "encodeMultiple", "(Ljava/util/List;Landroidx/ink/storage/TexturePngBytesLookup;)[B", "encodeMultipleUncompressed", "decodeMultiple", "(Lo000OO00/OooOOo$OooO00o;[BLo000OO00/OoooOOO;Landroidx/ink/storage/OnDecodeTexturePngBytes;)Ljava/util/List;", "decodeMultipleUncompressed", "(Landroidx/ink/storage/DecompressedBytes;Lo000OO00/OoooOOO;Landroidx/ink/storage/OnDecodeTexturePngBytes;)Ljava/util/List;", "", "", "textureMap", "LoO00ooO/OooOooO;", "collectTextures$BrushFamilyExtensions__BrushFamilyExtensionsKt", "(Lo000OO00/OooOOo;Ljava/util/Map;Landroidx/ink/storage/TexturePngBytesLookup;)V", "collectTextures", "ink-storage"}, m80613k = 5, m80614mv = {2, 1, 0}, m80616xi = 48, m80617xs = "androidx/ink/storage/BrushFamilyExtensions")
final /* synthetic */ class BrushFamilyExtensions__BrushFamilyExtensionsKt {
    private static final void collectTextures$BrushFamilyExtensions__BrushFamilyExtensionsKt(C24457OooOOo c24457OooOOo, Map<String, byte[]> map, TexturePngBytesLookup texturePngBytesLookup) {
        String str;
        byte[] texturePngBytes;
        Iterator<OooOO0O> it = c24457OooOOo.f82669OooO0O0.iterator();
        while (it.hasNext()) {
            Iterator<OooOo> it2 = it.next().f82653OooO0OO.iterator();
            while (it2.hasNext()) {
                for (OooOo.AbstractC24463OooO0Oo abstractC24463OooO0Oo : it2.next().f82688OooO0O0) {
                    if (abstractC24463OooO0Oo instanceof OooOo.OooO0OO) {
                        str = ((OooOo.OooO0OO) abstractC24463OooO0Oo).f82696OooO0o;
                    } else if (abstractC24463OooO0Oo instanceof OooOo.C24465OooO0o0) {
                        str = ((OooOo.C24465OooO0o0) abstractC24463OooO0Oo).f82732OooO0o;
                    }
                    if (str.length() != 0 && !map.containsKey(str) && (texturePngBytes = texturePngBytesLookup.getTexturePngBytes(str)) != null) {
                        map.put(str, texturePngBytes);
                    }
                }
            }
        }
    }

    public static final C24457OooOOo decode(C24457OooOOo.OooO00o oooO00o, byte[] input, C24490OoooOOO maxVersion, OnDecodeTexturePngBytes onDecodeTexturePngBytes) throws IOException {
        OooOOO0.OooO0oO(oooO00o, "<this>");
        OooOOO0.OooO0oO(input, "input");
        OooOOO0.OooO0oO(maxVersion, "maxVersion");
        return BrushFamilyExtensions.decodeUncompressed(oooO00o, new DecompressedBytes(input), maxVersion, onDecodeTexturePngBytes);
    }

    public static /* synthetic */ C24457OooOOo decode$default(C24457OooOOo.OooO00o oooO00o, byte[] bArr, C24490OoooOOO c24490OoooOOO, OnDecodeTexturePngBytes onDecodeTexturePngBytes, int i, Object obj) throws IOException {
        if ((i & 2) != 0) {
            c24490OoooOOO = C24490OoooOOO.f82795OooOoO0;
        }
        if ((i & 4) != 0) {
            onDecodeTexturePngBytes = null;
        }
        return BrushFamilyExtensions.decode(oooO00o, bArr, c24490OoooOOO, onDecodeTexturePngBytes);
    }

    public static final List<C24457OooOOo> decodeMultiple(C24457OooOOo.OooO00o oooO00o, byte[] input, C24490OoooOOO maxVersion, OnDecodeTexturePngBytes onDecodeTexturePngBytes) throws IOException {
        OooOOO0.OooO0oO(oooO00o, "<this>");
        OooOOO0.OooO0oO(input, "input");
        OooOOO0.OooO0oO(maxVersion, "maxVersion");
        return BrushFamilyExtensions.decodeMultipleUncompressed(new DecompressedBytes(input), maxVersion, onDecodeTexturePngBytes);
    }

    public static /* synthetic */ List decodeMultiple$default(C24457OooOOo.OooO00o oooO00o, byte[] bArr, C24490OoooOOO c24490OoooOOO, OnDecodeTexturePngBytes onDecodeTexturePngBytes, int i, Object obj) throws IOException {
        if ((i & 2) != 0) {
            c24490OoooOOO = C24490OoooOOO.f82795OooOoO0;
        }
        if ((i & 4) != 0) {
            onDecodeTexturePngBytes = null;
        }
        return BrushFamilyExtensions.decodeMultiple(oooO00o, bArr, c24490OoooOOO, onDecodeTexturePngBytes);
    }

    public static final List<C24457OooOOo> decodeMultipleUncompressed(DecompressedBytes decompressed, C24490OoooOOO maxVersion, OnDecodeTexturePngBytes onDecodeTexturePngBytes) {
        OooOOO0.OooO0oO(decompressed, "decompressed");
        OooOOO0.OooO0oO(maxVersion, "maxVersion");
        return MultipleBrushFamilies.INSTANCE.decode(decompressed.getBuffer(), decompressed.getSize(), onDecodeTexturePngBytes, maxVersion.f82796OooOo0o);
    }

    public static final C24457OooOOo decodeUncompressed(C24457OooOOo.OooO00o oooO00o, final DecompressedBytes decompressed, final C24490OoooOOO maxVersion, final OnDecodeTexturePngBytes onDecodeTexturePngBytes) {
        OooOOO0.OooO0oO(oooO00o, "<this>");
        OooOOO0.OooO0oO(decompressed, "decompressed");
        OooOOO0.OooO0oO(maxVersion, "maxVersion");
        C24457OooOOo.OooO00o oooO00o2 = C24457OooOOo.f82666OooO0oO;
        oO0O000o.OooO00o oooO00o3 = new oO0O000o.OooO00o() { // from class: androidx.ink.storage.OooO0OO
            @Override // oO0O000o.OooO00o
            public final Object invoke() {
                return Long.valueOf(BrushFamilyExtensions__BrushFamilyExtensionsKt.m40xbb7722de(decompressed, onDecodeTexturePngBytes, maxVersion));
            }
        };
        oooO00o2.getClass();
        return new C24457OooOOo(oooO00o3, null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: decodeUncompressed$lambda$0$BrushFamilyExtensions__BrushFamilyExtensionsKt */
    public static final long m40xbb7722de(DecompressedBytes decompressedBytes, OnDecodeTexturePngBytes onDecodeTexturePngBytes, C24490OoooOOO c24490OoooOOO) {
        long jCreateFromProto = BrushFamilySerializationNative.INSTANCE.createFromProto(decompressedBytes.getBuffer(), decompressedBytes.getSize(), onDecodeTexturePngBytes, c24490OoooOOO.f82796OooOo0o);
        if (jCreateFromProto != 0) {
            return jCreateFromProto;
        }
        throw new IllegalStateException("Should have thrown exception if decoding failed.");
    }

    public static final byte[] encode(C24457OooOOo c24457OooOOo, TexturePngBytesLookup texturePngBytesLookup) {
        OooOOO0.OooO0oO(c24457OooOOo, "<this>");
        return ByteArrays_jvmAndAndroidKt.compress(BrushFamilyExtensions.encodeUncompressed(c24457OooOOo, texturePngBytesLookup));
    }

    public static /* synthetic */ byte[] encode$default(C24457OooOOo c24457OooOOo, TexturePngBytesLookup texturePngBytesLookup, int i, Object obj) {
        if ((i & 1) != 0) {
            texturePngBytesLookup = null;
        }
        return BrushFamilyExtensions.encode(c24457OooOOo, texturePngBytesLookup);
    }

    public static final byte[] encodeMultiple(List<C24457OooOOo> list, TexturePngBytesLookup texturePngBytesLookup) {
        OooOOO0.OooO0oO(list, "<this>");
        return ByteArrays_jvmAndAndroidKt.compress(BrushFamilyExtensions.encodeMultipleUncompressed(list, texturePngBytesLookup));
    }

    public static /* synthetic */ byte[] encodeMultiple$default(List list, TexturePngBytesLookup texturePngBytesLookup, int i, Object obj) {
        if ((i & 1) != 0) {
            texturePngBytesLookup = null;
        }
        return BrushFamilyExtensions.encodeMultiple(list, texturePngBytesLookup);
    }

    public static final byte[] encodeMultipleUncompressed(List<C24457OooOOo> list, TexturePngBytesLookup texturePngBytesLookup) {
        LinkedHashMap linkedHashMap;
        OooOOO0.OooO0oO(list, "<this>");
        if (texturePngBytesLookup != null) {
            linkedHashMap = new LinkedHashMap();
            Iterator<C24457OooOOo> it = list.iterator();
            while (it.hasNext()) {
                collectTextures$BrushFamilyExtensions__BrushFamilyExtensionsKt(it.next(), linkedHashMap, texturePngBytesLookup);
            }
        } else {
            linkedHashMap = null;
        }
        BrushFamilySerializationNative brushFamilySerializationNative = BrushFamilySerializationNative.INSTANCE;
        int size = list.size();
        long[] jArr = new long[size];
        for (int i = 0; i < size; i++) {
            jArr[i] = list.get(i).OooO0O0();
        }
        return brushFamilySerializationNative.encodeMultiple(jArr, linkedHashMap);
    }

    public static final byte[] encodeUncompressed(C24457OooOOo c24457OooOOo, TexturePngBytesLookup texturePngBytesLookup) {
        LinkedHashMap linkedHashMap;
        OooOOO0.OooO0oO(c24457OooOOo, "<this>");
        if (texturePngBytesLookup != null) {
            linkedHashMap = new LinkedHashMap();
            collectTextures$BrushFamilyExtensions__BrushFamilyExtensionsKt(c24457OooOOo, linkedHashMap, texturePngBytesLookup);
        } else {
            linkedHashMap = null;
        }
        return BrushFamilySerializationNative.INSTANCE.encode(c24457OooOOo.OooO0O0(), linkedHashMap);
    }
}
