package oO0OooO;

import com.aspose.slides.Oooo0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C24035Oooo00o;
import o00Oo0oO.C25050OooO0O0;
import o0Oo0o00.o0OOO0o;
import oO00ooO.C32443OooOOO;
import oO0O0O0o.OooOOO;
import oO0O0OO.C32610OooOo0O;
import oO0O0OO.EnumC32614OooOoOO;
import oO0O0OO.InterfaceC32596OooO0o0;
import oO0O0OO.InterfaceC32598OooO0oo;
import oO0O0OO.InterfaceC32637OoooOoo;
import oO0Ooo.AbstractC33296OooO0Oo;
import oO0Ooo.AbstractC33316OooOo0o;
import oO0Ooo.AbstractC33320OooOoo;
import oO0Ooo.AbstractC33328Oooo0O0;
import oO0Ooo.AbstractC33344OoooOoo;
import oO0Ooo.AbstractC33354o00o0O;
import oO0Ooo.C33310OooOOo0;
import oO0Ooo.C33313OooOo0;
import oO0Ooo.C33319OooOoOO;
import oO0Ooo.C33322OooOooO;
import oO0Ooo.C33330Oooo0o;
import oO0Ooo.C33332Oooo0oO;
import oO0Ooo.C33335OoooO0;
import oO0Ooo.C33339OoooOOO;
import oO0Ooo.C33351Oooooo0;
import oO0Ooo.C33356ooOO;
import oO0Ooo.InterfaceC33342OoooOo0;
import oO0Ooo.InterfaceC33348OooooOO;
import oO0Ooo.o00Oo0;
import oO0OooO.AbstractC33456OooO0o0;
import oO0OooO0.C33477OooO0OO;
import oO0o000.C33538OooO0OO;
import oO0o0000.InterfaceC33539OooO0Oo;
import oO0o0000.InterfaceC33540OooO0o0;
import oO0o0000.InterfaceC33541OooO0oO;
import oO0o0000.InterfaceC33542OooO0oo;
import oO0o0000.InterfaceC33543OooOO0o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.OooOo;

/* JADX INFO: renamed from: oO0OooO.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public interface InterfaceC33452OooO0O0 extends oO0o0000.OooOOO0 {

    /* JADX INFO: renamed from: oO0OooO.OooO0O0$OooO00o */
    public static final class OooO00o {
        public static C33351Oooooo0 OooO(InterfaceC33541OooO0oO receiver) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(receiver, "$receiver");
            if (receiver instanceof AbstractC33320OooOoo) {
                return C33538OooO0OO.OooO00o((AbstractC33320OooOoo) receiver);
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(androidx.concurrent.futures.OooO00o.OooO0Oo(C24035Oooo00o.f80943OooO00o, receiver.getClass(), sb).toString());
        }

        public static boolean OooO00o(oO0o0000.OooOO0O c1, oO0o0000.OooOO0O c2) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(c1, "c1");
            kotlin.jvm.internal.OooOOO0.OooO0oO(c2, "c2");
            if (!(c1 instanceof InterfaceC33342OoooOo0)) {
                StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                sb.append(c1);
                sb.append(", ");
                throw new IllegalArgumentException(androidx.concurrent.futures.OooO00o.OooO0Oo(C24035Oooo00o.f80943OooO00o, c1.getClass(), sb).toString());
            }
            if (c2 instanceof InterfaceC33342OoooOo0) {
                return c1.equals(c2);
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(c2);
            sb2.append(", ");
            throw new IllegalArgumentException(androidx.concurrent.futures.OooO00o.OooO0Oo(C24035Oooo00o.f80943OooO00o, c2.getClass(), sb2).toString());
        }

        public static int OooO0O0(InterfaceC33541OooO0oO receiver) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(receiver, "$receiver");
            if (receiver instanceof AbstractC33320OooOoo) {
                return ((AbstractC33320OooOoo) receiver).o000000O().size();
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(androidx.concurrent.futures.OooO00o.OooO0Oo(C24035Oooo00o.f80943OooO00o, receiver.getClass(), sb).toString());
        }

        public static oO0o0000.OooO OooO0OO(InterfaceC33542OooO0oo receiver) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(receiver, "$receiver");
            if (receiver instanceof AbstractC33328Oooo0O0) {
                return (oO0o0000.OooO) receiver;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(androidx.concurrent.futures.OooO00o.OooO0Oo(C24035Oooo00o.f80943OooO00o, receiver.getClass(), sb).toString());
        }

        public static oO0o0000.OooO0OO OooO0Oo(InterfaceC33452OooO0O0 interfaceC33452OooO0O0, InterfaceC33542OooO0oo receiver) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(receiver, "$receiver");
            if (receiver instanceof AbstractC33328Oooo0O0) {
                if (receiver instanceof C33330Oooo0o) {
                    return interfaceC33452OooO0O0.OoooOoO(((C33330Oooo0o) receiver).f120589OooOo);
                }
                if (receiver instanceof C33450OooO) {
                    return (C33450OooO) receiver;
                }
                return null;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(androidx.concurrent.futures.OooO00o.OooO0Oo(C24035Oooo00o.f80943OooO00o, receiver.getClass(), sb).toString());
        }

        public static C33313OooOo0 OooO0o(AbstractC33316OooOo0o abstractC33316OooOo0o) {
            if (abstractC33316OooOo0o instanceof C33313OooOo0) {
                return (C33313OooOo0) abstractC33316OooOo0o;
            }
            return null;
        }

        public static C33310OooOOo0 OooO0o0(InterfaceC33542OooO0oo receiver) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(receiver, "$receiver");
            if (receiver instanceof AbstractC33328Oooo0O0) {
                if (receiver instanceof C33310OooOOo0) {
                    return (C33310OooOOo0) receiver;
                }
                return null;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(androidx.concurrent.futures.OooO00o.OooO0Oo(C24035Oooo00o.f80943OooO00o, receiver.getClass(), sb).toString());
        }

        public static AbstractC33316OooOo0o OooO0oO(InterfaceC33541OooO0oO receiver) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(receiver, "$receiver");
            if (receiver instanceof AbstractC33320OooOoo) {
                AbstractC33354o00o0O abstractC33354o00o0OO00000OO = ((AbstractC33320OooOoo) receiver).o00000OO();
                if (abstractC33354o00o0OO00000OO instanceof AbstractC33316OooOo0o) {
                    return (AbstractC33316OooOo0o) abstractC33354o00o0OO00000OO;
                }
                return null;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(androidx.concurrent.futures.OooO00o.OooO0Oo(C24035Oooo00o.f80943OooO00o, receiver.getClass(), sb).toString());
        }

        public static AbstractC33328Oooo0O0 OooO0oo(InterfaceC33541OooO0oO receiver) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(receiver, "$receiver");
            if (receiver instanceof AbstractC33320OooOoo) {
                AbstractC33354o00o0O abstractC33354o00o0OO00000OO = ((AbstractC33320OooOoo) receiver).o00000OO();
                if (abstractC33354o00o0OO00000OO instanceof AbstractC33328Oooo0O0) {
                    return (AbstractC33328Oooo0O0) abstractC33354o00o0OO00000OO;
                }
                return null;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(androidx.concurrent.futures.OooO00o.OooO0Oo(C24035Oooo00o.f80943OooO00o, receiver.getClass(), sb).toString());
        }

        /* JADX WARN: Removed duplicated region for block: B:6:0x001f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static AbstractC33328Oooo0O0 OooOO0(InterfaceC33542OooO0oo interfaceC33542OooO0oo) {
            ArrayList arrayList;
            oO0o0000.OooO0O0 oooO0O0 = oO0o0000.OooO0O0.f121139OooOo0o;
            if (!(interfaceC33542OooO0oo instanceof AbstractC33328Oooo0O0)) {
                StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                sb.append(interfaceC33542OooO0oo);
                sb.append(", ");
                throw new IllegalArgumentException(androidx.concurrent.futures.OooO00o.OooO0Oo(C24035Oooo00o.f80943OooO00o, interfaceC33542OooO0oo.getClass(), sb).toString());
            }
            AbstractC33328Oooo0O0 abstractC33328Oooo0O0 = (AbstractC33328Oooo0O0) interfaceC33542OooO0oo;
            C33459OooOO0 c33459OooOO0 = null;
            if (abstractC33328Oooo0O0.o000000O().size() != abstractC33328Oooo0O0.o00000().getParameters().size()) {
                arrayList = null;
            } else {
                List<InterfaceC33348OooooOO> listO000000O = abstractC33328Oooo0O0.o000000O();
                List<InterfaceC33348OooooOO> list = listO000000O;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        if (((InterfaceC33348OooooOO) it.next()).OooO0OO() != 1) {
                            List<InterfaceC32637OoooOoo> parameters = abstractC33328Oooo0O0.o00000().getParameters();
                            kotlin.jvm.internal.OooOOO0.OooO0o(parameters, "type.constructor.parameters");
                            ArrayList<C32443OooOOO> arrayListO000OOo = OooOo.o000OOo(list, parameters);
                            arrayList = new ArrayList(C34428OooOOo.OooOOoo(arrayListO000OOo, 10));
                            for (C32443OooOOO c32443OooOOO : arrayListO000OOo) {
                                InterfaceC33348OooooOO interfaceC33348OooooOOOooO00o = (InterfaceC33348OooooOO) c32443OooOOO.f116638OooOo0o;
                                InterfaceC32637OoooOoo parameter = (InterfaceC32637OoooOoo) c32443OooOOO.f116637OooOo;
                                if (interfaceC33348OooooOOOooO00o.OooO0OO() != 1) {
                                    AbstractC33354o00o0O abstractC33354o00o0OO00000OO = (interfaceC33348OooooOOOooO00o.OooO00o() || interfaceC33348OooooOOOooO00o.OooO0OO() != 2) ? null : interfaceC33348OooooOOOooO00o.getType().o00000OO();
                                    kotlin.jvm.internal.OooOOO0.OooO0o(parameter, "parameter");
                                    interfaceC33348OooooOOOooO00o = C33538OooO0OO.OooO00o(new C33450OooO(oooO0O0, new C33460OooOO0O(interfaceC33348OooooOOOooO00o, c33459OooOO0, parameter, 6), abstractC33354o00o0OO00000OO, (C33339OoooOOO) null, false, 56));
                                }
                                arrayList.add(interfaceC33348OooooOOOooO00o);
                            }
                            C33356ooOO c33356ooOOOooO0o0 = C33356ooOO.OooO0o0(AbstractC33344OoooOoo.f120613OooO0O0.OooO00o(abstractC33328Oooo0O0.o00000(), arrayList));
                            int size = listO000000O.size();
                            for (int i = 0; i < size; i++) {
                                InterfaceC33348OooooOO interfaceC33348OooooOO = listO000000O.get(i);
                                InterfaceC33348OooooOO interfaceC33348OooooOO2 = (InterfaceC33348OooooOO) arrayList.get(i);
                                if (interfaceC33348OooooOO.OooO0OO() != 1) {
                                    List<AbstractC33320OooOoo> upperBounds = abstractC33328Oooo0O0.o00000().getParameters().get(i).getUpperBounds();
                                    kotlin.jvm.internal.OooOOO0.OooO0o(upperBounds, "type.constructor.parameters[index].upperBounds");
                                    ArrayList arrayList2 = new ArrayList();
                                    Iterator<T> it2 = upperBounds.iterator();
                                    while (it2.hasNext()) {
                                        arrayList2.add(AbstractC33456OooO0o0.OooO00o.f120915OooO00o.OoooooO(c33356ooOOOooO0o0.OooO0oo(1, (AbstractC33320OooOoo) it2.next()).o00000OO()));
                                    }
                                    if (!interfaceC33348OooooOO.OooO00o() && interfaceC33348OooooOO.OooO0OO() == 3) {
                                        arrayList2.add(AbstractC33456OooO0o0.OooO00o.f120915OooO00o.OoooooO(interfaceC33348OooooOO.getType().o00000OO()));
                                    }
                                    AbstractC33320OooOoo type = interfaceC33348OooooOO2.getType();
                                    kotlin.jvm.internal.OooOOO0.OooO0o0(type, "null cannot be cast to non-null type org.jetbrains.kotlin.types.checker.NewCapturedType");
                                    C33460OooOO0O c33460OooOO0O = ((C33450OooO) type).f120908OooOoO0;
                                    c33460OooOO0O.getClass();
                                    c33460OooOO0O.f120920OooO0O0 = new C33461OooOO0o(arrayList2);
                                }
                            }
                        }
                    }
                    arrayList = null;
                }
            }
            if (arrayList != null) {
                return C33322OooOooO.OooO0o0(abstractC33328Oooo0O0.o000000o(), abstractC33328Oooo0O0.o00000(), arrayList, abstractC33328Oooo0O0.o00000O0(), null);
            }
            return null;
        }

        public static oO0o0000.OooO0O0 OooOO0O(oO0o0000.OooO0OO receiver) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(receiver, "$receiver");
            if (receiver instanceof C33450OooO) {
                return ((C33450OooO) receiver).f120906OooOo;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(androidx.concurrent.futures.OooO00o.OooO0Oo(C24035Oooo00o.f80943OooO00o, receiver.getClass(), sb).toString());
        }

        public static AbstractC33354o00o0O OooOO0o(InterfaceC33452OooO0O0 interfaceC33452OooO0O0, InterfaceC33542OooO0oo lowerBound, InterfaceC33542OooO0oo upperBound) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(lowerBound, "lowerBound");
            kotlin.jvm.internal.OooOOO0.OooO0oO(upperBound, "upperBound");
            if (!(lowerBound instanceof AbstractC33328Oooo0O0)) {
                StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                sb.append(interfaceC33452OooO0O0);
                sb.append(", ");
                throw new IllegalArgumentException(androidx.concurrent.futures.OooO00o.OooO0Oo(C24035Oooo00o.f80943OooO00o, interfaceC33452OooO0O0.getClass(), sb).toString());
            }
            if (upperBound instanceof AbstractC33328Oooo0O0) {
                return C33322OooOooO.OooO0OO((AbstractC33328Oooo0O0) lowerBound, (AbstractC33328Oooo0O0) upperBound);
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(interfaceC33452OooO0O0);
            sb2.append(", ");
            throw new IllegalArgumentException(androidx.concurrent.futures.OooO00o.OooO0Oo(C24035Oooo00o.f80943OooO00o, interfaceC33452OooO0O0.getClass(), sb2).toString());
        }

        public static InterfaceC33543OooOO0o OooOOO(oO0o0000.OooOO0O receiver, int i) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(receiver, "$receiver");
            if (receiver instanceof InterfaceC33342OoooOo0) {
                InterfaceC32637OoooOoo interfaceC32637OoooOoo = ((InterfaceC33342OoooOo0) receiver).getParameters().get(i);
                kotlin.jvm.internal.OooOOO0.OooO0o(interfaceC32637OoooOoo, "this.parameters[index]");
                return interfaceC32637OoooOoo;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(androidx.concurrent.futures.OooO00o.OooO0Oo(C24035Oooo00o.f80943OooO00o, receiver.getClass(), sb).toString());
        }

        public static oO0o0000.OooOO0 OooOOO0(InterfaceC33541OooO0oO receiver, int i) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(receiver, "$receiver");
            if (receiver instanceof AbstractC33320OooOoo) {
                return ((AbstractC33320OooOoo) receiver).o000000O().get(i);
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(androidx.concurrent.futures.OooO00o.OooO0Oo(C24035Oooo00o.f80943OooO00o, receiver.getClass(), sb).toString());
        }

        public static AbstractC33354o00o0O OooOOOO(oO0o0000.OooOO0 receiver) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(receiver, "$receiver");
            if (receiver instanceof InterfaceC33348OooooOO) {
                return ((InterfaceC33348OooooOO) receiver).getType().o00000OO();
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(androidx.concurrent.futures.OooO00o.OooO0Oo(C24035Oooo00o.f80943OooO00o, receiver.getClass(), sb).toString());
        }

        public static InterfaceC32637OoooOoo OooOOOo(oO0o0000.OooOOOO oooOOOO) {
            if (oooOOOO instanceof InterfaceC33464OooOOOO) {
                return ((InterfaceC33464OooOOOO) oooOOOO).OooO00o();
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(oooOOOO);
            sb.append(", ");
            throw new IllegalArgumentException(androidx.concurrent.futures.OooO00o.OooO0Oo(C24035Oooo00o.f80943OooO00o, oooOOOO.getClass(), sb).toString());
        }

        public static int OooOOo(oO0o0000.OooOO0 receiver) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(receiver, "$receiver");
            if (receiver instanceof InterfaceC33348OooooOO) {
                int iOooO0OO = ((InterfaceC33348OooooOO) receiver).OooO0OO();
                Oooo0.OooO0OO(iOooO0OO, "this.projectionKind");
                return C25050OooO0O0.OooO0O0(iOooO0OO);
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(androidx.concurrent.futures.OooO00o.OooO0Oo(C24035Oooo00o.f80943OooO00o, receiver.getClass(), sb).toString());
        }

        public static InterfaceC32637OoooOoo OooOOo0(oO0o0000.OooOO0O receiver) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(receiver, "$receiver");
            if (receiver instanceof InterfaceC33342OoooOo0) {
                InterfaceC32598OooO0oo interfaceC32598OooO0ooOooO0OO = ((InterfaceC33342OoooOo0) receiver).OooO0OO();
                if (interfaceC32598OooO0ooOooO0OO instanceof InterfaceC32637OoooOoo) {
                    return (InterfaceC32637OoooOoo) interfaceC32598OooO0ooOooO0OO;
                }
                return null;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(androidx.concurrent.futures.OooO00o.OooO0Oo(C24035Oooo00o.f80943OooO00o, receiver.getClass(), sb).toString());
        }

        public static int OooOOoo(InterfaceC33543OooOO0o receiver) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(receiver, "$receiver");
            if (receiver instanceof InterfaceC32637OoooOoo) {
                int iOooOo0 = ((InterfaceC32637OoooOoo) receiver).OooOo0();
                Oooo0.OooO0OO(iOooOo0, "this.variance");
                return C25050OooO0O0.OooO0O0(iOooOo0);
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(androidx.concurrent.futures.OooO00o.OooO0Oo(C24035Oooo00o.f80943OooO00o, receiver.getClass(), sb).toString());
        }

        public static boolean OooOo(oO0o0000.OooOO0O receiver) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(receiver, "$receiver");
            if (receiver instanceof InterfaceC33342OoooOo0) {
                return ((InterfaceC33342OoooOo0) receiver).OooO0OO() instanceof InterfaceC32596OooO0o0;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(androidx.concurrent.futures.OooO00o.OooO0Oo(C24035Oooo00o.f80943OooO00o, receiver.getClass(), sb).toString());
        }

        public static boolean OooOo0(InterfaceC33543OooOO0o interfaceC33543OooOO0o, oO0o0000.OooOO0O oooOO0O) {
            if (!(interfaceC33543OooOO0o instanceof InterfaceC32637OoooOoo)) {
                StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                sb.append(interfaceC33543OooOO0o);
                sb.append(", ");
                throw new IllegalArgumentException(androidx.concurrent.futures.OooO00o.OooO0Oo(C24035Oooo00o.f80943OooO00o, interfaceC33543OooOO0o.getClass(), sb).toString());
            }
            if (oooOO0O == null ? true : oooOO0O instanceof InterfaceC33342OoooOo0) {
                return C33538OooO0OO.OooO0oO((InterfaceC32637OoooOoo) interfaceC33543OooOO0o, (InterfaceC33342OoooOo0) oooOO0O, null);
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(interfaceC33543OooOO0o);
            sb2.append(", ");
            throw new IllegalArgumentException(androidx.concurrent.futures.OooO00o.OooO0Oo(C24035Oooo00o.f80943OooO00o, interfaceC33543OooOO0o.getClass(), sb2).toString());
        }

        public static boolean OooOo00(AbstractC33320OooOoo receiver, C33477OooO0OO fqName) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(receiver, "$receiver");
            kotlin.jvm.internal.OooOOO0.OooO0oO(fqName, "fqName");
            return receiver.getAnnotations().Oooo000(fqName);
        }

        public static boolean OooOo0O(InterfaceC33542OooO0oo a, InterfaceC33542OooO0oo b) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(a, "a");
            kotlin.jvm.internal.OooOOO0.OooO0oO(b, "b");
            if (!(a instanceof AbstractC33328Oooo0O0)) {
                StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                sb.append(a);
                sb.append(", ");
                throw new IllegalArgumentException(androidx.concurrent.futures.OooO00o.OooO0Oo(C24035Oooo00o.f80943OooO00o, a.getClass(), sb).toString());
            }
            if (b instanceof AbstractC33328Oooo0O0) {
                return ((AbstractC33328Oooo0O0) a).o000000O() == ((AbstractC33328Oooo0O0) b).o000000O();
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(b);
            sb2.append(", ");
            throw new IllegalArgumentException(androidx.concurrent.futures.OooO00o.OooO0Oo(C24035Oooo00o.f80943OooO00o, b.getClass(), sb2).toString());
        }

        public static boolean OooOo0o(oO0o0000.OooOO0O receiver) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(receiver, "$receiver");
            if (receiver instanceof InterfaceC33342OoooOo0) {
                return oO0O0O0o.OooOO0.Oooo00o((InterfaceC33342OoooOo0) receiver, OooOOO.OooO00o.f117150OooO00o);
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(androidx.concurrent.futures.OooO00o.OooO0Oo(C24035Oooo00o.f80943OooO00o, receiver.getClass(), sb).toString());
        }

        public static boolean OooOoO(oO0o0000.OooOO0O receiver) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(receiver, "$receiver");
            if (receiver instanceof InterfaceC33342OoooOo0) {
                return ((InterfaceC33342OoooOo0) receiver).OooO0o0();
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(androidx.concurrent.futures.OooO00o.OooO0Oo(C24035Oooo00o.f80943OooO00o, receiver.getClass(), sb).toString());
        }

        public static boolean OooOoO0(oO0o0000.OooOO0O oooOO0O) {
            if (oooOO0O instanceof InterfaceC33342OoooOo0) {
                InterfaceC32598OooO0oo interfaceC32598OooO0ooOooO0OO = ((InterfaceC33342OoooOo0) oooOO0O).OooO0OO();
                InterfaceC32596OooO0o0 interfaceC32596OooO0o0 = interfaceC32598OooO0ooOooO0OO instanceof InterfaceC32596OooO0o0 ? (InterfaceC32596OooO0o0) interfaceC32598OooO0ooOooO0OO : null;
                return (interfaceC32596OooO0o0 == null || interfaceC32596OooO0o0.OooO0oO() != EnumC32614OooOoOO.f117261OooOo0o || interfaceC32596OooO0o0.getKind() == oO0O0OO.OooO0o.f117232OooOoO0 || interfaceC32596OooO0o0.getKind() == oO0O0OO.OooO0o.f117231OooOoO || interfaceC32596OooO0o0.getKind() == oO0O0OO.OooO0o.f117233OooOoOO) ? false : true;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(oooOO0O);
            sb.append(", ");
            throw new IllegalArgumentException(androidx.concurrent.futures.OooO00o.OooO0Oo(C24035Oooo00o.f80943OooO00o, oooOO0O.getClass(), sb).toString());
        }

        public static boolean OooOoOO(InterfaceC33541OooO0oO receiver) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(receiver, "$receiver");
            if (receiver instanceof AbstractC33320OooOoo) {
                return o0OOO0o.OooO0O0((AbstractC33320OooOoo) receiver);
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(androidx.concurrent.futures.OooO00o.OooO0Oo(C24035Oooo00o.f80943OooO00o, receiver.getClass(), sb).toString());
        }

        public static boolean OooOoo(oO0o0000.OooOO0O receiver) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(receiver, "$receiver");
            if (receiver instanceof InterfaceC33342OoooOo0) {
                return receiver instanceof oO0OOo.OooOOOO;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(androidx.concurrent.futures.OooO00o.OooO0Oo(C24035Oooo00o.f80943OooO00o, receiver.getClass(), sb).toString());
        }

        public static boolean OooOoo0(oO0o0000.OooOO0O receiver) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(receiver, "$receiver");
            if (receiver instanceof InterfaceC33342OoooOo0) {
                InterfaceC32598OooO0oo interfaceC32598OooO0ooOooO0OO = ((InterfaceC33342OoooOo0) receiver).OooO0OO();
                InterfaceC32596OooO0o0 interfaceC32596OooO0o0 = interfaceC32598OooO0ooOooO0OO instanceof InterfaceC32596OooO0o0 ? (InterfaceC32596OooO0o0) interfaceC32598OooO0ooOooO0OO : null;
                return (interfaceC32596OooO0o0 != null ? interfaceC32596OooO0o0.Ooooo00() : null) instanceof C32610OooOo0O;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(androidx.concurrent.futures.OooO00o.OooO0Oo(C24035Oooo00o.f80943OooO00o, receiver.getClass(), sb).toString());
        }

        public static boolean OooOooO(oO0o0000.OooOO0O receiver) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(receiver, "$receiver");
            if (receiver instanceof InterfaceC33342OoooOo0) {
                return receiver instanceof C33319OooOoOO;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(androidx.concurrent.futures.OooO00o.OooO0Oo(C24035Oooo00o.f80943OooO00o, receiver.getClass(), sb).toString());
        }

        public static boolean OooOooo(InterfaceC33542OooO0oo receiver) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(receiver, "$receiver");
            if (receiver instanceof AbstractC33328Oooo0O0) {
                return ((AbstractC33328Oooo0O0) receiver).o00000O0();
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(androidx.concurrent.futures.OooO00o.OooO0Oo(C24035Oooo00o.f80943OooO00o, receiver.getClass(), sb).toString());
        }

        public static AbstractC33328Oooo0O0 Oooo(InterfaceC33539OooO0Oo interfaceC33539OooO0Oo) {
            if (interfaceC33539OooO0Oo instanceof C33310OooOOo0) {
                return ((C33310OooOOo0) interfaceC33539OooO0Oo).f120547OooOo;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(interfaceC33539OooO0Oo);
            sb.append(", ");
            throw new IllegalArgumentException(androidx.concurrent.futures.OooO00o.OooO0Oo(C24035Oooo00o.f80943OooO00o, interfaceC33539OooO0Oo.getClass(), sb).toString());
        }

        public static boolean Oooo0(oO0o0000.OooO0OO oooO0OO) {
            if (oooO0OO instanceof C33450OooO) {
                return ((C33450OooO) oooO0OO).f120910OooOoo;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(oooO0OO);
            sb.append(", ");
            throw new IllegalArgumentException(androidx.concurrent.futures.OooO00o.OooO0Oo(C24035Oooo00o.f80943OooO00o, oooO0OO.getClass(), sb).toString());
        }

        public static boolean Oooo000(oO0o0000.OooOO0O receiver) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(receiver, "$receiver");
            if (receiver instanceof InterfaceC33342OoooOo0) {
                return oO0O0O0o.OooOO0.Oooo00o((InterfaceC33342OoooOo0) receiver, OooOOO.OooO00o.f117151OooO0O0);
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(androidx.concurrent.futures.OooO00o.OooO0Oo(C24035Oooo00o.f80943OooO00o, receiver.getClass(), sb).toString());
        }

        public static boolean Oooo00O(InterfaceC33541OooO0oO receiver) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(receiver, "$receiver");
            if (receiver instanceof AbstractC33320OooOoo) {
                return o00Oo0.OooO0o((AbstractC33320OooOoo) receiver);
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(androidx.concurrent.futures.OooO00o.OooO0Oo(C24035Oooo00o.f80943OooO00o, receiver.getClass(), sb).toString());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean Oooo00o(InterfaceC33542OooO0oo receiver) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(receiver, "$receiver");
            if (receiver instanceof AbstractC33320OooOoo) {
                return oO0O0O0o.OooOO0.Oooo000((AbstractC33320OooOoo) receiver);
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(androidx.concurrent.futures.OooO00o.OooO0Oo(C24035Oooo00o.f80943OooO00o, receiver.getClass(), sb).toString());
        }

        public static boolean Oooo0O0(oO0o0000.OooOO0 receiver) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(receiver, "$receiver");
            if (receiver instanceof InterfaceC33348OooooOO) {
                return ((InterfaceC33348OooooOO) receiver).OooO00o();
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(androidx.concurrent.futures.OooO00o.OooO0Oo(C24035Oooo00o.f80943OooO00o, receiver.getClass(), sb).toString());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean Oooo0OO(InterfaceC33542OooO0oo receiver) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(receiver, "$receiver");
            if (receiver instanceof AbstractC33328Oooo0O0) {
                AbstractC33320OooOoo abstractC33320OooOoo = (AbstractC33320OooOoo) receiver;
                if (abstractC33320OooOoo instanceof AbstractC33296OooO0Oo) {
                    return true;
                }
                return (abstractC33320OooOoo instanceof C33310OooOOo0) && (((C33310OooOOo0) abstractC33320OooOoo).f120547OooOo instanceof AbstractC33296OooO0Oo);
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(androidx.concurrent.futures.OooO00o.OooO0Oo(C24035Oooo00o.f80943OooO00o, receiver.getClass(), sb).toString());
        }

        public static AbstractC33328Oooo0O0 Oooo0o(InterfaceC33540OooO0o0 interfaceC33540OooO0o0) {
            if (interfaceC33540OooO0o0 instanceof AbstractC33316OooOo0o) {
                return ((AbstractC33316OooOo0o) interfaceC33540OooO0o0).f120554OooOo;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(interfaceC33540OooO0o0);
            sb.append(", ");
            throw new IllegalArgumentException(androidx.concurrent.futures.OooO00o.OooO0Oo(C24035Oooo00o.f80943OooO00o, interfaceC33540OooO0o0.getClass(), sb).toString());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean Oooo0o0(InterfaceC33542OooO0oo receiver) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(receiver, "$receiver");
            if (receiver instanceof AbstractC33328Oooo0O0) {
                AbstractC33320OooOoo abstractC33320OooOoo = (AbstractC33320OooOoo) receiver;
                if (abstractC33320OooOoo instanceof C33335OoooO0) {
                    return true;
                }
                return (abstractC33320OooOoo instanceof C33310OooOOo0) && (((C33310OooOOo0) abstractC33320OooOoo).f120547OooOo instanceof C33335OoooO0);
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(androidx.concurrent.futures.OooO00o.OooO0Oo(C24035Oooo00o.f80943OooO00o, receiver.getClass(), sb).toString());
        }

        public static AbstractC33354o00o0O Oooo0oO(oO0o0000.OooO0OO oooO0OO) {
            if (oooO0OO instanceof C33450OooO) {
                return ((C33450OooO) oooO0OO).f120907OooOoO;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(oooO0OO);
            sb.append(", ");
            throw new IllegalArgumentException(androidx.concurrent.futures.OooO00o.OooO0Oo(C24035Oooo00o.f80943OooO00o, oooO0OO.getClass(), sb).toString());
        }

        public static AbstractC33354o00o0O Oooo0oo(InterfaceC33541OooO0oO interfaceC33541OooO0oO) {
            if (interfaceC33541OooO0oO instanceof AbstractC33354o00o0O) {
                return C33332Oooo0oO.OooO00o((AbstractC33354o00o0O) interfaceC33541OooO0oO, false);
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(interfaceC33541OooO0oO);
            sb.append(", ");
            throw new IllegalArgumentException(androidx.concurrent.futures.OooO00o.OooO0Oo(C24035Oooo00o.f80943OooO00o, interfaceC33541OooO0oO.getClass(), sb).toString());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static C33453OooO0OO OoooO(InterfaceC33452OooO0O0 interfaceC33452OooO0O0, InterfaceC33542OooO0oo interfaceC33542OooO0oo) {
            if (interfaceC33542OooO0oo instanceof AbstractC33328Oooo0O0) {
                AbstractC33320OooOoo abstractC33320OooOoo = (AbstractC33320OooOoo) interfaceC33542OooO0oo;
                return new C33453OooO0OO(interfaceC33452OooO0O0, C33356ooOO.OooO0o0(AbstractC33344OoooOoo.f120613OooO0O0.OooO00o(abstractC33320OooOoo.o00000(), abstractC33320OooOoo.o000000O())));
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(interfaceC33542OooO0oo);
            sb.append(", ");
            throw new IllegalArgumentException(androidx.concurrent.futures.OooO00o.OooO0Oo(C24035Oooo00o.f80943OooO00o, interfaceC33542OooO0oo.getClass(), sb).toString());
        }

        public static Collection<InterfaceC33541OooO0oO> OoooO0(InterfaceC33452OooO0O0 interfaceC33452OooO0O0, InterfaceC33542OooO0oo receiver) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(receiver, "$receiver");
            InterfaceC33342OoooOo0 interfaceC33342OoooOo0OooOo00 = interfaceC33452OooO0O0.OooOo00(receiver);
            if (interfaceC33342OoooOo0OooOo00 instanceof oO0OOo.OooOOOO) {
                return ((oO0OOo.OooOOOO) interfaceC33342OoooOo0OooOo00).f119488OooO00o;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(androidx.concurrent.futures.OooO00o.OooO0Oo(C24035Oooo00o.f80943OooO00o, receiver.getClass(), sb).toString());
        }

        public static int OoooO00(oO0o0000.OooOO0O receiver) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(receiver, "$receiver");
            if (receiver instanceof InterfaceC33342OoooOo0) {
                return ((InterfaceC33342OoooOo0) receiver).getParameters().size();
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(androidx.concurrent.futures.OooO00o.OooO0Oo(C24035Oooo00o.f80943OooO00o, receiver.getClass(), sb).toString());
        }

        public static InterfaceC33348OooooOO OoooO0O(oO0OOo0.OooO0O0 receiver) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(receiver, "$receiver");
            if (receiver instanceof C33460OooOO0O) {
                return ((C33460OooOO0O) receiver).f120919OooO00o;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(androidx.concurrent.futures.OooO00o.OooO0Oo(C24035Oooo00o.f80943OooO00o, receiver.getClass(), sb).toString());
        }

        public static Collection OoooOO0(oO0o0000.OooOO0O receiver) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(receiver, "$receiver");
            if (receiver instanceof InterfaceC33342OoooOo0) {
                Collection<AbstractC33320OooOoo> collectionOooO0Oo = ((InterfaceC33342OoooOo0) receiver).OooO0Oo();
                kotlin.jvm.internal.OooOOO0.OooO0o(collectionOooO0Oo, "this.supertypes");
                return collectionOooO0Oo;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(androidx.concurrent.futures.OooO00o.OooO0Oo(C24035Oooo00o.f80943OooO00o, receiver.getClass(), sb).toString());
        }

        public static C33460OooOO0O OoooOOO(oO0o0000.OooO0OO receiver) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(receiver, "$receiver");
            if (receiver instanceof C33450OooO) {
                return ((C33450OooO) receiver).f120908OooOoO0;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(androidx.concurrent.futures.OooO00o.OooO0Oo(C24035Oooo00o.f80943OooO00o, receiver.getClass(), sb).toString());
        }

        public static AbstractC33328Oooo0O0 OoooOOo(InterfaceC33540OooO0o0 interfaceC33540OooO0o0) {
            if (interfaceC33540OooO0o0 instanceof AbstractC33316OooOo0o) {
                return ((AbstractC33316OooOo0o) interfaceC33540OooO0o0).f120555OooOoO0;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(interfaceC33540OooO0o0);
            sb.append(", ");
            throw new IllegalArgumentException(androidx.concurrent.futures.OooO00o.OooO0Oo(C24035Oooo00o.f80943OooO00o, interfaceC33540OooO0o0.getClass(), sb).toString());
        }

        public static AbstractC33328Oooo0O0 OoooOo0(InterfaceC33542OooO0oo receiver, boolean z) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(receiver, "$receiver");
            if (receiver instanceof AbstractC33328Oooo0O0) {
                return ((AbstractC33328Oooo0O0) receiver).o00000Oo(z);
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(androidx.concurrent.futures.OooO00o.OooO0Oo(C24035Oooo00o.f80943OooO00o, receiver.getClass(), sb).toString());
        }

        public static InterfaceC33541OooO0oO OoooOoO(InterfaceC33452OooO0O0 interfaceC33452OooO0O0, InterfaceC33541OooO0oO interfaceC33541OooO0oO) {
            if (interfaceC33541OooO0oO instanceof InterfaceC33542OooO0oo) {
                return interfaceC33452OooO0O0.OooOoOO((InterfaceC33542OooO0oo) interfaceC33541OooO0oO, true);
            }
            if (!(interfaceC33541OooO0oO instanceof InterfaceC33540OooO0o0)) {
                throw new IllegalStateException("sealed");
            }
            InterfaceC33540OooO0o0 interfaceC33540OooO0o0 = (InterfaceC33540OooO0o0) interfaceC33541OooO0oO;
            return interfaceC33452OooO0O0.Oooo0oo(interfaceC33452OooO0O0.OooOoOO(interfaceC33452OooO0O0.OooOo0O(interfaceC33540OooO0o0), true), interfaceC33452OooO0O0.OooOoOO(interfaceC33452OooO0O0.Ooooo00(interfaceC33540OooO0o0), true));
        }

        public static InterfaceC33342OoooOo0 o000oOoO(InterfaceC33542OooO0oo receiver) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(receiver, "$receiver");
            if (receiver instanceof AbstractC33328Oooo0O0) {
                return ((AbstractC33328Oooo0O0) receiver).o00000();
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(androidx.concurrent.futures.OooO00o.OooO0Oo(C24035Oooo00o.f80943OooO00o, receiver.getClass(), sb).toString());
        }
    }

    AbstractC33354o00o0O Oooo0oo(InterfaceC33542OooO0oo interfaceC33542OooO0oo, InterfaceC33542OooO0oo interfaceC33542OooO0oo2);
}
