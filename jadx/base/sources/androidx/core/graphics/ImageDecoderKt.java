package androidx.core.graphics;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.graphics.drawable.Drawable;
import kotlin.Metadata;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32510OooOOo0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m80611d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a6\u0010\u0007\u001a\u00020\u0006*\u00020\u00002 \b\u0004\u0010\u0005\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0001H\u0087\b¢\u0006\u0004\b\u0007\u0010\b\u001a6\u0010\n\u001a\u00020\t*\u00020\u00002 \b\u0004\u0010\u0005\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0001H\u0087\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m80612d2 = {"Landroid/graphics/ImageDecoder$Source;", "Lkotlin/Function3;", "Landroid/graphics/ImageDecoder;", "Landroid/graphics/ImageDecoder$ImageInfo;", "LoO00ooO/OooOooO;", "action", "Landroid/graphics/Bitmap;", "decodeBitmap", "(Landroid/graphics/ImageDecoder$Source;LoO0O000o/OooOOo0;)Landroid/graphics/Bitmap;", "Landroid/graphics/drawable/Drawable;", "decodeDrawable", "(Landroid/graphics/ImageDecoder$Source;LoO0O000o/OooOOo0;)Landroid/graphics/drawable/Drawable;", "core-ktx_release"}, m80613k = 2, m80614mv = {1, 8, 0}, m80616xi = 48)
public final class ImageDecoderKt {
    public static final Bitmap decodeBitmap(ImageDecoder.Source source, final InterfaceC32510OooOOo0<? super ImageDecoder, ? super ImageDecoder.ImageInfo, ? super ImageDecoder.Source, C32460OooOooO> interfaceC32510OooOOo0) {
        return ImageDecoder.decodeBitmap(source, new ImageDecoder$OnHeaderDecodedListener() { // from class: androidx.core.graphics.ImageDecoderKt.decodeBitmap.1
            public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source2) {
                interfaceC32510OooOOo0.invoke(imageDecoder, imageInfo, source2);
            }
        });
    }

    public static final Drawable decodeDrawable(ImageDecoder.Source source, final InterfaceC32510OooOOo0<? super ImageDecoder, ? super ImageDecoder.ImageInfo, ? super ImageDecoder.Source, C32460OooOooO> interfaceC32510OooOOo0) {
        return ImageDecoder.decodeDrawable(source, new ImageDecoder$OnHeaderDecodedListener() { // from class: androidx.core.graphics.ImageDecoderKt.decodeDrawable.1
            public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source2) {
                interfaceC32510OooOOo0.invoke(imageDecoder, imageInfo, source2);
            }
        });
    }
}
