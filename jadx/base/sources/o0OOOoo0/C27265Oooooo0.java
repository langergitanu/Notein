package o0OOOoo0;

import com.aspose.slides.C22208OooOo0;
import o000ooO0.AbstractC24732OooO00o;
import o000oooO.InterfaceC24756OooO0O0;

/* JADX INFO: renamed from: o0OOOoo0.Oooooo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C27265Oooooo0 extends AbstractC24732OooO00o {
    @Override // o000ooO0.AbstractC24732OooO00o
    public final void OooO00o(InterfaceC24756OooO0O0 interfaceC24756OooO0O0) {
        C22208OooOo0.OooO0O0(interfaceC24756OooO0O0, "database", "CREATE TABLE IF NOT EXISTS 'NoteinFirebaseUserEntity' ('id' TEXT NOT NULL, 'firebase_uid' TEXT NOT NULL, 'concat_email' TEXT, 'creation_time' INTEGER NOT NULL, PRIMARY KEY('id'))", "CREATE TABLE IF NOT EXISTS 'NoteinGoogleInAppPurchaseEntity' ('purchase_token' TEXT NOT NULL, 'user_id' TEXT NOT NULL, 'product_id' TEXT NOT NULL, 'acknowledgement_state' INTEGER NOT NULL, 'purchase_state' INTEGER NOT NULL, 'status' TEXT NOT NULL, PRIMARY KEY('purchase_token'))", "CREATE TABLE IF NOT EXISTS 'NoteinGoogleSubscriptionPurchaseEntity' ('purchase_token' TEXT NOT NULL, 'user_id' TEXT NOT NULL, 'line_items_json' TEXT NOT NULL, 'acknowledgement_state' TEXT NOT NULL, 'subscription_state' TEXT NOT NULL, 'status' TEXT NOT NULL, PRIMARY KEY('purchase_token'))");
    }
}
