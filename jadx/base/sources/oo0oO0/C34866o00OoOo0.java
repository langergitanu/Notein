package oo0oO0;

import com.aspose.slides.C22218Oooo;
import com.microsoft.identity.client.internal.MsalUtils;
import com.orion.notein.data.p602db.PlayFlavorDatabase_Impl;
import com.orion.notein.data.p602db.entity.NoteinGoogleInAppPurchaseEntity;
import com.orion.notein.data.p602db.entity.NoteinGoogleSubscriptionPurchaseEntity;
import com.orion.notein.data.repo.transactions.C22975ooOO;
import java.util.ArrayList;
import java.util.List;
import o000oo0o.C24718OooOO0o;
import o000oo0o.C24720OooOOO0;
import o000ooOO.C24734OooO0O0;
import o000ooo.InterfaceC24747OooO0O0;
import o000ooo.InterfaceC24749OooO0Oo;
import o00OOooo.C25022OooO0O0;
import o0ooOOO0.C31635OooOOOo;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: oo0oO0.o00OoOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C34866o00OoOo0 implements o0oOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final PlayFlavorDatabase_Impl f125378OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C34863o00OoOOO f125379OooO0O0 = new C34863o00OoOOO();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C34864o00OoOOo f125380OooO0OO = new C34864o00OoOOo();

    public C34866o00OoOo0(PlayFlavorDatabase_Impl playFlavorDatabase_Impl) {
        this.f125378OooO00o = playFlavorDatabase_Impl;
    }

    @Override // oo0oO0.o0oOO
    public final List<NoteinGoogleInAppPurchaseEntity> OooO(String str) {
        return (List) C24734OooO0O0.OooO0o(this.f125378OooO00o, true, false, new C34745OooooOO(str, 1));
    }

    @Override // oo0oO0.o0oOO
    public final C24718OooOO0o OooO00o(final String str, final String str2) {
        InterfaceC32507OooOO0o interfaceC32507OooOO0o = new InterfaceC32507OooOO0o() { // from class: oo0oO0.o00OoO00
            /* JADX WARN: Multi-variable type inference failed */
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) throws Exception {
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo("select * from NoteinGoogleSubscriptionPurchaseEntity where purchase_token = ? and user_id = ?");
                try {
                    interfaceC24749OooO0OoO0ooOOo.o000000O(1, str);
                    interfaceC24749OooO0OoO0ooOOo.o000000O(2, str2);
                    int iOooO0Oo = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "purchase_token");
                    int iOooO0Oo2 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "user_id");
                    int iOooO0Oo3 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "line_items_json");
                    int iOooO0Oo4 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "acknowledgement_state");
                    int iOooO0Oo5 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "subscription_state");
                    int iOooO0Oo6 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "status");
                    if (interfaceC24749OooO0OoO0ooOOo.o00oO0o()) {
                        noteinGoogleSubscriptionPurchaseEntity = new NoteinGoogleSubscriptionPurchaseEntity(interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo2) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo2), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo3) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo3), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo4) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo4), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo5) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo5), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo6) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo6));
                    }
                    return noteinGoogleSubscriptionPurchaseEntity;
                } finally {
                    interfaceC24749OooO0OoO0ooOOo.close();
                }
            }
        };
        return C24720OooOOO0.OooO00o(this.f125378OooO00o, new String[]{"NoteinGoogleSubscriptionPurchaseEntity"}, interfaceC32507OooOO0o);
    }

    @Override // oo0oO0.o0oOO
    public final Object OooO0O0(NoteinGoogleSubscriptionPurchaseEntity[] noteinGoogleSubscriptionPurchaseEntityArr, com.orion.notein.data.repo.transactions.o00Oo0 o00oo02) {
        noteinGoogleSubscriptionPurchaseEntityArr.getClass();
        return C24734OooO0O0.OooO0oo(o00oo02, this.f125378OooO00o, new C34857o00OoO(this, noteinGoogleSubscriptionPurchaseEntityArr, 0), false, true);
    }

    @Override // oo0oO0.o0oOO
    public final void OooO0OO(String str, List list) {
        StringBuilder sbOooO0OO = C22218Oooo.OooO0OO("DELETE FROM NoteinGoogleSubscriptionPurchaseEntity WHERE purchase_token in (");
        int size = list.size();
        C25022OooO0O0.OooO0OO(size, sbOooO0OO);
        sbOooO0OO.append(") and user_id = ");
        sbOooO0OO.append(MsalUtils.QUERY_STRING_SYMBOL);
        C24734OooO0O0.OooO0o(this.f125378OooO00o, false, true, new C34858o00OoO0(sbOooO0OO.toString(), list, size, str, 0));
    }

    @Override // oo0oO0.o0oOO
    public final Object OooO0Oo(final NoteinGoogleInAppPurchaseEntity[] noteinGoogleInAppPurchaseEntityArr, C22975ooOO c22975ooOO) {
        noteinGoogleInAppPurchaseEntityArr.getClass();
        return C24734OooO0O0.OooO0oo(c22975ooOO, this.f125378OooO00o, new InterfaceC32507OooOO0o() { // from class: oo0oO0.o00OoO0o
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) {
                this.f125372OooOo0o.f125379OooO0O0.OooOoo0((InterfaceC24747OooO0O0) obj, noteinGoogleInAppPurchaseEntityArr);
                return C32460OooOooO.f116667OooO00o;
            }
        }, false, true);
    }

    @Override // oo0oO0.o0oOO
    public final C24718OooOO0o OooO0o(final String str) {
        InterfaceC32507OooOO0o interfaceC32507OooOO0o = new InterfaceC32507OooOO0o() { // from class: oo0oO0.o00OoOO
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) throws Exception {
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo("select * from NoteinGoogleInAppPurchaseEntity where user_id = ?");
                String str2 = str;
                try {
                    if (str2 == null) {
                        interfaceC24749OooO0OoO0ooOOo.OooO0oO(1);
                    } else {
                        interfaceC24749OooO0OoO0ooOOo.o000000O(1, str2);
                    }
                    int iOooO0Oo = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "purchase_token");
                    int iOooO0Oo2 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "user_id");
                    int iOooO0Oo3 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "product_id");
                    int iOooO0Oo4 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "acknowledgement_state");
                    int iOooO0Oo5 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "purchase_state");
                    int iOooO0Oo6 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "status");
                    int iOooO0Oo7 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "consumption_state");
                    ArrayList arrayList = new ArrayList();
                    while (interfaceC24749OooO0OoO0ooOOo.o00oO0o()) {
                        int i = iOooO0Oo2;
                        arrayList.add(new NoteinGoogleInAppPurchaseEntity(interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo2) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo2), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo3) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo3), (int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo4), (int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo5), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo6) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo6), (int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo7)));
                        iOooO0Oo2 = i;
                    }
                    interfaceC24749OooO0OoO0ooOOo.close();
                    return arrayList;
                } catch (Throwable th) {
                    interfaceC24749OooO0OoO0ooOOo.close();
                    throw th;
                }
            }
        };
        return C24720OooOOO0.OooO00o(this.f125378OooO00o, new String[]{"NoteinGoogleInAppPurchaseEntity"}, interfaceC32507OooOO0o);
    }

    @Override // oo0oO0.o0oOO
    public final List<NoteinGoogleSubscriptionPurchaseEntity> OooO0o0(final String str) {
        return (List) C24734OooO0O0.OooO0o(this.f125378OooO00o, true, false, new InterfaceC32507OooOO0o() { // from class: oo0oO0.o00Oo
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) throws Exception {
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo("select * from NoteinGoogleSubscriptionPurchaseEntity where user_id = ?");
                String str2 = str;
                try {
                    if (str2 == null) {
                        interfaceC24749OooO0OoO0ooOOo.OooO0oO(1);
                    } else {
                        interfaceC24749OooO0OoO0ooOOo.o000000O(1, str2);
                    }
                    int iOooO0Oo = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "purchase_token");
                    int iOooO0Oo2 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "user_id");
                    int iOooO0Oo3 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "line_items_json");
                    int iOooO0Oo4 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "acknowledgement_state");
                    int iOooO0Oo5 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "subscription_state");
                    int iOooO0Oo6 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "status");
                    ArrayList arrayList = new ArrayList();
                    while (interfaceC24749OooO0OoO0ooOOo.o00oO0o()) {
                        arrayList.add(new NoteinGoogleSubscriptionPurchaseEntity(interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo2) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo2), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo3) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo3), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo4) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo4), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo5) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo5), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo6) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo6)));
                    }
                    interfaceC24749OooO0OoO0ooOOo.close();
                    return arrayList;
                } catch (Throwable th) {
                    interfaceC24749OooO0OoO0ooOOo.close();
                    throw th;
                }
            }
        });
    }

    @Override // oo0oO0.o0oOO
    public final C24718OooOO0o OooO0oO(String str) {
        C31635OooOOOo c31635OooOOOo = new C31635OooOOOo(str, 1);
        return C24720OooOOO0.OooO00o(this.f125378OooO00o, new String[]{"NoteinGoogleSubscriptionPurchaseEntity"}, c31635OooOOOo);
    }

    @Override // oo0oO0.o0oOO
    public final void OooO0oo(final String str, final List list) {
        StringBuilder sbOooO0OO = C22218Oooo.OooO0OO("DELETE FROM NoteinGoogleInAppPurchaseEntity WHERE purchase_token in (");
        final int size = list.size();
        C25022OooO0O0.OooO0OO(size, sbOooO0OO);
        sbOooO0OO.append(") and user_id = ");
        sbOooO0OO.append(MsalUtils.QUERY_STRING_SYMBOL);
        final String string = sbOooO0OO.toString();
        C24734OooO0O0.OooO0o(this.f125378OooO00o, false, true, new InterfaceC32507OooOO0o() { // from class: oo0oO0.o00OoOO0
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
                    interfaceC24749OooO0OoO0ooOOo.close();
                    return null;
                } catch (Throwable th) {
                    interfaceC24749OooO0OoO0ooOOo.close();
                    throw th;
                }
            }
        });
    }
}
