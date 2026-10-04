package androidx.compose.p002ui.draw;

import Oooo0.o0000;
import OoooOoO.InterfaceC21233OooO0o;
import Ooooo00.OooOO0;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o00oO0O.AbstractC25519Oooo0oO;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m80611d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m80612d2 = {"Landroidx/compose/ui/draw/DrawWithContentElement;", "Lo00oO0O/Oooo0oO;", "LOoooo00/OooOO0;", "ui_release"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
final /* data */ class DrawWithContentElement extends AbstractC25519Oooo0oO<OooOO0> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final o0000 f63326OooOo0o;

    public DrawWithContentElement(o0000 o0000Var) {
        this.f63326OooOo0o = o0000Var;
    }

    @Override // o00oO0O.AbstractC25519Oooo0oO
    public final InterfaceC21233OooO0o.OooO0OO OooO00o() {
        o0000 onDraw = this.f63326OooOo0o;
        OooOOO0.OooO0oO(onDraw, "onDraw");
        OooOO0 oooOO02 = new OooOO0();
        oooOO02.f61632Oooo00O = onDraw;
        return oooOO02;
    }

    @Override // o00oO0O.AbstractC25519Oooo0oO
    public final InterfaceC21233OooO0o.OooO0OO OooO0oo(InterfaceC21233OooO0o.OooO0OO oooO0OO) {
        OooOO0 node = (OooOO0) oooO0OO;
        OooOOO0.OooO0oO(node, "node");
        o0000 o0000Var = this.f63326OooOo0o;
        OooOOO0.OooO0oO(o0000Var, "<set-?>");
        node.f61632Oooo00O = o0000Var;
        return node;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DrawWithContentElement) && OooOOO0.OooO0O0(this.f63326OooOo0o, ((DrawWithContentElement) obj).f63326OooOo0o);
    }

    public final int hashCode() {
        return this.f63326OooOo0o.hashCode();
    }

    public final String toString() {
        return "DrawWithContentElement(onDraw=" + this.f63326OooOo0o + ')';
    }
}
