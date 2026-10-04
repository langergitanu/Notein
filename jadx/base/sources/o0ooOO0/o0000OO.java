package o0ooOO0;

import OooooOO.C21325OooOooo;
import OooooOO.C21343OoooOOo;
import OooooOO.InterfaceC21370ooOO;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import androidx.compose.p002ui.platform.AndroidComposeView;
import o00oO0O.AbstractC25521OoooO;

/* JADX INFO: loaded from: classes.dex */
public final class o0000OO implements InterfaceC31563Ooooooo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final RenderNode f112810OooO00o;

    public o0000OO(AndroidComposeView ownerView) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(ownerView, "ownerView");
        this.f112810OooO00o = C31578o0000oO.OooO00o();
    }

    @Override // o0ooOO0.InterfaceC31563Ooooooo
    public final void OooO() {
        this.f112810OooO00o.setRotationY(0.0f);
    }

    @Override // o0ooOO0.InterfaceC31563Ooooooo
    public final void OooO00o(Canvas canvas) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(canvas, "canvas");
        canvas.drawRenderNode(this.f112810OooO00o);
    }

    @Override // o0ooOO0.InterfaceC31563Ooooooo
    public final void OooO0O0(boolean z) {
        this.f112810OooO00o.setClipToBounds(z);
    }

    @Override // o0ooOO0.InterfaceC31563Ooooooo
    public final void OooO0OO(float f) {
        this.f112810OooO00o.setElevation(f);
    }

    @Override // o0ooOO0.InterfaceC31563Ooooooo
    public final void OooO0Oo(int i) {
        this.f112810OooO00o.offsetTopAndBottom(i);
    }

    @Override // o0ooOO0.InterfaceC31563Ooooooo
    public final boolean OooO0o() {
        return this.f112810OooO00o.hasDisplayList();
    }

    @Override // o0ooOO0.InterfaceC31563Ooooooo
    public final void OooO0o0(C21343OoooOOo canvasHolder, InterfaceC21370ooOO interfaceC21370ooOO, AbstractC25521OoooO drawBlock) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(canvasHolder, "canvasHolder");
        kotlin.jvm.internal.OooOOO0.OooO0oO(drawBlock, "drawBlock");
        RecordingCanvas recordingCanvasBeginRecording = this.f112810OooO00o.beginRecording();
        kotlin.jvm.internal.OooOOO0.OooO0o(recordingCanvasBeginRecording, "renderNode.beginRecording()");
        C21325OooOooo c21325OooOooo = canvasHolder.f61756OooO00o;
        Canvas canvas = c21325OooOooo.f61733OooO00o;
        c21325OooOooo.f61733OooO00o = recordingCanvasBeginRecording;
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
        this.f112810OooO00o.endRecording();
    }

    @Override // o0ooOO0.InterfaceC31563Ooooooo
    public final boolean OooO0oO() {
        return this.f112810OooO00o.setHasOverlappingRendering(true);
    }

    @Override // o0ooOO0.InterfaceC31563Ooooooo
    public final void OooO0oo() {
        this.f112810OooO00o.setRotationX(0.0f);
    }

    @Override // o0ooOO0.InterfaceC31563Ooooooo
    public final void OooOO0() {
        RenderNode renderNode = this.f112810OooO00o;
        renderNode.setUseCompositingLayer(false, null);
        renderNode.setHasOverlappingRendering(true);
    }

    @Override // o0ooOO0.InterfaceC31563Ooooooo
    public final void OooOO0O() {
        this.f112810OooO00o.setRotationZ(0.0f);
    }

    @Override // o0ooOO0.InterfaceC31563Ooooooo
    public final void OooOO0o(float f) {
        this.f112810OooO00o.setCameraDistance(f);
    }

    @Override // o0ooOO0.InterfaceC31563Ooooooo
    public final void OooOOO(float f) {
        this.f112810OooO00o.setAlpha(f);
    }

    @Override // o0ooOO0.InterfaceC31563Ooooooo
    public final boolean OooOOO0() {
        return this.f112810OooO00o.getClipToOutline();
    }

    @Override // o0ooOO0.InterfaceC31563Ooooooo
    public final void OooOOOO(Matrix matrix) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(matrix, "matrix");
        this.f112810OooO00o.getMatrix(matrix);
    }

    @Override // o0ooOO0.InterfaceC31563Ooooooo
    public final void OooOOOo(int i) {
        this.f112810OooO00o.offsetLeftAndRight(i);
    }

    @Override // o0ooOO0.InterfaceC31563Ooooooo
    public final void OooOOo(float f) {
        this.f112810OooO00o.setPivotX(f);
    }

    @Override // o0ooOO0.InterfaceC31563Ooooooo
    public final void OooOOo0() {
        if (Build.VERSION.SDK_INT >= 31) {
            C31569o0000OOo.f112811OooO00o.OooO00o(this.f112810OooO00o, null);
        }
    }

    @Override // o0ooOO0.InterfaceC31563Ooooooo
    public final void OooOOoo(float f) {
        this.f112810OooO00o.setPivotY(f);
    }

    @Override // o0ooOO0.InterfaceC31563Ooooooo
    public final boolean OooOo(int i, int i2, int i3, int i4) {
        return this.f112810OooO00o.setPosition(i, i2, i3, i4);
    }

    @Override // o0ooOO0.InterfaceC31563Ooooooo
    public final void OooOo0(float f) {
        this.f112810OooO00o.setScaleX(f);
    }

    @Override // o0ooOO0.InterfaceC31563Ooooooo
    public final void OooOo00(Outline outline) {
        this.f112810OooO00o.setOutline(outline);
    }

    @Override // o0ooOO0.InterfaceC31563Ooooooo
    public final void OooOo0O(float f) {
        this.f112810OooO00o.setScaleY(f);
    }

    @Override // o0ooOO0.InterfaceC31563Ooooooo
    public final void OooOo0o(boolean z) {
        this.f112810OooO00o.setClipToOutline(z);
    }

    @Override // o0ooOO0.InterfaceC31563Ooooooo
    public final boolean OooOoO() {
        return this.f112810OooO00o.getClipToBounds();
    }

    @Override // o0ooOO0.InterfaceC31563Ooooooo
    public final void OooOoO0() {
        this.f112810OooO00o.discardDisplayList();
    }

    @Override // o0ooOO0.InterfaceC31563Ooooooo
    public final int OooOoOO() {
        return this.f112810OooO00o.getTop();
    }

    @Override // o0ooOO0.InterfaceC31563Ooooooo
    public final void OooOoo(int i) {
        this.f112810OooO00o.setAmbientShadowColor(i);
    }

    @Override // o0ooOO0.InterfaceC31563Ooooooo
    public final void OooOoo0() {
        this.f112810OooO00o.setTranslationY(0.0f);
    }

    @Override // o0ooOO0.InterfaceC31563Ooooooo
    public final void OooOooO() {
        this.f112810OooO00o.setTranslationX(0.0f);
    }

    @Override // o0ooOO0.InterfaceC31563Ooooooo
    public final void OooOooo(int i) {
        this.f112810OooO00o.setSpotShadowColor(i);
    }

    @Override // o0ooOO0.InterfaceC31563Ooooooo
    public final float Oooo000() {
        return this.f112810OooO00o.getElevation();
    }

    @Override // o0ooOO0.InterfaceC31563Ooooooo
    public final float getAlpha() {
        return this.f112810OooO00o.getAlpha();
    }

    @Override // o0ooOO0.InterfaceC31563Ooooooo
    public final int getBottom() {
        return this.f112810OooO00o.getBottom();
    }

    @Override // o0ooOO0.InterfaceC31563Ooooooo
    public final int getHeight() {
        return this.f112810OooO00o.getHeight();
    }

    @Override // o0ooOO0.InterfaceC31563Ooooooo
    public final int getLeft() {
        return this.f112810OooO00o.getLeft();
    }

    @Override // o0ooOO0.InterfaceC31563Ooooooo
    public final int getRight() {
        return this.f112810OooO00o.getRight();
    }

    @Override // o0ooOO0.InterfaceC31563Ooooooo
    public final int getWidth() {
        return this.f112810OooO00o.getWidth();
    }
}
