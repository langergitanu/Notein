package androidx.compose.p002ui.input.key;

import OoooOoO.InterfaceC21233OooO0o;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o00O0O.C24824OooO0Oo;
import o00O0O.OooO0O0;
import o00oO0O.AbstractC25519Oooo0oO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m80611d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m80612d2 = {"Landroidx/compose/ui/input/key/OnKeyEventElement;", "Lo00oO0O/Oooo0oO;", "Lo00O0O/OooO0Oo;", "ui_release"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
public final /* data */ class OnKeyEventElement extends AbstractC25519Oooo0oO<C24824OooO0Oo> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final Object f63351OooOo0o;

    public OnKeyEventElement(InterfaceC32507OooOO0o<? super OooO0O0, Boolean> interfaceC32507OooOO0o) {
        this.f63351OooOo0o = interfaceC32507OooOO0o;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, oO0O000o.OooOO0o] */
    @Override // o00oO0O.AbstractC25519Oooo0oO
    public final InterfaceC21233OooO0o.OooO0OO OooO00o() {
        return new C24824OooO0Oo(this.f63351OooOo0o, null);
    }

    @Override // o00oO0O.AbstractC25519Oooo0oO
    public final InterfaceC21233OooO0o.OooO0OO OooO0oo(InterfaceC21233OooO0o.OooO0OO oooO0OO) {
        C24824OooO0Oo node = (C24824OooO0Oo) oooO0OO;
        OooOOO0.OooO0oO(node, "node");
        node.f84204Oooo00O = this.f63351OooOo0o;
        node.f84205Oooo00o = null;
        return node;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OnKeyEventElement) && OooOOO0.OooO0O0(this.f63351OooOo0o, ((OnKeyEventElement) obj).f63351OooOo0o);
    }

    public final int hashCode() {
        return this.f63351OooOo0o.hashCode();
    }

    public final String toString() {
        return "OnKeyEventElement(onKeyEvent=" + this.f63351OooOo0o + ')';
    }
}
