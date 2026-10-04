package Ooooo0o;

import OoooOoO.InterfaceC21233OooO0o;
import OooooO0.C21291OooO0oO;
import android.view.KeyEvent;
import androidx.compose.p002ui.focus.FocusOwnerImpl$modifier$1;
import androidx.compose.p002ui.focus.FocusTargetModifierNode;
import androidx.compose.p002ui.platform.AndroidComposeView;
import java.util.ArrayList;
import kotlin.jvm.internal.OooOOO0;
import o0000Ooo.EnumC24238OooOOO;
import o00O0O.InterfaceC24825OooO0o0;
import o00oO0O.AbstractC25519Oooo0oO;
import o00oO0O.C25503OooOoOO;
import o00oO0O.C25527OoooO00;
import o00oO0O.InterfaceC25492OooO0oo;
import o00ooo.C25796OooO0OO;
import o00ooo.InterfaceC25794OooO00o;
import oO00ooO.C32442OooOO0o;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: Ooooo0o.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21264OooOO0o implements InterfaceC21263OooOO0O {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C21261OooO0oo f61658OooO0O0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public EnumC24238OooOOO f61660OooO0Oo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final FocusTargetModifierNode f61657OooO00o = new FocusTargetModifierNode();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final FocusOwnerImpl$modifier$1 f61659OooO0OO = new AbstractC25519Oooo0oO<FocusTargetModifierNode>() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$modifier$1
        @Override // o00oO0O.AbstractC25519Oooo0oO
        public final InterfaceC21233OooO0o.OooO0OO OooO00o() {
            return this.f63334OooOo0o.f61657OooO00o;
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
            return this.f63334OooOo0o.f61657OooO00o.hashCode();
        }
    };

    /* JADX INFO: renamed from: Ooooo0o.OooOO0o$OooO00o */
    public static final class OooO00o extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<FocusTargetModifierNode, Boolean> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO00o f61661OooOo0o = new OooO00o(1);

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final Boolean invoke(FocusTargetModifierNode focusTargetModifierNode) {
            FocusTargetModifierNode it = focusTargetModifierNode;
            kotlin.jvm.internal.OooOOO0.OooO0oO(it, "it");
            return Boolean.valueOf(C21277OooOoO.OooO0OO(it));
        }
    }

    /* JADX INFO: renamed from: Ooooo0o.OooOO0o$OooO0O0 */
    public static final class OooO0O0 extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<FocusTargetModifierNode, Boolean> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ FocusTargetModifierNode f61662OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(FocusTargetModifierNode focusTargetModifierNode) {
            super(1);
            this.f61662OooOo0o = focusTargetModifierNode;
        }

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final Boolean invoke(FocusTargetModifierNode focusTargetModifierNode) {
            FocusTargetModifierNode destination = focusTargetModifierNode;
            kotlin.jvm.internal.OooOOO0.OooO0oO(destination, "destination");
            if (destination.equals(this.f61662OooOo0o)) {
                return Boolean.FALSE;
            }
            InterfaceC21233OooO0o.OooO0OO OooO0OO2 = o00oO0O.OooO.OooO0OO(destination, 1024);
            if (!(OooO0OO2 instanceof FocusTargetModifierNode)) {
                OooO0OO2 = null;
            }
            if (((FocusTargetModifierNode) OooO0OO2) != null) {
                return Boolean.valueOf(C21277OooOoO.OooO0OO(destination));
            }
            throw new IllegalStateException("Focus search landed at the root.");
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.compose.ui.focus.FocusOwnerImpl$modifier$1] */
    public C21264OooOO0o(AndroidComposeView.C21600OooO0o0 c21600OooO0o0) {
        this.f61658OooO0O0 = new C21261OooO0oo(c21600OooO0o0);
    }

    @Override // Ooooo0o.InterfaceC21263OooOO0O
    public final void OooO(boolean z, boolean z2) {
        EnumC21278OooOoO0 enumC21278OooOoO0;
        FocusTargetModifierNode focusTargetModifierNode = this.f61657OooO00o;
        EnumC21278OooOoO0 enumC21278OooOoO02 = focusTargetModifierNode.f63337Oooo00O;
        if (C21277OooOoO.OooO00o(focusTargetModifierNode, z, z2)) {
            int iOrdinal = enumC21278OooOoO02.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
                enumC21278OooOoO0 = EnumC21278OooOoO0.f61684OooOo0o;
            } else {
                if (iOrdinal != 3) {
                    throw new C32442OooOO0o();
                }
                enumC21278OooOoO0 = EnumC21278OooOoO0.f61685OooOoO;
            }
            focusTargetModifierNode.f63337Oooo00O = enumC21278OooOoO0;
        }
    }

    @Override // Ooooo0o.InterfaceC21263OooOO0O
    public final void OooO00o(EnumC24238OooOOO enumC24238OooOOO) {
        this.f61660OooO0Oo = enumC24238OooOOO;
    }

    @Override // Ooooo0o.InterfaceC21263OooOO0O
    public final void OooO0O0(InterfaceC21259OooO0o0 node) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(node, "node");
        C21261OooO0oo c21261OooO0oo = this.f61658OooO0O0;
        c21261OooO0oo.getClass();
        c21261OooO0oo.OooO00o(c21261OooO0oo.f61654OooO0OO, node);
    }

    @Override // Ooooo0o.InterfaceC21263OooOO0O
    public final void OooO0OO() {
        FocusTargetModifierNode focusTargetModifierNode = this.f61657OooO00o;
        if (focusTargetModifierNode.f63337Oooo00O == EnumC21278OooOoO0.f61685OooOoO) {
            EnumC21278OooOoO0 enumC21278OooOoO0 = EnumC21278OooOoO0.f61684OooOo0o;
            focusTargetModifierNode.getClass();
            focusTargetModifierNode.f63337Oooo00O = enumC21278OooOoO0;
        }
    }

    @Override // Ooooo0o.InterfaceC21263OooOO0O
    public final void OooO0Oo(FocusTargetModifierNode node) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(node, "node");
        C21261OooO0oo c21261OooO0oo = this.f61658OooO0O0;
        c21261OooO0oo.getClass();
        c21261OooO0oo.OooO00o(c21261OooO0oo.f61653OooO0O0, node);
    }

    @Override // Ooooo0o.InterfaceC21263OooOO0O
    public final boolean OooO0o(C25796OooO0OO c25796OooO0OO) {
        InterfaceC25794OooO00o interfaceC25794OooO00o;
        int size;
        FocusTargetModifierNode focusTargetModifierNodeOooO00o = C21279OooOoOO.OooO00o(this.f61657OooO00o);
        if (focusTargetModifierNodeOooO00o != null) {
            InterfaceC25492OooO0oo interfaceC25492OooO0ooOooO0OO = o00oO0O.OooO.OooO0OO(focusTargetModifierNodeOooO00o, 16384);
            if (!(interfaceC25492OooO0ooOooO0OO instanceof InterfaceC25794OooO00o)) {
                interfaceC25492OooO0ooOooO0OO = null;
            }
            interfaceC25794OooO00o = (InterfaceC25794OooO00o) interfaceC25492OooO0ooOooO0OO;
        } else {
            interfaceC25794OooO00o = null;
        }
        if (interfaceC25794OooO00o != null) {
            ArrayList arrayListOooO0O0 = o00oO0O.OooO.OooO0O0(interfaceC25794OooO00o, 16384);
            ArrayList arrayList = arrayListOooO0O0 != null ? arrayListOooO0O0 : null;
            if (arrayList != null && arrayList.size() - 1 >= 0) {
                while (true) {
                    int i = size - 1;
                    if (((InterfaceC25794OooO00o) arrayList.get(size)).OooO(c25796OooO0OO)) {
                        return true;
                    }
                    if (i < 0) {
                        break;
                    }
                    size = i;
                }
            }
            if (interfaceC25794OooO00o.OooO(c25796OooO0OO) || interfaceC25794OooO00o.OooOO0O(c25796OooO0OO)) {
                return true;
            }
            if (arrayList != null) {
                int size2 = arrayList.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    if (((InterfaceC25794OooO00o) arrayList.get(i2)).OooOO0O(c25796OooO0OO)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // Ooooo0o.InterfaceC21263OooOO0O
    public final FocusOwnerImpl$modifier$1 OooO0o0() {
        return this.f61659OooO0OO;
    }

    @Override // Ooooo0o.InterfaceC21263OooOO0O
    public final void OooO0oO(InterfaceC21270OooOOo0 node) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(node, "node");
        C21261OooO0oo c21261OooO0oo = this.f61658OooO0O0;
        c21261OooO0oo.getClass();
        c21261OooO0oo.OooO00o(c21261OooO0oo.f61655OooO0Oo, node);
    }

    @Override // Ooooo0o.InterfaceC21263OooOO0O
    public final boolean OooO0oo(KeyEvent keyEvent) {
        Object obj;
        InterfaceC24825OooO0o0 interfaceC24825OooO0o0;
        int size;
        FocusTargetModifierNode focusTargetModifierNodeOooO00o = C21279OooOoOO.OooO00o(this.f61657OooO00o);
        if (focusTargetModifierNodeOooO00o == null) {
            throw new IllegalStateException("Event can't be processed because we do not have an active focus target.");
        }
        InterfaceC21233OooO0o.OooO0OO oooO0OO = focusTargetModifierNodeOooO00o.f61604OooOo0o;
        if (!oooO0OO.f61612Oooo000) {
            throw new IllegalStateException("Check failed.");
        }
        if ((oooO0OO.f61606OooOoO0 & 9216) != 0) {
            obj = null;
            for (InterfaceC21233OooO0o.OooO0OO oooO0OO2 = oooO0OO.f61607OooOoOO; oooO0OO2 != null; oooO0OO2 = oooO0OO2.f61607OooOoOO) {
                int i = oooO0OO2.f61603OooOo;
                if ((i & 9216) != 0) {
                    if ((i & 1024) != 0) {
                        interfaceC24825OooO0o0 = (InterfaceC24825OooO0o0) obj;
                        break;
                    }
                    if (!(oooO0OO2 instanceof InterfaceC24825OooO0o0)) {
                        throw new IllegalStateException("Check failed.");
                    }
                    obj = oooO0OO2;
                }
            }
        } else {
            obj = null;
        }
        interfaceC24825OooO0o0 = (InterfaceC24825OooO0o0) obj;
        if (interfaceC24825OooO0o0 == null) {
            InterfaceC21233OooO0o.OooO0OO OooO0OO2 = o00oO0O.OooO.OooO0OO(focusTargetModifierNodeOooO00o, 8192);
            if (!(OooO0OO2 instanceof InterfaceC24825OooO0o0)) {
                OooO0OO2 = null;
            }
            interfaceC24825OooO0o0 = (InterfaceC24825OooO0o0) OooO0OO2;
        }
        if (interfaceC24825OooO0o0 != null) {
            ArrayList arrayListOooO0O0 = o00oO0O.OooO.OooO0O0(interfaceC24825OooO0o0, 8192);
            ArrayList arrayList = arrayListOooO0O0 != null ? arrayListOooO0O0 : null;
            if (arrayList != null && arrayList.size() - 1 >= 0) {
                while (true) {
                    int i2 = size - 1;
                    if (((InterfaceC24825OooO0o0) arrayList.get(size)).OooOO0(keyEvent)) {
                        return true;
                    }
                    if (i2 < 0) {
                        break;
                    }
                    size = i2;
                }
            }
            if (interfaceC24825OooO0o0.OooOO0(keyEvent) || interfaceC24825OooO0o0.OooOo0O(keyEvent)) {
                return true;
            }
            if (arrayList != null) {
                int size2 = arrayList.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    if (((InterfaceC24825OooO0o0) arrayList.get(i3)).OooOo0O(keyEvent)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:166:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e9  */
    @Override // Ooooo0o.InterfaceC21253OooO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean OooOO0(int i) {
        C21274OooOo00 c21274OooOo00;
        C21274OooOo00 c21274OooOo002;
        boolean zOooO00o;
        boolean zOooOO0;
        C25527OoooO00 c25527OoooO00;
        Boolean boolOooOO0o;
        FocusTargetModifierNode focusTargetModifierNode = this.f61657OooO00o;
        FocusTargetModifierNode focusTargetModifierNodeOooO00o = C21279OooOoOO.OooO00o(focusTargetModifierNode);
        if (focusTargetModifierNodeOooO00o == null) {
            return false;
        }
        EnumC24238OooOOO enumC24238OooOOO = this.f61660OooO0Oo;
        if (enumC24238OooOOO == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("layoutDirection");
            throw null;
        }
        C21268OooOOOo c21268OooOOOoOooo00o = focusTargetModifierNodeOooO00o.Oooo00o();
        int i2 = 4;
        FocusTargetModifierNode focusTargetModifierNode2 = null;
        if (i == 1) {
            c21274OooOo00 = c21268OooOOOoOooo00o.f61667OooO0O0;
        } else if (i == 2) {
            c21274OooOo00 = c21268OooOOOoOooo00o.f61668OooO0OO;
        } else if (i == 5) {
            c21274OooOo00 = c21268OooOOOoOooo00o.f61669OooO0Oo;
        } else if (i == 6) {
            c21274OooOo00 = c21268OooOOOoOooo00o.f61671OooO0o0;
        } else if (i == 3) {
            int iOrdinal = enumC24238OooOOO.ordinal();
            if (iOrdinal == 0) {
                c21274OooOo00 = c21268OooOOOoOooo00o.f61673OooO0oo;
            } else {
                if (iOrdinal != 1) {
                    throw new C32442OooOO0o();
                }
                c21274OooOo00 = c21268OooOOOoOooo00o.f61665OooO;
            }
            if (kotlin.jvm.internal.OooOOO0.OooO0O0(c21274OooOo00, C21274OooOo00.f61678OooO0O0)) {
                c21274OooOo00 = null;
            }
            if (c21274OooOo00 == null) {
                c21274OooOo00 = c21268OooOOOoOooo00o.f61670OooO0o;
            }
        } else if (i == 4) {
            int iOrdinal2 = enumC24238OooOOO.ordinal();
            if (iOrdinal2 == 0) {
                c21274OooOo002 = c21268OooOOOoOooo00o.f61665OooO;
            } else {
                if (iOrdinal2 != 1) {
                    throw new C32442OooOO0o();
                }
                c21274OooOo002 = c21268OooOOOoOooo00o.f61673OooO0oo;
            }
            c21274OooOo00 = !kotlin.jvm.internal.OooOOO0.OooO0O0(c21274OooOo002, C21274OooOo00.f61678OooO0O0) ? c21274OooOo002 : null;
            if (c21274OooOo00 == null) {
                c21274OooOo00 = c21268OooOOOoOooo00o.f61672OooO0oO;
            }
        } else if (i == 7) {
            c21268OooOOOoOooo00o.f61674OooOO0.getClass();
            c21274OooOo00 = C21274OooOo00.f61678OooO0O0;
        } else {
            if (i != 8) {
                throw new IllegalStateException("invalid FocusDirection");
            }
            c21268OooOOOoOooo00o.f61675OooOO0O.getClass();
            c21274OooOo00 = C21274OooOo00.f61678OooO0O0;
        }
        if (kotlin.jvm.internal.OooOOO0.OooO0O0(c21274OooOo00, C21274OooOo00.f61679OooO0OO)) {
            return false;
        }
        if (!kotlin.jvm.internal.OooOOO0.OooO0O0(c21274OooOo00, C21274OooOo00.f61678OooO0O0)) {
            return c21274OooOo00.OooO00o(OooO00o.f61661OooOo0o);
        }
        EnumC24238OooOOO enumC24238OooOOO2 = this.f61660OooO0Oo;
        if (enumC24238OooOOO2 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("layoutDirection");
            throw null;
        }
        OooO0O0 oooO0O0 = new OooO0O0(focusTargetModifierNodeOooO00o);
        if (i == 1 || i == 2) {
            if (i == 1) {
                zOooO00o = C21282OooOooO.OooO0O0(focusTargetModifierNode, oooO0O0);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("This function should only be used for 1-D focus search");
                }
                zOooO00o = C21282OooOooO.OooO00o(focusTargetModifierNode, oooO0O0);
            }
        } else if (i == 3 || i == 4 || i == 5 || i == 6) {
            Boolean boolOooOO0o2 = Oooo000.OooOO0o(focusTargetModifierNode, i, oooO0O0);
            if (boolOooOO0o2 != null) {
                zOooO00o = boolOooOO0o2.booleanValue();
            }
        } else if (i == 7) {
            int iOrdinal3 = enumC24238OooOOO2.ordinal();
            if (iOrdinal3 != 0) {
                if (iOrdinal3 != 1) {
                    throw new C32442OooOO0o();
                }
                i2 = 3;
            }
            FocusTargetModifierNode focusTargetModifierNodeOooO00o2 = C21279OooOoOO.OooO00o(focusTargetModifierNode);
            zOooO00o = (focusTargetModifierNodeOooO00o2 == null || (boolOooOO0o = Oooo000.OooOO0o(focusTargetModifierNodeOooO00o2, i2, oooO0O0)) == null) ? false : boolOooOO0o.booleanValue();
        } else {
            if (i != 8) {
                throw new IllegalStateException(("Focus search invoked with invalid FocusDirection " + ((Object) C21256OooO0OO.OooO00o(i))).toString());
            }
            FocusTargetModifierNode focusTargetModifierNodeOooO00o3 = C21279OooOoOO.OooO00o(focusTargetModifierNode);
            if (focusTargetModifierNodeOooO00o3 != null) {
                InterfaceC21233OooO0o.OooO0OO oooO0OO = focusTargetModifierNodeOooO00o3.f61604OooOo0o;
                if (!oooO0OO.f61612Oooo000) {
                    throw new IllegalStateException("Check failed.");
                }
                InterfaceC21233OooO0o.OooO0OO oooO0OO2 = oooO0OO.f61605OooOoO;
                C25503OooOoOO c25503OooOoOOOooO0o0 = o00oO0O.OooO.OooO0o0(focusTargetModifierNodeOooO00o3);
                loop0: while (true) {
                    if (c25503OooOoOOOooO0o0 == null) {
                        break;
                    }
                    if ((c25503OooOoOOOooO0o0.f86970o000oOoO.f87088OooO0o0.f61606OooOoO0 & 1024) != 0) {
                        while (oooO0OO2 != null) {
                            if ((oooO0OO2.f61603OooOo & 1024) != 0 && (oooO0OO2 instanceof FocusTargetModifierNode)) {
                                FocusTargetModifierNode focusTargetModifierNode3 = (FocusTargetModifierNode) oooO0OO2;
                                if (focusTargetModifierNode3.Oooo00o().f61666OooO00o) {
                                    focusTargetModifierNode2 = focusTargetModifierNode3;
                                    break loop0;
                                }
                            }
                            oooO0OO2 = oooO0OO2.f61605OooOoO;
                        }
                    }
                    c25503OooOoOOOooO0o0 = c25503OooOoOOOooO0o0.OooOOoo();
                    oooO0OO2 = (c25503OooOoOOOooO0o0 == null || (c25527OoooO00 = c25503OooOoOOOooO0o0.f86970o000oOoO) == null) ? null : c25527OoooO00.f87086OooO0Oo;
                }
            }
            FocusTargetModifierNode focusTargetModifierNode4 = focusTargetModifierNode2;
            if (focusTargetModifierNode4 != null && !focusTargetModifierNode4.equals(focusTargetModifierNode)) {
                zOooO00o = ((Boolean) oooO0O0.invoke(focusTargetModifierNode4)).booleanValue();
            }
        }
        if (!zOooO00o) {
            int iOrdinal4 = focusTargetModifierNode.f63337Oooo00O.ordinal();
            if (iOrdinal4 == 0 || iOrdinal4 == 1 || iOrdinal4 == 2) {
                if (!focusTargetModifierNode.f63337Oooo00O.OooO00o() && (i == 1 || i == 2)) {
                    OooO(false, true);
                    if (focusTargetModifierNode.f63337Oooo00O.OooO00o()) {
                        zOooOO0 = OooOO0(i);
                    }
                    if (zOooOO0) {
                        return false;
                    }
                }
            } else if (iOrdinal4 != 3) {
                throw new C32442OooOO0o();
            }
            zOooOO0 = false;
            if (zOooOO0) {
            }
        }
        return true;
    }

    @Override // Ooooo0o.InterfaceC21263OooOO0O
    public final C21291OooO0oO OooOO0O() {
        FocusTargetModifierNode focusTargetModifierNodeOooO00o = C21279OooOoOO.OooO00o(this.f61657OooO00o);
        if (focusTargetModifierNodeOooO00o != null) {
            return C21279OooOoOO.OooO0O0(focusTargetModifierNodeOooO00o);
        }
        return null;
    }

    @Override // Ooooo0o.InterfaceC21263OooOO0O
    public final void OooOO0o() {
        C21277OooOoO.OooO00o(this.f61657OooO00o, true, true);
    }

    @Override // Ooooo0o.InterfaceC21253OooO
    public final void OooOOO0(boolean z) {
        OooO(z, true);
    }
}
