package oo0oO0;

import com.orion.notein.data.p602db.NoteCacheDatabase_Impl;
import com.orion.notein.data.p602db.entity.cache.PdfTextCacheEntity;
import o000ooOO.C24734OooO0O0;
import o000ooo.InterfaceC24747OooO0O0;
import o000ooo.InterfaceC24749OooO0Oo;
import o0OOO0o0.C27050OooO00o;
import o0OOo0o.C27575o00oo000;
import o0Oo00o0.C28032OooO0O0;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: oo0oO0.o00oo0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C34948o00oo0OO implements InterfaceC34937o00oOoOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final NoteCacheDatabase_Impl f125548OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C34943o00oo0 f125549OooO0O0 = new C34943o00oo0();

    public C34948o00oo0OO(NoteCacheDatabase_Impl noteCacheDatabase_Impl) {
        this.f125548OooO00o = noteCacheDatabase_Impl;
    }

    @Override // oo0oO0.InterfaceC34937o00oOoOo
    public final Object OooO00o(final String str, final int i, C28032OooO0O0 c28032OooO0O0) {
        return C24734OooO0O0.OooO0oo(c28032OooO0O0, this.f125548OooO00o, new InterfaceC32507OooOO0o() { // from class: oo0oO0.o00oOoo0
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) throws Exception {
                int i2 = i;
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo("SELECT EXISTS(SELECT * FROM PdfTextCacheEntity WHERE pdf_file_path = ? and pdf_page_index = ?)");
                String str2 = str;
                boolean z = true;
                try {
                    if (str2 == null) {
                        interfaceC24749OooO0OoO0ooOOo.OooO0oO(1);
                    } else {
                        interfaceC24749OooO0OoO0ooOOo.o000000O(1, str2);
                    }
                    interfaceC24749OooO0OoO0ooOOo.OooO0o(2, i2);
                    Boolean boolValueOf = null;
                    if (interfaceC24749OooO0OoO0ooOOo.o00oO0o()) {
                        Integer numValueOf = interfaceC24749OooO0OoO0ooOOo.isNull(0) ? null : Integer.valueOf((int) interfaceC24749OooO0OoO0ooOOo.getLong(0));
                        if (numValueOf != null) {
                            if (numValueOf.intValue() == 0) {
                                z = false;
                            }
                            boolValueOf = Boolean.valueOf(z);
                        }
                    }
                    return boolValueOf;
                } finally {
                    interfaceC24749OooO0OoO0ooOOo.close();
                }
            }
        }, true, false);
    }

    @Override // oo0oO0.InterfaceC34937o00oOoOo
    public final Object OooO0O0(final PdfTextCacheEntity[] pdfTextCacheEntityArr, C27575o00oo000 c27575o00oo000) {
        return C24734OooO0O0.OooO0oo(c27575o00oo000, this.f125548OooO00o, new InterfaceC32507OooOO0o() { // from class: oo0oO0.o00oOooo
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) {
                this.f125541OooOo0o.f125549OooO0O0.OooOoo0((InterfaceC24747OooO0O0) obj, pdfTextCacheEntityArr);
                return C32460OooOooO.f116667OooO00o;
            }
        }, false, true);
    }

    @Override // oo0oO0.InterfaceC34937o00oOoOo
    public final Object OooO0OO(final String str, final int i, C27050OooO00o c27050OooO00o) {
        return C24734OooO0O0.OooO0oo(c27050OooO00o, this.f125548OooO00o, new InterfaceC32507OooOO0o() { // from class: oo0oO0.o00oo00O
            /* JADX WARN: Multi-variable type inference failed */
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) throws Exception {
                int i2 = i;
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo("SELECT * FROM PdfTextCacheEntity WHERE pdf_file_path = ? and pdf_page_index = ?");
                String str2 = str;
                try {
                    if (str2 == null) {
                        interfaceC24749OooO0OoO0ooOOo.OooO0oO(1);
                    } else {
                        interfaceC24749OooO0OoO0ooOOo.o000000O(1, str2);
                    }
                    interfaceC24749OooO0OoO0ooOOo.OooO0o(2, i2);
                    int iOooO0Oo = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "pdf_file_path");
                    int iOooO0Oo2 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "pdf_file_md5");
                    int iOooO0Oo3 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "pdf_page_index");
                    int iOooO0Oo4 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "creation_time");
                    int iOooO0Oo5 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "text");
                    int iOooO0Oo6 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "elements_json");
                    if (interfaceC24749OooO0OoO0ooOOo.o00oO0o()) {
                        pdfTextCacheEntity = new PdfTextCacheEntity(interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo2) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo2), (int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo3), interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo4), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo5) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo5), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo6) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo6));
                    }
                    interfaceC24749OooO0OoO0ooOOo.close();
                    return pdfTextCacheEntity;
                } catch (Throwable th) {
                    interfaceC24749OooO0OoO0ooOOo.close();
                    throw th;
                }
            }
        }, true, false);
    }
}
