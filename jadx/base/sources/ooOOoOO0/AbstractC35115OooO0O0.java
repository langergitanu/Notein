package ooOOoOO0;

import OooO0o.C20424OooO0Oo;
import OooOOO0.AbstractC20449OooO0Oo;
import com.facebook.common.callercontext.ContextChain;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import com.orion.notein.richeditor.utils.p606io.FilenameUtils;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.C24035Oooo00o;
import oO0o.AbstractC33525OooO0OO;
import oO0o.AbstractC33526OooO0Oo;
import oO0o.AbstractC33534OooOO0o;
import oO0o.InterfaceC33531OooO0o0;
import oO0o.OooOOO0;
import oO0o0O0o.C33595OooOOo;
import oO0o0ooO.C33917OooOO0;
import oO0o0ooO.InterfaceC33910OooO0O0;
import oO0oO00.AbstractC33934OooO0O0;
import oO0oO00.C33962Oooo;
import oO0oO00.o0OoOo0;
import oOo00O0O.AbstractC34457OooO0OO;
import oOo00O0O.AbstractC34475OooOooO;
import oOo00O0O.C34458OooO0Oo;
import oOo00O0O.C34461OooO0oo;
import oOo00O0O.C34462OooOO0o;
import oOo00O0O.C34468OooOo0O;
import oOo00O0O.C34471OooOoO0;
import oOo00O0O.C34474OooOoo0;

/* JADX INFO: renamed from: ooOOoOO0.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC35115OooO0O0 extends o0OoOo0 implements oOo00O0O.OooOO0 {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final AbstractC34457OooO0OO f126103OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final String f126104OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final C34461OooO0oo f126105OooO0o0;

    public AbstractC35115OooO0O0(AbstractC34457OooO0OO abstractC34457OooO0OO, oOo00O0O.OooOO0O oooOO0O, String str) {
        this.f126103OooO0OO = abstractC34457OooO0OO;
        this.f126104OooO0Oo = str;
        this.f126105OooO0o0 = abstractC34457OooO0OO.f123491OooO00o;
    }

    @Override // oO0oO000.OooO0OO
    public oO0oO000.OooO00o OooO00o(InterfaceC33531OooO0o0 descriptor) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(descriptor, "descriptor");
        oOo00O0O.OooOO0O oooOO0OO000oOoO = o000oOoO();
        AbstractC33534OooOO0o kind = descriptor.getKind();
        boolean zOooO0O0 = kotlin.jvm.internal.OooOOO0.OooO0O0(kind, OooOOO0.OooO0O0.f121133OooO00o);
        AbstractC34457OooO0OO abstractC34457OooO0OO = this.f126103OooO0OO;
        if (zOooO0O0 || (kind instanceof AbstractC33525OooO0OO)) {
            String strOooO0oo = descriptor.OooO0oo();
            if (oooOO0OO000oOoO instanceof C34458OooO0Oo) {
                return new C35135OooOoo0(abstractC34457OooO0OO, (C34458OooO0Oo) oooOO0OO000oOoO);
            }
            StringBuilder sb = new StringBuilder("Expected ");
            kotlin.jvm.internal.Oooo0 oooo0 = C24035Oooo00o.f80943OooO00o;
            sb.append(oooo0.OooO0O0(C34458OooO0Oo.class).OooOO0());
            sb.append(", but had ");
            sb.append(oooo0.OooO0O0(oooOO0OO000oOoO.getClass()).OooOO0());
            sb.append(" as the serialized body of ");
            sb.append(strOooO0oo);
            sb.append(" at element: ");
            sb.append(OoooO());
            throw OoooO0O.OooOo.OooO0o0(oooOO0OO000oOoO.toString(), -1, sb.toString());
        }
        if (!kotlin.jvm.internal.OooOOO0.OooO0O0(kind, OooOOO0.OooO0OO.f121134OooO00o)) {
            String strOooO0oo2 = descriptor.OooO0oo();
            if (oooOO0OO000oOoO instanceof C34474OooOoo0) {
                return new C35133OooOoOO(abstractC34457OooO0OO, (C34474OooOoo0) oooOO0OO000oOoO, this.f126104OooO0Oo, 8);
            }
            StringBuilder sb2 = new StringBuilder("Expected ");
            kotlin.jvm.internal.Oooo0 oooo02 = C24035Oooo00o.f80943OooO00o;
            sb2.append(oooo02.OooO0O0(C34474OooOoo0.class).OooOO0());
            sb2.append(", but had ");
            sb2.append(oooo02.OooO0O0(oooOO0OO000oOoO.getClass()).OooOO0());
            sb2.append(" as the serialized body of ");
            sb2.append(strOooO0oo2);
            sb2.append(" at element: ");
            sb2.append(OoooO());
            throw OoooO0O.OooOo.OooO0o0(oooOO0OO000oOoO.toString(), -1, sb2.toString());
        }
        InterfaceC33531OooO0o0 interfaceC33531OooO0o0OooO00o = C35145Oooo0oo.OooO00o(descriptor.OooO0Oo(0), abstractC34457OooO0OO.f123492OooO0O0);
        AbstractC33534OooOO0o kind2 = interfaceC33531OooO0o0OooO00o.getKind();
        if ((kind2 instanceof AbstractC33526OooO0Oo) || kotlin.jvm.internal.OooOOO0.OooO0O0(kind2, AbstractC33534OooOO0o.OooO0O0.f121131OooO00o)) {
            String strOooO0oo3 = descriptor.OooO0oo();
            if (oooOO0OO000oOoO instanceof C34474OooOoo0) {
                return new C35134OooOoo(abstractC34457OooO0OO, (C34474OooOoo0) oooOO0OO000oOoO);
            }
            StringBuilder sb3 = new StringBuilder("Expected ");
            kotlin.jvm.internal.Oooo0 oooo03 = C24035Oooo00o.f80943OooO00o;
            sb3.append(oooo03.OooO0O0(C34474OooOoo0.class).OooOO0());
            sb3.append(", but had ");
            sb3.append(oooo03.OooO0O0(oooOO0OO000oOoO.getClass()).OooOO0());
            sb3.append(" as the serialized body of ");
            sb3.append(strOooO0oo3);
            sb3.append(" at element: ");
            sb3.append(OoooO());
            throw OoooO0O.OooOo.OooO0o0(oooOO0OO000oOoO.toString(), -1, sb3.toString());
        }
        if (!abstractC34457OooO0OO.f123491OooO00o.f123515OooO0Oo) {
            throw OoooO0O.OooOo.OooO0OO(interfaceC33531OooO0o0OooO00o);
        }
        String strOooO0oo4 = descriptor.OooO0oo();
        if (oooOO0OO000oOoO instanceof C34458OooO0Oo) {
            return new C35135OooOoo0(abstractC34457OooO0OO, (C34458OooO0Oo) oooOO0OO000oOoO);
        }
        StringBuilder sb4 = new StringBuilder("Expected ");
        kotlin.jvm.internal.Oooo0 oooo04 = C24035Oooo00o.f80943OooO00o;
        sb4.append(oooo04.OooO0O0(C34458OooO0Oo.class).OooOO0());
        sb4.append(", but had ");
        sb4.append(oooo04.OooO0O0(oooOO0OO000oOoO.getClass()).OooOO0());
        sb4.append(" as the serialized body of ");
        sb4.append(strOooO0oo4);
        sb4.append(" at element: ");
        sb4.append(OoooO());
        throw OoooO0O.OooOo.OooO0o0(oooOO0OO000oOoO.toString(), -1, sb4.toString());
    }

    @Override // oO0oO000.OooO00o
    public void OooO0O0(InterfaceC33531OooO0o0 descriptor) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(descriptor, "descriptor");
    }

    @Override // oO0oO000.OooO00o
    public final AbstractC20449OooO0Oo OooO0OO() {
        return this.f126103OooO0OO.f123492OooO0O0;
    }

    @Override // oO0oO00.o0OoOo0
    public final boolean OooOO0O(Object obj) {
        String tag = (String) obj;
        kotlin.jvm.internal.OooOOO0.OooO0oO(tag, "tag");
        oOo00O0O.OooOO0O oooOO0OOoooOO0 = OoooOO0(tag);
        if (!(oooOO0OOoooOO0 instanceof AbstractC34475OooOooO)) {
            StringBuilder sb = new StringBuilder("Expected ");
            kotlin.jvm.internal.Oooo0 oooo0 = C24035Oooo00o.f80943OooO00o;
            sb.append(oooo0.OooO0O0(AbstractC34475OooOooO.class).OooOO0());
            sb.append(", but had ");
            sb.append(oooo0.OooO0O0(oooOO0OOoooOO0.getClass()).OooOO0());
            sb.append(" as the serialized body of boolean at element: ");
            sb.append(OoooOOo(tag));
            throw OoooO0O.OooOo.OooO0o0(oooOO0OOoooOO0.toString(), -1, sb.toString());
        }
        AbstractC34475OooOooO abstractC34475OooOooO = (AbstractC34475OooOooO) oooOO0OOoooOO0;
        try {
            C33962Oooo c33962Oooo = C34462OooOO0o.f123521OooO00o;
            kotlin.jvm.internal.OooOOO0.OooO0oO(abstractC34475OooOooO, "<this>");
            String strOooO0O0 = abstractC34475OooOooO.OooO0O0();
            String[] strArr = C35142Oooo0o.f126191OooO00o;
            kotlin.jvm.internal.OooOOO0.OooO0oO(strOooO0O0, "<this>");
            Boolean bool = strOooO0O0.equalsIgnoreCase(TelemetryEventStrings.Value.TRUE) ? Boolean.TRUE : strOooO0O0.equalsIgnoreCase(TelemetryEventStrings.Value.FALSE) ? Boolean.FALSE : null;
            if (bool != null) {
                return bool.booleanValue();
            }
            OoooOo0(abstractC34475OooOooO, "boolean", tag);
            throw null;
        } catch (IllegalArgumentException unused) {
            OoooOo0(abstractC34475OooOooO, "boolean", tag);
            throw null;
        }
    }

    @Override // oO0oO00.o0OoOo0
    public final byte OooOOOO(Object obj) {
        String tag = (String) obj;
        kotlin.jvm.internal.OooOOO0.OooO0oO(tag, "tag");
        oOo00O0O.OooOO0O oooOO0OOoooOO0 = OoooOO0(tag);
        if (!(oooOO0OOoooOO0 instanceof AbstractC34475OooOooO)) {
            StringBuilder sb = new StringBuilder("Expected ");
            kotlin.jvm.internal.Oooo0 oooo0 = C24035Oooo00o.f80943OooO00o;
            sb.append(oooo0.OooO0O0(AbstractC34475OooOooO.class).OooOO0());
            sb.append(", but had ");
            sb.append(oooo0.OooO0O0(oooOO0OOoooOO0.getClass()).OooOO0());
            sb.append(" as the serialized body of byte at element: ");
            sb.append(OoooOOo(tag));
            throw OoooO0O.OooOo.OooO0o0(oooOO0OOoooOO0.toString(), -1, sb.toString());
        }
        AbstractC34475OooOooO abstractC34475OooOooO = (AbstractC34475OooOooO) oooOO0OOoooOO0;
        try {
            int iOooO0O0 = C34462OooOO0o.OooO0O0(abstractC34475OooOooO);
            Byte bValueOf = (-128 > iOooO0O0 || iOooO0O0 > 127) ? null : Byte.valueOf((byte) iOooO0O0);
            if (bValueOf != null) {
                return bValueOf.byteValue();
            }
            OoooOo0(abstractC34475OooOooO, "byte", tag);
            throw null;
        } catch (IllegalArgumentException unused) {
            OoooOo0(abstractC34475OooOooO, "byte", tag);
            throw null;
        }
    }

    @Override // oOo00O0O.OooOO0
    public final oOo00O0O.OooOO0O OooOOo0() {
        return o000oOoO();
    }

    @Override // oO0oO00.o0OoOo0, oO0oO000.OooO0OO
    public final oO0oO000.OooO0OO OooOo0O(InterfaceC33531OooO0o0 descriptor) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(descriptor, "descriptor");
        if (oOo000Oo.OooOo.OoooOo0(this.f122277OooO00o) != null) {
            return super.OooOo0O(descriptor);
        }
        return new OooOo(this.f126103OooO0OO, OoooOOO(), this.f126104OooO0Oo).OooOo0O(descriptor);
    }

    @Override // oOo00O0O.OooOO0
    public final AbstractC34457OooO0OO OooOoo() {
        return this.f126103OooO0OO;
    }

    @Override // oO0oO000.OooO0OO
    public boolean OooOoo0() {
        return !(o000oOoO() instanceof C34471OooOoO0);
    }

    @Override // oO0oO00.o0OoOo0
    public final char OooOooO(Object obj) {
        String tag = (String) obj;
        kotlin.jvm.internal.OooOOO0.OooO0oO(tag, "tag");
        oOo00O0O.OooOO0O oooOO0OOoooOO0 = OoooOO0(tag);
        if (!(oooOO0OOoooOO0 instanceof AbstractC34475OooOooO)) {
            StringBuilder sb = new StringBuilder("Expected ");
            kotlin.jvm.internal.Oooo0 oooo0 = C24035Oooo00o.f80943OooO00o;
            sb.append(oooo0.OooO0O0(AbstractC34475OooOooO.class).OooOO0());
            sb.append(", but had ");
            sb.append(oooo0.OooO0O0(oooOO0OOoooOO0.getClass()).OooOO0());
            sb.append(" as the serialized body of char at element: ");
            sb.append(OoooOOo(tag));
            throw OoooO0O.OooOo.OooO0o0(oooOO0OOoooOO0.toString(), -1, sb.toString());
        }
        AbstractC34475OooOooO abstractC34475OooOooO = (AbstractC34475OooOooO) oooOO0OOoooOO0;
        try {
            String strOooO0O0 = abstractC34475OooOooO.OooO0O0();
            kotlin.jvm.internal.OooOOO0.OooO0oO(strOooO0O0, "<this>");
            int length = strOooO0O0.length();
            if (length == 0) {
                throw new NoSuchElementException("Char sequence is empty.");
            }
            if (length == 1) {
                return strOooO0O0.charAt(0);
            }
            throw new IllegalArgumentException("Char sequence has more than one element.");
        } catch (IllegalArgumentException unused) {
            OoooOo0(abstractC34475OooOooO, "char", tag);
            throw null;
        }
    }

    @Override // oO0oO00.o0OoOo0, oO0oO000.OooO0OO
    public final <T> T OooOooo(InterfaceC33910OooO0O0<? extends T> deserializer) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(deserializer, "deserializer");
        if (!(deserializer instanceof AbstractC33934OooO0O0)) {
            return deserializer.deserialize(this);
        }
        AbstractC34457OooO0OO abstractC34457OooO0OO = this.f126103OooO0OO;
        C34461OooO0oo c34461OooO0oo = abstractC34457OooO0OO.f123491OooO00o;
        AbstractC33934OooO0O0 abstractC33934OooO0O0 = (AbstractC33934OooO0O0) deserializer;
        String strOooO00o = C35138Oooo00O.OooO00o(abstractC33934OooO0O0.getDescriptor(), abstractC34457OooO0OO);
        oOo00O0O.OooOO0O oooOO0OO000oOoO = o000oOoO();
        String strOooO0oo = abstractC33934OooO0O0.getDescriptor().OooO0oo();
        if (!(oooOO0OO000oOoO instanceof C34474OooOoo0)) {
            StringBuilder sb = new StringBuilder("Expected ");
            kotlin.jvm.internal.Oooo0 oooo0 = C24035Oooo00o.f80943OooO00o;
            sb.append(oooo0.OooO0O0(C34474OooOoo0.class).OooOO0());
            sb.append(", but had ");
            sb.append(oooo0.OooO0O0(oooOO0OO000oOoO.getClass()).OooOO0());
            sb.append(" as the serialized body of ");
            sb.append(strOooO0oo);
            sb.append(" at element: ");
            sb.append(OoooO());
            throw OoooO0O.OooOo.OooO0o0(oooOO0OO000oOoO.toString(), -1, sb.toString());
        }
        C34474OooOoo0 c34474OooOoo0 = (C34474OooOoo0) oooOO0OO000oOoO;
        oOo00O0O.OooOO0O oooOO0O = (oOo00O0O.OooOO0O) c34474OooOoo0.get(strOooO00o);
        String strOooO0O0 = null;
        if (oooOO0O != null) {
            AbstractC34475OooOooO abstractC34475OooOooOOooO0OO = C34462OooOO0o.OooO0OO(oooOO0O);
            if (!(abstractC34475OooOooOOooO0OO instanceof C34471OooOoO0)) {
                strOooO0O0 = abstractC34475OooOooOOooO0OO.OooO0O0();
            }
        }
        try {
            return (T) Oooo0.OooOo00.OooOOO(abstractC34457OooO0OO, strOooO00o, c34474OooOoo0, o00OOOo.OooO0OO.OooO0o0((AbstractC33934OooO0O0) deserializer, this, strOooO0O0));
        } catch (C33917OooOO0 e) {
            String message = e.getMessage();
            kotlin.jvm.internal.OooOOO0.OooO0Oo(message);
            throw OoooO0O.OooOo.OooO0o0(c34474OooOoo0.toString(), -1, message);
        }
    }

    @Override // oO0oO00.o0OoOo0
    public final String Oooo(Object obj) {
        String tag = (String) obj;
        kotlin.jvm.internal.OooOOO0.OooO0oO(tag, "tag");
        oOo00O0O.OooOO0O oooOO0OOoooOO0 = OoooOO0(tag);
        if (!(oooOO0OOoooOO0 instanceof AbstractC34475OooOooO)) {
            StringBuilder sb = new StringBuilder("Expected ");
            kotlin.jvm.internal.Oooo0 oooo0 = C24035Oooo00o.f80943OooO00o;
            sb.append(oooo0.OooO0O0(AbstractC34475OooOooO.class).OooOO0());
            sb.append(", but had ");
            sb.append(oooo0.OooO0O0(oooOO0OOoooOO0.getClass()).OooOO0());
            sb.append(" as the serialized body of string at element: ");
            sb.append(OoooOOo(tag));
            throw OoooO0O.OooOo.OooO0o0(oooOO0OOoooOO0.toString(), -1, sb.toString());
        }
        AbstractC34475OooOooO abstractC34475OooOooO = (AbstractC34475OooOooO) oooOO0OOoooOO0;
        if (!(abstractC34475OooOooO instanceof C34468OooOo0O)) {
            StringBuilder sbOooO0o0 = C20424OooO0Oo.OooO0o0("Expected string value for a non-null key '", tag, "', got null literal instead at element: ");
            sbOooO0o0.append(OoooOOo(tag));
            throw OoooO0O.OooOo.OooO0o0(o000oOoO().toString(), -1, sbOooO0o0.toString());
        }
        C34468OooOo0O c34468OooOo0O = (C34468OooOo0O) abstractC34475OooOooO;
        if (c34468OooOo0O.f123526OooOo0o || this.f126103OooO0OO.f123491OooO00o.f123514OooO0OO) {
            return c34468OooOo0O.f123525OooOo;
        }
        StringBuilder sbOooO0o02 = C20424OooO0Oo.OooO0o0("String literal for key '", tag, "' should be quoted at element: ");
        sbOooO0o02.append(OoooOOo(tag));
        sbOooO0o02.append(".\nUse 'isLenient = true' in 'Json {}' builder to accept non-compliant JSON.");
        throw OoooO0O.OooOo.OooO0o0(o000oOoO().toString(), -1, sbOooO0o02.toString());
    }

    @Override // oO0oO00.o0OoOo0
    public final double Oooo00O(Object obj) {
        String tag = (String) obj;
        kotlin.jvm.internal.OooOOO0.OooO0oO(tag, "tag");
        oOo00O0O.OooOO0O oooOO0OOoooOO0 = OoooOO0(tag);
        if (!(oooOO0OOoooOO0 instanceof AbstractC34475OooOooO)) {
            StringBuilder sb = new StringBuilder("Expected ");
            kotlin.jvm.internal.Oooo0 oooo0 = C24035Oooo00o.f80943OooO00o;
            sb.append(oooo0.OooO0O0(AbstractC34475OooOooO.class).OooOO0());
            sb.append(", but had ");
            sb.append(oooo0.OooO0O0(oooOO0OOoooOO0.getClass()).OooOO0());
            sb.append(" as the serialized body of double at element: ");
            sb.append(OoooOOo(tag));
            throw OoooO0O.OooOo.OooO0o0(oooOO0OOoooOO0.toString(), -1, sb.toString());
        }
        AbstractC34475OooOooO abstractC34475OooOooO = (AbstractC34475OooOooO) oooOO0OOoooOO0;
        try {
            C33962Oooo c33962Oooo = C34462OooOO0o.f123521OooO00o;
            kotlin.jvm.internal.OooOOO0.OooO0oO(abstractC34475OooOooO, "<this>");
            double d = Double.parseDouble(abstractC34475OooOooO.OooO0O0());
            if (this.f126103OooO0OO.f123491OooO00o.f123519OooO0oo || !(Double.isInfinite(d) || Double.isNaN(d))) {
                return d;
            }
            throw OoooO0O.OooOo.OooO00o(Double.valueOf(d), tag, o000oOoO().toString());
        } catch (IllegalArgumentException unused) {
            OoooOo0(abstractC34475OooOooO, "double", tag);
            throw null;
        }
    }

    @Override // oO0oO00.o0OoOo0
    public final int Oooo0O0(Object obj, InterfaceC33531OooO0o0 enumDescriptor) {
        String tag = (String) obj;
        kotlin.jvm.internal.OooOOO0.OooO0oO(tag, "tag");
        kotlin.jvm.internal.OooOOO0.OooO0oO(enumDescriptor, "enumDescriptor");
        oOo00O0O.OooOO0O oooOO0OOoooOO0 = OoooOO0(tag);
        String strOooO0oo = enumDescriptor.OooO0oo();
        if (oooOO0OOoooOO0 instanceof AbstractC34475OooOooO) {
            return C35129OooOo0O.OooO0O0(enumDescriptor, this.f126103OooO0OO, ((AbstractC34475OooOooO) oooOO0OOoooOO0).OooO0O0(), "");
        }
        StringBuilder sb = new StringBuilder("Expected ");
        kotlin.jvm.internal.Oooo0 oooo0 = C24035Oooo00o.f80943OooO00o;
        sb.append(oooo0.OooO0O0(AbstractC34475OooOooO.class).OooOO0());
        sb.append(", but had ");
        sb.append(oooo0.OooO0O0(oooOO0OOoooOO0.getClass()).OooOO0());
        androidx.concurrent.futures.OooO0O0.OooO0O0(sb, " as the serialized body of ", strOooO0oo, " at element: ");
        sb.append(OoooOOo(tag));
        throw OoooO0O.OooOo.OooO0o0(oooOO0OOoooOO0.toString(), -1, sb.toString());
    }

    @Override // oO0oO00.o0OoOo0
    public final float Oooo0OO(Object obj) {
        String tag = (String) obj;
        kotlin.jvm.internal.OooOOO0.OooO0oO(tag, "tag");
        oOo00O0O.OooOO0O oooOO0OOoooOO0 = OoooOO0(tag);
        if (!(oooOO0OOoooOO0 instanceof AbstractC34475OooOooO)) {
            StringBuilder sb = new StringBuilder("Expected ");
            kotlin.jvm.internal.Oooo0 oooo0 = C24035Oooo00o.f80943OooO00o;
            sb.append(oooo0.OooO0O0(AbstractC34475OooOooO.class).OooOO0());
            sb.append(", but had ");
            sb.append(oooo0.OooO0O0(oooOO0OOoooOO0.getClass()).OooOO0());
            sb.append(" as the serialized body of float at element: ");
            sb.append(OoooOOo(tag));
            throw OoooO0O.OooOo.OooO0o0(oooOO0OOoooOO0.toString(), -1, sb.toString());
        }
        AbstractC34475OooOooO abstractC34475OooOooO = (AbstractC34475OooOooO) oooOO0OOoooOO0;
        try {
            C33962Oooo c33962Oooo = C34462OooOO0o.f123521OooO00o;
            kotlin.jvm.internal.OooOOO0.OooO0oO(abstractC34475OooOooO, "<this>");
            float f = Float.parseFloat(abstractC34475OooOooO.OooO0O0());
            if (this.f126103OooO0OO.f123491OooO00o.f123519OooO0oo || !(Float.isInfinite(f) || Float.isNaN(f))) {
                return f;
            }
            throw OoooO0O.OooOo.OooO00o(Float.valueOf(f), tag, o000oOoO().toString());
        } catch (IllegalArgumentException unused) {
            OoooOo0(abstractC34475OooOooO, "float", tag);
            throw null;
        }
    }

    @Override // oO0oO00.o0OoOo0
    public final int Oooo0o(Object obj) {
        String tag = (String) obj;
        kotlin.jvm.internal.OooOOO0.OooO0oO(tag, "tag");
        oOo00O0O.OooOO0O oooOO0OOoooOO0 = OoooOO0(tag);
        if (oooOO0OOoooOO0 instanceof AbstractC34475OooOooO) {
            AbstractC34475OooOooO abstractC34475OooOooO = (AbstractC34475OooOooO) oooOO0OOoooOO0;
            try {
                return C34462OooOO0o.OooO0O0(abstractC34475OooOooO);
            } catch (IllegalArgumentException unused) {
                OoooOo0(abstractC34475OooOooO, "int", tag);
                throw null;
            }
        }
        StringBuilder sb = new StringBuilder("Expected ");
        kotlin.jvm.internal.Oooo0 oooo0 = C24035Oooo00o.f80943OooO00o;
        sb.append(oooo0.OooO0O0(AbstractC34475OooOooO.class).OooOO0());
        sb.append(", but had ");
        sb.append(oooo0.OooO0O0(oooOO0OOoooOO0.getClass()).OooOO0());
        sb.append(" as the serialized body of int at element: ");
        sb.append(OoooOOo(tag));
        throw OoooO0O.OooOo.OooO0o0(oooOO0OOoooOO0.toString(), -1, sb.toString());
    }

    @Override // oO0oO00.o0OoOo0
    public final oO0oO000.OooO0OO Oooo0o0(Object obj, InterfaceC33531OooO0o0 inlineDescriptor) {
        String tag = (String) obj;
        kotlin.jvm.internal.OooOOO0.OooO0oO(tag, "tag");
        kotlin.jvm.internal.OooOOO0.OooO0oO(inlineDescriptor, "inlineDescriptor");
        if (!C35141Oooo0OO.OooO00o(inlineDescriptor)) {
            this.f122277OooO00o.add(tag);
            return this;
        }
        oOo00O0O.OooOO0O oooOO0OOoooOO0 = OoooOO0(tag);
        String strOooO0oo = inlineDescriptor.OooO0oo();
        if (oooOO0OOoooOO0 instanceof AbstractC34475OooOooO) {
            String source = ((AbstractC34475OooOooO) oooOO0OOoooOO0).OooO0O0();
            AbstractC34457OooO0OO json = this.f126103OooO0OO;
            kotlin.jvm.internal.OooOOO0.OooO0oO(json, "json");
            kotlin.jvm.internal.OooOOO0.OooO0oO(source, "source");
            return new OooOOOO(new C35143Oooo0o0(source), json);
        }
        StringBuilder sb = new StringBuilder("Expected ");
        kotlin.jvm.internal.Oooo0 oooo0 = C24035Oooo00o.f80943OooO00o;
        sb.append(oooo0.OooO0O0(AbstractC34475OooOooO.class).OooOO0());
        sb.append(", but had ");
        sb.append(oooo0.OooO0O0(oooOO0OOoooOO0.getClass()).OooOO0());
        androidx.concurrent.futures.OooO0O0.OooO0O0(sb, " as the serialized body of ", strOooO0oo, " at element: ");
        sb.append(OoooOOo(tag));
        throw OoooO0O.OooOo.OooO0o0(oooOO0OOoooOO0.toString(), -1, sb.toString());
    }

    @Override // oO0oO00.o0OoOo0
    public final long Oooo0oO(Object obj) {
        String tag = (String) obj;
        kotlin.jvm.internal.OooOOO0.OooO0oO(tag, "tag");
        oOo00O0O.OooOO0O oooOO0OOoooOO0 = OoooOO0(tag);
        if (oooOO0OOoooOO0 instanceof AbstractC34475OooOooO) {
            AbstractC34475OooOooO abstractC34475OooOooO = (AbstractC34475OooOooO) oooOO0OOoooOO0;
            try {
                C33962Oooo c33962Oooo = C34462OooOO0o.f123521OooO00o;
                kotlin.jvm.internal.OooOOO0.OooO0oO(abstractC34475OooOooO, "<this>");
                try {
                    return new C35143Oooo0o0(abstractC34475OooOooO.OooO0O0()).OooO();
                } catch (C35124OooOOOo e) {
                    throw new NumberFormatException(e.getMessage());
                }
            } catch (IllegalArgumentException unused) {
                OoooOo0(abstractC34475OooOooO, "long", tag);
                throw null;
            }
        }
        StringBuilder sb = new StringBuilder("Expected ");
        kotlin.jvm.internal.Oooo0 oooo0 = C24035Oooo00o.f80943OooO00o;
        sb.append(oooo0.OooO0O0(AbstractC34475OooOooO.class).OooOO0());
        sb.append(", but had ");
        sb.append(oooo0.OooO0O0(oooOO0OOoooOO0.getClass()).OooOO0());
        sb.append(" as the serialized body of long at element: ");
        sb.append(OoooOOo(tag));
        throw OoooO0O.OooOo.OooO0o0(oooOO0OOoooOO0.toString(), -1, sb.toString());
    }

    @Override // oO0oO00.o0OoOo0
    public final short Oooo0oo(Object obj) {
        String tag = (String) obj;
        kotlin.jvm.internal.OooOOO0.OooO0oO(tag, "tag");
        oOo00O0O.OooOO0O oooOO0OOoooOO0 = OoooOO0(tag);
        if (!(oooOO0OOoooOO0 instanceof AbstractC34475OooOooO)) {
            StringBuilder sb = new StringBuilder("Expected ");
            kotlin.jvm.internal.Oooo0 oooo0 = C24035Oooo00o.f80943OooO00o;
            sb.append(oooo0.OooO0O0(AbstractC34475OooOooO.class).OooOO0());
            sb.append(", but had ");
            sb.append(oooo0.OooO0O0(oooOO0OOoooOO0.getClass()).OooOO0());
            sb.append(" as the serialized body of short at element: ");
            sb.append(OoooOOo(tag));
            throw OoooO0O.OooOo.OooO0o0(oooOO0OOoooOO0.toString(), -1, sb.toString());
        }
        AbstractC34475OooOooO abstractC34475OooOooO = (AbstractC34475OooOooO) oooOO0OOoooOO0;
        try {
            int iOooO0O0 = C34462OooOO0o.OooO0O0(abstractC34475OooOooO);
            Short shValueOf = (-32768 > iOooO0O0 || iOooO0O0 > 32767) ? null : Short.valueOf((short) iOooO0O0);
            if (shValueOf != null) {
                return shValueOf.shortValue();
            }
            OoooOo0(abstractC34475OooOooO, "short", tag);
            throw null;
        } catch (IllegalArgumentException unused) {
            OoooOo0(abstractC34475OooOooO, "short", tag);
            throw null;
        }
    }

    public abstract oOo00O0O.OooOO0O OoooOO0(String str);

    public abstract oOo00O0O.OooOO0O OoooOOO();

    public final String OoooOOo(String currentTag) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(currentTag, "currentTag");
        return OoooO() + FilenameUtils.EXTENSION_SEPARATOR + currentTag;
    }

    public final void OoooOo0(AbstractC34475OooOooO abstractC34475OooOooO, String str, String str2) {
        throw OoooO0O.OooOo.OooO0o0(o000oOoO().toString(), -1, "Failed to parse literal '" + abstractC34475OooOooO + "' as " + (C33595OooOOo.OooOoO0(str, ContextChain.TAG_INFRA, false) ? "an " : "a ").concat(str) + " value at element: " + OoooOOo(str2));
    }

    public final oOo00O0O.OooOO0O o000oOoO() {
        oOo00O0O.OooOO0O oooOO0OOoooOO0;
        String str = (String) oOo000Oo.OooOo.OoooOo0(this.f122277OooO00o);
        return (str == null || (oooOO0OOoooOO0 = OoooOO0(str)) == null) ? OoooOOO() : oooOO0OOoooOO0;
    }
}
