package oO0O0ooo;

import Oooo0oO.C21091o0000o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C24035Oooo00o;
import oO0O0OO.InterfaceC32637OoooOoo;
import oO0O0oo0.C32813Oooo000;
import oO0Ooo.AbstractC33316OooOo0o;
import oO0Ooo.AbstractC33320OooOoo;
import oO0Ooo.AbstractC33328Oooo0O0;
import oO0OooO.InterfaceC33452OooO0O0;
import oO0o0000.InterfaceC33541OooO0oO;
import oO0o0000.InterfaceC33543OooOO0o;
import ooOOO0Oo.C35033OooO0o0;

/* JADX INFO: renamed from: oO0O0ooo.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC32840OooO00o<TAnnotation> {

    /* JADX INFO: renamed from: oO0O0ooo.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C20258OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final InterfaceC33541OooO0oO f117889OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final ooOOO0Oo.OooOo f117890OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final InterfaceC33543OooOO0o f117891OooO0OO;

        public C20258OooO00o(InterfaceC33541OooO0oO interfaceC33541OooO0oO, ooOOO0Oo.OooOo oooOo, InterfaceC33543OooOO0o interfaceC33543OooOO0o) {
            this.f117889OooO00o = interfaceC33541OooO0oO;
            this.f117890OooO0O0 = oooOo;
            this.f117891OooO0OO = interfaceC33543OooOO0o;
        }
    }

    public static void OooO00o(Object obj, ArrayList arrayList, C32843OooO0Oo c32843OooO0Oo) {
        arrayList.add(obj);
        Iterable<? extends C20258OooO00o> iterableInvoke = c32843OooO0Oo.invoke(obj);
        if (iterableInvoke != null) {
            Iterator<? extends C20258OooO00o> it = iterableInvoke.iterator();
            while (it.hasNext()) {
                OooO00o(it.next(), arrayList, c32843OooO0Oo);
            }
        }
    }

    public static EnumC32849OooOO0O OooO0OO(InterfaceC33541OooO0oO interfaceC33541OooO0oO) {
        AbstractC33328Oooo0O0 abstractC33328Oooo0O0OooO0oo;
        AbstractC33328Oooo0O0 abstractC33328Oooo0O0OooO0oo2;
        kotlin.jvm.internal.OooOOO0.OooO0oO(interfaceC33541OooO0oO, "<this>");
        AbstractC33316OooOo0o abstractC33316OooOo0oOooO0oO = InterfaceC33452OooO0O0.OooO00o.OooO0oO(interfaceC33541OooO0oO);
        if (abstractC33316OooOo0oOooO0oO == null || (abstractC33328Oooo0O0OooO0oo = InterfaceC33452OooO0O0.OooO00o.Oooo0o(abstractC33316OooOo0oOooO0oO)) == null) {
            abstractC33328Oooo0O0OooO0oo = InterfaceC33452OooO0O0.OooO00o.OooO0oo(interfaceC33541OooO0oO);
            kotlin.jvm.internal.OooOOO0.OooO0Oo(abstractC33328Oooo0O0OooO0oo);
        }
        if (InterfaceC33452OooO0O0.OooO00o.OooOooo(abstractC33328Oooo0O0OooO0oo)) {
            return EnumC32849OooOO0O.f117910OooOo;
        }
        AbstractC33316OooOo0o abstractC33316OooOo0oOooO0oO2 = InterfaceC33452OooO0O0.OooO00o.OooO0oO(interfaceC33541OooO0oO);
        if (abstractC33316OooOo0oOooO0oO2 == null || (abstractC33328Oooo0O0OooO0oo2 = InterfaceC33452OooO0O0.OooO00o.OoooOOo(abstractC33316OooOo0oOooO0oO2)) == null) {
            abstractC33328Oooo0O0OooO0oo2 = InterfaceC33452OooO0O0.OooO00o.OooO0oo(interfaceC33541OooO0oO);
            kotlin.jvm.internal.OooOOO0.OooO0Oo(abstractC33328Oooo0O0OooO0oo2);
        }
        if (InterfaceC33452OooO0O0.OooO00o.OooOooo(abstractC33328Oooo0O0OooO0oo2)) {
            return null;
        }
        return EnumC32849OooOO0O.f117913OooOoO0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007d  */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C32850OooOO0o OooO0O0(InterfaceC33543OooOO0o interfaceC33543OooOO0o) {
        ?? arrayList;
        EnumC32849OooOO0O enumC32849OooOO0O;
        kotlin.jvm.internal.OooOOO0.OooO0oO(interfaceC33543OooOO0o, "<this>");
        if (!(interfaceC33543OooOO0o instanceof C32813Oooo000)) {
            return null;
        }
        if (!(interfaceC33543OooOO0o instanceof InterfaceC32637OoooOoo)) {
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(interfaceC33543OooOO0o);
            sb.append(", ");
            throw new IllegalArgumentException(androidx.concurrent.futures.OooO00o.OooO0Oo(C24035Oooo00o.f80943OooO00o, interfaceC33543OooOO0o.getClass(), sb).toString());
        }
        List<AbstractC33320OooOoo> upperBounds = ((InterfaceC32637OoooOoo) interfaceC33543OooOO0o).getUpperBounds();
        kotlin.jvm.internal.OooOOO0.OooO0o(upperBounds, "this.upperBounds");
        List<AbstractC33320OooOoo> list = upperBounds;
        boolean z = list instanceof Collection;
        if (z && list.isEmpty()) {
            return null;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!InterfaceC33452OooO0O0.OooO00o.OooOoOO((InterfaceC33541OooO0oO) it.next())) {
                if (z && list.isEmpty()) {
                    if (!z) {
                    }
                    while (r2.hasNext()) {
                    }
                    return null;
                }
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    if (OooO0OO((InterfaceC33541OooO0oO) it2.next()) != null) {
                        arrayList = upperBounds;
                        break;
                    }
                }
                if (!z && list.isEmpty()) {
                    return null;
                }
                for (InterfaceC33541OooO0oO interfaceC33541OooO0oO : list) {
                    kotlin.jvm.internal.OooOOO0.OooO0oO(interfaceC33541OooO0oO, "<this>");
                    if (C21091o0000o.OooOOO((AbstractC33320OooOoo) interfaceC33541OooO0oO) != null) {
                        arrayList = new ArrayList();
                        for (InterfaceC33541OooO0oO interfaceC33541OooO0oO2 : list) {
                            kotlin.jvm.internal.OooOOO0.OooO0oO(interfaceC33541OooO0oO2, "<this>");
                            AbstractC33320OooOoo abstractC33320OooOooOooOOO = C21091o0000o.OooOOO((AbstractC33320OooOoo) interfaceC33541OooO0oO2);
                            if (abstractC33320OooOooOooOOO != null) {
                                arrayList.add(abstractC33320OooOooOooOOO);
                            }
                        }
                    }
                }
                return null;
                Iterable iterable = (Iterable) arrayList;
                if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
                    enumC32849OooOO0O = EnumC32849OooOO0O.f117910OooOo;
                } else {
                    Iterator it3 = iterable.iterator();
                    while (it3.hasNext()) {
                        if (!InterfaceC33452OooO0O0.OooO00o.Oooo00O((InterfaceC33541OooO0oO) it3.next())) {
                            enumC32849OooOO0O = EnumC32849OooOO0O.f117913OooOoO0;
                            break;
                        }
                    }
                    enumC32849OooOO0O = EnumC32849OooOO0O.f117910OooOo;
                }
                return new C32850OooOO0o(enumC32849OooOO0O, arrayList != upperBounds);
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, oO00ooO.OooOO0] */
    public final ArrayList OooO0Oo(InterfaceC33541OooO0oO interfaceC33541OooO0oO) {
        C32876OooOo0O c32876OooOo0O = (C32876OooOo0O) this;
        ooOOO0Oo.OooOo oooOo = (ooOOO0Oo.OooOo) c32876OooOo0O.f117969OooO0OO.f123642OooO0Oo.getValue();
        C35033OooO0o0 c35033OooO0o0OooO0o0 = c32876OooOo0O.OooO0o0();
        kotlin.jvm.internal.OooOOO0.OooO0oO(interfaceC33541OooO0oO, "<this>");
        C20258OooO00o c20258OooO00o = new C20258OooO00o(interfaceC33541OooO0oO, c35033OooO0o0OooO0o0.OooO0O0(oooOo, ((AbstractC33320OooOoo) interfaceC33541OooO0oO).getAnnotations()), null);
        C32843OooO0Oo c32843OooO0Oo = new C32843OooO0Oo(this);
        ArrayList arrayList = new ArrayList(1);
        OooO00o(c20258OooO00o, arrayList, c32843OooO0Oo);
        return arrayList;
    }
}
