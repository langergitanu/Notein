package oo0oO0;

import android.graphics.PointF;
import com.huawei.hms.network.embedded.C18437z2;
import com.orion.notein.data.p602db.entity.ShapeEntity;
import java.util.ArrayList;
import java.util.List;
import o000ooo.InterfaceC24747OooO0O0;
import o000ooo.InterfaceC24749OooO0Oo;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class o00O00o0 implements InterfaceC32507OooOO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ String f125262OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f125263OooOo0o = 0;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Object f125264OooOoO0;

    public /* synthetic */ o00O00o0(String str, String str2) {
        this.f125262OooOo = str;
        this.f125264OooOoO0 = str2;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Object obj) throws Exception {
        InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo;
        String strO000OoO;
        ArrayList arrayList;
        int i;
        int i2;
        Float fValueOf;
        C34973o00oooo c34973o00oooo;
        Float fValueOf2;
        int i3;
        int i4;
        Float fValueOf3;
        int i5;
        int i6;
        switch (this.f125263OooOo0o) {
            case 0:
                interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo("select MIN(sort_key) from FolderEntity where parent_id = ? and user_id = ?");
                try {
                    interfaceC24749OooO0OoO0ooOOo.o000000O(1, this.f125262OooOo);
                    String str = (String) this.f125264OooOoO0;
                    if (str == null) {
                        interfaceC24749OooO0OoO0ooOOo.OooO0oO(2);
                    } else {
                        interfaceC24749OooO0OoO0ooOOo.o000000O(2, str);
                    }
                    Integer numValueOf = null;
                    if (interfaceC24749OooO0OoO0ooOOo.o00oO0o() && !interfaceC24749OooO0OoO0ooOOo.isNull(0)) {
                        numValueOf = Integer.valueOf((int) interfaceC24749OooO0OoO0ooOOo.getLong(0));
                        break;
                    }
                    return numValueOf;
                } finally {
                    interfaceC24749OooO0OoO0ooOOo.close();
                }
            default:
                C34973o00oooo c34973o00oooo2 = (C34973o00oooo) this.f125264OooOoO0;
                c34973o00oooo2.getClass();
                interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo("select * from ShapeEntity where page_id = ?");
                String str2 = this.f125262OooOo;
                try {
                    if (str2 == null) {
                        interfaceC24749OooO0OoO0ooOOo.OooO0oO(1);
                    } else {
                        interfaceC24749OooO0OoO0ooOOo.o000000O(1, str2);
                    }
                    int iOooO0Oo = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "id");
                    int iOooO0Oo2 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "page_id");
                    int iOooO0Oo3 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "color");
                    int iOooO0Oo4 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "width");
                    int iOooO0Oo5 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "points");
                    int iOooO0Oo6 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, C18437z2.f56754h);
                    int iOooO0Oo7 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "blend_mode");
                    int iOooO0Oo8 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "layer_id");
                    int iOooO0Oo9 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "tape_like");
                    int iOooO0Oo10 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "style");
                    int iOooO0Oo11 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "opacity_of_fill_color");
                    int iOooO0Oo12 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "creation_time");
                    int iOooO0Oo13 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "left");
                    int iOooO0Oo14 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "top");
                    int iOooO0Oo15 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "right");
                    int iOooO0Oo16 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "bottom");
                    ArrayList arrayList2 = new ArrayList();
                    while (interfaceC24749OooO0OoO0ooOOo.o00oO0o()) {
                        Float fValueOf4 = null;
                        String strO000OoO2 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo);
                        if (interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo2)) {
                            strO000OoO = null;
                            i = iOooO0Oo;
                            arrayList = arrayList2;
                        } else {
                            strO000OoO = interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo2);
                            arrayList = arrayList2;
                            i = iOooO0Oo;
                        }
                        int i7 = (int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo3);
                        float f = (float) interfaceC24749OooO0OoO0ooOOo.getDouble(iOooO0Oo4);
                        List<PointF> listStringToPoints = c34973o00oooo2.f125592OooO0OO.stringToPoints(interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo5) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo5));
                        int i8 = (int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo6);
                        int i9 = (int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo7);
                        String strO000OoO3 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo8) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo8);
                        boolean z = ((int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo9)) != 0;
                        int i10 = (int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo10);
                        int i11 = (int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo11);
                        long j = interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo12);
                        if (interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo13)) {
                            i2 = i11;
                            fValueOf = null;
                        } else {
                            i2 = i11;
                            fValueOf = Float.valueOf((float) interfaceC24749OooO0OoO0ooOOo.getDouble(iOooO0Oo13));
                        }
                        int i12 = iOooO0Oo14;
                        if (interfaceC24749OooO0OoO0ooOOo.isNull(i12)) {
                            c34973o00oooo = c34973o00oooo2;
                            fValueOf2 = null;
                        } else {
                            c34973o00oooo = c34973o00oooo2;
                            fValueOf2 = Float.valueOf((float) interfaceC24749OooO0OoO0ooOOo.getDouble(i12));
                        }
                        int i13 = iOooO0Oo15;
                        if (interfaceC24749OooO0OoO0ooOOo.isNull(i13)) {
                            i3 = iOooO0Oo13;
                            i4 = iOooO0Oo2;
                            fValueOf3 = null;
                        } else {
                            i3 = iOooO0Oo13;
                            i4 = iOooO0Oo2;
                            fValueOf3 = Float.valueOf((float) interfaceC24749OooO0OoO0ooOOo.getDouble(i13));
                        }
                        int i14 = iOooO0Oo16;
                        if (interfaceC24749OooO0OoO0ooOOo.isNull(i14)) {
                            i5 = i12;
                            i6 = i13;
                        } else {
                            i5 = i12;
                            i6 = i13;
                            fValueOf4 = Float.valueOf((float) interfaceC24749OooO0OoO0ooOOo.getDouble(i14));
                        }
                        arrayList2 = arrayList;
                        arrayList2.add(new ShapeEntity(strO000OoO2, strO000OoO, i7, f, listStringToPoints, i8, i9, strO000OoO3, z, i10, i2, j, fValueOf, fValueOf2, fValueOf3, fValueOf4));
                        int i15 = i5;
                        iOooO0Oo2 = i4;
                        c34973o00oooo2 = c34973o00oooo;
                        iOooO0Oo14 = i15;
                        int i16 = i6;
                        iOooO0Oo16 = i14;
                        iOooO0Oo13 = i3;
                        iOooO0Oo15 = i16;
                        iOooO0Oo = i;
                        break;
                    }
                    interfaceC24749OooO0OoO0ooOOo.close();
                    return arrayList2;
                } finally {
                }
        }
    }

    public /* synthetic */ o00O00o0(C34973o00oooo c34973o00oooo, String str) {
        this.f125264OooOoO0 = c34973o00oooo;
        this.f125262OooOo = str;
    }
}
