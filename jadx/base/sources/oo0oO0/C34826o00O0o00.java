package oo0oO0;

import com.orion.notein.data.p602db.NoteContentDatabase_Impl;
import com.orion.notein.data.p602db.entity.NoteContentEntity;
import com.orion.notein.data.p602db.entity.NoteConverter;
import com.orion.notein.data.p602db.entity.UpdatePageOffSetEntity;
import com.orion.notein.data.p602db.entity.UpdateZoomEntity;
import o000oo0o.C24718OooOO0o;
import o000oo0o.C24720OooOOO0;
import o000ooOO.C24734OooO0O0;
import o000ooo.InterfaceC24747OooO0O0;
import o000ooo.InterfaceC24749OooO0Oo;
import o0OO.C26408OooO0oo;
import o0OO.C26409OooOO0o;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0o0OOO.C33684OooO0Oo;

/* JADX INFO: renamed from: oo0oO0.o00O0o00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C34826o00O0o00 implements o00O0O00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final NoteContentDatabase_Impl f125285OooO00o;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final NoteConverter f125287OooO0OO = new NoteConverter();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final oo0oOO0 f125286OooO0O0 = new oo0oOO0(this);

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final C34820o00O0Oo f125288OooO0Oo = new C34820o00O0Oo();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final C34822o00O0OoO f125290OooO0o0 = new C34822o00O0OoO(this);

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final C34823o00O0Ooo f125289OooO0o = new C34823o00O0Ooo(this);

    public C34826o00O0o00(NoteContentDatabase_Impl noteContentDatabase_Impl) {
        this.f125285OooO00o = noteContentDatabase_Impl;
    }

    @Override // oo0oO0.o00O0O00
    public final Object OooO(UpdateZoomEntity updateZoomEntity, o0OO.OooOO0 oooOO02) {
        return C24734OooO0O0.OooO0oo(oooOO02, this.f125285OooO00o, new C33684OooO0Oo(1, this, updateZoomEntity), false, true);
    }

    @Override // oo0oO0.o00O0O00
    public final C24718OooOO0o OooO00o(final String str) {
        InterfaceC32507OooOO0o interfaceC32507OooOO0o = new InterfaceC32507OooOO0o() { // from class: oo0oO0.o00O0Oo0
            /* JADX WARN: Multi-variable type inference failed */
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) throws Exception {
                NoteConverter noteConverter = this.f125281OooOo0o.f125287OooO0OO;
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo("select * from NoteContentEntity where id = ?");
                String str2 = str;
                try {
                    if (str2 == null) {
                        interfaceC24749OooO0OoO0ooOOo.OooO0oO(1);
                    } else {
                        interfaceC24749OooO0OoO0ooOOo.o000000O(1, str2);
                    }
                    int iOooO0Oo = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "id");
                    int iOooO0Oo2 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "page_list");
                    int iOooO0Oo3 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "page_layer_list");
                    int iOooO0Oo4 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "outline_list");
                    int iOooO0Oo5 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "default_page_id");
                    int iOooO0Oo6 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "pdf_info_id");
                    int iOooO0Oo7 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "saved_page_index");
                    int iOooO0Oo8 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "activated_page_layer_id");
                    int iOooO0Oo9 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "zoom");
                    int iOooO0Oo10 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "unbounded_page_offset_x");
                    int iOooO0Oo11 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "unbounded_page_offset_y");
                    int iOooO0Oo12 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "page_offset_json");
                    int iOooO0Oo13 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "unbounded_note");
                    int iOooO0Oo14 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "creation_time");
                    int iOooO0Oo15 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "last_modification_time");
                    int iOooO0Oo16 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "extras");
                    if (interfaceC24749OooO0OoO0ooOOo.o00oO0o()) {
                        noteContentEntity = new NoteContentEntity(interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo2) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo2), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo3) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo3), noteConverter.stringToOutlineList(interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo4) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo4)), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo5) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo5), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo6) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo6), (int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo7), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo8) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo8), (float) interfaceC24749OooO0OoO0ooOOo.getDouble(iOooO0Oo9), (float) interfaceC24749OooO0OoO0ooOOo.getDouble(iOooO0Oo10), (float) interfaceC24749OooO0OoO0ooOOo.getDouble(iOooO0Oo11), noteConverter.fromJson(interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo12) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo12)), ((int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo13)) != 0, interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo14), interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo15), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo16) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo16));
                    }
                    interfaceC24749OooO0OoO0ooOOo.close();
                    return noteContentEntity;
                } catch (Throwable th) {
                    interfaceC24749OooO0OoO0ooOOo.close();
                    throw th;
                }
            }
        };
        return C24720OooOOO0.OooO00o(this.f125285OooO00o, new String[]{"NoteContentEntity"}, interfaceC32507OooOO0o);
    }

    @Override // oo0oO0.o00O0O00
    public final Object OooO0O0(String str, o0OO.OooO0O0 oooO0O0) {
        return C24734OooO0O0.OooO0oo(oooO0O0, this.f125285OooO00o, new o00O0OOO(str, 0), false, true);
    }

    @Override // oo0oO0.o00O0O00
    public final Object OooO0OO(final String str, AbstractC32476OooO abstractC32476OooO) {
        return C24734OooO0O0.OooO0oo(abstractC32476OooO, this.f125285OooO00o, new InterfaceC32507OooOO0o() { // from class: oo0oO0.o00O0O0O
            /* JADX WARN: Multi-variable type inference failed */
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) throws Exception {
                NoteConverter noteConverter = this.f125269OooOo0o.f125287OooO0OO;
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo("select * from NoteContentEntity where id = ?");
                String str2 = str;
                try {
                    if (str2 == null) {
                        interfaceC24749OooO0OoO0ooOOo.OooO0oO(1);
                    } else {
                        interfaceC24749OooO0OoO0ooOOo.o000000O(1, str2);
                    }
                    int iOooO0Oo = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "id");
                    int iOooO0Oo2 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "page_list");
                    int iOooO0Oo3 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "page_layer_list");
                    int iOooO0Oo4 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "outline_list");
                    int iOooO0Oo5 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "default_page_id");
                    int iOooO0Oo6 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "pdf_info_id");
                    int iOooO0Oo7 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "saved_page_index");
                    int iOooO0Oo8 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "activated_page_layer_id");
                    int iOooO0Oo9 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "zoom");
                    int iOooO0Oo10 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "unbounded_page_offset_x");
                    int iOooO0Oo11 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "unbounded_page_offset_y");
                    int iOooO0Oo12 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "page_offset_json");
                    int iOooO0Oo13 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "unbounded_note");
                    int iOooO0Oo14 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "creation_time");
                    int iOooO0Oo15 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "last_modification_time");
                    int iOooO0Oo16 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "extras");
                    if (interfaceC24749OooO0OoO0ooOOo.o00oO0o()) {
                        noteContentEntity = new NoteContentEntity(interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo2) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo2), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo3) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo3), noteConverter.stringToOutlineList(interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo4) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo4)), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo5) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo5), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo6) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo6), (int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo7), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo8) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo8), (float) interfaceC24749OooO0OoO0ooOOo.getDouble(iOooO0Oo9), (float) interfaceC24749OooO0OoO0ooOOo.getDouble(iOooO0Oo10), (float) interfaceC24749OooO0OoO0ooOOo.getDouble(iOooO0Oo11), noteConverter.fromJson(interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo12) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo12)), ((int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo13)) != 0, interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo14), interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo15), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo16) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo16));
                    }
                    interfaceC24749OooO0OoO0ooOOo.close();
                    return noteContentEntity;
                } catch (Throwable th) {
                    interfaceC24749OooO0OoO0ooOOo.close();
                    throw th;
                }
            }
        }, true, false);
    }

    @Override // oo0oO0.o00O0O00
    public final Object OooO0Oo(final String str, final long j, o0OO.OooO oooO) {
        return C24734OooO0O0.OooO0oo(oooO, this.f125285OooO00o, new InterfaceC32507OooOO0o() { // from class: oo0oO0.o00O0O0
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) throws Exception {
                long j2 = j;
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo("update NoteContentEntity set last_modification_time = ? where id = ?");
                try {
                    interfaceC24749OooO0OoO0ooOOo.OooO0o(1, j2);
                    String str2 = str;
                    if (str2 == null) {
                        interfaceC24749OooO0OoO0ooOOo.OooO0oO(2);
                    } else {
                        interfaceC24749OooO0OoO0ooOOo.o000000O(2, str2);
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

    /* JADX WARN: Multi-variable type inference failed */
    @Override // oo0oO0.o00O0O00
    public final Object OooO0o(NoteContentEntity[] noteContentEntityArr, AbstractC32476OooO abstractC32476OooO) {
        return C24734OooO0O0.OooO0oo(abstractC32476OooO, this.f125285OooO00o, new o00O0OO(this, noteContentEntityArr, 0), false, true);
    }

    @Override // oo0oO0.o00O0O00
    public final Object OooO0o0(final String str, o0OO.OooO0OO oooO0OO) {
        return C24734OooO0O0.OooO0oo(oooO0OO, this.f125285OooO00o, new InterfaceC32507OooOO0o() { // from class: oo0oO0.o00O0OOo
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) throws Exception {
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo("select last_modification_time from NoteContentEntity where id = ?");
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

    @Override // oo0oO0.o00O0O00
    public final Object OooO0oO(final String str, final int i, o0OO.OooOO0O oooOO0O) {
        return C24734OooO0O0.OooO0oo(oooOO0O, this.f125285OooO00o, new InterfaceC32507OooOO0o() { // from class: oo0oO0.o00O0OO0
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) throws Exception {
                int i2 = i;
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo("update NoteContentEntity set saved_page_index = ? where id = ?");
                try {
                    interfaceC24749OooO0OoO0ooOOo.OooO0o(1, i2);
                    String str2 = str;
                    if (str2 == null) {
                        interfaceC24749OooO0OoO0ooOOo.OooO0oO(2);
                    } else {
                        interfaceC24749OooO0OoO0ooOOo.o000000O(2, str2);
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

    @Override // oo0oO0.o00O0O00
    public final Object OooO0oo(final UpdatePageOffSetEntity updatePageOffSetEntity, C26409OooOO0o c26409OooOO0o) {
        return C24734OooO0O0.OooO0oo(c26409OooOO0o, this.f125285OooO00o, new InterfaceC32507OooOO0o() { // from class: oo0oO0.o00O0O0o
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) throws Exception {
                this.f125271OooOo0o.f125289OooO0o.o000oOoO((InterfaceC24747OooO0O0) obj, updatePageOffSetEntity);
                return C32460OooOooO.f116667OooO00o;
            }
        }, false, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // oo0oO0.o00O0O00
    public final Object OooOO0(NoteContentEntity[] noteContentEntityArr, C26408OooO0oo c26408OooO0oo) {
        return C24734OooO0O0.OooO0oo(c26408OooO0oo, this.f125285OooO00o, new oo0o0O0(this, noteContentEntityArr, 0), false, true);
    }
}
