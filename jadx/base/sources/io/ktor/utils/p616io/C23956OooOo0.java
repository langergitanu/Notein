package io.ktor.utils.p616io;

import io.ktor.utils.p616io.internal.C23995OooO0o0;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import kotlin.jvm.internal.C24030OooOoo;
import kotlin.jvm.internal.C24033OooOooo;
import kotlin.jvm.internal.C24034Oooo00O;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import oO00Oo00.C32270OooO0Oo;
import oO00Oo00.OooO0OO;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: io.ktor.utils.io.OooOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C23956OooOo0 extends OooOOOO implements InterfaceC32507OooOO0o<ByteBuffer, C32460OooOooO> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ int f80622OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C24034Oooo00O<ByteBuffer> f80623OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C24033OooOooo f80624OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ char[] f80625OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ C24033OooOooo f80626OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final /* synthetic */ C24030OooOoo f80627OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ C24030OooOoo f80628OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final /* synthetic */ Appendable f80629OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final /* synthetic */ C24033OooOooo f80630OooOooo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23956OooOo0(C24034Oooo00O<ByteBuffer> c24034Oooo00O, int i, char[] cArr, C24033OooOooo c24033OooOooo, C24033OooOooo c24033OooOooo2, C24030OooOoo c24030OooOoo, C24030OooOoo c24030OooOoo2, Appendable appendable, C24033OooOooo c24033OooOooo3) {
        super(1);
        this.f80623OooOo0o = c24034Oooo00O;
        this.f80622OooOo = i;
        this.f80625OooOoO0 = cArr;
        this.f80624OooOoO = c24033OooOooo;
        this.f80626OooOoOO = c24033OooOooo2;
        this.f80628OooOoo0 = c24030OooOoo;
        this.f80627OooOoo = c24030OooOoo2;
        this.f80629OooOooO = appendable;
        this.f80630OooOooo = c24033OooOooo3;
    }

    /* JADX WARN: Type inference failed for: r2v44, types: [T, java.lang.Object] */
    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final C32460OooOooO invoke(ByteBuffer byteBuffer) throws IOException {
        int i;
        long jOooO00o;
        long jOooO00o2;
        boolean z;
        int i2;
        boolean z2;
        boolean z3;
        char c;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        char c2;
        boolean z11;
        boolean z12;
        ByteBuffer buffer = byteBuffer;
        OooOOO0.OooO0oO(buffer, "buffer");
        int iPosition = buffer.position();
        C24034Oooo00O<ByteBuffer> c24034Oooo00O = this.f80623OooOo0o;
        ByteBuffer byteBuffer2 = c24034Oooo00O.f80942OooOo0o;
        if (byteBuffer2 != null) {
            int iLimit = buffer.limit();
            buffer.limit(Math.min(buffer.limit(), byteBuffer2.remaining() + buffer.position()));
            byteBuffer2.put(buffer);
            byteBuffer2.flip();
            buffer.limit(iLimit);
        } else {
            byteBuffer2 = buffer;
        }
        int i3 = this.f80622OooOo;
        C24033OooOooo c24033OooOooo = this.f80624OooOoO;
        char[] out = this.f80625OooOoO0;
        int length = out.length;
        if (i3 != Integer.MAX_VALUE) {
            length = Math.min(length, i3 - c24033OooOooo.f80940OooOo0o);
        }
        OooOOO0.OooO0oO(out, "out");
        if (byteBuffer2.hasArray()) {
            byte[] bArrArray = byteBuffer2.array();
            int iPosition2 = byteBuffer2.position() + byteBuffer2.arrayOffset();
            int iRemaining = byteBuffer2.remaining() + iPosition2;
            if (iPosition2 > iRemaining) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (iRemaining > bArrArray.length) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (length > out.length) {
                throw C32270OooO0Oo.OooO0O0(length, out.length);
            }
            boolean z13 = false;
            int i4 = 0;
            while (iPosition2 < iRemaining && i4 < length) {
                int i5 = iPosition2 + 1;
                byte b = bArrArray[iPosition2];
                if (b >= 0) {
                    char c3 = (char) b;
                    i = iPosition;
                    if (c3 == '\r') {
                        z8 = true;
                        z13 = true;
                    } else if (c3 == '\n') {
                        z8 = false;
                        z13 = false;
                    } else {
                        z8 = !z13;
                    }
                    if (!z8) {
                        byteBuffer2.position(iPosition2 - byteBuffer2.arrayOffset());
                        jOooO00o2 = C32270OooO0Oo.OooO00o(i4, -1);
                        break;
                    }
                    out[i4] = c3;
                    i4++;
                    iPosition2 = i5;
                    iPosition = i;
                } else {
                    i = iPosition;
                    z7 = z13;
                    if ((b & 224) == 192) {
                        if (i5 >= iRemaining) {
                            byteBuffer2.position(iPosition2 - byteBuffer2.arrayOffset());
                            jOooO00o2 = C32270OooO0Oo.OooO00o(i4, 2);
                            break;
                        }
                        int i6 = iPosition2 + 2;
                        char c4 = (char) ((bArrArray[i5] & 63) | ((b & 31) << 6));
                        if (c4 == '\r') {
                            z9 = true;
                            z7 = true;
                        } else if (c4 == '\n') {
                            z9 = false;
                            z7 = false;
                        } else {
                            z9 = !z7;
                        }
                        if (!z9) {
                            byteBuffer2.position(iPosition2 - byteBuffer2.arrayOffset());
                            jOooO00o2 = C32270OooO0Oo.OooO00o(i4, -1);
                            break;
                        }
                        out[i4] = c4;
                        i4++;
                        z13 = z7;
                        iPosition2 = i6;
                        iPosition = i;
                    } else {
                        if ((b & 240) != 224) {
                            if ((b & 248) != 240) {
                                C32270OooO0Oo.OooO0Oo(b);
                                throw null;
                            }
                            if (iRemaining - i5 < 3) {
                                byteBuffer2.position(iPosition2 - byteBuffer2.arrayOffset());
                                jOooO00o2 = C32270OooO0Oo.OooO00o(i4, 4);
                                break;
                            }
                            int i7 = iPosition2 + 4;
                            int i8 = ((bArrArray[iPosition2 + 2] & 63) << 6) | ((bArrArray[i5] & 63) << 12) | ((b & 7) << 18) | (bArrArray[iPosition2 + 3] & 63);
                            if (i8 > 1114111) {
                                C32270OooO0Oo.OooO0OO(i8);
                                throw null;
                            }
                            if (length - i4 < 2) {
                                byteBuffer2.position(iPosition2 - byteBuffer2.arrayOffset());
                                jOooO00o2 = C32270OooO0Oo.OooO00o(i4, 0);
                                break;
                            }
                            char c5 = (char) ((i8 >>> 10) + 55232);
                            char c6 = (char) ((i8 & 1023) + 56320);
                            if (c5 == '\r') {
                                z11 = true;
                                z7 = true;
                                c2 = '\n';
                            } else {
                                c2 = '\n';
                                if (c5 == '\n') {
                                    z11 = false;
                                    z7 = false;
                                } else {
                                    z11 = !z7;
                                }
                            }
                            if (z11) {
                                if (c6 == '\r') {
                                    z12 = true;
                                    z7 = true;
                                } else if (c6 == c2) {
                                    z12 = false;
                                    z7 = false;
                                } else {
                                    z12 = !z7;
                                }
                                if (z12) {
                                    int i9 = i4 + 1;
                                    out[i4] = c5;
                                    i4 += 2;
                                    out[i9] = c6;
                                    iPosition = i;
                                    z13 = z7;
                                    iPosition2 = i7;
                                }
                            }
                            z13 = z7;
                            byteBuffer2.position(iPosition2 - byteBuffer2.arrayOffset());
                            jOooO00o2 = C32270OooO0Oo.OooO00o(i4, -1);
                            break;
                        }
                        if (iRemaining - i5 < 2) {
                            byteBuffer2.position(iPosition2 - byteBuffer2.arrayOffset());
                            jOooO00o2 = C32270OooO0Oo.OooO00o(i4, 3);
                            break;
                        }
                        byte b2 = bArrArray[i5];
                        i5 = iPosition2 + 3;
                        char c7 = (char) ((bArrArray[iPosition2 + 2] & 63) | ((b2 & 63) << 6) | ((b & 15) << 12));
                        if (c7 == '\r') {
                            z13 = true;
                            z10 = true;
                        } else {
                            if (c7 == '\n') {
                                z13 = false;
                            } else if (z7) {
                                z13 = z7;
                            } else {
                                z10 = true;
                                z13 = z7;
                            }
                            z10 = false;
                        }
                        if (!z10) {
                            byteBuffer2.position((iPosition2 - 1) - byteBuffer2.arrayOffset());
                            jOooO00o2 = C32270OooO0Oo.OooO00o(i4, -1);
                            break;
                        }
                        out[i4] = c7;
                        i4++;
                        iPosition2 = i5;
                        iPosition = i;
                    }
                }
            }
            i = iPosition;
            z7 = z13;
            byteBuffer2.position(iPosition2 - byteBuffer2.arrayOffset());
            jOooO00o2 = C32270OooO0Oo.OooO00o(i4, 0);
            z13 = z7;
            int i10 = (int) (jOooO00o2 & 4294967295L);
            if (i10 == -1) {
                int i11 = (int) (jOooO00o2 >> 32);
                if (z13) {
                    jOooO00o2 = C32270OooO0Oo.OooO00o(i11 - 1, -1);
                } else {
                    byteBuffer2.position(byteBuffer2.position() + 1);
                    if (i11 > 0) {
                        int i12 = i11 - 1;
                        if (out[i12] == '\r') {
                            jOooO00o2 = C32270OooO0Oo.OooO00o(i12, -1);
                        }
                    }
                }
            } else if (i10 == 0 && z13) {
                byteBuffer2.position(byteBuffer2.position() - 1);
                jOooO00o2 = C32270OooO0Oo.OooO00o(((int) (jOooO00o2 >> 32)) - 1, 2);
            }
        } else {
            i = iPosition;
            if (length > out.length) {
                throw C32270OooO0Oo.OooO0O0(length, out.length);
            }
            boolean z14 = false;
            int i13 = 0;
            while (byteBuffer2.hasRemaining() && i13 < length) {
                byte b3 = byteBuffer2.get();
                if (b3 >= 0) {
                    char c8 = (char) b3;
                    if (c8 == '\r') {
                        z14 = true;
                        z = true;
                    } else {
                        if (c8 == '\n') {
                            z14 = false;
                        } else if (!z14) {
                            z = true;
                        }
                        z = false;
                    }
                    if (!z) {
                        byteBuffer2.position(byteBuffer2.position() - 1);
                        jOooO00o2 = C32270OooO0Oo.OooO00o(i13, -1);
                        break;
                    }
                    i2 = i13 + 1;
                    out[i13] = c8;
                    i13 = i2;
                } else if ((b3 & 224) == 192) {
                    if (!byteBuffer2.hasRemaining()) {
                        byteBuffer2.position(byteBuffer2.position() - 1);
                        jOooO00o2 = C32270OooO0Oo.OooO00o(i13, 2);
                        break;
                    }
                    char c9 = (char) (((b3 & 31) << 6) | (byteBuffer2.get() & 63));
                    if (c9 == '\r') {
                        z14 = true;
                        z2 = true;
                    } else {
                        if (c9 == '\n') {
                            z14 = false;
                        } else if (!z14) {
                            z2 = true;
                        }
                        z2 = false;
                    }
                    if (!z2) {
                        byteBuffer2.position(byteBuffer2.position() - 2);
                        jOooO00o2 = C32270OooO0Oo.OooO00o(i13, -1);
                        break;
                    }
                    i2 = i13 + 1;
                    out[i13] = c9;
                    i13 = i2;
                } else {
                    if ((b3 & 240) != 224) {
                        if ((b3 & 248) != 240) {
                            C32270OooO0Oo.OooO0Oo(b3);
                            throw null;
                        }
                        if (byteBuffer2.remaining() < 3) {
                            byteBuffer2.position(byteBuffer2.position() - 1);
                            jOooO00o2 = C32270OooO0Oo.OooO00o(i13, 4);
                            break;
                        }
                        int i14 = ((b3 & 7) << 18) | ((byteBuffer2.get() & 63) << 12) | ((byteBuffer2.get() & 63) << 6) | (byteBuffer2.get() & 63);
                        if (i14 > 1114111) {
                            C32270OooO0Oo.OooO0OO(i14);
                            throw null;
                        }
                        if (length - i13 < 2) {
                            byteBuffer2.position(byteBuffer2.position() - 4);
                            jOooO00o = C32270OooO0Oo.OooO00o(i13, 0);
                            break;
                        }
                        char c10 = (char) ((i14 >>> 10) + 55232);
                        char c11 = (char) ((i14 & 1023) + 56320);
                        if (c10 == '\r') {
                            z5 = true;
                            z4 = true;
                            c = '\n';
                        } else {
                            c = '\n';
                            if (c10 == '\n') {
                                z5 = false;
                                z4 = false;
                            } else if (z14) {
                                z4 = z14;
                                z5 = false;
                            } else {
                                z4 = z14;
                                z5 = true;
                            }
                        }
                        if (z5) {
                            if (c11 == '\r') {
                                z14 = true;
                                z6 = true;
                            } else {
                                if (c11 == c) {
                                    z14 = false;
                                } else if (z4) {
                                    z14 = z4;
                                } else {
                                    z6 = true;
                                    z14 = z4;
                                }
                                z6 = false;
                            }
                            if (z6) {
                                int i15 = i13 + 1;
                                out[i13] = c10;
                                i13 += 2;
                                out[i15] = c11;
                            }
                        } else {
                            z14 = z4;
                        }
                        byteBuffer2.position(byteBuffer2.position() - 4);
                        jOooO00o2 = C32270OooO0Oo.OooO00o(i13, -1);
                        break;
                    }
                    if (byteBuffer2.remaining() < 2) {
                        byteBuffer2.position(byteBuffer2.position() - 1);
                        jOooO00o2 = C32270OooO0Oo.OooO00o(i13, 3);
                        break;
                    }
                    char c12 = (char) (((b3 & 15) << 12) | ((byteBuffer2.get() & 63) << 6) | (byteBuffer2.get() & 63));
                    if (c12 == '\r') {
                        z14 = true;
                        z3 = true;
                    } else {
                        if (c12 == '\n') {
                            z14 = false;
                        } else if (!z14) {
                            z3 = true;
                        }
                        z3 = false;
                    }
                    if (!z3) {
                        byteBuffer2.position(byteBuffer2.position() - 3);
                        jOooO00o2 = C32270OooO0Oo.OooO00o(i13, -1);
                        break;
                    }
                    i2 = i13 + 1;
                    out[i13] = c12;
                    i13 = i2;
                }
            }
            jOooO00o = C32270OooO0Oo.OooO00o(i13, 0);
            jOooO00o2 = jOooO00o;
            int i16 = (int) (jOooO00o2 & 4294967295L);
            if (i16 == -1) {
                int i17 = (int) (jOooO00o2 >> 32);
                if (z14) {
                    jOooO00o2 = C32270OooO0Oo.OooO00o(i17 - 1, -1);
                } else {
                    byteBuffer2.position(byteBuffer2.position() + 1);
                    if (i17 > 0) {
                        int i18 = i17 - 1;
                        if (out[i18] == '\r') {
                            jOooO00o2 = C32270OooO0Oo.OooO00o(i18, -1);
                        }
                    }
                }
            } else if (i16 == 0 && z14) {
                byteBuffer2.position(byteBuffer2.position() - 1);
                jOooO00o2 = C32270OooO0Oo.OooO00o(((int) (jOooO00o2 >> 32)) - 1, 2);
            }
        }
        ByteBuffer byteBuffer3 = c24034Oooo00O.f80942OooOo0o;
        C24033OooOooo c24033OooOooo2 = this.f80630OooOooo;
        if (byteBuffer3 != null) {
            buffer.position((byteBuffer3.position() + i) - c24033OooOooo2.f80940OooOo0o);
            C23995OooO0o0.f80808OooO0O0.o00o0O(byteBuffer3);
            c24034Oooo00O.f80942OooOo0o = null;
            c24033OooOooo2.f80940OooOo0o = 0;
        }
        int i19 = (int) (jOooO00o2 >> 32);
        int i20 = (int) (jOooO00o2 & 4294967295L);
        this.f80626OooOoOO.f80940OooOo0o = Math.max(1, i20);
        C24030OooOoo c24030OooOoo = this.f80628OooOoo0;
        int i21 = -1;
        if (i20 == -1) {
            c24030OooOoo.f80938OooOo0o = true;
        }
        if (i20 != -1) {
            if (buffer.hasRemaining() && buffer.get(buffer.position()) == 13) {
                buffer.position(buffer.position() + 1);
                this.f80627OooOoo.f80938OooOo0o = true;
            }
            i21 = -1;
        }
        if (i20 != i21 && buffer.hasRemaining() && buffer.get(buffer.position()) == 10) {
            buffer.position(buffer.position() + 1);
            c24030OooOoo.f80938OooOo0o = true;
        }
        Appendable appendable = this.f80629OooOooO;
        if (appendable instanceof StringBuilder) {
            ((StringBuilder) appendable).append(out, 0, i19);
        } else {
            appendable.append(CharBuffer.wrap(out, 0, i19), 0, i19);
        }
        c24033OooOooo.f80940OooOo0o += i19;
        if (i19 == 0 && buffer.remaining() < i20) {
            ?? O0000OoO = C23995OooO0o0.f80808OooO0O0.o0000OoO();
            c24033OooOooo2.f80940OooOo0o = buffer.remaining();
            ((ByteBuffer) O0000OoO).put(buffer);
            c24034Oooo00O.f80942OooOo0o = O0000OoO;
        }
        if (i3 == Integer.MAX_VALUE || c24033OooOooo.f80940OooOo0o < i3 || c24030OooOoo.f80938OooOo0o) {
            return C32460OooOooO.f116667OooO00o;
        }
        throw new OooO0OO("Line is longer than limit");
    }
}
