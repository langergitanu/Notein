package o0000oO0;

import androidx.datastore.preferences.protobuf.C21805OooOoO;
import androidx.datastore.preferences.protobuf.C21835OooooOo;
import androidx.datastore.preferences.protobuf.C21837Oooooo0;
import androidx.datastore.preferences.protobuf.InterfaceC21811OooOooo;
import androidx.datastore.preferences.protobuf.InterfaceC21824OoooO0O;
import androidx.datastore.preferences.protobuf.InterfaceC21831Ooooo00;
import androidx.datastore.preferences.protobuf.InterfaceC21832Ooooo0o;
import androidx.datastore.preferences.protobuf.OooOo;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: o0000oO0.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24329OooO0o0 extends OooOo<C24329OooO0o0, OooO00o> implements InterfaceC21824OoooO0O {
    private static final C24329OooO0o0 DEFAULT_INSTANCE;
    private static volatile InterfaceC21831Ooooo00<C24329OooO0o0> PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private C21805OooOoO.OooO0OO<String> strings_ = C21835OooooOo.f64549OooOoO;

    /* JADX INFO: renamed from: o0000oO0.OooO0o0$OooO00o */
    public static final class OooO00o extends OooOo.OooO00o<C24329OooO0o0, OooO00o> implements InterfaceC21824OoooO0O {
        public OooO00o() {
            super(C24329OooO0o0.DEFAULT_INSTANCE);
        }
    }

    static {
        C24329OooO0o0 c24329OooO0o0 = new C24329OooO0o0();
        DEFAULT_INSTANCE = c24329OooO0o0;
        OooOo.OooOOO0(C24329OooO0o0.class, c24329OooO0o0);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static void OooOOOO(C24329OooO0o0 c24329OooO0o0, Iterable iterable) {
        C21805OooOoO.OooO0OO<String> oooO0OO = c24329OooO0o0.strings_;
        if (!oooO0OO.isModifiable()) {
            int size = oooO0OO.size();
            c24329OooO0o0.strings_ = oooO0OO.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
        }
        List list = c24329OooO0o0.strings_;
        Charset charset = C21805OooOoO.f64482OooO00o;
        iterable.getClass();
        if (!(iterable instanceof InterfaceC21811OooOooo)) {
            if (iterable instanceof InterfaceC21832Ooooo0o) {
                list.addAll((Collection) iterable);
                return;
            }
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(((Collection) iterable).size() + list.size());
            }
            int size2 = list.size();
            for (Object obj : iterable) {
                if (obj == null) {
                    String str = "Element at index " + (list.size() - size2) + " is null.";
                    for (int size3 = list.size() - 1; size3 >= size2; size3--) {
                        list.remove(size3);
                    }
                    throw new NullPointerException(str);
                }
                list.add(obj);
            }
            return;
        }
        List<?> underlyingElements = ((InterfaceC21811OooOooo) iterable).getUnderlyingElements();
        InterfaceC21811OooOooo interfaceC21811OooOooo = (InterfaceC21811OooOooo) list;
        int size4 = list.size();
        for (Object obj2 : underlyingElements) {
            if (obj2 == null) {
                String str2 = "Element at index " + (interfaceC21811OooOooo.size() - size4) + " is null.";
                for (int size5 = interfaceC21811OooOooo.size() - 1; size5 >= size4; size5--) {
                    interfaceC21811OooOooo.remove(size5);
                }
                throw new NullPointerException(str2);
            }
            if (obj2 instanceof androidx.datastore.preferences.protobuf.OooO) {
                interfaceC21811OooOooo.OooO00o();
            } else if (obj2 instanceof byte[]) {
                byte[] bArr = (byte[]) obj2;
                androidx.datastore.preferences.protobuf.OooO.OooO0Oo(0, bArr.length, bArr);
                interfaceC21811OooOooo.OooO00o();
            } else {
                interfaceC21811OooOooo.add((String) obj2);
            }
        }
    }

    public static C24329OooO0o0 OooOOOo() {
        return DEFAULT_INSTANCE;
    }

    public static OooO00o OooOOo() {
        return (OooO00o) ((OooOo.OooO00o) DEFAULT_INSTANCE.OooO0o(OooOo.OooO0o.f64467OooOoOO));
    }

    @Override // androidx.datastore.preferences.protobuf.OooOo
    public final Object OooO0o(OooOo.OooO0o oooO0o) {
        InterfaceC21831Ooooo00 oooO0O0;
        switch (oooO0o.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C21837Oooooo0(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 3:
                return new C24329OooO0o0();
            case 4:
                return new OooO00o();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC21831Ooooo00<C24329OooO0o0> interfaceC21831Ooooo00 = PARSER;
                if (interfaceC21831Ooooo00 != null) {
                    return interfaceC21831Ooooo00;
                }
                synchronized (C24329OooO0o0.class) {
                    try {
                        oooO0O0 = PARSER;
                        if (oooO0O0 == null) {
                            oooO0O0 = new OooOo.OooO0O0();
                            PARSER = oooO0O0;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return oooO0O0;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final C21805OooOoO.OooO0OO OooOOo0() {
        return this.strings_;
    }
}
