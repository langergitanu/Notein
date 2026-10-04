package oO0O0oOO;

import com.facebook.soloader.OooOo;
import java.util.Map;
import kotlin.jvm.internal.C24028OooOoO0;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import o00oO0O.C25515Oooo0O0;
import oO00ooO.C32443OooOOO;
import oO0O0O0o.OooOOO;
import oO0O0ooO.InterfaceC32815OooO00o;
import oO0O0ooO.InterfaceC32816OooO0O0;
import oO0O0ooO.InterfaceC32820OooO0o0;
import oO0O0ooO.InterfaceC32827OooOOO0;
import oO0OOo.AbstractC33038OooO0oO;
import oO0OOo.C33033OooO0O0;
import oO0Ooo0.InterfaceC33370OooOO0;
import oO0OooO0.C33479OooO0o;
import oOo000Oo.C34436OooOoOO;
import oOo000Oo.Oooo0;
import oOo00OOo.C34499OooO0oO;
import oOoo0.InterfaceC34602OooOO0o;

/* JADX INFO: renamed from: oO0O0oOO.OooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32769OooOO0 extends C32762OooO0O0 {

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final /* synthetic */ InterfaceC34602OooOO0o<Object>[] f117734OooO0oo;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final InterfaceC33370OooOO0 f117735OooO0oO;

    /* JADX INFO: renamed from: oO0O0oOO.OooOO0$OooO00o */
    public static final class OooO00o extends OooOOOO implements oO0O000o.OooO00o<Map<C33479OooO0o, ? extends AbstractC33038OooO0oO<? extends Object>>> {
        public OooO00o() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final Map<C33479OooO0o, ? extends AbstractC33038OooO0oO<? extends Object>> invoke() {
            C33033OooO0O0 c33033OooO0O0OooO00o;
            InterfaceC32816OooO0O0 interfaceC32816OooO0O0 = C32769OooOO0.this.f117718OooO0Oo;
            if (interfaceC32816OooO0O0 instanceof InterfaceC32820OooO0o0) {
                Object obj = C32766OooO0o0.f117730OooO00o;
                c33033OooO0O0OooO00o = C32766OooO0o0.OooO00o(((InterfaceC32820OooO0o0) interfaceC32816OooO0O0).OooO0O0());
            } else if (interfaceC32816OooO0O0 instanceof InterfaceC32827OooOOO0) {
                Object obj2 = C32766OooO0o0.f117730OooO00o;
                c33033OooO0O0OooO00o = C32766OooO0o0.OooO00o(OooOo.OooO0oO(interfaceC32816OooO0O0));
            } else {
                c33033OooO0O0OooO00o = null;
            }
            Map<C33479OooO0o, ? extends AbstractC33038OooO0oO<? extends Object>> mapOooO0o0 = c33033OooO0O0OooO00o != null ? Oooo0.OooO0o0(new C32443OooOOO(C32763OooO0OO.f117723OooO0O0, c33033OooO0O0OooO00o)) : null;
            return mapOooO0o0 == null ? C34436OooOoOO.f123455OooOo0o : mapOooO0o0;
        }
    }

    static {
        kotlin.jvm.internal.Oooo0 oooo0 = C24035Oooo00o.f80943OooO00o;
        f117734OooO0oo = new InterfaceC34602OooOO0o[]{oooo0.OooO0oO(new C24028OooOoO0(oooo0.OooO0O0(C32769OooOO0.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32769OooOO0(InterfaceC32815OooO00o annotation, C34499OooO0oO c) {
        super(c, annotation, OooOOO.OooO00o.f117170OooOo00);
        OooOOO0.OooO0oO(annotation, "annotation");
        OooOOO0.OooO0oO(c, "c");
        this.f117735OooO0oO = c.f123639OooO00o.f123606OooO00o.OooO00o(new OooO00o());
    }

    @Override // oO0O0oOO.C32762OooO0O0, oOo0oooO.OooO0OO
    public final Map<C33479OooO0o, AbstractC33038OooO0oO<Object>> OooO0O0() {
        return (Map) C25515Oooo0O0.OooO00o(this.f117735OooO0oO, f117734OooO0oo[0]);
    }
}
