package oo0oO0;

import com.aspose.slides.C22218Oooo;
import com.orion.notein.data.p602db.NoteDatabase_Impl;
import java.util.ArrayList;
import java.util.List;
import o000oo0o.C24718OooOO0o;
import o000oo0o.C24720OooOOO0;
import o000ooOO.C24734OooO0O0;
import o000ooo.InterfaceC24747OooO0O0;
import o000ooo.InterfaceC24749OooO0Oo;
import o0o0O0oO.C30328OooOOo0;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: oo0oO0.o000o000, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C34790o000o000 implements InterfaceC34783o000OoOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final NoteDatabase_Impl f125210OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C34788o000Oooo f125211OooO0O0 = new C34788o000Oooo();

    public C34790o000o000(NoteDatabase_Impl noteDatabase_Impl) {
        this.f125210OooO00o = noteDatabase_Impl;
    }

    @Override // oo0oO0.InterfaceC34783o000OoOO
    public final C24718OooOO0o OooO00o() {
        C34787o000OooO c34787o000OooO = new C34787o000OooO();
        return C24720OooOOO0.OooO00o(this.f125210OooO00o, new String[]{"LatestOpenedNoteEntity"}, c34787o000OooO);
    }

    @Override // oo0oO0.InterfaceC34783o000OoOO
    public final Object OooO0O0(final List list, AbstractC32476OooO abstractC32476OooO) {
        final String strOooO00o = com.aspose.slides.internal.p332p7.OooOO0O.OooO00o(")", C22218Oooo.OooO0OO("DELETE FROM LatestOpenedNoteEntity WHERE note_id in ("), list);
        return C24734OooO0O0.OooO0oo(abstractC32476OooO, this.f125210OooO00o, new InterfaceC32507OooOO0o() { // from class: oo0oO0.o000OoOo
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

    @Override // oo0oO0.InterfaceC34783o000OoOO
    public final Object OooO0OO(o0OO00o0.o00OO0O0 o00oo0o02) {
        return C24734OooO0O0.OooO0oo(o00oo0o02, this.f125210OooO00o, new C30328OooOOo0(1), true, false);
    }

    @Override // oo0oO0.InterfaceC34783o000OoOO
    public final Object OooO0Oo(final ArrayList arrayList, AbstractC32476OooO abstractC32476OooO) {
        return C24734OooO0O0.OooO0oo(abstractC32476OooO, this.f125210OooO00o, new InterfaceC32507OooOO0o() { // from class: oo0oO0.o000Ooo0
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) {
                this.f125209OooOo0o.f125211OooO0O0.OooOoO((InterfaceC24747OooO0O0) obj, arrayList);
                return C32460OooOooO.f116667OooO00o;
            }
        }, false, true);
    }
}
