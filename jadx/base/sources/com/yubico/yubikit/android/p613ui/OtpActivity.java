package com.yubico.yubikit.android.p613ui;

import android.content.Intent;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.InputDevice;
import android.view.KeyEvent;
import com.orion.notein.global.R;
import com.yubico.yubikit.android.p613ui.OtpActivity;
import com.yubico.yubikit.android.transport.nfc.OooO;
import com.yubico.yubikit.android.transport.usb.C23919OooO0oO;
import java.io.IOException;
import o0ooooOo.C31873OooO00o;
import o0ooooo.InterfaceC31877OooO0Oo;
import oOO00OOo.InterfaceC34352OooO0O0;
import ooo0Oo0.AbstractC35186OooO0oO;
import ooo0Oo0.OooO0o;
import ooo0Oo0.OooOOO0;

/* JADX INFO: loaded from: classes10.dex */
public class OtpActivity extends YubiKeyPromptActivity {

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public static final /* synthetic */ int f80276Oooo0OO = 0;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public OooO0o f80277Oooo0;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public int f80278Oooo0O0 = 0;

    public class OooO00o {
        public OooO00o() {
        }
    }

    public static class OooO0O0 extends AbstractC35186OooO0oO {
        @Override // ooo0Oo0.AbstractC35186OooO0oO
        public final void OooO00o(InterfaceC31877OooO0Oo interfaceC31877OooO0Oo, OooOOO0 oooOOO0) {
            Runnable runnable = oooOOO0.f126314OooO0O0;
            YubiKeyPromptActivity yubiKeyPromptActivity = oooOOO0.f126313OooO00o;
            if (interfaceC31877OooO0Oo instanceof OooO) {
                Intent intent = new Intent();
                try {
                    intent.putExtra("otp", oO00000.OooO0O0.OooO00o(((OooO) interfaceC31877OooO0Oo).OooO0O0()));
                    InterfaceC34352OooO0O0 interfaceC34352OooO0O0 = YubiKeyPromptActivity.f80280Oooo00o;
                    yubiKeyPromptActivity.setResult(-1, intent);
                    yubiKeyPromptActivity.f80287OooOoo0 = true;
                    runnable.run();
                } catch (IOException e) {
                    intent.putExtra("error", e);
                    InterfaceC34352OooO0O0 interfaceC34352OooO0O02 = YubiKeyPromptActivity.f80280Oooo00o;
                    yubiKeyPromptActivity.setResult(1, intent);
                    yubiKeyPromptActivity.f80287OooOoo0 = true;
                    runnable.run();
                }
            }
        }
    }

    @Override // com.yubico.yubikit.android.p613ui.YubiKeyPromptActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        getIntent().putExtra("ACTION_CLASS", OooO0O0.class);
        getIntent().putExtra("ALLOW_USB", false);
        super.onCreate(bundle);
        C31873OooO00o c31873OooO00o = this.f80281OooOo;
        com.yubico.yubikit.android.transport.usb.OooO0O0 oooO0O0 = new com.yubico.yubikit.android.transport.usb.OooO0O0();
        oooO0O0.f80250OooO00o = false;
        c31873OooO00o.f113568OooO00o.OooO0O0(oooO0O0, new oO00000.OooO00o() { // from class: ooo0Oo0.OooO00o
            @Override // oO00000.OooO00o
            public final void invoke(Object obj) {
                C23919OooO0oO c23919OooO0oO = (C23919OooO0oO) obj;
                final OtpActivity otpActivity = this.f126299OooO00o;
                otpActivity.f80278Oooo0O0++;
                Runnable runnable = new Runnable() { // from class: ooo0Oo0.OooO0O0
                    @Override // java.lang.Runnable
                    public final void run() {
                        final OtpActivity otpActivity2 = otpActivity;
                        int i = otpActivity2.f80278Oooo0O0 - 1;
                        otpActivity2.f80278Oooo0O0 = i;
                        if (i == 0) {
                            otpActivity2.runOnUiThread(new Runnable() { // from class: ooo0Oo0.OooO0Oo
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i2 = OtpActivity.f80276Oooo0OO;
                                    OtpActivity otpActivity3 = otpActivity2;
                                    otpActivity3.f80289OooOooo.setText(otpActivity3.f80283OooOoO ? R.string.yubikit_prompt_plug_in_or_tap : R.string.yubikit_prompt_plug_in);
                                }
                            });
                        }
                    }
                };
                if (c23919OooO0oO.f80266OooOo0o.isTerminated()) {
                    runnable.run();
                } else {
                    c23919OooO0oO.f80270OooOoo = runnable;
                }
                otpActivity.runOnUiThread(new Runnable() { // from class: ooo0Oo0.OooO0OO
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i = OtpActivity.f80276Oooo0OO;
                        otpActivity.f80289OooOooo.setText(R.string.yubikit_otp_touch);
                    }
                });
            }
        });
        this.f80277Oooo0 = new OooO0o(new OooO00o());
    }

    @Override // com.yubico.yubikit.android.p613ui.YubiKeyPromptActivity, android.app.Activity
    public final void onDestroy() {
        this.f80281OooOo.f113568OooO00o.OooO00o();
        super.onDestroy();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        final OooO0o oooO0o = this.f80277Oooo0;
        oooO0o.getClass();
        InputDevice device = keyEvent.getDevice();
        if (device == null || device.getVendorId() != 4176) {
            return false;
        }
        if (keyEvent.getAction() == 1) {
            final int deviceId = keyEvent.getDeviceId();
            SparseArray<StringBuilder> sparseArray = oooO0o.f126303OooO00o;
            StringBuilder sb = sparseArray.get(deviceId, new StringBuilder());
            int keyCode = keyEvent.getKeyCode();
            OooO00o oooO00o = oooO0o.f126305OooO0OO;
            if (keyCode != 66 && keyEvent.getKeyCode() != 160) {
                if (sb.length() == 0) {
                    oooO0o.f126304OooO0O0.postDelayed(new Runnable() { // from class: ooo0Oo0.OooO0o0
                        @Override // java.lang.Runnable
                        public final void run() {
                            OooO0o oooO0o2 = oooO0o;
                            SparseArray<StringBuilder> sparseArray2 = oooO0o2.f126303OooO00o;
                            StringBuilder sb2 = new StringBuilder();
                            int i2 = deviceId;
                            StringBuilder sb3 = sparseArray2.get(i2, sb2);
                            if (sb3.length() > 0) {
                                String string = sb3.toString();
                                OtpActivity.OooO00o oooO00o2 = oooO0o2.f126305OooO0OO;
                                oooO00o2.getClass();
                                Intent intent = new Intent();
                                intent.putExtra("otp", string);
                                OtpActivity otpActivity = OtpActivity.this;
                                otpActivity.setResult(-1, intent);
                                otpActivity.finish();
                                sparseArray2.delete(i2);
                            }
                        }
                    }, 1000L);
                    OtpActivity.this.f80289OooOooo.setText(R.string.yubikit_prompt_wait);
                }
                sb.append((char) keyEvent.getUnicodeChar());
                sparseArray.put(deviceId, sb);
                return true;
            }
            String string = sb.toString();
            oooO00o.getClass();
            Intent intent = new Intent();
            intent.putExtra("otp", string);
            OtpActivity otpActivity = OtpActivity.this;
            otpActivity.setResult(-1, intent);
            otpActivity.finish();
            sparseArray.delete(deviceId);
        }
        return true;
    }
}
