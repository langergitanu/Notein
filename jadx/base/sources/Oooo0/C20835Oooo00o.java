package Oooo0;

import OooO0Oo.C20398OooO0O0;
import OooooO0.C21289OooO0o;
import OooooO0.C21290OooO0o0;
import OooooOO.C21331Oooo0O0;
import OooooOO.C21334Oooo0o0;
import OooooOO.C21335Oooo0oO;
import OooooOO.InterfaceC21342OoooOOO;
import Oooooo0.InterfaceC21402OooO0o0;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import o00000.InterfaceC24054OooOo0;
import o00o00O0.C25252OooO0Oo;
import o0O0O00.C25869Oooo00O;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oo0o0Oo.C34679OooO00o;
import oo0o0Oo.C34680OooO0O0;
import oo0o0Oo.C34682OooO0Oo;
import oo0o0Oo.C34683OooO0o;
import oo0o0Oo.C34694OooOOo;
import oo0o0Oo.C34695OooOOo0;
import oo0o0Oo.C34696OooOOoo;

/* JADX INFO: renamed from: Oooo0.Oooo00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20835Oooo00o extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<InterfaceC21402OooO0o0, C32460OooOooO> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ o00000.Oooo0 f59909OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ o000O0 f59910OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ InterfaceC24054OooOo0 f59911OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20835Oooo00o(o000O0 o000o0, o00000.Oooo0 oooo0, InterfaceC24054OooOo0 interfaceC24054OooOo0) {
        super(1);
        this.f59910OooOo0o = o000o0;
        this.f59909OooOo = oooo0;
        this.f59911OooOoO0 = interfaceC24054OooOo0;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final C32460OooOooO invoke(InterfaceC21402OooO0o0 interfaceC21402OooO0o0) {
        int iOooO0O0;
        int iOooO0O02;
        C21334Oooo0o0 c21334Oooo0o0OooO00o;
        ArrayList arrayList;
        int i;
        CharSequence charSequence;
        InterfaceC21402OooO0o0 drawBehind = interfaceC21402OooO0o0;
        kotlin.jvm.internal.OooOOO0.OooO0oO(drawBehind, "$this$drawBehind");
        o000O0 o000o0 = this.f59910OooOo0o;
        o000O0Oo o000o0ooOooO0OO = o000o0.OooO0OO();
        if (o000o0ooOooO0OO != null) {
            InterfaceC21342OoooOOO canvas = drawBehind.OoooOo0().OooO00o();
            kotlin.jvm.internal.OooOOO0.OooO0oO(canvas, "canvas");
            o00000.Oooo0 oooo0 = this.f59909OooOo;
            InterfaceC24054OooOo0 interfaceC24054OooOo0 = this.f59911OooOoO0;
            C34695OooOOo0 c34695OooOOo0 = o000o0ooOooO0OO.f60144OooO00o;
            C21331Oooo0O0 selectionPaint = o000o0.f60119OooOo00;
            kotlin.jvm.internal.OooOOO0.OooO0oO(selectionPaint, "selectionPaint");
            long j = oooo0.f81084OooO0O0;
            if (!C34696OooOOoo.OooO0O0(j) && (iOooO0O0 = interfaceC24054OooOo0.OooO0O0(C34696OooOOoo.OooO0Oo(j))) != (iOooO0O02 = interfaceC24054OooOo0.OooO0O0(C34696OooOOoo.OooO0OO(j)))) {
                C34682OooO0Oo c34682OooO0Oo = c34695OooOOo0.f124973OooO0O0;
                C34680OooO0O0 c34680OooO0O0 = c34682OooO0Oo.f124903OooO00o.f124918OooO00o;
                if (iOooO0O0 < 0 || iOooO0O0 > iOooO0O02 || iOooO0O02 > c34680OooO0O0.f124887OooOo0o.length()) {
                    StringBuilder sbOooO0O0 = C20398OooO0O0.OooO0O0("Start(", iOooO0O0, ") or End(", ") is out of range [0..", iOooO0O02);
                    sbOooO0O0.append(c34680OooO0O0.f124887OooOo0o.length());
                    sbOooO0O0.append("), or start > end!");
                    throw new IllegalArgumentException(sbOooO0O0.toString().toString());
                }
                if (iOooO0O0 == iOooO0O02) {
                    c21334Oooo0o0OooO00o = C21335Oooo0oO.OooO00o();
                } else {
                    ArrayList arrayList2 = c34682OooO0Oo.f124910OooO0oo;
                    int iOooOOOO = C25252OooO0Oo.OooOOOO(iOooO0O0, arrayList2);
                    C21334Oooo0o0 c21334Oooo0o0OooO00o2 = C21335Oooo0oO.OooO00o();
                    int size = arrayList2.size();
                    while (iOooOOOO < size) {
                        C34683OooO0o c34683OooO0o = (C34683OooO0o) arrayList2.get(iOooOOOO);
                        int i2 = c34683OooO0o.f124912OooO0O0;
                        if (i2 >= iOooO0O02) {
                            break;
                        }
                        if (i2 != c34683OooO0o.f124913OooO0OO) {
                            int iOooO00o = c34683OooO0o.OooO00o(iOooO0O0);
                            int iOooO00o2 = c34683OooO0o.OooO00o(iOooO0O02);
                            C34679OooO00o c34679OooO00o = c34683OooO0o.f124911OooO00o;
                            arrayList = arrayList2;
                            CharSequence charSequence2 = c34679OooO00o.f124883OooO0o0;
                            if (iOooO00o < 0 || iOooO00o > iOooO00o2) {
                                charSequence = charSequence2;
                                StringBuilder sbOooO0O02 = C20398OooO0O0.OooO0O0("Start(", iOooO00o, ") or End(", ") is out of Range(0..", iOooO00o2);
                                sbOooO0O02.append(charSequence.length());
                                sbOooO0O02.append("), or start > end!");
                                throw new AssertionError(sbOooO0O02.toString());
                            }
                            charSequence = charSequence2;
                            if (iOooO00o2 > charSequence.length()) {
                                StringBuilder sbOooO0O022 = C20398OooO0O0.OooO0O0("Start(", iOooO00o, ") or End(", ") is out of Range(0..", iOooO00o2);
                                sbOooO0O022.append(charSequence.length());
                                sbOooO0O022.append("), or start > end!");
                                throw new AssertionError(sbOooO0O022.toString());
                            }
                            Path path = new Path();
                            C25869Oooo00O c25869Oooo00O = c34679OooO00o.f124881OooO0Oo;
                            c25869Oooo00O.getClass();
                            i = iOooOOOO;
                            c25869Oooo00O.f88258OooO0Oo.getSelectionPath(iOooO00o, iOooO00o2, path);
                            int i3 = c25869Oooo00O.f88259OooO0o;
                            if (i3 != 0 && !path.isEmpty()) {
                                path.offset(0.0f, i3);
                            }
                            new RectF();
                            Matrix matrix = new Matrix();
                            long jOooO00o = C21289OooO0o.OooO00o(0.0f, c34683OooO0o.f124915OooO0o);
                            matrix.reset();
                            matrix.setTranslate(C21290OooO0o0.OooO0OO(jOooO00o), C21290OooO0o0.OooO0Oo(jOooO00o));
                            path.transform(matrix);
                            long j2 = C21290OooO0o0.f61718OooO0O0;
                            c21334Oooo0o0OooO00o2.f61747OooO00o.addPath(path, C21290OooO0o0.OooO0OO(j2), C21290OooO0o0.OooO0Oo(j2));
                        } else {
                            arrayList = arrayList2;
                            i = iOooOOOO;
                        }
                        iOooOOOO = i + 1;
                        arrayList2 = arrayList;
                    }
                    c21334Oooo0o0OooO00o = c21334Oooo0o0OooO00o2;
                }
                canvas.OooOo00(c21334Oooo0o0OooO00o, selectionPaint);
            }
            C34694OooOOo.OooO00o(canvas, c34695OooOOo0);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
