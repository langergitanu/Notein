package oo0oO0;

import com.aspose.slides.C22218Oooo;
import com.orion.notein.data.p602db.NoteContentDatabase_Impl;
import com.orion.notein.data.p602db.entity.TextBoxEntity;
import java.util.ArrayList;
import java.util.List;
import o000ooOO.C24734OooO0O0;
import o000ooo.InterfaceC24747OooO0O0;
import o000ooo.InterfaceC24749OooO0Oo;
import o0OO00o0.C26666o00o0O0O;
import o0OO00o0.C26667o00o0OO;
import o0OO00o0.C26670o00o0OOo;
import o0OO00o0.C26672o00o0Oo0;
import o0Ooo.C29268OooOOo0;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: oo0oO0.o0O00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C34983o0O00o extends AbstractC34981o0O00OoO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final NoteContentDatabase_Impl f125618OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C34838o00OO0oO f125619OooO0O0 = new C34838o00OO0oO(1);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C34986o0O00o0o f125620OooO0OO = new C34986o0O00o0o();

    public C34983o0O00o(NoteContentDatabase_Impl noteContentDatabase_Impl) {
        this.f125618OooO00o = noteContentDatabase_Impl;
    }

    @Override // oo0oO0.AbstractC34981o0O00OoO
    public final Object OooO(TextBoxEntity[] textBoxEntityArr, C26666o00o0O0O c26666o00o0O0O) {
        textBoxEntityArr.getClass();
        return C24734OooO0O0.OooO0oo(c26666o00o0O0O, this.f125618OooO00o, new OooOOO(2, this, textBoxEntityArr), false, true);
    }

    @Override // oo0oO0.AbstractC34981o0O00OoO
    public final void OooO00o() {
        C24734OooO0O0.OooO0o(this.f125618OooO00o, false, true, new C34982o0O00Ooo());
    }

    @Override // oo0oO0.AbstractC34981o0O00OoO
    public final Object OooO0O0(List list, C26667o00o0OO c26667o00o0OO) {
        return C24734OooO0O0.OooO0oo(c26667o00o0OO, this.f125618OooO00o, new C34709OooOOOo(2, com.aspose.slides.internal.p332p7.OooOO0O.OooO00o(")", C22218Oooo.OooO0OO("DELETE FROM TextBoxEntity where id in ("), list), list), false, true);
    }

    @Override // oo0oO0.AbstractC34981o0O00OoO
    public final void OooO0OO(String str) {
        C24734OooO0O0.OooO0o(this.f125618OooO00o, false, true, new C34836o00OO0o(str, 1));
    }

    @Override // oo0oO0.AbstractC34981o0O00OoO
    public final Object OooO0Oo(String str, C26670o00o0OOo c26670o00o0OOo) {
        return C24734OooO0O0.OooO0oo(c26670o00o0OOo, this.f125618OooO00o, new o00OO0(str, 1), false, true);
    }

    @Override // oo0oO0.AbstractC34981o0O00OoO
    public final List<TextBoxEntity> OooO0o(final String str, final float f, final float f2, final float f3, final float f4) {
        return (List) C24734OooO0O0.OooO0o(this.f125618OooO00o, true, false, new InterfaceC32507OooOO0o() { // from class: oo0oO0.o0O00o00
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
                int i7;
                Float fValueOf3;
                int i8;
                int i9;
                float f5 = f3;
                float f6 = f4;
                float f7 = f;
                float f8 = f2;
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo("select * from TextBoxEntity where page_id = ? and `left` <= ? and `top` <= ? and `right` >= ? and `bottom` >= ?");
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
                        float f9 = (float) interfaceC24749OooO0OoO0ooOOo.getDouble(iOooO0Oo4);
                        float f10 = (float) interfaceC24749OooO0OoO0ooOOo.getDouble(iOooO0Oo5);
                        float f11 = (float) interfaceC24749OooO0OoO0ooOOo.getDouble(iOooO0Oo6);
                        float f12 = (float) interfaceC24749OooO0OoO0ooOOo.getDouble(iOooO0Oo7);
                        int i10 = (int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo8);
                        String strO000OoO4 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo9) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo9);
                        int i11 = (int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo10);
                        String strO000OoO5 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo11) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo11);
                        int i12 = (int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo12);
                        long j = interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo13);
                        String strO000OoO6 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo14) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo14);
                        int i13 = iOooO0Oo15;
                        if (interfaceC24749OooO0OoO0ooOOo.isNull(i13)) {
                            i3 = iOooO0Oo5;
                            i4 = iOooO0Oo6;
                            fValueOf = null;
                        } else {
                            i3 = iOooO0Oo5;
                            i4 = iOooO0Oo6;
                            fValueOf = Float.valueOf((float) interfaceC24749OooO0OoO0ooOOo.getDouble(i13));
                        }
                        int i14 = iOooO0Oo16;
                        if (interfaceC24749OooO0OoO0ooOOo.isNull(i14)) {
                            i5 = i12;
                            i6 = i13;
                            fValueOf2 = null;
                        } else {
                            i5 = i12;
                            i6 = i13;
                            fValueOf2 = Float.valueOf((float) interfaceC24749OooO0OoO0ooOOo.getDouble(i14));
                        }
                        int i15 = iOooO0Oo17;
                        if (interfaceC24749OooO0OoO0ooOOo.isNull(i15)) {
                            i7 = iOooO0Oo4;
                            fValueOf3 = null;
                        } else {
                            i7 = iOooO0Oo4;
                            fValueOf3 = Float.valueOf((float) interfaceC24749OooO0OoO0ooOOo.getDouble(i15));
                        }
                        int i16 = iOooO0Oo18;
                        if (interfaceC24749OooO0OoO0ooOOo.isNull(i16)) {
                            i8 = i14;
                            i9 = i6;
                        } else {
                            i8 = i14;
                            i9 = i6;
                            fValueOf4 = Float.valueOf((float) interfaceC24749OooO0OoO0ooOOo.getDouble(i16));
                        }
                        arrayList.add(new TextBoxEntity(strO000OoO2, strO000OoO3, strO000OoO, f9, f10, f11, f12, i10, strO000OoO4, i11, strO000OoO5, i5, j, strO000OoO6, fValueOf, fValueOf2, fValueOf3, fValueOf4));
                        int i17 = i7;
                        iOooO0Oo16 = i8;
                        iOooO0Oo4 = i17;
                        iOooO0Oo5 = i3;
                        iOooO0Oo18 = i16;
                        iOooO0Oo15 = i9;
                        iOooO0Oo3 = i;
                        iOooO0Oo6 = i4;
                        iOooO0Oo17 = i15;
                        iOooO0Oo2 = i2;
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

    @Override // oo0oO0.AbstractC34981o0O00OoO
    public final Object OooO0o0(final String str, C26672o00o0Oo0 c26672o00o0Oo0) {
        return C24734OooO0O0.OooO0oo(c26672o00o0Oo0, this.f125618OooO00o, new InterfaceC32507OooOO0o() { // from class: oo0oO0.o0O00o0O
            /* JADX WARN: Multi-variable type inference failed */
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) throws Exception {
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo("select * from TextBoxEntity where id = ?");
                String str2 = str;
                try {
                    if (str2 == null) {
                        interfaceC24749OooO0OoO0ooOOo.OooO0oO(1);
                    } else {
                        interfaceC24749OooO0OoO0ooOOo.o000000O(1, str2);
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
                    if (interfaceC24749OooO0OoO0ooOOo.o00oO0o()) {
                        textBoxEntity = new TextBoxEntity(interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo2) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo2), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo3) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo3), (float) interfaceC24749OooO0OoO0ooOOo.getDouble(iOooO0Oo4), (float) interfaceC24749OooO0OoO0ooOOo.getDouble(iOooO0Oo5), (float) interfaceC24749OooO0OoO0ooOOo.getDouble(iOooO0Oo6), (float) interfaceC24749OooO0OoO0ooOOo.getDouble(iOooO0Oo7), (int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo8), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo9) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo9), (int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo10), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo11) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo11), (int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo12), interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo13), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo14) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo14), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo15) ? null : Float.valueOf((float) interfaceC24749OooO0OoO0ooOOo.getDouble(iOooO0Oo15)), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo16) ? null : Float.valueOf((float) interfaceC24749OooO0OoO0ooOOo.getDouble(iOooO0Oo16)), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo17) ? null : Float.valueOf((float) interfaceC24749OooO0OoO0ooOOo.getDouble(iOooO0Oo17)), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo18) ? null : Float.valueOf((float) interfaceC24749OooO0OoO0ooOOo.getDouble(iOooO0Oo18)));
                    }
                    interfaceC24749OooO0OoO0ooOOo.close();
                    return textBoxEntity;
                } catch (Throwable th) {
                    interfaceC24749OooO0OoO0ooOOo.close();
                    throw th;
                }
            }
        }, true, false);
    }

    @Override // oo0oO0.AbstractC34981o0O00OoO
    public final List<TextBoxEntity> OooO0oO(String str) {
        return (List) C24734OooO0O0.OooO0o(this.f125618OooO00o, true, false, new C29268OooOOo0(str, 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // oo0oO0.AbstractC34981o0O00OoO
    public final Object OooO0oo(TextBoxEntity[] textBoxEntityArr, C26666o00o0O0O c26666o00o0O0O) {
        textBoxEntityArr.getClass();
        return C24734OooO0O0.OooO0oo(c26666o00o0O0O, this.f125618OooO00o, new C34835o00OO00o(this, textBoxEntityArr, 1), false, true);
    }
}
