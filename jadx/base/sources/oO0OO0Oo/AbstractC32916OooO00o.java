package oO0OO0Oo;

import OooO0Oo.C20398OooO0O0;
import com.orion.notein.richeditor.utils.p606io.FilenameUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.OooOOO0;
import oOo000Oo.AbstractC34421OooO0Oo;
import oOo000Oo.C34434OooOoO;
import oOo000Oo.OooOOO;
import oOo000Oo.OooOo;

/* JADX INFO: renamed from: oO0OO0Oo.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC32916OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int[] f118752OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f118753OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f118754OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f118755OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final List<Integer> f118756OooO0o0;

    public AbstractC32916OooO00o(int... numbers) {
        List<Integer> listO0ooOO0;
        OooOOO0.OooO0oO(numbers, "numbers");
        this.f118752OooO00o = numbers;
        Integer numOooOooO = OooOOO.OooOooO(numbers, 0);
        this.f118753OooO0O0 = numOooOooO != null ? numOooOooO.intValue() : -1;
        Integer numOooOooO2 = OooOOO.OooOooO(numbers, 1);
        this.f118754OooO0OO = numOooOooO2 != null ? numOooOooO2.intValue() : -1;
        Integer numOooOooO3 = OooOOO.OooOooO(numbers, 2);
        this.f118755OooO0Oo = numOooOooO3 != null ? numOooOooO3.intValue() : -1;
        if (numbers.length <= 3) {
            listO0ooOO0 = C34434OooOoO.f123453OooOo0o;
        } else {
            if (numbers.length > 1024) {
                throw new IllegalArgumentException(C20398OooO0O0.OooO00o(FilenameUtils.EXTENSION_SEPARATOR, new StringBuilder("BinaryVersion with length more than 1024 are not supported. Provided length "), numbers.length));
            }
            listO0ooOO0 = OooOo.o0ooOO0(new AbstractC34421OooO0Oo.C20360OooO0Oo(new oOo000Oo.OooOOO0(numbers), 3, numbers.length));
        }
        this.f118756OooO0o0 = listO0ooOO0;
    }

    public final boolean OooO00o(int i, int i2, int i3) {
        int i4 = this.f118753OooO0O0;
        if (i4 > i) {
            return true;
        }
        if (i4 < i) {
            return false;
        }
        int i5 = this.f118754OooO0OO;
        if (i5 > i2) {
            return true;
        }
        return i5 >= i2 && this.f118755OooO0Oo >= i3;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !getClass().equals(obj.getClass())) {
            return false;
        }
        AbstractC32916OooO00o abstractC32916OooO00o = (AbstractC32916OooO00o) obj;
        return this.f118753OooO0O0 == abstractC32916OooO00o.f118753OooO0O0 && this.f118754OooO0OO == abstractC32916OooO00o.f118754OooO0OO && this.f118755OooO0Oo == abstractC32916OooO00o.f118755OooO0Oo && OooOOO0.OooO0O0(this.f118756OooO0o0, abstractC32916OooO00o.f118756OooO0o0);
    }

    public final int hashCode() {
        int i = this.f118753OooO0O0;
        int i2 = (i * 31) + this.f118754OooO0OO + i;
        int i3 = (i2 * 31) + this.f118755OooO0Oo + i2;
        return this.f118756OooO0o0.hashCode() + (i3 * 31) + i3;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        for (int i : this.f118752OooO00o) {
            if (i == -1) {
                break;
            }
            arrayList.add(Integer.valueOf(i));
        }
        return arrayList.isEmpty() ? "unknown" : OooOo.o000oOoO(arrayList, ".", null, null, null, 62);
    }
}
