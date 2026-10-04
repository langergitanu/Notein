package oo0oO0;

import com.huawei.hms.network.embedded.C18437z2;
import com.orion.notein.data.p602db.NoteDatabase_Impl;
import com.orion.notein.data.p602db.entity.PenInfoConverter;
import com.orion.notein.data.p602db.entity.PenInfoEntity;
import java.util.ArrayList;
import java.util.List;
import o000oo0o.C24718OooOO0o;
import o000oo0o.C24720OooOOO0;
import o000ooOO.C24734OooO0O0;
import o000ooo.InterfaceC24747OooO0O0;
import o000ooo.InterfaceC24749OooO0Oo;
import o0OO.C26424Oooo;
import o0OO.C26432Oooo0oo;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: oo0oO0.o00oo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C34950o00oo0o implements InterfaceC34947o00oo0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final NoteDatabase_Impl f125552OooO00o;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final PenInfoConverter f125554OooO0OO = new PenInfoConverter();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C34951o00oo0o0 f125553OooO0O0 = new C34951o00oo0o0(this);

    public C34950o00oo0o(NoteDatabase_Impl noteDatabase_Impl) {
        this.f125552OooO00o = noteDatabase_Impl;
    }

    @Override // oo0oO0.InterfaceC34947o00oo0O0
    public final Object OooO00o(final PenInfoEntity[] penInfoEntityArr, C26424Oooo.OooO00o oooO00o) {
        penInfoEntityArr.getClass();
        return C24734OooO0O0.OooO0oo(oooO00o, this.f125552OooO00o, new InterfaceC32507OooOO0o() { // from class: oo0oO0.o00oo0O
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) {
                this.f125547OooOo0o.f125553OooO0O0.OooOoo0((InterfaceC24747OooO0O0) obj, penInfoEntityArr);
                return C32460OooOooO.f116667OooO00o;
            }
        }, false, true);
    }

    @Override // oo0oO0.InterfaceC34947o00oo0O0
    public final C24718OooOO0o OooO0O0(String str) {
        C34795o000o0OO c34795o000o0OO = new C34795o000o0OO(1, this, str);
        return C24720OooOOO0.OooO00o(this.f125552OooO00o, new String[]{"PenInfoEntity"}, c34795o000o0OO);
    }

    @Override // oo0oO0.InterfaceC34947o00oo0O0
    public final Object OooO0OO(final String str, C26432Oooo0oo c26432Oooo0oo) {
        return C24734OooO0O0.OooO0oo(c26432Oooo0oo, this.f125552OooO00o, new InterfaceC32507OooOO0o() { // from class: oo0oO0.o00oo0Oo
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) throws Exception {
                PenInfoConverter penInfoConverter = this.f125551OooOo0o.f125554OooO0OO;
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo("select * from PenInfoEntity where note_id = ?");
                String str2 = str;
                try {
                    if (str2 == null) {
                        interfaceC24749OooO0OoO0ooOOo.OooO0oO(1);
                    } else {
                        interfaceC24749OooO0OoO0ooOOo.o000000O(1, str2);
                    }
                    int iOooO0Oo = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "id");
                    int iOooO0Oo2 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, C18437z2.f56754h);
                    int iOooO0Oo3 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "color_index");
                    int iOooO0Oo4 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "width_index");
                    int iOooO0Oo5 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "color_list");
                    int iOooO0Oo6 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "width_list");
                    int iOooO0Oo7 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "note_id");
                    int iOooO0Oo8 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "selected");
                    int iOooO0Oo9 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "extra");
                    ArrayList arrayList = new ArrayList();
                    while (interfaceC24749OooO0OoO0ooOOo.o00oO0o()) {
                        String strO000OoO = null;
                        String strO000OoO2 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo);
                        int i = iOooO0Oo;
                        int i2 = (int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo2);
                        int i3 = iOooO0Oo2;
                        int i4 = (int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo3);
                        PenInfoConverter penInfoConverter2 = penInfoConverter;
                        int i5 = (int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo4);
                        List<Integer> listStringToColorList = penInfoConverter2.stringToColorList(interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo5) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo5));
                        List<Float> listStringToWidthList = penInfoConverter2.stringToWidthList(interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo6) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo6));
                        String strO000OoO3 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo7) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo7);
                        boolean z = ((int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo8)) != 0;
                        if (!interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo9)) {
                            strO000OoO = interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo9);
                        }
                        arrayList.add(new PenInfoEntity(strO000OoO2, i2, i4, i5, listStringToColorList, listStringToWidthList, strO000OoO3, z, penInfoConverter2.stringToExtra(strO000OoO)));
                        iOooO0Oo = i;
                        penInfoConverter = penInfoConverter2;
                        iOooO0Oo2 = i3;
                    }
                    interfaceC24749OooO0OoO0ooOOo.close();
                    return arrayList;
                } catch (Throwable th) {
                    interfaceC24749OooO0OoO0ooOOo.close();
                    throw th;
                }
            }
        }, true, false);
    }

    @Override // oo0oO0.InterfaceC34947o00oo0O0
    public final void OooO0Oo(String str) {
        C24734OooO0O0.OooO0o(this.f125552OooO00o, false, true, new C34996oooo00o(str, 1));
    }
}
