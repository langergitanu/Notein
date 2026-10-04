package o0OO00o0;

import com.google.gson.GsonBuilder;
import com.orion.notein.data.p602db.entity.BundleTypeAdapterFactory;
import o00o000.C25227OooOoO;
import o00o00oO.C25291OooO0oO;

/* JADX INFO: renamed from: o0OO00o0.o00Oo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C26618o00Oo0 implements oO0O000o.OooO00o {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f91867OooOo0o;

    public /* synthetic */ C26618o00Oo0(int i) {
        this.f91867OooOo0o = i;
    }

    @Override // oO0O000o.OooO00o
    public final Object invoke() {
        switch (this.f91867OooOo0o) {
            case 0:
                return new GsonBuilder().registerTypeAdapterFactory(new BundleTypeAdapterFactory()).create();
            default:
                return new C25291OooO0oO().Oooo0O0(new o00o000.OooO(), new C25227OooOoO(Oooo0.o000000O.OooO0o(2)));
        }
    }
}
