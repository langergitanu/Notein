package androidx.compose.p002ui.draw;

import OoooOoO.InterfaceC21233OooO0o;
import Ooooo00.C21247OooO0Oo;
import Oooooo0.InterfaceC21402OooO0o0;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import o00oO0O.AbstractC25519Oooo0oO;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m80611d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m80612d2 = {"Landroidx/compose/ui/draw/DrawBehindElement;", "Lo00oO0O/Oooo0oO;", "LOoooo00/OooO0Oo;", "ui_release"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
final /* data */ class DrawBehindElement extends AbstractC25519Oooo0oO<C21247OooO0Oo> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final OooOOOO f63325OooOo0o;

    /* JADX WARN: Multi-variable type inference failed */
    public DrawBehindElement(InterfaceC32507OooOO0o<? super InterfaceC21402OooO0o0, C32460OooOooO> interfaceC32507OooOO0o) {
        this.f63325OooOo0o = (OooOOOO) interfaceC32507OooOO0o;
    }

    @Override // o00oO0O.AbstractC25519Oooo0oO
    public final InterfaceC21233OooO0o.OooO0OO OooO00o() {
        OooOOOO onDraw = this.f63325OooOo0o;
        OooOOO0.OooO0oO(onDraw, "onDraw");
        C21247OooO0Oo c21247OooO0Oo = new C21247OooO0Oo();
        c21247OooO0Oo.f61628Oooo00O = onDraw;
        return c21247OooO0Oo;
    }

    @Override // o00oO0O.AbstractC25519Oooo0oO
    public final InterfaceC21233OooO0o.OooO0OO OooO0oo(InterfaceC21233OooO0o.OooO0OO oooO0OO) {
        C21247OooO0Oo node = (C21247OooO0Oo) oooO0OO;
        OooOOO0.OooO0oO(node, "node");
        OooOOOO oooOOOO = this.f63325OooOo0o;
        OooOOO0.OooO0oO(oooOOOO, "<set-?>");
        node.f61628Oooo00O = oooOOOO;
        return node;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DrawBehindElement) && OooOOO0.OooO0O0(this.f63325OooOo0o, ((DrawBehindElement) obj).f63325OooOo0o);
    }

    public final int hashCode() {
        return this.f63325OooOo0o.hashCode();
    }

    public final String toString() {
        return "DrawBehindElement(onDraw=" + this.f63325OooOo0o + ')';
    }
}
