package androidx.compose.p002ui.graphics;

import OoooOoO.InterfaceC21233OooO0o;
import OooooOO.C21337OoooO;
import OooooOO.InterfaceC21351OooooOo;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o00oO0O.AbstractC25519Oooo0oO;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m80611d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m80612d2 = {"Landroidx/compose/ui/graphics/BlockGraphicsLayerElement;", "Lo00oO0O/Oooo0oO;", "LOooooOO/OoooO;", "ui_release"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
final /* data */ class BlockGraphicsLayerElement extends AbstractC25519Oooo0oO<C21337OoooO> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final InterfaceC32507OooOO0o<InterfaceC21351OooooOo, C32460OooOooO> f63341OooOo0o;

    /* JADX WARN: Multi-variable type inference failed */
    public BlockGraphicsLayerElement(InterfaceC32507OooOO0o<? super InterfaceC21351OooooOo, C32460OooOooO> block) {
        OooOOO0.OooO0oO(block, "block");
        this.f63341OooOo0o = block;
    }

    @Override // o00oO0O.AbstractC25519Oooo0oO
    public final InterfaceC21233OooO0o.OooO0OO OooO00o() {
        InterfaceC32507OooOO0o<InterfaceC21351OooooOo, C32460OooOooO> layerBlock = this.f63341OooOo0o;
        OooOOO0.OooO0oO(layerBlock, "layerBlock");
        C21337OoooO c21337OoooO = new C21337OoooO();
        c21337OoooO.f61752Oooo00O = layerBlock;
        return c21337OoooO;
    }

    @Override // o00oO0O.AbstractC25519Oooo0oO
    public final InterfaceC21233OooO0o.OooO0OO OooO0oo(InterfaceC21233OooO0o.OooO0OO oooO0OO) {
        C21337OoooO node = (C21337OoooO) oooO0OO;
        OooOOO0.OooO0oO(node, "node");
        InterfaceC32507OooOO0o<InterfaceC21351OooooOo, C32460OooOooO> interfaceC32507OooOO0o = this.f63341OooOo0o;
        OooOOO0.OooO0oO(interfaceC32507OooOO0o, "<set-?>");
        node.f61752Oooo00O = interfaceC32507OooOO0o;
        return node;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BlockGraphicsLayerElement) && OooOOO0.OooO0O0(this.f63341OooOo0o, ((BlockGraphicsLayerElement) obj).f63341OooOo0o);
    }

    public final int hashCode() {
        return this.f63341OooOo0o.hashCode();
    }

    public final String toString() {
        return "BlockGraphicsLayerElement(block=" + this.f63341OooOo0o + ')';
    }
}
