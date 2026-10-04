package com.orion.penkit.models.pencil;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.util.LruCache;
import com.aspose.slides.C22205OooOOo;
import com.huawei.hms.network.embedded.C18115b5;
import com.huawei.hms.network.embedded.C18437z2;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;
import oOO00oo.C34406OooO00o;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u001eB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\f\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ/\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J-\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0003R\u0014\u0010\u0017\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR \u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00120\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, m80612d2 = {"Lcom/orion/penkit/models/pencil/PencilTextureCache;", "", "<init>", "()V", "", "width", "height", "", "seed", "color", "", C18437z2.f56754h, "generateCacheKey", "(IIJILjava/lang/String;)Ljava/lang/String;", "baseColor", "Landroid/graphics/Bitmap;", "createPencilTextureBitmap", "(IIJI)Landroid/graphics/Bitmap;", "Lcom/orion/penkit/models/pencil/PencilTextureCache$TexturePair;", "getOrCreatePencilTexture", "(IIJI)Lcom/orion/penkit/models/pencil/PencilTextureCache$TexturePair;", "LoO00ooO/OooOooO;", "clearCache", "TAG", "Ljava/lang/String;", "MAX_CACHE_SIZE", "I", "Landroid/util/LruCache;", "textureCache", "Landroid/util/LruCache;", "TexturePair", "ni-penkit_release"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class PencilTextureCache {
    private static final int MAX_CACHE_SIZE = 16;
    private static final String TAG = "TextureCache";
    public static final PencilTextureCache INSTANCE = new PencilTextureCache();
    private static final LruCache<String, TexturePair> textureCache = new LruCache<>(16);

    private PencilTextureCache() {
    }

    private final Bitmap createPencilTextureBitmap(int width, int height, long seed, int baseColor) {
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, config);
        OooOOO0.OooO0o(bitmapCreateBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        float f = width;
        float f2 = height;
        RadialGradient radialGradient = new RadialGradient(f / 2.0f, f2 / 2.0f, Math.min(width, height) / 2.0f, Color.argb(255, 255, 255, 255), Color.argb(100, 255, 255, 255), Shader.TileMode.CLAMP);
        Paint paint = new Paint(1);
        paint.setShader(radialGradient);
        canvas.drawRect(0.0f, 0.0f, f, f2, paint);
        Bitmap bitmapGenerateRoundRectTexture = TextureUtils.INSTANCE.generateRoundRectTexture(width, height, seed, baseColor, 12.0f);
        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(width, height, config);
        OooOOO0.OooO0o(bitmapCreateBitmap2, "createBitmap(...)");
        Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
        canvas2.drawBitmap(bitmapCreateBitmap, 0.0f, 0.0f, (Paint) null);
        Paint paint2 = new Paint(1);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.MULTIPLY));
        canvas2.drawBitmap(bitmapGenerateRoundRectTexture, 0.0f, 0.0f, paint2);
        return bitmapCreateBitmap2;
    }

    private final String generateCacheKey(int width, int height, long seed, int color, String type) {
        String hexString = Integer.toHexString(color);
        StringBuilder sb = new StringBuilder();
        sb.append(type);
        sb.append(C18115b5.CONNECTOR);
        sb.append(width);
        sb.append("x");
        sb.append(height);
        C22205OooOOo.OooO0OO(seed, C18115b5.CONNECTOR, C18115b5.CONNECTOR, sb);
        sb.append(hexString);
        return sb.toString();
    }

    public static /* synthetic */ String generateCacheKey$default(PencilTextureCache pencilTextureCache, int i, int i2, long j, int i3, String str, int i4, Object obj) {
        if ((i4 & 16) != 0) {
            str = "default";
        }
        return pencilTextureCache.generateCacheKey(i, i2, j, i3, str);
    }

    public final synchronized void clearCache() {
        textureCache.evictAll();
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public final synchronized TexturePair getOrCreatePencilTexture(int width, int height, long seed, int color) {
        Bitmap bitmapCreateBitmap;
        try {
            String strGenerateCacheKey = generateCacheKey(width, height, seed, color, "default");
            TexturePair texturePair = textureCache.get(strGenerateCacheKey);
            if (texturePair != null) {
                return texturePair;
            }
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0(TAG);
            c20358OooO00o.OooO00o("Creating new texture: %s", strGenerateCacheKey);
            try {
                bitmapCreateBitmap = createPencilTextureBitmap(width, height, seed, color);
            } catch (OutOfMemoryError e) {
                C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o2.OooOOO0(TAG);
                c20358OooO00o2.OooO0Oo(e, "OOM creating software bitmap, using fallback: %s", strGenerateCacheKey);
                bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                bitmapCreateBitmap.eraseColor(color);
            } catch (Throwable th) {
                C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o3.OooOOO0(TAG);
                c20358OooO00o3.OooO0Oo(th, "Failed to create software bitmap, using fallback: %s", strGenerateCacheKey);
                bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                bitmapCreateBitmap.eraseColor(color);
            }
            Bitmap bitmap = null;
            try {
                Bitmap bitmapCopy = bitmapCreateBitmap.copy(Bitmap.Config.HARDWARE, false);
                if (bitmapCopy != null) {
                    bitmapCopy.prepareToDraw();
                }
                bitmap = bitmapCopy;
            } catch (OutOfMemoryError unused) {
                C34406OooO00o.C20358OooO00o c20358OooO00o4 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o4.OooOOO0(TAG);
                c20358OooO00o4.OooOO0O("OOM copying to HARDWARE for: %s", strGenerateCacheKey);
            } catch (Throwable th2) {
                C34406OooO00o.C20358OooO00o c20358OooO00o5 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o5.OooOOO0(TAG);
                c20358OooO00o5.OooOO0o(th2, "Failed to create HARDWARE bitmap for: %s", strGenerateCacheKey);
            }
            TexturePair texturePair2 = new TexturePair(bitmapCreateBitmap, bitmap);
            TexturePair texturePairPut = textureCache.put(strGenerateCacheKey, texturePair2);
            if (texturePairPut != null && texturePairPut != texturePair2) {
                C34406OooO00o.C20358OooO00o c20358OooO00o6 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o6.OooOOO0(TAG);
                c20358OooO00o6.OooOO0("Replaced existing texture for key: %s", strGenerateCacheKey);
            }
            C34406OooO00o.C20358OooO00o c20358OooO00o7 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o7.OooOOO0(TAG);
            c20358OooO00o7.OooO00o("Texture cached: %s, hardware=%s", strGenerateCacheKey, Boolean.valueOf(bitmap != null));
            return texturePair2;
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @Metadata(m80611d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m80612d2 = {"Lcom/orion/penkit/models/pencil/PencilTextureCache$TexturePair;", "", "softwareBitmap", "Landroid/graphics/Bitmap;", "hardwareBitmap", "<init>", "(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;)V", "getSoftwareBitmap", "()Landroid/graphics/Bitmap;", "getHardwareBitmap", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ni-penkit_release"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final /* data */ class TexturePair {
        private final Bitmap hardwareBitmap;
        private final Bitmap softwareBitmap;

        public TexturePair(Bitmap softwareBitmap, Bitmap bitmap) {
            OooOOO0.OooO0oO(softwareBitmap, "softwareBitmap");
            this.softwareBitmap = softwareBitmap;
            this.hardwareBitmap = bitmap;
        }

        public static /* synthetic */ TexturePair copy$default(TexturePair texturePair, Bitmap bitmap, Bitmap bitmap2, int i, Object obj) {
            if ((i & 1) != 0) {
                bitmap = texturePair.softwareBitmap;
            }
            if ((i & 2) != 0) {
                bitmap2 = texturePair.hardwareBitmap;
            }
            return texturePair.copy(bitmap, bitmap2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Bitmap getSoftwareBitmap() {
            return this.softwareBitmap;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Bitmap getHardwareBitmap() {
            return this.hardwareBitmap;
        }

        public final TexturePair copy(Bitmap softwareBitmap, Bitmap hardwareBitmap) {
            OooOOO0.OooO0oO(softwareBitmap, "softwareBitmap");
            return new TexturePair(softwareBitmap, hardwareBitmap);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TexturePair)) {
                return false;
            }
            TexturePair texturePair = (TexturePair) other;
            return OooOOO0.OooO0O0(this.softwareBitmap, texturePair.softwareBitmap) && OooOOO0.OooO0O0(this.hardwareBitmap, texturePair.hardwareBitmap);
        }

        public final Bitmap getHardwareBitmap() {
            return this.hardwareBitmap;
        }

        public final Bitmap getSoftwareBitmap() {
            return this.softwareBitmap;
        }

        public int hashCode() {
            int iHashCode = this.softwareBitmap.hashCode() * 31;
            Bitmap bitmap = this.hardwareBitmap;
            return iHashCode + (bitmap == null ? 0 : bitmap.hashCode());
        }

        public String toString() {
            return "TexturePair(softwareBitmap=" + this.softwareBitmap + ", hardwareBitmap=" + this.hardwareBitmap + ")";
        }

        public /* synthetic */ TexturePair(Bitmap bitmap, Bitmap bitmap2, int i, C24018OooO0oo c24018OooO0oo) {
            this(bitmap, (i & 2) != 0 ? null : bitmap2);
        }
    }
}
