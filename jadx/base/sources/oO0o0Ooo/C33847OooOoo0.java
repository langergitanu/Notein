package oO0o0Ooo;

import java.lang.Comparable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import oO0o0OO.AbstractC33656OooooOO;
import oO0o0Ooo.InterfaceC33846OooOoo;

/* JADX INFO: renamed from: oO0o0Ooo.OooOoo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C33847OooOoo0<T extends InterfaceC33846OooOoo & Comparable<? super T>> {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f121962OooO0O0 = AtomicIntegerFieldUpdater.newUpdater(C33847OooOoo0.class, "_size$volatile");

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public T[] f121963OooO00o;
    private volatile /* synthetic */ int _size$volatile;

    public final void OooO00o(AbstractC33656OooooOO.OooO0OO oooO0OO) {
        oooO0OO.OooO00o((AbstractC33656OooooOO.C33657OooO0Oo) this);
        T[] tArr = this.f121963OooO00o;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f121962OooO0O0;
        if (tArr == null) {
            tArr = (T[]) new InterfaceC33846OooOoo[4];
            this.f121963OooO00o = tArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= tArr.length) {
            Object[] objArrCopyOf = Arrays.copyOf(tArr, atomicIntegerFieldUpdater.get(this) * 2);
            kotlin.jvm.internal.OooOOO0.OooO0o(objArrCopyOf, "copyOf(...)");
            tArr = (T[]) ((InterfaceC33846OooOoo[]) objArrCopyOf);
            this.f121963OooO00o = tArr;
        }
        int i = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i + 1);
        tArr[i] = oooO0OO;
        oooO0OO.f121344OooOo = i;
        OooO0OO(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final T OooO0O0(int i) {
        T[] tArr = this.f121963OooO00o;
        kotlin.jvm.internal.OooOOO0.OooO0Oo(tArr);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f121962OooO0O0;
        atomicIntegerFieldUpdater.set(this, atomicIntegerFieldUpdater.get(this) - 1);
        if (i < atomicIntegerFieldUpdater.get(this)) {
            OooO0Oo(i, atomicIntegerFieldUpdater.get(this));
            int i2 = (i - 1) / 2;
            if (i > 0) {
                T t = tArr[i];
                kotlin.jvm.internal.OooOOO0.OooO0Oo(t);
                T t2 = tArr[i2];
                kotlin.jvm.internal.OooOOO0.OooO0Oo(t2);
                if (((Comparable) t).compareTo(t2) < 0) {
                    OooO0Oo(i, i2);
                    OooO0OO(i2);
                } else {
                    while (true) {
                        int i3 = i * 2;
                        int i4 = i3 + 1;
                        if (i4 >= atomicIntegerFieldUpdater.get(this)) {
                            break;
                        }
                        T[] tArr2 = this.f121963OooO00o;
                        kotlin.jvm.internal.OooOOO0.OooO0Oo(tArr2);
                        int i5 = i3 + 2;
                        if (i5 < atomicIntegerFieldUpdater.get(this)) {
                            T t3 = tArr2[i5];
                            kotlin.jvm.internal.OooOOO0.OooO0Oo(t3);
                            T t4 = tArr2[i4];
                            kotlin.jvm.internal.OooOOO0.OooO0Oo(t4);
                            if (((Comparable) t3).compareTo(t4) >= 0) {
                                i5 = i4;
                            }
                            T t5 = tArr2[i];
                            kotlin.jvm.internal.OooOOO0.OooO0Oo(t5);
                            T t6 = tArr2[i5];
                            kotlin.jvm.internal.OooOOO0.OooO0Oo(t6);
                            if (((Comparable) t5).compareTo(t6) <= 0) {
                                break;
                            }
                            OooO0Oo(i, i5);
                            i = i5;
                        }
                    }
                }
            }
        }
        T t7 = tArr[atomicIntegerFieldUpdater.get(this)];
        kotlin.jvm.internal.OooOOO0.OooO0Oo(t7);
        t7.OooO00o(null);
        t7.setIndex(-1);
        tArr[atomicIntegerFieldUpdater.get(this)] = null;
        return t7;
    }

    public final void OooO0OO(int i) {
        while (i > 0) {
            T[] tArr = this.f121963OooO00o;
            kotlin.jvm.internal.OooOOO0.OooO0Oo(tArr);
            int i2 = (i - 1) / 2;
            T t = tArr[i2];
            kotlin.jvm.internal.OooOOO0.OooO0Oo(t);
            T t2 = tArr[i];
            kotlin.jvm.internal.OooOOO0.OooO0Oo(t2);
            if (((Comparable) t).compareTo(t2) <= 0) {
                return;
            }
            OooO0Oo(i, i2);
            i = i2;
        }
    }

    public final void OooO0Oo(int i, int i2) {
        T[] tArr = this.f121963OooO00o;
        kotlin.jvm.internal.OooOOO0.OooO0Oo(tArr);
        T t = tArr[i2];
        kotlin.jvm.internal.OooOOO0.OooO0Oo(t);
        T t2 = tArr[i];
        kotlin.jvm.internal.OooOOO0.OooO0Oo(t2);
        tArr[i] = t;
        tArr[i2] = t2;
        t.setIndex(i);
        t2.setIndex(i2);
    }
}
