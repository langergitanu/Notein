package oOo000Oo;

import java.util.RandomAccess;

/* JADX INFO: loaded from: classes10.dex */
public final class OooOOO0 extends AbstractC34421OooO0Oo<Integer> implements RandomAccess {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int[] f123450OooOo0o;

    public OooOOO0(int[] iArr) {
        this.f123450OooOo0o = iArr;
    }

    @Override // oOo000Oo.AbstractC34419OooO0O0
    public final int OooO0O0() {
        return this.f123450OooOo0o.length;
    }

    @Override // oOo000Oo.AbstractC34419OooO0O0, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof Integer)) {
            return false;
        }
        int iIntValue = ((Number) obj).intValue();
        int[] iArr = this.f123450OooOo0o;
        kotlin.jvm.internal.OooOOO0.OooO0oO(iArr, "<this>");
        int length = iArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            }
            if (iIntValue == iArr[i]) {
                break;
            }
            i++;
        }
        return i >= 0;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return Integer.valueOf(this.f123450OooOo0o[i]);
    }

    @Override // oOo000Oo.AbstractC34421OooO0Oo, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Number) obj).intValue();
        int[] iArr = this.f123450OooOo0o;
        kotlin.jvm.internal.OooOOO0.OooO0oO(iArr, "<this>");
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            if (iIntValue == iArr[i]) {
                return i;
            }
        }
        return -1;
    }

    @Override // oOo000Oo.AbstractC34419OooO0O0, java.util.Collection
    public final boolean isEmpty() {
        return this.f123450OooOo0o.length == 0;
    }

    @Override // oOo000Oo.AbstractC34421OooO0Oo, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Number) obj).intValue();
        int[] iArr = this.f123450OooOo0o;
        kotlin.jvm.internal.OooOOO0.OooO0oO(iArr, "<this>");
        int length = iArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                if (iIntValue == iArr[length]) {
                    return length;
                }
                if (i < 0) {
                    break;
                }
                length = i;
            }
        }
        return -1;
    }
}
