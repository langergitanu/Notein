package o00oo;

import android.graphics.ColorSpace;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.OooOOO0;
import o000Ooo.C24545OooO00o;
import o00O0oo0.C24969OooOO0;
import o00o00Oo.C25261OooO0o0;
import o00o0o.AbstractC25434OooO00o;
import o00o0o00.C25438OooO00o;
import o00o0o00.C25439OooO0O0;
import o00o0o0o.C25450OooO0oo;
import o00o0o0o.InterfaceC25449OooO0oO;
import o00oOoOo.C25622OooO0O0;
import o00oOoOo.C25623OooO0OO;
import o00oOoOo.C25624OooO0Oo;
import o00ooOO.C25767OooO0OO;
import o00ooOO.C25768OooO0Oo;
import o00ooOO.C25769OooO0o;
import o00ooOO.C25770OooO0o0;
import o00ooOO.C25771OooO0oO;
import oO00ooO.C32443OooOOO;

/* JADX INFO: renamed from: o00oo.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25638OooO0oO implements Closeable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public C25623OooO0OO f87501OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final AbstractC25434OooO00o<InterfaceC25449OooO0oO> f87502OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f87503OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f87504OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f87505OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public int f87506OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public int f87507OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public int f87508OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public ColorSpace f87509OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public String f87510Oooo000;

    public C25638OooO0oO() {
        throw null;
    }

    public C25638OooO0oO(AbstractC25434OooO00o<InterfaceC25449OooO0oO> abstractC25434OooO00o) {
        this.f87501OooOo = C25623OooO0OO.f87455OooO0OO;
        this.f87504OooOoO0 = -1;
        this.f87503OooOoO = 0;
        this.f87505OooOoOO = -1;
        this.f87507OooOoo0 = -1;
        this.f87506OooOoo = 1;
        this.f87508OooOooO = -1;
        if (!AbstractC25434OooO00o.ooOO(abstractC25434OooO00o)) {
            throw new IllegalArgumentException();
        }
        this.f87502OooOo0o = abstractC25434OooO00o.clone();
    }

    public static C25638OooO0oO OooO00o(C25638OooO0oO c25638OooO0oO) {
        C25638OooO0oO c25638OooO0oO2 = null;
        if (c25638OooO0oO == null) {
            return null;
        }
        AbstractC25434OooO00o abstractC25434OooO00oOooOOO0 = AbstractC25434OooO00o.OooOOO0(c25638OooO0oO.f87502OooOo0o);
        if (abstractC25434OooO00oOooOOO0 != null) {
            try {
                c25638OooO0oO2 = new C25638OooO0oO(abstractC25434OooO00oOooOOO0);
            } catch (Throwable th) {
                abstractC25434OooO00oOooOOO0.close();
                throw th;
            }
        }
        AbstractC25434OooO00o.OooOooo(abstractC25434OooO00oOooOOO0);
        if (c25638OooO0oO2 != null) {
            c25638OooO0oO2.OooOOO0(c25638OooO0oO);
        }
        return c25638OooO0oO2;
    }

    public static void OooO0OO(C25638OooO0oO c25638OooO0oO) {
        if (c25638OooO0oO != null) {
            c25638OooO0oO.close();
        }
    }

    public static boolean Oooo00o(C25638OooO0oO c25638OooO0oO) {
        return c25638OooO0oO.f87504OooOoO0 >= 0 && c25638OooO0oO.f87505OooOoOO >= 0 && c25638OooO0oO.f87507OooOoo0 >= 0;
    }

    public static boolean Oooo0OO(C25638OooO0oO c25638OooO0oO) {
        return c25638OooO0oO != null && c25638OooO0oO.Oooo0();
    }

    public final void OooOOO0(C25638OooO0oO c25638OooO0oO) {
        c25638OooO0oO.ooOO();
        this.f87501OooOo = c25638OooO0oO.f87501OooOo;
        c25638OooO0oO.ooOO();
        this.f87505OooOoOO = c25638OooO0oO.f87505OooOoOO;
        c25638OooO0oO.ooOO();
        this.f87507OooOoo0 = c25638OooO0oO.f87507OooOoo0;
        c25638OooO0oO.ooOO();
        this.f87504OooOoO0 = c25638OooO0oO.f87504OooOoO0;
        c25638OooO0oO.ooOO();
        this.f87503OooOoO = c25638OooO0oO.f87503OooOoO;
        this.f87506OooOoo = c25638OooO0oO.f87506OooOoo;
        this.f87508OooOooO = c25638OooO0oO.OooOooo();
        c25638OooO0oO.ooOO();
        this.f87509OooOooo = c25638OooO0oO.f87509OooOooo;
    }

    public final String OooOOo0() {
        AbstractC25434OooO00o abstractC25434OooO00oOooOOO0 = AbstractC25434OooO00o.OooOOO0(this.f87502OooOo0o);
        if (abstractC25434OooO00oOooOOO0 == null) {
            return "";
        }
        int iMin = Math.min(OooOooo(), 10);
        byte[] bArr = new byte[iMin];
        try {
            ((InterfaceC25449OooO0oO) abstractC25434OooO00oOooOOO0.Oooo000()).OooO0Oo(0, 0, iMin, bArr);
            abstractC25434OooO00oOooOOO0.close();
            StringBuilder sb = new StringBuilder(iMin * 2);
            for (int i = 0; i < iMin; i++) {
                sb.append(String.format("%02X", Byte.valueOf(bArr[i])));
            }
            return sb.toString();
        } catch (Throwable th) {
            abstractC25434OooO00oOooOOO0.close();
            throw th;
        }
    }

    public final InputStream OooOOoo() {
        AbstractC25434OooO00o abstractC25434OooO00oOooOOO0 = AbstractC25434OooO00o.OooOOO0(this.f87502OooOo0o);
        if (abstractC25434OooO00oOooOOO0 == null) {
            return null;
        }
        try {
            return new C25450OooO0oo((InterfaceC25449OooO0oO) abstractC25434OooO00oOooOOO0.Oooo000());
        } finally {
            abstractC25434OooO00oOooOOO0.close();
        }
    }

    public final int OooOooo() {
        AbstractC25434OooO00o<InterfaceC25449OooO0oO> abstractC25434OooO00o = this.f87502OooOo0o;
        if (abstractC25434OooO00o == null) {
            return this.f87508OooOooO;
        }
        abstractC25434OooO00o.Oooo000();
        return abstractC25434OooO00o.Oooo000().size();
    }

    public final synchronized boolean Oooo0() {
        return AbstractC25434OooO00o.ooOO(this.f87502OooOo0o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x01b6, code lost:
    
        r2 = 0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x008a -> B:147:0x0146). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Oooo000() {
        C32443OooOOO<Integer, Integer> c32443OooOOO;
        int i;
        InputStream is = OooOOoo();
        Object obj = C25624OooO0Oo.f87458OooO0OO;
        OooOOO0.OooO0oO(is, "is");
        C32443OooOOO<Integer, Integer> c32443OooOOOOooO0Oo = null;
        InputStream inputStreamOooOOoo = null;
        c32443OooOOOOooO0Oo = null;
        c32443OooOOOOooO0Oo = null;
        c32443OooOOOOooO0Oo = null;
        c32443OooOOOOooO0Oo = null;
        c32443OooOOOOooO0Oo = null;
        try {
            C25623OooO0OO imageFormat = C25624OooO0Oo.OooO00o.OooO00o(is);
            this.f87501OooOo = imageFormat;
            C25623OooO0OO c25623OooO0OO = C25622OooO0O0.f87441OooO00o;
            OooOOO0.OooO0oO(imageFormat, "imageFormat");
            int iOooO0OO = 0;
            if ((imageFormat == C25622OooO0O0.f87445OooO0o || imageFormat == C25622OooO0O0.f87447OooO0oO || imageFormat == C25622OooO0O0.f87448OooO0oo || imageFormat == C25622OooO0O0.f87440OooO) || imageFormat == C25622OooO0O0.f87449OooOO0) {
                InputStream inputStreamOooOOoo2 = OooOOoo();
                if (inputStreamOooOOoo2 != 0) {
                    byte[] bArr = new byte[4];
                    try {
                        try {
                            try {
                                ((C25450OooO0oo) inputStreamOooOOoo2).read(bArr, 0, 4);
                                if (C25771OooO0oO.OooO00o("RIFF", bArr)) {
                                    C25771OooO0oO.OooO0OO(inputStreamOooOOoo2);
                                    ((C25450OooO0oo) inputStreamOooOOoo2).read(bArr, 0, 4);
                                    if (C25771OooO0oO.OooO00o("WEBP", bArr)) {
                                        ((C25450OooO0oo) inputStreamOooOOoo2).read(bArr, 0, 4);
                                        String strOooO0O0 = C25771OooO0oO.OooO0O0(bArr);
                                        int iHashCode = strOooO0O0.hashCode();
                                        if (iHashCode != 2640674) {
                                            if (iHashCode != 2640718) {
                                                if (iHashCode == 2640730 && strOooO0O0.equals("VP8X")) {
                                                    inputStreamOooOOoo2.skip(8L);
                                                    C32443OooOOO<Integer, Integer> c32443OooOOO2 = new C32443OooOOO<>(Integer.valueOf(((inputStreamOooOOoo2.read() & 255) | ((inputStreamOooOOoo2.read() & 255) << 8) | ((inputStreamOooOOoo2.read() & 255) << 16)) + 1), Integer.valueOf(((inputStreamOooOOoo2.read() & 255) | ((inputStreamOooOOoo2.read() & 255) << 8) | ((inputStreamOooOOoo2.read() & 255) << 16)) + 1));
                                                    try {
                                                        inputStreamOooOOoo2.close();
                                                    } catch (IOException e) {
                                                        e.printStackTrace();
                                                    }
                                                    c32443OooOOOOooO0Oo = c32443OooOOO2;
                                                    inputStreamOooOOoo2 = inputStreamOooOOoo2;
                                                } else {
                                                    inputStreamOooOOoo2.close();
                                                    inputStreamOooOOoo2 = inputStreamOooOOoo2;
                                                }
                                            } else if (strOooO0O0.equals("VP8L")) {
                                                c32443OooOOOOooO0Oo = C25771OooO0oO.OooO0o0(inputStreamOooOOoo2);
                                                inputStreamOooOOoo2.close();
                                                inputStreamOooOOoo2 = inputStreamOooOOoo2;
                                            } else {
                                                inputStreamOooOOoo2.close();
                                                inputStreamOooOOoo2 = inputStreamOooOOoo2;
                                            }
                                        } else if (strOooO0O0.equals("VP8 ")) {
                                            c32443OooOOOOooO0Oo = C25771OooO0oO.OooO0Oo(inputStreamOooOOoo2);
                                            inputStreamOooOOoo2.close();
                                            inputStreamOooOOoo2 = inputStreamOooOOoo2;
                                        } else {
                                            inputStreamOooOOoo2.close();
                                            inputStreamOooOOoo2 = inputStreamOooOOoo2;
                                        }
                                    } else {
                                        inputStreamOooOOoo2.close();
                                        inputStreamOooOOoo2 = inputStreamOooOOoo2;
                                    }
                                } else {
                                    inputStreamOooOOoo2.close();
                                    inputStreamOooOOoo2 = inputStreamOooOOoo2;
                                }
                            } catch (IOException e2) {
                                e2.printStackTrace();
                                inputStreamOooOOoo2.close();
                            }
                        } catch (IOException e3) {
                            e3.printStackTrace();
                            inputStreamOooOOoo2 = e3;
                        }
                        if (c32443OooOOOOooO0Oo != null) {
                            this.f87505OooOoOO = c32443OooOOOOooO0Oo.f116638OooOo0o.intValue();
                            this.f87507OooOoo0 = c32443OooOOOOooO0Oo.f116637OooOo.intValue();
                        }
                    } catch (Throwable th) {
                        try {
                            inputStreamOooOOoo2.close();
                        } catch (IOException e4) {
                            e4.printStackTrace();
                        }
                        throw th;
                    }
                }
                c32443OooOOO = c32443OooOOOOooO0Oo;
            } else {
                try {
                    inputStreamOooOOoo = OooOOoo();
                    C25768OooO0Oo c25768OooO0OoOooO00o = C25767OooO0OO.OooO00o(inputStreamOooOOoo);
                    this.f87509OooOooo = c25768OooO0OoOooO00o.f87941OooO00o;
                    c32443OooOOO = c25768OooO0OoOooO00o.f87942OooO0O0;
                    if (c32443OooOOO != null) {
                        this.f87505OooOoOO = c32443OooOOO.f116638OooOo0o.intValue();
                        this.f87507OooOoo0 = c32443OooOOO.f116637OooOo.intValue();
                    }
                    try {
                        inputStreamOooOOoo.close();
                    } catch (IOException unused) {
                    }
                } catch (Throwable th2) {
                    if (inputStreamOooOOoo != null) {
                        try {
                            inputStreamOooOOoo.close();
                        } catch (IOException unused2) {
                        }
                    }
                    throw th2;
                }
            }
            if (imageFormat != C25622OooO0O0.f87441OooO00o || this.f87504OooOoO0 != -1) {
                if (imageFormat != C25622OooO0O0.f87450OooOO0O || this.f87504OooOoO0 != -1) {
                    if (this.f87504OooOoO0 == -1) {
                        this.f87504OooOoO0 = 0;
                        return;
                    }
                    return;
                }
                InputStream inputStreamOooOOoo3 = OooOOoo();
                if (inputStreamOooOOoo3 != null) {
                    try {
                        iOooO0OO = new C24545OooO00o(inputStreamOooOOoo3).OooO0OO(1);
                    } catch (IOException e5) {
                        if (C25438OooO00o.f86720OooO00o.OooO00o(3)) {
                            C25439OooO0O0.OooO0OO(3, "HeifExifUtil", "Failed reading Heif Exif orientation -> ignoring", e5);
                        }
                    }
                } else if (C25438OooO00o.f86720OooO00o.OooO00o(3)) {
                    C25439OooO0O0.OooO0O0(3, "HeifExifUtil", "Trying to read Heif Exif from null inputStream -> ignoring");
                }
                this.f87503OooOoO = iOooO0OO;
                this.f87504OooOoO0 = C25261OooO0o0.OooO0o0(iOooO0OO);
                return;
            }
            if (c32443OooOOO != null) {
                InputStream inputStream = OooOOoo();
                OooOOO0.OooO0oO(inputStream, "inputStream");
                while (true) {
                    if (C25770OooO0o0.OooO00o(inputStream, 1, false) != 255) {
                        break;
                    }
                    int iOooO00o = 255;
                    while (iOooO00o == 255) {
                        iOooO00o = C25770OooO0o0.OooO00o(inputStream, 1, false);
                    }
                    if (iOooO00o == 225) {
                        int iOooO00o2 = C25770OooO0o0.OooO00o(inputStream, 2, false);
                        if (iOooO00o2 - 2 > 6) {
                            int iOooO00o3 = C25770OooO0o0.OooO00o(inputStream, 4, false);
                            int iOooO00o4 = C25770OooO0o0.OooO00o(inputStream, 2, false);
                            i = iOooO00o2 - 8;
                            if (iOooO00o3 != 1165519206 || iOooO00o4 != 0) {
                                break;
                            }
                        }
                        this.f87503OooOoO = iOooO0OO;
                        this.f87504OooOoO0 = C25261OooO0o0.OooO0o0(iOooO0OO);
                    }
                    if (iOooO00o != 1 && iOooO00o != 216) {
                        if (iOooO00o == 217 || iOooO00o == 218) {
                            break;
                        } else {
                            inputStream.skip(C25770OooO0o0.OooO00o(inputStream, 2, false) - 2);
                        }
                    }
                }
                if (i != 0) {
                    iOooO0OO = C25769OooO0o.OooO00o(inputStream, i);
                }
                this.f87503OooOoO = iOooO0OO;
                this.f87504OooOoO0 = C25261OooO0o0.OooO0o0(iOooO0OO);
            }
        } catch (IOException e6) {
            C24969OooOO0.OooO0o(e6);
            throw null;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        AbstractC25434OooO00o.OooOooo(this.f87502OooOo0o);
    }

    public final void ooOO() {
        if (this.f87505OooOoOO < 0 || this.f87507OooOoo0 < 0) {
            Oooo000();
        }
    }
}
