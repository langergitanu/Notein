package OoooOOo;

import OooOo.C20486OooOoO0;
import OoooOOo.AbstractC21195OooO0oo;
import java.util.Arrays;
import java.util.HashMap;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: OoooOOo.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21190OooO0OO extends C21189OooO0O0 {

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final C21189OooO0O0 f61466OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public boolean f61467OooOOOo;

    public C21190OooO0OO(int i, C21196OooOO0 c21196OooOO0, InterfaceC32507OooOO0o<Object, C32460OooOooO> interfaceC32507OooOO0o, InterfaceC32507OooOO0o<Object, C32460OooOooO> interfaceC32507OooOO0o2, C21189OooO0O0 c21189OooO0O0) {
        super(i, c21196OooOO0, interfaceC32507OooOO0o, interfaceC32507OooOO0o2);
        this.f61466OooOOOO = c21189OooO0O0;
        c21189OooO0O0.OooOO0O();
    }

    @Override // OoooOOo.C21189OooO0O0, OoooOOo.AbstractC21194OooO0oO
    public final void OooO0OO() {
        if (this.f61475OooO0OO) {
            return;
        }
        super.OooO0OO();
        if (this.f61467OooOOOo) {
            return;
        }
        this.f61467OooOOOo = true;
        this.f61466OooOOOO.OooOO0o();
    }

    @Override // OoooOOo.C21189OooO0O0
    public final AbstractC21195OooO0oo OooOo0O() {
        C21189OooO0O0 c21189OooO0O0 = this.f61466OooOOOO;
        if (c21189OooO0O0.f61465OooOOO0 || c21189OooO0O0.f61475OooO0OO) {
            return new AbstractC21195OooO0oo.OooO00o();
        }
        C20486OooOoO0<InterfaceC21222Oooo0O0> c20486OooOoO0 = this.f61461OooO0oo;
        int i = this.f61474OooO0O0;
        HashMap mapOooO0OO = c20486OooOoO0 != null ? C21200OooOOO0.OooO0OO(c21189OooO0O0, this, c21189OooO0O0.OooO0o0()) : null;
        Object obj = C21200OooOOO0.f61496OooO0OO;
        synchronized (obj) {
            try {
                C21200OooOOO0.OooO0Oo(this);
                if (c20486OooOoO0 == null || c20486OooOoO0.f58544OooO0Oo == 0) {
                    OooO00o();
                } else {
                    AbstractC21195OooO0oo abstractC21195OooO0ooOooOoO0 = OooOoO0(this.f61466OooOOOO.OooO0Oo(), mapOooO0OO, this.f61466OooOOOO.OooO0o0());
                    if (!kotlin.jvm.internal.OooOOO0.OooO0O0(abstractC21195OooO0ooOooOoO0, AbstractC21195OooO0oo.OooO0O0.f61477OooO00o)) {
                        return abstractC21195OooO0ooOooOoO0;
                    }
                    C20486OooOoO0<InterfaceC21222Oooo0O0> c20486OooOoO0OooOo0o = this.f61466OooOOOO.OooOo0o();
                    if (c20486OooOoO0OooOo0o != null) {
                        c20486OooOoO0OooOo0o.OooO(c20486OooOoO0);
                    } else {
                        this.f61466OooOOOO.OooOoOO(c20486OooOoO0);
                        this.f61461OooO0oo = null;
                    }
                }
                if (this.f61466OooOOOO.OooO0Oo() < i) {
                    this.f61466OooOOOO.OooOo0();
                }
                C21189OooO0O0 c21189OooO0O02 = this.f61466OooOOOO;
                c21189OooO0O02.OooOOo(c21189OooO0O02.OooO0o0().OooO0Oo(i).OooO0O0(this.f61462OooOO0));
                this.f61466OooOOOO.OooOoO(i);
                C21189OooO0O0 c21189OooO0O03 = this.f61466OooOOOO;
                int i2 = this.f61476OooO0Oo;
                this.f61476OooO0Oo = -1;
                if (i2 >= 0) {
                    int[] iArr = c21189OooO0O03.f61463OooOO0O;
                    kotlin.jvm.internal.OooOOO0.OooO0oO(iArr, "<this>");
                    int length = iArr.length;
                    int[] iArrCopyOf = Arrays.copyOf(iArr, length + 1);
                    iArrCopyOf[length] = i2;
                    c21189OooO0O03.f61463OooOO0O = iArrCopyOf;
                } else {
                    c21189OooO0O03.getClass();
                }
                C21189OooO0O0 c21189OooO0O04 = this.f61466OooOOOO;
                C21196OooOO0 c21196OooOO0 = this.f61462OooOO0;
                c21189OooO0O04.getClass();
                synchronized (obj) {
                    c21189OooO0O04.f61462OooOO0 = c21189OooO0O04.f61462OooOO0.OooO0o(c21196OooOO0);
                    C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                    C21189OooO0O0 c21189OooO0O05 = this.f61466OooOOOO;
                    int[] iArr2 = this.f61463OooOO0O;
                    c21189OooO0O05.getClass();
                    if (iArr2.length != 0) {
                        int[] iArr3 = c21189OooO0O05.f61463OooOO0O;
                        if (iArr3.length != 0) {
                            int length2 = iArr3.length;
                            int length3 = iArr2.length;
                            int[] iArrCopyOf2 = Arrays.copyOf(iArr3, length2 + length3);
                            System.arraycopy(iArr2, 0, iArrCopyOf2, length2, length3);
                            kotlin.jvm.internal.OooOOO0.OooO0Oo(iArrCopyOf2);
                            iArr2 = iArrCopyOf2;
                        }
                        c21189OooO0O05.f61463OooOO0O = iArr2;
                    }
                }
                this.f61465OooOOO0 = true;
                if (!this.f61467OooOOOo) {
                    this.f61467OooOOOo = true;
                    this.f61466OooOOOO.OooOO0o();
                }
                return AbstractC21195OooO0oo.OooO0O0.f61477OooO00o;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
