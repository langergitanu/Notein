package o000O0o0;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import com.google.common.collect.ImmutableMap;
import o00O0O0o.OooOo00;
import oO00ooO0.InterfaceC32462OooO00o;

/* JADX INFO: renamed from: o000O0o0.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24408OooO00o extends OooOo00 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ImmutableMap f82406OooO0O0;

    public C24408OooO00o(ImmutableMap immutableMap) {
        this.f82406OooO0O0 = immutableMap;
    }

    @Override // o00O0O0o.OooOo00
    public final ListenableWorker OooO00o(Context context, String str, WorkerParameters workerParameters) {
        InterfaceC32462OooO00o interfaceC32462OooO00o = (InterfaceC32462OooO00o) this.f82406OooO0O0.get(str);
        if (interfaceC32462OooO00o == null) {
            return null;
        }
        return ((OooO0O0) interfaceC32462OooO00o.get()).OooO00o(context, workerParameters);
    }
}
