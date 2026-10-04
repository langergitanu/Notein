package o0oo0oO0;

import Oooo0oO.C21034OooOOOo;
import androidx.appcompat.view.menu.C21505OooO0Oo;
import com.aspose.words.StyleIdentifier;
import com.orion.notein.domain.models.backup.BackupEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import o0oo0oO0.C31349OooOOOO;

/* JADX INFO: renamed from: o0oo0oO0.OooOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31354OooOo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f111958OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f111959OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public ArrayList f111960OooO0OO;

    public static Number OooO0Oo(int i, C31350OooOOOo c31350OooOOOo) throws IOException {
        if (i == 28) {
            return Integer.valueOf((short) c31350OooOOOo.OooO0oO());
        }
        if (i >= 32 && i <= 246) {
            return Integer.valueOf(i - 139);
        }
        if (i >= 247 && i <= 250) {
            return Integer.valueOf(((i - StyleIdentifier.LIGHT_LIST_ACCENT_6) * 256) + c31350OooOOOo.OooO0o() + 108);
        }
        if (i >= 251 && i <= 254) {
            return Integer.valueOf((((-(i - StyleIdentifier.MEDIUM_LIST_1_ACCENT_6)) * 256) - c31350OooOOOo.OooO0o()) + BackupEvent.ERROR_UID_NOT_EXIST);
        }
        if (i != 255) {
            throw new IllegalArgumentException();
        }
        return Double.valueOf(((double) ((short) c31350OooOOOo.OooO0oO())) + (((double) c31350OooOOOo.OooO0oO()) / 65535.0d));
    }

    public final List<Object> OooO00o(byte[] bArr, byte[][] bArr2, byte[][] bArr3, boolean z) throws IOException {
        if (z) {
            this.f111958OooO00o = 0;
            this.f111959OooO0O0 = 0;
            this.f111960OooO0OO = new ArrayList();
        }
        C31350OooOOOo c31350OooOOOo = new C31350OooOOOo(bArr);
        boolean z2 = bArr3 != null && bArr3.length > 0;
        boolean z3 = bArr2 != null && bArr2.length > 0;
        while (c31350OooOOOo.f111942OooO0O0 < c31350OooOOOo.f111941OooO00o.length) {
            int iOooO0o = c31350OooOOOo.OooO0o();
            int i = 32768;
            if (iOooO0o == 10 && z2) {
                ArrayList arrayList = this.f111960OooO0OO;
                Integer num = (Integer) arrayList.remove(arrayList.size() - 1);
                int length = bArr3.length;
                if (length < 1240) {
                    i = 107;
                } else if (length < 33900) {
                    i = 1131;
                }
                int iIntValue = num.intValue() + i;
                if (iIntValue < bArr3.length) {
                    OooO00o(bArr3[iIntValue], bArr2, bArr3, false);
                    Object objOooO00o = C21505OooO0Oo.OooO00o(1, this.f111960OooO0OO);
                    if ((objOooO00o instanceof C31349OooOOOO) && ((C31349OooOOOO) objOooO00o).f111939OooO00o.f111940OooO00o[0] == 11) {
                        C21034OooOOOo.OooO0O0(1, this.f111960OooO0OO);
                    }
                }
            } else if (iOooO0o == 29 && z3) {
                ArrayList arrayList2 = this.f111960OooO0OO;
                Integer num2 = (Integer) arrayList2.remove(arrayList2.size() - 1);
                int length2 = bArr2.length;
                if (length2 < 1240) {
                    i = 107;
                } else if (length2 < 33900) {
                    i = 1131;
                }
                int iIntValue2 = num2.intValue() + i;
                if (iIntValue2 < bArr2.length) {
                    OooO00o(bArr2[iIntValue2], bArr2, bArr3, false);
                    Object objOooO00o2 = C21505OooO0Oo.OooO00o(1, this.f111960OooO0OO);
                    if ((objOooO00o2 instanceof C31349OooOOOO) && ((C31349OooOOOO) objOooO00o2).f111939OooO00o.f111940OooO00o[0] == 11) {
                        C21034OooOOOo.OooO0O0(1, this.f111960OooO0OO);
                    }
                }
            } else if (iOooO0o >= 0 && iOooO0o <= 27) {
                this.f111960OooO0OO.add(OooO0OO(iOooO0o, c31350OooOOOo));
            } else if (iOooO0o == 28) {
                this.f111960OooO0OO.add(OooO0Oo(iOooO0o, c31350OooOOOo));
            } else if (iOooO0o >= 29 && iOooO0o <= 31) {
                this.f111960OooO0OO.add(OooO0OO(iOooO0o, c31350OooOOOo));
            } else {
                if (iOooO0o < 32 || iOooO0o > 255) {
                    throw new IllegalArgumentException();
                }
                this.f111960OooO0OO.add(OooO0Oo(iOooO0o, c31350OooOOOo));
            }
        }
        return this.f111960OooO0OO;
    }

    public final ArrayList OooO0O0() {
        ArrayList arrayList = new ArrayList();
        int size = this.f111960OooO0OO.size();
        while (true) {
            size--;
            if (size <= -1) {
                break;
            }
            Object obj = this.f111960OooO0OO.get(size);
            if (!(obj instanceof Number)) {
                break;
            }
            arrayList.add(0, (Number) obj);
        }
        return arrayList;
    }

    public final C31349OooOOOO OooO0OO(int i, C31350OooOOOo c31350OooOOOo) throws IOException {
        if (i == 1 || i == 18) {
            this.f111958OooO00o = (OooO0O0().size() / 2) + this.f111958OooO00o;
        } else if (i == 3 || i == 19 || i == 20 || i == 23) {
            this.f111959OooO0O0 = (OooO0O0().size() / 2) + this.f111959OooO0O0;
        }
        if (i == 12) {
            return new C31349OooOOOO(i, c31350OooOOOo.OooO0o());
        }
        if (i != 19 && i != 20) {
            return new C31349OooOOOO(i);
        }
        int i2 = this.f111958OooO00o + this.f111959OooO0O0;
        int i3 = i2 / 8;
        if (i2 % 8 > 0) {
            i3++;
        }
        int i4 = i3 + 1;
        int[] iArr = new int[i4];
        iArr[0] = i;
        for (int i5 = 1; i5 < i4; i5++) {
            iArr[i5] = c31350OooOOOo.OooO0o();
        }
        C31349OooOOOO c31349OooOOOO = new C31349OooOOOO();
        C31349OooOOOO.OooO00o oooO00o = new C31349OooOOOO.OooO00o();
        oooO00o.f111940OooO00o = iArr;
        c31349OooOOOO.f111939OooO00o = oooO00o;
        return c31349OooOOOO;
    }
}
