package o0oo0oo;

import android.util.Log;
import androidx.appcompat.widget.C21532OooOOo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import o0oo0oo.C31372OooOOOO;

/* JADX INFO: renamed from: o0oo0oo.Oooo00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31396Oooo00o implements InterfaceC31361OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C31362OooO0Oo f112110OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C31372OooOOOO f112111OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final List<String> f112112OooO0OO;

    public C31396Oooo00o(C31362OooO0Oo c31362OooO0Oo, C31372OooOOOO c31372OooOOOO, List<String> list) {
        this.f112110OooO00o = c31362OooO0Oo;
        this.f112111OooO0O0 = c31372OooOOOO;
        this.f112112OooO0OO = list;
    }

    @Override // o0oo0oo.InterfaceC31361OooO0OO
    public final ArrayList OooO00o(int i) {
        Integer num = (Integer) this.f112111OooO0O0.f112021OooOO0.get(Integer.valueOf(i));
        if (num == null) {
            Log.w("PdfBox-Android", "Trying to un-substitute a never-before-seen gid: " + i);
        } else {
            i = num.intValue();
        }
        return this.f112110OooO00o.OooO00o(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008a  */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.util.ArrayList, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.util.List] */
    @Override // o0oo0oo.InterfaceC31361OooO0OO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int OooO0O0(int i) {
        String str;
        String str2;
        ?? Values;
        int i2;
        List<String> list;
        int i3 = 1;
        int iOooO0O0 = this.f112110OooO00o.OooO0O0(i);
        HashMap map = C31393OooOooo.f112096OooO00o;
        if (i < 0 || i > 1114111) {
            throw new IllegalArgumentException(C21532OooOOo.OooO0OO(i, "Invalid codepoint: "));
        }
        if (i < 0 || i > 1114111) {
            throw new IllegalArgumentException(C21532OooOOo.OooO0OO(i, "Invalid codepoint: "));
        }
        if (Character.getType(i) == 0) {
            str = "Unknown";
        } else {
            int iBinarySearch = Arrays.binarySearch(C31393OooOooo.f112097OooO0O0, i);
            if (iBinarySearch < 0) {
                iBinarySearch = (-iBinarySearch) - 2;
            }
            str = C31393OooOooo.f112098OooO0OO[iBinarySearch];
        }
        String[] strArr = (String[]) C31393OooOooo.f112096OooO00o.get(str);
        C31372OooOOOO c31372OooOOOO = this.f112111OooO0O0;
        if (iOooO0O0 == -1) {
            return -1;
        }
        HashMap map2 = c31372OooOOOO.f112017OooO;
        Integer num = (Integer) map2.get(Integer.valueOf(iOooO0O0));
        if (num != null) {
            return num.intValue();
        }
        if (strArr.length == 1) {
            String str3 = strArr[0];
            if (!"Inherited".equals(str3) && (!"DFLT".equals(str3) || c31372OooOOOO.f112018OooO0o.containsKey(str3))) {
                int length = strArr.length;
                int i4 = 0;
                while (true) {
                    if (i4 >= length) {
                        str2 = strArr[0];
                        break;
                    }
                    String str4 = strArr[i4];
                    if (c31372OooOOOO.f112018OooO0o.containsKey(str4)) {
                        c31372OooOOOO.f112022OooOO0O = str4;
                        str2 = str4;
                        break;
                    }
                    i4++;
                }
            } else {
                if (c31372OooOOOO.f112022OooOO0O == null) {
                    c31372OooOOOO.f112022OooOO0O = c31372OooOOOO.f112018OooO0o.keySet().iterator().next();
                }
                str2 = c31372OooOOOO.f112022OooOO0O;
            }
        }
        ?? arrayList = Collections.EMPTY_LIST;
        C31372OooOOOO.OooOOO oooOOO = c31372OooOOOO.f112018OooO0o.get(str2);
        if (oooOOO == null) {
            Values = arrayList;
        } else if (oooOOO.f112044OooO00o == null) {
            Values = oooOOO.f112045OooO0O0.values();
        } else {
            ArrayList arrayList2 = new ArrayList(oooOOO.f112045OooO0O0.values());
            arrayList2.add(oooOOO.f112044OooO00o);
            Values = arrayList2;
        }
        if (!Values.isEmpty()) {
            arrayList = new ArrayList();
            Iterator it = Values.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                list = this.f112112OooO0OO;
                if (!zHasNext) {
                    break;
                }
                C31372OooOOOO.C31375OooO0oO c31375OooO0oO = (C31372OooOOOO.C31375OooO0oO) it.next();
                int i5 = c31375OooO0oO.f112035OooO00o;
                if (i5 != 65535) {
                    C31372OooOOOO.C31373OooO0Oo[] c31373OooO0OoArr = c31372OooOOOO.f112019OooO0oO;
                    if (i5 < c31373OooO0OoArr.length) {
                        arrayList.add(c31373OooO0OoArr[i5]);
                    }
                }
                for (int i6 : c31375OooO0oO.f112036OooO0O0) {
                    C31372OooOOOO.C31373OooO0Oo[] c31373OooO0OoArr2 = c31372OooOOOO.f112019OooO0oO;
                    if (i6 < c31373OooO0OoArr2.length && (list == null || list.contains(c31373OooO0OoArr2[i6].f112030OooO00o))) {
                        arrayList.add(c31372OooOOOO.f112019OooO0oO[i6]);
                    }
                }
            }
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (((C31372OooOOOO.C31373OooO0Oo) it2.next()).f112030OooO00o.equals("vrt2")) {
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        if (((C31372OooOOOO.C31373OooO0Oo) it3.next()).f112030OooO00o.equals("vert")) {
                            it3.remove();
                        }
                    }
                }
            }
            if (list != null && arrayList.size() > 1) {
                Collections.sort(arrayList, new C31370OooOOO(list));
            }
        }
        int iOooO00o = iOooO0O0;
        for (C31372OooOOOO.C31373OooO0Oo c31373OooO0Oo : arrayList) {
            int[] iArr = c31373OooO0Oo.f112031OooO0O0.f112034OooO00o;
            int length2 = iArr.length;
            int i7 = 0;
            while (i7 < length2) {
                C31372OooOOOO.OooO oooO = c31372OooOOOO.f112020OooO0oo[iArr[i7]];
                if (oooO.f112023OooO00o != i3) {
                    Log.d("PdfBox-Android", "Skipping GSUB feature '" + c31373OooO0Oo.f112030OooO00o + "' because it requires unsupported lookup table type " + oooO.f112023OooO00o);
                } else {
                    C31372OooOOOO.AbstractC31376OooO0oo[] abstractC31376OooO0ooArr = oooO.f112026OooO0Oo;
                    int length3 = abstractC31376OooO0ooArr.length;
                    int i8 = 0;
                    while (i8 < length3) {
                        C31372OooOOOO.AbstractC31376OooO0oo abstractC31376OooO0oo = abstractC31376OooO0ooArr[i8];
                        i2 = i3;
                        int iOooO00o2 = abstractC31376OooO0oo.f112038OooO0O0.OooO00o(iOooO00o);
                        if (iOooO00o2 >= 0) {
                            iOooO00o = abstractC31376OooO0oo.OooO00o(iOooO00o, iOooO00o2);
                            break;
                        }
                        i8++;
                        i3 = i2;
                    }
                }
                i2 = i3;
                i7++;
                i3 = i2;
            }
        }
        map2.put(Integer.valueOf(iOooO0O0), Integer.valueOf(iOooO00o));
        c31372OooOOOO.f112021OooOO0.put(Integer.valueOf(iOooO00o), Integer.valueOf(iOooO0O0));
        return iOooO00o;
    }
}
