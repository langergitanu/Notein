package oO0O0oOO;

import com.huawei.hms.network.embedded.C18437z2;
import java.util.Map;
import kotlin.jvm.internal.C24028OooOoO0;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import kotlin.jvm.internal.Oooo0;
import o00oO0O.C25515Oooo0O0;
import oO0O0OO.o000oOoO;
import oO0O0oOo.InterfaceC32777OooO0oO;
import oO0O0ooO.InterfaceC32815OooO00o;
import oO0O0ooO.InterfaceC32816OooO0O0;
import oO0OOo.AbstractC33038OooO0oO;
import oO0Ooo.AbstractC33320OooOoo;
import oO0Ooo.AbstractC33328Oooo0O0;
import oO0Ooo0.InterfaceC33370OooOO0;
import oO0OooO0.C33477OooO0OO;
import oO0OooO0.C33479OooO0o;
import oOo000Oo.C34436OooOoOO;
import oOo000Oo.OooOo;
import oOo00OOo.C34495OooO0OO;
import oOo00OOo.C34499OooO0oO;
import oOoo0.InterfaceC34602OooOO0o;

/* JADX INFO: renamed from: oO0O0oOO.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C32762OooO0O0 implements oOo0oooO.OooO0OO, InterfaceC32777OooO0oO {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final /* synthetic */ InterfaceC34602OooOO0o<Object>[] f117714OooO0o;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C33477OooO0OO f117715OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o000oOoO f117716OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final InterfaceC33370OooOO0 f117717OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final InterfaceC32816OooO0O0 f117718OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final boolean f117719OooO0o0;

    /* JADX INFO: renamed from: oO0O0oOO.OooO0O0$OooO00o */
    public static final class OooO00o extends OooOOOO implements oO0O000o.OooO00o<AbstractC33328Oooo0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ C32762OooO0O0 f117720OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C34499OooO0oO f117721OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(C34499OooO0oO c34499OooO0oO, C32762OooO0O0 c32762OooO0O0) {
            super(0);
            this.f117721OooOo0o = c34499OooO0oO;
            this.f117720OooOo = c32762OooO0O0;
        }

        @Override // oO0O000o.OooO00o
        public final AbstractC33328Oooo0O0 invoke() {
            AbstractC33328Oooo0O0 abstractC33328Oooo0O0OooOOO = this.f117721OooOo0o.f123639OooO00o.f123619OooOOOO.f117524OooOoO.OooO(this.f117720OooOo.f117715OooO00o).OooOOO();
            OooOOO0.OooO0o(abstractC33328Oooo0O0OooOOO, "c.module.builtIns.getBui…qName(fqName).defaultType");
            return abstractC33328Oooo0O0OooOOO;
        }
    }

    static {
        Oooo0 oooo0 = C24035Oooo00o.f80943OooO00o;
        f117714OooO0o = new InterfaceC34602OooOO0o[]{oooo0.OooO0oO(new C24028OooOoO0(oooo0.OooO0O0(C32762OooO0O0.class), C18437z2.f56754h, "getType()Lorg/jetbrains/kotlin/types/SimpleType;"))};
    }

    public C32762OooO0O0(C34499OooO0oO c, InterfaceC32815OooO00o interfaceC32815OooO00o, C33477OooO0OO fqName) {
        OooOOO0.OooO0oO(c, "c");
        OooOOO0.OooO0oO(fqName, "fqName");
        this.f117715OooO00o = fqName;
        C34495OooO0OO c34495OooO0OO = c.f123639OooO00o;
        this.f117716OooO0O0 = interfaceC32815OooO00o != null ? c34495OooO0OO.f123614OooOO0.OooO00o(interfaceC32815OooO00o) : o000oOoO.f117308OooO00o;
        this.f117717OooO0OO = c34495OooO0OO.f123606OooO00o.OooO00o(new OooO00o(c, this));
        this.f117718OooO0Oo = interfaceC32815OooO00o != null ? (InterfaceC32816OooO0O0) OooOo.Oooo0oo(interfaceC32815OooO00o.getArguments()) : null;
        this.f117719OooO0o0 = false;
    }

    @Override // oO0O0oOo.InterfaceC32777OooO0oO
    public final boolean OooO00o() {
        return this.f117719OooO0o0;
    }

    @Override // oOo0oooO.OooO0OO
    public Map<C33479OooO0o, AbstractC33038OooO0oO<?>> OooO0O0() {
        return C34436OooOoOO.f123455OooOo0o;
    }

    @Override // oOo0oooO.OooO0OO
    public final C33477OooO0OO OooO0OO() {
        return this.f117715OooO00o;
    }

    @Override // oOo0oooO.OooO0OO
    public final o000oOoO getSource() {
        return this.f117716OooO0O0;
    }

    @Override // oOo0oooO.OooO0OO
    public final AbstractC33320OooOoo getType() {
        return (AbstractC33328Oooo0O0) C25515Oooo0O0.OooO00o(this.f117717OooO0OO, f117714OooO0o[0]);
    }
}
