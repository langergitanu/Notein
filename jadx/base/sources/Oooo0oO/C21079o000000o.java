package Oooo0oO;

import androidx.appcompat.view.menu.C21505OooO0Oo;
import java.util.ArrayList;
import o000oo.C24649OooO00o;
import o000ooo.InterfaceC24747OooO0O0;
import o000ooo.InterfaceC24748OooO0OO;
import o000oooO.InterfaceC24757OooO0OO;

/* JADX INFO: renamed from: Oooo0oO.o000000o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21079o000000o implements InterfaceC24748OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Object f61054OooO00o;

    public C21079o000000o(InterfaceC24757OooO0OO openHelper) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(openHelper, "openHelper");
        this.f61054OooO00o = openHelper;
    }

    @Override // o000ooo.InterfaceC24748OooO0OO
    public InterfaceC24747OooO0O0 OooO00o(String fileName) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(fileName, "fileName");
        return new C24649OooO00o(((InterfaceC24757OooO0OO) this.f61054OooO00o).OooooOO());
    }

    public void OooO0O0(int i) {
        ArrayList arrayList = (ArrayList) this.f61054OooO00o;
        if (arrayList.isEmpty() || !(((Number) arrayList.get(0)).intValue() == i || ((Number) C21505OooO0Oo.OooO00o(1, arrayList)).intValue() == i)) {
            int size = arrayList.size();
            arrayList.add(Integer.valueOf(i));
            while (size > 0) {
                int i2 = ((size + 1) >>> 1) - 1;
                int iIntValue = ((Number) arrayList.get(i2)).intValue();
                if (i <= iIntValue) {
                    break;
                }
                arrayList.set(size, Integer.valueOf(iIntValue));
                size = i2;
            }
            arrayList.set(size, Integer.valueOf(i));
        }
    }

    public int OooO0OO() {
        int iIntValue;
        ArrayList arrayList = (ArrayList) this.f61054OooO00o;
        if (arrayList.size() <= 0) {
            C21038OooOo.OooO0OO("Set is empty");
            throw null;
        }
        int iIntValue2 = ((Number) arrayList.get(0)).intValue();
        while (!arrayList.isEmpty() && ((Number) arrayList.get(0)).intValue() == iIntValue2) {
            arrayList.set(0, oOo000Oo.OooOo.OoooOOo(arrayList));
            arrayList.remove(arrayList.size() - 1);
            int size = arrayList.size();
            int size2 = arrayList.size() >>> 1;
            int i = 0;
            while (i < size2) {
                int iIntValue3 = ((Number) arrayList.get(i)).intValue();
                int i2 = (i + 1) * 2;
                int i3 = i2 - 1;
                int iIntValue4 = ((Number) arrayList.get(i3)).intValue();
                if (i2 >= size || (iIntValue = ((Number) arrayList.get(i2)).intValue()) <= iIntValue4) {
                    if (iIntValue4 > iIntValue3) {
                        arrayList.set(i, Integer.valueOf(iIntValue4));
                        arrayList.set(i3, Integer.valueOf(iIntValue3));
                        i = i3;
                    }
                } else if (iIntValue > iIntValue3) {
                    arrayList.set(i, Integer.valueOf(iIntValue));
                    arrayList.set(i2, Integer.valueOf(iIntValue3));
                    i = i2;
                }
            }
        }
        return iIntValue2;
    }

    public C21079o000000o(int i) {
        this.f61054OooO00o = new ArrayList();
    }
}
