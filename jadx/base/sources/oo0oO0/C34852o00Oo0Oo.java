package oo0oO0;

import com.orion.notein.data.p602db.PlayFlavorDatabase_Impl;
import com.orion.notein.data.p602db.entity.NoteinFirebaseUserEntity;
import o000oo0o.C24718OooOO0o;
import o000oo0o.C24720OooOOO0;
import o000ooOO.C24734OooO0O0;
import o000ooo.InterfaceC24747OooO0O0;
import o000ooo.InterfaceC24749OooO0Oo;
import o0OOOO.C27079OooO0oO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: oo0oO0.o00Oo0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C34852o00Oo0Oo implements InterfaceC34848o00Oo000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final PlayFlavorDatabase_Impl f125356OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C34850o00Oo0O f125357OooO0O0 = new C34850o00Oo0O();

    public C34852o00Oo0Oo(PlayFlavorDatabase_Impl playFlavorDatabase_Impl) {
        this.f125356OooO00o = playFlavorDatabase_Impl;
    }

    @Override // oo0oO0.InterfaceC34848o00Oo000
    public final void OooO00o(final String str) {
        C24734OooO0O0.OooO0o(this.f125356OooO00o, false, true, new InterfaceC32507OooOO0o() { // from class: oo0oO0.o00Oo0O0
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) throws Exception {
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo("DELETE FROM NoteinFirebaseUserEntity WHERE id = ?");
                String str2 = str;
                try {
                    if (str2 == null) {
                        interfaceC24749OooO0OoO0ooOOo.OooO0oO(1);
                    } else {
                        interfaceC24749OooO0OoO0ooOOo.o000000O(1, str2);
                    }
                    interfaceC24749OooO0OoO0ooOOo.o00oO0o();
                    interfaceC24749OooO0OoO0ooOOo.close();
                    return null;
                } catch (Throwable th) {
                    interfaceC24749OooO0OoO0ooOOo.close();
                    throw th;
                }
            }
        });
    }

    @Override // oo0oO0.InterfaceC34848o00Oo000
    public final C24718OooOO0o OooO0O0(String str) {
        C34849o00Oo00o c34849o00Oo00o = new C34849o00Oo00o(str, 0);
        return C24720OooOOO0.OooO00o(this.f125356OooO00o, new String[]{"NoteinFirebaseUserEntity"}, c34849o00Oo00o);
    }

    @Override // oo0oO0.InterfaceC34848o00Oo000
    public final Object OooO0OO(NoteinFirebaseUserEntity[] noteinFirebaseUserEntityArr, o0OOOO.OooO0OO oooO0OO) {
        return C24734OooO0O0.OooO0oo(oooO0OO, this.f125356OooO00o, new C34735OoooO0O(1, this, noteinFirebaseUserEntityArr), false, true);
    }

    @Override // oo0oO0.InterfaceC34848o00Oo000
    public final Object OooO0Oo(String str, o0OOOO.OooO0o oooO0o) {
        return C24734OooO0O0.OooO0oo(oooO0o, this.f125356OooO00o, new C34732OoooO(str, 1), true, false);
    }

    @Override // oo0oO0.InterfaceC34848o00Oo000
    public final Object OooO0o0(final String str, C27079OooO0oO c27079OooO0oO) {
        return C24734OooO0O0.OooO0oo(c27079OooO0oO, this.f125356OooO00o, new InterfaceC32507OooOO0o() { // from class: oo0oO0.o00Oo00
            /* JADX WARN: Multi-variable type inference failed */
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) throws Exception {
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo("select * from NoteinFirebaseUserEntity where firebase_uid = ?");
                String str2 = str;
                try {
                    if (str2 == null) {
                        interfaceC24749OooO0OoO0ooOOo.OooO0oO(1);
                    } else {
                        interfaceC24749OooO0OoO0ooOOo.o000000O(1, str2);
                    }
                    int iOooO0Oo = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "id");
                    int iOooO0Oo2 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "firebase_uid");
                    int iOooO0Oo3 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "concat_email");
                    int iOooO0Oo4 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "creation_time");
                    if (interfaceC24749OooO0OoO0ooOOo.o00oO0o()) {
                        noteinFirebaseUserEntity = new NoteinFirebaseUserEntity(interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo2) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo2), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo3) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo3), interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo4));
                    }
                    interfaceC24749OooO0OoO0ooOOo.close();
                    return noteinFirebaseUserEntity;
                } catch (Throwable th) {
                    interfaceC24749OooO0OoO0ooOOo.close();
                    throw th;
                }
            }
        }, true, false);
    }
}
