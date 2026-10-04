package o0OOO0O0;

import com.google.firebase.Firebase;
import com.google.firebase.appcheck.FirebaseAppCheckKt;
import com.google.gson.Gson;
import o0000oOO.AbstractC24338OooO0o0;
import o0OOOOo.InterfaceC27159OooO00o;

/* JADX INFO: renamed from: o0OOO0O0.OooOOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C27006OooOOo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final InterfaceC27159OooO00o f93973OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0000o0O.OooOO0<AbstractC24338OooO0o0> f93974OooO0O0;

    public C27006OooOOo0(InterfaceC27159OooO00o apiService, o0000o0O.OooOO0<AbstractC24338OooO0o0> datastore) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(apiService, "apiService");
        kotlin.jvm.internal.OooOOO0.OooO0oO(datastore, "datastore");
        this.f93973OooO00o = apiService;
        this.f93974OooO0O0 = datastore;
        new Gson();
        FirebaseAppCheckKt.getAppCheck(Firebase.INSTANCE);
    }
}
