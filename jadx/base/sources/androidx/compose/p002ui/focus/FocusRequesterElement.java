package androidx.compose.p002ui.focus;

import OoooOoO.InterfaceC21233OooO0o;
import Ooooo0o.C21274OooOo00;
import Ooooo0o.C21276OooOo0o;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o00oO0O.AbstractC25519Oooo0oO;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m80611d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m80612d2 = {"Landroidx/compose/ui/focus/FocusRequesterElement;", "Lo00oO0O/Oooo0oO;", "LOoooo0o/OooOo0o;", "ui_release"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
final /* data */ class FocusRequesterElement extends AbstractC25519Oooo0oO<C21276OooOo0o> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final C21274OooOo00 f63336OooOo0o;

    public FocusRequesterElement(C21274OooOo00 focusRequester) {
        OooOOO0.OooO0oO(focusRequester, "focusRequester");
        this.f63336OooOo0o = focusRequester;
    }

    @Override // o00oO0O.AbstractC25519Oooo0oO
    public final InterfaceC21233OooO0o.OooO0OO OooO00o() {
        C21274OooOo00 focusRequester = this.f63336OooOo0o;
        OooOOO0.OooO0oO(focusRequester, "focusRequester");
        C21276OooOo0o c21276OooOo0o = new C21276OooOo0o();
        c21276OooOo0o.f61681Oooo00O = focusRequester;
        return c21276OooOo0o;
    }

    @Override // o00oO0O.AbstractC25519Oooo0oO
    public final InterfaceC21233OooO0o.OooO0OO OooO0oo(InterfaceC21233OooO0o.OooO0OO oooO0OO) {
        C21276OooOo0o node = (C21276OooOo0o) oooO0OO;
        OooOOO0.OooO0oO(node, "node");
        node.f61681Oooo00O.f61680OooO00o.OooOO0O(node);
        C21274OooOo00 c21274OooOo00 = this.f63336OooOo0o;
        OooOOO0.OooO0oO(c21274OooOo00, "<set-?>");
        node.f61681Oooo00O = c21274OooOo00;
        c21274OooOo00.f61680OooO00o.OooO0O0(node);
        return node;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusRequesterElement) && OooOOO0.OooO0O0(this.f63336OooOo0o, ((FocusRequesterElement) obj).f63336OooOo0o);
    }

    public final int hashCode() {
        return this.f63336OooOo0o.hashCode();
    }

    public final String toString() {
        return "FocusRequesterElement(focusRequester=" + this.f63336OooOo0o + ')';
    }
}
