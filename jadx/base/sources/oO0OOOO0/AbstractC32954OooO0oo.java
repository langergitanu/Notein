package oO0OOOO0;

import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import oO0OOOO0.C32953OooO0oO;
import oO0OOOO0.C32963OooOo0;
import oO0OOOO0.InterfaceC32958OooOOOo;
import oO0OOOO0.OooO;
import oO0OOOO0.OooO00o;
import oO0OOOO0.OooO0o;
import oO0OOOO0.OooOO0O;
import oO0OOOO0.OooOo;

/* JADX INFO: renamed from: oO0OOOO0.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC32954OooO0oo extends oO0OOOO0.OooO00o implements Serializable {

    /* JADX INFO: renamed from: oO0OOOO0.OooO0oo$OooO00o */
    public static abstract class OooO00o<MessageType extends AbstractC32954OooO0oo, BuilderType extends OooO00o> extends OooO00o.AbstractC20287OooO00o<BuilderType> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public oO0OOOO0.OooO0OO f119081OooOo0o = oO0OOOO0.OooO0OO.f119053OooOo0o;

        @Override // 
        /* JADX INFO: renamed from: OooO0OO, reason: merged with bridge method [inline-methods] */
        public BuilderType clone() {
            throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
        }

        public abstract BuilderType OooO0Oo(MessageType messagetype);
    }

    /* JADX INFO: renamed from: oO0OOOO0.OooO0oo$OooO0O0 */
    public static abstract class OooO0O0<MessageType extends OooO0OO<MessageType>, BuilderType extends OooO0O0<MessageType, BuilderType>> extends OooO00o<MessageType, BuilderType> implements InterfaceC32960OooOOo0 {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public C32953OooO0oO<C32955OooO0Oo> f119082OooOo = C32953OooO0oO.f119077OooO0Oo;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public boolean f119083OooOoO0;

        public final void OooO0o0(MessageType messagetype) {
            OooOo00 oooOo00;
            if (!this.f119083OooOoO0) {
                this.f119082OooOo = this.f119082OooOo.clone();
                this.f119083OooOoO0 = true;
            }
            C32953OooO0oO<C32955OooO0Oo> c32953OooO0oO = this.f119082OooOo;
            C32953OooO0oO<C32955OooO0Oo> c32953OooO0oO2 = messagetype.f119084OooOo0o;
            c32953OooO0oO.getClass();
            int i = 0;
            while (true) {
                int size = c32953OooO0oO2.f119078OooO00o.f119128OooOo.size();
                oooOo00 = c32953OooO0oO2.f119078OooO00o;
                if (i >= size) {
                    break;
                }
                c32953OooO0oO.OooO0oo(oooOo00.f119128OooOo.get(i));
                i++;
            }
            Iterator<Map.Entry<Object, Object>> it = oooOo00.OooO0Oo().iterator();
            while (it.hasNext()) {
                c32953OooO0oO.OooO0oo((Map.Entry) it.next());
            }
        }
    }

    /* JADX INFO: renamed from: oO0OOOO0.OooO0oo$OooO0Oo, reason: case insensitive filesystem */
    public static final class C32955OooO0Oo implements C32953OooO0oO.OooO00o<C32955OooO0Oo> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final OooOo f119087OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final int f119088OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final boolean f119089OooOoO0;

        public C32955OooO0Oo(int i, OooOo oooOo, boolean z) {
            this.f119088OooOo0o = i;
            this.f119087OooOo = oooOo;
            this.f119089OooOoO0 = z;
        }

        @Override // java.lang.Comparable
        public final int compareTo(Object obj) {
            return this.f119088OooOo0o - ((C32955OooO0Oo) obj).f119088OooOo0o;
        }

        @Override // oO0OOOO0.C32953OooO0oO.OooO00o
        public final EnumC32967OooOoO0 getLiteJavaType() {
            return this.f119087OooOo.f119126OooOo0o;
        }

        @Override // oO0OOOO0.C32953OooO0oO.OooO00o
        public final OooOo getLiteType() {
            return this.f119087OooOo;
        }

        @Override // oO0OOOO0.C32953OooO0oO.OooO00o
        public final int getNumber() {
            return this.f119088OooOo0o;
        }

        @Override // oO0OOOO0.C32953OooO0oO.OooO00o
        public final boolean isPacked() {
            return false;
        }

        @Override // oO0OOOO0.C32953OooO0oO.OooO00o
        public final boolean isRepeated() {
            return this.f119089OooOoO0;
        }

        @Override // oO0OOOO0.C32953OooO0oO.OooO00o
        public final OooO00o ooOO(InterfaceC32958OooOOOo.OooO00o oooO00o, InterfaceC32958OooOOOo interfaceC32958OooOOOo) {
            return ((OooO00o) oooO00o).OooO0Oo((AbstractC32954OooO0oo) interfaceC32958OooOOOo);
        }
    }

    /* JADX INFO: renamed from: oO0OOOO0.OooO0oo$OooO0o0, reason: case insensitive filesystem */
    public static class C32956OooO0o0<ContainingType extends InterfaceC32958OooOOOo, Type> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final OooO0OO f119090OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Type f119091OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final AbstractC32954OooO0oo f119092OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final C32955OooO0Oo f119093OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final Method f119094OooO0o0;

        /* JADX WARN: Multi-variable type inference failed */
        public C32956OooO0o0(OooO0OO oooO0OO, Object obj, AbstractC32954OooO0oo abstractC32954OooO0oo, C32955OooO0Oo c32955OooO0Oo, Class cls) {
            if (oooO0OO == null) {
                throw new IllegalArgumentException("Null containingTypeDefaultInstance");
            }
            if (c32955OooO0Oo.f119087OooOo == OooOo.f119123OooOoo0 && abstractC32954OooO0oo == null) {
                throw new IllegalArgumentException("Null messageDefaultInstance");
            }
            this.f119090OooO00o = oooO0OO;
            this.f119091OooO0O0 = obj;
            this.f119092OooO0OO = abstractC32954OooO0oo;
            this.f119093OooO0Oo = c32955OooO0Oo;
            if (!OooO.OooO00o.class.isAssignableFrom(cls)) {
                this.f119094OooO0o0 = null;
                return;
            }
            try {
                this.f119094OooO0o0 = cls.getMethod("valueOf", Integer.TYPE);
            } catch (NoSuchMethodException e) {
                String name = cls.getName();
                throw new RuntimeException(com.aspose.slides.OooOOO.OooO0O0(new StringBuilder(name.length() + 52), "Generated message class \"", name, "\" missing method \"valueOf\"."), e);
            }
        }

        public final Object OooO00o(Object obj) {
            if (this.f119093OooO0Oo.f119087OooOo.f119126OooOo0o != EnumC32967OooOoO0.ENUM) {
                return obj;
            }
            try {
                return this.f119094OooO0o0.invoke(null, (Integer) obj);
            } catch (IllegalAccessException e) {
                throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
            } catch (InvocationTargetException e2) {
                Throwable cause = e2.getCause();
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                if (cause instanceof Error) {
                    throw ((Error) cause);
                }
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
        }

        public final Object OooO0O0(Object obj) {
            return this.f119093OooO0Oo.f119087OooOo.f119126OooOo0o == EnumC32967OooOoO0.ENUM ? Integer.valueOf(((OooO.OooO00o) obj).getNumber()) : obj;
        }
    }

    public static C32956OooO0o0 OooO0O0(OooO0OO oooO0OO, AbstractC32954OooO0oo abstractC32954OooO0oo, int i, OooOo.OooO0OO oooO0OO2, Class cls) {
        return new C32956OooO0o0(oooO0OO, Collections.EMPTY_LIST, abstractC32954OooO0oo, new C32955OooO0Oo(i, oooO0OO2, true), cls);
    }

    public static C32956OooO0o0 OooO0OO(OooO0OO oooO0OO, Serializable serializable, AbstractC32954OooO0oo abstractC32954OooO0oo, int i, OooOo oooOo, Class cls) {
        return new C32956OooO0o0(oooO0OO, serializable, abstractC32954OooO0oo, new C32955OooO0Oo(i, oooOo, false), cls);
    }

    /* JADX INFO: renamed from: oO0OOOO0.OooO0oo$OooO0OO */
    public static abstract class OooO0OO<MessageType extends OooO0OO<MessageType>> extends AbstractC32954OooO0oo implements InterfaceC32960OooOOo0 {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final C32953OooO0oO<C32955OooO0Oo> f119084OooOo0o;

        /* JADX INFO: renamed from: oO0OOOO0.OooO0oo$OooO0OO$OooO00o */
        public class OooO00o {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public final Iterator<Map.Entry<C32955OooO0Oo, Object>> f119085OooO00o;

            /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
            public Map.Entry<C32955OooO0Oo, Object> f119086OooO0O0;

            public OooO00o(OooO0OO oooO0OO) {
                Iterator<Map.Entry<C32955OooO0Oo, Object>> it;
                C32953OooO0oO<C32955OooO0Oo> c32953OooO0oO = oooO0OO.f119084OooOo0o;
                boolean z = c32953OooO0oO.f119080OooO0OO;
                OooOo00 oooOo00 = c32953OooO0oO.f119078OooO00o;
                if (z) {
                    Iterator<Map.Entry<K, Object>> it2 = ((C32963OooOo0.C32964OooO0Oo) oooOo00.entrySet()).iterator();
                    OooOO0O.OooO0O0 oooO0O0 = new OooOO0O.OooO0O0();
                    oooO0O0.f119097OooOo0o = it2;
                    it = oooO0O0;
                } else {
                    it = ((C32963OooOo0.C32964OooO0Oo) oooOo00.entrySet()).iterator();
                }
                this.f119085OooO00o = it;
                if (it.hasNext()) {
                    this.f119086OooO0O0 = it.next();
                }
            }

            public final void OooO00o(int i, C32952OooO0o0 c32952OooO0o0) throws IOException {
                while (true) {
                    Map.Entry<C32955OooO0Oo, Object> entry = this.f119086OooO0O0;
                    if (entry == null || entry.getKey().f119088OooOo0o >= i) {
                        return;
                    }
                    C32955OooO0Oo key = this.f119086OooO0O0.getKey();
                    Object value = this.f119086OooO0O0.getValue();
                    C32953OooO0oO c32953OooO0oO = C32953OooO0oO.f119077OooO0Oo;
                    OooOo oooOo = key.f119087OooOo;
                    int i2 = key.f119088OooOo0o;
                    if (key.f119089OooOoO0) {
                        Iterator it = ((List) value).iterator();
                        while (it.hasNext()) {
                            C32953OooO0oO.OooOO0o(c32952OooO0o0, oooOo, i2, it.next());
                        }
                    } else if (value instanceof OooOO0O) {
                        C32953OooO0oO.OooOO0o(c32952OooO0o0, oooOo, i2, ((OooOO0O) value).OooO00o());
                    } else {
                        C32953OooO0oO.OooOO0o(c32952OooO0o0, oooOo, i2, value);
                    }
                    Iterator<Map.Entry<C32955OooO0Oo, Object>> it2 = this.f119085OooO00o;
                    if (it2.hasNext()) {
                        this.f119086OooO0O0 = it2.next();
                    } else {
                        this.f119086OooO0O0 = null;
                    }
                }
            }
        }

        public OooO0OO() {
            this.f119084OooOo0o = new C32953OooO0oO<>();
        }

        /* JADX WARN: Removed duplicated region for block: B:4:0x001d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean OooO(C32951OooO0Oo c32951OooO0Oo, C32952OooO0o0 c32952OooO0o0, OooO0o oooO0o, int i) throws IOException {
            boolean z;
            boolean z2;
            Object objBuild;
            InterfaceC32958OooOOOo interfaceC32958OooOOOo;
            InterfaceC32958OooOOOo defaultInstanceForType = getDefaultInstanceForType();
            int i2 = i & 7;
            oooO0o.getClass();
            C32956OooO0o0<?, ?> c32956OooO0o0 = oooO0o.f119070OooO00o.get(new OooO0o.OooO00o(i >>> 3, defaultInstanceForType));
            if (c32956OooO0o0 == null) {
                z2 = false;
                z = true;
            } else {
                C32955OooO0Oo c32955OooO0Oo = c32956OooO0o0.f119093OooO0Oo;
                OooOo oooOo = c32955OooO0Oo.f119087OooOo;
                C32953OooO0oO c32953OooO0oO = C32953OooO0oO.f119077OooO0Oo;
                if (i2 == oooOo.f119125OooOo) {
                    z = false;
                    z2 = false;
                } else if (c32955OooO0Oo.f119089OooOoO0 && oooOo.OooO00o() && i2 == 2) {
                    z = false;
                    z2 = true;
                }
            }
            if (z) {
                return c32951OooO0Oo.OooOOo0(i, c32952OooO0o0);
            }
            InterfaceC32958OooOOOo.OooO00o oooO00oNewBuilderForType = null;
            C32953OooO0oO<C32955OooO0Oo> c32953OooO0oO2 = this.f119084OooOo0o;
            if (z2) {
                int iOooO0Oo = c32951OooO0Oo.OooO0Oo(c32951OooO0Oo.OooOO0O());
                C32955OooO0Oo c32955OooO0Oo2 = c32956OooO0o0.f119093OooO0Oo;
                if (c32955OooO0Oo2.f119087OooOo != OooOo.f119122OooOoo) {
                    while (c32951OooO0Oo.OooO0O0() > 0) {
                        c32953OooO0oO2.OooO00o(c32955OooO0Oo2, C32953OooO0oO.OooO(c32951OooO0Oo, c32955OooO0Oo2.f119087OooOo));
                    }
                } else if (c32951OooO0Oo.OooO0O0() > 0) {
                    c32951OooO0Oo.OooOO0O();
                    throw null;
                }
                c32951OooO0Oo.OooO0OO(iOooO0Oo);
                return true;
            }
            int iOrdinal = c32956OooO0o0.f119093OooO0Oo.f119087OooOo.f119126OooOo0o.ordinal();
            C32955OooO0Oo c32955OooO0Oo3 = c32956OooO0o0.f119093OooO0Oo;
            if (iOrdinal == 7) {
                c32951OooO0Oo.OooOO0O();
                c32955OooO0Oo3.getClass();
                throw null;
            }
            if (iOrdinal != 8) {
                objBuild = C32953OooO0oO.OooO(c32951OooO0Oo, c32955OooO0Oo3.f119087OooOo);
            } else {
                if (!c32955OooO0Oo3.f119089OooOoO0 && (interfaceC32958OooOOOo = (InterfaceC32958OooOOOo) c32953OooO0oO2.OooO0o0(c32955OooO0Oo3)) != null) {
                    oooO00oNewBuilderForType = interfaceC32958OooOOOo.toBuilder();
                }
                if (oooO00oNewBuilderForType == null) {
                    oooO00oNewBuilderForType = c32956OooO0o0.f119092OooO0OO.newBuilderForType();
                }
                if (c32955OooO0Oo3.f119087OooOo == OooOo.f119121OooOoOO) {
                    int i3 = c32951OooO0Oo.f119060OooO;
                    if (i3 >= 64) {
                        throw new OooOO0("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
                    }
                    c32951OooO0Oo.f119060OooO = i3 + 1;
                    oooO00oNewBuilderForType.Oooo0OO(c32951OooO0Oo, oooO0o);
                    c32951OooO0Oo.OooO00o((c32955OooO0Oo3.f119088OooOo0o << 3) | 4);
                    c32951OooO0Oo.f119060OooO--;
                } else {
                    int iOooOO0O = c32951OooO0Oo.OooOO0O();
                    if (c32951OooO0Oo.f119060OooO >= 64) {
                        throw new OooOO0("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
                    }
                    int iOooO0Oo2 = c32951OooO0Oo.OooO0Oo(iOooOO0O);
                    c32951OooO0Oo.f119060OooO++;
                    oooO00oNewBuilderForType.Oooo0OO(c32951OooO0Oo, oooO0o);
                    c32951OooO0Oo.OooO00o(0);
                    c32951OooO0Oo.f119060OooO--;
                    c32951OooO0Oo.OooO0OO(iOooO0Oo2);
                }
                objBuild = oooO00oNewBuilderForType.build();
            }
            if (c32955OooO0Oo3.f119089OooOoO0) {
                c32953OooO0oO2.OooO00o(c32955OooO0Oo3, c32956OooO0o0.OooO0O0(objBuild));
                return true;
            }
            c32953OooO0oO2.OooOO0(c32955OooO0Oo3, c32956OooO0o0.OooO0O0(objBuild));
            return true;
        }

        public final boolean OooO0Oo() {
            int i = 0;
            while (true) {
                OooOo00 oooOo00 = this.f119084OooOo0o.f119078OooO00o;
                if (i >= oooOo00.f119128OooOo.size()) {
                    Iterator<Map.Entry<Object, Object>> it = oooOo00.OooO0Oo().iterator();
                    while (it.hasNext()) {
                        if (!C32953OooO0oO.OooO0o(it.next())) {
                        }
                    }
                    return true;
                }
                if (!C32953OooO0oO.OooO0o(oooOo00.f119128OooOo.get(i))) {
                    break;
                }
                i++;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v3, types: [Type, java.util.ArrayList] */
        public final <Type> Type OooO0o(C32956OooO0o0<MessageType, Type> c32956OooO0o0) {
            OooOO0(c32956OooO0o0);
            C32953OooO0oO<C32955OooO0Oo> c32953OooO0oO = this.f119084OooOo0o;
            C32955OooO0Oo c32955OooO0Oo = c32956OooO0o0.f119093OooO0Oo;
            Type type = (Type) c32953OooO0oO.OooO0o0(c32955OooO0Oo);
            if (type == null) {
                return c32956OooO0o0.f119091OooO0O0;
            }
            if (!c32955OooO0Oo.f119089OooOoO0) {
                return (Type) c32956OooO0o0.OooO00o(type);
            }
            if (c32955OooO0Oo.f119087OooOo.f119126OooOo0o != EnumC32967OooOoO0.ENUM) {
                return type;
            }
            ?? r1 = (Type) new ArrayList();
            Iterator it = ((List) type).iterator();
            while (it.hasNext()) {
                r1.add(c32956OooO0o0.OooO00o(it.next()));
            }
            return r1;
        }

        public final int OooO0o0() {
            OooOo00 oooOo00;
            int i = 0;
            int iOooO0Oo = 0;
            while (true) {
                oooOo00 = this.f119084OooOo0o.f119078OooO00o;
                if (i >= oooOo00.f119128OooOo.size()) {
                    break;
                }
                C32963OooOo0<K, V>.OooO0O0 oooO0O0 = oooOo00.f119128OooOo.get(i);
                iOooO0Oo += C32953OooO0oO.OooO0Oo((C32953OooO0oO.OooO00o) oooO0O0.getKey(), oooO0O0.getValue());
                i++;
            }
            for (Map.Entry<Object, Object> entry : oooOo00.OooO0Oo()) {
                iOooO0Oo += C32953OooO0oO.OooO0Oo((C32953OooO0oO.OooO00o) entry.getKey(), entry.getValue());
            }
            return iOooO0Oo;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final <Type> boolean OooO0oO(C32956OooO0o0<MessageType, Type> c32956OooO0o0) {
            OooOO0(c32956OooO0o0);
            C32953OooO0oO<C32955OooO0Oo> c32953OooO0oO = this.f119084OooOo0o;
            c32953OooO0oO.getClass();
            C32955OooO0Oo c32955OooO0Oo = c32956OooO0o0.f119093OooO0Oo;
            if (c32955OooO0Oo.f119089OooOoO0) {
                throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
            }
            return c32953OooO0oO.f119078OooO00o.get(c32955OooO0Oo) != null;
        }

        public final void OooO0oo() {
            this.f119084OooOo0o.OooO0oO();
        }

        public final void OooOO0(C32956OooO0o0<MessageType, ?> c32956OooO0o0) {
            if (c32956OooO0o0.f119090OooO00o != getDefaultInstanceForType()) {
                throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
            }
        }

        public OooO0OO(OooO0O0<MessageType, ?> oooO0O0) {
            oooO0O0.f119082OooOo.OooO0oO();
            oooO0O0.f119083OooOoO0 = false;
            this.f119084OooOo0o = oooO0O0.f119082OooOo;
        }
    }
}
