package oo0oO0;

import com.aspose.slides.C22218Oooo;
import com.orion.notein.data.p602db.NoteContentDatabase_Impl;
import com.orion.notein.data.p602db.entity.ImageEntity;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import o000ooOO.C24734OooO0O0;
import o000ooo.InterfaceC24747OooO0O0;
import o000ooo.InterfaceC24749OooO0Oo;
import o00OOooo.C25022OooO0O0;
import o0O0oooo.C26373OooOOo0;
import o0OO00o0.C26587o00O00o;
import o0OOoO0o.C27754OooO0OO;
import o0OoO0oo.C28819o000oOoo;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0oO00.C33998o00o0O;

/* JADX INFO: loaded from: classes9.dex */
public final class o000O0 extends AbstractC34767o0000oOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final NoteContentDatabase_Impl f125162OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o000Oo0 f125163OooO0O0 = new o000Oo0();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o000O00 f125164OooO0OO = new o000O00();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o000O00O f125165OooO0Oo = new o000O00O();

    public o000O0(NoteContentDatabase_Impl noteContentDatabase_Impl) {
        this.f125162OooO00o = noteContentDatabase_Impl;
    }

    @Override // oo0oO0.AbstractC34767o0000oOO
    public final Object OooO(final Set set, o0OO00o0.o00O00OO o00o00oo2) {
        StringBuilder sbOooO0OO = C22218Oooo.OooO0OO("select * from ImageEntity where page_id in (");
        C25022OooO0O0.OooO0OO(set.size(), sbOooO0OO);
        sbOooO0OO.append(")");
        final String string = sbOooO0OO.toString();
        return C24734OooO0O0.OooO0oo(o00o00oo2, this.f125162OooO00o, new InterfaceC32507OooOO0o() { // from class: oo0oO0.o000O0o
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) throws Exception {
                String strO000OoO;
                ArrayList arrayList;
                int i;
                float f;
                Float fValueOf;
                Set<String> set2 = set;
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo(string);
                try {
                    int i2 = 1;
                    for (String str : set2) {
                        if (str == null) {
                            interfaceC24749OooO0OoO0ooOOo.OooO0oO(i2);
                        } else {
                            interfaceC24749OooO0OoO0ooOOo.o000000O(i2, str);
                        }
                        i2++;
                    }
                    int iOooO0Oo = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "id");
                    int iOooO0Oo2 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "uri");
                    int iOooO0Oo3 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "layer");
                    int iOooO0Oo4 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "layer_id");
                    int iOooO0Oo5 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "bounds");
                    int iOooO0Oo6 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "rotation");
                    int iOooO0Oo7 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "page_id");
                    int iOooO0Oo8 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "creation_time");
                    int iOooO0Oo9 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "last_modification_time");
                    int iOooO0Oo10 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "left");
                    int iOooO0Oo11 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "top");
                    int iOooO0Oo12 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "right");
                    int iOooO0Oo13 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "bottom");
                    int iOooO0Oo14 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "fixed");
                    ArrayList arrayList2 = new ArrayList();
                    while (interfaceC24749OooO0OoO0ooOOo.o00oO0o()) {
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
                        int i3 = (int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo3);
                        String strO000OoO3 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo4) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo4);
                        String strO000OoO4 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo5) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo5);
                        float f2 = (float) interfaceC24749OooO0OoO0ooOOo.getDouble(iOooO0Oo6);
                        String strO000OoO5 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo7) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo7);
                        long j = interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo8);
                        long j2 = interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo9);
                        if (interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo10)) {
                            f = f2;
                            fValueOf = null;
                        } else {
                            f = f2;
                            fValueOf = Float.valueOf((float) interfaceC24749OooO0OoO0ooOOo.getDouble(iOooO0Oo10));
                        }
                        arrayList2 = arrayList;
                        arrayList2.add(new ImageEntity(strO000OoO2, strO000OoO, i3, strO000OoO3, strO000OoO4, f, strO000OoO5, j, j2, fValueOf, interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo11) ? null : Float.valueOf((float) interfaceC24749OooO0OoO0ooOOo.getDouble(iOooO0Oo11)), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo12) ? null : Float.valueOf((float) interfaceC24749OooO0OoO0ooOOo.getDouble(iOooO0Oo12)), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo13) ? null : Float.valueOf((float) interfaceC24749OooO0OoO0ooOOo.getDouble(iOooO0Oo13)), ((int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo14)) != 0));
                        iOooO0Oo = i;
                    }
                    interfaceC24749OooO0OoO0ooOOo.close();
                    return arrayList2;
                } catch (Throwable th) {
                    interfaceC24749OooO0OoO0ooOOo.close();
                    throw th;
                }
            }
        }, true, false);
    }

    @Override // oo0oO0.AbstractC34767o0000oOO
    public final void OooO00o() {
        C24734OooO0O0.OooO0o(this.f125162OooO00o, false, true, new C27754OooO0OO(1));
    }

    @Override // oo0oO0.AbstractC34767o0000oOO
    public final Object OooO0O0(List list, o0OO00o0.o0O0ooO o0o0ooo) {
        return C24734OooO0O0.OooO0oo(o0o0ooo, this.f125162OooO00o, new o000O000(0, com.aspose.slides.internal.p332p7.OooOO0O.OooO00o(")", C22218Oooo.OooO0OO("DELETE FROM ImageEntity where id in ("), list), list), false, true);
    }

    @Override // oo0oO0.AbstractC34767o0000oOO
    public final void OooO0OO(final String str) {
        C24734OooO0O0.OooO0o(this.f125162OooO00o, false, true, new InterfaceC32507OooOO0o() { // from class: oo0oO0.o0000ooO
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) throws Exception {
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo("DELETE FROM ImageEntity WHERE page_id = ? and layer_id = ?");
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

    @Override // oo0oO0.AbstractC34767o0000oOO
    public final Object OooO0Oo(String str, o0OO00o0.o00O000 o00o0002) {
        return C24734OooO0O0.OooO0oo(o00o0002, this.f125162OooO00o, new C26373OooOOo0(str, 2), false, true);
    }

    @Override // oo0oO0.AbstractC34767o0000oOO
    public final Object OooO0o(String str, o0OO00o0.o00O000o o00o000o2) {
        return C24734OooO0O0.OooO0oo(o00o000o2, this.f125162OooO00o, new C34768o0000oOo(str, 0), true, false);
    }

    @Override // oo0oO0.AbstractC34767o0000oOO
    public final Object OooO0o0(o0OO00o0.o00O00O o00o00o2) {
        return C24734OooO0O0.OooO0oo(o00o00o2, this.f125162OooO00o, new C28819o000oOoo(2), true, false);
    }

    @Override // oo0oO0.AbstractC34767o0000oOO
    public final Object OooO0oO(List list, o0OO00o0.o00O00 o00o002) {
        return C24734OooO0O0.OooO0oo(o00o002, this.f125162OooO00o, new C34782o000OoO(0, com.aspose.slides.internal.p332p7.OooOO0O.OooO00o(")", C22218Oooo.OooO0OO("select * from ImageEntity where id in ("), list), list), true, false);
    }

    @Override // oo0oO0.AbstractC34767o0000oOO
    public final List<ImageEntity> OooO0oo(final String str) {
        return (List) C24734OooO0O0.OooO0o(this.f125162OooO00o, true, false, new InterfaceC32507OooOO0o() { // from class: oo0oO0.o000O0O
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) throws Exception {
                float f;
                Float fValueOf;
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo("select * from ImageEntity where page_id = ?");
                String str2 = str;
                try {
                    if (str2 == null) {
                        interfaceC24749OooO0OoO0ooOOo.OooO0oO(1);
                    } else {
                        interfaceC24749OooO0OoO0ooOOo.o000000O(1, str2);
                    }
                    int iOooO0Oo = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "id");
                    int iOooO0Oo2 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "uri");
                    int iOooO0Oo3 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "layer");
                    int iOooO0Oo4 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "layer_id");
                    int iOooO0Oo5 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "bounds");
                    int iOooO0Oo6 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "rotation");
                    int iOooO0Oo7 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "page_id");
                    int iOooO0Oo8 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "creation_time");
                    int iOooO0Oo9 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "last_modification_time");
                    int iOooO0Oo10 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "left");
                    int iOooO0Oo11 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "top");
                    int iOooO0Oo12 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "right");
                    int iOooO0Oo13 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "bottom");
                    int iOooO0Oo14 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "fixed");
                    ArrayList arrayList = new ArrayList();
                    while (interfaceC24749OooO0OoO0ooOOo.o00oO0o()) {
                        String strO000OoO = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo);
                        String strO000OoO2 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo2) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo2);
                        ArrayList arrayList2 = arrayList;
                        int i = iOooO0Oo14;
                        int i2 = (int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo3);
                        String strO000OoO3 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo4) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo4);
                        String strO000OoO4 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo5) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo5);
                        float f2 = (float) interfaceC24749OooO0OoO0ooOOo.getDouble(iOooO0Oo6);
                        String strO000OoO5 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo7) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo7);
                        long j = interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo8);
                        long j2 = interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo9);
                        if (interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo10)) {
                            f = f2;
                            fValueOf = null;
                        } else {
                            f = f2;
                            fValueOf = Float.valueOf((float) interfaceC24749OooO0OoO0ooOOo.getDouble(iOooO0Oo10));
                        }
                        int i3 = iOooO0Oo2;
                        arrayList2.add(new ImageEntity(strO000OoO, strO000OoO2, i2, strO000OoO3, strO000OoO4, f, strO000OoO5, j, j2, fValueOf, interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo11) ? null : Float.valueOf((float) interfaceC24749OooO0OoO0ooOOo.getDouble(iOooO0Oo11)), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo12) ? null : Float.valueOf((float) interfaceC24749OooO0OoO0ooOOo.getDouble(iOooO0Oo12)), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo13) ? null : Float.valueOf((float) interfaceC24749OooO0OoO0ooOOo.getDouble(iOooO0Oo13)), ((int) interfaceC24749OooO0OoO0ooOOo.getLong(i)) != 0));
                        iOooO0Oo14 = i;
                        arrayList = arrayList2;
                        iOooO0Oo2 = i3;
                    }
                    ArrayList arrayList3 = arrayList;
                    interfaceC24749OooO0OoO0ooOOo.close();
                    return arrayList3;
                } catch (Throwable th) {
                    interfaceC24749OooO0OoO0ooOOo.close();
                    throw th;
                }
            }
        });
    }

    @Override // oo0oO0.AbstractC34767o0000oOO
    public final List<ImageEntity> OooOO0(final String str, final float f, final float f2, final float f3, final float f4) {
        return (List) C24734OooO0O0.OooO0o(this.f125162OooO00o, true, false, new InterfaceC32507OooOO0o() { // from class: oo0oO0.o0000oo0
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) throws Exception {
                String strO000OoO;
                ArrayList arrayList;
                int i;
                float f5;
                Float fValueOf;
                float f6 = f3;
                float f7 = f4;
                float f8 = f;
                float f9 = f2;
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo("select * from ImageEntity where page_id = ? and `left` <= ? and `top` <= ? and `right` >= ? and `bottom` >= ?");
                String str2 = str;
                try {
                    if (str2 == null) {
                        interfaceC24749OooO0OoO0ooOOo.OooO0oO(1);
                    } else {
                        interfaceC24749OooO0OoO0ooOOo.o000000O(1, str2);
                    }
                    interfaceC24749OooO0OoO0ooOOo.OooOOOO(f6, 2);
                    interfaceC24749OooO0OoO0ooOOo.OooOOOO(f7, 3);
                    interfaceC24749OooO0OoO0ooOOo.OooOOOO(f8, 4);
                    interfaceC24749OooO0OoO0ooOOo.OooOOOO(f9, 5);
                    int iOooO0Oo = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "id");
                    int iOooO0Oo2 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "uri");
                    int iOooO0Oo3 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "layer");
                    int iOooO0Oo4 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "layer_id");
                    int iOooO0Oo5 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "bounds");
                    int iOooO0Oo6 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "rotation");
                    int iOooO0Oo7 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "page_id");
                    int iOooO0Oo8 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "creation_time");
                    int iOooO0Oo9 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "last_modification_time");
                    int iOooO0Oo10 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "left");
                    int iOooO0Oo11 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "top");
                    int iOooO0Oo12 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "right");
                    int iOooO0Oo13 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "bottom");
                    int iOooO0Oo14 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "fixed");
                    ArrayList arrayList2 = new ArrayList();
                    while (interfaceC24749OooO0OoO0ooOOo.o00oO0o()) {
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
                        int i2 = (int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo3);
                        String strO000OoO3 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo4) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo4);
                        String strO000OoO4 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo5) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo5);
                        float f10 = (float) interfaceC24749OooO0OoO0ooOOo.getDouble(iOooO0Oo6);
                        String strO000OoO5 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo7) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo7);
                        long j = interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo8);
                        long j2 = interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo9);
                        if (interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo10)) {
                            f5 = f10;
                            fValueOf = null;
                        } else {
                            f5 = f10;
                            fValueOf = Float.valueOf((float) interfaceC24749OooO0OoO0ooOOo.getDouble(iOooO0Oo10));
                        }
                        arrayList2 = arrayList;
                        arrayList2.add(new ImageEntity(strO000OoO2, strO000OoO, i2, strO000OoO3, strO000OoO4, f5, strO000OoO5, j, j2, fValueOf, interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo11) ? null : Float.valueOf((float) interfaceC24749OooO0OoO0ooOOo.getDouble(iOooO0Oo11)), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo12) ? null : Float.valueOf((float) interfaceC24749OooO0OoO0ooOOo.getDouble(iOooO0Oo12)), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo13) ? null : Float.valueOf((float) interfaceC24749OooO0OoO0ooOOo.getDouble(iOooO0Oo13)), ((int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo14)) != 0));
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

    @Override // oo0oO0.AbstractC34767o0000oOO
    public final Object OooOO0O(ImageEntity[] imageEntityArr, o0OO00o0.o00O0000 o00o00002) {
        imageEntityArr.getClass();
        return C24734OooO0O0.OooO0oo(o00o00002, this.f125162OooO00o, new C33998o00o0O(1, this, imageEntityArr), false, true);
    }

    @Override // oo0oO0.AbstractC34767o0000oOO
    public final Object OooOO0o(ImageEntity[] imageEntityArr, o0OO00o0.o00O0000 o00o00002) {
        imageEntityArr.getClass();
        return C24734OooO0O0.OooO0oo(o00o00002, this.f125162OooO00o, new C34785o000Ooo(0, this, imageEntityArr), false, true);
    }

    @Override // oo0oO0.AbstractC34767o0000oOO
    public final Object OooOOO0(final ImageEntity[] imageEntityArr, C26587o00O00o c26587o00O00o) {
        imageEntityArr.getClass();
        return C24734OooO0O0.OooO0oo(c26587o00O00o, this.f125162OooO00o, new InterfaceC32507OooOO0o() { // from class: oo0oO0.o000
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) {
                this.f125099OooOo0o.f125165OooO0Oo.OoooOOO((InterfaceC24747OooO0O0) obj, imageEntityArr);
                return C32460OooOooO.f116667OooO00o;
            }
        }, false, true);
    }
}
