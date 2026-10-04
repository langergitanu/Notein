package oo0oO0;

import com.orion.notein.data.p602db.NoteAiDatabase_Impl;
import com.orion.notein.data.p602db.entity.p603ai.NoteAiContentEntity;
import com.orion.notein.data.p602db.entity.p603ai.NoteSummaryEntity;
import o000oo0o.C24718OooOO0o;
import o000oo0o.C24720OooOOO0;
import o000ooOO.C24734OooO0O0;
import o000ooo.InterfaceC24747OooO0O0;
import o000ooo.InterfaceC24749OooO0Oo;
import o0OO00o.C26472OooO0o0;
import o0OO00o.C26473OooO0oO;
import o0Oo0O.C28041OooO0O0;
import o0Oo0oOo.C28361OooooOo;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: loaded from: classes9.dex */
public final class o0O0ooO implements InterfaceC34808o000ooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final NoteAiDatabase_Impl f125635OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C34814o000oooo f125636OooO0O0 = new C34814o000oooo();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o00 f125637OooO0OO = new o00();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o00O0000 f125638OooO0Oo = new o00O0000();

    public o0O0ooO(NoteAiDatabase_Impl noteAiDatabase_Impl) {
        this.f125635OooO00o = noteAiDatabase_Impl;
    }

    @Override // oo0oO0.InterfaceC34808o000ooO
    public final Object OooO00o(String str, o0OO00o.OooO0o oooO0o) {
        return C24734OooO0O0.OooO0oo(oooO0o, this.f125635OooO00o, new C28361OooooOo(str, 1), true, false);
    }

    @Override // oo0oO0.InterfaceC34808o000ooO
    public final Object OooO0O0(NoteSummaryEntity[] noteSummaryEntityArr, o0OO00o.OooO0OO oooO0OO) {
        return C24734OooO0O0.OooO0oo(oooO0OO, this.f125635OooO00o, new C34810o000ooOO(0, this, noteSummaryEntityArr), false, true);
    }

    @Override // oo0oO0.InterfaceC34808o000ooO
    public final Object OooO0OO(String str, C26472OooO0o0 c26472OooO0o0) {
        return C24734OooO0O0.OooO0oo(c26472OooO0o0, this.f125635OooO00o, new C28041OooO0O0(str, 1), true, false);
    }

    @Override // oo0oO0.InterfaceC34808o000ooO
    public final C24718OooOO0o OooO0Oo(final String str) {
        InterfaceC32507OooOO0o interfaceC32507OooOO0o = new InterfaceC32507OooOO0o() { // from class: oo0oO0.o000oooO
            /* JADX WARN: Multi-variable type inference failed */
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) throws Exception {
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo("SELECT * FROM NoteAiContentEntity WHERE id = ?");
                String str2 = str;
                try {
                    if (str2 == null) {
                        interfaceC24749OooO0OoO0ooOOo.OooO0oO(1);
                    } else {
                        interfaceC24749OooO0OoO0ooOOo.o000000O(1, str2);
                    }
                    int iOooO0Oo = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "id");
                    int iOooO0Oo2 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "summary_list");
                    int iOooO0Oo3 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "saved_summary_index");
                    int iOooO0Oo4 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "creation_time");
                    int iOooO0Oo5 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "last_modification_time");
                    if (interfaceC24749OooO0OoO0ooOOo.o00oO0o()) {
                        noteAiContentEntity = new NoteAiContentEntity(interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo2) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo2), (int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo3), interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo4), interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo5));
                    }
                    interfaceC24749OooO0OoO0ooOOo.close();
                    return noteAiContentEntity;
                } catch (Throwable th) {
                    interfaceC24749OooO0OoO0ooOOo.close();
                    throw th;
                }
            }
        };
        return C24720OooOOO0.OooO00o(this.f125635OooO00o, new String[]{"NoteAiContentEntity"}, interfaceC32507OooOO0o);
    }

    @Override // oo0oO0.InterfaceC34808o000ooO
    public final Object OooO0o(final NoteAiContentEntity[] noteAiContentEntityArr, o0OO00o.OooO0O0 oooO0O0) {
        return C24734OooO0O0.OooO0oo(oooO0O0, this.f125635OooO00o, new InterfaceC32507OooOO0o() { // from class: oo0oO0.o000ooo0
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) {
                this.f125238OooOo0o.f125637OooO0OO.OooOoo0((InterfaceC24747OooO0O0) obj, noteAiContentEntityArr);
                return C32460OooOooO.f116667OooO00o;
            }
        }, false, true);
    }

    @Override // oo0oO0.InterfaceC34808o000ooO
    public final Object OooO0o0(NoteAiContentEntity noteAiContentEntity, C26473OooO0oO c26473OooO0oO) {
        return C24734OooO0O0.OooO0oo(c26473OooO0oO, this.f125635OooO00o, new C34811o000ooo(0, this, noteAiContentEntity), false, true);
    }
}
