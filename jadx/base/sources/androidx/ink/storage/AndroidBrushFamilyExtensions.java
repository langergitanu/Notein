package androidx.ink.storage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.ByteArrayOutputStream;
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
@Metadata(m80611d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a)\u0010\t\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00000\b2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\t\u0010\n\u001a)\u0010\u0012\u001a\u00020\u0000*\u00020\u000b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013\u001a1\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00000\b*\u00020\u000b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001a)\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00000\b*\u00020\u000b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0014\u0010\u0016\u001a!\u0010\u0012\u001a\u00020\u0000*\u00020\u000b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0017\u001a\u0013\u0010\u0019\u001a\u00020\u0018*\u00020\u0003H\u0002¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0013\u0010\u001d\u001a\u00020\u001c*\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0013\u0010 \u001a\u00020\u001f*\u00020\u0010H\u0002¢\u0006\u0004\b \u0010!¨\u0006\""}, m80612d2 = {"Lo000OO00/OooOOo;", "Ljava/io/OutputStream;", "output", "Lo000OO00/o000oOoO;", "textureBitmapStore", "LoO00ooO/OooOooO;", "encode", "(Lo000OO00/OooOOo;Ljava/io/OutputStream;Lo000OO00/o000oOoO;)V", "", "encodeMultiple", "(Ljava/util/List;Ljava/io/OutputStream;Lo000OO00/o000oOoO;)V", "Lo000OO00/OooOOo$OooO00o;", "Ljava/io/InputStream;", "input", "Lo000OO00/OoooOOO;", "maxVersion", "Landroidx/ink/storage/BrushFamilyDecodeCallback;", "getClientTextureId", "decode", "(Lo000OO00/OooOOo$OooO00o;Ljava/io/InputStream;Lo000OO00/OoooOOO;Landroidx/ink/storage/BrushFamilyDecodeCallback;)Lo000OO00/OooOOo;", "decodeMultiple", "(Lo000OO00/OooOOo$OooO00o;Ljava/io/InputStream;Lo000OO00/OoooOOO;Landroidx/ink/storage/BrushFamilyDecodeCallback;)Ljava/util/List;", "(Lo000OO00/OooOOo$OooO00o;Ljava/io/InputStream;Landroidx/ink/storage/BrushFamilyDecodeCallback;)Ljava/util/List;", "(Lo000OO00/OooOOo$OooO00o;Ljava/io/InputStream;Landroidx/ink/storage/BrushFamilyDecodeCallback;)Lo000OO00/OooOOo;", "Landroidx/ink/storage/TexturePngBytesLookup;", "toTexturePngBytesLookup", "(Lo000OO00/o000oOoO;)Landroidx/ink/storage/TexturePngBytesLookup;", "Landroid/graphics/Bitmap;", "", "toPngBytes", "(Landroid/graphics/Bitmap;)[B", "Landroidx/ink/storage/OnDecodeTexturePngBytes;", "toOnDecodeTexturePngBytes", "(Landroidx/ink/storage/BrushFamilyDecodeCallback;)Landroidx/ink/storage/OnDecodeTexturePngBytes;", "ink-storage"}, m80613k = 2, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class AndroidBrushFamilyExtensions {
    public static final C24457OooOOo decode(C24457OooOOo.OooO00o oooO00o, InputStream input, C24490OoooOOO maxVersion, BrushFamilyDecodeCallback getClientTextureId) {
        OooOOO0.OooO0oO(oooO00o, "<this>");
        OooOOO0.OooO0oO(input, "input");
        OooOOO0.OooO0oO(maxVersion, "maxVersion");
        OooOOO0.OooO0oO(getClientTextureId, "getClientTextureId");
        return BrushFamilyExtensions.decode(C24457OooOOo.f82666OooO0oO, input, maxVersion, toOnDecodeTexturePngBytes(getClientTextureId));
    }

    public static final List<C24457OooOOo> decodeMultiple(C24457OooOOo.OooO00o oooO00o, InputStream input, C24490OoooOOO maxVersion, BrushFamilyDecodeCallback getClientTextureId) {
        OooOOO0.OooO0oO(oooO00o, "<this>");
        OooOOO0.OooO0oO(input, "input");
        OooOOO0.OooO0oO(maxVersion, "maxVersion");
        OooOOO0.OooO0oO(getClientTextureId, "getClientTextureId");
        return BrushFamilyExtensions.decodeMultiple(oooO00o, input, maxVersion, toOnDecodeTexturePngBytes(getClientTextureId));
    }

    public static final void encode(C24457OooOOo c24457OooOOo, OutputStream output, o000oOoO textureBitmapStore) {
        OooOOO0.OooO0oO(c24457OooOOo, "<this>");
        OooOOO0.OooO0oO(output, "output");
        OooOOO0.OooO0oO(textureBitmapStore, "textureBitmapStore");
        BrushFamilyExtensions.encode(c24457OooOOo, output, toTexturePngBytesLookup(textureBitmapStore));
    }

    public static final void encodeMultiple(List<C24457OooOOo> list, OutputStream output, o000oOoO textureBitmapStore) {
        OooOOO0.OooO0oO(list, "<this>");
        OooOOO0.OooO0oO(output, "output");
        OooOOO0.OooO0oO(textureBitmapStore, "textureBitmapStore");
        BrushFamilyExtensions.encodeMultiple(list, output, toTexturePngBytesLookup(textureBitmapStore));
    }

    private static final OnDecodeTexturePngBytes toOnDecodeTexturePngBytes(final BrushFamilyDecodeCallback brushFamilyDecodeCallback) {
        return new OnDecodeTexturePngBytes() { // from class: androidx.ink.storage.OooO00o
            @Override // androidx.ink.storage.OnDecodeTexturePngBytes
            public final String onDecodeTexture(String str, byte[] bArr) {
                return AndroidBrushFamilyExtensions.toOnDecodeTexturePngBytes$lambda$0(brushFamilyDecodeCallback, str, bArr);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String toOnDecodeTexturePngBytes$lambda$0(BrushFamilyDecodeCallback brushFamilyDecodeCallback, String textureId, byte[] bArr) {
        OooOOO0.OooO0oO(textureId, "textureId");
        return brushFamilyDecodeCallback.onDecodeTexture(textureId, bArr != null ? BitmapFactory.decodeByteArray(bArr, 0, bArr.length) : null);
    }

    private static final byte[] toPngBytes(Bitmap bitmap) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            OooOOO0.OooO0o(byteArray, "use(...)");
            return byteArray;
        } finally {
        }
    }

    private static final TexturePngBytesLookup toTexturePngBytesLookup(o000oOoO o000oooo2) {
        return new OooO0O0(o000oooo2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final byte[] toTexturePngBytesLookup$lambda$0(o000oOoO o000oooo2, String textureId) {
        OooOOO0.OooO0oO(textureId, "textureId");
        Bitmap bitmap = o000oooo2.get(textureId);
        if (bitmap != null) {
            return toPngBytes(bitmap);
        }
        return null;
    }

    public static final C24457OooOOo decode(C24457OooOOo.OooO00o oooO00o, InputStream input, BrushFamilyDecodeCallback getClientTextureId) {
        OooOOO0.OooO0oO(oooO00o, "<this>");
        OooOOO0.OooO0oO(input, "input");
        OooOOO0.OooO0oO(getClientTextureId, "getClientTextureId");
        return decode(oooO00o, input, C24490OoooOOO.f82795OooOoO0, getClientTextureId);
    }

    public static final List<C24457OooOOo> decodeMultiple(C24457OooOOo.OooO00o oooO00o, InputStream input, BrushFamilyDecodeCallback getClientTextureId) {
        OooOOO0.OooO0oO(oooO00o, "<this>");
        OooOOO0.OooO0oO(input, "input");
        OooOOO0.OooO0oO(getClientTextureId, "getClientTextureId");
        return decodeMultiple(oooO00o, input, C24490OoooOOO.f82795OooOoO0, getClientTextureId);
    }
}
