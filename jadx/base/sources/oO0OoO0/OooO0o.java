package oO0OoO0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import o00O0oo0.C24969OooOO0;
import oO00ooO.C32443OooOOO;
import oO0O00oo.C32520OooO0oo;
import oO0O0O0o.OooOOO;
import oO0O0OO.C32618OooOooo;
import oO0O0OO.InterfaceC32595OooO0Oo;
import oO0O0OO.InterfaceC32596OooO0o0;
import oO0O0OO.InterfaceC32598OooO0oo;
import oO0O0OO.InterfaceC32615OooOoo;
import oO0O0OO.InterfaceC32641OooooOO;
import oO0O0OO.o000oOoO;
import oO0OO00.OooO00o;
import oO0OO0Oo.C32917OooO0O0;
import oO0OO0Oo.InterfaceC32918OooO0OO;
import oO0OOOo.C32982OooO;
import oO0OOo.AbstractC33038OooO0oO;
import oO0OOo.AbstractC33040OooOO0o;
import oO0OOo.C33032OooO00o;
import oO0OOo.C33033OooO0O0;
import oO0OOo.C33034OooO0OO;
import oO0OOo.C33035OooO0Oo;
import oO0OOo.C33037OooO0o0;
import oO0OOo.C33044OooOOoo;
import oO0OOo.C33046OooOo0O;
import oO0OOo.C33047OooOo0o;
import oO0OOo.C33048OooOoO;
import oO0OOo.C33049OooOoO0;
import oO0OOo.C33050OooOoOO;
import oO0OOo.C33052OooOoo0;
import oO0Ooo.AbstractC33320OooOoo;
import oO0Ooo.AbstractC33328Oooo0O0;
import oO0OooO0.C33479OooO0o;
import oO0Oooo.C33509OooO;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34429OooOOo0;
import oOo000Oo.C34436OooOoOO;
import oOo000Oo.C34444Oooo0O0;
import oOo0oooO.C34586OooO0Oo;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final InterfaceC32615OooOoo f120252OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C32618OooOooo f120253OooO0O0;

    public /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f120254OooO00o;

        static {
            int[] iArr = new int[OooO00o.OooO0O0.OooO0OO.EnumC20267OooO0OO.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[6] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[7] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[8] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[9] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[10] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[11] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[12] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            f120254OooO00o = iArr;
        }
    }

    public OooO0o(InterfaceC32615OooOoo module, C32618OooOooo notFoundClasses) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(module, "module");
        kotlin.jvm.internal.OooOOO0.OooO0oO(notFoundClasses, "notFoundClasses");
        this.f120252OooO00o = module;
        this.f120253OooO0O0 = notFoundClasses;
    }

    public final C34586OooO0Oo OooO00o(oO0OO00.OooO00o proto, InterfaceC32918OooO0OO nameResolver) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(proto, "proto");
        kotlin.jvm.internal.OooOOO0.OooO0oO(nameResolver, "nameResolver");
        InterfaceC32596OooO0o0 interfaceC32596OooO0o0OooO0OO = oO0O0OO.OooOo00.OooO0OO(this.f120252OooO00o, C24969OooOO0.OooO00o(nameResolver, proto.f118013OooOoO0), this.f120253OooO0O0);
        Map mapOooOO0o = C34436OooOoOO.f123455OooOo0o;
        if (proto.f118012OooOoO.size() != 0 && !C33509OooO.OooO0o(interfaceC32596OooO0o0OooO0OO) && C32982OooO.OooOOO(interfaceC32596OooO0o0OooO0OO, oO0O0OO.OooO0o.f117233OooOoOO)) {
            Collection<InterfaceC32595OooO0Oo> collectionOooOO0 = interfaceC32596OooO0o0OooO0OO.OooOO0();
            kotlin.jvm.internal.OooOOO0.OooO0o(collectionOooOO0, "annotationClass.constructors");
            InterfaceC32595OooO0Oo interfaceC32595OooO0Oo = (InterfaceC32595OooO0Oo) oOo000Oo.OooOo.Ooooooo(collectionOooOO0);
            if (interfaceC32595OooO0Oo != null) {
                List<InterfaceC32641OooooOO> listOooO0o = interfaceC32595OooO0Oo.OooO0o();
                kotlin.jvm.internal.OooOOO0.OooO0o(listOooO0o, "constructor.valueParameters");
                List<InterfaceC32641OooooOO> list = listOooO0o;
                int iOooO0Oo = oOo000Oo.Oooo0.OooO0Oo(C34428OooOOo.OooOOoo(list, 10));
                if (iOooO0Oo < 16) {
                    iOooO0Oo = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iOooO0Oo);
                for (Object obj : list) {
                    linkedHashMap.put(((InterfaceC32641OooooOO) obj).getName(), obj);
                }
                List<OooO00o.OooO0O0> list2 = proto.f118012OooOoO;
                kotlin.jvm.internal.OooOOO0.OooO0o(list2, "proto.argumentList");
                ArrayList arrayList = new ArrayList();
                for (OooO00o.OooO0O0 it : list2) {
                    kotlin.jvm.internal.OooOOO0.OooO0o(it, "it");
                    InterfaceC32641OooooOO interfaceC32641OooooOO = (InterfaceC32641OooooOO) linkedHashMap.get(C24969OooOO0.OooO0O0(nameResolver, it.f118021OooOoO0));
                    if (interfaceC32641OooooOO != null) {
                        C33479OooO0o c33479OooO0oOooO0O0 = C24969OooOO0.OooO0O0(nameResolver, it.f118021OooOoO0);
                        AbstractC33320OooOoo type = interfaceC32641OooooOO.getType();
                        kotlin.jvm.internal.OooOOO0.OooO0o(type, "parameter.type");
                        OooO00o.OooO0O0.OooO0OO oooO0OO = it.f118020OooOoO;
                        kotlin.jvm.internal.OooOOO0.OooO0o(oooO0OO, "proto.value");
                        AbstractC33038OooO0oO<?> abstractC33038OooO0oOOooO0OO = OooO0OO(type, oooO0OO, nameResolver);
                        c32443OooOOO = OooO0O0(abstractC33038OooO0oOOooO0OO, type, oooO0OO) ? abstractC33038OooO0oOOooO0OO : null;
                        if (c32443OooOOO == null) {
                            String message = "Unexpected argument value: actual type " + oooO0OO.f118032OooOoO0 + " != expected type " + type;
                            kotlin.jvm.internal.OooOOO0.OooO0oO(message, "message");
                            c32443OooOOO = new AbstractC33040OooOO0o.OooO00o(message);
                        }
                        c32443OooOOO = new C32443OooOOO(c33479OooO0oOooO0O0, c32443OooOOO);
                    }
                    if (c32443OooOOO != null) {
                        arrayList.add(c32443OooOOO);
                    }
                }
                mapOooOO0o = C34444Oooo0O0.OooOO0o(arrayList);
            }
        }
        return new C34586OooO0Oo(interfaceC32596OooO0o0OooO0OO.OooOOO(), mapOooOO0o, o000oOoO.f117308OooO00o);
    }

    public final boolean OooO0O0(AbstractC33038OooO0oO<?> abstractC33038OooO0oO, AbstractC33320OooOoo abstractC33320OooOoo, OooO00o.OooO0O0.OooO0OO oooO0OO) {
        OooO00o.OooO0O0.OooO0OO.EnumC20267OooO0OO enumC20267OooO0OO = oooO0OO.f118032OooOoO0;
        int i = enumC20267OooO0OO == null ? -1 : OooO00o.f120254OooO00o[enumC20267OooO0OO.ordinal()];
        if (i == 10) {
            InterfaceC32598OooO0oo interfaceC32598OooO0ooOooO0OO = abstractC33320OooOoo.o00000().OooO0OO();
            InterfaceC32596OooO0o0 interfaceC32596OooO0o0 = interfaceC32598OooO0ooOooO0OO instanceof InterfaceC32596OooO0o0 ? (InterfaceC32596OooO0o0) interfaceC32598OooO0ooOooO0OO : null;
            if (interfaceC32596OooO0o0 == null) {
                return true;
            }
            C33479OooO0o c33479OooO0o = oO0O0O0o.OooOO0.f117105OooO0o0;
            return oO0O0O0o.OooOO0.OooO0O0(interfaceC32596OooO0o0, OooOOO.OooO00o.f117180Oooo);
        }
        InterfaceC32615OooOoo interfaceC32615OooOoo = this.f120252OooO00o;
        if (i != 13) {
            return kotlin.jvm.internal.OooOOO0.OooO0O0(abstractC33038OooO0oO.OooO00o(interfaceC32615OooOoo), abstractC33320OooOoo);
        }
        if (abstractC33038OooO0oO instanceof C33033OooO0O0) {
            C33033OooO0O0 c33033OooO0O0 = (C33033OooO0O0) abstractC33038OooO0oO;
            if (((List) c33033OooO0O0.f119483OooO00o).size() == oooO0OO.f118040Oooo00O.size()) {
                AbstractC33320OooOoo abstractC33320OooOooOooO0o = interfaceC32615OooOoo.OooOO0O().OooO0o(abstractC33320OooOoo);
                Iterable iterableOooOO0 = C34429OooOOo0.OooOO0((Collection) c33033OooO0O0.f119483OooO00o);
                if ((iterableOooOO0 instanceof Collection) && ((Collection) iterableOooOO0).isEmpty()) {
                    return true;
                }
                Iterator<Integer> it = iterableOooOO0.iterator();
                while (((C32520OooO0oo) it).f116817OooOoO0) {
                    int iNextInt = ((oOo000Oo.Oooo000) it).nextInt();
                    AbstractC33038OooO0oO<?> abstractC33038OooO0oO2 = (AbstractC33038OooO0oO) ((List) c33033OooO0O0.f119483OooO00o).get(iNextInt);
                    OooO00o.OooO0O0.OooO0OO oooO0OO2 = oooO0OO.f118040Oooo00O.get(iNextInt);
                    kotlin.jvm.internal.OooOOO0.OooO0o(oooO0OO2, "value.getArrayElement(i)");
                    if (!OooO0O0(abstractC33038OooO0oO2, abstractC33320OooOooOooO0o, oooO0OO2)) {
                        return false;
                    }
                }
                return true;
            }
        }
        throw new IllegalStateException(("Deserialized ArrayValue should have the same number of elements as the original array value: " + abstractC33038OooO0oO).toString());
    }

    public final AbstractC33038OooO0oO<?> OooO0OO(AbstractC33320OooOoo abstractC33320OooOoo, OooO00o.OooO0O0.OooO0OO value, InterfaceC32918OooO0OO nameResolver) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(value, "value");
        kotlin.jvm.internal.OooOOO0.OooO0oO(nameResolver, "nameResolver");
        boolean zBooleanValue = C32917OooO0O0.f118794Oooo0o.OooO0OO(value.f118038Oooo0).booleanValue();
        OooO00o.OooO0O0.OooO0OO.EnumC20267OooO0OO enumC20267OooO0OO = value.f118032OooOoO0;
        switch (enumC20267OooO0OO == null ? -1 : OooO00o.f120254OooO00o[enumC20267OooO0OO.ordinal()]) {
            case 1:
                byte b = (byte) value.f118031OooOoO;
                return zBooleanValue ? new C33049OooOoO0(b) : new C33035OooO0Oo(b);
            case 2:
                return new C33037OooO0o0(Character.valueOf((char) value.f118031OooOoO));
            case 3:
                short s = (short) value.f118031OooOoO;
                return zBooleanValue ? new C33052OooOoo0(s) : new C33046OooOo0O(s);
            case 4:
                int i = (int) value.f118031OooOoO;
                return zBooleanValue ? new C33048OooOoO(i) : new oO0OOo.OooOOO(i);
            case 5:
                long j = value.f118031OooOoO;
                return zBooleanValue ? new C33050OooOoOO(j) : new oO0OOo.OooOo00(j);
            case 6:
                return new oO0OOo.OooOOO0(value.f118033OooOoOO);
            case 7:
                return new oO0OOo.OooOO0(value.f118035OooOoo0);
            case 8:
                return new C33034OooO0OO(Boolean.valueOf(value.f118031OooOoO != 0));
            case 9:
                return new C33047OooOo0o(nameResolver.getString(value.f118034OooOoo));
            case 10:
                return new C33044OooOOoo(C24969OooOO0.OooO00o(nameResolver, value.f118036OooOooO), value.f118041Oooo00o);
            case 11:
                return new oO0OOo.OooOO0O(C24969OooOO0.OooO00o(nameResolver, value.f118036OooOooO), C24969OooOO0.OooO0O0(nameResolver, value.f118037OooOooo));
            case 12:
                oO0OO00.OooO00o oooO00o = value.f118039Oooo000;
                kotlin.jvm.internal.OooOOO0.OooO0o(oooO00o, "value.annotation");
                return new C33032OooO00o(OooO00o(oooO00o, nameResolver));
            case 13:
                List<OooO00o.OooO0O0.OooO0OO> list = value.f118040Oooo00O;
                kotlin.jvm.internal.OooOOO0.OooO0o(list, "value.arrayElementList");
                List<OooO00o.OooO0O0.OooO0OO> list2 = list;
                ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
                for (OooO00o.OooO0O0.OooO0OO it : list2) {
                    AbstractC33328Oooo0O0 abstractC33328Oooo0O0OooO0o0 = this.f120252OooO00o.OooOO0O().OooO0o0();
                    kotlin.jvm.internal.OooOOO0.OooO0o(it, "it");
                    arrayList.add(OooO0OO(abstractC33328Oooo0O0OooO0o0, it, nameResolver));
                }
                return new oO0OOo.OooOo(arrayList, abstractC33320OooOoo);
            default:
                throw new IllegalStateException(("Unsupported annotation argument type: " + value.f118032OooOoO0 + " (expected " + abstractC33320OooOoo + ')').toString());
        }
    }
}
