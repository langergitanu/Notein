package androidx.ink.authoring.internal;

import Oooo0.C20856OooooOo;
import android.graphics.Canvas;
import android.graphics.RenderNode;
import androidx.ink.authoring.internal.OooO0O0;
import androidx.transition.C22111OooOoo;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0OO implements OooO0O0.OooO00o.InterfaceC19022OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ OooO0O0<Object, o000O0oO.OooO0O0<Object, Object>, Object> f65201OooO00o;

    public OooO0OO(OooO0O0<Object, o000O0oO.OooO0O0<Object, Object>, Object> oooO0O0) {
        this.f65201OooO00o = oooO0O0;
    }

    @Override // androidx.ink.authoring.internal.OooO0O0.OooO00o.InterfaceC19022OooO00o
    public final void OooO00o() {
        OooO0O0<Object, o000O0oO.OooO0O0<Object, Object>, Object> oooO0O0 = this.f65201OooO00o;
        ((OooOO0) oooO0O0.OooO0o0()).OooOOo(oooO0O0.f65193OooOOO);
        ((OooOO0) oooO0O0.OooO0o0()).OooO0oo();
    }

    @Override // androidx.ink.authoring.internal.OooO0O0.OooO00o.InterfaceC19022OooO00o
    public final void OooO0O0(Canvas canvas, int i, int i2) {
        OooO0O0<Object, o000O0oO.OooO0O0<Object, Object>, Object> oooO0O0;
        while (true) {
            oooO0O0 = this.f65201OooO00o;
            if (oooO0O0.f65191OooOO0O.isEmpty()) {
                break;
            }
            Runnable runnablePoll = oooO0O0.f65191OooOO0O.poll();
            if (runnablePoll != null) {
                runnablePoll.run();
            }
        }
        oooO0O0.OooO0O0();
        RenderNode renderNode = oooO0O0.f65196OooOOOo;
        if (renderNode == null || renderNode.getWidth() != i || renderNode.getHeight() != i2) {
            androidx.core.content.OooO00o.OooO0O0();
            RenderNode renderNodeOooO0O0 = C22111OooOoo.OooO0O0(OooO0O0.class.getSimpleName().concat("-OffScreen"));
            renderNodeOooO0O0.setPosition(0, 0, i, i2);
            renderNodeOooO0O0.setHasOverlappingRendering(true);
            renderNodeOooO0O0.setUseCompositingLayer(true, oooO0O0.f65198OooOOo0);
            oooO0O0.f65196OooOOOo = renderNodeOooO0O0;
        }
        int saveCount = canvas.getSaveCount();
        oooO0O0.OooO0O0();
        C21934OooO0Oo c21934OooO0Oo = oooO0O0.f65192OooOO0o;
        c21934OooO0Oo.f65203OooO0O0 = canvas;
        oooO0O0.OooO0O0();
        c21934OooO0Oo.f65202OooO00o = true;
        ((OooOO0) oooO0O0.OooO0o0()).OooOO0O();
        oooO0O0.OooO0O0();
        c21934OooO0Oo.f65202OooO00o = false;
        oooO0O0.OooO0O0();
        c21934OooO0Oo.f65203OooO0O0 = null;
        ((OooOO0) oooO0O0.OooO0o0()).OooOO0o();
        if (canvas.getSaveCount() != saveCount) {
            throw new IllegalStateException(C20856OooooOo.OooO0O0("Unbalanced saves and restores. Expected save count of ", saveCount, ", got ", ".", canvas.getSaveCount()).toString());
        }
    }
}
