package oo0o0Oo;

import OooOOO0.AbstractC20449OooO0Oo;
import OooooO0.C21289OooO0o;
import OooooO0.C21291OooO0oO;
import OooooO0.C21294OooOO0O;
import OooooOO.AbstractC21341OoooOO0;
import OooooOO.AbstractC21369oo000o;
import OooooOO.C21331Oooo0O0;
import OooooOO.C21348Ooooo0o;
import OooooOO.C21356o000oOoO;
import OooooOO.C21362o00oO0o;
import OooooOO.C21368o0ooOoO;
import OooooOO.InterfaceC21342OoooOOO;
import android.graphics.Matrix;
import android.graphics.Shader;
import java.util.ArrayList;
import java.util.List;
import o00000O.C24104OooO0Oo;
import o00000O.C24105OooO0o0;
import o0000Ooo.C24227OooO00o;
import o0000Ooo.C24228OooO0O0;
import o0O0O00.C25869Oooo00O;
import oOo000Oo.C34429OooOOo0;
import oOo000Oo.C34431OooOo0;
import oOo000Oo.OooOo;

/* JADX INFO: renamed from: oo0o0Oo.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C34682OooO0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C34684OooO0o0 f124903OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f124904OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final boolean f124905OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final float f124906OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f124907OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final float f124908OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final ArrayList f124909OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final ArrayList f124910OooO0oo;

    public C34682OooO0Oo(C34684OooO0o0 c34684OooO0o0, long j, int i, boolean z) {
        boolean z2;
        int iOooO0oO;
        this.f124903OooO00o = c34684OooO0o0;
        this.f124904OooO0O0 = i;
        if (C24227OooO00o.OooOO0(j) != 0 || C24227OooO00o.OooO(j) != 0) {
            throw new IllegalArgumentException("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = c34684OooO0o0.f124922OooO0o0;
        int size = arrayList2.size();
        int i2 = 0;
        int i3 = 0;
        float f = 0.0f;
        while (i2 < size) {
            C34685OooO0oO c34685OooO0oO = (C34685OooO0oO) arrayList2.get(i2);
            C24104OooO0Oo c24104OooO0Oo = c34685OooO0oO.f124925OooO00o;
            int iOooO0oo = C24227OooO00o.OooO0oo(j);
            if (C24227OooO00o.OooO0OO(j)) {
                iOooO0oO = C24227OooO00o.OooO0oO(j) - ((int) Math.ceil(f));
                if (iOooO0oO < 0) {
                    iOooO0oO = 0;
                }
            } else {
                iOooO0oO = C24227OooO00o.OooO0oO(j);
            }
            C34679OooO00o c34679OooO00o = new C34679OooO00o(c24104OooO0Oo, this.f124904OooO0O0 - i3, z, C24228OooO0O0.OooO0O0(iOooO0oo, iOooO0oO, 5));
            float fOooO0OO = c34679OooO00o.OooO0OO() + f;
            C25869Oooo00O c25869Oooo00O = c34679OooO00o.f124881OooO0Oo;
            int i4 = i3 + c25869Oooo00O.f88260OooO0o0;
            arrayList.add(new C34683OooO0o(c34679OooO00o, c34685OooO0oO.f124926OooO0O0, c34685OooO0oO.f124927OooO0OO, i3, i4, f, fOooO0OO));
            if (c25869Oooo00O.f88257OooO0OO || (i4 == this.f124904OooO0O0 && i2 != C34429OooOOo0.OooOO0O(this.f124903OooO00o.f124922OooO0o0))) {
                z2 = true;
                i3 = i4;
                f = fOooO0OO;
                break;
            } else {
                i2++;
                i3 = i4;
                f = fOooO0OO;
            }
        }
        z2 = false;
        this.f124908OooO0o0 = f;
        this.f124907OooO0o = i3;
        this.f124905OooO0OO = z2;
        this.f124910OooO0oo = arrayList;
        this.f124906OooO0Oo = C24227OooO00o.OooO0oo(j);
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i5 = 0; i5 < size2; i5++) {
            C34683OooO0o c34683OooO0o = (C34683OooO0o) arrayList.get(i5);
            List<C21291OooO0oO> listOooO0o0 = c34683OooO0o.f124911OooO00o.OooO0o0();
            ArrayList arrayList4 = new ArrayList(listOooO0o0.size());
            int size3 = listOooO0o0.size();
            for (int i6 = 0; i6 < size3; i6++) {
                C21291OooO0oO c21291OooO0oO = listOooO0o0.get(i6);
                arrayList4.add(c21291OooO0oO != null ? c21291OooO0oO.OooO0o(C21289OooO0o.OooO00o(0.0f, c34683OooO0o.f124915OooO0o)) : null);
            }
            C34431OooOo0.OooOo0o(arrayList3, arrayList4);
        }
        if (arrayList3.size() < this.f124903OooO00o.f124919OooO0O0.size()) {
            int size4 = this.f124903OooO00o.f124919OooO0O0.size() - arrayList3.size();
            ArrayList arrayList5 = new ArrayList(size4);
            for (int i7 = 0; i7 < size4; i7++) {
                arrayList5.add(null);
            }
            arrayList3 = OooOo.OooooOO(arrayList3, arrayList5);
        }
        this.f124909OooO0oO = arrayList3;
    }

    public static void OooO00o(C34682OooO0Oo c34682OooO0Oo, InterfaceC21342OoooOOO interfaceC21342OoooOOO, long j, C21362o00oO0o c21362o00oO0o, o00000o0.OooO oooO, AbstractC20449OooO0Oo abstractC20449OooO0Oo) {
        interfaceC21342OoooOOO.OooOOo0();
        ArrayList arrayList = c34682OooO0Oo.f124910OooO0oo;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C34683OooO0o c34683OooO0o = (C34683OooO0o) arrayList.get(i);
            C34679OooO00o c34679OooO00o = c34683OooO0o.f124911OooO00o;
            C24105OooO0o0 c24105OooO0o0 = c34679OooO00o.f124878OooO00o.f81219OooO0oO;
            C21331Oooo0O0 c21331Oooo0O0 = c24105OooO0o0.f81228OooO00o;
            int i2 = c21331Oooo0O0.f61741OooO0O0;
            if (j != C21348Ooooo0o.f61766OooO0oO) {
                c21331Oooo0O0.OooOO0o(j);
                c21331Oooo0O0.OooOOOO(null);
            }
            c24105OooO0o0.OooO0OO(c21362o00oO0o);
            c24105OooO0o0.OooO0Oo(oooO);
            c24105OooO0o0.OooO0O0(abstractC20449OooO0Oo);
            c21331Oooo0O0.OooOO0O(3);
            c34679OooO00o.OooO0oO(interfaceC21342OoooOOO);
            c24105OooO0o0.f81228OooO00o.OooOO0O(i2);
            interfaceC21342OoooOOO.OooO0OO(0.0f, c34683OooO0o.f124911OooO00o.OooO0OO());
        }
        interfaceC21342OoooOOO.OooOO0o();
    }

    public static void OooO0O0(C34682OooO0Oo c34682OooO0Oo, InterfaceC21342OoooOOO interfaceC21342OoooOOO, AbstractC21341OoooOO0 abstractC21341OoooOO0, float f, C21362o00oO0o c21362o00oO0o, o00000o0.OooO oooO, AbstractC20449OooO0Oo abstractC20449OooO0Oo) {
        interfaceC21342OoooOOO.OooOOo0();
        ArrayList arrayList = c34682OooO0Oo.f124910OooO0oo;
        if (arrayList.size() <= 1 || (abstractC21341OoooOO0 instanceof C21368o0ooOoO)) {
            o00000O.OooO0O0.OooO0O0(c34682OooO0Oo, interfaceC21342OoooOOO, abstractC21341OoooOO0, f, c21362o00oO0o, oooO, abstractC20449OooO0Oo);
        } else if (abstractC21341OoooOO0 instanceof AbstractC21369oo000o) {
            int size = arrayList.size();
            float fMax = 0.0f;
            float fOooO0OO = 0.0f;
            for (int i = 0; i < size; i++) {
                C34683OooO0o c34683OooO0o = (C34683OooO0o) arrayList.get(i);
                fOooO0OO += c34683OooO0o.f124911OooO00o.OooO0OO();
                fMax = Math.max(fMax, c34683OooO0o.f124911OooO00o.OooO0o());
            }
            C21294OooOO0O.OooO00o(fMax, fOooO0OO);
            Shader shaderOooO0O0 = ((AbstractC21369oo000o) abstractC21341OoooOO0).OooO0O0();
            Matrix matrix = new Matrix();
            shaderOooO0O0.getLocalMatrix(matrix);
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                C34683OooO0o c34683OooO0o2 = (C34683OooO0o) arrayList.get(i2);
                c34683OooO0o2.f124911OooO00o.OooO0oo(interfaceC21342OoooOOO, new C21356o000oOoO(shaderOooO0O0), f, c21362o00oO0o, oooO, abstractC20449OooO0Oo);
                C34679OooO00o c34679OooO00o = c34683OooO0o2.f124911OooO00o;
                interfaceC21342OoooOOO.OooO0OO(0.0f, c34679OooO00o.OooO0OO());
                matrix.setTranslate(0.0f, -c34679OooO00o.OooO0OO());
                shaderOooO0O0.setLocalMatrix(matrix);
            }
        }
        interfaceC21342OoooOOO.OooOO0o();
    }

    public final void OooO0OO(int i) {
        C34684OooO0o0 c34684OooO0o0 = this.f124903OooO00o;
        if (i < 0 || i > c34684OooO0o0.f124918OooO00o.f124887OooOo0o.length()) {
            StringBuilder sbOooO0OO = OooO0O0.OooO0o.OooO0OO(i, "offset(", ") is out of bounds [0, ");
            sbOooO0OO.append(c34684OooO0o0.f124918OooO00o.f124887OooOo0o.length());
            sbOooO0OO.append(']');
            throw new IllegalArgumentException(sbOooO0OO.toString().toString());
        }
    }

    public final void OooO0Oo(int i) {
        int i2 = this.f124907OooO0o;
        if (i < 0 || i >= i2) {
            throw new IllegalArgumentException(("lineIndex(" + i + ") is out of bounds [0, " + i2 + ')').toString());
        }
    }
}
