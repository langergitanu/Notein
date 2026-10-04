package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.o00o0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21840o00o0O extends o00Oo0<o00Ooo, o00Ooo> {
    @Override // androidx.datastore.preferences.protobuf.o00Oo0
    public final int OooO(o00Ooo o00ooo2) {
        o00Ooo o00ooo3 = o00ooo2;
        int i = o00ooo3.f64563OooO0Oo;
        if (i != -1) {
            return i;
        }
        int iOooO0O0 = 0;
        for (int i2 = 0; i2 < o00ooo3.f64560OooO00o; i2++) {
            int i3 = o00ooo3.f64561OooO0O0[i2] >>> 3;
            iOooO0O0 += AbstractC21794OooOO0o.OooO0O0(3, (OooO) o00ooo3.f64562OooO0OO[i2]) + AbstractC21794OooOO0o.OooO(i3) + AbstractC21794OooOO0o.OooO0oo(2) + (AbstractC21794OooOO0o.OooO0oo(1) * 2);
        }
        o00ooo3.f64563OooO0Oo = iOooO0O0;
        return iOooO0O0;
    }

    @Override // androidx.datastore.preferences.protobuf.o00Oo0
    public final void OooO00o(o00Ooo o00ooo2, int i, int i2) {
        o00ooo2.OooO0OO((i << 3) | 5, Integer.valueOf(i2));
    }

    @Override // androidx.datastore.preferences.protobuf.o00Oo0
    public final void OooO0O0(o00Ooo o00ooo2, int i, long j) {
        o00ooo2.OooO0OO((i << 3) | 1, Long.valueOf(j));
    }

    @Override // androidx.datastore.preferences.protobuf.o00Oo0
    public final void OooO0OO(o00Ooo o00ooo2, int i, o00Ooo o00ooo3) {
        o00ooo2.OooO0OO((i << 3) | 3, o00ooo3);
    }

    @Override // androidx.datastore.preferences.protobuf.o00Oo0
    public final void OooO0Oo(o00Ooo o00ooo2, int i, OooO oooO) {
        o00ooo2.OooO0OO((i << 3) | 2, oooO);
    }

    @Override // androidx.datastore.preferences.protobuf.o00Oo0
    public final o00Ooo OooO0o(Object obj) {
        OooOo oooOo = (OooOo) obj;
        o00Ooo o00ooo2 = oooOo.unknownFields;
        if (o00ooo2 != o00Ooo.f64559OooO0o) {
            return o00ooo2;
        }
        o00Ooo o00ooo3 = new o00Ooo();
        oooOo.unknownFields = o00ooo3;
        return o00ooo3;
    }

    @Override // androidx.datastore.preferences.protobuf.o00Oo0
    public final void OooO0o0(o00Ooo o00ooo2, int i, long j) {
        o00ooo2.OooO0OO(i << 3, Long.valueOf(j));
    }

    @Override // androidx.datastore.preferences.protobuf.o00Oo0
    public final o00Ooo OooO0oO(Object obj) {
        return ((OooOo) obj).unknownFields;
    }

    @Override // androidx.datastore.preferences.protobuf.o00Oo0
    public final int OooO0oo(o00Ooo o00ooo2) {
        return o00ooo2.OooO0O0();
    }

    @Override // androidx.datastore.preferences.protobuf.o00Oo0
    public final void OooOO0(Object obj) {
        o00Ooo o00ooo2 = ((OooOo) obj).unknownFields;
        if (o00ooo2.f64564OooO0o0) {
            o00ooo2.f64564OooO0o0 = false;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.datastore.preferences.protobuf.o00Oo0
    public final o00Ooo OooOO0O(Object obj, Object obj2) {
        o00Ooo o00ooo2 = (o00Ooo) obj;
        o00Ooo o00ooo3 = (o00Ooo) obj2;
        o00Ooo o00ooo4 = o00Ooo.f64559OooO0o;
        if (o00ooo4.equals(o00ooo3)) {
            return o00ooo2;
        }
        if (o00ooo4.equals(o00ooo2)) {
            int i = o00ooo2.f64560OooO00o + o00ooo3.f64560OooO00o;
            int[] iArrCopyOf = Arrays.copyOf(o00ooo2.f64561OooO0O0, i);
            System.arraycopy(o00ooo3.f64561OooO0O0, 0, iArrCopyOf, o00ooo2.f64560OooO00o, o00ooo3.f64560OooO00o);
            Object[] objArrCopyOf = Arrays.copyOf(o00ooo2.f64562OooO0OO, i);
            System.arraycopy(o00ooo3.f64562OooO0OO, 0, objArrCopyOf, o00ooo2.f64560OooO00o, o00ooo3.f64560OooO00o);
            return new o00Ooo(i, iArrCopyOf, objArrCopyOf, true);
        }
        o00ooo2.getClass();
        if (o00ooo3.equals(o00ooo4)) {
            return o00ooo2;
        }
        if (!o00ooo2.f64564OooO0o0) {
            throw new UnsupportedOperationException();
        }
        int i2 = o00ooo2.f64560OooO00o + o00ooo3.f64560OooO00o;
        o00ooo2.OooO00o(i2);
        System.arraycopy(o00ooo3.f64561OooO0O0, 0, o00ooo2.f64561OooO0O0, o00ooo2.f64560OooO00o, o00ooo3.f64560OooO00o);
        System.arraycopy(o00ooo3.f64562OooO0OO, 0, o00ooo2.f64562OooO0OO, o00ooo2.f64560OooO00o, o00ooo3.f64560OooO00o);
        o00ooo2.f64560OooO00o = i2;
        return o00ooo2;
    }

    @Override // androidx.datastore.preferences.protobuf.o00Oo0
    public final void OooOOO(Object obj, o00Ooo o00ooo2) {
        ((OooOo) obj).unknownFields = o00ooo2;
    }

    @Override // androidx.datastore.preferences.protobuf.o00Oo0
    public final o00Ooo OooOOO0() {
        return new o00Ooo();
    }

    @Override // androidx.datastore.preferences.protobuf.o00Oo0
    public final void OooOOOO(Object obj, o00Ooo o00ooo2) {
        ((OooOo) obj).unknownFields = o00ooo2;
    }

    @Override // androidx.datastore.preferences.protobuf.o00Oo0
    public final o00Ooo OooOOOo(Object obj) {
        o00Ooo o00ooo2 = (o00Ooo) obj;
        if (o00ooo2.f64564OooO0o0) {
            o00ooo2.f64564OooO0o0 = false;
        }
        return o00ooo2;
    }

    @Override // androidx.datastore.preferences.protobuf.o00Oo0
    public final void OooOOo(o00Ooo o00ooo2, InterfaceC21846o0ooOO0 interfaceC21846o0ooOO0) throws IOException {
        o00ooo2.OooO0Oo(interfaceC21846o0ooOO0);
    }

    @Override // androidx.datastore.preferences.protobuf.o00Oo0
    public final void OooOOo0(o00Ooo o00ooo2, InterfaceC21846o0ooOO0 interfaceC21846o0ooOO0) throws IOException {
        o00Ooo o00ooo3 = o00ooo2;
        o00ooo3.getClass();
        interfaceC21846o0ooOO0.getClass();
        for (int i = 0; i < o00ooo3.f64560OooO00o; i++) {
            int i2 = o00ooo3.f64561OooO0O0[i] >>> 3;
            Object obj = o00ooo3.f64562OooO0OO[i];
            OooOOO0 oooOOO0 = (OooOOO0) interfaceC21846o0ooOO0;
            oooOOO0.getClass();
            boolean z = obj instanceof OooO;
            AbstractC21794OooOO0o abstractC21794OooOO0o = oooOOO0.f64452OooO00o;
            if (z) {
                abstractC21794OooOO0o.OooOoO(i2, (OooO) obj);
            } else {
                abstractC21794OooOO0o.OooOoO0(i2, (InterfaceC21822OoooO0) obj);
            }
        }
    }
}
