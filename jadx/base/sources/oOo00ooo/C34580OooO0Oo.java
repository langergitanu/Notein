package oOo00ooo;

import Oooo0oO.o0Oo0oo;
import java.util.Objects;
import oO00o.AbstractC32316OooO0OO;
import oO00o.InterfaceC32319OooO0o0;
import oO00oO0O.AbstractC32407OooO0OO;

/* JADX INFO: renamed from: oOo00ooo.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34580OooO0Oo<T> extends AbstractC32316OooO0OO<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final T[] f123856OooO00o;

    /* JADX INFO: renamed from: oOo00ooo.OooO0Oo$OooO00o */
    public static final class OooO00o<T> extends AbstractC32407OooO0OO<T> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final T[] f123857OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final InterfaceC32319OooO0o0<? super T> f123858OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public boolean f123859OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public int f123860OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public volatile boolean f123861OooOoOO;

        public OooO00o(InterfaceC32319OooO0o0<? super T> interfaceC32319OooO0o0, T[] tArr) {
            this.f123858OooOo0o = interfaceC32319OooO0o0;
            this.f123857OooOo = tArr;
        }

        @Override // oOo00ooO.InterfaceC34571OooO0OO
        public final int OooO0O0(int i) {
            this.f123859OooOoO = true;
            return 1;
        }

        @Override // oOo00ooO.InterfaceC34575OooO0oO
        public final void clear() {
            this.f123860OooOoO0 = this.f123857OooOo.length;
        }

        @Override // oO0OO0oO.InterfaceC32925OooO0O0
        public final void dispose() {
            this.f123861OooOoOO = true;
        }

        @Override // oOo00ooO.InterfaceC34575OooO0oO
        public final boolean isEmpty() {
            return this.f123860OooOoO0 == this.f123857OooOo.length;
        }

        @Override // oOo00ooO.InterfaceC34575OooO0oO
        public final T poll() {
            int i = this.f123860OooOoO0;
            T[] tArr = this.f123857OooOo;
            if (i == tArr.length) {
                return null;
            }
            this.f123860OooOoO0 = i + 1;
            T t = tArr[i];
            Objects.requireNonNull(t, "The array element is null");
            return t;
        }
    }

    public C34580OooO0Oo(T[] tArr) {
        this.f123856OooO00o = tArr;
    }

    @Override // oO00o.AbstractC32316OooO0OO
    public final void OooO0OO(InterfaceC32319OooO0o0<? super T> interfaceC32319OooO0o0) {
        T[] tArr = this.f123856OooO00o;
        OooO00o oooO00o = new OooO00o(interfaceC32319OooO0o0, tArr);
        interfaceC32319OooO0o0.OooO00o(oooO00o);
        if (oooO00o.f123859OooOoO) {
            return;
        }
        int length = tArr.length;
        for (int i = 0; i < length && !oooO00o.f123861OooOoOO; i++) {
            T t = tArr[i];
            if (t == null) {
                oooO00o.f123858OooOo0o.onError(new NullPointerException(o0Oo0oo.OooO0O0(i, "The element at index ", " is null")));
                return;
            }
            oooO00o.f123858OooOo0o.onNext(t);
        }
        if (oooO00o.f123861OooOoOO) {
            return;
        }
        oooO00o.f123858OooOo0o.onComplete();
    }
}
