package androidx.compose.p002ui.input.rotary;

import OoooOoO.InterfaceC21233OooO0o;
import androidx.compose.p002ui.platform.AndroidComposeView;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o00oO0O.AbstractC25519Oooo0oO;
import o00ooo.C25795OooO0O0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m80611d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m80612d2 = {"Landroidx/compose/ui/input/rotary/OnRotaryScrollEventElement;", "Lo00oO0O/Oooo0oO;", "Lo00ooo/OooO0O0;", "ui_release"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
public final /* data */ class OnRotaryScrollEventElement extends AbstractC25519Oooo0oO<C25795OooO0O0> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final AndroidComposeView.OooOO0O f63353OooOo0o;

    public OnRotaryScrollEventElement(AndroidComposeView.OooOO0O onRotaryScrollEvent) {
        OooOOO0.OooO0oO(onRotaryScrollEvent, "onRotaryScrollEvent");
        this.f63353OooOo0o = onRotaryScrollEvent;
    }

    @Override // o00oO0O.AbstractC25519Oooo0oO
    public final InterfaceC21233OooO0o.OooO0OO OooO00o() {
        C25795OooO0O0 c25795OooO0O0 = new C25795OooO0O0();
        c25795OooO0O0.f87970Oooo00O = this.f63353OooOo0o;
        return c25795OooO0O0;
    }

    @Override // o00oO0O.AbstractC25519Oooo0oO
    public final InterfaceC21233OooO0o.OooO0OO OooO0oo(InterfaceC21233OooO0o.OooO0OO oooO0OO) {
        C25795OooO0O0 node = (C25795OooO0O0) oooO0OO;
        OooOOO0.OooO0oO(node, "node");
        node.f87970Oooo00O = this.f63353OooOo0o;
        return node;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OnRotaryScrollEventElement) && OooOOO0.OooO0O0(this.f63353OooOo0o, ((OnRotaryScrollEventElement) obj).f63353OooOo0o);
    }

    public final int hashCode() {
        return this.f63353OooOo0o.hashCode();
    }

    public final String toString() {
        return "OnRotaryScrollEventElement(onRotaryScrollEvent=" + this.f63353OooOo0o + ')';
    }
}
