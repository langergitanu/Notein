package oO0ooO0;

import java.security.SecureRandom;
import oO0oOoOo.C34199OooO0O0;

/* JADX INFO: renamed from: oO0ooO0.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC34265OooO0Oo {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final AbstractC34264OooO0OO[] f123029OooO0o0 = new AbstractC34264OooO0OO[0];

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final AbstractC34262OooO0O0 f123030OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final AbstractC34264OooO0OO f123031OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final AbstractC34264OooO0OO f123032OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final AbstractC34264OooO0OO[] f123033OooO0Oo;

    /* JADX INFO: renamed from: oO0ooO0.OooO0Oo$OooO00o */
    public static abstract class OooO00o extends AbstractC34265OooO0Oo {
    }

    /* JADX INFO: renamed from: oO0ooO0.OooO0Oo$OooO0O0 */
    public static abstract class OooO0O0 extends AbstractC34265OooO0Oo {
    }

    /* JADX INFO: renamed from: oO0ooO0.OooO0Oo$OooO0OO */
    public static class OooO0OO extends OooO00o {
        @Override // oO0ooO0.AbstractC34265OooO0Oo
        public final AbstractC34264OooO0OO OooO00o() {
            AbstractC34262OooO0O0 abstractC34262OooO0O0 = this.f123030OooO00o;
            int i = abstractC34262OooO0O0 == null ? 0 : abstractC34262OooO0O0.f123013OooO0Oo;
            AbstractC34264OooO0OO abstractC34264OooO0OOOooO0oo = this.f123032OooO0OO;
            if ((i == 5 || i == 6) && !OooO0OO()) {
                AbstractC34264OooO0OO abstractC34264OooO0OO = this.f123031OooO0O0;
                if (!abstractC34264OooO0OO.OooO0oO()) {
                    abstractC34264OooO0OOOooO0oo = abstractC34264OooO0OOOooO0oo.OooO00o(abstractC34264OooO0OO).OooO0oo(abstractC34264OooO0OO);
                    if (6 == i) {
                        AbstractC34264OooO0OO abstractC34264OooO0OO2 = this.f123033OooO0Oo[0];
                        if (!abstractC34264OooO0OO2.OooO0o()) {
                            return abstractC34264OooO0OOOooO0oo.OooO0OO(abstractC34264OooO0OO2);
                        }
                    }
                }
            }
            return abstractC34264OooO0OOOooO0oo;
        }
    }

    /* JADX INFO: renamed from: oO0ooO0.OooO0Oo$OooO0Oo, reason: collision with other inner class name */
    public static class C20347OooO0Oo extends OooO0O0 {
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AbstractC34265OooO0Oo(AbstractC34262OooO0O0 abstractC34262OooO0O0, AbstractC34264OooO0OO abstractC34264OooO0OO, AbstractC34264OooO0OO abstractC34264OooO0OO2) {
        AbstractC34264OooO0OO[] abstractC34264OooO0OOArr;
        int i = abstractC34262OooO0O0.f123013OooO0Oo;
        if (i == 0 || i == 5) {
            abstractC34264OooO0OOArr = f123029OooO0o0;
        } else {
            AbstractC34264OooO0OO abstractC34264OooO0OOOooO0Oo = abstractC34262OooO0O0.OooO0Oo(InterfaceC34261OooO00o.f123009OooO0O0);
            if (i == 1 || i == 2) {
                abstractC34264OooO0OOArr = new AbstractC34264OooO0OO[]{abstractC34264OooO0OOOooO0Oo};
            } else if (i == 3) {
                abstractC34264OooO0OOArr = new AbstractC34264OooO0OO[]{abstractC34264OooO0OOOooO0Oo, abstractC34264OooO0OOOooO0Oo, abstractC34264OooO0OOOooO0Oo};
            } else if (i != 4) {
                if (i != 6) {
                    throw new IllegalArgumentException("unknown coordinate system");
                }
                abstractC34264OooO0OOArr = new AbstractC34264OooO0OO[]{abstractC34264OooO0OOOooO0Oo};
            } else {
                abstractC34264OooO0OOArr = new AbstractC34264OooO0OO[]{abstractC34264OooO0OOOooO0Oo, abstractC34262OooO0O0.f123011OooO0O0};
            }
        }
        this(abstractC34262OooO0O0, abstractC34264OooO0OO, abstractC34264OooO0OO2, abstractC34264OooO0OOArr);
    }

    public AbstractC34264OooO0OO OooO00o() {
        return this.f123032OooO0OO;
    }

    public AbstractC34264OooO0OO OooO0O0() {
        AbstractC34264OooO0OO[] abstractC34264OooO0OOArr = this.f123033OooO0Oo;
        if (abstractC34264OooO0OOArr.length <= 0) {
            return null;
        }
        return abstractC34264OooO0OOArr[0];
    }

    public final boolean OooO0OO() {
        if (this.f123031OooO0O0 == null || this.f123032OooO0OO == null) {
            return true;
        }
        AbstractC34264OooO0OO[] abstractC34264OooO0OOArr = this.f123033OooO0Oo;
        return abstractC34264OooO0OOArr.length > 0 && abstractC34264OooO0OOArr[0].OooO0oO();
    }

    public final AbstractC34265OooO0Oo OooO0Oo() {
        SecureRandom secureRandom;
        if (!OooO0OO()) {
            AbstractC34262OooO0O0 abstractC34262OooO0O0 = this.f123030OooO00o;
            int i = abstractC34262OooO0O0 == null ? 0 : abstractC34262OooO0O0.f123013OooO0Oo;
            if (i != 0 && i != 5) {
                AbstractC34264OooO0OO abstractC34264OooO0OOOooO0O0 = OooO0O0();
                if (!abstractC34264OooO0OOOooO0O0.OooO0o()) {
                    if (this.f123030OooO00o == null) {
                        throw new IllegalStateException("Detached points must be in affine coordinates");
                    }
                    Object obj = C34199OooO0O0.f122854OooO0OO;
                    synchronized (obj) {
                        try {
                            secureRandom = C34199OooO0O0.f122855OooO0Oo;
                            if (secureRandom == null) {
                                SecureRandom secureRandom2 = new SecureRandom();
                                synchronized (obj) {
                                    try {
                                        if (C34199OooO0O0.f122855OooO0Oo == null) {
                                            C34199OooO0O0.f122855OooO0Oo = secureRandom2;
                                        }
                                        secureRandom = C34199OooO0O0.f122855OooO0Oo;
                                    } finally {
                                    }
                                }
                            }
                        } finally {
                        }
                    }
                    AbstractC34264OooO0OO abstractC34264OooO0OOOooO0oO = this.f123030OooO00o.OooO0oO(secureRandom);
                    return OooO0o0(abstractC34264OooO0OOOooO0O0.OooO0oo(abstractC34264OooO0OOOooO0oO).OooO0o0().OooO0oo(abstractC34264OooO0OOOooO0oO));
                }
            }
        }
        return this;
    }

    public final AbstractC34265OooO0Oo OooO0o0(AbstractC34264OooO0OO abstractC34264OooO0OO) {
        AbstractC34264OooO0OO abstractC34264OooO0OOOooO0oo;
        AbstractC34262OooO0O0 abstractC34262OooO0O0 = this.f123030OooO00o;
        int i = abstractC34262OooO0O0 == null ? 0 : abstractC34262OooO0O0.f123013OooO0Oo;
        if (i == 1) {
            abstractC34264OooO0OOOooO0oo = this.f123031OooO0O0.OooO0oo(abstractC34264OooO0OO);
        } else if (i == 2 || i == 3 || i == 4) {
            AbstractC34264OooO0OO abstractC34264OooO0OOOooO = abstractC34264OooO0OO.OooO();
            abstractC34264OooO0OO = abstractC34264OooO0OOOooO.OooO0oo(abstractC34264OooO0OO);
            abstractC34264OooO0OOOooO0oo = this.f123031OooO0O0.OooO0oo(abstractC34264OooO0OOOooO);
        } else {
            if (i != 6) {
                throw new IllegalStateException("not a projective coordinate system");
            }
            abstractC34264OooO0OOOooO0oo = this.f123031OooO0O0.OooO0oo(abstractC34264OooO0OO);
        }
        return this.f123030OooO00o.OooO0O0(abstractC34264OooO0OOOooO0oo, this.f123032OooO0OO.OooO0oo(abstractC34264OooO0OO));
    }

    public final boolean equals(Object obj) {
        AbstractC34265OooO0Oo abstractC34265OooO0OoOooO0Oo;
        AbstractC34265OooO0Oo abstractC34265OooO0OoOooO0Oo2;
        if (obj != this) {
            if ((obj instanceof AbstractC34265OooO0Oo) && (abstractC34265OooO0OoOooO0Oo = (AbstractC34265OooO0Oo) obj) != null) {
                AbstractC34262OooO0O0 abstractC34262OooO0O0 = this.f123030OooO00o;
                boolean z = abstractC34262OooO0O0 == null;
                AbstractC34262OooO0O0 abstractC34262OooO0O02 = abstractC34265OooO0OoOooO0Oo.f123030OooO00o;
                boolean z2 = abstractC34262OooO0O02 == null;
                boolean zOooO0OO = OooO0OO();
                boolean zOooO0OO2 = abstractC34265OooO0OoOooO0Oo.OooO0OO();
                if (!zOooO0OO && !zOooO0OO2) {
                    if (!z || !z2) {
                        if (z) {
                            abstractC34265OooO0OoOooO0Oo = abstractC34265OooO0OoOooO0Oo.OooO0Oo();
                        } else {
                            if (z2) {
                                abstractC34265OooO0OoOooO0Oo2 = OooO0Oo();
                            } else if (abstractC34262OooO0O0.OooO0OO(abstractC34262OooO0O02)) {
                                AbstractC34265OooO0Oo[] abstractC34265OooO0OoArr = new AbstractC34265OooO0Oo[2];
                                abstractC34265OooO0OoArr[0] = this;
                                abstractC34265OooO0OoArr[1] = abstractC34262OooO0O0.OooO0o(abstractC34265OooO0OoOooO0Oo);
                                for (int i = 0; i < 2; i++) {
                                    AbstractC34265OooO0Oo abstractC34265OooO0Oo = abstractC34265OooO0OoArr[i];
                                    if (abstractC34265OooO0Oo != null && abstractC34262OooO0O0 != abstractC34265OooO0Oo.f123030OooO00o) {
                                        throw new IllegalArgumentException("'points' entries must be null or on this curve");
                                    }
                                }
                                int i2 = abstractC34262OooO0O0.f123013OooO0Oo;
                                if (i2 != 0 && i2 != 5) {
                                    AbstractC34264OooO0OO[] abstractC34264OooO0OOArr = new AbstractC34264OooO0OO[2];
                                    int[] iArr = new int[2];
                                    int i3 = 0;
                                    for (int i4 = 0; i4 < 2; i4++) {
                                        AbstractC34265OooO0Oo abstractC34265OooO0Oo2 = abstractC34265OooO0OoArr[i4];
                                        if (abstractC34265OooO0Oo2 != null) {
                                            AbstractC34262OooO0O0 abstractC34262OooO0O03 = abstractC34265OooO0Oo2.f123030OooO00o;
                                            int i5 = abstractC34262OooO0O03 == null ? 0 : abstractC34262OooO0O03.f123013OooO0Oo;
                                            if (i5 != 0 && i5 != 5 && !abstractC34265OooO0Oo2.OooO0OO() && !abstractC34265OooO0Oo2.f123033OooO0Oo[0].OooO0o()) {
                                                abstractC34264OooO0OOArr[i3] = abstractC34265OooO0Oo2.OooO0O0();
                                                iArr[i3] = i4;
                                                i3++;
                                            }
                                        }
                                    }
                                    if (i3 != 0) {
                                        AbstractC34264OooO0OO[] abstractC34264OooO0OOArr2 = new AbstractC34264OooO0OO[i3];
                                        abstractC34264OooO0OOArr2[0] = abstractC34264OooO0OOArr[0];
                                        int i6 = 0;
                                        while (true) {
                                            int i7 = i6 + 1;
                                            if (i7 >= i3) {
                                                break;
                                            }
                                            abstractC34264OooO0OOArr2[i7] = abstractC34264OooO0OOArr2[i6].OooO0oo(abstractC34264OooO0OOArr[i7]);
                                            i6 = i7;
                                        }
                                        AbstractC34264OooO0OO abstractC34264OooO0OOOooO0o0 = abstractC34264OooO0OOArr2[i6].OooO0o0();
                                        while (i6 > 0) {
                                            int i8 = i6 - 1;
                                            AbstractC34264OooO0OO abstractC34264OooO0OO = abstractC34264OooO0OOArr[i6];
                                            abstractC34264OooO0OOArr[i6] = abstractC34264OooO0OOArr2[i8].OooO0oo(abstractC34264OooO0OOOooO0o0);
                                            abstractC34264OooO0OOOooO0o0 = abstractC34264OooO0OOOooO0o0.OooO0oo(abstractC34264OooO0OO);
                                            i6 = i8;
                                        }
                                        abstractC34264OooO0OOArr[0] = abstractC34264OooO0OOOooO0o0;
                                        for (int i9 = 0; i9 < i3; i9++) {
                                            int i10 = iArr[i9];
                                            abstractC34265OooO0OoArr[i10] = abstractC34265OooO0OoArr[i10].OooO0o0(abstractC34264OooO0OOArr[i9]);
                                        }
                                    }
                                }
                                abstractC34265OooO0OoOooO0Oo2 = abstractC34265OooO0OoArr[0];
                                abstractC34265OooO0OoOooO0Oo = abstractC34265OooO0OoArr[1];
                            }
                            if (abstractC34265OooO0OoOooO0Oo2.f123031OooO0O0.equals(abstractC34265OooO0OoOooO0Oo.f123031OooO0O0) || !abstractC34265OooO0OoOooO0Oo2.OooO00o().equals(abstractC34265OooO0OoOooO0Oo.OooO00o())) {
                            }
                        }
                    }
                    abstractC34265OooO0OoOooO0Oo2 = this;
                    if (abstractC34265OooO0OoOooO0Oo2.f123031OooO0O0.equals(abstractC34265OooO0OoOooO0Oo.f123031OooO0O0)) {
                    }
                } else if (!zOooO0OO || !zOooO0OO2 || (!z && !z2 && !abstractC34262OooO0O0.OooO0OO(abstractC34262OooO0O02))) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        AbstractC34262OooO0O0 abstractC34262OooO0O0 = this.f123030OooO00o;
        int i = abstractC34262OooO0O0 == null ? 0 : ~abstractC34262OooO0O0.hashCode();
        if (OooO0OO()) {
            return i;
        }
        AbstractC34265OooO0Oo abstractC34265OooO0OoOooO0Oo = OooO0Oo();
        return (i ^ (abstractC34265OooO0OoOooO0Oo.f123031OooO0O0.hashCode() * 17)) ^ (abstractC34265OooO0OoOooO0Oo.OooO00o().hashCode() * 257);
    }

    public final String toString() {
        if (OooO0OO()) {
            return "INF";
        }
        StringBuffer stringBuffer = new StringBuffer("(");
        stringBuffer.append(this.f123031OooO0O0);
        stringBuffer.append(',');
        stringBuffer.append(this.f123032OooO0OO);
        int i = 0;
        while (true) {
            AbstractC34264OooO0OO[] abstractC34264OooO0OOArr = this.f123033OooO0Oo;
            if (i >= abstractC34264OooO0OOArr.length) {
                stringBuffer.append(')');
                return stringBuffer.toString();
            }
            stringBuffer.append(',');
            stringBuffer.append(abstractC34264OooO0OOArr[i]);
            i++;
        }
    }

    public AbstractC34265OooO0Oo(AbstractC34262OooO0O0 abstractC34262OooO0O0, AbstractC34264OooO0OO abstractC34264OooO0OO, AbstractC34264OooO0OO abstractC34264OooO0OO2, AbstractC34264OooO0OO[] abstractC34264OooO0OOArr) {
        this.f123030OooO00o = abstractC34262OooO0O0;
        this.f123031OooO0O0 = abstractC34264OooO0OO;
        this.f123032OooO0OO = abstractC34264OooO0OO2;
        this.f123033OooO0Oo = abstractC34264OooO0OOArr;
    }
}
