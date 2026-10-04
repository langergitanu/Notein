package com.yubico.yubikit.android.transport.nfc;

import android.app.Activity;
import android.content.Context;
import android.nfc.NfcAdapter;
import android.nfc.Tag;
import android.os.Bundle;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes10.dex */
public final class OooOO0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final NfcAdapter f80239OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO0O0 f80240OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public ExecutorService f80241OooO0OO = null;

    public OooOO0O(Context context) throws OooO0OO {
        NfcAdapter defaultAdapter = NfcAdapter.getDefaultAdapter(context);
        this.f80239OooO00o = defaultAdapter;
        if (defaultAdapter == null) {
            throw new OooO0OO("NFC unavailable on this device", false);
        }
        this.f80240OooO0O0 = new C23914OooO0o0(defaultAdapter);
    }

    public final void OooO00o(Activity activity, OooO00o oooO00o, oO00000.OooO00o<? super OooO> oooO00o2) throws OooO0OO {
        if (!this.f80239OooO00o.isEnabled()) {
            throw new OooO0OO("Please activate NFC_TRANSPORT", true);
        }
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        final OooOO0 oooOO02 = new OooOO0(oooO00o2, oooO00o, executorServiceNewSingleThreadExecutor);
        C23914OooO0o0 c23914OooO0o0 = (C23914OooO0o0) this.f80240OooO0O0;
        c23914OooO0o0.f80231OooO00o.disableReaderMode(activity);
        Bundle bundle = new Bundle();
        bundle.putInt("presence", 50);
        c23914OooO0o0.f80231OooO00o.enableReaderMode(activity, new NfcAdapter.ReaderCallback() { // from class: com.yubico.yubikit.android.transport.nfc.OooO0Oo
            @Override // android.nfc.NfcAdapter.ReaderCallback
            public final void onTagDiscovered(Tag tag) {
                OooOO0 oooOO03 = oooOO02;
                oooOO03.f80236OooO00o.invoke(new OooO(tag, oooOO03.f80237OooO0O0.f80226OooO00o, oooOO03.f80238OooO0OO));
            }
        }, 3, bundle);
        this.f80241OooO0OO = executorServiceNewSingleThreadExecutor;
    }
}
