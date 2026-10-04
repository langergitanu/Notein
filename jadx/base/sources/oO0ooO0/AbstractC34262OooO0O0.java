package oO0ooO0;

import java.math.BigInteger;
import java.security.SecureRandom;
import oO0ooO0.AbstractC34264OooO0OO;
import oO0ooO0.AbstractC34265OooO0Oo;
import oO0ooO0O.InterfaceC34269OooO00o;
import oOO000oO.C34333OooO0O0;

/* JADX INFO: renamed from: oO0ooO0.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC34262OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final InterfaceC34269OooO00o f123010OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public AbstractC34264OooO0OO f123011OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public AbstractC34264OooO0OO f123012OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f123013OooO0Oo = 0;

    /* JADX INFO: renamed from: oO0ooO0.OooO0O0$OooO00o */
    public static abstract class OooO00o extends AbstractC34262OooO0O0 {
        @Override // oO0ooO0.AbstractC34262OooO0O0
        public final AbstractC34265OooO0Oo OooO00o(BigInteger bigInteger, BigInteger bigInteger2) {
            AbstractC34264OooO0OO abstractC34264OooO0OOOooO0Oo = OooO0Oo(bigInteger);
            AbstractC34264OooO0OO abstractC34264OooO0OOOooO0Oo2 = OooO0Oo(bigInteger2);
            int i = this.f123013OooO0Oo;
            if (i == 5 || i == 6) {
                if (!abstractC34264OooO0OOOooO0Oo.OooO0oO()) {
                    abstractC34264OooO0OOOooO0Oo2 = ((AbstractC34264OooO0OO.C20346OooO0OO) abstractC34264OooO0OOOooO0Oo2).OooO0oo(abstractC34264OooO0OOOooO0Oo.OooO0o0()).OooO00o(abstractC34264OooO0OOOooO0Oo);
                } else if (!abstractC34264OooO0OOOooO0Oo2.OooO().equals(this.f123012OooO0OO)) {
                    throw new IllegalArgumentException();
                }
            }
            return new AbstractC34265OooO0Oo.OooO0OO((OooO0OO) this, abstractC34264OooO0OOOooO0Oo, abstractC34264OooO0OOOooO0Oo2);
        }

        @Override // oO0ooO0.AbstractC34262OooO0O0
        public final AbstractC34264OooO0OO OooO0oO(SecureRandom secureRandom) {
            BigInteger bigIntegerOooO00o;
            BigInteger bigIntegerOooO00o2;
            int i = ((OooO0OO) this).f123016OooO0o0;
            do {
                bigIntegerOooO00o = C34333OooO0O0.OooO00o(i, secureRandom);
            } while (bigIntegerOooO00o.signum() <= 0);
            AbstractC34264OooO0OO abstractC34264OooO0OOOooO0Oo = OooO0Oo(bigIntegerOooO00o);
            do {
                bigIntegerOooO00o2 = C34333OooO0O0.OooO00o(i, secureRandom);
            } while (bigIntegerOooO00o2.signum() <= 0);
            return abstractC34264OooO0OOOooO0Oo.OooO0oo(OooO0Oo(bigIntegerOooO00o2));
        }
    }

    /* JADX INFO: renamed from: oO0ooO0.OooO0O0$OooO0O0, reason: collision with other inner class name */
    public static abstract class AbstractC20345OooO0O0 extends AbstractC34262OooO0O0 {
        @Override // oO0ooO0.AbstractC34262OooO0O0
        public final AbstractC34264OooO0OO OooO0oO(SecureRandom secureRandom) {
            BigInteger bigIntegerOooO00o;
            BigInteger bigIntegerOooO00o2 = this.f123010OooO00o.OooO00o();
            while (true) {
                bigIntegerOooO00o = C34333OooO0O0.OooO00o(bigIntegerOooO00o2.bitLength(), secureRandom);
                if (bigIntegerOooO00o.signum() > 0 && bigIntegerOooO00o.compareTo(bigIntegerOooO00o2) < 0) {
                    break;
                }
            }
            AbstractC34264OooO0OO abstractC34264OooO0OOOooO0Oo = OooO0Oo(bigIntegerOooO00o);
            while (true) {
                BigInteger bigIntegerOooO00o3 = C34333OooO0O0.OooO00o(bigIntegerOooO00o2.bitLength(), secureRandom);
                if (bigIntegerOooO00o3.signum() > 0 && bigIntegerOooO00o3.compareTo(bigIntegerOooO00o2) < 0) {
                    return abstractC34264OooO0OOOooO0Oo.OooO0oo(OooO0Oo(bigIntegerOooO00o3));
                }
            }
        }
    }

    /* JADX INFO: renamed from: oO0ooO0.OooO0O0$OooO0OO */
    public static class OooO0OO extends OooO00o {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public AbstractC34265OooO0Oo.OooO0OO f123014OooO;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f123015OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f123016OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public int f123017OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public int f123018OooO0oo;

        @Override // oO0ooO0.AbstractC34262OooO0O0
        public final AbstractC34265OooO0Oo OooO0O0(AbstractC34264OooO0OO abstractC34264OooO0OO, AbstractC34264OooO0OO abstractC34264OooO0OO2) {
            return new AbstractC34265OooO0Oo.OooO0OO(this, abstractC34264OooO0OO, abstractC34264OooO0OO2);
        }

        @Override // oO0ooO0.AbstractC34262OooO0O0
        public final AbstractC34264OooO0OO OooO0Oo(BigInteger bigInteger) {
            int i;
            AbstractC34264OooO0OO.C20346OooO0OO c20346OooO0OO = new AbstractC34264OooO0OO.C20346OooO0OO();
            if (bigInteger != null && bigInteger.signum() >= 0) {
                int iBitLength = bigInteger.bitLength();
                int i2 = this.f123016OooO0o0;
                if (iBitLength <= i2) {
                    int i3 = this.f123015OooO0o;
                    int i4 = this.f123017OooO0oO;
                    int i5 = this.f123018OooO0oo;
                    if (i4 == 0 && i5 == 0) {
                        c20346OooO0OO.f123022OooO0OO = 2;
                        c20346OooO0OO.f123025OooO0o0 = new int[]{i3};
                    } else {
                        if (i4 >= i5) {
                            throw new IllegalArgumentException("k2 must be smaller than k3");
                        }
                        if (i4 <= 0) {
                            throw new IllegalArgumentException("k2 must be larger than 0");
                        }
                        c20346OooO0OO.f123022OooO0OO = 3;
                        c20346OooO0OO.f123025OooO0o0 = new int[]{i3, i4, i5};
                    }
                    c20346OooO0OO.f123023OooO0Oo = i2;
                    C34266OooO0o0 c34266OooO0o0 = new C34266OooO0o0();
                    if (bigInteger.signum() < 0) {
                        throw new IllegalArgumentException("invalid F2m field value");
                    }
                    if (bigInteger.signum() == 0) {
                        c34266OooO0o0.f123036OooOo0o = new long[]{0};
                    } else {
                        byte[] byteArray = bigInteger.toByteArray();
                        int length = byteArray.length;
                        if (byteArray[0] == 0) {
                            length--;
                            i = 1;
                        } else {
                            i = 0;
                        }
                        int i6 = (length + 7) / 8;
                        c34266OooO0o0.f123036OooOo0o = new long[i6];
                        int i7 = i6 - 1;
                        int i8 = (length % 8) + i;
                        if (i < i8) {
                            long j = 0;
                            while (i < i8) {
                                j = (j << 8) | ((long) (byteArray[i] & 255));
                                i++;
                            }
                            c34266OooO0o0.f123036OooOo0o[i7] = j;
                            i7 = i6 - 2;
                        }
                        while (i7 >= 0) {
                            int i9 = 0;
                            long j2 = 0;
                            while (i9 < 8) {
                                j2 = (j2 << 8) | ((long) (byteArray[i] & 255));
                                i9++;
                                i++;
                            }
                            c34266OooO0o0.f123036OooOo0o[i7] = j2;
                            i7--;
                        }
                    }
                    c20346OooO0OO.f123024OooO0o = c34266OooO0o0;
                    return c20346OooO0OO;
                }
            }
            throw new IllegalArgumentException("x value invalid in F2m field element");
        }

        @Override // oO0ooO0.AbstractC34262OooO0O0
        public final AbstractC34265OooO0Oo OooO0o0() {
            return this.f123014OooO;
        }
    }

    /* JADX INFO: renamed from: oO0ooO0.OooO0O0$OooO0Oo, reason: case insensitive filesystem */
    public static class C34263OooO0Oo extends AbstractC20345OooO0O0 {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public BigInteger f123019OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public BigInteger f123020OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public AbstractC34265OooO0Oo.C20347OooO0Oo f123021OooO0oO;

        @Override // oO0ooO0.AbstractC34262OooO0O0
        public final AbstractC34265OooO0Oo OooO0O0(AbstractC34264OooO0OO abstractC34264OooO0OO, AbstractC34264OooO0OO abstractC34264OooO0OO2) {
            return new AbstractC34265OooO0Oo.C20347OooO0Oo(this, abstractC34264OooO0OO, abstractC34264OooO0OO2);
        }

        @Override // oO0ooO0.AbstractC34262OooO0O0
        public final AbstractC34264OooO0OO OooO0Oo(BigInteger bigInteger) {
            return new AbstractC34264OooO0OO.OooO0Oo(this.f123020OooO0o0, this.f123019OooO0o, bigInteger);
        }

        @Override // oO0ooO0.AbstractC34262OooO0O0
        public final AbstractC34265OooO0Oo OooO0o(AbstractC34265OooO0Oo abstractC34265OooO0Oo) {
            int i;
            return (this == abstractC34265OooO0Oo.f123030OooO00o || this.f123013OooO0Oo != 2 || abstractC34265OooO0Oo.OooO0OO() || !((i = abstractC34265OooO0Oo.f123030OooO00o.f123013OooO0Oo) == 2 || i == 3 || i == 4)) ? super.OooO0o(abstractC34265OooO0Oo) : new AbstractC34265OooO0Oo.C20347OooO0Oo(this, OooO0Oo(abstractC34265OooO0Oo.f123031OooO0O0.OooOO0()), OooO0Oo(abstractC34265OooO0Oo.f123032OooO0OO.OooOO0()), new AbstractC34264OooO0OO[]{OooO0Oo(abstractC34265OooO0Oo.f123033OooO0Oo[0].OooOO0())});
        }

        @Override // oO0ooO0.AbstractC34262OooO0O0
        public final AbstractC34265OooO0Oo OooO0o0() {
            return this.f123021OooO0oO;
        }
    }

    public AbstractC34262OooO0O0(InterfaceC34269OooO00o interfaceC34269OooO00o) {
        this.f123010OooO00o = interfaceC34269OooO00o;
    }

    public AbstractC34265OooO0Oo OooO00o(BigInteger bigInteger, BigInteger bigInteger2) {
        return OooO0O0(OooO0Oo(bigInteger), OooO0Oo(bigInteger2));
    }

    public abstract AbstractC34265OooO0Oo OooO0O0(AbstractC34264OooO0OO abstractC34264OooO0OO, AbstractC34264OooO0OO abstractC34264OooO0OO2);

    public final boolean OooO0OO(AbstractC34262OooO0O0 abstractC34262OooO0O0) {
        if (this == abstractC34262OooO0O0) {
            return true;
        }
        if (abstractC34262OooO0O0 != null) {
            return this.f123010OooO00o.equals(abstractC34262OooO0O0.f123010OooO00o) && this.f123011OooO0O0.OooOO0().equals(abstractC34262OooO0O0.f123011OooO0O0.OooOO0()) && this.f123012OooO0OO.OooOO0().equals(abstractC34262OooO0O0.f123012OooO0OO.OooOO0());
        }
        return false;
    }

    public abstract AbstractC34264OooO0OO OooO0Oo(BigInteger bigInteger);

    public AbstractC34265OooO0Oo OooO0o(AbstractC34265OooO0Oo abstractC34265OooO0Oo) {
        if (this == abstractC34265OooO0Oo.f123030OooO00o) {
            return abstractC34265OooO0Oo;
        }
        if (abstractC34265OooO0Oo.OooO0OO()) {
            return OooO0o0();
        }
        AbstractC34265OooO0Oo abstractC34265OooO0OoOooO0Oo = abstractC34265OooO0Oo.OooO0Oo();
        return OooO00o(abstractC34265OooO0OoOooO0Oo.f123031OooO0O0.OooOO0(), abstractC34265OooO0OoOooO0Oo.OooO00o().OooOO0());
    }

    public abstract AbstractC34265OooO0Oo OooO0o0();

    public abstract AbstractC34264OooO0OO OooO0oO(SecureRandom secureRandom);

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof AbstractC34262OooO0O0) && OooO0OO((AbstractC34262OooO0O0) obj);
        }
        return true;
    }

    public final int hashCode() {
        return (this.f123010OooO00o.hashCode() ^ Integer.rotateLeft(this.f123011OooO0O0.OooOO0().hashCode(), 8)) ^ Integer.rotateLeft(this.f123012OooO0OO.OooOO0().hashCode(), 16);
    }
}
