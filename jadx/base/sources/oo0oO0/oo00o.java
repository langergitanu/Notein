package oo0oO0;

import com.orion.notein.data.p602db.NoteDatabase_Impl;
import com.orion.notein.data.p602db.entity.NoteSortKeyUpdateEntity;
import java.util.LinkedHashMap;
import kotlin.coroutines.Continuation;
import o000ooOO.C24734OooO0O0;
import o000ooo.InterfaceC24747OooO0O0;
import o000ooo.InterfaceC24749OooO0Oo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO0O000o.InterfaceC32507OooOO0o;
import oo0oO0.AbstractC34938o00oOoo;

/* JADX INFO: loaded from: classes9.dex */
public final class oo00o extends AbstractC34938o00oOoo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final NoteDatabase_Impl f125666OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C34816o00O00o f125667OooO0O0 = new C34816o00O00o();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C34817o00O00oO f125668OooO0OO = new C34817o00O00oO();

    public oo00o(NoteDatabase_Impl noteDatabase_Impl) {
        this.f125666OooO00o = noteDatabase_Impl;
    }

    @Override // oo0oO0.AbstractC34938o00oOoo
    public final Object OooO(final LinkedHashMap linkedHashMap, final LinkedHashMap linkedHashMap2, o0o00oOo.o00000OO o00000oo2) {
        return C24734OooO0O0.OooO0oO(this.f125666OooO00o, new InterfaceC32507OooOO0o() { // from class: oo0oO0.o00O00Oo
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) {
                oo00o oo00oVar = this.f125260OooOo0o;
                oo00oVar.getClass();
                return AbstractC34938o00oOoo.OooOO0(oo00oVar, linkedHashMap, linkedHashMap2, (Continuation) obj);
            }
        }, o00000oo2);
    }

    @Override // oo0oO0.AbstractC34938o00oOoo
    public final Object OooO00o(final String str, AbstractC34938o00oOoo.OooO00o oooO00o) {
        return C24734OooO0O0.OooO0oo(oooO00o, this.f125666OooO00o, new InterfaceC32507OooOO0o() { // from class: oo0oO0.oOO00O
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) throws Exception {
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo("select MIN(sort_key) from FolderEntity where parent_id is null and user_id = ?");
                String str2 = str;
                try {
                    if (str2 == null) {
                        interfaceC24749OooO0OoO0ooOOo.OooO0oO(1);
                    } else {
                        interfaceC24749OooO0OoO0ooOOo.o000000O(1, str2);
                    }
                    Integer numValueOf = null;
                    if (interfaceC24749OooO0OoO0ooOOo.o00oO0o() && !interfaceC24749OooO0OoO0ooOOo.isNull(0)) {
                        numValueOf = Integer.valueOf((int) interfaceC24749OooO0OoO0ooOOo.getLong(0));
                    }
                    return numValueOf;
                } finally {
                    interfaceC24749OooO0OoO0ooOOo.close();
                }
            }
        }, true, false);
    }

    @Override // oo0oO0.AbstractC34938o00oOoo
    public final Object OooO0O0(String str, String str2, AbstractC34938o00oOoo.OooO00o oooO00o) {
        return C24734OooO0O0.OooO0oo(oooO00o, this.f125666OooO00o, new o00O00o0(str, str2), true, false);
    }

    @Override // oo0oO0.AbstractC34938o00oOoo
    public final Object OooO0OO(String str, AbstractC34938o00oOoo.OooO00o oooO00o) {
        return C24734OooO0O0.OooO0oo(oooO00o, this.f125666OooO00o, new o0o00oO0.OooO(str, 1), true, false);
    }

    @Override // oo0oO0.AbstractC34938o00oOoo
    public final Object OooO0Oo(String str, String str2, AbstractC34938o00oOoo.OooO00o oooO00o) {
        return C24734OooO0O0.OooO0oo(oooO00o, this.f125666OooO00o, new o00O00O(str, str2, 0), true, false);
    }

    @Override // oo0oO0.AbstractC34938o00oOoo
    public final Object OooO0o0(final String str, final String str2, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        return C24734OooO0O0.OooO0oO(this.f125666OooO00o, new InterfaceC32507OooOO0o() { // from class: oo0oO0.o00O000o
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) {
                oo00o oo00oVar = this.f125252OooOo0o;
                oo00oVar.getClass();
                return AbstractC34938o00oOoo.OooO0o(oo00oVar, str, str2, (Continuation) obj);
            }
        }, abstractC32479OooO0OO);
    }

    @Override // oo0oO0.AbstractC34938o00oOoo
    public final Object OooO0oO(NoteSortKeyUpdateEntity noteSortKeyUpdateEntity, o00O000 o00o0002) {
        return C24734OooO0O0.OooO0oo(o00o0002, this.f125666OooO00o, new o00O00(0, this, noteSortKeyUpdateEntity), false, true);
    }

    @Override // oo0oO0.AbstractC34938o00oOoo
    public final Object OooO0oo(final NoteSortKeyUpdateEntity noteSortKeyUpdateEntity, o00O000 o00o0002) {
        return C24734OooO0O0.OooO0oo(o00o0002, this.f125666OooO00o, new InterfaceC32507OooOO0o() { // from class: oo0oO0.o00O00OO
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) throws Exception {
                this.f125258OooOo0o.f125667OooO0O0.o000oOoO((InterfaceC24747OooO0O0) obj, noteSortKeyUpdateEntity);
                return C32460OooOooO.f116667OooO00o;
            }
        }, false, true);
    }
}
