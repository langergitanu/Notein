package oO0O0O0;

import com.aspose.words.ControlChar;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.jvm.internal.C24028OooOoO0;
import kotlin.jvm.internal.C24035Oooo00o;
import oO0O0O0.C32580OoooOO0;
import oO0O0OO.InterfaceC32609OooOo0;
import oO0O0OO.InterfaceC32625Oooo0o0;
import oO0O0OO.InterfaceC32627Oooo0oo;
import oO0O0OO.InterfaceC32641OooooOO;
import oO0OOOO.C32944OooO0Oo;
import oO0Oo00.C33194OooO0O0;
import oO0Ooo.AbstractC33320OooOoo;
import oO0OooO0.C33479OooO0o;
import oOoo0.InterfaceC34601OooOO0O;
import oOoo0.InterfaceC34602OooOO0o;

/* JADX INFO: renamed from: oO0O0O0.OooOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32561OooOoo implements InterfaceC34601OooOO0O {

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public static final /* synthetic */ InterfaceC34602OooOO0o<Object>[] f117006OooOoOO;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final int f117007OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final AbstractC32538OooO0oO<?> f117008OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final C32580OoooOO0.OooO00o f117009OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final InterfaceC34601OooOO0O.OooO00o f117010OooOoO0;

    /* JADX INFO: renamed from: oO0O0O0.OooOoo$OooO00o */
    public static final class OooO00o extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<List<? extends Annotation>> {
        public OooO00o() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final List<? extends Annotation> invoke() {
            return C32585OoooOoo.OooO0Oo(C32561OooOoo.this.OooO());
        }
    }

    static {
        kotlin.jvm.internal.Oooo0 oooo0 = C24035Oooo00o.f80943OooO00o;
        f117006OooOoOO = new InterfaceC34602OooOO0o[]{oooo0.OooO0oO(new C24028OooOoO0(oooo0.OooO0O0(C32561OooOoo.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ParameterDescriptor;")), oooo0.OooO0oO(new C24028OooOoO0(oooo0.OooO0O0(C32561OooOoo.class), "annotations", "getAnnotations()Ljava/util/List;"))};
    }

    public C32561OooOoo(AbstractC32538OooO0oO<?> abstractC32538OooO0oO, int i, InterfaceC34601OooOO0O.OooO00o oooO00o, oO0O000o.OooO00o<? extends InterfaceC32625Oooo0o0> oooO00o2) {
        this.f117008OooOo0o = abstractC32538OooO0oO;
        this.f117007OooOo = i;
        this.f117010OooOoO0 = oooO00o;
        this.f117009OooOoO = C32580OoooOO0.OooO00o(null, oooO00o2);
        C32580OoooOO0.OooO00o(null, new OooO00o());
    }

    public final InterfaceC32625Oooo0o0 OooO() {
        InterfaceC34602OooOO0o<Object> interfaceC34602OooOO0o = f117006OooOoOO[0];
        Object objInvoke = this.f117009OooOoO.invoke();
        kotlin.jvm.internal.OooOOO0.OooO0o(objInvoke, "<get-descriptor>(...)");
        return (InterfaceC32625Oooo0o0) objInvoke;
    }

    @Override // oOoo0.InterfaceC34601OooOO0O
    public final boolean OooO00o() {
        InterfaceC32625Oooo0o0 interfaceC32625Oooo0o0OooO = OooO();
        return (interfaceC32625Oooo0o0OooO instanceof InterfaceC32641OooooOO) && ((InterfaceC32641OooooOO) interfaceC32625Oooo0o0OooO).o0ooOoO() != null;
    }

    @Override // oOoo0.InterfaceC34601OooOO0O
    public final boolean OooO0o() {
        InterfaceC32625Oooo0o0 interfaceC32625Oooo0o0OooO = OooO();
        InterfaceC32641OooooOO interfaceC32641OooooOO = interfaceC32625Oooo0o0OooO instanceof InterfaceC32641OooooOO ? (InterfaceC32641OooooOO) interfaceC32625Oooo0o0OooO : null;
        if (interfaceC32641OooooOO != null) {
            return C33194OooO0O0.OooO00o(interfaceC32641OooooOO);
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C32561OooOoo)) {
            return false;
        }
        C32561OooOoo c32561OooOoo = (C32561OooOoo) obj;
        if (kotlin.jvm.internal.OooOOO0.OooO0O0(this.f117008OooOo0o, c32561OooOoo.f117008OooOo0o)) {
            return this.f117007OooOo == c32561OooOoo.f117007OooOo;
        }
        return false;
    }

    @Override // oOoo0.InterfaceC34601OooOO0O
    public final int getIndex() {
        return this.f117007OooOo;
    }

    @Override // oOoo0.InterfaceC34601OooOO0O
    public final InterfaceC34601OooOO0O.OooO00o getKind() {
        return this.f117010OooOoO0;
    }

    @Override // oOoo0.InterfaceC34601OooOO0O
    public final String getName() {
        InterfaceC32625Oooo0o0 interfaceC32625Oooo0o0OooO = OooO();
        InterfaceC32641OooooOO interfaceC32641OooooOO = interfaceC32625Oooo0o0OooO instanceof InterfaceC32641OooooOO ? (InterfaceC32641OooooOO) interfaceC32625Oooo0o0OooO : null;
        if (interfaceC32641OooooOO != null && !interfaceC32641OooooOO.OooO0Oo().Ooooooo()) {
            C33479OooO0o name = interfaceC32641OooooOO.getName();
            kotlin.jvm.internal.OooOOO0.OooO0o(name, "valueParameter.name");
            if (!name.f120980OooOo) {
                return name.OooO0O0();
            }
        }
        return null;
    }

    @Override // oOoo0.InterfaceC34601OooOO0O
    public final C32567Oooo getType() {
        AbstractC33320OooOoo type = OooO().getType();
        kotlin.jvm.internal.OooOOO0.OooO0o(type, "descriptor.type");
        return new C32567Oooo(type, new C32565OooOooO(this));
    }

    public final int hashCode() {
        return Integer.hashCode(this.f117007OooOo) + (this.f117008OooOo0o.hashCode() * 31);
    }

    public final String toString() {
        String strOooO0O0;
        C32944OooO0Oo c32944OooO0Oo = C32581OoooOOO.f117086OooO00o;
        StringBuilder sb = new StringBuilder();
        int iOrdinal = this.f117010OooOoO0.ordinal();
        if (iOrdinal == 0) {
            sb.append("instance parameter");
        } else if (iOrdinal == 1) {
            sb.append("extension receiver parameter");
        } else if (iOrdinal == 2) {
            sb.append("parameter #" + this.f117007OooOo + ControlChar.SPACE_CHAR + getName());
        }
        sb.append(" of ");
        oO0O0OO.OooO0O0 oooO0O0OooOOO = this.f117008OooOo0o.OooOOO();
        if (oooO0O0OooOOO instanceof InterfaceC32627Oooo0oo) {
            strOooO0O0 = C32581OoooOOO.OooO0OO((InterfaceC32627Oooo0oo) oooO0O0OooOOO);
        } else {
            if (!(oooO0O0OooOOO instanceof InterfaceC32609OooOo0)) {
                throw new IllegalStateException(("Illegal callable: " + oooO0O0OooOOO).toString());
            }
            strOooO0O0 = C32581OoooOOO.OooO0O0((InterfaceC32609OooOo0) oooO0O0OooOOO);
        }
        sb.append(strOooO0O0);
        String string = sb.toString();
        kotlin.jvm.internal.OooOOO0.OooO0o(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
