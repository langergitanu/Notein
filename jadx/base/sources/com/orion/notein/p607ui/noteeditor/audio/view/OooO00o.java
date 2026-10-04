package com.orion.notein.p607ui.noteeditor.audio.view;

import com.orion.notein.p607ui.noteeditor.audio.view.WaveBarsStreamView;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO00o implements Runnable {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ WaveBarsStreamView f74432OooOo0o;

    public OooO00o(WaveBarsStreamView waveBarsStreamView) {
        this.f74432OooOo0o = waveBarsStreamView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        WaveBarsStreamView waveBarsStreamView = this.f74432OooOo0o;
        float f = waveBarsStreamView.f74437OooOoOO + waveBarsStreamView.f74439OooOoo0;
        waveBarsStreamView.f74437OooOoOO = f;
        if (f >= waveBarsStreamView.f74436OooOoO0 + waveBarsStreamView.f74435OooOoO) {
            waveBarsStreamView.f74437OooOoOO = 0.0f;
            WaveBarsStreamView.OooO00o oooO00o = waveBarsStreamView.f74442Oooo000;
            waveBarsStreamView.f74433OooOo.addLast(Float.valueOf(oooO00o != null ? oooO00o.OooO00o() : 0.1f));
        }
        waveBarsStreamView.postInvalidateOnAnimation();
        if (waveBarsStreamView.f74440OooOooO) {
            waveBarsStreamView.postDelayed(this, waveBarsStreamView.f74438OooOoo);
        }
    }
}
