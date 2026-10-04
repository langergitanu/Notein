package com.google.android.recaptcha.internal;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;
import o00OooO0.C25150OooO00o;
import oO0o0OO.C33621OooOo0;
import oO0o0OO.InterfaceC33622OooOo00;
import oO0o0OO.InterfaceC33642Oooo0oo;

/* JADX INFO: loaded from: classes7.dex */
public final class zzbx {
    public static final InterfaceC33642Oooo0oo zza(Task task) {
        final C33621OooOo0 c33621OooOo0OooO0Oo = C25150OooO00o.OooO0Oo();
        task.addOnCompleteListener(zzbv.zza, new OnCompleteListener() { // from class: com.google.android.recaptcha.internal.zzbu
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task2) {
                InterfaceC33622OooOo00 interfaceC33622OooOo00 = c33621OooOo0OooO0Oo;
                Exception exception = task2.getException();
                if (exception != null) {
                    interfaceC33622OooOo00.OooO00o(exception);
                } else if (task2.isCanceled()) {
                    interfaceC33622OooOo00.cancel((CancellationException) null);
                } else {
                    interfaceC33622OooOo00.Oooo0(task2.getResult());
                }
            }
        });
        return new zzbw(c33621OooOo0OooO0Oo);
    }
}
