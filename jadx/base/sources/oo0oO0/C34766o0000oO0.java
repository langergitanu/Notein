package oo0oO0;

import com.aspose.slides.C22218Oooo;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.huawei.hms.network.embedded.C18437z2;
import com.orion.notein.data.p602db.NoteContentDatabase_Impl;
import com.orion.notein.data.p602db.entity.HyperLinkEntity;
import java.util.ArrayList;
import java.util.List;
import o000ooOO.C24734OooO0O0;
import o000ooo.InterfaceC24747OooO0O0;
import o000ooo.InterfaceC24749OooO0Oo;
import o0OO00o0.C26574o000oo;
import o0OO00o0.C26578o000oo0o;
import o0OO00o0.C26579o000ooO;
import o0OO00o0.C26580o000ooO0;
import o0OO00o0.C26581o000ooOO;
import o0OOoO0O.C27747OooOo0O;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: oo0oO0.o0000oO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C34766o0000oO0 implements InterfaceC34757o0000Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final NoteContentDatabase_Impl f125150OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C34761o0000o f125151OooO0O0 = new C34761o0000o();

    public C34766o0000oO0(NoteContentDatabase_Impl noteContentDatabase_Impl) {
        this.f125150OooO00o = noteContentDatabase_Impl;
    }

    @Override // oo0oO0.InterfaceC34757o0000Oo
    public final Object OooO00o(final HyperLinkEntity[] hyperLinkEntityArr, C26574o000oo c26574o000oo) {
        hyperLinkEntityArr.getClass();
        return C24734OooO0O0.OooO0oo(c26574o000oo, this.f125150OooO00o, new InterfaceC32507OooOO0o() { // from class: oo0oO0.o0000o0
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) {
                this.f125147OooOo0o.f125151OooO0O0.OooOoo0((InterfaceC24747OooO0O0) obj, hyperLinkEntityArr);
                return C32460OooOooO.f116667OooO00o;
            }
        }, false, true);
    }

    @Override // oo0oO0.InterfaceC34757o0000Oo
    public final Object OooO0O0(String str, C26579o000ooO c26579o000ooO) {
        return C24734OooO0O0.OooO0oo(c26579o000ooO, this.f125150OooO00o, new C27747OooOo0O(str, 1), false, true);
    }

    @Override // oo0oO0.InterfaceC34757o0000Oo
    public final Object OooO0OO(final String str, C26581o000ooOO c26581o000ooOO) {
        return C24734OooO0O0.OooO0oo(c26581o000ooOO, this.f125150OooO00o, new InterfaceC32507OooOO0o() { // from class: oo0oO0.o0000o0O
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) throws Exception {
                int i;
                Float fValueOf;
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo("select * from HyperLinkEntity where page_id = ?");
                String str2 = str;
                try {
                    if (str2 == null) {
                        interfaceC24749OooO0OoO0ooOOo.OooO0oO(1);
                    } else {
                        interfaceC24749OooO0OoO0ooOOo.o000000O(1, str2);
                    }
                    int iOooO0Oo = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "id");
                    int iOooO0Oo2 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "bounds");
                    int iOooO0Oo3 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "page_id");
                    int iOooO0Oo4 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, C18437z2.f56754h);
                    int iOooO0Oo5 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, FirebaseAnalytics.Param.DESTINATION);
                    int iOooO0Oo6 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "extras");
                    int iOooO0Oo7 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "creation_time");
                    int iOooO0Oo8 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "last_modification_time");
                    int iOooO0Oo9 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "left");
                    int iOooO0Oo10 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "top");
                    int iOooO0Oo11 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "right");
                    int iOooO0Oo12 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "bottom");
                    ArrayList arrayList = new ArrayList();
                    while (interfaceC24749OooO0OoO0ooOOo.o00oO0o()) {
                        String strO000OoO = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo);
                        String strO000OoO2 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo2) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo2);
                        String strO000OoO3 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo3) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo3);
                        int i2 = iOooO0Oo2;
                        int i3 = (int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo4);
                        String strO000OoO4 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo5) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo5);
                        String strO000OoO5 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo6) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo6);
                        long j = interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo7);
                        long j2 = interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo8);
                        if (interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo9)) {
                            i = i3;
                            fValueOf = null;
                        } else {
                            i = i3;
                            fValueOf = Float.valueOf((float) interfaceC24749OooO0OoO0ooOOo.getDouble(iOooO0Oo9));
                        }
                        arrayList.add(new HyperLinkEntity(strO000OoO, strO000OoO2, strO000OoO3, i, strO000OoO4, strO000OoO5, j, j2, fValueOf, interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo10) ? null : Float.valueOf((float) interfaceC24749OooO0OoO0ooOOo.getDouble(iOooO0Oo10)), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo11) ? null : Float.valueOf((float) interfaceC24749OooO0OoO0ooOOo.getDouble(iOooO0Oo11)), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo12) ? null : Float.valueOf((float) interfaceC24749OooO0OoO0ooOOo.getDouble(iOooO0Oo12))));
                        iOooO0Oo2 = i2;
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

    @Override // oo0oO0.InterfaceC34757o0000Oo
    public final Object OooO0Oo(C26578o000oo0o c26578o000oo0o) {
        return C24734OooO0O0.OooO0oo(c26578o000oo0o, this.f125150OooO00o, new C34764o0000o0o(0), false, true);
    }

    @Override // oo0oO0.InterfaceC34757o0000Oo
    public final Object OooO0o0(List list, C26580o000ooO0 c26580o000ooO0) {
        return C24734OooO0O0.OooO0oo(c26580o000ooO0, this.f125150OooO00o, new C34759o0000OoO(0, com.aspose.slides.internal.p332p7.OooOO0O.OooO00o(")", C22218Oooo.OooO0OO("delete from HyperLinkEntity where id in ("), list), list), false, true);
    }
}
