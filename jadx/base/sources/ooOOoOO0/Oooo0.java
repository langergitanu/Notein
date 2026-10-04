package ooOOoOO0;

import OooOOO0.AbstractC20449OooO0Oo;
import Oooo0oo.AbstractC21138OooO0oo;
import com.aspose.words.ControlChar;
import com.facebook.imagepipeline.producers.C22306Ooooooo;
import com.orion.notein.domain.models.cloudsync.CloudMetaExtra;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.C24035Oooo00o;
import o000oo0.C24684Oooo;
import oO0o.InterfaceC33531OooO0o0;
import oO0o0O0o.C33599OooOo0O;
import oO0o0ooO.C33912OooO0Oo;
import oO0o0ooO.C33917OooOO0;
import oO0o0ooO.InterfaceC33910OooO0O0;
import oO0oO00.AbstractC33934OooO0O0;
import oO0oO00.C33958OooOoo;
import oO0oO00o.C34005OooO00o;
import oOo000Oo.C34431OooOo0;
import oOo00O0O.AbstractC34457OooO0OO;
import oOo00O0O.AbstractC34475OooOooO;
import oOo00O0O.C34461OooO0oo;
import oOo00O0O.C34462OooOO0o;
import oOo00O0O.C34471OooOoO0;
import oOo00O0O.C34474OooOoo0;
import ooOOoOO0.C35126OooOOo0;
import ooOOoOO0.C35130OooOo0o;

/* JADX INFO: loaded from: classes10.dex */
public final class Oooo0 extends AbstractC21138OooO0oo implements oOo00O0O.OooOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final AbstractC34457OooO0OO f126166OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final EnumC35144Oooo0oO f126167OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final AbstractC35114OooO00o f126168OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final C34005OooO00o f126169OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public OooO00o f126170OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f126171OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final C34461OooO0oo f126172OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final C35126OooOOo0 f126173OooO0oo;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public String f126174OooO00o;
    }

    public Oooo0(AbstractC34457OooO0OO json, EnumC35144Oooo0oO enumC35144Oooo0oO, AbstractC35114OooO00o abstractC35114OooO00o, InterfaceC33531OooO0o0 descriptor, OooO00o oooO00o) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(json, "json");
        kotlin.jvm.internal.OooOOO0.OooO0oO(descriptor, "descriptor");
        this.f126166OooO00o = json;
        this.f126167OooO0O0 = enumC35144Oooo0oO;
        this.f126168OooO0OO = abstractC35114OooO00o;
        this.f126169OooO0Oo = json.f123492OooO0O0;
        this.f126171OooO0o0 = -1;
        this.f126170OooO0o = oooO00o;
        C34461OooO0oo c34461OooO0oo = json.f123491OooO00o;
        this.f126172OooO0oO = c34461OooO0oo;
        this.f126173OooO0oo = c34461OooO0oo.f123517OooO0o0 ? null : new C35126OooOOo0(descriptor);
    }

    @Override // Oooo0oo.AbstractC21138OooO0oo, oO0oO000.OooO0OO
    public final oO0oO000.OooO00o OooO00o(InterfaceC33531OooO0o0 descriptor) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(descriptor, "descriptor");
        AbstractC34457OooO0OO abstractC34457OooO0OO = this.f126166OooO00o;
        EnumC35144Oooo0oO enumC35144Oooo0oOOooO0O0 = C35145Oooo0oo.OooO0O0(descriptor, abstractC34457OooO0OO);
        AbstractC35114OooO00o abstractC35114OooO00o = this.f126168OooO0OO;
        C35130OooOo0o c35130OooOo0o = abstractC35114OooO00o.f126100OooO0O0;
        int i = c35130OooOo0o.f126140OooO0OO + 1;
        c35130OooOo0o.f126140OooO0OO = i;
        Object[] objArr = c35130OooOo0o.f126138OooO00o;
        if (i == objArr.length) {
            int i2 = i * 2;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, i2);
            kotlin.jvm.internal.OooOOO0.OooO0o(objArrCopyOf, "copyOf(...)");
            c35130OooOo0o.f126138OooO00o = objArrCopyOf;
            int[] iArrCopyOf = Arrays.copyOf(c35130OooOo0o.f126139OooO0O0, i2);
            kotlin.jvm.internal.OooOOO0.OooO0o(iArrCopyOf, "copyOf(...)");
            c35130OooOo0o.f126139OooO0O0 = iArrCopyOf;
        }
        c35130OooOo0o.f126138OooO00o[i] = descriptor;
        abstractC35114OooO00o.OooO0oo(enumC35144Oooo0oOOooO0O0.f126201OooOo0o);
        if (abstractC35114OooO00o.OooOo() == 4) {
            AbstractC35114OooO00o.OooOOo(abstractC35114OooO00o, "Unexpected leading comma", 0, null, 6);
            throw null;
        }
        int iOrdinal = enumC35144Oooo0oOOooO0O0.ordinal();
        if (iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
            return new Oooo0(this.f126166OooO00o, enumC35144Oooo0oOOooO0O0, abstractC35114OooO00o, descriptor, this.f126170OooO0o);
        }
        if (this.f126167OooO0O0 == enumC35144Oooo0oOOooO0O0 && abstractC34457OooO0OO.f123491OooO00o.f123517OooO0o0) {
            return this;
        }
        return new Oooo0(this.f126166OooO00o, enumC35144Oooo0oOOooO0O0, abstractC35114OooO00o, descriptor, this.f126170OooO0o);
    }

    @Override // Oooo0oo.AbstractC21138OooO0oo, oO0oO000.OooO00o
    public final void OooO0O0(InterfaceC33531OooO0o0 descriptor) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(descriptor, "descriptor");
        if (this.f126166OooO00o.f123491OooO00o.f123513OooO0O0 && descriptor.OooO0o0() == 0) {
            while (OooOo0o(descriptor) != -1) {
            }
        }
        AbstractC35114OooO00o abstractC35114OooO00o = this.f126168OooO0OO;
        if (abstractC35114OooO00o.OooOoo()) {
            OoooO0O.OooOo.OooOOO0(abstractC35114OooO00o, "");
            throw null;
        }
        abstractC35114OooO00o.OooO0oo(this.f126167OooO0O0.f126200OooOo);
        C35130OooOo0o c35130OooOo0o = abstractC35114OooO00o.f126100OooO0O0;
        int i = c35130OooOo0o.f126140OooO0OO;
        int[] iArr = c35130OooOo0o.f126139OooO0O0;
        if (iArr[i] == -2) {
            iArr[i] = -1;
            c35130OooOo0o.f126140OooO0OO = i - 1;
        }
        int i2 = c35130OooOo0o.f126140OooO0OO;
        if (i2 != -1) {
            c35130OooOo0o.f126140OooO0OO = i2 - 1;
        }
    }

    @Override // oO0oO000.OooO00o
    public final AbstractC20449OooO0Oo OooO0OO() {
        return this.f126169OooO0Oo;
    }

    @Override // Oooo0oo.AbstractC21138OooO0oo, oO0oO000.OooO0OO
    public final short OooO0o() {
        AbstractC35114OooO00o abstractC35114OooO00o = this.f126168OooO0OO;
        long jOooO = abstractC35114OooO00o.OooO();
        short s = (short) jOooO;
        if (jOooO == s) {
            return s;
        }
        AbstractC35114OooO00o.OooOOo(abstractC35114OooO00o, "Failed to parse short for input '" + jOooO + '\'', 0, null, 6);
        throw null;
    }

    @Override // Oooo0oo.AbstractC21138OooO0oo, oO0oO000.OooO0OO
    public final long OooO0o0() {
        return this.f126168OooO0OO.OooO();
    }

    @Override // Oooo0oo.AbstractC21138OooO0oo, oO0oO000.OooO0OO
    public final double OooO0oO() {
        AbstractC35114OooO00o abstractC35114OooO00o = this.f126168OooO0OO;
        String strOooOO0o = abstractC35114OooO00o.OooOO0o();
        try {
            double d = Double.parseDouble(strOooOO0o);
            if (this.f126166OooO00o.f123491OooO00o.f123519OooO0oo || !(Double.isInfinite(d) || Double.isNaN(d))) {
                return d;
            }
            OoooO0O.OooOo.OooOOo0(abstractC35114OooO00o, Double.valueOf(d));
            throw null;
        } catch (IllegalArgumentException unused) {
            AbstractC35114OooO00o.OooOOo(abstractC35114OooO00o, C24684Oooo.OooO00o('\'', "Failed to parse type 'double' for input '", strOooOO0o), 0, null, 6);
            throw null;
        }
    }

    @Override // Oooo0oo.AbstractC21138OooO0oo, oO0oO000.OooO0OO
    public final char OooO0oo() {
        AbstractC35114OooO00o abstractC35114OooO00o = this.f126168OooO0OO;
        String strOooOO0o = abstractC35114OooO00o.OooOO0o();
        if (strOooOO0o.length() == 1) {
            return strOooOO0o.charAt(0);
        }
        AbstractC35114OooO00o.OooOOo(abstractC35114OooO00o, C24684Oooo.OooO00o('\'', "Expected single char, but got '", strOooOO0o), 0, null, 6);
        throw null;
    }

    @Override // Oooo0oo.AbstractC21138OooO0oo, oO0oO000.OooO0OO
    public final String OooOO0() {
        C34461OooO0oo c34461OooO0oo = this.f126172OooO0oO;
        AbstractC35114OooO00o abstractC35114OooO00o = this.f126168OooO0OO;
        return c34461OooO0oo.f123514OooO0OO ? abstractC35114OooO00o.OooOOO0() : abstractC35114OooO00o.OooOO0();
    }

    @Override // Oooo0oo.AbstractC21138OooO0oo, oO0oO000.OooO00o
    public final <T> T OooOOO0(InterfaceC33531OooO0o0 descriptor, int i, InterfaceC33910OooO0O0<? extends T> deserializer, T t) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(descriptor, "descriptor");
        kotlin.jvm.internal.OooOOO0.OooO0oO(deserializer, "deserializer");
        boolean z = this.f126167OooO0O0 == EnumC35144Oooo0oO.f126196OooOoOO && (i & 1) == 0;
        C35130OooOo0o c35130OooOo0o = this.f126168OooO0OO.f126100OooO0O0;
        if (z) {
            int[] iArr = c35130OooOo0o.f126139OooO0O0;
            int i2 = c35130OooOo0o.f126140OooO0OO;
            if (iArr[i2] == -2) {
                c35130OooOo0o.f126138OooO00o[i2] = C35130OooOo0o.OooO00o.f126141OooO00o;
            }
        }
        T t2 = (T) super.OooOOO0(descriptor, i, deserializer, t);
        if (z) {
            int[] iArr2 = c35130OooOo0o.f126139OooO0O0;
            int i3 = c35130OooOo0o.f126140OooO0OO;
            if (iArr2[i3] != -2) {
                int i4 = i3 + 1;
                c35130OooOo0o.f126140OooO0OO = i4;
                Object[] objArr = c35130OooOo0o.f126138OooO00o;
                if (i4 == objArr.length) {
                    int i5 = i4 * 2;
                    Object[] objArrCopyOf = Arrays.copyOf(objArr, i5);
                    kotlin.jvm.internal.OooOOO0.OooO0o(objArrCopyOf, "copyOf(...)");
                    c35130OooOo0o.f126138OooO00o = objArrCopyOf;
                    int[] iArrCopyOf = Arrays.copyOf(c35130OooOo0o.f126139OooO0O0, i5);
                    kotlin.jvm.internal.OooOOO0.OooO0o(iArrCopyOf, "copyOf(...)");
                    c35130OooOo0o.f126139OooO0O0 = iArrCopyOf;
                }
            }
            Object[] objArr2 = c35130OooOo0o.f126138OooO00o;
            int i6 = c35130OooOo0o.f126140OooO0OO;
            objArr2[i6] = t2;
            c35130OooOo0o.f126139OooO0O0[i6] = -2;
        }
        return t2;
    }

    @Override // Oooo0oo.AbstractC21138OooO0oo, oO0oO000.OooO0OO
    public final int OooOOo() {
        AbstractC35114OooO00o abstractC35114OooO00o = this.f126168OooO0OO;
        long jOooO = abstractC35114OooO00o.OooO();
        int i = (int) jOooO;
        if (jOooO == i) {
            return i;
        }
        AbstractC35114OooO00o.OooOOo(abstractC35114OooO00o, "Failed to parse int for input '" + jOooO + '\'', 0, null, 6);
        throw null;
    }

    @Override // oOo00O0O.OooOO0
    public final oOo00O0O.OooOO0O OooOOo0() {
        return new Oooo000(this.f126166OooO00o.f123491OooO00o, this.f126168OooO0OO).OooO0O0();
    }

    @Override // Oooo0oo.AbstractC21138OooO0oo, oO0oO000.OooO0OO
    public final oO0oO000.OooO0OO OooOo0O(InterfaceC33531OooO0o0 descriptor) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(descriptor, "descriptor");
        return C35141Oooo0OO.OooO00o(descriptor) ? new OooOOOO(this.f126168OooO0OO, this.f126166OooO00o) : this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x00f8, code lost:
    
        r4.OooOOo0(oO0o0O0o.C33599OooOo0O.Oooo0o(6, r4.OooOoo0(0, r4.f126099OooO00o), r6), o000oo0.C24684Oooo.OooO00o('\'', "Encountered an unknown key '", r6), "Use 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0110, code lost:
    
        throw null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // oO0oO000.OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int OooOo0o(InterfaceC33531OooO0o0 descriptor) {
        byte b;
        char c;
        kotlin.jvm.internal.OooOOO0.OooO0oO(descriptor, "descriptor");
        EnumC35144Oooo0oO enumC35144Oooo0oO = this.f126167OooO0O0;
        int iOrdinal = enumC35144Oooo0oO.ordinal();
        AbstractC35114OooO00o abstractC35114OooO00o = this.f126168OooO0OO;
        byte b2 = 1;
        int i = 0;
        zOooOoo = false;
        boolean zOooOoo = false;
        char c2 = ':';
        AbstractC34457OooO0OO abstractC34457OooO0OO = this.f126166OooO00o;
        int i2 = -1;
        C35130OooOo0o c35130OooOo0o = abstractC35114OooO00o.f126100OooO0O0;
        if (iOrdinal == 0) {
            boolean zOooOoo2 = abstractC35114OooO00o.OooOoo();
            while (true) {
                boolean zOooO0OO = abstractC35114OooO00o.OooO0OO();
                C35126OooOOo0 c35126OooOOo0 = this.f126173OooO0oo;
                if (zOooO0OO) {
                    C34461OooO0oo c34461OooO0oo = this.f126172OooO0oO;
                    boolean z = c34461OooO0oo.f123514OooO0OO;
                    byte b3 = b2;
                    String strOooOOO0 = z ? abstractC35114OooO00o.OooOOO0() : abstractC35114OooO00o.OooO0o0();
                    abstractC35114OooO00o.OooO0oo(c2);
                    int iOooO00o = C35129OooOo0O.OooO00o(descriptor, abstractC34457OooO0OO, strOooOOO0);
                    if (iOooO00o != -3) {
                        if (c35126OooOOo0 != null) {
                            C33958OooOoo c33958OooOoo = c35126OooOOo0.f126126OooO00o;
                            if (iOooO00o < 64) {
                                c33958OooOoo.f122171OooO0OO |= 1 << iOooO00o;
                            } else {
                                int i3 = (iOooO00o >>> 6) - 1;
                                long[] jArr = c33958OooOoo.f122172OooO0Oo;
                                jArr[i3] = jArr[i3] | (1 << (iOooO00o & 63));
                            }
                        }
                        i2 = iOooO00o;
                    } else {
                        if (!c34461OooO0oo.f123513OooO0O0) {
                            OooO00o oooO00o = this.f126170OooO0o;
                            if (oooO00o == null || !kotlin.jvm.internal.OooOOO0.OooO0O0(oooO00o.f126174OooO00o, strOooOOO0)) {
                                break;
                            }
                            oooO00o.f126174OooO00o = null;
                        }
                        ArrayList arrayList = new ArrayList();
                        byte bOooOo = abstractC35114OooO00o.OooOo();
                        if (bOooOo == 8 || bOooOo == 6) {
                            while (true) {
                                byte bOooOo2 = abstractC35114OooO00o.OooOo();
                                b = b3;
                                if (bOooOo2 != b) {
                                    c = 6;
                                    if (bOooOo2 == 8 || bOooOo2 == 6) {
                                        arrayList.add(Byte.valueOf(bOooOo2));
                                    } else {
                                        if (bOooOo2 == 9) {
                                            if (((Number) oOo000Oo.OooOo.OoooOOo(arrayList)).byteValue() != 8) {
                                                throw OoooO0O.OooOo.OooO0o0(abstractC35114OooO00o.OooOo0(), abstractC35114OooO00o.f126099OooO00o, "found ] instead of } at path: " + c35130OooOo0o);
                                            }
                                            C34431OooOo0.OooOoo0(arrayList);
                                        } else if (bOooOo2 == 7) {
                                            if (((Number) oOo000Oo.OooOo.OoooOOo(arrayList)).byteValue() != 6) {
                                                throw OoooO0O.OooOo.OooO0o0(abstractC35114OooO00o.OooOo0(), abstractC35114OooO00o.f126099OooO00o, "found } instead of ] at path: " + c35130OooOo0o);
                                            }
                                            C34431OooOo0.OooOoo0(arrayList);
                                        } else if (bOooOo2 == 10) {
                                            AbstractC35114OooO00o.OooOOo(abstractC35114OooO00o, "Unexpected end of input due to malformed JSON during ignoring unknown keys", 0, null, 6);
                                            throw null;
                                        }
                                        c = 6;
                                    }
                                    abstractC35114OooO00o.OooO0o();
                                    if (arrayList.size() == 0) {
                                        break;
                                    }
                                } else if (z) {
                                    abstractC35114OooO00o.OooOO0o();
                                } else {
                                    abstractC35114OooO00o.OooO0o0();
                                }
                                b3 = b;
                            }
                        } else {
                            abstractC35114OooO00o.OooOO0o();
                            b = b3;
                            c = 6;
                        }
                        zOooOoo2 = abstractC35114OooO00o.OooOoo();
                        b2 = b;
                        c2 = ':';
                    }
                } else {
                    if (zOooOoo2) {
                        C34461OooO0oo c34461OooO0oo2 = abstractC34457OooO0OO.f123491OooO00o;
                        OoooO0O.OooOo.OooOOO0(abstractC35114OooO00o, "object");
                        throw null;
                    }
                    if (c35126OooOOo0 != null) {
                        C33958OooOoo c33958OooOoo2 = c35126OooOOo0.f126126OooO00o;
                        InterfaceC33531OooO0o0 interfaceC33531OooO0o0 = c33958OooOoo2.f122169OooO00o;
                        int iOooO0o0 = interfaceC33531OooO0o0.OooO0o0();
                        while (true) {
                            long j = c33958OooOoo2.f122171OooO0OO;
                            long j2 = -1;
                            C35126OooOOo0.OooO00o oooO00o2 = c33958OooOoo2.f122170OooO0O0;
                            if (j != -1) {
                                int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(~j);
                                c33958OooOoo2.f122171OooO0OO |= 1 << iNumberOfTrailingZeros;
                                if (((Boolean) oooO00o2.invoke(interfaceC33531OooO0o0, Integer.valueOf(iNumberOfTrailingZeros))).booleanValue()) {
                                    i2 = iNumberOfTrailingZeros;
                                    break;
                                }
                            } else if (iOooO0o0 > 64) {
                                long[] jArr2 = c33958OooOoo2.f122172OooO0Oo;
                                int length = jArr2.length;
                                loop3: while (i < length) {
                                    int i4 = i + 1;
                                    int i5 = i4 * 64;
                                    long j3 = jArr2[i];
                                    while (j3 != j2) {
                                        int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros(~j3);
                                        j3 |= 1 << iNumberOfTrailingZeros2;
                                        int i6 = iNumberOfTrailingZeros2 + i5;
                                        if (((Boolean) oooO00o2.invoke(interfaceC33531OooO0o0, Integer.valueOf(i6))).booleanValue()) {
                                            jArr2[i] = j3;
                                            i2 = i6;
                                            break loop3;
                                        }
                                        j2 = -1;
                                    }
                                    jArr2[i] = j3;
                                    i = i4;
                                    j2 = -1;
                                }
                            }
                        }
                    } else {
                        i2 = -1;
                    }
                }
            }
        } else if (iOrdinal != 2) {
            boolean zOooOoo3 = abstractC35114OooO00o.OooOoo();
            if (abstractC35114OooO00o.OooO0OO()) {
                int i7 = this.f126171OooO0o0;
                if (i7 != -1 && !zOooOoo3) {
                    AbstractC35114OooO00o.OooOOo(abstractC35114OooO00o, "Expected end of the array or comma", 0, null, 6);
                    throw null;
                }
                i2 = i7 + 1;
                this.f126171OooO0o0 = i2;
            } else if (zOooOoo3) {
                C34461OooO0oo c34461OooO0oo3 = abstractC34457OooO0OO.f123491OooO00o;
                OoooO0O.OooOo.OooOOO0(abstractC35114OooO00o, "array");
                throw null;
            }
        } else {
            int i8 = this.f126171OooO0o0;
            Object[] objArr = i8 % 2 != 0;
            if (objArr != true) {
                abstractC35114OooO00o.OooO0oo(':');
            } else if (i8 != -1) {
                zOooOoo = abstractC35114OooO00o.OooOoo();
            }
            if (abstractC35114OooO00o.OooO0OO()) {
                if (objArr != false) {
                    if (this.f126171OooO0o0 == -1) {
                        int i9 = abstractC35114OooO00o.f126099OooO00o;
                        if (zOooOoo) {
                            AbstractC35114OooO00o.OooOOo(abstractC35114OooO00o, "Unexpected leading comma", i9, null, 4);
                            throw null;
                        }
                    } else {
                        int i10 = abstractC35114OooO00o.f126099OooO00o;
                        if (!zOooOoo) {
                            AbstractC35114OooO00o.OooOOo(abstractC35114OooO00o, "Expected comma after the key-value pair", i10, null, 4);
                            throw null;
                        }
                    }
                }
                i2 = this.f126171OooO0o0 + 1;
                this.f126171OooO0o0 = i2;
            } else if (zOooOoo) {
                C34461OooO0oo c34461OooO0oo4 = abstractC34457OooO0OO.f123491OooO00o;
                OoooO0O.OooOo.OooOOO0(abstractC35114OooO00o, "object");
                throw null;
            }
        }
        if (enumC35144Oooo0oO != EnumC35144Oooo0oO.f126196OooOoOO) {
            c35130OooOo0o.f126139OooO0O0[c35130OooOo0o.f126140OooO0OO] = i2;
        }
        return i2;
    }

    @Override // Oooo0oo.AbstractC21138OooO0oo, oO0oO000.OooO0OO
    public final boolean OooOoO() {
        boolean z;
        boolean z2;
        AbstractC35114OooO00o abstractC35114OooO00o = this.f126168OooO0OO;
        int iOooOoOO = abstractC35114OooO00o.OooOoOO();
        if (iOooOoOO == abstractC35114OooO00o.OooOo0().length()) {
            AbstractC35114OooO00o.OooOOo(abstractC35114OooO00o, "EOF", 0, null, 6);
            throw null;
        }
        if (abstractC35114OooO00o.OooOo0().charAt(iOooOoOO) == '\"') {
            iOooOoOO++;
            z = true;
        } else {
            z = false;
        }
        int iOooOoO = abstractC35114OooO00o.OooOoO(iOooOoOO);
        if (iOooOoO >= abstractC35114OooO00o.OooOo0().length() || iOooOoO == -1) {
            AbstractC35114OooO00o.OooOOo(abstractC35114OooO00o, "EOF", 0, null, 6);
            throw null;
        }
        int i = iOooOoO + 1;
        int iCharAt = abstractC35114OooO00o.OooOo0().charAt(iOooOoO) | ControlChar.SPACE_CHAR;
        if (iCharAt == 102) {
            abstractC35114OooO00o.OooO0Oo(i, "alse");
            z2 = false;
        } else {
            if (iCharAt != 116) {
                AbstractC35114OooO00o.OooOOo(abstractC35114OooO00o, "Expected valid boolean literal prefix, but had '" + abstractC35114OooO00o.OooOO0o() + '\'', 0, null, 6);
                throw null;
            }
            abstractC35114OooO00o.OooO0Oo(i, "rue");
            z2 = true;
        }
        if (!z) {
            return z2;
        }
        if (abstractC35114OooO00o.f126099OooO00o == abstractC35114OooO00o.OooOo0().length()) {
            AbstractC35114OooO00o.OooOOo(abstractC35114OooO00o, "EOF", 0, null, 6);
            throw null;
        }
        if (abstractC35114OooO00o.OooOo0().charAt(abstractC35114OooO00o.f126099OooO00o) == '\"') {
            abstractC35114OooO00o.f126099OooO00o++;
            return z2;
        }
        AbstractC35114OooO00o.OooOOo(abstractC35114OooO00o, "Expected closing quotation mark", 0, null, 6);
        throw null;
    }

    @Override // Oooo0oo.AbstractC21138OooO0oo, oO0oO000.OooO0OO
    public final float OooOoO0() {
        AbstractC35114OooO00o abstractC35114OooO00o = this.f126168OooO0OO;
        String strOooOO0o = abstractC35114OooO00o.OooOO0o();
        try {
            float f = Float.parseFloat(strOooOO0o);
            if (this.f126166OooO00o.f123491OooO00o.f123519OooO0oo || !(Float.isInfinite(f) || Float.isNaN(f))) {
                return f;
            }
            OoooO0O.OooOo.OooOOo0(abstractC35114OooO00o, Float.valueOf(f));
            throw null;
        } catch (IllegalArgumentException unused) {
            AbstractC35114OooO00o.OooOOo(abstractC35114OooO00o, C24684Oooo.OooO00o('\'', "Failed to parse type 'float' for input '", strOooOO0o), 0, null, 6);
            throw null;
        }
    }

    @Override // oOo00O0O.OooOO0
    public final AbstractC34457OooO0OO OooOoo() {
        return this.f126166OooO00o;
    }

    @Override // Oooo0oo.AbstractC21138OooO0oo, oO0oO000.OooO0OO
    public final boolean OooOoo0() {
        C35126OooOOo0 c35126OooOOo0 = this.f126173OooO0oo;
        if (!(c35126OooOOo0 != null ? c35126OooOOo0.f126127OooO0O0 : false)) {
            AbstractC35114OooO00o abstractC35114OooO00o = this.f126168OooO0OO;
            int iOooOoO = abstractC35114OooO00o.OooOoO(abstractC35114OooO00o.OooOoOO());
            int length = abstractC35114OooO00o.OooOo0().length() - iOooOoO;
            boolean z = false;
            if (length >= 4 && iOooOoO != -1) {
                int i = 0;
                while (true) {
                    if (i < 4) {
                        if (CloudMetaExtra.DEFINE_NON_PARENT_ID.charAt(i) != abstractC35114OooO00o.OooOo0().charAt(iOooOoO + i)) {
                            break;
                        }
                        i++;
                    } else if (length <= 4 || C22306Ooooooo.OooO0OO(abstractC35114OooO00o.OooOo0().charAt(iOooOoO + 4)) != 0) {
                        abstractC35114OooO00o.f126099OooO00o = iOooOoO + 4;
                        z = true;
                    }
                }
            }
            if (!z) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0123  */
    @Override // Oooo0oo.AbstractC21138OooO0oo, oO0oO000.OooO0OO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <T> T OooOooo(InterfaceC33910OooO0O0<? extends T> deserializer) {
        String message;
        AbstractC34457OooO0OO abstractC34457OooO0OO = this.f126166OooO00o;
        AbstractC35114OooO00o abstractC35114OooO00o = this.f126168OooO0OO;
        C35130OooOo0o c35130OooOo0o = abstractC35114OooO00o.f126100OooO0O0;
        kotlin.jvm.internal.OooOOO0.OooO0oO(deserializer, "deserializer");
        try {
        } catch (C33912OooO0Oo e) {
            message = e.getMessage();
            kotlin.jvm.internal.OooOOO0.OooO0Oo(message);
            if (!C33599OooOo0O.OooOoOO(message, "at path", false)) {
            }
        }
        if (!(deserializer instanceof AbstractC33934OooO0O0)) {
            return deserializer.deserialize(this);
        }
        C34461OooO0oo c34461OooO0oo = abstractC34457OooO0OO.f123491OooO00o;
        String strOooO00o = C35138Oooo00O.OooO00o(((AbstractC33934OooO0O0) deserializer).getDescriptor(), abstractC34457OooO0OO);
        String strOooOo0o = abstractC35114OooO00o.OooOo0o(strOooO00o, this.f126172OooO0oO.f123514OooO0OO);
        String strOooO0O0 = null;
        if (strOooOo0o != null) {
            try {
                InterfaceC33910OooO0O0 interfaceC33910OooO0O0OooO0o0 = o00OOOo.OooO0OO.OooO0o0((AbstractC33934OooO0O0) deserializer, this, strOooOo0o);
                OooO00o oooO00o = new OooO00o();
                oooO00o.f126174OooO00o = strOooO00o;
                this.f126170OooO0o = oooO00o;
                return (T) interfaceC33910OooO0O0OooO0o0.deserialize(this);
            } catch (C33917OooOO0 e2) {
                String message2 = e2.getMessage();
                kotlin.jvm.internal.OooOOO0.OooO0Oo(message2);
                String strOoooO0O = C33599OooOo0O.OoooO0O(C33599OooOo0O.Ooooo0o(message2, '\n'), ".");
                String message3 = e2.getMessage();
                kotlin.jvm.internal.OooOOO0.OooO0Oo(message3);
                AbstractC35114OooO00o.OooOOo(abstractC35114OooO00o, strOoooO0O, 0, C33599OooOo0O.OoooOo0('\n', message3, ""), 2);
                throw null;
            }
        }
        if (!(deserializer instanceof AbstractC33934OooO0O0)) {
            return deserializer.deserialize(this);
        }
        C34461OooO0oo c34461OooO0oo2 = abstractC34457OooO0OO.f123491OooO00o;
        String strOooO00o2 = C35138Oooo00O.OooO00o(((AbstractC33934OooO0O0) deserializer).getDescriptor(), abstractC34457OooO0OO);
        oOo00O0O.OooOO0O oooOO0OOooOOo0 = OooOOo0();
        String strOooO0oo = ((AbstractC33934OooO0O0) deserializer).getDescriptor().OooO0oo();
        if (oooOO0OOooOOo0 instanceof C34474OooOoo0) {
            C34474OooOoo0 c34474OooOoo0 = (C34474OooOoo0) oooOO0OOooOOo0;
            oOo00O0O.OooOO0O oooOO0O = (oOo00O0O.OooOO0O) c34474OooOoo0.get(strOooO00o2);
            if (oooOO0O != null) {
                AbstractC34475OooOooO abstractC34475OooOooOOooO0OO = C34462OooOO0o.OooO0OO(oooOO0O);
                if (!(abstractC34475OooOooOOooO0OO instanceof C34471OooOoO0)) {
                    strOooO0O0 = abstractC34475OooOooOOooO0OO.OooO0O0();
                }
            }
            try {
                return (T) Oooo0.OooOo00.OooOOO(abstractC34457OooO0OO, strOooO00o2, c34474OooOoo0, o00OOOo.OooO0OO.OooO0o0((AbstractC33934OooO0O0) deserializer, this, strOooO0O0));
            } catch (C33917OooOO0 e3) {
                String message4 = e3.getMessage();
                kotlin.jvm.internal.OooOOO0.OooO0Oo(message4);
                throw OoooO0O.OooOo.OooO0o0(c34474OooOoo0.toString(), -1, message4);
            }
        }
        StringBuilder sb = new StringBuilder("Expected ");
        kotlin.jvm.internal.Oooo0 oooo0 = C24035Oooo00o.f80943OooO00o;
        sb.append(oooo0.OooO0O0(C34474OooOoo0.class).OooOO0());
        sb.append(", but had ");
        sb.append(oooo0.OooO0O0(oooOO0OOooOOo0.getClass()).OooOO0());
        sb.append(" as the serialized body of ");
        sb.append(strOooO0oo);
        sb.append(" at element: ");
        sb.append(c35130OooOo0o.OooO00o());
        throw OoooO0O.OooOo.OooO0o0(oooOO0OOooOOo0.toString(), -1, sb.toString());
        message = e.getMessage();
        kotlin.jvm.internal.OooOOO0.OooO0Oo(message);
        if (!C33599OooOo0O.OooOoOO(message, "at path", false)) {
            throw e;
        }
        throw new C33912OooO0Oo(e.f122123OooOo0o, e.getMessage() + " at path: " + c35130OooOo0o.OooO00o(), e);
    }

    @Override // Oooo0oo.AbstractC21138OooO0oo, oO0oO000.OooO0OO
    public final byte Oooo000() {
        AbstractC35114OooO00o abstractC35114OooO00o = this.f126168OooO0OO;
        long jOooO = abstractC35114OooO00o.OooO();
        byte b = (byte) jOooO;
        if (jOooO == b) {
            return b;
        }
        AbstractC35114OooO00o.OooOOo(abstractC35114OooO00o, "Failed to parse byte for input '" + jOooO + '\'', 0, null, 6);
        throw null;
    }

    @Override // Oooo0oo.AbstractC21138OooO0oo, oO0oO000.OooO0OO
    public final int Oooo00o(InterfaceC33531OooO0o0 enumDescriptor) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(enumDescriptor, "enumDescriptor");
        return C35129OooOo0O.OooO0O0(enumDescriptor, this.f126166OooO00o, OooOO0(), " at path ".concat(this.f126168OooO0OO.f126100OooO0O0.OooO00o()));
    }
}
