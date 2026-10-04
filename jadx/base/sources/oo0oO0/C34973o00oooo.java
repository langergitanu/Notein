package oo0oO0;

import android.graphics.PointF;
import com.aspose.slides.C22218Oooo;
import com.huawei.hms.network.embedded.C18437z2;
import com.orion.notein.data.p602db.NoteContentDatabase_Impl;
import com.orion.notein.data.p602db.entity.ShapeConverter;
import com.orion.notein.data.p602db.entity.ShapeEntity;
import java.util.ArrayList;
import java.util.List;
import o000ooOO.C24734OooO0O0;
import o000ooo.InterfaceC24747OooO0O0;
import o000ooo.InterfaceC24749OooO0Oo;
import o0OO00o0.C26639o00OoOoo;
import o0OO00o0.C26642o00Ooo00;
import o0OO00o0.C26643o00Ooo0O;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: oo0oO0.o00oooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C34973o00oooo extends AbstractC34967o00ooo00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final NoteContentDatabase_Impl f125590OooO00o;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final ShapeConverter f125592OooO0OO = new ShapeConverter();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C34972o00oooOo f125591OooO0O0 = new C34972o00oooOo(this);

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final C34974o00oooo0 f125593OooO0Oo = new C34974o00oooo0(this);

    public C34973o00oooo(NoteContentDatabase_Impl noteContentDatabase_Impl) {
        this.f125590OooO00o = noteContentDatabase_Impl;
    }

    @Override // oo0oO0.AbstractC34967o00ooo00
    public final void OooO00o() {
        C24734OooO0O0.OooO0o(this.f125590OooO00o, false, true, new C34970o00oooO());
    }

    @Override // oo0oO0.AbstractC34967o00ooo00
    public final void OooO0O0(final String str) {
        C24734OooO0O0.OooO0o(this.f125590OooO00o, false, true, new InterfaceC32507OooOO0o() { // from class: oo0oO0.o00oooOO
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) throws Exception {
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo("DELETE FROM ShapeEntity WHERE page_id = ? and layer_id = ?");
                String str2 = str;
                try {
                    if (str2 == null) {
                        interfaceC24749OooO0OoO0ooOOo.OooO0oO(1);
                    } else {
                        interfaceC24749OooO0OoO0ooOOo.o000000O(1, str2);
                    }
                    interfaceC24749OooO0OoO0ooOOo.OooO0oO(2);
                    interfaceC24749OooO0OoO0ooOOo.o00oO0o();
                    interfaceC24749OooO0OoO0ooOOo.close();
                    return null;
                } catch (Throwable th) {
                    interfaceC24749OooO0OoO0ooOOo.close();
                    throw th;
                }
            }
        });
    }

    @Override // oo0oO0.AbstractC34967o00ooo00
    public final Object OooO0OO(final String str, C26643o00Ooo0O c26643o00Ooo0O) {
        return C24734OooO0O0.OooO0oo(c26643o00Ooo0O, this.f125590OooO00o, new InterfaceC32507OooOO0o() { // from class: oo0oO0.o00ooo0o
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) throws Exception {
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo("DELETE FROM ShapeEntity WHERE page_id = ?");
                String str2 = str;
                try {
                    if (str2 == null) {
                        interfaceC24749OooO0OoO0ooOOo.OooO0oO(1);
                    } else {
                        interfaceC24749OooO0OoO0ooOOo.o000000O(1, str2);
                    }
                    interfaceC24749OooO0OoO0ooOOo.o00oO0o();
                    C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                    interfaceC24749OooO0OoO0ooOOo.close();
                    return c32460OooOooO;
                } catch (Throwable th) {
                    interfaceC24749OooO0OoO0ooOOo.close();
                    throw th;
                }
            }
        }, false, true);
    }

    @Override // oo0oO0.AbstractC34967o00ooo00
    public final Object OooO0Oo(List list, C26642o00Ooo00 c26642o00Ooo00) {
        return C24734OooO0O0.OooO0oo(c26642o00Ooo00, this.f125590OooO00o, new o00O00(1, com.aspose.slides.internal.p332p7.OooOO0O.OooO00o(")", C22218Oooo.OooO0OO("DELETE FROM ShapeEntity where id in ("), list), list), false, true);
    }

    @Override // oo0oO0.AbstractC34967o00ooo00
    public final List<ShapeEntity> OooO0o(final String str, final float f, final float f2, final float f3, final float f4) {
        return (List) C24734OooO0O0.OooO0o(this.f125590OooO00o, true, false, new InterfaceC32507OooOO0o() { // from class: oo0oO0.o00ooo0O
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) throws Exception {
                String strO000OoO;
                ArrayList arrayList;
                int i;
                int i2;
                Float fValueOf;
                int i3;
                Float fValueOf2;
                int i4;
                Float fValueOf3;
                int i5;
                int i6;
                float f5 = f3;
                float f6 = f4;
                float f7 = f;
                float f8 = f2;
                C34973o00oooo c34973o00oooo = this.f125582OooOo0o;
                c34973o00oooo.getClass();
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo("select * from ShapeEntity where page_id = ? and `left` <= ? and `top` <= ? and `right` >= ? and `bottom` >= ?");
                String str2 = str;
                try {
                    if (str2 == null) {
                        interfaceC24749OooO0OoO0ooOOo.OooO0oO(1);
                    } else {
                        interfaceC24749OooO0OoO0ooOOo.o000000O(1, str2);
                    }
                    interfaceC24749OooO0OoO0ooOOo.OooOOOO(f5, 2);
                    interfaceC24749OooO0OoO0ooOOo.OooOOOO(f6, 3);
                    interfaceC24749OooO0OoO0ooOOo.OooOOOO(f7, 4);
                    interfaceC24749OooO0OoO0ooOOo.OooOOOO(f8, 5);
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
                        float f9 = (float) interfaceC24749OooO0OoO0ooOOo.getDouble(iOooO0Oo4);
                        List<PointF> listStringToPoints = c34973o00oooo.f125592OooO0OO.stringToPoints(interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo5) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo5));
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
                            i3 = iOooO0Oo2;
                            fValueOf2 = null;
                        } else {
                            i3 = iOooO0Oo2;
                            fValueOf2 = Float.valueOf((float) interfaceC24749OooO0OoO0ooOOo.getDouble(i12));
                        }
                        int i13 = iOooO0Oo15;
                        if (interfaceC24749OooO0OoO0ooOOo.isNull(i13)) {
                            i4 = iOooO0Oo3;
                            fValueOf3 = null;
                        } else {
                            i4 = iOooO0Oo3;
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
                        arrayList2.add(new ShapeEntity(strO000OoO2, strO000OoO, i7, f9, listStringToPoints, i8, i9, strO000OoO3, z, i10, i2, j, fValueOf, fValueOf2, fValueOf3, fValueOf4));
                        int i15 = i6;
                        iOooO0Oo16 = i14;
                        iOooO0Oo2 = i3;
                        iOooO0Oo14 = i5;
                        iOooO0Oo3 = i4;
                        iOooO0Oo15 = i15;
                        iOooO0Oo = i;
                    }
                    interfaceC24749OooO0OoO0ooOOo.close();
                    return arrayList2;
                } catch (Throwable th) {
                    interfaceC24749OooO0OoO0ooOOo.close();
                    throw th;
                }
            }
        });
    }

    @Override // oo0oO0.AbstractC34967o00ooo00
    public final List<ShapeEntity> OooO0o0(String str) {
        return (List) C24734OooO0O0.OooO0o(this.f125590OooO00o, true, false, new o00O00o0(this, str));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // oo0oO0.AbstractC34967o00ooo00
    public final Object OooO0oO(ShapeEntity[] shapeEntityArr, C26639o00OoOoo c26639o00OoOoo) {
        shapeEntityArr.getClass();
        return C24734OooO0O0.OooO0oo(c26639o00OoOoo, this.f125590OooO00o, new o00O00O(this, shapeEntityArr, 1), false, true);
    }

    @Override // oo0oO0.AbstractC34967o00ooo00
    public final Object OooO0oo(final ShapeEntity[] shapeEntityArr, C26639o00OoOoo c26639o00OoOoo) {
        shapeEntityArr.getClass();
        return C24734OooO0O0.OooO0oo(c26639o00OoOoo, this.f125590OooO00o, new InterfaceC32507OooOO0o() { // from class: oo0oO0.o00ooo0
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) {
                this.f125580OooOo0o.f125593OooO0Oo.OooOoo0((InterfaceC24747OooO0O0) obj, shapeEntityArr);
                return C32460OooOooO.f116667OooO00o;
            }
        }, false, true);
    }
}
