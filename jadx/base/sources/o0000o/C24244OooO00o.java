package o0000o;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;

/* JADX INFO: renamed from: o0000o.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24244OooO00o extends OooOOOO implements oO0O000o.OooO00o<SharedPreferences> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ String f81504OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Context f81505OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24244OooO00o(Context context, String str) {
        super(0);
        this.f81505OooOo0o = context;
        this.f81504OooOo = str;
    }

    @Override // oO0O000o.OooO00o
    public final SharedPreferences invoke() {
        SharedPreferences sharedPreferences = this.f81505OooOo0o.getSharedPreferences(this.f81504OooOo, 0);
        OooOOO0.OooO0o(sharedPreferences, "context.getSharedPrefere…me, Context.MODE_PRIVATE)");
        return sharedPreferences;
    }
}
