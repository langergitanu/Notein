package ooOOoOO0;

import OooOOO0.AbstractC20449OooO0Oo;
import com.orion.notein.domain.models.cloudsync.CloudMetaExtra;
import oO00ooO.C32442OooOO0o;
import oO0o.AbstractC33525OooO0OO;
import oO0o.AbstractC33526OooO0Oo;
import oO0o.AbstractC33534OooOO0o;
import oO0o.InterfaceC33531OooO0o0;
import oO0o.OooOOO0;
import oO0o0ooO.C33915OooO0oO;
import oO0o0ooO.InterfaceC33911OooO0OO;
import oO0oO00.AbstractC33934OooO0O0;
import oO0oO00.o00oO0O;
import oO0oO00.o0Oo0oo;
import oO0oO000.InterfaceC34004OooO0Oo;
import oO0oO00o.C34005OooO00o;
import oOo00O0O.AbstractC34457OooO0OO;
import oOo00O0O.C34461OooO0oo;
import oOo00O0O.C34462OooOO0o;
import oOo00O0O.EnumC34455OooO00o;
import oOo00O0O.InterfaceC34466OooOOoo;

/* JADX INFO: renamed from: ooOOoOO0.Oooo0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C35140Oooo0O0 implements InterfaceC34466OooOOoo, InterfaceC34004OooO0Oo, oO0oO000.OooO0O0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public String f126181OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooOO0O f126182OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final AbstractC34457OooO0OO f126183OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final EnumC35144Oooo0oO f126184OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final InterfaceC34466OooOOoo[] f126185OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final C34461OooO0oo f126186OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final C34005OooO00o f126187OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f126188OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public String f126189OooO0oo;

    public C35140Oooo0O0(OooOO0O composer, AbstractC34457OooO0OO json, EnumC35144Oooo0oO enumC35144Oooo0oO, InterfaceC34466OooOOoo[] interfaceC34466OooOOooArr) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(composer, "composer");
        kotlin.jvm.internal.OooOOO0.OooO0oO(json, "json");
        this.f126182OooO00o = composer;
        this.f126183OooO0O0 = json;
        this.f126184OooO0OO = enumC35144Oooo0oO;
        this.f126185OooO0Oo = interfaceC34466OooOOooArr;
        this.f126187OooO0o0 = json.f123492OooO0O0;
        this.f126186OooO0o = json.f123491OooO00o;
        int iOrdinal = enumC35144Oooo0oO.ordinal();
        if (interfaceC34466OooOOooArr != null) {
            InterfaceC34466OooOOoo interfaceC34466OooOOoo = interfaceC34466OooOOooArr[iOrdinal];
            if (interfaceC34466OooOOoo == null && interfaceC34466OooOOoo == this) {
                return;
            }
            interfaceC34466OooOOooArr[iOrdinal] = this;
        }
    }

    @Override // oO0oO000.InterfaceC34004OooO0Oo
    public final oO0oO000.OooO0O0 OooO(InterfaceC33531OooO0o0 descriptor) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(descriptor, "descriptor");
        return OooO00o(descriptor);
    }

    @Override // oO0oO000.InterfaceC34004OooO0Oo
    public final oO0oO000.OooO0O0 OooO00o(InterfaceC33531OooO0o0 descriptor) {
        InterfaceC34466OooOOoo interfaceC34466OooOOoo;
        kotlin.jvm.internal.OooOOO0.OooO0oO(descriptor, "descriptor");
        AbstractC34457OooO0OO abstractC34457OooO0OO = this.f126183OooO0O0;
        EnumC35144Oooo0oO enumC35144Oooo0oOOooO0O0 = C35145Oooo0oo.OooO0O0(descriptor, abstractC34457OooO0OO);
        OooOO0O oooOO0O = this.f126182OooO00o;
        oooOO0O.OooO0OO(enumC35144Oooo0oOOooO0O0.f126201OooOo0o);
        oooOO0O.f126120OooO0O0 = true;
        String str = this.f126189OooO0oo;
        if (str != null) {
            String strOooO0oo = this.f126181OooO;
            if (strOooO0oo == null) {
                strOooO0oo = descriptor.OooO0oo();
            }
            oooOO0O.OooO00o();
            OooOOoo(str);
            oooOO0O.OooO0OO(':');
            OooOOoo(strOooO0oo);
            this.f126189OooO0oo = null;
            this.f126181OooO = null;
        }
        if (this.f126184OooO0OO == enumC35144Oooo0oOOooO0O0) {
            return this;
        }
        InterfaceC34466OooOOoo[] interfaceC34466OooOOooArr = this.f126185OooO0Oo;
        return (interfaceC34466OooOOooArr == null || (interfaceC34466OooOOoo = interfaceC34466OooOOooArr[enumC35144Oooo0oOOooO0O0.ordinal()]) == null) ? new C35140Oooo0O0(oooOO0O, abstractC34457OooO0OO, enumC35144Oooo0oOOooO0O0, interfaceC34466OooOOooArr) : interfaceC34466OooOOoo;
    }

    @Override // oO0oO000.OooO0O0
    public final void OooO0O0(InterfaceC33531OooO0o0 descriptor) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(descriptor, "descriptor");
        EnumC35144Oooo0oO enumC35144Oooo0oO = this.f126184OooO0OO;
        OooOO0O oooOO0O = this.f126182OooO00o;
        oooOO0O.getClass();
        oooOO0O.f126120OooO0O0 = false;
        oooOO0O.OooO0OO(enumC35144Oooo0oO.f126200OooOo);
    }

    @Override // oO0oO000.InterfaceC34004OooO0Oo
    public final AbstractC20449OooO0Oo OooO0OO() {
        return this.f126187OooO0o0;
    }

    @Override // oO0oO000.OooO0O0
    public final InterfaceC34004OooO0Oo OooO0Oo(o0Oo0oo descriptor, int i) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(descriptor, "descriptor");
        OooOooo(descriptor, i);
        return OooO0oo(descriptor.OooO0Oo(i));
    }

    @Override // oO0oO000.OooO0O0
    public final void OooO0o(o0Oo0oo descriptor, int i, short s) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(descriptor, "descriptor");
        OooOooo(descriptor, i);
        OooOO0O(s);
    }

    @Override // oO0oO000.InterfaceC34004OooO0Oo
    public final void OooO0o0(byte b) {
        if (this.f126188OooO0oO) {
            OooOOoo(String.valueOf((int) b));
        } else {
            this.f126182OooO00o.OooO0O0(b);
        }
    }

    @Override // oO0oO000.OooO0O0
    public final void OooO0oO(InterfaceC33531OooO0o0 descriptor, int i, boolean z) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(descriptor, "descriptor");
        OooOooo(descriptor, i);
        OooOOO0(z);
    }

    @Override // oO0oO000.InterfaceC34004OooO0Oo
    public final InterfaceC34004OooO0Oo OooO0oo(InterfaceC33531OooO0o0 descriptor) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(descriptor, "descriptor");
        boolean zOooO00o = C35141Oooo0OO.OooO00o(descriptor);
        EnumC35144Oooo0oO enumC35144Oooo0oO = this.f126184OooO0OO;
        AbstractC34457OooO0OO abstractC34457OooO0OO = this.f126183OooO0O0;
        OooOO0O c35123OooOO0o = this.f126182OooO00o;
        if (zOooO00o) {
            if (!(c35123OooOO0o instanceof OooOOO0)) {
                c35123OooOO0o = new OooOOO0(c35123OooOO0o.f126119OooO00o, this.f126188OooO0oO);
            }
            return new C35140Oooo0O0(c35123OooOO0o, abstractC34457OooO0OO, enumC35144Oooo0oO, null);
        }
        if (descriptor.isInline() && descriptor.equals(C34462OooOO0o.f123521OooO00o)) {
            if (!(c35123OooOO0o instanceof C35123OooOO0o)) {
                c35123OooOO0o = new C35123OooOO0o(c35123OooOO0o.f126119OooO00o, this.f126188OooO0oO);
            }
            return new C35140Oooo0O0(c35123OooOO0o, abstractC34457OooO0OO, enumC35144Oooo0oO, null);
        }
        if (this.f126189OooO0oo != null) {
            this.f126181OooO = descriptor.OooO0oo();
        }
        return this;
    }

    @Override // oO0oO000.OooO0O0
    public final void OooOO0(o0Oo0oo descriptor, int i, double d) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(descriptor, "descriptor");
        OooOooo(descriptor, i);
        OooOo00(d);
    }

    @Override // oO0oO000.InterfaceC34004OooO0Oo
    public final void OooOO0O(short s) {
        if (this.f126188OooO0oO) {
            OooOOoo(String.valueOf((int) s));
        } else {
            this.f126182OooO00o.OooO0oO(s);
        }
    }

    @Override // oO0oO000.OooO0O0
    public final void OooOO0o(InterfaceC33531OooO0o0 descriptor, int i, String value) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(descriptor, "descriptor");
        kotlin.jvm.internal.OooOOO0.OooO0oO(value, "value");
        OooOooo(descriptor, i);
        OooOOoo(value);
    }

    @Override // oO0oO000.InterfaceC34004OooO0Oo
    public final void OooOOO(float f) {
        boolean z = this.f126188OooO0oO;
        OooOO0O oooOO0O = this.f126182OooO00o;
        if (z) {
            OooOOoo(String.valueOf(f));
        } else {
            oooOO0O.f126119OooO00o.OooO0OO(String.valueOf(f));
        }
        if (this.f126186OooO0o.f123519OooO0oo) {
            return;
        }
        if (Float.isInfinite(f) || Float.isNaN(f)) {
            throw OoooO0O.OooOo.OooO0O0(oooOO0O.f126119OooO00o.toString(), Float.valueOf(f));
        }
    }

    @Override // oO0oO000.InterfaceC34004OooO0Oo
    public final void OooOOO0(boolean z) {
        if (this.f126188OooO0oO) {
            OooOOoo(String.valueOf(z));
        } else {
            this.f126182OooO00o.f126119OooO00o.OooO0OO(String.valueOf(z));
        }
    }

    @Override // oO0oO000.InterfaceC34004OooO0Oo
    public final void OooOOOO(int i) {
        if (this.f126188OooO0oO) {
            OooOOoo(String.valueOf(i));
        } else {
            this.f126182OooO00o.OooO0Oo(i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
    @Override // oO0oO000.InterfaceC34004OooO0Oo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <T> void OooOOOo(InterfaceC33911OooO0OO serializer, T t) {
        String strOooO00o;
        kotlin.jvm.internal.OooOOO0.OooO0oO(serializer, "serializer");
        AbstractC34457OooO0OO abstractC34457OooO0OO = this.f126183OooO0O0;
        C34461OooO0oo c34461OooO0oo = abstractC34457OooO0OO.f123491OooO00o;
        boolean z = serializer instanceof AbstractC33934OooO0O0;
        if (z) {
            strOooO00o = c34461OooO0oo.f123520OooOO0 != EnumC34455OooO00o.f123485OooOo0o ? C35138Oooo00O.OooO00o(serializer.getDescriptor(), abstractC34457OooO0OO) : null;
        } else {
            int iOrdinal = c34461OooO0oo.f123520OooOO0.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    AbstractC33534OooOO0o kind = serializer.getDescriptor().getKind();
                    if (kotlin.jvm.internal.OooOOO0.OooO0O0(kind, OooOOO0.OooO00o.f121132OooO00o) || kotlin.jvm.internal.OooOOO0.OooO0O0(kind, OooOOO0.C33535OooO0Oo.f121135OooO00o)) {
                    }
                } else if (iOrdinal != 2) {
                    throw new C32442OooOO0o();
                }
            }
        }
        if (z) {
            AbstractC33934OooO0O0 abstractC33934OooO0O0 = (AbstractC33934OooO0O0) serializer;
            if (t == null) {
                throw new IllegalArgumentException(("Value for serializer " + abstractC33934OooO0O0.getDescriptor() + " should always be non-null. Please report issue to the kotlinx.serialization tracker.").toString());
            }
            InterfaceC33911OooO0OO interfaceC33911OooO0OOOooO0o = o00OOOo.OooO0OO.OooO0o(abstractC33934OooO0O0, this, t);
            if (strOooO00o != null && (serializer instanceof C33915OooO0oO)) {
                InterfaceC33531OooO0o0 descriptor = interfaceC33911OooO0OOOooO0o.getDescriptor();
                kotlin.jvm.internal.OooOOO0.OooO0oO(descriptor, "<this>");
                if (o00oO0O.OooO00o(descriptor).contains(strOooO00o)) {
                    throw null;
                }
            }
            AbstractC33534OooOO0o kind2 = interfaceC33911OooO0OOOooO0o.getDescriptor().getKind();
            kotlin.jvm.internal.OooOOO0.OooO0oO(kind2, "kind");
            if (kind2 instanceof AbstractC33534OooOO0o.OooO0O0) {
                throw new IllegalStateException("Enums cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
            }
            if (kind2 instanceof AbstractC33526OooO0Oo) {
                throw new IllegalStateException("Primitives cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
            }
            if (kind2 instanceof AbstractC33525OooO0OO) {
                throw new IllegalStateException("Actual serializer for polymorphic cannot be polymorphic itself");
            }
            serializer = interfaceC33911OooO0OOOooO0o;
        }
        if (strOooO00o != null) {
            String strOooO0oo = serializer.getDescriptor().OooO0oo();
            this.f126189OooO0oo = strOooO00o;
            this.f126181OooO = strOooO0oo;
        }
        serializer.serialize(this, t);
    }

    @Override // oO0oO000.OooO0O0
    public final void OooOOo(o0Oo0oo descriptor, int i, char c) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(descriptor, "descriptor");
        OooOooo(descriptor, i);
        OooOoo(c);
    }

    @Override // oO0oO000.OooO0O0
    public final void OooOOo0(InterfaceC33531OooO0o0 descriptor, int i, float f) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(descriptor, "descriptor");
        OooOooo(descriptor, i);
        OooOOO(f);
    }

    @Override // oO0oO000.InterfaceC34004OooO0Oo
    public final void OooOOoo(String value) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(value, "value");
        this.f126182OooO00o.OooO0oo(value);
    }

    @Override // oO0oO000.OooO0O0
    public final <T> void OooOo(InterfaceC33531OooO0o0 descriptor, int i, InterfaceC33911OooO0OO serializer, T t) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(descriptor, "descriptor");
        kotlin.jvm.internal.OooOOO0.OooO0oO(serializer, "serializer");
        if (t != null || this.f126186OooO0o.f123517OooO0o0) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(descriptor, "descriptor");
            kotlin.jvm.internal.OooOOO0.OooO0oO(serializer, "serializer");
            OooOooo(descriptor, i);
            if (serializer.getDescriptor().OooO0O0()) {
                OooOOOo(serializer, t);
            } else if (t == null) {
                OooOoO();
            } else {
                OooOOOo(serializer, t);
            }
        }
    }

    @Override // oO0oO000.OooO0O0
    public final void OooOo0(o0Oo0oo descriptor, int i, byte b) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(descriptor, "descriptor");
        OooOooo(descriptor, i);
        OooO0o0(b);
    }

    @Override // oO0oO000.InterfaceC34004OooO0Oo
    public final void OooOo00(double d) {
        boolean z = this.f126188OooO0oO;
        OooOO0O oooOO0O = this.f126182OooO00o;
        if (z) {
            OooOOoo(String.valueOf(d));
        } else {
            oooOO0O.f126119OooO00o.OooO0OO(String.valueOf(d));
        }
        if (this.f126186OooO0o.f123519OooO0oo) {
            return;
        }
        if (Double.isInfinite(d) || Double.isNaN(d)) {
            throw OoooO0O.OooOo.OooO0O0(oooOO0O.f126119OooO00o.toString(), Double.valueOf(d));
        }
    }

    @Override // oO0oO000.OooO0O0
    public final void OooOo0O(InterfaceC33531OooO0o0 descriptor, int i, long j) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(descriptor, "descriptor");
        OooOooo(descriptor, i);
        OooOo0o(j);
    }

    @Override // oO0oO000.InterfaceC34004OooO0Oo
    public final void OooOo0o(long j) {
        if (this.f126188OooO0oO) {
            OooOOoo(String.valueOf(j));
        } else {
            this.f126182OooO00o.OooO0o0(j);
        }
    }

    @Override // oO0oO000.InterfaceC34004OooO0Oo
    public final void OooOoO() {
        this.f126182OooO00o.OooO0o(CloudMetaExtra.DEFINE_NON_PARENT_ID);
    }

    @Override // oO0oO000.OooO0O0
    public final boolean OooOoO0(InterfaceC33531OooO0o0 descriptor) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(descriptor, "descriptor");
        return this.f126186OooO0o.f123512OooO00o;
    }

    @Override // oO0oO000.OooO0O0
    public final void OooOoOO(int i, int i2, InterfaceC33531OooO0o0 descriptor) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(descriptor, "descriptor");
        OooOooo(descriptor, i);
        OooOOOO(i2);
    }

    @Override // oO0oO000.InterfaceC34004OooO0Oo
    public final void OooOoo(char c) {
        OooOOoo(String.valueOf(c));
    }

    @Override // oO0oO000.OooO0O0
    public final void OooOoo0(InterfaceC33531OooO0o0 descriptor, int i, InterfaceC33911OooO0OO serializer, Object obj) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(descriptor, "descriptor");
        kotlin.jvm.internal.OooOOO0.OooO0oO(serializer, "serializer");
        OooOooo(descriptor, i);
        OooOOOo(serializer, obj);
    }

    @Override // oO0oO000.InterfaceC34004OooO0Oo
    public final void OooOooO(InterfaceC33531OooO0o0 enumDescriptor, int i) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(enumDescriptor, "enumDescriptor");
        OooOOoo(enumDescriptor.OooO0o(i));
    }

    public final void OooOooo(InterfaceC33531OooO0o0 descriptor, int i) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(descriptor, "descriptor");
        int iOrdinal = this.f126184OooO0OO.ordinal();
        boolean z = true;
        OooOO0O oooOO0O = this.f126182OooO00o;
        if (iOrdinal == 1) {
            if (!oooOO0O.f126120OooO0O0) {
                oooOO0O.OooO0OO(',');
            }
            oooOO0O.OooO00o();
            return;
        }
        if (iOrdinal == 2) {
            if (oooOO0O.f126120OooO0O0) {
                this.f126188OooO0oO = true;
                oooOO0O.OooO00o();
                return;
            }
            if (i % 2 == 0) {
                oooOO0O.OooO0OO(',');
                oooOO0O.OooO00o();
            } else {
                oooOO0O.OooO0OO(':');
                oooOO0O.OooO();
                z = false;
            }
            this.f126188OooO0oO = z;
            return;
        }
        if (iOrdinal == 3) {
            if (i == 0) {
                this.f126188OooO0oO = true;
            }
            if (i == 1) {
                oooOO0O.OooO0OO(',');
                oooOO0O.OooO();
                this.f126188OooO0oO = false;
                return;
            }
            return;
        }
        if (!oooOO0O.f126120OooO0O0) {
            oooOO0O.OooO0OO(',');
        }
        oooOO0O.OooO00o();
        AbstractC34457OooO0OO json = this.f126183OooO0O0;
        kotlin.jvm.internal.OooOOO0.OooO0oO(json, "json");
        C35129OooOo0O.OooO0OO(descriptor, json);
        OooOOoo(descriptor.OooO0o(i));
        oooOO0O.OooO0OO(':');
        oooOO0O.OooO();
    }
}
