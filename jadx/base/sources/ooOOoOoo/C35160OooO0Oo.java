package ooOOoOoo;

import java.util.Arrays;
import java.util.Iterator;
import oO0Ooo.AbstractC33338OoooOO0;
import oOo000Oo.AbstractC34420OooO0OO;

/* JADX INFO: renamed from: ooOOoOoo.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C35160OooO0Oo<T> extends AbstractC35159OooO0OO<T> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f126227OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Object[] f126228OooOo0o;

    /* JADX INFO: renamed from: ooOOoOoo.OooO0Oo$OooO00o */
    public static final class OooO00o extends AbstractC34420OooO0OO<T> {

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final /* synthetic */ C35160OooO0Oo<T> f126229OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public int f126230OooOoO0 = -1;

        public OooO00o(C35160OooO0Oo<T> c35160OooO0Oo) {
            this.f126229OooOoO = c35160OooO0Oo;
        }

        @Override // oOo000Oo.AbstractC34420OooO0OO
        public final void OooO00o() {
            int i;
            Object[] objArr;
            do {
                i = this.f126230OooOoO0 + 1;
                this.f126230OooOoO0 = i;
                objArr = this.f126229OooOoO.f126228OooOo0o;
                if (i >= objArr.length) {
                    break;
                }
            } while (objArr[i] == null);
            if (i >= objArr.length) {
                this.f123435OooOo0o = 2;
                return;
            }
            T t = (T) objArr[i];
            kotlin.jvm.internal.OooOOO0.OooO0o0(t, "null cannot be cast to non-null type T of org.jetbrains.kotlin.util.ArrayMapImpl");
            this.f123434OooOo = t;
            this.f123435OooOo0o = 1;
        }
    }

    @Override // ooOOoOoo.AbstractC35159OooO0OO
    public final int OooO0O0() {
        return this.f126227OooOo;
    }

    @Override // ooOOoOoo.AbstractC35159OooO0OO
    public final void OooO0Oo(int i, AbstractC33338OoooOO0 value) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(value, "value");
        Object[] objArr = this.f126228OooOo0o;
        if (objArr.length <= i) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length * 2);
            kotlin.jvm.internal.OooOOO0.OooO0o(objArrCopyOf, "copyOf(this, newSize)");
            this.f126228OooOo0o = objArrCopyOf;
        }
        Object[] objArr2 = this.f126228OooOo0o;
        if (objArr2[i] == null) {
            this.f126227OooOo++;
        }
        objArr2[i] = value;
    }

    @Override // ooOOoOoo.AbstractC35159OooO0OO
    public final T get(int i) {
        return (T) oOo000Oo.OooOOO.OooOooo(i, this.f126228OooOo0o);
    }

    @Override // ooOOoOoo.AbstractC35159OooO0OO, java.lang.Iterable
    public final Iterator<T> iterator() {
        return new OooO00o(this);
    }
}
