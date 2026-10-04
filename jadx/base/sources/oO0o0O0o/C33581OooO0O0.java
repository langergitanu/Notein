package oO0o0O0o;

import java.util.Iterator;
import java.util.NoSuchElementException;
import oO00ooO.C32443OooOOO;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0O0O.InterfaceC33569OooO0oo;

/* JADX INFO: renamed from: oO0o0O0o.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33581OooO0O0 implements InterfaceC33569OooO0oo<oO0O00oo.OooO> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final CharSequence f121234OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final InterfaceC32508OooOOOo<CharSequence, Integer, C32443OooOOO<Integer, Integer>> f121235OooO0O0;

    /* JADX INFO: renamed from: oO0o0O0o.OooO0O0$OooO00o */
    public static final class OooO00o implements Iterator<oO0O00oo.OooO>, oO0O00.OooO00o {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public int f121236OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f121237OooOo0o = -1;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public oO0O00oo.OooO f121238OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public int f121239OooOoO0;

        public OooO00o() {
            C33581OooO0O0.this.getClass();
            int iOooO0o = oO0O00oo.OooOO0.OooO0o(0, 0, C33581OooO0O0.this.f121234OooO00o.length());
            this.f121236OooOo = iOooO0o;
            this.f121239OooOoO0 = iOooO0o;
        }

        public final void OooO00o() {
            C32443OooOOO<Integer, Integer> c32443OooOOOInvoke;
            int i = this.f121239OooOoO0;
            if (i < 0) {
                this.f121237OooOo0o = 0;
                this.f121238OooOoO = null;
                return;
            }
            C33581OooO0O0 c33581OooO0O0 = C33581OooO0O0.this;
            c33581OooO0O0.getClass();
            CharSequence charSequence = c33581OooO0O0.f121234OooO00o;
            if (i <= charSequence.length() && (c32443OooOOOInvoke = c33581OooO0O0.f121235OooO0O0.invoke(charSequence, Integer.valueOf(this.f121239OooOoO0))) != null) {
                int iIntValue = c32443OooOOOInvoke.f116638OooOo0o.intValue();
                int iIntValue2 = c32443OooOOOInvoke.f116637OooOo.intValue();
                this.f121238OooOoO = oO0O00oo.OooOO0.OooO(this.f121236OooOo, iIntValue);
                int i2 = iIntValue + iIntValue2;
                this.f121236OooOo = i2;
                this.f121239OooOoO0 = i2 + (iIntValue2 == 0 ? 1 : 0);
            } else {
                this.f121238OooOoO = new oO0O00oo.OooO(this.f121236OooOo, C33599OooOo0O.Oooo000(charSequence), 1);
                this.f121239OooOoO0 = -1;
            }
            this.f121237OooOo0o = 1;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.f121237OooOo0o == -1) {
                OooO00o();
            }
            return this.f121237OooOo0o == 1;
        }

        @Override // java.util.Iterator
        public final oO0O00oo.OooO next() {
            if (this.f121237OooOo0o == -1) {
                OooO00o();
            }
            if (this.f121237OooOo0o == 0) {
                throw new NoSuchElementException();
            }
            oO0O00oo.OooO oooO = this.f121238OooOoO;
            kotlin.jvm.internal.OooOOO0.OooO0o0(oooO, "null cannot be cast to non-null type kotlin.ranges.IntRange");
            this.f121238OooOoO = null;
            this.f121237OooOo0o = -1;
            return oooO;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C33581OooO0O0(CharSequence input, InterfaceC32508OooOOOo interfaceC32508OooOOOo) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(input, "input");
        this.f121234OooO00o = input;
        this.f121235OooO0O0 = interfaceC32508OooOOOo;
    }

    @Override // oO0o0O0O.InterfaceC33569OooO0oo
    public final Iterator<oO0O00oo.OooO> iterator() {
        return new OooO00o();
    }
}
