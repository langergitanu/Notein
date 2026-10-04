package androidx.ink.storage;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o000OO00.C24457OooOOo;
import o000OO00.C24490OoooOOO;
import o000OO00.o000oOoO;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m80611d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0015J-\u0010\u0018\u001a\u00020\n2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u00162\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0018\u0010\u0019J-\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u00162\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ%\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u00162\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u001a\u0010\u001c¨\u0006\u001d"}, m80612d2 = {"Landroidx/ink/storage/AndroidBrushFamilySerialization;", "", "<init>", "()V", "Lo000OO00/OooOOo;", "brushFamily", "Ljava/io/OutputStream;", "output", "Lo000OO00/o000oOoO;", "textureBitmapStore", "LoO00ooO/OooOooO;", "encode", "(Lo000OO00/OooOOo;Ljava/io/OutputStream;Lo000OO00/o000oOoO;)V", "Ljava/io/InputStream;", "input", "Lo000OO00/OoooOOO;", "maxVersion", "Landroidx/ink/storage/BrushFamilyDecodeCallback;", "getClientTextureId", "decode", "(Ljava/io/InputStream;Lo000OO00/OoooOOO;Landroidx/ink/storage/BrushFamilyDecodeCallback;)Lo000OO00/OooOOo;", "(Ljava/io/InputStream;Landroidx/ink/storage/BrushFamilyDecodeCallback;)Lo000OO00/OooOOo;", "", "brushFamilies", "encodeMultiple", "(Ljava/util/List;Ljava/io/OutputStream;Lo000OO00/o000oOoO;)V", "decodeMultiple", "(Ljava/io/InputStream;Lo000OO00/OoooOOO;Landroidx/ink/storage/BrushFamilyDecodeCallback;)Ljava/util/List;", "(Ljava/io/InputStream;Landroidx/ink/storage/BrushFamilyDecodeCallback;)Ljava/util/List;", "ink-storage"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class AndroidBrushFamilySerialization {
    public static final AndroidBrushFamilySerialization INSTANCE = new AndroidBrushFamilySerialization();

    private AndroidBrushFamilySerialization() {
    }

    public static final C24457OooOOo decode(InputStream input, C24490OoooOOO maxVersion, BrushFamilyDecodeCallback getClientTextureId) throws IOException {
        OooOOO0.OooO0oO(input, "input");
        OooOOO0.OooO0oO(maxVersion, "maxVersion");
        OooOOO0.OooO0oO(getClientTextureId, "getClientTextureId");
        return AndroidBrushFamilyExtensions.decode(C24457OooOOo.f82666OooO0oO, input, maxVersion, getClientTextureId);
    }

    public static final List<C24457OooOOo> decodeMultiple(InputStream input, C24490OoooOOO maxVersion, BrushFamilyDecodeCallback getClientTextureId) throws IOException {
        OooOOO0.OooO0oO(input, "input");
        OooOOO0.OooO0oO(maxVersion, "maxVersion");
        OooOOO0.OooO0oO(getClientTextureId, "getClientTextureId");
        return AndroidBrushFamilyExtensions.decodeMultiple(C24457OooOOo.f82666OooO0oO, input, maxVersion, getClientTextureId);
    }

    public static final void encode(C24457OooOOo brushFamily, OutputStream output, o000oOoO textureBitmapStore) throws IOException {
        OooOOO0.OooO0oO(brushFamily, "brushFamily");
        OooOOO0.OooO0oO(output, "output");
        OooOOO0.OooO0oO(textureBitmapStore, "textureBitmapStore");
        AndroidBrushFamilyExtensions.encode(brushFamily, output, textureBitmapStore);
    }

    public static final void encodeMultiple(List<C24457OooOOo> brushFamilies, OutputStream output, o000oOoO textureBitmapStore) throws IOException {
        OooOOO0.OooO0oO(brushFamilies, "brushFamilies");
        OooOOO0.OooO0oO(output, "output");
        OooOOO0.OooO0oO(textureBitmapStore, "textureBitmapStore");
        AndroidBrushFamilyExtensions.encodeMultiple(brushFamilies, output, textureBitmapStore);
    }

    public static final C24457OooOOo decode(InputStream input, BrushFamilyDecodeCallback getClientTextureId) throws IOException {
        OooOOO0.OooO0oO(input, "input");
        OooOOO0.OooO0oO(getClientTextureId, "getClientTextureId");
        return decode(input, C24490OoooOOO.f82795OooOoO0, getClientTextureId);
    }

    public static final List<C24457OooOOo> decodeMultiple(InputStream input, BrushFamilyDecodeCallback getClientTextureId) {
        OooOOO0.OooO0oO(input, "input");
        OooOOO0.OooO0oO(getClientTextureId, "getClientTextureId");
        return decodeMultiple(input, C24490OoooOOO.f82795OooOoO0, getClientTextureId);
    }
}
