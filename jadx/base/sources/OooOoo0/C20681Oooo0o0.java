package OooOoo0;

import Ooooo00.InterfaceC21250OooO0oO;
import OooooO0.C21293OooOO0;
import OooooOO.C21325OooOooo;
import OooooOO.C21328Oooo000;
import OooooOO.InterfaceC21342OoooOOO;
import android.graphics.Canvas;
import android.widget.EdgeEffect;
import o00O0oOo.AbstractC24958OooOO0o;
import o00oO0O.C25508OooOoo;
import o0ooOO0.C31604o0ooOoO;

/* JADX INFO: renamed from: OooOoo0.Oooo0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20681Oooo0o0 extends AbstractC24958OooOO0o implements InterfaceC21250OooO0oO {

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final C20653OooO0O0 f59371OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20681Oooo0o0(C20653OooO0O0 overscrollEffect, C31604o0ooOoO.OooO00o inspectorInfo) {
        super(inspectorInfo);
        kotlin.jvm.internal.OooOOO0.OooO0oO(overscrollEffect, "overscrollEffect");
        kotlin.jvm.internal.OooOOO0.OooO0oO(inspectorInfo, "inspectorInfo");
        this.f59371OooOoO0 = overscrollEffect;
    }

    @Override // Ooooo00.InterfaceC21250OooO0oO
    public final void OooOo(C25508OooOoo c25508OooOoo) {
        boolean zOooO0oO;
        c25508OooOoo.Ooooo0o();
        C20653OooO0O0 c20653OooO0O0 = this.f59371OooOoO0;
        c20653OooO0O0.getClass();
        if (C21293OooOO0.OooO0o0(c20653OooO0O0.f59239OooOOOO)) {
            return;
        }
        InterfaceC21342OoooOOO interfaceC21342OoooOOOOooO00o = c25508OooOoo.f86983OooOo0o.f61911OooOo.OooO00o();
        c20653OooO0O0.f59236OooOO0o.getValue();
        Canvas canvas = C21328Oooo000.f61738OooO00o;
        kotlin.jvm.internal.OooOOO0.OooO0oO(interfaceC21342OoooOOOOooO00o, "<this>");
        Canvas canvas2 = ((C21325OooOooo) interfaceC21342OoooOOOOooO00o).f61733OooO00o;
        EdgeEffect edgeEffect = c20653OooO0O0.f59234OooOO0;
        if (C20680Oooo0o.OooO0O0(edgeEffect) != 0.0f) {
            c20653OooO0O0.OooO0oo(c25508OooOoo, edgeEffect, canvas2);
            edgeEffect.finish();
        }
        EdgeEffect edgeEffect2 = c20653OooO0O0.f59231OooO0o0;
        if (edgeEffect2.isFinished()) {
            zOooO0oO = false;
        } else {
            zOooO0oO = c20653OooO0O0.OooO0oO(c25508OooOoo, edgeEffect2, canvas2);
            C20680Oooo0o.OooO0OO(edgeEffect, C20680Oooo0o.OooO0O0(edgeEffect2));
        }
        EdgeEffect edgeEffect3 = c20653OooO0O0.f59233OooO0oo;
        if (C20680Oooo0o.OooO0O0(edgeEffect3) != 0.0f) {
            c20653OooO0O0.OooO0o(c25508OooOoo, edgeEffect3, canvas2);
            edgeEffect3.finish();
        }
        EdgeEffect edgeEffect4 = c20653OooO0O0.f59228OooO0OO;
        boolean zIsFinished = edgeEffect4.isFinished();
        C20707o00000oo c20707o00000oo = c20653OooO0O0.f59226OooO00o;
        if (!zIsFinished) {
            int iSave = canvas2.save();
            canvas2.translate(0.0f, c25508OooOoo.o0OOO0o(c20707o00000oo.f59456OooO0O0.f59695OooO0O0));
            boolean zDraw = edgeEffect4.draw(canvas2);
            canvas2.restoreToCount(iSave);
            zOooO0oO = zDraw || zOooO0oO;
            C20680Oooo0o.OooO0OO(edgeEffect3, C20680Oooo0o.OooO0O0(edgeEffect4));
        }
        EdgeEffect edgeEffect5 = c20653OooO0O0.f59235OooOO0O;
        if (C20680Oooo0o.OooO0O0(edgeEffect5) != 0.0f) {
            c20653OooO0O0.OooO0oO(c25508OooOoo, edgeEffect5, canvas2);
            edgeEffect5.finish();
        }
        EdgeEffect edgeEffect6 = c20653OooO0O0.f59230OooO0o;
        if (!edgeEffect6.isFinished()) {
            zOooO0oO = c20653OooO0O0.OooO0oo(c25508OooOoo, edgeEffect6, canvas2) || zOooO0oO;
            C20680Oooo0o.OooO0OO(edgeEffect5, C20680Oooo0o.OooO0O0(edgeEffect6));
        }
        EdgeEffect edgeEffect7 = c20653OooO0O0.f59225OooO;
        if (C20680Oooo0o.OooO0O0(edgeEffect7) != 0.0f) {
            int iSave2 = canvas2.save();
            canvas2.translate(0.0f, c25508OooOoo.o0OOO0o(c20707o00000oo.f59456OooO0O0.f59695OooO0O0));
            edgeEffect7.draw(canvas2);
            canvas2.restoreToCount(iSave2);
            edgeEffect7.finish();
        }
        EdgeEffect edgeEffect8 = c20653OooO0O0.f59229OooO0Oo;
        if (!edgeEffect8.isFinished()) {
            boolean z = c20653OooO0O0.OooO0o(c25508OooOoo, edgeEffect8, canvas2) || zOooO0oO;
            C20680Oooo0o.OooO0OO(edgeEffect7, C20680Oooo0o.OooO0O0(edgeEffect8));
            zOooO0oO = z;
        }
        if (zOooO0oO) {
            c20653OooO0O0.OooO();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20681Oooo0o0)) {
            return false;
        }
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f59371OooOoO0, ((C20681Oooo0o0) obj).f59371OooOoO0);
    }

    public final int hashCode() {
        return this.f59371OooOoO0.hashCode();
    }

    @Override // o00O0oOo.AbstractC24958OooOO0o
    public final String toString() {
        return "DrawOverscrollModifier(overscrollEffect=" + this.f59371OooOoO0 + ')';
    }
}
