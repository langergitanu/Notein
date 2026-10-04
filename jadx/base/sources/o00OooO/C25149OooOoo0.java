package o00OooO;

import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.load.data.InterfaceC22255OooO0Oo;
import com.bumptech.glide.load.data.InterfaceC22256OooO0o0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import o00Ooo0o.EnumC25112OooO00o;
import o00Ooo0o.InterfaceC25115OooO0Oo;
import o00Ooo0o.InterfaceC25116OooO0o;
import o00OooO.InterfaceC25130OooO0oo;
import o00OooOo.InterfaceC25161OooO00o;
import o00OoooO.InterfaceC25186OooOOo;
import o00o0O0.C25315OooO0oo;

/* JADX INFO: renamed from: o00OooO.OooOoo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25149OooOoo0 implements InterfaceC25130OooO0oo, InterfaceC25130OooO0oo.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final OooOO0 f85602OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final OooO<?> f85603OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public volatile C25128OooO0o0 f85604OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public volatile int f85605OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public volatile Object f85606OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public volatile OooO0o f85607OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public volatile InterfaceC25186OooOOo.OooO00o<?> f85608OooOoo0;

    public C25149OooOoo0(OooO oooO, OooOO0 oooOO02) {
        this.f85603OooOo0o = oooO;
        this.f85602OooOo = oooOO02;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0020  */
    @Override // o00OooO.InterfaceC25130OooO0oo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean OooO00o() {
        if (this.f85606OooOoOO != null) {
            Object obj = this.f85606OooOoOO;
            this.f85606OooOoOO = null;
            try {
            } catch (IOException e) {
                if (Log.isLoggable("SourceGenerator", 3)) {
                    Log.d("SourceGenerator", "Failed to properly rewind or write data to cache", e);
                }
            }
            if (OooO0O0(obj)) {
                if (this.f85604OooOoO == null || !this.f85604OooOoO.OooO00o()) {
                    this.f85604OooOoO = null;
                    this.f85608OooOoo0 = null;
                    boolean z = false;
                    while (!z && this.f85605OooOoO0 < this.f85603OooOo0o.OooO0O0().size()) {
                        ArrayList arrayListOooO0O0 = this.f85603OooOo0o.OooO0O0();
                        int i = this.f85605OooOoO0;
                        this.f85605OooOoO0 = i + 1;
                        this.f85608OooOoo0 = (InterfaceC25186OooOOo.OooO00o) arrayListOooO0O0.get(i);
                        if (this.f85608OooOoo0 != null && (this.f85603OooOo0o.f85407OooOOOo.OooO0OO(this.f85608OooOoo0.f85731OooO0OO.OooO0OO()) || this.f85603OooOo0o.OooO0OO(this.f85608OooOoo0.f85731OooO0OO.OooO00o()) != null)) {
                            this.f85608OooOoo0.f85731OooO0OO.OooO0Oo(this.f85603OooOo0o.f85406OooOOOO, new C25148OooOoOO(this, this.f85608OooOoo0));
                            z = true;
                        }
                    }
                    return z;
                }
            }
        }
        return true;
    }

    public final boolean OooO0O0(Object obj) throws Throwable {
        Throwable th;
        int i = C25315OooO0oo.f86154OooO0O0;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        boolean z = false;
        try {
            InterfaceC22256OooO0o0 interfaceC22256OooO0o0OooO0oO = this.f85603OooOo0o.f85395OooO0OO.OooO00o().OooO0oO(obj);
            Object objOooO00o = interfaceC22256OooO0o0OooO0oO.OooO00o();
            InterfaceC25115OooO0Oo<X> interfaceC25115OooO0OoOooO0Oo = this.f85603OooOo0o.OooO0Oo(objOooO00o);
            C25129OooO0oO c25129OooO0oO = new C25129OooO0oO(interfaceC25115OooO0OoOooO0Oo, objOooO00o, this.f85603OooOo0o.f85392OooO);
            InterfaceC25116OooO0o interfaceC25116OooO0o = this.f85608OooOoo0.f85729OooO00o;
            OooO<?> oooO = this.f85603OooOo0o;
            OooO0o oooO0o = new OooO0o(interfaceC25116OooO0o, oooO.f85404OooOOO);
            InterfaceC25161OooO00o interfaceC25161OooO00oOooO00o = oooO.f85400OooO0oo.OooO00o();
            interfaceC25161OooO00oOooO00o.OooO00o(oooO0o, c25129OooO0oO);
            if (Log.isLoggable("SourceGenerator", 2)) {
                Log.v("SourceGenerator", "Finished encoding source to cache, key: " + oooO0o + ", data: " + obj + ", encoder: " + interfaceC25115OooO0OoOooO0Oo + ", duration: " + C25315OooO0oo.OooO00o(jElapsedRealtimeNanos));
            }
            if (interfaceC25161OooO00oOooO00o.OooO0O0(oooO0o) != null) {
                this.f85607OooOoo = oooO0o;
                this.f85604OooOoO = new C25128OooO0o0(Collections.singletonList(this.f85608OooOoo0.f85729OooO00o), this.f85603OooOo0o, this);
                this.f85608OooOoo0.f85731OooO0OO.OooO0O0();
                return true;
            }
            if (Log.isLoggable("SourceGenerator", 3)) {
                Log.d("SourceGenerator", "Attempt to write: " + this.f85607OooOoo + ", data: " + obj + " to the disk cache failed, maybe the disk cache is disabled? Trying to decode the data directly...");
            }
            try {
                this.f85602OooOo.OooO0OO(this.f85608OooOoo0.f85729OooO00o, interfaceC22256OooO0o0OooO0oO.OooO00o(), this.f85608OooOoo0.f85731OooO0OO, this.f85608OooOoo0.f85731OooO0OO.OooO0OO(), this.f85608OooOoo0.f85729OooO00o);
                return false;
            } catch (Throwable th2) {
                th = th2;
                z = true;
                if (z) {
                    throw th;
                }
                this.f85608OooOoo0.f85731OooO0OO.OooO0O0();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // o00OooO.InterfaceC25130OooO0oo.OooO00o
    public final void OooO0OO(InterfaceC25116OooO0o interfaceC25116OooO0o, Object obj, InterfaceC22255OooO0Oo<?> interfaceC22255OooO0Oo, EnumC25112OooO00o enumC25112OooO00o, InterfaceC25116OooO0o interfaceC25116OooO0o2) {
        this.f85602OooOo.OooO0OO(interfaceC25116OooO0o, obj, interfaceC22255OooO0Oo, this.f85608OooOoo0.f85731OooO0OO.OooO0OO(), interfaceC25116OooO0o);
    }

    @Override // o00OooO.InterfaceC25130OooO0oo.OooO00o
    public final void OooO0Oo(InterfaceC25116OooO0o interfaceC25116OooO0o, Exception exc, InterfaceC22255OooO0Oo<?> interfaceC22255OooO0Oo, EnumC25112OooO00o enumC25112OooO00o) {
        this.f85602OooOo.OooO0Oo(interfaceC25116OooO0o, exc, interfaceC22255OooO0Oo, this.f85608OooOoo0.f85731OooO0OO.OooO0OO());
    }

    @Override // o00OooO.InterfaceC25130OooO0oo
    public final void cancel() {
        InterfaceC25186OooOOo.OooO00o<?> oooO00o = this.f85608OooOoo0;
        if (oooO00o != null) {
            oooO00o.f85731OooO0OO.cancel();
        }
    }
}
