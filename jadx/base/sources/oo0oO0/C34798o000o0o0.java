package oo0oO0;

import com.orion.notein.data.p602db.NoteDatabase_Impl;
import com.orion.notein.data.p602db.entity.MaterialDownloadStateEntity;
import o000oo0o.C24718OooOO0o;
import o000oo0o.C24720OooOOO0;
import o000ooOO.C24734OooO0O0;
import o000ooo.InterfaceC24747OooO0O0;
import o000ooo.InterfaceC24749OooO0Oo;
import o0OO0ooO.C26954OooO0O0;
import o0OO0ooO.C26957OooO0o;
import o0Oo0oOo.C28333OooOoo0;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: oo0oO0.o000o0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C34798o000o0o0 implements InterfaceC34791o000o00O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final NoteDatabase_Impl f125216OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C34796o000o0Oo f125217OooO0O0 = new C34796o000o0Oo();

    public C34798o000o0o0(NoteDatabase_Impl noteDatabase_Impl) {
        this.f125216OooO00o = noteDatabase_Impl;
    }

    @Override // oo0oO0.InterfaceC34791o000o00O
    public final Object OooO00o(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        return C24734OooO0O0.OooO0oo(abstractC32479OooO0OO, this.f125216OooO00o, new C34996oooo00o(str, 0), true, false);
    }

    @Override // oo0oO0.InterfaceC34791o000o00O
    public final Object OooO0O0(final String str, C26954OooO0O0 c26954OooO0O0) {
        return C24734OooO0O0.OooO0oo(c26954OooO0O0, this.f125216OooO00o, new InterfaceC32507OooOO0o() { // from class: oo0oO0.o000o00o
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) throws Exception {
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo("DELETE FROM material_download_state WHERE material_id = ?");
                try {
                    interfaceC24749OooO0OoO0ooOOo.o000000O(1, str);
                    interfaceC24749OooO0OoO0ooOOo.o00oO0o();
                    return C32460OooOooO.f116667OooO00o;
                } finally {
                    interfaceC24749OooO0OoO0ooOOo.close();
                }
            }
        }, false, true);
    }

    @Override // oo0oO0.InterfaceC34791o000o00O
    public final Object OooO0OO(MaterialDownloadStateEntity materialDownloadStateEntity, C26957OooO0o c26957OooO0o) {
        return C24734OooO0O0.OooO0oo(c26957OooO0o, this.f125216OooO00o, new C34795o000o0OO(0, this, materialDownloadStateEntity), false, true);
    }

    @Override // oo0oO0.InterfaceC34791o000o00O
    public final Object OooO0Oo(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        return C24734OooO0O0.OooO0oo(abstractC32479OooO0OO, this.f125216OooO00o, new C28333OooOoo0(str, 2), true, false);
    }

    @Override // oo0oO0.InterfaceC34791o000o00O
    public final C24718OooOO0o OooO0o() {
        C34794o000o0O0 c34794o000o0O0 = new C34794o000o0O0();
        return C24720OooOOO0.OooO00o(this.f125216OooO00o, new String[]{"material_download_state"}, c34794o000o0O0);
    }

    @Override // oo0oO0.InterfaceC34791o000o00O
    public final C24718OooOO0o OooO0o0() {
        C34793o000o0O c34793o000o0O = new C34793o000o0O();
        return C24720OooOOO0.OooO00o(this.f125216OooO00o, new String[]{"material_download_state"}, c34793o000o0O);
    }
}
