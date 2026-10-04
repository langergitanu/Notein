package o00OO000;

import com.aspose.words.ControlChar;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import com.orion.notein.domain.models.cloudsync.CloudMetaExtra;
import java.io.EOFException;
import java.io.IOException;
import o00OO000.OooO0OO;
import oO0o0O0o.C33580OooO00o;
import oOo00OoO.C34524OooO0Oo;
import oOo00OoO.C34527OooO0oO;
import oOo00OoO.C34542OooOo0O;

/* JADX INFO: renamed from: o00OO000.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24982OooO0Oo extends OooO0OO {

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public static final C34527OooO0oO f84736Oooo0;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public static final C34527OooO0oO f84737Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public static final C34527OooO0oO f84738Oooo0O0;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final C34524OooO0Oo f84739OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final C34542OooOo0O f84740OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public int f84741OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public long f84742OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public int f84743Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public String f84744Oooo00O;

    static {
        C34527OooO0oO c34527OooO0oO = C34527OooO0oO.f123734OooOoO;
        f84737Oooo00o = C34527OooO0oO.OooO00o.OooO0O0("'\\");
        f84736Oooo0 = C34527OooO0oO.OooO00o.OooO0O0("\"\\");
        f84738Oooo0O0 = C34527OooO0oO.OooO00o.OooO0O0("{}[]:, \n\t\r\f/\\;#=");
        C34527OooO0oO.OooO00o.OooO0O0("\n\r");
        C34527OooO0oO.OooO00o.OooO0O0("*/");
    }

    public C24982OooO0Oo(C34542OooOo0O c34542OooOo0O) {
        this.f84719OooOo = new int[32];
        this.f84722OooOoO0 = new String[32];
        this.f84721OooOoO = new int[32];
        this.f84741OooOooO = 0;
        this.f84740OooOoo0 = c34542OooOo0O;
        this.f84739OooOoo = c34542OooOo0O.f123776OooOo;
        o00Oo0(6);
    }

    @Override // o00OO000.OooO0OO
    public final void OooO00o() throws IOException {
        int iO0000O = this.f84741OooOooO;
        if (iO0000O == 0) {
            iO0000O = o0000O();
        }
        if (iO0000O == 3) {
            o00Oo0(1);
            this.f84721OooOoO[this.f84720OooOo0o - 1] = 0;
            this.f84741OooOooO = 0;
        } else {
            throw new OooO00o("Expected BEGIN_ARRAY but was " + ooOO() + " at path " + OooOOoo());
        }
    }

    @Override // o00OO000.OooO0OO
    public final void OooO0OO() throws IOException {
        int iO0000O = this.f84741OooOooO;
        if (iO0000O == 0) {
            iO0000O = o0000O();
        }
        if (iO0000O == 1) {
            o00Oo0(3);
            this.f84741OooOooO = 0;
        } else {
            throw new OooO00o("Expected BEGIN_OBJECT but was " + ooOO() + " at path " + OooOOoo());
        }
    }

    @Override // o00OO000.OooO0OO
    public final void OooOOO0() throws IOException {
        int iO0000O = this.f84741OooOooO;
        if (iO0000O == 0) {
            iO0000O = o0000O();
        }
        if (iO0000O != 4) {
            throw new OooO00o("Expected END_ARRAY but was " + ooOO() + " at path " + OooOOoo());
        }
        int i = this.f84720OooOo0o;
        this.f84720OooOo0o = i - 1;
        int[] iArr = this.f84721OooOoO;
        int i2 = i - 2;
        iArr[i2] = iArr[i2] + 1;
        this.f84741OooOooO = 0;
    }

    @Override // o00OO000.OooO0OO
    public final void OooOOo0() throws IOException {
        int iO0000O = this.f84741OooOooO;
        if (iO0000O == 0) {
            iO0000O = o0000O();
        }
        if (iO0000O != 2) {
            throw new OooO00o("Expected END_OBJECT but was " + ooOO() + " at path " + OooOOoo());
        }
        int i = this.f84720OooOo0o;
        int i2 = i - 1;
        this.f84720OooOo0o = i2;
        this.f84722OooOoO0[i2] = null;
        int[] iArr = this.f84721OooOoO;
        int i3 = i - 2;
        iArr[i3] = iArr[i3] + 1;
        this.f84741OooOooO = 0;
    }

    @Override // o00OO000.OooO0OO
    public final boolean OooOooo() throws IOException {
        int iO0000O = this.f84741OooOooO;
        if (iO0000O == 0) {
            iO0000O = o0000O();
        }
        return (iO0000O == 2 || iO0000O == 4 || iO0000O == 18) ? false : true;
    }

    @Override // o00OO000.OooO0OO
    public final int Oooo0() throws IOException {
        int iO0000O = this.f84741OooOooO;
        if (iO0000O == 0) {
            iO0000O = o0000O();
        }
        if (iO0000O == 16) {
            long j = this.f84742OooOooo;
            int i = (int) j;
            if (j == i) {
                this.f84741OooOooO = 0;
                int[] iArr = this.f84721OooOoO;
                int i2 = this.f84720OooOo0o - 1;
                iArr[i2] = iArr[i2] + 1;
                return i;
            }
            throw new OooO00o("Expected an int but was " + this.f84742OooOooo + " at path " + OooOOoo());
        }
        if (iO0000O == 17) {
            long j2 = this.f84743Oooo000;
            C34524OooO0Oo c34524OooO0Oo = this.f84739OooOoo;
            c34524OooO0Oo.getClass();
            this.f84744Oooo00O = c34524OooO0Oo.o0Oo0oo(j2, C33580OooO00o.f121231OooO0O0);
        } else if (iO0000O == 9 || iO0000O == 8) {
            String strO0OoO0o = iO0000O == 9 ? o0OoO0o(f84736Oooo0) : o0OoO0o(f84737Oooo00o);
            this.f84744Oooo00O = strO0OoO0o;
            try {
                int i3 = Integer.parseInt(strO0OoO0o);
                this.f84741OooOooO = 0;
                int[] iArr2 = this.f84721OooOoO;
                int i4 = this.f84720OooOo0o - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return i3;
            } catch (NumberFormatException unused) {
            }
        } else if (iO0000O != 11) {
            throw new OooO00o("Expected an int but was " + ooOO() + " at path " + OooOOoo());
        }
        this.f84741OooOooO = 11;
        try {
            double d = Double.parseDouble(this.f84744Oooo00O);
            int i5 = (int) d;
            if (i5 != d) {
                throw new OooO00o("Expected an int but was " + this.f84744Oooo00O + " at path " + OooOOoo());
            }
            this.f84744Oooo00O = null;
            this.f84741OooOooO = 0;
            int[] iArr3 = this.f84721OooOoO;
            int i6 = this.f84720OooOo0o - 1;
            iArr3[i6] = iArr3[i6] + 1;
            return i5;
        } catch (NumberFormatException unused2) {
            throw new OooO00o("Expected an int but was " + this.f84744Oooo00O + " at path " + OooOOoo());
        }
    }

    @Override // o00OO000.OooO0OO
    public final boolean Oooo000() throws IOException {
        int iO0000O = this.f84741OooOooO;
        if (iO0000O == 0) {
            iO0000O = o0000O();
        }
        if (iO0000O == 5) {
            this.f84741OooOooO = 0;
            int[] iArr = this.f84721OooOoO;
            int i = this.f84720OooOo0o - 1;
            iArr[i] = iArr[i] + 1;
            return true;
        }
        if (iO0000O == 6) {
            this.f84741OooOooO = 0;
            int[] iArr2 = this.f84721OooOoO;
            int i2 = this.f84720OooOo0o - 1;
            iArr2[i2] = iArr2[i2] + 1;
            return false;
        }
        throw new OooO00o("Expected a boolean but was " + ooOO() + " at path " + OooOOoo());
    }

    @Override // o00OO000.OooO0OO
    public final double Oooo00o() throws IOException {
        int iO0000O = this.f84741OooOooO;
        if (iO0000O == 0) {
            iO0000O = o0000O();
        }
        if (iO0000O == 16) {
            this.f84741OooOooO = 0;
            int[] iArr = this.f84721OooOoO;
            int i = this.f84720OooOo0o - 1;
            iArr[i] = iArr[i] + 1;
            return this.f84742OooOooo;
        }
        if (iO0000O == 17) {
            long j = this.f84743Oooo000;
            C34524OooO0Oo c34524OooO0Oo = this.f84739OooOoo;
            c34524OooO0Oo.getClass();
            this.f84744Oooo00O = c34524OooO0Oo.o0Oo0oo(j, C33580OooO00o.f121231OooO0O0);
        } else if (iO0000O == 9) {
            this.f84744Oooo00O = o0OoO0o(f84736Oooo0);
        } else if (iO0000O == 8) {
            this.f84744Oooo00O = o0OoO0o(f84737Oooo00o);
        } else if (iO0000O == 10) {
            this.f84744Oooo00O = o000OO0o();
        } else if (iO0000O != 11) {
            throw new OooO00o("Expected a double but was " + ooOO() + " at path " + OooOOoo());
        }
        this.f84741OooOooO = 11;
        try {
            double d = Double.parseDouble(this.f84744Oooo00O);
            if (Double.isNaN(d) || Double.isInfinite(d)) {
                throw new OooO0O0("JSON forbids NaN and infinities: " + d + " at path " + OooOOoo());
            }
            this.f84744Oooo00O = null;
            this.f84741OooOooO = 0;
            int[] iArr2 = this.f84721OooOoO;
            int i2 = this.f84720OooOo0o - 1;
            iArr2[i2] = iArr2[i2] + 1;
            return d;
        } catch (NumberFormatException unused) {
            throw new OooO00o("Expected a double but was " + this.f84744Oooo00O + " at path " + OooOOoo());
        }
    }

    @Override // o00OO000.OooO0OO
    public final String Oooo0OO() throws IOException {
        String strO0Oo0oo;
        int iO0000O = this.f84741OooOooO;
        if (iO0000O == 0) {
            iO0000O = o0000O();
        }
        if (iO0000O == 10) {
            strO0Oo0oo = o000OO0o();
        } else if (iO0000O == 9) {
            strO0Oo0oo = o0OoO0o(f84736Oooo0);
        } else if (iO0000O == 8) {
            strO0Oo0oo = o0OoO0o(f84737Oooo00o);
        } else if (iO0000O == 11) {
            strO0Oo0oo = this.f84744Oooo00O;
            this.f84744Oooo00O = null;
        } else if (iO0000O == 16) {
            strO0Oo0oo = Long.toString(this.f84742OooOooo);
        } else {
            if (iO0000O != 17) {
                throw new OooO00o("Expected a string but was " + ooOO() + " at path " + OooOOoo());
            }
            long j = this.f84743Oooo000;
            C34524OooO0Oo c34524OooO0Oo = this.f84739OooOoo;
            c34524OooO0Oo.getClass();
            strO0Oo0oo = c34524OooO0Oo.o0Oo0oo(j, C33580OooO00o.f121231OooO0O0);
        }
        this.f84741OooOooO = 0;
        int[] iArr = this.f84721OooOoO;
        int i = this.f84720OooOo0o - 1;
        iArr[i] = iArr[i] + 1;
        return strO0Oo0oo;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f84741OooOooO = 0;
        this.f84719OooOo[0] = 8;
        this.f84720OooOo0o = 1;
        this.f84739OooOoo.OooO00o();
        this.f84740OooOoo0.close();
    }

    @Override // o00OO000.OooO0OO
    public final void o00000OO() throws IOException {
        int iO0000O = this.f84741OooOooO;
        if (iO0000O == 0) {
            iO0000O = o0000O();
        }
        if (iO0000O == 14) {
            long jOooO0OO = this.f84740OooOoo0.OooO0OO(f84738Oooo0O0);
            C34524OooO0Oo c34524OooO0Oo = this.f84739OooOoo;
            if (jOooO0OO == -1) {
                jOooO0OO = c34524OooO0Oo.f123723OooOo;
            }
            c34524OooO0Oo.skip(jOooO0OO);
        } else if (iO0000O == 13) {
            o000OOo0(f84736Oooo0);
        } else if (iO0000O == 12) {
            o000OOo0(f84737Oooo00o);
        } else if (iO0000O != 15) {
            throw new OooO00o("Expected a name but was " + ooOO() + " at path " + OooOOoo());
        }
        this.f84741OooOooO = 0;
        this.f84722OooOoO0[this.f84720OooOo0o - 1] = CloudMetaExtra.DEFINE_NON_PARENT_ID;
    }

    @Override // o00OO000.OooO0OO
    public final void o00000oO() throws IOException {
        int i = 0;
        do {
            int iO0000O = this.f84741OooOooO;
            if (iO0000O == 0) {
                iO0000O = o0000O();
            }
            if (iO0000O == 3) {
                o00Oo0(1);
            } else if (iO0000O == 1) {
                o00Oo0(3);
            } else {
                if (iO0000O == 4) {
                    i--;
                    if (i < 0) {
                        throw new OooO00o("Expected a value but was " + ooOO() + " at path " + OooOOoo());
                    }
                    this.f84720OooOo0o--;
                } else if (iO0000O == 2) {
                    i--;
                    if (i < 0) {
                        throw new OooO00o("Expected a value but was " + ooOO() + " at path " + OooOOoo());
                    }
                    this.f84720OooOo0o--;
                } else {
                    C34524OooO0Oo c34524OooO0Oo = this.f84739OooOoo;
                    if (iO0000O == 14 || iO0000O == 10) {
                        long jOooO0OO = this.f84740OooOoo0.OooO0OO(f84738Oooo0O0);
                        if (jOooO0OO == -1) {
                            jOooO0OO = c34524OooO0Oo.f123723OooOo;
                        }
                        c34524OooO0Oo.skip(jOooO0OO);
                    } else if (iO0000O == 9 || iO0000O == 13) {
                        o000OOo0(f84736Oooo0);
                    } else if (iO0000O == 8 || iO0000O == 12) {
                        o000OOo0(f84737Oooo00o);
                    } else if (iO0000O == 17) {
                        c34524OooO0Oo.skip(this.f84743Oooo000);
                    } else if (iO0000O == 18) {
                        throw new OooO00o("Expected a value but was " + ooOO() + " at path " + OooOOoo());
                    }
                }
                this.f84741OooOooO = 0;
            }
            i++;
            this.f84741OooOooO = 0;
        } while (i != 0);
        int[] iArr = this.f84721OooOoO;
        int i2 = this.f84720OooOo0o - 1;
        iArr[i2] = iArr[i2] + 1;
        this.f84722OooOoO0[i2] = CloudMetaExtra.DEFINE_NON_PARENT_ID;
    }

    /* JADX WARN: Code restructure failed: missing block: B:135:0x0195, code lost:
    
        if (o0000o0(r10) != false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0197, code lost:
    
        if (r1 != 2) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0199, code lost:
    
        if (r4 == false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x019f, code lost:
    
        if (r12 != Long.MIN_VALUE) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x01a1, code lost:
    
        if (r9 == false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x01a5, code lost:
    
        if (r12 != r17) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x01a7, code lost:
    
        if (r9 != false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x01a9, code lost:
    
        if (r9 == false) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x01ac, code lost:
    
        r12 = -r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x01ad, code lost:
    
        r22.f84742OooOooo = r12;
        r7.skip(r2);
        r9 = 16;
        r22.f84741OooOooO = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x01b8, code lost:
    
        if (r1 == 2) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x01bb, code lost:
    
        if (r1 == 4) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x01be, code lost:
    
        if (r1 != 7) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x01c0, code lost:
    
        r22.f84743Oooo000 = r2;
        r9 = 17;
        r22.f84741OooOooO = 17;
     */
    /* JADX WARN: Removed duplicated region for block: B:172:0x01ed A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0115 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int o0000O() throws IOException {
        int i;
        String str;
        String str2;
        long j;
        char cOooOooo;
        int i2;
        char c;
        int[] iArr = this.f84719OooOo;
        int i3 = this.f84720OooOo0o - 1;
        int i4 = iArr[i3];
        C34524OooO0Oo c34524OooO0Oo = this.f84739OooOoo;
        if (i4 == 1) {
            iArr[i3] = 2;
        } else if (i4 == 2) {
            int iO000O00O = o000O00O(true);
            c34524OooO0Oo.readByte();
            if (iO000O00O != 44) {
                if (iO000O00O == 59) {
                    o0000O0O();
                    throw null;
                }
                if (iO000O00O == 93) {
                    this.f84741OooOooO = 4;
                    return 4;
                }
                o0000oO("Unterminated array");
                throw null;
            }
        } else {
            if (i4 == 3 || i4 == 5) {
                iArr[i3] = 4;
                if (i4 == 5) {
                    int iO000O00O2 = o000O00O(true);
                    c34524OooO0Oo.readByte();
                    if (iO000O00O2 != 44) {
                        if (iO000O00O2 == 59) {
                            o0000O0O();
                            throw null;
                        }
                        if (iO000O00O2 == 125) {
                            this.f84741OooOooO = 2;
                            return 2;
                        }
                        o0000oO("Unterminated object");
                        throw null;
                    }
                }
                int iO000O00O3 = o000O00O(true);
                if (iO000O00O3 == 34) {
                    c34524OooO0Oo.readByte();
                    this.f84741OooOooO = 13;
                    return 13;
                }
                if (iO000O00O3 == 39) {
                    c34524OooO0Oo.readByte();
                    o0000O0O();
                    throw null;
                }
                if (iO000O00O3 != 125) {
                    o0000O0O();
                    throw null;
                }
                if (i4 == 5) {
                    o0000oO("Expected name");
                    throw null;
                }
                c34524OooO0Oo.readByte();
                this.f84741OooOooO = 2;
                return 2;
            }
            if (i4 == 4) {
                iArr[i3] = 5;
                int iO000O00O4 = o000O00O(true);
                c34524OooO0Oo.readByte();
                if (iO000O00O4 != 58) {
                    if (iO000O00O4 != 61) {
                        o0000oO("Expected ':'");
                        throw null;
                    }
                    o0000O0O();
                    throw null;
                }
            } else if (i4 == 6) {
                iArr[i3] = 7;
            } else {
                if (i4 == 7) {
                    if (o000O00O(false) == -1) {
                        this.f84741OooOooO = 18;
                        return 18;
                    }
                    o0000O0O();
                    throw null;
                }
                if (i4 == 8) {
                    throw new IllegalStateException("JsonReader is closed");
                }
            }
        }
        int iO000O00O5 = o000O00O(true);
        if (iO000O00O5 == 34) {
            c34524OooO0Oo.readByte();
            this.f84741OooOooO = 9;
            return 9;
        }
        if (iO000O00O5 == 39) {
            o0000O0O();
            throw null;
        }
        if (iO000O00O5 != 44 && iO000O00O5 != 59) {
            if (iO000O00O5 == 91) {
                c34524OooO0Oo.readByte();
                this.f84741OooOooO = 3;
                return 3;
            }
            if (iO000O00O5 != 93) {
                if (iO000O00O5 == 123) {
                    c34524OooO0Oo.readByte();
                    this.f84741OooOooO = 1;
                    return 1;
                }
                byte bOooOooo = c34524OooO0Oo.OooOooo(0L);
                C34542OooOo0O c34542OooOo0O = this.f84740OooOoo0;
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
                        if (!c34542OooOo0O.request(i6)) {
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
                            if (o0000o0(c34524OooO0Oo.OooOooo(j))) {
                                o0000O0O();
                                throw null;
                            }
                            o0000oO("Expected value");
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
                        if (!c34542OooOo0O.request(i8) || ((cOooOooo = c34524OooO0Oo.OooOooo(i7)) != str2.charAt(i7) && cOooOooo != str.charAt(i7))) {
                            break;
                        }
                        i7 = i8;
                    } else if (!c34542OooOo0O.request(length + 1) || !o0000o0(c34524OooO0Oo.OooOooo(length))) {
                        c34524OooO0Oo.skip(length);
                        this.f84741OooOooO = i;
                    }
                }
                i = 0;
                if (i == 0) {
                }
            } else if (i4 == 1) {
                c34524OooO0Oo.readByte();
                this.f84741OooOooO = 4;
                return 4;
            }
        }
        if (i4 == 1 || i4 == 2) {
            o0000O0O();
            throw null;
        }
        o0000oO("Unexpected value");
        throw null;
    }

    public final void o0000O0O() throws IOException {
        o0000oO("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    public final int o0000Oo0(String str, OooO0OO.OooO00o oooO00o) {
        int length = oooO00o.f84723OooO00o.length;
        for (int i = 0; i < length; i++) {
            if (str.equals(oooO00o.f84723OooO00o[i])) {
                this.f84741OooOooO = 0;
                this.f84722OooOoO0[this.f84720OooOo0o - 1] = str;
                return i;
            }
        }
        return -1;
    }

    public final boolean o0000o0(int i) throws IOException {
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
        o0000O0O();
        throw null;
    }

    public final String o0000ooO() throws IOException {
        String strO0OoO0o;
        int iO0000O = this.f84741OooOooO;
        if (iO0000O == 0) {
            iO0000O = o0000O();
        }
        if (iO0000O == 14) {
            strO0OoO0o = o000OO0o();
        } else if (iO0000O == 13) {
            strO0OoO0o = o0OoO0o(f84736Oooo0);
        } else if (iO0000O == 12) {
            strO0OoO0o = o0OoO0o(f84737Oooo00o);
        } else {
            if (iO0000O != 15) {
                throw new OooO00o("Expected a name but was " + ooOO() + " at path " + OooOOoo());
            }
            strO0OoO0o = this.f84744Oooo00O;
        }
        this.f84741OooOooO = 0;
        this.f84722OooOoO0[this.f84720OooOo0o - 1] = strO0OoO0o;
        return strO0OoO0o;
    }

    public final int o000O00O(boolean z) throws IOException {
        int i = 0;
        while (true) {
            int i2 = i + 1;
            C34542OooOo0O c34542OooOo0O = this.f84740OooOoo0;
            if (!c34542OooOo0O.request(i2)) {
                if (z) {
                    throw new EOFException("End of input");
                }
                return -1;
            }
            long j = i;
            C34524OooO0Oo c34524OooO0Oo = this.f84739OooOoo;
            byte bOooOooo = c34524OooO0Oo.OooOooo(j);
            if (bOooOooo != 10 && bOooOooo != 32 && bOooOooo != 13 && bOooOooo != 9) {
                c34524OooO0Oo.skip(j);
                if (bOooOooo == 47) {
                    if (c34542OooOo0O.request(2L)) {
                        o0000O0O();
                        throw null;
                    }
                } else if (bOooOooo == 35) {
                    o0000O0O();
                    throw null;
                }
                return bOooOooo;
            }
            i = i2;
        }
    }

    public final String o000OO0o() throws IOException {
        long jOooO0OO = this.f84740OooOoo0.OooO0OO(f84738Oooo0O0);
        C34524OooO0Oo c34524OooO0Oo = this.f84739OooOoo;
        if (jOooO0OO == -1) {
            return c34524OooO0Oo.o00000OO();
        }
        c34524OooO0Oo.getClass();
        return c34524OooO0Oo.o0Oo0oo(jOooO0OO, C33580OooO00o.f121231OooO0O0);
    }

    public final char o000OOO() throws IOException {
        int i;
        C34542OooOo0O c34542OooOo0O = this.f84740OooOoo0;
        if (!c34542OooOo0O.request(1L)) {
            o0000oO("Unterminated escape sequence");
            throw null;
        }
        C34524OooO0Oo c34524OooO0Oo = this.f84739OooOoo;
        byte b = c34524OooO0Oo.readByte();
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
            o0000oO("Invalid escape sequence: \\" + ((char) b));
            throw null;
        }
        if (!c34542OooOo0O.request(4L)) {
            throw new EOFException("Unterminated escape sequence at path " + OooOOoo());
        }
        char c = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            byte bOooOooo = c34524OooO0Oo.OooOooo(i2);
            char c2 = (char) (c << 4);
            if (bOooOooo >= 48 && bOooOooo <= 57) {
                i = bOooOooo - 48;
            } else if (bOooOooo >= 97 && bOooOooo <= 102) {
                i = bOooOooo - 87;
            } else {
                if (bOooOooo < 65 || bOooOooo > 70) {
                    o0000oO("\\u".concat(c34524OooO0Oo.o0Oo0oo(4L, C33580OooO00o.f121231OooO0O0)));
                    throw null;
                }
                i = bOooOooo - 55;
            }
            c = (char) (i + c2);
        }
        c34524OooO0Oo.skip(4L);
        return c;
    }

    public final void o000OOo0(C34527OooO0oO c34527OooO0oO) throws IOException {
        while (true) {
            long jOooO0OO = this.f84740OooOoo0.OooO0OO(c34527OooO0oO);
            if (jOooO0OO == -1) {
                o0000oO("Unterminated string");
                throw null;
            }
            C34524OooO0Oo c34524OooO0Oo = this.f84739OooOoo;
            if (c34524OooO0Oo.OooOooo(jOooO0OO) != 92) {
                c34524OooO0Oo.skip(jOooO0OO + 1);
                return;
            } else {
                c34524OooO0Oo.skip(jOooO0OO + 1);
                o000OOO();
            }
        }
    }

    @Override // o00OO000.OooO0OO
    public final int o0Oo0oo(OooO0OO.OooO00o oooO00o) throws IOException {
        int iO0000O = this.f84741OooOooO;
        if (iO0000O == 0) {
            iO0000O = o0000O();
        }
        if (iO0000O < 12 || iO0000O > 15) {
            return -1;
        }
        if (iO0000O == 15) {
            return o0000Oo0(this.f84744Oooo00O, oooO00o);
        }
        int iO0OOO0o = this.f84740OooOoo0.o0OOO0o(oooO00o.f84724OooO0O0);
        if (iO0OOO0o != -1) {
            this.f84741OooOooO = 0;
            this.f84722OooOoO0[this.f84720OooOo0o - 1] = oooO00o.f84723OooO00o[iO0OOO0o];
            return iO0OOO0o;
        }
        String str = this.f84722OooOoO0[this.f84720OooOo0o - 1];
        String strO0000ooO = o0000ooO();
        int iO0000Oo0 = o0000Oo0(strO0000ooO, oooO00o);
        if (iO0000Oo0 == -1) {
            this.f84741OooOooO = 15;
            this.f84744Oooo00O = strO0000ooO;
            this.f84722OooOoO0[this.f84720OooOo0o - 1] = str;
        }
        return iO0000Oo0;
    }

    public final String o0OoO0o(C34527OooO0oO c34527OooO0oO) throws IOException {
        StringBuilder sb = null;
        while (true) {
            long jOooO0OO = this.f84740OooOoo0.OooO0OO(c34527OooO0oO);
            if (jOooO0OO == -1) {
                o0000oO("Unterminated string");
                throw null;
            }
            C34524OooO0Oo c34524OooO0Oo = this.f84739OooOoo;
            if (c34524OooO0Oo.OooOooo(jOooO0OO) != 92) {
                if (sb == null) {
                    String strO0Oo0oo = c34524OooO0Oo.o0Oo0oo(jOooO0OO, C33580OooO00o.f121231OooO0O0);
                    c34524OooO0Oo.readByte();
                    return strO0Oo0oo;
                }
                sb.append(c34524OooO0Oo.o0Oo0oo(jOooO0OO, C33580OooO00o.f121231OooO0O0));
                c34524OooO0Oo.readByte();
                return sb.toString();
            }
            if (sb == null) {
                sb = new StringBuilder();
            }
            sb.append(c34524OooO0Oo.o0Oo0oo(jOooO0OO, C33580OooO00o.f121231OooO0O0));
            c34524OooO0Oo.readByte();
            sb.append(o000OOO());
        }
    }

    @Override // o00OO000.OooO0OO
    public final OooO0OO.OooO0O0 ooOO() throws IOException {
        int iO0000O = this.f84741OooOooO;
        if (iO0000O == 0) {
            iO0000O = o0000O();
        }
        switch (iO0000O) {
            case 1:
                return OooO0OO.OooO0O0.f84728OooOoO0;
            case 2:
                return OooO0OO.OooO0O0.f84727OooOoO;
            case 3:
                return OooO0OO.OooO0O0.f84726OooOo0o;
            case 4:
                return OooO0OO.OooO0O0.f84725OooOo;
            case 5:
            case 6:
                return OooO0OO.OooO0O0.f84732OooOooO;
            case 7:
                return OooO0OO.OooO0O0.f84733OooOooo;
            case 8:
            case 9:
            case 10:
            case 11:
                return OooO0OO.OooO0O0.f84731OooOoo0;
            case 12:
            case 13:
            case 14:
            case 15:
                return OooO0OO.OooO0O0.f84729OooOoOO;
            case 16:
            case 17:
                return OooO0OO.OooO0O0.f84730OooOoo;
            case 18:
                return OooO0OO.OooO0O0.f84734Oooo000;
            default:
                throw new AssertionError();
        }
    }

    public final String toString() {
        return "JsonReader(" + this.f84740OooOoo0 + ")";
    }
}
