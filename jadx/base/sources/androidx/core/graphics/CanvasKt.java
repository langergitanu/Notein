package androidx.core.graphics;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import kotlin.Metadata;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m80611d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a(\u0010\u0004\u001a\u00020\u0002*\u00020\u00002\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001H\u0086\b¢\u0006\u0004\b\u0004\u0010\u0005\u001a<\u0010\t\u001a\u00020\u0002*\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001H\u0086\b¢\u0006\u0004\b\t\u0010\n\u001aF\u0010\u000e\u001a\u00020\u0002*\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u00062\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001H\u0086\b¢\u0006\u0004\b\u000e\u0010\u000f\u001aP\u0010\u0010\u001a\u00020\u0002*\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u00062\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001H\u0086\b¢\u0006\u0004\b\u0010\u0010\u0011\u001a<\u0010\u0012\u001a\u00020\u0002*\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001H\u0086\b¢\u0006\u0004\b\u0012\u0010\n\u001a2\u0010\u0015\u001a\u00020\u0002*\u00020\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u00132\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001H\u0086\b¢\u0006\u0004\b\u0015\u0010\u0016\u001a0\u0010\u0019\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001H\u0086\b¢\u0006\u0004\b\u0019\u0010\u001a\u001a0\u0010\u0019\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u001b2\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001H\u0086\b¢\u0006\u0004\b\u0019\u0010\u001c\u001aH\u0010\u0019\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u001d2\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001H\u0086\b¢\u0006\u0004\b\u0019\u0010\"\u001aH\u0010\u0019\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u00062\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001H\u0086\b¢\u0006\u0004\b\u0019\u0010\u0011\u001a0\u0010\u0019\u001a\u00020\u0002*\u00020\u00002\u0006\u0010$\u001a\u00020#2\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001H\u0086\b¢\u0006\u0004\b\u0019\u0010%¨\u0006&"}, m80612d2 = {"Landroid/graphics/Canvas;", "Lkotlin/Function1;", "LoO00ooO/OooOooO;", "block", "withSave", "(Landroid/graphics/Canvas;LoO0O000o/OooOO0o;)V", "", "x", "y", "withTranslation", "(Landroid/graphics/Canvas;FFLoO0O000o/OooOO0o;)V", "degrees", "pivotX", "pivotY", "withRotation", "(Landroid/graphics/Canvas;FFFLoO0O000o/OooOO0o;)V", "withScale", "(Landroid/graphics/Canvas;FFFFLoO0O000o/OooOO0o;)V", "withSkew", "Landroid/graphics/Matrix;", "matrix", "withMatrix", "(Landroid/graphics/Canvas;Landroid/graphics/Matrix;LoO0O000o/OooOO0o;)V", "Landroid/graphics/Rect;", "clipRect", "withClip", "(Landroid/graphics/Canvas;Landroid/graphics/Rect;LoO0O000o/OooOO0o;)V", "Landroid/graphics/RectF;", "(Landroid/graphics/Canvas;Landroid/graphics/RectF;LoO0O000o/OooOO0o;)V", "", "left", "top", "right", "bottom", "(Landroid/graphics/Canvas;IIIILoO0O000o/OooOO0o;)V", "Landroid/graphics/Path;", "clipPath", "(Landroid/graphics/Canvas;Landroid/graphics/Path;LoO0O000o/OooOO0o;)V", "core-ktx_release"}, m80613k = 2, m80614mv = {1, 8, 0}, m80616xi = 48)
public final class CanvasKt {
    public static final void withClip(Canvas canvas, Rect rect, InterfaceC32507OooOO0o<? super Canvas, C32460OooOooO> interfaceC32507OooOO0o) {
        int iSave = canvas.save();
        canvas.clipRect(rect);
        try {
            interfaceC32507OooOO0o.invoke(canvas);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    public static final void withMatrix(Canvas canvas, Matrix matrix, InterfaceC32507OooOO0o<? super Canvas, C32460OooOooO> interfaceC32507OooOO0o) {
        int iSave = canvas.save();
        canvas.concat(matrix);
        try {
            interfaceC32507OooOO0o.invoke(canvas);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    public static /* synthetic */ void withMatrix$default(Canvas canvas, Matrix matrix, InterfaceC32507OooOO0o interfaceC32507OooOO0o, int i, Object obj) {
        if ((i & 1) != 0) {
            matrix = new Matrix();
        }
        int iSave = canvas.save();
        canvas.concat(matrix);
        try {
            interfaceC32507OooOO0o.invoke(canvas);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    public static final void withRotation(Canvas canvas, float f, float f2, float f3, InterfaceC32507OooOO0o<? super Canvas, C32460OooOooO> interfaceC32507OooOO0o) {
        int iSave = canvas.save();
        canvas.rotate(f, f2, f3);
        try {
            interfaceC32507OooOO0o.invoke(canvas);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    public static /* synthetic */ void withRotation$default(Canvas canvas, float f, float f2, float f3, InterfaceC32507OooOO0o interfaceC32507OooOO0o, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i & 4) != 0) {
            f3 = 0.0f;
        }
        int iSave = canvas.save();
        canvas.rotate(f, f2, f3);
        try {
            interfaceC32507OooOO0o.invoke(canvas);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    public static final void withSave(Canvas canvas, InterfaceC32507OooOO0o<? super Canvas, C32460OooOooO> interfaceC32507OooOO0o) {
        int iSave = canvas.save();
        try {
            interfaceC32507OooOO0o.invoke(canvas);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    public static final void withScale(Canvas canvas, float f, float f2, float f3, float f4, InterfaceC32507OooOO0o<? super Canvas, C32460OooOooO> interfaceC32507OooOO0o) {
        int iSave = canvas.save();
        canvas.scale(f, f2, f3, f4);
        try {
            interfaceC32507OooOO0o.invoke(canvas);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    public static /* synthetic */ void withScale$default(Canvas canvas, float f, float f2, float f3, float f4, InterfaceC32507OooOO0o interfaceC32507OooOO0o, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        if ((i & 2) != 0) {
            f2 = 1.0f;
        }
        if ((i & 4) != 0) {
            f3 = 0.0f;
        }
        if ((i & 8) != 0) {
            f4 = 0.0f;
        }
        int iSave = canvas.save();
        canvas.scale(f, f2, f3, f4);
        try {
            interfaceC32507OooOO0o.invoke(canvas);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    public static final void withSkew(Canvas canvas, float f, float f2, InterfaceC32507OooOO0o<? super Canvas, C32460OooOooO> interfaceC32507OooOO0o) {
        int iSave = canvas.save();
        canvas.skew(f, f2);
        try {
            interfaceC32507OooOO0o.invoke(canvas);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    public static /* synthetic */ void withSkew$default(Canvas canvas, float f, float f2, InterfaceC32507OooOO0o interfaceC32507OooOO0o, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        int iSave = canvas.save();
        canvas.skew(f, f2);
        try {
            interfaceC32507OooOO0o.invoke(canvas);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    public static final void withTranslation(Canvas canvas, float f, float f2, InterfaceC32507OooOO0o<? super Canvas, C32460OooOooO> interfaceC32507OooOO0o) {
        int iSave = canvas.save();
        canvas.translate(f, f2);
        try {
            interfaceC32507OooOO0o.invoke(canvas);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    public static /* synthetic */ void withTranslation$default(Canvas canvas, float f, float f2, InterfaceC32507OooOO0o interfaceC32507OooOO0o, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        int iSave = canvas.save();
        canvas.translate(f, f2);
        try {
            interfaceC32507OooOO0o.invoke(canvas);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    public static final void withClip(Canvas canvas, RectF rectF, InterfaceC32507OooOO0o<? super Canvas, C32460OooOooO> interfaceC32507OooOO0o) {
        int iSave = canvas.save();
        canvas.clipRect(rectF);
        try {
            interfaceC32507OooOO0o.invoke(canvas);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    public static final void withClip(Canvas canvas, int i, int i2, int i3, int i4, InterfaceC32507OooOO0o<? super Canvas, C32460OooOooO> interfaceC32507OooOO0o) {
        int iSave = canvas.save();
        canvas.clipRect(i, i2, i3, i4);
        try {
            interfaceC32507OooOO0o.invoke(canvas);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    public static final void withClip(Canvas canvas, float f, float f2, float f3, float f4, InterfaceC32507OooOO0o<? super Canvas, C32460OooOooO> interfaceC32507OooOO0o) {
        int iSave = canvas.save();
        canvas.clipRect(f, f2, f3, f4);
        try {
            interfaceC32507OooOO0o.invoke(canvas);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    public static final void withClip(Canvas canvas, Path path, InterfaceC32507OooOO0o<? super Canvas, C32460OooOooO> interfaceC32507OooOO0o) {
        int iSave = canvas.save();
        canvas.clipPath(path);
        try {
            interfaceC32507OooOO0o.invoke(canvas);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }
}
