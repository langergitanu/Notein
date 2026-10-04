package oo0oO0;

import com.aspose.slides.C22218Oooo;
import com.orion.notein.data.p602db.NoteContentDatabase_Impl;
import com.orion.notein.data.p602db.entity.PageConverter;
import com.orion.notein.data.p602db.entity.PageEntity;
import com.orion.notein.domain.models.page.PaperOrientation;
import com.orion.penkit.models.LayerInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import o000oo0o.C24718OooOO0o;
import o000oo0o.C24720OooOOO0;
import o000ooOO.C24734OooO0O0;
import o000ooo.InterfaceC24747OooO0O0;
import o000ooo.InterfaceC24749OooO0Oo;
import o00OOooo.C25022OooO0O0;
import o0OOO0OO.C27011OooOO0o;
import o0OOO0OO.C27012OooOOOo;
import o0OOO0OO.C27014OooOOo0;
import o0OoO0oo.C28741Oooooo;
import o0OoO0oo.C28975o0OoOo0;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oOo000Oo.C34418OooO00o;

/* JADX INFO: renamed from: oo0oO0.o00o0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C34897o00o0OO implements InterfaceC34887o00o00O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final NoteContentDatabase_Impl f125432OooO00o;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final PageConverter f125434OooO0OO = new PageConverter();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C34895o00o0O00 f125433OooO0O0 = new C34895o00o0O00(this);

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final C34894o00o0O0 f125435OooO0Oo = new C34894o00o0O0(this);

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final C34896o00o0O0O f125437OooO0o0 = new C34896o00o0O0O();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final C34898o00o0OO0 f125436OooO0o = new C34898o00o0OO0();

    /* JADX INFO: renamed from: oo0oO0.o00o0OO$OooO00o */
    public static /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f125438OooO00o;

        static {
            int[] iArr = new int[PaperOrientation.values().length];
            f125438OooO00o = iArr;
            try {
                iArr[PaperOrientation.HORIZONTAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f125438OooO00o[PaperOrientation.VERTICAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public C34897o00o0OO(NoteContentDatabase_Impl noteContentDatabase_Impl) {
        this.f125432OooO00o = noteContentDatabase_Impl;
    }

    public static PaperOrientation OooOOO(String str) {
        str.getClass();
        if (str.equals("VERTICAL")) {
            return PaperOrientation.VERTICAL;
        }
        if (str.equals("HORIZONTAL")) {
            return PaperOrientation.HORIZONTAL;
        }
        throw new IllegalArgumentException("Can't convert value to enum, unknown value: ".concat(str));
    }

    public static String OooOOO0(C34897o00o0OO c34897o00o0OO, PaperOrientation paperOrientation) {
        c34897o00o0OO.getClass();
        int i = OooO00o.f125438OooO00o[paperOrientation.ordinal()];
        if (i == 1) {
            return "HORIZONTAL";
        }
        if (i == 2) {
            return "VERTICAL";
        }
        throw new IllegalArgumentException("Can't convert enum to string, unknown enum value: " + paperOrientation);
    }

    @Override // oo0oO0.InterfaceC34887o00o00O0
    public final Object OooO(final List list, o0OOO0OO.OooO0o oooO0o) {
        final String strOooO00o = com.aspose.slides.internal.p332p7.OooOO0O.OooO00o(")", C22218Oooo.OooO0OO("delete FROM PageEntity where id in ("), list);
        return C24734OooO0O0.OooO0oo(oooO0o, this.f125432OooO00o, new InterfaceC32507OooOO0o() { // from class: oo0oO0.o00o00oO
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

    @Override // oo0oO0.InterfaceC34887o00o00O0
    public final Object OooO00o(final PageConverter.PageLastModificationEntity pageLastModificationEntity, C27012OooOOOo c27012OooOOOo) {
        return C24734OooO0O0.OooO0oo(c27012OooOOOo, this.f125432OooO00o, new InterfaceC32507OooOO0o() { // from class: oo0oO0.o00o00o
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) throws Exception {
                this.f125422OooOo0o.f125437OooO0o0.o000oOoO((InterfaceC24747OooO0O0) obj, pageLastModificationEntity);
                return C32460OooOooO.f116667OooO00o;
            }
        }, false, true);
    }

    @Override // oo0oO0.InterfaceC34887o00o00O0
    public final Object OooO0O0(String str, AbstractC32476OooO abstractC32476OooO) {
        return C24734OooO0O0.OooO0oo(abstractC32476OooO, this.f125432OooO00o, new o00000OO(this, str), true, false);
    }

    @Override // oo0oO0.InterfaceC34887o00o00O0
    public final Object OooO0OO(Set set, C27011OooOO0o c27011OooOO0o) {
        StringBuilder sbOooO0OO = C22218Oooo.OooO0OO("SELECT * FROM PageEntity where id in (");
        C25022OooO0O0.OooO0OO(set.size(), sbOooO0OO);
        sbOooO0OO.append(")");
        return C24734OooO0O0.OooO0oo(c27011OooOO0o, this.f125432OooO00o, new C28975o0OoOo0(this, sbOooO0OO.toString(), set, 1), true, false);
    }

    @Override // oo0oO0.InterfaceC34887o00o00O0
    public final PageEntity OooO0Oo(String str) {
        return (PageEntity) C24734OooO0O0.OooO0o(this.f125432OooO00o, true, false, new C34753o00000o0(this, str, 1));
    }

    @Override // oo0oO0.InterfaceC34887o00o00O0
    public final Object OooO0o(final PageConverter.PageRotationEntity[] pageRotationEntityArr, C27014OooOOo0 c27014OooOOo0) {
        pageRotationEntityArr.getClass();
        return C24734OooO0O0.OooO0oo(c27014OooOOo0, this.f125432OooO00o, new InterfaceC32507OooOO0o() { // from class: oo0oO0.o00o0
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) {
                this.f125407OooOo0o.f125436OooO0o.OoooOOO((InterfaceC24747OooO0O0) obj, pageRotationEntityArr);
                return C32460OooOooO.f116667OooO00o;
            }
        }, false, true);
    }

    @Override // oo0oO0.InterfaceC34887o00o00O0
    public final C24718OooOO0o OooO0o0(String str) {
        o00000O o00000o = new o00000O(this, str);
        return C24720OooOOO0.OooO00o(this.f125432OooO00o, new String[]{"PageEntity"}, o00000o);
    }

    @Override // oo0oO0.InterfaceC34887o00o00O0
    public final Object OooO0oO(final PageEntity[] pageEntityArr, AbstractC32476OooO abstractC32476OooO) {
        pageEntityArr.getClass();
        return C24734OooO0O0.OooO0oo(abstractC32476OooO, this.f125432OooO00o, new InterfaceC32507OooOO0o() { // from class: oo0oO0.o00o00o0
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) {
                this.f125424OooOo0o.f125433OooO0O0.OooOoo0((InterfaceC24747OooO0O0) obj, pageEntityArr);
                return C32460OooOooO.f116667OooO00o;
            }
        }, false, true);
    }

    @Override // oo0oO0.InterfaceC34887o00o00O0
    public final Object OooO0oo(PageEntity[] pageEntityArr, AbstractC32476OooO abstractC32476OooO) {
        pageEntityArr.getClass();
        return C24734OooO0O0.OooO0oo(abstractC32476OooO, this.f125432OooO00o, new C28741Oooooo(1, this, pageEntityArr), false, true);
    }

    @Override // oo0oO0.InterfaceC34887o00o00O0
    public final C24718OooOO0o OooOO0(final String str) {
        InterfaceC32507OooOO0o interfaceC32507OooOO0o = new InterfaceC32507OooOO0o() { // from class: oo0oO0.o00o00Oo
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) throws Exception {
                String strO000OoO;
                int i;
                int i2;
                String strO000OoO2;
                int i3;
                int i4;
                C34897o00o0OO c34897o00o0OO = this.f125420OooOo0o;
                c34897o00o0OO.getClass();
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo("SELECT * FROM PageEntity where note_id = ? and is_in_trash_bin = 0");
                try {
                    interfaceC24749OooO0OoO0ooOOo.o000000O(1, str);
                    int iOooO0Oo = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "id");
                    int iOooO0Oo2 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "note_id");
                    int iOooO0Oo3 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "paper_spec");
                    int iOooO0Oo4 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "page_orientation");
                    int iOooO0Oo5 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, LayerInfo.PAPER_THEME_LAYER_ID);
                    int iOooO0Oo6 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "padding_color");
                    int iOooO0Oo7 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "paper_padding");
                    int iOooO0Oo8 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "padding_style_json");
                    int iOooO0Oo9 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "creation_time");
                    int iOooO0Oo10 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "last_modification_time");
                    int iOooO0Oo11 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "tn_path");
                    int iOooO0Oo12 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "unbounded");
                    int iOooO0Oo13 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "source");
                    int iOooO0Oo14 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "recover_note_id");
                    C34897o00o0OO c34897o00o0OO2 = c34897o00o0OO;
                    int iOooO0Oo15 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "recover_note_title");
                    int iOooO0Oo16 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "recover_index");
                    int iOooO0Oo17 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "is_in_trash_bin");
                    int iOooO0Oo18 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "history_page_id_list");
                    int iOooO0Oo19 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "rotation_direction_index");
                    ArrayList arrayList = new ArrayList();
                    while (interfaceC24749OooO0OoO0ooOOo.o00oO0o()) {
                        String strO000OoO3 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo);
                        String strO000OoO4 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo2) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo2);
                        String strO000OoO5 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo3) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo3);
                        PaperOrientation paperOrientationOooOOO = C34897o00o0OO.OooOOO(interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo4));
                        if (interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo5)) {
                            strO000OoO = null;
                            i2 = iOooO0Oo2;
                            i = iOooO0Oo3;
                        } else {
                            strO000OoO = interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo5);
                            i = iOooO0Oo3;
                            i2 = iOooO0Oo2;
                        }
                        int i5 = (int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo6);
                        String strO000OoO6 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo7) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo7);
                        String strO000OoO7 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo8) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo8);
                        long j = interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo9);
                        long j2 = interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo10);
                        String strO000OoO8 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo11) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo11);
                        boolean z = ((int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo12)) != 0;
                        int i6 = iOooO0Oo4;
                        int i7 = (int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo13);
                        String strO000OoO9 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo14) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo14);
                        int i8 = iOooO0Oo15;
                        if (interfaceC24749OooO0OoO0ooOOo.isNull(i8)) {
                            strO000OoO2 = null;
                            i4 = iOooO0Oo;
                            i3 = i6;
                        } else {
                            strO000OoO2 = interfaceC24749OooO0OoO0ooOOo.o000OoO(i8);
                            i3 = i6;
                            i4 = iOooO0Oo;
                        }
                        int i9 = iOooO0Oo16;
                        int i10 = iOooO0Oo13;
                        int i11 = (int) interfaceC24749OooO0OoO0ooOOo.getLong(i9);
                        int i12 = iOooO0Oo17;
                        int i13 = iOooO0Oo14;
                        boolean z2 = ((int) interfaceC24749OooO0OoO0ooOOo.getLong(i12)) != 0;
                        int i14 = iOooO0Oo18;
                        String strO000OoO10 = interfaceC24749OooO0OoO0ooOOo.isNull(i14) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(i14);
                        iOooO0Oo18 = i14;
                        C34897o00o0OO c34897o00o0OO3 = c34897o00o0OO2;
                        int i15 = iOooO0Oo19;
                        arrayList.add(new PageEntity(strO000OoO3, strO000OoO4, strO000OoO5, paperOrientationOooOOO, strO000OoO, i5, strO000OoO6, strO000OoO7, j, j2, strO000OoO8, z, i7, strO000OoO9, strO000OoO2, i11, z2, c34897o00o0OO3.f125434OooO0OO.stringToChildren(strO000OoO10), (int) interfaceC24749OooO0OoO0ooOOo.getLong(i15)));
                        iOooO0Oo19 = i15;
                        iOooO0Oo13 = i10;
                        iOooO0Oo14 = i13;
                        iOooO0Oo2 = i2;
                        iOooO0Oo3 = i;
                        iOooO0Oo16 = i9;
                        iOooO0Oo17 = i12;
                        c34897o00o0OO2 = c34897o00o0OO3;
                        iOooO0Oo = i4;
                        iOooO0Oo15 = i8;
                        iOooO0Oo4 = i3;
                    }
                    return arrayList;
                } finally {
                    interfaceC24749OooO0OoO0ooOOo.close();
                }
            }
        };
        return C24720OooOOO0.OooO00o(this.f125432OooO00o, new String[]{"PageEntity"}, interfaceC32507OooOO0o);
    }

    @Override // oo0oO0.InterfaceC34887o00o00O0
    public final C24718OooOO0o OooOO0O(final Set set) {
        StringBuilder sbOooO0OO = C22218Oooo.OooO0OO("SELECT * FROM PageEntity where id in (");
        C25022OooO0O0.OooO0OO(set.size(), sbOooO0OO);
        sbOooO0OO.append(")");
        final String string = sbOooO0OO.toString();
        InterfaceC32507OooOO0o interfaceC32507OooOO0o = new InterfaceC32507OooOO0o() { // from class: oo0oO0.o00o00oo
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) throws Exception {
                String strO000OoO;
                int i;
                int i2;
                String strO000OoO2;
                int i3;
                int i4;
                Set<String> set2 = set;
                C34897o00o0OO c34897o00o0OO = this.f125428OooOo0o;
                c34897o00o0OO.getClass();
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo(string);
                try {
                    int i5 = 1;
                    for (String str : set2) {
                        if (str == null) {
                            interfaceC24749OooO0OoO0ooOOo.OooO0oO(i5);
                        } else {
                            interfaceC24749OooO0OoO0ooOOo.o000000O(i5, str);
                        }
                        i5++;
                    }
                    int iOooO0Oo = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "id");
                    int iOooO0Oo2 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "note_id");
                    int iOooO0Oo3 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "paper_spec");
                    int iOooO0Oo4 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "page_orientation");
                    int iOooO0Oo5 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, LayerInfo.PAPER_THEME_LAYER_ID);
                    int iOooO0Oo6 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "padding_color");
                    int iOooO0Oo7 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "paper_padding");
                    int iOooO0Oo8 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "padding_style_json");
                    int iOooO0Oo9 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "creation_time");
                    int iOooO0Oo10 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "last_modification_time");
                    int iOooO0Oo11 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "tn_path");
                    int iOooO0Oo12 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "unbounded");
                    int iOooO0Oo13 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "source");
                    int iOooO0Oo14 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "recover_note_id");
                    C34897o00o0OO c34897o00o0OO2 = c34897o00o0OO;
                    int iOooO0Oo15 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "recover_note_title");
                    int iOooO0Oo16 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "recover_index");
                    int iOooO0Oo17 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "is_in_trash_bin");
                    int iOooO0Oo18 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "history_page_id_list");
                    int iOooO0Oo19 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "rotation_direction_index");
                    ArrayList arrayList = new ArrayList();
                    while (interfaceC24749OooO0OoO0ooOOo.o00oO0o()) {
                        String strO000OoO3 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo);
                        String strO000OoO4 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo2) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo2);
                        String strO000OoO5 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo3) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo3);
                        PaperOrientation paperOrientationOooOOO = C34897o00o0OO.OooOOO(interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo4));
                        if (interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo5)) {
                            strO000OoO = null;
                            i2 = iOooO0Oo2;
                            i = iOooO0Oo3;
                        } else {
                            strO000OoO = interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo5);
                            i = iOooO0Oo3;
                            i2 = iOooO0Oo2;
                        }
                        int i6 = (int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo6);
                        String strO000OoO6 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo7) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo7);
                        String strO000OoO7 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo8) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo8);
                        long j = interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo9);
                        long j2 = interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo10);
                        String strO000OoO8 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo11) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo11);
                        boolean z = ((int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo12)) != 0;
                        int i7 = iOooO0Oo4;
                        int i8 = (int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo13);
                        String strO000OoO9 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo14) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo14);
                        int i9 = iOooO0Oo15;
                        if (interfaceC24749OooO0OoO0ooOOo.isNull(i9)) {
                            strO000OoO2 = null;
                            i4 = iOooO0Oo;
                            i3 = i7;
                        } else {
                            strO000OoO2 = interfaceC24749OooO0OoO0ooOOo.o000OoO(i9);
                            i3 = i7;
                            i4 = iOooO0Oo;
                        }
                        int i10 = iOooO0Oo16;
                        int i11 = iOooO0Oo13;
                        int i12 = (int) interfaceC24749OooO0OoO0ooOOo.getLong(i10);
                        int i13 = iOooO0Oo17;
                        int i14 = iOooO0Oo14;
                        boolean z2 = ((int) interfaceC24749OooO0OoO0ooOOo.getLong(i13)) != 0;
                        int i15 = iOooO0Oo18;
                        String strO000OoO10 = interfaceC24749OooO0OoO0ooOOo.isNull(i15) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(i15);
                        iOooO0Oo18 = i15;
                        C34897o00o0OO c34897o00o0OO3 = c34897o00o0OO2;
                        int i16 = iOooO0Oo19;
                        arrayList.add(new PageEntity(strO000OoO3, strO000OoO4, strO000OoO5, paperOrientationOooOOO, strO000OoO, i6, strO000OoO6, strO000OoO7, j, j2, strO000OoO8, z, i8, strO000OoO9, strO000OoO2, i12, z2, c34897o00o0OO3.f125434OooO0OO.stringToChildren(strO000OoO10), (int) interfaceC24749OooO0OoO0ooOOo.getLong(i16)));
                        iOooO0Oo19 = i16;
                        iOooO0Oo13 = i11;
                        iOooO0Oo14 = i14;
                        iOooO0Oo2 = i2;
                        iOooO0Oo3 = i;
                        iOooO0Oo16 = i10;
                        iOooO0Oo17 = i13;
                        c34897o00o0OO2 = c34897o00o0OO3;
                        iOooO0Oo = i4;
                        iOooO0Oo15 = i9;
                        iOooO0Oo4 = i3;
                    }
                    interfaceC24749OooO0OoO0ooOOo.close();
                    return arrayList;
                } catch (Throwable th) {
                    interfaceC24749OooO0OoO0ooOOo.close();
                    throw th;
                }
            }
        };
        return C24720OooOOO0.OooO00o(this.f125432OooO00o, new String[]{"PageEntity"}, interfaceC32507OooOO0o);
    }

    @Override // oo0oO0.InterfaceC34887o00o00O0
    public final Object OooOO0o(o0OOO0OO.OooOO0 oooOO02) {
        return C24734OooO0O0.OooO0oo(oooOO02, this.f125432OooO00o, new C34418OooO00o(this, 1), true, false);
    }
}
