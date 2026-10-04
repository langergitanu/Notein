package androidx.ink.authoring.internal;

import Oooo0.C20856OooooOo;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.view.View;
import android.view.ViewGroup;
import androidx.ink.authoring.InProgressShapesView;
import androidx.ink.geometry.MutableBox;
import o000O0oO.OooO0O0;
import o000O0oo.C24418OooO0OO;
import o000O0oo.C24442Oooo00o;
import o000O0oo.RunnableC24436OooOoOO;
import o000O0oo.ViewOnAttachStateChangeListenerC24419OooO0Oo;
import oO00ooOO.C32465OooO0O0;

/* JADX INFO: loaded from: classes.dex */
public final class OooO00o<ShapeSpecT, InProgressShapeT extends o000O0oO.OooO0O0<? super ShapeSpecT, ? extends CompletedShapeT>, CompletedShapeT> extends OooOOO<ShapeSpecT, InProgressShapeT, CompletedShapeT> {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final InProgressShapesView f65177OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o000O0oO.OooOO0 f65178OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public Canvas f65179OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Paint f65180OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final CanvasInProgressStrokesRenderHelperV21$innerView$1 f65181OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final C24418OooO0OO f65182OooO0oo;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.view.View, androidx.ink.authoring.internal.CanvasInProgressStrokesRenderHelperV21$innerView$1] */
    public OooO00o(InProgressShapesView mainView, o000O0oO.OooOO0 renderer) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(mainView, "mainView");
        kotlin.jvm.internal.OooOOO0.OooO0oO(renderer, "renderer");
        this.f65177OooO0OO = mainView;
        this.f65178OooO0Oo = renderer;
        Paint paint = new Paint();
        paint.setColor(0);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.f65180OooO0o0 = paint;
        final Context context = mainView.getContext();
        ?? r0 = new View(this, context) { // from class: androidx.ink.authoring.internal.CanvasInProgressStrokesRenderHelperV21$innerView$1

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ OooO00o<Object, o000O0oO.OooO0O0<Object, Object>, Object> f65175OooOo0o;

            {
                this.f65175OooOo0o = this;
            }

            @Override // android.view.View
            public final void onDraw(Canvas canvas) {
                kotlin.jvm.internal.OooOOO0.OooO0oO(canvas, "canvas");
                OooO00o<Object, o000O0oO.OooO0O0<Object, Object>, Object> oooO00o = this.f65175OooOo0o;
                oooO00o.getClass();
                C24442Oooo00o.OooO00o();
                int saveCount = canvas.getSaveCount();
                oooO00o.f65179OooO0o = canvas;
                try {
                    ((OooOO0) oooO00o.OooO0o0()).OooOO0O();
                    oooO00o.f65179OooO0o = null;
                    Path path = oooO00o.f65339OooO0O0;
                    if (path != null) {
                        canvas.drawPath(path, oooO00o.f65180OooO0o0);
                    }
                    ((OooOO0) oooO00o.OooO0o0()).OooOO0o();
                    ((OooOO0) oooO00o.OooO0o0()).OooOOo(oooO00o.f65182OooO0oo);
                    ((OooOO0) oooO00o.OooO0o0()).OooO0oo();
                    if (canvas.getSaveCount() != saveCount) {
                        throw new IllegalStateException(C20856OooooOo.OooO0O0("Unbalanced saves and restores. Expected save count of ", saveCount, ", got ", ".", canvas.getSaveCount()).toString());
                    }
                } catch (Throwable th) {
                    oooO00o.f65179OooO0o = null;
                    throw th;
                }
            }
        };
        this.f65181OooO0oO = r0;
        this.f65182OooO0oo = new C24418OooO0OO();
        ViewOnAttachStateChangeListenerC24419OooO0Oo viewOnAttachStateChangeListenerC24419OooO0Oo = new ViewOnAttachStateChangeListenerC24419OooO0Oo(this);
        if (mainView.isAttachedToWindow()) {
            C24442Oooo00o.OooO00o();
            mainView.addView((View) r0, new ViewGroup.LayoutParams(-1, -1));
        }
        mainView.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC24419OooO0Oo);
    }

    @Override // androidx.ink.authoring.internal.OooOOO
    public final void OooO(MutableBox modifiedRegionInMainView) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(modifiedRegionInMainView, "modifiedRegionInMainView");
    }

    @Override // androidx.ink.authoring.internal.OooOOO
    public final void OooO00o() {
    }

    @Override // androidx.ink.authoring.internal.OooOOO
    public final void OooO0O0() {
        C24442Oooo00o.OooO00o();
    }

    @Override // androidx.ink.authoring.internal.OooOOO
    public final void OooO0OO(InProgressShapeT inProgressShape, Matrix strokeToMainViewTransform) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(inProgressShape, "inProgressShape");
        kotlin.jvm.internal.OooOOO0.OooO0oO(strokeToMainViewTransform, "strokeToMainViewTransform");
        C24442Oooo00o.OooO00o();
        Canvas canvas = this.f65179OooO0o;
        if (canvas == null) {
            throw new IllegalStateException("Can only render during Callback.onDraw.");
        }
        int iSave = canvas.save();
        canvas.concat(strokeToMainViewTransform);
        try {
            this.f65178OooO0Oo.OooO00o(canvas, inProgressShape, strokeToMainViewTransform);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    @Override // androidx.ink.authoring.internal.OooOOO
    public final void OooO0Oo(RunnableC24436OooOoOO runnableC24436OooOoOO) {
        this.f65177OooO0OO.post(runnableC24436OooOoOO);
    }

    @Override // androidx.ink.authoring.internal.OooOOO
    public final boolean OooO0o() {
        return false;
    }

    @Override // androidx.ink.authoring.internal.OooOOO
    public final boolean OooO0oO() {
        return false;
    }

    @Override // androidx.ink.authoring.internal.OooOOO
    public final boolean OooO0oo() {
        return false;
    }

    @Override // androidx.ink.authoring.internal.OooOOO
    public final void OooOO0() {
        C24442Oooo00o.OooO00o();
        invalidate();
    }

    @Override // androidx.ink.authoring.internal.OooOOO
    public final void OooOO0O(C32465OooO0O0 cohort) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(cohort, "cohort");
        ((OooOO0) OooO0o0()).OooOOO0(cohort);
        invalidate();
        ((OooOO0) OooO0o0()).OooOOO();
    }

    @Override // androidx.ink.authoring.internal.OooOOO
    public final void OooOO0o() {
    }
}
