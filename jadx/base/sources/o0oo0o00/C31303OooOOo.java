package o0oo0o00;

import com.aspose.words.ControlChar;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import com.orion.notein.domain.models.cloudsync.CloudMetaExtra;
import java.io.EOFException;
import java.io.IOException;
import o0oo0o00.AbstractC31304OooOOo0;
import oO0o0O0o.C33580OooO00o;
import oOo00OoO.C34524OooO0Oo;
import oOo00OoO.C34527OooO0oO;

/* JADX INFO: renamed from: o0oo0o00.OooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31303OooOOo extends AbstractC31304OooOOo0 {

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public static final C34527OooO0oO f111738Oooo0;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public static final C34527OooO0oO f111739Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public static final C34527OooO0oO f111740Oooo00o;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final C34524OooO0Oo f111741OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public int f111742OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final C34524OooO0Oo f111743OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public long f111744OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public int f111745OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public String f111746Oooo000;

    static {
        C34527OooO0oO c34527OooO0oO = C34527OooO0oO.f123734OooOoO;
        f111739Oooo00O = C34527OooO0oO.OooO00o.OooO0O0("'\\");
        f111740Oooo00o = C34527OooO0oO.OooO00o.OooO0O0("\"\\");
        f111738Oooo0 = C34527OooO0oO.OooO00o.OooO0O0("{}[]:, \n\t\r\f/\\;#=");
        C34527OooO0oO.OooO00o.OooO0O0("\n\r");
        C34527OooO0oO.OooO00o.OooO0O0("*/");
    }

    public C31303OooOOo(C34524OooO0Oo c34524OooO0Oo) {
        this.f111747OooOo = new int[32];
        this.f111750OooOoO0 = new String[32];
        this.f111749OooOoO = new int[32];
        this.f111742OooOoo = 0;
        this.f111741OooOoOO = c34524OooO0Oo;
        this.f111743OooOoo0 = c34524OooO0Oo;
        OooO0OO(6);
    }

    public final void OooOOo0() throws IOException {
        int iOooo000 = this.f111742OooOoo;
        if (iOooo000 == 0) {
            iOooo000 = Oooo000();
        }
        if (iOooo000 == 3) {
            OooO0OO(1);
            this.f111749OooOoO[this.f111748OooOo0o - 1] = 0;
            this.f111742OooOoo = 0;
        } else {
            throw new C31299OooOOO("Expected BEGIN_ARRAY but was " + o000O00O() + " at path " + OooO00o());
        }
    }

    public final void OooOOoo() throws IOException {
        int iOooo000 = this.f111742OooOoo;
        if (iOooo000 == 0) {
            iOooo000 = Oooo000();
        }
        if (iOooo000 == 1) {
            OooO0OO(3);
            this.f111742OooOoo = 0;
        } else {
            throw new C31299OooOOO("Expected BEGIN_OBJECT but was " + o000O00O() + " at path " + OooO00o());
        }
    }

    public final void OooOooo() throws IOException {
        OooOOO0("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    public final void Oooo0() throws IOException {
        int iOooo000 = this.f111742OooOoo;
        if (iOooo000 == 0) {
            iOooo000 = Oooo000();
        }
        if (iOooo000 != 2) {
            throw new C31299OooOOO("Expected END_OBJECT but was " + o000O00O() + " at path " + OooO00o());
        }
        int i = this.f111748OooOo0o;
        int i2 = i - 1;
        this.f111748OooOo0o = i2;
        this.f111750OooOoO0[i2] = null;
        int[] iArr = this.f111749OooOoO;
        int i3 = i - 2;
        iArr[i3] = iArr[i3] + 1;
        this.f111742OooOoo = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:137:0x0199, code lost:
    
        if (o0Oo0oo(r10) != false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x019b, code lost:
    
        if (r1 != 2) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x019d, code lost:
    
        if (r4 == false) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x01a3, code lost:
    
        if (r12 != Long.MIN_VALUE) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x01a5, code lost:
    
        if (r9 == false) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x01a9, code lost:
    
        if (r12 != r16) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x01ab, code lost:
    
        if (r9 != false) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x01ad, code lost:
    
        if (r9 == false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x01b0, code lost:
    
        r12 = -r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x01b1, code lost:
    
        r22.f111744OooOooO = r12;
        r7.skip(r2);
        r9 = 16;
        r22.f111742OooOoo = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x01bc, code lost:
    
        if (r1 == 2) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x01bf, code lost:
    
        if (r1 == 4) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x01c2, code lost:
    
        if (r1 != 7) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x01c4, code lost:
    
        r22.f111745OooOooo = r2;
        r9 = 17;
        r22.f111742OooOoo = 17;
     */
    /* JADX WARN: Removed duplicated region for block: B:174:0x01f1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0119 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x011a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int Oooo000() throws IOException {
        int i;
        String str;
        String str2;
        long j;
        char cOooOooo;
        int i2;
        char c;
        int[] iArr = this.f111747OooOo;
        int i3 = this.f111748OooOo0o - 1;
        int i4 = iArr[i3];
        C34524OooO0Oo c34524OooO0Oo = this.f111743OooOoo0;
        if (i4 == 1) {
            iArr[i3] = 2;
        } else if (i4 == 2) {
            int iO0000O0O = o0000O0O(true);
            c34524OooO0Oo.readByte();
            if (iO0000O0O != 44) {
                if (iO0000O0O == 59) {
                    OooOooo();
                    throw null;
                }
                if (iO0000O0O == 93) {
                    this.f111742OooOoo = 4;
                    return 4;
                }
                OooOOO0("Unterminated array");
                throw null;
            }
        } else {
            if (i4 == 3 || i4 == 5) {
                iArr[i3] = 4;
                if (i4 == 5) {
                    int iO0000O0O2 = o0000O0O(true);
                    c34524OooO0Oo.readByte();
                    if (iO0000O0O2 != 44) {
                        if (iO0000O0O2 == 59) {
                            OooOooo();
                            throw null;
                        }
                        if (iO0000O0O2 == 125) {
                            this.f111742OooOoo = 2;
                            return 2;
                        }
                        OooOOO0("Unterminated object");
                        throw null;
                    }
                }
                int iO0000O0O3 = o0000O0O(true);
                if (iO0000O0O3 == 34) {
                    c34524OooO0Oo.readByte();
                    this.f111742OooOoo = 13;
                    return 13;
                }
                if (iO0000O0O3 == 39) {
                    c34524OooO0Oo.readByte();
                    OooOooo();
                    throw null;
                }
                if (iO0000O0O3 != 125) {
                    OooOooo();
                    throw null;
                }
                if (i4 == 5) {
                    OooOOO0("Expected name");
                    throw null;
                }
                c34524OooO0Oo.readByte();
                this.f111742OooOoo = 2;
                return 2;
            }
            if (i4 == 4) {
                iArr[i3] = 5;
                int iO0000O0O4 = o0000O0O(true);
                c34524OooO0Oo.readByte();
                if (iO0000O0O4 != 58) {
                    if (iO0000O0O4 != 61) {
                        OooOOO0("Expected ':'");
                        throw null;
                    }
                    OooOooo();
                    throw null;
                }
            } else if (i4 == 6) {
                iArr[i3] = 7;
            } else {
                if (i4 == 7) {
                    if (o0000O0O(false) == -1) {
                        this.f111742OooOoo = 18;
                        return 18;
                    }
                    OooOooo();
                    throw null;
                }
                if (i4 == 9) {
                    throw null;
                }
                if (i4 == 8) {
                    throw new IllegalStateException("JsonReader is closed");
                }
            }
        }
        int iO0000O0O5 = o0000O0O(true);
        if (iO0000O0O5 == 34) {
            c34524OooO0Oo.readByte();
            this.f111742OooOoo = 9;
            return 9;
        }
        if (iO0000O0O5 == 39) {
            OooOooo();
            throw null;
        }
        if (iO0000O0O5 != 44 && iO0000O0O5 != 59) {
            if (iO0000O0O5 == 91) {
                c34524OooO0Oo.readByte();
                this.f111742OooOoo = 3;
                return 3;
            }
            if (iO0000O0O5 != 93) {
                if (iO0000O0O5 == 123) {
                    c34524OooO0Oo.readByte();
                    this.f111742OooOoo = 1;
                    return 1;
                }
                byte bOooOooo = c34524OooO0Oo.OooOooo(0L);
                C34524OooO0Oo c34524OooO0Oo2 = this.f111741OooOoOO;
                if (bOooOooo == 116 || bOooOooo == 84) {
                    i = 5;
                    str2 = TelemetryEventStrings.Value.TRUE;
                    str = "TRUE";
                } else if (bOooOooo == 102 || bOooOooo == 70) {
                    i = 6;
                    str2 = TelemetryEventStrings.Value.FALSE;
                    str = "FALSE";
                } else if (bOooOooo == 110 || bOooOooo == 78) {
                    i = 7;
                    str2 = CloudMetaExtra.DEFINE_NON_PARENT_ID;
                    str = "NULL";
                } else {
                    j = 0;
                    i = 0;
                    if (i == 0) {
                        return i;
                    }
                    boolean z = true;
                    long j2 = j;
                    char c2 = 0;
                    int i5 = 0;
                    boolean z2 = false;
                    while (true) {
                        int i6 = i5 + 1;
                        if (!c34524OooO0Oo2.request(i6)) {
                            break;
                        }
                        byte bOooOooo2 = c34524OooO0Oo.OooOooo(i5);
                        if (bOooOooo2 != 43) {
                            if (bOooOooo2 == 69 || bOooOooo2 == 101) {
                                c = 6;
                                if (c2 != 2 && c2 != 4) {
                                    break;
                                }
                                c2 = 5;
                                i5 = i6;
                            } else if (bOooOooo2 == 45) {
                                c = 6;
                                if (c2 == 0) {
                                    c2 = 1;
                                    z2 = true;
                                    i5 = i6;
                                } else {
                                    if (c2 != 5) {
                                        break;
                                    }
                                    c2 = c;
                                    i5 = i6;
                                }
                            } else if (bOooOooo2 == 46) {
                                c = 6;
                                if (c2 != 2) {
                                    break;
                                }
                                c2 = 3;
                                i5 = i6;
                            } else {
                                if (bOooOooo2 < 48 || bOooOooo2 > 57) {
                                    break;
                                }
                                if (c2 == 1 || c2 == 0) {
                                    c = 6;
                                    j2 = -(bOooOooo2 - 48);
                                    c2 = 2;
                                } else {
                                    if (c2 == 2) {
                                        if (j2 == j) {
                                            break;
                                        }
                                        long j3 = (10 * j2) - ((long) (bOooOooo2 - 48));
                                        z &= j2 > -922337203685477580L || (j2 == -922337203685477580L && j3 < j2);
                                        j2 = j3;
                                    } else if (c2 == 3) {
                                        c2 = 4;
                                    } else {
                                        c = 6;
                                        if (c2 == 5 || c2 == 6) {
                                            c2 = 7;
                                        }
                                    }
                                    c = 6;
                                    i5 = i6;
                                }
                                i5 = i6;
                            }
                            if (i2 == 0) {
                                return i2;
                            }
                            if (o0Oo0oo(c34524OooO0Oo.OooOooo(j))) {
                                OooOooo();
                                throw null;
                            }
                            OooOOO0("Expected value");
                            throw null;
                        }
                        c = 6;
                        if (c2 != 5) {
                            break;
                        }
                        c2 = c;
                        i5 = i6;
                    }
                    i2 = 0;
                    if (i2 == 0) {
                    }
                }
                int length = str2.length();
                j = 0;
                int i7 = 1;
                while (true) {
                    if (i7 < length) {
                        int i8 = i7 + 1;
                        if (!c34524OooO0Oo2.request(i8) || ((cOooOooo = c34524OooO0Oo.OooOooo(i7)) != str2.charAt(i7) && cOooOooo != str.charAt(i7))) {
                            break;
                        }
                        i7 = i8;
                    } else if (!c34524OooO0Oo2.request(length + 1) || !o0Oo0oo(c34524OooO0Oo.OooOooo(length))) {
                        c34524OooO0Oo.skip(length);
                        this.f111742OooOoo = i;
                    }
                }
                i = 0;
                if (i == 0) {
                }
            } else if (i4 == 1) {
                c34524OooO0Oo.readByte();
                this.f111742OooOoo = 4;
                return 4;
            }
        }
        if (i4 == 1 || i4 == 2) {
            OooOooo();
            throw null;
        }
        OooOOO0("Unexpected value");
        throw null;
    }

    public final void Oooo00o() throws IOException {
        int iOooo000 = this.f111742OooOoo;
        if (iOooo000 == 0) {
            iOooo000 = Oooo000();
        }
        if (iOooo000 != 4) {
            throw new C31299OooOOO("Expected END_ARRAY but was " + o000O00O() + " at path " + OooO00o());
        }
        int i = this.f111748OooOo0o;
        this.f111748OooOo0o = i - 1;
        int[] iArr = this.f111749OooOoO;
        int i2 = i - 2;
        iArr[i2] = iArr[i2] + 1;
        this.f111742OooOoo = 0;
    }

    public final int Oooo0OO(String str, AbstractC31304OooOOo0.OooO00o oooO00o) {
        int length = oooO00o.f111751OooO00o.length;
        for (int i = 0; i < length; i++) {
            if (str.equals(oooO00o.f111751OooO00o[i])) {
                this.f111742OooOoo = 0;
                this.f111750OooOoO0[this.f111748OooOo0o - 1] = str;
                return i;
            }
        }
        return -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f111742OooOoo = 0;
        this.f111747OooOo[0] = 8;
        this.f111748OooOo0o = 1;
        this.f111743OooOoo0.OooO00o();
    }

    public final double o00000OO() throws IOException {
        int iOooo000 = this.f111742OooOoo;
        if (iOooo000 == 0) {
            iOooo000 = Oooo000();
        }
        if (iOooo000 == 16) {
            this.f111742OooOoo = 0;
            int[] iArr = this.f111749OooOoO;
            int i = this.f111748OooOo0o - 1;
            iArr[i] = iArr[i] + 1;
            return this.f111744OooOooO;
        }
        if (iOooo000 == 17) {
            long j = this.f111745OooOooo;
            C34524OooO0Oo c34524OooO0Oo = this.f111743OooOoo0;
            c34524OooO0Oo.getClass();
            this.f111746Oooo000 = c34524OooO0Oo.o0Oo0oo(j, C33580OooO00o.f121231OooO0O0);
        } else if (iOooo000 == 9) {
            this.f111746Oooo000 = o0000Oo0(f111740Oooo00o);
        } else if (iOooo000 == 8) {
            this.f111746Oooo000 = o0000Oo0(f111739Oooo00O);
        } else if (iOooo000 == 10) {
            this.f111746Oooo000 = o0000ooO();
        } else if (iOooo000 != 11) {
            throw new C31299OooOOO("Expected a double but was " + o000O00O() + " at path " + OooO00o());
        }
        this.f111742OooOoo = 11;
        try {
            double d = Double.parseDouble(this.f111746Oooo000);
            if (Double.isNaN(d) || Double.isInfinite(d)) {
                throw new C31301OooOOOO("JSON forbids NaN and infinities: " + d + " at path " + OooO00o());
            }
            this.f111746Oooo000 = null;
            this.f111742OooOoo = 0;
            int[] iArr2 = this.f111749OooOoO;
            int i2 = this.f111748OooOo0o - 1;
            iArr2[i2] = iArr2[i2] + 1;
            return d;
        } catch (NumberFormatException unused) {
            throw new C31299OooOOO("Expected a double but was " + this.f111746Oooo000 + " at path " + OooO00o());
        }
    }

    public final int o00000oO() throws IOException {
        int iOooo000 = this.f111742OooOoo;
        if (iOooo000 == 0) {
            iOooo000 = Oooo000();
        }
        if (iOooo000 == 16) {
            long j = this.f111744OooOooO;
            int i = (int) j;
            if (j == i) {
                this.f111742OooOoo = 0;
                int[] iArr = this.f111749OooOoO;
                int i2 = this.f111748OooOo0o - 1;
                iArr[i2] = iArr[i2] + 1;
                return i;
            }
            throw new C31299OooOOO("Expected an int but was " + this.f111744OooOooO + " at path " + OooO00o());
        }
        if (iOooo000 == 17) {
            long j2 = this.f111745OooOooo;
            C34524OooO0Oo c34524OooO0Oo = this.f111743OooOoo0;
            c34524OooO0Oo.getClass();
            this.f111746Oooo000 = c34524OooO0Oo.o0Oo0oo(j2, C33580OooO00o.f121231OooO0O0);
        } else if (iOooo000 == 9 || iOooo000 == 8) {
            String strO0000Oo0 = iOooo000 == 9 ? o0000Oo0(f111740Oooo00o) : o0000Oo0(f111739Oooo00O);
            this.f111746Oooo000 = strO0000Oo0;
            try {
                int i3 = Integer.parseInt(strO0000Oo0);
                this.f111742OooOoo = 0;
                int[] iArr2 = this.f111749OooOoO;
                int i4 = this.f111748OooOo0o - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return i3;
            } catch (NumberFormatException unused) {
            }
        } else if (iOooo000 != 11) {
            throw new C31299OooOOO("Expected an int but was " + o000O00O() + " at path " + OooO00o());
        }
        this.f111742OooOoo = 11;
        try {
            double d = Double.parseDouble(this.f111746Oooo000);
            int i5 = (int) d;
            if (i5 != d) {
                throw new C31299OooOOO("Expected an int but was " + this.f111746Oooo000 + " at path " + OooO00o());
            }
            this.f111746Oooo000 = null;
            this.f111742OooOoo = 0;
            int[] iArr3 = this.f111749OooOoO;
            int i6 = this.f111748OooOo0o - 1;
            iArr3[i6] = iArr3[i6] + 1;
            return i5;
        } catch (NumberFormatException unused2) {
            throw new C31299OooOOO("Expected an int but was " + this.f111746Oooo000 + " at path " + OooO00o());
        }
    }

    public final void o0000O() throws IOException {
        int iOooo000 = this.f111742OooOoo;
        if (iOooo000 == 0) {
            iOooo000 = Oooo000();
        }
        if (iOooo000 == 7) {
            this.f111742OooOoo = 0;
            int[] iArr = this.f111749OooOoO;
            int i = this.f111748OooOo0o - 1;
            iArr[i] = iArr[i] + 1;
            return;
        }
        throw new C31299OooOOO("Expected null but was " + o000O00O() + " at path " + OooO00o());
    }

    public final int o0000O0O(boolean z) throws IOException {
        int i = 0;
        while (true) {
            int i2 = i + 1;
            C34524OooO0Oo c34524OooO0Oo = this.f111741OooOoOO;
            if (!c34524OooO0Oo.request(i2)) {
                if (z) {
                    throw new EOFException("End of input");
                }
                return -1;
            }
            long j = i;
            C34524OooO0Oo c34524OooO0Oo2 = this.f111743OooOoo0;
            byte bOooOooo = c34524OooO0Oo2.OooOooo(j);
            if (bOooOooo != 10 && bOooOooo != 32 && bOooOooo != 13 && bOooOooo != 9) {
                c34524OooO0Oo2.skip(j);
                if (bOooOooo == 47) {
                    if (c34524OooO0Oo.request(2L)) {
                        OooOooo();
                        throw null;
                    }
                } else if (bOooOooo == 35) {
                    OooOooo();
                    throw null;
                }
                return bOooOooo;
            }
            i = i2;
        }
    }

    public final String o0000Oo0(C34527OooO0oO c34527OooO0oO) throws IOException {
        StringBuilder sb = null;
        while (true) {
            long jOooo00o = this.f111741OooOoOO.Oooo00o(c34527OooO0oO);
            if (jOooo00o == -1) {
                OooOOO0("Unterminated string");
                throw null;
            }
            C34524OooO0Oo c34524OooO0Oo = this.f111743OooOoo0;
            if (c34524OooO0Oo.OooOooo(jOooo00o) != 92) {
                if (sb == null) {
                    String strO0Oo0oo = c34524OooO0Oo.o0Oo0oo(jOooo00o, C33580OooO00o.f121231OooO0O0);
                    c34524OooO0Oo.readByte();
                    return strO0Oo0oo;
                }
                sb.append(c34524OooO0Oo.o0Oo0oo(jOooo00o, C33580OooO00o.f121231OooO0O0));
                c34524OooO0Oo.readByte();
                return sb.toString();
            }
            if (sb == null) {
                sb = new StringBuilder();
            }
            sb.append(c34524OooO0Oo.o0Oo0oo(jOooo00o, C33580OooO00o.f121231OooO0O0));
            c34524OooO0Oo.readByte();
            sb.append(o0OoO0o());
        }
    }

    public final String o0000o0() throws IOException {
        String strO0Oo0oo;
        int iOooo000 = this.f111742OooOoo;
        if (iOooo000 == 0) {
            iOooo000 = Oooo000();
        }
        if (iOooo000 == 10) {
            strO0Oo0oo = o0000ooO();
        } else if (iOooo000 == 9) {
            strO0Oo0oo = o0000Oo0(f111740Oooo00o);
        } else if (iOooo000 == 8) {
            strO0Oo0oo = o0000Oo0(f111739Oooo00O);
        } else if (iOooo000 == 11) {
            strO0Oo0oo = this.f111746Oooo000;
            this.f111746Oooo000 = null;
        } else if (iOooo000 == 16) {
            strO0Oo0oo = Long.toString(this.f111744OooOooO);
        } else {
            if (iOooo000 != 17) {
                throw new C31299OooOOO("Expected a string but was " + o000O00O() + " at path " + OooO00o());
            }
            long j = this.f111745OooOooo;
            C34524OooO0Oo c34524OooO0Oo = this.f111743OooOoo0;
            c34524OooO0Oo.getClass();
            strO0Oo0oo = c34524OooO0Oo.o0Oo0oo(j, C33580OooO00o.f121231OooO0O0);
        }
        this.f111742OooOoo = 0;
        int[] iArr = this.f111749OooOoO;
        int i = this.f111748OooOo0o - 1;
        iArr[i] = iArr[i] + 1;
        return strO0Oo0oo;
    }

    public final String o0000oO() throws IOException {
        String strO0000Oo0;
        int iOooo000 = this.f111742OooOoo;
        if (iOooo000 == 0) {
            iOooo000 = Oooo000();
        }
        if (iOooo000 == 14) {
            strO0000Oo0 = o0000ooO();
        } else if (iOooo000 == 13) {
            strO0000Oo0 = o0000Oo0(f111740Oooo00o);
        } else if (iOooo000 == 12) {
            strO0000Oo0 = o0000Oo0(f111739Oooo00O);
        } else {
            if (iOooo000 != 15) {
                throw new C31299OooOOO("Expected a name but was " + o000O00O() + " at path " + OooO00o());
            }
            strO0000Oo0 = this.f111746Oooo000;
            this.f111746Oooo000 = null;
        }
        this.f111742OooOoo = 0;
        this.f111750OooOoO0[this.f111748OooOo0o - 1] = strO0000Oo0;
        return strO0000Oo0;
    }

    public final String o0000ooO() throws IOException {
        long jOooo00o = this.f111741OooOoOO.Oooo00o(f111738Oooo0);
        C34524OooO0Oo c34524OooO0Oo = this.f111743OooOoo0;
        if (jOooo00o == -1) {
            return c34524OooO0Oo.o00000OO();
        }
        c34524OooO0Oo.getClass();
        return c34524OooO0Oo.o0Oo0oo(jOooo00o, C33580OooO00o.f121231OooO0O0);
    }

    public final AbstractC31304OooOOo0.OooO0O0 o000O00O() throws IOException {
        int iOooo000 = this.f111742OooOoo;
        if (iOooo000 == 0) {
            iOooo000 = Oooo000();
        }
        switch (iOooo000) {
            case 1:
                return AbstractC31304OooOOo0.OooO0O0.f111756OooOoO0;
            case 2:
                return AbstractC31304OooOOo0.OooO0O0.f111755OooOoO;
            case 3:
                return AbstractC31304OooOOo0.OooO0O0.f111754OooOo0o;
            case 4:
                return AbstractC31304OooOOo0.OooO0O0.f111753OooOo;
            case 5:
            case 6:
                return AbstractC31304OooOOo0.OooO0O0.f111760OooOooO;
            case 7:
                return AbstractC31304OooOOo0.OooO0O0.f111761OooOooo;
            case 8:
            case 9:
            case 10:
            case 11:
                return AbstractC31304OooOOo0.OooO0O0.f111759OooOoo0;
            case 12:
            case 13:
            case 14:
            case 15:
                return AbstractC31304OooOOo0.OooO0O0.f111757OooOoOO;
            case 16:
            case 17:
                return AbstractC31304OooOOo0.OooO0O0.f111758OooOoo;
            case 18:
                return AbstractC31304OooOOo0.OooO0O0.f111762Oooo000;
            default:
                throw new AssertionError();
        }
    }

    public final int o000OO0o(AbstractC31304OooOOo0.OooO00o oooO00o) throws IOException {
        int iOooo000 = this.f111742OooOoo;
        if (iOooo000 == 0) {
            iOooo000 = Oooo000();
        }
        if (iOooo000 < 12 || iOooo000 > 15) {
            return -1;
        }
        if (iOooo000 == 15) {
            return Oooo0OO(this.f111746Oooo000, oooO00o);
        }
        int iO0OOO0o = this.f111741OooOoOO.o0OOO0o(oooO00o.f111752OooO0O0);
        if (iO0OOO0o != -1) {
            this.f111742OooOoo = 0;
            this.f111750OooOoO0[this.f111748OooOo0o - 1] = oooO00o.f111751OooO00o[iO0OOO0o];
            return iO0OOO0o;
        }
        String str = this.f111750OooOoO0[this.f111748OooOo0o - 1];
        String strO0000oO = o0000oO();
        int iOooo0OO = Oooo0OO(strO0000oO, oooO00o);
        if (iOooo0OO == -1) {
            this.f111742OooOoo = 15;
            this.f111746Oooo000 = strO0000oO;
            this.f111750OooOoO0[this.f111748OooOo0o - 1] = str;
        }
        return iOooo0OO;
    }

    public final void o000OOO() throws IOException {
        int iOooo000 = this.f111742OooOoo;
        if (iOooo000 == 0) {
            iOooo000 = Oooo000();
        }
        if (iOooo000 == 14) {
            long jOooo00o = this.f111741OooOoOO.Oooo00o(f111738Oooo0);
            C34524OooO0Oo c34524OooO0Oo = this.f111743OooOoo0;
            if (jOooo00o == -1) {
                jOooo00o = c34524OooO0Oo.f123723OooOo;
            }
            c34524OooO0Oo.skip(jOooo00o);
        } else if (iOooo000 == 13) {
            o000OOo0(f111740Oooo00o);
        } else if (iOooo000 == 12) {
            o000OOo0(f111739Oooo00O);
        } else if (iOooo000 != 15) {
            throw new C31299OooOOO("Expected a name but was " + o000O00O() + " at path " + OooO00o());
        }
        this.f111742OooOoo = 0;
        this.f111750OooOoO0[this.f111748OooOo0o - 1] = CloudMetaExtra.DEFINE_NON_PARENT_ID;
    }

    public final void o000OOo0(C34527OooO0oO c34527OooO0oO) throws IOException {
        while (true) {
            long jOooo00o = this.f111741OooOoOO.Oooo00o(c34527OooO0oO);
            if (jOooo00o == -1) {
                OooOOO0("Unterminated string");
                throw null;
            }
            C34524OooO0Oo c34524OooO0Oo = this.f111743OooOoo0;
            if (c34524OooO0Oo.OooOooo(jOooo00o) != 92) {
                c34524OooO0Oo.skip(jOooo00o + 1);
                return;
            } else {
                c34524OooO0Oo.skip(jOooo00o + 1);
                o0OoO0o();
            }
        }
    }

    public final void o000OOoO() throws IOException {
        int i = 0;
        do {
            int iOooo000 = this.f111742OooOoo;
            if (iOooo000 == 0) {
                iOooo000 = Oooo000();
            }
            if (iOooo000 == 3) {
                OooO0OO(1);
            } else if (iOooo000 == 1) {
                OooO0OO(3);
            } else {
                if (iOooo000 == 4) {
                    i--;
                    if (i < 0) {
                        throw new C31299OooOOO("Expected a value but was " + o000O00O() + " at path " + OooO00o());
                    }
                    this.f111748OooOo0o--;
                } else if (iOooo000 == 2) {
                    i--;
                    if (i < 0) {
                        throw new C31299OooOOO("Expected a value but was " + o000O00O() + " at path " + OooO00o());
                    }
                    this.f111748OooOo0o--;
                } else {
                    C34524OooO0Oo c34524OooO0Oo = this.f111743OooOoo0;
                    if (iOooo000 == 14 || iOooo000 == 10) {
                        long jOooo00o = this.f111741OooOoOO.Oooo00o(f111738Oooo0);
                        if (jOooo00o == -1) {
                            jOooo00o = c34524OooO0Oo.f123723OooOo;
                        }
                        c34524OooO0Oo.skip(jOooo00o);
                    } else if (iOooo000 == 9 || iOooo000 == 13) {
                        o000OOo0(f111740Oooo00o);
                    } else if (iOooo000 == 8 || iOooo000 == 12) {
                        o000OOo0(f111739Oooo00O);
                    } else if (iOooo000 == 17) {
                        c34524OooO0Oo.skip(this.f111745OooOooo);
                    } else if (iOooo000 == 18) {
                        throw new C31299OooOOO("Expected a value but was " + o000O00O() + " at path " + OooO00o());
                    }
                }
                this.f111742OooOoo = 0;
            }
            i++;
            this.f111742OooOoo = 0;
        } while (i != 0);
        int[] iArr = this.f111749OooOoO;
        int i2 = this.f111748OooOo0o - 1;
        iArr[i2] = iArr[i2] + 1;
        this.f111750OooOoO0[i2] = CloudMetaExtra.DEFINE_NON_PARENT_ID;
    }

    public final boolean o00Oo0() throws IOException {
        int iOooo000 = this.f111742OooOoo;
        if (iOooo000 == 0) {
            iOooo000 = Oooo000();
        }
        return (iOooo000 == 2 || iOooo000 == 4 || iOooo000 == 18) ? false : true;
    }

    public final boolean o0Oo0oo(int i) throws IOException {
        if (i == 9 || i == 10 || i == 12 || i == 13 || i == 32) {
            return false;
        }
        if (i != 35) {
            if (i == 44) {
                return false;
            }
            if (i != 47 && i != 61) {
                if (i == 123 || i == 125 || i == 58) {
                    return false;
                }
                if (i != 59) {
                    switch (i) {
                        case 91:
                        case 93:
                            return false;
                        case 92:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        OooOooo();
        throw null;
    }

    public final char o0OoO0o() throws IOException {
        int i;
        C34524OooO0Oo c34524OooO0Oo = this.f111741OooOoOO;
        if (!c34524OooO0Oo.request(1L)) {
            OooOOO0("Unterminated escape sequence");
            throw null;
        }
        C34524OooO0Oo c34524OooO0Oo2 = this.f111743OooOoo0;
        byte b = c34524OooO0Oo2.readByte();
        if (b == 10 || b == 34 || b == 39 || b == 47 || b == 92) {
            return (char) b;
        }
        if (b == 98) {
            return '\b';
        }
        if (b == 102) {
            return '\f';
        }
        if (b == 110) {
            return '\n';
        }
        if (b == 114) {
            return ControlChar.PARAGRAPH_BREAK_CHAR;
        }
        if (b == 116) {
            return '\t';
        }
        if (b != 117) {
            OooOOO0("Invalid escape sequence: \\" + ((char) b));
            throw null;
        }
        if (!c34524OooO0Oo.request(4L)) {
            throw new EOFException("Unterminated escape sequence at path " + OooO00o());
        }
        char c = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            byte bOooOooo = c34524OooO0Oo2.OooOooo(i2);
            char c2 = (char) (c << 4);
            if (bOooOooo >= 48 && bOooOooo <= 57) {
                i = bOooOooo - 48;
            } else if (bOooOooo >= 97 && bOooOooo <= 102) {
                i = bOooOooo - 87;
            } else {
                if (bOooOooo < 65 || bOooOooo > 70) {
                    OooOOO0("\\u".concat(c34524OooO0Oo2.o0Oo0oo(4L, C33580OooO00o.f121231OooO0O0)));
                    throw null;
                }
                i = bOooOooo - 55;
            }
            c = (char) (i + c2);
        }
        c34524OooO0Oo2.skip(4L);
        return c;
    }

    public final int ooOO(String str, AbstractC31304OooOOo0.OooO00o oooO00o) {
        int length = oooO00o.f111751OooO00o.length;
        for (int i = 0; i < length; i++) {
            if (str.equals(oooO00o.f111751OooO00o[i])) {
                this.f111742OooOoo = 0;
                int[] iArr = this.f111749OooOoO;
                int i2 = this.f111748OooOo0o - 1;
                iArr[i2] = iArr[i2] + 1;
                return i;
            }
        }
        return -1;
    }

    public final String toString() {
        return "JsonReader(" + this.f111741OooOoOO + ")";
    }
}
