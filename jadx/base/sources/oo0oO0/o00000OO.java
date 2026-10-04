package oo0oO0;

import com.orion.notein.data.p602db.entity.FolderEntity;
import com.orion.notein.data.p602db.entity.PageEntity;
import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.notein.domain.models.page.PaperOrientation;
import com.orion.penkit.models.LayerInfo;
import java.util.ArrayList;
import o000ooo.InterfaceC24747OooO0O0;
import o000ooo.InterfaceC24749OooO0Oo;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class o00000OO implements InterfaceC32507OooOO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ String f125115OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f125116OooOo0o = 0;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Object f125117OooOoO0;

    public /* synthetic */ o00000OO(String str, String str2) {
        this.f125115OooOo = str;
        this.f125117OooOoO0 = str2;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Object obj) throws Exception {
        InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo;
        String strO000OoO;
        int i;
        int i2;
        String strO000OoO2;
        int i3;
        int i4;
        switch (this.f125116OooOo0o) {
            case 0:
                interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo("select * from FolderEntity where parent_id = ? and user_id = ? ");
                String str = this.f125115OooOo;
                try {
                    if (str == null) {
                        interfaceC24749OooO0OoO0ooOOo.OooO0oO(1);
                    } else {
                        interfaceC24749OooO0OoO0ooOOo.o000000O(1, str);
                    }
                    String str2 = (String) this.f125117OooOoO0;
                    if (str2 == null) {
                        interfaceC24749OooO0OoO0ooOOo.OooO0oO(2);
                    } else {
                        interfaceC24749OooO0OoO0ooOOo.o000000O(2, str2);
                    }
                    int iOooO0Oo = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "id");
                    int iOooO0Oo2 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "user_id");
                    int iOooO0Oo3 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, NoteMeta.PROPERTY_TITLE);
                    int iOooO0Oo4 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "parent_id");
                    int iOooO0Oo5 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "recover_parent_id");
                    int iOooO0Oo6 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "is_favorite");
                    int iOooO0Oo7 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "is_in_trash_bin");
                    int iOooO0Oo8 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "creation_time");
                    int iOooO0Oo9 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "last_modification_time");
                    int iOooO0Oo10 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "tn_path");
                    int iOooO0Oo11 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "sort_key");
                    int iOooO0Oo12 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "cover_color");
                    ArrayList arrayList = new ArrayList();
                    while (interfaceC24749OooO0OoO0ooOOo.o00oO0o()) {
                        int i5 = iOooO0Oo2;
                        int i6 = iOooO0Oo3;
                        arrayList.add(new FolderEntity(interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo2) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo2), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo3) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo3), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo4) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo4), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo5) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo5), ((int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo6)) != 0, ((int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo7)) != 0, interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo8), interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo9), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo10) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo10), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo11) ? null : Integer.valueOf((int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo11)), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo12) ? null : Integer.valueOf((int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo12))));
                        iOooO0Oo3 = i6;
                        iOooO0Oo2 = i5;
                        break;
                    }
                    interfaceC24749OooO0OoO0ooOOo.close();
                    return arrayList;
                } finally {
                }
            default:
                C34897o00o0OO c34897o00o0OO = (C34897o00o0OO) this.f125117OooOoO0;
                c34897o00o0OO.getClass();
                interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo("SELECT * FROM PageEntity where note_id = ? and is_in_trash_bin = 0");
                String str3 = this.f125115OooOo;
                try {
                    if (str3 == null) {
                        interfaceC24749OooO0OoO0ooOOo.OooO0oO(1);
                    } else {
                        interfaceC24749OooO0OoO0ooOOo.o000000O(1, str3);
                    }
                    int iOooO0Oo13 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "id");
                    int iOooO0Oo14 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "note_id");
                    int iOooO0Oo15 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "paper_spec");
                    int iOooO0Oo16 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "page_orientation");
                    int iOooO0Oo17 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, LayerInfo.PAPER_THEME_LAYER_ID);
                    int iOooO0Oo18 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "padding_color");
                    int iOooO0Oo19 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "paper_padding");
                    int iOooO0Oo20 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "padding_style_json");
                    int iOooO0Oo21 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "creation_time");
                    int iOooO0Oo22 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "last_modification_time");
                    int iOooO0Oo23 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "tn_path");
                    int iOooO0Oo24 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "unbounded");
                    int iOooO0Oo25 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "source");
                    int iOooO0Oo26 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "recover_note_id");
                    C34897o00o0OO c34897o00o0OO2 = c34897o00o0OO;
                    int iOooO0Oo27 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "recover_note_title");
                    int iOooO0Oo28 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "recover_index");
                    int iOooO0Oo29 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "is_in_trash_bin");
                    int iOooO0Oo30 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "history_page_id_list");
                    int iOooO0Oo31 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "rotation_direction_index");
                    ArrayList arrayList2 = new ArrayList();
                    while (interfaceC24749OooO0OoO0ooOOo.o00oO0o()) {
                        String strO000OoO3 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo13) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo13);
                        String strO000OoO4 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo14) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo14);
                        String strO000OoO5 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo15) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo15);
                        PaperOrientation paperOrientationOooOOO = C34897o00o0OO.OooOOO(interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo16));
                        if (interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo17)) {
                            strO000OoO = null;
                            i2 = iOooO0Oo14;
                            i = iOooO0Oo15;
                        } else {
                            strO000OoO = interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo17);
                            i = iOooO0Oo15;
                            i2 = iOooO0Oo14;
                        }
                        int i7 = (int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo18);
                        String strO000OoO6 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo19) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo19);
                        String strO000OoO7 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo20) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo20);
                        long j = interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo21);
                        long j2 = interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo22);
                        String strO000OoO8 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo23) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo23);
                        boolean z = ((int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo24)) != 0;
                        int i8 = iOooO0Oo16;
                        int i9 = (int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo25);
                        String strO000OoO9 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo26) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo26);
                        int i10 = iOooO0Oo27;
                        if (interfaceC24749OooO0OoO0ooOOo.isNull(i10)) {
                            strO000OoO2 = null;
                            i4 = iOooO0Oo13;
                            i3 = i8;
                        } else {
                            strO000OoO2 = interfaceC24749OooO0OoO0ooOOo.o000OoO(i10);
                            i3 = i8;
                            i4 = iOooO0Oo13;
                        }
                        int i11 = iOooO0Oo28;
                        int i12 = iOooO0Oo25;
                        int i13 = (int) interfaceC24749OooO0OoO0ooOOo.getLong(i11);
                        int i14 = iOooO0Oo29;
                        int i15 = iOooO0Oo26;
                        boolean z2 = ((int) interfaceC24749OooO0OoO0ooOOo.getLong(i14)) != 0;
                        int i16 = iOooO0Oo30;
                        String strO000OoO10 = interfaceC24749OooO0OoO0ooOOo.isNull(i16) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(i16);
                        iOooO0Oo30 = i16;
                        C34897o00o0OO c34897o00o0OO3 = c34897o00o0OO2;
                        int i17 = iOooO0Oo31;
                        arrayList2.add(new PageEntity(strO000OoO3, strO000OoO4, strO000OoO5, paperOrientationOooOOO, strO000OoO, i7, strO000OoO6, strO000OoO7, j, j2, strO000OoO8, z, i9, strO000OoO9, strO000OoO2, i13, z2, c34897o00o0OO3.f125434OooO0OO.stringToChildren(strO000OoO10), (int) interfaceC24749OooO0OoO0ooOOo.getLong(i17)));
                        iOooO0Oo31 = i17;
                        iOooO0Oo25 = i12;
                        iOooO0Oo26 = i15;
                        iOooO0Oo14 = i2;
                        iOooO0Oo15 = i;
                        iOooO0Oo28 = i11;
                        iOooO0Oo29 = i14;
                        c34897o00o0OO2 = c34897o00o0OO3;
                        iOooO0Oo13 = i4;
                        iOooO0Oo27 = i10;
                        iOooO0Oo16 = i3;
                        break;
                    }
                    interfaceC24749OooO0OoO0ooOOo.close();
                    return arrayList2;
                } finally {
                }
        }
    }

    public /* synthetic */ o00000OO(C34897o00o0OO c34897o00o0OO, String str) {
        this.f125117OooOoO0 = c34897o00o0OO;
        this.f125115OooOo = str;
    }
}
