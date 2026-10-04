package oOo00OO0;

import OooO0Oo.C20398OooO0O0;
import androidx.appcompat.widget.C21532OooOOo;
import java.util.ArrayList;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: renamed from: oOo00OO0.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34480OooO0Oo implements CharSequence, Appendable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public ArrayList f123548OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final oO00Oo0o.OooO0o<char[]> f123549OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public String f123550OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public char[] f123551OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public boolean f123552OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public int f123553OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public int f123554OooOoo0;

    /* JADX INFO: renamed from: oOo00OO0.OooO0Oo$OooO00o */
    public final class OooO00o implements CharSequence {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final int f123555OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final int f123556OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public String f123558OooOoO0;

        public OooO00o(int i, int i2) {
            this.f123556OooOo0o = i;
            this.f123555OooOo = i2;
        }

        @Override // java.lang.CharSequence
        public final char charAt(int i) {
            int i2 = this.f123556OooOo0o + i;
            if (i < 0) {
                throw new IllegalArgumentException(C21532OooOOo.OooO0OO(i, "index is negative: ").toString());
            }
            if (i2 < this.f123555OooOo) {
                return C34480OooO0Oo.this.OooO0OO(i2);
            }
            StringBuilder sbOooO0OO = OooO0O0.OooO0o.OooO0OO(i, "index (", ") should be less than length (");
            sbOooO0OO.append(length());
            sbOooO0OO.append(')');
            throw new IllegalArgumentException(sbOooO0OO.toString().toString());
        }

        public final boolean equals(Object obj) {
            if (obj instanceof CharSequence) {
                CharSequence charSequence = (CharSequence) obj;
                if (charSequence.length() == length()) {
                    int length = length();
                    C34480OooO0Oo c34480OooO0Oo = C34480OooO0Oo.this;
                    for (int i = 0; i < length; i++) {
                        if (c34480OooO0Oo.OooO0OO(this.f123556OooOo0o + i) != charSequence.charAt(i)) {
                            return false;
                        }
                    }
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            String str = this.f123558OooOoO0;
            if (str != null) {
                return str.hashCode();
            }
            C34480OooO0Oo c34480OooO0Oo = C34480OooO0Oo.this;
            int iOooO0OO = 0;
            for (int i = this.f123556OooOo0o; i < this.f123555OooOo; i++) {
                iOooO0OO = (iOooO0OO * 31) + c34480OooO0Oo.OooO0OO(i);
            }
            return iOooO0OO;
        }

        @Override // java.lang.CharSequence
        public final int length() {
            return this.f123555OooOo - this.f123556OooOo0o;
        }

        @Override // java.lang.CharSequence
        public final CharSequence subSequence(int i, int i2) {
            if (i < 0) {
                throw new IllegalArgumentException(C21532OooOOo.OooO0OO(i, "start is negative: ").toString());
            }
            if (i > i2) {
                throw new IllegalArgumentException(("start (" + i + ") should be less or equal to end (" + i2 + ')').toString());
            }
            int i3 = this.f123555OooOo;
            int i4 = this.f123556OooOo0o;
            if (i2 > i3 - i4) {
                throw new IllegalArgumentException(("end should be less than length (" + length() + ')').toString());
            }
            if (i == i2) {
                return "";
            }
            return C34480OooO0Oo.this.new OooO00o(i + i4, i4 + i2);
        }

        @Override // java.lang.CharSequence
        public final String toString() {
            String str = this.f123558OooOoO0;
            if (str != null) {
                return str;
            }
            String string = C34480OooO0Oo.this.OooO0O0(this.f123556OooOo0o, this.f123555OooOo).toString();
            this.f123558OooOoO0 = string;
            return string;
        }
    }

    public C34480OooO0Oo() {
        this(null);
    }

    public final char[] OooO00o(int i) {
        ArrayList arrayList = this.f123548OooOo;
        if (arrayList != null) {
            char[] cArr = this.f123551OooOoO0;
            OooOOO0.OooO0Oo(cArr);
            return (char[]) arrayList.get(i / cArr.length);
        }
        if (i >= 2048) {
            OooO0o(i);
            throw null;
        }
        char[] cArr2 = this.f123551OooOoO0;
        if (cArr2 != null) {
            return cArr2;
        }
        OooO0o(i);
        throw null;
    }

    public final CharSequence OooO0O0(int i, int i2) {
        if (i == i2) {
            return "";
        }
        StringBuilder sb = new StringBuilder(i2 - i);
        for (int i3 = i - (i % 2048); i3 < i2; i3 += 2048) {
            char[] cArrOooO00o = OooO00o(i3);
            int iMin = Math.min(i2 - i3, 2048);
            for (int iMax = Math.max(0, i - i3); iMax < iMin; iMax++) {
                sb.append(cArrOooO00o[iMax]);
            }
        }
        return sb;
    }

    public final char OooO0OO(int i) {
        char[] cArrOooO00o = OooO00o(i);
        char[] cArr = this.f123551OooOoO0;
        OooOOO0.OooO0Oo(cArr);
        return cArrOooO00o[i % cArr.length];
    }

    public final char[] OooO0Oo() {
        if (this.f123554OooOoo0 != 0) {
            char[] cArr = this.f123551OooOoO0;
            OooOOO0.OooO0Oo(cArr);
            return cArr;
        }
        char[] cArrO0000OoO = this.f123549OooOo0o.o0000OoO();
        char[] cArr2 = this.f123551OooOoO0;
        this.f123551OooOoO0 = cArrO0000OoO;
        this.f123554OooOoo0 = cArrO0000OoO.length;
        this.f123552OooOoOO = false;
        if (cArr2 != null) {
            ArrayList arrayList = this.f123548OooOo;
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f123548OooOo = arrayList;
                arrayList.add(cArr2);
            }
            arrayList.add(cArrO0000OoO);
        }
        return cArrO0000OoO;
    }

    public final void OooO0o(int i) {
        if (this.f123552OooOoOO) {
            throw new IllegalStateException("Buffer is already released");
        }
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append(" is not in range [0; ");
        char[] cArr = this.f123551OooOoO0;
        OooOOO0.OooO0Oo(cArr);
        sb.append(cArr.length - this.f123554OooOoo0);
        sb.append(')');
        throw new IndexOutOfBoundsException(sb.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void OooO0o0() {
        ArrayList arrayList = this.f123548OooOo;
        oO00Oo0o.OooO0o<char[]> oooO0o = this.f123549OooOo0o;
        if (arrayList != null) {
            this.f123551OooOoO0 = null;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                oooO0o.o00o0O(arrayList.get(i));
            }
        } else {
            char[] cArr = this.f123551OooOoO0;
            if (cArr != null) {
                oooO0o.o00o0O(cArr);
            }
            this.f123551OooOoO0 = null;
        }
        this.f123552OooOoOO = true;
        this.f123548OooOo = null;
        this.f123550OooOoO = null;
        this.f123553OooOoo = 0;
        this.f123554OooOoo0 = 0;
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c) {
        char[] cArrOooO0Oo = OooO0Oo();
        char[] cArr = this.f123551OooOoO0;
        OooOOO0.OooO0Oo(cArr);
        int length = cArr.length;
        int i = this.f123554OooOoo0;
        cArrOooO0Oo[length - i] = c;
        this.f123550OooOoO = null;
        this.f123554OooOoo0 = i - 1;
        this.f123553OooOoo++;
        return this;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(C21532OooOOo.OooO0OO(i, "index is negative: ").toString());
        }
        if (i < this.f123553OooOoo) {
            return OooO0OO(i);
        }
        throw new IllegalArgumentException(C20398OooO0O0.OooO00o(')', OooO0O0.OooO0o.OooO0OO(i, "index ", " is not in range [0, "), this.f123553OooOoo).toString());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (this.f123553OooOoo == charSequence.length()) {
                int i = this.f123553OooOoo;
                for (int i2 = 0; i2 < i; i2++) {
                    if (OooO0OO(i2) != charSequence.charAt(i2)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f123550OooOoO;
        if (str != null) {
            return str.hashCode();
        }
        int i = this.f123553OooOoo;
        int iOooO0OO = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iOooO0OO = (iOooO0OO * 31) + OooO0OO(i2);
        }
        return iOooO0OO;
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f123553OooOoo;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        if (i <= i2) {
            if (i < 0) {
                throw new IllegalArgumentException(C21532OooOOo.OooO0OO(i, "startIndex is negative: ").toString());
            }
            if (i2 <= this.f123553OooOoo) {
                return new OooO00o(i, i2);
            }
            throw new IllegalArgumentException(C20398OooO0O0.OooO00o(')', OooO0O0.OooO0o.OooO0OO(i2, "endIndex (", ") is greater than length ("), this.f123553OooOoo).toString());
        }
        throw new IllegalArgumentException(("startIndex (" + i + ") should be less or equal to endIndex (" + i2 + ')').toString());
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        String str = this.f123550OooOoO;
        if (str != null) {
            return str;
        }
        String string = OooO0O0(0, this.f123553OooOoo).toString();
        this.f123550OooOoO = string;
        return string;
    }

    public C34480OooO0Oo(Object obj) {
        oO00Oo0o.OooO0o<char[]> pool = C34481OooO0o0.f123563OooO00o;
        OooOOO0.OooO0oO(pool, "pool");
        this.f123549OooOo0o = pool;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        if (charSequence == null) {
            return this;
        }
        int i3 = i;
        while (i3 < i2) {
            char[] cArrOooO0Oo = OooO0Oo();
            int length = cArrOooO0Oo.length;
            int i4 = this.f123554OooOoo0;
            int i5 = length - i4;
            int iMin = Math.min(i2 - i3, i4);
            for (int i6 = 0; i6 < iMin; i6++) {
                cArrOooO0Oo[i5 + i6] = charSequence.charAt(i3 + i6);
            }
            i3 += iMin;
            this.f123554OooOoo0 -= iMin;
        }
        this.f123550OooOoO = null;
        this.f123553OooOoo = (i2 - i) + this.f123553OooOoo;
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        if (charSequence == null) {
            return this;
        }
        append(charSequence, 0, charSequence.length());
        return this;
    }
}
