package oO0OOooO;

import java.io.Serializable;
import java.text.FieldPosition;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Locale;
import o0Oo0o00.C28195OoooOOo;
import o0OoO0oo.o00OO;
import oO000O0.EnumC31935OooO0Oo;

/* JADX INFO: renamed from: oO0OOooO.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33148OooO0OO extends AbstractC33154OooOO0 implements Serializable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final o00OO f119870OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final double[] f119871OooOo0o;

    static {
        NumberFormat numberFormat = NumberFormat.getInstance(Locale.getDefault());
        numberFormat.setMaximumFractionDigits(10);
        f119870OooOo = new o00OO(numberFormat);
    }

    public C33148OooO0OO(double[] dArr) {
        this.f119871OooOo0o = (double[]) dArr.clone();
    }

    @Override // oO0OOooO.AbstractC33154OooOO0
    public final double OooO00o(int i) {
        try {
            return this.f119871OooOo0o[i];
        } catch (IndexOutOfBoundsException unused) {
            throw new o00O0o.OooOO0(EnumC31935OooO0Oo.INDEX, Integer.valueOf(i), Integer.valueOf(r0.length - 1));
        }
    }

    @Override // oO0OOooO.AbstractC33154OooOO0
    public final int OooO0O0() {
        return this.f119871OooOo0o.length;
    }

    @Override // oO0OOooO.AbstractC33154OooOO0
    public final boolean OooO0OO() {
        for (double d : this.f119871OooOo0o) {
            if (Double.isNaN(d)) {
                return true;
            }
        }
        return false;
    }

    @Override // oO0OOooO.AbstractC33154OooOO0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC33154OooOO0)) {
            return false;
        }
        AbstractC33154OooOO0 abstractC33154OooOO0 = (AbstractC33154OooOO0) obj;
        double[] dArr = this.f119871OooOo0o;
        if (dArr.length != abstractC33154OooOO0.OooO0O0()) {
            return false;
        }
        if (abstractC33154OooOO0.OooO0OO()) {
            return OooO0OO();
        }
        for (int i = 0; i < dArr.length; i++) {
            if (dArr[i] != abstractC33154OooOO0.OooO00o(i)) {
                return false;
            }
        }
        return true;
    }

    @Override // oO0OOooO.AbstractC33154OooOO0
    public final int hashCode() {
        if (OooO0OO()) {
            return 9;
        }
        return Arrays.hashCode(this.f119871OooOo0o);
    }

    public final String toString() {
        o00OO o00oo2 = f119870OooOo;
        o00oo2.getClass();
        StringBuffer stringBuffer = new StringBuffer();
        FieldPosition fieldPosition = new FieldPosition(0);
        fieldPosition.setBeginIndex(0);
        fieldPosition.setEndIndex(0);
        stringBuffer.append("{");
        for (int i = 0; i < this.f119871OooOo0o.length; i++) {
            if (i > 0) {
                stringBuffer.append("; ");
            }
            C28195OoooOOo.OooO00o(OooO00o(i), (NumberFormat) o00oo2.f102186OooO00o, stringBuffer, fieldPosition);
        }
        stringBuffer.append("}");
        return stringBuffer.toString();
    }
}
