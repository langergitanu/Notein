package com.google.android.material.timepicker;

import com.orion.notein.MainActivity;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class OooO0O0 implements Runnable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f67775OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f67776OooOo0o;

    public /* synthetic */ OooO0O0(Object obj, int i) {
        this.f67776OooOo0o = i;
        this.f67775OooOo = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f67776OooOo0o) {
            case 0:
                ((MaterialTimePicker) this.f67775OooOo).lambda$onViewCreated$0();
                break;
            default:
                MainActivity.onCreate$lambda$17((MainActivity) this.f67775OooOo);
                break;
        }
    }
}
