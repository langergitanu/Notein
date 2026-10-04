package oo0oO0;

import com.aspose.slides.C22218Oooo;
import com.orion.notein.data.p602db.NoteContentDatabase_Impl;
import com.orion.notein.data.p602db.entity.StrokeEntity;
import java.util.ArrayList;
import java.util.List;
import o000oo0o.C24718OooOO0o;
import o000oo0o.C24720OooOOO0;
import o000ooOO.C24734OooO0O0;
import o000ooo.InterfaceC24747OooO0O0;
import o000ooo.InterfaceC24749OooO0Oo;
import o0OO00o0.C26650o00Ooooo;
import o0OO00o0.C26652o00o00;
import o0OO00o0.C26653o00o000;
import o0OO00o0.C26654o00o0000;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: loaded from: classes9.dex */
public final class o0oO0Ooo extends AbstractC34993o0ooOoOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final NoteContentDatabase_Impl f125654OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0O00OOO f125655OooO0O0 = new o0O00OOO();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C34980o0O00Oo f125656OooO0OO = new C34980o0O00Oo();

    public o0oO0Ooo(NoteContentDatabase_Impl noteContentDatabase_Impl) {
        this.f125654OooO00o = noteContentDatabase_Impl;
    }

    @Override // oo0oO0.AbstractC34993o0ooOoOO
    public final Object OooO(final StrokeEntity[] strokeEntityArr, C26654o00o0000 c26654o00o0000) {
        strokeEntityArr.getClass();
        return C24734OooO0O0.OooO0oo(c26654o00o0000, this.f125654OooO00o, new InterfaceC32507OooOO0o() { // from class: oo0oO0.o0O000oo
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) {
                this.f125611OooOo0o.f125655OooO0O0.OooOoo0((InterfaceC24747OooO0O0) obj, strokeEntityArr);
                return C32460OooOooO.f116667OooO00o;
            }
        }, false, true);
    }

    @Override // oo0oO0.AbstractC34993o0ooOoOO
    public final Object OooO00o(C26650o00Ooooo c26650o00Ooooo) {
        return C24734OooO0O0.OooO0oo(c26650o00Ooooo, this.f125654OooO00o, new o0O00O(), false, true);
    }

    @Override // oo0oO0.AbstractC34993o0ooOoOO
    public final Object OooO0O0(final List list, C26653o00o000 c26653o00o000) {
        final String strOooO00o = com.aspose.slides.internal.p332p7.OooOO0O.OooO00o(")", C22218Oooo.OooO0OO("DELETE FROM StrokeEntity where id in ("), list);
        return C24734OooO0O0.OooO0oo(c26653o00o000, this.f125654OooO00o, new InterfaceC32507OooOO0o() { // from class: oo0oO0.o0O00
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) throws Exception {
                List<String> list2 = list;
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo(strOooO00o);
                try {
                    int i = 1;
                    for (String str : list2) {
                        if (str == null) {
                            interfaceC24749OooO0OoO0ooOOo.OooO0oO(i);
                        } else {
                            interfaceC24749OooO0OoO0ooOOo.o000000O(i, str);
                        }
                        i++;
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

    @Override // oo0oO0.AbstractC34993o0ooOoOO
    public final void OooO0OO(String str) {
        C24734OooO0O0.OooO0o(this.f125654OooO00o, false, true, new o00O(str, 1));
    }

    @Override // oo0oO0.AbstractC34993o0ooOoOO
    public final void OooO0Oo(final String str) {
        C24734OooO0O0.OooO0o(this.f125654OooO00o, false, true, new InterfaceC32507OooOO0o() { // from class: oo0oO0.o0O00O0o
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) throws Exception {
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo("DELETE FROM StrokeEntity WHERE page_id = ?");
                String str2 = str;
                try {
                    if (str2 == null) {
                        interfaceC24749OooO0OoO0ooOOo.OooO0oO(1);
                    } else {
                        interfaceC24749OooO0OoO0ooOOo.o000000O(1, str2);
                    }
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

    @Override // oo0oO0.AbstractC34993o0ooOoOO
    public final C24718OooOO0o OooO0o() {
        o0O00OO o0o00oo2 = new o0O00OO();
        return C24720OooOOO0.OooO00o(this.f125654OooO00o, new String[]{"StrokeEntity"}, o0o00oo2);
    }

    @Override // oo0oO0.AbstractC34993o0ooOoOO
    public final List<StrokeEntity> OooO0o0(String str) {
        return (List) C24734OooO0O0.OooO0o(this.f125654OooO00o, true, false, new C34830o00O0oOO(str, 1));
    }

    @Override // oo0oO0.AbstractC34993o0ooOoOO
    public final Object OooO0oO(final String str, C26652o00o00 c26652o00o00) {
        return C24734OooO0O0.OooO0oo(c26652o00o00, this.f125654OooO00o, new InterfaceC32507OooOO0o() { // from class: oo0oO0.o0OoO00O
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) throws Exception {
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo("SELECT COUNT(*) FROM StrokeEntity WHERE page_id = ?");
                String str2 = str;
                try {
                    if (str2 == null) {
                        interfaceC24749OooO0OoO0ooOOo.OooO0oO(1);
                    } else {
                        interfaceC24749OooO0OoO0ooOOo.o000000O(1, str2);
                    }
                    Long lValueOf = null;
                    if (interfaceC24749OooO0OoO0ooOOo.o00oO0o() && !interfaceC24749OooO0OoO0ooOOo.isNull(0)) {
                        lValueOf = Long.valueOf(interfaceC24749OooO0OoO0ooOOo.getLong(0));
                    }
                    return lValueOf;
                } finally {
                    interfaceC24749OooO0OoO0ooOOo.close();
                }
            }
        }, true, false);
    }

    @Override // oo0oO0.AbstractC34993o0ooOoOO
    public final List<StrokeEntity> OooO0oo(final String str, final float f, final float f2, final float f3, final float f4) {
        return (List) C24734OooO0O0.OooO0o(this.f125654OooO00o, true, false, new InterfaceC32507OooOO0o() { // from class: oo0oO0.o0O00O0
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) throws Exception {
                int i;
                Float fValueOf;
                float f5 = f3;
                float f6 = f4;
                float f7 = f;
                float f8 = f2;
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo("select * from StrokeEntity where page_id = ? and `left` <= ? and `top` <= ? and `right` >= ? and `bottom` >= ?");
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
                    int iOooO0Oo3 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "layer_id");
                    int iOooO0Oo4 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "creation_time");
                    int iOooO0Oo5 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "record_json");
                    int iOooO0Oo6 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "ink_stroke_json");
                    int iOooO0Oo7 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "ink_stroke_blob");
                    int iOooO0Oo8 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "left");
                    int iOooO0Oo9 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "top");
                    int iOooO0Oo10 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "right");
                    int iOooO0Oo11 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "bottom");
                    ArrayList arrayList = new ArrayList();
                    while (interfaceC24749OooO0OoO0ooOOo.o00oO0o()) {
                        String strO000OoO = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo);
                        String strO000OoO2 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo2) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo2);
                        String strO000OoO3 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo3) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo3);
                        long j = interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo4);
                        String strO000OoO4 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo5) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo5);
                        String strO000OoO5 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo6) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo6);
                        byte[] blob = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo7) ? null : interfaceC24749OooO0OoO0ooOOo.getBlob(iOooO0Oo7);
                        if (interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo8)) {
                            i = iOooO0Oo;
                            fValueOf = null;
                        } else {
                            i = iOooO0Oo;
                            fValueOf = Float.valueOf((float) interfaceC24749OooO0OoO0ooOOo.getDouble(iOooO0Oo8));
                        }
                        arrayList.add(new StrokeEntity(strO000OoO, strO000OoO2, strO000OoO3, j, strO000OoO4, strO000OoO5, blob, fValueOf, interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo9) ? null : Float.valueOf((float) interfaceC24749OooO0OoO0ooOOo.getDouble(iOooO0Oo9)), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo10) ? null : Float.valueOf((float) interfaceC24749OooO0OoO0ooOOo.getDouble(iOooO0Oo10)), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo11) ? null : Float.valueOf((float) interfaceC24749OooO0OoO0ooOOo.getDouble(iOooO0Oo11))));
                        iOooO0Oo = i;
                    }
                    interfaceC24749OooO0OoO0ooOOo.close();
                    return arrayList;
                } catch (Throwable th) {
                    interfaceC24749OooO0OoO0ooOOo.close();
                    throw th;
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // oo0oO0.AbstractC34993o0ooOoOO
    public final Object OooOO0(StrokeEntity[] strokeEntityArr, C26654o00o0000 c26654o00o0000) {
        strokeEntityArr.getClass();
        return C24734OooO0O0.OooO0oo(c26654o00o0000, this.f125654OooO00o, new C34831o00O0oOo(this, strokeEntityArr, 1), false, true);
    }
}
