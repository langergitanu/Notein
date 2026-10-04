package ooo0o;

import com.orion.notein.richeditor.utils.p606io.FilenameUtils;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.C24030OooOoo;
import oO0O0OO.o000oOoO;
import oO0O0o0O.C32718OooO0O0;
import oO0O0o0O.C32721OooO0o;
import oO0O0o0O.C32722OooO0o0;
import oO0OO00.C32887OooO0oo;
import oO0OO00.C32889OooOOOo;
import oO0OO00.C32890OooOOo;
import oO0OO00.OooO0O0;
import oO0OO0Oo.C32917OooO0O0;
import oO0OO0Oo.C32921OooO0o0;
import oO0OO0Oo.C32922OooO0oO;
import oO0OO0Oo.InterfaceC32918OooO0OO;
import oO0OOO.AbstractC32933OooO0Oo;
import oO0OOO.C32936OooO0oo;
import oO0OOO0.OooO00o;
import oO0OOOO0.AbstractC32954OooO0oo;
import oO0OoO0.AbstractC33252OooOooO;
import oO0OoO0.EnumC33234OooO0OO;
import oO0OoO0.InterfaceC33237OooO0oO;
import oO0Ooo0.C33361OooO0Oo;
import oO0OooO0.C33476OooO0O0;
import oO0OooO0.C33477OooO0OO;
import oO0OooO0.C33479OooO0o;
import oO0o0O0o.C33595OooOOo;
import oO0o0O0o.C33599OooOo0O;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34434OooOoO;
import ooOOOoo0.C35106OooO00o;
import ooOOOoo0.C35107OooO0O0;
import ooo0o.AbstractC35189OooO0Oo.OooO00o;
import ooo0o.C35197OooOOoo;
import ooo0o.OooO00o;

/* JADX INFO: renamed from: ooo0o.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC35189OooO0Oo<A, S extends OooO00o<? extends A>> implements InterfaceC33237OooO0oO<A> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C32721OooO0o f126330OooO00o;

    /* JADX INFO: renamed from: ooo0o.OooO0Oo$OooO00o */
    public static abstract class OooO00o<A> {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: ooo0o.OooO0Oo$OooO0O0 */
    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public static final OooO0O0 f126331OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO0O0 f126332OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public static final /* synthetic */ OooO0O0[] f126333OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public static final OooO0O0 f126334OooOoO0;

        static {
            OooO0O0 oooO0O0 = new OooO0O0("PROPERTY", 0);
            f126332OooOo0o = oooO0O0;
            OooO0O0 oooO0O02 = new OooO0O0("BACKING_FIELD", 1);
            f126331OooOo = oooO0O02;
            OooO0O0 oooO0O03 = new OooO0O0("DELEGATE_FIELD", 2);
            f126334OooOoO0 = oooO0O03;
            f126333OooOoO = new OooO0O0[]{oooO0O0, oooO0O02, oooO0O03};
        }

        public OooO0O0() {
            throw null;
        }

        public static OooO0O0 valueOf(String str) {
            return (OooO0O0) Enum.valueOf(OooO0O0.class, str);
        }

        public static OooO0O0[] values() {
            return (OooO0O0[]) f126333OooOoO.clone();
        }
    }

    public AbstractC35189OooO0Oo(C32721OooO0o c32721OooO0o) {
        this.f126330OooO00o = c32721OooO0o;
    }

    public static C35197OooOOoo OooOOO(AbstractC32954OooO0oo.OooO0OO proto, InterfaceC32918OooO0OO nameResolver, C32922OooO0oO c32922OooO0oO, EnumC33234OooO0OO enumC33234OooO0OO, boolean z) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(proto, "proto");
        kotlin.jvm.internal.OooOOO0.OooO0oO(nameResolver, "nameResolver");
        if (proto instanceof oO0OO00.OooO0OO) {
            oO0OOOO0.OooO0o oooO0o = C32936OooO0oo.f118827OooO00o;
            AbstractC32933OooO0Oo.OooO0O0 oooO0O0OooO00o = C32936OooO0oo.OooO00o((oO0OO00.OooO0OO) proto, nameResolver, c32922OooO0oO);
            if (oooO0O0OooO00o != null) {
                return C35197OooOOoo.OooO00o.OooO00o(oooO0O0OooO00o);
            }
        } else if (proto instanceof C32887OooO0oo) {
            oO0OOOO0.OooO0o oooO0o2 = C32936OooO0oo.f118827OooO00o;
            AbstractC32933OooO0Oo.OooO0O0 oooO0O0OooO0OO = C32936OooO0oo.OooO0OO((C32887OooO0oo) proto, nameResolver, c32922OooO0oO);
            if (oooO0O0OooO0OO != null) {
                return C35197OooOOoo.OooO00o.OooO00o(oooO0O0OooO0OO);
            }
        } else if (proto instanceof oO0OO00.OooOOO0) {
            AbstractC32954OooO0oo.C32956OooO0o0<oO0OO00.OooOOO0, OooO00o.OooO0OO> propertySignature = oO0OOO0.OooO00o.f118832OooO0Oo;
            kotlin.jvm.internal.OooOOO0.OooO0o(propertySignature, "propertySignature");
            OooO00o.OooO0OO oooO0OO = (OooO00o.OooO0OO) C32921OooO0o0.OooO00o(proto, propertySignature);
            if (oooO0OO != null) {
                int iOrdinal = enumC33234OooO0OO.ordinal();
                if (iOrdinal == 1) {
                    return OooO0o.OooO00o((oO0OO00.OooOOO0) proto, nameResolver, c32922OooO0oO, true, true, z);
                }
                if (iOrdinal == 2) {
                    if ((oooO0OO.f118866OooOo & 4) != 4) {
                        return null;
                    }
                    OooO00o.OooO0O0 oooO0O0 = oooO0OO.f118870OooOoOO;
                    kotlin.jvm.internal.OooOOO0.OooO0o(oooO0O0, "signature.getter");
                    return new C35197OooOOoo(nameResolver.getString(oooO0O0.f118858OooOoO0).concat(nameResolver.getString(oooO0O0.f118857OooOoO)));
                }
                if (iOrdinal != 3 || (oooO0OO.f118866OooOo & 8) != 8) {
                    return null;
                }
                OooO00o.OooO0O0 oooO0O02 = oooO0OO.f118872OooOoo0;
                kotlin.jvm.internal.OooOOO0.OooO0o(oooO0O02, "signature.setter");
                return new C35197OooOOoo(nameResolver.getString(oooO0O02.f118858OooOoO0).concat(nameResolver.getString(oooO0O02.f118857OooOoO)));
            }
        }
        return null;
    }

    public static /* synthetic */ List OooOOO0(AbstractC35189OooO0Oo abstractC35189OooO0Oo, AbstractC33252OooOooO abstractC33252OooOooO, C35197OooOOoo c35197OooOOoo, Boolean bool, boolean z, int i) {
        boolean z2 = (i & 4) == 0;
        if ((i & 16) != 0) {
            bool = null;
        }
        return abstractC35189OooO0Oo.OooOO0o(abstractC33252OooOooO, c35197OooOOoo, z2, false, bool, (i & 32) != 0 ? false : z);
    }

    @Override // oO0OoO0.InterfaceC33237OooO0oO
    public final List<A> OooO00o(AbstractC33252OooOooO abstractC33252OooOooO, oO0OO00.OooOOO0 proto) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(proto, "proto");
        return OooOOoo(abstractC33252OooOooO, proto, OooO0O0.f126331OooOo);
    }

    @Override // oO0OoO0.InterfaceC33237OooO0oO
    public final List OooO0O0(AbstractC33252OooOooO abstractC33252OooOooO, AbstractC32954OooO0oo.OooO0OO proto, EnumC33234OooO0OO enumC33234OooO0OO) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(proto, "proto");
        C35197OooOOoo c35197OooOOooOooOOO = OooOOO(proto, abstractC33252OooOooO.f120346OooO00o, abstractC33252OooOooO.f120347OooO0O0, enumC33234OooO0OO, false);
        return c35197OooOOooOooOOO != null ? OooOOO0(this, abstractC33252OooOooO, new C35197OooOOoo(androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder(), c35197OooOOooOooOOO.f126383OooO00o, "@0")), null, false, 60) : C34434OooOoO.f123453OooOo0o;
    }

    @Override // oO0OoO0.InterfaceC33237OooO0oO
    public final ArrayList OooO0OO(AbstractC33252OooOooO.OooO00o container) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(container, "container");
        o000oOoO o000oooo2 = container.f120348OooO0OO;
        C35195OooOOo c35195OooOOo = o000oooo2 instanceof C35195OooOOo ? (C35195OooOOo) o000oooo2 : null;
        InterfaceC35196OooOOo0 interfaceC35196OooOOo0 = c35195OooOOo != null ? c35195OooOOo.f126382OooO0O0 : null;
        if (interfaceC35196OooOOo0 != null) {
            ArrayList arrayList = new ArrayList(1);
            interfaceC35196OooOOo0.OooO0OO(new C35190OooO0o0(this, arrayList));
            return arrayList;
        }
        throw new IllegalStateException(("Class for loading annotations is not found: " + container.f120350OooO0o.OooO0O0()).toString());
    }

    @Override // oO0OoO0.InterfaceC33237OooO0oO
    public final List<A> OooO0o(AbstractC33252OooOooO abstractC33252OooOooO, oO0OO00.OooOOO0 proto) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(proto, "proto");
        return OooOOoo(abstractC33252OooOooO, proto, OooO0O0.f126334OooOoO0);
    }

    @Override // oO0OoO0.InterfaceC33237OooO0oO
    public final List OooO0o0(AbstractC33252OooOooO abstractC33252OooOooO, AbstractC32954OooO0oo.OooO0OO proto, EnumC33234OooO0OO enumC33234OooO0OO) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(proto, "proto");
        if (enumC33234OooO0OO == EnumC33234OooO0OO.f120247OooOo) {
            return OooOOoo(abstractC33252OooOooO, (oO0OO00.OooOOO0) proto, OooO0O0.f126332OooOo0o);
        }
        C35197OooOOoo c35197OooOOooOooOOO = OooOOO(proto, abstractC33252OooOooO.f120346OooO00o, abstractC33252OooOooO.f120347OooO0O0, enumC33234OooO0OO, false);
        return c35197OooOOooOooOOO == null ? C34434OooOoO.f123453OooOo0o : OooOOO0(this, abstractC33252OooOooO, c35197OooOOooOooOOO, null, false, 60);
    }

    @Override // oO0OoO0.InterfaceC33237OooO0oO
    public final ArrayList OooO0oO(C32889OooOOOo proto, InterfaceC32918OooO0OO nameResolver) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(proto, "proto");
        kotlin.jvm.internal.OooOOO0.OooO0oO(nameResolver, "nameResolver");
        Object objOooO0o = proto.OooO0o(oO0OOO0.OooO00o.f118833OooO0o);
        kotlin.jvm.internal.OooOOO0.OooO0o(objOooO0o, "proto.getExtension(JvmProtoBuf.typeAnnotation)");
        Iterable<oO0OO00.OooO00o> iterable = (Iterable) objOooO0o;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(iterable, 10));
        for (oO0OO00.OooO00o it : iterable) {
            kotlin.jvm.internal.OooOOO0.OooO0o(it, "it");
            arrayList.add(((C35191OooO0oO) this).f126340OooO0o0.OooO00o(it, nameResolver));
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    @Override // oO0OoO0.InterfaceC33237OooO0oO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List OooO0oo(AbstractC33252OooOooO abstractC33252OooOooO, AbstractC32954OooO0oo.OooO0OO callableProto, EnumC33234OooO0OO enumC33234OooO0OO, int i, oO0OO00.OooOo00 oooOo00) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(callableProto, "callableProto");
        int i2 = 0;
        C35197OooOOoo c35197OooOOooOooOOO = OooOOO(callableProto, abstractC33252OooOooO.f120346OooO00o, abstractC33252OooOooO.f120347OooO0O0, enumC33234OooO0OO, false);
        if (c35197OooOOooOooOOO == null) {
            return C34434OooOoO.f123453OooOo0o;
        }
        if (callableProto instanceof C32887OooO0oo) {
            int i3 = ((C32887OooO0oo) callableProto).f118227OooOoO0;
            if ((i3 & 32) == 32 || (i3 & 64) == 64) {
                i2 = 1;
            }
        } else if (callableProto instanceof oO0OO00.OooOOO0) {
            int i4 = ((oO0OO00.OooOOO0) callableProto).f118323OooOoO0;
            if ((i4 & 32) == 32 || (i4 & 64) == 64) {
            }
        } else {
            if (!(callableProto instanceof oO0OO00.OooO0OO)) {
                throw new UnsupportedOperationException("Unsupported message: " + callableProto.getClass());
            }
            AbstractC33252OooOooO.OooO00o oooO00o = (AbstractC33252OooOooO.OooO00o) abstractC33252OooOooO;
            if (oooO00o.f120352OooO0oO == OooO0O0.OooO0OO.ENUM_CLASS) {
                i2 = 2;
            } else if (oooO00o.f120353OooO0oo) {
            }
        }
        return OooOOO0(this, abstractC33252OooOooO, new C35197OooOOoo(c35197OooOOooOooOOO.f126383OooO00o + '@' + (i + i2)), null, false, 60);
    }

    @Override // oO0OoO0.InterfaceC33237OooO0oO
    public final ArrayList OooOO0(C32890OooOOo proto, InterfaceC32918OooO0OO nameResolver) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(proto, "proto");
        kotlin.jvm.internal.OooOOO0.OooO0oO(nameResolver, "nameResolver");
        Object objOooO0o = proto.OooO0o(oO0OOO0.OooO00o.f118836OooO0oo);
        kotlin.jvm.internal.OooOOO0.OooO0o(objOooO0o, "proto.getExtension(JvmPr….typeParameterAnnotation)");
        Iterable<oO0OO00.OooO00o> iterable = (Iterable) objOooO0o;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(iterable, 10));
        for (oO0OO00.OooO00o it : iterable) {
            kotlin.jvm.internal.OooOOO0.OooO0o(it, "it");
            arrayList.add(((C35191OooO0oO) this).f126340OooO0o0.OooO00o(it, nameResolver));
        }
        return arrayList;
    }

    @Override // oO0OoO0.InterfaceC33237OooO0oO
    public final List<A> OooOO0O(AbstractC33252OooOooO container, oO0OO00.OooO0o oooO0o) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(container, "container");
        String string = container.f120346OooO00o.getString(oooO0o.f118166OooOoO);
        String desc = oO0OOO.OooO0O0.OooO0O0(((AbstractC33252OooOooO.OooO00o) container).f120350OooO0o.OooO0OO());
        kotlin.jvm.internal.OooOOO0.OooO0oO(desc, "desc");
        return OooOOO0(this, container, new C35197OooOOoo(string + '#' + desc), null, false, 60);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<A> OooOO0o(AbstractC33252OooOooO abstractC33252OooOooO, C35197OooOOoo c35197OooOOoo, boolean z, boolean z2, Boolean bool, boolean z3) {
        List<A> list;
        InterfaceC35196OooOOo0 interfaceC35196OooOOo0OooOOOO = OooOOOO(abstractC33252OooOooO, z, z2, bool, z3);
        if (interfaceC35196OooOOo0OooOOOO == null) {
            if (abstractC33252OooOooO instanceof AbstractC33252OooOooO.OooO00o) {
                o000oOoO o000oooo2 = ((AbstractC33252OooOooO.OooO00o) abstractC33252OooOooO).f120348OooO0OO;
                C35195OooOOo c35195OooOOo = o000oooo2 instanceof C35195OooOOo ? (C35195OooOOo) o000oooo2 : null;
                interfaceC35196OooOOo0OooOOOO = c35195OooOOo != null ? c35195OooOOo.f126382OooO0O0 : null;
            }
        }
        return (interfaceC35196OooOOo0OooOOOO == null || (list = (List) ((OooO00o.C20384OooO00o) ((C33361OooO0Oo.OooOO0O) ((ooo0o.OooO00o) this).f126316OooO0O0).invoke(interfaceC35196OooOOo0OooOOOO)).f126317OooO00o.get(c35197OooOOoo)) == null) ? C34434OooOoO.f123453OooOo0o : list;
    }

    public final InterfaceC35196OooOOo0 OooOOOO(AbstractC33252OooOooO container, boolean z, boolean z2, Boolean bool, boolean z3) {
        AbstractC33252OooOooO.OooO00o oooO00o;
        kotlin.jvm.internal.OooOOO0.OooO0oO(container, "container");
        OooO0O0.OooO0OO oooO0OO = OooO0O0.OooO0OO.INTERFACE;
        C32721OooO0o c32721OooO0o = this.f126330OooO00o;
        o000oOoO o000oooo2 = container.f120348OooO0OO;
        if (z) {
            if (bool == null) {
                throw new IllegalStateException(("isConst should not be null for property (container=" + container + ')').toString());
            }
            if (container instanceof AbstractC33252OooOooO.OooO00o) {
                AbstractC33252OooOooO.OooO00o oooO00o2 = (AbstractC33252OooOooO.OooO00o) container;
                if (oooO00o2.f120352OooO0oO == oooO0OO) {
                    return C35194OooOOOo.OooO00o(c32721OooO0o, oooO00o2.f120350OooO0o.OooO0Oo(C33479OooO0o.OooO0o0("DefaultImpls")), ((C35191OooO0oO) this).f126339OooO0o);
                }
            }
            if (bool.booleanValue() && (container instanceof AbstractC33252OooOooO.OooO0O0)) {
                C35193OooOO0o c35193OooOO0o = o000oooo2 instanceof C35193OooOO0o ? (C35193OooOO0o) o000oooo2 : null;
                oO0Oo0.OooO0OO oooO0OO2 = c35193OooOO0o != null ? c35193OooOO0o.f126368OooO0OO : null;
                if (oooO0OO2 != null) {
                    String strOooO0o0 = oooO0OO2.OooO0o0();
                    kotlin.jvm.internal.OooOOO0.OooO0o(strOooO0o0, "facadeClassName.internalName");
                    return C35194OooOOOo.OooO00o(c32721OooO0o, C33476OooO0O0.OooOO0(new C33477OooO0OO(C33595OooOOo.OooOo0(strOooO0o0, IOUtils.DIR_SEPARATOR_UNIX, FilenameUtils.EXTENSION_SEPARATOR))), ((C35191OooO0oO) this).f126339OooO0o);
                }
            }
        }
        if (z2 && (container instanceof AbstractC33252OooOooO.OooO00o)) {
            AbstractC33252OooOooO.OooO00o oooO00o3 = (AbstractC33252OooOooO.OooO00o) container;
            if (oooO00o3.f120352OooO0oO == OooO0O0.OooO0OO.COMPANION_OBJECT && (oooO00o = oooO00o3.f120351OooO0o0) != null) {
                OooO0O0.OooO0OO oooO0OO3 = OooO0O0.OooO0OO.CLASS;
                OooO0O0.OooO0OO oooO0OO4 = oooO00o.f120352OooO0oO;
                if (oooO0OO4 == oooO0OO3 || oooO0OO4 == OooO0O0.OooO0OO.ENUM_CLASS || (z3 && (oooO0OO4 == oooO0OO || oooO0OO4 == OooO0O0.OooO0OO.ANNOTATION_CLASS))) {
                    o000oOoO o000oooo3 = oooO00o.f120348OooO0OO;
                    C35195OooOOo c35195OooOOo = o000oooo3 instanceof C35195OooOOo ? (C35195OooOOo) o000oooo3 : null;
                    if (c35195OooOOo != null) {
                        return c35195OooOOo.f126382OooO0O0;
                    }
                    return null;
                }
            }
        }
        if (!(container instanceof AbstractC33252OooOooO.OooO0O0) || !(o000oooo2 instanceof C35193OooOO0o)) {
            return null;
        }
        kotlin.jvm.internal.OooOOO0.OooO0o0(o000oooo2, "null cannot be cast to non-null type org.jetbrains.kotlin.load.kotlin.JvmPackagePartSource");
        C35193OooOO0o c35193OooOO0o2 = (C35193OooOO0o) o000oooo2;
        InterfaceC35196OooOOo0 interfaceC35196OooOOo0 = c35193OooOO0o2.f126369OooO0Oo;
        return interfaceC35196OooOOo0 == null ? C35194OooOOOo.OooO00o(c32721OooO0o, c35193OooOO0o2.OooO0O0(), ((C35191OooO0oO) this).f126339OooO0o) : interfaceC35196OooOOo0;
    }

    public final boolean OooOOOo(C33476OooO0O0 c33476OooO0O0) {
        if (c33476OooO0O0.OooO0o() == null || !kotlin.jvm.internal.OooOOO0.OooO0O0(c33476OooO0O0.OooO().OooO0O0(), "Container")) {
            return false;
        }
        InterfaceC35196OooOOo0 interfaceC35196OooOOo0OooO00o = C35194OooOOOo.OooO00o(this.f126330OooO00o, c33476OooO0O0, ((C35191OooO0oO) this).f126339OooO0o);
        if (interfaceC35196OooOOo0OooO00o == null) {
            return false;
        }
        LinkedHashSet linkedHashSet = C35107OooO0O0.f126089OooO00o;
        C24030OooOoo c24030OooOoo = new C24030OooOoo();
        ((C32722OooO0o0) interfaceC35196OooOOo0OooO00o).OooO0OO(new C35106OooO00o(c24030OooOoo));
        return c24030OooOoo.f80938OooOo0o;
    }

    public final C35192OooO0oo OooOOo(C33476OooO0O0 c33476OooO0O0, C32718OooO0O0 c32718OooO0O0, List result) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(result, "result");
        if (C35107OooO0O0.f126089OooO00o.contains(c33476OooO0O0)) {
            return null;
        }
        return OooOOo0(c33476OooO0O0, c32718OooO0O0, result);
    }

    public abstract C35192OooO0oo OooOOo0(C33476OooO0O0 c33476OooO0O0, o000oOoO o000oooo2, List list);

    public final List<A> OooOOoo(AbstractC33252OooOooO abstractC33252OooOooO, oO0OO00.OooOOO0 oooOOO0, OooO0O0 oooO0O0) {
        Boolean boolOooO0OO = C32917OooO0O0.f118783OooOoOO.OooO0OO(oooOOO0.f118322OooOoO);
        boolean zOooO0Oo = C32936OooO0oo.OooO0Oo(oooOOO0);
        OooO0O0 oooO0O02 = OooO0O0.f126332OooOo0o;
        C34434OooOoO c34434OooOoO = C34434OooOoO.f123453OooOo0o;
        C32922OooO0oO c32922OooO0oO = abstractC33252OooOooO.f120347OooO0O0;
        InterfaceC32918OooO0OO interfaceC32918OooO0OO = abstractC33252OooOooO.f120346OooO00o;
        if (oooO0O0 == oooO0O02) {
            C35197OooOOoo c35197OooOOooOooO00o = OooO0o.OooO00o(oooOOO0, interfaceC32918OooO0OO, c32922OooO0oO, (40 & 8) == 0, (40 & 16) == 0, true);
            if (c35197OooOOooOooO00o != null) {
                return OooOOO0(this, abstractC33252OooOooO, c35197OooOOooOooO00o, boolOooO0OO, zOooO0Oo, 8);
            }
        } else {
            C35197OooOOoo c35197OooOOooOooO00o2 = OooO0o.OooO00o(oooOOO0, interfaceC32918OooO0OO, c32922OooO0oO, (40 & 8) == 0, (40 & 16) == 0, true);
            if (c35197OooOOooOooO00o2 != null) {
                if (C33599OooOo0O.OooOoOO(c35197OooOOooOooO00o2.f126383OooO00o, "$delegate", false) == (oooO0O0 == OooO0O0.f126334OooOoO0)) {
                    return OooOO0o(abstractC33252OooOooO, c35197OooOOooOooO00o2, true, true, boolOooO0OO, zOooO0Oo);
                }
            }
        }
        return c34434OooOoO;
    }
}
