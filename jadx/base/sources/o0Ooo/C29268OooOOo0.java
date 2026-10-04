package o0Ooo;

import Oooo0oO.C21030OooOO0o;
import com.orion.notein.data.p602db.entity.TextBoxEntity;
import com.orion.notein.p607ui.noteeditor.penbox.PenBoxChildFragment;
import java.util.ArrayList;
import o000ooo.InterfaceC24747OooO0O0;
import o000ooo.InterfaceC24749OooO0Oo;
import o0Oo00o.C28026OooO0OO;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: o0Ooo.OooOOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C29268OooOOo0 implements InterfaceC32507OooOO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f103777OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f103778OooOo0o;

    public /* synthetic */ C29268OooOOo0(Object obj, int i) {
        this.f103778OooOo0o = i;
        this.f103777OooOo = obj;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Object obj) throws Exception {
        String strO000OoO;
        int i;
        int i2;
        int i3;
        int i4;
        Float fValueOf;
        int i5;
        int i6;
        Float fValueOf2;
        Float fValueOf3;
        int i7;
        Object obj2 = this.f103777OooOo;
        switch (this.f103778OooOo0o) {
            case 0:
                o000o0O0.OooOo directions = (o000o0O0.OooOo) obj;
                int i8 = PenBoxChildFragment.f75355o0000Ooo;
                kotlin.jvm.internal.OooOOO0.OooO0oO(directions, "directions");
                C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO((PenBoxChildFragment) obj2), directions);
                return C32460OooOooO.f116667OooO00o;
            default:
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo("select * from TextBoxEntity where page_id = ?");
                String str = (String) obj2;
                try {
                    if (str == null) {
                        interfaceC24749OooO0OoO0ooOOo.OooO0oO(1);
                    } else {
                        interfaceC24749OooO0OoO0ooOOo.o000000O(1, str);
                    }
                    int iOooO0Oo = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "id");
                    int iOooO0Oo2 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "page_id");
                    int iOooO0Oo3 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "text");
                    int iOooO0Oo4 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "text_size");
                    int iOooO0Oo5 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "box_width");
                    int iOooO0Oo6 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "box_height");
                    int iOooO0Oo7 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "line_height");
                    int iOooO0Oo8 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "background_color");
                    int iOooO0Oo9 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "bounds");
                    int iOooO0Oo10 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "layer");
                    int iOooO0Oo11 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "layer_id");
                    int iOooO0Oo12 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "default_text_color");
                    int iOooO0Oo13 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "creation_time");
                    int iOooO0Oo14 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "local_transform_json");
                    int iOooO0Oo15 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "left");
                    int iOooO0Oo16 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "top");
                    int iOooO0Oo17 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "right");
                    int iOooO0Oo18 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "bottom");
                    ArrayList arrayList = new ArrayList();
                    while (interfaceC24749OooO0OoO0ooOOo.o00oO0o()) {
                        Float fValueOf4 = null;
                        String strO000OoO2 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo);
                        String strO000OoO3 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo2) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo2);
                        if (interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo3)) {
                            strO000OoO = null;
                            i2 = iOooO0Oo2;
                            i = iOooO0Oo3;
                        } else {
                            strO000OoO = interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo3);
                            i = iOooO0Oo3;
                            i2 = iOooO0Oo2;
                        }
                        float f = (float) interfaceC24749OooO0OoO0ooOOo.getDouble(iOooO0Oo4);
                        float f2 = (float) interfaceC24749OooO0OoO0ooOOo.getDouble(iOooO0Oo5);
                        float f3 = (float) interfaceC24749OooO0OoO0ooOOo.getDouble(iOooO0Oo6);
                        float f4 = (float) interfaceC24749OooO0OoO0ooOOo.getDouble(iOooO0Oo7);
                        int i9 = (int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo8);
                        String strO000OoO4 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo9) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo9);
                        int i10 = (int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo10);
                        String strO000OoO5 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo11) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo11);
                        int i11 = (int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo12);
                        long j = interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo13);
                        String strO000OoO6 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo14) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo14);
                        int i12 = iOooO0Oo15;
                        if (interfaceC24749OooO0OoO0ooOOo.isNull(i12)) {
                            i3 = iOooO0Oo4;
                            i4 = iOooO0Oo5;
                            fValueOf = null;
                        } else {
                            i3 = iOooO0Oo4;
                            i4 = iOooO0Oo5;
                            fValueOf = Float.valueOf((float) interfaceC24749OooO0OoO0ooOOo.getDouble(i12));
                        }
                        int i13 = iOooO0Oo16;
                        if (interfaceC24749OooO0OoO0ooOOo.isNull(i13)) {
                            i5 = i11;
                            i6 = i12;
                            fValueOf2 = null;
                        } else {
                            i5 = i11;
                            i6 = i12;
                            fValueOf2 = Float.valueOf((float) interfaceC24749OooO0OoO0ooOOo.getDouble(i13));
                        }
                        int i14 = iOooO0Oo17;
                        if (interfaceC24749OooO0OoO0ooOOo.isNull(i14)) {
                            iOooO0Oo16 = i13;
                            fValueOf3 = null;
                        } else {
                            iOooO0Oo16 = i13;
                            fValueOf3 = Float.valueOf((float) interfaceC24749OooO0OoO0ooOOo.getDouble(i14));
                        }
                        int i15 = iOooO0Oo18;
                        if (interfaceC24749OooO0OoO0ooOOo.isNull(i15)) {
                            i7 = i6;
                        } else {
                            i7 = i6;
                            fValueOf4 = Float.valueOf((float) interfaceC24749OooO0OoO0ooOOo.getDouble(i15));
                        }
                        arrayList.add(new TextBoxEntity(strO000OoO2, strO000OoO3, strO000OoO, f, f2, f3, f4, i9, strO000OoO4, i10, strO000OoO5, i5, j, strO000OoO6, fValueOf, fValueOf2, fValueOf3, fValueOf4));
                        iOooO0Oo4 = i3;
                        iOooO0Oo18 = i15;
                        iOooO0Oo15 = i7;
                        iOooO0Oo3 = i;
                        iOooO0Oo5 = i4;
                        iOooO0Oo17 = i14;
                        iOooO0Oo2 = i2;
                        break;
                    }
                    interfaceC24749OooO0OoO0ooOOo.close();
                    return arrayList;
                } catch (Throwable th) {
                    interfaceC24749OooO0OoO0ooOOo.close();
                    throw th;
                }
        }
    }
}
