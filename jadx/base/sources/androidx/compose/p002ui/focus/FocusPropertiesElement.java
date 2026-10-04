package androidx.compose.p002ui.focus;

import OoooOoO.InterfaceC21233OooO0o;
import Ooooo0o.C21269OooOOo;
import Ooooo0o.InterfaceC21266OooOOO0;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import o00oO0O.AbstractC25519Oooo0oO;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m80611d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m80612d2 = {"Landroidx/compose/ui/focus/FocusPropertiesElement;", "Lo00oO0O/Oooo0oO;", "LOoooo0o/OooOOo;", "ui_release"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
final /* data */ class FocusPropertiesElement extends AbstractC25519Oooo0oO<C21269OooOOo> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final OooOOOO f63335OooOo0o;

    /* JADX WARN: Multi-variable type inference failed */
    public FocusPropertiesElement(InterfaceC32507OooOO0o<? super InterfaceC21266OooOOO0, C32460OooOooO> scope) {
        OooOOO0.OooO0oO(scope, "scope");
        this.f63335OooOo0o = (OooOOOO) scope;
    }

    @Override // o00oO0O.AbstractC25519Oooo0oO
    public final InterfaceC21233OooO0o.OooO0OO OooO00o() {
        OooOOOO focusPropertiesScope = this.f63335OooOo0o;
        OooOOO0.OooO0oO(focusPropertiesScope, "focusPropertiesScope");
        C21269OooOOo c21269OooOOo = new C21269OooOOo();
        c21269OooOOo.f61676Oooo00O = focusPropertiesScope;
        return c21269OooOOo;
    }

    @Override // o00oO0O.AbstractC25519Oooo0oO
    public final InterfaceC21233OooO0o.OooO0OO OooO0oo(InterfaceC21233OooO0o.OooO0OO oooO0OO) {
        C21269OooOOo node = (C21269OooOOo) oooO0OO;
        OooOOO0.OooO0oO(node, "node");
        OooOOOO oooOOOO = this.f63335OooOo0o;
        OooOOO0.OooO0oO(oooOOOO, "<set-?>");
        node.f61676Oooo00O = oooOOOO;
        return node;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusPropertiesElement) && OooOOO0.OooO0O0(this.f63335OooOo0o, ((FocusPropertiesElement) obj).f63335OooOo0o);
    }

    public final int hashCode() {
        return this.f63335OooOo0o.hashCode();
    }

    public final String toString() {
        return "FocusPropertiesElement(scope=" + this.f63335OooOo0o + ')';
    }
}
