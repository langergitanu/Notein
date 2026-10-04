package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooOO0 f64436OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f64437OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f64438OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f64439OooO0Oo = 0;

    public OooOO0O(OooOO0 oooOO02) {
        C21805OooOoO.OooO00o(oooOO02, "input");
        this.f64436OooO00o = oooOO02;
        oooOO02.f64420OooO0Oo = this;
    }

    public static void OooOoO(int i) throws IOException {
        if ((i & 7) != 0) {
            throw new C21807OooOoOO("Failed to parse the message.");
        }
    }

    public static void OooOoO0(int i) throws IOException {
        if ((i & 3) != 0) {
            throw new C21807OooOoOO("Failed to parse the message.");
        }
    }

    public final Object OooO(EnumC21841o00oO0o enumC21841o00oO0o, Class<?> cls, C21796OooOOOo c21796OooOOOo) throws IOException {
        int iOrdinal = enumC21841o00oO0o.ordinal();
        OooOO0 oooOO02 = this.f64436OooO00o;
        switch (iOrdinal) {
            case 0:
                OooOo0o(1);
                return Double.valueOf(oooOO02.OooO0oo());
            case 1:
                OooOo0o(5);
                return Float.valueOf(oooOO02.OooOO0o());
            case 2:
                OooOo0o(0);
                return Long.valueOf(oooOO02.OooOOO());
            case 3:
                OooOo0o(0);
                return Long.valueOf(oooOO02.OooOo0o());
            case 4:
                OooOo0o(0);
                return Integer.valueOf(oooOO02.OooOOO0());
            case 5:
                OooOo0o(1);
                return Long.valueOf(oooOO02.OooOO0O());
            case 6:
                OooOo0o(5);
                return Integer.valueOf(oooOO02.OooOO0());
            case 7:
                OooOo0o(0);
                return Boolean.valueOf(oooOO02.OooO0o());
            case 8:
                OooOo0o(2);
                return oooOO02.OooOo00();
            case 9:
            default:
                throw new IllegalArgumentException("unsupported field type.");
            case 10:
                OooOo0o(2);
                InterfaceC21836Oooooo interfaceC21836OoooooOooO00o = C21834OooooOO.f64546OooO0OO.OooO00o(cls);
                Object objNewInstance = interfaceC21836OoooooOooO00o.newInstance();
                OooO0OO(objNewInstance, interfaceC21836OoooooOooO00o, c21796OooOOOo);
                interfaceC21836OoooooOooO00o.makeImmutable(objNewInstance);
                return objNewInstance;
            case 11:
                return OooO0o0();
            case 12:
                OooOo0o(0);
                return Integer.valueOf(oooOO02.OooOo0O());
            case 13:
                OooOo0o(0);
                return Integer.valueOf(oooOO02.OooO());
            case 14:
                OooOo0o(5);
                return Integer.valueOf(oooOO02.OooOOOO());
            case 15:
                OooOo0o(1);
                return Long.valueOf(oooOO02.OooOOOo());
            case 16:
                OooOo0o(0);
                return Integer.valueOf(oooOO02.OooOOo0());
            case 17:
                OooOo0o(0);
                return Long.valueOf(oooOO02.OooOOo());
        }
    }

    public final int OooO00o() throws IOException {
        int i = this.f64439OooO0Oo;
        if (i != 0) {
            this.f64437OooO0O0 = i;
            this.f64439OooO0Oo = 0;
        } else {
            this.f64437OooO0O0 = this.f64436OooO00o.OooOo0();
        }
        int i2 = this.f64437OooO0O0;
        if (i2 == 0 || i2 == this.f64438OooO0OO) {
            return Integer.MAX_VALUE;
        }
        return i2 >>> 3;
    }

    public final <T> void OooO0O0(T t, InterfaceC21836Oooooo<T> interfaceC21836Oooooo, C21796OooOOOo c21796OooOOOo) throws IOException {
        int i = this.f64438OooO0OO;
        this.f64438OooO0OO = ((this.f64437OooO0O0 >>> 3) << 3) | 4;
        try {
            interfaceC21836Oooooo.OooO0O0(t, this, c21796OooOOOo);
            if (this.f64437OooO0O0 == this.f64438OooO0OO) {
            } else {
                throw new C21807OooOoOO("Failed to parse the message.");
            }
        } finally {
            this.f64438OooO0OO = i;
        }
    }

    public final <T> void OooO0OO(T t, InterfaceC21836Oooooo<T> interfaceC21836Oooooo, C21796OooOOOo c21796OooOOOo) throws IOException {
        OooOO0 oooOO02 = this.f64436OooO00o;
        int iOooOo0O = oooOO02.OooOo0O();
        if (oooOO02.f64417OooO00o >= oooOO02.f64418OooO0O0) {
            throw new C21807OooOoOO("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iOooO0o0 = oooOO02.OooO0o0(iOooOo0O);
        oooOO02.f64417OooO00o++;
        interfaceC21836Oooooo.OooO0O0(t, this, c21796OooOOOo);
        oooOO02.OooO00o(0);
        oooOO02.f64417OooO00o--;
        oooOO02.OooO0Oo(iOooO0o0);
    }

    public final void OooO0Oo(List<Boolean> list) throws IOException {
        int iOooOo0;
        int iOooOo02;
        boolean z = list instanceof OooO0o;
        OooOO0 oooOO02 = this.f64436OooO00o;
        if (!z) {
            int i = this.f64437OooO0O0 & 7;
            if (i == 0) {
                do {
                    list.add(Boolean.valueOf(oooOO02.OooO0o()));
                    if (oooOO02.OooO0OO()) {
                        return;
                    } else {
                        iOooOo0 = oooOO02.OooOo0();
                    }
                } while (iOooOo0 == this.f64437OooO0O0);
                this.f64439OooO0Oo = iOooOo0;
                return;
            }
            if (i != 2) {
                throw C21807OooOoOO.OooO0O0();
            }
            int iOooO0O0 = oooOO02.OooO0O0() + oooOO02.OooOo0O();
            do {
                list.add(Boolean.valueOf(oooOO02.OooO0o()));
            } while (oooOO02.OooO0O0() < iOooO0O0);
            OooOo0O(iOooO0O0);
            return;
        }
        OooO0o oooO0o = (OooO0o) list;
        int i2 = this.f64437OooO0O0 & 7;
        if (i2 == 0) {
            do {
                oooO0o.addBoolean(oooOO02.OooO0o());
                if (oooOO02.OooO0OO()) {
                    return;
                } else {
                    iOooOo02 = oooOO02.OooOo0();
                }
            } while (iOooOo02 == this.f64437OooO0O0);
            this.f64439OooO0Oo = iOooOo02;
            return;
        }
        if (i2 != 2) {
            throw C21807OooOoOO.OooO0O0();
        }
        int iOooO0O02 = oooOO02.OooO0O0() + oooOO02.OooOo0O();
        do {
            oooO0o.addBoolean(oooOO02.OooO0o());
        } while (oooOO02.OooO0O0() < iOooO0O02);
        OooOo0O(iOooO0O02);
    }

    public final void OooO0o(List<OooO> list) throws IOException {
        int iOooOo0;
        if ((this.f64437OooO0O0 & 7) != 2) {
            throw C21807OooOoOO.OooO0O0();
        }
        do {
            list.add(OooO0o0());
            OooOO0 oooOO02 = this.f64436OooO00o;
            if (oooOO02.OooO0OO()) {
                return;
            } else {
                iOooOo0 = oooOO02.OooOo0();
            }
        } while (iOooOo0 == this.f64437OooO0O0);
        this.f64439OooO0Oo = iOooOo0;
    }

    public final OooO OooO0o0() throws IOException {
        OooOo0o(2);
        return this.f64436OooO00o.OooO0oO();
    }

    public final void OooO0oO(List<Double> list) throws IOException {
        int iOooOo0;
        int iOooOo02;
        boolean z = list instanceof OooOOO;
        OooOO0 oooOO02 = this.f64436OooO00o;
        if (!z) {
            int i = this.f64437OooO0O0 & 7;
            if (i == 1) {
                do {
                    list.add(Double.valueOf(oooOO02.OooO0oo()));
                    if (oooOO02.OooO0OO()) {
                        return;
                    } else {
                        iOooOo0 = oooOO02.OooOo0();
                    }
                } while (iOooOo0 == this.f64437OooO0O0);
                this.f64439OooO0Oo = iOooOo0;
                return;
            }
            if (i != 2) {
                throw C21807OooOoOO.OooO0O0();
            }
            int iOooOo0O = oooOO02.OooOo0O();
            OooOoO(iOooOo0O);
            int iOooO0O0 = oooOO02.OooO0O0() + iOooOo0O;
            do {
                list.add(Double.valueOf(oooOO02.OooO0oo()));
            } while (oooOO02.OooO0O0() < iOooO0O0);
            return;
        }
        OooOOO oooOOO = (OooOOO) list;
        int i2 = this.f64437OooO0O0 & 7;
        if (i2 == 1) {
            do {
                oooOOO.addDouble(oooOO02.OooO0oo());
                if (oooOO02.OooO0OO()) {
                    return;
                } else {
                    iOooOo02 = oooOO02.OooOo0();
                }
            } while (iOooOo02 == this.f64437OooO0O0);
            this.f64439OooO0Oo = iOooOo02;
            return;
        }
        if (i2 != 2) {
            throw C21807OooOoOO.OooO0O0();
        }
        int iOooOo0O2 = oooOO02.OooOo0O();
        OooOoO(iOooOo0O2);
        int iOooO0O02 = oooOO02.OooO0O0() + iOooOo0O2;
        do {
            oooOOO.addDouble(oooOO02.OooO0oo());
        } while (oooOO02.OooO0O0() < iOooO0O02);
    }

    public final void OooO0oo(List<Integer> list) throws IOException {
        int iOooOo0;
        int iOooOo02;
        boolean z = list instanceof C21806OooOoO0;
        OooOO0 oooOO02 = this.f64436OooO00o;
        if (!z) {
            int i = this.f64437OooO0O0 & 7;
            if (i == 0) {
                do {
                    list.add(Integer.valueOf(oooOO02.OooO()));
                    if (oooOO02.OooO0OO()) {
                        return;
                    } else {
                        iOooOo0 = oooOO02.OooOo0();
                    }
                } while (iOooOo0 == this.f64437OooO0O0);
                this.f64439OooO0Oo = iOooOo0;
                return;
            }
            if (i != 2) {
                throw C21807OooOoOO.OooO0O0();
            }
            int iOooO0O0 = oooOO02.OooO0O0() + oooOO02.OooOo0O();
            do {
                list.add(Integer.valueOf(oooOO02.OooO()));
            } while (oooOO02.OooO0O0() < iOooO0O0);
            OooOo0O(iOooO0O0);
            return;
        }
        C21806OooOoO0 c21806OooOoO0 = (C21806OooOoO0) list;
        int i2 = this.f64437OooO0O0 & 7;
        if (i2 == 0) {
            do {
                c21806OooOoO0.addInt(oooOO02.OooO());
                if (oooOO02.OooO0OO()) {
                    return;
                } else {
                    iOooOo02 = oooOO02.OooOo0();
                }
            } while (iOooOo02 == this.f64437OooO0O0);
            this.f64439OooO0Oo = iOooOo02;
            return;
        }
        if (i2 != 2) {
            throw C21807OooOoOO.OooO0O0();
        }
        int iOooO0O02 = oooOO02.OooO0O0() + oooOO02.OooOo0O();
        do {
            c21806OooOoO0.addInt(oooOO02.OooO());
        } while (oooOO02.OooO0O0() < iOooO0O02);
        OooOo0O(iOooO0O02);
    }

    public final void OooOO0(List<Integer> list) throws IOException {
        int iOooOo0;
        int iOooOo02;
        boolean z = list instanceof C21806OooOoO0;
        OooOO0 oooOO02 = this.f64436OooO00o;
        if (!z) {
            int i = this.f64437OooO0O0 & 7;
            if (i == 2) {
                int iOooOo0O = oooOO02.OooOo0O();
                OooOoO0(iOooOo0O);
                int iOooO0O0 = oooOO02.OooO0O0() + iOooOo0O;
                do {
                    list.add(Integer.valueOf(oooOO02.OooOO0()));
                } while (oooOO02.OooO0O0() < iOooO0O0);
                return;
            }
            if (i != 5) {
                throw C21807OooOoOO.OooO0O0();
            }
            do {
                list.add(Integer.valueOf(oooOO02.OooOO0()));
                if (oooOO02.OooO0OO()) {
                    return;
                } else {
                    iOooOo0 = oooOO02.OooOo0();
                }
            } while (iOooOo0 == this.f64437OooO0O0);
            this.f64439OooO0Oo = iOooOo0;
            return;
        }
        C21806OooOoO0 c21806OooOoO0 = (C21806OooOoO0) list;
        int i2 = this.f64437OooO0O0 & 7;
        if (i2 == 2) {
            int iOooOo0O2 = oooOO02.OooOo0O();
            OooOoO0(iOooOo0O2);
            int iOooO0O02 = oooOO02.OooO0O0() + iOooOo0O2;
            do {
                c21806OooOoO0.addInt(oooOO02.OooOO0());
            } while (oooOO02.OooO0O0() < iOooO0O02);
            return;
        }
        if (i2 != 5) {
            throw C21807OooOoOO.OooO0O0();
        }
        do {
            c21806OooOoO0.addInt(oooOO02.OooOO0());
            if (oooOO02.OooO0OO()) {
                return;
            } else {
                iOooOo02 = oooOO02.OooOo0();
            }
        } while (iOooOo02 == this.f64437OooO0O0);
        this.f64439OooO0Oo = iOooOo02;
    }

    public final void OooOO0O(List<Long> list) throws IOException {
        int iOooOo0;
        int iOooOo02;
        boolean z = list instanceof Oooo0;
        OooOO0 oooOO02 = this.f64436OooO00o;
        if (!z) {
            int i = this.f64437OooO0O0 & 7;
            if (i == 1) {
                do {
                    list.add(Long.valueOf(oooOO02.OooOO0O()));
                    if (oooOO02.OooO0OO()) {
                        return;
                    } else {
                        iOooOo0 = oooOO02.OooOo0();
                    }
                } while (iOooOo0 == this.f64437OooO0O0);
                this.f64439OooO0Oo = iOooOo0;
                return;
            }
            if (i != 2) {
                throw C21807OooOoOO.OooO0O0();
            }
            int iOooOo0O = oooOO02.OooOo0O();
            OooOoO(iOooOo0O);
            int iOooO0O0 = oooOO02.OooO0O0() + iOooOo0O;
            do {
                list.add(Long.valueOf(oooOO02.OooOO0O()));
            } while (oooOO02.OooO0O0() < iOooO0O0);
            return;
        }
        Oooo0 oooo0 = (Oooo0) list;
        int i2 = this.f64437OooO0O0 & 7;
        if (i2 == 1) {
            do {
                oooo0.addLong(oooOO02.OooOO0O());
                if (oooOO02.OooO0OO()) {
                    return;
                } else {
                    iOooOo02 = oooOO02.OooOo0();
                }
            } while (iOooOo02 == this.f64437OooO0O0);
            this.f64439OooO0Oo = iOooOo02;
            return;
        }
        if (i2 != 2) {
            throw C21807OooOoOO.OooO0O0();
        }
        int iOooOo0O2 = oooOO02.OooOo0O();
        OooOoO(iOooOo0O2);
        int iOooO0O02 = oooOO02.OooO0O0() + iOooOo0O2;
        do {
            oooo0.addLong(oooOO02.OooOO0O());
        } while (oooOO02.OooO0O0() < iOooO0O02);
    }

    public final void OooOO0o(List<Float> list) throws IOException {
        int iOooOo0;
        int iOooOo02;
        boolean z = list instanceof C21803OooOo0O;
        OooOO0 oooOO02 = this.f64436OooO00o;
        if (!z) {
            int i = this.f64437OooO0O0 & 7;
            if (i == 2) {
                int iOooOo0O = oooOO02.OooOo0O();
                OooOoO0(iOooOo0O);
                int iOooO0O0 = oooOO02.OooO0O0() + iOooOo0O;
                do {
                    list.add(Float.valueOf(oooOO02.OooOO0o()));
                } while (oooOO02.OooO0O0() < iOooO0O0);
                return;
            }
            if (i != 5) {
                throw C21807OooOoOO.OooO0O0();
            }
            do {
                list.add(Float.valueOf(oooOO02.OooOO0o()));
                if (oooOO02.OooO0OO()) {
                    return;
                } else {
                    iOooOo0 = oooOO02.OooOo0();
                }
            } while (iOooOo0 == this.f64437OooO0O0);
            this.f64439OooO0Oo = iOooOo0;
            return;
        }
        C21803OooOo0O c21803OooOo0O = (C21803OooOo0O) list;
        int i2 = this.f64437OooO0O0 & 7;
        if (i2 == 2) {
            int iOooOo0O2 = oooOO02.OooOo0O();
            OooOoO0(iOooOo0O2);
            int iOooO0O02 = oooOO02.OooO0O0() + iOooOo0O2;
            do {
                c21803OooOo0O.addFloat(oooOO02.OooOO0o());
            } while (oooOO02.OooO0O0() < iOooO0O02);
            return;
        }
        if (i2 != 5) {
            throw C21807OooOoOO.OooO0O0();
        }
        do {
            c21803OooOo0O.addFloat(oooOO02.OooOO0o());
            if (oooOO02.OooO0OO()) {
                return;
            } else {
                iOooOo02 = oooOO02.OooOo0();
            }
        } while (iOooOo02 == this.f64437OooO0O0);
        this.f64439OooO0Oo = iOooOo02;
    }

    public final void OooOOO(List<Long> list) throws IOException {
        int iOooOo0;
        int iOooOo02;
        boolean z = list instanceof Oooo0;
        OooOO0 oooOO02 = this.f64436OooO00o;
        if (!z) {
            int i = this.f64437OooO0O0 & 7;
            if (i == 0) {
                do {
                    list.add(Long.valueOf(oooOO02.OooOOO()));
                    if (oooOO02.OooO0OO()) {
                        return;
                    } else {
                        iOooOo0 = oooOO02.OooOo0();
                    }
                } while (iOooOo0 == this.f64437OooO0O0);
                this.f64439OooO0Oo = iOooOo0;
                return;
            }
            if (i != 2) {
                throw C21807OooOoOO.OooO0O0();
            }
            int iOooO0O0 = oooOO02.OooO0O0() + oooOO02.OooOo0O();
            do {
                list.add(Long.valueOf(oooOO02.OooOOO()));
            } while (oooOO02.OooO0O0() < iOooO0O0);
            OooOo0O(iOooO0O0);
            return;
        }
        Oooo0 oooo0 = (Oooo0) list;
        int i2 = this.f64437OooO0O0 & 7;
        if (i2 == 0) {
            do {
                oooo0.addLong(oooOO02.OooOOO());
                if (oooOO02.OooO0OO()) {
                    return;
                } else {
                    iOooOo02 = oooOO02.OooOo0();
                }
            } while (iOooOo02 == this.f64437OooO0O0);
            this.f64439OooO0Oo = iOooOo02;
            return;
        }
        if (i2 != 2) {
            throw C21807OooOoOO.OooO0O0();
        }
        int iOooO0O02 = oooOO02.OooO0O0() + oooOO02.OooOo0O();
        do {
            oooo0.addLong(oooOO02.OooOOO());
        } while (oooOO02.OooO0O0() < iOooO0O02);
        OooOo0O(iOooO0O02);
    }

    public final void OooOOO0(List<Integer> list) throws IOException {
        int iOooOo0;
        int iOooOo02;
        boolean z = list instanceof C21806OooOoO0;
        OooOO0 oooOO02 = this.f64436OooO00o;
        if (!z) {
            int i = this.f64437OooO0O0 & 7;
            if (i == 0) {
                do {
                    list.add(Integer.valueOf(oooOO02.OooOOO0()));
                    if (oooOO02.OooO0OO()) {
                        return;
                    } else {
                        iOooOo0 = oooOO02.OooOo0();
                    }
                } while (iOooOo0 == this.f64437OooO0O0);
                this.f64439OooO0Oo = iOooOo0;
                return;
            }
            if (i != 2) {
                throw C21807OooOoOO.OooO0O0();
            }
            int iOooO0O0 = oooOO02.OooO0O0() + oooOO02.OooOo0O();
            do {
                list.add(Integer.valueOf(oooOO02.OooOOO0()));
            } while (oooOO02.OooO0O0() < iOooO0O0);
            OooOo0O(iOooO0O0);
            return;
        }
        C21806OooOoO0 c21806OooOoO0 = (C21806OooOoO0) list;
        int i2 = this.f64437OooO0O0 & 7;
        if (i2 == 0) {
            do {
                c21806OooOoO0.addInt(oooOO02.OooOOO0());
                if (oooOO02.OooO0OO()) {
                    return;
                } else {
                    iOooOo02 = oooOO02.OooOo0();
                }
            } while (iOooOo02 == this.f64437OooO0O0);
            this.f64439OooO0Oo = iOooOo02;
            return;
        }
        if (i2 != 2) {
            throw C21807OooOoOO.OooO0O0();
        }
        int iOooO0O02 = oooOO02.OooO0O0() + oooOO02.OooOo0O();
        do {
            c21806OooOoO0.addInt(oooOO02.OooOOO0());
        } while (oooOO02.OooO0O0() < iOooO0O02);
        OooOo0O(iOooO0O02);
    }

    public final void OooOOOO(List<Integer> list) throws IOException {
        int iOooOo0;
        int iOooOo02;
        boolean z = list instanceof C21806OooOoO0;
        OooOO0 oooOO02 = this.f64436OooO00o;
        if (!z) {
            int i = this.f64437OooO0O0 & 7;
            if (i == 2) {
                int iOooOo0O = oooOO02.OooOo0O();
                OooOoO0(iOooOo0O);
                int iOooO0O0 = oooOO02.OooO0O0() + iOooOo0O;
                do {
                    list.add(Integer.valueOf(oooOO02.OooOOOO()));
                } while (oooOO02.OooO0O0() < iOooO0O0);
                return;
            }
            if (i != 5) {
                throw C21807OooOoOO.OooO0O0();
            }
            do {
                list.add(Integer.valueOf(oooOO02.OooOOOO()));
                if (oooOO02.OooO0OO()) {
                    return;
                } else {
                    iOooOo0 = oooOO02.OooOo0();
                }
            } while (iOooOo0 == this.f64437OooO0O0);
            this.f64439OooO0Oo = iOooOo0;
            return;
        }
        C21806OooOoO0 c21806OooOoO0 = (C21806OooOoO0) list;
        int i2 = this.f64437OooO0O0 & 7;
        if (i2 == 2) {
            int iOooOo0O2 = oooOO02.OooOo0O();
            OooOoO0(iOooOo0O2);
            int iOooO0O02 = oooOO02.OooO0O0() + iOooOo0O2;
            do {
                c21806OooOoO0.addInt(oooOO02.OooOOOO());
            } while (oooOO02.OooO0O0() < iOooO0O02);
            return;
        }
        if (i2 != 5) {
            throw C21807OooOoOO.OooO0O0();
        }
        do {
            c21806OooOoO0.addInt(oooOO02.OooOOOO());
            if (oooOO02.OooO0OO()) {
                return;
            } else {
                iOooOo02 = oooOO02.OooOo0();
            }
        } while (iOooOo02 == this.f64437OooO0O0);
        this.f64439OooO0Oo = iOooOo02;
    }

    public final void OooOOOo(List<Long> list) throws IOException {
        int iOooOo0;
        int iOooOo02;
        boolean z = list instanceof Oooo0;
        OooOO0 oooOO02 = this.f64436OooO00o;
        if (!z) {
            int i = this.f64437OooO0O0 & 7;
            if (i == 1) {
                do {
                    list.add(Long.valueOf(oooOO02.OooOOOo()));
                    if (oooOO02.OooO0OO()) {
                        return;
                    } else {
                        iOooOo0 = oooOO02.OooOo0();
                    }
                } while (iOooOo0 == this.f64437OooO0O0);
                this.f64439OooO0Oo = iOooOo0;
                return;
            }
            if (i != 2) {
                throw C21807OooOoOO.OooO0O0();
            }
            int iOooOo0O = oooOO02.OooOo0O();
            OooOoO(iOooOo0O);
            int iOooO0O0 = oooOO02.OooO0O0() + iOooOo0O;
            do {
                list.add(Long.valueOf(oooOO02.OooOOOo()));
            } while (oooOO02.OooO0O0() < iOooO0O0);
            return;
        }
        Oooo0 oooo0 = (Oooo0) list;
        int i2 = this.f64437OooO0O0 & 7;
        if (i2 == 1) {
            do {
                oooo0.addLong(oooOO02.OooOOOo());
                if (oooOO02.OooO0OO()) {
                    return;
                } else {
                    iOooOo02 = oooOO02.OooOo0();
                }
            } while (iOooOo02 == this.f64437OooO0O0);
            this.f64439OooO0Oo = iOooOo02;
            return;
        }
        if (i2 != 2) {
            throw C21807OooOoOO.OooO0O0();
        }
        int iOooOo0O2 = oooOO02.OooOo0O();
        OooOoO(iOooOo0O2);
        int iOooO0O02 = oooOO02.OooO0O0() + iOooOo0O2;
        do {
            oooo0.addLong(oooOO02.OooOOOo());
        } while (oooOO02.OooO0O0() < iOooO0O02);
    }

    public final void OooOOo(List<Long> list) throws IOException {
        int iOooOo0;
        int iOooOo02;
        boolean z = list instanceof Oooo0;
        OooOO0 oooOO02 = this.f64436OooO00o;
        if (!z) {
            int i = this.f64437OooO0O0 & 7;
            if (i == 0) {
                do {
                    list.add(Long.valueOf(oooOO02.OooOOo()));
                    if (oooOO02.OooO0OO()) {
                        return;
                    } else {
                        iOooOo0 = oooOO02.OooOo0();
                    }
                } while (iOooOo0 == this.f64437OooO0O0);
                this.f64439OooO0Oo = iOooOo0;
                return;
            }
            if (i != 2) {
                throw C21807OooOoOO.OooO0O0();
            }
            int iOooO0O0 = oooOO02.OooO0O0() + oooOO02.OooOo0O();
            do {
                list.add(Long.valueOf(oooOO02.OooOOo()));
            } while (oooOO02.OooO0O0() < iOooO0O0);
            OooOo0O(iOooO0O0);
            return;
        }
        Oooo0 oooo0 = (Oooo0) list;
        int i2 = this.f64437OooO0O0 & 7;
        if (i2 == 0) {
            do {
                oooo0.addLong(oooOO02.OooOOo());
                if (oooOO02.OooO0OO()) {
                    return;
                } else {
                    iOooOo02 = oooOO02.OooOo0();
                }
            } while (iOooOo02 == this.f64437OooO0O0);
            this.f64439OooO0Oo = iOooOo02;
            return;
        }
        if (i2 != 2) {
            throw C21807OooOoOO.OooO0O0();
        }
        int iOooO0O02 = oooOO02.OooO0O0() + oooOO02.OooOo0O();
        do {
            oooo0.addLong(oooOO02.OooOOo());
        } while (oooOO02.OooO0O0() < iOooO0O02);
        OooOo0O(iOooO0O02);
    }

    public final void OooOOo0(List<Integer> list) throws IOException {
        int iOooOo0;
        int iOooOo02;
        boolean z = list instanceof C21806OooOoO0;
        OooOO0 oooOO02 = this.f64436OooO00o;
        if (!z) {
            int i = this.f64437OooO0O0 & 7;
            if (i == 0) {
                do {
                    list.add(Integer.valueOf(oooOO02.OooOOo0()));
                    if (oooOO02.OooO0OO()) {
                        return;
                    } else {
                        iOooOo0 = oooOO02.OooOo0();
                    }
                } while (iOooOo0 == this.f64437OooO0O0);
                this.f64439OooO0Oo = iOooOo0;
                return;
            }
            if (i != 2) {
                throw C21807OooOoOO.OooO0O0();
            }
            int iOooO0O0 = oooOO02.OooO0O0() + oooOO02.OooOo0O();
            do {
                list.add(Integer.valueOf(oooOO02.OooOOo0()));
            } while (oooOO02.OooO0O0() < iOooO0O0);
            OooOo0O(iOooO0O0);
            return;
        }
        C21806OooOoO0 c21806OooOoO0 = (C21806OooOoO0) list;
        int i2 = this.f64437OooO0O0 & 7;
        if (i2 == 0) {
            do {
                c21806OooOoO0.addInt(oooOO02.OooOOo0());
                if (oooOO02.OooO0OO()) {
                    return;
                } else {
                    iOooOo02 = oooOO02.OooOo0();
                }
            } while (iOooOo02 == this.f64437OooO0O0);
            this.f64439OooO0Oo = iOooOo02;
            return;
        }
        if (i2 != 2) {
            throw C21807OooOoOO.OooO0O0();
        }
        int iOooO0O02 = oooOO02.OooO0O0() + oooOO02.OooOo0O();
        do {
            c21806OooOoO0.addInt(oooOO02.OooOOo0());
        } while (oooOO02.OooO0O0() < iOooO0O02);
        OooOo0O(iOooO0O02);
    }

    public final void OooOOoo(List<String> list, boolean z) throws IOException {
        String strOooOOoo;
        int iOooOo0;
        int iOooOo02;
        if ((this.f64437OooO0O0 & 7) != 2) {
            throw C21807OooOoOO.OooO0O0();
        }
        boolean z2 = list instanceof InterfaceC21811OooOooo;
        OooOO0 oooOO02 = this.f64436OooO00o;
        if (z2 && !z) {
            InterfaceC21811OooOooo interfaceC21811OooOooo = (InterfaceC21811OooOooo) list;
            do {
                OooO0o0();
                interfaceC21811OooOooo.OooO00o();
                if (oooOO02.OooO0OO()) {
                    return;
                } else {
                    iOooOo02 = oooOO02.OooOo0();
                }
            } while (iOooOo02 == this.f64437OooO0O0);
            this.f64439OooO0Oo = iOooOo02;
            return;
        }
        do {
            if (z) {
                OooOo0o(2);
                strOooOOoo = oooOO02.OooOo00();
            } else {
                OooOo0o(2);
                strOooOOoo = oooOO02.OooOOoo();
            }
            list.add(strOooOOoo);
            if (oooOO02.OooO0OO()) {
                return;
            } else {
                iOooOo0 = oooOO02.OooOo0();
            }
        } while (iOooOo0 == this.f64437OooO0O0);
        this.f64439OooO0Oo = iOooOo0;
    }

    public final boolean OooOo() throws IOException {
        int i;
        OooOO0 oooOO02 = this.f64436OooO00o;
        if (oooOO02.OooO0OO() || (i = this.f64437OooO0O0) == this.f64438OooO0OO) {
            return false;
        }
        return oooOO02.OooOo(i);
    }

    public final void OooOo0(List<Long> list) throws IOException {
        int iOooOo0;
        int iOooOo02;
        boolean z = list instanceof Oooo0;
        OooOO0 oooOO02 = this.f64436OooO00o;
        if (!z) {
            int i = this.f64437OooO0O0 & 7;
            if (i == 0) {
                do {
                    list.add(Long.valueOf(oooOO02.OooOo0o()));
                    if (oooOO02.OooO0OO()) {
                        return;
                    } else {
                        iOooOo0 = oooOO02.OooOo0();
                    }
                } while (iOooOo0 == this.f64437OooO0O0);
                this.f64439OooO0Oo = iOooOo0;
                return;
            }
            if (i != 2) {
                throw C21807OooOoOO.OooO0O0();
            }
            int iOooO0O0 = oooOO02.OooO0O0() + oooOO02.OooOo0O();
            do {
                list.add(Long.valueOf(oooOO02.OooOo0o()));
            } while (oooOO02.OooO0O0() < iOooO0O0);
            OooOo0O(iOooO0O0);
            return;
        }
        Oooo0 oooo0 = (Oooo0) list;
        int i2 = this.f64437OooO0O0 & 7;
        if (i2 == 0) {
            do {
                oooo0.addLong(oooOO02.OooOo0o());
                if (oooOO02.OooO0OO()) {
                    return;
                } else {
                    iOooOo02 = oooOO02.OooOo0();
                }
            } while (iOooOo02 == this.f64437OooO0O0);
            this.f64439OooO0Oo = iOooOo02;
            return;
        }
        if (i2 != 2) {
            throw C21807OooOoOO.OooO0O0();
        }
        int iOooO0O02 = oooOO02.OooO0O0() + oooOO02.OooOo0O();
        do {
            oooo0.addLong(oooOO02.OooOo0o());
        } while (oooOO02.OooO0O0() < iOooO0O02);
        OooOo0O(iOooO0O02);
    }

    public final void OooOo00(List<Integer> list) throws IOException {
        int iOooOo0;
        int iOooOo02;
        boolean z = list instanceof C21806OooOoO0;
        OooOO0 oooOO02 = this.f64436OooO00o;
        if (!z) {
            int i = this.f64437OooO0O0 & 7;
            if (i == 0) {
                do {
                    list.add(Integer.valueOf(oooOO02.OooOo0O()));
                    if (oooOO02.OooO0OO()) {
                        return;
                    } else {
                        iOooOo0 = oooOO02.OooOo0();
                    }
                } while (iOooOo0 == this.f64437OooO0O0);
                this.f64439OooO0Oo = iOooOo0;
                return;
            }
            if (i != 2) {
                throw C21807OooOoOO.OooO0O0();
            }
            int iOooO0O0 = oooOO02.OooO0O0() + oooOO02.OooOo0O();
            do {
                list.add(Integer.valueOf(oooOO02.OooOo0O()));
            } while (oooOO02.OooO0O0() < iOooO0O0);
            OooOo0O(iOooO0O0);
            return;
        }
        C21806OooOoO0 c21806OooOoO0 = (C21806OooOoO0) list;
        int i2 = this.f64437OooO0O0 & 7;
        if (i2 == 0) {
            do {
                c21806OooOoO0.addInt(oooOO02.OooOo0O());
                if (oooOO02.OooO0OO()) {
                    return;
                } else {
                    iOooOo02 = oooOO02.OooOo0();
                }
            } while (iOooOo02 == this.f64437OooO0O0);
            this.f64439OooO0Oo = iOooOo02;
            return;
        }
        if (i2 != 2) {
            throw C21807OooOoOO.OooO0O0();
        }
        int iOooO0O02 = oooOO02.OooO0O0() + oooOO02.OooOo0O();
        do {
            c21806OooOoO0.addInt(oooOO02.OooOo0O());
        } while (oooOO02.OooO0O0() < iOooO0O02);
        OooOo0O(iOooO0O02);
    }

    public final void OooOo0O(int i) throws IOException {
        if (this.f64436OooO00o.OooO0O0() != i) {
            throw C21807OooOoOO.OooO0o0();
        }
    }

    public final void OooOo0o(int i) throws IOException {
        if ((this.f64437OooO0O0 & 7) != i) {
            throw C21807OooOoOO.OooO0O0();
        }
    }
}
