package com.yubico.yubikit.android.p613ui;

import OooO0Oo.RunnableC20400OooO0o0;
import OooO0Oo.RunnableC20407OooOO0o;
import OooOoOO.C20519OooO0Oo;
import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import com.orion.notein.global.R;
import com.yubico.yubikit.android.p613ui.YubiKeyPromptActivity;
import com.yubico.yubikit.android.transport.nfc.C23914OooO0o0;
import com.yubico.yubikit.android.transport.nfc.OooO;
import com.yubico.yubikit.android.transport.nfc.OooO0OO;
import com.yubico.yubikit.android.transport.nfc.OooOO0O;
import com.yubico.yubikit.android.transport.nfc.RunnableC23915OooO0oO;
import com.yubico.yubikit.android.transport.usb.C23919OooO0oO;
import com.yubico.yubikit.android.transport.usb.OooO0O0;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import o0Oo0oOo.RunnableC28311OooO0o0;
import o0OoO000.ViewOnClickListenerC28540OooOoOO;
import o0OoOOo.ViewOnClickListenerC29133OooO0oO;
import o0ooooOo.C31873OooO00o;
import o0ooooo.InterfaceC31877OooO0Oo;
import o0oooooO.C31891OooO0o0;
import oOO00OOo.C34354OooO0Oo;
import oOO00OOo.InterfaceC34352OooO0O0;
import ooo0Oo0.AbstractC35186OooO0oO;
import ooo0Oo0.OooOOO0;

/* JADX INFO: loaded from: classes10.dex */
public class YubiKeyPromptActivity extends Activity {

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public static final InterfaceC34352OooO0O0 f80280Oooo00o = C34354OooO0Oo.OooO0O0(YubiKeyPromptActivity.class);

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public C31873OooO00o f80281OooOo;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public AbstractC35186OooO0oO f80284OooOoO0;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public Button f80286OooOoo;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public Button f80288OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public TextView f80289OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public boolean f80290Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public boolean f80291Oooo00O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final OooO00o f80282OooOo0o = new OooO00o();

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public boolean f80283OooOoO = true;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f80285OooOoOO = 0;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public boolean f80287OooOoo0 = false;

    public class OooO00o extends C31891OooO0o0 {
    }

    public final void OooO00o(InterfaceC31877OooO0Oo interfaceC31877OooO0Oo, Runnable runnable) {
        AbstractC35186OooO0oO abstractC35186OooO0oO = this.f80284OooOoO0;
        getIntent().getExtras();
        abstractC35186OooO0oO.OooO00o(interfaceC31877OooO0Oo, new OooOOO0(this, runnable));
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle extras = getIntent().getExtras();
        Objects.requireNonNull(extras);
        this.f80290Oooo000 = extras.getBoolean("ALLOW_USB", true);
        this.f80291Oooo00O = extras.getBoolean("ALLOW_NFC", true);
        Class cls = (Class) extras.getSerializable("ACTION_CLASS");
        if (cls != null) {
            try {
            } catch (IllegalAccessException e) {
                e = e;
                C20519OooO0Oo.OooO0Oo(1, f80280Oooo00o, "Unable to instantiate ConnectionAction", e);
                finish();
            } catch (IllegalStateException e2) {
                e = e2;
                C20519OooO0Oo.OooO0Oo(1, f80280Oooo00o, "Unable to instantiate ConnectionAction", e);
                finish();
            } catch (InstantiationException e3) {
                e = e3;
                C20519OooO0Oo.OooO0Oo(1, f80280Oooo00o, "Unable to instantiate ConnectionAction", e);
                finish();
            }
            if (AbstractC35186OooO0oO.class.isAssignableFrom(cls)) {
                this.f80284OooOoO0 = (AbstractC35186OooO0oO) cls.newInstance();
                setContentView(extras.getInt("CONTENT_VIEW_ID", R.layout.yubikit_yubikey_prompt_content));
                if (extras.containsKey("TITLE_ID")) {
                    setTitle(extras.getInt("TITLE_ID"));
                }
                TextView textView = (TextView) findViewById(R.id.yubikit_prompt_title);
                if (textView != null) {
                    textView.setText(getTitle());
                }
                this.f80289OooOooo = (TextView) findViewById(extras.getInt("HELP_TEXT_VIEW_ID", R.id.yubikit_prompt_help_text_view));
                Button button = (Button) findViewById(extras.getInt("CANCEL_BUTTON_ID", R.id.yubikit_prompt_cancel_btn));
                this.f80286OooOoo = button;
                button.setFocusable(false);
                this.f80286OooOoo.setOnClickListener(new ViewOnClickListenerC29133OooO0oO(this, 4));
                C31873OooO00o c31873OooO00o = new C31873OooO00o(this);
                this.f80281OooOo = c31873OooO00o;
                if (this.f80290Oooo000) {
                    c31873OooO00o.f113568OooO00o.OooO0O0(new OooO0O0(), new oO00000.OooO00o() { // from class: ooo0Oo0.OooO0oo
                        @Override // oO00000.OooO00o
                        public final void invoke(Object obj) {
                            C23919OooO0oO c23919OooO0oO = (C23919OooO0oO) obj;
                            final YubiKeyPromptActivity yubiKeyPromptActivity = this.f126308OooO00o;
                            yubiKeyPromptActivity.f80285OooOoOO++;
                            Runnable runnable = new Runnable() { // from class: ooo0Oo0.OooOO0O
                                @Override // java.lang.Runnable
                                public final void run() {
                                    final YubiKeyPromptActivity yubiKeyPromptActivity2 = yubiKeyPromptActivity;
                                    int i = yubiKeyPromptActivity2.f80285OooOoOO - 1;
                                    yubiKeyPromptActivity2.f80285OooOoOO = i;
                                    if (i == 0) {
                                        yubiKeyPromptActivity2.runOnUiThread(new Runnable() { // from class: ooo0Oo0.OooOO0o
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                YubiKeyPromptActivity yubiKeyPromptActivity3 = yubiKeyPromptActivity2;
                                                yubiKeyPromptActivity3.f80289OooOooo.setText(yubiKeyPromptActivity3.f80283OooOoO ? R.string.yubikit_prompt_plug_in_or_tap : R.string.yubikit_prompt_plug_in);
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
                            int i = 1;
                            yubiKeyPromptActivity.runOnUiThread(new RunnableC20407OooOO0o(yubiKeyPromptActivity, i));
                            yubiKeyPromptActivity.OooO00o(c23919OooO0oO, new RunnableC28311OooO0o0(yubiKeyPromptActivity, i));
                        }
                    });
                }
                if (this.f80291Oooo00O) {
                    Button button2 = (Button) findViewById(extras.getInt("ENABLE_NFC_BUTTON_ID", R.id.yubikit_prompt_enable_nfc_btn));
                    this.f80288OooOooO = button2;
                    button2.setFocusable(false);
                    this.f80288OooOooO.setOnClickListener(new ViewOnClickListenerC28540OooOoOO(this, 9));
                    return;
                }
                return;
            }
        }
        throw new IllegalStateException("Missing or invalid ConnectionAction class");
    }

    @Override // android.app.Activity
    public void onDestroy() {
        if (this.f80290Oooo000) {
            this.f80281OooOo.f113568OooO00o.OooO00o();
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final void onPause() {
        OooOO0O oooOO0O;
        if (this.f80291Oooo00O && (oooOO0O = this.f80281OooOo.f113569OooO0O0) != null) {
            ExecutorService executorService = oooOO0O.f80241OooO0OO;
            if (executorService != null) {
                executorService.shutdown();
                oooOO0O.f80241OooO0OO = null;
            }
            ((C23914OooO0o0) oooOO0O.f80240OooO0O0).f80231OooO00o.disableReaderMode(this);
        }
        super.onPause();
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        if (this.f80291Oooo00O) {
            this.f80288OooOooO.setVisibility(8);
            try {
                C31873OooO00o c31873OooO00o = this.f80281OooOo;
                com.yubico.yubikit.android.transport.nfc.OooO00o oooO00o = new com.yubico.yubikit.android.transport.nfc.OooO00o();
                oO00000.OooO00o<? super OooO> oooO00o2 = new oO00000.OooO00o() { // from class: ooo0Oo0.OooO
                    @Override // oO00000.OooO00o
                    public final void invoke(Object obj) {
                        final com.yubico.yubikit.android.transport.nfc.OooO oooO = (com.yubico.yubikit.android.transport.nfc.OooO) obj;
                        InterfaceC34352OooO0O0 interfaceC34352OooO0O0 = YubiKeyPromptActivity.f80280Oooo00o;
                        final YubiKeyPromptActivity yubiKeyPromptActivity = this.f126298OooO00o;
                        yubiKeyPromptActivity.OooO00o(oooO, new Runnable() { // from class: ooo0Oo0.OooOO0
                            @Override // java.lang.Runnable
                            public final void run() {
                                InterfaceC34352OooO0O0 interfaceC34352OooO0O02 = YubiKeyPromptActivity.f80280Oooo00o;
                                YubiKeyPromptActivity yubiKeyPromptActivity2 = yubiKeyPromptActivity;
                                yubiKeyPromptActivity2.runOnUiThread(new RunnableC20400OooO0o0(yubiKeyPromptActivity2, 2));
                                RunnableC28311OooO0o0 runnableC28311OooO0o0 = new RunnableC28311OooO0o0(yubiKeyPromptActivity2, 1);
                                com.yubico.yubikit.android.transport.nfc.OooO oooO2 = oooO;
                                oooO2.f80223OooOo0o.set(true);
                                oooO2.f80222OooOo.submit(new RunnableC23915OooO0oO(oooO2, runnableC28311OooO0o0));
                            }
                        });
                    }
                };
                OooOO0O oooOO0O = c31873OooO00o.f113569OooO0O0;
                if (oooOO0O == null) {
                    throw new OooO0OO("NFC is not available on this device", false);
                }
                oooOO0O.OooO00o(this, oooO00o, oooO00o2);
            } catch (OooO0OO e) {
                this.f80283OooOoO = false;
                this.f80289OooOooo.setText(R.string.yubikit_prompt_plug_in);
                if (e.f80227OooOo0o) {
                    this.f80288OooOooO.setVisibility(0);
                }
            }
        }
    }
}
