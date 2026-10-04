package Oooo0;

import OooOoo.EnumC20624Oooo0oO;
import Oooo0oO.C21105o000OoO;
import OoooOOO.C21176OooO;
import OoooOOO.C21177OooO00o;
import OoooOOO.C21185OooOO0;
import OoooOOO.InterfaceC21186OooOO0O;
import OooooO0.C21291OooO0oO;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import java.util.List;
import kotlin.jvm.internal.C24039Oooo0o0;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O000o.InterfaceC32508OooOOOo;
import oOo000Oo.C34429OooOOo0;
import oo0o0Oo.C34696OooOOoo;

/* JADX INFO: renamed from: Oooo0.o000Ooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20888o000Ooo {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final C21185OooOO0 f60199OooO0o;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f60200OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f60201OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public C21291OooO0oO f60202OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public long f60203OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f60204OooO0o0;

    /* JADX INFO: renamed from: Oooo0.o000Ooo$OooO00o */
    public static final class OooO00o extends kotlin.jvm.internal.OooOOOO implements InterfaceC32508OooOOOo<InterfaceC21186OooOO0O, C20888o000Ooo, List<? extends Object>> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO00o f60205OooOo0o = new OooO00o(2);

        /* JADX WARN: Multi-variable type inference failed */
        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final List<? extends Object> invoke(InterfaceC21186OooOO0O interfaceC21186OooOO0O, C20888o000Ooo c20888o000Ooo) {
            InterfaceC21186OooOO0O listSaver = interfaceC21186OooOO0O;
            C20888o000Ooo it = c20888o000Ooo;
            kotlin.jvm.internal.OooOOO0.OooO0oO(listSaver, "$this$listSaver");
            kotlin.jvm.internal.OooOOO0.OooO0oO(it, "it");
            return C34429OooOOo0.OooOO0o(Float.valueOf(it.OooO00o()), Boolean.valueOf(((EnumC20624Oooo0oO) it.f60204OooO0o0.getValue()) == EnumC20624Oooo0oO.f59071OooOo0o));
        }
    }

    /* JADX INFO: renamed from: Oooo0.o000Ooo$OooO0O0 */
    public static final class OooO0O0 extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<List<? extends Object>, C20888o000Ooo> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO0O0 f60206OooOo0o = new OooO0O0(1);

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final C20888o000Ooo invoke(List<? extends Object> list) {
            List<? extends Object> restored = list;
            kotlin.jvm.internal.OooOOO0.OooO0oO(restored, "restored");
            Object obj = restored.get(1);
            kotlin.jvm.internal.OooOOO0.OooO0o0(obj, "null cannot be cast to non-null type kotlin.Boolean");
            EnumC20624Oooo0oO enumC20624Oooo0oO = ((Boolean) obj).booleanValue() ? EnumC20624Oooo0oO.f59071OooOo0o : EnumC20624Oooo0oO.f59070OooOo;
            Object obj2 = restored.get(0);
            kotlin.jvm.internal.OooOOO0.OooO0o0(obj2, "null cannot be cast to non-null type kotlin.Float");
            return new C20888o000Ooo(enumC20624Oooo0oO, ((Float) obj2).floatValue());
        }
    }

    static {
        C21177OooO00o c21177OooO00o = new C21177OooO00o(OooO00o.f60205OooOo0o);
        OooO0O0 oooO0O0 = OooO0O0.f60206OooOo0o;
        kotlin.jvm.internal.OooOOO0.OooO0o0(oooO0O0, "null cannot be cast to non-null type kotlin.Function1<kotlin.Any, Original of androidx.compose.runtime.saveable.ListSaverKt.listSaver?>");
        C24039Oooo0o0.OooO0o0(1, oooO0O0);
        C21185OooOO0 c21185OooOO0 = C21176OooO.f61418OooO00o;
        f60199OooO0o = new C21185OooOO0(c21177OooO00o, oooO0O0);
    }

    public C20888o000Ooo(EnumC20624Oooo0oO enumC20624Oooo0oO, float f) {
        Float fValueOf = Float.valueOf(f);
        Oooo0oO.o000O0O0 o000o0o02 = Oooo0oO.o000O0O0.f61218OooO00o;
        this.f60200OooO00o = C21105o000OoO.OooO0OO(fValueOf, o000o0o02);
        this.f60201OooO0O0 = C21105o000OoO.OooO0OO(Float.valueOf(0.0f), o000o0o02);
        this.f60202OooO0OO = C21291OooO0oO.f61723OooO0o0;
        this.f60203OooO0Oo = C34696OooOOoo.f124978OooO0O0;
        this.f60204OooO0o0 = C21105o000OoO.OooO0OO(enumC20624Oooo0oO, o000o0o02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final float OooO00o() {
        return ((Number) this.f60200OooO00o.getValue()).floatValue();
    }

    public final void OooO0O0(EnumC20624Oooo0oO enumC20624Oooo0oO, C21291OooO0oO c21291OooO0oO, int i, int i2) {
        float f = i2 - i;
        this.f60201OooO0O0.setValue(Float.valueOf(f));
        C21291OooO0oO c21291OooO0oO2 = this.f60202OooO0OO;
        float f2 = c21291OooO0oO2.f61724OooO00o;
        float f3 = c21291OooO0oO.f61724OooO00o;
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = this.f60200OooO00o;
        float f4 = c21291OooO0oO.f61725OooO0O0;
        if (f3 != f2 || f4 != c21291OooO0oO2.f61725OooO0O0) {
            boolean z = enumC20624Oooo0oO == EnumC20624Oooo0oO.f59071OooOo0o;
            if (z) {
                f3 = f4;
            }
            float f5 = z ? c21291OooO0oO.f61727OooO0Oo : c21291OooO0oO.f61726OooO0OO;
            float fOooO00o = OooO00o();
            float f6 = i;
            float f7 = fOooO00o + f6;
            parcelableSnapshotMutableState.setValue(Float.valueOf(OooO00o() + ((f5 <= f7 && (f3 >= fOooO00o || f5 - f3 <= f6)) ? (f3 >= fOooO00o || f5 - f3 > f6) ? 0.0f : f3 - fOooO00o : f5 - f7)));
            this.f60202OooO0OO = c21291OooO0oO;
        }
        parcelableSnapshotMutableState.setValue(Float.valueOf(oO0O00oo.OooOO0.OooO0o0(OooO00o(), 0.0f, f)));
    }

    public C20888o000Ooo() {
        this(EnumC20624Oooo0oO.f59071OooOo0o, 0.0f);
    }
}
