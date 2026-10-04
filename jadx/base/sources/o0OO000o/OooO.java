package o0OO000o;

import com.aspose.slides.C22213OooOoOO;
import com.aspose.slides.C22215OooOoo0;
import com.orion.notein.data.p602db.PlayFlavorDatabase_Impl;
import java.util.HashMap;
import java.util.HashSet;
import o000oo0.AbstractC24678OooOoO0;
import o000ooOO.C24734OooO0O0;
import o000ooOO.OooOOOO;
import o000ooo.C24746OooO00o;
import o000ooo.InterfaceC24747OooO0O0;

/* JADX INFO: loaded from: classes9.dex */
public final class OooO extends AbstractC24678OooOoO0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ PlayFlavorDatabase_Impl f90891OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO(PlayFlavorDatabase_Impl playFlavorDatabase_Impl) {
        super(4, "c2c364b72bcbf650cb9e8e5c169dc750", "95a6df52f2d939981420d710ed61ecb0");
        this.f90891OooO0Oo = playFlavorDatabase_Impl;
    }

    @Override // o000oo0.AbstractC24678OooOoO0
    public final void OooO00o(InterfaceC24747OooO0O0 interfaceC24747OooO0O0) throws Exception {
        C24746OooO00o.OooO0o0(interfaceC24747OooO0O0, "CREATE TABLE IF NOT EXISTS `PlayPurchaseServerEntity` (`purchase_token` TEXT NOT NULL, `product_type` TEXT NOT NULL, `product_id` TEXT, `original_json` TEXT NOT NULL, PRIMARY KEY(`purchase_token`))");
        C24746OooO00o.OooO0o0(interfaceC24747OooO0O0, "CREATE TABLE IF NOT EXISTS `NoteinFirebaseUserEntity` (`id` TEXT NOT NULL, `firebase_uid` TEXT NOT NULL, `concat_email` TEXT, `creation_time` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        C24746OooO00o.OooO0o0(interfaceC24747OooO0O0, "CREATE TABLE IF NOT EXISTS `NoteinGoogleSubscriptionPurchaseEntity` (`purchase_token` TEXT NOT NULL, `user_id` TEXT NOT NULL, `line_items_json` TEXT NOT NULL, `acknowledgement_state` TEXT NOT NULL, `subscription_state` TEXT NOT NULL, `status` TEXT NOT NULL, PRIMARY KEY(`purchase_token`))");
        C24746OooO00o.OooO0o0(interfaceC24747OooO0O0, "CREATE TABLE IF NOT EXISTS `NoteinGoogleInAppPurchaseEntity` (`purchase_token` TEXT NOT NULL, `user_id` TEXT NOT NULL, `product_id` TEXT NOT NULL, `acknowledgement_state` INTEGER NOT NULL, `purchase_state` INTEGER NOT NULL, `status` TEXT NOT NULL, `consumption_state` INTEGER NOT NULL, PRIMARY KEY(`purchase_token`))");
        C24746OooO00o.OooO0o0(interfaceC24747OooO0O0, "CREATE TABLE IF NOT EXISTS `NoteinGoogleDeveloperOfferEntity` (`id` TEXT NOT NULL, `user_id` TEXT NOT NULL, `product_id` TEXT NOT NULL, `base_plan_id` TEXT NOT NULL, `offer_id` TEXT NOT NULL, `created_at` INTEGER NOT NULL, `expire_at` INTEGER NOT NULL, `used` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        C24746OooO00o.OooO0o0(interfaceC24747OooO0O0, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        C24746OooO00o.OooO0o0(interfaceC24747OooO0O0, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c2c364b72bcbf650cb9e8e5c169dc750')");
    }

    @Override // o000oo0.AbstractC24678OooOoO0
    public final void OooO0O0(InterfaceC24747OooO0O0 interfaceC24747OooO0O0) throws Exception {
        C24746OooO00o.OooO0o0(interfaceC24747OooO0O0, "DROP TABLE IF EXISTS `PlayPurchaseServerEntity`");
        C24746OooO00o.OooO0o0(interfaceC24747OooO0O0, "DROP TABLE IF EXISTS `NoteinFirebaseUserEntity`");
        C24746OooO00o.OooO0o0(interfaceC24747OooO0O0, "DROP TABLE IF EXISTS `NoteinGoogleSubscriptionPurchaseEntity`");
        C24746OooO00o.OooO0o0(interfaceC24747OooO0O0, "DROP TABLE IF EXISTS `NoteinGoogleInAppPurchaseEntity`");
        C24746OooO00o.OooO0o0(interfaceC24747OooO0O0, "DROP TABLE IF EXISTS `NoteinGoogleDeveloperOfferEntity`");
    }

    @Override // o000oo0.AbstractC24678OooOoO0
    public final void OooO0OO(InterfaceC24747OooO0O0 interfaceC24747OooO0O0) {
    }

    @Override // o000oo0.AbstractC24678OooOoO0
    public final void OooO0Oo(InterfaceC24747OooO0O0 interfaceC24747OooO0O0) throws Exception {
        this.f90891OooO0Oo.OooOOo0(interfaceC24747OooO0O0);
    }

    @Override // o000oo0.AbstractC24678OooOoO0
    public final void OooO0o(InterfaceC24747OooO0O0 interfaceC24747OooO0O0) throws Exception {
        C24734OooO0O0.OooO0O0(interfaceC24747OooO0O0);
    }

    @Override // o000oo0.AbstractC24678OooOoO0
    public final void OooO0o0(InterfaceC24747OooO0O0 interfaceC24747OooO0O0) {
    }

    @Override // o000oo0.AbstractC24678OooOoO0
    public final AbstractC24678OooOoO0.OooO00o OooO0oO(InterfaceC24747OooO0O0 interfaceC24747OooO0O0) throws Exception {
        HashMap map = new HashMap(4);
        map.put("purchase_token", new OooOOOO.OooO00o("purchase_token", "TEXT", true, 1, null, 1));
        map.put("product_type", new OooOOOO.OooO00o("product_type", "TEXT", true, 0, null, 1));
        map.put("product_id", new OooOOOO.OooO00o("product_id", "TEXT", false, 0, null, 1));
        OooOOOO oooOOOO = new OooOOOO("PlayPurchaseServerEntity", map, C22215OooOoo0.OooO0O0(map, "original_json", new OooOOOO.OooO00o("original_json", "TEXT", true, 0, null, 1), 0), new HashSet(0));
        OooOOOO oooOOOOOooO00o = OooOOOO.OooO0O0.OooO00o(interfaceC24747OooO0O0, "PlayPurchaseServerEntity");
        if (!oooOOOO.equals(oooOOOOOooO00o)) {
            return new AbstractC24678OooOoO0.OooO00o(false, C22213OooOoOO.OooO0OO("PlayPurchaseServerEntity(com.orion.notein.data.db.entity.PlayPurchaseServerEntity).\n Expected:\n", oooOOOO, "\n Found:\n", oooOOOOOooO00o));
        }
        HashMap map2 = new HashMap(4);
        map2.put("id", new OooOOOO.OooO00o("id", "TEXT", true, 1, null, 1));
        map2.put("firebase_uid", new OooOOOO.OooO00o("firebase_uid", "TEXT", true, 0, null, 1));
        map2.put("concat_email", new OooOOOO.OooO00o("concat_email", "TEXT", false, 0, null, 1));
        OooOOOO oooOOOO2 = new OooOOOO("NoteinFirebaseUserEntity", map2, C22215OooOoo0.OooO0O0(map2, "creation_time", new OooOOOO.OooO00o("creation_time", "INTEGER", true, 0, null, 1), 0), new HashSet(0));
        OooOOOO oooOOOOOooO00o2 = OooOOOO.OooO0O0.OooO00o(interfaceC24747OooO0O0, "NoteinFirebaseUserEntity");
        if (!oooOOOO2.equals(oooOOOOOooO00o2)) {
            return new AbstractC24678OooOoO0.OooO00o(false, C22213OooOoOO.OooO0OO("NoteinFirebaseUserEntity(com.orion.notein.data.db.entity.NoteinFirebaseUserEntity).\n Expected:\n", oooOOOO2, "\n Found:\n", oooOOOOOooO00o2));
        }
        HashMap map3 = new HashMap(6);
        map3.put("purchase_token", new OooOOOO.OooO00o("purchase_token", "TEXT", true, 1, null, 1));
        map3.put("user_id", new OooOOOO.OooO00o("user_id", "TEXT", true, 0, null, 1));
        map3.put("line_items_json", new OooOOOO.OooO00o("line_items_json", "TEXT", true, 0, null, 1));
        map3.put("acknowledgement_state", new OooOOOO.OooO00o("acknowledgement_state", "TEXT", true, 0, null, 1));
        map3.put("subscription_state", new OooOOOO.OooO00o("subscription_state", "TEXT", true, 0, null, 1));
        OooOOOO oooOOOO3 = new OooOOOO("NoteinGoogleSubscriptionPurchaseEntity", map3, C22215OooOoo0.OooO0O0(map3, "status", new OooOOOO.OooO00o("status", "TEXT", true, 0, null, 1), 0), new HashSet(0));
        OooOOOO oooOOOOOooO00o3 = OooOOOO.OooO0O0.OooO00o(interfaceC24747OooO0O0, "NoteinGoogleSubscriptionPurchaseEntity");
        if (!oooOOOO3.equals(oooOOOOOooO00o3)) {
            return new AbstractC24678OooOoO0.OooO00o(false, C22213OooOoOO.OooO0OO("NoteinGoogleSubscriptionPurchaseEntity(com.orion.notein.data.db.entity.NoteinGoogleSubscriptionPurchaseEntity).\n Expected:\n", oooOOOO3, "\n Found:\n", oooOOOOOooO00o3));
        }
        HashMap map4 = new HashMap(7);
        map4.put("purchase_token", new OooOOOO.OooO00o("purchase_token", "TEXT", true, 1, null, 1));
        map4.put("user_id", new OooOOOO.OooO00o("user_id", "TEXT", true, 0, null, 1));
        map4.put("product_id", new OooOOOO.OooO00o("product_id", "TEXT", true, 0, null, 1));
        map4.put("acknowledgement_state", new OooOOOO.OooO00o("acknowledgement_state", "INTEGER", true, 0, null, 1));
        map4.put("purchase_state", new OooOOOO.OooO00o("purchase_state", "INTEGER", true, 0, null, 1));
        map4.put("status", new OooOOOO.OooO00o("status", "TEXT", true, 0, null, 1));
        OooOOOO oooOOOO4 = new OooOOOO("NoteinGoogleInAppPurchaseEntity", map4, C22215OooOoo0.OooO0O0(map4, "consumption_state", new OooOOOO.OooO00o("consumption_state", "INTEGER", true, 0, null, 1), 0), new HashSet(0));
        OooOOOO oooOOOOOooO00o4 = OooOOOO.OooO0O0.OooO00o(interfaceC24747OooO0O0, "NoteinGoogleInAppPurchaseEntity");
        if (!oooOOOO4.equals(oooOOOOOooO00o4)) {
            return new AbstractC24678OooOoO0.OooO00o(false, C22213OooOoOO.OooO0OO("NoteinGoogleInAppPurchaseEntity(com.orion.notein.data.db.entity.NoteinGoogleInAppPurchaseEntity).\n Expected:\n", oooOOOO4, "\n Found:\n", oooOOOOOooO00o4));
        }
        HashMap map5 = new HashMap(8);
        map5.put("id", new OooOOOO.OooO00o("id", "TEXT", true, 1, null, 1));
        map5.put("user_id", new OooOOOO.OooO00o("user_id", "TEXT", true, 0, null, 1));
        map5.put("product_id", new OooOOOO.OooO00o("product_id", "TEXT", true, 0, null, 1));
        map5.put("base_plan_id", new OooOOOO.OooO00o("base_plan_id", "TEXT", true, 0, null, 1));
        map5.put("offer_id", new OooOOOO.OooO00o("offer_id", "TEXT", true, 0, null, 1));
        map5.put("created_at", new OooOOOO.OooO00o("created_at", "INTEGER", true, 0, null, 1));
        map5.put("expire_at", new OooOOOO.OooO00o("expire_at", "INTEGER", true, 0, null, 1));
        OooOOOO oooOOOO5 = new OooOOOO("NoteinGoogleDeveloperOfferEntity", map5, C22215OooOoo0.OooO0O0(map5, "used", new OooOOOO.OooO00o("used", "INTEGER", true, 0, null, 1), 0), new HashSet(0));
        OooOOOO oooOOOOOooO00o5 = OooOOOO.OooO0O0.OooO00o(interfaceC24747OooO0O0, "NoteinGoogleDeveloperOfferEntity");
        return !oooOOOO5.equals(oooOOOOOooO00o5) ? new AbstractC24678OooOoO0.OooO00o(false, C22213OooOoOO.OooO0OO("NoteinGoogleDeveloperOfferEntity(com.orion.notein.data.db.entity.NoteinGoogleDeveloperOfferEntity).\n Expected:\n", oooOOOO5, "\n Found:\n", oooOOOOOooO00o5)) : new AbstractC24678OooOoO0.OooO00o(true, null);
    }
}
