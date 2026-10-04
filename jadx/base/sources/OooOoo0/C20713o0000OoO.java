package OooOoo0;

import o0000Ooo.C24227OooO00o;
import o00oO0O.AbstractC25516Oooo0OO;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oOo000Oo.C34436OooOoOO;
import oo000o.AbstractC34655Oooo0o;
import oo000o.InterfaceC34630OooOO0;
import oo000o.InterfaceC34637OooOOo;
import oo000o.InterfaceC34641OooOo0O;
import oo000o.InterfaceC34643OooOoO;

/* JADX INFO: renamed from: OooOoo0.o0000OoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20713o0000OoO implements InterfaceC34637OooOOo {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final C20709o0000Oo f59487OooOo0o;

    /* JADX INFO: renamed from: OooOoo0.o0000OoO$OooO00o */
    public static final class OooO00o extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<AbstractC34655Oooo0o.OooO00o, C32460OooOooO> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ int f59488OooOo;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ AbstractC34655Oooo0o f59490OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(int i, AbstractC34655Oooo0o abstractC34655Oooo0o) {
            super(1);
            this.f59488OooOo = i;
            this.f59490OooOoO0 = abstractC34655Oooo0o;
        }

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final C32460OooOooO invoke(AbstractC34655Oooo0o.OooO00o oooO00o) {
            AbstractC34655Oooo0o.OooO00o layout = oooO00o;
            kotlin.jvm.internal.OooOOO0.OooO0oO(layout, "$this$layout");
            AbstractC34655Oooo0o.OooO00o.OooO0oO(layout, this.f59490OooOoO0, 0, -oO0O00oo.OooOO0.OooO0o(C20713o0000OoO.this.f59487OooOo0o.OooO0o(), 0, this.f59488OooOo));
            return C32460OooOooO.f116667OooO00o;
        }
    }

    public C20713o0000OoO(C20709o0000Oo c20709o0000Oo) {
        this.f59487OooOo0o = c20709o0000Oo;
    }

    @Override // oo000o.InterfaceC34637OooOOo
    public final oo000o.OooOo OooO0O0(InterfaceC34643OooOoO interfaceC34643OooOoO, InterfaceC34641OooOo0O measurable, long j) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(measurable, "measurable");
        if (C24227OooO00o.OooO0oO(j) == Integer.MAX_VALUE) {
            throw new IllegalStateException("Vertically scrollable component was measured with an infinity maximum height constraints, which is disallowed. One of the common reasons is nesting layouts like LazyColumn and Column(Modifier.verticalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyColumn scope. There are could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        }
        AbstractC34655Oooo0o abstractC34655Oooo0oO00ooo = measurable.o00ooo(C24227OooO00o.OooO00o(0, C24227OooO00o.OooO0oo(j), 0, Integer.MAX_VALUE, 5, j));
        int i = abstractC34655Oooo0oO00ooo.f124845OooOo0o;
        int iOooO0oo = C24227OooO00o.OooO0oo(j);
        if (i > iOooO0oo) {
            i = iOooO0oo;
        }
        int i2 = abstractC34655Oooo0oO00ooo.f124844OooOo;
        int iOooO0oO = C24227OooO00o.OooO0oO(j);
        if (i2 > iOooO0oO) {
            i2 = iOooO0oO;
        }
        int i3 = abstractC34655Oooo0oO00ooo.f124844OooOo - i2;
        C20709o0000Oo c20709o0000Oo = this.f59487OooOo0o;
        c20709o0000Oo.f59476OooO0Oo.setValue(Integer.valueOf(i3));
        if (c20709o0000Oo.OooO0o() > i3) {
            c20709o0000Oo.f59473OooO00o.setValue(Integer.valueOf(i3));
        }
        c20709o0000Oo.f59474OooO0O0.setValue(Integer.valueOf(i2));
        return interfaceC34643OooOoO.o00oO0O(i, i2, C34436OooOoOO.f123455OooOo0o, new OooO00o(i3, abstractC34655Oooo0oO00ooo));
    }

    @Override // oo000o.InterfaceC34637OooOOo
    public final int OooO0OO(AbstractC25516Oooo0OO abstractC25516Oooo0OO, InterfaceC34630OooOO0 measurable, int i) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(measurable, "measurable");
        return measurable.OooooOO(Integer.MAX_VALUE);
    }

    @Override // oo000o.InterfaceC34637OooOOo
    public final int OooO0Oo(AbstractC25516Oooo0OO abstractC25516Oooo0OO, InterfaceC34630OooOO0 measurable, int i) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(measurable, "measurable");
        return measurable.Oooo00O(i);
    }

    @Override // oo000o.InterfaceC34637OooOOo
    public final int OooO0o(AbstractC25516Oooo0OO abstractC25516Oooo0OO, InterfaceC34630OooOO0 measurable, int i) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(measurable, "measurable");
        return measurable.OooOOoo(i);
    }

    @Override // oo000o.InterfaceC34637OooOOo
    public final int OooOOoo(AbstractC25516Oooo0OO abstractC25516Oooo0OO, InterfaceC34630OooOO0 measurable, int i) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(measurable, "measurable");
        return measurable.OoooO(Integer.MAX_VALUE);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C20713o0000OoO) {
            return this.f59487OooOo0o.equals(((C20713o0000OoO) obj).f59487OooOo0o);
        }
        return false;
    }

    public final int hashCode() {
        return (this.f59487OooOo0o.hashCode() * 961) + 1;
    }

    public final String toString() {
        return "ScrollingLayoutModifier(scrollerState=" + this.f59487OooOo0o + ", isReversed=false, isVertical=true)";
    }
}
