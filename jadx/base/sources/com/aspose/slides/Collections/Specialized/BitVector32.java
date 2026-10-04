package com.aspose.slides.Collections.Specialized;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14080ne;

/* JADX INFO: loaded from: classes3.dex */
public class BitVector32 extends AbstractC7020m9<BitVector32> {

    /* JADX INFO: renamed from: k4 */
    private int f1864k4;

    public static class Section extends AbstractC7020m9<Section> {

        /* JADX INFO: renamed from: k4 */
        private short f1865k4;

        /* JADX INFO: renamed from: x1 */
        private short f1866x1;

        public Section() {
        }

        public static boolean op_Equality(Section section, Section section2) {
            return section.f1865k4 == section2.f1865k4 && section.f1866x1 == section2.f1866x1;
        }

        public static boolean op_Inequality(Section section, Section section2) {
            return (section.f1865k4 == section2.f1865k4 && section.f1866x1 == section2.f1866x1) ? false : true;
        }

        @Override // com.aspose.slides.p559ms.System.AbstractC14079na
        public Section Clone() {
            Section section = new Section();
            CloneTo(section);
            return section;
        }

        @Override // com.aspose.slides.p559ms.System.AbstractC14079na
        public void CloneTo(Section section) {
            section.f1865k4 = this.f1865k4;
            section.f1866x1 = this.f1866x1;
        }

        public Object clone() {
            return Clone();
        }

        public boolean equals(Section section) {
            return this.f1865k4 == section.f1865k4 && this.f1866x1 == section.f1866x1;
        }

        public short getMask() {
            return this.f1865k4;
        }

        public short getOffset() {
            return this.f1866x1;
        }

        public int hashCode() {
            return this.f1865k4 << this.f1866x1;
        }

        public String toString() {
            return toString(Clone());
        }

        public Section(short s, short s2) {
            this.f1865k4 = s;
            this.f1866x1 = s2;
        }

        public static boolean equals(Section section, Section section2) {
            return section.equals(section2);
        }

        public static String toString(Section section) {
            C6765kp c6765kpOooO00o = OooO00o.OooO00o("Section{0x");
            c6765kpOooO00o.m26792k4(C14080ne.m66951k4(section.getMask(), 16));
            c6765kpOooO00o.m26792k4(", 0x");
            c6765kpOooO00o.m26792k4(C14080ne.m66951k4(section.getOffset(), 16));
            c6765kpOooO00o.m26792k4("}");
            return c6765kpOooO00o.toString();
        }

        public boolean equals(Object obj) {
            if (!C7019kk.m27469x1(obj, Section.class)) {
                return false;
            }
            Section sectionClone = ((Section) C7019kk.m27464to(obj, Section.class)).Clone();
            return this.f1865k4 == sectionClone.f1865k4 && this.f1866x1 == sectionClone.f1866x1;
        }
    }

    public BitVector32() {
    }

    public static int createMask() {
        return 1;
    }

    public static Section createSection(short s) {
        return createSection(s, new Section((short) 0, (short) 0));
    }

    public static boolean equals(BitVector32 bitVector32, BitVector32 bitVector322) {
        return bitVector32.equals(bitVector322);
    }

    /* JADX INFO: renamed from: k4 */
    private static int m1028k4(int i) {
        int i2 = 0;
        while ((i >> i2) != 0) {
            i2++;
        }
        return i2;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    public BitVector32 Clone() {
        BitVector32 bitVector32 = new BitVector32();
        CloneTo(bitVector32);
        return bitVector32;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    public void CloneTo(BitVector32 bitVector32) {
        bitVector32.f1864k4 = this.f1864k4;
    }

    public Object clone() {
        return Clone();
    }

    public int getData() {
        return this.f1864k4;
    }

    public int get_Item(Section section) {
        return section.getMask() & (this.f1864k4 >> section.getOffset());
    }

    public int hashCode() {
        return C14057f9.m66579k4(this.f1864k4);
    }

    public void set_Item(int i, boolean z) {
        int i2;
        if (z) {
            i2 = i | this.f1864k4;
        } else {
            i2 = (~i) & this.f1864k4;
        }
        this.f1864k4 = i2;
    }

    public String toString() {
        return toString(Clone());
    }

    public BitVector32(int i) {
        this.f1864k4 = i;
    }

    public static int createMask(int i) {
        if (i == 0) {
            return 1;
        }
        if (i != Integer.MIN_VALUE) {
            return i << 1;
        }
        throw new InvalidOperationException("all bits set");
    }

    public static Section createSection(short s, Section section) {
        if (s < 1) {
            throw new ArgumentException("maxValue");
        }
        int iM1028k4 = m1028k4(s);
        int i = (1 << iM1028k4) - 1;
        int offset = section.getOffset() + m1028k4(section.getMask());
        if (iM1028k4 + offset <= 32) {
            return new Section(C7019kk.m27468x1(Integer.valueOf(i), 9), C7019kk.m27468x1(Integer.valueOf(offset), 9));
        }
        throw new ArgumentException("Sections cannot exceed 32 bits in total");
    }

    public static String toString(BitVector32 bitVector32) {
        C6765kp c6765kpOooO00o = OooO00o.OooO00o("BitVector32{");
        for (long jM27438h4 = C7019kk.m27438h4((Object) 2147483648L, 10); jM27438h4 > 0; jM27438h4 >>= 1) {
            c6765kpOooO00o.m26780k4((((long) bitVector32.f1864k4) & jM27438h4) == 0 ? '0' : '1');
        }
        c6765kpOooO00o.m26780k4('}');
        return c6765kpOooO00o.toString();
    }

    public boolean equals(Object obj) {
        return C7019kk.m27469x1(obj, BitVector32.class) && this.f1864k4 == ((BitVector32) C7019kk.m27464to(obj, BitVector32.class)).f1864k4;
    }

    public boolean get_Item(int i) {
        return (this.f1864k4 & i) == i;
    }

    public void set_Item(Section section, int i) {
        if (i < 0) {
            throw new ArgumentException("Section can't hold negative values");
        }
        if (i > section.getMask()) {
            throw new ArgumentException("Value too large to fit in section");
        }
        int i2 = this.f1864k4 & (~(section.getMask() << section.getOffset()));
        this.f1864k4 = i2;
        this.f1864k4 = (i << section.getOffset()) | i2;
    }

    public BitVector32(BitVector32 bitVector32) {
        this.f1864k4 = bitVector32.f1864k4;
    }
}
