package androidx.compose.p002ui.layout;

import OoooOoO.InterfaceC21233OooO0o;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import o0000Ooo.C24227OooO00o;
import o00oO0O.AbstractC25519Oooo0oO;
import oO0O000o.InterfaceC32510OooOOo0;
import oo000o.C34639OooOOoo;
import oo000o.InterfaceC34641OooOo0O;
import oo000o.InterfaceC34643OooOoO;
import oo000o.OooOo;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m80611d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m80612d2 = {"Landroidx/compose/ui/layout/LayoutModifierElement;", "Lo00oO0O/Oooo0oO;", "Loo000o/OooOOoo;", "ui_release"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
final /* data */ class LayoutModifierElement extends AbstractC25519Oooo0oO<C34639OooOOoo> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final OooOOOO f63354OooOo0o;

    /* JADX WARN: Multi-variable type inference failed */
    public LayoutModifierElement(InterfaceC32510OooOOo0<? super InterfaceC34643OooOoO, ? super InterfaceC34641OooOo0O, ? super C24227OooO00o, ? extends OooOo> measure) {
        OooOOO0.OooO0oO(measure, "measure");
        this.f63354OooOo0o = (OooOOOO) measure;
    }

    @Override // o00oO0O.AbstractC25519Oooo0oO
    public final InterfaceC21233OooO0o.OooO0OO OooO00o() {
        OooOOOO measureBlock = this.f63354OooOo0o;
        OooOOO0.OooO0oO(measureBlock, "measureBlock");
        C34639OooOOoo c34639OooOOoo = new C34639OooOOoo();
        c34639OooOOoo.f124820Oooo00O = measureBlock;
        return c34639OooOOoo;
    }

    @Override // o00oO0O.AbstractC25519Oooo0oO
    public final InterfaceC21233OooO0o.OooO0OO OooO0oo(InterfaceC21233OooO0o.OooO0OO oooO0OO) {
        C34639OooOOoo node = (C34639OooOOoo) oooO0OO;
        OooOOO0.OooO0oO(node, "node");
        OooOOOO oooOOOO = this.f63354OooOo0o;
        OooOOO0.OooO0oO(oooOOOO, "<set-?>");
        node.f124820Oooo00O = oooOOOO;
        return node;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LayoutModifierElement) && OooOOO0.OooO0O0(this.f63354OooOo0o, ((LayoutModifierElement) obj).f63354OooOo0o);
    }

    public final int hashCode() {
        return this.f63354OooOo0o.hashCode();
    }

    public final String toString() {
        return "LayoutModifierElement(measure=" + this.f63354OooOo0o + ')';
    }
}
