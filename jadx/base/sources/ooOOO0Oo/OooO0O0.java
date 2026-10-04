package ooOOO0Oo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import oO00ooO.C32443OooOOO;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O0OO.InterfaceC32596OooO0o0;
import oO0O0ooo.C32850OooOO0o;
import oO0O0ooo.EnumC32849OooOO0O;
import oO0OooO0.C33477OooO0OO;
import oOo000Oo.C34449Oooo0oo;
import oOo0oooO.InterfaceC34588OooO0oO;

/* JADX INFO: loaded from: classes10.dex */
public abstract class OooO0O0<TAnnotation> {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final LinkedHashMap f125772OooO0OO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C35043OooOo0o f125773OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ConcurrentHashMap<Object, TAnnotation> f125774OooO0O0;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (OooO0OO oooO0OO : OooO0OO.values()) {
            String str = oooO0OO.f125781OooOo0o;
            if (linkedHashMap.get(str) == null) {
                linkedHashMap.put(str, oooO0OO);
            }
        }
        f125772OooO0OO = linkedHashMap;
    }

    public OooO0O0(C35043OooOo0o javaTypeEnhancementState) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(javaTypeEnhancementState, "javaTypeEnhancementState");
        this.f125773OooO00o = javaTypeEnhancementState;
        this.f125774OooO0O0 = new ConcurrentHashMap<>();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0084, code lost:
    
        if (r10.equals("ALWAYS") != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008d, code lost:
    
        if (r10.equals(com.huawei.hms.framework.network.grs.GrsBaseInfo.CountryCodeSource.UNKNOWN) == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0096, code lost:
    
        if (r10.equals("NEVER") == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x009f, code lost:
    
        if (r10.equals("MAYBE") == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00c5, code lost:
    
        if (r0.equals(ooOOO0Oo.C35047OooOoo.f125846OooOOO0) != false) goto L57;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C32850OooOO0o OooO(TAnnotation tannotation, boolean z) {
        C33477OooO0OO c33477OooO0OOOooO0o0 = OooO0o0(tannotation);
        if (c33477OooO0OOOooO0o0 != null) {
            Oooo000 oooo000 = (Oooo000) this.f125773OooO00o.f125823OooO0O0.invoke(c33477OooO0OOOooO0o0);
            oooo000.getClass();
            if (oooo000 == Oooo000.IGNORE) {
                return null;
            }
            boolean zContains = C35047OooOoo.f125840OooO0oO.contains(c33477OooO0OOOooO0o0);
            EnumC32849OooOO0O enumC32849OooOO0O = EnumC32849OooOO0O.f117910OooOo;
            boolean z2 = true;
            if (!zContains) {
                boolean zContains2 = C35047OooOoo.f125842OooOO0.contains(c33477OooO0OOOooO0o0);
                EnumC32849OooOO0O enumC32849OooOO0O2 = EnumC32849OooOO0O.f117913OooOoO0;
                if (!zContains2) {
                    if (!(c33477OooO0OOOooO0o0.equals(C35047OooOoo.f125834OooO00o) ? true : c33477OooO0OOOooO0o0.equals(C35047OooOoo.f125837OooO0Oo))) {
                        boolean zEquals = c33477OooO0OOOooO0o0.equals(C35047OooOoo.f125835OooO0O0) ? true : c33477OooO0OOOooO0o0.equals(C35047OooOoo.f125839OooO0o0);
                        EnumC32849OooOO0O enumC32849OooOO0O3 = EnumC32849OooOO0O.f117911OooOo0o;
                        if (zEquals) {
                            enumC32849OooOO0O = enumC32849OooOO0O3;
                        } else if (c33477OooO0OOOooO0o0.equals(C35047OooOoo.f125841OooO0oo)) {
                            String str = (String) oOo000Oo.OooOo.Oooo0oo(OooO00o(tannotation, false));
                            if (str != null) {
                                switch (str.hashCode()) {
                                    case 73135176:
                                        break;
                                    case 74175084:
                                        break;
                                    case 433141802:
                                        break;
                                    case 1933739535:
                                        break;
                                }
                            } else {
                                enumC32849OooOO0O = enumC32849OooOO0O2;
                            }
                        } else if (!c33477OooO0OOOooO0o0.equals(C35047OooOoo.f125843OooOO0O)) {
                            if (!c33477OooO0OOOooO0o0.equals(C35047OooOoo.f125844OooOO0o) && !c33477OooO0OOOooO0o0.equals(C35047OooOoo.f125845OooOOO)) {
                            }
                        }
                    }
                }
            }
            if (!(oooo000 == Oooo000.WARN) && !z) {
                z2 = false;
            }
            return new C32850OooOO0o(enumC32849OooOO0O, z2);
        }
        return null;
    }

    public abstract ArrayList OooO00o(Object obj, boolean z);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0088  */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final OooOo OooO0O0(OooOo oooOo, InterfaceC34588OooO0oO annotations) {
        boolean z;
        C35038OooOOo c35038OooOOo;
        Oooo000 oooo000OooOO0;
        C35038OooOOo c35038OooOOo2;
        TAnnotation tannotationOooO0Oo;
        TAnnotation next;
        C32443OooOOO c32443OooOOO;
        C32850OooOO0o c32850OooOO0oOooO0OO;
        kotlin.jvm.internal.OooOOO0.OooO0oO(annotations, "annotations");
        C35043OooOo0o c35043OooOo0o = this.f125773OooO00o;
        if (!c35043OooOo0o.f125824OooO0OO) {
            ArrayList<C35038OooOOo> arrayList = new ArrayList();
            Iterator<oOo0oooO.OooO0OO> it = annotations.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                oOo0oooO.OooO0OO next2 = it.next();
                Oooo000 oooo000 = Oooo000.WARN;
                Oooo000 oooo0002 = Oooo000.IGNORE;
                C35038OooOOo c35038OooOOo3 = null;
                if (!c35043OooOo0o.f125824OooO0OO && (c35038OooOOo = (C35038OooOOo) C35032OooO0Oo.f125788OooO0oO.get(OooO0o0(next2))) != null) {
                    C33477OooO0OO c33477OooO0OOOooO0o0 = OooO0o0(next2);
                    if (c33477OooO0OOOooO0o0 == null || !C35032OooO0Oo.f125786OooO0o.containsKey(c33477OooO0OOOooO0o0)) {
                        oooo000OooOO0 = OooOO0(next2);
                        if (oooo000OooOO0 == null) {
                            oooo000OooOO0 = c35043OooOo0o.f125822OooO00o.f125826OooO00o;
                        }
                    } else {
                        oooo000OooOO0 = (Oooo000) c35043OooOo0o.f125823OooO0O0.invoke(c33477OooO0OOOooO0o0);
                    }
                    if (oooo000OooOO0 == oooo0002) {
                        oooo000OooOO0 = null;
                    }
                    if (oooo000OooOO0 == null) {
                        c35038OooOOo2 = null;
                    } else {
                        C32850OooOO0o c32850OooOO0oOooO00o = C32850OooOO0o.OooO00o(c35038OooOOo.f125804OooO00o, null, oooo000OooOO0 == oooo000, 1);
                        Collection<OooO0OO> qualifierApplicabilityTypes = c35038OooOOo.f125805OooO0O0;
                        kotlin.jvm.internal.OooOOO0.OooO0oO(qualifierApplicabilityTypes, "qualifierApplicabilityTypes");
                        c35038OooOOo2 = new C35038OooOOo(c32850OooOO0oOooO00o, qualifierApplicabilityTypes, c35038OooOOo.f125806OooO0OO);
                    }
                }
                if (c35038OooOOo2 != null) {
                    c35038OooOOo3 = c35038OooOOo2;
                } else if (!c35043OooOo0o.f125822OooO00o.f125829OooO0Oo && (tannotationOooO0Oo = OooO0Oo(next2, C35032OooO0Oo.f125784OooO0OO)) != null) {
                    Iterator<TAnnotation> it2 = OooO0oO(next2).iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                        if (OooOO0O(next) != null) {
                            break;
                        }
                    }
                    if (next == null) {
                        c32443OooOOO = null;
                    } else {
                        ArrayList arrayListOooO00o = OooO00o(tannotationOooO0Oo, true);
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        Iterator it3 = arrayListOooO00o.iterator();
                        while (it3.hasNext()) {
                            OooO0OO oooO0OO = (OooO0OO) f125772OooO0OO.get((String) it3.next());
                            if (oooO0OO != null) {
                                linkedHashSet.add(oooO0OO);
                            }
                        }
                        if (linkedHashSet.contains(OooO0OO.TYPE_USE)) {
                            linkedHashSet = C34449Oooo0oo.OooO0oo(C34449Oooo0oo.OooO0o(oOo000Oo.OooOOO.OoooOo0(OooO0OO.values()), OooO0OO.TYPE_PARAMETER_BOUNDS), linkedHashSet);
                        }
                        c32443OooOOO = new C32443OooOOO(next, linkedHashSet);
                    }
                    if (c32443OooOOO != null) {
                        Set set = (Set) c32443OooOOO.f116637OooOo;
                        Oooo000 oooo000OooOO02 = OooOO0(next2);
                        A a = c32443OooOOO.f116638OooOo0o;
                        if (oooo000OooOO02 == null && (oooo000OooOO02 = OooOO0(a)) == null) {
                            oooo000OooOO02 = c35043OooOo0o.f125822OooO00o.f125826OooO00o;
                        }
                        oooo000OooOO02.getClass();
                        if (oooo000OooOO02 != oooo0002 && (c32850OooOO0oOooO0OO = OooO0OO(a, OooO00o.f125771OooOo0o)) != null) {
                            c35038OooOOo3 = new C35038OooOOo(C32850OooOO0o.OooO00o(c32850OooOO0oOooO0OO, null, oooo000OooOO02 == oooo000, 1), set);
                        }
                    }
                }
                if (c35038OooOOo3 != null) {
                    arrayList.add(c35038OooOOo3);
                }
            }
            if (!arrayList.isEmpty()) {
                EnumMap enumMap = oooOo != null ? new EnumMap((EnumMap) oooOo.f125812OooO00o) : new EnumMap(OooO0OO.class);
                for (C35038OooOOo c35038OooOOo4 : arrayList) {
                    Iterator<OooO0OO> it4 = c35038OooOOo4.f125805OooO0O0.iterator();
                    while (it4.hasNext()) {
                        enumMap.put(it4.next(), c35038OooOOo4);
                        z = true;
                    }
                }
                if (z) {
                    return new OooOo(enumMap);
                }
            }
        }
        return oooOo;
    }

    public final C32850OooOO0o OooO0OO(TAnnotation tannotation, InterfaceC32507OooOO0o<? super TAnnotation, Boolean> interfaceC32507OooOO0o) {
        C32850OooOO0o c32850OooOO0oOooO;
        C32850OooOO0o c32850OooOO0oOooO2 = OooO(tannotation, interfaceC32507OooOO0o.invoke(tannotation).booleanValue());
        if (c32850OooOO0oOooO2 != null) {
            return c32850OooOO0oOooO2;
        }
        TAnnotation tannotationOooOO0O = OooOO0O(tannotation);
        if (tannotationOooOO0O != null) {
            Oooo000 oooo000OooOO0 = OooOO0(tannotation);
            if (oooo000OooOO0 == null) {
                oooo000OooOO0 = this.f125773OooO00o.f125822OooO00o.f125826OooO00o;
            }
            oooo000OooOO0.getClass();
            if (oooo000OooOO0 != Oooo000.IGNORE && (c32850OooOO0oOooO = OooO(tannotationOooOO0O, interfaceC32507OooOO0o.invoke(tannotationOooOO0O).booleanValue())) != null) {
                return C32850OooOO0o.OooO00o(c32850OooOO0oOooO, null, oooo000OooOO0 == Oooo000.WARN, 1);
            }
        }
        return null;
    }

    public final TAnnotation OooO0Oo(TAnnotation tannotation, C33477OooO0OO c33477OooO0OO) {
        for (TAnnotation tannotation2 : OooO0oO(tannotation)) {
            if (kotlin.jvm.internal.OooOOO0.OooO0O0(OooO0o0(tannotation2), c33477OooO0OO)) {
                return tannotation2;
            }
        }
        return null;
    }

    public abstract InterfaceC32596OooO0o0 OooO0o(Object obj);

    public abstract C33477OooO0OO OooO0o0(TAnnotation tannotation);

    public abstract Iterable<TAnnotation> OooO0oO(TAnnotation tannotation);

    public final boolean OooO0oo(TAnnotation tannotation, C33477OooO0OO c33477OooO0OO) {
        Iterable<TAnnotation> iterableOooO0oO = OooO0oO(tannotation);
        if ((iterableOooO0oO instanceof Collection) && ((Collection) iterableOooO0oO).isEmpty()) {
            return false;
        }
        Iterator<TAnnotation> it = iterableOooO0oO.iterator();
        while (it.hasNext()) {
            if (kotlin.jvm.internal.OooOOO0.OooO0O0(OooO0o0(it.next()), c33477OooO0OO)) {
                return true;
            }
        }
        return false;
    }

    public final Oooo000 OooOO0(TAnnotation tannotation) {
        String str;
        C35043OooOo0o c35043OooOo0o = this.f125773OooO00o;
        Oooo000 oooo000 = c35043OooOo0o.f125822OooO00o.f125828OooO0OO.get(OooO0o0(tannotation));
        if (oooo000 != null) {
            return oooo000;
        }
        TAnnotation tannotationOooO0Oo = OooO0Oo(tannotation, C35032OooO0Oo.f125785OooO0Oo);
        if (tannotationOooO0Oo == null || (str = (String) oOo000Oo.OooOo.Oooo0oo(OooO00o(tannotationOooO0Oo, false))) == null) {
            return null;
        }
        Oooo000 oooo0002 = c35043OooOo0o.f125822OooO00o.f125827OooO0O0;
        if (oooo0002 != null) {
            return oooo0002;
        }
        int iHashCode = str.hashCode();
        if (iHashCode == -2137067054) {
            if (str.equals("IGNORE")) {
                return Oooo000.IGNORE;
            }
            return null;
        }
        if (iHashCode == -1838656823) {
            if (str.equals("STRICT")) {
                return Oooo000.STRICT;
            }
            return null;
        }
        if (iHashCode == 2656902 && str.equals("WARN")) {
            return Oooo000.WARN;
        }
        return null;
    }

    public final TAnnotation OooOO0O(TAnnotation annotation) {
        TAnnotation tannotationOooOO0O;
        kotlin.jvm.internal.OooOOO0.OooO0oO(annotation, "annotation");
        if (!this.f125773OooO00o.f125822OooO00o.f125829OooO0Oo) {
            if (oOo000Oo.OooOo.Oooo00o(C35032OooO0Oo.f125789OooO0oo, OooO0o0(annotation)) || OooO0oo(annotation, C35032OooO0Oo.f125783OooO0O0)) {
                return annotation;
            }
            if (OooO0oo(annotation, C35032OooO0Oo.f125782OooO00o)) {
                ConcurrentHashMap<Object, TAnnotation> concurrentHashMap = this.f125774OooO0O0;
                InterfaceC32596OooO0o0 interfaceC32596OooO0o0OooO0o = OooO0o(annotation);
                TAnnotation tannotation = concurrentHashMap.get(interfaceC32596OooO0o0OooO0o);
                if (tannotation != null) {
                    return tannotation;
                }
                Iterator<TAnnotation> it = OooO0oO(annotation).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        tannotationOooOO0O = null;
                        break;
                    }
                    tannotationOooOO0O = OooOO0O(it.next());
                    if (tannotationOooOO0O != null) {
                        break;
                    }
                }
                if (tannotationOooOO0O != null) {
                    TAnnotation tannotationPutIfAbsent = concurrentHashMap.putIfAbsent(interfaceC32596OooO0o0OooO0o, tannotationOooOO0O);
                    return tannotationPutIfAbsent == null ? tannotationOooOO0O : tannotationPutIfAbsent;
                }
            }
        }
        return null;
    }
}
