package oOo0oooO;

import java.util.Map;
import oO0O0OO.InterfaceC32596OooO0o0;
import oO0O0OO.o000oOoO;
import oO0OOo.AbstractC33038OooO0oO;
import oO0Oo00.C33194OooO0O0;
import oO0Ooo.AbstractC33320OooOoo;
import oO0Ooo.AbstractC33328Oooo0O0;
import oO0OooO0.C33477OooO0OO;
import oO0OooO0.C33479OooO0o;
import oO0Oooo.C33509OooO;

/* JADX INFO: renamed from: oOo0oooO.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34586OooO0Oo implements OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final AbstractC33328Oooo0O0 f123900OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Map<C33479OooO0o, AbstractC33038OooO0oO<?>> f123901OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o000oOoO f123902OooO0OO;

    public C34586OooO0Oo(AbstractC33328Oooo0O0 abstractC33328Oooo0O0, Map map, o000oOoO o000oooo2) {
        if (abstractC33328Oooo0O0 == null) {
            OooO0Oo(0);
            throw null;
        }
        if (map == null) {
            OooO0Oo(1);
            throw null;
        }
        this.f123900OooO00o = abstractC33328Oooo0O0;
        this.f123901OooO0O0 = map;
        this.f123902OooO0OO = o000oooo2;
    }

    public static /* synthetic */ void OooO0Oo(int i) {
        String str = (i == 3 || i == 4 || i == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 3 || i == 4 || i == 5) ? 2 : 3];
        if (i == 1) {
            objArr[0] = "valueArguments";
        } else if (i == 2) {
            objArr[0] = "source";
        } else if (i == 3 || i == 4 || i == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[0] = "annotationType";
        }
        if (i == 3) {
            objArr[1] = "getType";
        } else if (i == 4) {
            objArr[1] = "getAllValueArguments";
        } else if (i != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (i != 3 && i != 4 && i != 5) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i != 3 && i != 4 && i != 5) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // oOo0oooO.OooO0OO
    public final Map<C33479OooO0o, AbstractC33038OooO0oO<?>> OooO0O0() {
        Map<C33479OooO0o, AbstractC33038OooO0oO<?>> map = this.f123901OooO0O0;
        if (map != null) {
            return map;
        }
        OooO0Oo(4);
        throw null;
    }

    @Override // oOo0oooO.OooO0OO
    public final C33477OooO0OO OooO0OO() {
        InterfaceC32596OooO0o0 interfaceC32596OooO0o0OooO0Oo = C33194OooO0O0.OooO0Oo(this);
        if (interfaceC32596OooO0o0OooO0Oo != null) {
            if (C33509OooO.OooO0o(interfaceC32596OooO0o0OooO0Oo)) {
                interfaceC32596OooO0o0OooO0Oo = null;
            }
            if (interfaceC32596OooO0o0OooO0Oo != null) {
                return C33194OooO0O0.OooO0OO(interfaceC32596OooO0o0OooO0Oo);
            }
        }
        return null;
    }

    @Override // oOo0oooO.OooO0OO
    public final o000oOoO getSource() {
        o000oOoO o000oooo2 = this.f123902OooO0OO;
        if (o000oooo2 != null) {
            return o000oooo2;
        }
        OooO0Oo(5);
        throw null;
    }

    @Override // oOo0oooO.OooO0OO
    public final AbstractC33320OooOoo getType() {
        AbstractC33328Oooo0O0 abstractC33328Oooo0O0 = this.f123900OooO00o;
        if (abstractC33328Oooo0O0 != null) {
            return abstractC33328Oooo0O0;
        }
        OooO0Oo(3);
        throw null;
    }

    public final String toString() {
        return oO0OOOO.OooO0OO.f118961OooO00o.OooOo0o(this, null);
    }
}
