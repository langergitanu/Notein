package Oooo0O0;

import OooOo.C20496Oooo0o0;
import OooOooo.C20756OooOO0O;
import OooOooo.C20803Ooooo0o;
import OooOooo.C20805OooooOO;
import OooOooo.C20806OooooOo;
import Oooo0oO.C21035OooOOo;
import Oooo0oO.C21081o00000o0;
import Oooo0oO.InterfaceC21033OooOOOO;
import Oooo0oO.o00000OO;
import OoooOoO.C21234OooO0o0;
import OoooOoO.InterfaceC21233OooO0o;
import Ooooo00.C21245OooO0O0;
import OooooO0.C21289OooO0o;
import OooooO0.C21290OooO0o0;
import OooooO0.C21294OooOO0O;
import OooooOO.C21325OooOooo;
import OooooOO.C21328Oooo000;
import OooooOO.C21329Oooo00O;
import OooooOO.C21330Oooo00o;
import OooooOO.C21348Ooooo0o;
import OooooOO.C21354OoooooO;
import OooooOO.InterfaceC21342OoooOOO;
import OooooOO.InterfaceC21352Oooooo;
import Oooooo0.C21397OooO00o;
import Oooooo0.InterfaceC21402OooO0o0;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import o00000o0.EnumC24118OooO0oO;
import o00000oo.C24122OooO00o;
import o00000oo.C24137OooOoO;
import o0000Ooo.C24226OooO;
import o0000Ooo.C24235OooOO0;
import o0000Ooo.EnumC24238OooOOO;
import o0000Ooo.InterfaceC24229OooO0OO;
import o000oOoO.C24633OooO00o;
import o000oOoO.C24636OooO0O0;
import o0ooOO0.C31604o0ooOoO;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: renamed from: Oooo0O0.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20908OooO00o {

    /* JADX INFO: renamed from: Oooo0O0.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C18977OooO00o extends kotlin.jvm.internal.OooOOOO implements InterfaceC32508OooOOOo<InterfaceC21033OooOOOO, Integer, C32460OooOooO> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ boolean f60307OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC21233OooO0o f60308OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final /* synthetic */ boolean f60309OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ EnumC24118OooO0oO f60310OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public final /* synthetic */ int f60311OooOoOO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18977OooO00o(InterfaceC21233OooO0o interfaceC21233OooO0o, boolean z, EnumC24118OooO0oO enumC24118OooO0oO, boolean z2, int i) {
            super(2);
            this.f60308OooOo0o = interfaceC21233OooO0o;
            this.f60307OooOo = z;
            this.f60310OooOoO0 = enumC24118OooO0oO;
            this.f60309OooOoO = z2;
            this.f60311OooOoOO = i;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final C32460OooOooO invoke(InterfaceC21033OooOOOO interfaceC21033OooOOOO, Integer num) throws Throwable {
            num.intValue();
            C20908OooO00o.OooO00o(this.f60308OooOo0o, this.f60307OooOo, this.f60310OooOoO0, this.f60309OooOoO, interfaceC21033OooOOOO, C21081o00000o0.OooO0oo(this.f60311OooOoOO | 1));
            return C32460OooOooO.f116667OooO00o;
        }
    }

    public static final void OooO00o(InterfaceC21233OooO0o modifier, boolean z, EnumC24118OooO0oO direction, boolean z2, InterfaceC21033OooOOOO interfaceC21033OooOOOO, int i) throws Throwable {
        int i2;
        kotlin.jvm.internal.OooOOO0.OooO0oO(modifier, "modifier");
        kotlin.jvm.internal.OooOOO0.OooO0oO(direction, "direction");
        C21035OooOOo c21035OooOOoOooOOO0 = interfaceC21033OooOOOO.OooOOO0(47957398);
        if ((i & 14) == 0) {
            i2 = (c21035OooOOoOooOOO0.OooO0oo(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= c21035OooOOoOooOOO0.OooO(z) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= c21035OooOOoOooOOO0.OooO0oo(direction) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= c21035OooOOoOooOOO0.OooO(z2) ? 2048 : 1024;
        }
        if ((i2 & 5851) == 1170 && c21035OooOOoOooOOO0.OooO00o()) {
            c21035OooOOoOooOOO0.OooO0o();
        } else {
            float f = OooOo00.f60372OooO00o;
            float f2 = OooOo00.f60373OooO0O0;
            C20756OooOO0O c20756OooOO0O = C20803Ooooo0o.f59726OooO00o;
            C31604o0ooOoO.OooO00o oooO00o = C31604o0ooOoO.f112933OooO00o;
            C20806OooooOo.OooO0O0(c21035OooOOoOooOOO0, C21234OooO0o0.OooO00o(modifier.o00ooo(new C20805OooooOO(f, f2, f, f2, true, oooO00o)), oooO00o, new C20915OooO0oo(z, direction, z2)));
        }
        o00000OO o00000ooOoooO0 = c21035OooOOoOooOOO0.OoooO0();
        if (o00000ooOoooO0 == null) {
            return;
        }
        o00000ooOoooO0.f61064OooO0Oo = new C18977OooO00o(modifier, z, direction, z2, i);
    }

    public static final void OooO0O0(long j, EnumC20916OooOO0o enumC20916OooOO0o, C24633OooO00o c24633OooO00o, InterfaceC21033OooOOOO interfaceC21033OooOOOO, int i) throws Throwable {
        int i2;
        C24633OooO00o c24633OooO00o2;
        C21035OooOOo c21035OooOOoOooOOO0 = interfaceC21033OooOOOO.OooOOO0(-1409050158);
        if ((i & 14) == 0) {
            i2 = (c21035OooOOoOooOOO0.Oooo0(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= c21035OooOOoOooOOO0.OooO0oo(enumC20916OooOO0o) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= c21035OooOOoOooOOO0.OooOo0o(c24633OooO00o) ? 256 : 128;
        }
        if ((i2 & 731) == 146 && c21035OooOOoOooOOO0.OooO00o()) {
            c21035OooOOoOooOOO0.OooO0o();
            c24633OooO00o2 = c24633OooO00o;
        } else {
            long jOooO00o = C24235OooOO0.OooO00o(oO0O00O.OooO00o.OooO0O0(C21290OooO0o0.OooO0OO(j)), oO0O00O.OooO00o.OooO0O0(C21290OooO0o0.OooO0Oo(j)));
            C24226OooO c24226OooO = new C24226OooO(jOooO00o);
            c21035OooOOoOooOOO0.OooOo00(511388516);
            boolean zOooO0oo = c21035OooOOoOooOOO0.OooO0oo(c24226OooO) | c21035OooOOoOooOOO0.OooO0oo(enumC20916OooOO0o);
            Object objOooOo0 = c21035OooOOoOooOOO0.OooOo0();
            if (zOooO0oo || objOooOo0 == InterfaceC21033OooOOOO.OooO00o.f60894OooO00o) {
                objOooOo0 = new OooOO0O(enumC20916OooOO0o, jOooO00o);
                c21035OooOOoOooOOO0.OooOOo0(objOooOo0);
            }
            c21035OooOOoOooOOO0.Oooo(false);
            C24122OooO00o.OooO00o((OooOO0O) objOooOo0, null, new C24137OooOoO(15), c24633OooO00o, c21035OooOOoOooOOO0, ((i2 << 3) & 7168) | 384, 2);
            c24633OooO00o2 = c24633OooO00o;
        }
        o00000OO o00000ooOoooO0 = c21035OooOOoOooOOO0.OoooO0();
        if (o00000ooOoooO0 == null) {
            return;
        }
        o00000ooOoooO0.f61064OooO0Oo = new C20909OooO0O0(j, enumC20916OooOO0o, c24633OooO00o2, i);
    }

    public static final void OooO0OO(long j, boolean z, EnumC24118OooO0oO direction, boolean z2, InterfaceC21233OooO0o modifier, InterfaceC21033OooOOOO interfaceC21033OooOOOO, int i) throws Throwable {
        int i2;
        C21035OooOOo c21035OooOOo;
        kotlin.jvm.internal.OooOOO0.OooO0oO(direction, "direction");
        kotlin.jvm.internal.OooOOO0.OooO0oO(modifier, "modifier");
        C21035OooOOo c21035OooOOoOooOOO0 = interfaceC21033OooOOOO.OooOOO0(-616295642);
        if ((i & 14) == 0) {
            i2 = (c21035OooOOoOooOOO0.Oooo0(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= c21035OooOOoOooOOO0.OooO(z) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= c21035OooOOoOooOOO0.OooO0oo(direction) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= c21035OooOOoOooOOO0.OooO(z2) ? 2048 : 1024;
        }
        if ((57344 & i) == 0) {
            i2 |= c21035OooOOoOooOOO0.OooO0oo(modifier) ? 16384 : 8192;
        }
        if ((458752 & i) == 0) {
            i2 |= c21035OooOOoOooOOO0.OooOo0o(null) ? 131072 : 65536;
        }
        int i3 = i2;
        if ((374491 & i3) == 74898 && c21035OooOOoOooOOO0.OooO00o()) {
            c21035OooOOoOooOOO0.OooO0o();
            c21035OooOOo = c21035OooOOoOooOOO0;
        } else {
            EnumC24118OooO0oO enumC24118OooO0oO = EnumC24118OooO0oO.f81271OooOo;
            EnumC24118OooO0oO enumC24118OooO0oO2 = EnumC24118OooO0oO.f81272OooOo0o;
            c21035OooOOo = c21035OooOOoOooOOO0;
            OooO0O0(j, (!z ? !((direction != enumC24118OooO0oO2 || z2) && !(direction == enumC24118OooO0oO && z2)) : !((direction == enumC24118OooO0oO2 && !z2) || (direction == enumC24118OooO0oO && z2))) ? EnumC20916OooOO0o.f60349OooOo : EnumC20916OooOO0o.f60350OooOo0o, C24636OooO0O0.OooO0O0(c21035OooOOoOooOOO0, 732099485, new C20911OooO0Oo(i3, j, modifier, direction, z, z2)), c21035OooOOo, (i3 & 14) | 384);
        }
        o00000OO o00000ooOoooO0 = c21035OooOOo.OoooO0();
        if (o00000ooOoooO0 == null) {
            return;
        }
        o00000ooOoooO0.f61064OooO0Oo = new C20913OooO0o0(i, j, modifier, direction, z, z2);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final InterfaceC21352Oooooo OooO0Oo(C21245OooO0O0 c21245OooO0O0, float f) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(c21245OooO0O0, "<this>");
        int iCeil = ((int) Math.ceil(f)) * 2;
        C21329Oooo00O c21329Oooo00OOooO00o = OooOO0.f60342OooO00o;
        C21325OooOooo c21325OooOooo = OooOO0.f60343OooO0O0;
        C21397OooO00o c21397OooO00o = OooOO0.f60344OooO0OO;
        if (c21329Oooo00OOooO00o == null || c21325OooOooo == null) {
            c21329Oooo00OOooO00o = C21354OoooooO.OooO00o(iCeil, iCeil, 24);
            OooOO0.f60342OooO00o = c21329Oooo00OOooO00o;
            Canvas canvas = C21328Oooo000.f61738OooO00o;
            c21325OooOooo = new C21325OooOooo();
            c21325OooOooo.f61733OooO00o = new Canvas(C21330Oooo00o.OooO00o(c21329Oooo00OOooO00o));
            OooOO0.f60343OooO0O0 = c21325OooOooo;
        } else {
            Bitmap bitmap = c21329Oooo00OOooO00o.f61739OooO00o;
            if (iCeil > bitmap.getWidth() || iCeil > bitmap.getHeight()) {
            }
        }
        C21329Oooo00O c21329Oooo00O = c21329Oooo00OOooO00o;
        C21325OooOooo c21325OooOooo2 = c21325OooOooo;
        if (c21397OooO00o == null) {
            c21397OooO00o = new C21397OooO00o();
            OooOO0.f60344OooO0OO = c21397OooO00o;
        }
        C21397OooO00o c21397OooO00o2 = c21397OooO00o;
        EnumC24238OooOOO layoutDirection = c21245OooO0O0.f61627OooOo0o.getLayoutDirection();
        Bitmap bitmap2 = c21329Oooo00O.f61739OooO00o;
        long jOooO00o = C21294OooOO0O.OooO00o(bitmap2.getWidth(), bitmap2.getHeight());
        C21397OooO00o.C18987OooO00o c18987OooO00o = c21397OooO00o2.f61912OooOo0o;
        InterfaceC24229OooO0OO interfaceC24229OooO0OO = c18987OooO00o.f61915OooO00o;
        EnumC24238OooOOO enumC24238OooOOO = c18987OooO00o.f61916OooO0O0;
        InterfaceC21342OoooOOO interfaceC21342OoooOOO = c18987OooO00o.f61917OooO0OO;
        long j = c18987OooO00o.f61918OooO0Oo;
        c18987OooO00o.f61915OooO00o = c21245OooO0O0;
        kotlin.jvm.internal.OooOOO0.OooO0oO(layoutDirection, "<set-?>");
        c18987OooO00o.f61916OooO0O0 = layoutDirection;
        c18987OooO00o.f61917OooO0OO = c21325OooOooo2;
        c18987OooO00o.f61918OooO0Oo = jOooO00o;
        c21325OooOooo2.OooOOo0();
        InterfaceC21402OooO0o0.OooOooO(c21397OooO00o2, C21348Ooooo0o.f61761OooO0O0, 0L, c21397OooO00o2.OooOOo0(), 58);
        InterfaceC21402OooO0o0.OooOooO(c21397OooO00o2, C20496Oooo0o0.OooO0OO(4278190080L), C21290OooO0o0.f61718OooO0O0, C21294OooOO0O.OooO00o(f, f), 120);
        InterfaceC21402OooO0o0.OoooOoO(c21397OooO00o2, C20496Oooo0o0.OooO0OO(4278190080L), f, C21289OooO0o.OooO00o(f, f), 120);
        c21325OooOooo2.OooOO0o();
        kotlin.jvm.internal.OooOOO0.OooO0oO(interfaceC24229OooO0OO, "<set-?>");
        c18987OooO00o.f61915OooO00o = interfaceC24229OooO0OO;
        kotlin.jvm.internal.OooOOO0.OooO0oO(enumC24238OooOOO, "<set-?>");
        c18987OooO00o.f61916OooO0O0 = enumC24238OooOOO;
        kotlin.jvm.internal.OooOOO0.OooO0oO(interfaceC21342OoooOOO, "<set-?>");
        c18987OooO00o.f61917OooO0OO = interfaceC21342OoooOOO;
        c18987OooO00o.f61918OooO0Oo = j;
        return c21329Oooo00O;
    }
}
