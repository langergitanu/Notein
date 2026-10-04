package oo0oO0;

import com.aspose.slides.C22218Oooo;
import com.microsoft.identity.client.internal.MsalUtils;
import com.orion.notein.data.p602db.NoteAiDatabase_Impl;
import com.orion.notein.data.p602db.entity.NoteinAiQuotaRecordEntityV2;
import java.util.List;
import o000oo0o.C24718OooOO0o;
import o000oo0o.C24720OooOOO0;
import o000ooOO.C24734OooO0O0;
import o000ooo.InterfaceC24747OooO0O0;
import o000ooo.InterfaceC24749OooO0Oo;
import o00OOooo.C25022OooO0O0;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: oo0oO0.o00OoOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C34867o00OoOoO implements InterfaceC34994oOooo0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final NoteAiDatabase_Impl f125381OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C34845o00OOooo f125382OooO0O0 = new C34845o00OOooo();

    public C34867o00OoOoO(NoteAiDatabase_Impl noteAiDatabase_Impl) {
        this.f125381OooO00o = noteAiDatabase_Impl;
    }

    @Override // oo0oO0.InterfaceC34994oOooo0o
    public final C24718OooOO0o OooO00o(final String str) {
        InterfaceC32507OooOO0o interfaceC32507OooOO0o = new InterfaceC32507OooOO0o() { // from class: oo0oO0.o00OOooO
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) throws Exception {
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo("SELECT SUM(amount) FROM NoteinAiQuotaRecordEntityV2 where user_id= ? and amount < 0");
                try {
                    interfaceC24749OooO0OoO0ooOOo.o000000O(1, str);
                    Integer numValueOf = null;
                    if (interfaceC24749OooO0OoO0ooOOo.o00oO0o() && !interfaceC24749OooO0OoO0ooOOo.isNull(0)) {
                        numValueOf = Integer.valueOf((int) interfaceC24749OooO0OoO0ooOOo.getLong(0));
                    }
                    return numValueOf;
                } finally {
                    interfaceC24749OooO0OoO0ooOOo.close();
                }
            }
        };
        return C24720OooOOO0.OooO00o(this.f125381OooO00o, new String[]{"NoteinAiQuotaRecordEntityV2"}, interfaceC32507OooOO0o);
    }

    @Override // oo0oO0.InterfaceC34994oOooo0o
    public final C24718OooOO0o OooO0O0(final String str) {
        InterfaceC32507OooOO0o interfaceC32507OooOO0o = new InterfaceC32507OooOO0o() { // from class: oo0oO0.o00OOoo
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) throws Exception {
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo("SELECT SUM(amount) FROM NoteinAiQuotaRecordEntityV2 where user_id= ? and amount > 0");
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
        };
        return C24720OooOOO0.OooO00o(this.f125381OooO00o, new String[]{"NoteinAiQuotaRecordEntityV2"}, interfaceC32507OooOO0o);
    }

    @Override // oo0oO0.InterfaceC34994oOooo0o
    public final C24718OooOO0o OooO0OO(final String str) {
        InterfaceC32507OooOO0o interfaceC32507OooOO0o = new InterfaceC32507OooOO0o() { // from class: oo0oO0.o00OOOoO
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) throws Exception {
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo("SELECT SUM(amount) FROM NoteinAiQuotaRecordEntityV2 where user_id= ?");
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
        };
        return C24720OooOOO0.OooO00o(this.f125381OooO00o, new String[]{"NoteinAiQuotaRecordEntityV2"}, interfaceC32507OooOO0o);
    }

    @Override // oo0oO0.InterfaceC34994oOooo0o
    public final Object OooO0Oo(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        return C24734OooO0O0.OooO0oo(abstractC32479OooO0OO, this.f125381OooO00o, new Oooo0(str, 1), true, false);
    }

    @Override // oo0oO0.InterfaceC34994oOooo0o
    public final Object OooO0o(final NoteinAiQuotaRecordEntityV2[] noteinAiQuotaRecordEntityV2Arr, o0OOO0O0.OooOO0O oooOO0O) {
        noteinAiQuotaRecordEntityV2Arr.getClass();
        return C24734OooO0O0.OooO0oo(oooOO0O, this.f125381OooO00o, new InterfaceC32507OooOO0o() { // from class: oo0oO0.o00OOOo0
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) {
                this.f125347OooOo0o.f125382OooO0O0.OooOoo0((InterfaceC24747OooO0O0) obj, noteinAiQuotaRecordEntityV2Arr);
                return C32460OooOooO.f116667OooO00o;
            }
        }, false, true);
    }

    @Override // oo0oO0.InterfaceC34994oOooo0o
    public final Object OooO0o0(final List list, final String str, o0OOO0O0.OooOO0O oooOO0O) {
        StringBuilder sbOooO0OO = C22218Oooo.OooO0OO("delete from NoteinAiQuotaRecordEntityV2 where id in (");
        final int size = list.size();
        C25022OooO0O0.OooO0OO(size, sbOooO0OO);
        sbOooO0OO.append(") and user_id= ");
        sbOooO0OO.append(MsalUtils.QUERY_STRING_SYMBOL);
        final String string = sbOooO0OO.toString();
        return C24734OooO0O0.OooO0oo(oooOO0O, this.f125381OooO00o, new InterfaceC32507OooOO0o() { // from class: oo0oO0.o00OOOo
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) throws Exception {
                List<String> list2 = list;
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo(string);
                try {
                    int i = 1;
                    for (String str2 : list2) {
                        if (str2 == null) {
                            interfaceC24749OooO0OoO0ooOOo.OooO0oO(i);
                        } else {
                            interfaceC24749OooO0OoO0ooOOo.o000000O(i, str2);
                        }
                        i++;
                    }
                    int i2 = size + 1;
                    String str3 = str;
                    if (str3 == null) {
                        interfaceC24749OooO0OoO0ooOOo.OooO0oO(i2);
                    } else {
                        interfaceC24749OooO0OoO0ooOOo.o000000O(i2, str3);
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
}
