package o00OO0o;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import java.util.Collection;
import kotlin.jvm.internal.OooOOO0;
import oO0Oo00.C33194OooO0O0;
import oOo000Oo.OooOo;
import ooOOO0Oo.OooOO0;

/* JADX INFO: renamed from: o00OO0o.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24994OooO0Oo implements o00OO0OO.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final /* synthetic */ int f84804OooO00o = 0;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final /* synthetic */ int f84805OooO0O0 = 0;

    public static boolean OooO00o(oO0O0OO.OooO0O0 callableMemberDescriptor) {
        OooOOO0.OooO0oO(callableMemberDescriptor, "callableMemberDescriptor");
        if (!OooOO0.f125797OooO0Oo.contains(callableMemberDescriptor.getName())) {
            return false;
        }
        if (OooOo.Oooo00o(OooOO0.f125796OooO0OO, C33194OooO0O0.OooO0OO(callableMemberDescriptor)) && callableMemberDescriptor.OooO0o().isEmpty()) {
            return true;
        }
        if (!oO0O0O0o.OooOO0.OooOoO0(callableMemberDescriptor)) {
            return false;
        }
        Collection<? extends oO0O0OO.OooO0O0> overriddenDescriptors = callableMemberDescriptor.OooOO0o();
        OooOOO0.OooO0o(overriddenDescriptors, "overriddenDescriptors");
        Collection<? extends oO0O0OO.OooO0O0> collection = overriddenDescriptors;
        if (collection.isEmpty()) {
            return false;
        }
        for (oO0O0OO.OooO0O0 it : collection) {
            OooOOO0.OooO0o(it, "it");
            if (OooO00o(it)) {
                return true;
            }
        }
        return false;
    }

    @Override // o00OO0OO.OooO00o
    /* JADX INFO: renamed from: a */
    public String mo1a(Context context) {
        if (context == null) {
            return null;
        }
        Cursor cursorQuery = context.getContentResolver().query(Uri.parse("content://cn.nubia.provider.deviceid.dataid/oaid"), null, null, null, null);
        if (cursorQuery != null) {
            string = cursorQuery.moveToNext() ? cursorQuery.getString(cursorQuery.getColumnIndex("device_ids_grndid")) : null;
            cursorQuery.close();
        }
        return string;
    }
}
