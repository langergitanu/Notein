package androidx.core.graphics;

import android.graphics.Canvas;
import android.graphics.Picture;
import kotlin.Metadata;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m80611d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a8\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\b¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m80612d2 = {"Landroid/graphics/Picture;", "", "width", "height", "Lkotlin/Function1;", "Landroid/graphics/Canvas;", "LoO00ooO/OooOooO;", "block", "record", "(Landroid/graphics/Picture;IILoO0O000o/OooOO0o;)Landroid/graphics/Picture;", "core-ktx_release"}, m80613k = 2, m80614mv = {1, 8, 0}, m80616xi = 48)
public final class PictureKt {
    public static final Picture record(Picture picture, int i, int i2, InterfaceC32507OooOO0o<? super Canvas, C32460OooOooO> interfaceC32507OooOO0o) {
        try {
            interfaceC32507OooOO0o.invoke(picture.beginRecording(i, i2));
            return picture;
        } finally {
            picture.endRecording();
        }
    }
}
