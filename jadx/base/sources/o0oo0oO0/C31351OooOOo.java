package o0oo0oO0;

import Oooo0oO.C21034OooOOOo;
import android.util.Log;
import androidx.appcompat.view.menu.C21505OooO0Oo;
import com.orion.notein.domain.models.backup.BackupEvent;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;

/* JADX INFO: renamed from: o0oo0oO0.OooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31351OooOOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f111943OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f111944OooO0O0;

    public C31351OooOOo(String str, String str2) {
        this.f111943OooO00o = str;
        this.f111944OooO0O0 = str2;
    }

    public static Integer OooO0O0(ArrayList arrayList) throws IOException {
        Object objRemove = arrayList.remove(arrayList.size() - 1);
        if (objRemove instanceof Integer) {
            return (Integer) objRemove;
        }
        C31349OooOOOO c31349OooOOOO = (C31349OooOOOO) objRemove;
        int[] iArr = c31349OooOOOO.f111939OooO00o.f111940OooO00o;
        if (iArr[0] == 12 && iArr[1] == 12) {
            return Integer.valueOf(((Integer) arrayList.remove(arrayList.size() - 1)).intValue() / ((Integer) arrayList.remove(arrayList.size() - 1)).intValue());
        }
        throw new IOException("Unexpected char string command: " + c31349OooOOOO.f111939OooO00o);
    }

    public final void OooO00o(byte[] bArr, ArrayList arrayList, ArrayList arrayList2) throws IOException {
        Integer numValueOf;
        C31350OooOOOo c31350OooOOOo = new C31350OooOOOo(bArr);
        while (c31350OooOOOo.f111942OooO0O0 < c31350OooOOOo.f111941OooO00o.length) {
            int iOooO0o = c31350OooOOOo.OooO0o();
            String str = this.f111943OooO00o;
            String str2 = this.f111944OooO0O0;
            if (iOooO0o == 10) {
                Object objRemove = arrayList2.remove(arrayList2.size() - 1);
                if (objRemove instanceof Integer) {
                    Integer num = (Integer) objRemove;
                    if (num.intValue() < 0 || num.intValue() >= arrayList.size()) {
                        Log.w("PdfBox-Android", "CALLSUBR is ignored, operand: " + num + ", subrs.size(): " + arrayList.size() + " in glyph '" + str2 + "' of font " + str);
                        while (C21505OooO0Oo.OooO00o(1, arrayList2) instanceof Integer) {
                            C21034OooOOOo.OooO0O0(1, arrayList2);
                        }
                    } else {
                        OooO00o((byte[]) arrayList.get(num.intValue()), arrayList, arrayList2);
                        Object obj = arrayList2.get(arrayList2.size() - 1);
                        if ((obj instanceof C31349OooOOOO) && ((C31349OooOOOO) obj).f111939OooO00o.f111940OooO00o[0] == 11) {
                            C21034OooOOOo.OooO0O0(1, arrayList2);
                        }
                    }
                } else {
                    Log.w("PdfBox-Android", "Parameter " + objRemove + " for CALLSUBR is ignored, integer expected in glyph '" + str2 + "' of font " + str);
                }
            } else if (iOooO0o == 12 && c31350OooOOOo.OooO00o(0) == 16) {
                c31350OooOOOo.OooO0OO();
                Integer num2 = (Integer) arrayList2.remove(arrayList2.size() - 1);
                Integer num3 = (Integer) arrayList2.remove(arrayList2.size() - 1);
                ArrayDeque arrayDeque = new ArrayDeque();
                int iIntValue = num2.intValue();
                if (iIntValue == 0) {
                    arrayDeque.push(OooO0O0(arrayList2));
                    arrayDeque.push(OooO0O0(arrayList2));
                    arrayList2.remove(arrayList2.size() - 1);
                    arrayList2.add(0);
                    arrayList2.add(new C31349OooOOOO(12, 16));
                } else if (iIntValue == 1) {
                    arrayList2.add(1);
                    arrayList2.add(new C31349OooOOOO(12, 16));
                } else if (iIntValue != 3) {
                    for (int i = 0; i < num3.intValue(); i++) {
                        arrayDeque.push(OooO0O0(arrayList2));
                    }
                } else {
                    arrayDeque.push(OooO0O0(arrayList2));
                }
                while (c31350OooOOOo.OooO00o(0) == 12 && c31350OooOOOo.OooO00o(1) == 17) {
                    c31350OooOOOo.OooO0OO();
                    c31350OooOOOo.OooO0OO();
                    arrayList2.add(arrayDeque.pop());
                }
                if (arrayDeque.size() > 0) {
                    Log.w("PdfBox-Android", "Value left on the PostScript stack in glyph " + str2 + " of font " + str);
                }
            } else if (iOooO0o >= 0 && iOooO0o <= 31) {
                arrayList2.add(iOooO0o == 12 ? new C31349OooOOOO(iOooO0o, c31350OooOOOo.OooO0o()) : new C31349OooOOOO(iOooO0o));
            } else {
                if (iOooO0o < 32 || iOooO0o > 255) {
                    throw new IllegalArgumentException();
                }
                if (iOooO0o >= 32 && iOooO0o <= 246) {
                    numValueOf = Integer.valueOf(iOooO0o - 139);
                } else if (iOooO0o >= 247 && iOooO0o <= 250) {
                    numValueOf = Integer.valueOf(((iOooO0o - 247) * 256) + c31350OooOOOo.OooO0o() + 108);
                } else if (iOooO0o >= 251 && iOooO0o <= 254) {
                    numValueOf = Integer.valueOf((((-(iOooO0o - 251)) * 256) - c31350OooOOOo.OooO0o()) + BackupEvent.ERROR_UID_NOT_EXIST);
                } else {
                    if (iOooO0o != 255) {
                        throw new IllegalArgumentException();
                    }
                    numValueOf = Integer.valueOf(c31350OooOOOo.OooO0o0());
                }
                arrayList2.add(numValueOf);
            }
        }
    }
}
