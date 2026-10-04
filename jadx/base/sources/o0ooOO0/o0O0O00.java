package o0ooOO0;

import OooooOO.C21325OooOooo;
import OooooOO.C21343OoooOOo;
import OooooOO.InterfaceC21370ooOO;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import androidx.compose.p002ui.platform.AndroidComposeView;
import o00oO0O.AbstractC25521OoooO;

/* JADX INFO: loaded from: classes.dex */
public final class o0O0O00 implements InterfaceC31563Ooooooo {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static boolean f112910OooO0oO = true;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final RenderNode f112911OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f112912OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f112913OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f112914OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f112915OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f112916OooO0o0;

    public o0O0O00(AndroidComposeView ownerView) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(ownerView, "ownerView");
        RenderNode renderNodeCreate = RenderNode.create("Compose", ownerView);
        kotlin.jvm.internal.OooOOO0.OooO0o(renderNodeCreate, "create(\"Compose\", ownerView)");
        this.f112911OooO00o = renderNodeCreate;
        if (f112910OooO0oO) {
            renderNodeCreate.setScaleX(renderNodeCreate.getScaleX());
            renderNodeCreate.setScaleY(renderNodeCreate.getScaleY());
            renderNodeCreate.setTranslationX(renderNodeCreate.getTranslationX());
            renderNodeCreate.setTranslationY(renderNodeCreate.getTranslationY());
            renderNodeCreate.setElevation(renderNodeCreate.getElevation());
            renderNodeCreate.setRotation(renderNodeCreate.getRotation());
            renderNodeCreate.setRotationX(renderNodeCreate.getRotationX());
            renderNodeCreate.setRotationY(renderNodeCreate.getRotationY());
            renderNodeCreate.setCameraDistance(renderNodeCreate.getCameraDistance());
            renderNodeCreate.setPivotX(renderNodeCreate.getPivotX());
            renderNodeCreate.setPivotY(renderNodeCreate.getPivotY());
            renderNodeCreate.setClipToOutline(renderNodeCreate.getClipToOutline());
            renderNodeCreate.setClipToBounds(false);
            renderNodeCreate.setAlpha(renderNodeCreate.getAlpha());
            renderNodeCreate.isValid();
            renderNodeCreate.setLeftTopRightBottom(0, 0, 0, 0);
            renderNodeCreate.offsetLeftAndRight(0);
            renderNodeCreate.offsetTopAndBottom(0);
            if (Build.VERSION.SDK_INT >= 28) {
                C31572o0000OoO c31572o0000OoO = C31572o0000OoO.f112827OooO00o;
                c31572o0000OoO.OooO0OO(renderNodeCreate, c31572o0000OoO.OooO00o(renderNodeCreate));
                c31572o0000OoO.OooO0Oo(renderNodeCreate, c31572o0000OoO.OooO0O0(renderNodeCreate));
            }
            C31570o0000Oo.f112812OooO00o.OooO00o(renderNodeCreate);
            renderNodeCreate.setLayerType(0);
            renderNodeCreate.setHasOverlappingRendering(renderNodeCreate.hasOverlappingRendering());
            f112910OooO0oO = false;
        }
    }

    @Override // o0ooOO0.InterfaceC31563Ooooooo
    public final void OooO() {
        this.f112911OooO00o.setRotationY(0.0f);
    }

    @Override // o0ooOO0.InterfaceC31563Ooooooo
    public final void OooO00o(Canvas canvas) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(canvas, "canvas");
        ((DisplayListCanvas) canvas).drawRenderNode(this.f112911OooO00o);
    }

    @Override // o0ooOO0.InterfaceC31563Ooooooo
    public final void OooO0O0(boolean z) {
        this.f112915OooO0o = z;
        this.f112911OooO00o.setClipToBounds(z);
    }

    @Override // o0ooOO0.InterfaceC31563Ooooooo
    public final void OooO0OO(float f) {
        this.f112911OooO00o.setElevation(f);
    }

    @Override // o0ooOO0.InterfaceC31563Ooooooo
    public final void OooO0Oo(int i) {
        this.f112913OooO0OO += i;
        this.f112916OooO0o0 += i;
        this.f112911OooO00o.offsetTopAndBottom(i);
    }

    @Override // o0ooOO0.InterfaceC31563Ooooooo
    public final boolean OooO0o() {
        return this.f112911OooO00o.isValid();
    }

    @Override // o0ooOO0.InterfaceC31563Ooooooo
    public final void OooO0o0(C21343OoooOOo canvasHolder, InterfaceC21370ooOO interfaceC21370ooOO, AbstractC25521OoooO drawBlock) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(canvasHolder, "canvasHolder");
        kotlin.jvm.internal.OooOOO0.OooO0oO(drawBlock, "drawBlock");
        Canvas canvasStart = this.f112911OooO00o.start(getWidth(), getHeight());
        kotlin.jvm.internal.OooOOO0.OooO0o(canvasStart, "renderNode.start(width, height)");
        C21325OooOooo c21325OooOooo = canvasHolder.f61756OooO00o;
        Canvas canvas = c21325OooOooo.f61733OooO00o;
        c21325OooOooo.f61733OooO00o = canvasStart;
        if (interfaceC21370ooOO != null) {
            c21325OooOooo.OooOOo0();
            c21325OooOooo.OooOOOo(interfaceC21370ooOO);
        }
        drawBlock.invoke(c21325OooOooo);
        if (interfaceC21370ooOO != null) {
            c21325OooOooo.OooOO0o();
        }
        kotlin.jvm.internal.OooOOO0.OooO0oO(canvas, "<set-?>");
        c21325OooOooo.f61733OooO00o = canvas;
        this.f112911OooO00o.end(canvasStart);
    }

    @Override // o0ooOO0.InterfaceC31563Ooooooo
    public final boolean OooO0oO() {
        return this.f112911OooO00o.setHasOverlappingRendering(true);
    }

    @Override // o0ooOO0.InterfaceC31563Ooooooo
    public final void OooO0oo() {
        this.f112911OooO00o.setRotationX(0.0f);
    }

    @Override // o0ooOO0.InterfaceC31563Ooooooo
    public final void OooOO0() {
        this.f112911OooO00o.setLayerType(0);
        this.f112911OooO00o.setHasOverlappingRendering(true);
    }

    @Override // o0ooOO0.InterfaceC31563Ooooooo
    public final void OooOO0O() {
        this.f112911OooO00o.setRotation(0.0f);
    }

    @Override // o0ooOO0.InterfaceC31563Ooooooo
    public final void OooOO0o(float f) {
        this.f112911OooO00o.setCameraDistance(-f);
    }

    @Override // o0ooOO0.InterfaceC31563Ooooooo
    public final void OooOOO(float f) {
        this.f112911OooO00o.setAlpha(f);
    }

    @Override // o0ooOO0.InterfaceC31563Ooooooo
    public final boolean OooOOO0() {
        return this.f112911OooO00o.getClipToOutline();
    }

    @Override // o0ooOO0.InterfaceC31563Ooooooo
    public final void OooOOOO(Matrix matrix) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(matrix, "matrix");
        this.f112911OooO00o.getMatrix(matrix);
    }

    @Override // o0ooOO0.InterfaceC31563Ooooooo
    public final void OooOOOo(int i) {
        this.f112912OooO0O0 += i;
        this.f112914OooO0Oo += i;
        this.f112911OooO00o.offsetLeftAndRight(i);
    }

    @Override // o0ooOO0.InterfaceC31563Ooooooo
    public final void OooOOo(float f) {
        this.f112911OooO00o.setPivotX(f);
    }

    @Override // o0ooOO0.InterfaceC31563Ooooooo
    public final void OooOOo0() {
    }

    @Override // o0ooOO0.InterfaceC31563Ooooooo
    public final void OooOOoo(float f) {
        this.f112911OooO00o.setPivotY(f);
    }

    @Override // o0ooOO0.InterfaceC31563Ooooooo
    public final boolean OooOo(int i, int i2, int i3, int i4) {
        this.f112912OooO0O0 = i;
        this.f112913OooO0OO = i2;
        this.f112914OooO0Oo = i3;
        this.f112916OooO0o0 = i4;
        return this.f112911OooO00o.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // o0ooOO0.InterfaceC31563Ooooooo
    public final void OooOo0(float f) {
        this.f112911OooO00o.setScaleX(f);
    }

    @Override // o0ooOO0.InterfaceC31563Ooooooo
    public final void OooOo00(Outline outline) {
        this.f112911OooO00o.setOutline(outline);
    }

    @Override // o0ooOO0.InterfaceC31563Ooooooo
    public final void OooOo0O(float f) {
        this.f112911OooO00o.setScaleY(f);
    }

    @Override // o0ooOO0.InterfaceC31563Ooooooo
    public final void OooOo0o(boolean z) {
        this.f112911OooO00o.setClipToOutline(z);
    }

    @Override // o0ooOO0.InterfaceC31563Ooooooo
    public final boolean OooOoO() {
        return this.f112915OooO0o;
    }

    @Override // o0ooOO0.InterfaceC31563Ooooooo
    public final void OooOoO0() {
        C31570o0000Oo.f112812OooO00o.OooO00o(this.f112911OooO00o);
    }

    @Override // o0ooOO0.InterfaceC31563Ooooooo
    public final int OooOoOO() {
        return this.f112913OooO0OO;
    }

    @Override // o0ooOO0.InterfaceC31563Ooooooo
    public final void OooOoo(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            C31572o0000OoO.f112827OooO00o.OooO0OO(this.f112911OooO00o, i);
        }
    }

    @Override // o0ooOO0.InterfaceC31563Ooooooo
    public final void OooOoo0() {
        this.f112911OooO00o.setTranslationY(0.0f);
    }

    @Override // o0ooOO0.InterfaceC31563Ooooooo
    public final void OooOooO() {
        this.f112911OooO00o.setTranslationX(0.0f);
    }

    @Override // o0ooOO0.InterfaceC31563Ooooooo
    public final void OooOooo(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            C31572o0000OoO.f112827OooO00o.OooO0Oo(this.f112911OooO00o, i);
        }
    }

    @Override // o0ooOO0.InterfaceC31563Ooooooo
    public final float Oooo000() {
        return this.f112911OooO00o.getElevation();
    }

    @Override // o0ooOO0.InterfaceC31563Ooooooo
    public final float getAlpha() {
        return this.f112911OooO00o.getAlpha();
    }

    @Override // o0ooOO0.InterfaceC31563Ooooooo
    public final int getBottom() {
        return this.f112916OooO0o0;
    }

    @Override // o0ooOO0.InterfaceC31563Ooooooo
    public final int getHeight() {
        return this.f112916OooO0o0 - this.f112913OooO0OO;
    }

    @Override // o0ooOO0.InterfaceC31563Ooooooo
    public final int getLeft() {
        return this.f112912OooO0O0;
    }

    @Override // o0ooOO0.InterfaceC31563Ooooooo
    public final int getRight() {
        return this.f112914OooO0Oo;
    }

    @Override // o0ooOO0.InterfaceC31563Ooooooo
    public final int getWidth() {
        return this.f112914OooO0Oo - this.f112912OooO0O0;
    }
}
