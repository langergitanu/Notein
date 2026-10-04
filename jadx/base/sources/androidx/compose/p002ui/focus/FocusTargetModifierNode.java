package androidx.compose.p002ui.focus;

import OoooOoO.InterfaceC21233OooO0o;
import Ooooo0o.C21258OooO0o;
import Ooooo0o.C21265OooOOO;
import Ooooo0o.C21267OooOOOO;
import Ooooo0o.C21268OooOOOo;
import Ooooo0o.C21274OooOo00;
import Ooooo0o.EnumC21278OooOoO0;
import Ooooo0o.InterfaceC21259OooO0o0;
import Ooooo0o.InterfaceC21266OooOOO0;
import Ooooo0o.InterfaceC21270OooOOo0;
import kotlin.Metadata;
import kotlin.jvm.internal.C24034Oooo00O;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import o00oO0O.AbstractC25519Oooo0oO;
import o00oO0O.C25503OooOoOO;
import o00oO0O.C25527OoooO00;
import o00oO0O.C25538OooooOO;
import o00oO0O.InterfaceC25537OooooO0;
import o00oO0O.OooO;
import o00oO0o.InterfaceC25575OooO0o;
import oO00ooO.C32460OooOooO;

/* JADX INFO: loaded from: classes.dex */
public final class FocusTargetModifierNode extends InterfaceC21233OooO0o.OooO0OO implements InterfaceC25537OooooO0, InterfaceC25575OooO0o {

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public EnumC21278OooOoO0 f63337Oooo00O = EnumC21278OooOoO0.f61685OooOoO;

    @Metadata(m80611d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m80612d2 = {"Landroidx/compose/ui/focus/FocusTargetModifierNode$FocusTargetModifierElement;", "Lo00oO0O/Oooo0oO;", "Landroidx/compose/ui/focus/FocusTargetModifierNode;", "<init>", "()V", "ui_release"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
    public static final class FocusTargetModifierElement extends AbstractC25519Oooo0oO<FocusTargetModifierNode> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final FocusTargetModifierElement f63338OooOo0o = new FocusTargetModifierElement();

        private FocusTargetModifierElement() {
        }

        @Override // o00oO0O.AbstractC25519Oooo0oO
        public final InterfaceC21233OooO0o.OooO0OO OooO00o() {
            return new FocusTargetModifierNode();
        }

        @Override // o00oO0O.AbstractC25519Oooo0oO
        public final InterfaceC21233OooO0o.OooO0OO OooO0oo(InterfaceC21233OooO0o.OooO0OO oooO0OO) {
            FocusTargetModifierNode node = (FocusTargetModifierNode) oooO0OO;
            OooOOO0.OooO0oO(node, "node");
            return node;
        }

        public final boolean equals(Object obj) {
            return obj == this;
        }

        public final int hashCode() {
            return 1739042953;
        }
    }

    public static final class OooO00o extends OooOOOO implements oO0O000o.OooO00o<C32460OooOooO> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ FocusTargetModifierNode f63339OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C24034Oooo00O<InterfaceC21266OooOOO0> f63340OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(C24034Oooo00O<InterfaceC21266OooOOO0> c24034Oooo00O, FocusTargetModifierNode focusTargetModifierNode) {
            super(0);
            this.f63340OooOo0o = c24034Oooo00O;
            this.f63339OooOo = focusTargetModifierNode;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [Ooooo0o.OooOOOo, T] */
        @Override // oO0O000o.OooO00o
        public final C32460OooOooO invoke() {
            this.f63340OooOo0o.f80942OooOo0o = this.f63339OooOo.Oooo00o();
            return C32460OooOooO.f116667OooO00o;
        }
    }

    @Override // o00oO0O.InterfaceC25537OooooO0
    public final void OooOo0() {
        EnumC21278OooOoO0 enumC21278OooOoO0 = this.f63337Oooo00O;
        Oooo0();
        if (OooOOO0.OooO0O0(enumC21278OooOoO0, this.f63337Oooo00O)) {
            return;
        }
        C21258OooO0o.OooO0O0(this);
    }

    public final void Oooo0() {
        EnumC21278OooOoO0 enumC21278OooOoO0 = this.f63337Oooo00O;
        if (enumC21278OooOoO0 == EnumC21278OooOoO0.f61684OooOo0o || enumC21278OooOoO0 == EnumC21278OooOoO0.f61686OooOoO0) {
            C24034Oooo00O c24034Oooo00O = new C24034Oooo00O();
            C25538OooooOO.OooO00o(this, new OooO00o(c24034Oooo00O, this));
            T t = c24034Oooo00O.f80942OooOo0o;
            if (t == 0) {
                OooOOO0.OooOOOO("focusProperties");
                throw null;
            }
            if (((InterfaceC21266OooOOO0) t).OooO0O0()) {
                return;
            }
            OooO.OooO0o(this).getFocusOwner().OooOOO0(true);
        }
    }

    @Override // OoooOoO.InterfaceC21233OooO0o.OooO0OO
    public final void Oooo00O() {
        EnumC21278OooOoO0 enumC21278OooOoO0 = this.f63337Oooo00O;
        if (enumC21278OooOoO0 == EnumC21278OooOoO0.f61684OooOo0o || enumC21278OooOoO0 == EnumC21278OooOoO0.f61686OooOoO0) {
            OooO.OooO0o(this).getFocusOwner().OooOOO0(true);
            return;
        }
        EnumC21278OooOoO0 enumC21278OooOoO02 = EnumC21278OooOoO0.f61683OooOo;
        EnumC21278OooOoO0 enumC21278OooOoO03 = EnumC21278OooOoO0.f61685OooOoO;
        if (enumC21278OooOoO0 == enumC21278OooOoO02) {
            Oooo0O0();
            this.f63337Oooo00O = enumC21278OooOoO03;
        } else if (enumC21278OooOoO0 == enumC21278OooOoO03) {
            Oooo0O0();
        }
    }

    public final C21268OooOOOo Oooo00o() {
        C25527OoooO00 c25527OoooO00;
        C21268OooOOOo c21268OooOOOo = new C21268OooOOOo();
        c21268OooOOOo.f61666OooO00o = true;
        C21274OooOo00 c21274OooOo00 = C21274OooOo00.f61678OooO0O0;
        c21268OooOOOo.f61667OooO0O0 = c21274OooOo00;
        c21268OooOOOo.f61668OooO0OO = c21274OooOo00;
        c21268OooOOOo.f61669OooO0Oo = c21274OooOo00;
        c21268OooOOOo.f61671OooO0o0 = c21274OooOo00;
        c21268OooOOOo.f61670OooO0o = c21274OooOo00;
        c21268OooOOOo.f61672OooO0oO = c21274OooOo00;
        c21268OooOOOo.f61673OooO0oo = c21274OooOo00;
        c21268OooOOOo.f61665OooO = c21274OooOo00;
        c21268OooOOOo.f61674OooOO0 = C21265OooOOO.f61663OooOo0o;
        c21268OooOOOo.f61675OooOO0O = C21267OooOOOO.f61664OooOo0o;
        InterfaceC21233OooO0o.OooO0OO oooO0OO = this.f61604OooOo0o;
        if (!oooO0OO.f61612Oooo000) {
            throw new IllegalStateException("Check failed.");
        }
        InterfaceC21233OooO0o.OooO0OO oooO0OO2 = oooO0OO.f61605OooOoO;
        C25503OooOoOO c25503OooOoOOOooO0o0 = OooO.OooO0o0(this);
        loop0: while (c25503OooOoOOOooO0o0 != null) {
            if ((c25503OooOoOOOooO0o0.f86970o000oOoO.f87088OooO0o0.f61606OooOoO0 & 3072) != 0) {
                while (oooO0OO2 != null) {
                    int i = oooO0OO2.f61603OooOo;
                    if ((i & 3072) != 0) {
                        if ((i & 1024) != 0) {
                            break loop0;
                        }
                        if (!(oooO0OO2 instanceof InterfaceC21270OooOOo0)) {
                            throw new IllegalStateException("Check failed.");
                        }
                        ((InterfaceC21270OooOOo0) oooO0OO2).OooOoo0(c21268OooOOOo);
                    }
                    oooO0OO2 = oooO0OO2.f61605OooOoO;
                }
            }
            c25503OooOoOOOooO0o0 = c25503OooOoOOOooO0o0.OooOOoo();
            oooO0OO2 = (c25503OooOoOOOooO0o0 == null || (c25527OoooO00 = c25503OooOoOOOooO0o0.f86970o000oOoO) == null) ? null : c25527OoooO00.f87086OooO0Oo;
        }
        return c21268OooOOOo;
    }

    public final void Oooo0O0() {
        C25527OoooO00 c25527OoooO00;
        InterfaceC21233OooO0o.OooO0OO oooO0OO = this.f61604OooOo0o;
        if (!oooO0OO.f61612Oooo000) {
            throw new IllegalStateException("Check failed.");
        }
        InterfaceC21233OooO0o.OooO0OO oooO0OO2 = oooO0OO.f61605OooOoO;
        C25503OooOoOO c25503OooOoOOOooO0o0 = OooO.OooO0o0(this);
        while (c25503OooOoOOOooO0o0 != null) {
            if ((c25503OooOoOOOooO0o0.f86970o000oOoO.f87088OooO0o0.f61606OooOoO0 & 5120) != 0) {
                while (oooO0OO2 != null) {
                    int i = oooO0OO2.f61603OooOo;
                    if ((i & 5120) != 0 && (i & 1024) == 0) {
                        if (!(oooO0OO2 instanceof InterfaceC21259OooO0o0)) {
                            throw new IllegalStateException("Check failed.");
                        }
                        OooO.OooO0o(this).getFocusOwner().OooO0O0((InterfaceC21259OooO0o0) oooO0OO2);
                    }
                    oooO0OO2 = oooO0OO2.f61605OooOoO;
                }
            }
            c25503OooOoOOOooO0o0 = c25503OooOoOOOooO0o0.OooOOoo();
            oooO0OO2 = (c25503OooOoOOOooO0o0 == null || (c25527OoooO00 = c25503OooOoOOOooO0o0.f86970o000oOoO) == null) ? null : c25527OoooO00.f87086OooO0Oo;
        }
    }
}
