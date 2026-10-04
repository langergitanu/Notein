package OooooOO;

import OooOoo0.C20706o00000oO;
import OoooOoO.InterfaceC21233OooO0o;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oOo000Oo.C34436OooOoOO;
import oo000o.AbstractC34655Oooo0o;
import oo000o.InterfaceC34641OooOo0O;
import oo000o.InterfaceC34643OooOoO;

/* JADX INFO: renamed from: OooooOO.o0ooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21367o0ooOOo extends InterfaceC21233OooO0o.OooO0OO implements o00oO0O.OooOo {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public C21366o0ooOO0 f61805Oooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public float f61806Oooo0;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public float f61807Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public float f61808Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public float f61809Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public long f61810Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public boolean f61811Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public InterfaceC21361o00oO0O f61812Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public long f61813Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public long f61814Oooo0oo;

    /* JADX INFO: renamed from: OooooOO.o0ooOOo$OooO00o */
    public static final class OooO00o extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<AbstractC34655Oooo0o.OooO00o, C32460OooOooO> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ C21367o0ooOOo f61815OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ AbstractC34655Oooo0o f61816OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(AbstractC34655Oooo0o abstractC34655Oooo0o, C21367o0ooOOo c21367o0ooOOo) {
            super(1);
            this.f61816OooOo0o = abstractC34655Oooo0o;
            this.f61815OooOo = c21367o0ooOOo;
        }

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final C32460OooOooO invoke(AbstractC34655Oooo0o.OooO00o oooO00o) {
            AbstractC34655Oooo0o.OooO00o layout = oooO00o;
            kotlin.jvm.internal.OooOOO0.OooO0oO(layout, "$this$layout");
            AbstractC34655Oooo0o.OooO00o.OooO0oo(layout, this.f61816OooOo0o, 0, 0, this.f61815OooOo.f61805Oooo, 4);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    @Override // o00oO0O.OooOo
    public final oo000o.OooOo OooO0O0(InterfaceC34643OooOoO interfaceC34643OooOoO, InterfaceC34641OooOo0O measurable, long j) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(measurable, "measurable");
        AbstractC34655Oooo0o abstractC34655Oooo0oO00ooo = measurable.o00ooo(j);
        return interfaceC34643OooOoO.o00oO0O(abstractC34655Oooo0oO00ooo.f124845OooOo0o, abstractC34655Oooo0oO00ooo.f124844OooOo, C34436OooOoOO.f123455OooOo0o, new OooO00o(abstractC34655Oooo0oO00ooo, this));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SimpleGraphicsLayerModifier(scaleX=");
        sb.append(this.f61807Oooo00O);
        sb.append(", scaleY=");
        sb.append(this.f61808Oooo00o);
        sb.append(", alpha = ");
        sb.append(this.f61806Oooo0);
        sb.append(", translationX=0.0, translationY=0.0, shadowElevation=0.0, rotationX=0.0, rotationY=0.0, rotationZ=0.0, cameraDistance=");
        sb.append(this.f61809Oooo0O0);
        sb.append(", transformOrigin=");
        sb.append((Object) o0OO00O.OooO00o(this.f61810Oooo0OO));
        sb.append(", shape=");
        sb.append(this.f61812Oooo0o0);
        sb.append(", clip=");
        sb.append(this.f61811Oooo0o);
        sb.append(", renderEffect=null, ambientShadowColor=");
        C20706o00000oO.OooO0O0(this.f61813Oooo0oO, ", spotShadowColor=", sb);
        sb.append((Object) C21348Ooooo0o.OooO(this.f61814Oooo0oo));
        sb.append(", compositingStrategy=CompositingStrategy(value=0))");
        return sb.toString();
    }
}
