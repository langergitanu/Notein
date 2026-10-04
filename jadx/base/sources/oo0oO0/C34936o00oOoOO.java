package oo0oO0;

import com.orion.notein.data.p602db.NoteContentDatabase_Impl;
import com.orion.notein.data.p602db.entity.PdfInfoEntity;
import o000ooOO.C24734OooO0O0;
import o000ooo.InterfaceC24747OooO0O0;
import o000ooo.InterfaceC24749OooO0Oo;
import o0OO.C26419OooOoOO;
import o0OO.C26420OooOoo;
import o0OO.C26421OooOoo0;
import o0OO.C26422OooOooO;
import o0oOoOo.C31067Oooo0o;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: oo0oO0.o00oOoOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C34936o00oOoOO implements InterfaceC34932o00oOo0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final NoteContentDatabase_Impl f125528OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C34934o00oOoO f125529OooO0O0 = new C34934o00oOoO();

    public C34936o00oOoOO(NoteContentDatabase_Impl noteContentDatabase_Impl) {
        this.f125528OooO00o = noteContentDatabase_Impl;
    }

    @Override // oo0oO0.InterfaceC34932o00oOo0O
    public final Object OooO00o(final String str, C26421OooOoo0 c26421OooOoo0) {
        return C24734OooO0O0.OooO0oo(c26421OooOoo0, this.f125528OooO00o, new InterfaceC32507OooOO0o() { // from class: oo0oO0.o00oOoO0
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) throws Exception {
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo("delete from PdfInfoEntity where id= ?");
                String str2 = str;
                try {
                    if (str2 == null) {
                        interfaceC24749OooO0OoO0ooOOo.OooO0oO(1);
                    } else {
                        interfaceC24749OooO0OoO0ooOOo.o000000O(1, str2);
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

    @Override // oo0oO0.InterfaceC34932o00oOo0O
    public final Object OooO0O0(final PdfInfoEntity[] pdfInfoEntityArr, C26419OooOoOO c26419OooOoOO) {
        return C24734OooO0O0.OooO0oo(c26419OooOoOO, this.f125528OooO00o, new InterfaceC32507OooOO0o() { // from class: oo0oO0.o00oOo0o
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) {
                this.f125526OooOo0o.f125529OooO0O0.OooOoo0((InterfaceC24747OooO0O0) obj, pdfInfoEntityArr);
                return C32460OooOooO.f116667OooO00o;
            }
        }, false, true);
    }

    @Override // oo0oO0.InterfaceC34932o00oOo0O
    public final Object OooO0OO(String str, C26420OooOoo c26420OooOoo) {
        return C24734OooO0O0.OooO0oo(c26420OooOoo, this.f125528OooO00o, new o0OoO0oo.oo0o0O0(str, 2), true, false);
    }

    @Override // oo0oO0.InterfaceC34932o00oOo0O
    public final Object OooO0Oo(C26422OooOooO c26422OooOooO) {
        return C24734OooO0O0.OooO0oo(c26422OooOooO, this.f125528OooO00o, new C31067Oooo0o(1), true, false);
    }
}
