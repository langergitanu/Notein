package o00oOoOo;

import OooOoOO.C20519OooO0Oo;
import io.ktor.utils.p616io.C23992OoooooO;
import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.OooOOO0;
import o000OO00.C24484Oooo0oo;
import o00o0Ooo.C25424OooO00o;
import o00o0oo0.C25471OooO0O0;
import oO00ooO.EnumC32441OooOO0O;

/* JADX INFO: renamed from: o00oOoOo.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25624OooO0Oo {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final Object f87458OooO0OO = C20519OooO0Oo.OooO0O0(EnumC32441OooOO0O.f116634OooOo0o, new C24484Oooo0oo(1));

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f87459OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C25621OooO00o f87460OooO0O0;

    /* JADX INFO: renamed from: o00oOoOo.OooO0Oo$OooO00o */
    public static final class OooO00o {
        /* JADX WARN: Removed duplicated region for block: B:115:0x0179  */
        /* JADX WARN: Removed duplicated region for block: B:116:0x017c  */
        /* JADX WARN: Removed duplicated region for block: B:137:0x01b6  */
        /* JADX WARN: Removed duplicated region for block: B:140:0x01bc A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:141:0x01bd A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0057  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x00b8  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x00c4  */
        /* JADX WARN: Removed duplicated region for block: B:95:0x0145  */
        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, oO00ooO.OooOO0] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static C25623OooO0OO OooO00o(InputStream is) throws IOException {
            int iOooO00o;
            boolean z;
            boolean z2;
            C25623OooO0OO c25623OooO0OO;
            OooOOO0.OooO0oO(is, "is");
            C25624OooO0Oo c25624OooO0Oo = (C25624OooO0Oo) C25624OooO0Oo.f87458OooO0OO.getValue();
            c25624OooO0Oo.getClass();
            int i = c25624OooO0Oo.f87459OooO00o;
            byte[] bArr = new byte[i];
            if (is.markSupported()) {
                try {
                    is.mark(i);
                    iOooO00o = C25424OooO00o.OooO00o(is, bArr, i);
                } finally {
                    is.reset();
                }
            } else {
                iOooO00o = C25424OooO00o.OooO00o(is, bArr, i);
            }
            c25624OooO0Oo.f87460OooO0O0.getClass();
            if (iOooO00o >= 20) {
                if (C25471OooO0O0.OooO0O0(0, bArr, C25471OooO0O0.f86781OooO0O0) && C25471OooO0O0.OooO0O0(8, bArr, C25471OooO0O0.f86782OooO0OO)) {
                    z = true;
                }
                if (z) {
                    byte[] bArr2 = C25621OooO00o.f87422OooO0O0;
                    if (iOooO00o < 3 || !C23992OoooooO.OooO0o0(bArr, bArr2)) {
                        byte[] bArr3 = C25621OooO00o.f87424OooO0Oo;
                        if (iOooO00o >= 8 && C23992OoooooO.OooO0o0(bArr, bArr3)) {
                            c25623OooO0OO = C25622OooO0O0.f87442OooO0O0;
                        } else if (iOooO00o >= 6 && (C23992OoooooO.OooO0o0(bArr, C25621OooO00o.f87425OooO0o) || C23992OoooooO.OooO0o0(bArr, C25621OooO00o.f87427OooO0oO))) {
                            c25623OooO0OO = C25622OooO0O0.f87443OooO0OO;
                        } else {
                            byte[] bArr4 = C25621OooO00o.f87428OooO0oo;
                            if (iOooO00o < bArr4.length ? false : C23992OoooooO.OooO0o0(bArr, bArr4)) {
                                c25623OooO0OO = C25622OooO0O0.f87444OooO0Oo;
                            } else {
                                byte[] bArr5 = C25621OooO00o.f87429OooOO0;
                                if (iOooO00o < bArr5.length ? false : C23992OoooooO.OooO0o0(bArr, bArr5)) {
                                    c25623OooO0OO = C25622OooO0O0.f87446OooO0o0;
                                } else if (iOooO00o >= 12) {
                                    boolean zOooO0OO = ((bArr.length < 4 ? -1 : ((((bArr[1] & 255) << 16) | ((bArr[0] & 255) << 24)) | ((bArr[2] & 255) << 8)) | (bArr[3] & 255)) >= 8 && C23992OoooooO.OooO0OO(4, bArr, C25621OooO00o.f87436OooOOo)) ? C23992OoooooO.OooO0OO(8, bArr, C25621OooO00o.f87438OooOOoo) : false;
                                    if (zOooO0OO) {
                                        c25623OooO0OO = C25622OooO0O0.f87452OooOOO;
                                    } else if (iOooO00o >= 12 && bArr[3] >= 8 && C23992OoooooO.OooO0OO(4, bArr, C25621OooO00o.f87431OooOO0o)) {
                                        for (byte[] bArr6 : C25621OooO00o.f87433OooOOO0) {
                                            if (C23992OoooooO.OooO0OO(8, bArr, bArr6)) {
                                                z2 = true;
                                                break;
                                            }
                                        }
                                        z2 = false;
                                        if (!z2) {
                                            c25623OooO0OO = C25622OooO0O0.f87450OooOO0O;
                                        } else if (iOooO00o >= 4 && C23992OoooooO.OooO0o0(bArr, C25621OooO00o.f87437OooOOo0)) {
                                            c25623OooO0OO = C25622OooO0O0.f87453OooOOO0;
                                        } else {
                                            if (iOooO00o < C25621OooO00o.f87435OooOOOo || (!C23992OoooooO.OooO0o0(bArr, C25621OooO00o.f87432OooOOO) && !C23992OoooooO.OooO0o0(bArr, C25621OooO00o.f87434OooOOOO))) {
                                                z = false;
                                            }
                                            c25623OooO0OO = z ? C25622OooO0O0.f87451OooOO0o : C25623OooO0OO.f87455OooO0OO;
                                        }
                                    } else {
                                        z2 = false;
                                        if (!z2) {
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        c25623OooO0OO = C25622OooO0O0.f87441OooO00o;
                    }
                } else {
                    if (iOooO00o < 20 || !C25471OooO0O0.OooO0O0(0, bArr, C25471OooO0O0.f86781OooO0O0) || !C25471OooO0O0.OooO0O0(8, bArr, C25471OooO0O0.f86782OooO0OO)) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (C25471OooO0O0.OooO0O0(12, bArr, C25471OooO0O0.f86783OooO0Oo)) {
                        c25623OooO0OO = C25622OooO0O0.f87445OooO0o;
                    } else if (C25471OooO0O0.OooO0O0(12, bArr, C25471OooO0O0.f86785OooO0o0)) {
                        c25623OooO0OO = C25622OooO0O0.f87447OooO0oO;
                    } else if (iOooO00o >= 21) {
                        byte[] bArr7 = C25471OooO0O0.f86784OooO0o;
                        if (C25471OooO0O0.OooO0O0(12, bArr, bArr7)) {
                            c25623OooO0OO = (C25471OooO0O0.OooO0O0(12, bArr, bArr7) && ((bArr[20] & 2) == 2)) ? C25622OooO0O0.f87449OooOO0 : (C25471OooO0O0.OooO0O0(12, bArr, bArr7) && ((bArr[20] & 16) == 16)) ? C25622OooO0O0.f87440OooO : C25622OooO0O0.f87448OooO0oo;
                        } else {
                            c25623OooO0OO = C25623OooO0OO.f87455OooO0OO;
                        }
                    }
                }
                if (OooOOO0.OooO0O0(c25623OooO0OO, C25622OooO0O0.f87453OooOOO0)) {
                    c25623OooO0OO = C25623OooO0OO.f87455OooO0OO;
                }
                C25623OooO0OO c25623OooO0OO2 = C25623OooO0OO.f87455OooO0OO;
                return c25623OooO0OO == c25623OooO0OO2 ? c25623OooO0OO : c25623OooO0OO2;
            }
            boolean z3 = C25471OooO0O0.f86780OooO00o;
            z = false;
            if (z) {
            }
            if (OooOOO0.OooO0O0(c25623OooO0OO, C25622OooO0O0.f87453OooOOO0)) {
            }
            C25623OooO0OO c25623OooO0OO22 = C25623OooO0OO.f87455OooO0OO;
            if (c25623OooO0OO == c25623OooO0OO22) {
            }
        }
    }

    public C25624OooO0Oo() {
        C25621OooO00o c25621OooO00o = new C25621OooO00o();
        this.f87460OooO0O0 = c25621OooO00o;
        this.f87459OooO00o = c25621OooO00o.f87439OooO00o;
    }
}
