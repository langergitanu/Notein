package androidx.compose.p002ui.draw;

import OooOoO.C20509OooO0oo;
import OoooOoO.InterfaceC21229OooO00o;
import OoooOoO.InterfaceC21233OooO0o;
import Ooooo00.C21252OooOO0o;
import OooooO0.C21293OooOO0;
import OooooOO.C21349OooooO0;
import Oooooo.AbstractC21396OooO0O0;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o00oO0O.AbstractC25519Oooo0oO;
import o00oO0O.OooO;
import o00oO0O.OooOOO;
import oo000o.InterfaceC34627OooO0o0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m80611d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0083\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m80612d2 = {"Landroidx/compose/ui/draw/PainterModifierNodeElement;", "Lo00oO0O/Oooo0oO;", "LOoooo00/OooOO0o;", "ui_release"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
final /* data */ class PainterModifierNodeElement extends AbstractC25519Oooo0oO<C21252OooOO0o> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final AbstractC21396OooO0O0 f63328OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final InterfaceC34627OooO0o0 f63329OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final InterfaceC21229OooO00o f63330OooOoO0;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final C21349OooooO0 f63332OooOoo0;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final boolean f63327OooOo = true;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final float f63331OooOoOO = 1.0f;

    public PainterModifierNodeElement(AbstractC21396OooO0O0 abstractC21396OooO0O0, InterfaceC21229OooO00o interfaceC21229OooO00o, InterfaceC34627OooO0o0 interfaceC34627OooO0o0, C21349OooooO0 c21349OooooO0) {
        this.f63328OooOo0o = abstractC21396OooO0O0;
        this.f63330OooOoO0 = interfaceC21229OooO00o;
        this.f63329OooOoO = interfaceC34627OooO0o0;
        this.f63332OooOoo0 = c21349OooooO0;
    }

    @Override // o00oO0O.AbstractC25519Oooo0oO
    public final InterfaceC21233OooO0o.OooO0OO OooO00o() {
        AbstractC21396OooO0O0 painter = this.f63328OooOo0o;
        OooOOO0.OooO0oO(painter, "painter");
        InterfaceC21229OooO00o alignment = this.f63330OooOoO0;
        OooOOO0.OooO0oO(alignment, "alignment");
        InterfaceC34627OooO0o0 contentScale = this.f63329OooOoO;
        OooOOO0.OooO0oO(contentScale, "contentScale");
        C21252OooOO0o c21252OooOO0o = new C21252OooOO0o();
        c21252OooOO0o.f61638Oooo00O = painter;
        c21252OooOO0o.f61639Oooo00o = this.f63327OooOo;
        c21252OooOO0o.f61637Oooo0 = alignment;
        c21252OooOO0o.f61640Oooo0O0 = contentScale;
        c21252OooOO0o.f61641Oooo0OO = this.f63331OooOoOO;
        c21252OooOO0o.f61642Oooo0o0 = this.f63332OooOoo0;
        return c21252OooOO0o;
    }

    @Override // o00oO0O.AbstractC25519Oooo0oO
    public final boolean OooO0o0() {
        return false;
    }

    @Override // o00oO0O.AbstractC25519Oooo0oO
    public final InterfaceC21233OooO0o.OooO0OO OooO0oo(InterfaceC21233OooO0o.OooO0OO oooO0OO) {
        C21252OooOO0o node = (C21252OooOO0o) oooO0OO;
        OooOOO0.OooO0oO(node, "node");
        boolean z = node.f61639Oooo00o;
        AbstractC21396OooO0O0 abstractC21396OooO0O0 = this.f63328OooOo0o;
        boolean z2 = this.f63327OooOo;
        boolean z3 = z != z2 || (z2 && !C21293OooOO0.OooO00o(node.f61638Oooo00O.OooO0OO(), abstractC21396OooO0O0.OooO0OO()));
        OooOOO0.OooO0oO(abstractC21396OooO0O0, "<set-?>");
        node.f61638Oooo00O = abstractC21396OooO0O0;
        node.f61639Oooo00o = z2;
        InterfaceC21229OooO00o interfaceC21229OooO00o = this.f63330OooOoO0;
        OooOOO0.OooO0oO(interfaceC21229OooO00o, "<set-?>");
        node.f61637Oooo0 = interfaceC21229OooO00o;
        InterfaceC34627OooO0o0 interfaceC34627OooO0o0 = this.f63329OooOoO;
        OooOOO0.OooO0oO(interfaceC34627OooO0o0, "<set-?>");
        node.f61640Oooo0O0 = interfaceC34627OooO0o0;
        node.f61641Oooo0OO = this.f63331OooOoOO;
        node.f61642Oooo0o0 = this.f63332OooOoo0;
        if (z3) {
            OooO.OooO0o0(node).Oooo00o(false);
        }
        OooOOO.OooO00o(node);
        return node;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PainterModifierNodeElement)) {
            return false;
        }
        PainterModifierNodeElement painterModifierNodeElement = (PainterModifierNodeElement) obj;
        return OooOOO0.OooO0O0(this.f63328OooOo0o, painterModifierNodeElement.f63328OooOo0o) && this.f63327OooOo == painterModifierNodeElement.f63327OooOo && OooOOO0.OooO0O0(this.f63330OooOoO0, painterModifierNodeElement.f63330OooOoO0) && OooOOO0.OooO0O0(this.f63329OooOoO, painterModifierNodeElement.f63329OooOoO) && Float.compare(this.f63331OooOoOO, painterModifierNodeElement.f63331OooOoOO) == 0 && OooOOO0.OooO0O0(this.f63332OooOoo0, painterModifierNodeElement.f63332OooOoo0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    public final int hashCode() {
        int iHashCode = this.f63328OooOo0o.hashCode() * 31;
        boolean z = this.f63327OooOo;
        ?? r2 = z;
        if (z) {
            r2 = 1;
        }
        int iOooO0OO = C20509OooO0oo.OooO0OO(this.f63331OooOoOO, (this.f63329OooOoO.hashCode() + ((this.f63330OooOoO0.hashCode() + ((iHashCode + r2) * 31)) * 31)) * 31, 31);
        C21349OooooO0 c21349OooooO0 = this.f63332OooOoo0;
        return iOooO0OO + (c21349OooooO0 == null ? 0 : c21349OooooO0.hashCode());
    }

    public final String toString() {
        return "PainterModifierNodeElement(painter=" + this.f63328OooOo0o + ", sizeToIntrinsics=" + this.f63327OooOo + ", alignment=" + this.f63330OooOoO0 + ", contentScale=" + this.f63329OooOoO + ", alpha=" + this.f63331OooOoOO + ", colorFilter=" + this.f63332OooOoo0 + ')';
    }
}
