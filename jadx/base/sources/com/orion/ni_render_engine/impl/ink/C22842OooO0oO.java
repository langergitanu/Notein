package com.orion.ni_render_engine.impl.ink;

import android.graphics.Canvas;
import android.graphics.Matrix;
import androidx.ink.strokes.OooOOO0;
import com.aspose.slides.C22229OoooO00;
import o000Oo00.InterfaceC24514OooO00o;
import o000Oo0O.C24531OooOo0o;
import oO00ooO.C32460OooOooO;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: com.orion.ni_render_engine.impl.ink.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C22842OooO0oO implements InterfaceC22843OooO0oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C24531OooOo0o f69453OooO00o;

    public C22842OooO0oO() {
        int i = InterfaceC24514OooO00o.f82908OooO00o;
        this.f69453OooO00o = new C24531OooOo0o(new C22229OoooO00(), true);
    }

    @Override // com.orion.ni_render_engine.impl.ink.InterfaceC22843OooO0oo
    public final boolean OooO00o(OooOOO0 stroke) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(stroke, "stroke");
        return true;
    }

    @Override // com.orion.ni_render_engine.impl.ink.InterfaceC22843OooO0oo
    public final boolean OooO0O0(Canvas canvas, OooOOO0 stroke, Matrix transform) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(canvas, "canvas");
        kotlin.jvm.internal.OooOOO0.OooO0oO(stroke, "stroke");
        kotlin.jvm.internal.OooOOO0.OooO0oO(transform, "transform");
        try {
            synchronized (this.f69453OooO00o) {
                C24531OooOo0o c24531OooOo0o = this.f69453OooO00o;
                c24531OooOo0o.getClass();
                c24531OooOo0o.OooO00o(canvas, stroke, transform);
                C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
            }
            return true;
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("SoftwareRenderer");
            c20358OooO00o.OooO0Oo(e, "软件渲染失败", new Object[0]);
            return false;
        }
    }
}
