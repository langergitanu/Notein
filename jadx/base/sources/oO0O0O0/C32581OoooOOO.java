package oO0O0O0;

import java.util.List;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O0OO.InterfaceC32609OooOo0;
import oO0O0OO.InterfaceC32627Oooo0oo;
import oO0O0OO.InterfaceC32629OoooO0;
import oO0O0OO.InterfaceC32641OooooOO;
import oO0OOOO.C32944OooO0Oo;
import oO0Ooo.AbstractC33320OooOoo;
import oO0OooO0.C33479OooO0o;

/* JADX INFO: renamed from: oO0O0O0.OoooOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32581OoooOOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final C32944OooO0Oo f117086OooO00o = oO0OOOO.OooO0OO.f118961OooO00o;

    /* JADX INFO: renamed from: oO0O0O0.OoooOOO$OooO00o */
    public static final class OooO00o extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<InterfaceC32641OooooOO, CharSequence> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO00o f117087OooOo0o = new OooO00o(1);

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final CharSequence invoke(InterfaceC32641OooooOO interfaceC32641OooooOO) {
            C32944OooO0Oo c32944OooO0Oo = C32581OoooOOO.f117086OooO00o;
            AbstractC33320OooOoo type = interfaceC32641OooooOO.getType();
            kotlin.jvm.internal.OooOOO0.OooO0o(type, "it.type");
            return C32581OoooOOO.OooO0Oo(type);
        }
    }

    public static void OooO00o(StringBuilder sb, oO0O0OO.OooO0O0 oooO0O0) {
        InterfaceC32629OoooO0 interfaceC32629OoooO0OooO0oO = C32585OoooOoo.OooO0oO(oooO0O0);
        InterfaceC32629OoooO0 interfaceC32629OoooO0OoooOoo = oooO0O0.OoooOoo();
        if (interfaceC32629OoooO0OooO0oO != null) {
            AbstractC33320OooOoo type = interfaceC32629OoooO0OooO0oO.getType();
            kotlin.jvm.internal.OooOOO0.OooO0o(type, "receiver.type");
            sb.append(OooO0Oo(type));
            sb.append(".");
        }
        boolean z = (interfaceC32629OoooO0OooO0oO == null || interfaceC32629OoooO0OoooOoo == null) ? false : true;
        if (z) {
            sb.append("(");
        }
        if (interfaceC32629OoooO0OoooOoo != null) {
            AbstractC33320OooOoo type2 = interfaceC32629OoooO0OoooOoo.getType();
            kotlin.jvm.internal.OooOOO0.OooO0o(type2, "receiver.type");
            sb.append(OooO0Oo(type2));
            sb.append(".");
        }
        if (z) {
            sb.append(")");
        }
    }

    public static String OooO0O0(InterfaceC32609OooOo0 descriptor) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(descriptor, "descriptor");
        StringBuilder sb = new StringBuilder();
        sb.append("fun ");
        OooO00o(sb, descriptor);
        C33479OooO0o name = descriptor.getName();
        kotlin.jvm.internal.OooOOO0.OooO0o(name, "descriptor.name");
        sb.append(f117086OooO00o.Oooo0oO(name, true));
        List<InterfaceC32641OooooOO> listOooO0o = descriptor.OooO0o();
        kotlin.jvm.internal.OooOOO0.OooO0o(listOooO0o, "descriptor.valueParameters");
        oOo000Oo.OooOo.OoooOO0(listOooO0o, sb, ", ", "(", ")", OooO00o.f117087OooOo0o, 48);
        sb.append(": ");
        AbstractC33320OooOoo returnType = descriptor.getReturnType();
        kotlin.jvm.internal.OooOOO0.OooO0Oo(returnType);
        sb.append(OooO0Oo(returnType));
        String string = sb.toString();
        kotlin.jvm.internal.OooOOO0.OooO0o(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public static String OooO0OO(InterfaceC32627Oooo0oo descriptor) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(descriptor, "descriptor");
        StringBuilder sb = new StringBuilder();
        sb.append(descriptor.OooOoOO() ? "var " : "val ");
        OooO00o(sb, descriptor);
        C33479OooO0o name = descriptor.getName();
        kotlin.jvm.internal.OooOOO0.OooO0o(name, "descriptor.name");
        sb.append(f117086OooO00o.Oooo0oO(name, true));
        sb.append(": ");
        AbstractC33320OooOoo type = descriptor.getType();
        kotlin.jvm.internal.OooOOO0.OooO0o(type, "descriptor.type");
        sb.append(OooO0Oo(type));
        String string = sb.toString();
        kotlin.jvm.internal.OooOOO0.OooO0o(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public static String OooO0Oo(AbstractC33320OooOoo type) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(type, "type");
        return f117086OooO00o.OoooOOo(type);
    }
}
